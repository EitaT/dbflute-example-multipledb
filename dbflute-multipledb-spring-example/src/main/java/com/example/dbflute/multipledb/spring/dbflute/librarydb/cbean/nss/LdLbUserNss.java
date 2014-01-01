/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */package com.example.dbflute.multipledb.spring.dbflute.librarydb.cbean.nss;

import org.seasar.dbflute.cbean.ConditionQuery;
import com.example.dbflute.multipledb.spring.dbflute.librarydb.cbean.cq.LdLbUserCQ;

/**
 * The nest select set-upper of LB_USER.
 * @author DBFlute(AutoGenerator)
 */
public class LdLbUserNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected LdLbUserCQ _query;
    public LdLbUserNss(LdLbUserCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============

    /**
     * With nested relation columns to select clause. <br />
     * BLACK_LIST by LB_USER_ID, named 'blackListAsOne'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public LdBlackListNss withBlackListAsOne() {
        _query.doNss(new LdLbUserCQ.NssCall() { public ConditionQuery qf() { return _query.queryBlackListAsOne(); }});
        return new LdBlackListNss(_query.queryBlackListAsOne());
    }
}
