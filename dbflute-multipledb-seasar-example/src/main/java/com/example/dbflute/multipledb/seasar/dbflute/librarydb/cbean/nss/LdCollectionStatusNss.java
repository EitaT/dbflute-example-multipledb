/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */package com.example.dbflute.multipledb.seasar.dbflute.librarydb.cbean.nss;

import org.seasar.dbflute.cbean.ConditionQuery;
import com.example.dbflute.multipledb.seasar.dbflute.librarydb.cbean.cq.LdCollectionStatusCQ;

/**
 * The nest select set-upper of COLLECTION_STATUS.
 * @author DBFlute(AutoGenerator)
 */
public class LdCollectionStatusNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected LdCollectionStatusCQ _query;
    public LdCollectionStatusNss(LdCollectionStatusCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br />
     * COLLECTION by my COLLECTION_ID, named 'collection'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public LdCollectionNss withCollection() {
        _query.doNss(new LdCollectionStatusCQ.NssCall() { public ConditionQuery qf() { return _query.queryCollection(); }});
        return new LdCollectionNss(_query.queryCollection());
    }
    /**
     * With nested relation columns to select clause. <br />
     * COLLECTION_STATUS_LOOKUP by my COLLECTION_STATUS_CODE, named 'collectionStatusLookup'.
     */
    public void withCollectionStatusLookup() {
        _query.doNss(new LdCollectionStatusCQ.NssCall() { public ConditionQuery qf() { return _query.queryCollectionStatusLookup(); }});
    }
}
