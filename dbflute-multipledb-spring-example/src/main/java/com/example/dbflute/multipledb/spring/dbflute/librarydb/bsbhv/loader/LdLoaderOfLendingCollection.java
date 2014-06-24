/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */package com.example.dbflute.multipledb.spring.dbflute.librarydb.bsbhv.loader;

import java.util.List;

import org.seasar.dbflute.*;
import com.example.dbflute.multipledb.spring.dbflute.librarydb.exbhv.*;
import com.example.dbflute.multipledb.spring.dbflute.librarydb.exentity.*;

/**
 * The referrer loader of LENDING_COLLECTION as TABLE. <br />
 * <pre>
 * [primary key]
 *     LIBRARY_ID, LB_USER_ID, LENDING_DATE, COLLECTION_ID
 *
 * [column]
 *     LIBRARY_ID, LB_USER_ID, LENDING_DATE, COLLECTION_ID, RETURN_LIMIT_DATE, R_USER, R_MODULE, R_TIMESTAMP, U_USER, U_MODULE, U_TIMESTAMP
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
 *     COLLECTION, LENDING, LIBRARY_USER
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     collection, lending, libraryUser
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LdLoaderOfLendingCollection {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<LdLendingCollection> _selectedList;
    protected BehaviorSelector _selector;
    protected LdLendingCollectionBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LdLoaderOfLendingCollection ready(List<LdLendingCollection> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected LdLendingCollectionBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(LdLendingCollectionBhv.class); return _myBhv; } }

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

    protected LdLoaderOfLending _foreignLendingLoader;
    public LdLoaderOfLending pulloutLending() {
        if (_foreignLendingLoader != null) { return _foreignLendingLoader; }
        List<LdLending> pulledList = myBhv().pulloutLending(_selectedList);
        _foreignLendingLoader = new LdLoaderOfLending().ready(pulledList, _selector);
        return _foreignLendingLoader;
    }

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
    public List<LdLendingCollection> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
