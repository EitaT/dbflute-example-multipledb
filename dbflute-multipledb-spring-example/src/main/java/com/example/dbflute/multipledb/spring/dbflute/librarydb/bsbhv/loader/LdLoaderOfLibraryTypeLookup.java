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
 * The referrer loader of LIBRARY_TYPE_LOOKUP as TABLE. <br />
 * <pre>
 * [primary key]
 *     LIBRARY_TYPE_CODE
 *
 * [column]
 *     LIBRARY_TYPE_CODE, LIBRARY_TYPE_NAME, R_USER, R_MODULE, R_TIMESTAMP, U_USER, U_MODULE, U_TIMESTAMP
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
 *     LIBRARY
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     libraryList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LdLoaderOfLibraryTypeLookup {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<LdLibraryTypeLookup> _selectedList;
    protected BehaviorSelector _selector;
    protected LdLibraryTypeLookupBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LdLoaderOfLibraryTypeLookup ready(List<LdLibraryTypeLookup> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected LdLibraryTypeLookupBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(LdLibraryTypeLookupBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<LdLibrary> _referrerLibraryList;
    public NestedReferrerLoaderGateway<LdLoaderOfLibrary> loadLibraryList(ConditionBeanSetupper<LdLibraryCB> setupper) {
        myBhv().loadLibraryList(_selectedList, setupper).withNestedReferrer(new ReferrerListHandler<LdLibrary>() {
            public void handle(List<LdLibrary> referrerList) { _referrerLibraryList = referrerList; }
        });
        return new NestedReferrerLoaderGateway<LdLoaderOfLibrary>() {
            public void withNestedReferrer(ReferrerLoaderHandler<LdLoaderOfLibrary> handler) {
                handler.handle(new LdLoaderOfLibrary().ready(_referrerLibraryList, _selector));
            }
        };
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<LdLibraryTypeLookup> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
