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
 * The behavior of COLLECTION_STATUS as TABLE. <br />
 * <pre>
 * [primary key]
 *     COLLECTION_ID
 * 
 * [column]
 *     COLLECTION_ID, COLLECTION_STATUS_CODE, R_USER, R_MODULE, R_TIMESTAMP, U_USER, U_MODULE, U_TIMESTAMP
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
 *     COLLECTION, COLLECTION_STATUS_LOOKUP
 * 
 * [referrer table]
 *     
 * 
 * [foreign property]
 *     collection, collectionStatusLookup
 * 
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class LdBsCollectionStatusBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "COLLECTION_STATUS"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public DBMeta getDBMeta() { return LdCollectionStatusDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public LdCollectionStatusDbm getMyDBMeta() { return LdCollectionStatusDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public Entity newEntity() { return newMyEntity(); }

    /** {@inheritDoc} */
    public ConditionBean newConditionBean() { return newMyConditionBean(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public LdCollectionStatus newMyEntity() { return new LdCollectionStatus(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public LdCollectionStatusCB newMyConditionBean() { return new LdCollectionStatusCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * LdCollectionStatusCB cb = new LdCollectionStatusCB();
     * cb.query().setFoo...(value);
     * int count = collectionStatusBhv.<span style="color: #FD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of LdCollectionStatus. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(LdCollectionStatusCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(LdCollectionStatusCB cb) { // called by selectCount(cb) 
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(LdCollectionStatusCB cb) { // called by selectPage(cb)
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
     * LdCollectionStatusCB cb = new LdCollectionStatusCB();
     * cb.query().setFoo...(value);
     * LdCollectionStatus collectionStatus = collectionStatusBhv.<span style="color: #FD4747">selectEntity</span>(cb);
     * if (collectionStatus != null) {
     *     ... = collectionStatus.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of LdCollectionStatus. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public LdCollectionStatus selectEntity(LdCollectionStatusCB cb) {
        return doSelectEntity(cb, LdCollectionStatus.class);
    }

    protected <ENTITY extends LdCollectionStatus> ENTITY doSelectEntity(final LdCollectionStatusCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityInternally(cb, entityType, new InternalSelectEntityCallback<ENTITY, LdCollectionStatusCB>() {
            public List<ENTITY> callbackSelectList(LdCollectionStatusCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); } });
    }

    @Override
    protected Entity doReadEntity(ConditionBean cb) {
        return selectEntity(downcast(cb));
    }

    /**
     * Select the entity by the condition-bean with deleted check.
     * <pre>
     * LdCollectionStatusCB cb = new LdCollectionStatusCB();
     * cb.query().setFoo...(value);
     * LdCollectionStatus collectionStatus = collectionStatusBhv.<span style="color: #FD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = collectionStatus.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of LdCollectionStatus. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public LdCollectionStatus selectEntityWithDeletedCheck(LdCollectionStatusCB cb) {
        return doSelectEntityWithDeletedCheck(cb, LdCollectionStatus.class);
    }

    protected <ENTITY extends LdCollectionStatus> ENTITY doSelectEntityWithDeletedCheck(final LdCollectionStatusCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityWithDeletedCheckInternally(cb, entityType, new InternalSelectEntityWithDeletedCheckCallback<ENTITY, LdCollectionStatusCB>() {
            public List<ENTITY> callbackSelectList(LdCollectionStatusCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); } });
    }

    @Override
    protected Entity doReadEntityWithDeletedCheck(ConditionBean cb) {
        return selectEntityWithDeletedCheck(downcast(cb));
    }

    /**
     * Select the entity by the primary-key value.
     * @param collectionId The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public LdCollectionStatus selectByPKValue(Integer collectionId) {
        return doSelectByPKValue(collectionId, LdCollectionStatus.class);
    }

    protected <ENTITY extends LdCollectionStatus> ENTITY doSelectByPKValue(Integer collectionId, Class<ENTITY> entityType) {
        return doSelectEntity(buildPKCB(collectionId), entityType);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param collectionId The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public LdCollectionStatus selectByPKValueWithDeletedCheck(Integer collectionId) {
        return doSelectByPKValueWithDeletedCheck(collectionId, LdCollectionStatus.class);
    }

    protected <ENTITY extends LdCollectionStatus> ENTITY doSelectByPKValueWithDeletedCheck(Integer collectionId, Class<ENTITY> entityType) {
        return doSelectEntityWithDeletedCheck(buildPKCB(collectionId), entityType);
    }

    private LdCollectionStatusCB buildPKCB(Integer collectionId) {
        assertObjectNotNull("collectionId", collectionId);
        LdCollectionStatusCB cb = newMyConditionBean();
        cb.query().setCollectionId_Equal(collectionId);
        return cb;
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * LdCollectionStatusCB cb = new LdCollectionStatusCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;LdCollectionStatus&gt; collectionStatusList = collectionStatusBhv.<span style="color: #FD4747">selectList</span>(cb);
     * for (LdCollectionStatus collectionStatus : collectionStatusList) {
     *     ... = collectionStatus.get...();
     * }
     * </pre>
     * @param cb The condition-bean of LdCollectionStatus. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<LdCollectionStatus> selectList(LdCollectionStatusCB cb) {
        return doSelectList(cb, LdCollectionStatus.class);
    }

    protected <ENTITY extends LdCollectionStatus> ListResultBean<ENTITY> doSelectList(LdCollectionStatusCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", entityType);
        assertSpecifyDerivedReferrerEntityProperty(cb, entityType);
        return helpSelectListInternally(cb, entityType, new InternalSelectListCallback<ENTITY, LdCollectionStatusCB>() {
            public List<ENTITY> callbackSelectList(LdCollectionStatusCB cb, Class<ENTITY> entityType) { return delegateSelectList(cb, entityType); } });
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
     * LdCollectionStatusCB cb = new LdCollectionStatusCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #FD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;LdCollectionStatus&gt; page = collectionStatusBhv.<span style="color: #FD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (LdCollectionStatus collectionStatus : page) {
     *     ... = collectionStatus.get...();
     * }
     * </pre>
     * @param cb The condition-bean of LdCollectionStatus. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<LdCollectionStatus> selectPage(LdCollectionStatusCB cb) {
        return doSelectPage(cb, LdCollectionStatus.class);
    }

    protected <ENTITY extends LdCollectionStatus> PagingResultBean<ENTITY> doSelectPage(LdCollectionStatusCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", entityType);
        return helpSelectPageInternally(cb, entityType, new InternalSelectPageCallback<ENTITY, LdCollectionStatusCB>() {
            public int callbackSelectCount(LdCollectionStatusCB cb) { return doSelectCountPlainly(cb); }
            public List<ENTITY> callbackSelectList(LdCollectionStatusCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); }
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
     * LdCollectionStatusCB cb = new LdCollectionStatusCB();
     * cb.query().setFoo...(value);
     * collectionStatusBhv.<span style="color: #FD4747">selectCursor</span>(cb, new EntityRowHandler&lt;LdCollectionStatus&gt;() {
     *     public void handle(LdCollectionStatus entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of LdCollectionStatus. (NotNull)
     * @param entityRowHandler The handler of entity row of LdCollectionStatus. (NotNull)
     */
    public void selectCursor(LdCollectionStatusCB cb, EntityRowHandler<LdCollectionStatus> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, LdCollectionStatus.class);
    }

    protected <ENTITY extends LdCollectionStatus> void doSelectCursor(LdCollectionStatusCB cb, EntityRowHandler<ENTITY> entityRowHandler, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler<LdCollectionStatus>", entityRowHandler); assertObjectNotNull("entityType", entityType);
        assertSpecifyDerivedReferrerEntityProperty(cb, entityType);
        helpSelectCursorInternally(cb, entityRowHandler, entityType, new InternalSelectCursorCallback<ENTITY, LdCollectionStatusCB>() {
            public void callbackSelectCursor(LdCollectionStatusCB cb, EntityRowHandler<ENTITY> entityRowHandler, Class<ENTITY> entityType) { delegateSelectCursor(cb, entityRowHandler, entityType); }
            public List<ENTITY> callbackSelectList(LdCollectionStatusCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); }
        });
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * collectionStatusBhv.<span style="color: #FD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(LdCollectionStatusCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> SLFunction<LdCollectionStatusCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
    }

    protected <RESULT, CB extends LdCollectionStatusCB> SLFunction<CB, RESULT> doScalarSelect(Class<RESULT> resultType, CB cb) {
        assertObjectNotNull("resultType", resultType); assertCBStateValid(cb);
        cb.xsetupForScalarSelect(); cb.getSqlClause().disableSelectIndex(); // for when you use union
        return createSLFunction(cb, resultType);
    }

    protected <RESULT, CB extends LdCollectionStatusCB> SLFunction<CB, RESULT> createSLFunction(CB cb, Class<RESULT> resultType) {
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
     * Pull out the list of foreign table 'LdCollection'.
     * @param collectionStatusList The list of collectionStatus. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<LdCollection> pulloutCollection(List<LdCollectionStatus> collectionStatusList) {
        return helpPulloutInternally(collectionStatusList, new InternalPulloutCallback<LdCollectionStatus, LdCollection>() {
            public LdCollection getFr(LdCollectionStatus e) { return e.getCollection(); }
            public boolean hasRf() { return true; }
            public void setRfLs(LdCollection e, List<LdCollectionStatus> ls)
            { if (!ls.isEmpty()) { e.setCollectionStatusAsOne(ls.get(0)); } }
        });
    }
    /**
     * Pull out the list of foreign table 'LdCollectionStatusLookup'.
     * @param collectionStatusList The list of collectionStatus. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<LdCollectionStatusLookup> pulloutCollectionStatusLookup(List<LdCollectionStatus> collectionStatusList) {
        return helpPulloutInternally(collectionStatusList, new InternalPulloutCallback<LdCollectionStatus, LdCollectionStatusLookup>() {
            public LdCollectionStatusLookup getFr(LdCollectionStatus e) { return e.getCollectionStatusLookup(); }
            public boolean hasRf() { return true; }
            public void setRfLs(LdCollectionStatusLookup e, List<LdCollectionStatus> ls)
            { e.setCollectionStatusList(ls); }
        });
    }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key collectionId.
     * @param collectionStatusList The list of collectionStatus. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Integer> extractCollectionIdList(List<LdCollectionStatus> collectionStatusList) {
        return helpExtractListInternally(collectionStatusList, new InternalExtractCallback<LdCollectionStatus, Integer>() {
            public Integer getCV(LdCollectionStatus e) { return e.getCollectionId(); }
        });
    }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * LdCollectionStatus collectionStatus = new LdCollectionStatus();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * collectionStatus.setFoo...(value);
     * collectionStatus.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//collectionStatus.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//collectionStatus.set...;</span>
     * collectionStatusBhv.<span style="color: #FD4747">insert</span>(collectionStatus);
     * ... = collectionStatus.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param collectionStatus The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(LdCollectionStatus collectionStatus) {
        doInsert(collectionStatus, null);
    }

    protected void doInsert(LdCollectionStatus collectionStatus, InsertOption<LdCollectionStatusCB> option) {
        assertObjectNotNull("collectionStatus", collectionStatus);
        prepareInsertOption(option);
        delegateInsert(collectionStatus, option);
    }

    protected void prepareInsertOption(InsertOption<LdCollectionStatusCB> option) {
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
     * LdCollectionStatus collectionStatus = new LdCollectionStatus();
     * collectionStatus.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * collectionStatus.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//collectionStatus.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//collectionStatus.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * collectionStatus.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     collectionStatusBhv.<span style="color: #FD4747">update</span>(collectionStatus);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * } 
     * </pre>
     * @param collectionStatus The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(final LdCollectionStatus collectionStatus) {
        doUpdate(collectionStatus, null);
    }

    protected void doUpdate(LdCollectionStatus collectionStatus, final UpdateOption<LdCollectionStatusCB> option) {
        assertObjectNotNull("collectionStatus", collectionStatus);
        prepareUpdateOption(option);
        helpUpdateInternally(collectionStatus, new InternalUpdateCallback<LdCollectionStatus>() {
            public int callbackDelegateUpdate(LdCollectionStatus entity) { return delegateUpdate(entity, option); } });
    }

    protected void prepareUpdateOption(UpdateOption<LdCollectionStatusCB> option) {
        if (option == null) { return; }
        assertUpdateOptionStatus(option);
        if (option.hasSelfSpecification()) {
            option.resolveSelfSpecification(createCBForVaryingUpdate());
        }
        if (option.hasSpecifiedUpdateColumn()) {
            option.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    protected LdCollectionStatusCB createCBForVaryingUpdate() {
        LdCollectionStatusCB cb = newMyConditionBean();
        cb.xsetupForVaryingUpdate();
        return cb;
    }

    protected LdCollectionStatusCB createCBForSpecifiedUpdate() {
        LdCollectionStatusCB cb = newMyConditionBean();
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
     * LdCollectionStatus collectionStatus = new LdCollectionStatus();
     * collectionStatus.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * collectionStatus.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//collectionStatus.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//collectionStatus.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//collectionStatus.setVersionNo(value);</span>
     * collectionStatusBhv.<span style="color: #FD4747">updateNonstrict</span>(collectionStatus);
     * </pre>
     * @param collectionStatus The entity of update target. (NotNull, PrimaryKeyNotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void updateNonstrict(final LdCollectionStatus collectionStatus) {
        doUpdateNonstrict(collectionStatus, null);
    }

    protected void doUpdateNonstrict(LdCollectionStatus collectionStatus, final UpdateOption<LdCollectionStatusCB> option) {
        assertObjectNotNull("collectionStatus", collectionStatus);
        prepareUpdateOption(option);
        helpUpdateNonstrictInternally(collectionStatus, new InternalUpdateNonstrictCallback<LdCollectionStatus>() {
            public int callbackDelegateUpdateNonstrict(LdCollectionStatus entity) { return delegateUpdateNonstrict(entity, option); } });
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
     * @param collectionStatus The entity of insert or update target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(LdCollectionStatus collectionStatus) {
        doInesrtOrUpdate(collectionStatus, null, null);
    }

    protected void doInesrtOrUpdate(LdCollectionStatus collectionStatus, final InsertOption<LdCollectionStatusCB> insertOption, final UpdateOption<LdCollectionStatusCB> updateOption) {
        helpInsertOrUpdateInternally(collectionStatus, new InternalInsertOrUpdateCallback<LdCollectionStatus, LdCollectionStatusCB>() {
            public void callbackInsert(LdCollectionStatus entity) { doInsert(entity, insertOption); }
            public void callbackUpdate(LdCollectionStatus entity) { doUpdate(entity, updateOption); }
            public LdCollectionStatusCB callbackNewMyConditionBean() { return newMyConditionBean(); }
            public int callbackSelectCount(LdCollectionStatusCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrModify(Entity entity, InsertOption<? extends ConditionBean> insertOption,
            UpdateOption<? extends ConditionBean> updateOption) {
        if (insertOption == null && updateOption == null) { insertOrUpdate(downcast(entity)); }
        else {
            insertOption = insertOption == null ? new InsertOption<LdCollectionStatusCB>() : insertOption;
            updateOption = updateOption == null ? new UpdateOption<LdCollectionStatusCB>() : updateOption;
            varyingInsertOrUpdate(downcast(entity), downcast(insertOption), downcast(updateOption));
        }
    }

    /**
     * Insert or update the entity non-strictly modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br />
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() }
     * <p><span style="color: #FD4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param collectionStatus The entity of insert or update target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdateNonstrict(LdCollectionStatus collectionStatus) {
        doInesrtOrUpdateNonstrict(collectionStatus, null, null);
    }

    protected void doInesrtOrUpdateNonstrict(LdCollectionStatus collectionStatus, final InsertOption<LdCollectionStatusCB> insertOption, final UpdateOption<LdCollectionStatusCB> updateOption) {
        helpInsertOrUpdateInternally(collectionStatus, new InternalInsertOrUpdateNonstrictCallback<LdCollectionStatus>() {
            public void callbackInsert(LdCollectionStatus entity) { doInsert(entity, insertOption); }
            public void callbackUpdateNonstrict(LdCollectionStatus entity) { doUpdateNonstrict(entity, updateOption); }
        });
    }

    @Override
    protected void doCreateOrModifyNonstrict(Entity entity, InsertOption<? extends ConditionBean> insertOption,
            UpdateOption<? extends ConditionBean> updateOption) {
        if (insertOption == null && updateOption == null) { insertOrUpdateNonstrict(downcast(entity)); }
        else {
            insertOption = insertOption == null ? new InsertOption<LdCollectionStatusCB>() : insertOption;
            updateOption = updateOption == null ? new UpdateOption<LdCollectionStatusCB>() : updateOption;
            varyingInsertOrUpdateNonstrict(downcast(entity), downcast(insertOption), downcast(updateOption));
        }
    }

    /**
     * Delete the entity. (ZeroUpdateException, ExclusiveControl)
     * <pre>
     * LdCollectionStatus collectionStatus = new LdCollectionStatus();
     * collectionStatus.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * collectionStatus.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     collectionStatusBhv.<span style="color: #FD4747">delete</span>(collectionStatus);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * } 
     * </pre>
     * @param collectionStatus The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(LdCollectionStatus collectionStatus) {
        doDelete(collectionStatus, null);
    }

    protected void doDelete(LdCollectionStatus collectionStatus, final DeleteOption<LdCollectionStatusCB> option) {
        assertObjectNotNull("collectionStatus", collectionStatus);
        prepareDeleteOption(option);
        helpDeleteInternally(collectionStatus, new InternalDeleteCallback<LdCollectionStatus>() {
            public int callbackDelegateDelete(LdCollectionStatus entity) { return delegateDelete(entity, option); } });
    }

    protected void prepareDeleteOption(DeleteOption<LdCollectionStatusCB> option) {
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
     * LdCollectionStatus collectionStatus = new LdCollectionStatus();
     * collectionStatus.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//collectionStatus.setVersionNo(value);</span>
     * collectionStatusBhv.<span style="color: #FD4747">deleteNonstrict</span>(collectionStatus);
     * </pre>
     * @param collectionStatus The entity of delete target. (NotNull, PrimaryKeyNotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrict(LdCollectionStatus collectionStatus) {
        doDeleteNonstrict(collectionStatus, null);
    }

    protected void doDeleteNonstrict(LdCollectionStatus collectionStatus, final DeleteOption<LdCollectionStatusCB> option) {
        assertObjectNotNull("collectionStatus", collectionStatus);
        prepareDeleteOption(option);
        helpDeleteNonstrictInternally(collectionStatus, new InternalDeleteNonstrictCallback<LdCollectionStatus>() {
            public int callbackDelegateDeleteNonstrict(LdCollectionStatus entity) { return delegateDeleteNonstrict(entity, option); } });
    }

    /**
     * Delete the entity non-strictly ignoring deleted. {ZeroUpdateException, NonExclusiveControl}
     * <pre>
     * LdCollectionStatus collectionStatus = new LdCollectionStatus();
     * collectionStatus.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//collectionStatus.setVersionNo(value);</span>
     * collectionStatusBhv.<span style="color: #FD4747">deleteNonstrictIgnoreDeleted</span>(collectionStatus);
     * <span style="color: #3F7E5E">// if the target entity doesn't exist, no exception</span>
     * </pre>
     * @param collectionStatus The entity of delete target. (NotNull, PrimaryKeyNotNull)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrictIgnoreDeleted(LdCollectionStatus collectionStatus) {
        doDeleteNonstrictIgnoreDeleted(collectionStatus, null);
    }

    protected void doDeleteNonstrictIgnoreDeleted(LdCollectionStatus collectionStatus, final DeleteOption<LdCollectionStatusCB> option) {
        assertObjectNotNull("collectionStatus", collectionStatus);
        prepareDeleteOption(option);
        helpDeleteNonstrictIgnoreDeletedInternally(collectionStatus, new InternalDeleteNonstrictIgnoreDeletedCallback<LdCollectionStatus>() {
            public int callbackDelegateDeleteNonstrict(LdCollectionStatus entity) { return delegateDeleteNonstrict(entity, option); } });
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
     *     LdCollectionStatus collectionStatus = new LdCollectionStatus();
     *     collectionStatus.setFooName("foo");
     *     if (...) {
     *         collectionStatus.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     collectionStatusList.add(collectionStatus);
     * }
     * collectionStatusBhv.<span style="color: #FD4747">batchInsert</span>(collectionStatusList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param collectionStatusList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<LdCollectionStatus> collectionStatusList) {
        InsertOption<LdCollectionStatusCB> option = createInsertUpdateOption();
        return doBatchInsert(collectionStatusList, option);
    }

    protected int[] doBatchInsert(List<LdCollectionStatus> collectionStatusList, InsertOption<LdCollectionStatusCB> option) {
        assertObjectNotNull("collectionStatusList", collectionStatusList);
        prepareBatchInsertOption(collectionStatusList, option);
        return delegateBatchInsert(collectionStatusList, option);
    }

    protected void prepareBatchInsertOption(List<LdCollectionStatus> collectionStatusList, InsertOption<LdCollectionStatusCB> option) {
        option.xallowInsertColumnModifiedPropertiesFragmented();
        option.xacceptInsertColumnModifiedPropertiesIfNeeds(collectionStatusList);
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
     *     LdCollectionStatus collectionStatus = new LdCollectionStatus();
     *     collectionStatus.setFooName("foo");
     *     if (...) {
     *         collectionStatus.setFooPrice(123);
     *     } else {
     *         collectionStatus.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//collectionStatus.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     collectionStatusList.add(collectionStatus);
     * }
     * collectionStatusBhv.<span style="color: #FD4747">batchUpdate</span>(collectionStatusList);
     * </pre>
     * @param collectionStatusList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<LdCollectionStatus> collectionStatusList) {
        UpdateOption<LdCollectionStatusCB> option = createPlainUpdateOption();
        return doBatchUpdate(collectionStatusList, option);
    }

    protected int[] doBatchUpdate(List<LdCollectionStatus> collectionStatusList, UpdateOption<LdCollectionStatusCB> option) {
        assertObjectNotNull("collectionStatusList", collectionStatusList);
        prepareBatchUpdateOption(collectionStatusList, option);
        return delegateBatchUpdate(collectionStatusList, option);
    }

    protected void prepareBatchUpdateOption(List<LdCollectionStatus> collectionStatusList, UpdateOption<LdCollectionStatusCB> option) {
        option.xacceptUpdateColumnModifiedPropertiesIfNeeds(collectionStatusList);
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
     * collectionStatusBhv.<span style="color: #FD4747">batchUpdate</span>(collectionStatusList, new SpecifyQuery<LdCollectionStatusCB>() {
     *     public void specify(LdCollectionStatusCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #FD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #FD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span> 
     * collectionStatusBhv.<span style="color: #FD4747">batchUpdate</span>(collectionStatusList, new SpecifyQuery<LdCollectionStatusCB>() {
     *     public void specify(LdCollectionStatusCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #FD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param collectionStatusList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<LdCollectionStatus> collectionStatusList, SpecifyQuery<LdCollectionStatusCB> updateColumnSpec) {
        return doBatchUpdate(collectionStatusList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    /**
     * Batch-update the entity list non-strictly modified-only of same-set columns. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <span style="color: #FD4747; font-size: 140%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     LdCollectionStatus collectionStatus = new LdCollectionStatus();
     *     collectionStatus.setFooName("foo");
     *     if (...) {
     *         collectionStatus.setFooPrice(123);
     *     } else {
     *         collectionStatus.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//collectionStatus.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     collectionStatusList.add(collectionStatus);
     * }
     * collectionStatusBhv.<span style="color: #FD4747">batchUpdate</span>(collectionStatusList);
     * </pre>
     * @param collectionStatusList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<LdCollectionStatus> collectionStatusList) {
        UpdateOption<LdCollectionStatusCB> option = createPlainUpdateOption();
        return doBatchUpdateNonstrict(collectionStatusList, option);
    }

    protected int[] doBatchUpdateNonstrict(List<LdCollectionStatus> collectionStatusList, UpdateOption<LdCollectionStatusCB> option) {
        assertObjectNotNull("collectionStatusList", collectionStatusList);
        prepareBatchUpdateOption(collectionStatusList, option);
        return delegateBatchUpdateNonstrict(collectionStatusList, option);
    }

    /**
     * Batch-update the entity list non-strictly specified-only. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span> 
     * collectionStatusBhv.<span style="color: #FD4747">batchUpdateNonstrict</span>(collectionStatusList, new SpecifyQuery<LdCollectionStatusCB>() {
     *     public void specify(LdCollectionStatusCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #FD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #FD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span> 
     * collectionStatusBhv.<span style="color: #FD4747">batchUpdateNonstrict</span>(collectionStatusList, new SpecifyQuery<LdCollectionStatusCB>() {
     *     public void specify(LdCollectionStatusCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #FD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).</p>
     * @param collectionStatusList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<LdCollectionStatus> collectionStatusList, SpecifyQuery<LdCollectionStatusCB> updateColumnSpec) {
        return doBatchUpdateNonstrict(collectionStatusList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> option) {
        if (option == null) { return batchUpdateNonstrict(downcast(ls)); }
        else { return varyingBatchUpdateNonstrict(downcast(ls), downcast(option)); }
    }

    /**
     * Batch-delete the entity list. (ExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param collectionStatusList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchDelete(List<LdCollectionStatus> collectionStatusList) {
        return doBatchDelete(collectionStatusList, null);
    }

    protected int[] doBatchDelete(List<LdCollectionStatus> collectionStatusList, DeleteOption<LdCollectionStatusCB> option) {
        assertObjectNotNull("collectionStatusList", collectionStatusList);
        prepareDeleteOption(option);
        return delegateBatchDelete(collectionStatusList, option);
    }

    @Override
    protected int[] doLumpRemove(List<Entity> ls, DeleteOption<? extends ConditionBean> option) {
        if (option == null) { return batchDelete(downcast(ls)); }
        else { return varyingBatchDelete(downcast(ls), downcast(option)); }
    }

    /**
     * Batch-delete the entity list non-strictly. {NonExclusiveControl} <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param collectionStatusList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDeleteNonstrict(List<LdCollectionStatus> collectionStatusList) {
        return doBatchDeleteNonstrict(collectionStatusList, null);
    }

    protected int[] doBatchDeleteNonstrict(List<LdCollectionStatus> collectionStatusList, DeleteOption<LdCollectionStatusCB> option) {
        assertObjectNotNull("collectionStatusList", collectionStatusList);
        prepareDeleteOption(option);
        return delegateBatchDeleteNonstrict(collectionStatusList, option);
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
     * collectionStatusBhv.<span style="color: #FD4747">queryInsert</span>(new QueryInsertSetupper&lt;LdCollectionStatus, LdCollectionStatusCB&gt;() {
     *     public ConditionBean setup(collectionStatus entity, LdCollectionStatusCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<LdCollectionStatus, LdCollectionStatusCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(QueryInsertSetupper<LdCollectionStatus, LdCollectionStatusCB> setupper, InsertOption<LdCollectionStatusCB> option) {
        assertObjectNotNull("setupper", setupper);
        prepareInsertOption(option);
        LdCollectionStatus entity = new LdCollectionStatus();
        LdCollectionStatusCB intoCB = createCBForQueryInsert();
        ConditionBean resourceCB = setupper.setup(entity, intoCB);
        return delegateQueryInsert(entity, intoCB, resourceCB, option);
    }

    protected LdCollectionStatusCB createCBForQueryInsert() {
        LdCollectionStatusCB cb = newMyConditionBean();
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
     * LdCollectionStatus collectionStatus = new LdCollectionStatus();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//collectionStatus.setPK...(value);</span>
     * collectionStatus.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//collectionStatus.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//collectionStatus.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//collectionStatus.setVersionNo(value);</span>
     * LdCollectionStatusCB cb = new LdCollectionStatusCB();
     * cb.query().setFoo...(value);
     * collectionStatusBhv.<span style="color: #FD4747">queryUpdate</span>(collectionStatus, cb);
     * </pre>
     * @param collectionStatus The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of LdCollectionStatus. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(LdCollectionStatus collectionStatus, LdCollectionStatusCB cb) {
        return doQueryUpdate(collectionStatus, cb, null);
    }

    protected int doQueryUpdate(LdCollectionStatus collectionStatus, LdCollectionStatusCB cb, UpdateOption<LdCollectionStatusCB> option) {
        assertObjectNotNull("collectionStatus", collectionStatus); assertCBStateValid(cb);
        prepareUpdateOption(option);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryUpdate(collectionStatus, cb, option) : 0;
    }

    @Override
    protected int doRangeModify(Entity entity, ConditionBean cb, UpdateOption<? extends ConditionBean> option) {
        if (option == null) { return queryUpdate(downcast(entity), (LdCollectionStatusCB)cb); }
        else { return varyingQueryUpdate(downcast(entity), (LdCollectionStatusCB)cb, downcast(option)); }
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * LdCollectionStatusCB cb = new LdCollectionStatusCB();
     * cb.query().setFoo...(value);
     * collectionStatusBhv.<span style="color: #FD4747">queryDelete</span>(collectionStatus, cb);
     * </pre>
     * @param cb The condition-bean of LdCollectionStatus. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(LdCollectionStatusCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(LdCollectionStatusCB cb, DeleteOption<LdCollectionStatusCB> option) {
        assertCBStateValid(cb);
        prepareDeleteOption(option);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryDelete(cb, option) : 0;
    }

    @Override
    protected int doRangeRemove(ConditionBean cb, DeleteOption<? extends ConditionBean> option) {
        if (option == null) { return queryDelete((LdCollectionStatusCB)cb); }
        else { return varyingQueryDelete((LdCollectionStatusCB)cb, downcast(option)); }
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
     * LdCollectionStatus collectionStatus = new LdCollectionStatus();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * collectionStatus.setFoo...(value);
     * collectionStatus.setBar...(value);
     * InsertOption<LdCollectionStatusCB> option = new InsertOption<LdCollectionStatusCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * collectionStatusBhv.<span style="color: #FD4747">varyingInsert</span>(collectionStatus, option);
     * ... = collectionStatus.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param collectionStatus The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(LdCollectionStatus collectionStatus, InsertOption<LdCollectionStatusCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(collectionStatus, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, ExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * LdCollectionStatus collectionStatus = new LdCollectionStatus();
     * collectionStatus.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * collectionStatus.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * collectionStatus.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;LdCollectionStatusCB&gt; option = new UpdateOption&lt;LdCollectionStatusCB&gt;();
     *     option.self(new SpecifyQuery&lt;LdCollectionStatusCB&gt;() {
     *         public void specify(LdCollectionStatusCB cb) {
     *             cb.specify().<span style="color: #FD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     collectionStatusBhv.<span style="color: #FD4747">varyingUpdate</span>(collectionStatus, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param collectionStatus The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(LdCollectionStatus collectionStatus, UpdateOption<LdCollectionStatusCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(collectionStatus, option);
    }

    /**
     * Update the entity with varying requests non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as updateNonstrict(entity).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * LdCollectionStatus collectionStatus = new LdCollectionStatus();
     * collectionStatus.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * collectionStatus.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//collectionStatus.setVersionNo(value);</span>
     * UpdateOption&lt;LdCollectionStatusCB&gt; option = new UpdateOption&lt;LdCollectionStatusCB&gt;();
     * option.self(new SpecifyQuery&lt;LdCollectionStatusCB&gt;() {
     *     public void specify(LdCollectionStatusCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * collectionStatusBhv.<span style="color: #FD4747">varyingUpdateNonstrict</span>(collectionStatus, option);
     * </pre>
     * @param collectionStatus The entity of update target. (NotNull, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdateNonstrict(LdCollectionStatus collectionStatus, UpdateOption<LdCollectionStatusCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdateNonstrict(collectionStatus, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param collectionStatus The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(LdCollectionStatus collectionStatus, InsertOption<LdCollectionStatusCB> insertOption, UpdateOption<LdCollectionStatusCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdate(collectionStatus, insertOption, updateOption);
    }

    /**
     * Insert or update the entity with varying requests non-strictly. (NonExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdateNonstrict(entity).
     * @param collectionStatus The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdateNonstrict(LdCollectionStatus collectionStatus, InsertOption<LdCollectionStatusCB> insertOption, UpdateOption<LdCollectionStatusCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdateNonstrict(collectionStatus, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, ExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param collectionStatus The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(LdCollectionStatus collectionStatus, DeleteOption<LdCollectionStatusCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(collectionStatus, option);
    }

    /**
     * Delete the entity with varying requests non-strictly. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as deleteNonstrict(entity).
     * @param collectionStatus The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDeleteNonstrict(LdCollectionStatus collectionStatus, DeleteOption<LdCollectionStatusCB> option) {
        assertDeleteOptionNotNull(option);
        doDeleteNonstrict(collectionStatus, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param collectionStatusList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<LdCollectionStatus> collectionStatusList, InsertOption<LdCollectionStatusCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(collectionStatusList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param collectionStatusList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<LdCollectionStatus> collectionStatusList, UpdateOption<LdCollectionStatusCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(collectionStatusList, option);
    }

    /**
     * Batch-update the list with varying requests non-strictly. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param collectionStatusList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdateNonstrict(List<LdCollectionStatus> collectionStatusList, UpdateOption<LdCollectionStatusCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdateNonstrict(collectionStatusList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param collectionStatusList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<LdCollectionStatus> collectionStatusList, DeleteOption<LdCollectionStatusCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(collectionStatusList, option);
    }

    /**
     * Batch-delete the list with varying requests non-strictly. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDeleteNonstrict(entityList).
     * @param collectionStatusList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDeleteNonstrict(List<LdCollectionStatus> collectionStatusList, DeleteOption<LdCollectionStatusCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDeleteNonstrict(collectionStatusList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<LdCollectionStatus, LdCollectionStatusCB> setupper, InsertOption<LdCollectionStatusCB> option) {
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
     * LdCollectionStatus collectionStatus = new LdCollectionStatus();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//collectionStatus.setPK...(value);</span>
     * collectionStatus.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//collectionStatus.setVersionNo(value);</span>
     * LdCollectionStatusCB cb = new LdCollectionStatusCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;LdCollectionStatusCB&gt; option = new UpdateOption&lt;LdCollectionStatusCB&gt;();
     * option.self(new SpecifyQuery&lt;LdCollectionStatusCB&gt;() {
     *     public void specify(LdCollectionStatusCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * collectionStatusBhv.<span style="color: #FD4747">varyingQueryUpdate</span>(collectionStatus, cb, option);
     * </pre>
     * @param collectionStatus The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of LdCollectionStatus. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(LdCollectionStatus collectionStatus, LdCollectionStatusCB cb, UpdateOption<LdCollectionStatusCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(collectionStatus, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of LdCollectionStatus. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(LdCollectionStatusCB cb, DeleteOption<LdCollectionStatusCB> option) {
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
    public OutsideSqlBasicExecutor<LdCollectionStatusBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCountUniquely(LdCollectionStatusCB cb) { return invoke(createSelectCountCBCommand(cb, true)); }
    protected int delegateSelectCountPlainly(LdCollectionStatusCB cb) { return invoke(createSelectCountCBCommand(cb, false)); }
    protected <ENTITY extends LdCollectionStatus> void delegateSelectCursor(LdCollectionStatusCB cb, EntityRowHandler<ENTITY> erh, Class<ENTITY> et)
    { invoke(createSelectCursorCBCommand(cb, erh, et)); }
    protected <ENTITY extends LdCollectionStatus> List<ENTITY> delegateSelectList(LdCollectionStatusCB cb, Class<ENTITY> et)
    { return invoke(createSelectListCBCommand(cb, et)); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(LdCollectionStatus e, InsertOption<LdCollectionStatusCB> op)
    { if (!processBeforeInsert(e, op)) { return 0; }
      return invoke(createInsertEntityCommand(e, op)); }
    protected int delegateUpdate(LdCollectionStatus e, UpdateOption<LdCollectionStatusCB> op)
    { if (!processBeforeUpdate(e, op)) { return 0; }
      return invoke(createUpdateEntityCommand(e, op)); }
    protected int delegateUpdateNonstrict(LdCollectionStatus e, UpdateOption<LdCollectionStatusCB> op)
    { if (!processBeforeUpdate(e, op)) { return 0; }
      return invoke(createUpdateNonstrictEntityCommand(e, op)); }
    protected int delegateDelete(LdCollectionStatus e, DeleteOption<LdCollectionStatusCB> op)
    { if (!processBeforeDelete(e, op)) { return 0; }
      return invoke(createDeleteEntityCommand(e, op)); }
    protected int delegateDeleteNonstrict(LdCollectionStatus e, DeleteOption<LdCollectionStatusCB> op)
    { if (!processBeforeDelete(e, op)) { return 0; }
      return invoke(createDeleteNonstrictEntityCommand(e, op)); }

    protected int[] delegateBatchInsert(List<LdCollectionStatus> ls, InsertOption<LdCollectionStatusCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchInsertCommand(processBatchInternally(ls, op), op)); }
    protected int[] delegateBatchUpdate(List<LdCollectionStatus> ls, UpdateOption<LdCollectionStatusCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateCommand(processBatchInternally(ls, op, false), op)); }
    protected int[] delegateBatchUpdateNonstrict(List<LdCollectionStatus> ls, UpdateOption<LdCollectionStatusCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateNonstrictCommand(processBatchInternally(ls, op, true), op)); }
    protected int[] delegateBatchDelete(List<LdCollectionStatus> ls, DeleteOption<LdCollectionStatusCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteCommand(processBatchInternally(ls, op, false), op)); }
    protected int[] delegateBatchDeleteNonstrict(List<LdCollectionStatus> ls, DeleteOption<LdCollectionStatusCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteNonstrictCommand(processBatchInternally(ls, op, true), op)); }

    protected int delegateQueryInsert(LdCollectionStatus e, LdCollectionStatusCB inCB, ConditionBean resCB, InsertOption<LdCollectionStatusCB> op)
    { if (!processBeforeQueryInsert(e, inCB, resCB, op)) { return 0; } return invoke(createQueryInsertCBCommand(e, inCB, resCB, op));  }
    protected int delegateQueryUpdate(LdCollectionStatus e, LdCollectionStatusCB cb, UpdateOption<LdCollectionStatusCB> op)
    { if (!processBeforeQueryUpdate(e, cb, op)) { return 0; } return invoke(createQueryUpdateCBCommand(e, cb, op));  }
    protected int delegateQueryDelete(LdCollectionStatusCB cb, DeleteOption<LdCollectionStatusCB> op)
    { if (!processBeforeQueryDelete(cb, op)) { return 0; } return invoke(createQueryDeleteCBCommand(cb, op));  }

    // ===================================================================================
    //                                                                     Filter Override
    //                                                                     ===============
    @Override
    protected void filterEntityOfInsert(Entity targetEntity, InsertOption<? extends ConditionBean> option) {
        super.filterEntityOfInsert(targetEntity, option);
        LdCollectionStatus entity = downcast(targetEntity);
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
    protected LdCollectionStatus downcast(Entity entity) {
        return helpEntityDowncastInternally(entity, LdCollectionStatus.class);
    }

    protected LdCollectionStatusCB downcast(ConditionBean cb) {
        return helpConditionBeanDowncastInternally(cb, LdCollectionStatusCB.class);
    }

    @SuppressWarnings("unchecked")
    protected List<LdCollectionStatus> downcast(List<? extends Entity> entityList) {
        return (List<LdCollectionStatus>)entityList;
    }

    @SuppressWarnings("unchecked")
    protected InsertOption<LdCollectionStatusCB> downcast(InsertOption<? extends ConditionBean> option) {
        return (InsertOption<LdCollectionStatusCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected UpdateOption<LdCollectionStatusCB> downcast(UpdateOption<? extends ConditionBean> option) {
        return (UpdateOption<LdCollectionStatusCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected DeleteOption<LdCollectionStatusCB> downcast(DeleteOption<? extends ConditionBean> option) {
        return (DeleteOption<LdCollectionStatusCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<LdCollectionStatus, LdCollectionStatusCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> option) {
        return (QueryInsertSetupper<LdCollectionStatus, LdCollectionStatusCB>)option;
    }
}
