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
 * The referrer loader of BLACK_ACTION_LOOKUP as TABLE. <br />
 * <pre>
 * [primary key]
 *     BLACK_ACTION_CODE
 *
 * [column]
 *     BLACK_ACTION_CODE, BLACK_ACTION_NAME, R_USER, R_MODULE, R_TIMESTAMP, U_USER, U_MODULE, U_TIMESTAMP
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
 *     BLACK_ACTION
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     blackActionList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LdLoaderOfBlackActionLookup {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<LdBlackActionLookup> _selectedList;
    protected BehaviorSelector _selector;
    protected LdBlackActionLookupBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LdLoaderOfBlackActionLookup ready(List<LdBlackActionLookup> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected LdBlackActionLookupBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(LdBlackActionLookupBhv.class); return _myBhv; } }

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
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<LdBlackActionLookup> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
