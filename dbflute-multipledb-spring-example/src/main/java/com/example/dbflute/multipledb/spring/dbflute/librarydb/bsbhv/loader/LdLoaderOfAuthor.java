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
 * The referrer loader of AUTHOR as TABLE. <br />
 * <pre>
 * [primary key]
 *     AUTHOR_ID
 *
 * [column]
 *     AUTHOR_ID, AUTHOR_NAME, AUTHOR_AGE, R_USER, R_MODULE, R_TIMESTAMP, U_USER, U_MODULE, U_TIMESTAMP
 *
 * [sequence]
 *     
 *
 * [identity]
 *     AUTHOR_ID
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     
 *
 * [referrer table]
 *     BOOK
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     bookList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LdLoaderOfAuthor {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<LdAuthor> _selectedList;
    protected BehaviorSelector _selector;
    protected LdAuthorBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LdLoaderOfAuthor ready(List<LdAuthor> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected LdAuthorBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(LdAuthorBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<LdBook> _referrerBookList;
    public NestedReferrerLoaderGateway<LdLoaderOfBook> loadBookList(ConditionBeanSetupper<LdBookCB> setupper) {
        myBhv().loadBookList(_selectedList, setupper).withNestedReferrer(new ReferrerListHandler<LdBook>() {
            public void handle(List<LdBook> referrerList) { _referrerBookList = referrerList; }
        });
        return new NestedReferrerLoaderGateway<LdLoaderOfBook>() {
            public void withNestedReferrer(ReferrerLoaderHandler<LdLoaderOfBook> handler) {
                handler.handle(new LdLoaderOfBook().ready(_referrerBookList, _selector));
            }
        };
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<LdAuthor> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
