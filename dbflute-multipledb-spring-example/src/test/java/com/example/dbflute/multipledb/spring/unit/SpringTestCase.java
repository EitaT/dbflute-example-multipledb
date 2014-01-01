package com.example.dbflute.multipledb.spring.unit;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.beans.factory.access.BeanFactoryLocator;
import org.springframework.beans.factory.access.BeanFactoryReference;
import org.springframework.context.ApplicationContext;
import org.springframework.context.access.ContextSingletonBeanFactoryLocator;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

/**
 * The abstract test case for application components of Spring.
 * @author jflute
 * @since 0.6.3 (2008/02/02 Saturday)
 */
public abstract class SpringTestCase extends PlainTestCase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    // -----------------------------------------------------
    //                                          Static Cache
    //                                          ------------
    protected static ApplicationContext cachedApplicationContext;

    // -----------------------------------------------------
    //                                         Spring Object
    //                                         -------------
    /** The context of application. {Spring Object} */
    protected ApplicationContext applicationContext;

    // -----------------------------------------------------
    //                                    Transaction Object
    //                                    ------------------
    /** The transaction manager for platform. {Spring Object} */
    protected PlatformTransactionManager transactionManager;

    /** The transaction status. {Spring Object} */
    protected TransactionStatus transactionStatus;

    // -----------------------------------------------------
    //                                Bound Fields(Internal)
    //                                ----------------------
    /** The bound fields. (Internal)*/
    private List<Field> boundFields;

    // ===================================================================================
    //                                                                            Settings
    //                                                                            ========
    /**
     * Set up various components for test.
     */
    @Override
    public void setUp() {
        initializeApplicationContext();
        initializeFields();
        beginTransaction();
    }

    /**
     * Initialize application context for Spring.
     */
    protected void initializeApplicationContext() {
        final String[] confs = getConfigurations();
        if (cachedApplicationContext != null) {
            applicationContext = cachedApplicationContext;
            return;
        }
        if (confs != null && confs.length > 0) {
            applicationContext = new ClassPathXmlApplicationContext(confs);
        } else {
            final BeanFactoryLocator locator = ContextSingletonBeanFactoryLocator.getInstance();
            final BeanFactoryReference ref = locator.useBeanFactory("context");
            applicationContext = (ApplicationContext) ref.getFactory();
        }
        cachedApplicationContext = applicationContext;
    }

    /**
     * Get configurations for Spring.
     * @return The array of configurations. (NotNull)
     */
    protected abstract String[] getConfigurations();

    protected void initializeFields() {
        try {
            bindFields();
        } catch (Throwable e) {
            String msg = "bindFields() threw the exception!";
            throw new IllegalStateException(msg, e);
        }
    }

    protected void beginTransaction() {
        transactionManager = (PlatformTransactionManager) applicationContext.getBean("transactionManager");
        DefaultTransactionDefinition def = new DefaultTransactionDefinition();
        def.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);
        transactionStatus = transactionManager.getTransaction(def);
        transactionStatus.setRollbackOnly();
    }

    @Override
    public void tearDown() {
        rollbackTransaction();
        destroyFields();
        destroyApplicationContext();
    }

    protected void rollbackTransaction() {
        try {
            transactionManager.rollback(transactionStatus);
        } finally {
            transactionStatus = null;
            transactionManager = null;
        }
    }

    protected void destroyFields() {
        unbindFields();
    }

    protected void destroyApplicationContext() {
        // Do nothing because of caching!
    }

    // ===================================================================================
    //                                                                       Field Binding
    //                                                                       =============
    protected void bindFields() throws Throwable {
        boundFields = new ArrayList<Field>();
        for (Class<?> clazz = getClass(); isBindTarget(clazz); clazz = clazz.getSuperclass()) {
            Field[] fields = clazz.getDeclaredFields();
            for (int i = 0; i < fields.length; ++i) {
                bindField(fields[i]);
            }
        }
    }

    protected boolean isBindTarget(Class<?> clazz) {
        return clazz != null && clazz != SpringTestCase.class;
    }

    protected void bindField(Field field) {
        if (!isAutoBindable(field)) {
        }
        field.setAccessible(true);
        if (getValue(field, this) != null) {
            return;
        }
        String name = normalizeName(field.getName());
        Object component = null;
        if (hasBean(name)) {
            component = getBean(name);
        }
        if (component != null) {
            setValue(field, this, component);
            boundFields.add(field);
        }
    }

    private Object getValue(Field field, Object target) {
        try {
            return field.get(target);
        } catch (IllegalAccessException e) {
            String msg = "Illegal access to the field: field=" + field + " target=" + target;
            throw new IllegalStateException(msg, e);
        }
    }

    private void setValue(Field field, Object target, Object value) {
        try {
            field.set(target, value);
        } catch (IllegalAccessException e) {
            String msg = "Illegal access to the field: field=" + field + " target=" + target;
            throw new IllegalStateException(msg, e);
        }
    }

    protected String normalizeName(String name) {
        return replaceString(name, "_", "");
    }

    private String replaceString(String text, String fromText, String toText) {
        if (text == null || fromText == null || toText == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        int pos = 0;
        int pos2 = 0;
        do {
            pos = text.indexOf(fromText, pos2);
            if (pos == 0) {
                sb.append(toText);
                pos2 = fromText.length();
            } else if (pos > 0) {
                sb.append(text.substring(pos2, pos));
                sb.append(toText);
                pos2 = pos + fromText.length();
            } else {
                sb.append(text.substring(pos2));
                return sb.toString();
            }
        } while (true);
    }

    protected boolean isAutoBindable(Field field) {
        int modifiers = field.getModifiers();
        return !Modifier.isStatic(modifiers) && !Modifier.isFinal(modifiers) && !field.getType().isPrimitive();
    }

    protected void unbindFields() {
        for (int i = 0; i < boundFields.size(); ++i) {
            Field field = (Field) boundFields.get(i);
            try {
                field.set(this, null);
            } catch (IllegalArgumentException e) {
                System.err.println(e);
            } catch (IllegalAccessException e) {
                System.err.println(e);
            }
        }
        boundFields.clear();
        boundFields = null;
    }

    // ===================================================================================
    //                                                                       Bean Provider
    //                                                                       =============
    protected Object getBean(String name) {
        return applicationContext.getBean(name);
    }

    protected boolean hasBean(String name) {
        try {
            applicationContext.getBean(name);
            return true;
        } catch (NoSuchBeanDefinitionException e) {
            return false;
        }
    }
}
