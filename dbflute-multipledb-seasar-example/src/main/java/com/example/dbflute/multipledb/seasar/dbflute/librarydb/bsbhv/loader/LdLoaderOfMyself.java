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
 * The referrer loader of MYSELF as TABLE. <br />
 * <pre>
 * [primary key]
 *     MYSELF_ID
 *
 * [column]
 *     MYSELF_ID, MYSELF_NAME
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
 *     MYSELF_CHECK
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     myselfCheckList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LdLoaderOfMyself {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<LdMyself> _selectedList;
    protected BehaviorSelector _selector;
    protected LdMyselfBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LdLoaderOfMyself ready(List<LdMyself> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected LdMyselfBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(LdMyselfBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<LdMyselfCheck> _referrerMyselfCheckList;
    public NestedReferrerLoaderGateway<LdLoaderOfMyselfCheck> loadMyselfCheckList(ConditionBeanSetupper<LdMyselfCheckCB> setupper) {
        myBhv().loadMyselfCheckList(_selectedList, setupper).withNestedReferrer(new ReferrerListHandler<LdMyselfCheck>() {
            public void handle(List<LdMyselfCheck> referrerList) { _referrerMyselfCheckList = referrerList; }
        });
        return new NestedReferrerLoaderGateway<LdLoaderOfMyselfCheck>() {
            public void withNestedReferrer(ReferrerLoaderHandler<LdLoaderOfMyselfCheck> handler) {
                handler.handle(new LdLoaderOfMyselfCheck().ready(_referrerMyselfCheckList, _selector));
            }
        };
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<LdMyself> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
