/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */package com.example.dbflute.multipledb.spring.dbflute.librarydb.bsbhv.loader;

import java.util.List;

import org.seasar.dbflute.*;
import com.example.dbflute.multipledb.spring.dbflute.librarydb.exbhv.*;
import com.example.dbflute.multipledb.spring.dbflute.librarydb.exentity.*;

/**
 * The referrer loader of COLLECTION_STATUS as TABLE. <br />
 * <pre>
 * [primary key]
 *     COLLECTION_ID
 *
 * [column]
 *     COLLECTION_ID, COLLECTION_STATUS_CODE, R_USER, R_MODULE, R_TIMESTAMP, U_USER, U_MODULE, U_TIMESTAMP
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
 *     COLLECTION, COLLECTION_STATUS_LOOKUP
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     collection, collectionStatusLookup
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LdLoaderOfCollectionStatus {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<LdCollectionStatus> _selectedList;
    protected BehaviorSelector _selector;
    protected LdCollectionStatusBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LdLoaderOfCollectionStatus ready(List<LdCollectionStatus> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected LdCollectionStatusBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(LdCollectionStatusBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LdLoaderOfCollection _foreignCollectionLoader;
    public LdLoaderOfCollection pulloutCollection() {
        if (_foreignCollectionLoader != null) { return _foreignCollectionLoader; }
        List<LdCollection> pulledList = myBhv().pulloutCollection(_selectedList);
        _foreignCollectionLoader = new LdLoaderOfCollection().ready(pulledList, _selector);
        return _foreignCollectionLoader;
    }

    protected LdLoaderOfCollectionStatusLookup _foreignCollectionStatusLookupLoader;
    public LdLoaderOfCollectionStatusLookup pulloutCollectionStatusLookup() {
        if (_foreignCollectionStatusLookupLoader != null) { return _foreignCollectionStatusLookupLoader; }
        List<LdCollectionStatusLookup> pulledList = myBhv().pulloutCollectionStatusLookup(_selectedList);
        _foreignCollectionStatusLookupLoader = new LdLoaderOfCollectionStatusLookup().ready(pulledList, _selector);
        return _foreignCollectionStatusLookupLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<LdCollectionStatus> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
