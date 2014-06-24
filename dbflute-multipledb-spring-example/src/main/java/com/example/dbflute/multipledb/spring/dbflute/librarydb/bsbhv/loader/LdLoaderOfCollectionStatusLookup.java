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
 * The referrer loader of COLLECTION_STATUS_LOOKUP as TABLE. <br />
 * <pre>
 * [primary key]
 *     COLLECTION_STATUS_CODE
 *
 * [column]
 *     COLLECTION_STATUS_CODE, COLLECTION_STATUS_NAME, R_USER, R_MODULE, R_TIMESTAMP, U_USER, U_MODULE, U_TIMESTAMP
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
 *     COLLECTION_STATUS
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     collectionStatusList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LdLoaderOfCollectionStatusLookup {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<LdCollectionStatusLookup> _selectedList;
    protected BehaviorSelector _selector;
    protected LdCollectionStatusLookupBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LdLoaderOfCollectionStatusLookup ready(List<LdCollectionStatusLookup> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected LdCollectionStatusLookupBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(LdCollectionStatusLookupBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<LdCollectionStatus> _referrerCollectionStatusList;
    public NestedReferrerLoaderGateway<LdLoaderOfCollectionStatus> loadCollectionStatusList(ConditionBeanSetupper<LdCollectionStatusCB> setupper) {
        myBhv().loadCollectionStatusList(_selectedList, setupper).withNestedReferrer(new ReferrerListHandler<LdCollectionStatus>() {
            public void handle(List<LdCollectionStatus> referrerList) { _referrerCollectionStatusList = referrerList; }
        });
        return new NestedReferrerLoaderGateway<LdLoaderOfCollectionStatus>() {
            public void withNestedReferrer(ReferrerLoaderHandler<LdLoaderOfCollectionStatus> handler) {
                handler.handle(new LdLoaderOfCollectionStatus().ready(_referrerCollectionStatusList, _selector));
            }
        };
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<LdCollectionStatusLookup> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
