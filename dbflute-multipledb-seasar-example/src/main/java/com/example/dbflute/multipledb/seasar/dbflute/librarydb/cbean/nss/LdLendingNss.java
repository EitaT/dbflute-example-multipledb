/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */package com.example.dbflute.multipledb.seasar.dbflute.librarydb.cbean.nss;

import org.seasar.dbflute.cbean.ConditionQuery;
import com.example.dbflute.multipledb.seasar.dbflute.librarydb.cbean.cq.LdLendingCQ;

/**
 * The nest select set-upper of LENDING.
 * @author DBFlute(AutoGenerator)
 */
public class LdLendingNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected LdLendingCQ _query;
    public LdLendingNss(LdLendingCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br />
     * LIBRARY_USER by my LIBRARY_ID, LB_USER_ID, named 'libraryUser'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public LdLibraryUserNss withLibraryUser() {
        _query.doNss(new LdLendingCQ.NssCall() { public ConditionQuery qf() { return _query.queryLibraryUser(); }});
        return new LdLibraryUserNss(_query.queryLibraryUser());
    }

}
