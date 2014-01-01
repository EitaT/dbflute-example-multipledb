/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */package com.example.dbflute.multipledb.spring.dbflute.librarydb.bsbhv;

import java.util.List;

import org.seasar.dbflute.*;
import org.seasar.dbflute.bhv.*;
import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.dbmeta.DBMeta;
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
     * int count = bookBhv.<span style="color: #FD4747">selectCount</span>(cb);
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
     * Select the entity by the condition-bean.
     * <pre>
     * LdBookCB cb = new LdBookCB();
     * cb.query().setFoo...(value);
     * LdBook book = bookBhv.<span style="color: #FD4747">selectEntity</span>(cb);
     * if (book != null) {
     *     ... = book.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of LdBook. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public LdBook selectEntity(LdBookCB cb) {
        return doSelectEntity(cb, LdBook.class);
    }

    protected <ENTITY extends LdBook> ENTITY doSelectEntity(final LdBookCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityInternally(cb, entityType, new InternalSelectEntityCallback<ENTITY, LdBookCB>() {
            public List<ENTITY> callbackSelectList(LdBookCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); } });
    }

    @Override
    protected Entity doReadEntity(ConditionBean cb) {
        return selectEntity(downcast(cb));
    }

    /**
     * Select the entity by the condition-bean with deleted check.
     * <pre>
     * LdBookCB cb = new LdBookCB();
     * cb.query().setFoo...(value);
     * LdBook book = bookBhv.<span style="color: #FD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = book.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of LdBook. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public LdBook selectEntityWithDeletedCheck(LdBookCB cb) {
        return doSelectEntityWithDeletedCheck(cb, LdBook.class);
    }

    protected <ENTITY extends LdBook> ENTITY doSelectEntityWithDeletedCheck(final LdBookCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityWithDeletedCheckInternally(cb, entityType, new InternalSelectEntityWithDeletedCheckCallback<ENTITY, LdBookCB>() {
            public List<ENTITY> callbackSelectList(LdBookCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); } });
    }

    @Override
    protected Entity doReadEntityWithDeletedCheck(ConditionBean cb) {
        return selectEntityWithDeletedCheck(downcast(cb));
    }

    /**
     * Select the entity by the primary-key value.
     * @param bookId The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
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
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
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
     * ListResultBean&lt;LdBook&gt; bookList = bookBhv.<span style="color: #FD4747">selectList</span>(cb);
     * for (LdBook book : bookList) {
     *     ... = book.get...();
     * }
     * </pre>
     * @param cb The condition-bean of LdBook. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<LdBook> selectList(LdBookCB cb) {
        return doSelectList(cb, LdBook.class);
    }

    protected <ENTITY extends LdBook> ListResultBean<ENTITY> doSelectList(LdBookCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", entityType);
        assertSpecifyDerivedReferrerEntityProperty(cb, entityType);
        return helpSelectListInternally(cb, entityType, new InternalSelectListCallback<ENTITY, LdBookCB>() {
            public List<ENTITY> callbackSelectList(LdBookCB cb, Class<ENTITY> entityType) { return delegateSelectList(cb, entityType); } });
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
     * cb.<span style="color: #FD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;LdBook&gt; page = bookBhv.<span style="color: #FD4747">selectPage</span>(cb);
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
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<LdBook> selectPage(LdBookCB cb) {
        return doSelectPage(cb, LdBook.class);
    }

    protected <ENTITY extends LdBook> PagingResultBean<ENTITY> doSelectPage(LdBookCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", entityType);
        return helpSelectPageInternally(cb, entityType, new InternalSelectPageCallback<ENTITY, LdBookCB>() {
            public int callbackSelectCount(LdBookCB cb) { return doSelectCountPlainly(cb); }
            public List<ENTITY> callbackSelectList(LdBookCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); }
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
     * bookBhv.<span style="color: #FD4747">selectCursor</span>(cb, new EntityRowHandler&lt;LdBook&gt;() {
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

    protected <ENTITY extends LdBook> void doSelectCursor(LdBookCB cb, EntityRowHandler<ENTITY> entityRowHandler, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler<LdBook>", entityRowHandler); assertObjectNotNull("entityType", entityType);
        assertSpecifyDerivedReferrerEntityProperty(cb, entityType);
        helpSelectCursorInternally(cb, entityRowHandler, entityType, new InternalSelectCursorCallback<ENTITY, LdBookCB>() {
            public void callbackSelectCursor(LdBookCB cb, EntityRowHandler<ENTITY> entityRowHandler, Class<ENTITY> entityType) { delegateSelectCursor(cb, entityRowHandler, entityType); }
            public List<ENTITY> callbackSelectList(LdBookCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); }
        });
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * bookBhv.<span style="color: #FD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(LdBookCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
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

    protected <RESULT, CB extends LdBookCB> SLFunction<CB, RESULT> doScalarSelect(Class<RESULT> resultType, CB cb) {
        assertObjectNotNull("resultType", resultType); assertCBStateValid(cb);
        cb.xsetupForScalarSelect(); cb.getSqlClause().disableSelectIndex(); // for when you use union
        return createSLFunction(cb, resultType);
    }

    protected <RESULT, CB extends LdBookCB> SLFunction<CB, RESULT> createSLFunction(CB cb, Class<RESULT> resultType) {
        return new SLFunction<CB, RESULT>(cb, resultType);
    }

    protected <RESULT> SLFunction<? extends ConditionBean, RESULT> doReadScalar(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
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
     * {Refer to overload method that has an argument of the list of entity.}
     * @param book The entity of book. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     */
    public void loadCollectionList(LdBook book, ConditionBeanSetupper<LdCollectionCB> conditionBeanSetupper) {
        xassLRArg(book, conditionBeanSetupper);
        loadCollectionList(xnewLRLs(book), conditionBeanSetupper);
    }
    /**
     * Load referrer of collectionList with the set-upper for condition-bean of referrer. <br />
     * COLLECTION by BOOK_ID, named 'collectionList'.
     * <pre>
     * bookBhv.<span style="color: #FD4747">loadCollectionList</span>(bookList, new ConditionBeanSetupper&lt;LdCollectionCB&gt;() {
     *     public void setup(LdCollectionCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...(); <span style="color: #3F7E5E">// basically you should order referrer list</span>
     *     }
     * });
     * for (LdBook book : bookList) {
     *     ... = book.<span style="color: #FD4747">getCollectionList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key(and others too) is treated as case-insensitive. <br />
     * The condition-bean that the set-upper provides have settings before you touch it. It is as follows:
     * <pre>
     * cb.query().setBookId_InScope(pkList);
     * cb.query().addOrderBy_BookId_Asc();
     * </pre>
     * @param bookList The entity list of book. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     */
    public void loadCollectionList(List<LdBook> bookList, ConditionBeanSetupper<LdCollectionCB> conditionBeanSetupper) {
        xassLRArg(bookList, conditionBeanSetupper);
        loadCollectionList(bookList, new LoadReferrerOption<LdCollectionCB, LdCollection>().xinit(conditionBeanSetupper));
    }
    /**
     * {Refer to overload method that has an argument of the list of entity.}
     * @param book The entity of book. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadCollectionList(LdBook book, LoadReferrerOption<LdCollectionCB, LdCollection> loadReferrerOption) {
        xassLRArg(book, loadReferrerOption);
        loadCollectionList(xnewLRLs(book), loadReferrerOption);
    }
    /**
     * {Refer to overload method that has an argument of condition-bean setupper.}
     * @param bookList The entity list of book. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadCollectionList(List<LdBook> bookList, LoadReferrerOption<LdCollectionCB, LdCollection> loadReferrerOption) {
        xassLRArg(bookList, loadReferrerOption);
        if (bookList.isEmpty()) { return; }
        final LdCollectionBhv referrerBhv = xgetBSFLR().select(LdCollectionBhv.class);
        helpLoadReferrerInternally(bookList, loadReferrerOption, new InternalLoadReferrerCallback<LdBook, Integer, LdCollectionCB, LdCollection>() {
            public Integer getPKVal(LdBook e)
            { return e.getBookId(); }
            public void setRfLs(LdBook e, List<LdCollection> ls)
            { e.setCollectionList(ls); }
            public LdCollectionCB newMyCB() { return referrerBhv.newMyConditionBean(); }
            public void qyFKIn(LdCollectionCB cb, List<Integer> ls)
            { cb.query().setBookId_InScope(ls); }
            public void qyOdFKAsc(LdCollectionCB cb) { cb.query().addOrderBy_BookId_Asc(); }
            public void spFKCol(LdCollectionCB cb) { cb.specify().columnBookId(); }
            public List<LdCollection> selRfLs(LdCollectionCB cb) { return referrerBhv.selectList(cb); }
            public Integer getFKVal(LdCollection e) { return e.getBookId(); }
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
            public LdAuthor getFr(LdBook e) { return e.getAuthor(); }
            public boolean hasRf() { return true; }
            public void setRfLs(LdAuthor e, List<LdBook> ls)
            { e.setBookList(ls); }
        });
    }
    /**
     * Pull out the list of foreign table 'LdGenre'.
     * @param bookList The list of book. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<LdGenre> pulloutGenre(List<LdBook> bookList) {
        return helpPulloutInternally(bookList, new InternalPulloutCallback<LdBook, LdGenre>() {
            public LdGenre getFr(LdBook e) { return e.getGenre(); }
            public boolean hasRf() { return true; }
            public void setRfLs(LdGenre e, List<LdBook> ls)
            { e.setBookList(ls); }
        });
    }
    /**
     * Pull out the list of foreign table 'LdPublisher'.
     * @param bookList The list of book. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<LdPublisher> pulloutPublisher(List<LdBook> bookList) {
        return helpPulloutInternally(bookList, new InternalPulloutCallback<LdBook, LdPublisher>() {
            public LdPublisher getFr(LdBook e) { return e.getPublisher(); }
            public boolean hasRf() { return true; }
            public void setRfLs(LdPublisher e, List<LdBook> ls)
            { e.setBookList(ls); }
        });
    }
    /**
     * Pull out the list of foreign table 'LdCollectionStatusLookup'.
     * @param bookList The list of book. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<LdCollectionStatusLookup> pulloutCollectionStatusLookupAsNonExist(List<LdBook> bookList) {
        return helpPulloutInternally(bookList, new InternalPulloutCallback<LdBook, LdCollectionStatusLookup>() {
            public LdCollectionStatusLookup getFr(LdBook e) { return e.getCollectionStatusLookupAsNonExist(); }
            public boolean hasRf() { return false; }
            public void setRfLs(LdCollectionStatusLookup e, List<LdBook> ls)
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
            public Integer getCV(LdBook e) { return e.getBookId(); }
        });
    }

    /**
     * Extract the value list of (single) unique key isbn.
     * @param bookList The list of book. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<String> extractIsbnList(List<LdBook> bookList) {
        return helpExtractListInternally(bookList, new InternalExtractCallback<LdBook, String>() {
            public String getCV(LdBook e) { return e.getIsbn(); }
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
     * bookBhv.<span style="color: #FD4747">insert</span>(book);
     * ... = book.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param book The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(LdBook book) {
        doInsert(book, null);
    }

    protected void doInsert(LdBook book, InsertOption<LdBookCB> option) {
        assertObjectNotNull("book", book);
        prepareInsertOption(option);
        delegateInsert(book, option);
    }

    protected void prepareInsertOption(InsertOption<LdBookCB> option) {
        if (option == null) { return; }
        assertInsertOptionStatus(option);
        if (option.hasSpecifiedInsertColumn()) {
            option.resolveInsertColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    @Override
    protected void doCreate(Entity entity, InsertOption<? extends ConditionBean> option) {
        if (option == null) { insert(downcast(entity)); }
        else { varyingInsert(downcast(entity), downcast(option)); }
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
     * book.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     bookBhv.<span style="color: #FD4747">update</span>(book);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * } 
     * </pre>
     * @param book The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(final LdBook book) {
        doUpdate(book, null);
    }

    protected void doUpdate(LdBook book, final UpdateOption<LdBookCB> option) {
        assertObjectNotNull("book", book);
        prepareUpdateOption(option);
        helpUpdateInternally(book, new InternalUpdateCallback<LdBook>() {
            public int callbackDelegateUpdate(LdBook entity) { return delegateUpdate(entity, option); } });
    }

    protected void prepareUpdateOption(UpdateOption<LdBookCB> option) {
        if (option == null) { return; }
        assertUpdateOptionStatus(option);
        if (option.hasSelfSpecification()) {
            option.resolveSelfSpecification(createCBForVaryingUpdate());
        }
        if (option.hasSpecifiedUpdateColumn()) {
            option.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate());
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
    protected void doModify(Entity entity, UpdateOption<? extends ConditionBean> option) {
        if (option == null) { update(downcast(entity)); }
        else { varyingUpdate(downcast(entity), downcast(option)); }
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
     * bookBhv.<span style="color: #FD4747">updateNonstrict</span>(book);
     * </pre>
     * @param book The entity of update target. (NotNull, PrimaryKeyNotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void updateNonstrict(final LdBook book) {
        doUpdateNonstrict(book, null);
    }

    protected void doUpdateNonstrict(LdBook book, final UpdateOption<LdBookCB> option) {
        assertObjectNotNull("book", book);
        prepareUpdateOption(option);
        helpUpdateNonstrictInternally(book, new InternalUpdateNonstrictCallback<LdBook>() {
            public int callbackDelegateUpdateNonstrict(LdBook entity) { return delegateUpdateNonstrict(entity, option); } });
    }

    @Override
    protected void doModifyNonstrict(Entity entity, UpdateOption<? extends ConditionBean> option) {
        if (option == null) { updateNonstrict(downcast(entity)); }
        else { varyingUpdateNonstrict(downcast(entity), downcast(option)); }
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, ExclusiveControl) <br />
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br />
     * <p><span style="color: #FD4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param book The entity of insert or update target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(LdBook book) {
        doInesrtOrUpdate(book, null, null);
    }

    protected void doInesrtOrUpdate(LdBook book, final InsertOption<LdBookCB> insertOption, final UpdateOption<LdBookCB> updateOption) {
        helpInsertOrUpdateInternally(book, new InternalInsertOrUpdateCallback<LdBook, LdBookCB>() {
            public void callbackInsert(LdBook entity) { doInsert(entity, insertOption); }
            public void callbackUpdate(LdBook entity) { doUpdate(entity, updateOption); }
            public LdBookCB callbackNewMyConditionBean() { return newMyConditionBean(); }
            public int callbackSelectCount(LdBookCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrModify(Entity entity, InsertOption<? extends ConditionBean> insertOption,
            UpdateOption<? extends ConditionBean> updateOption) {
        if (insertOption == null && updateOption == null) { insertOrUpdate(downcast(entity)); }
        else {
            insertOption = insertOption == null ? new InsertOption<LdBookCB>() : insertOption;
            updateOption = updateOption == null ? new UpdateOption<LdBookCB>() : updateOption;
            varyingInsertOrUpdate(downcast(entity), downcast(insertOption), downcast(updateOption));
        }
    }

    /**
     * Insert or update the entity non-strictly modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br />
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() }
     * <p><span style="color: #FD4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param book The entity of insert or update target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdateNonstrict(LdBook book) {
        doInesrtOrUpdateNonstrict(book, null, null);
    }

    protected void doInesrtOrUpdateNonstrict(LdBook book, final InsertOption<LdBookCB> insertOption, final UpdateOption<LdBookCB> updateOption) {
        helpInsertOrUpdateInternally(book, new InternalInsertOrUpdateNonstrictCallback<LdBook>() {
            public void callbackInsert(LdBook entity) { doInsert(entity, insertOption); }
            public void callbackUpdateNonstrict(LdBook entity) { doUpdateNonstrict(entity, updateOption); }
        });
    }

    @Override
    protected void doCreateOrModifyNonstrict(Entity entity, InsertOption<? extends ConditionBean> insertOption,
            UpdateOption<? extends ConditionBean> updateOption) {
        if (insertOption == null && updateOption == null) { insertOrUpdateNonstrict(downcast(entity)); }
        else {
            insertOption = insertOption == null ? new InsertOption<LdBookCB>() : insertOption;
            updateOption = updateOption == null ? new UpdateOption<LdBookCB>() : updateOption;
            varyingInsertOrUpdateNonstrict(downcast(entity), downcast(insertOption), downcast(updateOption));
        }
    }

    /**
     * Delete the entity. (ZeroUpdateException, ExclusiveControl)
     * <pre>
     * LdBook book = new LdBook();
     * book.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * book.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     bookBhv.<span style="color: #FD4747">delete</span>(book);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * } 
     * </pre>
     * @param book The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(LdBook book) {
        doDelete(book, null);
    }

    protected void doDelete(LdBook book, final DeleteOption<LdBookCB> option) {
        assertObjectNotNull("book", book);
        prepareDeleteOption(option);
        helpDeleteInternally(book, new InternalDeleteCallback<LdBook>() {
            public int callbackDelegateDelete(LdBook entity) { return delegateDelete(entity, option); } });
    }

    protected void prepareDeleteOption(DeleteOption<LdBookCB> option) {
        if (option == null) { return; }
        assertDeleteOptionStatus(option);
    }

    @Override
    protected void doRemove(Entity entity, DeleteOption<? extends ConditionBean> option) {
        if (option == null) { delete(downcast(entity)); }
        else { varyingDelete(downcast(entity), downcast(option)); }
    }

    /**
     * Delete the entity non-strictly. {ZeroUpdateException, NonExclusiveControl}
     * <pre>
     * LdBook book = new LdBook();
     * book.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//book.setVersionNo(value);</span>
     * bookBhv.<span style="color: #FD4747">deleteNonstrict</span>(book);
     * </pre>
     * @param book The entity of delete target. (NotNull, PrimaryKeyNotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrict(LdBook book) {
        doDeleteNonstrict(book, null);
    }

    protected void doDeleteNonstrict(LdBook book, final DeleteOption<LdBookCB> option) {
        assertObjectNotNull("book", book);
        prepareDeleteOption(option);
        helpDeleteNonstrictInternally(book, new InternalDeleteNonstrictCallback<LdBook>() {
            public int callbackDelegateDeleteNonstrict(LdBook entity) { return delegateDeleteNonstrict(entity, option); } });
    }

    /**
     * Delete the entity non-strictly ignoring deleted. {ZeroUpdateException, NonExclusiveControl}
     * <pre>
     * LdBook book = new LdBook();
     * book.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//book.setVersionNo(value);</span>
     * bookBhv.<span style="color: #FD4747">deleteNonstrictIgnoreDeleted</span>(book);
     * <span style="color: #3F7E5E">// if the target entity doesn't exist, no exception</span>
     * </pre>
     * @param book The entity of delete target. (NotNull, PrimaryKeyNotNull)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrictIgnoreDeleted(LdBook book) {
        doDeleteNonstrictIgnoreDeleted(book, null);
    }

    protected void doDeleteNonstrictIgnoreDeleted(LdBook book, final DeleteOption<LdBookCB> option) {
        assertObjectNotNull("book", book);
        prepareDeleteOption(option);
        helpDeleteNonstrictIgnoreDeletedInternally(book, new InternalDeleteNonstrictIgnoreDeletedCallback<LdBook>() {
            public int callbackDelegateDeleteNonstrict(LdBook entity) { return delegateDeleteNonstrict(entity, option); } });
    }

    @Override
    protected void doRemoveNonstrict(Entity entity, DeleteOption<? extends ConditionBean> option) {
        if (option == null) { deleteNonstrict(downcast(entity)); }
        else { varyingDeleteNonstrict(downcast(entity), downcast(option)); }
    }

    // ===================================================================================
    //                                                                        Batch Update
    //                                                                        ============
    /**
     * Batch-insert the entity list modified-only of same-set columns. (DefaultConstraintsEnabled) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <p><span style="color: #FD4747; font-size: 120%">The columns of least common multiple are registered like this:</span></p>
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
     * bookBhv.<span style="color: #FD4747">batchInsert</span>(bookList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param bookList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<LdBook> bookList) {
        InsertOption<LdBookCB> option = createInsertUpdateOption();
        return doBatchInsert(bookList, option);
    }

    protected int[] doBatchInsert(List<LdBook> bookList, InsertOption<LdBookCB> option) {
        assertObjectNotNull("bookList", bookList);
        prepareBatchInsertOption(bookList, option);
        return delegateBatchInsert(bookList, option);
    }

    protected void prepareBatchInsertOption(List<LdBook> bookList, InsertOption<LdBookCB> option) {
        option.xallowInsertColumnModifiedPropertiesFragmented();
        option.xacceptInsertColumnModifiedPropertiesIfNeeds(bookList);
        prepareInsertOption(option);
    }

    @Override
    protected int[] doLumpCreate(List<Entity> ls, InsertOption<? extends ConditionBean> option) {
        if (option == null) { return batchInsert(downcast(ls)); }
        else { return varyingBatchInsert(downcast(ls), downcast(option)); }
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (ExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <span style="color: #FD4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
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
     * bookBhv.<span style="color: #FD4747">batchUpdate</span>(bookList);
     * </pre>
     * @param bookList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<LdBook> bookList) {
        UpdateOption<LdBookCB> option = createPlainUpdateOption();
        return doBatchUpdate(bookList, option);
    }

    protected int[] doBatchUpdate(List<LdBook> bookList, UpdateOption<LdBookCB> option) {
        assertObjectNotNull("bookList", bookList);
        prepareBatchUpdateOption(bookList, option);
        return delegateBatchUpdate(bookList, option);
    }

    protected void prepareBatchUpdateOption(List<LdBook> bookList, UpdateOption<LdBookCB> option) {
        option.xacceptUpdateColumnModifiedPropertiesIfNeeds(bookList);
        prepareUpdateOption(option);
    }

    @Override
    protected int[] doLumpModify(List<Entity> ls, UpdateOption<? extends ConditionBean> option) {
        if (option == null) { return batchUpdate(downcast(ls)); }
        else { return varyingBatchUpdate(downcast(ls), downcast(option)); }
    }

    /**
     * Batch-update the entity list specified-only. (ExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span> 
     * bookBhv.<span style="color: #FD4747">batchUpdate</span>(bookList, new SpecifyQuery<LdBookCB>() {
     *     public void specify(LdBookCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #FD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #FD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span> 
     * bookBhv.<span style="color: #FD4747">batchUpdate</span>(bookList, new SpecifyQuery<LdBookCB>() {
     *     public void specify(LdBookCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #FD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
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
     * @exception org.seasar.dbflute.exception.BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<LdBook> bookList, SpecifyQuery<LdBookCB> updateColumnSpec) {
        return doBatchUpdate(bookList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    /**
     * Batch-update the entity list non-strictly modified-only of same-set columns. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <span style="color: #FD4747; font-size: 140%">You should specify same-set columns to all entities like this:</span>
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
     * bookBhv.<span style="color: #FD4747">batchUpdate</span>(bookList);
     * </pre>
     * @param bookList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<LdBook> bookList) {
        UpdateOption<LdBookCB> option = createPlainUpdateOption();
        return doBatchUpdateNonstrict(bookList, option);
    }

    protected int[] doBatchUpdateNonstrict(List<LdBook> bookList, UpdateOption<LdBookCB> option) {
        assertObjectNotNull("bookList", bookList);
        prepareBatchUpdateOption(bookList, option);
        return delegateBatchUpdateNonstrict(bookList, option);
    }

    /**
     * Batch-update the entity list non-strictly specified-only. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span> 
     * bookBhv.<span style="color: #FD4747">batchUpdateNonstrict</span>(bookList, new SpecifyQuery<LdBookCB>() {
     *     public void specify(LdBookCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #FD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #FD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span> 
     * bookBhv.<span style="color: #FD4747">batchUpdateNonstrict</span>(bookList, new SpecifyQuery<LdBookCB>() {
     *     public void specify(LdBookCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #FD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
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
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<LdBook> bookList, SpecifyQuery<LdBookCB> updateColumnSpec) {
        return doBatchUpdateNonstrict(bookList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> option) {
        if (option == null) { return batchUpdateNonstrict(downcast(ls)); }
        else { return varyingBatchUpdateNonstrict(downcast(ls), downcast(option)); }
    }

    /**
     * Batch-delete the entity list. (ExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param bookList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchDelete(List<LdBook> bookList) {
        return doBatchDelete(bookList, null);
    }

    protected int[] doBatchDelete(List<LdBook> bookList, DeleteOption<LdBookCB> option) {
        assertObjectNotNull("bookList", bookList);
        prepareDeleteOption(option);
        return delegateBatchDelete(bookList, option);
    }

    @Override
    protected int[] doLumpRemove(List<Entity> ls, DeleteOption<? extends ConditionBean> option) {
        if (option == null) { return batchDelete(downcast(ls)); }
        else { return varyingBatchDelete(downcast(ls), downcast(option)); }
    }

    /**
     * Batch-delete the entity list non-strictly. {NonExclusiveControl} <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param bookList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDeleteNonstrict(List<LdBook> bookList) {
        return doBatchDeleteNonstrict(bookList, null);
    }

    protected int[] doBatchDeleteNonstrict(List<LdBook> bookList, DeleteOption<LdBookCB> option) {
        assertObjectNotNull("bookList", bookList);
        prepareDeleteOption(option);
        return delegateBatchDeleteNonstrict(bookList, option);
    }

    @Override
    protected int[] doLumpRemoveNonstrict(List<Entity> ls, DeleteOption<? extends ConditionBean> option) {
        if (option == null) { return batchDeleteNonstrict(downcast(ls)); }
        else { return varyingBatchDeleteNonstrict(downcast(ls), downcast(option)); }
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * bookBhv.<span style="color: #FD4747">queryInsert</span>(new QueryInsertSetupper&lt;LdBook, LdBookCB&gt;() {
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

    protected int doQueryInsert(QueryInsertSetupper<LdBook, LdBookCB> setupper, InsertOption<LdBookCB> option) {
        assertObjectNotNull("setupper", setupper);
        prepareInsertOption(option);
        LdBook entity = new LdBook();
        LdBookCB intoCB = createCBForQueryInsert();
        ConditionBean resourceCB = setupper.setup(entity, intoCB);
        return delegateQueryInsert(entity, intoCB, resourceCB, option);
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
     * bookBhv.<span style="color: #FD4747">queryUpdate</span>(book, cb);
     * </pre>
     * @param book The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of LdBook. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(LdBook book, LdBookCB cb) {
        return doQueryUpdate(book, cb, null);
    }

    protected int doQueryUpdate(LdBook book, LdBookCB cb, UpdateOption<LdBookCB> option) {
        assertObjectNotNull("book", book); assertCBStateValid(cb);
        prepareUpdateOption(option);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryUpdate(book, cb, option) : 0;
    }

    @Override
    protected int doRangeModify(Entity entity, ConditionBean cb, UpdateOption<? extends ConditionBean> option) {
        if (option == null) { return queryUpdate(downcast(entity), (LdBookCB)cb); }
        else { return varyingQueryUpdate(downcast(entity), (LdBookCB)cb, downcast(option)); }
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * LdBookCB cb = new LdBookCB();
     * cb.query().setFoo...(value);
     * bookBhv.<span style="color: #FD4747">queryDelete</span>(book, cb);
     * </pre>
     * @param cb The condition-bean of LdBook. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(LdBookCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(LdBookCB cb, DeleteOption<LdBookCB> option) {
        assertCBStateValid(cb);
        prepareDeleteOption(option);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryDelete(cb, option) : 0;
    }

    @Override
    protected int doRangeRemove(ConditionBean cb, DeleteOption<? extends ConditionBean> option) {
        if (option == null) { return queryDelete((LdBookCB)cb); }
        else { return varyingQueryDelete((LdBookCB)cb, downcast(option)); }
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
     * bookBhv.<span style="color: #FD4747">varyingInsert</span>(book, option);
     * ... = book.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param book The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
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
     * book.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;LdBookCB&gt; option = new UpdateOption&lt;LdBookCB&gt;();
     *     option.self(new SpecifyQuery&lt;LdBookCB&gt;() {
     *         public void specify(LdBookCB cb) {
     *             cb.specify().<span style="color: #FD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     bookBhv.<span style="color: #FD4747">varyingUpdate</span>(book, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param book The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
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
     *         cb.specify().<span style="color: #FD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * bookBhv.<span style="color: #FD4747">varyingUpdateNonstrict</span>(book, option);
     * </pre>
     * @param book The entity of update target. (NotNull, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
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
     * @exception org.seasar.dbflute.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
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
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
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
     * @exception org.seasar.dbflute.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
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
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
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
     *         cb.specify().<span style="color: #FD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * bookBhv.<span style="color: #FD4747">varyingQueryUpdate</span>(book, cb, option);
     * </pre>
     * @param book The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of LdBook. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
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
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
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
    protected <ENTITY extends LdBook> void delegateSelectCursor(LdBookCB cb, EntityRowHandler<ENTITY> erh, Class<ENTITY> et)
    { invoke(createSelectCursorCBCommand(cb, erh, et)); }
    protected <ENTITY extends LdBook> List<ENTITY> delegateSelectList(LdBookCB cb, Class<ENTITY> et)
    { return invoke(createSelectListCBCommand(cb, et)); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(LdBook e, InsertOption<LdBookCB> op)
    { if (!processBeforeInsert(e, op)) { return 0; }
      return invoke(createInsertEntityCommand(e, op)); }
    protected int delegateUpdate(LdBook e, UpdateOption<LdBookCB> op)
    { if (!processBeforeUpdate(e, op)) { return 0; }
      return invoke(createUpdateEntityCommand(e, op)); }
    protected int delegateUpdateNonstrict(LdBook e, UpdateOption<LdBookCB> op)
    { if (!processBeforeUpdate(e, op)) { return 0; }
      return invoke(createUpdateNonstrictEntityCommand(e, op)); }
    protected int delegateDelete(LdBook e, DeleteOption<LdBookCB> op)
    { if (!processBeforeDelete(e, op)) { return 0; }
      return invoke(createDeleteEntityCommand(e, op)); }
    protected int delegateDeleteNonstrict(LdBook e, DeleteOption<LdBookCB> op)
    { if (!processBeforeDelete(e, op)) { return 0; }
      return invoke(createDeleteNonstrictEntityCommand(e, op)); }

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

    protected int delegateQueryInsert(LdBook e, LdBookCB inCB, ConditionBean resCB, InsertOption<LdBookCB> op)
    { if (!processBeforeQueryInsert(e, inCB, resCB, op)) { return 0; } return invoke(createQueryInsertCBCommand(e, inCB, resCB, op));  }
    protected int delegateQueryUpdate(LdBook e, LdBookCB cb, UpdateOption<LdBookCB> op)
    { if (!processBeforeQueryUpdate(e, cb, op)) { return 0; } return invoke(createQueryUpdateCBCommand(e, cb, op));  }
    protected int delegateQueryDelete(LdBookCB cb, DeleteOption<LdBookCB> op)
    { if (!processBeforeQueryDelete(cb, op)) { return 0; } return invoke(createQueryDeleteCBCommand(cb, op));  }

    // ===================================================================================
    //                                                                     Filter Override
    //                                                                     ===============
    @Override
    protected void filterEntityOfInsert(Entity targetEntity, InsertOption<? extends ConditionBean> option) {
        super.filterEntityOfInsert(targetEntity, option);
        LdBook entity = downcast(targetEntity);
        entity.setRUser(org.seasar.dbflute.AccessContext.getAccessUserOnThread());
        entity.setRTimestamp(org.seasar.dbflute.AccessContext.getAccessTimestampOnThread());
    }

    // ===================================================================================
    //                                                                Optimistic Lock Info
    //                                                                ====================
    /**
     * {@inheritDoc}
     */
    @Override
    protected boolean hasVersionNoValue(Entity entity) {
        return false;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected boolean hasUpdateDateValue(Entity entity) {
        return downcast(entity).getUTimestamp() != null;
    }

    // ===================================================================================
    //                                                                     Downcast Helper
    //                                                                     ===============
    protected LdBook downcast(Entity entity) {
        return helpEntityDowncastInternally(entity, LdBook.class);
    }

    protected LdBookCB downcast(ConditionBean cb) {
        return helpConditionBeanDowncastInternally(cb, LdBookCB.class);
    }

    @SuppressWarnings("unchecked")
    protected List<LdBook> downcast(List<? extends Entity> entityList) {
        return (List<LdBook>)entityList;
    }

    @SuppressWarnings("unchecked")
    protected InsertOption<LdBookCB> downcast(InsertOption<? extends ConditionBean> option) {
        return (InsertOption<LdBookCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected UpdateOption<LdBookCB> downcast(UpdateOption<? extends ConditionBean> option) {
        return (UpdateOption<LdBookCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected DeleteOption<LdBookCB> downcast(DeleteOption<? extends ConditionBean> option) {
        return (DeleteOption<LdBookCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<LdBook, LdBookCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> option) {
        return (QueryInsertSetupper<LdBook, LdBookCB>)option;
    }
}
