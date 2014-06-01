/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */package com.example.dbflute.multipledb.seasar.dbflute.librarydb.cbean.nss;

import org.seasar.dbflute.cbean.ConditionQuery;
import com.example.dbflute.multipledb.seasar.dbflute.librarydb.cbean.cq.LdMyselfCheckCQ;

/**
 * The nest select set-upper of MYSELF_CHECK.
 * @author DBFlute(AutoGenerator)
 */
public class LdMyselfCheckNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected LdMyselfCheckCQ _query;
    public LdMyselfCheckNss(LdMyselfCheckCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br />
     * MYSELF by my MYSELF_ID, named 'myself'.
     */
    public void withMyself() {
        _query.doNss(new LdMyselfCheckCQ.NssCall() { public ConditionQuery qf() { return _query.queryMyself(); }});
    }
}
