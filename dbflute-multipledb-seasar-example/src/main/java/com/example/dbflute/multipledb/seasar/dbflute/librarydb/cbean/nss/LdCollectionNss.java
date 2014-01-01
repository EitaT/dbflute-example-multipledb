/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */package com.example.dbflute.multipledb.seasar.dbflute.librarydb.cbean.nss;

import org.seasar.dbflute.cbean.ConditionQuery;
import com.example.dbflute.multipledb.seasar.dbflute.librarydb.cbean.cq.LdCollectionCQ;

/**
 * The nest select set-upper of COLLECTION.
 * @author DBFlute(AutoGenerator)
 */
public class LdCollectionNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected LdCollectionCQ _query;
    public LdCollectionNss(LdCollectionCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br />
     * BOOK by my BOOK_ID, named 'book'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public LdBookNss withBook() {
        _query.doNss(new LdCollectionCQ.NssCall() { public ConditionQuery qf() { return _query.queryBook(); }});
        return new LdBookNss(_query.queryBook());
    }
    /**
     * With nested relation columns to select clause. <br />
     * LIBRARY by my LIBRARY_ID, named 'library'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public LdLibraryNss withLibrary() {
        _query.doNss(new LdCollectionCQ.NssCall() { public ConditionQuery qf() { return _query.queryLibrary(); }});
        return new LdLibraryNss(_query.queryLibrary());
    }

    /**
     * With nested relation columns to select clause. <br />
     * COLLECTION_STATUS by COLLECTION_ID, named 'collectionStatusAsOne'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public LdCollectionStatusNss withCollectionStatusAsOne() {
        _query.doNss(new LdCollectionCQ.NssCall() { public ConditionQuery qf() { return _query.queryCollectionStatusAsOne(); }});
        return new LdCollectionStatusNss(_query.queryCollectionStatusAsOne());
    }
}
