/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */package com.example.dbflute.multipledb.seasar.dbflute.librarydb.bsbhv.loader;

import java.util.List;

import org.seasar.dbflute.*;
import com.example.dbflute.multipledb.seasar.dbflute.librarydb.exbhv.*;
import com.example.dbflute.multipledb.seasar.dbflute.librarydb.exentity.*;

/**
 * The referrer loader of MYSELF_CHECK as TABLE. <br />
 * <pre>
 * [primary key]
 *     MYSELF_CHECK_ID
 *
 * [column]
 *     MYSELF_CHECK_ID, MYSELF_CHECK_NAME, MYSELF_ID
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
 *     MYSELF
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     myself
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LdLoaderOfMyselfCheck {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<LdMyselfCheck> _selectedList;
    protected BehaviorSelector _selector;
    protected LdMyselfCheckBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LdLoaderOfMyselfCheck ready(List<LdMyselfCheck> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected LdMyselfCheckBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(LdMyselfCheckBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LdLoaderOfMyself _foreignMyselfLoader;
    public LdLoaderOfMyself pulloutMyself() {
        if (_foreignMyselfLoader != null) { return _foreignMyselfLoader; }
        List<LdMyself> pulledList = myBhv().pulloutMyself(_selectedList);
        _foreignMyselfLoader = new LdLoaderOfMyself().ready(pulledList, _selector);
        return _foreignMyselfLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<LdMyselfCheck> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
