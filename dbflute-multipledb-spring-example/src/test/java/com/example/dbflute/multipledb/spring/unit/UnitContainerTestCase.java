package com.example.dbflute.multipledb.spring.unit;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import javax.sql.DataSource;

import org.seasar.dbflute.jdbc.DataSourceHandler;
import org.seasar.dbflute.jdbc.HandlingDataSourceWrapper;
import org.seasar.dbflute.unit.core.transaction.TransactionResource;
import org.seasar.dbflute.unit.spring.SpringTestCase;
import org.seasar.dbflute.unit.spring.SpringTransactionResource;
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
public abstract class UnitContainerTestCase extends SpringTestCase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    // -----------------------------------------------------
    //                                           Data Source
    //                                           -----------
    protected DataSource libraryDbDataSource;
    protected DataSource memberDbDataSource;

    // ===================================================================================
    //                                                                            Settings
    //                                                                            ========
    @Override
    protected String[] prepareConfigFiles() {
        List<String> confList = new ArrayList<String>();
        confList.add("dbfluteBeansLibraryDb.xml");
        confList.add("dbfluteBeansMemberDb.xml");
        confList.add("jdbcBeansLibraryDb.xml");
        confList.add("jdbcBeansMemberDb.xml");
        return confList.toArray(new String[] {});
    }

    @Override
    protected TransactionResource beginNewTransaction() {
        MultipleDbTransactionResource multipleResource = new MultipleDbTransactionResource();
        doBeginNewTransaction("libraryDbTransactionManager", multipleResource);
        doBeginNewTransaction("memberDbTransactionManager", multipleResource);
        return multipleResource;
    }

    protected void doBeginNewTransaction(String managerKey, MultipleDbTransactionResource multipleResource) {
        PlatformTransactionManager manager = (PlatformTransactionManager) _xcurrentActiveContext.getBean(managerKey);
        DefaultTransactionDefinition def = new DefaultTransactionDefinition();
        def.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);
        TransactionStatus status = manager.getTransaction(def);
        status.setRollbackOnly();
        SpringTransactionResource resource = new SpringTransactionResource();
        resource.setTransactionManager(manager);
        resource.setTransactionStatus(status);
        multipleResource.addResource(resource);
    }

    protected static class MultipleDbTransactionResource implements TransactionResource {

        protected final List<SpringTransactionResource> _resourceList = new ArrayList<SpringTransactionResource>();

        public void addResource(SpringTransactionResource resource) {
            _resourceList.add(resource);
        }

        // /- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
        // closing order should be like this: 
        // begin A
        //   begin B
        //   close B
        // close A
        // 
        // or exception:
        // Caused by: java.lang.IllegalStateException: Cannot deactivate transaction synchronization - not active
        //     at org.springframework.transaction.support.TransactionSynchronizationManager.clearSynchronization(TransactionSynchronizationManager.java:314)
        //     ...
        // - - - - - - - - - -/

        public void commit() {
            for (ListIterator<SpringTransactionResource> ite = _resourceList.listIterator(); ite.hasPrevious();) {
                SpringTransactionResource resource = ite.previous();
                resource.commit();
            }
        }

        public void rollback() {
            for (ListIterator<SpringTransactionResource> ite = _resourceList.listIterator(); ite.hasPrevious();) {
                SpringTransactionResource resource = ite.previous();
                resource.rollback();
            }
        }
    }

    // ===================================================================================
    //                                                                          DataSource
    //                                                                          ==========
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
}
