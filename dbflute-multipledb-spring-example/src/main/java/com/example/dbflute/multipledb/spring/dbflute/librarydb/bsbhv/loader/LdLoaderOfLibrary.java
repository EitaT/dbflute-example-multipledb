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
 * The referrer loader of LIBRARY as TABLE. <br />
 * <pre>
 * [primary key]
 *     LIBRARY_ID
 *
 * [column]
 *     LIBRARY_ID, LIBRARY_NAME, LIBRARY_TYPE_CODE, R_USER, R_MODULE, R_TIMESTAMP, U_USER, U_MODULE, U_TIMESTAMP
 *
 * [sequence]
 *     
 *
 * [identity]
 *     LIBRARY_ID
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     LIBRARY_TYPE_LOOKUP
 *
 * [referrer table]
 *     COLLECTION, LIBRARY_USER, NEXT_LIBRARY
 *
 * [foreign property]
 *     libraryTypeLookup
 *
 * [referrer property]
 *     collectionList, libraryUserList, nextLibraryByLibraryIdList, nextLibraryByNextLibraryIdList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LdLoaderOfLibrary {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<LdLibrary> _selectedList;
    protected BehaviorSelector _selector;
    protected LdLibraryBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LdLoaderOfLibrary ready(List<LdLibrary> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected LdLibraryBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(LdLibraryBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<LdCollection> _referrerCollectionList;
    public NestedReferrerLoaderGateway<LdLoaderOfCollection> loadCollectionList(ConditionBeanSetupper<LdCollectionCB> setupper) {
        myBhv().loadCollectionList(_selectedList, setupper).withNestedReferrer(new ReferrerListHandler<LdCollection>() {
            public void handle(List<LdCollection> referrerList) { _referrerCollectionList = referrerList; }
        });
        return new NestedReferrerLoaderGateway<LdLoaderOfCollection>() {
            public void withNestedReferrer(ReferrerLoaderHandler<LdLoaderOfCollection> handler) {
                handler.handle(new LdLoaderOfCollection().ready(_referrerCollectionList, _selector));
            }
        };
    }

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

    protected List<LdNextLibrary> _referrerNextLibraryByLibraryIdList;
    public NestedReferrerLoaderGateway<LdLoaderOfNextLibrary> loadNextLibraryByLibraryIdList(ConditionBeanSetupper<LdNextLibraryCB> setupper) {
        myBhv().loadNextLibraryByLibraryIdList(_selectedList, setupper).withNestedReferrer(new ReferrerListHandler<LdNextLibrary>() {
            public void handle(List<LdNextLibrary> referrerList) { _referrerNextLibraryByLibraryIdList = referrerList; }
        });
        return new NestedReferrerLoaderGateway<LdLoaderOfNextLibrary>() {
            public void withNestedReferrer(ReferrerLoaderHandler<LdLoaderOfNextLibrary> handler) {
                handler.handle(new LdLoaderOfNextLibrary().ready(_referrerNextLibraryByLibraryIdList, _selector));
            }
        };
    }

    protected List<LdNextLibrary> _referrerNextLibraryByNextLibraryIdList;
    public NestedReferrerLoaderGateway<LdLoaderOfNextLibrary> loadNextLibraryByNextLibraryIdList(ConditionBeanSetupper<LdNextLibraryCB> setupper) {
        myBhv().loadNextLibraryByNextLibraryIdList(_selectedList, setupper).withNestedReferrer(new ReferrerListHandler<LdNextLibrary>() {
            public void handle(List<LdNextLibrary> referrerList) { _referrerNextLibraryByNextLibraryIdList = referrerList; }
        });
        return new NestedReferrerLoaderGateway<LdLoaderOfNextLibrary>() {
            public void withNestedReferrer(ReferrerLoaderHandler<LdLoaderOfNextLibrary> handler) {
                handler.handle(new LdLoaderOfNextLibrary().ready(_referrerNextLibraryByNextLibraryIdList, _selector));
            }
        };
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LdLoaderOfLibraryTypeLookup _foreignLibraryTypeLookupLoader;
    public LdLoaderOfLibraryTypeLookup pulloutLibraryTypeLookup() {
        if (_foreignLibraryTypeLookupLoader != null) { return _foreignLibraryTypeLookupLoader; }
        List<LdLibraryTypeLookup> pulledList = myBhv().pulloutLibraryTypeLookup(_selectedList);
        _foreignLibraryTypeLookupLoader = new LdLoaderOfLibraryTypeLookup().ready(pulledList, _selector);
        return _foreignLibraryTypeLookupLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<LdLibrary> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
