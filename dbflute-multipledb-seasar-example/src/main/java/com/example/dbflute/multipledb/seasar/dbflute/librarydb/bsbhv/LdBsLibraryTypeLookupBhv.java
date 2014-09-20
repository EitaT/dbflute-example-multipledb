/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */package com.example.dbflute.multipledb.seasar.dbflute.librarydb.bsbhv;

import java.util.List;

import org.seasar.dbflute.*;
import org.seasar.dbflute.bhv.*;
import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.cbean.chelper.HpSLSFunction;
import org.seasar.dbflute.exception.*;
import org.seasar.dbflute.optional.OptionalEntity;
import org.seasar.dbflute.outsidesql.executor.*;
import com.example.dbflute.multipledb.seasar.dbflute.librarydb.exbhv.*;
import com.example.dbflute.multipledb.seasar.dbflute.librarydb.bsbhv.loader.*;
import com.example.dbflute.multipledb.seasar.dbflute.librarydb.exentity.*;
import com.example.dbflute.multipledb.seasar.dbflute.librarydb.bsentity.dbmeta.*;
import com.example.dbflute.multipledb.seasar.dbflute.librarydb.cbean.*;

/**
 * The behavior of LIBRARY_TYPE_LOOKUP as TABLE. <br />
 * <pre>
 * [primary key]
 *     LIBRARY_TYPE_CODE
 *
 * [column]
 *     LIBRARY_TYPE_CODE, LIBRARY_TYPE_NAME, R_USER, R_MODULE, R_TIMESTAMP, U_USER, U_MODULE, U_TIMESTAMP
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
 *     LIBRARY
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     libraryList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class LdBsLibraryTypeLookupBhv extends AbstractBehaviorWritable<LdLibraryTypeLookup, LdLibraryTypeLookupCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** {@inheritDoc} */
    public LdLibraryTypeLookupDbm getDBMeta() { return LdLibraryTypeLookupDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public LdLibraryTypeLookupDbm getMyDBMeta() { return LdLibraryTypeLookupDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public LdLibraryTypeLookupCB newConditionBean() { return new LdLibraryTypeLookupCB(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public LdLibraryTypeLookup newMyEntity() { return new LdLibraryTypeLookup(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public LdLibraryTypeLookupCB newMyConditionBean() { return new LdLibraryTypeLookupCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * LdLibraryTypeLookupCB cb = new LdLibraryTypeLookupCB();
     * cb.query().setFoo...(value);
     * int count = libraryTypeLookupBhv.<span style="color: #DD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of LdLibraryTypeLookup. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(LdLibraryTypeLookupCB cb) {
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
     * LdLibraryTypeLookupCB cb = new LdLibraryTypeLookupCB();
     * cb.query().setFoo...(value);
     * LdLibraryTypeLookup libraryTypeLookup = libraryTypeLookupBhv.<span style="color: #DD4747">selectEntity</span>(cb);
     * if (libraryTypeLookup != null) { <span style="color: #3F7E5E">// null check</span>
     *     ... = libraryTypeLookup.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of LdLibraryTypeLookup. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public LdLibraryTypeLookup selectEntity(LdLibraryTypeLookupCB cb) {
        return facadeSelectEntity(cb);
    }

    protected LdLibraryTypeLookup facadeSelectEntity(LdLibraryTypeLookupCB cb) {
        return doSelectEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends LdLibraryTypeLookup> OptionalEntity<ENTITY> doSelectOptionalEntity(LdLibraryTypeLookupCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)); }

    /**
     * Select the entity by the condition-bean with deleted check. <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, this method is good.</span>
     * <pre>
     * LdLibraryTypeLookupCB cb = new LdLibraryTypeLookupCB();
     * cb.query().setFoo...(value);
     * LdLibraryTypeLookup libraryTypeLookup = libraryTypeLookupBhv.<span style="color: #DD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = libraryTypeLookup.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of LdLibraryTypeLookup. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public LdLibraryTypeLookup selectEntityWithDeletedCheck(LdLibraryTypeLookupCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param libraryTypeCode : PK, NotNull, CHAR(3). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public LdLibraryTypeLookup selectByPKValue(String libraryTypeCode) {
        return facadeSelectByPKValue(libraryTypeCode);
    }

    protected LdLibraryTypeLookup facadeSelectByPKValue(String libraryTypeCode) {
        return doSelectByPK(libraryTypeCode, typeOfSelectedEntity());
    }

    protected <ENTITY extends LdLibraryTypeLookup> ENTITY doSelectByPK(String libraryTypeCode, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(libraryTypeCode), tp);
    }

    protected <ENTITY extends LdLibraryTypeLookup> OptionalEntity<ENTITY> doSelectOptionalByPK(String libraryTypeCode, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(libraryTypeCode, tp), libraryTypeCode);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param libraryTypeCode : PK, NotNull, CHAR(3). (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public LdLibraryTypeLookup selectByPKValueWithDeletedCheck(String libraryTypeCode) {
        return doSelectByPKWithDeletedCheck(libraryTypeCode, typeOfSelectedEntity());
    }

    protected <ENTITY extends LdLibraryTypeLookup> ENTITY doSelectByPKWithDeletedCheck(String libraryTypeCode, Class<ENTITY> tp) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(libraryTypeCode), tp);
    }

    protected LdLibraryTypeLookupCB xprepareCBAsPK(String libraryTypeCode) {
        assertObjectNotNull("libraryTypeCode", libraryTypeCode);
        return newConditionBean().acceptPK(libraryTypeCode);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * LdLibraryTypeLookupCB cb = new LdLibraryTypeLookupCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;LdLibraryTypeLookup&gt; libraryTypeLookupList = libraryTypeLookupBhv.<span style="color: #DD4747">selectList</span>(cb);
     * for (LdLibraryTypeLookup libraryTypeLookup : libraryTypeLookupList) {
     *     ... = libraryTypeLookup.get...();
     * }
     * </pre>
     * @param cb The condition-bean of LdLibraryTypeLookup. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<LdLibraryTypeLookup> selectList(LdLibraryTypeLookupCB cb) {
        return facadeSelectList(cb);
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br />
     * (both count-select and paging-select are executed)
     * <pre>
     * LdLibraryTypeLookupCB cb = new LdLibraryTypeLookupCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #DD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;LdLibraryTypeLookup&gt; page = libraryTypeLookupBhv.<span style="color: #DD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (LdLibraryTypeLookup libraryTypeLookup : page) {
     *     ... = libraryTypeLookup.get...();
     * }
     * </pre>
     * @param cb The condition-bean of LdLibraryTypeLookup. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<LdLibraryTypeLookup> selectPage(LdLibraryTypeLookupCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * LdLibraryTypeLookupCB cb = new LdLibraryTypeLookupCB();
     * cb.query().setFoo...(value);
     * libraryTypeLookupBhv.<span style="color: #DD4747">selectCursor</span>(cb, new EntityRowHandler&lt;LdLibraryTypeLookup&gt;() {
     *     public void handle(LdLibraryTypeLookup entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of LdLibraryTypeLookup. (NotNull)
     * @param entityRowHandler The handler of entity row of LdLibraryTypeLookup. (NotNull)
     */
    public void selectCursor(LdLibraryTypeLookupCB cb, EntityRowHandler<LdLibraryTypeLookup> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * libraryTypeLookupBhv.<span style="color: #DD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(LdLibraryTypeLookupCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<LdLibraryTypeLookupCB, RESULT> scalarSelect(Class<RESULT> resultType) {
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
     * @param libraryTypeLookupList The entity list of libraryTypeLookup. (NotNull)
     * @param handler The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<LdLibraryTypeLookup> libraryTypeLookupList, ReferrerLoaderHandler<LdLoaderOfLibraryTypeLookup> handler) {
        xassLRArg(libraryTypeLookupList, handler);
        handler.handle(new LdLoaderOfLibraryTypeLookup().ready(libraryTypeLookupList, _behaviorSelector));
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
     * @param libraryTypeLookup The entity of libraryTypeLookup. (NotNull)
     * @param handler The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(LdLibraryTypeLookup libraryTypeLookup, ReferrerLoaderHandler<LdLoaderOfLibraryTypeLookup> handler) {
        xassLRArg(libraryTypeLookup, handler);
        handler.handle(new LdLoaderOfLibraryTypeLookup().ready(xnewLRAryLs(libraryTypeLookup), _behaviorSelector));
    }

    /**
     * Load referrer of libraryList by the set-upper of referrer. <br />
     * LIBRARY by LIBRARY_TYPE_CODE, named 'libraryList'.
     * <pre>
     * libraryTypeLookupBhv.<span style="color: #DD4747">loadLibraryList</span>(libraryTypeLookupList, new ConditionBeanSetupper&lt;LdLibraryCB&gt;() {
     *     public void setup(LdLibraryCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...();
     *     }
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedList(referrerList -&gt {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * for (LdLibraryTypeLookup libraryTypeLookup : libraryTypeLookupList) {
     *     ... = libraryTypeLookup.<span style="color: #DD4747">getLibraryList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setLibraryTypeCode_InScope(pkList);
     * cb.query().addOrderBy_LibraryTypeCode_Asc();
     * </pre>
     * @param libraryTypeLookupList The entity list of libraryTypeLookup. (NotNull)
     * @param setupper The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<LdLibrary> loadLibraryList(List<LdLibraryTypeLookup> libraryTypeLookupList, ConditionBeanSetupper<LdLibraryCB> setupper) {
        xassLRArg(libraryTypeLookupList, setupper);
        return doLoadLibraryList(libraryTypeLookupList, new LoadReferrerOption<LdLibraryCB, LdLibrary>().xinit(setupper));
    }

    /**
     * Load referrer of libraryList by the set-upper of referrer. <br />
     * LIBRARY by LIBRARY_TYPE_CODE, named 'libraryList'.
     * <pre>
     * libraryTypeLookupBhv.<span style="color: #DD4747">loadLibraryList</span>(libraryTypeLookupList, new ConditionBeanSetupper&lt;LdLibraryCB&gt;() {
     *     public void setup(LdLibraryCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...();
     *     }
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedList(referrerList -&gt {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = libraryTypeLookup.<span style="color: #DD4747">getLibraryList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setLibraryTypeCode_InScope(pkList);
     * cb.query().addOrderBy_LibraryTypeCode_Asc();
     * </pre>
     * @param libraryTypeLookup The entity of libraryTypeLookup. (NotNull)
     * @param setupper The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<LdLibrary> loadLibraryList(LdLibraryTypeLookup libraryTypeLookup, ConditionBeanSetupper<LdLibraryCB> setupper) {
        xassLRArg(libraryTypeLookup, setupper);
        return doLoadLibraryList(xnewLRLs(libraryTypeLookup), new LoadReferrerOption<LdLibraryCB, LdLibrary>().xinit(setupper));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param libraryTypeLookup The entity of libraryTypeLookup. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<LdLibrary> loadLibraryList(LdLibraryTypeLookup libraryTypeLookup, LoadReferrerOption<LdLibraryCB, LdLibrary> loadReferrerOption) {
        xassLRArg(libraryTypeLookup, loadReferrerOption);
        return loadLibraryList(xnewLRLs(libraryTypeLookup), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param libraryTypeLookupList The entity list of libraryTypeLookup. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<LdLibrary> loadLibraryList(List<LdLibraryTypeLookup> libraryTypeLookupList, LoadReferrerOption<LdLibraryCB, LdLibrary> loadReferrerOption) {
        xassLRArg(libraryTypeLookupList, loadReferrerOption);
        if (libraryTypeLookupList.isEmpty()) { return (NestedReferrerListGateway<LdLibrary>)EMPTY_NREF_LGWAY; }
        return doLoadLibraryList(libraryTypeLookupList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<LdLibrary> doLoadLibraryList(List<LdLibraryTypeLookup> libraryTypeLookupList, LoadReferrerOption<LdLibraryCB, LdLibrary> option) {
        return helpLoadReferrerInternally(libraryTypeLookupList, option, "libraryList");
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key libraryTypeCode.
     * @param libraryTypeLookupList The list of libraryTypeLookup. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<String> extractLibraryTypeCodeList(List<LdLibraryTypeLookup> libraryTypeLookupList)
    { return helpExtractListInternally(libraryTypeLookupList, "libraryTypeCode"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * LdLibraryTypeLookup libraryTypeLookup = new LdLibraryTypeLookup();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * libraryTypeLookup.setFoo...(value);
     * libraryTypeLookup.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//libraryTypeLookup.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//libraryTypeLookup.set...;</span>
     * libraryTypeLookupBhv.<span style="color: #DD4747">insert</span>(libraryTypeLookup);
     * ... = libraryTypeLookup.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param libraryTypeLookup The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(LdLibraryTypeLookup libraryTypeLookup) {
        doInsert(libraryTypeLookup, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, ExclusiveControl)
     * <pre>
     * LdLibraryTypeLookup libraryTypeLookup = new LdLibraryTypeLookup();
     * libraryTypeLookup.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * libraryTypeLookup.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//libraryTypeLookup.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//libraryTypeLookup.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * libraryTypeLookup.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     libraryTypeLookupBhv.<span style="color: #DD4747">update</span>(libraryTypeLookup);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param libraryTypeLookup The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @exception EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(LdLibraryTypeLookup libraryTypeLookup) {
        doUpdate(libraryTypeLookup, null);
    }

    /**
     * Update the entity non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * LdLibraryTypeLookup libraryTypeLookup = new LdLibraryTypeLookup();
     * libraryTypeLookup.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * libraryTypeLookup.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//libraryTypeLookup.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//libraryTypeLookup.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//libraryTypeLookup.setVersionNo(value);</span>
     * libraryTypeLookupBhv.<span style="color: #DD4747">updateNonstrict</span>(libraryTypeLookup);
     * </pre>
     * @param libraryTypeLookup The entity of update. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void updateNonstrict(LdLibraryTypeLookup libraryTypeLookup) {
        doUpdateNonstrict(libraryTypeLookup, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, ExclusiveControl) <br />
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br />
     * <p><span style="color: #DD4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param libraryTypeLookup The entity of insert or update. (NotNull, ...depends on insert or update)
     * @exception EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(LdLibraryTypeLookup libraryTypeLookup) {
        doInsertOrUpdate(libraryTypeLookup, null, null);
    }

    /**
     * Insert or update the entity non-strictly modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br />
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() }
     * <p><span style="color: #DD4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param libraryTypeLookup The entity of insert or update. (NotNull, ...depends on insert or update)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdateNonstrict(LdLibraryTypeLookup libraryTypeLookup) {
        doInsertOrUpdateNonstrict(libraryTypeLookup, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, ExclusiveControl)
     * <pre>
     * LdLibraryTypeLookup libraryTypeLookup = new LdLibraryTypeLookup();
     * libraryTypeLookup.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * libraryTypeLookup.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     libraryTypeLookupBhv.<span style="color: #DD4747">delete</span>(libraryTypeLookup);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param libraryTypeLookup The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @exception EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(LdLibraryTypeLookup libraryTypeLookup) {
        doDelete(libraryTypeLookup, null);
    }

    /**
     * Delete the entity non-strictly. {ZeroUpdateException, NonExclusiveControl}
     * <pre>
     * LdLibraryTypeLookup libraryTypeLookup = new LdLibraryTypeLookup();
     * libraryTypeLookup.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//libraryTypeLookup.setVersionNo(value);</span>
     * libraryTypeLookupBhv.<span style="color: #DD4747">deleteNonstrict</span>(libraryTypeLookup);
     * </pre>
     * @param libraryTypeLookup The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrict(LdLibraryTypeLookup libraryTypeLookup) {
        doDeleteNonstrict(libraryTypeLookup, null);
    }

    /**
     * Delete the entity non-strictly ignoring deleted. {ZeroUpdateException, NonExclusiveControl}
     * <pre>
     * LdLibraryTypeLookup libraryTypeLookup = new LdLibraryTypeLookup();
     * libraryTypeLookup.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//libraryTypeLookup.setVersionNo(value);</span>
     * libraryTypeLookupBhv.<span style="color: #DD4747">deleteNonstrictIgnoreDeleted</span>(libraryTypeLookup);
     * <span style="color: #3F7E5E">// if the target entity doesn't exist, no exception</span>
     * </pre>
     * @param libraryTypeLookup The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrictIgnoreDeleted(LdLibraryTypeLookup libraryTypeLookup) {
        doDeleteNonstrictIgnoreDeleted(libraryTypeLookup, null);
    }

    protected void doDeleteNonstrictIgnoreDeleted(LdLibraryTypeLookup et, final DeleteOption<LdLibraryTypeLookupCB> op) {
        assertObjectNotNull("libraryTypeLookup", et); prepareDeleteOption(op); helpDeleteNonstrictIgnoreDeletedInternally(et, op);
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
     *     LdLibraryTypeLookup libraryTypeLookup = new LdLibraryTypeLookup();
     *     libraryTypeLookup.setFooName("foo");
     *     if (...) {
     *         libraryTypeLookup.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     libraryTypeLookupList.add(libraryTypeLookup);
     * }
     * libraryTypeLookupBhv.<span style="color: #DD4747">batchInsert</span>(libraryTypeLookupList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param libraryTypeLookupList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<LdLibraryTypeLookup> libraryTypeLookupList) {
        return doBatchInsert(libraryTypeLookupList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (ExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <span style="color: #DD4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     LdLibraryTypeLookup libraryTypeLookup = new LdLibraryTypeLookup();
     *     libraryTypeLookup.setFooName("foo");
     *     if (...) {
     *         libraryTypeLookup.setFooPrice(123);
     *     } else {
     *         libraryTypeLookup.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//libraryTypeLookup.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     libraryTypeLookupList.add(libraryTypeLookup);
     * }
     * libraryTypeLookupBhv.<span style="color: #DD4747">batchUpdate</span>(libraryTypeLookupList);
     * </pre>
     * @param libraryTypeLookupList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<LdLibraryTypeLookup> libraryTypeLookupList) {
        return doBatchUpdate(libraryTypeLookupList, null);
    }

    /**
     * Batch-update the entity list specified-only. (ExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * libraryTypeLookupBhv.<span style="color: #DD4747">batchUpdate</span>(libraryTypeLookupList, new SpecifyQuery<LdLibraryTypeLookupCB>() {
     *     public void specify(LdLibraryTypeLookupCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #DD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #DD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * libraryTypeLookupBhv.<span style="color: #DD4747">batchUpdate</span>(libraryTypeLookupList, new SpecifyQuery<LdLibraryTypeLookupCB>() {
     *     public void specify(LdLibraryTypeLookupCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #DD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param libraryTypeLookupList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<LdLibraryTypeLookup> libraryTypeLookupList, SpecifyQuery<LdLibraryTypeLookupCB> updateColumnSpec) {
        return doBatchUpdate(libraryTypeLookupList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    /**
     * Batch-update the entity list non-strictly modified-only of same-set columns. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <span style="color: #DD4747; font-size: 140%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     LdLibraryTypeLookup libraryTypeLookup = new LdLibraryTypeLookup();
     *     libraryTypeLookup.setFooName("foo");
     *     if (...) {
     *         libraryTypeLookup.setFooPrice(123);
     *     } else {
     *         libraryTypeLookup.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//libraryTypeLookup.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     libraryTypeLookupList.add(libraryTypeLookup);
     * }
     * libraryTypeLookupBhv.<span style="color: #DD4747">batchUpdate</span>(libraryTypeLookupList);
     * </pre>
     * @param libraryTypeLookupList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<LdLibraryTypeLookup> libraryTypeLookupList) {
        return doBatchUpdateNonstrict(libraryTypeLookupList, null);
    }

    /**
     * Batch-update the entity list non-strictly specified-only. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * libraryTypeLookupBhv.<span style="color: #DD4747">batchUpdateNonstrict</span>(libraryTypeLookupList, new SpecifyQuery<LdLibraryTypeLookupCB>() {
     *     public void specify(LdLibraryTypeLookupCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #DD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #DD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * libraryTypeLookupBhv.<span style="color: #DD4747">batchUpdateNonstrict</span>(libraryTypeLookupList, new SpecifyQuery<LdLibraryTypeLookupCB>() {
     *     public void specify(LdLibraryTypeLookupCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #DD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).</p>
     * @param libraryTypeLookupList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<LdLibraryTypeLookup> libraryTypeLookupList, SpecifyQuery<LdLibraryTypeLookupCB> updateColumnSpec) {
        return doBatchUpdateNonstrict(libraryTypeLookupList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    /**
     * Batch-delete the entity list. (ExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param libraryTypeLookupList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchDelete(List<LdLibraryTypeLookup> libraryTypeLookupList) {
        return doBatchDelete(libraryTypeLookupList, null);
    }

    /**
     * Batch-delete the entity list non-strictly. {NonExclusiveControl} <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param libraryTypeLookupList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDeleteNonstrict(List<LdLibraryTypeLookup> libraryTypeLookupList) {
        return doBatchDeleteNonstrict(libraryTypeLookupList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * libraryTypeLookupBhv.<span style="color: #DD4747">queryInsert</span>(new QueryInsertSetupper&lt;LdLibraryTypeLookup, LdLibraryTypeLookupCB&gt;() {
     *     public ConditionBean setup(LdLibraryTypeLookup entity, LdLibraryTypeLookupCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<LdLibraryTypeLookup, LdLibraryTypeLookupCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * LdLibraryTypeLookup libraryTypeLookup = new LdLibraryTypeLookup();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//libraryTypeLookup.setPK...(value);</span>
     * libraryTypeLookup.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//libraryTypeLookup.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//libraryTypeLookup.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//libraryTypeLookup.setVersionNo(value);</span>
     * LdLibraryTypeLookupCB cb = new LdLibraryTypeLookupCB();
     * cb.query().setFoo...(value);
     * libraryTypeLookupBhv.<span style="color: #DD4747">queryUpdate</span>(libraryTypeLookup, cb);
     * </pre>
     * @param libraryTypeLookup The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of LdLibraryTypeLookup. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(LdLibraryTypeLookup libraryTypeLookup, LdLibraryTypeLookupCB cb) {
        return doQueryUpdate(libraryTypeLookup, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * LdLibraryTypeLookupCB cb = new LdLibraryTypeLookupCB();
     * cb.query().setFoo...(value);
     * libraryTypeLookupBhv.<span style="color: #DD4747">queryDelete</span>(libraryTypeLookup, cb);
     * </pre>
     * @param cb The condition-bean of LdLibraryTypeLookup. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(LdLibraryTypeLookupCB cb) {
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
     * LdLibraryTypeLookup libraryTypeLookup = new LdLibraryTypeLookup();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * libraryTypeLookup.setFoo...(value);
     * libraryTypeLookup.setBar...(value);
     * InsertOption<LdLibraryTypeLookupCB> option = new InsertOption<LdLibraryTypeLookupCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * libraryTypeLookupBhv.<span style="color: #DD4747">varyingInsert</span>(libraryTypeLookup, option);
     * ... = libraryTypeLookup.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param libraryTypeLookup The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(LdLibraryTypeLookup libraryTypeLookup, InsertOption<LdLibraryTypeLookupCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(libraryTypeLookup, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, ExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * LdLibraryTypeLookup libraryTypeLookup = new LdLibraryTypeLookup();
     * libraryTypeLookup.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * libraryTypeLookup.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * libraryTypeLookup.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;LdLibraryTypeLookupCB&gt; option = new UpdateOption&lt;LdLibraryTypeLookupCB&gt;();
     *     option.self(new SpecifyQuery&lt;LdLibraryTypeLookupCB&gt;() {
     *         public void specify(LdLibraryTypeLookupCB cb) {
     *             cb.specify().<span style="color: #DD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     libraryTypeLookupBhv.<span style="color: #DD4747">varyingUpdate</span>(libraryTypeLookup, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param libraryTypeLookup The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(LdLibraryTypeLookup libraryTypeLookup, UpdateOption<LdLibraryTypeLookupCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(libraryTypeLookup, option);
    }

    /**
     * Update the entity with varying requests non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as updateNonstrict(entity).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * LdLibraryTypeLookup libraryTypeLookup = new LdLibraryTypeLookup();
     * libraryTypeLookup.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * libraryTypeLookup.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//libraryTypeLookup.setVersionNo(value);</span>
     * UpdateOption&lt;LdLibraryTypeLookupCB&gt; option = new UpdateOption&lt;LdLibraryTypeLookupCB&gt;();
     * option.self(new SpecifyQuery&lt;LdLibraryTypeLookupCB&gt;() {
     *     public void specify(LdLibraryTypeLookupCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * libraryTypeLookupBhv.<span style="color: #DD4747">varyingUpdateNonstrict</span>(libraryTypeLookup, option);
     * </pre>
     * @param libraryTypeLookup The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdateNonstrict(LdLibraryTypeLookup libraryTypeLookup, UpdateOption<LdLibraryTypeLookupCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdateNonstrict(libraryTypeLookup, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param libraryTypeLookup The entity of insert or update. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(LdLibraryTypeLookup libraryTypeLookup, InsertOption<LdLibraryTypeLookupCB> insertOption, UpdateOption<LdLibraryTypeLookupCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInsertOrUpdate(libraryTypeLookup, insertOption, updateOption);
    }

    /**
     * Insert or update the entity with varying requests non-strictly. (NonExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdateNonstrict(entity).
     * @param libraryTypeLookup The entity of insert or update. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdateNonstrict(LdLibraryTypeLookup libraryTypeLookup, InsertOption<LdLibraryTypeLookupCB> insertOption, UpdateOption<LdLibraryTypeLookupCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInsertOrUpdateNonstrict(libraryTypeLookup, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, ExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param libraryTypeLookup The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(LdLibraryTypeLookup libraryTypeLookup, DeleteOption<LdLibraryTypeLookupCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(libraryTypeLookup, option);
    }

    /**
     * Delete the entity with varying requests non-strictly. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as deleteNonstrict(entity).
     * @param libraryTypeLookup The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDeleteNonstrict(LdLibraryTypeLookup libraryTypeLookup, DeleteOption<LdLibraryTypeLookupCB> option) {
        assertDeleteOptionNotNull(option);
        doDeleteNonstrict(libraryTypeLookup, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param libraryTypeLookupList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<LdLibraryTypeLookup> libraryTypeLookupList, InsertOption<LdLibraryTypeLookupCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(libraryTypeLookupList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param libraryTypeLookupList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<LdLibraryTypeLookup> libraryTypeLookupList, UpdateOption<LdLibraryTypeLookupCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(libraryTypeLookupList, option);
    }

    /**
     * Batch-update the list with varying requests non-strictly. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param libraryTypeLookupList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdateNonstrict(List<LdLibraryTypeLookup> libraryTypeLookupList, UpdateOption<LdLibraryTypeLookupCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdateNonstrict(libraryTypeLookupList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param libraryTypeLookupList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<LdLibraryTypeLookup> libraryTypeLookupList, DeleteOption<LdLibraryTypeLookupCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(libraryTypeLookupList, option);
    }

    /**
     * Batch-delete the list with varying requests non-strictly. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDeleteNonstrict(entityList).
     * @param libraryTypeLookupList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDeleteNonstrict(List<LdLibraryTypeLookup> libraryTypeLookupList, DeleteOption<LdLibraryTypeLookupCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDeleteNonstrict(libraryTypeLookupList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<LdLibraryTypeLookup, LdLibraryTypeLookupCB> setupper, InsertOption<LdLibraryTypeLookupCB> option) {
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
     * LdLibraryTypeLookup libraryTypeLookup = new LdLibraryTypeLookup();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//libraryTypeLookup.setPK...(value);</span>
     * libraryTypeLookup.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//libraryTypeLookup.setVersionNo(value);</span>
     * LdLibraryTypeLookupCB cb = new LdLibraryTypeLookupCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;LdLibraryTypeLookupCB&gt; option = new UpdateOption&lt;LdLibraryTypeLookupCB&gt;();
     * option.self(new SpecifyQuery&lt;LdLibraryTypeLookupCB&gt;() {
     *     public void specify(LdLibraryTypeLookupCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * libraryTypeLookupBhv.<span style="color: #DD4747">varyingQueryUpdate</span>(libraryTypeLookup, cb, option);
     * </pre>
     * @param libraryTypeLookup The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of LdLibraryTypeLookup. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(LdLibraryTypeLookup libraryTypeLookup, LdLibraryTypeLookupCB cb, UpdateOption<LdLibraryTypeLookupCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(libraryTypeLookup, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of LdLibraryTypeLookup. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(LdLibraryTypeLookupCB cb, DeleteOption<LdLibraryTypeLookupCB> option) {
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
    public OutsideSqlBasicExecutor<LdLibraryTypeLookupBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                Optimistic Lock Info
    //                                                                ====================
    @Override
    protected boolean hasUpdateDateValue(Entity et) { return downcast(et).getUTimestamp() != null; }

    // ===================================================================================
    //                                                                         Type Helper
    //                                                                         ===========
    protected Class<? extends LdLibraryTypeLookup> typeOfSelectedEntity() { return LdLibraryTypeLookup.class; }
    protected Class<LdLibraryTypeLookup> typeOfHandlingEntity() { return LdLibraryTypeLookup.class; }
    protected Class<LdLibraryTypeLookupCB> typeOfHandlingConditionBean() { return LdLibraryTypeLookupCB.class; }
}
