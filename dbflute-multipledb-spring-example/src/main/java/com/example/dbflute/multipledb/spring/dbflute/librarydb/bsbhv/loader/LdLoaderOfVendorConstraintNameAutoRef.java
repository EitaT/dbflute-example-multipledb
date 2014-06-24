/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */package com.example.dbflute.multipledb.spring.dbflute.librarydb.bsbhv.loader;

import java.util.List;

import org.seasar.dbflute.*;
import com.example.dbflute.multipledb.spring.dbflute.librarydb.exbhv.*;
import com.example.dbflute.multipledb.spring.dbflute.librarydb.exentity.*;

/**
 * The referrer loader of VENDOR_CONSTRAINT_NAME_AUTO_REF as TABLE. <br />
 * <pre>
 * [primary key]
 *     CONSTRAINT_NAME_AUTO_REF_ID
 *
 * [column]
 *     CONSTRAINT_NAME_AUTO_REF_ID, CONSTRAINT_NAME_AUTO_FOO_ID, CONSTRAINT_NAME_AUTO_BAR_ID, CONSTRAINT_NAME_AUTO_QUX_ID, CONSTRAINT_NAME_AUTO_UNIQUE
 *
 * [sequence]
 *     
 *
 * [identity]
 *     
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     VENDOR_CONSTRAINT_NAME_AUTO_FOO, VENDOR_CONSTRAINT_NAME_AUTO_BAR, VENDOR_CONSTRAINT_NAME_AUTO_QUX
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     vendorConstraintNameAutoFoo, vendorConstraintNameAutoBar, vendorConstraintNameAutoQux
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LdLoaderOfVendorConstraintNameAutoRef {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<LdVendorConstraintNameAutoRef> _selectedList;
    protected BehaviorSelector _selector;
    protected LdVendorConstraintNameAutoRefBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LdLoaderOfVendorConstraintNameAutoRef ready(List<LdVendorConstraintNameAutoRef> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected LdVendorConstraintNameAutoRefBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(LdVendorConstraintNameAutoRefBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LdLoaderOfVendorConstraintNameAutoFoo _foreignVendorConstraintNameAutoFooLoader;
    public LdLoaderOfVendorConstraintNameAutoFoo pulloutVendorConstraintNameAutoFoo() {
        if (_foreignVendorConstraintNameAutoFooLoader != null) { return _foreignVendorConstraintNameAutoFooLoader; }
        List<LdVendorConstraintNameAutoFoo> pulledList = myBhv().pulloutVendorConstraintNameAutoFoo(_selectedList);
        _foreignVendorConstraintNameAutoFooLoader = new LdLoaderOfVendorConstraintNameAutoFoo().ready(pulledList, _selector);
        return _foreignVendorConstraintNameAutoFooLoader;
    }

    protected LdLoaderOfVendorConstraintNameAutoBar _foreignVendorConstraintNameAutoBarLoader;
    public LdLoaderOfVendorConstraintNameAutoBar pulloutVendorConstraintNameAutoBar() {
        if (_foreignVendorConstraintNameAutoBarLoader != null) { return _foreignVendorConstraintNameAutoBarLoader; }
        List<LdVendorConstraintNameAutoBar> pulledList = myBhv().pulloutVendorConstraintNameAutoBar(_selectedList);
        _foreignVendorConstraintNameAutoBarLoader = new LdLoaderOfVendorConstraintNameAutoBar().ready(pulledList, _selector);
        return _foreignVendorConstraintNameAutoBarLoader;
    }

    protected LdLoaderOfVendorConstraintNameAutoQux _foreignVendorConstraintNameAutoQuxLoader;
    public LdLoaderOfVendorConstraintNameAutoQux pulloutVendorConstraintNameAutoQux() {
        if (_foreignVendorConstraintNameAutoQuxLoader != null) { return _foreignVendorConstraintNameAutoQuxLoader; }
        List<LdVendorConstraintNameAutoQux> pulledList = myBhv().pulloutVendorConstraintNameAutoQux(_selectedList);
        _foreignVendorConstraintNameAutoQuxLoader = new LdLoaderOfVendorConstraintNameAutoQux().ready(pulledList, _selector);
        return _foreignVendorConstraintNameAutoQuxLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<LdVendorConstraintNameAutoRef> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
