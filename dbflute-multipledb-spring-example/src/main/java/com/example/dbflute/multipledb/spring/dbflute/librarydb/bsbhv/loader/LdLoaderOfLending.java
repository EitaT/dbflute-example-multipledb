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
 * The referrer loader of LENDING as TABLE. <br />
 * <pre>
 * [primary key]
 *     LIBRARY_ID, LB_USER_ID, LENDING_DATE
 *
 * [column]
 *     LIBRARY_ID, LB_USER_ID, LENDING_DATE, R_USER, R_MODULE, R_TIMESTAMP, U_USER, U_MODULE, U_TIMESTAMP
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
 *     LIBRARY_USER
 *
 * [referrer table]
 *     LENDING_COLLECTION
 *
 * [foreign property]
 *     libraryUser
 *
 * [referrer property]
 *     lendingCollectionList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LdLoaderOfLending {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<LdLending> _selectedList;
    protected BehaviorSelector _selector;
    protected LdLendingBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LdLoaderOfLending ready(List<LdLending> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected LdLendingBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(LdLendingBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<LdLendingCollection> _referrerLendingCollectionList;
    public NestedReferrerLoaderGateway<LdLoaderOfLendingCollection> loadLendingCollectionList(ConditionBeanSetupper<LdLendingCollectionCB> setupper) {
        myBhv().loadLendingCollectionList(_selectedList, setupper).withNestedReferrer(new ReferrerListHandler<LdLendingCollection>() {
            public void handle(List<LdLendingCollection> referrerList) { _referrerLendingCollectionList = referrerList; }
        });
        return new NestedReferrerLoaderGateway<LdLoaderOfLendingCollection>() {
            public void withNestedReferrer(ReferrerLoaderHandler<LdLoaderOfLendingCollection> handler) {
                handler.handle(new LdLoaderOfLendingCollection().ready(_referrerLendingCollectionList, _selector));
            }
        };
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LdLoaderOfLibraryUser _foreignLibraryUserLoader;
    public LdLoaderOfLibraryUser pulloutLibraryUser() {
        if (_foreignLibraryUserLoader != null) { return _foreignLibraryUserLoader; }
        List<LdLibraryUser> pulledList = myBhv().pulloutLibraryUser(_selectedList);
        _foreignLibraryUserLoader = new LdLoaderOfLibraryUser().ready(pulledList, _selector);
        return _foreignLibraryUserLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<LdLending> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
