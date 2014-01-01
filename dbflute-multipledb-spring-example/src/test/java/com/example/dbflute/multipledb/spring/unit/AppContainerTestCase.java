package com.example.dbflute.multipledb.spring.unit;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.sql.DataSource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.seasar.dbflute.AccessContext;
import org.seasar.dbflute.cbean.PagingResultBean;
import org.seasar.dbflute.exception.SQLFailureException;
import org.seasar.dbflute.jdbc.DataSourceHandler;
import org.seasar.dbflute.jdbc.HandlingDataSourceWrapper;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import com.example.dbflute.multipledb.spring.dbflute.librarydb.allcommon.LdDBFluteConfig;

/**
 * The test case with container.
 * @author jflute
 * @since 0.6.3 (2008/02/02 Saturday)
 */
public abstract class AppContainerTestCase extends SpringTestCase {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** Log instance. */
    private static final Log _log = LogFactory.getLog(AppContainerTestCase.class);

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    // -----------------------------------------------------
    //                                         Common Column
    //                                         -------------
    /** The current session value of accessTimestamp. {Common Column on database} */
    protected Timestamp accessTimestamp;

    /** The current session value of accessUser. {Common Column on database} */
    protected String accessUser;

    /** The current session value of accessProcess. {Common Column on database} */
    protected String accessProcess; // for memberDb only

    /** The current session value of accessModule. {Common Column on database} */
    protected String accessModule; // for libraryDb only

    // -----------------------------------------------------
    //                                    Transaction Object
    //                                    ------------------
    protected PlatformTransactionManager libraryDbTransactionManager;
    protected TransactionStatus libraryDbTransactionStatus;
    protected PlatformTransactionManager memberDbTransactionManager;
    protected TransactionStatus memberDbTransactionStatus;

    // -----------------------------------------------------
    //                                           Data Source
    //                                           -----------
    protected DataSource libraryDbDataSource;
    protected DataSource memberDbDataSource;

    // ===================================================================================
    //                                                                            Settings
    //                                                                            ========
    @Override
    public void setUp() {
        super.setUp(); // is initializing the container
        initializeAccessContext();

        assertNotNull("The libraryDbDataSource should not be null! (must be injected)", libraryDbDataSource);
        assertNotNull("The memberDbDataSource should not be null! (must be injected)", memberDbDataSource);
    }

    @Override
    protected String[] getConfigurations() {
        List<String> configurationList = new ArrayList<String>();
        configurationList.add("dbfluteBeansLibraryDb.xml");
        configurationList.add("dbfluteBeansMemberDb.xml");
        configurationList.add("jdbcBeansLibraryDb.xml");
        configurationList.add("jdbcBeansMemberDb.xml");
        return configurationList.toArray(new String[] {});
    }

    @Override
    protected void beginTransaction() {
        {
            libraryDbTransactionManager = (PlatformTransactionManager) applicationContext
                    .getBean("libraryDbTransactionManager");
            DefaultTransactionDefinition def = new DefaultTransactionDefinition();
            def.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);
            libraryDbTransactionStatus = libraryDbTransactionManager.getTransaction(def);
            libraryDbTransactionStatus.setRollbackOnly();
        }
        {
            memberDbTransactionManager = (PlatformTransactionManager) applicationContext
                    .getBean("memberDbTransactionManager");
            DefaultTransactionDefinition def = new DefaultTransactionDefinition();
            def.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);
            memberDbTransactionStatus = memberDbTransactionManager.getTransaction(def);
            memberDbTransactionStatus.setRollbackOnly();
        }
    }

    /**
     * Initialize the context of access for common column auto set-up. <br />
     * You should implement this in your AOP class of front class
     * (for example Page class) at your real project.
     */
    protected void initializeAccessContext() {
        accessTimestamp = currentTimestamp();
        accessUser = "testUser";
        accessProcess = getClass().getSimpleName();
        accessModule = getClass().getSimpleName();
        AccessContext context = new AccessContext();
        context.setAccessTimestamp(accessTimestamp);
        context.setAccessUser(accessUser);
        context.setAccessProcess(accessProcess);
        context.setAccessModule(accessModule);
        AccessContext.setAccessContextOnThread(context);
    }

    @Override
    public void tearDown() {
        destroyAccessContext();
        super.tearDown();
    }

    /**
     * Destroy the context of access in thread local.
     * You should implement this in your AOP class of front class
     * (for example Page class) at your real project.
     */
    protected void destroyAccessContext() {
        AccessContext.clearAccessContextOnThread();
    }

    @Override
    protected void rollbackTransaction() {
        try {
            memberDbTransactionManager.rollback(memberDbTransactionStatus);
        } finally {
            memberDbTransactionStatus = null;
            memberDbTransactionManager = null;
        }
        try {
            libraryDbTransactionManager.rollback(libraryDbTransactionStatus);
        } finally {
            libraryDbTransactionStatus = null;
            libraryDbTransactionManager = null;
        }
    }

    // ===================================================================================
    //                                                                     Database Helper
    //                                                                     ===============
    protected DataSource getDataSourceLibraryDb() {
        // same way as DBFlute does because of using Commons DBCP
        // (this method becomes valid after initializing container) 
        final DataSourceHandler handler = LdDBFluteConfig.getInstance().getDataSourceHandler();
        assertNotNull("Failed to get data source handler from DBFluteConfig!", handler);
        return new HandlingDataSourceWrapper(libraryDbDataSource, new DataSourceHandler() {
            public Connection getConnection(DataSource dataSource) throws SQLException {
                return handler.getConnection(dataSource);
            }
        });
    }

    protected DatabaseMetaData getDatabaseMetaDataLibraryDb() {
        try {
            return getDataSourceLibraryDb().getConnection().getMetaData();
        } catch (SQLException e) {
            throw new SQLFailureException("Failed to get meta data!", e);
        }
    }

    // ===================================================================================
    //                                                                       Assist Helper
    //                                                                       =============
    protected void showPage(PagingResultBean<? extends Object>... pages) {
        for (PagingResultBean<? extends Object> page : pages) {
            log(page);
        }
        int count = 1;
        for (PagingResultBean<? extends Object> page : pages) {
            log("[page" + count + "]");
            for (Object entity : page) {
                log("  " + entity);
            }
            ++count;
        }
    }

    protected void showList(List<? extends Object>... lss) {
        for (List<? extends Object> ls : lss) {
            log(ls);
        }
        int count = 1;
        for (List<? extends Object> ls : lss) {
            log("[page" + count + "]");
            for (Object entity : ls) {
                log("  " + entity);
            }
            ++count;
        }
    }

    // ===================================================================================
    //                                                                      General Helper
    //                                                                      ==============
    protected void log(Object msg) {
        _log.debug(msg);
    }

    protected Date currentDate() {
        return new Date(System.currentTimeMillis());
    }

    protected Timestamp currentTimestamp() {
        return new Timestamp(System.currentTimeMillis());
    }

    protected static String getLineSeparator() {
        return "\n";
    }
}
