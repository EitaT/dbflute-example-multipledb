/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */package com.example.dbflute.multipledb.spring.dbflute.librarydb.bsbhv;

import java.util.List;

import org.seasar.dbflute.*;
import org.seasar.dbflute.bhv.*;
import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.exception.*;
import org.seasar.dbflute.optional.*;
import org.seasar.dbflute.outsidesql.executor.*;
import com.example.dbflute.multipledb.spring.dbflute.librarydb.exbhv.*;
import com.example.dbflute.multipledb.spring.dbflute.librarydb.exentity.*;
import com.example.dbflute.multipledb.spring.dbflute.librarydb.bsentity.dbmeta.*;
import com.example.dbflute.multipledb.spring.dbflute.librarydb.cbean.*;

/**
 * The behavior of BOOK as TABLE. <br />
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
public abstract class LdBsBookBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /** Simple Select */
    public static final String PATH_selectList = "selectList";
    public static final String PATH_update = "update";
    public static final String PATH_updateNoPmb = "updateNoPmb";
    public static final String PATH_updateTwiceTest = "updateTwiceTest";
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "BOOK"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public DBMeta getDBMeta() { return LdBookDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public LdBookDbm getMyDBMeta() { return LdBookDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public Entity newEntity() { return newMyEntity(); }

    /** {@inheritDoc} */
    public ConditionBean newConditionBean() { return newMyConditionBean(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public LdBook newMyEntity() { return new LdBook(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public LdBookCB newMyConditionBean() { return new LdBookCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * LdBookCB cb = new LdBookCB();
     * cb.query().setFoo...(value);
     * int count = bookBhv.<span style="color: #DD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of LdBook. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(LdBookCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(LdBookCB cb) { // called by selectCount(cb)
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(LdBookCB cb) { // called by selectPage(cb)
        assertCBStateValid(cb);
        return delegateSelectCountPlainly(cb);
    }

    @Override
    protected int doReadCount(ConditionBean cb) {
        return selectCount(downcast(cb));
    }

    // ===================================================================================
    //                                                                       Entity Select
    //                                                                       =============
    /**
     * Select the entity by the condition-bean. #beforejava8 <br />
     * <span style="color: #AD4747; font-size: 120%">The return might be null if no data, so you should have null check.</span> <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, use selectEntityWithDeletedCheck().</span>
     * <pre>
     * LdBookCB cb = new LdBookCB();
     * cb.query().setFoo...(value);
     * LdBook book = bookBhv.<span style="color: #DD4747">selectEntity</span>(cb);
     * if (book != null) { <span style="color: #3F7E5E">// null check</span>
     *     ... = book.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of LdBook. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public LdBook selectEntity(LdBookCB cb) {
        return doSelectEntity(cb, LdBook.class);
    }

    protected <ENTITY extends LdBook> ENTITY doSelectEntity(LdBookCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectEntityInternally(cb, tp, new InternalSelectEntityCallback<ENTITY, LdBookCB>() {
            public List<ENTITY> callbackSelectList(LdBookCB lcb, Class<ENTITY> ltp) { return doSelectList(lcb, ltp); } });
    }

    protected <ENTITY extends LdBook> OptionalEntity<ENTITY> doSelectOptionalEntity(LdBookCB cb, Class<ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    @Override
    protected Entity doReadEntity(ConditionBean cb) {
        return selectEntity(downcast(cb));
    }

    /**
     * Select the entity by the condition-bean with deleted check. <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, this method is good.</span>
     * <pre>
     * LdBookCB cb = new LdBookCB();
     * cb.query().setFoo...(value);
     * LdBook book = bookBhv.<span style="color: #DD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = book.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of LdBook. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (point is not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public LdBook selectEntityWithDeletedCheck(LdBookCB cb) {
        return doSelectEntityWithDeletedCheck(cb, LdBook.class);
    }

    protected <ENTITY extends LdBook> ENTITY doSelectEntityWithDeletedCheck(LdBookCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectEntityWithDeletedCheckInternally(cb, tp, new InternalSelectEntityWithDeletedCheckCallback<ENTITY, LdBookCB>() {
            public List<ENTITY> callbackSelectList(LdBookCB lcb, Class<ENTITY> ltp) { return doSelectList(lcb, ltp); } });
    }

    @Override
    protected Entity doReadEntityWithDeletedCheck(ConditionBean cb) {
        return selectEntityWithDeletedCheck(downcast(cb));
    }

    /**
     * Select the entity by the primary-key value.
     * @param bookId The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public LdBook selectByPKValue(Integer bookId) {
        return doSelectByPKValue(bookId, LdBook.class);
    }

    protected <ENTITY extends LdBook> ENTITY doSelectByPKValue(Integer bookId, Class<ENTITY> entityType) {
        return doSelectEntity(buildPKCB(bookId), entityType);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param bookId The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public LdBook selectByPKValueWithDeletedCheck(Integer bookId) {
        return doSelectByPKValueWithDeletedCheck(bookId, LdBook.class);
    }

    protected <ENTITY extends LdBook> ENTITY doSelectByPKValueWithDeletedCheck(Integer bookId, Class<ENTITY> entityType) {
        return doSelectEntityWithDeletedCheck(buildPKCB(bookId), entityType);
    }

    private LdBookCB buildPKCB(Integer bookId) {
        assertObjectNotNull("bookId", bookId);
        LdBookCB cb = newMyConditionBean();
        cb.query().setBookId_Equal(bookId);
        return cb;
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * LdBookCB cb = new LdBookCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;LdBook&gt; bookList = bookBhv.<span style="color: #DD4747">selectList</span>(cb);
     * for (LdBook book : bookList) {
     *     ... = book.get...();
     * }
     * </pre>
     * @param cb The condition-bean of LdBook. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<LdBook> selectList(LdBookCB cb) {
        return doSelectList(cb, LdBook.class);
    }

    protected <ENTITY extends LdBook> ListResultBean<ENTITY> doSelectList(LdBookCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        return helpSelectListInternally(cb, tp, new InternalSelectListCallback<ENTITY, LdBookCB>() {
            public List<ENTITY> callbackSelectList(LdBookCB lcb, Class<ENTITY> ltp) { return delegateSelectList(lcb, ltp); } });
    }

    @Override
    protected ListResultBean<? extends Entity> doReadList(ConditionBean cb) {
        return selectList(downcast(cb));
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br />
     * (both count-select and paging-select are executed)
     * <pre>
     * LdBookCB cb = new LdBookCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #DD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;LdBook&gt; page = bookBhv.<span style="color: #DD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (LdBook book : page) {
     *     ... = book.get...();
     * }
     * </pre>
     * @param cb The condition-bean of LdBook. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<LdBook> selectPage(LdBookCB cb) {
        return doSelectPage(cb, LdBook.class);
    }

    protected <ENTITY extends LdBook> PagingResultBean<ENTITY> doSelectPage(LdBookCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectPageInternally(cb, tp, new InternalSelectPageCallback<ENTITY, LdBookCB>() {
            public int callbackSelectCount(LdBookCB cb) { return doSelectCountPlainly(cb); }
            public List<ENTITY> callbackSelectList(LdBookCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); }
        });
    }

    @Override
    protected PagingResultBean<? extends Entity> doReadPage(ConditionBean cb) {
        return selectPage(downcast(cb));
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * LdBookCB cb = new LdBookCB();
     * cb.query().setFoo...(value);
     * bookBhv.<span style="color: #DD4747">selectCursor</span>(cb, new EntityRowHandler&lt;LdBook&gt;() {
     *     public void handle(LdBook entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of LdBook. (NotNull)
     * @param entityRowHandler The handler of entity row of LdBook. (NotNull)
     */
    public void selectCursor(LdBookCB cb, EntityRowHandler<LdBook> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, LdBook.class);
    }

    protected <ENTITY extends LdBook> void doSelectCursor(LdBookCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler", handler); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        helpSelectCursorInternally(cb, handler, tp, new InternalSelectCursorCallback<ENTITY, LdBookCB>() {
            public void callbackSelectCursor(LdBookCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) { delegateSelectCursor(cb, handler, tp); }
            public List<ENTITY> callbackSelectList(LdBookCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); }
        });
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * bookBhv.<span style="color: #DD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(LdBookCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> SLFunction<LdBookCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
    }

    protected <RESULT, CB extends LdBookCB> SLFunction<CB, RESULT> doScalarSelect(Class<RESULT> tp, CB cb) {
        assertObjectNotNull("resultType", tp); assertCBStateValid(cb);
        cb.xsetupForScalarSelect(); cb.getSqlClause().disableSelectIndex(); // for when you use union
        return createSLFunction(cb, tp);
    }

    protected <RESULT, CB extends LdBookCB> SLFunction<CB, RESULT> createSLFunction(CB cb, Class<RESULT> tp) {
        return new SLFunction<CB, RESULT>(cb, tp);
    }

    protected <RESULT> SLFunction<? extends ConditionBean, RESULT> doReadScalar(Class<RESULT> tp) {
        return doScalarSelect(tp, newMyConditionBean());
    }

    // ===================================================================================
    //                                                                            Sequence
    //                                                                            ========
    @Override
    protected Number doReadNextVal() {
        String msg = "This table is NOT related to sequence: " + getTableDbName();
        throw new UnsupportedOperationException(msg);
    }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    /**
     * Load referrer of collectionList by the set-upper of referrer. <br />
     * COLLECTION by BOOK_ID, named 'collectionList'.
     * <pre>
     * bookBhv.<span style="color: #DD4747">loadCollectionList</span>(bookList, new ConditionBeanSetupper&lt;LdCollectionCB&gt;() {
     *     public void setup(LdCollectionCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...();
     *     }
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedList(referrerList -&gt {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * for (LdBook book : bookList) {
     *     ... = book.<span style="color: #DD4747">getCollectionList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setBookId_InScope(pkList);
     * cb.query().addOrderBy_BookId_Asc();
     * </pre>
     * @param bookList The entity list of book. (NotNull)
     * @param setupper The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoader<LdCollection> loadCollectionList(List<LdBook> bookList, ConditionBeanSetupper<LdCollectionCB> setupper) {
        xassLRArg(bookList, setupper);
        return doLoadCollectionList(bookList, new LoadReferrerOption<LdCollectionCB, LdCollection>().xinit(setupper));
    }

    /**
     * Load referrer of collectionList by the set-upper of referrer. <br />
     * COLLECTION by BOOK_ID, named 'collectionList'.
     * <pre>
     * bookBhv.<span style="color: #DD4747">loadCollectionList</span>(bookList, new ConditionBeanSetupper&lt;LdCollectionCB&gt;() {
     *     public void setup(LdCollectionCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...();
     *     }
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedList(referrerList -&gt {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = book.<span style="color: #DD4747">getCollectionList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setBookId_InScope(pkList);
     * cb.query().addOrderBy_BookId_Asc();
     * </pre>
     * @param book The entity of book. (NotNull)
     * @param setupper The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoader<LdCollection> loadCollectionList(LdBook book, ConditionBeanSetupper<LdCollectionCB> setupper) {
        xassLRArg(book, setupper);
        return doLoadCollectionList(xnewLRLs(book), new LoadReferrerOption<LdCollectionCB, LdCollection>().xinit(setupper));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param book The entity of book. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoader<LdCollection> loadCollectionList(LdBook book, LoadReferrerOption<LdCollectionCB, LdCollection> loadReferrerOption) {
        xassLRArg(book, loadReferrerOption);
        return loadCollectionList(xnewLRLs(book), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean setupper.} #beforejava8
     * @param bookList The entity list of book. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerLoader<LdCollection> loadCollectionList(List<LdBook> bookList, LoadReferrerOption<LdCollectionCB, LdCollection> loadReferrerOption) {
        xassLRArg(bookList, loadReferrerOption);
        if (bookList.isEmpty()) { return (NestedReferrerLoader<LdCollection>)EMPTY_LOADER; }
        return doLoadCollectionList(bookList, loadReferrerOption);
    }

    protected NestedReferrerLoader<LdCollection> doLoadCollectionList(List<LdBook> bookList, LoadReferrerOption<LdCollectionCB, LdCollection> option) {
        final LdCollectionBhv referrerBhv = xgetBSFLR().select(LdCollectionBhv.class);
        return helpLoadReferrerInternally(bookList, option, new InternalLoadReferrerCallback<LdBook, Integer, LdCollectionCB, LdCollection>() {
            public Integer getPKVal(LdBook et)
            { return et.getBookId(); }
            public void setRfLs(LdBook et, List<LdCollection> ls)
            { et.setCollectionList(ls); }
            public LdCollectionCB newMyCB() { return referrerBhv.newMyConditionBean(); }
            public void qyFKIn(LdCollectionCB cb, List<Integer> ls)
            { cb.query().setBookId_InScope(ls); }
            public void qyOdFKAsc(LdCollectionCB cb) { cb.query().addOrderBy_BookId_Asc(); }
            public void spFKCol(LdCollectionCB cb) { cb.specify().columnBookId(); }
            public List<LdCollection> selRfLs(LdCollectionCB cb) { return referrerBhv.selectList(cb); }
            public Integer getFKVal(LdCollection re) { return re.getBookId(); }
            public void setlcEt(LdCollection re, LdBook le)
            { re.setBook(le); }
            public String getRfPrNm() { return "collectionList"; }
        });
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'LdAuthor'.
     * @param bookList The list of book. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<LdAuthor> pulloutAuthor(List<LdBook> bookList) {
        return helpPulloutInternally(bookList, new InternalPulloutCallback<LdBook, LdAuthor>() {
            public LdAuthor getFr(LdBook et) { return et.getAuthor(); }
            public boolean hasRf() { return true; }
            public void setRfLs(LdAuthor et, List<LdBook> ls)
            { et.setBookList(ls); }
        });
    }
    /**
     * Pull out the list of foreign table 'LdGenre'.
     * @param bookList The list of book. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<LdGenre> pulloutGenre(List<LdBook> bookList) {
        return helpPulloutInternally(bookList, new InternalPulloutCallback<LdBook, LdGenre>() {
            public LdGenre getFr(LdBook et) { return et.getGenre(); }
            public boolean hasRf() { return true; }
            public void setRfLs(LdGenre et, List<LdBook> ls)
            { et.setBookList(ls); }
        });
    }
    /**
     * Pull out the list of foreign table 'LdPublisher'.
     * @param bookList The list of book. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<LdPublisher> pulloutPublisher(List<LdBook> bookList) {
        return helpPulloutInternally(bookList, new InternalPulloutCallback<LdBook, LdPublisher>() {
            public LdPublisher getFr(LdBook et) { return et.getPublisher(); }
            public boolean hasRf() { return true; }
            public void setRfLs(LdPublisher et, List<LdBook> ls)
            { et.setBookList(ls); }
        });
    }
    /**
     * Pull out the list of foreign table 'LdCollectionStatusLookup'.
     * @param bookList The list of book. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<LdCollectionStatusLookup> pulloutCollectionStatusLookupAsNonExist(List<LdBook> bookList) {
        return helpPulloutInternally(bookList, new InternalPulloutCallback<LdBook, LdCollectionStatusLookup>() {
            public LdCollectionStatusLookup getFr(LdBook et) { return et.getCollectionStatusLookupAsNonExist(); }
            public boolean hasRf() { return false; }
            public void setRfLs(LdCollectionStatusLookup et, List<LdBook> ls)
            { throw new UnsupportedOperationException(); }
        });
    }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key bookId.
     * @param bookList The list of book. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Integer> extractBookIdList(List<LdBook> bookList) {
        return helpExtractListInternally(bookList, new InternalExtractCallback<LdBook, Integer>() {
            public Integer getCV(LdBook et) { return et.getBookId(); }
        });
    }

    /**
     * Extract the value list of (single) unique key isbn.
     * @param bookList The list of book. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<String> extractIsbnList(List<LdBook> bookList) {
        return helpExtractListInternally(bookList, new InternalExtractCallback<LdBook, String>() {
            public String getCV(LdBook et) { return et.getIsbn(); }
        });
    }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * LdBook book = new LdBook();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * book.setFoo...(value);
     * book.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//book.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//book.set...;</span>
     * bookBhv.<span style="color: #DD4747">insert</span>(book);
     * ... = book.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param book The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(LdBook book) {
        doInsert(book, null);
    }

    protected void doInsert(LdBook book, InsertOption<LdBookCB> op) {
        assertObjectNotNull("book", book);
        prepareInsertOption(op);
        delegateInsert(book, op);
    }

    protected void prepareInsertOption(InsertOption<LdBookCB> op) {
        if (op == null) { return; }
        assertInsertOptionStatus(op);
        if (op.hasSpecifiedInsertColumn()) {
            op.resolveInsertColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    @Override
    protected void doCreate(Entity et, InsertOption<? extends ConditionBean> op) {
        if (op == null) { insert(downcast(et)); }
        else { varyingInsert(downcast(et), downcast(op)); }
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, ExclusiveControl)
     * <pre>
     * LdBook book = new LdBook();
     * book.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * book.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//book.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//book.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * book.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     bookBhv.<span style="color: #DD4747">update</span>(book);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param book The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(final LdBook book) {
        doUpdate(book, null);
    }

    protected void doUpdate(LdBook book, final UpdateOption<LdBookCB> op) {
        assertObjectNotNull("book", book);
        prepareUpdateOption(op);
        helpUpdateInternally(book, new InternalUpdateCallback<LdBook>() {
            public int callbackDelegateUpdate(LdBook et) { return delegateUpdate(et, op); } });
    }

    protected void prepareUpdateOption(UpdateOption<LdBookCB> op) {
        if (op == null) { return; }
        assertUpdateOptionStatus(op);
        if (op.hasSelfSpecification()) {
            op.resolveSelfSpecification(createCBForVaryingUpdate());
        }
        if (op.hasSpecifiedUpdateColumn()) {
            op.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    protected LdBookCB createCBForVaryingUpdate() {
        LdBookCB cb = newMyConditionBean();
        cb.xsetupForVaryingUpdate();
        return cb;
    }

    protected LdBookCB createCBForSpecifiedUpdate() {
        LdBookCB cb = newMyConditionBean();
        cb.xsetupForSpecifiedUpdate();
        return cb;
    }

    @Override
    protected void doModify(Entity et, UpdateOption<? extends ConditionBean> op) {
        if (op == null) { update(downcast(et)); }
        else { varyingUpdate(downcast(et), downcast(op)); }
    }

    /**
     * Update the entity non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * LdBook book = new LdBook();
     * book.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * book.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//book.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//book.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//book.setVersionNo(value);</span>
     * bookBhv.<span style="color: #DD4747">updateNonstrict</span>(book);
     * </pre>
     * @param book The entity of update target. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void updateNonstrict(final LdBook book) {
        doUpdateNonstrict(book, null);
    }

    protected void doUpdateNonstrict(LdBook book, final UpdateOption<LdBookCB> op) {
        assertObjectNotNull("book", book);
        prepareUpdateOption(op);
        helpUpdateNonstrictInternally(book, new InternalUpdateNonstrictCallback<LdBook>() {
            public int callbackDelegateUpdateNonstrict(LdBook et) { return delegateUpdateNonstrict(et, op); } });
    }

    @Override
    protected void doModifyNonstrict(Entity et, UpdateOption<? extends ConditionBean> op) {
        if (op == null) { updateNonstrict(downcast(et)); }
        else { varyingUpdateNonstrict(downcast(et), downcast(op)); }
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, ExclusiveControl) <br />
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br />
     * <p><span style="color: #DD4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param book The entity of insert or update target. (NotNull)
     * @exception EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(LdBook book) {
        doInesrtOrUpdate(book, null, null);
    }

    protected void doInesrtOrUpdate(LdBook book, final InsertOption<LdBookCB> iop, final UpdateOption<LdBookCB> uop) {
        helpInsertOrUpdateInternally(book, new InternalInsertOrUpdateCallback<LdBook, LdBookCB>() {
            public void callbackInsert(LdBook et) { doInsert(et, iop); }
            public void callbackUpdate(LdBook et) { doUpdate(et, uop); }
            public LdBookCB callbackNewMyConditionBean() { return newMyConditionBean(); }
            public int callbackSelectCount(LdBookCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrModify(Entity et, InsertOption<? extends ConditionBean> iop, UpdateOption<? extends ConditionBean> uop) {
        if (iop == null && uop == null) { insertOrUpdate(downcast(et)); }
        else {
            iop = iop != null ? iop : new InsertOption<LdBookCB>();
            uop = uop != null ? uop : new UpdateOption<LdBookCB>();
            varyingInsertOrUpdate(downcast(et), downcast(iop), downcast(uop));
        }
    }

    /**
     * Insert or update the entity non-strictly modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br />
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() }
     * <p><span style="color: #DD4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param book The entity of insert or update target. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdateNonstrict(LdBook book) {
        doInesrtOrUpdateNonstrict(book, null, null);
    }

    protected void doInesrtOrUpdateNonstrict(LdBook book, final InsertOption<LdBookCB> iop, final UpdateOption<LdBookCB> uop) {
        helpInsertOrUpdateInternally(book, new InternalInsertOrUpdateNonstrictCallback<LdBook>() {
            public void callbackInsert(LdBook et) { doInsert(et, iop); }
            public void callbackUpdateNonstrict(LdBook et) { doUpdateNonstrict(et, uop); }
        });
    }

    @Override
    protected void doCreateOrModifyNonstrict(Entity et, InsertOption<? extends ConditionBean> iop, UpdateOption<? extends ConditionBean> uop) {
        if (iop == null && uop == null) { insertOrUpdateNonstrict(downcast(et)); }
        else {
            iop = iop != null ? iop : new InsertOption<LdBookCB>();
            uop = uop != null ? uop : new UpdateOption<LdBookCB>();
            varyingInsertOrUpdateNonstrict(downcast(et), downcast(iop), downcast(uop));
        }
    }

    /**
     * Delete the entity. (ZeroUpdateException, ExclusiveControl)
     * <pre>
     * LdBook book = new LdBook();
     * book.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * book.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     bookBhv.<span style="color: #DD4747">delete</span>(book);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param book The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(LdBook book) {
        doDelete(book, null);
    }

    protected void doDelete(LdBook book, final DeleteOption<LdBookCB> op) {
        assertObjectNotNull("book", book);
        prepareDeleteOption(op);
        helpDeleteInternally(book, new InternalDeleteCallback<LdBook>() {
            public int callbackDelegateDelete(LdBook et) { return delegateDelete(et, op); } });
    }

    protected void prepareDeleteOption(DeleteOption<LdBookCB> op) {
        if (op == null) { return; }
        assertDeleteOptionStatus(op);
    }

    @Override
    protected void doRemove(Entity et, DeleteOption<? extends ConditionBean> op) {
        if (op == null) { delete(downcast(et)); }
        else { varyingDelete(downcast(et), downcast(op)); }
    }

    /**
     * Delete the entity non-strictly. {ZeroUpdateException, NonExclusiveControl}
     * <pre>
     * LdBook book = new LdBook();
     * book.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//book.setVersionNo(value);</span>
     * bookBhv.<span style="color: #DD4747">deleteNonstrict</span>(book);
     * </pre>
     * @param book The entity of delete target. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrict(LdBook book) {
        doDeleteNonstrict(book, null);
    }

    protected void doDeleteNonstrict(LdBook book, final DeleteOption<LdBookCB> op) {
        assertObjectNotNull("book", book);
        prepareDeleteOption(op);
        helpDeleteNonstrictInternally(book, new InternalDeleteNonstrictCallback<LdBook>() {
            public int callbackDelegateDeleteNonstrict(LdBook et) { return delegateDeleteNonstrict(et, op); } });
    }

    /**
     * Delete the entity non-strictly ignoring deleted. {ZeroUpdateException, NonExclusiveControl}
     * <pre>
     * LdBook book = new LdBook();
     * book.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//book.setVersionNo(value);</span>
     * bookBhv.<span style="color: #DD4747">deleteNonstrictIgnoreDeleted</span>(book);
     * <span style="color: #3F7E5E">// if the target entity doesn't exist, no exception</span>
     * </pre>
     * @param book The entity of delete target. (NotNull, PrimaryKeyNotNull)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrictIgnoreDeleted(LdBook book) {
        doDeleteNonstrictIgnoreDeleted(book, null);
    }

    protected void doDeleteNonstrictIgnoreDeleted(LdBook book, final DeleteOption<LdBookCB> op) {
        assertObjectNotNull("book", book);
        prepareDeleteOption(op);
        helpDeleteNonstrictIgnoreDeletedInternally(book, new InternalDeleteNonstrictIgnoreDeletedCallback<LdBook>() {
            public int callbackDelegateDeleteNonstrict(LdBook et) { return delegateDeleteNonstrict(et, op); } });
    }

    @Override
    protected void doRemoveNonstrict(Entity et, DeleteOption<? extends ConditionBean> op) {
        if (op == null) { deleteNonstrict(downcast(et)); }
        else { varyingDeleteNonstrict(downcast(et), downcast(op)); }
    }

    // ===================================================================================
    //                                                                        Batch Update
    //                                                                        ============
    /**
     * Batch-insert the entity list modified-only of same-set columns. (DefaultConstraintsEnabled) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <p><span style="color: #DD4747; font-size: 120%">The columns of least common multiple are registered like this:</span></p>
     * <pre>
     * for (... : ...) {
     *     LdBook book = new LdBook();
     *     book.setFooName("foo");
     *     if (...) {
     *         book.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     bookList.add(book);
     * }
     * bookBhv.<span style="color: #DD4747">batchInsert</span>(bookList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param bookList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<LdBook> bookList) {
        InsertOption<LdBookCB> op = createInsertUpdateOption();
        return doBatchInsert(bookList, op);
    }

    protected int[] doBatchInsert(List<LdBook> bookList, InsertOption<LdBookCB> op) {
        assertObjectNotNull("bookList", bookList);
        prepareBatchInsertOption(bookList, op);
        return delegateBatchInsert(bookList, op);
    }

    protected void prepareBatchInsertOption(List<LdBook> bookList, InsertOption<LdBookCB> op) {
        op.xallowInsertColumnModifiedPropertiesFragmented();
        op.xacceptInsertColumnModifiedPropertiesIfNeeds(bookList);
        prepareInsertOption(op);
    }

    @Override
    protected int[] doLumpCreate(List<Entity> ls, InsertOption<? extends ConditionBean> op) {
        if (op == null) { return batchInsert(downcast(ls)); }
        else { return varyingBatchInsert(downcast(ls), downcast(op)); }
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (ExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <span style="color: #DD4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     LdBook book = new LdBook();
     *     book.setFooName("foo");
     *     if (...) {
     *         book.setFooPrice(123);
     *     } else {
     *         book.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//book.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     bookList.add(book);
     * }
     * bookBhv.<span style="color: #DD4747">batchUpdate</span>(bookList);
     * </pre>
     * @param bookList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<LdBook> bookList) {
        UpdateOption<LdBookCB> op = createPlainUpdateOption();
        return doBatchUpdate(bookList, op);
    }

    protected int[] doBatchUpdate(List<LdBook> bookList, UpdateOption<LdBookCB> op) {
        assertObjectNotNull("bookList", bookList);
        prepareBatchUpdateOption(bookList, op);
        return delegateBatchUpdate(bookList, op);
    }

    protected void prepareBatchUpdateOption(List<LdBook> bookList, UpdateOption<LdBookCB> op) {
        op.xacceptUpdateColumnModifiedPropertiesIfNeeds(bookList);
        prepareUpdateOption(op);
    }

    @Override
    protected int[] doLumpModify(List<Entity> ls, UpdateOption<? extends ConditionBean> op) {
        if (op == null) { return batchUpdate(downcast(ls)); }
        else { return varyingBatchUpdate(downcast(ls), downcast(op)); }
    }

    /**
     * Batch-update the entity list specified-only. (ExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * bookBhv.<span style="color: #DD4747">batchUpdate</span>(bookList, new SpecifyQuery<LdBookCB>() {
     *     public void specify(LdBookCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #DD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #DD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * bookBhv.<span style="color: #DD4747">batchUpdate</span>(bookList, new SpecifyQuery<LdBookCB>() {
     *     public void specify(LdBookCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #DD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param bookList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<LdBook> bookList, SpecifyQuery<LdBookCB> updateColumnSpec) {
        return doBatchUpdate(bookList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    /**
     * Batch-update the entity list non-strictly modified-only of same-set columns. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <span style="color: #DD4747; font-size: 140%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     LdBook book = new LdBook();
     *     book.setFooName("foo");
     *     if (...) {
     *         book.setFooPrice(123);
     *     } else {
     *         book.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//book.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     bookList.add(book);
     * }
     * bookBhv.<span style="color: #DD4747">batchUpdate</span>(bookList);
     * </pre>
     * @param bookList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<LdBook> bookList) {
        UpdateOption<LdBookCB> option = createPlainUpdateOption();
        return doBatchUpdateNonstrict(bookList, option);
    }

    protected int[] doBatchUpdateNonstrict(List<LdBook> bookList, UpdateOption<LdBookCB> op) {
        assertObjectNotNull("bookList", bookList);
        prepareBatchUpdateOption(bookList, op);
        return delegateBatchUpdateNonstrict(bookList, op);
    }

    /**
     * Batch-update the entity list non-strictly specified-only. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * bookBhv.<span style="color: #DD4747">batchUpdateNonstrict</span>(bookList, new SpecifyQuery<LdBookCB>() {
     *     public void specify(LdBookCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #DD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #DD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * bookBhv.<span style="color: #DD4747">batchUpdateNonstrict</span>(bookList, new SpecifyQuery<LdBookCB>() {
     *     public void specify(LdBookCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #DD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).</p>
     * @param bookList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<LdBook> bookList, SpecifyQuery<LdBookCB> updateColumnSpec) {
        return doBatchUpdateNonstrict(bookList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> op) {
        if (op == null) { return batchUpdateNonstrict(downcast(ls)); }
        else { return varyingBatchUpdateNonstrict(downcast(ls), downcast(op)); }
    }

    /**
     * Batch-delete the entity list. (ExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param bookList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchDelete(List<LdBook> bookList) {
        return doBatchDelete(bookList, null);
    }

    protected int[] doBatchDelete(List<LdBook> bookList, DeleteOption<LdBookCB> op) {
        assertObjectNotNull("bookList", bookList);
        prepareDeleteOption(op);
        return delegateBatchDelete(bookList, op);
    }

    @Override
    protected int[] doLumpRemove(List<Entity> ls, DeleteOption<? extends ConditionBean> op) {
        if (op == null) { return batchDelete(downcast(ls)); }
        else { return varyingBatchDelete(downcast(ls), downcast(op)); }
    }

    /**
     * Batch-delete the entity list non-strictly. {NonExclusiveControl} <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param bookList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDeleteNonstrict(List<LdBook> bookList) {
        return doBatchDeleteNonstrict(bookList, null);
    }

    protected int[] doBatchDeleteNonstrict(List<LdBook> bookList, DeleteOption<LdBookCB> op) {
        assertObjectNotNull("bookList", bookList);
        prepareDeleteOption(op);
        return delegateBatchDeleteNonstrict(bookList, op);
    }

    @Override
    protected int[] doLumpRemoveNonstrict(List<Entity> ls, DeleteOption<? extends ConditionBean> op) {
        if (op == null) { return batchDeleteNonstrict(downcast(ls)); }
        else { return varyingBatchDeleteNonstrict(downcast(ls), downcast(op)); }
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * bookBhv.<span style="color: #DD4747">queryInsert</span>(new QueryInsertSetupper&lt;LdBook, LdBookCB&gt;() {
     *     public ConditionBean setup(book entity, LdBookCB intoCB) {
     *         FooCB cb = FooCB();
     *         cb.setupSelect_Bar();
     *
     *         <span style="color: #3F7E5E">// mapping</span>
     *         intoCB.specify().columnMyName().mappedFrom(cb.specify().columnFooName());
     *         intoCB.specify().columnMyCount().mappedFrom(cb.specify().columnFooCount());
     *         intoCB.specify().columnMyDate().mappedFrom(cb.specify().specifyBar().columnBarDate());
     *         entity.setMyFixedValue("foo"); <span style="color: #3F7E5E">// fixed value</span>
     *         <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     *         <span style="color: #3F7E5E">//entity.setRegisterUser(value);</span>
     *         <span style="color: #3F7E5E">//entity.set...;</span>
     *         <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     *         <span style="color: #3F7E5E">//entity.setVersionNo(value);</span>
     *
     *         return cb;
     *     }
     * });
     * </pre>
     * @param setupper The setup-per of query-insert. (NotNull)
     * @return The inserted count.
     */
    public int queryInsert(QueryInsertSetupper<LdBook, LdBookCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(QueryInsertSetupper<LdBook, LdBookCB> sp, InsertOption<LdBookCB> op) {
        assertObjectNotNull("setupper", sp);
        prepareInsertOption(op);
        LdBook e = new LdBook();
        LdBookCB cb = createCBForQueryInsert();
        return delegateQueryInsert(e, cb, sp.setup(e, cb), op);
    }

    protected LdBookCB createCBForQueryInsert() {
        LdBookCB cb = newMyConditionBean();
        cb.xsetupForQueryInsert();
        return cb;
    }

    @Override
    protected int doRangeCreate(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> setupper, InsertOption<? extends ConditionBean> option) {
        if (option == null) { return queryInsert(downcast(setupper)); }
        else { return varyingQueryInsert(downcast(setupper), downcast(option)); }
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * LdBook book = new LdBook();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//book.setPK...(value);</span>
     * book.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//book.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//book.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//book.setVersionNo(value);</span>
     * LdBookCB cb = new LdBookCB();
     * cb.query().setFoo...(value);
     * bookBhv.<span style="color: #DD4747">queryUpdate</span>(book, cb);
     * </pre>
     * @param book The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of LdBook. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(LdBook book, LdBookCB cb) {
        return doQueryUpdate(book, cb, null);
    }

    protected int doQueryUpdate(LdBook book, LdBookCB cb, UpdateOption<LdBookCB> op) {
        assertObjectNotNull("book", book); assertCBStateValid(cb);
        prepareUpdateOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryUpdate(book, cb, op) : 0;
    }

    @Override
    protected int doRangeModify(Entity et, ConditionBean cb, UpdateOption<? extends ConditionBean> op) {
        if (op == null) { return queryUpdate(downcast(et), (LdBookCB)cb); }
        else { return varyingQueryUpdate(downcast(et), (LdBookCB)cb, downcast(op)); }
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * LdBookCB cb = new LdBookCB();
     * cb.query().setFoo...(value);
     * bookBhv.<span style="color: #DD4747">queryDelete</span>(book, cb);
     * </pre>
     * @param cb The condition-bean of LdBook. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(LdBookCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(LdBookCB cb, DeleteOption<LdBookCB> op) {
        assertCBStateValid(cb);
        prepareDeleteOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryDelete(cb, op) : 0;
    }

    @Override
    protected int doRangeRemove(ConditionBean cb, DeleteOption<? extends ConditionBean> op) {
        if (op == null) { return queryDelete((LdBookCB)cb); }
        else { return varyingQueryDelete((LdBookCB)cb, downcast(op)); }
    }

    // ===================================================================================
    //                                                                      Varying Update
    //                                                                      ==============
    // -----------------------------------------------------
    //                                         Entity Update
    //                                         -------------
    /**
     * Insert the entity with varying requests. <br />
     * For example, disableCommonColumnAutoSetup(), disablePrimaryKeyIdentity(). <br />
     * Other specifications are same as insert(entity).
     * <pre>
     * LdBook book = new LdBook();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * book.setFoo...(value);
     * book.setBar...(value);
     * InsertOption<LdBookCB> option = new InsertOption<LdBookCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * bookBhv.<span style="color: #DD4747">varyingInsert</span>(book, option);
     * ... = book.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param book The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(LdBook book, InsertOption<LdBookCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(book, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, ExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * LdBook book = new LdBook();
     * book.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * book.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * book.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;LdBookCB&gt; option = new UpdateOption&lt;LdBookCB&gt;();
     *     option.self(new SpecifyQuery&lt;LdBookCB&gt;() {
     *         public void specify(LdBookCB cb) {
     *             cb.specify().<span style="color: #DD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     bookBhv.<span style="color: #DD4747">varyingUpdate</span>(book, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param book The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(LdBook book, UpdateOption<LdBookCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(book, option);
    }

    /**
     * Update the entity with varying requests non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as updateNonstrict(entity).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * LdBook book = new LdBook();
     * book.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * book.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//book.setVersionNo(value);</span>
     * UpdateOption&lt;LdBookCB&gt; option = new UpdateOption&lt;LdBookCB&gt;();
     * option.self(new SpecifyQuery&lt;LdBookCB&gt;() {
     *     public void specify(LdBookCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * bookBhv.<span style="color: #DD4747">varyingUpdateNonstrict</span>(book, option);
     * </pre>
     * @param book The entity of update target. (NotNull, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdateNonstrict(LdBook book, UpdateOption<LdBookCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdateNonstrict(book, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param book The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(LdBook book, InsertOption<LdBookCB> insertOption, UpdateOption<LdBookCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdate(book, insertOption, updateOption);
    }

    /**
     * Insert or update the entity with varying requests non-strictly. (NonExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdateNonstrict(entity).
     * @param book The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdateNonstrict(LdBook book, InsertOption<LdBookCB> insertOption, UpdateOption<LdBookCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdateNonstrict(book, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, ExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param book The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(LdBook book, DeleteOption<LdBookCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(book, option);
    }

    /**
     * Delete the entity with varying requests non-strictly. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as deleteNonstrict(entity).
     * @param book The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDeleteNonstrict(LdBook book, DeleteOption<LdBookCB> option) {
        assertDeleteOptionNotNull(option);
        doDeleteNonstrict(book, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param bookList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<LdBook> bookList, InsertOption<LdBookCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(bookList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param bookList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<LdBook> bookList, UpdateOption<LdBookCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(bookList, option);
    }

    /**
     * Batch-update the list with varying requests non-strictly. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param bookList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdateNonstrict(List<LdBook> bookList, UpdateOption<LdBookCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdateNonstrict(bookList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param bookList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<LdBook> bookList, DeleteOption<LdBookCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(bookList, option);
    }

    /**
     * Batch-delete the list with varying requests non-strictly. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDeleteNonstrict(entityList).
     * @param bookList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDeleteNonstrict(List<LdBook> bookList, DeleteOption<LdBookCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDeleteNonstrict(bookList, option);
    }

    // -----------------------------------------------------
    //                                          Query Update
    //                                          ------------
    /**
     * Insert the several entities by query with varying requests (modified-only for fixed value). <br />
     * For example, disableCommonColumnAutoSetup(), disablePrimaryKeyIdentity(). <br />
     * Other specifications are same as queryInsert(entity, setupper).
     * @param setupper The setup-per of query-insert. (NotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The inserted count.
     */
    public int varyingQueryInsert(QueryInsertSetupper<LdBook, LdBookCB> setupper, InsertOption<LdBookCB> option) {
        assertInsertOptionNotNull(option);
        return doQueryInsert(setupper, option);
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br />
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * LdBook book = new LdBook();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//book.setPK...(value);</span>
     * book.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//book.setVersionNo(value);</span>
     * LdBookCB cb = new LdBookCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;LdBookCB&gt; option = new UpdateOption&lt;LdBookCB&gt;();
     * option.self(new SpecifyQuery&lt;LdBookCB&gt;() {
     *     public void specify(LdBookCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * bookBhv.<span style="color: #DD4747">varyingQueryUpdate</span>(book, cb, option);
     * </pre>
     * @param book The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of LdBook. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(LdBook book, LdBookCB cb, UpdateOption<LdBookCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(book, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of LdBook. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(LdBookCB cb, DeleteOption<LdBookCB> option) {
        assertDeleteOptionNotNull(option);
        return doQueryDelete(cb, option);
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the basic executor of outside-SQL to execute it. <br />
     * The invoker of behavior command should be not null when you call this method.
     * <pre>
     * You can use the methods for outside-SQL are as follows:
     * {Basic}
     *   o selectList()
     *   o execute()
     *   o call()
     *
     * {Entity}
     *   o entityHandling().selectEntity()
     *   o entityHandling().selectEntityWithDeletedCheck()
     *
     * {Paging}
     *   o autoPaging().selectList()
     *   o autoPaging().selectPage()
     *   o manualPaging().selectList()
     *   o manualPaging().selectPage()
     *
     * {Cursor}
     *   o cursorHandling().selectCursor()
     *
     * {Option}
     *   o dynamicBinding().selectList()
     *   o removeBlockComment().selectList()
     *   o removeLineComment().selectList()
     *   o formatSql().selectList()
     * </pre>
     * @return The basic executor of outside-SQL. (NotNull)
     */
    public OutsideSqlBasicExecutor<LdBookBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCountUniquely(LdBookCB cb) { return invoke(createSelectCountCBCommand(cb, true)); }
    protected int delegateSelectCountPlainly(LdBookCB cb) { return invoke(createSelectCountCBCommand(cb, false)); }
    protected <ENTITY extends LdBook> void delegateSelectCursor(LdBookCB cb, EntityRowHandler<ENTITY> rh, Class<ENTITY> tp)
    { invoke(createSelectCursorCBCommand(cb, rh, tp)); }
    protected <ENTITY extends LdBook> List<ENTITY> delegateSelectList(LdBookCB cb, Class<ENTITY> tp)
    { return invoke(createSelectListCBCommand(cb, tp)); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(LdBook et, InsertOption<LdBookCB> op)
    { if (!processBeforeInsert(et, op)) { return 0; }
      return invoke(createInsertEntityCommand(et, op)); }
    protected int delegateUpdate(LdBook et, UpdateOption<LdBookCB> op)
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return invoke(createUpdateEntityCommand(et, op)); }
    protected int delegateUpdateNonstrict(LdBook et, UpdateOption<LdBookCB> op)
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return invoke(createUpdateNonstrictEntityCommand(et, op)); }
    protected int delegateDelete(LdBook et, DeleteOption<LdBookCB> op)
    { if (!processBeforeDelete(et, op)) { return 0; }
      return invoke(createDeleteEntityCommand(et, op)); }
    protected int delegateDeleteNonstrict(LdBook et, DeleteOption<LdBookCB> op)
    { if (!processBeforeDelete(et, op)) { return 0; }
      return invoke(createDeleteNonstrictEntityCommand(et, op)); }

    protected int[] delegateBatchInsert(List<LdBook> ls, InsertOption<LdBookCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchInsertCommand(processBatchInternally(ls, op), op)); }
    protected int[] delegateBatchUpdate(List<LdBook> ls, UpdateOption<LdBookCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateCommand(processBatchInternally(ls, op, false), op)); }
    protected int[] delegateBatchUpdateNonstrict(List<LdBook> ls, UpdateOption<LdBookCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateNonstrictCommand(processBatchInternally(ls, op, true), op)); }
    protected int[] delegateBatchDelete(List<LdBook> ls, DeleteOption<LdBookCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteCommand(processBatchInternally(ls, op, false), op)); }
    protected int[] delegateBatchDeleteNonstrict(List<LdBook> ls, DeleteOption<LdBookCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteNonstrictCommand(processBatchInternally(ls, op, true), op)); }

    protected int delegateQueryInsert(LdBook et, LdBookCB inCB, ConditionBean resCB, InsertOption<LdBookCB> op)
    { if (!processBeforeQueryInsert(et, inCB, resCB, op)) { return 0; } return invoke(createQueryInsertCBCommand(et, inCB, resCB, op));  }
    protected int delegateQueryUpdate(LdBook et, LdBookCB cb, UpdateOption<LdBookCB> op)
    { if (!processBeforeQueryUpdate(et, cb, op)) { return 0; } return invoke(createQueryUpdateCBCommand(et, cb, op));  }
    protected int delegateQueryDelete(LdBookCB cb, DeleteOption<LdBookCB> op)
    { if (!processBeforeQueryDelete(cb, op)) { return 0; } return invoke(createQueryDeleteCBCommand(cb, op));  }

    // ===================================================================================
    //                                                                     Filter Override
    //                                                                     ===============
    @Override
    protected void filterEntityOfInsert(Entity tgt, InsertOption<? extends ConditionBean> op) {
        super.filterEntityOfInsert(tgt, op);
        LdBook et = downcast(tgt);
        et.setRUser(org.seasar.dbflute.AccessContext.getAccessUserOnThread());
        et.setRTimestamp(org.seasar.dbflute.AccessContext.getAccessTimestampOnThread());
    }

    // ===================================================================================
    //                                                                Optimistic Lock Info
    //                                                                ====================
    /**
     * {@inheritDoc}
     */
    @Override
    protected boolean hasVersionNoValue(Entity et) {
        return false;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected boolean hasUpdateDateValue(Entity et) {
        return downcast(et).getUTimestamp() != null;
    }

    // ===================================================================================
    //                                                                     Downcast Helper
    //                                                                     ===============
    protected LdBook downcast(Entity et) {
        return helpEntityDowncastInternally(et, LdBook.class);
    }

    protected LdBookCB downcast(ConditionBean cb) {
        return helpConditionBeanDowncastInternally(cb, LdBookCB.class);
    }

    @SuppressWarnings("unchecked")
    protected List<LdBook> downcast(List<? extends Entity> ls) {
        return (List<LdBook>)ls;
    }

    @SuppressWarnings("unchecked")
    protected InsertOption<LdBookCB> downcast(InsertOption<? extends ConditionBean> op) {
        return (InsertOption<LdBookCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected UpdateOption<LdBookCB> downcast(UpdateOption<? extends ConditionBean> op) {
        return (UpdateOption<LdBookCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected DeleteOption<LdBookCB> downcast(DeleteOption<? extends ConditionBean> op) {
        return (DeleteOption<LdBookCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<LdBook, LdBookCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> sp) {
        return (QueryInsertSetupper<LdBook, LdBookCB>)sp;
    }
}
