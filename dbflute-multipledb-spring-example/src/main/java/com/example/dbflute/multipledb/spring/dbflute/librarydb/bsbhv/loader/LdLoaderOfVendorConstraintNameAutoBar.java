/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */package com.example.dbflute.multipledb.spring.dbflute.librarydb.bsbhv.loader;

import java.util.List;

import org.seasar.dbflute.*;
import org.seasar.dbflute.bhv.*;
import com.example.dbflute.multipledb.spring.dbflute.librarydb.exbhv.*;
import com.example.dbflute.multipledb.spring.dbflute.librarydb.exentity.*;
import com.example.dbflute.multipledb.spring.dbflute.librarydb.cbean.*;

/**
 * The referrer loader of VENDOR_CONSTRAINT_NAME_AUTO_BAR as TABLE. <br />
 * <pre>
 * [primary key]
 *     CONSTRAINT_NAME_AUTO_BAR_ID
 *
 * [column]
 *     CONSTRAINT_NAME_AUTO_BAR_ID, CONSTRAINT_NAME_AUTO_BAR_NAME
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
 *     
 *
 * [referrer table]
 *     VENDOR_CONSTRAINT_NAME_AUTO_REF
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     vendorConstraintNameAutoRefList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LdLoaderOfVendorConstraintNameAutoBar {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<LdVendorConstraintNameAutoBar> _selectedList;
    protected BehaviorSelector _selector;
    protected LdVendorConstraintNameAutoBarBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LdLoaderOfVendorConstraintNameAutoBar ready(List<LdVendorConstraintNameAutoBar> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected LdVendorConstraintNameAutoBarBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(LdVendorConstraintNameAutoBarBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<LdVendorConstraintNameAutoRef> _referrerVendorConstraintNameAutoRefList;
    public NestedReferrerLoaderGateway<LdLoaderOfVendorConstraintNameAutoRef> loadVendorConstraintNameAutoRefList(ConditionBeanSetupper<LdVendorConstraintNameAutoRefCB> setupper) {
        myBhv().loadVendorConstraintNameAutoRefList(_selectedList, setupper).withNestedReferrer(new ReferrerListHandler<LdVendorConstraintNameAutoRef>() {
            public void handle(List<LdVendorConstraintNameAutoRef> referrerList) { _referrerVendorConstraintNameAutoRefList = referrerList; }
        });
        return new NestedReferrerLoaderGateway<LdLoaderOfVendorConstraintNameAutoRef>() {
            public void withNestedReferrer(ReferrerLoaderHandler<LdLoaderOfVendorConstraintNameAutoRef> handler) {
                handler.handle(new LdLoaderOfVendorConstraintNameAutoRef().ready(_referrerVendorConstraintNameAutoRefList, _selector));
            }
        };
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<LdVendorConstraintNameAutoBar> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
