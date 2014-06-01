/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */package com.example.dbflute.multipledb.seasar.dbflute.librarydb.cbean.nss;

import org.seasar.dbflute.cbean.ConditionQuery;
import com.example.dbflute.multipledb.seasar.dbflute.librarydb.cbean.cq.LdNextLibraryCQ;

/**
 * The nest select set-upper of NEXT_LIBRARY.
 * @author DBFlute(AutoGenerator)
 */
public class LdNextLibraryNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected LdNextLibraryCQ _query;
    public LdNextLibraryNss(LdNextLibraryCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br />
     * LIBRARY by my LIBRARY_ID, named 'libraryByLibraryId'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public LdLibraryNss withLibraryByLibraryId() {
        _query.doNss(new LdNextLibraryCQ.NssCall() { public ConditionQuery qf() { return _query.queryLibraryByLibraryId(); }});
        return new LdLibraryNss(_query.queryLibraryByLibraryId());
    }
    /**
     * With nested relation columns to select clause. <br />
     * LIBRARY by my NEXT_LIBRARY_ID, named 'libraryByNextLibraryId'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public LdLibraryNss withLibraryByNextLibraryId() {
        _query.doNss(new LdNextLibraryCQ.NssCall() { public ConditionQuery qf() { return _query.queryLibraryByNextLibraryId(); }});
        return new LdLibraryNss(_query.queryLibraryByNextLibraryId());
    }
}
