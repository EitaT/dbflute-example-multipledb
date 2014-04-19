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
 * The behavior of MYSELF_CHECK as TABLE. <br />
 * <pre>
 * [primary key]
 *     MYSELF_CHECK_ID
 *
 * [column]
 *     MYSELF_CHECK_ID, MYSELF_CHECK_NAME, MYSELF_ID
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
 *     MYSELF
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     myself
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class LdBsMyselfCheckBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "MYSELF_CHECK"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public DBMeta getDBMeta() { return LdMyselfCheckDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public LdMyselfCheckDbm getMyDBMeta() { return LdMyselfCheckDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public Entity newEntity() { return newMyEntity(); }

    /** {@inheritDoc} */
    public ConditionBean newConditionBean() { return newMyConditionBean(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public LdMyselfCheck newMyEntity() { return new LdMyselfCheck(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public LdMyselfCheckCB newMyConditionBean() { return new LdMyselfCheckCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * LdMyselfCheckCB cb = new LdMyselfCheckCB();
     * cb.query().setFoo...(value);
     * int count = myselfCheckBhv.<span style="color: #FD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of LdMyselfCheck. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(LdMyselfCheckCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(LdMyselfCheckCB cb) { // called by selectCount(cb)
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(LdMyselfCheckCB cb) { // called by selectPage(cb)
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
     * LdMyselfCheckCB cb = new LdMyselfCheckCB();
     * cb.query().setFoo...(value);
     * LdMyselfCheck myselfCheck = myselfCheckBhv.<span style="color: #FD4747">selectEntity</span>(cb);
     * if (myselfCheck != null) {
     *     ... = myselfCheck.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of LdMyselfCheck. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public LdMyselfCheck selectEntity(LdMyselfCheckCB cb) {
        return doSelectEntity(cb, LdMyselfCheck.class);
    }

    protected <ENTITY extends LdMyselfCheck> ENTITY doSelectEntity(LdMyselfCheckCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectEntityInternally(cb, tp, new InternalSelectEntityCallback<ENTITY, LdMyselfCheckCB>() {
            public List<ENTITY> callbackSelectList(LdMyselfCheckCB lcb, Class<ENTITY> ltp) { return doSelectList(lcb, ltp); } });
    }

    @Override
    protected Entity doReadEntity(ConditionBean cb) {
        return selectEntity(downcast(cb));
    }

    /**
     * Select the entity by the condition-bean with deleted check.
     * <pre>
     * LdMyselfCheckCB cb = new LdMyselfCheckCB();
     * cb.query().setFoo...(value);
     * LdMyselfCheck myselfCheck = myselfCheckBhv.<span style="color: #FD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = myselfCheck.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of LdMyselfCheck. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public LdMyselfCheck selectEntityWithDeletedCheck(LdMyselfCheckCB cb) {
        return doSelectEntityWithDeletedCheck(cb, LdMyselfCheck.class);
    }

    protected <ENTITY extends LdMyselfCheck> ENTITY doSelectEntityWithDeletedCheck(LdMyselfCheckCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectEntityWithDeletedCheckInternally(cb, tp, new InternalSelectEntityWithDeletedCheckCallback<ENTITY, LdMyselfCheckCB>() {
            public List<ENTITY> callbackSelectList(LdMyselfCheckCB lcb, Class<ENTITY> ltp) { return doSelectList(lcb, ltp); } });
    }

    @Override
    protected Entity doReadEntityWithDeletedCheck(ConditionBean cb) {
        return selectEntityWithDeletedCheck(downcast(cb));
    }

    /**
     * Select the entity by the primary-key value.
     * @param myselfCheckId The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public LdMyselfCheck selectByPKValue(Integer myselfCheckId) {
        return doSelectByPKValue(myselfCheckId, LdMyselfCheck.class);
    }

    protected <ENTITY extends LdMyselfCheck> ENTITY doSelectByPKValue(Integer myselfCheckId, Class<ENTITY> entityType) {
        return doSelectEntity(buildPKCB(myselfCheckId), entityType);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param myselfCheckId The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public LdMyselfCheck selectByPKValueWithDeletedCheck(Integer myselfCheckId) {
        return doSelectByPKValueWithDeletedCheck(myselfCheckId, LdMyselfCheck.class);
    }

    protected <ENTITY extends LdMyselfCheck> ENTITY doSelectByPKValueWithDeletedCheck(Integer myselfCheckId, Class<ENTITY> entityType) {
        return doSelectEntityWithDeletedCheck(buildPKCB(myselfCheckId), entityType);
    }

    private LdMyselfCheckCB buildPKCB(Integer myselfCheckId) {
        assertObjectNotNull("myselfCheckId", myselfCheckId);
        LdMyselfCheckCB cb = newMyConditionBean();
        cb.query().setMyselfCheckId_Equal(myselfCheckId);
        return cb;
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * LdMyselfCheckCB cb = new LdMyselfCheckCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;LdMyselfCheck&gt; myselfCheckList = myselfCheckBhv.<span style="color: #FD4747">selectList</span>(cb);
     * for (LdMyselfCheck myselfCheck : myselfCheckList) {
     *     ... = myselfCheck.get...();
     * }
     * </pre>
     * @param cb The condition-bean of LdMyselfCheck. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<LdMyselfCheck> selectList(LdMyselfCheckCB cb) {
        return doSelectList(cb, LdMyselfCheck.class);
    }

    protected <ENTITY extends LdMyselfCheck> ListResultBean<ENTITY> doSelectList(LdMyselfCheckCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        return helpSelectListInternally(cb, tp, new InternalSelectListCallback<ENTITY, LdMyselfCheckCB>() {
            public List<ENTITY> callbackSelectList(LdMyselfCheckCB lcb, Class<ENTITY> ltp) { return delegateSelectList(lcb, ltp); } });
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
     * LdMyselfCheckCB cb = new LdMyselfCheckCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #FD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;LdMyselfCheck&gt; page = myselfCheckBhv.<span style="color: #FD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (LdMyselfCheck myselfCheck : page) {
     *     ... = myselfCheck.get...();
     * }
     * </pre>
     * @param cb The condition-bean of LdMyselfCheck. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<LdMyselfCheck> selectPage(LdMyselfCheckCB cb) {
        return doSelectPage(cb, LdMyselfCheck.class);
    }

    protected <ENTITY extends LdMyselfCheck> PagingResultBean<ENTITY> doSelectPage(LdMyselfCheckCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectPageInternally(cb, tp, new InternalSelectPageCallback<ENTITY, LdMyselfCheckCB>() {
            public int callbackSelectCount(LdMyselfCheckCB cb) { return doSelectCountPlainly(cb); }
            public List<ENTITY> callbackSelectList(LdMyselfCheckCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); }
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
     * LdMyselfCheckCB cb = new LdMyselfCheckCB();
     * cb.query().setFoo...(value);
     * myselfCheckBhv.<span style="color: #FD4747">selectCursor</span>(cb, new EntityRowHandler&lt;LdMyselfCheck&gt;() {
     *     public void handle(LdMyselfCheck entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of LdMyselfCheck. (NotNull)
     * @param entityRowHandler The handler of entity row of LdMyselfCheck. (NotNull)
     */
    public void selectCursor(LdMyselfCheckCB cb, EntityRowHandler<LdMyselfCheck> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, LdMyselfCheck.class);
    }

    protected <ENTITY extends LdMyselfCheck> void doSelectCursor(LdMyselfCheckCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler", handler); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        helpSelectCursorInternally(cb, handler, tp, new InternalSelectCursorCallback<ENTITY, LdMyselfCheckCB>() {
            public void callbackSelectCursor(LdMyselfCheckCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) { delegateSelectCursor(cb, handler, tp); }
            public List<ENTITY> callbackSelectList(LdMyselfCheckCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); }
        });
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * myselfCheckBhv.<span style="color: #FD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(LdMyselfCheckCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> SLFunction<LdMyselfCheckCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
    }

    protected <RESULT, CB extends LdMyselfCheckCB> SLFunction<CB, RESULT> doScalarSelect(Class<RESULT> tp, CB cb) {
        assertObjectNotNull("resultType", tp); assertCBStateValid(cb);
        cb.xsetupForScalarSelect(); cb.getSqlClause().disableSelectIndex(); // for when you use union
        return createSLFunction(cb, tp);
    }

    protected <RESULT, CB extends LdMyselfCheckCB> SLFunction<CB, RESULT> createSLFunction(CB cb, Class<RESULT> tp) {
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
     * Pull out the list of foreign table 'LdMyself'.
     * @param myselfCheckList The list of myselfCheck. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<LdMyself> pulloutMyself(List<LdMyselfCheck> myselfCheckList) {
        return helpPulloutInternally(myselfCheckList, new InternalPulloutCallback<LdMyselfCheck, LdMyself>() {
            public LdMyself getFr(LdMyselfCheck et) { return et.getMyself(); }
            public boolean hasRf() { return true; }
            public void setRfLs(LdMyself et, List<LdMyselfCheck> ls)
            { et.setMyselfCheckList(ls); }
        });
    }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key myselfCheckId.
     * @param myselfCheckList The list of myselfCheck. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Integer> extractMyselfCheckIdList(List<LdMyselfCheck> myselfCheckList) {
        return helpExtractListInternally(myselfCheckList, new InternalExtractCallback<LdMyselfCheck, Integer>() {
            public Integer getCV(LdMyselfCheck et) { return et.getMyselfCheckId(); }
        });
    }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * LdMyselfCheck myselfCheck = new LdMyselfCheck();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * myselfCheck.setFoo...(value);
     * myselfCheck.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//myselfCheck.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//myselfCheck.set...;</span>
     * myselfCheckBhv.<span style="color: #FD4747">insert</span>(myselfCheck);
     * ... = myselfCheck.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param myselfCheck The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(LdMyselfCheck myselfCheck) {
        doInsert(myselfCheck, null);
    }

    protected void doInsert(LdMyselfCheck myselfCheck, InsertOption<LdMyselfCheckCB> op) {
        assertObjectNotNull("myselfCheck", myselfCheck);
        prepareInsertOption(op);
        delegateInsert(myselfCheck, op);
    }

    protected void prepareInsertOption(InsertOption<LdMyselfCheckCB> op) {
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
     * Update the entity modified-only. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * LdMyselfCheck myselfCheck = new LdMyselfCheck();
     * myselfCheck.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * myselfCheck.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//myselfCheck.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//myselfCheck.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * myselfCheck.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     myselfCheckBhv.<span style="color: #FD4747">update</span>(myselfCheck);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param myselfCheck The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(final LdMyselfCheck myselfCheck) {
        doUpdate(myselfCheck, null);
    }

    protected void doUpdate(LdMyselfCheck myselfCheck, final UpdateOption<LdMyselfCheckCB> op) {
        assertObjectNotNull("myselfCheck", myselfCheck);
        prepareUpdateOption(op);
        helpUpdateInternally(myselfCheck, new InternalUpdateCallback<LdMyselfCheck>() {
            public int callbackDelegateUpdate(LdMyselfCheck et) { return delegateUpdate(et, op); } });
    }

    protected void prepareUpdateOption(UpdateOption<LdMyselfCheckCB> op) {
        if (op == null) { return; }
        assertUpdateOptionStatus(op);
        if (op.hasSelfSpecification()) {
            op.resolveSelfSpecification(createCBForVaryingUpdate());
        }
        if (op.hasSpecifiedUpdateColumn()) {
            op.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    protected LdMyselfCheckCB createCBForVaryingUpdate() {
        LdMyselfCheckCB cb = newMyConditionBean();
        cb.xsetupForVaryingUpdate();
        return cb;
    }

    protected LdMyselfCheckCB createCBForSpecifiedUpdate() {
        LdMyselfCheckCB cb = newMyConditionBean();
        cb.xsetupForSpecifiedUpdate();
        return cb;
    }

    @Override
    protected void doModify(Entity et, UpdateOption<? extends ConditionBean> op) {
        if (op == null) { update(downcast(et)); }
        else { varyingUpdate(downcast(et), downcast(op)); }
    }

    @Override
    protected void doModifyNonstrict(Entity et, UpdateOption<? extends ConditionBean> op) {
        doModify(et, op);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br />
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br />
     * <p><span style="color: #FD4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param myselfCheck The entity of insert or update target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(LdMyselfCheck myselfCheck) {
        doInesrtOrUpdate(myselfCheck, null, null);
    }

    protected void doInesrtOrUpdate(LdMyselfCheck myselfCheck, final InsertOption<LdMyselfCheckCB> iop, final UpdateOption<LdMyselfCheckCB> uop) {
        helpInsertOrUpdateInternally(myselfCheck, new InternalInsertOrUpdateCallback<LdMyselfCheck, LdMyselfCheckCB>() {
            public void callbackInsert(LdMyselfCheck et) { doInsert(et, iop); }
            public void callbackUpdate(LdMyselfCheck et) { doUpdate(et, uop); }
            public LdMyselfCheckCB callbackNewMyConditionBean() { return newMyConditionBean(); }
            public int callbackSelectCount(LdMyselfCheckCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrModify(Entity et, InsertOption<? extends ConditionBean> iop, UpdateOption<? extends ConditionBean> uop) {
        if (iop == null && uop == null) { insertOrUpdate(downcast(et)); }
        else {
            iop = iop != null ? iop : new InsertOption<LdMyselfCheckCB>();
            uop = uop != null ? uop : new UpdateOption<LdMyselfCheckCB>();
            varyingInsertOrUpdate(downcast(et), downcast(iop), downcast(uop));
        }
    }

    @Override
    protected void doCreateOrModifyNonstrict(Entity et, InsertOption<? extends ConditionBean> iop, UpdateOption<? extends ConditionBean> uop) {
        doCreateOrModify(et, iop, uop);
    }

    /**
     * Delete the entity. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * LdMyselfCheck myselfCheck = new LdMyselfCheck();
     * myselfCheck.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * myselfCheck.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     myselfCheckBhv.<span style="color: #FD4747">delete</span>(myselfCheck);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param myselfCheck The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(LdMyselfCheck myselfCheck) {
        doDelete(myselfCheck, null);
    }

    protected void doDelete(LdMyselfCheck myselfCheck, final DeleteOption<LdMyselfCheckCB> op) {
        assertObjectNotNull("myselfCheck", myselfCheck);
        prepareDeleteOption(op);
        helpDeleteInternally(myselfCheck, new InternalDeleteCallback<LdMyselfCheck>() {
            public int callbackDelegateDelete(LdMyselfCheck et) { return delegateDelete(et, op); } });
    }

    protected void prepareDeleteOption(DeleteOption<LdMyselfCheckCB> op) {
        if (op == null) { return; }
        assertDeleteOptionStatus(op);
    }

    @Override
    protected void doRemove(Entity et, DeleteOption<? extends ConditionBean> op) {
        if (op == null) { delete(downcast(et)); }
        else { varyingDelete(downcast(et), downcast(op)); }
    }

    @Override
    protected void doRemoveNonstrict(Entity et, DeleteOption<? extends ConditionBean> op) {
        doRemove(et, op);
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
     *     LdMyselfCheck myselfCheck = new LdMyselfCheck();
     *     myselfCheck.setFooName("foo");
     *     if (...) {
     *         myselfCheck.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     myselfCheckList.add(myselfCheck);
     * }
     * myselfCheckBhv.<span style="color: #FD4747">batchInsert</span>(myselfCheckList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param myselfCheckList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<LdMyselfCheck> myselfCheckList) {
        InsertOption<LdMyselfCheckCB> op = createInsertUpdateOption();
        return doBatchInsert(myselfCheckList, op);
    }

    protected int[] doBatchInsert(List<LdMyselfCheck> myselfCheckList, InsertOption<LdMyselfCheckCB> op) {
        assertObjectNotNull("myselfCheckList", myselfCheckList);
        prepareBatchInsertOption(myselfCheckList, op);
        return delegateBatchInsert(myselfCheckList, op);
    }

    protected void prepareBatchInsertOption(List<LdMyselfCheck> myselfCheckList, InsertOption<LdMyselfCheckCB> op) {
        op.xallowInsertColumnModifiedPropertiesFragmented();
        op.xacceptInsertColumnModifiedPropertiesIfNeeds(myselfCheckList);
        prepareInsertOption(op);
    }

    @Override
    protected int[] doLumpCreate(List<Entity> ls, InsertOption<? extends ConditionBean> op) {
        if (op == null) { return batchInsert(downcast(ls)); }
        else { return varyingBatchInsert(downcast(ls), downcast(op)); }
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <span style="color: #FD4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     LdMyselfCheck myselfCheck = new LdMyselfCheck();
     *     myselfCheck.setFooName("foo");
     *     if (...) {
     *         myselfCheck.setFooPrice(123);
     *     } else {
     *         myselfCheck.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//myselfCheck.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     myselfCheckList.add(myselfCheck);
     * }
     * myselfCheckBhv.<span style="color: #FD4747">batchUpdate</span>(myselfCheckList);
     * </pre>
     * @param myselfCheckList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<LdMyselfCheck> myselfCheckList) {
        UpdateOption<LdMyselfCheckCB> op = createPlainUpdateOption();
        return doBatchUpdate(myselfCheckList, op);
    }

    protected int[] doBatchUpdate(List<LdMyselfCheck> myselfCheckList, UpdateOption<LdMyselfCheckCB> op) {
        assertObjectNotNull("myselfCheckList", myselfCheckList);
        prepareBatchUpdateOption(myselfCheckList, op);
        return delegateBatchUpdate(myselfCheckList, op);
    }

    protected void prepareBatchUpdateOption(List<LdMyselfCheck> myselfCheckList, UpdateOption<LdMyselfCheckCB> op) {
        op.xacceptUpdateColumnModifiedPropertiesIfNeeds(myselfCheckList);
        prepareUpdateOption(op);
    }

    @Override
    protected int[] doLumpModify(List<Entity> ls, UpdateOption<? extends ConditionBean> op) {
        if (op == null) { return batchUpdate(downcast(ls)); }
        else { return varyingBatchUpdate(downcast(ls), downcast(op)); }
    }

    /**
     * Batch-update the entity list specified-only. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * myselfCheckBhv.<span style="color: #FD4747">batchUpdate</span>(myselfCheckList, new SpecifyQuery<LdMyselfCheckCB>() {
     *     public void specify(LdMyselfCheckCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #FD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #FD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * myselfCheckBhv.<span style="color: #FD4747">batchUpdate</span>(myselfCheckList, new SpecifyQuery<LdMyselfCheckCB>() {
     *     public void specify(LdMyselfCheckCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #FD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param myselfCheckList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<LdMyselfCheck> myselfCheckList, SpecifyQuery<LdMyselfCheckCB> updateColumnSpec) {
        return doBatchUpdate(myselfCheckList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> op) {
        return doLumpModify(ls, op);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param myselfCheckList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<LdMyselfCheck> myselfCheckList) {
        return doBatchDelete(myselfCheckList, null);
    }

    protected int[] doBatchDelete(List<LdMyselfCheck> myselfCheckList, DeleteOption<LdMyselfCheckCB> op) {
        assertObjectNotNull("myselfCheckList", myselfCheckList);
        prepareDeleteOption(op);
        return delegateBatchDelete(myselfCheckList, op);
    }

    @Override
    protected int[] doLumpRemove(List<Entity> ls, DeleteOption<? extends ConditionBean> op) {
        if (op == null) { return batchDelete(downcast(ls)); }
        else { return varyingBatchDelete(downcast(ls), downcast(op)); }
    }

    @Override
    protected int[] doLumpRemoveNonstrict(List<Entity> ls, DeleteOption<? extends ConditionBean> op) {
        return doLumpRemove(ls, op);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * myselfCheckBhv.<span style="color: #FD4747">queryInsert</span>(new QueryInsertSetupper&lt;LdMyselfCheck, LdMyselfCheckCB&gt;() {
     *     public ConditionBean setup(myselfCheck entity, LdMyselfCheckCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<LdMyselfCheck, LdMyselfCheckCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(QueryInsertSetupper<LdMyselfCheck, LdMyselfCheckCB> sp, InsertOption<LdMyselfCheckCB> op) {
        assertObjectNotNull("setupper", sp);
        prepareInsertOption(op);
        LdMyselfCheck e = new LdMyselfCheck();
        LdMyselfCheckCB cb = createCBForQueryInsert();
        return delegateQueryInsert(e, cb, sp.setup(e, cb), op);
    }

    protected LdMyselfCheckCB createCBForQueryInsert() {
        LdMyselfCheckCB cb = newMyConditionBean();
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
     * LdMyselfCheck myselfCheck = new LdMyselfCheck();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//myselfCheck.setPK...(value);</span>
     * myselfCheck.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//myselfCheck.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//myselfCheck.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//myselfCheck.setVersionNo(value);</span>
     * LdMyselfCheckCB cb = new LdMyselfCheckCB();
     * cb.query().setFoo...(value);
     * myselfCheckBhv.<span style="color: #FD4747">queryUpdate</span>(myselfCheck, cb);
     * </pre>
     * @param myselfCheck The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of LdMyselfCheck. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(LdMyselfCheck myselfCheck, LdMyselfCheckCB cb) {
        return doQueryUpdate(myselfCheck, cb, null);
    }

    protected int doQueryUpdate(LdMyselfCheck myselfCheck, LdMyselfCheckCB cb, UpdateOption<LdMyselfCheckCB> op) {
        assertObjectNotNull("myselfCheck", myselfCheck); assertCBStateValid(cb);
        prepareUpdateOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryUpdate(myselfCheck, cb, op) : 0;
    }

    @Override
    protected int doRangeModify(Entity et, ConditionBean cb, UpdateOption<? extends ConditionBean> op) {
        if (op == null) { return queryUpdate(downcast(et), (LdMyselfCheckCB)cb); }
        else { return varyingQueryUpdate(downcast(et), (LdMyselfCheckCB)cb, downcast(op)); }
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * LdMyselfCheckCB cb = new LdMyselfCheckCB();
     * cb.query().setFoo...(value);
     * myselfCheckBhv.<span style="color: #FD4747">queryDelete</span>(myselfCheck, cb);
     * </pre>
     * @param cb The condition-bean of LdMyselfCheck. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(LdMyselfCheckCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(LdMyselfCheckCB cb, DeleteOption<LdMyselfCheckCB> op) {
        assertCBStateValid(cb);
        prepareDeleteOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryDelete(cb, op) : 0;
    }

    @Override
    protected int doRangeRemove(ConditionBean cb, DeleteOption<? extends ConditionBean> op) {
        if (op == null) { return queryDelete((LdMyselfCheckCB)cb); }
        else { return varyingQueryDelete((LdMyselfCheckCB)cb, downcast(op)); }
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
     * LdMyselfCheck myselfCheck = new LdMyselfCheck();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * myselfCheck.setFoo...(value);
     * myselfCheck.setBar...(value);
     * InsertOption<LdMyselfCheckCB> option = new InsertOption<LdMyselfCheckCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * myselfCheckBhv.<span style="color: #FD4747">varyingInsert</span>(myselfCheck, option);
     * ... = myselfCheck.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param myselfCheck The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(LdMyselfCheck myselfCheck, InsertOption<LdMyselfCheckCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(myselfCheck, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * LdMyselfCheck myselfCheck = new LdMyselfCheck();
     * myselfCheck.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * myselfCheck.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * myselfCheck.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;LdMyselfCheckCB&gt; option = new UpdateOption&lt;LdMyselfCheckCB&gt;();
     *     option.self(new SpecifyQuery&lt;LdMyselfCheckCB&gt;() {
     *         public void specify(LdMyselfCheckCB cb) {
     *             cb.specify().<span style="color: #FD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     myselfCheckBhv.<span style="color: #FD4747">varyingUpdate</span>(myselfCheck, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param myselfCheck The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(LdMyselfCheck myselfCheck, UpdateOption<LdMyselfCheckCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(myselfCheck, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param myselfCheck The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(LdMyselfCheck myselfCheck, InsertOption<LdMyselfCheckCB> insertOption, UpdateOption<LdMyselfCheckCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdate(myselfCheck, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param myselfCheck The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(LdMyselfCheck myselfCheck, DeleteOption<LdMyselfCheckCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(myselfCheck, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param myselfCheckList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<LdMyselfCheck> myselfCheckList, InsertOption<LdMyselfCheckCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(myselfCheckList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param myselfCheckList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<LdMyselfCheck> myselfCheckList, UpdateOption<LdMyselfCheckCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(myselfCheckList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param myselfCheckList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<LdMyselfCheck> myselfCheckList, DeleteOption<LdMyselfCheckCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(myselfCheckList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<LdMyselfCheck, LdMyselfCheckCB> setupper, InsertOption<LdMyselfCheckCB> option) {
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
     * LdMyselfCheck myselfCheck = new LdMyselfCheck();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//myselfCheck.setPK...(value);</span>
     * myselfCheck.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//myselfCheck.setVersionNo(value);</span>
     * LdMyselfCheckCB cb = new LdMyselfCheckCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;LdMyselfCheckCB&gt; option = new UpdateOption&lt;LdMyselfCheckCB&gt;();
     * option.self(new SpecifyQuery&lt;LdMyselfCheckCB&gt;() {
     *     public void specify(LdMyselfCheckCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * myselfCheckBhv.<span style="color: #FD4747">varyingQueryUpdate</span>(myselfCheck, cb, option);
     * </pre>
     * @param myselfCheck The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of LdMyselfCheck. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(LdMyselfCheck myselfCheck, LdMyselfCheckCB cb, UpdateOption<LdMyselfCheckCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(myselfCheck, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of LdMyselfCheck. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(LdMyselfCheckCB cb, DeleteOption<LdMyselfCheckCB> option) {
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
    public OutsideSqlBasicExecutor<LdMyselfCheckBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCountUniquely(LdMyselfCheckCB cb) { return invoke(createSelectCountCBCommand(cb, true)); }
    protected int delegateSelectCountPlainly(LdMyselfCheckCB cb) { return invoke(createSelectCountCBCommand(cb, false)); }
    protected <ENTITY extends LdMyselfCheck> void delegateSelectCursor(LdMyselfCheckCB cb, EntityRowHandler<ENTITY> rh, Class<ENTITY> tp)
    { invoke(createSelectCursorCBCommand(cb, rh, tp)); }
    protected <ENTITY extends LdMyselfCheck> List<ENTITY> delegateSelectList(LdMyselfCheckCB cb, Class<ENTITY> tp)
    { return invoke(createSelectListCBCommand(cb, tp)); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(LdMyselfCheck et, InsertOption<LdMyselfCheckCB> op)
    { if (!processBeforeInsert(et, op)) { return 0; }
      return invoke(createInsertEntityCommand(et, op)); }
    protected int delegateUpdate(LdMyselfCheck et, UpdateOption<LdMyselfCheckCB> op)
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return delegateUpdateNonstrict(et, op); }
    protected int delegateUpdateNonstrict(LdMyselfCheck et, UpdateOption<LdMyselfCheckCB> op)
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return invoke(createUpdateNonstrictEntityCommand(et, op)); }
    protected int delegateDelete(LdMyselfCheck et, DeleteOption<LdMyselfCheckCB> op)
    { if (!processBeforeDelete(et, op)) { return 0; }
      return delegateDeleteNonstrict(et, op); }
    protected int delegateDeleteNonstrict(LdMyselfCheck et, DeleteOption<LdMyselfCheckCB> op)
    { if (!processBeforeDelete(et, op)) { return 0; }
      return invoke(createDeleteNonstrictEntityCommand(et, op)); }

    protected int[] delegateBatchInsert(List<LdMyselfCheck> ls, InsertOption<LdMyselfCheckCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchInsertCommand(processBatchInternally(ls, op), op)); }
    protected int[] delegateBatchUpdate(List<LdMyselfCheck> ls, UpdateOption<LdMyselfCheckCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchUpdateNonstrict(ls, op); }
    protected int[] delegateBatchUpdateNonstrict(List<LdMyselfCheck> ls, UpdateOption<LdMyselfCheckCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateNonstrictCommand(processBatchInternally(ls, op, true), op)); }
    protected int[] delegateBatchDelete(List<LdMyselfCheck> ls, DeleteOption<LdMyselfCheckCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchDeleteNonstrict(ls, op); }
    protected int[] delegateBatchDeleteNonstrict(List<LdMyselfCheck> ls, DeleteOption<LdMyselfCheckCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteNonstrictCommand(processBatchInternally(ls, op, true), op)); }

    protected int delegateQueryInsert(LdMyselfCheck et, LdMyselfCheckCB inCB, ConditionBean resCB, InsertOption<LdMyselfCheckCB> op)
    { if (!processBeforeQueryInsert(et, inCB, resCB, op)) { return 0; } return invoke(createQueryInsertCBCommand(et, inCB, resCB, op));  }
    protected int delegateQueryUpdate(LdMyselfCheck et, LdMyselfCheckCB cb, UpdateOption<LdMyselfCheckCB> op)
    { if (!processBeforeQueryUpdate(et, cb, op)) { return 0; } return invoke(createQueryUpdateCBCommand(et, cb, op));  }
    protected int delegateQueryDelete(LdMyselfCheckCB cb, DeleteOption<LdMyselfCheckCB> op)
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
        return false;
    }

    // ===================================================================================
    //                                                                     Downcast Helper
    //                                                                     ===============
    protected LdMyselfCheck downcast(Entity et) {
        return helpEntityDowncastInternally(et, LdMyselfCheck.class);
    }

    protected LdMyselfCheckCB downcast(ConditionBean cb) {
        return helpConditionBeanDowncastInternally(cb, LdMyselfCheckCB.class);
    }

    @SuppressWarnings("unchecked")
    protected List<LdMyselfCheck> downcast(List<? extends Entity> ls) {
        return (List<LdMyselfCheck>)ls;
    }

    @SuppressWarnings("unchecked")
    protected InsertOption<LdMyselfCheckCB> downcast(InsertOption<? extends ConditionBean> op) {
        return (InsertOption<LdMyselfCheckCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected UpdateOption<LdMyselfCheckCB> downcast(UpdateOption<? extends ConditionBean> op) {
        return (UpdateOption<LdMyselfCheckCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected DeleteOption<LdMyselfCheckCB> downcast(DeleteOption<? extends ConditionBean> op) {
        return (DeleteOption<LdMyselfCheckCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<LdMyselfCheck, LdMyselfCheckCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> sp) {
        return (QueryInsertSetupper<LdMyselfCheck, LdMyselfCheckCB>)sp;
    }
}
