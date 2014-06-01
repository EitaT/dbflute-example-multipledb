/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */package com.example.dbflute.multipledb.spring.dbflute.librarydb.cbean.nss;

import org.seasar.dbflute.cbean.ConditionQuery;
import com.example.dbflute.multipledb.spring.dbflute.librarydb.cbean.cq.LdLibraryCQ;

/**
 * The nest select set-upper of LIBRARY.
 * @author DBFlute(AutoGenerator)
 */
public class LdLibraryNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected LdLibraryCQ _query;
    public LdLibraryNss(LdLibraryCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br />
     * LIBRARY_TYPE_LOOKUP by my LIBRARY_TYPE_CODE, named 'libraryTypeLookup'.
     */
    public void withLibraryTypeLookup() {
        _query.doNss(new LdLibraryCQ.NssCall() { public ConditionQuery qf() { return _query.queryLibraryTypeLookup(); }});
    }
}
