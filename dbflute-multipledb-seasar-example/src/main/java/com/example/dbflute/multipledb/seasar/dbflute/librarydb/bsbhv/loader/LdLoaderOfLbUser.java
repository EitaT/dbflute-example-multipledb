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
 * The referrer loader of LB_USER as TABLE. <br />
 * <pre>
 * [primary key]
 *     LB_USER_ID
 *
 * [column]
 *     LB_USER_ID, LB_USER_NAME, USER_PASSWORD, R_USER, R_MODULE, R_TIMESTAMP, U_USER, U_MODULE, U_TIMESTAMP
 *
 * [sequence]
 *     
 *
 * [identity]
 *     LB_USER_ID
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     BLACK_LIST(AsOne)
 *
 * [referrer table]
 *     LIBRARY_USER, BLACK_LIST
 *
 * [foreign property]
 *     blackListAsOne
 *
 * [referrer property]
 *     libraryUserList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LdLoaderOfLbUser {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<LdLbUser> _selectedList;
    protected BehaviorSelector _selector;
    protected LdLbUserBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LdLoaderOfLbUser ready(List<LdLbUser> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected LdLbUserBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(LdLbUserBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<LdLibraryUser> _referrerLibraryUserList;
    public NestedReferrerLoaderGateway<LdLoaderOfLibraryUser> loadLibraryUserList(ConditionBeanSetupper<LdLibraryUserCB> setupper) {
        myBhv().loadLibraryUserList(_selectedList, setupper).withNestedReferrer(new ReferrerListHandler<LdLibraryUser>() {
            public void handle(List<LdLibraryUser> referrerList) { _referrerLibraryUserList = referrerList; }
        });
        return new NestedReferrerLoaderGateway<LdLoaderOfLibraryUser>() {
            public void withNestedReferrer(ReferrerLoaderHandler<LdLoaderOfLibraryUser> handler) {
                handler.handle(new LdLoaderOfLibraryUser().ready(_referrerLibraryUserList, _selector));
            }
        };
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LdLoaderOfBlackList _foreignBlackListAsOneLoader;
    public LdLoaderOfBlackList pulloutBlackListAsOne() {
        if (_foreignBlackListAsOneLoader != null) { return _foreignBlackListAsOneLoader; }
        List<LdBlackList> pulledList = myBhv().pulloutBlackListAsOne(_selectedList);
        _foreignBlackListAsOneLoader = new LdLoaderOfBlackList().ready(pulledList, _selector);
        return _foreignBlackListAsOneLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<LdLbUser> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
