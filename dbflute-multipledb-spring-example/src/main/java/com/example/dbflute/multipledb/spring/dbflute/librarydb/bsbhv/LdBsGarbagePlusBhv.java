/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */package com.example.dbflute.multipledb.spring.dbflute.librarydb.bsbhv;

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
import com.example.dbflute.multipledb.spring.dbflute.librarydb.exbhv.*;
import com.example.dbflute.multipledb.spring.dbflute.librarydb.bsbhv.loader.*;
import com.example.dbflute.multipledb.spring.dbflute.librarydb.exentity.*;
import com.example.dbflute.multipledb.spring.dbflute.librarydb.bsentity.dbmeta.*;
import com.example.dbflute.multipledb.spring.dbflute.librarydb.cbean.*;

/**
 * The behavior of GARBAGE_PLUS as TABLE. <br />
 * <pre>
 * [primary key]
 *     
 *
 * [column]
 *     GARBAGE_MEMO, GARBAGE_TIME, GARBAGE_COUNT, R_USER, R_MODULE, R_TIMESTAMP, U_USER, U_MODULE, U_TIMESTAMP
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
 *     
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class LdBsGarbagePlusBhv extends AbstractBehaviorReadable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "GARBAGE_PLUS"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** {@inheritDoc} */
    public DBMeta getDBMeta() { return LdGarbagePlusDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public LdGarbagePlusDbm getMyDBMeta() { return LdGarbagePlusDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public LdGarbagePlus newEntity() { return new LdGarbagePlus(); }

    /** {@inheritDoc} */
    public LdGarbagePlusCB newConditionBean() { return new LdGarbagePlusCB(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public LdGarbagePlus newMyEntity() { return new LdGarbagePlus(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public LdGarbagePlusCB newMyConditionBean() { return new LdGarbagePlusCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * LdGarbagePlusCB cb = new LdGarbagePlusCB();
     * cb.query().setFoo...(value);
     * int count = garbagePlusBhv.<span style="color: #DD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of LdGarbagePlus. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(LdGarbagePlusCB cb) {
        return facadeSelectCount(cb);
    }

    protected int facadeSelectCount(LdGarbagePlusCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(LdGarbagePlusCB cb) { // called by selectCount(cb)
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(LdGarbagePlusCB cb) { // called by selectPage(cb)
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
     * LdGarbagePlusCB cb = new LdGarbagePlusCB();
     * cb.query().setFoo...(value);
     * LdGarbagePlus garbagePlus = garbagePlusBhv.<span style="color: #DD4747">selectEntity</span>(cb);
     * if (garbagePlus != null) { <span style="color: #3F7E5E">// null check</span>
     *     ... = garbagePlus.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of LdGarbagePlus. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public LdGarbagePlus selectEntity(LdGarbagePlusCB cb) {
        return facadeSelectEntity(cb);
    }

    protected LdGarbagePlus facadeSelectEntity(LdGarbagePlusCB cb) {
        return doSelectEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends LdGarbagePlus> ENTITY doSelectEntity(LdGarbagePlusCB cb, Class<ENTITY> tp) {
        return helpSelectEntityInternally(cb, tp);
    }

    protected <ENTITY extends LdGarbagePlus> OptionalEntity<ENTITY> doSelectOptionalEntity(LdGarbagePlusCB cb, Class<ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)); }

    /**
     * Select the entity by the condition-bean with deleted check. <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, this method is good.</span>
     * <pre>
     * LdGarbagePlusCB cb = new LdGarbagePlusCB();
     * cb.query().setFoo...(value);
     * LdGarbagePlus garbagePlus = garbagePlusBhv.<span style="color: #DD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = garbagePlus.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of LdGarbagePlus. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public LdGarbagePlus selectEntityWithDeletedCheck(LdGarbagePlusCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    protected LdGarbagePlus facadeSelectEntityWithDeletedCheck(LdGarbagePlusCB cb) {
        return doSelectEntityWithDeletedCheck(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends LdGarbagePlus> ENTITY doSelectEntityWithDeletedCheck(LdGarbagePlusCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectEntityWithDeletedCheckInternally(cb, tp);
    }

    protected Entity doReadEntityWithDeletedCheck(ConditionBean cb) { return facadeSelectEntityWithDeletedCheck(downcast(cb)); }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * LdGarbagePlusCB cb = new LdGarbagePlusCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;LdGarbagePlus&gt; garbagePlusList = garbagePlusBhv.<span style="color: #DD4747">selectList</span>(cb);
     * for (LdGarbagePlus garbagePlus : garbagePlusList) {
     *     ... = garbagePlus.get...();
     * }
     * </pre>
     * @param cb The condition-bean of LdGarbagePlus. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<LdGarbagePlus> selectList(LdGarbagePlusCB cb) {
        return facadeSelectList(cb);
    }

    protected ListResultBean<LdGarbagePlus> facadeSelectList(LdGarbagePlusCB cb) {
        return doSelectList(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends LdGarbagePlus> ListResultBean<ENTITY> doSelectList(LdGarbagePlusCB cb, Class<ENTITY> tp) {
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
     * LdGarbagePlusCB cb = new LdGarbagePlusCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #DD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;LdGarbagePlus&gt; page = garbagePlusBhv.<span style="color: #DD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (LdGarbagePlus garbagePlus : page) {
     *     ... = garbagePlus.get...();
     * }
     * </pre>
     * @param cb The condition-bean of LdGarbagePlus. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<LdGarbagePlus> selectPage(LdGarbagePlusCB cb) {
        return facadeSelectPage(cb);
    }

    protected PagingResultBean<LdGarbagePlus> facadeSelectPage(LdGarbagePlusCB cb) {
        return doSelectPage(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends LdGarbagePlus> PagingResultBean<ENTITY> doSelectPage(LdGarbagePlusCB cb, Class<ENTITY> tp) {
        return helpSelectPageInternally(cb, tp);
    }

    protected PagingResultBean<? extends Entity> doReadPage(ConditionBean cb) { return facadeSelectPage(downcast(cb)); }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * LdGarbagePlusCB cb = new LdGarbagePlusCB();
     * cb.query().setFoo...(value);
     * garbagePlusBhv.<span style="color: #DD4747">selectCursor</span>(cb, new EntityRowHandler&lt;LdGarbagePlus&gt;() {
     *     public void handle(LdGarbagePlus entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of LdGarbagePlus. (NotNull)
     * @param entityRowHandler The handler of entity row of LdGarbagePlus. (NotNull)
     */
    public void selectCursor(LdGarbagePlusCB cb, EntityRowHandler<LdGarbagePlus> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    protected void facadeSelectCursor(LdGarbagePlusCB cb, EntityRowHandler<LdGarbagePlus> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, typeOfSelectedEntity());
    }

    protected <ENTITY extends LdGarbagePlus> void doSelectCursor(LdGarbagePlusCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) {
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
     * garbagePlusBhv.<span style="color: #DD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(LdGarbagePlusCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<LdGarbagePlusCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return facadeScalarSelect(resultType);
    }

    protected <RESULT> HpSLSFunction<LdGarbagePlusCB, RESULT> facadeScalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newConditionBean());
    }

    protected <RESULT, CB extends LdGarbagePlusCB> HpSLSFunction<CB, RESULT> doScalarSelect(final Class<RESULT> tp, final CB cb) {
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
     * @param garbagePlusList The entity list of garbagePlus. (NotNull)
     * @param handler The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<LdGarbagePlus> garbagePlusList, ReferrerLoaderHandler<LdLoaderOfGarbagePlus> handler) {
        xassLRArg(garbagePlusList, handler);
        handler.handle(new LdLoaderOfGarbagePlus().ready(garbagePlusList, _behaviorSelector));
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
     * @param garbagePlus The entity of garbagePlus. (NotNull)
     * @param handler The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(LdGarbagePlus garbagePlus, ReferrerLoaderHandler<LdLoaderOfGarbagePlus> handler) {
        xassLRArg(garbagePlus, handler);
        handler.handle(new LdLoaderOfGarbagePlus().ready(xnewLRAryLs(garbagePlus), _behaviorSelector));
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity for a table not defined primary key. <br />
     * The auto-setup for common columns is unsupported.
     * <pre>
     * LdGarbagePlus garbagePlus = new LdGarbagePlus();
     * garbagePlus.setFoo...(value);
     * garbagePlus.setBar...(value);
     * garbagePlusBhv.<span style="color: #DD4747">insert</span>(garbagePlus);
     * </pre>
     * @param garbagePlus The entity for insert. (NotNull)
     */
    public void insert(LdGarbagePlus garbagePlus) {
        assertObjectNotNull("garbagePlus", garbagePlus);
        delegateInsertNoPK(garbagePlus, null);
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
    public OutsideSqlBasicExecutor<LdGarbagePlusBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                     Filter Override
    //                                                                     ===============
    @Override
    protected void filterEntityOfInsert(Entity tgt, InsertOption<? extends ConditionBean> op) {
        super.filterEntityOfInsert(tgt, op);
        LdGarbagePlus et = downcast(tgt);
        et.setGarbageTime(org.seasar.dbflute.AccessContext.getAccessTimestampOnThread());
        et.setRUser(org.seasar.dbflute.AccessContext.getAccessUserOnThread());
        et.setRTimestamp(org.seasar.dbflute.AccessContext.getAccessTimestampOnThread());
    }

    // ===================================================================================
    //                                                                Optimistic Lock Info
    //                                                                ====================
    @Override
    protected boolean hasUpdateDateValue(Entity et) {
        return downcast(et).getUTimestamp() != null;
    }

    // ===================================================================================
    //                                                                       Assist Helper
    //                                                                       =============
    protected Class<LdGarbagePlus> typeOfSelectedEntity() { return LdGarbagePlus.class; }
    protected LdGarbagePlus downcast(Entity et) { return helpEntityDowncastInternally(et, LdGarbagePlus.class); }
    protected LdGarbagePlusCB downcast(ConditionBean cb) { return helpConditionBeanDowncastInternally(cb, LdGarbagePlusCB.class); }
    @SuppressWarnings("unchecked")
    protected List<LdGarbagePlus> downcast(List<? extends Entity> ls) { return (List<LdGarbagePlus>)ls; }
}
