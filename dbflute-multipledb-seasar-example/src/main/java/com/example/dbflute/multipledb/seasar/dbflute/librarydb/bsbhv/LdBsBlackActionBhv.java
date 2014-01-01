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
 * The behavior of BLACK_ACTION as TABLE. <br />
 * <pre>
 * [primary key]
 *     BLACK_ACTION_ID
 * 
 * [column]
 *     BLACK_ACTION_ID, BLACK_LIST_ID, BLACK_ACTION_CODE, BLACK_LEVEL, ACTION_DATE, EVIDENCE_PHOTOGRAPH, R_USER, R_MODULE, R_TIMESTAMP, U_USER, U_MODULE, U_TIMESTAMP
 * 
 * [sequence]
 *     
 * 
 * [identity]
 *     BLACK_ACTION_ID
 * 
 * [version-no]
 *     
 * 
 * [foreign table]
 *     BLACK_LIST, BLACK_ACTION_LOOKUP
 * 
 * [referrer table]
 *     
 * 
 * [foreign property]
 *     blackList, blackActionLookup
 * 
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class LdBsBlackActionBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "BLACK_ACTION"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public DBMeta getDBMeta() { return LdBlackActionDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public LdBlackActionDbm getMyDBMeta() { return LdBlackActionDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public Entity newEntity() { return newMyEntity(); }

    /** {@inheritDoc} */
    public ConditionBean newConditionBean() { return newMyConditionBean(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public LdBlackAction newMyEntity() { return new LdBlackAction(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public LdBlackActionCB newMyConditionBean() { return new LdBlackActionCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * LdBlackActionCB cb = new LdBlackActionCB();
     * cb.query().setFoo...(value);
     * int count = blackActionBhv.<span style="color: #FD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of LdBlackAction. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(LdBlackActionCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(LdBlackActionCB cb) { // called by selectCount(cb) 
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(LdBlackActionCB cb) { // called by selectPage(cb)
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
     * LdBlackActionCB cb = new LdBlackActionCB();
     * cb.query().setFoo...(value);
     * LdBlackAction blackAction = blackActionBhv.<span style="color: #FD4747">selectEntity</span>(cb);
     * if (blackAction != null) {
     *     ... = blackAction.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of LdBlackAction. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public LdBlackAction selectEntity(LdBlackActionCB cb) {
        return doSelectEntity(cb, LdBlackAction.class);
    }

    protected <ENTITY extends LdBlackAction> ENTITY doSelectEntity(final LdBlackActionCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityInternally(cb, entityType, new InternalSelectEntityCallback<ENTITY, LdBlackActionCB>() {
            public List<ENTITY> callbackSelectList(LdBlackActionCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); } });
    }

    @Override
    protected Entity doReadEntity(ConditionBean cb) {
        return selectEntity(downcast(cb));
    }

    /**
     * Select the entity by the condition-bean with deleted check.
     * <pre>
     * LdBlackActionCB cb = new LdBlackActionCB();
     * cb.query().setFoo...(value);
     * LdBlackAction blackAction = blackActionBhv.<span style="color: #FD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = blackAction.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of LdBlackAction. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public LdBlackAction selectEntityWithDeletedCheck(LdBlackActionCB cb) {
        return doSelectEntityWithDeletedCheck(cb, LdBlackAction.class);
    }

    protected <ENTITY extends LdBlackAction> ENTITY doSelectEntityWithDeletedCheck(final LdBlackActionCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityWithDeletedCheckInternally(cb, entityType, new InternalSelectEntityWithDeletedCheckCallback<ENTITY, LdBlackActionCB>() {
            public List<ENTITY> callbackSelectList(LdBlackActionCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); } });
    }

    @Override
    protected Entity doReadEntityWithDeletedCheck(ConditionBean cb) {
        return selectEntityWithDeletedCheck(downcast(cb));
    }

    /**
     * Select the entity by the primary-key value.
     * @param blackActionId The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public LdBlackAction selectByPKValue(Integer blackActionId) {
        return doSelectByPKValue(blackActionId, LdBlackAction.class);
    }

    protected <ENTITY extends LdBlackAction> ENTITY doSelectByPKValue(Integer blackActionId, Class<ENTITY> entityType) {
        return doSelectEntity(buildPKCB(blackActionId), entityType);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param blackActionId The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public LdBlackAction selectByPKValueWithDeletedCheck(Integer blackActionId) {
        return doSelectByPKValueWithDeletedCheck(blackActionId, LdBlackAction.class);
    }

    protected <ENTITY extends LdBlackAction> ENTITY doSelectByPKValueWithDeletedCheck(Integer blackActionId, Class<ENTITY> entityType) {
        return doSelectEntityWithDeletedCheck(buildPKCB(blackActionId), entityType);
    }

    private LdBlackActionCB buildPKCB(Integer blackActionId) {
        assertObjectNotNull("blackActionId", blackActionId);
        LdBlackActionCB cb = newMyConditionBean();
        cb.query().setBlackActionId_Equal(blackActionId);
        return cb;
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * LdBlackActionCB cb = new LdBlackActionCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;LdBlackAction&gt; blackActionList = blackActionBhv.<span style="color: #FD4747">selectList</span>(cb);
     * for (LdBlackAction blackAction : blackActionList) {
     *     ... = blackAction.get...();
     * }
     * </pre>
     * @param cb The condition-bean of LdBlackAction. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<LdBlackAction> selectList(LdBlackActionCB cb) {
        return doSelectList(cb, LdBlackAction.class);
    }

    protected <ENTITY extends LdBlackAction> ListResultBean<ENTITY> doSelectList(LdBlackActionCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", entityType);
        assertSpecifyDerivedReferrerEntityProperty(cb, entityType);
        return helpSelectListInternally(cb, entityType, new InternalSelectListCallback<ENTITY, LdBlackActionCB>() {
            public List<ENTITY> callbackSelectList(LdBlackActionCB cb, Class<ENTITY> entityType) { return delegateSelectList(cb, entityType); } });
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
     * LdBlackActionCB cb = new LdBlackActionCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #FD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;LdBlackAction&gt; page = blackActionBhv.<span style="color: #FD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (LdBlackAction blackAction : page) {
     *     ... = blackAction.get...();
     * }
     * </pre>
     * @param cb The condition-bean of LdBlackAction. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<LdBlackAction> selectPage(LdBlackActionCB cb) {
        return doSelectPage(cb, LdBlackAction.class);
    }

    protected <ENTITY extends LdBlackAction> PagingResultBean<ENTITY> doSelectPage(LdBlackActionCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", entityType);
        return helpSelectPageInternally(cb, entityType, new InternalSelectPageCallback<ENTITY, LdBlackActionCB>() {
            public int callbackSelectCount(LdBlackActionCB cb) { return doSelectCountPlainly(cb); }
            public List<ENTITY> callbackSelectList(LdBlackActionCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); }
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
     * LdBlackActionCB cb = new LdBlackActionCB();
     * cb.query().setFoo...(value);
     * blackActionBhv.<span style="color: #FD4747">selectCursor</span>(cb, new EntityRowHandler&lt;LdBlackAction&gt;() {
     *     public void handle(LdBlackAction entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of LdBlackAction. (NotNull)
     * @param entityRowHandler The handler of entity row of LdBlackAction. (NotNull)
     */
    public void selectCursor(LdBlackActionCB cb, EntityRowHandler<LdBlackAction> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, LdBlackAction.class);
    }

    protected <ENTITY extends LdBlackAction> void doSelectCursor(LdBlackActionCB cb, EntityRowHandler<ENTITY> entityRowHandler, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler<LdBlackAction>", entityRowHandler); assertObjectNotNull("entityType", entityType);
        assertSpecifyDerivedReferrerEntityProperty(cb, entityType);
        helpSelectCursorInternally(cb, entityRowHandler, entityType, new InternalSelectCursorCallback<ENTITY, LdBlackActionCB>() {
            public void callbackSelectCursor(LdBlackActionCB cb, EntityRowHandler<ENTITY> entityRowHandler, Class<ENTITY> entityType) { delegateSelectCursor(cb, entityRowHandler, entityType); }
            public List<ENTITY> callbackSelectList(LdBlackActionCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); }
        });
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * blackActionBhv.<span style="color: #FD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(LdBlackActionCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> SLFunction<LdBlackActionCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
    }

    protected <RESULT, CB extends LdBlackActionCB> SLFunction<CB, RESULT> doScalarSelect(Class<RESULT> resultType, CB cb) {
        assertObjectNotNull("resultType", resultType); assertCBStateValid(cb);
        cb.xsetupForScalarSelect(); cb.getSqlClause().disableSelectIndex(); // for when you use union
        return createSLFunction(cb, resultType);
    }

    protected <RESULT, CB extends LdBlackActionCB> SLFunction<CB, RESULT> createSLFunction(CB cb, Class<RESULT> resultType) {
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
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'LdBlackList'.
     * @param blackActionList The list of blackAction. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<LdBlackList> pulloutBlackList(List<LdBlackAction> blackActionList) {
        return helpPulloutInternally(blackActionList, new InternalPulloutCallback<LdBlackAction, LdBlackList>() {
            public LdBlackList getFr(LdBlackAction e) { return e.getBlackList(); }
            public boolean hasRf() { return true; }
            public void setRfLs(LdBlackList e, List<LdBlackAction> ls)
            { e.setBlackActionList(ls); }
        });
    }
    /**
     * Pull out the list of foreign table 'LdBlackActionLookup'.
     * @param blackActionList The list of blackAction. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<LdBlackActionLookup> pulloutBlackActionLookup(List<LdBlackAction> blackActionList) {
        return helpPulloutInternally(blackActionList, new InternalPulloutCallback<LdBlackAction, LdBlackActionLookup>() {
            public LdBlackActionLookup getFr(LdBlackAction e) { return e.getBlackActionLookup(); }
            public boolean hasRf() { return true; }
            public void setRfLs(LdBlackActionLookup e, List<LdBlackAction> ls)
            { e.setBlackActionList(ls); }
        });
    }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key blackActionId.
     * @param blackActionList The list of blackAction. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Integer> extractBlackActionIdList(List<LdBlackAction> blackActionList) {
        return helpExtractListInternally(blackActionList, new InternalExtractCallback<LdBlackAction, Integer>() {
            public Integer getCV(LdBlackAction e) { return e.getBlackActionId(); }
        });
    }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * LdBlackAction blackAction = new LdBlackAction();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * blackAction.setFoo...(value);
     * blackAction.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//blackAction.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//blackAction.set...;</span>
     * blackActionBhv.<span style="color: #FD4747">insert</span>(blackAction);
     * ... = blackAction.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param blackAction The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(LdBlackAction blackAction) {
        doInsert(blackAction, null);
    }

    protected void doInsert(LdBlackAction blackAction, InsertOption<LdBlackActionCB> option) {
        assertObjectNotNull("blackAction", blackAction);
        prepareInsertOption(option);
        delegateInsert(blackAction, option);
    }

    protected void prepareInsertOption(InsertOption<LdBlackActionCB> option) {
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
     * LdBlackAction blackAction = new LdBlackAction();
     * blackAction.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * blackAction.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//blackAction.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//blackAction.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * blackAction.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     blackActionBhv.<span style="color: #FD4747">update</span>(blackAction);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * } 
     * </pre>
     * @param blackAction The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(final LdBlackAction blackAction) {
        doUpdate(blackAction, null);
    }

    protected void doUpdate(LdBlackAction blackAction, final UpdateOption<LdBlackActionCB> option) {
        assertObjectNotNull("blackAction", blackAction);
        prepareUpdateOption(option);
        helpUpdateInternally(blackAction, new InternalUpdateCallback<LdBlackAction>() {
            public int callbackDelegateUpdate(LdBlackAction entity) { return delegateUpdate(entity, option); } });
    }

    protected void prepareUpdateOption(UpdateOption<LdBlackActionCB> option) {
        if (option == null) { return; }
        assertUpdateOptionStatus(option);
        if (option.hasSelfSpecification()) {
            option.resolveSelfSpecification(createCBForVaryingUpdate());
        }
        if (option.hasSpecifiedUpdateColumn()) {
            option.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    protected LdBlackActionCB createCBForVaryingUpdate() {
        LdBlackActionCB cb = newMyConditionBean();
        cb.xsetupForVaryingUpdate();
        return cb;
    }

    protected LdBlackActionCB createCBForSpecifiedUpdate() {
        LdBlackActionCB cb = newMyConditionBean();
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
     * LdBlackAction blackAction = new LdBlackAction();
     * blackAction.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * blackAction.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//blackAction.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//blackAction.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//blackAction.setVersionNo(value);</span>
     * blackActionBhv.<span style="color: #FD4747">updateNonstrict</span>(blackAction);
     * </pre>
     * @param blackAction The entity of update target. (NotNull, PrimaryKeyNotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void updateNonstrict(final LdBlackAction blackAction) {
        doUpdateNonstrict(blackAction, null);
    }

    protected void doUpdateNonstrict(LdBlackAction blackAction, final UpdateOption<LdBlackActionCB> option) {
        assertObjectNotNull("blackAction", blackAction);
        prepareUpdateOption(option);
        helpUpdateNonstrictInternally(blackAction, new InternalUpdateNonstrictCallback<LdBlackAction>() {
            public int callbackDelegateUpdateNonstrict(LdBlackAction entity) { return delegateUpdateNonstrict(entity, option); } });
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
     * @param blackAction The entity of insert or update target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(LdBlackAction blackAction) {
        doInesrtOrUpdate(blackAction, null, null);
    }

    protected void doInesrtOrUpdate(LdBlackAction blackAction, final InsertOption<LdBlackActionCB> insertOption, final UpdateOption<LdBlackActionCB> updateOption) {
        helpInsertOrUpdateInternally(blackAction, new InternalInsertOrUpdateCallback<LdBlackAction, LdBlackActionCB>() {
            public void callbackInsert(LdBlackAction entity) { doInsert(entity, insertOption); }
            public void callbackUpdate(LdBlackAction entity) { doUpdate(entity, updateOption); }
            public LdBlackActionCB callbackNewMyConditionBean() { return newMyConditionBean(); }
            public int callbackSelectCount(LdBlackActionCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrModify(Entity entity, InsertOption<? extends ConditionBean> insertOption,
            UpdateOption<? extends ConditionBean> updateOption) {
        if (insertOption == null && updateOption == null) { insertOrUpdate(downcast(entity)); }
        else {
            insertOption = insertOption == null ? new InsertOption<LdBlackActionCB>() : insertOption;
            updateOption = updateOption == null ? new UpdateOption<LdBlackActionCB>() : updateOption;
            varyingInsertOrUpdate(downcast(entity), downcast(insertOption), downcast(updateOption));
        }
    }

    /**
     * Insert or update the entity non-strictly modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br />
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() }
     * <p><span style="color: #FD4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param blackAction The entity of insert or update target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdateNonstrict(LdBlackAction blackAction) {
        doInesrtOrUpdateNonstrict(blackAction, null, null);
    }

    protected void doInesrtOrUpdateNonstrict(LdBlackAction blackAction, final InsertOption<LdBlackActionCB> insertOption, final UpdateOption<LdBlackActionCB> updateOption) {
        helpInsertOrUpdateInternally(blackAction, new InternalInsertOrUpdateNonstrictCallback<LdBlackAction>() {
            public void callbackInsert(LdBlackAction entity) { doInsert(entity, insertOption); }
            public void callbackUpdateNonstrict(LdBlackAction entity) { doUpdateNonstrict(entity, updateOption); }
        });
    }

    @Override
    protected void doCreateOrModifyNonstrict(Entity entity, InsertOption<? extends ConditionBean> insertOption,
            UpdateOption<? extends ConditionBean> updateOption) {
        if (insertOption == null && updateOption == null) { insertOrUpdateNonstrict(downcast(entity)); }
        else {
            insertOption = insertOption == null ? new InsertOption<LdBlackActionCB>() : insertOption;
            updateOption = updateOption == null ? new UpdateOption<LdBlackActionCB>() : updateOption;
            varyingInsertOrUpdateNonstrict(downcast(entity), downcast(insertOption), downcast(updateOption));
        }
    }

    /**
     * Delete the entity. (ZeroUpdateException, ExclusiveControl)
     * <pre>
     * LdBlackAction blackAction = new LdBlackAction();
     * blackAction.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * blackAction.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     blackActionBhv.<span style="color: #FD4747">delete</span>(blackAction);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * } 
     * </pre>
     * @param blackAction The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(LdBlackAction blackAction) {
        doDelete(blackAction, null);
    }

    protected void doDelete(LdBlackAction blackAction, final DeleteOption<LdBlackActionCB> option) {
        assertObjectNotNull("blackAction", blackAction);
        prepareDeleteOption(option);
        helpDeleteInternally(blackAction, new InternalDeleteCallback<LdBlackAction>() {
            public int callbackDelegateDelete(LdBlackAction entity) { return delegateDelete(entity, option); } });
    }

    protected void prepareDeleteOption(DeleteOption<LdBlackActionCB> option) {
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
     * LdBlackAction blackAction = new LdBlackAction();
     * blackAction.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//blackAction.setVersionNo(value);</span>
     * blackActionBhv.<span style="color: #FD4747">deleteNonstrict</span>(blackAction);
     * </pre>
     * @param blackAction The entity of delete target. (NotNull, PrimaryKeyNotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrict(LdBlackAction blackAction) {
        doDeleteNonstrict(blackAction, null);
    }

    protected void doDeleteNonstrict(LdBlackAction blackAction, final DeleteOption<LdBlackActionCB> option) {
        assertObjectNotNull("blackAction", blackAction);
        prepareDeleteOption(option);
        helpDeleteNonstrictInternally(blackAction, new InternalDeleteNonstrictCallback<LdBlackAction>() {
            public int callbackDelegateDeleteNonstrict(LdBlackAction entity) { return delegateDeleteNonstrict(entity, option); } });
    }

    /**
     * Delete the entity non-strictly ignoring deleted. {ZeroUpdateException, NonExclusiveControl}
     * <pre>
     * LdBlackAction blackAction = new LdBlackAction();
     * blackAction.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//blackAction.setVersionNo(value);</span>
     * blackActionBhv.<span style="color: #FD4747">deleteNonstrictIgnoreDeleted</span>(blackAction);
     * <span style="color: #3F7E5E">// if the target entity doesn't exist, no exception</span>
     * </pre>
     * @param blackAction The entity of delete target. (NotNull, PrimaryKeyNotNull)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrictIgnoreDeleted(LdBlackAction blackAction) {
        doDeleteNonstrictIgnoreDeleted(blackAction, null);
    }

    protected void doDeleteNonstrictIgnoreDeleted(LdBlackAction blackAction, final DeleteOption<LdBlackActionCB> option) {
        assertObjectNotNull("blackAction", blackAction);
        prepareDeleteOption(option);
        helpDeleteNonstrictIgnoreDeletedInternally(blackAction, new InternalDeleteNonstrictIgnoreDeletedCallback<LdBlackAction>() {
            public int callbackDelegateDeleteNonstrict(LdBlackAction entity) { return delegateDeleteNonstrict(entity, option); } });
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
     *     LdBlackAction blackAction = new LdBlackAction();
     *     blackAction.setFooName("foo");
     *     if (...) {
     *         blackAction.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     blackActionList.add(blackAction);
     * }
     * blackActionBhv.<span style="color: #FD4747">batchInsert</span>(blackActionList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param blackActionList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<LdBlackAction> blackActionList) {
        InsertOption<LdBlackActionCB> option = createInsertUpdateOption();
        return doBatchInsert(blackActionList, option);
    }

    protected int[] doBatchInsert(List<LdBlackAction> blackActionList, InsertOption<LdBlackActionCB> option) {
        assertObjectNotNull("blackActionList", blackActionList);
        prepareBatchInsertOption(blackActionList, option);
        return delegateBatchInsert(blackActionList, option);
    }

    protected void prepareBatchInsertOption(List<LdBlackAction> blackActionList, InsertOption<LdBlackActionCB> option) {
        option.xallowInsertColumnModifiedPropertiesFragmented();
        option.xacceptInsertColumnModifiedPropertiesIfNeeds(blackActionList);
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
     *     LdBlackAction blackAction = new LdBlackAction();
     *     blackAction.setFooName("foo");
     *     if (...) {
     *         blackAction.setFooPrice(123);
     *     } else {
     *         blackAction.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//blackAction.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     blackActionList.add(blackAction);
     * }
     * blackActionBhv.<span style="color: #FD4747">batchUpdate</span>(blackActionList);
     * </pre>
     * @param blackActionList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<LdBlackAction> blackActionList) {
        UpdateOption<LdBlackActionCB> option = createPlainUpdateOption();
        return doBatchUpdate(blackActionList, option);
    }

    protected int[] doBatchUpdate(List<LdBlackAction> blackActionList, UpdateOption<LdBlackActionCB> option) {
        assertObjectNotNull("blackActionList", blackActionList);
        prepareBatchUpdateOption(blackActionList, option);
        return delegateBatchUpdate(blackActionList, option);
    }

    protected void prepareBatchUpdateOption(List<LdBlackAction> blackActionList, UpdateOption<LdBlackActionCB> option) {
        option.xacceptUpdateColumnModifiedPropertiesIfNeeds(blackActionList);
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
     * blackActionBhv.<span style="color: #FD4747">batchUpdate</span>(blackActionList, new SpecifyQuery<LdBlackActionCB>() {
     *     public void specify(LdBlackActionCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #FD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #FD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span> 
     * blackActionBhv.<span style="color: #FD4747">batchUpdate</span>(blackActionList, new SpecifyQuery<LdBlackActionCB>() {
     *     public void specify(LdBlackActionCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #FD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param blackActionList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<LdBlackAction> blackActionList, SpecifyQuery<LdBlackActionCB> updateColumnSpec) {
        return doBatchUpdate(blackActionList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    /**
     * Batch-update the entity list non-strictly modified-only of same-set columns. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <span style="color: #FD4747; font-size: 140%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     LdBlackAction blackAction = new LdBlackAction();
     *     blackAction.setFooName("foo");
     *     if (...) {
     *         blackAction.setFooPrice(123);
     *     } else {
     *         blackAction.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//blackAction.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     blackActionList.add(blackAction);
     * }
     * blackActionBhv.<span style="color: #FD4747">batchUpdate</span>(blackActionList);
     * </pre>
     * @param blackActionList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<LdBlackAction> blackActionList) {
        UpdateOption<LdBlackActionCB> option = createPlainUpdateOption();
        return doBatchUpdateNonstrict(blackActionList, option);
    }

    protected int[] doBatchUpdateNonstrict(List<LdBlackAction> blackActionList, UpdateOption<LdBlackActionCB> option) {
        assertObjectNotNull("blackActionList", blackActionList);
        prepareBatchUpdateOption(blackActionList, option);
        return delegateBatchUpdateNonstrict(blackActionList, option);
    }

    /**
     * Batch-update the entity list non-strictly specified-only. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span> 
     * blackActionBhv.<span style="color: #FD4747">batchUpdateNonstrict</span>(blackActionList, new SpecifyQuery<LdBlackActionCB>() {
     *     public void specify(LdBlackActionCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #FD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #FD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span> 
     * blackActionBhv.<span style="color: #FD4747">batchUpdateNonstrict</span>(blackActionList, new SpecifyQuery<LdBlackActionCB>() {
     *     public void specify(LdBlackActionCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #FD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).</p>
     * @param blackActionList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<LdBlackAction> blackActionList, SpecifyQuery<LdBlackActionCB> updateColumnSpec) {
        return doBatchUpdateNonstrict(blackActionList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> option) {
        if (option == null) { return batchUpdateNonstrict(downcast(ls)); }
        else { return varyingBatchUpdateNonstrict(downcast(ls), downcast(option)); }
    }

    /**
     * Batch-delete the entity list. (ExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param blackActionList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchDelete(List<LdBlackAction> blackActionList) {
        return doBatchDelete(blackActionList, null);
    }

    protected int[] doBatchDelete(List<LdBlackAction> blackActionList, DeleteOption<LdBlackActionCB> option) {
        assertObjectNotNull("blackActionList", blackActionList);
        prepareDeleteOption(option);
        return delegateBatchDelete(blackActionList, option);
    }

    @Override
    protected int[] doLumpRemove(List<Entity> ls, DeleteOption<? extends ConditionBean> option) {
        if (option == null) { return batchDelete(downcast(ls)); }
        else { return varyingBatchDelete(downcast(ls), downcast(option)); }
    }

    /**
     * Batch-delete the entity list non-strictly. {NonExclusiveControl} <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param blackActionList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDeleteNonstrict(List<LdBlackAction> blackActionList) {
        return doBatchDeleteNonstrict(blackActionList, null);
    }

    protected int[] doBatchDeleteNonstrict(List<LdBlackAction> blackActionList, DeleteOption<LdBlackActionCB> option) {
        assertObjectNotNull("blackActionList", blackActionList);
        prepareDeleteOption(option);
        return delegateBatchDeleteNonstrict(blackActionList, option);
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
     * blackActionBhv.<span style="color: #FD4747">queryInsert</span>(new QueryInsertSetupper&lt;LdBlackAction, LdBlackActionCB&gt;() {
     *     public ConditionBean setup(blackAction entity, LdBlackActionCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<LdBlackAction, LdBlackActionCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(QueryInsertSetupper<LdBlackAction, LdBlackActionCB> setupper, InsertOption<LdBlackActionCB> option) {
        assertObjectNotNull("setupper", setupper);
        prepareInsertOption(option);
        LdBlackAction entity = new LdBlackAction();
        LdBlackActionCB intoCB = createCBForQueryInsert();
        ConditionBean resourceCB = setupper.setup(entity, intoCB);
        return delegateQueryInsert(entity, intoCB, resourceCB, option);
    }

    protected LdBlackActionCB createCBForQueryInsert() {
        LdBlackActionCB cb = newMyConditionBean();
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
     * LdBlackAction blackAction = new LdBlackAction();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//blackAction.setPK...(value);</span>
     * blackAction.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//blackAction.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//blackAction.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//blackAction.setVersionNo(value);</span>
     * LdBlackActionCB cb = new LdBlackActionCB();
     * cb.query().setFoo...(value);
     * blackActionBhv.<span style="color: #FD4747">queryUpdate</span>(blackAction, cb);
     * </pre>
     * @param blackAction The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of LdBlackAction. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(LdBlackAction blackAction, LdBlackActionCB cb) {
        return doQueryUpdate(blackAction, cb, null);
    }

    protected int doQueryUpdate(LdBlackAction blackAction, LdBlackActionCB cb, UpdateOption<LdBlackActionCB> option) {
        assertObjectNotNull("blackAction", blackAction); assertCBStateValid(cb);
        prepareUpdateOption(option);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryUpdate(blackAction, cb, option) : 0;
    }

    @Override
    protected int doRangeModify(Entity entity, ConditionBean cb, UpdateOption<? extends ConditionBean> option) {
        if (option == null) { return queryUpdate(downcast(entity), (LdBlackActionCB)cb); }
        else { return varyingQueryUpdate(downcast(entity), (LdBlackActionCB)cb, downcast(option)); }
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * LdBlackActionCB cb = new LdBlackActionCB();
     * cb.query().setFoo...(value);
     * blackActionBhv.<span style="color: #FD4747">queryDelete</span>(blackAction, cb);
     * </pre>
     * @param cb The condition-bean of LdBlackAction. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(LdBlackActionCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(LdBlackActionCB cb, DeleteOption<LdBlackActionCB> option) {
        assertCBStateValid(cb);
        prepareDeleteOption(option);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryDelete(cb, option) : 0;
    }

    @Override
    protected int doRangeRemove(ConditionBean cb, DeleteOption<? extends ConditionBean> option) {
        if (option == null) { return queryDelete((LdBlackActionCB)cb); }
        else { return varyingQueryDelete((LdBlackActionCB)cb, downcast(option)); }
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
     * LdBlackAction blackAction = new LdBlackAction();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * blackAction.setFoo...(value);
     * blackAction.setBar...(value);
     * InsertOption<LdBlackActionCB> option = new InsertOption<LdBlackActionCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * blackActionBhv.<span style="color: #FD4747">varyingInsert</span>(blackAction, option);
     * ... = blackAction.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param blackAction The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(LdBlackAction blackAction, InsertOption<LdBlackActionCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(blackAction, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, ExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * LdBlackAction blackAction = new LdBlackAction();
     * blackAction.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * blackAction.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * blackAction.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;LdBlackActionCB&gt; option = new UpdateOption&lt;LdBlackActionCB&gt;();
     *     option.self(new SpecifyQuery&lt;LdBlackActionCB&gt;() {
     *         public void specify(LdBlackActionCB cb) {
     *             cb.specify().<span style="color: #FD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     blackActionBhv.<span style="color: #FD4747">varyingUpdate</span>(blackAction, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param blackAction The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(LdBlackAction blackAction, UpdateOption<LdBlackActionCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(blackAction, option);
    }

    /**
     * Update the entity with varying requests non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as updateNonstrict(entity).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * LdBlackAction blackAction = new LdBlackAction();
     * blackAction.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * blackAction.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//blackAction.setVersionNo(value);</span>
     * UpdateOption&lt;LdBlackActionCB&gt; option = new UpdateOption&lt;LdBlackActionCB&gt;();
     * option.self(new SpecifyQuery&lt;LdBlackActionCB&gt;() {
     *     public void specify(LdBlackActionCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * blackActionBhv.<span style="color: #FD4747">varyingUpdateNonstrict</span>(blackAction, option);
     * </pre>
     * @param blackAction The entity of update target. (NotNull, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdateNonstrict(LdBlackAction blackAction, UpdateOption<LdBlackActionCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdateNonstrict(blackAction, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param blackAction The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(LdBlackAction blackAction, InsertOption<LdBlackActionCB> insertOption, UpdateOption<LdBlackActionCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdate(blackAction, insertOption, updateOption);
    }

    /**
     * Insert or update the entity with varying requests non-strictly. (NonExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdateNonstrict(entity).
     * @param blackAction The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdateNonstrict(LdBlackAction blackAction, InsertOption<LdBlackActionCB> insertOption, UpdateOption<LdBlackActionCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdateNonstrict(blackAction, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, ExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param blackAction The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(LdBlackAction blackAction, DeleteOption<LdBlackActionCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(blackAction, option);
    }

    /**
     * Delete the entity with varying requests non-strictly. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as deleteNonstrict(entity).
     * @param blackAction The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDeleteNonstrict(LdBlackAction blackAction, DeleteOption<LdBlackActionCB> option) {
        assertDeleteOptionNotNull(option);
        doDeleteNonstrict(blackAction, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param blackActionList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<LdBlackAction> blackActionList, InsertOption<LdBlackActionCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(blackActionList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param blackActionList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<LdBlackAction> blackActionList, UpdateOption<LdBlackActionCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(blackActionList, option);
    }

    /**
     * Batch-update the list with varying requests non-strictly. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param blackActionList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdateNonstrict(List<LdBlackAction> blackActionList, UpdateOption<LdBlackActionCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdateNonstrict(blackActionList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param blackActionList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<LdBlackAction> blackActionList, DeleteOption<LdBlackActionCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(blackActionList, option);
    }

    /**
     * Batch-delete the list with varying requests non-strictly. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDeleteNonstrict(entityList).
     * @param blackActionList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDeleteNonstrict(List<LdBlackAction> blackActionList, DeleteOption<LdBlackActionCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDeleteNonstrict(blackActionList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<LdBlackAction, LdBlackActionCB> setupper, InsertOption<LdBlackActionCB> option) {
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
     * LdBlackAction blackAction = new LdBlackAction();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//blackAction.setPK...(value);</span>
     * blackAction.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//blackAction.setVersionNo(value);</span>
     * LdBlackActionCB cb = new LdBlackActionCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;LdBlackActionCB&gt; option = new UpdateOption&lt;LdBlackActionCB&gt;();
     * option.self(new SpecifyQuery&lt;LdBlackActionCB&gt;() {
     *     public void specify(LdBlackActionCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * blackActionBhv.<span style="color: #FD4747">varyingQueryUpdate</span>(blackAction, cb, option);
     * </pre>
     * @param blackAction The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of LdBlackAction. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(LdBlackAction blackAction, LdBlackActionCB cb, UpdateOption<LdBlackActionCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(blackAction, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of LdBlackAction. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(LdBlackActionCB cb, DeleteOption<LdBlackActionCB> option) {
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
    public OutsideSqlBasicExecutor<LdBlackActionBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCountUniquely(LdBlackActionCB cb) { return invoke(createSelectCountCBCommand(cb, true)); }
    protected int delegateSelectCountPlainly(LdBlackActionCB cb) { return invoke(createSelectCountCBCommand(cb, false)); }
    protected <ENTITY extends LdBlackAction> void delegateSelectCursor(LdBlackActionCB cb, EntityRowHandler<ENTITY> erh, Class<ENTITY> et)
    { invoke(createSelectCursorCBCommand(cb, erh, et)); }
    protected <ENTITY extends LdBlackAction> List<ENTITY> delegateSelectList(LdBlackActionCB cb, Class<ENTITY> et)
    { return invoke(createSelectListCBCommand(cb, et)); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(LdBlackAction e, InsertOption<LdBlackActionCB> op)
    { if (!processBeforeInsert(e, op)) { return 0; }
      return invoke(createInsertEntityCommand(e, op)); }
    protected int delegateUpdate(LdBlackAction e, UpdateOption<LdBlackActionCB> op)
    { if (!processBeforeUpdate(e, op)) { return 0; }
      return invoke(createUpdateEntityCommand(e, op)); }
    protected int delegateUpdateNonstrict(LdBlackAction e, UpdateOption<LdBlackActionCB> op)
    { if (!processBeforeUpdate(e, op)) { return 0; }
      return invoke(createUpdateNonstrictEntityCommand(e, op)); }
    protected int delegateDelete(LdBlackAction e, DeleteOption<LdBlackActionCB> op)
    { if (!processBeforeDelete(e, op)) { return 0; }
      return invoke(createDeleteEntityCommand(e, op)); }
    protected int delegateDeleteNonstrict(LdBlackAction e, DeleteOption<LdBlackActionCB> op)
    { if (!processBeforeDelete(e, op)) { return 0; }
      return invoke(createDeleteNonstrictEntityCommand(e, op)); }

    protected int[] delegateBatchInsert(List<LdBlackAction> ls, InsertOption<LdBlackActionCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchInsertCommand(processBatchInternally(ls, op), op)); }
    protected int[] delegateBatchUpdate(List<LdBlackAction> ls, UpdateOption<LdBlackActionCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateCommand(processBatchInternally(ls, op, false), op)); }
    protected int[] delegateBatchUpdateNonstrict(List<LdBlackAction> ls, UpdateOption<LdBlackActionCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateNonstrictCommand(processBatchInternally(ls, op, true), op)); }
    protected int[] delegateBatchDelete(List<LdBlackAction> ls, DeleteOption<LdBlackActionCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteCommand(processBatchInternally(ls, op, false), op)); }
    protected int[] delegateBatchDeleteNonstrict(List<LdBlackAction> ls, DeleteOption<LdBlackActionCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteNonstrictCommand(processBatchInternally(ls, op, true), op)); }

    protected int delegateQueryInsert(LdBlackAction e, LdBlackActionCB inCB, ConditionBean resCB, InsertOption<LdBlackActionCB> op)
    { if (!processBeforeQueryInsert(e, inCB, resCB, op)) { return 0; } return invoke(createQueryInsertCBCommand(e, inCB, resCB, op));  }
    protected int delegateQueryUpdate(LdBlackAction e, LdBlackActionCB cb, UpdateOption<LdBlackActionCB> op)
    { if (!processBeforeQueryUpdate(e, cb, op)) { return 0; } return invoke(createQueryUpdateCBCommand(e, cb, op));  }
    protected int delegateQueryDelete(LdBlackActionCB cb, DeleteOption<LdBlackActionCB> op)
    { if (!processBeforeQueryDelete(cb, op)) { return 0; } return invoke(createQueryDeleteCBCommand(cb, op));  }

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
    protected LdBlackAction downcast(Entity entity) {
        return helpEntityDowncastInternally(entity, LdBlackAction.class);
    }

    protected LdBlackActionCB downcast(ConditionBean cb) {
        return helpConditionBeanDowncastInternally(cb, LdBlackActionCB.class);
    }

    @SuppressWarnings("unchecked")
    protected List<LdBlackAction> downcast(List<? extends Entity> entityList) {
        return (List<LdBlackAction>)entityList;
    }

    @SuppressWarnings("unchecked")
    protected InsertOption<LdBlackActionCB> downcast(InsertOption<? extends ConditionBean> option) {
        return (InsertOption<LdBlackActionCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected UpdateOption<LdBlackActionCB> downcast(UpdateOption<? extends ConditionBean> option) {
        return (UpdateOption<LdBlackActionCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected DeleteOption<LdBlackActionCB> downcast(DeleteOption<? extends ConditionBean> option) {
        return (DeleteOption<LdBlackActionCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<LdBlackAction, LdBlackActionCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> option) {
        return (QueryInsertSetupper<LdBlackAction, LdBlackActionCB>)option;
    }
}
