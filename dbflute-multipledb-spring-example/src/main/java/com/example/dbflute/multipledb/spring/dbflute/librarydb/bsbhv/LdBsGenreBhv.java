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
 * The behavior of GENRE as TABLE. <br />
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
public abstract class LdBsGenreBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "GENRE"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public DBMeta getDBMeta() { return LdGenreDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public LdGenreDbm getMyDBMeta() { return LdGenreDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public Entity newEntity() { return newMyEntity(); }

    /** {@inheritDoc} */
    public ConditionBean newConditionBean() { return newMyConditionBean(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public LdGenre newMyEntity() { return new LdGenre(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public LdGenreCB newMyConditionBean() { return new LdGenreCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * LdGenreCB cb = new LdGenreCB();
     * cb.query().setFoo...(value);
     * int count = genreBhv.<span style="color: #FD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of LdGenre. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(LdGenreCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(LdGenreCB cb) { // called by selectCount(cb)
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(LdGenreCB cb) { // called by selectPage(cb)
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
     * LdGenreCB cb = new LdGenreCB();
     * cb.query().setFoo...(value);
     * LdGenre genre = genreBhv.<span style="color: #FD4747">selectEntity</span>(cb);
     * if (genre != null) {
     *     ... = genre.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of LdGenre. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public LdGenre selectEntity(LdGenreCB cb) {
        return doSelectEntity(cb, LdGenre.class);
    }

    protected <ENTITY extends LdGenre> ENTITY doSelectEntity(final LdGenreCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb);
        return helpSelectEntityInternally(cb, tp, new InternalSelectEntityCallback<ENTITY, LdGenreCB>() {
            public List<ENTITY> callbackSelectList(LdGenreCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); } });
    }

    @Override
    protected Entity doReadEntity(ConditionBean cb) {
        return selectEntity(downcast(cb));
    }

    /**
     * Select the entity by the condition-bean with deleted check.
     * <pre>
     * LdGenreCB cb = new LdGenreCB();
     * cb.query().setFoo...(value);
     * LdGenre genre = genreBhv.<span style="color: #FD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = genre.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of LdGenre. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public LdGenre selectEntityWithDeletedCheck(LdGenreCB cb) {
        return doSelectEntityWithDeletedCheck(cb, LdGenre.class);
    }

    protected <ENTITY extends LdGenre> ENTITY doSelectEntityWithDeletedCheck(final LdGenreCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb);
        return helpSelectEntityWithDeletedCheckInternally(cb, tp, new InternalSelectEntityWithDeletedCheckCallback<ENTITY, LdGenreCB>() {
            public List<ENTITY> callbackSelectList(LdGenreCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); } });
    }

    @Override
    protected Entity doReadEntityWithDeletedCheck(ConditionBean cb) {
        return selectEntityWithDeletedCheck(downcast(cb));
    }

    /**
     * Select the entity by the primary-key value.
     * @param genreCode The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public LdGenre selectByPKValue(String genreCode) {
        return doSelectByPKValue(genreCode, LdGenre.class);
    }

    protected <ENTITY extends LdGenre> ENTITY doSelectByPKValue(String genreCode, Class<ENTITY> entityType) {
        return doSelectEntity(buildPKCB(genreCode), entityType);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param genreCode The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public LdGenre selectByPKValueWithDeletedCheck(String genreCode) {
        return doSelectByPKValueWithDeletedCheck(genreCode, LdGenre.class);
    }

    protected <ENTITY extends LdGenre> ENTITY doSelectByPKValueWithDeletedCheck(String genreCode, Class<ENTITY> entityType) {
        return doSelectEntityWithDeletedCheck(buildPKCB(genreCode), entityType);
    }

    private LdGenreCB buildPKCB(String genreCode) {
        assertObjectNotNull("genreCode", genreCode);
        LdGenreCB cb = newMyConditionBean();
        cb.query().setGenreCode_Equal(genreCode);
        return cb;
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * LdGenreCB cb = new LdGenreCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;LdGenre&gt; genreList = genreBhv.<span style="color: #FD4747">selectList</span>(cb);
     * for (LdGenre genre : genreList) {
     *     ... = genre.get...();
     * }
     * </pre>
     * @param cb The condition-bean of LdGenre. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<LdGenre> selectList(LdGenreCB cb) {
        return doSelectList(cb, LdGenre.class);
    }

    protected <ENTITY extends LdGenre> ListResultBean<ENTITY> doSelectList(LdGenreCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        return helpSelectListInternally(cb, tp, new InternalSelectListCallback<ENTITY, LdGenreCB>() {
            public List<ENTITY> callbackSelectList(LdGenreCB cb, Class<ENTITY> tp) { return delegateSelectList(cb, tp); } });
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
     * LdGenreCB cb = new LdGenreCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #FD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;LdGenre&gt; page = genreBhv.<span style="color: #FD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (LdGenre genre : page) {
     *     ... = genre.get...();
     * }
     * </pre>
     * @param cb The condition-bean of LdGenre. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<LdGenre> selectPage(LdGenreCB cb) {
        return doSelectPage(cb, LdGenre.class);
    }

    protected <ENTITY extends LdGenre> PagingResultBean<ENTITY> doSelectPage(LdGenreCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectPageInternally(cb, tp, new InternalSelectPageCallback<ENTITY, LdGenreCB>() {
            public int callbackSelectCount(LdGenreCB cb) { return doSelectCountPlainly(cb); }
            public List<ENTITY> callbackSelectList(LdGenreCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); }
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
     * LdGenreCB cb = new LdGenreCB();
     * cb.query().setFoo...(value);
     * genreBhv.<span style="color: #FD4747">selectCursor</span>(cb, new EntityRowHandler&lt;LdGenre&gt;() {
     *     public void handle(LdGenre entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of LdGenre. (NotNull)
     * @param entityRowHandler The handler of entity row of LdGenre. (NotNull)
     */
    public void selectCursor(LdGenreCB cb, EntityRowHandler<LdGenre> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, LdGenre.class);
    }

    protected <ENTITY extends LdGenre> void doSelectCursor(LdGenreCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler", handler); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        helpSelectCursorInternally(cb, handler, tp, new InternalSelectCursorCallback<ENTITY, LdGenreCB>() {
            public void callbackSelectCursor(LdGenreCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) { delegateSelectCursor(cb, handler, tp); }
            public List<ENTITY> callbackSelectList(LdGenreCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); }
        });
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * genreBhv.<span style="color: #FD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(LdGenreCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> SLFunction<LdGenreCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
    }

    protected <RESULT, CB extends LdGenreCB> SLFunction<CB, RESULT> doScalarSelect(Class<RESULT> tp, CB cb) {
        assertObjectNotNull("resultType", tp); assertCBStateValid(cb);
        cb.xsetupForScalarSelect(); cb.getSqlClause().disableSelectIndex(); // for when you use union
        return createSLFunction(cb, tp);
    }

    protected <RESULT, CB extends LdGenreCB> SLFunction<CB, RESULT> createSLFunction(CB cb, Class<RESULT> tp) {
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
     * {Refer to overload method that has an argument of the list of entity.}
     * @param genre The entity of genre. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     */
    public void loadBookList(LdGenre genre, ConditionBeanSetupper<LdBookCB> conditionBeanSetupper) {
        xassLRArg(genre, conditionBeanSetupper);
        loadBookList(xnewLRLs(genre), conditionBeanSetupper);
    }
    /**
     * Load referrer of bookList with the set-upper for condition-bean of referrer. <br />
     * BOOK by GENRE_CODE, named 'bookList'.
     * <pre>
     * genreBhv.<span style="color: #FD4747">loadBookList</span>(genreList, new ConditionBeanSetupper&lt;LdBookCB&gt;() {
     *     public void setup(LdBookCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...(); <span style="color: #3F7E5E">// basically you should order referrer list</span>
     *     }
     * });
     * for (LdGenre genre : genreList) {
     *     ... = genre.<span style="color: #FD4747">getBookList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key(and others too) is treated as case-insensitive. <br />
     * The condition-bean that the set-upper provides have settings before you touch it. It is as follows:
     * <pre>
     * cb.query().setGenreCode_InScope(pkList);
     * cb.query().addOrderBy_GenreCode_Asc();
     * </pre>
     * @param genreList The entity list of genre. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     */
    public void loadBookList(List<LdGenre> genreList, ConditionBeanSetupper<LdBookCB> conditionBeanSetupper) {
        xassLRArg(genreList, conditionBeanSetupper);
        loadBookList(genreList, new LoadReferrerOption<LdBookCB, LdBook>().xinit(conditionBeanSetupper));
    }
    /**
     * {Refer to overload method that has an argument of the list of entity.}
     * @param genre The entity of genre. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadBookList(LdGenre genre, LoadReferrerOption<LdBookCB, LdBook> loadReferrerOption) {
        xassLRArg(genre, loadReferrerOption);
        loadBookList(xnewLRLs(genre), loadReferrerOption);
    }
    /**
     * {Refer to overload method that has an argument of condition-bean setupper.}
     * @param genreList The entity list of genre. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadBookList(List<LdGenre> genreList, LoadReferrerOption<LdBookCB, LdBook> loadReferrerOption) {
        xassLRArg(genreList, loadReferrerOption);
        if (genreList.isEmpty()) { return; }
        final LdBookBhv referrerBhv = xgetBSFLR().select(LdBookBhv.class);
        helpLoadReferrerInternally(genreList, loadReferrerOption, new InternalLoadReferrerCallback<LdGenre, String, LdBookCB, LdBook>() {
            public String getPKVal(LdGenre et)
            { return et.getGenreCode(); }
            public void setRfLs(LdGenre et, List<LdBook> ls)
            { et.setBookList(ls); }
            public LdBookCB newMyCB() { return referrerBhv.newMyConditionBean(); }
            public void qyFKIn(LdBookCB cb, List<String> ls)
            { cb.query().setGenreCode_InScope(ls); }
            public void qyOdFKAsc(LdBookCB cb) { cb.query().addOrderBy_GenreCode_Asc(); }
            public void spFKCol(LdBookCB cb) { cb.specify().columnGenreCode(); }
            public List<LdBook> selRfLs(LdBookCB cb) { return referrerBhv.selectList(cb); }
            public String getFKVal(LdBook re) { return re.getGenreCode(); }
            public void setlcEt(LdBook re, LdGenre le)
            { re.setGenre(le); }
            public String getRfPrNm() { return "bookList"; }
        });
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.}
     * @param genre The entity of genre. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     */
    public void loadGenreSelfList(LdGenre genre, ConditionBeanSetupper<LdGenreCB> conditionBeanSetupper) {
        xassLRArg(genre, conditionBeanSetupper);
        loadGenreSelfList(xnewLRLs(genre), conditionBeanSetupper);
    }
    /**
     * Load referrer of genreSelfList with the set-upper for condition-bean of referrer. <br />
     * GENRE by PARENT_GENRE_CODE, named 'genreSelfList'.
     * <pre>
     * genreBhv.<span style="color: #FD4747">loadGenreSelfList</span>(genreList, new ConditionBeanSetupper&lt;LdGenreCB&gt;() {
     *     public void setup(LdGenreCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...(); <span style="color: #3F7E5E">// basically you should order referrer list</span>
     *     }
     * });
     * for (LdGenre genre : genreList) {
     *     ... = genre.<span style="color: #FD4747">getGenreSelfList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key(and others too) is treated as case-insensitive. <br />
     * The condition-bean that the set-upper provides have settings before you touch it. It is as follows:
     * <pre>
     * cb.query().setParentGenreCode_InScope(pkList);
     * cb.query().addOrderBy_ParentGenreCode_Asc();
     * </pre>
     * @param genreList The entity list of genre. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     */
    public void loadGenreSelfList(List<LdGenre> genreList, ConditionBeanSetupper<LdGenreCB> conditionBeanSetupper) {
        xassLRArg(genreList, conditionBeanSetupper);
        loadGenreSelfList(genreList, new LoadReferrerOption<LdGenreCB, LdGenre>().xinit(conditionBeanSetupper));
    }
    /**
     * {Refer to overload method that has an argument of the list of entity.}
     * @param genre The entity of genre. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadGenreSelfList(LdGenre genre, LoadReferrerOption<LdGenreCB, LdGenre> loadReferrerOption) {
        xassLRArg(genre, loadReferrerOption);
        loadGenreSelfList(xnewLRLs(genre), loadReferrerOption);
    }
    /**
     * {Refer to overload method that has an argument of condition-bean setupper.}
     * @param genreList The entity list of genre. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadGenreSelfList(List<LdGenre> genreList, LoadReferrerOption<LdGenreCB, LdGenre> loadReferrerOption) {
        xassLRArg(genreList, loadReferrerOption);
        if (genreList.isEmpty()) { return; }
        final LdGenreBhv referrerBhv = xgetBSFLR().select(LdGenreBhv.class);
        helpLoadReferrerInternally(genreList, loadReferrerOption, new InternalLoadReferrerCallback<LdGenre, String, LdGenreCB, LdGenre>() {
            public String getPKVal(LdGenre et)
            { return et.getGenreCode(); }
            public void setRfLs(LdGenre et, List<LdGenre> ls)
            { et.setGenreSelfList(ls); }
            public LdGenreCB newMyCB() { return referrerBhv.newMyConditionBean(); }
            public void qyFKIn(LdGenreCB cb, List<String> ls)
            { cb.query().setParentGenreCode_InScope(ls); }
            public void qyOdFKAsc(LdGenreCB cb) { cb.query().addOrderBy_ParentGenreCode_Asc(); }
            public void spFKCol(LdGenreCB cb) { cb.specify().columnParentGenreCode(); }
            public List<LdGenre> selRfLs(LdGenreCB cb) { return referrerBhv.selectList(cb); }
            public String getFKVal(LdGenre re) { return re.getParentGenreCode(); }
            public void setlcEt(LdGenre re, LdGenre le)
            { re.setGenreSelf(le); }
            public String getRfPrNm() { return "genreSelfList"; }
        });
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'LdGenre'.
     * @param genreList The list of genre. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<LdGenre> pulloutGenreSelf(List<LdGenre> genreList) {
        return helpPulloutInternally(genreList, new InternalPulloutCallback<LdGenre, LdGenre>() {
            public LdGenre getFr(LdGenre et) { return et.getGenreSelf(); }
            public boolean hasRf() { return true; }
            public void setRfLs(LdGenre et, List<LdGenre> ls)
            { et.setGenreSelfList(ls); }
        });
    }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key genreCode.
     * @param genreList The list of genre. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<String> extractGenreCodeList(List<LdGenre> genreList) {
        return helpExtractListInternally(genreList, new InternalExtractCallback<LdGenre, String>() {
            public String getCV(LdGenre et) { return et.getGenreCode(); }
        });
    }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * LdGenre genre = new LdGenre();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * genre.setFoo...(value);
     * genre.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//genre.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//genre.set...;</span>
     * genreBhv.<span style="color: #FD4747">insert</span>(genre);
     * ... = genre.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param genre The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(LdGenre genre) {
        doInsert(genre, null);
    }

    protected void doInsert(LdGenre genre, InsertOption<LdGenreCB> op) {
        assertObjectNotNull("genre", genre);
        prepareInsertOption(op);
        delegateInsert(genre, op);
    }

    protected void prepareInsertOption(InsertOption<LdGenreCB> op) {
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
     * LdGenre genre = new LdGenre();
     * genre.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * genre.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//genre.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//genre.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * genre.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     genreBhv.<span style="color: #FD4747">update</span>(genre);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param genre The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(final LdGenre genre) {
        doUpdate(genre, null);
    }

    protected void doUpdate(LdGenre genre, final UpdateOption<LdGenreCB> op) {
        assertObjectNotNull("genre", genre);
        prepareUpdateOption(op);
        helpUpdateInternally(genre, new InternalUpdateCallback<LdGenre>() {
            public int callbackDelegateUpdate(LdGenre et) { return delegateUpdate(et, op); } });
    }

    protected void prepareUpdateOption(UpdateOption<LdGenreCB> op) {
        if (op == null) { return; }
        assertUpdateOptionStatus(op);
        if (op.hasSelfSpecification()) {
            op.resolveSelfSpecification(createCBForVaryingUpdate());
        }
        if (op.hasSpecifiedUpdateColumn()) {
            op.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    protected LdGenreCB createCBForVaryingUpdate() {
        LdGenreCB cb = newMyConditionBean();
        cb.xsetupForVaryingUpdate();
        return cb;
    }

    protected LdGenreCB createCBForSpecifiedUpdate() {
        LdGenreCB cb = newMyConditionBean();
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
     * LdGenre genre = new LdGenre();
     * genre.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * genre.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//genre.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//genre.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//genre.setVersionNo(value);</span>
     * genreBhv.<span style="color: #FD4747">updateNonstrict</span>(genre);
     * </pre>
     * @param genre The entity of update target. (NotNull, PrimaryKeyNotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void updateNonstrict(final LdGenre genre) {
        doUpdateNonstrict(genre, null);
    }

    protected void doUpdateNonstrict(LdGenre genre, final UpdateOption<LdGenreCB> op) {
        assertObjectNotNull("genre", genre);
        prepareUpdateOption(op);
        helpUpdateNonstrictInternally(genre, new InternalUpdateNonstrictCallback<LdGenre>() {
            public int callbackDelegateUpdateNonstrict(LdGenre et) { return delegateUpdateNonstrict(et, op); } });
    }

    @Override
    protected void doModifyNonstrict(Entity et, UpdateOption<? extends ConditionBean> op) {
        if (op == null) { updateNonstrict(downcast(et)); }
        else { varyingUpdateNonstrict(downcast(et), downcast(op)); }
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, ExclusiveControl) <br />
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br />
     * <p><span style="color: #FD4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param genre The entity of insert or update target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(LdGenre genre) {
        doInesrtOrUpdate(genre, null, null);
    }

    protected void doInesrtOrUpdate(LdGenre genre, final InsertOption<LdGenreCB> iop, final UpdateOption<LdGenreCB> uop) {
        helpInsertOrUpdateInternally(genre, new InternalInsertOrUpdateCallback<LdGenre, LdGenreCB>() {
            public void callbackInsert(LdGenre et) { doInsert(et, iop); }
            public void callbackUpdate(LdGenre et) { doUpdate(et, uop); }
            public LdGenreCB callbackNewMyConditionBean() { return newMyConditionBean(); }
            public int callbackSelectCount(LdGenreCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrModify(Entity et, InsertOption<? extends ConditionBean> iop, UpdateOption<? extends ConditionBean> uop) {
        if (iop == null && uop == null) { insertOrUpdate(downcast(et)); }
        else {
            iop = iop != null ? iop : new InsertOption<LdGenreCB>();
            uop = uop != null ? uop : new UpdateOption<LdGenreCB>();
            varyingInsertOrUpdate(downcast(et), downcast(iop), downcast(uop));
        }
    }

    /**
     * Insert or update the entity non-strictly modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br />
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() }
     * <p><span style="color: #FD4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param genre The entity of insert or update target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdateNonstrict(LdGenre genre) {
        doInesrtOrUpdateNonstrict(genre, null, null);
    }

    protected void doInesrtOrUpdateNonstrict(LdGenre genre, final InsertOption<LdGenreCB> iop, final UpdateOption<LdGenreCB> uop) {
        helpInsertOrUpdateInternally(genre, new InternalInsertOrUpdateNonstrictCallback<LdGenre>() {
            public void callbackInsert(LdGenre et) { doInsert(et, iop); }
            public void callbackUpdateNonstrict(LdGenre et) { doUpdateNonstrict(et, uop); }
        });
    }

    @Override
    protected void doCreateOrModifyNonstrict(Entity et, InsertOption<? extends ConditionBean> iop, UpdateOption<? extends ConditionBean> uop) {
        if (iop == null && uop == null) { insertOrUpdateNonstrict(downcast(et)); }
        else {
            iop = iop != null ? iop : new InsertOption<LdGenreCB>();
            uop = uop != null ? uop : new UpdateOption<LdGenreCB>();
            varyingInsertOrUpdateNonstrict(downcast(et), downcast(iop), downcast(uop));
        }
    }

    /**
     * Delete the entity. (ZeroUpdateException, ExclusiveControl)
     * <pre>
     * LdGenre genre = new LdGenre();
     * genre.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * genre.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     genreBhv.<span style="color: #FD4747">delete</span>(genre);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param genre The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(LdGenre genre) {
        doDelete(genre, null);
    }

    protected void doDelete(LdGenre genre, final DeleteOption<LdGenreCB> op) {
        assertObjectNotNull("genre", genre);
        prepareDeleteOption(op);
        helpDeleteInternally(genre, new InternalDeleteCallback<LdGenre>() {
            public int callbackDelegateDelete(LdGenre et) { return delegateDelete(et, op); } });
    }

    protected void prepareDeleteOption(DeleteOption<LdGenreCB> op) {
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
     * LdGenre genre = new LdGenre();
     * genre.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//genre.setVersionNo(value);</span>
     * genreBhv.<span style="color: #FD4747">deleteNonstrict</span>(genre);
     * </pre>
     * @param genre The entity of delete target. (NotNull, PrimaryKeyNotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrict(LdGenre genre) {
        doDeleteNonstrict(genre, null);
    }

    protected void doDeleteNonstrict(LdGenre genre, final DeleteOption<LdGenreCB> op) {
        assertObjectNotNull("genre", genre);
        prepareDeleteOption(op);
        helpDeleteNonstrictInternally(genre, new InternalDeleteNonstrictCallback<LdGenre>() {
            public int callbackDelegateDeleteNonstrict(LdGenre et) { return delegateDeleteNonstrict(et, op); } });
    }

    /**
     * Delete the entity non-strictly ignoring deleted. {ZeroUpdateException, NonExclusiveControl}
     * <pre>
     * LdGenre genre = new LdGenre();
     * genre.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//genre.setVersionNo(value);</span>
     * genreBhv.<span style="color: #FD4747">deleteNonstrictIgnoreDeleted</span>(genre);
     * <span style="color: #3F7E5E">// if the target entity doesn't exist, no exception</span>
     * </pre>
     * @param genre The entity of delete target. (NotNull, PrimaryKeyNotNull)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrictIgnoreDeleted(LdGenre genre) {
        doDeleteNonstrictIgnoreDeleted(genre, null);
    }

    protected void doDeleteNonstrictIgnoreDeleted(LdGenre genre, final DeleteOption<LdGenreCB> op) {
        assertObjectNotNull("genre", genre);
        prepareDeleteOption(op);
        helpDeleteNonstrictIgnoreDeletedInternally(genre, new InternalDeleteNonstrictIgnoreDeletedCallback<LdGenre>() {
            public int callbackDelegateDeleteNonstrict(LdGenre et) { return delegateDeleteNonstrict(et, op); } });
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
     * <p><span style="color: #FD4747; font-size: 120%">The columns of least common multiple are registered like this:</span></p>
     * <pre>
     * for (... : ...) {
     *     LdGenre genre = new LdGenre();
     *     genre.setFooName("foo");
     *     if (...) {
     *         genre.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     genreList.add(genre);
     * }
     * genreBhv.<span style="color: #FD4747">batchInsert</span>(genreList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param genreList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<LdGenre> genreList) {
        InsertOption<LdGenreCB> op = createInsertUpdateOption();
        return doBatchInsert(genreList, op);
    }

    protected int[] doBatchInsert(List<LdGenre> genreList, InsertOption<LdGenreCB> op) {
        assertObjectNotNull("genreList", genreList);
        prepareBatchInsertOption(genreList, op);
        return delegateBatchInsert(genreList, op);
    }

    protected void prepareBatchInsertOption(List<LdGenre> genreList, InsertOption<LdGenreCB> op) {
        op.xallowInsertColumnModifiedPropertiesFragmented();
        op.xacceptInsertColumnModifiedPropertiesIfNeeds(genreList);
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
     * <span style="color: #FD4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     LdGenre genre = new LdGenre();
     *     genre.setFooName("foo");
     *     if (...) {
     *         genre.setFooPrice(123);
     *     } else {
     *         genre.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//genre.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     genreList.add(genre);
     * }
     * genreBhv.<span style="color: #FD4747">batchUpdate</span>(genreList);
     * </pre>
     * @param genreList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<LdGenre> genreList) {
        UpdateOption<LdGenreCB> op = createPlainUpdateOption();
        return doBatchUpdate(genreList, op);
    }

    protected int[] doBatchUpdate(List<LdGenre> genreList, UpdateOption<LdGenreCB> op) {
        assertObjectNotNull("genreList", genreList);
        prepareBatchUpdateOption(genreList, op);
        return delegateBatchUpdate(genreList, op);
    }

    protected void prepareBatchUpdateOption(List<LdGenre> genreList, UpdateOption<LdGenreCB> op) {
        op.xacceptUpdateColumnModifiedPropertiesIfNeeds(genreList);
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
     * genreBhv.<span style="color: #FD4747">batchUpdate</span>(genreList, new SpecifyQuery<LdGenreCB>() {
     *     public void specify(LdGenreCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #FD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #FD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * genreBhv.<span style="color: #FD4747">batchUpdate</span>(genreList, new SpecifyQuery<LdGenreCB>() {
     *     public void specify(LdGenreCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #FD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param genreList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<LdGenre> genreList, SpecifyQuery<LdGenreCB> updateColumnSpec) {
        return doBatchUpdate(genreList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    /**
     * Batch-update the entity list non-strictly modified-only of same-set columns. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <span style="color: #FD4747; font-size: 140%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     LdGenre genre = new LdGenre();
     *     genre.setFooName("foo");
     *     if (...) {
     *         genre.setFooPrice(123);
     *     } else {
     *         genre.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//genre.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     genreList.add(genre);
     * }
     * genreBhv.<span style="color: #FD4747">batchUpdate</span>(genreList);
     * </pre>
     * @param genreList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<LdGenre> genreList) {
        UpdateOption<LdGenreCB> option = createPlainUpdateOption();
        return doBatchUpdateNonstrict(genreList, option);
    }

    protected int[] doBatchUpdateNonstrict(List<LdGenre> genreList, UpdateOption<LdGenreCB> op) {
        assertObjectNotNull("genreList", genreList);
        prepareBatchUpdateOption(genreList, op);
        return delegateBatchUpdateNonstrict(genreList, op);
    }

    /**
     * Batch-update the entity list non-strictly specified-only. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * genreBhv.<span style="color: #FD4747">batchUpdateNonstrict</span>(genreList, new SpecifyQuery<LdGenreCB>() {
     *     public void specify(LdGenreCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #FD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #FD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * genreBhv.<span style="color: #FD4747">batchUpdateNonstrict</span>(genreList, new SpecifyQuery<LdGenreCB>() {
     *     public void specify(LdGenreCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #FD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).</p>
     * @param genreList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<LdGenre> genreList, SpecifyQuery<LdGenreCB> updateColumnSpec) {
        return doBatchUpdateNonstrict(genreList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> op) {
        if (op == null) { return batchUpdateNonstrict(downcast(ls)); }
        else { return varyingBatchUpdateNonstrict(downcast(ls), downcast(op)); }
    }

    /**
     * Batch-delete the entity list. (ExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param genreList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchDelete(List<LdGenre> genreList) {
        return doBatchDelete(genreList, null);
    }

    protected int[] doBatchDelete(List<LdGenre> genreList, DeleteOption<LdGenreCB> op) {
        assertObjectNotNull("genreList", genreList);
        prepareDeleteOption(op);
        return delegateBatchDelete(genreList, op);
    }

    @Override
    protected int[] doLumpRemove(List<Entity> ls, DeleteOption<? extends ConditionBean> op) {
        if (op == null) { return batchDelete(downcast(ls)); }
        else { return varyingBatchDelete(downcast(ls), downcast(op)); }
    }

    /**
     * Batch-delete the entity list non-strictly. {NonExclusiveControl} <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param genreList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDeleteNonstrict(List<LdGenre> genreList) {
        return doBatchDeleteNonstrict(genreList, null);
    }

    protected int[] doBatchDeleteNonstrict(List<LdGenre> genreList, DeleteOption<LdGenreCB> op) {
        assertObjectNotNull("genreList", genreList);
        prepareDeleteOption(op);
        return delegateBatchDeleteNonstrict(genreList, op);
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
     * genreBhv.<span style="color: #FD4747">queryInsert</span>(new QueryInsertSetupper&lt;LdGenre, LdGenreCB&gt;() {
     *     public ConditionBean setup(genre entity, LdGenreCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<LdGenre, LdGenreCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(QueryInsertSetupper<LdGenre, LdGenreCB> sp, InsertOption<LdGenreCB> op) {
        assertObjectNotNull("setupper", sp);
        prepareInsertOption(op);
        LdGenre e = new LdGenre();
        LdGenreCB cb = createCBForQueryInsert();
        return delegateQueryInsert(e, cb, sp.setup(e, cb), op);
    }

    protected LdGenreCB createCBForQueryInsert() {
        LdGenreCB cb = newMyConditionBean();
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
     * LdGenre genre = new LdGenre();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//genre.setPK...(value);</span>
     * genre.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//genre.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//genre.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//genre.setVersionNo(value);</span>
     * LdGenreCB cb = new LdGenreCB();
     * cb.query().setFoo...(value);
     * genreBhv.<span style="color: #FD4747">queryUpdate</span>(genre, cb);
     * </pre>
     * @param genre The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of LdGenre. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(LdGenre genre, LdGenreCB cb) {
        return doQueryUpdate(genre, cb, null);
    }

    protected int doQueryUpdate(LdGenre genre, LdGenreCB cb, UpdateOption<LdGenreCB> op) {
        assertObjectNotNull("genre", genre); assertCBStateValid(cb);
        prepareUpdateOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryUpdate(genre, cb, op) : 0;
    }

    @Override
    protected int doRangeModify(Entity et, ConditionBean cb, UpdateOption<? extends ConditionBean> op) {
        if (op == null) { return queryUpdate(downcast(et), (LdGenreCB)cb); }
        else { return varyingQueryUpdate(downcast(et), (LdGenreCB)cb, downcast(op)); }
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * LdGenreCB cb = new LdGenreCB();
     * cb.query().setFoo...(value);
     * genreBhv.<span style="color: #FD4747">queryDelete</span>(genre, cb);
     * </pre>
     * @param cb The condition-bean of LdGenre. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(LdGenreCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(LdGenreCB cb, DeleteOption<LdGenreCB> op) {
        assertCBStateValid(cb);
        prepareDeleteOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryDelete(cb, op) : 0;
    }

    @Override
    protected int doRangeRemove(ConditionBean cb, DeleteOption<? extends ConditionBean> op) {
        if (op == null) { return queryDelete((LdGenreCB)cb); }
        else { return varyingQueryDelete((LdGenreCB)cb, downcast(op)); }
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
     * LdGenre genre = new LdGenre();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * genre.setFoo...(value);
     * genre.setBar...(value);
     * InsertOption<LdGenreCB> option = new InsertOption<LdGenreCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * genreBhv.<span style="color: #FD4747">varyingInsert</span>(genre, option);
     * ... = genre.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param genre The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(LdGenre genre, InsertOption<LdGenreCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(genre, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, ExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * LdGenre genre = new LdGenre();
     * genre.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * genre.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * genre.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;LdGenreCB&gt; option = new UpdateOption&lt;LdGenreCB&gt;();
     *     option.self(new SpecifyQuery&lt;LdGenreCB&gt;() {
     *         public void specify(LdGenreCB cb) {
     *             cb.specify().<span style="color: #FD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     genreBhv.<span style="color: #FD4747">varyingUpdate</span>(genre, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param genre The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(LdGenre genre, UpdateOption<LdGenreCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(genre, option);
    }

    /**
     * Update the entity with varying requests non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as updateNonstrict(entity).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * LdGenre genre = new LdGenre();
     * genre.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * genre.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//genre.setVersionNo(value);</span>
     * UpdateOption&lt;LdGenreCB&gt; option = new UpdateOption&lt;LdGenreCB&gt;();
     * option.self(new SpecifyQuery&lt;LdGenreCB&gt;() {
     *     public void specify(LdGenreCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * genreBhv.<span style="color: #FD4747">varyingUpdateNonstrict</span>(genre, option);
     * </pre>
     * @param genre The entity of update target. (NotNull, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdateNonstrict(LdGenre genre, UpdateOption<LdGenreCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdateNonstrict(genre, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param genre The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(LdGenre genre, InsertOption<LdGenreCB> insertOption, UpdateOption<LdGenreCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdate(genre, insertOption, updateOption);
    }

    /**
     * Insert or update the entity with varying requests non-strictly. (NonExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdateNonstrict(entity).
     * @param genre The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdateNonstrict(LdGenre genre, InsertOption<LdGenreCB> insertOption, UpdateOption<LdGenreCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdateNonstrict(genre, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, ExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param genre The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(LdGenre genre, DeleteOption<LdGenreCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(genre, option);
    }

    /**
     * Delete the entity with varying requests non-strictly. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as deleteNonstrict(entity).
     * @param genre The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDeleteNonstrict(LdGenre genre, DeleteOption<LdGenreCB> option) {
        assertDeleteOptionNotNull(option);
        doDeleteNonstrict(genre, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param genreList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<LdGenre> genreList, InsertOption<LdGenreCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(genreList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param genreList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<LdGenre> genreList, UpdateOption<LdGenreCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(genreList, option);
    }

    /**
     * Batch-update the list with varying requests non-strictly. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param genreList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdateNonstrict(List<LdGenre> genreList, UpdateOption<LdGenreCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdateNonstrict(genreList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param genreList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<LdGenre> genreList, DeleteOption<LdGenreCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(genreList, option);
    }

    /**
     * Batch-delete the list with varying requests non-strictly. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDeleteNonstrict(entityList).
     * @param genreList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDeleteNonstrict(List<LdGenre> genreList, DeleteOption<LdGenreCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDeleteNonstrict(genreList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<LdGenre, LdGenreCB> setupper, InsertOption<LdGenreCB> option) {
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
     * LdGenre genre = new LdGenre();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//genre.setPK...(value);</span>
     * genre.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//genre.setVersionNo(value);</span>
     * LdGenreCB cb = new LdGenreCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;LdGenreCB&gt; option = new UpdateOption&lt;LdGenreCB&gt;();
     * option.self(new SpecifyQuery&lt;LdGenreCB&gt;() {
     *     public void specify(LdGenreCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * genreBhv.<span style="color: #FD4747">varyingQueryUpdate</span>(genre, cb, option);
     * </pre>
     * @param genre The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of LdGenre. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(LdGenre genre, LdGenreCB cb, UpdateOption<LdGenreCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(genre, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of LdGenre. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(LdGenreCB cb, DeleteOption<LdGenreCB> option) {
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
    public OutsideSqlBasicExecutor<LdGenreBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCountUniquely(LdGenreCB cb) { return invoke(createSelectCountCBCommand(cb, true)); }
    protected int delegateSelectCountPlainly(LdGenreCB cb) { return invoke(createSelectCountCBCommand(cb, false)); }
    protected <ENTITY extends LdGenre> void delegateSelectCursor(LdGenreCB cb, EntityRowHandler<ENTITY> rh, Class<ENTITY> tp)
    { invoke(createSelectCursorCBCommand(cb, rh, tp)); }
    protected <ENTITY extends LdGenre> List<ENTITY> delegateSelectList(LdGenreCB cb, Class<ENTITY> tp)
    { return invoke(createSelectListCBCommand(cb, tp)); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(LdGenre et, InsertOption<LdGenreCB> op)
    { if (!processBeforeInsert(et, op)) { return 0; }
      return invoke(createInsertEntityCommand(et, op)); }
    protected int delegateUpdate(LdGenre et, UpdateOption<LdGenreCB> op)
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return invoke(createUpdateEntityCommand(et, op)); }
    protected int delegateUpdateNonstrict(LdGenre et, UpdateOption<LdGenreCB> op)
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return invoke(createUpdateNonstrictEntityCommand(et, op)); }
    protected int delegateDelete(LdGenre et, DeleteOption<LdGenreCB> op)
    { if (!processBeforeDelete(et, op)) { return 0; }
      return invoke(createDeleteEntityCommand(et, op)); }
    protected int delegateDeleteNonstrict(LdGenre et, DeleteOption<LdGenreCB> op)
    { if (!processBeforeDelete(et, op)) { return 0; }
      return invoke(createDeleteNonstrictEntityCommand(et, op)); }

    protected int[] delegateBatchInsert(List<LdGenre> ls, InsertOption<LdGenreCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchInsertCommand(processBatchInternally(ls, op), op)); }
    protected int[] delegateBatchUpdate(List<LdGenre> ls, UpdateOption<LdGenreCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateCommand(processBatchInternally(ls, op, false), op)); }
    protected int[] delegateBatchUpdateNonstrict(List<LdGenre> ls, UpdateOption<LdGenreCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateNonstrictCommand(processBatchInternally(ls, op, true), op)); }
    protected int[] delegateBatchDelete(List<LdGenre> ls, DeleteOption<LdGenreCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteCommand(processBatchInternally(ls, op, false), op)); }
    protected int[] delegateBatchDeleteNonstrict(List<LdGenre> ls, DeleteOption<LdGenreCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteNonstrictCommand(processBatchInternally(ls, op, true), op)); }

    protected int delegateQueryInsert(LdGenre et, LdGenreCB inCB, ConditionBean resCB, InsertOption<LdGenreCB> op)
    { if (!processBeforeQueryInsert(et, inCB, resCB, op)) { return 0; } return invoke(createQueryInsertCBCommand(et, inCB, resCB, op));  }
    protected int delegateQueryUpdate(LdGenre et, LdGenreCB cb, UpdateOption<LdGenreCB> op)
    { if (!processBeforeQueryUpdate(et, cb, op)) { return 0; } return invoke(createQueryUpdateCBCommand(et, cb, op));  }
    protected int delegateQueryDelete(LdGenreCB cb, DeleteOption<LdGenreCB> op)
    { if (!processBeforeQueryDelete(cb, op)) { return 0; } return invoke(createQueryDeleteCBCommand(cb, op));  }

    // ===================================================================================
    //                                                                     Filter Override
    //                                                                     ===============
    @Override
    protected void filterEntityOfInsert(Entity tgt, InsertOption<? extends ConditionBean> op) {
        super.filterEntityOfInsert(tgt, op);
        LdGenre et = downcast(tgt);
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
    protected LdGenre downcast(Entity et) {
        return helpEntityDowncastInternally(et, LdGenre.class);
    }

    protected LdGenreCB downcast(ConditionBean cb) {
        return helpConditionBeanDowncastInternally(cb, LdGenreCB.class);
    }

    @SuppressWarnings("unchecked")
    protected List<LdGenre> downcast(List<? extends Entity> ls) {
        return (List<LdGenre>)ls;
    }

    @SuppressWarnings("unchecked")
    protected InsertOption<LdGenreCB> downcast(InsertOption<? extends ConditionBean> op) {
        return (InsertOption<LdGenreCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected UpdateOption<LdGenreCB> downcast(UpdateOption<? extends ConditionBean> op) {
        return (UpdateOption<LdGenreCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected DeleteOption<LdGenreCB> downcast(DeleteOption<? extends ConditionBean> op) {
        return (DeleteOption<LdGenreCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<LdGenre, LdGenreCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> sp) {
        return (QueryInsertSetupper<LdGenre, LdGenreCB>)sp;
    }
}
