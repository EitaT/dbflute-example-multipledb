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
 * The referrer loader of BLACK_LIST as TABLE. <br />
 * <pre>
 * [primary key]
 *     BLACK_LIST_ID
 *
 * [column]
 *     BLACK_LIST_ID, LB_USER_ID, BLACK_RANK, R_USER, R_MODULE, R_TIMESTAMP, U_USER, U_MODULE, U_TIMESTAMP
 *
 * [sequence]
 *     
 *
 * [identity]
 *     BLACK_LIST_ID
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     LB_USER
 *
 * [referrer table]
 *     BLACK_ACTION
 *
 * [foreign property]
 *     lbUser
 *
 * [referrer property]
 *     blackActionList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LdLoaderOfBlackList {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<LdBlackList> _selectedList;
    protected BehaviorSelector _selector;
    protected LdBlackListBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LdLoaderOfBlackList ready(List<LdBlackList> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected LdBlackListBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(LdBlackListBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<LdBlackAction> _referrerBlackActionList;
    public NestedReferrerLoaderGateway<LdLoaderOfBlackAction> loadBlackActionList(ConditionBeanSetupper<LdBlackActionCB> setupper) {
        myBhv().loadBlackActionList(_selectedList, setupper).withNestedReferrer(new ReferrerListHandler<LdBlackAction>() {
            public void handle(List<LdBlackAction> referrerList) { _referrerBlackActionList = referrerList; }
        });
        return new NestedReferrerLoaderGateway<LdLoaderOfBlackAction>() {
            public void withNestedReferrer(ReferrerLoaderHandler<LdLoaderOfBlackAction> handler) {
                handler.handle(new LdLoaderOfBlackAction().ready(_referrerBlackActionList, _selector));
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

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<LdBlackList> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
