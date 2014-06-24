/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */package com.example.dbflute.multipledb.spring.dbflute.librarydb.bsbhv.loader;

import java.util.List;

import org.seasar.dbflute.*;
import com.example.dbflute.multipledb.spring.dbflute.librarydb.exbhv.*;
import com.example.dbflute.multipledb.spring.dbflute.librarydb.exentity.*;

/**
 * The referrer loader of VENDOR_CHECK as TABLE. <br />
 * <pre>
 * [primary key]
 *     
 *
 * [column]
 *     VENDOR_CHECK_ID, TYPE_OF_CHAR, TYPE_OF_VARCHAR, TYPE_OF_LONG_VARCHAR, TYPE_OF_CLOB, TYPE_OF_DECIMAL_INTEGER, TYPE_OF_DECIMAL_BIGINT, TYPE_OF_DECIMAL_DECIMAL, TYPE_OF_BIGINT, TYPE_OF_INTEGER, TYPE_OF_DATE, TYPE_OF_TIMESTAMP, TYPE_OF_TIME
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
 *     
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LdLoaderOfVendorCheck {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<LdVendorCheck> _selectedList;
    protected BehaviorSelector _selector;
    protected LdVendorCheckBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LdLoaderOfVendorCheck ready(List<LdVendorCheck> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected LdVendorCheckBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(LdVendorCheckBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<LdVendorCheck> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
