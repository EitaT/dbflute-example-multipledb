/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */package com.example.dbflute.multipledb.spring.dbflute.librarydb.cbean.nss;

import org.seasar.dbflute.cbean.ConditionQuery;
import com.example.dbflute.multipledb.spring.dbflute.librarydb.cbean.cq.LdBlackListCQ;

/**
 * The nest select set-upper of BLACK_LIST.
 * @author DBFlute(AutoGenerator)
 */
public class LdBlackListNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected LdBlackListCQ _query;
    public LdBlackListNss(LdBlackListCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br />
     * LB_USER by my LB_USER_ID, named 'lbUser'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public LdLbUserNss withLbUser() {
        _query.doNss(new LdBlackListCQ.NssCall() { public ConditionQuery qf() { return _query.queryLbUser(); }});
        return new LdLbUserNss(_query.queryLbUser());
    }
}
