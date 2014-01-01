/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */package com.example.dbflute.multipledb.spring.dbflute.librarydb.cbean.nss;

import org.seasar.dbflute.cbean.ConditionQuery;
import com.example.dbflute.multipledb.spring.dbflute.librarydb.cbean.cq.LdVendorConstraintNameAutoRefCQ;

/**
 * The nest select set-upper of VENDOR_CONSTRAINT_NAME_AUTO_REF.
 * @author DBFlute(AutoGenerator)
 */
public class LdVendorConstraintNameAutoRefNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected LdVendorConstraintNameAutoRefCQ _query;
    public LdVendorConstraintNameAutoRefNss(LdVendorConstraintNameAutoRefCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br />
     * VENDOR_CONSTRAINT_NAME_AUTO_FOO by my CONSTRAINT_NAME_AUTO_FOO_ID, named 'vendorConstraintNameAutoFoo'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public LdVendorConstraintNameAutoFooNss withVendorConstraintNameAutoFoo() {
        _query.doNss(new LdVendorConstraintNameAutoRefCQ.NssCall() { public ConditionQuery qf() { return _query.queryVendorConstraintNameAutoFoo(); }});
        return new LdVendorConstraintNameAutoFooNss(_query.queryVendorConstraintNameAutoFoo());
    }
    /**
     * With nested relation columns to select clause. <br />
     * VENDOR_CONSTRAINT_NAME_AUTO_BAR by my CONSTRAINT_NAME_AUTO_BAR_ID, named 'vendorConstraintNameAutoBar'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public LdVendorConstraintNameAutoBarNss withVendorConstraintNameAutoBar() {
        _query.doNss(new LdVendorConstraintNameAutoRefCQ.NssCall() { public ConditionQuery qf() { return _query.queryVendorConstraintNameAutoBar(); }});
        return new LdVendorConstraintNameAutoBarNss(_query.queryVendorConstraintNameAutoBar());
    }
    /**
     * With nested relation columns to select clause. <br />
     * VENDOR_CONSTRAINT_NAME_AUTO_QUX by my CONSTRAINT_NAME_AUTO_QUX_ID, named 'vendorConstraintNameAutoQux'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public LdVendorConstraintNameAutoQuxNss withVendorConstraintNameAutoQux() {
        _query.doNss(new LdVendorConstraintNameAutoRefCQ.NssCall() { public ConditionQuery qf() { return _query.queryVendorConstraintNameAutoQux(); }});
        return new LdVendorConstraintNameAutoQuxNss(_query.queryVendorConstraintNameAutoQux());
    }

}
