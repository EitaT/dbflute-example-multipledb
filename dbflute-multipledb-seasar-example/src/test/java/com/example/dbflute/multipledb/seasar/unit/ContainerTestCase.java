package com.example.dbflute.multipledb.seasar.unit;

import java.sql.Timestamp;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.seasar.dbflute.AccessContext;
import org.seasar.dbflute.dbmeta.name.SqlNameFilter;
import org.seasar.extension.unit.S2TestCase;

import com.example.dbflute.multipledb.seasar.dbflute.memberdb.allcommon.MbDBFluteConfig;

/**
 * The test base of application for Basic Example.
 * 
 * @author jflute
 * @since 0.5.6 (2007/10/22 Monday)
 */
public abstract class ContainerTestCase extends S2TestCase {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** Log instance for sub class. */
    private static final Log _log = LogFactory.getLog(ContainerTestCase.class);

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected Timestamp accessTimestamp;

    protected String accessUser;

    protected String accessProcess;

    protected String accessModule;

    protected String schemaPrefix = "PUBLIC.";

    // ===================================================================================
    //                                                                            Settings
    //                                                                            ========
    @Override
    public void setUp() {
        // for the test of TableSqlNameFilter
        MbDBFluteConfig.getInstance().unlock();
        MbDBFluteConfig.getInstance().setTableSqlNameFilter(new SqlNameFilter() {
            public String filter(String sqlName, String correspondingDbName) {
                return schemaPrefix + sqlName;
            }
        });

        include("dbflute-librarydb.dicon");
        include("dbflute-memberdb.dicon");

        initializeAccessContext();
    }

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
    }

    protected void destroyAccessContext() {
        AccessContext.clearAccessContextOnThread();
    }

    @Override
    protected boolean needTransaction() {
        return true; // all executions are in transaction
    }

    // ===================================================================================
    //                                                                              Helper
    //                                                                              ======
    protected void log(Object msg) {
        _log.debug(msg);
    }

    protected Timestamp currentTimestamp() {
        return new Timestamp(System.currentTimeMillis());
    }

    protected static String getLineSeparator() {
        return System.getProperty("line.separator");
    }
}
