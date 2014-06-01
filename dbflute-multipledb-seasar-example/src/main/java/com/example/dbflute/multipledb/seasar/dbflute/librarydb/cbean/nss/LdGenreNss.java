/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */package com.example.dbflute.multipledb.seasar.dbflute.librarydb.cbean.nss;

import org.seasar.dbflute.cbean.ConditionQuery;
import com.example.dbflute.multipledb.seasar.dbflute.librarydb.cbean.cq.LdGenreCQ;

/**
 * The nest select set-upper of GENRE.
 * @author DBFlute(AutoGenerator)
 */
public class LdGenreNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected LdGenreCQ _query;
    public LdGenreNss(LdGenreCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br />
     * GENRE by my PARENT_GENRE_CODE, named 'genreSelf'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public LdGenreNss withGenreSelf() {
        _query.doNss(new LdGenreCQ.NssCall() { public ConditionQuery qf() { return _query.queryGenreSelf(); }});
        return new LdGenreNss(_query.queryGenreSelf());
    }
}
