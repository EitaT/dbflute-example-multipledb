/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */package com.example.dbflute.multipledb.seasar.dbflute.librarydb.cbean.nss;

import org.seasar.dbflute.cbean.ConditionQuery;
import com.example.dbflute.multipledb.seasar.dbflute.librarydb.cbean.cq.LdLendingCollectionCQ;

/**
 * The nest select set-upper of LENDING_COLLECTION.
 * @author DBFlute(AutoGenerator)
 */
public class LdLendingCollectionNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected LdLendingCollectionCQ _query;
    public LdLendingCollectionNss(LdLendingCollectionCQ query) { _query = query; }
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
        _query.doNss(new LdLendingCollectionCQ.NssCall() { public ConditionQuery qf() { return _query.queryCollection(); }});
        return new LdCollectionNss(_query.queryCollection());
    }
    /**
     * With nested relation columns to select clause. <br />
     * LENDING by my LIBRARY_ID, LB_USER_ID, LENDING_DATE, named 'lending'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public LdLendingNss withLending() {
        _query.doNss(new LdLendingCollectionCQ.NssCall() { public ConditionQuery qf() { return _query.queryLending(); }});
        return new LdLendingNss(_query.queryLending());
    }
    /**
     * With nested relation columns to select clause. <br />
     * LIBRARY_USER by my LIBRARY_ID, LB_USER_ID, named 'libraryUser'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public LdLibraryUserNss withLibraryUser() {
        _query.doNss(new LdLendingCollectionCQ.NssCall() { public ConditionQuery qf() { return _query.queryLibraryUser(); }});
        return new LdLibraryUserNss(_query.queryLibraryUser());
    }

}
