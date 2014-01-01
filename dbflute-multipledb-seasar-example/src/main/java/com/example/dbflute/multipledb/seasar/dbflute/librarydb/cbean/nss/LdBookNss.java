/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */package com.example.dbflute.multipledb.seasar.dbflute.librarydb.cbean.nss;

import org.seasar.dbflute.cbean.ConditionQuery;
import com.example.dbflute.multipledb.seasar.dbflute.librarydb.cbean.cq.LdBookCQ;

/**
 * The nest select set-upper of BOOK.
 * @author DBFlute(AutoGenerator)
 */
public class LdBookNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected LdBookCQ _query;
    public LdBookNss(LdBookCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br />
     * AUTHOR by my AUTHOR_ID, named 'author'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public LdAuthorNss withAuthor() {
        _query.doNss(new LdBookCQ.NssCall() { public ConditionQuery qf() { return _query.queryAuthor(); }});
        return new LdAuthorNss(_query.queryAuthor());
    }
    /**
     * With nested relation columns to select clause. <br />
     * GENRE by my GENRE_CODE, named 'genre'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public LdGenreNss withGenre() {
        _query.doNss(new LdBookCQ.NssCall() { public ConditionQuery qf() { return _query.queryGenre(); }});
        return new LdGenreNss(_query.queryGenre());
    }
    /**
     * With nested relation columns to select clause. <br />
     * PUBLISHER by my PUBLISHER_ID, named 'publisher'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public LdPublisherNss withPublisher() {
        _query.doNss(new LdBookCQ.NssCall() { public ConditionQuery qf() { return _query.queryPublisher(); }});
        return new LdPublisherNss(_query.queryPublisher());
    }
    /**
     * With nested relation columns to select clause. <br />
     * COLLECTION_STATUS_LOOKUP by my GENRE_CODE, named 'collectionStatusLookupAsNonExist'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public LdCollectionStatusLookupNss withCollectionStatusLookupAsNonExist() {
        _query.doNss(new LdBookCQ.NssCall() { public ConditionQuery qf() { return _query.queryCollectionStatusLookupAsNonExist(); }});
        return new LdCollectionStatusLookupNss(_query.queryCollectionStatusLookupAsNonExist());
    }

}
