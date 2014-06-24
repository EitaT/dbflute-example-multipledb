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
 * The referrer loader of COLLECTION as TABLE. <br />
 * <pre>
 * [primary key]
 *     COLLECTION_ID
 *
 * [column]
 *     COLLECTION_ID, LIBRARY_ID, BOOK_ID, ARRIVAL_DATE, R_USER, R_MODULE, R_TIMESTAMP, U_USER, U_MODULE, U_TIMESTAMP
 *
 * [sequence]
 *     
 *
 * [identity]
 *     COLLECTION_ID
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     BOOK, LIBRARY, COLLECTION_STATUS(AsOne)
 *
 * [referrer table]
 *     LENDING_COLLECTION, COLLECTION_STATUS
 *
 * [foreign property]
 *     book, library, collectionStatusAsOne
 *
 * [referrer property]
 *     lendingCollectionList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LdLoaderOfCollection {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<LdCollection> _selectedList;
    protected BehaviorSelector _selector;
    protected LdCollectionBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LdLoaderOfCollection ready(List<LdCollection> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected LdCollectionBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(LdCollectionBhv.class); return _myBhv; } }

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
    protected LdLoaderOfBook _foreignBookLoader;
    public LdLoaderOfBook pulloutBook() {
        if (_foreignBookLoader != null) { return _foreignBookLoader; }
        List<LdBook> pulledList = myBhv().pulloutBook(_selectedList);
        _foreignBookLoader = new LdLoaderOfBook().ready(pulledList, _selector);
        return _foreignBookLoader;
    }

    protected LdLoaderOfLibrary _foreignLibraryLoader;
    public LdLoaderOfLibrary pulloutLibrary() {
        if (_foreignLibraryLoader != null) { return _foreignLibraryLoader; }
        List<LdLibrary> pulledList = myBhv().pulloutLibrary(_selectedList);
        _foreignLibraryLoader = new LdLoaderOfLibrary().ready(pulledList, _selector);
        return _foreignLibraryLoader;
    }

    protected LdLoaderOfCollectionStatus _foreignCollectionStatusAsOneLoader;
    public LdLoaderOfCollectionStatus pulloutCollectionStatusAsOne() {
        if (_foreignCollectionStatusAsOneLoader != null) { return _foreignCollectionStatusAsOneLoader; }
        List<LdCollectionStatus> pulledList = myBhv().pulloutCollectionStatusAsOne(_selectedList);
        _foreignCollectionStatusAsOneLoader = new LdLoaderOfCollectionStatus().ready(pulledList, _selector);
        return _foreignCollectionStatusAsOneLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<LdCollection> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
