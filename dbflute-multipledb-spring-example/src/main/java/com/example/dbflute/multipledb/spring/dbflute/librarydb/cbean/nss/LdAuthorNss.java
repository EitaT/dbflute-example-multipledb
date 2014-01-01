/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */package com.example.dbflute.multipledb.spring.dbflute.librarydb.cbean.nss;

import com.example.dbflute.multipledb.spring.dbflute.librarydb.cbean.cq.LdAuthorCQ;

/**
 * The nest select set-upper of AUTHOR.
 * @author DBFlute(AutoGenerator)
 */
public class LdAuthorNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected LdAuthorCQ _query;
    public LdAuthorNss(LdAuthorCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============

}
