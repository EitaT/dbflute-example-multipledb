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
 * The referrer loader of PUBLISHER as TABLE. <br />
 * <pre>
 * [primary key]
 *     PUBLISHER_ID
 *
 * [column]
 *     PUBLISHER_ID, PUBLISHER_NAME, R_USER, R_MODULE, R_TIMESTAMP, U_USER, U_MODULE, U_TIMESTAMP
 *
 * [sequence]
 *     
 *
 * [identity]
 *     PUBLISHER_ID
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
public class LdLoaderOfPublisher {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<LdPublisher> _selectedList;
    protected BehaviorSelector _selector;
    protected LdPublisherBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LdLoaderOfPublisher ready(List<LdPublisher> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected LdPublisherBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(LdPublisherBhv.class); return _myBhv; } }

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
    public List<LdPublisher> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
