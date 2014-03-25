package com.example.dbflute.multipledb.seasar.unit;

import org.seasar.dbflute.dbmeta.name.SqlNameFilter;
import org.seasar.dbflute.unit.seasar.ContainerTestCase;

import com.example.dbflute.multipledb.seasar.dbflute.memberdb.allcommon.MbDBFluteConfig;

/**
 * The test base of application for multiple DB Example.
 * @author jflute
 * @since 0.5.6 (2007/10/22 Monday)
 */
public abstract class UnitContainerTestCase extends ContainerTestCase {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    protected static final String schemaPrefix = "PUBLIC.";

    // ===================================================================================
    //                                                                            Settings
    //                                                                            ========
    @Override
    public void setUp() throws Exception {
        super.setUp();

        // for the test of TableSqlNameFilter
        MbDBFluteConfig.getInstance().unlock();
        MbDBFluteConfig.getInstance().setTableSqlNameFilter(new SqlNameFilter() {
            public String filter(String sqlName, String correspondingDbName) {
                return schemaPrefix + sqlName;
            }
        });
    }
}
