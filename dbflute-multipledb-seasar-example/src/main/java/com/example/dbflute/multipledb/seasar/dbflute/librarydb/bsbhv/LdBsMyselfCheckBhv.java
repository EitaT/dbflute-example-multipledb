/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */package com.example.dbflute.multipledb.seasar.dbflute.librarydb.bsbhv;

import java.util.List;

import org.seasar.dbflute.*;
import org.seasar.dbflute.bhv.*;
import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.cbean.chelper.HpSLSExecutor;
import org.seasar.dbflute.cbean.chelper.HpSLSFunction;
import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.exception.*;
import org.seasar.dbflute.optional.OptionalEntity;
import org.seasar.dbflute.outsidesql.executor.*;
import com.example.dbflute.multipledb.seasar.dbflute.librarydb.exbhv.*;
import com.example.dbflute.multipledb.seasar.dbflute.librarydb.bsbhv.loader.*;
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
    /** {@inheritDoc} */
    public DBMeta getDBMeta() { return LdMyselfCheckDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public LdMyselfCheckDbm getMyDBMeta() { return LdMyselfCheckDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public LdMyselfCheck newEntity() { return new LdMyselfCheck(); }

    /** {@inheritDoc} */
    public LdMyselfCheckCB newConditionBean() { return new LdMyselfCheckCB(); }

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
     * int count = myselfCheckBhv.<span style="color: #DD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of LdMyselfCheck. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(LdMyselfCheckCB cb) {
        return facadeSelectCount(cb);
    }

    protected int facadeSelectCount(LdMyselfCheckCB cb) {
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

    protected int doReadCount(ConditionBean cb) { return facadeSelectCount(downcast(cb)); }

    // ===================================================================================
    //                                                                       Entity Select
    //                                                                       =============
    /**
     * Select the entity by the condition-bean. #beforejava8 <br />
     * <span style="color: #AD4747; font-size: 120%">The return might be null if no data, so you should have null check.</span> <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, use selectEntityWithDeletedCheck().</span>
     * <pre>
     * LdMyselfCheckCB cb = new LdMyselfCheckCB();
     * cb.query().setFoo...(value);
     * LdMyselfCheck myselfCheck = myselfCheckBhv.<span style="color: #DD4747">selectEntity</span>(cb);
     * if (myselfCheck != null) { <span style="color: #3F7E5E">// null check</span>
     *     ... = myselfCheck.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of LdMyselfCheck. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public LdMyselfCheck selectEntity(LdMyselfCheckCB cb) {
        return facadeSelectEntity(cb);
    }

    protected LdMyselfCheck facadeSelectEntity(LdMyselfCheckCB cb) {
        return doSelectEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends LdMyselfCheck> ENTITY doSelectEntity(LdMyselfCheckCB cb, Class<ENTITY> tp) {
        return helpSelectEntityInternally(cb, tp);
    }

    protected <ENTITY extends LdMyselfCheck> OptionalEntity<ENTITY> doSelectOptionalEntity(LdMyselfCheckCB cb, Class<ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)); }

    /**
     * Select the entity by the condition-bean with deleted check. <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, this method is good.</span>
     * <pre>
     * LdMyselfCheckCB cb = new LdMyselfCheckCB();
     * cb.query().setFoo...(value);
     * LdMyselfCheck myselfCheck = myselfCheckBhv.<span style="color: #DD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = myselfCheck.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of LdMyselfCheck. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public LdMyselfCheck selectEntityWithDeletedCheck(LdMyselfCheckCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    protected LdMyselfCheck facadeSelectEntityWithDeletedCheck(LdMyselfCheckCB cb) {
        return doSelectEntityWithDeletedCheck(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends LdMyselfCheck> ENTITY doSelectEntityWithDeletedCheck(LdMyselfCheckCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectEntityWithDeletedCheckInternally(cb, tp);
    }

    protected Entity doReadEntityWithDeletedCheck(ConditionBean cb) { return facadeSelectEntityWithDeletedCheck(downcast(cb)); }

    /**
     * Select the entity by the primary-key value.
     * @param myselfCheckId : PK, NotNull, INTEGER(10). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public LdMyselfCheck selectByPKValue(Integer myselfCheckId) {
        return facadeSelectByPKValue(myselfCheckId);
    }

    protected LdMyselfCheck facadeSelectByPKValue(Integer myselfCheckId) {
        return doSelectByPK(myselfCheckId, typeOfSelectedEntity());
    }

    protected <ENTITY extends LdMyselfCheck> ENTITY doSelectByPK(Integer myselfCheckId, Class<ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(myselfCheckId), tp);
    }

    protected <ENTITY extends LdMyselfCheck> OptionalEntity<ENTITY> doSelectOptionalByPK(Integer myselfCheckId, Class<ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(myselfCheckId, tp), myselfCheckId);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param myselfCheckId : PK, NotNull, INTEGER(10). (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public LdMyselfCheck selectByPKValueWithDeletedCheck(Integer myselfCheckId) {
        return doSelectByPKWithDeletedCheck(myselfCheckId, typeOfSelectedEntity());
    }

    protected <ENTITY extends LdMyselfCheck> ENTITY doSelectByPKWithDeletedCheck(Integer myselfCheckId, Class<ENTITY> tp) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(myselfCheckId), tp);
    }

    protected LdMyselfCheckCB xprepareCBAsPK(Integer myselfCheckId) {
        assertObjectNotNull("myselfCheckId", myselfCheckId);
        return newConditionBean().acceptPK(myselfCheckId);
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
     * ListResultBean&lt;LdMyselfCheck&gt; myselfCheckList = myselfCheckBhv.<span style="color: #DD4747">selectList</span>(cb);
     * for (LdMyselfCheck myselfCheck : myselfCheckList) {
     *     ... = myselfCheck.get...();
     * }
     * </pre>
     * @param cb The condition-bean of LdMyselfCheck. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<LdMyselfCheck> selectList(LdMyselfCheckCB cb) {
        return facadeSelectList(cb);
    }

    protected ListResultBean<LdMyselfCheck> facadeSelectList(LdMyselfCheckCB cb) {
        return doSelectList(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends LdMyselfCheck> ListResultBean<ENTITY> doSelectList(LdMyselfCheckCB cb, Class<ENTITY> tp) {
        return helpSelectListInternally(cb, tp);
    }

    protected ListResultBean<? extends Entity> doReadList(ConditionBean cb) { return facadeSelectList(downcast(cb)); }

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
     * cb.<span style="color: #DD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;LdMyselfCheck&gt; page = myselfCheckBhv.<span style="color: #DD4747">selectPage</span>(cb);
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
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<LdMyselfCheck> selectPage(LdMyselfCheckCB cb) {
        return facadeSelectPage(cb);
    }

    protected PagingResultBean<LdMyselfCheck> facadeSelectPage(LdMyselfCheckCB cb) {
        return doSelectPage(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends LdMyselfCheck> PagingResultBean<ENTITY> doSelectPage(LdMyselfCheckCB cb, Class<ENTITY> tp) {
        return helpSelectPageInternally(cb, tp);
    }

    protected PagingResultBean<? extends Entity> doReadPage(ConditionBean cb) { return facadeSelectPage(downcast(cb)); }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * LdMyselfCheckCB cb = new LdMyselfCheckCB();
     * cb.query().setFoo...(value);
     * myselfCheckBhv.<span style="color: #DD4747">selectCursor</span>(cb, new EntityRowHandler&lt;LdMyselfCheck&gt;() {
     *     public void handle(LdMyselfCheck entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of LdMyselfCheck. (NotNull)
     * @param entityRowHandler The handler of entity row of LdMyselfCheck. (NotNull)
     */
    public void selectCursor(LdMyselfCheckCB cb, EntityRowHandler<LdMyselfCheck> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    protected void facadeSelectCursor(LdMyselfCheckCB cb, EntityRowHandler<LdMyselfCheck> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, typeOfSelectedEntity());
    }

    protected <ENTITY extends LdMyselfCheck> void doSelectCursor(LdMyselfCheckCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler", handler); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        helpSelectCursorInternally(cb, handler, tp);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * myselfCheckBhv.<span style="color: #DD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(LdMyselfCheckCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<LdMyselfCheckCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return facadeScalarSelect(resultType);
    }

    protected <RESULT> HpSLSFunction<LdMyselfCheckCB, RESULT> facadeScalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newConditionBean());
    }

    protected <RESULT, CB extends LdMyselfCheckCB> HpSLSFunction<CB, RESULT> doScalarSelect(final Class<RESULT> tp, final CB cb) {
        assertObjectNotNull("resultType", tp); assertCBStateValid(cb);
        cb.xsetupForScalarSelect(); cb.getSqlClause().disableSelectIndex(); // for when you use union
        HpSLSExecutor<CB, RESULT> executor = createHpSLSExecutor(); // variable to resolve generic
        return createSLSFunction(cb, tp, executor);
    }

    protected <RESULT> HpSLSFunction<? extends ConditionBean, RESULT> doReadScalar(Class<RESULT> tp) { return facadeScalarSelect(tp); }

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
     * Load referrer by the the referrer loader. <br />
     * <pre>
     * MemberCB cb = new MemberCB();
     * cb.query().set...
     * List&lt;Member&gt; memberList = memberBhv.selectList(cb);
     * memberBhv.<span style="color: #DD4747">load</span>(memberList, loader -&gt; {
     *     loader.<span style="color: #DD4747">loadPurchaseList</span>(purchaseCB -&gt; {
     *         purchaseCB.query().set...
     *         purchaseCB.query().addOrderBy_PurchasePrice_Desc();
     *     }); <span style="color: #3F7E5E">// you can also load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedList(purchaseLoader -&gt {</span>
     *     <span style="color: #3F7E5E">//    purchaseLoader.loadPurchasePaymentList(...);</span>
     *     <span style="color: #3F7E5E">//});</span>
     *
     *     <span style="color: #3F7E5E">// you can also pull out foreign table and load its referrer</span>
     *     <span style="color: #3F7E5E">// (setupSelect of the foreign table should be called)</span>
     *     <span style="color: #3F7E5E">//loader.pulloutMemberStatus().loadMemberLoginList(...)</span>
     * }
     * for (Member member : memberList) {
     *     List&lt;Purchase&gt; purchaseList = member.<span style="color: #DD4747">getPurchaseList()</span>;
     *     for (Purchase purchase : purchaseList) {
     *         ...
     *     }
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has order by FK before callback.
     * @param myselfCheckList The entity list of myselfCheck. (NotNull)
     * @param handler The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<LdMyselfCheck> myselfCheckList, ReferrerLoaderHandler<LdLoaderOfMyselfCheck> handler) {
        xassLRArg(myselfCheckList, handler);
        handler.handle(new LdLoaderOfMyselfCheck().ready(myselfCheckList, _behaviorSelector));
    }

    /**
     * Load referrer of ${referrer.referrerJavaBeansRulePropertyName} by the referrer loader. <br />
     * <pre>
     * MemberCB cb = new MemberCB();
     * cb.query().set...
     * Member member = memberBhv.selectEntityWithDeletedCheck(cb);
     * memberBhv.<span style="color: #DD4747">load</span>(member, loader -&gt; {
     *     loader.<span style="color: #DD4747">loadPurchaseList</span>(purchaseCB -&gt; {
     *         purchaseCB.query().set...
     *         purchaseCB.query().addOrderBy_PurchasePrice_Desc();
     *     }); <span style="color: #3F7E5E">// you can also load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedList(purchaseLoader -&gt {</span>
     *     <span style="color: #3F7E5E">//    purchaseLoader.loadPurchasePaymentList(...);</span>
     *     <span style="color: #3F7E5E">//});</span>
     *
     *     <span style="color: #3F7E5E">// you can also pull out foreign table and load its referrer</span>
     *     <span style="color: #3F7E5E">// (setupSelect of the foreign table should be called)</span>
     *     <span style="color: #3F7E5E">//loader.pulloutMemberStatus().loadMemberLoginList(...)</span>
     * }
     * for (Member member : memberList) {
     *     List&lt;Purchase&gt; purchaseList = member.<span style="color: #DD4747">getPurchaseList()</span>;
     *     for (Purchase purchase : purchaseList) {
     *         ...
     *     }
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has order by FK before callback.
     * @param myselfCheck The entity of myselfCheck. (NotNull)
     * @param handler The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(LdMyselfCheck myselfCheck, ReferrerLoaderHandler<LdLoaderOfMyselfCheck> handler) {
        xassLRArg(myselfCheck, handler);
        handler.handle(new LdLoaderOfMyselfCheck().ready(xnewLRAryLs(myselfCheck), _behaviorSelector));
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'LdMyself'.
     * @param myselfCheckList The list of myselfCheck. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<LdMyself> pulloutMyself(List<LdMyselfCheck> myselfCheckList)
    { return helpPulloutInternally(myselfCheckList, "myself"); }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key myselfCheckId.
     * @param myselfCheckList The list of myselfCheck. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Integer> extractMyselfCheckIdList(List<LdMyselfCheck> myselfCheckList)
    { return helpExtractListInternally(myselfCheckList, "myselfCheckId"); }

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
     * myselfCheckBhv.<span style="color: #DD4747">insert</span>(myselfCheck);
     * ... = myselfCheck.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param myselfCheck The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(LdMyselfCheck myselfCheck) {
        doInsert(myselfCheck, null);
    }

    protected void doInsert(LdMyselfCheck et, InsertOption<LdMyselfCheckCB> op) {
        assertObjectNotNull("myselfCheck", et); prepareInsertOption(op); delegateInsert(et, op);
    }

    protected void prepareInsertOption(InsertOption<LdMyselfCheckCB> op) {
        if (op == null) { return; } assertInsertOptionStatus(op);
        if (op.hasSpecifiedInsertColumn()) { op.resolveInsertColumnSpecification(createCBForSpecifiedUpdate()); }
    }

    protected void doCreate(Entity et, InsertOption<? extends ConditionBean> op) { doInsert(downcast(et), downcast(op)); }

    /**
     * Update the entity modified-only. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * LdMyselfCheck myselfCheck = new LdMyselfCheck();
     * myselfCheck.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * myselfCheck.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//myselfCheck.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//myselfCheck.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * myselfCheck.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     myselfCheckBhv.<span style="color: #DD4747">update</span>(myselfCheck);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param myselfCheck The entity of update. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(LdMyselfCheck myselfCheck) {
        doUpdate(myselfCheck, null);
    }

    protected void doUpdate(LdMyselfCheck et, UpdateOption<LdMyselfCheckCB> op) {
        assertObjectNotNull("myselfCheck", et); prepareUpdateOption(op); helpUpdateInternally(et, op);
    }

    protected void prepareUpdateOption(UpdateOption<LdMyselfCheckCB> op) {
        if (op == null) { return; } assertUpdateOptionStatus(op);
        if (op.hasSelfSpecification()) { op.resolveSelfSpecification(createCBForVaryingUpdate()); }
        if (op.hasSpecifiedUpdateColumn()) { op.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate()); }
    }

    protected LdMyselfCheckCB createCBForVaryingUpdate()
    { LdMyselfCheckCB cb = newConditionBean(); cb.xsetupForVaryingUpdate(); return cb; }

    protected LdMyselfCheckCB createCBForSpecifiedUpdate()
    { LdMyselfCheckCB cb = newConditionBean(); cb.xsetupForSpecifiedUpdate(); return cb; }

    protected void doModify(Entity et, UpdateOption<? extends ConditionBean> op) { doUpdate(downcast(et), downcast(op)); }

    protected void doModifyNonstrict(Entity et, UpdateOption<? extends ConditionBean> op)
    { doModify(et, op); }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br />
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br />
     * <p><span style="color: #DD4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param myselfCheck The entity of insert or update. (NotNull, ...depends on insert or update)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(LdMyselfCheck myselfCheck) {
        doInsertOrUpdate(myselfCheck, null, null);
    }

    protected void doInsertOrUpdate(LdMyselfCheck et, InsertOption<LdMyselfCheckCB> iop, UpdateOption<LdMyselfCheckCB> uop) {
        assertObjectNotNull("myselfCheck", et); helpInsertOrUpdateInternally(et, iop, uop);
    }

    protected void doCreateOrModify(Entity et, InsertOption<? extends ConditionBean> iop, UpdateOption<? extends ConditionBean> uop)
    { doInsertOrUpdate(downcast(et), downcast(iop), downcast(uop)); }

    protected void doCreateOrModifyNonstrict(Entity et, InsertOption<? extends ConditionBean> iop, UpdateOption<? extends ConditionBean> uop)
    { doCreateOrModify(et, iop, uop); }

    /**
     * Delete the entity. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * LdMyselfCheck myselfCheck = new LdMyselfCheck();
     * myselfCheck.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * myselfCheck.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     myselfCheckBhv.<span style="color: #DD4747">delete</span>(myselfCheck);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param myselfCheck The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(LdMyselfCheck myselfCheck) {
        doDelete(myselfCheck, null);
    }

    protected void doDelete(LdMyselfCheck et, final DeleteOption<LdMyselfCheckCB> op) {
        assertObjectNotNull("myselfCheck", et); prepareDeleteOption(op); helpDeleteInternally(et, op);
    }

    protected void prepareDeleteOption(DeleteOption<LdMyselfCheckCB> op) { if (op != null) { assertDeleteOptionStatus(op); } }

    protected void doRemove(Entity et, DeleteOption<? extends ConditionBean> op) { doDelete(downcast(et), downcast(op)); }

    protected void doRemoveNonstrict(Entity et, DeleteOption<? extends ConditionBean> op)
    { doRemove(et, op); }

    // ===================================================================================
    //                                                                        Batch Update
    //                                                                        ============
    /**
     * Batch-insert the entity list modified-only of same-set columns. (DefaultConstraintsEnabled) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <p><span style="color: #DD4747; font-size: 120%">The columns of least common multiple are registered like this:</span></p>
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
     * myselfCheckBhv.<span style="color: #DD4747">batchInsert</span>(myselfCheckList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param myselfCheckList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<LdMyselfCheck> myselfCheckList) {
        return doBatchInsert(myselfCheckList, null);
    }

    protected int[] doBatchInsert(List<LdMyselfCheck> ls, InsertOption<LdMyselfCheckCB> op) {
        assertObjectNotNull("myselfCheckList", ls);
        InsertOption<LdMyselfCheckCB> rlop; if (op != null) { rlop = op; } else { rlop = createPlainInsertOption(); }
        prepareBatchInsertOption(ls, rlop); // required
        return delegateBatchInsert(ls, rlop);
    }

    protected void prepareBatchInsertOption(List<LdMyselfCheck> ls, InsertOption<LdMyselfCheckCB> op) {
        op.xallowInsertColumnModifiedPropertiesFragmented();
        op.xacceptInsertColumnModifiedPropertiesIfNeeds(ls);
        prepareInsertOption(op);
    }

    protected int[] doLumpCreate(List<Entity> ls, InsertOption<? extends ConditionBean> op) { return doBatchInsert(downcast(ls), downcast(op)); }

    /**
     * Batch-update the entity list modified-only of same-set columns. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <span style="color: #DD4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
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
     * myselfCheckBhv.<span style="color: #DD4747">batchUpdate</span>(myselfCheckList);
     * </pre>
     * @param myselfCheckList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<LdMyselfCheck> myselfCheckList) {
        return doBatchUpdate(myselfCheckList, null);
    }

    protected int[] doBatchUpdate(List<LdMyselfCheck> ls, UpdateOption<LdMyselfCheckCB> op) {
        assertObjectNotNull("myselfCheckList", ls);
        UpdateOption<LdMyselfCheckCB> rlop; if (op != null) { rlop = op; } else { rlop = createPlainUpdateOption(); }
        prepareBatchUpdateOption(ls, rlop); // required
        return delegateBatchUpdate(ls, rlop);
    }

    protected void prepareBatchUpdateOption(List<LdMyselfCheck> ls, UpdateOption<LdMyselfCheckCB> op) {
        op.xacceptUpdateColumnModifiedPropertiesIfNeeds(ls);
        prepareUpdateOption(op);
    }

    protected int[] doLumpModify(List<Entity> ls, UpdateOption<? extends ConditionBean> op) { return doBatchUpdate(downcast(ls), downcast(op)); }

    /**
     * Batch-update the entity list specified-only. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * myselfCheckBhv.<span style="color: #DD4747">batchUpdate</span>(myselfCheckList, new SpecifyQuery<LdMyselfCheckCB>() {
     *     public void specify(LdMyselfCheckCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #DD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #DD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * myselfCheckBhv.<span style="color: #DD4747">batchUpdate</span>(myselfCheckList, new SpecifyQuery<LdMyselfCheckCB>() {
     *     public void specify(LdMyselfCheckCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #DD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
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
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<LdMyselfCheck> myselfCheckList, SpecifyQuery<LdMyselfCheckCB> updateColumnSpec) {
        return doBatchUpdate(myselfCheckList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> op)
    { return doLumpModify(ls, op); }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param myselfCheckList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<LdMyselfCheck> myselfCheckList) {
        return doBatchDelete(myselfCheckList, null);
    }

    protected int[] doBatchDelete(List<LdMyselfCheck> ls, DeleteOption<LdMyselfCheckCB> op) {
        assertObjectNotNull("myselfCheckList", ls);
        prepareDeleteOption(op);
        return delegateBatchDelete(ls, op);
    }

    protected int[] doLumpRemove(List<Entity> ls, DeleteOption<? extends ConditionBean> op) { return doBatchDelete(downcast(ls), downcast(op)); }

    protected int[] doLumpRemoveNonstrict(List<Entity> ls, DeleteOption<? extends ConditionBean> op)
    { return doLumpRemove(ls, op); }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * myselfCheckBhv.<span style="color: #DD4747">queryInsert</span>(new QueryInsertSetupper&lt;LdMyselfCheck, LdMyselfCheckCB&gt;() {
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
     *         <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
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
        assertObjectNotNull("setupper", sp); prepareInsertOption(op);
        LdMyselfCheck et = newEntity(); LdMyselfCheckCB cb = createCBForQueryInsert();
        return delegateQueryInsert(et, cb, sp.setup(et, cb), op);
    }

    protected LdMyselfCheckCB createCBForQueryInsert()
    { LdMyselfCheckCB cb = newConditionBean(); cb.xsetupForQueryInsert(); return cb; }

    protected int doRangeCreate(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> setupper, InsertOption<? extends ConditionBean> op)
    { return doQueryInsert(downcast(setupper), downcast(op)); }

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
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//myselfCheck.setVersionNo(value);</span>
     * LdMyselfCheckCB cb = new LdMyselfCheckCB();
     * cb.query().setFoo...(value);
     * myselfCheckBhv.<span style="color: #DD4747">queryUpdate</span>(myselfCheck, cb);
     * </pre>
     * @param myselfCheck The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of LdMyselfCheck. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(LdMyselfCheck myselfCheck, LdMyselfCheckCB cb) {
        return doQueryUpdate(myselfCheck, cb, null);
    }

    protected int doQueryUpdate(LdMyselfCheck et, LdMyselfCheckCB cb, UpdateOption<LdMyselfCheckCB> op) {
        assertObjectNotNull("myselfCheck", et); assertCBStateValid(cb); prepareUpdateOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryUpdate(et, cb, op) : 0;
    }

    protected int doRangeModify(Entity et, ConditionBean cb, UpdateOption<? extends ConditionBean> op)
    { return doQueryUpdate(downcast(et), downcast(cb), downcast(op)); }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * LdMyselfCheckCB cb = new LdMyselfCheckCB();
     * cb.query().setFoo...(value);
     * myselfCheckBhv.<span style="color: #DD4747">queryDelete</span>(myselfCheck, cb);
     * </pre>
     * @param cb The condition-bean of LdMyselfCheck. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(LdMyselfCheckCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(LdMyselfCheckCB cb, DeleteOption<LdMyselfCheckCB> op) {
        assertCBStateValid(cb); prepareDeleteOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryDelete(cb, op) : 0;
    }

    protected int doRangeRemove(ConditionBean cb, DeleteOption<? extends ConditionBean> op) { return doQueryDelete(downcast(cb), downcast(op)); }

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
     * myselfCheckBhv.<span style="color: #DD4747">varyingInsert</span>(myselfCheck, option);
     * ... = myselfCheck.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param myselfCheck The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
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
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * myselfCheck.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;LdMyselfCheckCB&gt; option = new UpdateOption&lt;LdMyselfCheckCB&gt;();
     *     option.self(new SpecifyQuery&lt;LdMyselfCheckCB&gt;() {
     *         public void specify(LdMyselfCheckCB cb) {
     *             cb.specify().<span style="color: #DD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     myselfCheckBhv.<span style="color: #DD4747">varyingUpdate</span>(myselfCheck, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param myselfCheck The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(LdMyselfCheck myselfCheck, UpdateOption<LdMyselfCheckCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(myselfCheck, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param myselfCheck The entity of insert or update. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(LdMyselfCheck myselfCheck, InsertOption<LdMyselfCheckCB> insertOption, UpdateOption<LdMyselfCheckCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInsertOrUpdate(myselfCheck, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param myselfCheck The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
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
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//myselfCheck.setVersionNo(value);</span>
     * LdMyselfCheckCB cb = new LdMyselfCheckCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;LdMyselfCheckCB&gt; option = new UpdateOption&lt;LdMyselfCheckCB&gt;();
     * option.self(new SpecifyQuery&lt;LdMyselfCheckCB&gt;() {
     *     public void specify(LdMyselfCheckCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * myselfCheckBhv.<span style="color: #DD4747">varyingQueryUpdate</span>(myselfCheck, cb, option);
     * </pre>
     * @param myselfCheck The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of LdMyselfCheck. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
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
     * @exception NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
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
    //                                                                       Assist Helper
    //                                                                       =============
    protected Class<LdMyselfCheck> typeOfSelectedEntity() { return LdMyselfCheck.class; }
    protected LdMyselfCheck downcast(Entity et) { return helpEntityDowncastInternally(et, LdMyselfCheck.class); }
    protected LdMyselfCheckCB downcast(ConditionBean cb) { return helpConditionBeanDowncastInternally(cb, LdMyselfCheckCB.class); }
    @SuppressWarnings("unchecked")
    protected List<LdMyselfCheck> downcast(List<? extends Entity> ls) { return (List<LdMyselfCheck>)ls; }
    @SuppressWarnings("unchecked")
    protected InsertOption<LdMyselfCheckCB> downcast(InsertOption<? extends ConditionBean> op) { return (InsertOption<LdMyselfCheckCB>)op; }
    @SuppressWarnings("unchecked")
    protected UpdateOption<LdMyselfCheckCB> downcast(UpdateOption<? extends ConditionBean> op) { return (UpdateOption<LdMyselfCheckCB>)op; }
    @SuppressWarnings("unchecked")
    protected DeleteOption<LdMyselfCheckCB> downcast(DeleteOption<? extends ConditionBean> op) { return (DeleteOption<LdMyselfCheckCB>)op; }
    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<LdMyselfCheck, LdMyselfCheckCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> sp)
    { return (QueryInsertSetupper<LdMyselfCheck, LdMyselfCheckCB>)sp; }
}
