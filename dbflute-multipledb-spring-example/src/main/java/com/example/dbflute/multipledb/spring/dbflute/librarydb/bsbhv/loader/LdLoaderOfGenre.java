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
 * The referrer loader of GENRE as TABLE. <br />
 * <pre>
 * [primary key]
 *     GENRE_CODE
 *
 * [column]
 *     GENRE_CODE, GENRE_NAME, HIERARCHY_LEVEL, HIERARCHY_ORDER, PARENT_GENRE_CODE, R_USER, R_MODULE, R_TIMESTAMP, U_USER, U_MODULE, U_TIMESTAMP
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
 *     GENRE
 *
 * [referrer table]
 *     BOOK, GENRE
 *
 * [foreign property]
 *     genreSelf
 *
 * [referrer property]
 *     bookList, genreSelfList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LdLoaderOfGenre {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<LdGenre> _selectedList;
    protected BehaviorSelector _selector;
    protected LdGenreBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LdLoaderOfGenre ready(List<LdGenre> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected LdGenreBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(LdGenreBhv.class); return _myBhv; } }

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

    protected List<LdGenre> _referrerGenreSelfList;
    public NestedReferrerLoaderGateway<LdLoaderOfGenre> loadGenreSelfList(ConditionBeanSetupper<LdGenreCB> setupper) {
        myBhv().loadGenreSelfList(_selectedList, setupper).withNestedReferrer(new ReferrerListHandler<LdGenre>() {
            public void handle(List<LdGenre> referrerList) { _referrerGenreSelfList = referrerList; }
        });
        return new NestedReferrerLoaderGateway<LdLoaderOfGenre>() {
            public void withNestedReferrer(ReferrerLoaderHandler<LdLoaderOfGenre> handler) {
                handler.handle(new LdLoaderOfGenre().ready(_referrerGenreSelfList, _selector));
            }
        };
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LdLoaderOfGenre _foreignGenreSelfLoader;
    public LdLoaderOfGenre pulloutGenreSelf() {
        if (_foreignGenreSelfLoader != null) { return _foreignGenreSelfLoader; }
        List<LdGenre> pulledList = myBhv().pulloutGenreSelf(_selectedList);
        _foreignGenreSelfLoader = new LdLoaderOfGenre().ready(pulledList, _selector);
        return _foreignGenreSelfLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<LdGenre> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
