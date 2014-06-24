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
 * The referrer loader of BOOK as TABLE. <br />
 * <pre>
 * [primary key]
 *     BOOK_ID
 *
 * [column]
 *     BOOK_ID, ISBN, BOOK_NAME, AUTHOR_ID, PUBLISHER_ID, GENRE_CODE, OPENING_PART, MAX_LENDING_DATE_COUNT, OUT_OF_USER_SELECT_YN, OUT_OF_USER_SELECT_REASON, R_USER, R_MODULE, R_TIMESTAMP, U_USER, U_MODULE, U_TIMESTAMP
 *
 * [sequence]
 *     
 *
 * [identity]
 *     BOOK_ID
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     AUTHOR, GENRE, PUBLISHER, COLLECTION_STATUS_LOOKUP(AsNonExist)
 *
 * [referrer table]
 *     COLLECTION
 *
 * [foreign property]
 *     author, genre, publisher, collectionStatusLookupAsNonExist
 *
 * [referrer property]
 *     collectionList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LdLoaderOfBook {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<LdBook> _selectedList;
    protected BehaviorSelector _selector;
    protected LdBookBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LdLoaderOfBook ready(List<LdBook> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected LdBookBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(LdBookBhv.class); return _myBhv; } }

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

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LdLoaderOfAuthor _foreignAuthorLoader;
    public LdLoaderOfAuthor pulloutAuthor() {
        if (_foreignAuthorLoader != null) { return _foreignAuthorLoader; }
        List<LdAuthor> pulledList = myBhv().pulloutAuthor(_selectedList);
        _foreignAuthorLoader = new LdLoaderOfAuthor().ready(pulledList, _selector);
        return _foreignAuthorLoader;
    }

    protected LdLoaderOfGenre _foreignGenreLoader;
    public LdLoaderOfGenre pulloutGenre() {
        if (_foreignGenreLoader != null) { return _foreignGenreLoader; }
        List<LdGenre> pulledList = myBhv().pulloutGenre(_selectedList);
        _foreignGenreLoader = new LdLoaderOfGenre().ready(pulledList, _selector);
        return _foreignGenreLoader;
    }

    protected LdLoaderOfPublisher _foreignPublisherLoader;
    public LdLoaderOfPublisher pulloutPublisher() {
        if (_foreignPublisherLoader != null) { return _foreignPublisherLoader; }
        List<LdPublisher> pulledList = myBhv().pulloutPublisher(_selectedList);
        _foreignPublisherLoader = new LdLoaderOfPublisher().ready(pulledList, _selector);
        return _foreignPublisherLoader;
    }

    protected LdLoaderOfCollectionStatusLookup _foreignCollectionStatusLookupAsNonExistLoader;
    public LdLoaderOfCollectionStatusLookup pulloutCollectionStatusLookupAsNonExist() {
        if (_foreignCollectionStatusLookupAsNonExistLoader != null) { return _foreignCollectionStatusLookupAsNonExistLoader; }
        List<LdCollectionStatusLookup> pulledList = myBhv().pulloutCollectionStatusLookupAsNonExist(_selectedList);
        _foreignCollectionStatusLookupAsNonExistLoader = new LdLoaderOfCollectionStatusLookup().ready(pulledList, _selector);
        return _foreignCollectionStatusLookupAsNonExistLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<LdBook> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
