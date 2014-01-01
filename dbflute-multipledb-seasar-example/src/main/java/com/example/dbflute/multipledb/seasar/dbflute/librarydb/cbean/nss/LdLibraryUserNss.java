/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */package com.example.dbflute.multipledb.seasar.dbflute.librarydb.cbean.nss;

import org.seasar.dbflute.cbean.ConditionQuery;
import com.example.dbflute.multipledb.seasar.dbflute.librarydb.cbean.cq.LdLibraryUserCQ;

/**
 * The nest select set-upper of LIBRARY_USER.
 * @author DBFlute(AutoGenerator)
 */
public class LdLibraryUserNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected LdLibraryUserCQ _query;
    public LdLibraryUserNss(LdLibraryUserCQ query) { _query = query; }
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
        _query.doNss(new LdLibraryUserCQ.NssCall() { public ConditionQuery qf() { return _query.queryLbUser(); }});
        return new LdLbUserNss(_query.queryLbUser());
    }
    /**
     * With nested relation columns to select clause. <br />
     * LIBRARY by my LIBRARY_ID, named 'library'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public LdLibraryNss withLibrary() {
        _query.doNss(new LdLibraryUserCQ.NssCall() { public ConditionQuery qf() { return _query.queryLibrary(); }});
        return new LdLibraryNss(_query.queryLibrary());
    }

}
