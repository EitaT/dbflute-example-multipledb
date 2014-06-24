/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */package com.example.dbflute.multipledb.seasar.dbflute.librarydb.bsbhv.loader;

import java.util.List;

import org.seasar.dbflute.*;
import com.example.dbflute.multipledb.seasar.dbflute.librarydb.exbhv.*;
import com.example.dbflute.multipledb.seasar.dbflute.librarydb.exentity.*;

/**
 * The referrer loader of BLACK_ACTION as TABLE. <br />
 * <pre>
 * [primary key]
 *     BLACK_ACTION_ID
 *
 * [column]
 *     BLACK_ACTION_ID, BLACK_LIST_ID, BLACK_ACTION_CODE, BLACK_LEVEL, ACTION_DATE, EVIDENCE_PHOTOGRAPH, R_USER, R_MODULE, R_TIMESTAMP, U_USER, U_MODULE, U_TIMESTAMP
 *
 * [sequence]
 *     
 *
 * [identity]
 *     BLACK_ACTION_ID
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     BLACK_LIST, BLACK_ACTION_LOOKUP
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     blackList, blackActionLookup
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LdLoaderOfBlackAction {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<LdBlackAction> _selectedList;
    protected BehaviorSelector _selector;
    protected LdBlackActionBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LdLoaderOfBlackAction ready(List<LdBlackAction> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected LdBlackActionBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(LdBlackActionBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LdLoaderOfBlackList _foreignBlackListLoader;
    public LdLoaderOfBlackList pulloutBlackList() {
        if (_foreignBlackListLoader != null) { return _foreignBlackListLoader; }
        List<LdBlackList> pulledList = myBhv().pulloutBlackList(_selectedList);
        _foreignBlackListLoader = new LdLoaderOfBlackList().ready(pulledList, _selector);
        return _foreignBlackListLoader;
    }

    protected LdLoaderOfBlackActionLookup _foreignBlackActionLookupLoader;
    public LdLoaderOfBlackActionLookup pulloutBlackActionLookup() {
        if (_foreignBlackActionLookupLoader != null) { return _foreignBlackActionLookupLoader; }
        List<LdBlackActionLookup> pulledList = myBhv().pulloutBlackActionLookup(_selectedList);
        _foreignBlackActionLookupLoader = new LdLoaderOfBlackActionLookup().ready(pulledList, _selector);
        return _foreignBlackActionLookupLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<LdBlackAction> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
