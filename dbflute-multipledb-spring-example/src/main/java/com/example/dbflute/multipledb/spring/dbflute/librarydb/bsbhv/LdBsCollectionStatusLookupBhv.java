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
 * The behavior of COLLECTION_STATUS_LOOKUP as TABLE. <br />
 * <pre>
 * [primary key]
 *     COLLECTION_STATUS_CODE
 *
 * [column]
 *     COLLECTION_STATUS_CODE, COLLECTION_STATUS_NAME, R_USER, R_MODULE, R_TIMESTAMP, U_USER, U_MODULE, U_TIMESTAMP
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
 *     COLLECTION_STATUS
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     collectionStatusList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class LdBsCollectionStatusLookupBhv extends AbstractBehaviorWritable<LdCollectionStatusLookup, LdCollectionStatusLookupCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** {@inheritDoc} */
    public LdCollectionStatusLookupDbm getDBMeta() { return LdCollectionStatusLookupDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public LdCollectionStatusLookupDbm getMyDBMeta() { return LdCollectionStatusLookupDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public LdCollectionStatusLookupCB newConditionBean() { return new LdCollectionStatusLookupCB(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public LdCollectionStatusLookup newMyEntity() { return new LdCollectionStatusLookup(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public LdCollectionStatusLookupCB newMyConditionBean() { return new LdCollectionStatusLookupCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * LdCollectionStatusLookupCB cb = new LdCollectionStatusLookupCB();
     * cb.query().setFoo...(value);
     * int count = collectionStatusLookupBhv.<span style="color: #DD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of LdCollectionStatusLookup. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(LdCollectionStatusLookupCB cb) {
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
     * LdCollectionStatusLookupCB cb = new LdCollectionStatusLookupCB();
     * cb.query().setFoo...(value);
     * LdCollectionStatusLookup collectionStatusLookup = collectionStatusLookupBhv.<span style="color: #DD4747">selectEntity</span>(cb);
     * if (collectionStatusLookup != null) { <span style="color: #3F7E5E">// null check</span>
     *     ... = collectionStatusLookup.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of LdCollectionStatusLookup. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public LdCollectionStatusLookup selectEntity(LdCollectionStatusLookupCB cb) {
        return facadeSelectEntity(cb);
    }

    protected LdCollectionStatusLookup facadeSelectEntity(LdCollectionStatusLookupCB cb) {
        return doSelectEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends LdCollectionStatusLookup> OptionalEntity<ENTITY> doSelectOptionalEntity(LdCollectionStatusLookupCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)); }

    /**
     * Select the entity by the condition-bean with deleted check. <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, this method is good.</span>
     * <pre>
     * LdCollectionStatusLookupCB cb = new LdCollectionStatusLookupCB();
     * cb.query().setFoo...(value);
     * LdCollectionStatusLookup collectionStatusLookup = collectionStatusLookupBhv.<span style="color: #DD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = collectionStatusLookup.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of LdCollectionStatusLookup. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public LdCollectionStatusLookup selectEntityWithDeletedCheck(LdCollectionStatusLookupCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param collectionStatusCode : PK, NotNull, CHAR(3), classification=CollectionStatus. (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public LdCollectionStatusLookup selectByPKValue(String collectionStatusCode) {
        return facadeSelectByPKValue(collectionStatusCode);
    }

    protected LdCollectionStatusLookup facadeSelectByPKValue(String collectionStatusCode) {
        return doSelectByPK(collectionStatusCode, typeOfSelectedEntity());
    }

    protected <ENTITY extends LdCollectionStatusLookup> ENTITY doSelectByPK(String collectionStatusCode, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(collectionStatusCode), tp);
    }

    protected <ENTITY extends LdCollectionStatusLookup> OptionalEntity<ENTITY> doSelectOptionalByPK(String collectionStatusCode, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(collectionStatusCode, tp), collectionStatusCode);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param collectionStatusCode : PK, NotNull, CHAR(3), classification=CollectionStatus. (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public LdCollectionStatusLookup selectByPKValueWithDeletedCheck(String collectionStatusCode) {
        return doSelectByPKWithDeletedCheck(collectionStatusCode, typeOfSelectedEntity());
    }

    protected <ENTITY extends LdCollectionStatusLookup> ENTITY doSelectByPKWithDeletedCheck(String collectionStatusCode, Class<ENTITY> tp) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(collectionStatusCode), tp);
    }

    protected LdCollectionStatusLookupCB xprepareCBAsPK(String collectionStatusCode) {
        assertObjectNotNull("collectionStatusCode", collectionStatusCode);
        return newConditionBean().acceptPK(collectionStatusCode);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * LdCollectionStatusLookupCB cb = new LdCollectionStatusLookupCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;LdCollectionStatusLookup&gt; collectionStatusLookupList = collectionStatusLookupBhv.<span style="color: #DD4747">selectList</span>(cb);
     * for (LdCollectionStatusLookup collectionStatusLookup : collectionStatusLookupList) {
     *     ... = collectionStatusLookup.get...();
     * }
     * </pre>
     * @param cb The condition-bean of LdCollectionStatusLookup. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<LdCollectionStatusLookup> selectList(LdCollectionStatusLookupCB cb) {
        return facadeSelectList(cb);
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br />
     * (both count-select and paging-select are executed)
     * <pre>
     * LdCollectionStatusLookupCB cb = new LdCollectionStatusLookupCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #DD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;LdCollectionStatusLookup&gt; page = collectionStatusLookupBhv.<span style="color: #DD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (LdCollectionStatusLookup collectionStatusLookup : page) {
     *     ... = collectionStatusLookup.get...();
     * }
     * </pre>
     * @param cb The condition-bean of LdCollectionStatusLookup. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<LdCollectionStatusLookup> selectPage(LdCollectionStatusLookupCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * LdCollectionStatusLookupCB cb = new LdCollectionStatusLookupCB();
     * cb.query().setFoo...(value);
     * collectionStatusLookupBhv.<span style="color: #DD4747">selectCursor</span>(cb, new EntityRowHandler&lt;LdCollectionStatusLookup&gt;() {
     *     public void handle(LdCollectionStatusLookup entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of LdCollectionStatusLookup. (NotNull)
     * @param entityRowHandler The handler of entity row of LdCollectionStatusLookup. (NotNull)
     */
    public void selectCursor(LdCollectionStatusLookupCB cb, EntityRowHandler<LdCollectionStatusLookup> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * collectionStatusLookupBhv.<span style="color: #DD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(LdCollectionStatusLookupCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<LdCollectionStatusLookupCB, RESULT> scalarSelect(Class<RESULT> resultType) {
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
     * @param collectionStatusLookupList The entity list of collectionStatusLookup. (NotNull)
     * @param handler The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<LdCollectionStatusLookup> collectionStatusLookupList, ReferrerLoaderHandler<LdLoaderOfCollectionStatusLookup> handler) {
        xassLRArg(collectionStatusLookupList, handler);
        handler.handle(new LdLoaderOfCollectionStatusLookup().ready(collectionStatusLookupList, _behaviorSelector));
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
     * @param collectionStatusLookup The entity of collectionStatusLookup. (NotNull)
     * @param handler The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(LdCollectionStatusLookup collectionStatusLookup, ReferrerLoaderHandler<LdLoaderOfCollectionStatusLookup> handler) {
        xassLRArg(collectionStatusLookup, handler);
        handler.handle(new LdLoaderOfCollectionStatusLookup().ready(xnewLRAryLs(collectionStatusLookup), _behaviorSelector));
    }

    /**
     * Load referrer of collectionStatusList by the set-upper of referrer. <br />
     * COLLECTION_STATUS by COLLECTION_STATUS_CODE, named 'collectionStatusList'.
     * <pre>
     * collectionStatusLookupBhv.<span style="color: #DD4747">loadCollectionStatusList</span>(collectionStatusLookupList, new ConditionBeanSetupper&lt;LdCollectionStatusCB&gt;() {
     *     public void setup(LdCollectionStatusCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...();
     *     }
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedList(referrerList -&gt {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * for (LdCollectionStatusLookup collectionStatusLookup : collectionStatusLookupList) {
     *     ... = collectionStatusLookup.<span style="color: #DD4747">getCollectionStatusList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCollectionStatusCode_InScope(pkList);
     * cb.query().addOrderBy_CollectionStatusCode_Asc();
     * </pre>
     * @param collectionStatusLookupList The entity list of collectionStatusLookup. (NotNull)
     * @param setupper The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<LdCollectionStatus> loadCollectionStatusList(List<LdCollectionStatusLookup> collectionStatusLookupList, ConditionBeanSetupper<LdCollectionStatusCB> setupper) {
        xassLRArg(collectionStatusLookupList, setupper);
        return doLoadCollectionStatusList(collectionStatusLookupList, new LoadReferrerOption<LdCollectionStatusCB, LdCollectionStatus>().xinit(setupper));
    }

    /**
     * Load referrer of collectionStatusList by the set-upper of referrer. <br />
     * COLLECTION_STATUS by COLLECTION_STATUS_CODE, named 'collectionStatusList'.
     * <pre>
     * collectionStatusLookupBhv.<span style="color: #DD4747">loadCollectionStatusList</span>(collectionStatusLookupList, new ConditionBeanSetupper&lt;LdCollectionStatusCB&gt;() {
     *     public void setup(LdCollectionStatusCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...();
     *     }
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedList(referrerList -&gt {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = collectionStatusLookup.<span style="color: #DD4747">getCollectionStatusList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCollectionStatusCode_InScope(pkList);
     * cb.query().addOrderBy_CollectionStatusCode_Asc();
     * </pre>
     * @param collectionStatusLookup The entity of collectionStatusLookup. (NotNull)
     * @param setupper The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<LdCollectionStatus> loadCollectionStatusList(LdCollectionStatusLookup collectionStatusLookup, ConditionBeanSetupper<LdCollectionStatusCB> setupper) {
        xassLRArg(collectionStatusLookup, setupper);
        return doLoadCollectionStatusList(xnewLRLs(collectionStatusLookup), new LoadReferrerOption<LdCollectionStatusCB, LdCollectionStatus>().xinit(setupper));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param collectionStatusLookup The entity of collectionStatusLookup. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<LdCollectionStatus> loadCollectionStatusList(LdCollectionStatusLookup collectionStatusLookup, LoadReferrerOption<LdCollectionStatusCB, LdCollectionStatus> loadReferrerOption) {
        xassLRArg(collectionStatusLookup, loadReferrerOption);
        return loadCollectionStatusList(xnewLRLs(collectionStatusLookup), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param collectionStatusLookupList The entity list of collectionStatusLookup. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<LdCollectionStatus> loadCollectionStatusList(List<LdCollectionStatusLookup> collectionStatusLookupList, LoadReferrerOption<LdCollectionStatusCB, LdCollectionStatus> loadReferrerOption) {
        xassLRArg(collectionStatusLookupList, loadReferrerOption);
        if (collectionStatusLookupList.isEmpty()) { return (NestedReferrerListGateway<LdCollectionStatus>)EMPTY_NREF_LGWAY; }
        return doLoadCollectionStatusList(collectionStatusLookupList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<LdCollectionStatus> doLoadCollectionStatusList(List<LdCollectionStatusLookup> collectionStatusLookupList, LoadReferrerOption<LdCollectionStatusCB, LdCollectionStatus> option) {
        return helpLoadReferrerInternally(collectionStatusLookupList, option, "collectionStatusList");
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key collectionStatusCode.
     * @param collectionStatusLookupList The list of collectionStatusLookup. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<String> extractCollectionStatusCodeList(List<LdCollectionStatusLookup> collectionStatusLookupList)
    { return helpExtractListInternally(collectionStatusLookupList, "collectionStatusCode"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * LdCollectionStatusLookup collectionStatusLookup = new LdCollectionStatusLookup();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * collectionStatusLookup.setFoo...(value);
     * collectionStatusLookup.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//collectionStatusLookup.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//collectionStatusLookup.set...;</span>
     * collectionStatusLookupBhv.<span style="color: #DD4747">insert</span>(collectionStatusLookup);
     * ... = collectionStatusLookup.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param collectionStatusLookup The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(LdCollectionStatusLookup collectionStatusLookup) {
        doInsert(collectionStatusLookup, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, ExclusiveControl)
     * <pre>
     * LdCollectionStatusLookup collectionStatusLookup = new LdCollectionStatusLookup();
     * collectionStatusLookup.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * collectionStatusLookup.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//collectionStatusLookup.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//collectionStatusLookup.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * collectionStatusLookup.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     collectionStatusLookupBhv.<span style="color: #DD4747">update</span>(collectionStatusLookup);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param collectionStatusLookup The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @exception EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(LdCollectionStatusLookup collectionStatusLookup) {
        doUpdate(collectionStatusLookup, null);
    }

    /**
     * Update the entity non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * LdCollectionStatusLookup collectionStatusLookup = new LdCollectionStatusLookup();
     * collectionStatusLookup.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * collectionStatusLookup.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//collectionStatusLookup.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//collectionStatusLookup.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//collectionStatusLookup.setVersionNo(value);</span>
     * collectionStatusLookupBhv.<span style="color: #DD4747">updateNonstrict</span>(collectionStatusLookup);
     * </pre>
     * @param collectionStatusLookup The entity of update. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void updateNonstrict(LdCollectionStatusLookup collectionStatusLookup) {
        doUpdateNonstrict(collectionStatusLookup, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, ExclusiveControl) <br />
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br />
     * <p><span style="color: #DD4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param collectionStatusLookup The entity of insert or update. (NotNull, ...depends on insert or update)
     * @exception EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(LdCollectionStatusLookup collectionStatusLookup) {
        doInsertOrUpdate(collectionStatusLookup, null, null);
    }

    /**
     * Insert or update the entity non-strictly modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br />
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() }
     * <p><span style="color: #DD4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param collectionStatusLookup The entity of insert or update. (NotNull, ...depends on insert or update)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdateNonstrict(LdCollectionStatusLookup collectionStatusLookup) {
        doInsertOrUpdateNonstrict(collectionStatusLookup, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, ExclusiveControl)
     * <pre>
     * LdCollectionStatusLookup collectionStatusLookup = new LdCollectionStatusLookup();
     * collectionStatusLookup.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * collectionStatusLookup.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     collectionStatusLookupBhv.<span style="color: #DD4747">delete</span>(collectionStatusLookup);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param collectionStatusLookup The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @exception EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(LdCollectionStatusLookup collectionStatusLookup) {
        doDelete(collectionStatusLookup, null);
    }

    /**
     * Delete the entity non-strictly. {ZeroUpdateException, NonExclusiveControl}
     * <pre>
     * LdCollectionStatusLookup collectionStatusLookup = new LdCollectionStatusLookup();
     * collectionStatusLookup.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//collectionStatusLookup.setVersionNo(value);</span>
     * collectionStatusLookupBhv.<span style="color: #DD4747">deleteNonstrict</span>(collectionStatusLookup);
     * </pre>
     * @param collectionStatusLookup The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrict(LdCollectionStatusLookup collectionStatusLookup) {
        doDeleteNonstrict(collectionStatusLookup, null);
    }

    /**
     * Delete the entity non-strictly ignoring deleted. {ZeroUpdateException, NonExclusiveControl}
     * <pre>
     * LdCollectionStatusLookup collectionStatusLookup = new LdCollectionStatusLookup();
     * collectionStatusLookup.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//collectionStatusLookup.setVersionNo(value);</span>
     * collectionStatusLookupBhv.<span style="color: #DD4747">deleteNonstrictIgnoreDeleted</span>(collectionStatusLookup);
     * <span style="color: #3F7E5E">// if the target entity doesn't exist, no exception</span>
     * </pre>
     * @param collectionStatusLookup The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrictIgnoreDeleted(LdCollectionStatusLookup collectionStatusLookup) {
        doDeleteNonstrictIgnoreDeleted(collectionStatusLookup, null);
    }

    protected void doDeleteNonstrictIgnoreDeleted(LdCollectionStatusLookup et, final DeleteOption<LdCollectionStatusLookupCB> op) {
        assertObjectNotNull("collectionStatusLookup", et); prepareDeleteOption(op); helpDeleteNonstrictIgnoreDeletedInternally(et, op);
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
     *     LdCollectionStatusLookup collectionStatusLookup = new LdCollectionStatusLookup();
     *     collectionStatusLookup.setFooName("foo");
     *     if (...) {
     *         collectionStatusLookup.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     collectionStatusLookupList.add(collectionStatusLookup);
     * }
     * collectionStatusLookupBhv.<span style="color: #DD4747">batchInsert</span>(collectionStatusLookupList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param collectionStatusLookupList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<LdCollectionStatusLookup> collectionStatusLookupList) {
        return doBatchInsert(collectionStatusLookupList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (ExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <span style="color: #DD4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     LdCollectionStatusLookup collectionStatusLookup = new LdCollectionStatusLookup();
     *     collectionStatusLookup.setFooName("foo");
     *     if (...) {
     *         collectionStatusLookup.setFooPrice(123);
     *     } else {
     *         collectionStatusLookup.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//collectionStatusLookup.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     collectionStatusLookupList.add(collectionStatusLookup);
     * }
     * collectionStatusLookupBhv.<span style="color: #DD4747">batchUpdate</span>(collectionStatusLookupList);
     * </pre>
     * @param collectionStatusLookupList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<LdCollectionStatusLookup> collectionStatusLookupList) {
        return doBatchUpdate(collectionStatusLookupList, null);
    }

    /**
     * Batch-update the entity list specified-only. (ExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * collectionStatusLookupBhv.<span style="color: #DD4747">batchUpdate</span>(collectionStatusLookupList, new SpecifyQuery<LdCollectionStatusLookupCB>() {
     *     public void specify(LdCollectionStatusLookupCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #DD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #DD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * collectionStatusLookupBhv.<span style="color: #DD4747">batchUpdate</span>(collectionStatusLookupList, new SpecifyQuery<LdCollectionStatusLookupCB>() {
     *     public void specify(LdCollectionStatusLookupCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #DD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param collectionStatusLookupList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<LdCollectionStatusLookup> collectionStatusLookupList, SpecifyQuery<LdCollectionStatusLookupCB> updateColumnSpec) {
        return doBatchUpdate(collectionStatusLookupList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    /**
     * Batch-update the entity list non-strictly modified-only of same-set columns. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <span style="color: #DD4747; font-size: 140%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     LdCollectionStatusLookup collectionStatusLookup = new LdCollectionStatusLookup();
     *     collectionStatusLookup.setFooName("foo");
     *     if (...) {
     *         collectionStatusLookup.setFooPrice(123);
     *     } else {
     *         collectionStatusLookup.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//collectionStatusLookup.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     collectionStatusLookupList.add(collectionStatusLookup);
     * }
     * collectionStatusLookupBhv.<span style="color: #DD4747">batchUpdate</span>(collectionStatusLookupList);
     * </pre>
     * @param collectionStatusLookupList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<LdCollectionStatusLookup> collectionStatusLookupList) {
        return doBatchUpdateNonstrict(collectionStatusLookupList, null);
    }

    /**
     * Batch-update the entity list non-strictly specified-only. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * collectionStatusLookupBhv.<span style="color: #DD4747">batchUpdateNonstrict</span>(collectionStatusLookupList, new SpecifyQuery<LdCollectionStatusLookupCB>() {
     *     public void specify(LdCollectionStatusLookupCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #DD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #DD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * collectionStatusLookupBhv.<span style="color: #DD4747">batchUpdateNonstrict</span>(collectionStatusLookupList, new SpecifyQuery<LdCollectionStatusLookupCB>() {
     *     public void specify(LdCollectionStatusLookupCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #DD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).</p>
     * @param collectionStatusLookupList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<LdCollectionStatusLookup> collectionStatusLookupList, SpecifyQuery<LdCollectionStatusLookupCB> updateColumnSpec) {
        return doBatchUpdateNonstrict(collectionStatusLookupList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    /**
     * Batch-delete the entity list. (ExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param collectionStatusLookupList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchDelete(List<LdCollectionStatusLookup> collectionStatusLookupList) {
        return doBatchDelete(collectionStatusLookupList, null);
    }

    /**
     * Batch-delete the entity list non-strictly. {NonExclusiveControl} <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param collectionStatusLookupList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDeleteNonstrict(List<LdCollectionStatusLookup> collectionStatusLookupList) {
        return doBatchDeleteNonstrict(collectionStatusLookupList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * collectionStatusLookupBhv.<span style="color: #DD4747">queryInsert</span>(new QueryInsertSetupper&lt;LdCollectionStatusLookup, LdCollectionStatusLookupCB&gt;() {
     *     public ConditionBean setup(LdCollectionStatusLookup entity, LdCollectionStatusLookupCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<LdCollectionStatusLookup, LdCollectionStatusLookupCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * LdCollectionStatusLookup collectionStatusLookup = new LdCollectionStatusLookup();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//collectionStatusLookup.setPK...(value);</span>
     * collectionStatusLookup.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//collectionStatusLookup.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//collectionStatusLookup.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//collectionStatusLookup.setVersionNo(value);</span>
     * LdCollectionStatusLookupCB cb = new LdCollectionStatusLookupCB();
     * cb.query().setFoo...(value);
     * collectionStatusLookupBhv.<span style="color: #DD4747">queryUpdate</span>(collectionStatusLookup, cb);
     * </pre>
     * @param collectionStatusLookup The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of LdCollectionStatusLookup. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(LdCollectionStatusLookup collectionStatusLookup, LdCollectionStatusLookupCB cb) {
        return doQueryUpdate(collectionStatusLookup, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * LdCollectionStatusLookupCB cb = new LdCollectionStatusLookupCB();
     * cb.query().setFoo...(value);
     * collectionStatusLookupBhv.<span style="color: #DD4747">queryDelete</span>(collectionStatusLookup, cb);
     * </pre>
     * @param cb The condition-bean of LdCollectionStatusLookup. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(LdCollectionStatusLookupCB cb) {
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
     * LdCollectionStatusLookup collectionStatusLookup = new LdCollectionStatusLookup();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * collectionStatusLookup.setFoo...(value);
     * collectionStatusLookup.setBar...(value);
     * InsertOption<LdCollectionStatusLookupCB> option = new InsertOption<LdCollectionStatusLookupCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * collectionStatusLookupBhv.<span style="color: #DD4747">varyingInsert</span>(collectionStatusLookup, option);
     * ... = collectionStatusLookup.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param collectionStatusLookup The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(LdCollectionStatusLookup collectionStatusLookup, InsertOption<LdCollectionStatusLookupCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(collectionStatusLookup, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, ExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * LdCollectionStatusLookup collectionStatusLookup = new LdCollectionStatusLookup();
     * collectionStatusLookup.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * collectionStatusLookup.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * collectionStatusLookup.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;LdCollectionStatusLookupCB&gt; option = new UpdateOption&lt;LdCollectionStatusLookupCB&gt;();
     *     option.self(new SpecifyQuery&lt;LdCollectionStatusLookupCB&gt;() {
     *         public void specify(LdCollectionStatusLookupCB cb) {
     *             cb.specify().<span style="color: #DD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     collectionStatusLookupBhv.<span style="color: #DD4747">varyingUpdate</span>(collectionStatusLookup, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param collectionStatusLookup The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(LdCollectionStatusLookup collectionStatusLookup, UpdateOption<LdCollectionStatusLookupCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(collectionStatusLookup, option);
    }

    /**
     * Update the entity with varying requests non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as updateNonstrict(entity).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * LdCollectionStatusLookup collectionStatusLookup = new LdCollectionStatusLookup();
     * collectionStatusLookup.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * collectionStatusLookup.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//collectionStatusLookup.setVersionNo(value);</span>
     * UpdateOption&lt;LdCollectionStatusLookupCB&gt; option = new UpdateOption&lt;LdCollectionStatusLookupCB&gt;();
     * option.self(new SpecifyQuery&lt;LdCollectionStatusLookupCB&gt;() {
     *     public void specify(LdCollectionStatusLookupCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * collectionStatusLookupBhv.<span style="color: #DD4747">varyingUpdateNonstrict</span>(collectionStatusLookup, option);
     * </pre>
     * @param collectionStatusLookup The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdateNonstrict(LdCollectionStatusLookup collectionStatusLookup, UpdateOption<LdCollectionStatusLookupCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdateNonstrict(collectionStatusLookup, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param collectionStatusLookup The entity of insert or update. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(LdCollectionStatusLookup collectionStatusLookup, InsertOption<LdCollectionStatusLookupCB> insertOption, UpdateOption<LdCollectionStatusLookupCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInsertOrUpdate(collectionStatusLookup, insertOption, updateOption);
    }

    /**
     * Insert or update the entity with varying requests non-strictly. (NonExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdateNonstrict(entity).
     * @param collectionStatusLookup The entity of insert or update. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdateNonstrict(LdCollectionStatusLookup collectionStatusLookup, InsertOption<LdCollectionStatusLookupCB> insertOption, UpdateOption<LdCollectionStatusLookupCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInsertOrUpdateNonstrict(collectionStatusLookup, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, ExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param collectionStatusLookup The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(LdCollectionStatusLookup collectionStatusLookup, DeleteOption<LdCollectionStatusLookupCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(collectionStatusLookup, option);
    }

    /**
     * Delete the entity with varying requests non-strictly. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as deleteNonstrict(entity).
     * @param collectionStatusLookup The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDeleteNonstrict(LdCollectionStatusLookup collectionStatusLookup, DeleteOption<LdCollectionStatusLookupCB> option) {
        assertDeleteOptionNotNull(option);
        doDeleteNonstrict(collectionStatusLookup, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param collectionStatusLookupList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<LdCollectionStatusLookup> collectionStatusLookupList, InsertOption<LdCollectionStatusLookupCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(collectionStatusLookupList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param collectionStatusLookupList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<LdCollectionStatusLookup> collectionStatusLookupList, UpdateOption<LdCollectionStatusLookupCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(collectionStatusLookupList, option);
    }

    /**
     * Batch-update the list with varying requests non-strictly. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param collectionStatusLookupList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdateNonstrict(List<LdCollectionStatusLookup> collectionStatusLookupList, UpdateOption<LdCollectionStatusLookupCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdateNonstrict(collectionStatusLookupList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param collectionStatusLookupList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<LdCollectionStatusLookup> collectionStatusLookupList, DeleteOption<LdCollectionStatusLookupCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(collectionStatusLookupList, option);
    }

    /**
     * Batch-delete the list with varying requests non-strictly. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDeleteNonstrict(entityList).
     * @param collectionStatusLookupList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDeleteNonstrict(List<LdCollectionStatusLookup> collectionStatusLookupList, DeleteOption<LdCollectionStatusLookupCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDeleteNonstrict(collectionStatusLookupList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<LdCollectionStatusLookup, LdCollectionStatusLookupCB> setupper, InsertOption<LdCollectionStatusLookupCB> option) {
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
     * LdCollectionStatusLookup collectionStatusLookup = new LdCollectionStatusLookup();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//collectionStatusLookup.setPK...(value);</span>
     * collectionStatusLookup.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//collectionStatusLookup.setVersionNo(value);</span>
     * LdCollectionStatusLookupCB cb = new LdCollectionStatusLookupCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;LdCollectionStatusLookupCB&gt; option = new UpdateOption&lt;LdCollectionStatusLookupCB&gt;();
     * option.self(new SpecifyQuery&lt;LdCollectionStatusLookupCB&gt;() {
     *     public void specify(LdCollectionStatusLookupCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * collectionStatusLookupBhv.<span style="color: #DD4747">varyingQueryUpdate</span>(collectionStatusLookup, cb, option);
     * </pre>
     * @param collectionStatusLookup The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of LdCollectionStatusLookup. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(LdCollectionStatusLookup collectionStatusLookup, LdCollectionStatusLookupCB cb, UpdateOption<LdCollectionStatusLookupCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(collectionStatusLookup, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of LdCollectionStatusLookup. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(LdCollectionStatusLookupCB cb, DeleteOption<LdCollectionStatusLookupCB> option) {
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
    public OutsideSqlBasicExecutor<LdCollectionStatusLookupBhv> outsideSql() {
        OutsideSqlAllFacadeExecutor<LdCollectionStatusLookupBhv> facadeExecutor = doOutsideSql();
        return facadeExecutor.xbasicExecutor(); // variable to resolve generic type
    }

    // ===================================================================================
    //                                                                     Filter Override
    //                                                                     ===============
    @Override
    protected void filterEntityOfInsert(Entity tgt, InsertOption<? extends ConditionBean> op) {
        super.filterEntityOfInsert(tgt, op);
        LdCollectionStatusLookup et = downcast(tgt);
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
    protected <RESULT extends LdCollectionStatusLookup> org.seasar.dbflute.bhv.core.command.SelectCursorCBCommand<RESULT> newSelectCursorCBCommand() {
        return new com.example.dbflute.multipledb.spring.dbflute.librarydb.allcommon.LdDBFluteConfig.SelectCursorCBCommandHyperPatch<RESULT>();
    }

    @Override
    protected <RESULT extends LdCollectionStatusLookup> org.seasar.dbflute.bhv.core.command.SelectListCBCommand<RESULT> newSelectListCBCommand() {
        return new com.example.dbflute.multipledb.spring.dbflute.librarydb.allcommon.LdDBFluteConfig.SelectListCBCommandHyperPatch<RESULT>();
    }

    // ===================================================================================
    //                                                                         Type Helper
    //                                                                         ===========
    protected Class<? extends LdCollectionStatusLookup> typeOfSelectedEntity() { return LdCollectionStatusLookup.class; }
    protected Class<LdCollectionStatusLookup> typeOfHandlingEntity() { return LdCollectionStatusLookup.class; }
    protected Class<LdCollectionStatusLookupCB> typeOfHandlingConditionBean() { return LdCollectionStatusLookupCB.class; }
}
