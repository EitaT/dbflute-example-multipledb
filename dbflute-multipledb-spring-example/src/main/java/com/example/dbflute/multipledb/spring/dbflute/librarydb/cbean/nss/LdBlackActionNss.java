/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */package com.example.dbflute.multipledb.spring.dbflute.librarydb.cbean.nss;

import org.seasar.dbflute.cbean.ConditionQuery;
import com.example.dbflute.multipledb.spring.dbflute.librarydb.cbean.cq.LdBlackActionCQ;

/**
 * The nest select set-upper of BLACK_ACTION.
 * @author DBFlute(AutoGenerator)
 */
public class LdBlackActionNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected LdBlackActionCQ _query;
    public LdBlackActionNss(LdBlackActionCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br />
     * BLACK_LIST by my BLACK_LIST_ID, named 'blackList'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public LdBlackListNss withBlackList() {
        _query.doNss(new LdBlackActionCQ.NssCall() { public ConditionQuery qf() { return _query.queryBlackList(); }});
        return new LdBlackListNss(_query.queryBlackList());
    }
    /**
     * With nested relation columns to select clause. <br />
     * BLACK_ACTION_LOOKUP by my BLACK_ACTION_CODE, named 'blackActionLookup'.
     */
    public void withBlackActionLookup() {
        _query.doNss(new LdBlackActionCQ.NssCall() { public ConditionQuery qf() { return _query.queryBlackActionLookup(); }});
    }
}
