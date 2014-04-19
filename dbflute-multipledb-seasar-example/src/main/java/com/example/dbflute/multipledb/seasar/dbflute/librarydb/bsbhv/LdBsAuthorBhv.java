/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */package com.example.dbflute.multipledb.seasar.dbflute.librarydb.bsbhv;

import java.util.List;

import org.seasar.dbflute.*;
import org.seasar.dbflute.bhv.*;
import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.outsidesql.executor.*;
import com.example.dbflute.multipledb.seasar.dbflute.librarydb.exbhv.*;
import com.example.dbflute.multipledb.seasar.dbflute.librarydb.exentity.*;
import com.example.dbflute.multipledb.seasar.dbflute.librarydb.bsentity.dbmeta.*;
import com.example.dbflute.multipledb.seasar.dbflute.librarydb.cbean.*;

/**
 * The behavior of AUTHOR as TABLE. <br />
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
public abstract class LdBsAuthorBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    public static final String PATH_update = "update";
    public static final String PATH_updateNoPmb = "updateNoPmb";
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "AUTHOR"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public DBMeta getDBMeta() { return LdAuthorDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public LdAuthorDbm getMyDBMeta() { return LdAuthorDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public Entity newEntity() { return newMyEntity(); }

    /** {@inheritDoc} */
    public ConditionBean newConditionBean() { return newMyConditionBean(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public LdAuthor newMyEntity() { return new LdAuthor(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public LdAuthorCB newMyConditionBean() { return new LdAuthorCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * LdAuthorCB cb = new LdAuthorCB();
     * cb.query().setFoo...(value);
     * int count = authorBhv.<span style="color: #FD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of LdAuthor. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(LdAuthorCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(LdAuthorCB cb) { // called by selectCount(cb)
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(LdAuthorCB cb) { // called by selectPage(cb)
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
     * LdAuthorCB cb = new LdAuthorCB();
     * cb.query().setFoo...(value);
     * LdAuthor author = authorBhv.<span style="color: #FD4747">selectEntity</span>(cb);
     * if (author != null) {
     *     ... = author.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of LdAuthor. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public LdAuthor selectEntity(LdAuthorCB cb) {
        return doSelectEntity(cb, LdAuthor.class);
    }

    protected <ENTITY extends LdAuthor> ENTITY doSelectEntity(LdAuthorCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectEntityInternally(cb, tp, new InternalSelectEntityCallback<ENTITY, LdAuthorCB>() {
            public List<ENTITY> callbackSelectList(LdAuthorCB lcb, Class<ENTITY> ltp) { return doSelectList(lcb, ltp); } });
    }

    @Override
    protected Entity doReadEntity(ConditionBean cb) {
        return selectEntity(downcast(cb));
    }

    /**
     * Select the entity by the condition-bean with deleted check.
     * <pre>
     * LdAuthorCB cb = new LdAuthorCB();
     * cb.query().setFoo...(value);
     * LdAuthor author = authorBhv.<span style="color: #FD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = author.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of LdAuthor. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public LdAuthor selectEntityWithDeletedCheck(LdAuthorCB cb) {
        return doSelectEntityWithDeletedCheck(cb, LdAuthor.class);
    }

    protected <ENTITY extends LdAuthor> ENTITY doSelectEntityWithDeletedCheck(LdAuthorCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectEntityWithDeletedCheckInternally(cb, tp, new InternalSelectEntityWithDeletedCheckCallback<ENTITY, LdAuthorCB>() {
            public List<ENTITY> callbackSelectList(LdAuthorCB lcb, Class<ENTITY> ltp) { return doSelectList(lcb, ltp); } });
    }

    @Override
    protected Entity doReadEntityWithDeletedCheck(ConditionBean cb) {
        return selectEntityWithDeletedCheck(downcast(cb));
    }

    /**
     * Select the entity by the primary-key value.
     * @param authorId The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public LdAuthor selectByPKValue(Integer authorId) {
        return doSelectByPKValue(authorId, LdAuthor.class);
    }

    protected <ENTITY extends LdAuthor> ENTITY doSelectByPKValue(Integer authorId, Class<ENTITY> entityType) {
        return doSelectEntity(buildPKCB(authorId), entityType);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param authorId The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public LdAuthor selectByPKValueWithDeletedCheck(Integer authorId) {
        return doSelectByPKValueWithDeletedCheck(authorId, LdAuthor.class);
    }

    protected <ENTITY extends LdAuthor> ENTITY doSelectByPKValueWithDeletedCheck(Integer authorId, Class<ENTITY> entityType) {
        return doSelectEntityWithDeletedCheck(buildPKCB(authorId), entityType);
    }

    private LdAuthorCB buildPKCB(Integer authorId) {
        assertObjectNotNull("authorId", authorId);
        LdAuthorCB cb = newMyConditionBean();
        cb.query().setAuthorId_Equal(authorId);
        return cb;
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * LdAuthorCB cb = new LdAuthorCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;LdAuthor&gt; authorList = authorBhv.<span style="color: #FD4747">selectList</span>(cb);
     * for (LdAuthor author : authorList) {
     *     ... = author.get...();
     * }
     * </pre>
     * @param cb The condition-bean of LdAuthor. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<LdAuthor> selectList(LdAuthorCB cb) {
        return doSelectList(cb, LdAuthor.class);
    }

    protected <ENTITY extends LdAuthor> ListResultBean<ENTITY> doSelectList(LdAuthorCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        return helpSelectListInternally(cb, tp, new InternalSelectListCallback<ENTITY, LdAuthorCB>() {
            public List<ENTITY> callbackSelectList(LdAuthorCB lcb, Class<ENTITY> ltp) { return delegateSelectList(lcb, ltp); } });
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
     * LdAuthorCB cb = new LdAuthorCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #FD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;LdAuthor&gt; page = authorBhv.<span style="color: #FD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (LdAuthor author : page) {
     *     ... = author.get...();
     * }
     * </pre>
     * @param cb The condition-bean of LdAuthor. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<LdAuthor> selectPage(LdAuthorCB cb) {
        return doSelectPage(cb, LdAuthor.class);
    }

    protected <ENTITY extends LdAuthor> PagingResultBean<ENTITY> doSelectPage(LdAuthorCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectPageInternally(cb, tp, new InternalSelectPageCallback<ENTITY, LdAuthorCB>() {
            public int callbackSelectCount(LdAuthorCB cb) { return doSelectCountPlainly(cb); }
            public List<ENTITY> callbackSelectList(LdAuthorCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); }
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
     * LdAuthorCB cb = new LdAuthorCB();
     * cb.query().setFoo...(value);
     * authorBhv.<span style="color: #FD4747">selectCursor</span>(cb, new EntityRowHandler&lt;LdAuthor&gt;() {
     *     public void handle(LdAuthor entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of LdAuthor. (NotNull)
     * @param entityRowHandler The handler of entity row of LdAuthor. (NotNull)
     */
    public void selectCursor(LdAuthorCB cb, EntityRowHandler<LdAuthor> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, LdAuthor.class);
    }

    protected <ENTITY extends LdAuthor> void doSelectCursor(LdAuthorCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler", handler); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        helpSelectCursorInternally(cb, handler, tp, new InternalSelectCursorCallback<ENTITY, LdAuthorCB>() {
            public void callbackSelectCursor(LdAuthorCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) { delegateSelectCursor(cb, handler, tp); }
            public List<ENTITY> callbackSelectList(LdAuthorCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); }
        });
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * authorBhv.<span style="color: #FD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(LdAuthorCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> SLFunction<LdAuthorCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
    }

    protected <RESULT, CB extends LdAuthorCB> SLFunction<CB, RESULT> doScalarSelect(Class<RESULT> tp, CB cb) {
        assertObjectNotNull("resultType", tp); assertCBStateValid(cb);
        cb.xsetupForScalarSelect(); cb.getSqlClause().disableSelectIndex(); // for when you use union
        return createSLFunction(cb, tp);
    }

    protected <RESULT, CB extends LdAuthorCB> SLFunction<CB, RESULT> createSLFunction(CB cb, Class<RESULT> tp) {
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
     * @param author The entity of author. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     */
    public void loadBookList(LdAuthor author, ConditionBeanSetupper<LdBookCB> conditionBeanSetupper) {
        xassLRArg(author, conditionBeanSetupper);
        loadBookList(xnewLRLs(author), conditionBeanSetupper);
    }
    /**
     * Load referrer of bookList with the set-upper for condition-bean of referrer. <br />
     * BOOK by AUTHOR_ID, named 'bookList'.
     * <pre>
     * authorBhv.<span style="color: #FD4747">loadBookList</span>(authorList, new ConditionBeanSetupper&lt;LdBookCB&gt;() {
     *     public void setup(LdBookCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...(); <span style="color: #3F7E5E">// basically you should order referrer list</span>
     *     }
     * });
     * for (LdAuthor author : authorList) {
     *     ... = author.<span style="color: #FD4747">getBookList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key(and others too) is treated as case-insensitive. <br />
     * The condition-bean that the set-upper provides have settings before you touch it. It is as follows:
     * <pre>
     * cb.query().setAuthorId_InScope(pkList);
     * cb.query().addOrderBy_AuthorId_Asc();
     * </pre>
     * @param authorList The entity list of author. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     */
    public void loadBookList(List<LdAuthor> authorList, ConditionBeanSetupper<LdBookCB> conditionBeanSetupper) {
        xassLRArg(authorList, conditionBeanSetupper);
        loadBookList(authorList, new LoadReferrerOption<LdBookCB, LdBook>().xinit(conditionBeanSetupper));
    }
    /**
     * {Refer to overload method that has an argument of the list of entity.}
     * @param author The entity of author. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadBookList(LdAuthor author, LoadReferrerOption<LdBookCB, LdBook> loadReferrerOption) {
        xassLRArg(author, loadReferrerOption);
        loadBookList(xnewLRLs(author), loadReferrerOption);
    }
    /**
     * {Refer to overload method that has an argument of condition-bean setupper.}
     * @param authorList The entity list of author. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadBookList(List<LdAuthor> authorList, LoadReferrerOption<LdBookCB, LdBook> loadReferrerOption) {
        xassLRArg(authorList, loadReferrerOption);
        if (authorList.isEmpty()) { return; }
        final LdBookBhv referrerBhv = xgetBSFLR().select(LdBookBhv.class);
        helpLoadReferrerInternally(authorList, loadReferrerOption, new InternalLoadReferrerCallback<LdAuthor, Integer, LdBookCB, LdBook>() {
            public Integer getPKVal(LdAuthor et)
            { return et.getAuthorId(); }
            public void setRfLs(LdAuthor et, List<LdBook> ls)
            { et.setBookList(ls); }
            public LdBookCB newMyCB() { return referrerBhv.newMyConditionBean(); }
            public void qyFKIn(LdBookCB cb, List<Integer> ls)
            { cb.query().setAuthorId_InScope(ls); }
            public void qyOdFKAsc(LdBookCB cb) { cb.query().addOrderBy_AuthorId_Asc(); }
            public void spFKCol(LdBookCB cb) { cb.specify().columnAuthorId(); }
            public List<LdBook> selRfLs(LdBookCB cb) { return referrerBhv.selectList(cb); }
            public Integer getFKVal(LdBook re) { return re.getAuthorId(); }
            public void setlcEt(LdBook re, LdAuthor le)
            { re.setAuthor(le); }
            public String getRfPrNm() { return "bookList"; }
        });
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key authorId.
     * @param authorList The list of author. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Integer> extractAuthorIdList(List<LdAuthor> authorList) {
        return helpExtractListInternally(authorList, new InternalExtractCallback<LdAuthor, Integer>() {
            public Integer getCV(LdAuthor et) { return et.getAuthorId(); }
        });
    }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * LdAuthor author = new LdAuthor();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * author.setFoo...(value);
     * author.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//author.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//author.set...;</span>
     * authorBhv.<span style="color: #FD4747">insert</span>(author);
     * ... = author.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param author The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(LdAuthor author) {
        doInsert(author, null);
    }

    protected void doInsert(LdAuthor author, InsertOption<LdAuthorCB> op) {
        assertObjectNotNull("author", author);
        prepareInsertOption(op);
        delegateInsert(author, op);
    }

    protected void prepareInsertOption(InsertOption<LdAuthorCB> op) {
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
     * LdAuthor author = new LdAuthor();
     * author.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * author.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//author.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//author.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * author.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     authorBhv.<span style="color: #FD4747">update</span>(author);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param author The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(final LdAuthor author) {
        doUpdate(author, null);
    }

    protected void doUpdate(LdAuthor author, final UpdateOption<LdAuthorCB> op) {
        assertObjectNotNull("author", author);
        prepareUpdateOption(op);
        helpUpdateInternally(author, new InternalUpdateCallback<LdAuthor>() {
            public int callbackDelegateUpdate(LdAuthor et) { return delegateUpdate(et, op); } });
    }

    protected void prepareUpdateOption(UpdateOption<LdAuthorCB> op) {
        if (op == null) { return; }
        assertUpdateOptionStatus(op);
        if (op.hasSelfSpecification()) {
            op.resolveSelfSpecification(createCBForVaryingUpdate());
        }
        if (op.hasSpecifiedUpdateColumn()) {
            op.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    protected LdAuthorCB createCBForVaryingUpdate() {
        LdAuthorCB cb = newMyConditionBean();
        cb.xsetupForVaryingUpdate();
        return cb;
    }

    protected LdAuthorCB createCBForSpecifiedUpdate() {
        LdAuthorCB cb = newMyConditionBean();
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
     * LdAuthor author = new LdAuthor();
     * author.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * author.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//author.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//author.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//author.setVersionNo(value);</span>
     * authorBhv.<span style="color: #FD4747">updateNonstrict</span>(author);
     * </pre>
     * @param author The entity of update target. (NotNull, PrimaryKeyNotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void updateNonstrict(final LdAuthor author) {
        doUpdateNonstrict(author, null);
    }

    protected void doUpdateNonstrict(LdAuthor author, final UpdateOption<LdAuthorCB> op) {
        assertObjectNotNull("author", author);
        prepareUpdateOption(op);
        helpUpdateNonstrictInternally(author, new InternalUpdateNonstrictCallback<LdAuthor>() {
            public int callbackDelegateUpdateNonstrict(LdAuthor et) { return delegateUpdateNonstrict(et, op); } });
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
     * @param author The entity of insert or update target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(LdAuthor author) {
        doInesrtOrUpdate(author, null, null);
    }

    protected void doInesrtOrUpdate(LdAuthor author, final InsertOption<LdAuthorCB> iop, final UpdateOption<LdAuthorCB> uop) {
        helpInsertOrUpdateInternally(author, new InternalInsertOrUpdateCallback<LdAuthor, LdAuthorCB>() {
            public void callbackInsert(LdAuthor et) { doInsert(et, iop); }
            public void callbackUpdate(LdAuthor et) { doUpdate(et, uop); }
            public LdAuthorCB callbackNewMyConditionBean() { return newMyConditionBean(); }
            public int callbackSelectCount(LdAuthorCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrModify(Entity et, InsertOption<? extends ConditionBean> iop, UpdateOption<? extends ConditionBean> uop) {
        if (iop == null && uop == null) { insertOrUpdate(downcast(et)); }
        else {
            iop = iop != null ? iop : new InsertOption<LdAuthorCB>();
            uop = uop != null ? uop : new UpdateOption<LdAuthorCB>();
            varyingInsertOrUpdate(downcast(et), downcast(iop), downcast(uop));
        }
    }

    /**
     * Insert or update the entity non-strictly modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br />
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() }
     * <p><span style="color: #FD4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param author The entity of insert or update target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdateNonstrict(LdAuthor author) {
        doInesrtOrUpdateNonstrict(author, null, null);
    }

    protected void doInesrtOrUpdateNonstrict(LdAuthor author, final InsertOption<LdAuthorCB> iop, final UpdateOption<LdAuthorCB> uop) {
        helpInsertOrUpdateInternally(author, new InternalInsertOrUpdateNonstrictCallback<LdAuthor>() {
            public void callbackInsert(LdAuthor et) { doInsert(et, iop); }
            public void callbackUpdateNonstrict(LdAuthor et) { doUpdateNonstrict(et, uop); }
        });
    }

    @Override
    protected void doCreateOrModifyNonstrict(Entity et, InsertOption<? extends ConditionBean> iop, UpdateOption<? extends ConditionBean> uop) {
        if (iop == null && uop == null) { insertOrUpdateNonstrict(downcast(et)); }
        else {
            iop = iop != null ? iop : new InsertOption<LdAuthorCB>();
            uop = uop != null ? uop : new UpdateOption<LdAuthorCB>();
            varyingInsertOrUpdateNonstrict(downcast(et), downcast(iop), downcast(uop));
        }
    }

    /**
     * Delete the entity. (ZeroUpdateException, ExclusiveControl)
     * <pre>
     * LdAuthor author = new LdAuthor();
     * author.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * author.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     authorBhv.<span style="color: #FD4747">delete</span>(author);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param author The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(LdAuthor author) {
        doDelete(author, null);
    }

    protected void doDelete(LdAuthor author, final DeleteOption<LdAuthorCB> op) {
        assertObjectNotNull("author", author);
        prepareDeleteOption(op);
        helpDeleteInternally(author, new InternalDeleteCallback<LdAuthor>() {
            public int callbackDelegateDelete(LdAuthor et) { return delegateDelete(et, op); } });
    }

    protected void prepareDeleteOption(DeleteOption<LdAuthorCB> op) {
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
     * LdAuthor author = new LdAuthor();
     * author.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//author.setVersionNo(value);</span>
     * authorBhv.<span style="color: #FD4747">deleteNonstrict</span>(author);
     * </pre>
     * @param author The entity of delete target. (NotNull, PrimaryKeyNotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrict(LdAuthor author) {
        doDeleteNonstrict(author, null);
    }

    protected void doDeleteNonstrict(LdAuthor author, final DeleteOption<LdAuthorCB> op) {
        assertObjectNotNull("author", author);
        prepareDeleteOption(op);
        helpDeleteNonstrictInternally(author, new InternalDeleteNonstrictCallback<LdAuthor>() {
            public int callbackDelegateDeleteNonstrict(LdAuthor et) { return delegateDeleteNonstrict(et, op); } });
    }

    /**
     * Delete the entity non-strictly ignoring deleted. {ZeroUpdateException, NonExclusiveControl}
     * <pre>
     * LdAuthor author = new LdAuthor();
     * author.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//author.setVersionNo(value);</span>
     * authorBhv.<span style="color: #FD4747">deleteNonstrictIgnoreDeleted</span>(author);
     * <span style="color: #3F7E5E">// if the target entity doesn't exist, no exception</span>
     * </pre>
     * @param author The entity of delete target. (NotNull, PrimaryKeyNotNull)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrictIgnoreDeleted(LdAuthor author) {
        doDeleteNonstrictIgnoreDeleted(author, null);
    }

    protected void doDeleteNonstrictIgnoreDeleted(LdAuthor author, final DeleteOption<LdAuthorCB> op) {
        assertObjectNotNull("author", author);
        prepareDeleteOption(op);
        helpDeleteNonstrictIgnoreDeletedInternally(author, new InternalDeleteNonstrictIgnoreDeletedCallback<LdAuthor>() {
            public int callbackDelegateDeleteNonstrict(LdAuthor et) { return delegateDeleteNonstrict(et, op); } });
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
     *     LdAuthor author = new LdAuthor();
     *     author.setFooName("foo");
     *     if (...) {
     *         author.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     authorList.add(author);
     * }
     * authorBhv.<span style="color: #FD4747">batchInsert</span>(authorList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param authorList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<LdAuthor> authorList) {
        InsertOption<LdAuthorCB> op = createInsertUpdateOption();
        return doBatchInsert(authorList, op);
    }

    protected int[] doBatchInsert(List<LdAuthor> authorList, InsertOption<LdAuthorCB> op) {
        assertObjectNotNull("authorList", authorList);
        prepareBatchInsertOption(authorList, op);
        return delegateBatchInsert(authorList, op);
    }

    protected void prepareBatchInsertOption(List<LdAuthor> authorList, InsertOption<LdAuthorCB> op) {
        op.xallowInsertColumnModifiedPropertiesFragmented();
        op.xacceptInsertColumnModifiedPropertiesIfNeeds(authorList);
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
     *     LdAuthor author = new LdAuthor();
     *     author.setFooName("foo");
     *     if (...) {
     *         author.setFooPrice(123);
     *     } else {
     *         author.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//author.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     authorList.add(author);
     * }
     * authorBhv.<span style="color: #FD4747">batchUpdate</span>(authorList);
     * </pre>
     * @param authorList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<LdAuthor> authorList) {
        UpdateOption<LdAuthorCB> op = createPlainUpdateOption();
        return doBatchUpdate(authorList, op);
    }

    protected int[] doBatchUpdate(List<LdAuthor> authorList, UpdateOption<LdAuthorCB> op) {
        assertObjectNotNull("authorList", authorList);
        prepareBatchUpdateOption(authorList, op);
        return delegateBatchUpdate(authorList, op);
    }

    protected void prepareBatchUpdateOption(List<LdAuthor> authorList, UpdateOption<LdAuthorCB> op) {
        op.xacceptUpdateColumnModifiedPropertiesIfNeeds(authorList);
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
     * authorBhv.<span style="color: #FD4747">batchUpdate</span>(authorList, new SpecifyQuery<LdAuthorCB>() {
     *     public void specify(LdAuthorCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #FD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #FD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * authorBhv.<span style="color: #FD4747">batchUpdate</span>(authorList, new SpecifyQuery<LdAuthorCB>() {
     *     public void specify(LdAuthorCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #FD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param authorList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<LdAuthor> authorList, SpecifyQuery<LdAuthorCB> updateColumnSpec) {
        return doBatchUpdate(authorList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    /**
     * Batch-update the entity list non-strictly modified-only of same-set columns. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <span style="color: #FD4747; font-size: 140%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     LdAuthor author = new LdAuthor();
     *     author.setFooName("foo");
     *     if (...) {
     *         author.setFooPrice(123);
     *     } else {
     *         author.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//author.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     authorList.add(author);
     * }
     * authorBhv.<span style="color: #FD4747">batchUpdate</span>(authorList);
     * </pre>
     * @param authorList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<LdAuthor> authorList) {
        UpdateOption<LdAuthorCB> option = createPlainUpdateOption();
        return doBatchUpdateNonstrict(authorList, option);
    }

    protected int[] doBatchUpdateNonstrict(List<LdAuthor> authorList, UpdateOption<LdAuthorCB> op) {
        assertObjectNotNull("authorList", authorList);
        prepareBatchUpdateOption(authorList, op);
        return delegateBatchUpdateNonstrict(authorList, op);
    }

    /**
     * Batch-update the entity list non-strictly specified-only. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * authorBhv.<span style="color: #FD4747">batchUpdateNonstrict</span>(authorList, new SpecifyQuery<LdAuthorCB>() {
     *     public void specify(LdAuthorCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #FD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #FD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * authorBhv.<span style="color: #FD4747">batchUpdateNonstrict</span>(authorList, new SpecifyQuery<LdAuthorCB>() {
     *     public void specify(LdAuthorCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #FD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).</p>
     * @param authorList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<LdAuthor> authorList, SpecifyQuery<LdAuthorCB> updateColumnSpec) {
        return doBatchUpdateNonstrict(authorList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> op) {
        if (op == null) { return batchUpdateNonstrict(downcast(ls)); }
        else { return varyingBatchUpdateNonstrict(downcast(ls), downcast(op)); }
    }

    /**
     * Batch-delete the entity list. (ExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param authorList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchDelete(List<LdAuthor> authorList) {
        return doBatchDelete(authorList, null);
    }

    protected int[] doBatchDelete(List<LdAuthor> authorList, DeleteOption<LdAuthorCB> op) {
        assertObjectNotNull("authorList", authorList);
        prepareDeleteOption(op);
        return delegateBatchDelete(authorList, op);
    }

    @Override
    protected int[] doLumpRemove(List<Entity> ls, DeleteOption<? extends ConditionBean> op) {
        if (op == null) { return batchDelete(downcast(ls)); }
        else { return varyingBatchDelete(downcast(ls), downcast(op)); }
    }

    /**
     * Batch-delete the entity list non-strictly. {NonExclusiveControl} <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param authorList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDeleteNonstrict(List<LdAuthor> authorList) {
        return doBatchDeleteNonstrict(authorList, null);
    }

    protected int[] doBatchDeleteNonstrict(List<LdAuthor> authorList, DeleteOption<LdAuthorCB> op) {
        assertObjectNotNull("authorList", authorList);
        prepareDeleteOption(op);
        return delegateBatchDeleteNonstrict(authorList, op);
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
     * authorBhv.<span style="color: #FD4747">queryInsert</span>(new QueryInsertSetupper&lt;LdAuthor, LdAuthorCB&gt;() {
     *     public ConditionBean setup(author entity, LdAuthorCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<LdAuthor, LdAuthorCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(QueryInsertSetupper<LdAuthor, LdAuthorCB> sp, InsertOption<LdAuthorCB> op) {
        assertObjectNotNull("setupper", sp);
        prepareInsertOption(op);
        LdAuthor e = new LdAuthor();
        LdAuthorCB cb = createCBForQueryInsert();
        return delegateQueryInsert(e, cb, sp.setup(e, cb), op);
    }

    protected LdAuthorCB createCBForQueryInsert() {
        LdAuthorCB cb = newMyConditionBean();
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
     * LdAuthor author = new LdAuthor();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//author.setPK...(value);</span>
     * author.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//author.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//author.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//author.setVersionNo(value);</span>
     * LdAuthorCB cb = new LdAuthorCB();
     * cb.query().setFoo...(value);
     * authorBhv.<span style="color: #FD4747">queryUpdate</span>(author, cb);
     * </pre>
     * @param author The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of LdAuthor. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(LdAuthor author, LdAuthorCB cb) {
        return doQueryUpdate(author, cb, null);
    }

    protected int doQueryUpdate(LdAuthor author, LdAuthorCB cb, UpdateOption<LdAuthorCB> op) {
        assertObjectNotNull("author", author); assertCBStateValid(cb);
        prepareUpdateOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryUpdate(author, cb, op) : 0;
    }

    @Override
    protected int doRangeModify(Entity et, ConditionBean cb, UpdateOption<? extends ConditionBean> op) {
        if (op == null) { return queryUpdate(downcast(et), (LdAuthorCB)cb); }
        else { return varyingQueryUpdate(downcast(et), (LdAuthorCB)cb, downcast(op)); }
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * LdAuthorCB cb = new LdAuthorCB();
     * cb.query().setFoo...(value);
     * authorBhv.<span style="color: #FD4747">queryDelete</span>(author, cb);
     * </pre>
     * @param cb The condition-bean of LdAuthor. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(LdAuthorCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(LdAuthorCB cb, DeleteOption<LdAuthorCB> op) {
        assertCBStateValid(cb);
        prepareDeleteOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryDelete(cb, op) : 0;
    }

    @Override
    protected int doRangeRemove(ConditionBean cb, DeleteOption<? extends ConditionBean> op) {
        if (op == null) { return queryDelete((LdAuthorCB)cb); }
        else { return varyingQueryDelete((LdAuthorCB)cb, downcast(op)); }
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
     * LdAuthor author = new LdAuthor();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * author.setFoo...(value);
     * author.setBar...(value);
     * InsertOption<LdAuthorCB> option = new InsertOption<LdAuthorCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * authorBhv.<span style="color: #FD4747">varyingInsert</span>(author, option);
     * ... = author.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param author The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(LdAuthor author, InsertOption<LdAuthorCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(author, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, ExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * LdAuthor author = new LdAuthor();
     * author.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * author.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * author.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;LdAuthorCB&gt; option = new UpdateOption&lt;LdAuthorCB&gt;();
     *     option.self(new SpecifyQuery&lt;LdAuthorCB&gt;() {
     *         public void specify(LdAuthorCB cb) {
     *             cb.specify().<span style="color: #FD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     authorBhv.<span style="color: #FD4747">varyingUpdate</span>(author, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param author The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(LdAuthor author, UpdateOption<LdAuthorCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(author, option);
    }

    /**
     * Update the entity with varying requests non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as updateNonstrict(entity).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * LdAuthor author = new LdAuthor();
     * author.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * author.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//author.setVersionNo(value);</span>
     * UpdateOption&lt;LdAuthorCB&gt; option = new UpdateOption&lt;LdAuthorCB&gt;();
     * option.self(new SpecifyQuery&lt;LdAuthorCB&gt;() {
     *     public void specify(LdAuthorCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * authorBhv.<span style="color: #FD4747">varyingUpdateNonstrict</span>(author, option);
     * </pre>
     * @param author The entity of update target. (NotNull, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdateNonstrict(LdAuthor author, UpdateOption<LdAuthorCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdateNonstrict(author, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param author The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(LdAuthor author, InsertOption<LdAuthorCB> insertOption, UpdateOption<LdAuthorCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdate(author, insertOption, updateOption);
    }

    /**
     * Insert or update the entity with varying requests non-strictly. (NonExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdateNonstrict(entity).
     * @param author The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdateNonstrict(LdAuthor author, InsertOption<LdAuthorCB> insertOption, UpdateOption<LdAuthorCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdateNonstrict(author, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, ExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param author The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(LdAuthor author, DeleteOption<LdAuthorCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(author, option);
    }

    /**
     * Delete the entity with varying requests non-strictly. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as deleteNonstrict(entity).
     * @param author The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDeleteNonstrict(LdAuthor author, DeleteOption<LdAuthorCB> option) {
        assertDeleteOptionNotNull(option);
        doDeleteNonstrict(author, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param authorList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<LdAuthor> authorList, InsertOption<LdAuthorCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(authorList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param authorList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<LdAuthor> authorList, UpdateOption<LdAuthorCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(authorList, option);
    }

    /**
     * Batch-update the list with varying requests non-strictly. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param authorList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdateNonstrict(List<LdAuthor> authorList, UpdateOption<LdAuthorCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdateNonstrict(authorList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param authorList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<LdAuthor> authorList, DeleteOption<LdAuthorCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(authorList, option);
    }

    /**
     * Batch-delete the list with varying requests non-strictly. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDeleteNonstrict(entityList).
     * @param authorList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDeleteNonstrict(List<LdAuthor> authorList, DeleteOption<LdAuthorCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDeleteNonstrict(authorList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<LdAuthor, LdAuthorCB> setupper, InsertOption<LdAuthorCB> option) {
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
     * LdAuthor author = new LdAuthor();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//author.setPK...(value);</span>
     * author.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//author.setVersionNo(value);</span>
     * LdAuthorCB cb = new LdAuthorCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;LdAuthorCB&gt; option = new UpdateOption&lt;LdAuthorCB&gt;();
     * option.self(new SpecifyQuery&lt;LdAuthorCB&gt;() {
     *     public void specify(LdAuthorCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * authorBhv.<span style="color: #FD4747">varyingQueryUpdate</span>(author, cb, option);
     * </pre>
     * @param author The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of LdAuthor. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(LdAuthor author, LdAuthorCB cb, UpdateOption<LdAuthorCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(author, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of LdAuthor. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(LdAuthorCB cb, DeleteOption<LdAuthorCB> option) {
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
    public OutsideSqlBasicExecutor<LdAuthorBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCountUniquely(LdAuthorCB cb) { return invoke(createSelectCountCBCommand(cb, true)); }
    protected int delegateSelectCountPlainly(LdAuthorCB cb) { return invoke(createSelectCountCBCommand(cb, false)); }
    protected <ENTITY extends LdAuthor> void delegateSelectCursor(LdAuthorCB cb, EntityRowHandler<ENTITY> rh, Class<ENTITY> tp)
    { invoke(createSelectCursorCBCommand(cb, rh, tp)); }
    protected <ENTITY extends LdAuthor> List<ENTITY> delegateSelectList(LdAuthorCB cb, Class<ENTITY> tp)
    { return invoke(createSelectListCBCommand(cb, tp)); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(LdAuthor et, InsertOption<LdAuthorCB> op)
    { if (!processBeforeInsert(et, op)) { return 0; }
      return invoke(createInsertEntityCommand(et, op)); }
    protected int delegateUpdate(LdAuthor et, UpdateOption<LdAuthorCB> op)
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return invoke(createUpdateEntityCommand(et, op)); }
    protected int delegateUpdateNonstrict(LdAuthor et, UpdateOption<LdAuthorCB> op)
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return invoke(createUpdateNonstrictEntityCommand(et, op)); }
    protected int delegateDelete(LdAuthor et, DeleteOption<LdAuthorCB> op)
    { if (!processBeforeDelete(et, op)) { return 0; }
      return invoke(createDeleteEntityCommand(et, op)); }
    protected int delegateDeleteNonstrict(LdAuthor et, DeleteOption<LdAuthorCB> op)
    { if (!processBeforeDelete(et, op)) { return 0; }
      return invoke(createDeleteNonstrictEntityCommand(et, op)); }

    protected int[] delegateBatchInsert(List<LdAuthor> ls, InsertOption<LdAuthorCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchInsertCommand(processBatchInternally(ls, op), op)); }
    protected int[] delegateBatchUpdate(List<LdAuthor> ls, UpdateOption<LdAuthorCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateCommand(processBatchInternally(ls, op, false), op)); }
    protected int[] delegateBatchUpdateNonstrict(List<LdAuthor> ls, UpdateOption<LdAuthorCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateNonstrictCommand(processBatchInternally(ls, op, true), op)); }
    protected int[] delegateBatchDelete(List<LdAuthor> ls, DeleteOption<LdAuthorCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteCommand(processBatchInternally(ls, op, false), op)); }
    protected int[] delegateBatchDeleteNonstrict(List<LdAuthor> ls, DeleteOption<LdAuthorCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteNonstrictCommand(processBatchInternally(ls, op, true), op)); }

    protected int delegateQueryInsert(LdAuthor et, LdAuthorCB inCB, ConditionBean resCB, InsertOption<LdAuthorCB> op)
    { if (!processBeforeQueryInsert(et, inCB, resCB, op)) { return 0; } return invoke(createQueryInsertCBCommand(et, inCB, resCB, op));  }
    protected int delegateQueryUpdate(LdAuthor et, LdAuthorCB cb, UpdateOption<LdAuthorCB> op)
    { if (!processBeforeQueryUpdate(et, cb, op)) { return 0; } return invoke(createQueryUpdateCBCommand(et, cb, op));  }
    protected int delegateQueryDelete(LdAuthorCB cb, DeleteOption<LdAuthorCB> op)
    { if (!processBeforeQueryDelete(cb, op)) { return 0; } return invoke(createQueryDeleteCBCommand(cb, op));  }

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
    protected LdAuthor downcast(Entity et) {
        return helpEntityDowncastInternally(et, LdAuthor.class);
    }

    protected LdAuthorCB downcast(ConditionBean cb) {
        return helpConditionBeanDowncastInternally(cb, LdAuthorCB.class);
    }

    @SuppressWarnings("unchecked")
    protected List<LdAuthor> downcast(List<? extends Entity> ls) {
        return (List<LdAuthor>)ls;
    }

    @SuppressWarnings("unchecked")
    protected InsertOption<LdAuthorCB> downcast(InsertOption<? extends ConditionBean> op) {
        return (InsertOption<LdAuthorCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected UpdateOption<LdAuthorCB> downcast(UpdateOption<? extends ConditionBean> op) {
        return (UpdateOption<LdAuthorCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected DeleteOption<LdAuthorCB> downcast(DeleteOption<? extends ConditionBean> op) {
        return (DeleteOption<LdAuthorCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<LdAuthor, LdAuthorCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> sp) {
        return (QueryInsertSetupper<LdAuthor, LdAuthorCB>)sp;
    }
}
