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
 * The behavior of MYSELF as TABLE. <br />
 * <pre>
 * [primary key]
 *     MYSELF_ID
 * 
 * [column]
 *     MYSELF_ID, MYSELF_NAME
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
 *     
 * 
 * [referrer table]
 *     MYSELF_CHECK
 * 
 * [foreign property]
 *     
 * 
 * [referrer property]
 *     myselfCheckList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class LdBsMyselfBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "MYSELF"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public DBMeta getDBMeta() { return LdMyselfDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public LdMyselfDbm getMyDBMeta() { return LdMyselfDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public Entity newEntity() { return newMyEntity(); }

    /** {@inheritDoc} */
    public ConditionBean newConditionBean() { return newMyConditionBean(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public LdMyself newMyEntity() { return new LdMyself(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public LdMyselfCB newMyConditionBean() { return new LdMyselfCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * LdMyselfCB cb = new LdMyselfCB();
     * cb.query().setFoo...(value);
     * int count = myselfBhv.<span style="color: #FD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of LdMyself. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(LdMyselfCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(LdMyselfCB cb) { // called by selectCount(cb) 
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(LdMyselfCB cb) { // called by selectPage(cb)
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
     * LdMyselfCB cb = new LdMyselfCB();
     * cb.query().setFoo...(value);
     * LdMyself myself = myselfBhv.<span style="color: #FD4747">selectEntity</span>(cb);
     * if (myself != null) {
     *     ... = myself.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of LdMyself. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public LdMyself selectEntity(LdMyselfCB cb) {
        return doSelectEntity(cb, LdMyself.class);
    }

    protected <ENTITY extends LdMyself> ENTITY doSelectEntity(final LdMyselfCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityInternally(cb, entityType, new InternalSelectEntityCallback<ENTITY, LdMyselfCB>() {
            public List<ENTITY> callbackSelectList(LdMyselfCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); } });
    }

    @Override
    protected Entity doReadEntity(ConditionBean cb) {
        return selectEntity(downcast(cb));
    }

    /**
     * Select the entity by the condition-bean with deleted check.
     * <pre>
     * LdMyselfCB cb = new LdMyselfCB();
     * cb.query().setFoo...(value);
     * LdMyself myself = myselfBhv.<span style="color: #FD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = myself.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of LdMyself. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public LdMyself selectEntityWithDeletedCheck(LdMyselfCB cb) {
        return doSelectEntityWithDeletedCheck(cb, LdMyself.class);
    }

    protected <ENTITY extends LdMyself> ENTITY doSelectEntityWithDeletedCheck(final LdMyselfCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityWithDeletedCheckInternally(cb, entityType, new InternalSelectEntityWithDeletedCheckCallback<ENTITY, LdMyselfCB>() {
            public List<ENTITY> callbackSelectList(LdMyselfCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); } });
    }

    @Override
    protected Entity doReadEntityWithDeletedCheck(ConditionBean cb) {
        return selectEntityWithDeletedCheck(downcast(cb));
    }

    /**
     * Select the entity by the primary-key value.
     * @param myselfId The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public LdMyself selectByPKValue(Integer myselfId) {
        return doSelectByPKValue(myselfId, LdMyself.class);
    }

    protected <ENTITY extends LdMyself> ENTITY doSelectByPKValue(Integer myselfId, Class<ENTITY> entityType) {
        return doSelectEntity(buildPKCB(myselfId), entityType);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param myselfId The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public LdMyself selectByPKValueWithDeletedCheck(Integer myselfId) {
        return doSelectByPKValueWithDeletedCheck(myselfId, LdMyself.class);
    }

    protected <ENTITY extends LdMyself> ENTITY doSelectByPKValueWithDeletedCheck(Integer myselfId, Class<ENTITY> entityType) {
        return doSelectEntityWithDeletedCheck(buildPKCB(myselfId), entityType);
    }

    private LdMyselfCB buildPKCB(Integer myselfId) {
        assertObjectNotNull("myselfId", myselfId);
        LdMyselfCB cb = newMyConditionBean();
        cb.query().setMyselfId_Equal(myselfId);
        return cb;
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * LdMyselfCB cb = new LdMyselfCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;LdMyself&gt; myselfList = myselfBhv.<span style="color: #FD4747">selectList</span>(cb);
     * for (LdMyself myself : myselfList) {
     *     ... = myself.get...();
     * }
     * </pre>
     * @param cb The condition-bean of LdMyself. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<LdMyself> selectList(LdMyselfCB cb) {
        return doSelectList(cb, LdMyself.class);
    }

    protected <ENTITY extends LdMyself> ListResultBean<ENTITY> doSelectList(LdMyselfCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", entityType);
        assertSpecifyDerivedReferrerEntityProperty(cb, entityType);
        return helpSelectListInternally(cb, entityType, new InternalSelectListCallback<ENTITY, LdMyselfCB>() {
            public List<ENTITY> callbackSelectList(LdMyselfCB cb, Class<ENTITY> entityType) { return delegateSelectList(cb, entityType); } });
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
     * LdMyselfCB cb = new LdMyselfCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #FD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;LdMyself&gt; page = myselfBhv.<span style="color: #FD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (LdMyself myself : page) {
     *     ... = myself.get...();
     * }
     * </pre>
     * @param cb The condition-bean of LdMyself. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<LdMyself> selectPage(LdMyselfCB cb) {
        return doSelectPage(cb, LdMyself.class);
    }

    protected <ENTITY extends LdMyself> PagingResultBean<ENTITY> doSelectPage(LdMyselfCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", entityType);
        return helpSelectPageInternally(cb, entityType, new InternalSelectPageCallback<ENTITY, LdMyselfCB>() {
            public int callbackSelectCount(LdMyselfCB cb) { return doSelectCountPlainly(cb); }
            public List<ENTITY> callbackSelectList(LdMyselfCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); }
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
     * LdMyselfCB cb = new LdMyselfCB();
     * cb.query().setFoo...(value);
     * myselfBhv.<span style="color: #FD4747">selectCursor</span>(cb, new EntityRowHandler&lt;LdMyself&gt;() {
     *     public void handle(LdMyself entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of LdMyself. (NotNull)
     * @param entityRowHandler The handler of entity row of LdMyself. (NotNull)
     */
    public void selectCursor(LdMyselfCB cb, EntityRowHandler<LdMyself> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, LdMyself.class);
    }

    protected <ENTITY extends LdMyself> void doSelectCursor(LdMyselfCB cb, EntityRowHandler<ENTITY> entityRowHandler, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler<LdMyself>", entityRowHandler); assertObjectNotNull("entityType", entityType);
        assertSpecifyDerivedReferrerEntityProperty(cb, entityType);
        helpSelectCursorInternally(cb, entityRowHandler, entityType, new InternalSelectCursorCallback<ENTITY, LdMyselfCB>() {
            public void callbackSelectCursor(LdMyselfCB cb, EntityRowHandler<ENTITY> entityRowHandler, Class<ENTITY> entityType) { delegateSelectCursor(cb, entityRowHandler, entityType); }
            public List<ENTITY> callbackSelectList(LdMyselfCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); }
        });
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * myselfBhv.<span style="color: #FD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(LdMyselfCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> SLFunction<LdMyselfCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
    }

    protected <RESULT, CB extends LdMyselfCB> SLFunction<CB, RESULT> doScalarSelect(Class<RESULT> resultType, CB cb) {
        assertObjectNotNull("resultType", resultType); assertCBStateValid(cb);
        cb.xsetupForScalarSelect(); cb.getSqlClause().disableSelectIndex(); // for when you use union
        return createSLFunction(cb, resultType);
    }

    protected <RESULT, CB extends LdMyselfCB> SLFunction<CB, RESULT> createSLFunction(CB cb, Class<RESULT> resultType) {
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
     * @param myself The entity of myself. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     */
    public void loadMyselfCheckList(LdMyself myself, ConditionBeanSetupper<LdMyselfCheckCB> conditionBeanSetupper) {
        xassLRArg(myself, conditionBeanSetupper);
        loadMyselfCheckList(xnewLRLs(myself), conditionBeanSetupper);
    }
    /**
     * Load referrer of myselfCheckList with the set-upper for condition-bean of referrer. <br />
     * MYSELF_CHECK by MYSELF_ID, named 'myselfCheckList'.
     * <pre>
     * myselfBhv.<span style="color: #FD4747">loadMyselfCheckList</span>(myselfList, new ConditionBeanSetupper&lt;LdMyselfCheckCB&gt;() {
     *     public void setup(LdMyselfCheckCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...(); <span style="color: #3F7E5E">// basically you should order referrer list</span>
     *     }
     * });
     * for (LdMyself myself : myselfList) {
     *     ... = myself.<span style="color: #FD4747">getMyselfCheckList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key(and others too) is treated as case-insensitive. <br />
     * The condition-bean that the set-upper provides have settings before you touch it. It is as follows:
     * <pre>
     * cb.query().setMyselfId_InScope(pkList);
     * cb.query().addOrderBy_MyselfId_Asc();
     * </pre>
     * @param myselfList The entity list of myself. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     */
    public void loadMyselfCheckList(List<LdMyself> myselfList, ConditionBeanSetupper<LdMyselfCheckCB> conditionBeanSetupper) {
        xassLRArg(myselfList, conditionBeanSetupper);
        loadMyselfCheckList(myselfList, new LoadReferrerOption<LdMyselfCheckCB, LdMyselfCheck>().xinit(conditionBeanSetupper));
    }
    /**
     * {Refer to overload method that has an argument of the list of entity.}
     * @param myself The entity of myself. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadMyselfCheckList(LdMyself myself, LoadReferrerOption<LdMyselfCheckCB, LdMyselfCheck> loadReferrerOption) {
        xassLRArg(myself, loadReferrerOption);
        loadMyselfCheckList(xnewLRLs(myself), loadReferrerOption);
    }
    /**
     * {Refer to overload method that has an argument of condition-bean setupper.}
     * @param myselfList The entity list of myself. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadMyselfCheckList(List<LdMyself> myselfList, LoadReferrerOption<LdMyselfCheckCB, LdMyselfCheck> loadReferrerOption) {
        xassLRArg(myselfList, loadReferrerOption);
        if (myselfList.isEmpty()) { return; }
        final LdMyselfCheckBhv referrerBhv = xgetBSFLR().select(LdMyselfCheckBhv.class);
        helpLoadReferrerInternally(myselfList, loadReferrerOption, new InternalLoadReferrerCallback<LdMyself, Integer, LdMyselfCheckCB, LdMyselfCheck>() {
            public Integer getPKVal(LdMyself e)
            { return e.getMyselfId(); }
            public void setRfLs(LdMyself e, List<LdMyselfCheck> ls)
            { e.setMyselfCheckList(ls); }
            public LdMyselfCheckCB newMyCB() { return referrerBhv.newMyConditionBean(); }
            public void qyFKIn(LdMyselfCheckCB cb, List<Integer> ls)
            { cb.query().setMyselfId_InScope(ls); }
            public void qyOdFKAsc(LdMyselfCheckCB cb) { cb.query().addOrderBy_MyselfId_Asc(); }
            public void spFKCol(LdMyselfCheckCB cb) { cb.specify().columnMyselfId(); }
            public List<LdMyselfCheck> selRfLs(LdMyselfCheckCB cb) { return referrerBhv.selectList(cb); }
            public Integer getFKVal(LdMyselfCheck e) { return e.getMyselfId(); }
            public void setlcEt(LdMyselfCheck re, LdMyself le)
            { re.setMyself(le); }
            public String getRfPrNm() { return "myselfCheckList"; }
        });
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key myselfId.
     * @param myselfList The list of myself. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Integer> extractMyselfIdList(List<LdMyself> myselfList) {
        return helpExtractListInternally(myselfList, new InternalExtractCallback<LdMyself, Integer>() {
            public Integer getCV(LdMyself e) { return e.getMyselfId(); }
        });
    }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * LdMyself myself = new LdMyself();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * myself.setFoo...(value);
     * myself.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//myself.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//myself.set...;</span>
     * myselfBhv.<span style="color: #FD4747">insert</span>(myself);
     * ... = myself.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param myself The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(LdMyself myself) {
        doInsert(myself, null);
    }

    protected void doInsert(LdMyself myself, InsertOption<LdMyselfCB> option) {
        assertObjectNotNull("myself", myself);
        prepareInsertOption(option);
        delegateInsert(myself, option);
    }

    protected void prepareInsertOption(InsertOption<LdMyselfCB> option) {
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
     * Update the entity modified-only. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * LdMyself myself = new LdMyself();
     * myself.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * myself.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//myself.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//myself.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * myself.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     myselfBhv.<span style="color: #FD4747">update</span>(myself);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * } 
     * </pre>
     * @param myself The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(final LdMyself myself) {
        doUpdate(myself, null);
    }

    protected void doUpdate(LdMyself myself, final UpdateOption<LdMyselfCB> option) {
        assertObjectNotNull("myself", myself);
        prepareUpdateOption(option);
        helpUpdateInternally(myself, new InternalUpdateCallback<LdMyself>() {
            public int callbackDelegateUpdate(LdMyself entity) { return delegateUpdate(entity, option); } });
    }

    protected void prepareUpdateOption(UpdateOption<LdMyselfCB> option) {
        if (option == null) { return; }
        assertUpdateOptionStatus(option);
        if (option.hasSelfSpecification()) {
            option.resolveSelfSpecification(createCBForVaryingUpdate());
        }
        if (option.hasSpecifiedUpdateColumn()) {
            option.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    protected LdMyselfCB createCBForVaryingUpdate() {
        LdMyselfCB cb = newMyConditionBean();
        cb.xsetupForVaryingUpdate();
        return cb;
    }

    protected LdMyselfCB createCBForSpecifiedUpdate() {
        LdMyselfCB cb = newMyConditionBean();
        cb.xsetupForSpecifiedUpdate();
        return cb;
    }

    @Override
    protected void doModify(Entity entity, UpdateOption<? extends ConditionBean> option) {
        if (option == null) { update(downcast(entity)); }
        else { varyingUpdate(downcast(entity), downcast(option)); }
    }

    @Override
    protected void doModifyNonstrict(Entity entity, UpdateOption<? extends ConditionBean> option) {
        doModify(entity, option);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br />
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br />
     * <p><span style="color: #FD4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param myself The entity of insert or update target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(LdMyself myself) {
        doInesrtOrUpdate(myself, null, null);
    }

    protected void doInesrtOrUpdate(LdMyself myself, final InsertOption<LdMyselfCB> insertOption, final UpdateOption<LdMyselfCB> updateOption) {
        helpInsertOrUpdateInternally(myself, new InternalInsertOrUpdateCallback<LdMyself, LdMyselfCB>() {
            public void callbackInsert(LdMyself entity) { doInsert(entity, insertOption); }
            public void callbackUpdate(LdMyself entity) { doUpdate(entity, updateOption); }
            public LdMyselfCB callbackNewMyConditionBean() { return newMyConditionBean(); }
            public int callbackSelectCount(LdMyselfCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrModify(Entity entity, InsertOption<? extends ConditionBean> insertOption,
            UpdateOption<? extends ConditionBean> updateOption) {
        if (insertOption == null && updateOption == null) { insertOrUpdate(downcast(entity)); }
        else {
            insertOption = insertOption == null ? new InsertOption<LdMyselfCB>() : insertOption;
            updateOption = updateOption == null ? new UpdateOption<LdMyselfCB>() : updateOption;
            varyingInsertOrUpdate(downcast(entity), downcast(insertOption), downcast(updateOption));
        }
    }

    @Override
    protected void doCreateOrModifyNonstrict(Entity entity, InsertOption<? extends ConditionBean> insertOption,
            UpdateOption<? extends ConditionBean> updateOption) {
        doCreateOrModify(entity, insertOption, updateOption);
    }

    /**
     * Delete the entity. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * LdMyself myself = new LdMyself();
     * myself.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * myself.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     myselfBhv.<span style="color: #FD4747">delete</span>(myself);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * } 
     * </pre>
     * @param myself The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(LdMyself myself) {
        doDelete(myself, null);
    }

    protected void doDelete(LdMyself myself, final DeleteOption<LdMyselfCB> option) {
        assertObjectNotNull("myself", myself);
        prepareDeleteOption(option);
        helpDeleteInternally(myself, new InternalDeleteCallback<LdMyself>() {
            public int callbackDelegateDelete(LdMyself entity) { return delegateDelete(entity, option); } });
    }

    protected void prepareDeleteOption(DeleteOption<LdMyselfCB> option) {
        if (option == null) { return; }
        assertDeleteOptionStatus(option);
    }

    @Override
    protected void doRemove(Entity entity, DeleteOption<? extends ConditionBean> option) {
        if (option == null) { delete(downcast(entity)); }
        else { varyingDelete(downcast(entity), downcast(option)); }
    }

    @Override
    protected void doRemoveNonstrict(Entity entity, DeleteOption<? extends ConditionBean> option) {
        doRemove(entity, option);
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
     *     LdMyself myself = new LdMyself();
     *     myself.setFooName("foo");
     *     if (...) {
     *         myself.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     myselfList.add(myself);
     * }
     * myselfBhv.<span style="color: #FD4747">batchInsert</span>(myselfList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param myselfList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<LdMyself> myselfList) {
        InsertOption<LdMyselfCB> option = createInsertUpdateOption();
        return doBatchInsert(myselfList, option);
    }

    protected int[] doBatchInsert(List<LdMyself> myselfList, InsertOption<LdMyselfCB> option) {
        assertObjectNotNull("myselfList", myselfList);
        prepareBatchInsertOption(myselfList, option);
        return delegateBatchInsert(myselfList, option);
    }

    protected void prepareBatchInsertOption(List<LdMyself> myselfList, InsertOption<LdMyselfCB> option) {
        option.xallowInsertColumnModifiedPropertiesFragmented();
        option.xacceptInsertColumnModifiedPropertiesIfNeeds(myselfList);
        prepareInsertOption(option);
    }

    @Override
    protected int[] doLumpCreate(List<Entity> ls, InsertOption<? extends ConditionBean> option) {
        if (option == null) { return batchInsert(downcast(ls)); }
        else { return varyingBatchInsert(downcast(ls), downcast(option)); }
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <span style="color: #FD4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     LdMyself myself = new LdMyself();
     *     myself.setFooName("foo");
     *     if (...) {
     *         myself.setFooPrice(123);
     *     } else {
     *         myself.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//myself.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     myselfList.add(myself);
     * }
     * myselfBhv.<span style="color: #FD4747">batchUpdate</span>(myselfList);
     * </pre>
     * @param myselfList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<LdMyself> myselfList) {
        UpdateOption<LdMyselfCB> option = createPlainUpdateOption();
        return doBatchUpdate(myselfList, option);
    }

    protected int[] doBatchUpdate(List<LdMyself> myselfList, UpdateOption<LdMyselfCB> option) {
        assertObjectNotNull("myselfList", myselfList);
        prepareBatchUpdateOption(myselfList, option);
        return delegateBatchUpdate(myselfList, option);
    }

    protected void prepareBatchUpdateOption(List<LdMyself> myselfList, UpdateOption<LdMyselfCB> option) {
        option.xacceptUpdateColumnModifiedPropertiesIfNeeds(myselfList);
        prepareUpdateOption(option);
    }

    @Override
    protected int[] doLumpModify(List<Entity> ls, UpdateOption<? extends ConditionBean> option) {
        if (option == null) { return batchUpdate(downcast(ls)); }
        else { return varyingBatchUpdate(downcast(ls), downcast(option)); }
    }

    /**
     * Batch-update the entity list specified-only. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span> 
     * myselfBhv.<span style="color: #FD4747">batchUpdate</span>(myselfList, new SpecifyQuery<LdMyselfCB>() {
     *     public void specify(LdMyselfCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #FD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #FD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span> 
     * myselfBhv.<span style="color: #FD4747">batchUpdate</span>(myselfList, new SpecifyQuery<LdMyselfCB>() {
     *     public void specify(LdMyselfCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #FD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param myselfList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<LdMyself> myselfList, SpecifyQuery<LdMyselfCB> updateColumnSpec) {
        return doBatchUpdate(myselfList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> option) {
        return doLumpModify(ls, option);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param myselfList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<LdMyself> myselfList) {
        return doBatchDelete(myselfList, null);
    }

    protected int[] doBatchDelete(List<LdMyself> myselfList, DeleteOption<LdMyselfCB> option) {
        assertObjectNotNull("myselfList", myselfList);
        prepareDeleteOption(option);
        return delegateBatchDelete(myselfList, option);
    }

    @Override
    protected int[] doLumpRemove(List<Entity> ls, DeleteOption<? extends ConditionBean> option) {
        if (option == null) { return batchDelete(downcast(ls)); }
        else { return varyingBatchDelete(downcast(ls), downcast(option)); }
    }

    @Override
    protected int[] doLumpRemoveNonstrict(List<Entity> ls, DeleteOption<? extends ConditionBean> option) {
        return doLumpRemove(ls, option);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * myselfBhv.<span style="color: #FD4747">queryInsert</span>(new QueryInsertSetupper&lt;LdMyself, LdMyselfCB&gt;() {
     *     public ConditionBean setup(myself entity, LdMyselfCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<LdMyself, LdMyselfCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(QueryInsertSetupper<LdMyself, LdMyselfCB> setupper, InsertOption<LdMyselfCB> option) {
        assertObjectNotNull("setupper", setupper);
        prepareInsertOption(option);
        LdMyself entity = new LdMyself();
        LdMyselfCB intoCB = createCBForQueryInsert();
        ConditionBean resourceCB = setupper.setup(entity, intoCB);
        return delegateQueryInsert(entity, intoCB, resourceCB, option);
    }

    protected LdMyselfCB createCBForQueryInsert() {
        LdMyselfCB cb = newMyConditionBean();
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
     * LdMyself myself = new LdMyself();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//myself.setPK...(value);</span>
     * myself.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//myself.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//myself.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//myself.setVersionNo(value);</span>
     * LdMyselfCB cb = new LdMyselfCB();
     * cb.query().setFoo...(value);
     * myselfBhv.<span style="color: #FD4747">queryUpdate</span>(myself, cb);
     * </pre>
     * @param myself The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of LdMyself. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(LdMyself myself, LdMyselfCB cb) {
        return doQueryUpdate(myself, cb, null);
    }

    protected int doQueryUpdate(LdMyself myself, LdMyselfCB cb, UpdateOption<LdMyselfCB> option) {
        assertObjectNotNull("myself", myself); assertCBStateValid(cb);
        prepareUpdateOption(option);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryUpdate(myself, cb, option) : 0;
    }

    @Override
    protected int doRangeModify(Entity entity, ConditionBean cb, UpdateOption<? extends ConditionBean> option) {
        if (option == null) { return queryUpdate(downcast(entity), (LdMyselfCB)cb); }
        else { return varyingQueryUpdate(downcast(entity), (LdMyselfCB)cb, downcast(option)); }
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * LdMyselfCB cb = new LdMyselfCB();
     * cb.query().setFoo...(value);
     * myselfBhv.<span style="color: #FD4747">queryDelete</span>(myself, cb);
     * </pre>
     * @param cb The condition-bean of LdMyself. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(LdMyselfCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(LdMyselfCB cb, DeleteOption<LdMyselfCB> option) {
        assertCBStateValid(cb);
        prepareDeleteOption(option);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryDelete(cb, option) : 0;
    }

    @Override
    protected int doRangeRemove(ConditionBean cb, DeleteOption<? extends ConditionBean> option) {
        if (option == null) { return queryDelete((LdMyselfCB)cb); }
        else { return varyingQueryDelete((LdMyselfCB)cb, downcast(option)); }
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
     * LdMyself myself = new LdMyself();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * myself.setFoo...(value);
     * myself.setBar...(value);
     * InsertOption<LdMyselfCB> option = new InsertOption<LdMyselfCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * myselfBhv.<span style="color: #FD4747">varyingInsert</span>(myself, option);
     * ... = myself.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param myself The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(LdMyself myself, InsertOption<LdMyselfCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(myself, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * LdMyself myself = new LdMyself();
     * myself.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * myself.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * myself.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;LdMyselfCB&gt; option = new UpdateOption&lt;LdMyselfCB&gt;();
     *     option.self(new SpecifyQuery&lt;LdMyselfCB&gt;() {
     *         public void specify(LdMyselfCB cb) {
     *             cb.specify().<span style="color: #FD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     myselfBhv.<span style="color: #FD4747">varyingUpdate</span>(myself, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param myself The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(LdMyself myself, UpdateOption<LdMyselfCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(myself, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param myself The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(LdMyself myself, InsertOption<LdMyselfCB> insertOption, UpdateOption<LdMyselfCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdate(myself, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param myself The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(LdMyself myself, DeleteOption<LdMyselfCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(myself, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param myselfList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<LdMyself> myselfList, InsertOption<LdMyselfCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(myselfList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param myselfList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<LdMyself> myselfList, UpdateOption<LdMyselfCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(myselfList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param myselfList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<LdMyself> myselfList, DeleteOption<LdMyselfCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(myselfList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<LdMyself, LdMyselfCB> setupper, InsertOption<LdMyselfCB> option) {
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
     * LdMyself myself = new LdMyself();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//myself.setPK...(value);</span>
     * myself.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//myself.setVersionNo(value);</span>
     * LdMyselfCB cb = new LdMyselfCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;LdMyselfCB&gt; option = new UpdateOption&lt;LdMyselfCB&gt;();
     * option.self(new SpecifyQuery&lt;LdMyselfCB&gt;() {
     *     public void specify(LdMyselfCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * myselfBhv.<span style="color: #FD4747">varyingQueryUpdate</span>(myself, cb, option);
     * </pre>
     * @param myself The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of LdMyself. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(LdMyself myself, LdMyselfCB cb, UpdateOption<LdMyselfCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(myself, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of LdMyself. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(LdMyselfCB cb, DeleteOption<LdMyselfCB> option) {
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
    public OutsideSqlBasicExecutor<LdMyselfBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCountUniquely(LdMyselfCB cb) { return invoke(createSelectCountCBCommand(cb, true)); }
    protected int delegateSelectCountPlainly(LdMyselfCB cb) { return invoke(createSelectCountCBCommand(cb, false)); }
    protected <ENTITY extends LdMyself> void delegateSelectCursor(LdMyselfCB cb, EntityRowHandler<ENTITY> erh, Class<ENTITY> et)
    { invoke(createSelectCursorCBCommand(cb, erh, et)); }
    protected <ENTITY extends LdMyself> List<ENTITY> delegateSelectList(LdMyselfCB cb, Class<ENTITY> et)
    { return invoke(createSelectListCBCommand(cb, et)); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(LdMyself e, InsertOption<LdMyselfCB> op)
    { if (!processBeforeInsert(e, op)) { return 0; }
      return invoke(createInsertEntityCommand(e, op)); }
    protected int delegateUpdate(LdMyself e, UpdateOption<LdMyselfCB> op)
    { if (!processBeforeUpdate(e, op)) { return 0; }
      return delegateUpdateNonstrict(e, op); }
    protected int delegateUpdateNonstrict(LdMyself e, UpdateOption<LdMyselfCB> op)
    { if (!processBeforeUpdate(e, op)) { return 0; }
      return invoke(createUpdateNonstrictEntityCommand(e, op)); }
    protected int delegateDelete(LdMyself e, DeleteOption<LdMyselfCB> op)
    { if (!processBeforeDelete(e, op)) { return 0; }
      return delegateDeleteNonstrict(e, op); }
    protected int delegateDeleteNonstrict(LdMyself e, DeleteOption<LdMyselfCB> op)
    { if (!processBeforeDelete(e, op)) { return 0; }
      return invoke(createDeleteNonstrictEntityCommand(e, op)); }

    protected int[] delegateBatchInsert(List<LdMyself> ls, InsertOption<LdMyselfCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchInsertCommand(processBatchInternally(ls, op), op)); }
    protected int[] delegateBatchUpdate(List<LdMyself> ls, UpdateOption<LdMyselfCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchUpdateNonstrict(ls, op); }
    protected int[] delegateBatchUpdateNonstrict(List<LdMyself> ls, UpdateOption<LdMyselfCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateNonstrictCommand(processBatchInternally(ls, op, true), op)); }
    protected int[] delegateBatchDelete(List<LdMyself> ls, DeleteOption<LdMyselfCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchDeleteNonstrict(ls, op); }
    protected int[] delegateBatchDeleteNonstrict(List<LdMyself> ls, DeleteOption<LdMyselfCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteNonstrictCommand(processBatchInternally(ls, op, true), op)); }

    protected int delegateQueryInsert(LdMyself e, LdMyselfCB inCB, ConditionBean resCB, InsertOption<LdMyselfCB> op)
    { if (!processBeforeQueryInsert(e, inCB, resCB, op)) { return 0; } return invoke(createQueryInsertCBCommand(e, inCB, resCB, op));  }
    protected int delegateQueryUpdate(LdMyself e, LdMyselfCB cb, UpdateOption<LdMyselfCB> op)
    { if (!processBeforeQueryUpdate(e, cb, op)) { return 0; } return invoke(createQueryUpdateCBCommand(e, cb, op));  }
    protected int delegateQueryDelete(LdMyselfCB cb, DeleteOption<LdMyselfCB> op)
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
        return false;
    }

    // ===================================================================================
    //                                                                     Downcast Helper
    //                                                                     ===============
    protected LdMyself downcast(Entity entity) {
        return helpEntityDowncastInternally(entity, LdMyself.class);
    }

    protected LdMyselfCB downcast(ConditionBean cb) {
        return helpConditionBeanDowncastInternally(cb, LdMyselfCB.class);
    }

    @SuppressWarnings("unchecked")
    protected List<LdMyself> downcast(List<? extends Entity> entityList) {
        return (List<LdMyself>)entityList;
    }

    @SuppressWarnings("unchecked")
    protected InsertOption<LdMyselfCB> downcast(InsertOption<? extends ConditionBean> option) {
        return (InsertOption<LdMyselfCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected UpdateOption<LdMyselfCB> downcast(UpdateOption<? extends ConditionBean> option) {
        return (UpdateOption<LdMyselfCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected DeleteOption<LdMyselfCB> downcast(DeleteOption<? extends ConditionBean> option) {
        return (DeleteOption<LdMyselfCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<LdMyself, LdMyselfCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> option) {
        return (QueryInsertSetupper<LdMyself, LdMyselfCB>)option;
    }
}
