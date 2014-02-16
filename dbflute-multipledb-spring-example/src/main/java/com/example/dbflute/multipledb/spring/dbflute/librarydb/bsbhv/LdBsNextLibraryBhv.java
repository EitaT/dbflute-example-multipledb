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
 * The behavior of NEXT_LIBRARY as TABLE. <br />
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
public abstract class LdBsNextLibraryBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "NEXT_LIBRARY"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public DBMeta getDBMeta() { return LdNextLibraryDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public LdNextLibraryDbm getMyDBMeta() { return LdNextLibraryDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public Entity newEntity() { return newMyEntity(); }

    /** {@inheritDoc} */
    public ConditionBean newConditionBean() { return newMyConditionBean(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public LdNextLibrary newMyEntity() { return new LdNextLibrary(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public LdNextLibraryCB newMyConditionBean() { return new LdNextLibraryCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * LdNextLibraryCB cb = new LdNextLibraryCB();
     * cb.query().setFoo...(value);
     * int count = nextLibraryBhv.<span style="color: #FD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of LdNextLibrary. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(LdNextLibraryCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(LdNextLibraryCB cb) { // called by selectCount(cb)
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(LdNextLibraryCB cb) { // called by selectPage(cb)
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
     * LdNextLibraryCB cb = new LdNextLibraryCB();
     * cb.query().setFoo...(value);
     * LdNextLibrary nextLibrary = nextLibraryBhv.<span style="color: #FD4747">selectEntity</span>(cb);
     * if (nextLibrary != null) {
     *     ... = nextLibrary.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of LdNextLibrary. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public LdNextLibrary selectEntity(LdNextLibraryCB cb) {
        return doSelectEntity(cb, LdNextLibrary.class);
    }

    protected <ENTITY extends LdNextLibrary> ENTITY doSelectEntity(final LdNextLibraryCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb);
        return helpSelectEntityInternally(cb, tp, new InternalSelectEntityCallback<ENTITY, LdNextLibraryCB>() {
            public List<ENTITY> callbackSelectList(LdNextLibraryCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); } });
    }

    @Override
    protected Entity doReadEntity(ConditionBean cb) {
        return selectEntity(downcast(cb));
    }

    /**
     * Select the entity by the condition-bean with deleted check.
     * <pre>
     * LdNextLibraryCB cb = new LdNextLibraryCB();
     * cb.query().setFoo...(value);
     * LdNextLibrary nextLibrary = nextLibraryBhv.<span style="color: #FD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = nextLibrary.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of LdNextLibrary. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public LdNextLibrary selectEntityWithDeletedCheck(LdNextLibraryCB cb) {
        return doSelectEntityWithDeletedCheck(cb, LdNextLibrary.class);
    }

    protected <ENTITY extends LdNextLibrary> ENTITY doSelectEntityWithDeletedCheck(final LdNextLibraryCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb);
        return helpSelectEntityWithDeletedCheckInternally(cb, tp, new InternalSelectEntityWithDeletedCheckCallback<ENTITY, LdNextLibraryCB>() {
            public List<ENTITY> callbackSelectList(LdNextLibraryCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); } });
    }

    @Override
    protected Entity doReadEntityWithDeletedCheck(ConditionBean cb) {
        return selectEntityWithDeletedCheck(downcast(cb));
    }

    /**
     * Select the entity by the primary-key value.
     * @param libraryId The one of primary key. (NotNull)
     * @param nextLibraryId The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public LdNextLibrary selectByPKValue(Integer libraryId, Integer nextLibraryId) {
        return doSelectByPKValue(libraryId, nextLibraryId, LdNextLibrary.class);
    }

    protected <ENTITY extends LdNextLibrary> ENTITY doSelectByPKValue(Integer libraryId, Integer nextLibraryId, Class<ENTITY> entityType) {
        return doSelectEntity(buildPKCB(libraryId, nextLibraryId), entityType);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param libraryId The one of primary key. (NotNull)
     * @param nextLibraryId The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public LdNextLibrary selectByPKValueWithDeletedCheck(Integer libraryId, Integer nextLibraryId) {
        return doSelectByPKValueWithDeletedCheck(libraryId, nextLibraryId, LdNextLibrary.class);
    }

    protected <ENTITY extends LdNextLibrary> ENTITY doSelectByPKValueWithDeletedCheck(Integer libraryId, Integer nextLibraryId, Class<ENTITY> entityType) {
        return doSelectEntityWithDeletedCheck(buildPKCB(libraryId, nextLibraryId), entityType);
    }

    private LdNextLibraryCB buildPKCB(Integer libraryId, Integer nextLibraryId) {
        assertObjectNotNull("libraryId", libraryId);assertObjectNotNull("nextLibraryId", nextLibraryId);
        LdNextLibraryCB cb = newMyConditionBean();
        cb.query().setLibraryId_Equal(libraryId);cb.query().setNextLibraryId_Equal(nextLibraryId);
        return cb;
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * LdNextLibraryCB cb = new LdNextLibraryCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;LdNextLibrary&gt; nextLibraryList = nextLibraryBhv.<span style="color: #FD4747">selectList</span>(cb);
     * for (LdNextLibrary nextLibrary : nextLibraryList) {
     *     ... = nextLibrary.get...();
     * }
     * </pre>
     * @param cb The condition-bean of LdNextLibrary. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<LdNextLibrary> selectList(LdNextLibraryCB cb) {
        return doSelectList(cb, LdNextLibrary.class);
    }

    protected <ENTITY extends LdNextLibrary> ListResultBean<ENTITY> doSelectList(LdNextLibraryCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        return helpSelectListInternally(cb, tp, new InternalSelectListCallback<ENTITY, LdNextLibraryCB>() {
            public List<ENTITY> callbackSelectList(LdNextLibraryCB cb, Class<ENTITY> tp) { return delegateSelectList(cb, tp); } });
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
     * LdNextLibraryCB cb = new LdNextLibraryCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #FD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;LdNextLibrary&gt; page = nextLibraryBhv.<span style="color: #FD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (LdNextLibrary nextLibrary : page) {
     *     ... = nextLibrary.get...();
     * }
     * </pre>
     * @param cb The condition-bean of LdNextLibrary. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<LdNextLibrary> selectPage(LdNextLibraryCB cb) {
        return doSelectPage(cb, LdNextLibrary.class);
    }

    protected <ENTITY extends LdNextLibrary> PagingResultBean<ENTITY> doSelectPage(LdNextLibraryCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectPageInternally(cb, tp, new InternalSelectPageCallback<ENTITY, LdNextLibraryCB>() {
            public int callbackSelectCount(LdNextLibraryCB cb) { return doSelectCountPlainly(cb); }
            public List<ENTITY> callbackSelectList(LdNextLibraryCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); }
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
     * LdNextLibraryCB cb = new LdNextLibraryCB();
     * cb.query().setFoo...(value);
     * nextLibraryBhv.<span style="color: #FD4747">selectCursor</span>(cb, new EntityRowHandler&lt;LdNextLibrary&gt;() {
     *     public void handle(LdNextLibrary entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of LdNextLibrary. (NotNull)
     * @param entityRowHandler The handler of entity row of LdNextLibrary. (NotNull)
     */
    public void selectCursor(LdNextLibraryCB cb, EntityRowHandler<LdNextLibrary> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, LdNextLibrary.class);
    }

    protected <ENTITY extends LdNextLibrary> void doSelectCursor(LdNextLibraryCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler", handler); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        helpSelectCursorInternally(cb, handler, tp, new InternalSelectCursorCallback<ENTITY, LdNextLibraryCB>() {
            public void callbackSelectCursor(LdNextLibraryCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) { delegateSelectCursor(cb, handler, tp); }
            public List<ENTITY> callbackSelectList(LdNextLibraryCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); }
        });
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * nextLibraryBhv.<span style="color: #FD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(LdNextLibraryCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> SLFunction<LdNextLibraryCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
    }

    protected <RESULT, CB extends LdNextLibraryCB> SLFunction<CB, RESULT> doScalarSelect(Class<RESULT> tp, CB cb) {
        assertObjectNotNull("resultType", tp); assertCBStateValid(cb);
        cb.xsetupForScalarSelect(); cb.getSqlClause().disableSelectIndex(); // for when you use union
        return createSLFunction(cb, tp);
    }

    protected <RESULT, CB extends LdNextLibraryCB> SLFunction<CB, RESULT> createSLFunction(CB cb, Class<RESULT> tp) {
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
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'LdLibrary'.
     * @param nextLibraryList The list of nextLibrary. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<LdLibrary> pulloutLibraryByLibraryId(List<LdNextLibrary> nextLibraryList) {
        return helpPulloutInternally(nextLibraryList, new InternalPulloutCallback<LdNextLibrary, LdLibrary>() {
            public LdLibrary getFr(LdNextLibrary et) { return et.getLibraryByLibraryId(); }
            public boolean hasRf() { return true; }
            public void setRfLs(LdLibrary et, List<LdNextLibrary> ls)
            { et.setNextLibraryByLibraryIdList(ls); }
        });
    }
    /**
     * Pull out the list of foreign table 'LdLibrary'.
     * @param nextLibraryList The list of nextLibrary. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<LdLibrary> pulloutLibraryByNextLibraryId(List<LdNextLibrary> nextLibraryList) {
        return helpPulloutInternally(nextLibraryList, new InternalPulloutCallback<LdNextLibrary, LdLibrary>() {
            public LdLibrary getFr(LdNextLibrary et) { return et.getLibraryByNextLibraryId(); }
            public boolean hasRf() { return true; }
            public void setRfLs(LdLibrary et, List<LdNextLibrary> ls)
            { et.setNextLibraryByNextLibraryIdList(ls); }
        });
    }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * LdNextLibrary nextLibrary = new LdNextLibrary();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * nextLibrary.setFoo...(value);
     * nextLibrary.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//nextLibrary.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//nextLibrary.set...;</span>
     * nextLibraryBhv.<span style="color: #FD4747">insert</span>(nextLibrary);
     * ... = nextLibrary.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param nextLibrary The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(LdNextLibrary nextLibrary) {
        doInsert(nextLibrary, null);
    }

    protected void doInsert(LdNextLibrary nextLibrary, InsertOption<LdNextLibraryCB> op) {
        assertObjectNotNull("nextLibrary", nextLibrary);
        prepareInsertOption(op);
        delegateInsert(nextLibrary, op);
    }

    protected void prepareInsertOption(InsertOption<LdNextLibraryCB> op) {
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
     * LdNextLibrary nextLibrary = new LdNextLibrary();
     * nextLibrary.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * nextLibrary.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//nextLibrary.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//nextLibrary.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * nextLibrary.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     nextLibraryBhv.<span style="color: #FD4747">update</span>(nextLibrary);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param nextLibrary The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(final LdNextLibrary nextLibrary) {
        doUpdate(nextLibrary, null);
    }

    protected void doUpdate(LdNextLibrary nextLibrary, final UpdateOption<LdNextLibraryCB> op) {
        assertObjectNotNull("nextLibrary", nextLibrary);
        prepareUpdateOption(op);
        helpUpdateInternally(nextLibrary, new InternalUpdateCallback<LdNextLibrary>() {
            public int callbackDelegateUpdate(LdNextLibrary et) { return delegateUpdate(et, op); } });
    }

    protected void prepareUpdateOption(UpdateOption<LdNextLibraryCB> op) {
        if (op == null) { return; }
        assertUpdateOptionStatus(op);
        if (op.hasSelfSpecification()) {
            op.resolveSelfSpecification(createCBForVaryingUpdate());
        }
        if (op.hasSpecifiedUpdateColumn()) {
            op.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    protected LdNextLibraryCB createCBForVaryingUpdate() {
        LdNextLibraryCB cb = newMyConditionBean();
        cb.xsetupForVaryingUpdate();
        return cb;
    }

    protected LdNextLibraryCB createCBForSpecifiedUpdate() {
        LdNextLibraryCB cb = newMyConditionBean();
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
     * LdNextLibrary nextLibrary = new LdNextLibrary();
     * nextLibrary.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * nextLibrary.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//nextLibrary.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//nextLibrary.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//nextLibrary.setVersionNo(value);</span>
     * nextLibraryBhv.<span style="color: #FD4747">updateNonstrict</span>(nextLibrary);
     * </pre>
     * @param nextLibrary The entity of update target. (NotNull, PrimaryKeyNotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void updateNonstrict(final LdNextLibrary nextLibrary) {
        doUpdateNonstrict(nextLibrary, null);
    }

    protected void doUpdateNonstrict(LdNextLibrary nextLibrary, final UpdateOption<LdNextLibraryCB> op) {
        assertObjectNotNull("nextLibrary", nextLibrary);
        prepareUpdateOption(op);
        helpUpdateNonstrictInternally(nextLibrary, new InternalUpdateNonstrictCallback<LdNextLibrary>() {
            public int callbackDelegateUpdateNonstrict(LdNextLibrary et) { return delegateUpdateNonstrict(et, op); } });
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
     * @param nextLibrary The entity of insert or update target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(LdNextLibrary nextLibrary) {
        doInesrtOrUpdate(nextLibrary, null, null);
    }

    protected void doInesrtOrUpdate(LdNextLibrary nextLibrary, final InsertOption<LdNextLibraryCB> iop, final UpdateOption<LdNextLibraryCB> uop) {
        helpInsertOrUpdateInternally(nextLibrary, new InternalInsertOrUpdateCallback<LdNextLibrary, LdNextLibraryCB>() {
            public void callbackInsert(LdNextLibrary et) { doInsert(et, iop); }
            public void callbackUpdate(LdNextLibrary et) { doUpdate(et, uop); }
            public LdNextLibraryCB callbackNewMyConditionBean() { return newMyConditionBean(); }
            public int callbackSelectCount(LdNextLibraryCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrModify(Entity et, InsertOption<? extends ConditionBean> iop, UpdateOption<? extends ConditionBean> uop) {
        if (iop == null && uop == null) { insertOrUpdate(downcast(et)); }
        else {
            iop = iop != null ? iop : new InsertOption<LdNextLibraryCB>();
            uop = uop != null ? uop : new UpdateOption<LdNextLibraryCB>();
            varyingInsertOrUpdate(downcast(et), downcast(iop), downcast(uop));
        }
    }

    /**
     * Insert or update the entity non-strictly modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br />
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() }
     * <p><span style="color: #FD4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param nextLibrary The entity of insert or update target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdateNonstrict(LdNextLibrary nextLibrary) {
        doInesrtOrUpdateNonstrict(nextLibrary, null, null);
    }

    protected void doInesrtOrUpdateNonstrict(LdNextLibrary nextLibrary, final InsertOption<LdNextLibraryCB> iop, final UpdateOption<LdNextLibraryCB> uop) {
        helpInsertOrUpdateInternally(nextLibrary, new InternalInsertOrUpdateNonstrictCallback<LdNextLibrary>() {
            public void callbackInsert(LdNextLibrary et) { doInsert(et, iop); }
            public void callbackUpdateNonstrict(LdNextLibrary et) { doUpdateNonstrict(et, uop); }
        });
    }

    @Override
    protected void doCreateOrModifyNonstrict(Entity et, InsertOption<? extends ConditionBean> iop, UpdateOption<? extends ConditionBean> uop) {
        if (iop == null && uop == null) { insertOrUpdateNonstrict(downcast(et)); }
        else {
            iop = iop != null ? iop : new InsertOption<LdNextLibraryCB>();
            uop = uop != null ? uop : new UpdateOption<LdNextLibraryCB>();
            varyingInsertOrUpdateNonstrict(downcast(et), downcast(iop), downcast(uop));
        }
    }

    /**
     * Delete the entity. (ZeroUpdateException, ExclusiveControl)
     * <pre>
     * LdNextLibrary nextLibrary = new LdNextLibrary();
     * nextLibrary.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * nextLibrary.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     nextLibraryBhv.<span style="color: #FD4747">delete</span>(nextLibrary);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param nextLibrary The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(LdNextLibrary nextLibrary) {
        doDelete(nextLibrary, null);
    }

    protected void doDelete(LdNextLibrary nextLibrary, final DeleteOption<LdNextLibraryCB> op) {
        assertObjectNotNull("nextLibrary", nextLibrary);
        prepareDeleteOption(op);
        helpDeleteInternally(nextLibrary, new InternalDeleteCallback<LdNextLibrary>() {
            public int callbackDelegateDelete(LdNextLibrary et) { return delegateDelete(et, op); } });
    }

    protected void prepareDeleteOption(DeleteOption<LdNextLibraryCB> op) {
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
     * LdNextLibrary nextLibrary = new LdNextLibrary();
     * nextLibrary.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//nextLibrary.setVersionNo(value);</span>
     * nextLibraryBhv.<span style="color: #FD4747">deleteNonstrict</span>(nextLibrary);
     * </pre>
     * @param nextLibrary The entity of delete target. (NotNull, PrimaryKeyNotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrict(LdNextLibrary nextLibrary) {
        doDeleteNonstrict(nextLibrary, null);
    }

    protected void doDeleteNonstrict(LdNextLibrary nextLibrary, final DeleteOption<LdNextLibraryCB> op) {
        assertObjectNotNull("nextLibrary", nextLibrary);
        prepareDeleteOption(op);
        helpDeleteNonstrictInternally(nextLibrary, new InternalDeleteNonstrictCallback<LdNextLibrary>() {
            public int callbackDelegateDeleteNonstrict(LdNextLibrary et) { return delegateDeleteNonstrict(et, op); } });
    }

    /**
     * Delete the entity non-strictly ignoring deleted. {ZeroUpdateException, NonExclusiveControl}
     * <pre>
     * LdNextLibrary nextLibrary = new LdNextLibrary();
     * nextLibrary.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//nextLibrary.setVersionNo(value);</span>
     * nextLibraryBhv.<span style="color: #FD4747">deleteNonstrictIgnoreDeleted</span>(nextLibrary);
     * <span style="color: #3F7E5E">// if the target entity doesn't exist, no exception</span>
     * </pre>
     * @param nextLibrary The entity of delete target. (NotNull, PrimaryKeyNotNull)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrictIgnoreDeleted(LdNextLibrary nextLibrary) {
        doDeleteNonstrictIgnoreDeleted(nextLibrary, null);
    }

    protected void doDeleteNonstrictIgnoreDeleted(LdNextLibrary nextLibrary, final DeleteOption<LdNextLibraryCB> op) {
        assertObjectNotNull("nextLibrary", nextLibrary);
        prepareDeleteOption(op);
        helpDeleteNonstrictIgnoreDeletedInternally(nextLibrary, new InternalDeleteNonstrictIgnoreDeletedCallback<LdNextLibrary>() {
            public int callbackDelegateDeleteNonstrict(LdNextLibrary et) { return delegateDeleteNonstrict(et, op); } });
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
     *     LdNextLibrary nextLibrary = new LdNextLibrary();
     *     nextLibrary.setFooName("foo");
     *     if (...) {
     *         nextLibrary.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     nextLibraryList.add(nextLibrary);
     * }
     * nextLibraryBhv.<span style="color: #FD4747">batchInsert</span>(nextLibraryList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param nextLibraryList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<LdNextLibrary> nextLibraryList) {
        InsertOption<LdNextLibraryCB> op = createInsertUpdateOption();
        return doBatchInsert(nextLibraryList, op);
    }

    protected int[] doBatchInsert(List<LdNextLibrary> nextLibraryList, InsertOption<LdNextLibraryCB> op) {
        assertObjectNotNull("nextLibraryList", nextLibraryList);
        prepareBatchInsertOption(nextLibraryList, op);
        return delegateBatchInsert(nextLibraryList, op);
    }

    protected void prepareBatchInsertOption(List<LdNextLibrary> nextLibraryList, InsertOption<LdNextLibraryCB> op) {
        op.xallowInsertColumnModifiedPropertiesFragmented();
        op.xacceptInsertColumnModifiedPropertiesIfNeeds(nextLibraryList);
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
     *     LdNextLibrary nextLibrary = new LdNextLibrary();
     *     nextLibrary.setFooName("foo");
     *     if (...) {
     *         nextLibrary.setFooPrice(123);
     *     } else {
     *         nextLibrary.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//nextLibrary.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     nextLibraryList.add(nextLibrary);
     * }
     * nextLibraryBhv.<span style="color: #FD4747">batchUpdate</span>(nextLibraryList);
     * </pre>
     * @param nextLibraryList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<LdNextLibrary> nextLibraryList) {
        UpdateOption<LdNextLibraryCB> op = createPlainUpdateOption();
        return doBatchUpdate(nextLibraryList, op);
    }

    protected int[] doBatchUpdate(List<LdNextLibrary> nextLibraryList, UpdateOption<LdNextLibraryCB> op) {
        assertObjectNotNull("nextLibraryList", nextLibraryList);
        prepareBatchUpdateOption(nextLibraryList, op);
        return delegateBatchUpdate(nextLibraryList, op);
    }

    protected void prepareBatchUpdateOption(List<LdNextLibrary> nextLibraryList, UpdateOption<LdNextLibraryCB> op) {
        op.xacceptUpdateColumnModifiedPropertiesIfNeeds(nextLibraryList);
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
     * nextLibraryBhv.<span style="color: #FD4747">batchUpdate</span>(nextLibraryList, new SpecifyQuery<LdNextLibraryCB>() {
     *     public void specify(LdNextLibraryCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #FD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #FD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * nextLibraryBhv.<span style="color: #FD4747">batchUpdate</span>(nextLibraryList, new SpecifyQuery<LdNextLibraryCB>() {
     *     public void specify(LdNextLibraryCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #FD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param nextLibraryList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<LdNextLibrary> nextLibraryList, SpecifyQuery<LdNextLibraryCB> updateColumnSpec) {
        return doBatchUpdate(nextLibraryList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    /**
     * Batch-update the entity list non-strictly modified-only of same-set columns. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <span style="color: #FD4747; font-size: 140%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     LdNextLibrary nextLibrary = new LdNextLibrary();
     *     nextLibrary.setFooName("foo");
     *     if (...) {
     *         nextLibrary.setFooPrice(123);
     *     } else {
     *         nextLibrary.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//nextLibrary.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     nextLibraryList.add(nextLibrary);
     * }
     * nextLibraryBhv.<span style="color: #FD4747">batchUpdate</span>(nextLibraryList);
     * </pre>
     * @param nextLibraryList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<LdNextLibrary> nextLibraryList) {
        UpdateOption<LdNextLibraryCB> option = createPlainUpdateOption();
        return doBatchUpdateNonstrict(nextLibraryList, option);
    }

    protected int[] doBatchUpdateNonstrict(List<LdNextLibrary> nextLibraryList, UpdateOption<LdNextLibraryCB> op) {
        assertObjectNotNull("nextLibraryList", nextLibraryList);
        prepareBatchUpdateOption(nextLibraryList, op);
        return delegateBatchUpdateNonstrict(nextLibraryList, op);
    }

    /**
     * Batch-update the entity list non-strictly specified-only. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * nextLibraryBhv.<span style="color: #FD4747">batchUpdateNonstrict</span>(nextLibraryList, new SpecifyQuery<LdNextLibraryCB>() {
     *     public void specify(LdNextLibraryCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #FD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #FD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * nextLibraryBhv.<span style="color: #FD4747">batchUpdateNonstrict</span>(nextLibraryList, new SpecifyQuery<LdNextLibraryCB>() {
     *     public void specify(LdNextLibraryCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #FD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).</p>
     * @param nextLibraryList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<LdNextLibrary> nextLibraryList, SpecifyQuery<LdNextLibraryCB> updateColumnSpec) {
        return doBatchUpdateNonstrict(nextLibraryList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> op) {
        if (op == null) { return batchUpdateNonstrict(downcast(ls)); }
        else { return varyingBatchUpdateNonstrict(downcast(ls), downcast(op)); }
    }

    /**
     * Batch-delete the entity list. (ExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param nextLibraryList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchDelete(List<LdNextLibrary> nextLibraryList) {
        return doBatchDelete(nextLibraryList, null);
    }

    protected int[] doBatchDelete(List<LdNextLibrary> nextLibraryList, DeleteOption<LdNextLibraryCB> op) {
        assertObjectNotNull("nextLibraryList", nextLibraryList);
        prepareDeleteOption(op);
        return delegateBatchDelete(nextLibraryList, op);
    }

    @Override
    protected int[] doLumpRemove(List<Entity> ls, DeleteOption<? extends ConditionBean> op) {
        if (op == null) { return batchDelete(downcast(ls)); }
        else { return varyingBatchDelete(downcast(ls), downcast(op)); }
    }

    /**
     * Batch-delete the entity list non-strictly. {NonExclusiveControl} <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param nextLibraryList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDeleteNonstrict(List<LdNextLibrary> nextLibraryList) {
        return doBatchDeleteNonstrict(nextLibraryList, null);
    }

    protected int[] doBatchDeleteNonstrict(List<LdNextLibrary> nextLibraryList, DeleteOption<LdNextLibraryCB> op) {
        assertObjectNotNull("nextLibraryList", nextLibraryList);
        prepareDeleteOption(op);
        return delegateBatchDeleteNonstrict(nextLibraryList, op);
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
     * nextLibraryBhv.<span style="color: #FD4747">queryInsert</span>(new QueryInsertSetupper&lt;LdNextLibrary, LdNextLibraryCB&gt;() {
     *     public ConditionBean setup(nextLibrary entity, LdNextLibraryCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<LdNextLibrary, LdNextLibraryCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(QueryInsertSetupper<LdNextLibrary, LdNextLibraryCB> sp, InsertOption<LdNextLibraryCB> op) {
        assertObjectNotNull("setupper", sp);
        prepareInsertOption(op);
        LdNextLibrary e = new LdNextLibrary();
        LdNextLibraryCB cb = createCBForQueryInsert();
        return delegateQueryInsert(e, cb, sp.setup(e, cb), op);
    }

    protected LdNextLibraryCB createCBForQueryInsert() {
        LdNextLibraryCB cb = newMyConditionBean();
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
     * LdNextLibrary nextLibrary = new LdNextLibrary();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//nextLibrary.setPK...(value);</span>
     * nextLibrary.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//nextLibrary.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//nextLibrary.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//nextLibrary.setVersionNo(value);</span>
     * LdNextLibraryCB cb = new LdNextLibraryCB();
     * cb.query().setFoo...(value);
     * nextLibraryBhv.<span style="color: #FD4747">queryUpdate</span>(nextLibrary, cb);
     * </pre>
     * @param nextLibrary The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of LdNextLibrary. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(LdNextLibrary nextLibrary, LdNextLibraryCB cb) {
        return doQueryUpdate(nextLibrary, cb, null);
    }

    protected int doQueryUpdate(LdNextLibrary nextLibrary, LdNextLibraryCB cb, UpdateOption<LdNextLibraryCB> op) {
        assertObjectNotNull("nextLibrary", nextLibrary); assertCBStateValid(cb);
        prepareUpdateOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryUpdate(nextLibrary, cb, op) : 0;
    }

    @Override
    protected int doRangeModify(Entity et, ConditionBean cb, UpdateOption<? extends ConditionBean> op) {
        if (op == null) { return queryUpdate(downcast(et), (LdNextLibraryCB)cb); }
        else { return varyingQueryUpdate(downcast(et), (LdNextLibraryCB)cb, downcast(op)); }
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * LdNextLibraryCB cb = new LdNextLibraryCB();
     * cb.query().setFoo...(value);
     * nextLibraryBhv.<span style="color: #FD4747">queryDelete</span>(nextLibrary, cb);
     * </pre>
     * @param cb The condition-bean of LdNextLibrary. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(LdNextLibraryCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(LdNextLibraryCB cb, DeleteOption<LdNextLibraryCB> op) {
        assertCBStateValid(cb);
        prepareDeleteOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryDelete(cb, op) : 0;
    }

    @Override
    protected int doRangeRemove(ConditionBean cb, DeleteOption<? extends ConditionBean> op) {
        if (op == null) { return queryDelete((LdNextLibraryCB)cb); }
        else { return varyingQueryDelete((LdNextLibraryCB)cb, downcast(op)); }
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
     * LdNextLibrary nextLibrary = new LdNextLibrary();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * nextLibrary.setFoo...(value);
     * nextLibrary.setBar...(value);
     * InsertOption<LdNextLibraryCB> option = new InsertOption<LdNextLibraryCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * nextLibraryBhv.<span style="color: #FD4747">varyingInsert</span>(nextLibrary, option);
     * ... = nextLibrary.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param nextLibrary The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(LdNextLibrary nextLibrary, InsertOption<LdNextLibraryCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(nextLibrary, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, ExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * LdNextLibrary nextLibrary = new LdNextLibrary();
     * nextLibrary.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * nextLibrary.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * nextLibrary.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;LdNextLibraryCB&gt; option = new UpdateOption&lt;LdNextLibraryCB&gt;();
     *     option.self(new SpecifyQuery&lt;LdNextLibraryCB&gt;() {
     *         public void specify(LdNextLibraryCB cb) {
     *             cb.specify().<span style="color: #FD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     nextLibraryBhv.<span style="color: #FD4747">varyingUpdate</span>(nextLibrary, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param nextLibrary The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(LdNextLibrary nextLibrary, UpdateOption<LdNextLibraryCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(nextLibrary, option);
    }

    /**
     * Update the entity with varying requests non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as updateNonstrict(entity).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * LdNextLibrary nextLibrary = new LdNextLibrary();
     * nextLibrary.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * nextLibrary.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//nextLibrary.setVersionNo(value);</span>
     * UpdateOption&lt;LdNextLibraryCB&gt; option = new UpdateOption&lt;LdNextLibraryCB&gt;();
     * option.self(new SpecifyQuery&lt;LdNextLibraryCB&gt;() {
     *     public void specify(LdNextLibraryCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * nextLibraryBhv.<span style="color: #FD4747">varyingUpdateNonstrict</span>(nextLibrary, option);
     * </pre>
     * @param nextLibrary The entity of update target. (NotNull, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdateNonstrict(LdNextLibrary nextLibrary, UpdateOption<LdNextLibraryCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdateNonstrict(nextLibrary, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param nextLibrary The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(LdNextLibrary nextLibrary, InsertOption<LdNextLibraryCB> insertOption, UpdateOption<LdNextLibraryCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdate(nextLibrary, insertOption, updateOption);
    }

    /**
     * Insert or update the entity with varying requests non-strictly. (NonExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdateNonstrict(entity).
     * @param nextLibrary The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdateNonstrict(LdNextLibrary nextLibrary, InsertOption<LdNextLibraryCB> insertOption, UpdateOption<LdNextLibraryCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdateNonstrict(nextLibrary, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, ExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param nextLibrary The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(LdNextLibrary nextLibrary, DeleteOption<LdNextLibraryCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(nextLibrary, option);
    }

    /**
     * Delete the entity with varying requests non-strictly. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as deleteNonstrict(entity).
     * @param nextLibrary The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDeleteNonstrict(LdNextLibrary nextLibrary, DeleteOption<LdNextLibraryCB> option) {
        assertDeleteOptionNotNull(option);
        doDeleteNonstrict(nextLibrary, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param nextLibraryList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<LdNextLibrary> nextLibraryList, InsertOption<LdNextLibraryCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(nextLibraryList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param nextLibraryList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<LdNextLibrary> nextLibraryList, UpdateOption<LdNextLibraryCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(nextLibraryList, option);
    }

    /**
     * Batch-update the list with varying requests non-strictly. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param nextLibraryList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdateNonstrict(List<LdNextLibrary> nextLibraryList, UpdateOption<LdNextLibraryCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdateNonstrict(nextLibraryList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param nextLibraryList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<LdNextLibrary> nextLibraryList, DeleteOption<LdNextLibraryCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(nextLibraryList, option);
    }

    /**
     * Batch-delete the list with varying requests non-strictly. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDeleteNonstrict(entityList).
     * @param nextLibraryList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDeleteNonstrict(List<LdNextLibrary> nextLibraryList, DeleteOption<LdNextLibraryCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDeleteNonstrict(nextLibraryList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<LdNextLibrary, LdNextLibraryCB> setupper, InsertOption<LdNextLibraryCB> option) {
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
     * LdNextLibrary nextLibrary = new LdNextLibrary();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//nextLibrary.setPK...(value);</span>
     * nextLibrary.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//nextLibrary.setVersionNo(value);</span>
     * LdNextLibraryCB cb = new LdNextLibraryCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;LdNextLibraryCB&gt; option = new UpdateOption&lt;LdNextLibraryCB&gt;();
     * option.self(new SpecifyQuery&lt;LdNextLibraryCB&gt;() {
     *     public void specify(LdNextLibraryCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * nextLibraryBhv.<span style="color: #FD4747">varyingQueryUpdate</span>(nextLibrary, cb, option);
     * </pre>
     * @param nextLibrary The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of LdNextLibrary. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(LdNextLibrary nextLibrary, LdNextLibraryCB cb, UpdateOption<LdNextLibraryCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(nextLibrary, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of LdNextLibrary. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(LdNextLibraryCB cb, DeleteOption<LdNextLibraryCB> option) {
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
    public OutsideSqlBasicExecutor<LdNextLibraryBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCountUniquely(LdNextLibraryCB cb) { return invoke(createSelectCountCBCommand(cb, true)); }
    protected int delegateSelectCountPlainly(LdNextLibraryCB cb) { return invoke(createSelectCountCBCommand(cb, false)); }
    protected <ENTITY extends LdNextLibrary> void delegateSelectCursor(LdNextLibraryCB cb, EntityRowHandler<ENTITY> rh, Class<ENTITY> tp)
    { invoke(createSelectCursorCBCommand(cb, rh, tp)); }
    protected <ENTITY extends LdNextLibrary> List<ENTITY> delegateSelectList(LdNextLibraryCB cb, Class<ENTITY> tp)
    { return invoke(createSelectListCBCommand(cb, tp)); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(LdNextLibrary et, InsertOption<LdNextLibraryCB> op)
    { if (!processBeforeInsert(et, op)) { return 0; }
      return invoke(createInsertEntityCommand(et, op)); }
    protected int delegateUpdate(LdNextLibrary et, UpdateOption<LdNextLibraryCB> op)
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return invoke(createUpdateEntityCommand(et, op)); }
    protected int delegateUpdateNonstrict(LdNextLibrary et, UpdateOption<LdNextLibraryCB> op)
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return invoke(createUpdateNonstrictEntityCommand(et, op)); }
    protected int delegateDelete(LdNextLibrary et, DeleteOption<LdNextLibraryCB> op)
    { if (!processBeforeDelete(et, op)) { return 0; }
      return invoke(createDeleteEntityCommand(et, op)); }
    protected int delegateDeleteNonstrict(LdNextLibrary et, DeleteOption<LdNextLibraryCB> op)
    { if (!processBeforeDelete(et, op)) { return 0; }
      return invoke(createDeleteNonstrictEntityCommand(et, op)); }

    protected int[] delegateBatchInsert(List<LdNextLibrary> ls, InsertOption<LdNextLibraryCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchInsertCommand(processBatchInternally(ls, op), op)); }
    protected int[] delegateBatchUpdate(List<LdNextLibrary> ls, UpdateOption<LdNextLibraryCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateCommand(processBatchInternally(ls, op, false), op)); }
    protected int[] delegateBatchUpdateNonstrict(List<LdNextLibrary> ls, UpdateOption<LdNextLibraryCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateNonstrictCommand(processBatchInternally(ls, op, true), op)); }
    protected int[] delegateBatchDelete(List<LdNextLibrary> ls, DeleteOption<LdNextLibraryCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteCommand(processBatchInternally(ls, op, false), op)); }
    protected int[] delegateBatchDeleteNonstrict(List<LdNextLibrary> ls, DeleteOption<LdNextLibraryCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteNonstrictCommand(processBatchInternally(ls, op, true), op)); }

    protected int delegateQueryInsert(LdNextLibrary et, LdNextLibraryCB inCB, ConditionBean resCB, InsertOption<LdNextLibraryCB> op)
    { if (!processBeforeQueryInsert(et, inCB, resCB, op)) { return 0; } return invoke(createQueryInsertCBCommand(et, inCB, resCB, op));  }
    protected int delegateQueryUpdate(LdNextLibrary et, LdNextLibraryCB cb, UpdateOption<LdNextLibraryCB> op)
    { if (!processBeforeQueryUpdate(et, cb, op)) { return 0; } return invoke(createQueryUpdateCBCommand(et, cb, op));  }
    protected int delegateQueryDelete(LdNextLibraryCB cb, DeleteOption<LdNextLibraryCB> op)
    { if (!processBeforeQueryDelete(cb, op)) { return 0; } return invoke(createQueryDeleteCBCommand(cb, op));  }

    // ===================================================================================
    //                                                                     Filter Override
    //                                                                     ===============
    @Override
    protected void filterEntityOfInsert(Entity tgt, InsertOption<? extends ConditionBean> op) {
        super.filterEntityOfInsert(tgt, op);
        LdNextLibrary et = downcast(tgt);
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
    protected LdNextLibrary downcast(Entity et) {
        return helpEntityDowncastInternally(et, LdNextLibrary.class);
    }

    protected LdNextLibraryCB downcast(ConditionBean cb) {
        return helpConditionBeanDowncastInternally(cb, LdNextLibraryCB.class);
    }

    @SuppressWarnings("unchecked")
    protected List<LdNextLibrary> downcast(List<? extends Entity> ls) {
        return (List<LdNextLibrary>)ls;
    }

    @SuppressWarnings("unchecked")
    protected InsertOption<LdNextLibraryCB> downcast(InsertOption<? extends ConditionBean> op) {
        return (InsertOption<LdNextLibraryCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected UpdateOption<LdNextLibraryCB> downcast(UpdateOption<? extends ConditionBean> op) {
        return (UpdateOption<LdNextLibraryCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected DeleteOption<LdNextLibraryCB> downcast(DeleteOption<? extends ConditionBean> op) {
        return (DeleteOption<LdNextLibraryCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<LdNextLibrary, LdNextLibraryCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> sp) {
        return (QueryInsertSetupper<LdNextLibrary, LdNextLibraryCB>)sp;
    }
}
