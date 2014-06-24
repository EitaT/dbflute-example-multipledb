/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */package com.example.dbflute.multipledb.seasar.dbflute.librarydb.bsbhv.loader;

import java.util.List;

import org.seasar.dbflute.*;
import com.example.dbflute.multipledb.seasar.dbflute.librarydb.exbhv.*;
import com.example.dbflute.multipledb.seasar.dbflute.librarydb.exentity.*;

/**
 * The referrer loader of NEXT_LIBRARY as TABLE. <br />
 * <pre>
 * [primary key]
 *     LIBRARY_ID, NEXT_LIBRARY_ID
 *
 * [column]
 *     LIBRARY_ID, NEXT_LIBRARY_ID, DISTANCE_KM, R_USER, R_MODULE, R_TIMESTAMP, U_USER, U_MODULE, U_TIMESTAMP
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
 *     LIBRARY
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     libraryByLibraryId, libraryByNextLibraryId
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LdLoaderOfNextLibrary {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<LdNextLibrary> _selectedList;
    protected BehaviorSelector _selector;
    protected LdNextLibraryBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LdLoaderOfNextLibrary ready(List<LdNextLibrary> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected LdNextLibraryBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(LdNextLibraryBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LdLoaderOfLibrary _foreignLibraryByLibraryIdLoader;
    public LdLoaderOfLibrary pulloutLibraryByLibraryId() {
        if (_foreignLibraryByLibraryIdLoader != null) { return _foreignLibraryByLibraryIdLoader; }
        List<LdLibrary> pulledList = myBhv().pulloutLibraryByLibraryId(_selectedList);
        _foreignLibraryByLibraryIdLoader = new LdLoaderOfLibrary().ready(pulledList, _selector);
        return _foreignLibraryByLibraryIdLoader;
    }

    protected LdLoaderOfLibrary _foreignLibraryByNextLibraryIdLoader;
    public LdLoaderOfLibrary pulloutLibraryByNextLibraryId() {
        if (_foreignLibraryByNextLibraryIdLoader != null) { return _foreignLibraryByNextLibraryIdLoader; }
        List<LdLibrary> pulledList = myBhv().pulloutLibraryByNextLibraryId(_selectedList);
        _foreignLibraryByNextLibraryIdLoader = new LdLoaderOfLibrary().ready(pulledList, _selector);
        return _foreignLibraryByNextLibraryIdLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<LdNextLibrary> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
