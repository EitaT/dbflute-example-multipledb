/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */package com.example.dbflute.multipledb.seasar.dbflute.librarydb.bsbhv.loader;

import java.util.List;

import org.seasar.dbflute.*;
import org.seasar.dbflute.bhv.*;
import com.example.dbflute.multipledb.seasar.dbflute.librarydb.exbhv.*;
import com.example.dbflute.multipledb.seasar.dbflute.librarydb.exentity.*;
import com.example.dbflute.multipledb.seasar.dbflute.librarydb.cbean.*;

/**
 * The referrer loader of LIBRARY_USER as TABLE. <br />
 * <pre>
 * [primary key]
 *     LIBRARY_ID, LB_USER_ID
 *
 * [column]
 *     LIBRARY_ID, LB_USER_ID, R_USER, R_MODULE, R_TIMESTAMP, U_USER, U_MODULE, U_TIMESTAMP
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
 *     LB_USER, LIBRARY
 *
 * [referrer table]
 *     LENDING, LENDING_COLLECTION
 *
 * [foreign property]
 *     lbUser, library
 *
 * [referrer property]
 *     lendingList, lendingCollectionList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LdLoaderOfLibraryUser {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<LdLibraryUser> _selectedList;
    protected BehaviorSelector _selector;
    protected LdLibraryUserBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LdLoaderOfLibraryUser ready(List<LdLibraryUser> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected LdLibraryUserBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(LdLibraryUserBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<LdLending> _referrerLendingList;
    public NestedReferrerLoaderGateway<LdLoaderOfLending> loadLendingList(ConditionBeanSetupper<LdLendingCB> setupper) {
        myBhv().loadLendingList(_selectedList, setupper).withNestedReferrer(new ReferrerListHandler<LdLending>() {
            public void handle(List<LdLending> referrerList) { _referrerLendingList = referrerList; }
        });
        return new NestedReferrerLoaderGateway<LdLoaderOfLending>() {
            public void withNestedReferrer(ReferrerLoaderHandler<LdLoaderOfLending> handler) {
                handler.handle(new LdLoaderOfLending().ready(_referrerLendingList, _selector));
            }
        };
    }

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
    protected LdLoaderOfLbUser _foreignLbUserLoader;
    public LdLoaderOfLbUser pulloutLbUser() {
        if (_foreignLbUserLoader != null) { return _foreignLbUserLoader; }
        List<LdLbUser> pulledList = myBhv().pulloutLbUser(_selectedList);
        _foreignLbUserLoader = new LdLoaderOfLbUser().ready(pulledList, _selector);
        return _foreignLbUserLoader;
    }

    protected LdLoaderOfLibrary _foreignLibraryLoader;
    public LdLoaderOfLibrary pulloutLibrary() {
        if (_foreignLibraryLoader != null) { return _foreignLibraryLoader; }
        List<LdLibrary> pulledList = myBhv().pulloutLibrary(_selectedList);
        _foreignLibraryLoader = new LdLoaderOfLibrary().ready(pulledList, _selector);
        return _foreignLibraryLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<LdLibraryUser> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
