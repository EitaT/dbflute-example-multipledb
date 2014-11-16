/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */package com.example.dbflute.multipledb.spring.dbflute.librarydb.bsbhv;

import java.util.List;

import org.seasar.dbflute.*;
import org.seasar.dbflute.bhv.*;
import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.cbean.chelper.HpSLSFunction;
import org.seasar.dbflute.exception.*;
import org.seasar.dbflute.optional.OptionalEntity;
import org.seasar.dbflute.outsidesql.executor.*;
import com.example.dbflute.multipledb.spring.dbflute.librarydb.exbhv.*;
import com.example.dbflute.multipledb.spring.dbflute.librarydb.bsbhv.loader.*;
import com.example.dbflute.multipledb.spring.dbflute.librarydb.exentity.*;
import com.example.dbflute.multipledb.spring.dbflute.librarydb.bsentity.dbmeta.*;
import com.example.dbflute.multipledb.spring.dbflute.librarydb.cbean.*;

/**
 * The behavior of BLACK_ACTION_LOOKUP as TABLE. <br />
 * <pre>
 * [primary key]
 *     BLACK_ACTION_CODE
 *
 * [column]
 *     BLACK_ACTION_CODE, BLACK_ACTION_NAME, R_USER, R_MODULE, R_TIMESTAMP, U_USER, U_MODULE, U_TIMESTAMP
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
 *     BLACK_ACTION
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     blackActionList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class LdBsBlackActionLookupBhv extends AbstractBehaviorWritable<LdBlackActionLookup, LdBlackActionLookupCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** {@inheritDoc} */
    public LdBlackActionLookupDbm getDBMeta() { return LdBlackActionLookupDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public LdBlackActionLookupDbm getMyDBMeta() { return LdBlackActionLookupDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public LdBlackActionLookupCB newConditionBean() { return new LdBlackActionLookupCB(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public LdBlackActionLookup newMyEntity() { return new LdBlackActionLookup(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public LdBlackActionLookupCB newMyConditionBean() { return new LdBlackActionLookupCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * LdBlackActionLookupCB cb = new LdBlackActionLookupCB();
     * cb.query().setFoo...(value);
     * int count = blackActionLookupBhv.<span style="color: #DD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of LdBlackActionLookup. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(LdBlackActionLookupCB cb) {
        return facadeSelectCount(cb);
    }

    // ===================================================================================
    //                                                                       Entity Select
    //                                                                       =============
    /**
     * Select the entity by the condition-bean. #beforejava8 <br />
     * <span style="color: #AD4747; font-size: 120%">The return might be null if no data, so you should have null check.</span> <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, use selectEntityWithDeletedCheck().</span>
     * <pre>
     * LdBlackActionLookupCB cb = new LdBlackActionLookupCB();
     * cb.query().setFoo...(value);
     * LdBlackActionLookup blackActionLookup = blackActionLookupBhv.<span style="color: #DD4747">selectEntity</span>(cb);
     * if (blackActionLookup != null) { <span style="color: #3F7E5E">// null check</span>
     *     ... = blackActionLookup.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of LdBlackActionLookup. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public LdBlackActionLookup selectEntity(LdBlackActionLookupCB cb) {
        return facadeSelectEntity(cb);
    }

    protected LdBlackActionLookup facadeSelectEntity(LdBlackActionLookupCB cb) {
        return doSelectEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends LdBlackActionLookup> OptionalEntity<ENTITY> doSelectOptionalEntity(LdBlackActionLookupCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)); }

    /**
     * Select the entity by the condition-bean with deleted check. <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, this method is good.</span>
     * <pre>
     * LdBlackActionLookupCB cb = new LdBlackActionLookupCB();
     * cb.query().setFoo...(value);
     * LdBlackActionLookup blackActionLookup = blackActionLookupBhv.<span style="color: #DD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = blackActionLookup.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of LdBlackActionLookup. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public LdBlackActionLookup selectEntityWithDeletedCheck(LdBlackActionLookupCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param blackActionCode : PK, NotNull, CHAR(3). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public LdBlackActionLookup selectByPKValue(String blackActionCode) {
        return facadeSelectByPKValue(blackActionCode);
    }

    protected LdBlackActionLookup facadeSelectByPKValue(String blackActionCode) {
        return doSelectByPK(blackActionCode, typeOfSelectedEntity());
    }

    protected <ENTITY extends LdBlackActionLookup> ENTITY doSelectByPK(String blackActionCode, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(blackActionCode), tp);
    }

    protected <ENTITY extends LdBlackActionLookup> OptionalEntity<ENTITY> doSelectOptionalByPK(String blackActionCode, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(blackActionCode, tp), blackActionCode);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param blackActionCode : PK, NotNull, CHAR(3). (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public LdBlackActionLookup selectByPKValueWithDeletedCheck(String blackActionCode) {
        return doSelectByPKWithDeletedCheck(blackActionCode, typeOfSelectedEntity());
    }

    protected <ENTITY extends LdBlackActionLookup> ENTITY doSelectByPKWithDeletedCheck(String blackActionCode, Class<ENTITY> tp) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(blackActionCode), tp);
    }

    protected LdBlackActionLookupCB xprepareCBAsPK(String blackActionCode) {
        assertObjectNotNull("blackActionCode", blackActionCode);
        return newConditionBean().acceptPK(blackActionCode);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * LdBlackActionLookupCB cb = new LdBlackActionLookupCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;LdBlackActionLookup&gt; blackActionLookupList = blackActionLookupBhv.<span style="color: #DD4747">selectList</span>(cb);
     * for (LdBlackActionLookup blackActionLookup : blackActionLookupList) {
     *     ... = blackActionLookup.get...();
     * }
     * </pre>
     * @param cb The condition-bean of LdBlackActionLookup. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<LdBlackActionLookup> selectList(LdBlackActionLookupCB cb) {
        return facadeSelectList(cb);
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br />
     * (both count-select and paging-select are executed)
     * <pre>
     * LdBlackActionLookupCB cb = new LdBlackActionLookupCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #DD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;LdBlackActionLookup&gt; page = blackActionLookupBhv.<span style="color: #DD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (LdBlackActionLookup blackActionLookup : page) {
     *     ... = blackActionLookup.get...();
     * }
     * </pre>
     * @param cb The condition-bean of LdBlackActionLookup. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<LdBlackActionLookup> selectPage(LdBlackActionLookupCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * LdBlackActionLookupCB cb = new LdBlackActionLookupCB();
     * cb.query().setFoo...(value);
     * blackActionLookupBhv.<span style="color: #DD4747">selectCursor</span>(cb, new EntityRowHandler&lt;LdBlackActionLookup&gt;() {
     *     public void handle(LdBlackActionLookup entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of LdBlackActionLookup. (NotNull)
     * @param entityRowHandler The handler of entity row of LdBlackActionLookup. (NotNull)
     */
    public void selectCursor(LdBlackActionLookupCB cb, EntityRowHandler<LdBlackActionLookup> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * blackActionLookupBhv.<span style="color: #DD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(LdBlackActionLookupCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<LdBlackActionLookupCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return facadeScalarSelect(resultType);
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
     * @param blackActionLookupList The entity list of blackActionLookup. (NotNull)
     * @param handler The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<LdBlackActionLookup> blackActionLookupList, ReferrerLoaderHandler<LdLoaderOfBlackActionLookup> handler) {
        xassLRArg(blackActionLookupList, handler);
        handler.handle(new LdLoaderOfBlackActionLookup().ready(blackActionLookupList, _behaviorSelector));
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
     * @param blackActionLookup The entity of blackActionLookup. (NotNull)
     * @param handler The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(LdBlackActionLookup blackActionLookup, ReferrerLoaderHandler<LdLoaderOfBlackActionLookup> handler) {
        xassLRArg(blackActionLookup, handler);
        handler.handle(new LdLoaderOfBlackActionLookup().ready(xnewLRAryLs(blackActionLookup), _behaviorSelector));
    }

    /**
     * Load referrer of blackActionList by the set-upper of referrer. <br />
     * BLACK_ACTION by BLACK_ACTION_CODE, named 'blackActionList'.
     * <pre>
     * blackActionLookupBhv.<span style="color: #DD4747">loadBlackActionList</span>(blackActionLookupList, new ConditionBeanSetupper&lt;LdBlackActionCB&gt;() {
     *     public void setup(LdBlackActionCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...();
     *     }
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedList(referrerList -&gt {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * for (LdBlackActionLookup blackActionLookup : blackActionLookupList) {
     *     ... = blackActionLookup.<span style="color: #DD4747">getBlackActionList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setBlackActionCode_InScope(pkList);
     * cb.query().addOrderBy_BlackActionCode_Asc();
     * </pre>
     * @param blackActionLookupList The entity list of blackActionLookup. (NotNull)
     * @param setupper The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<LdBlackAction> loadBlackActionList(List<LdBlackActionLookup> blackActionLookupList, ConditionBeanSetupper<LdBlackActionCB> setupper) {
        xassLRArg(blackActionLookupList, setupper);
        return doLoadBlackActionList(blackActionLookupList, new LoadReferrerOption<LdBlackActionCB, LdBlackAction>().xinit(setupper));
    }

    /**
     * Load referrer of blackActionList by the set-upper of referrer. <br />
     * BLACK_ACTION by BLACK_ACTION_CODE, named 'blackActionList'.
     * <pre>
     * blackActionLookupBhv.<span style="color: #DD4747">loadBlackActionList</span>(blackActionLookupList, new ConditionBeanSetupper&lt;LdBlackActionCB&gt;() {
     *     public void setup(LdBlackActionCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...();
     *     }
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedList(referrerList -&gt {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = blackActionLookup.<span style="color: #DD4747">getBlackActionList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setBlackActionCode_InScope(pkList);
     * cb.query().addOrderBy_BlackActionCode_Asc();
     * </pre>
     * @param blackActionLookup The entity of blackActionLookup. (NotNull)
     * @param setupper The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<LdBlackAction> loadBlackActionList(LdBlackActionLookup blackActionLookup, ConditionBeanSetupper<LdBlackActionCB> setupper) {
        xassLRArg(blackActionLookup, setupper);
        return doLoadBlackActionList(xnewLRLs(blackActionLookup), new LoadReferrerOption<LdBlackActionCB, LdBlackAction>().xinit(setupper));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param blackActionLookup The entity of blackActionLookup. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<LdBlackAction> loadBlackActionList(LdBlackActionLookup blackActionLookup, LoadReferrerOption<LdBlackActionCB, LdBlackAction> loadReferrerOption) {
        xassLRArg(blackActionLookup, loadReferrerOption);
        return loadBlackActionList(xnewLRLs(blackActionLookup), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param blackActionLookupList The entity list of blackActionLookup. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<LdBlackAction> loadBlackActionList(List<LdBlackActionLookup> blackActionLookupList, LoadReferrerOption<LdBlackActionCB, LdBlackAction> loadReferrerOption) {
        xassLRArg(blackActionLookupList, loadReferrerOption);
        if (blackActionLookupList.isEmpty()) { return (NestedReferrerListGateway<LdBlackAction>)EMPTY_NREF_LGWAY; }
        return doLoadBlackActionList(blackActionLookupList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<LdBlackAction> doLoadBlackActionList(List<LdBlackActionLookup> blackActionLookupList, LoadReferrerOption<LdBlackActionCB, LdBlackAction> option) {
        return helpLoadReferrerInternally(blackActionLookupList, option, "blackActionList");
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key blackActionCode.
     * @param blackActionLookupList The list of blackActionLookup. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<String> extractBlackActionCodeList(List<LdBlackActionLookup> blackActionLookupList)
    { return helpExtractListInternally(blackActionLookupList, "blackActionCode"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * LdBlackActionLookup blackActionLookup = new LdBlackActionLookup();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * blackActionLookup.setFoo...(value);
     * blackActionLookup.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//blackActionLookup.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//blackActionLookup.set...;</span>
     * blackActionLookupBhv.<span style="color: #DD4747">insert</span>(blackActionLookup);
     * ... = blackActionLookup.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param blackActionLookup The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(LdBlackActionLookup blackActionLookup) {
        doInsert(blackActionLookup, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, ExclusiveControl)
     * <pre>
     * LdBlackActionLookup blackActionLookup = new LdBlackActionLookup();
     * blackActionLookup.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * blackActionLookup.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//blackActionLookup.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//blackActionLookup.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * blackActionLookup.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     blackActionLookupBhv.<span style="color: #DD4747">update</span>(blackActionLookup);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param blackActionLookup The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @exception EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(LdBlackActionLookup blackActionLookup) {
        doUpdate(blackActionLookup, null);
    }

    /**
     * Update the entity non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * LdBlackActionLookup blackActionLookup = new LdBlackActionLookup();
     * blackActionLookup.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * blackActionLookup.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//blackActionLookup.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//blackActionLookup.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//blackActionLookup.setVersionNo(value);</span>
     * blackActionLookupBhv.<span style="color: #DD4747">updateNonstrict</span>(blackActionLookup);
     * </pre>
     * @param blackActionLookup The entity of update. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void updateNonstrict(LdBlackActionLookup blackActionLookup) {
        doUpdateNonstrict(blackActionLookup, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, ExclusiveControl) <br />
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br />
     * <p><span style="color: #DD4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param blackActionLookup The entity of insert or update. (NotNull, ...depends on insert or update)
     * @exception EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(LdBlackActionLookup blackActionLookup) {
        doInsertOrUpdate(blackActionLookup, null, null);
    }

    /**
     * Insert or update the entity non-strictly modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br />
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() }
     * <p><span style="color: #DD4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param blackActionLookup The entity of insert or update. (NotNull, ...depends on insert or update)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdateNonstrict(LdBlackActionLookup blackActionLookup) {
        doInsertOrUpdateNonstrict(blackActionLookup, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, ExclusiveControl)
     * <pre>
     * LdBlackActionLookup blackActionLookup = new LdBlackActionLookup();
     * blackActionLookup.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * blackActionLookup.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     blackActionLookupBhv.<span style="color: #DD4747">delete</span>(blackActionLookup);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param blackActionLookup The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @exception EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(LdBlackActionLookup blackActionLookup) {
        doDelete(blackActionLookup, null);
    }

    /**
     * Delete the entity non-strictly. {ZeroUpdateException, NonExclusiveControl}
     * <pre>
     * LdBlackActionLookup blackActionLookup = new LdBlackActionLookup();
     * blackActionLookup.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//blackActionLookup.setVersionNo(value);</span>
     * blackActionLookupBhv.<span style="color: #DD4747">deleteNonstrict</span>(blackActionLookup);
     * </pre>
     * @param blackActionLookup The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrict(LdBlackActionLookup blackActionLookup) {
        doDeleteNonstrict(blackActionLookup, null);
    }

    /**
     * Delete the entity non-strictly ignoring deleted. {ZeroUpdateException, NonExclusiveControl}
     * <pre>
     * LdBlackActionLookup blackActionLookup = new LdBlackActionLookup();
     * blackActionLookup.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//blackActionLookup.setVersionNo(value);</span>
     * blackActionLookupBhv.<span style="color: #DD4747">deleteNonstrictIgnoreDeleted</span>(blackActionLookup);
     * <span style="color: #3F7E5E">// if the target entity doesn't exist, no exception</span>
     * </pre>
     * @param blackActionLookup The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrictIgnoreDeleted(LdBlackActionLookup blackActionLookup) {
        doDeleteNonstrictIgnoreDeleted(blackActionLookup, null);
    }

    protected void doDeleteNonstrictIgnoreDeleted(LdBlackActionLookup et, final DeleteOption<LdBlackActionLookupCB> op) {
        assertObjectNotNull("blackActionLookup", et); prepareDeleteOption(op); helpDeleteNonstrictIgnoreDeletedInternally(et, op);
    }

    // ===================================================================================
    //                                                                        Batch Update
    //                                                                        ============
    /**
     * Batch-insert the entity list modified-only of same-set columns. (DefaultConstraintsEnabled) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <p><span style="color: #DD4747; font-size: 120%">The columns of least common multiple are registered like this:</span></p>
     * <pre>
     * for (... : ...) {
     *     LdBlackActionLookup blackActionLookup = new LdBlackActionLookup();
     *     blackActionLookup.setFooName("foo");
     *     if (...) {
     *         blackActionLookup.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     blackActionLookupList.add(blackActionLookup);
     * }
     * blackActionLookupBhv.<span style="color: #DD4747">batchInsert</span>(blackActionLookupList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param blackActionLookupList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<LdBlackActionLookup> blackActionLookupList) {
        return doBatchInsert(blackActionLookupList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (ExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <span style="color: #DD4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     LdBlackActionLookup blackActionLookup = new LdBlackActionLookup();
     *     blackActionLookup.setFooName("foo");
     *     if (...) {
     *         blackActionLookup.setFooPrice(123);
     *     } else {
     *         blackActionLookup.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//blackActionLookup.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     blackActionLookupList.add(blackActionLookup);
     * }
     * blackActionLookupBhv.<span style="color: #DD4747">batchUpdate</span>(blackActionLookupList);
     * </pre>
     * @param blackActionLookupList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<LdBlackActionLookup> blackActionLookupList) {
        return doBatchUpdate(blackActionLookupList, null);
    }

    /**
     * Batch-update the entity list specified-only. (ExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * blackActionLookupBhv.<span style="color: #DD4747">batchUpdate</span>(blackActionLookupList, new SpecifyQuery<LdBlackActionLookupCB>() {
     *     public void specify(LdBlackActionLookupCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #DD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #DD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * blackActionLookupBhv.<span style="color: #DD4747">batchUpdate</span>(blackActionLookupList, new SpecifyQuery<LdBlackActionLookupCB>() {
     *     public void specify(LdBlackActionLookupCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #DD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param blackActionLookupList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<LdBlackActionLookup> blackActionLookupList, SpecifyQuery<LdBlackActionLookupCB> updateColumnSpec) {
        return doBatchUpdate(blackActionLookupList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    /**
     * Batch-update the entity list non-strictly modified-only of same-set columns. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <span style="color: #DD4747; font-size: 140%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     LdBlackActionLookup blackActionLookup = new LdBlackActionLookup();
     *     blackActionLookup.setFooName("foo");
     *     if (...) {
     *         blackActionLookup.setFooPrice(123);
     *     } else {
     *         blackActionLookup.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//blackActionLookup.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     blackActionLookupList.add(blackActionLookup);
     * }
     * blackActionLookupBhv.<span style="color: #DD4747">batchUpdate</span>(blackActionLookupList);
     * </pre>
     * @param blackActionLookupList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<LdBlackActionLookup> blackActionLookupList) {
        return doBatchUpdateNonstrict(blackActionLookupList, null);
    }

    /**
     * Batch-update the entity list non-strictly specified-only. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * blackActionLookupBhv.<span style="color: #DD4747">batchUpdateNonstrict</span>(blackActionLookupList, new SpecifyQuery<LdBlackActionLookupCB>() {
     *     public void specify(LdBlackActionLookupCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #DD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #DD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * blackActionLookupBhv.<span style="color: #DD4747">batchUpdateNonstrict</span>(blackActionLookupList, new SpecifyQuery<LdBlackActionLookupCB>() {
     *     public void specify(LdBlackActionLookupCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #DD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).</p>
     * @param blackActionLookupList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<LdBlackActionLookup> blackActionLookupList, SpecifyQuery<LdBlackActionLookupCB> updateColumnSpec) {
        return doBatchUpdateNonstrict(blackActionLookupList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    /**
     * Batch-delete the entity list. (ExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param blackActionLookupList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchDelete(List<LdBlackActionLookup> blackActionLookupList) {
        return doBatchDelete(blackActionLookupList, null);
    }

    /**
     * Batch-delete the entity list non-strictly. {NonExclusiveControl} <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param blackActionLookupList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDeleteNonstrict(List<LdBlackActionLookup> blackActionLookupList) {
        return doBatchDeleteNonstrict(blackActionLookupList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * blackActionLookupBhv.<span style="color: #DD4747">queryInsert</span>(new QueryInsertSetupper&lt;LdBlackActionLookup, LdBlackActionLookupCB&gt;() {
     *     public ConditionBean setup(LdBlackActionLookup entity, LdBlackActionLookupCB intoCB) {
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
     * @param setupper The set-upper of query-insert. (NotNull)
     * @return The inserted count.
     */
    public int queryInsert(QueryInsertSetupper<LdBlackActionLookup, LdBlackActionLookupCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * LdBlackActionLookup blackActionLookup = new LdBlackActionLookup();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//blackActionLookup.setPK...(value);</span>
     * blackActionLookup.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//blackActionLookup.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//blackActionLookup.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//blackActionLookup.setVersionNo(value);</span>
     * LdBlackActionLookupCB cb = new LdBlackActionLookupCB();
     * cb.query().setFoo...(value);
     * blackActionLookupBhv.<span style="color: #DD4747">queryUpdate</span>(blackActionLookup, cb);
     * </pre>
     * @param blackActionLookup The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of LdBlackActionLookup. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(LdBlackActionLookup blackActionLookup, LdBlackActionLookupCB cb) {
        return doQueryUpdate(blackActionLookup, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * LdBlackActionLookupCB cb = new LdBlackActionLookupCB();
     * cb.query().setFoo...(value);
     * blackActionLookupBhv.<span style="color: #DD4747">queryDelete</span>(blackActionLookup, cb);
     * </pre>
     * @param cb The condition-bean of LdBlackActionLookup. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(LdBlackActionLookupCB cb) {
        return doQueryDelete(cb, null);
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
     * LdBlackActionLookup blackActionLookup = new LdBlackActionLookup();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * blackActionLookup.setFoo...(value);
     * blackActionLookup.setBar...(value);
     * InsertOption<LdBlackActionLookupCB> option = new InsertOption<LdBlackActionLookupCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * blackActionLookupBhv.<span style="color: #DD4747">varyingInsert</span>(blackActionLookup, option);
     * ... = blackActionLookup.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param blackActionLookup The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(LdBlackActionLookup blackActionLookup, InsertOption<LdBlackActionLookupCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(blackActionLookup, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, ExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * LdBlackActionLookup blackActionLookup = new LdBlackActionLookup();
     * blackActionLookup.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * blackActionLookup.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * blackActionLookup.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;LdBlackActionLookupCB&gt; option = new UpdateOption&lt;LdBlackActionLookupCB&gt;();
     *     option.self(new SpecifyQuery&lt;LdBlackActionLookupCB&gt;() {
     *         public void specify(LdBlackActionLookupCB cb) {
     *             cb.specify().<span style="color: #DD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     blackActionLookupBhv.<span style="color: #DD4747">varyingUpdate</span>(blackActionLookup, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param blackActionLookup The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(LdBlackActionLookup blackActionLookup, UpdateOption<LdBlackActionLookupCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(blackActionLookup, option);
    }

    /**
     * Update the entity with varying requests non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as updateNonstrict(entity).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * LdBlackActionLookup blackActionLookup = new LdBlackActionLookup();
     * blackActionLookup.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * blackActionLookup.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//blackActionLookup.setVersionNo(value);</span>
     * UpdateOption&lt;LdBlackActionLookupCB&gt; option = new UpdateOption&lt;LdBlackActionLookupCB&gt;();
     * option.self(new SpecifyQuery&lt;LdBlackActionLookupCB&gt;() {
     *     public void specify(LdBlackActionLookupCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * blackActionLookupBhv.<span style="color: #DD4747">varyingUpdateNonstrict</span>(blackActionLookup, option);
     * </pre>
     * @param blackActionLookup The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdateNonstrict(LdBlackActionLookup blackActionLookup, UpdateOption<LdBlackActionLookupCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdateNonstrict(blackActionLookup, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param blackActionLookup The entity of insert or update. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(LdBlackActionLookup blackActionLookup, InsertOption<LdBlackActionLookupCB> insertOption, UpdateOption<LdBlackActionLookupCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInsertOrUpdate(blackActionLookup, insertOption, updateOption);
    }

    /**
     * Insert or update the entity with varying requests non-strictly. (NonExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdateNonstrict(entity).
     * @param blackActionLookup The entity of insert or update. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdateNonstrict(LdBlackActionLookup blackActionLookup, InsertOption<LdBlackActionLookupCB> insertOption, UpdateOption<LdBlackActionLookupCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInsertOrUpdateNonstrict(blackActionLookup, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, ExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param blackActionLookup The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(LdBlackActionLookup blackActionLookup, DeleteOption<LdBlackActionLookupCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(blackActionLookup, option);
    }

    /**
     * Delete the entity with varying requests non-strictly. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as deleteNonstrict(entity).
     * @param blackActionLookup The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDeleteNonstrict(LdBlackActionLookup blackActionLookup, DeleteOption<LdBlackActionLookupCB> option) {
        assertDeleteOptionNotNull(option);
        doDeleteNonstrict(blackActionLookup, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param blackActionLookupList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<LdBlackActionLookup> blackActionLookupList, InsertOption<LdBlackActionLookupCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(blackActionLookupList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param blackActionLookupList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<LdBlackActionLookup> blackActionLookupList, UpdateOption<LdBlackActionLookupCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(blackActionLookupList, option);
    }

    /**
     * Batch-update the list with varying requests non-strictly. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param blackActionLookupList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdateNonstrict(List<LdBlackActionLookup> blackActionLookupList, UpdateOption<LdBlackActionLookupCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdateNonstrict(blackActionLookupList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param blackActionLookupList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<LdBlackActionLookup> blackActionLookupList, DeleteOption<LdBlackActionLookupCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(blackActionLookupList, option);
    }

    /**
     * Batch-delete the list with varying requests non-strictly. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDeleteNonstrict(entityList).
     * @param blackActionLookupList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDeleteNonstrict(List<LdBlackActionLookup> blackActionLookupList, DeleteOption<LdBlackActionLookupCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDeleteNonstrict(blackActionLookupList, option);
    }

    // -----------------------------------------------------
    //                                          Query Update
    //                                          ------------
    /**
     * Insert the several entities by query with varying requests (modified-only for fixed value). <br />
     * For example, disableCommonColumnAutoSetup(), disablePrimaryKeyIdentity(). <br />
     * Other specifications are same as queryInsert(entity, setupper).
     * @param setupper The set-upper of query-insert. (NotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The inserted count.
     */
    public int varyingQueryInsert(QueryInsertSetupper<LdBlackActionLookup, LdBlackActionLookupCB> setupper, InsertOption<LdBlackActionLookupCB> option) {
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
     * LdBlackActionLookup blackActionLookup = new LdBlackActionLookup();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//blackActionLookup.setPK...(value);</span>
     * blackActionLookup.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//blackActionLookup.setVersionNo(value);</span>
     * LdBlackActionLookupCB cb = new LdBlackActionLookupCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;LdBlackActionLookupCB&gt; option = new UpdateOption&lt;LdBlackActionLookupCB&gt;();
     * option.self(new SpecifyQuery&lt;LdBlackActionLookupCB&gt;() {
     *     public void specify(LdBlackActionLookupCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * blackActionLookupBhv.<span style="color: #DD4747">varyingQueryUpdate</span>(blackActionLookup, cb, option);
     * </pre>
     * @param blackActionLookup The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of LdBlackActionLookup. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(LdBlackActionLookup blackActionLookup, LdBlackActionLookupCB cb, UpdateOption<LdBlackActionLookupCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(blackActionLookup, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of LdBlackActionLookup. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(LdBlackActionLookupCB cb, DeleteOption<LdBlackActionLookupCB> option) {
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
    public OutsideSqlBasicExecutor<LdBlackActionLookupBhv> outsideSql() {
        OutsideSqlAllFacadeExecutor<LdBlackActionLookupBhv> facadeExecutor = doOutsideSql();
        return facadeExecutor.xbasicExecutor(); // variable to resolve generic type
    }

    // ===================================================================================
    //                                                                     Filter Override
    //                                                                     ===============
    @Override
    protected void filterEntityOfInsert(Entity tgt, InsertOption<? extends ConditionBean> op) {
        super.filterEntityOfInsert(tgt, op);
        LdBlackActionLookup et = downcast(tgt);
        et.setRUser(org.seasar.dbflute.AccessContext.getAccessUserOnThread());
        et.setRTimestamp(org.seasar.dbflute.AccessContext.getAccessTimestampOnThread());
    }

    // ===================================================================================
    //                                                                Optimistic Lock Info
    //                                                                ====================
    @Override
    protected boolean hasUpdateDateValue(Entity et) { return downcast(et).getUTimestamp() != null; }

    // ===================================================================================
    //                                                                         Hyper Patch
    //                                                                         ===========
    @Override
    protected <RESULT extends LdBlackActionLookup> org.seasar.dbflute.bhv.core.command.SelectCursorCBCommand<RESULT> newSelectCursorCBCommand() {
        return new com.example.dbflute.multipledb.spring.dbflute.librarydb.allcommon.LdDBFluteConfig.SelectCursorCBCommandHyperPatch<RESULT>();
    }

    @Override
    protected <RESULT extends LdBlackActionLookup> org.seasar.dbflute.bhv.core.command.SelectListCBCommand<RESULT> newSelectListCBCommand() {
        return new com.example.dbflute.multipledb.spring.dbflute.librarydb.allcommon.LdDBFluteConfig.SelectListCBCommandHyperPatch<RESULT>();
    }

    // ===================================================================================
    //                                                                         Type Helper
    //                                                                         ===========
    protected Class<? extends LdBlackActionLookup> typeOfSelectedEntity() { return LdBlackActionLookup.class; }
    protected Class<LdBlackActionLookup> typeOfHandlingEntity() { return LdBlackActionLookup.class; }
    protected Class<LdBlackActionLookupCB> typeOfHandlingConditionBean() { return LdBlackActionLookupCB.class; }
}
