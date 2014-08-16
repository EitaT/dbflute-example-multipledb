/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */package com.example.dbflute.multipledb.seasar.dbflute.librarydb.bsbhv;

import java.util.List;

import org.seasar.dbflute.*;
import org.seasar.dbflute.bhv.*;
import org.seasar.dbflute.cbean.*;
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
 * The behavior of LIBRARY as TABLE. <br />
 * <pre>
 * [primary key]
 *     LIBRARY_ID
 *
 * [column]
 *     LIBRARY_ID, LIBRARY_NAME, LIBRARY_TYPE_CODE, R_USER, R_MODULE, R_TIMESTAMP, U_USER, U_MODULE, U_TIMESTAMP
 *
 * [sequence]
 *     
 *
 * [identity]
 *     LIBRARY_ID
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     LIBRARY_TYPE_LOOKUP
 *
 * [referrer table]
 *     COLLECTION, LIBRARY_USER, NEXT_LIBRARY
 *
 * [foreign property]
 *     libraryTypeLookup
 *
 * [referrer property]
 *     collectionList, libraryUserList, nextLibraryByLibraryIdList, nextLibraryByNextLibraryIdList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class LdBsLibraryBhv extends AbstractBehaviorWritable<LdLibrary, LdLibraryCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** {@inheritDoc} */
    public DBMeta getDBMeta() { return LdLibraryDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public LdLibraryDbm getMyDBMeta() { return LdLibraryDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public LdLibraryCB newConditionBean() { return new LdLibraryCB(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public LdLibrary newMyEntity() { return new LdLibrary(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public LdLibraryCB newMyConditionBean() { return new LdLibraryCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * LdLibraryCB cb = new LdLibraryCB();
     * cb.query().setFoo...(value);
     * int count = libraryBhv.<span style="color: #DD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of LdLibrary. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(LdLibraryCB cb) {
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
     * LdLibraryCB cb = new LdLibraryCB();
     * cb.query().setFoo...(value);
     * LdLibrary library = libraryBhv.<span style="color: #DD4747">selectEntity</span>(cb);
     * if (library != null) { <span style="color: #3F7E5E">// null check</span>
     *     ... = library.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of LdLibrary. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public LdLibrary selectEntity(LdLibraryCB cb) {
        return facadeSelectEntity(cb);
    }

    protected LdLibrary facadeSelectEntity(LdLibraryCB cb) {
        return doSelectEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends LdLibrary> OptionalEntity<ENTITY> doSelectOptionalEntity(LdLibraryCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)); }

    /**
     * Select the entity by the condition-bean with deleted check. <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, this method is good.</span>
     * <pre>
     * LdLibraryCB cb = new LdLibraryCB();
     * cb.query().setFoo...(value);
     * LdLibrary library = libraryBhv.<span style="color: #DD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = library.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of LdLibrary. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public LdLibrary selectEntityWithDeletedCheck(LdLibraryCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param libraryId : PK, ID, NotNull, SMALLINT(5). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public LdLibrary selectByPKValue(Integer libraryId) {
        return facadeSelectByPKValue(libraryId);
    }

    protected LdLibrary facadeSelectByPKValue(Integer libraryId) {
        return doSelectByPK(libraryId, typeOfSelectedEntity());
    }

    protected <ENTITY extends LdLibrary> ENTITY doSelectByPK(Integer libraryId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(libraryId), tp);
    }

    protected <ENTITY extends LdLibrary> OptionalEntity<ENTITY> doSelectOptionalByPK(Integer libraryId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(libraryId, tp), libraryId);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param libraryId : PK, ID, NotNull, SMALLINT(5). (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public LdLibrary selectByPKValueWithDeletedCheck(Integer libraryId) {
        return doSelectByPKWithDeletedCheck(libraryId, typeOfSelectedEntity());
    }

    protected <ENTITY extends LdLibrary> ENTITY doSelectByPKWithDeletedCheck(Integer libraryId, Class<ENTITY> tp) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(libraryId), tp);
    }

    protected LdLibraryCB xprepareCBAsPK(Integer libraryId) {
        assertObjectNotNull("libraryId", libraryId);
        return newConditionBean().acceptPK(libraryId);
    }

    /**
     * Select the entity by the unique-key value.
     * @param libraryName : UQ, NotNull, VARCHAR(80). (NotNull)
     * @return The optional entity selected by the unique key. (NotNull: if no data, empty entity)
     * @exception EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<LdLibrary> selectByUniqueOf(String libraryName) {
        return facadeSelectByUniqueOf(libraryName);
    }

    protected OptionalEntity<LdLibrary> facadeSelectByUniqueOf(String libraryName) {
        return doSelectByUniqueOf(libraryName, typeOfSelectedEntity());
    }

    protected <ENTITY extends LdLibrary> OptionalEntity<ENTITY> doSelectByUniqueOf(String libraryName, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(xprepareCBAsUniqueOf(libraryName), tp), libraryName);
    }

    protected LdLibraryCB xprepareCBAsUniqueOf(String libraryName) {
        assertObjectNotNull("libraryName", libraryName);
        return newConditionBean().acceptUniqueOf(libraryName);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * LdLibraryCB cb = new LdLibraryCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;LdLibrary&gt; libraryList = libraryBhv.<span style="color: #DD4747">selectList</span>(cb);
     * for (LdLibrary library : libraryList) {
     *     ... = library.get...();
     * }
     * </pre>
     * @param cb The condition-bean of LdLibrary. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<LdLibrary> selectList(LdLibraryCB cb) {
        return facadeSelectList(cb);
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br />
     * (both count-select and paging-select are executed)
     * <pre>
     * LdLibraryCB cb = new LdLibraryCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #DD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;LdLibrary&gt; page = libraryBhv.<span style="color: #DD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (LdLibrary library : page) {
     *     ... = library.get...();
     * }
     * </pre>
     * @param cb The condition-bean of LdLibrary. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<LdLibrary> selectPage(LdLibraryCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * LdLibraryCB cb = new LdLibraryCB();
     * cb.query().setFoo...(value);
     * libraryBhv.<span style="color: #DD4747">selectCursor</span>(cb, new EntityRowHandler&lt;LdLibrary&gt;() {
     *     public void handle(LdLibrary entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of LdLibrary. (NotNull)
     * @param entityRowHandler The handler of entity row of LdLibrary. (NotNull)
     */
    public void selectCursor(LdLibraryCB cb, EntityRowHandler<LdLibrary> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * libraryBhv.<span style="color: #DD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(LdLibraryCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<LdLibraryCB, RESULT> scalarSelect(Class<RESULT> resultType) {
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
     * @param libraryList The entity list of library. (NotNull)
     * @param handler The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<LdLibrary> libraryList, ReferrerLoaderHandler<LdLoaderOfLibrary> handler) {
        xassLRArg(libraryList, handler);
        handler.handle(new LdLoaderOfLibrary().ready(libraryList, _behaviorSelector));
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
     * @param library The entity of library. (NotNull)
     * @param handler The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(LdLibrary library, ReferrerLoaderHandler<LdLoaderOfLibrary> handler) {
        xassLRArg(library, handler);
        handler.handle(new LdLoaderOfLibrary().ready(xnewLRAryLs(library), _behaviorSelector));
    }

    /**
     * Load referrer of collectionList by the set-upper of referrer. <br />
     * COLLECTION by LIBRARY_ID, named 'collectionList'.
     * <pre>
     * libraryBhv.<span style="color: #DD4747">loadCollectionList</span>(libraryList, new ConditionBeanSetupper&lt;LdCollectionCB&gt;() {
     *     public void setup(LdCollectionCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...();
     *     }
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedList(referrerList -&gt {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * for (LdLibrary library : libraryList) {
     *     ... = library.<span style="color: #DD4747">getCollectionList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setLibraryId_InScope(pkList);
     * cb.query().addOrderBy_LibraryId_Asc();
     * </pre>
     * @param libraryList The entity list of library. (NotNull)
     * @param setupper The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<LdCollection> loadCollectionList(List<LdLibrary> libraryList, ConditionBeanSetupper<LdCollectionCB> setupper) {
        xassLRArg(libraryList, setupper);
        return doLoadCollectionList(libraryList, new LoadReferrerOption<LdCollectionCB, LdCollection>().xinit(setupper));
    }

    /**
     * Load referrer of collectionList by the set-upper of referrer. <br />
     * COLLECTION by LIBRARY_ID, named 'collectionList'.
     * <pre>
     * libraryBhv.<span style="color: #DD4747">loadCollectionList</span>(libraryList, new ConditionBeanSetupper&lt;LdCollectionCB&gt;() {
     *     public void setup(LdCollectionCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...();
     *     }
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedList(referrerList -&gt {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = library.<span style="color: #DD4747">getCollectionList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setLibraryId_InScope(pkList);
     * cb.query().addOrderBy_LibraryId_Asc();
     * </pre>
     * @param library The entity of library. (NotNull)
     * @param setupper The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<LdCollection> loadCollectionList(LdLibrary library, ConditionBeanSetupper<LdCollectionCB> setupper) {
        xassLRArg(library, setupper);
        return doLoadCollectionList(xnewLRLs(library), new LoadReferrerOption<LdCollectionCB, LdCollection>().xinit(setupper));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param library The entity of library. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<LdCollection> loadCollectionList(LdLibrary library, LoadReferrerOption<LdCollectionCB, LdCollection> loadReferrerOption) {
        xassLRArg(library, loadReferrerOption);
        return loadCollectionList(xnewLRLs(library), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param libraryList The entity list of library. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<LdCollection> loadCollectionList(List<LdLibrary> libraryList, LoadReferrerOption<LdCollectionCB, LdCollection> loadReferrerOption) {
        xassLRArg(libraryList, loadReferrerOption);
        if (libraryList.isEmpty()) { return (NestedReferrerListGateway<LdCollection>)EMPTY_NREF_LGWAY; }
        return doLoadCollectionList(libraryList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<LdCollection> doLoadCollectionList(List<LdLibrary> libraryList, LoadReferrerOption<LdCollectionCB, LdCollection> option) {
        return helpLoadReferrerInternally(libraryList, option, "collectionList");
    }

    /**
     * Load referrer of libraryUserList by the set-upper of referrer. <br />
     * LIBRARY_USER by LIBRARY_ID, named 'libraryUserList'.
     * <pre>
     * libraryBhv.<span style="color: #DD4747">loadLibraryUserList</span>(libraryList, new ConditionBeanSetupper&lt;LdLibraryUserCB&gt;() {
     *     public void setup(LdLibraryUserCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...();
     *     }
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedList(referrerList -&gt {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * for (LdLibrary library : libraryList) {
     *     ... = library.<span style="color: #DD4747">getLibraryUserList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setLibraryId_InScope(pkList);
     * cb.query().addOrderBy_LibraryId_Asc();
     * </pre>
     * @param libraryList The entity list of library. (NotNull)
     * @param setupper The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<LdLibraryUser> loadLibraryUserList(List<LdLibrary> libraryList, ConditionBeanSetupper<LdLibraryUserCB> setupper) {
        xassLRArg(libraryList, setupper);
        return doLoadLibraryUserList(libraryList, new LoadReferrerOption<LdLibraryUserCB, LdLibraryUser>().xinit(setupper));
    }

    /**
     * Load referrer of libraryUserList by the set-upper of referrer. <br />
     * LIBRARY_USER by LIBRARY_ID, named 'libraryUserList'.
     * <pre>
     * libraryBhv.<span style="color: #DD4747">loadLibraryUserList</span>(libraryList, new ConditionBeanSetupper&lt;LdLibraryUserCB&gt;() {
     *     public void setup(LdLibraryUserCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...();
     *     }
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedList(referrerList -&gt {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = library.<span style="color: #DD4747">getLibraryUserList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setLibraryId_InScope(pkList);
     * cb.query().addOrderBy_LibraryId_Asc();
     * </pre>
     * @param library The entity of library. (NotNull)
     * @param setupper The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<LdLibraryUser> loadLibraryUserList(LdLibrary library, ConditionBeanSetupper<LdLibraryUserCB> setupper) {
        xassLRArg(library, setupper);
        return doLoadLibraryUserList(xnewLRLs(library), new LoadReferrerOption<LdLibraryUserCB, LdLibraryUser>().xinit(setupper));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param library The entity of library. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<LdLibraryUser> loadLibraryUserList(LdLibrary library, LoadReferrerOption<LdLibraryUserCB, LdLibraryUser> loadReferrerOption) {
        xassLRArg(library, loadReferrerOption);
        return loadLibraryUserList(xnewLRLs(library), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param libraryList The entity list of library. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<LdLibraryUser> loadLibraryUserList(List<LdLibrary> libraryList, LoadReferrerOption<LdLibraryUserCB, LdLibraryUser> loadReferrerOption) {
        xassLRArg(libraryList, loadReferrerOption);
        if (libraryList.isEmpty()) { return (NestedReferrerListGateway<LdLibraryUser>)EMPTY_NREF_LGWAY; }
        return doLoadLibraryUserList(libraryList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<LdLibraryUser> doLoadLibraryUserList(List<LdLibrary> libraryList, LoadReferrerOption<LdLibraryUserCB, LdLibraryUser> option) {
        return helpLoadReferrerInternally(libraryList, option, "libraryUserList");
    }

    /**
     * Load referrer of nextLibraryByLibraryIdList by the set-upper of referrer. <br />
     * NEXT_LIBRARY by LIBRARY_ID, named 'nextLibraryByLibraryIdList'.
     * <pre>
     * libraryBhv.<span style="color: #DD4747">loadNextLibraryByLibraryIdList</span>(libraryList, new ConditionBeanSetupper&lt;LdNextLibraryCB&gt;() {
     *     public void setup(LdNextLibraryCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...();
     *     }
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedList(referrerList -&gt {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * for (LdLibrary library : libraryList) {
     *     ... = library.<span style="color: #DD4747">getNextLibraryByLibraryIdList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setLibraryId_InScope(pkList);
     * cb.query().addOrderBy_LibraryId_Asc();
     * </pre>
     * @param libraryList The entity list of library. (NotNull)
     * @param setupper The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<LdNextLibrary> loadNextLibraryByLibraryIdList(List<LdLibrary> libraryList, ConditionBeanSetupper<LdNextLibraryCB> setupper) {
        xassLRArg(libraryList, setupper);
        return doLoadNextLibraryByLibraryIdList(libraryList, new LoadReferrerOption<LdNextLibraryCB, LdNextLibrary>().xinit(setupper));
    }

    /**
     * Load referrer of nextLibraryByLibraryIdList by the set-upper of referrer. <br />
     * NEXT_LIBRARY by LIBRARY_ID, named 'nextLibraryByLibraryIdList'.
     * <pre>
     * libraryBhv.<span style="color: #DD4747">loadNextLibraryByLibraryIdList</span>(libraryList, new ConditionBeanSetupper&lt;LdNextLibraryCB&gt;() {
     *     public void setup(LdNextLibraryCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...();
     *     }
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedList(referrerList -&gt {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = library.<span style="color: #DD4747">getNextLibraryByLibraryIdList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setLibraryId_InScope(pkList);
     * cb.query().addOrderBy_LibraryId_Asc();
     * </pre>
     * @param library The entity of library. (NotNull)
     * @param setupper The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<LdNextLibrary> loadNextLibraryByLibraryIdList(LdLibrary library, ConditionBeanSetupper<LdNextLibraryCB> setupper) {
        xassLRArg(library, setupper);
        return doLoadNextLibraryByLibraryIdList(xnewLRLs(library), new LoadReferrerOption<LdNextLibraryCB, LdNextLibrary>().xinit(setupper));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param library The entity of library. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<LdNextLibrary> loadNextLibraryByLibraryIdList(LdLibrary library, LoadReferrerOption<LdNextLibraryCB, LdNextLibrary> loadReferrerOption) {
        xassLRArg(library, loadReferrerOption);
        return loadNextLibraryByLibraryIdList(xnewLRLs(library), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param libraryList The entity list of library. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<LdNextLibrary> loadNextLibraryByLibraryIdList(List<LdLibrary> libraryList, LoadReferrerOption<LdNextLibraryCB, LdNextLibrary> loadReferrerOption) {
        xassLRArg(libraryList, loadReferrerOption);
        if (libraryList.isEmpty()) { return (NestedReferrerListGateway<LdNextLibrary>)EMPTY_NREF_LGWAY; }
        return doLoadNextLibraryByLibraryIdList(libraryList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<LdNextLibrary> doLoadNextLibraryByLibraryIdList(List<LdLibrary> libraryList, LoadReferrerOption<LdNextLibraryCB, LdNextLibrary> option) {
        return helpLoadReferrerInternally(libraryList, option, "nextLibraryByLibraryIdList");
    }

    /**
     * Load referrer of nextLibraryByNextLibraryIdList by the set-upper of referrer. <br />
     * NEXT_LIBRARY by NEXT_LIBRARY_ID, named 'nextLibraryByNextLibraryIdList'.
     * <pre>
     * libraryBhv.<span style="color: #DD4747">loadNextLibraryByNextLibraryIdList</span>(libraryList, new ConditionBeanSetupper&lt;LdNextLibraryCB&gt;() {
     *     public void setup(LdNextLibraryCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...();
     *     }
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedList(referrerList -&gt {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * for (LdLibrary library : libraryList) {
     *     ... = library.<span style="color: #DD4747">getNextLibraryByNextLibraryIdList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setNextLibraryId_InScope(pkList);
     * cb.query().addOrderBy_NextLibraryId_Asc();
     * </pre>
     * @param libraryList The entity list of library. (NotNull)
     * @param setupper The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<LdNextLibrary> loadNextLibraryByNextLibraryIdList(List<LdLibrary> libraryList, ConditionBeanSetupper<LdNextLibraryCB> setupper) {
        xassLRArg(libraryList, setupper);
        return doLoadNextLibraryByNextLibraryIdList(libraryList, new LoadReferrerOption<LdNextLibraryCB, LdNextLibrary>().xinit(setupper));
    }

    /**
     * Load referrer of nextLibraryByNextLibraryIdList by the set-upper of referrer. <br />
     * NEXT_LIBRARY by NEXT_LIBRARY_ID, named 'nextLibraryByNextLibraryIdList'.
     * <pre>
     * libraryBhv.<span style="color: #DD4747">loadNextLibraryByNextLibraryIdList</span>(libraryList, new ConditionBeanSetupper&lt;LdNextLibraryCB&gt;() {
     *     public void setup(LdNextLibraryCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...();
     *     }
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedList(referrerList -&gt {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = library.<span style="color: #DD4747">getNextLibraryByNextLibraryIdList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setNextLibraryId_InScope(pkList);
     * cb.query().addOrderBy_NextLibraryId_Asc();
     * </pre>
     * @param library The entity of library. (NotNull)
     * @param setupper The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<LdNextLibrary> loadNextLibraryByNextLibraryIdList(LdLibrary library, ConditionBeanSetupper<LdNextLibraryCB> setupper) {
        xassLRArg(library, setupper);
        return doLoadNextLibraryByNextLibraryIdList(xnewLRLs(library), new LoadReferrerOption<LdNextLibraryCB, LdNextLibrary>().xinit(setupper));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param library The entity of library. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<LdNextLibrary> loadNextLibraryByNextLibraryIdList(LdLibrary library, LoadReferrerOption<LdNextLibraryCB, LdNextLibrary> loadReferrerOption) {
        xassLRArg(library, loadReferrerOption);
        return loadNextLibraryByNextLibraryIdList(xnewLRLs(library), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param libraryList The entity list of library. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<LdNextLibrary> loadNextLibraryByNextLibraryIdList(List<LdLibrary> libraryList, LoadReferrerOption<LdNextLibraryCB, LdNextLibrary> loadReferrerOption) {
        xassLRArg(libraryList, loadReferrerOption);
        if (libraryList.isEmpty()) { return (NestedReferrerListGateway<LdNextLibrary>)EMPTY_NREF_LGWAY; }
        return doLoadNextLibraryByNextLibraryIdList(libraryList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<LdNextLibrary> doLoadNextLibraryByNextLibraryIdList(List<LdLibrary> libraryList, LoadReferrerOption<LdNextLibraryCB, LdNextLibrary> option) {
        return helpLoadReferrerInternally(libraryList, option, "nextLibraryByNextLibraryIdList");
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'LdLibraryTypeLookup'.
     * @param libraryList The list of library. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<LdLibraryTypeLookup> pulloutLibraryTypeLookup(List<LdLibrary> libraryList)
    { return helpPulloutInternally(libraryList, "libraryTypeLookup"); }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key libraryId.
     * @param libraryList The list of library. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Integer> extractLibraryIdList(List<LdLibrary> libraryList)
    { return helpExtractListInternally(libraryList, "libraryId"); }

    /**
     * Extract the value list of (single) unique key libraryName.
     * @param libraryList The list of library. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<String> extractLibraryNameList(List<LdLibrary> libraryList)
    { return helpExtractListInternally(libraryList, "libraryName"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * LdLibrary library = new LdLibrary();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * library.setFoo...(value);
     * library.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//library.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//library.set...;</span>
     * libraryBhv.<span style="color: #DD4747">insert</span>(library);
     * ... = library.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param library The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(LdLibrary library) {
        doInsert(library, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, ExclusiveControl)
     * <pre>
     * LdLibrary library = new LdLibrary();
     * library.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * library.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//library.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//library.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * library.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     libraryBhv.<span style="color: #DD4747">update</span>(library);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param library The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @exception EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(LdLibrary library) {
        doUpdate(library, null);
    }

    /**
     * Update the entity non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * LdLibrary library = new LdLibrary();
     * library.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * library.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//library.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//library.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//library.setVersionNo(value);</span>
     * libraryBhv.<span style="color: #DD4747">updateNonstrict</span>(library);
     * </pre>
     * @param library The entity of update. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void updateNonstrict(LdLibrary library) {
        doUpdateNonstrict(library, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, ExclusiveControl) <br />
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br />
     * <p><span style="color: #DD4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param library The entity of insert or update. (NotNull, ...depends on insert or update)
     * @exception EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(LdLibrary library) {
        doInsertOrUpdate(library, null, null);
    }

    /**
     * Insert or update the entity non-strictly modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br />
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() }
     * <p><span style="color: #DD4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param library The entity of insert or update. (NotNull, ...depends on insert or update)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdateNonstrict(LdLibrary library) {
        doInsertOrUpdateNonstrict(library, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, ExclusiveControl)
     * <pre>
     * LdLibrary library = new LdLibrary();
     * library.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * library.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     libraryBhv.<span style="color: #DD4747">delete</span>(library);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param library The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @exception EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(LdLibrary library) {
        doDelete(library, null);
    }

    /**
     * Delete the entity non-strictly. {ZeroUpdateException, NonExclusiveControl}
     * <pre>
     * LdLibrary library = new LdLibrary();
     * library.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//library.setVersionNo(value);</span>
     * libraryBhv.<span style="color: #DD4747">deleteNonstrict</span>(library);
     * </pre>
     * @param library The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrict(LdLibrary library) {
        doDeleteNonstrict(library, null);
    }

    /**
     * Delete the entity non-strictly ignoring deleted. {ZeroUpdateException, NonExclusiveControl}
     * <pre>
     * LdLibrary library = new LdLibrary();
     * library.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//library.setVersionNo(value);</span>
     * libraryBhv.<span style="color: #DD4747">deleteNonstrictIgnoreDeleted</span>(library);
     * <span style="color: #3F7E5E">// if the target entity doesn't exist, no exception</span>
     * </pre>
     * @param library The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrictIgnoreDeleted(LdLibrary library) {
        doDeleteNonstrictIgnoreDeleted(library, null);
    }

    protected void doDeleteNonstrictIgnoreDeleted(LdLibrary et, final DeleteOption<LdLibraryCB> op) {
        assertObjectNotNull("library", et); prepareDeleteOption(op); helpDeleteNonstrictIgnoreDeletedInternally(et, op);
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
     *     LdLibrary library = new LdLibrary();
     *     library.setFooName("foo");
     *     if (...) {
     *         library.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     libraryList.add(library);
     * }
     * libraryBhv.<span style="color: #DD4747">batchInsert</span>(libraryList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param libraryList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<LdLibrary> libraryList) {
        return doBatchInsert(libraryList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (ExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <span style="color: #DD4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     LdLibrary library = new LdLibrary();
     *     library.setFooName("foo");
     *     if (...) {
     *         library.setFooPrice(123);
     *     } else {
     *         library.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//library.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     libraryList.add(library);
     * }
     * libraryBhv.<span style="color: #DD4747">batchUpdate</span>(libraryList);
     * </pre>
     * @param libraryList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<LdLibrary> libraryList) {
        return doBatchUpdate(libraryList, null);
    }

    /**
     * Batch-update the entity list specified-only. (ExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * libraryBhv.<span style="color: #DD4747">batchUpdate</span>(libraryList, new SpecifyQuery<LdLibraryCB>() {
     *     public void specify(LdLibraryCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #DD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #DD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * libraryBhv.<span style="color: #DD4747">batchUpdate</span>(libraryList, new SpecifyQuery<LdLibraryCB>() {
     *     public void specify(LdLibraryCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #DD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param libraryList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<LdLibrary> libraryList, SpecifyQuery<LdLibraryCB> updateColumnSpec) {
        return doBatchUpdate(libraryList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    /**
     * Batch-update the entity list non-strictly modified-only of same-set columns. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <span style="color: #DD4747; font-size: 140%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     LdLibrary library = new LdLibrary();
     *     library.setFooName("foo");
     *     if (...) {
     *         library.setFooPrice(123);
     *     } else {
     *         library.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//library.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     libraryList.add(library);
     * }
     * libraryBhv.<span style="color: #DD4747">batchUpdate</span>(libraryList);
     * </pre>
     * @param libraryList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<LdLibrary> libraryList) {
        return doBatchUpdateNonstrict(libraryList, null);
    }

    /**
     * Batch-update the entity list non-strictly specified-only. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * libraryBhv.<span style="color: #DD4747">batchUpdateNonstrict</span>(libraryList, new SpecifyQuery<LdLibraryCB>() {
     *     public void specify(LdLibraryCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #DD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #DD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * libraryBhv.<span style="color: #DD4747">batchUpdateNonstrict</span>(libraryList, new SpecifyQuery<LdLibraryCB>() {
     *     public void specify(LdLibraryCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #DD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).</p>
     * @param libraryList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<LdLibrary> libraryList, SpecifyQuery<LdLibraryCB> updateColumnSpec) {
        return doBatchUpdateNonstrict(libraryList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    /**
     * Batch-delete the entity list. (ExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param libraryList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchDelete(List<LdLibrary> libraryList) {
        return doBatchDelete(libraryList, null);
    }

    /**
     * Batch-delete the entity list non-strictly. {NonExclusiveControl} <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param libraryList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDeleteNonstrict(List<LdLibrary> libraryList) {
        return doBatchDeleteNonstrict(libraryList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * libraryBhv.<span style="color: #DD4747">queryInsert</span>(new QueryInsertSetupper&lt;LdLibrary, LdLibraryCB&gt;() {
     *     public ConditionBean setup(LdLibrary entity, LdLibraryCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<LdLibrary, LdLibraryCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * LdLibrary library = new LdLibrary();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//library.setPK...(value);</span>
     * library.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//library.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//library.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//library.setVersionNo(value);</span>
     * LdLibraryCB cb = new LdLibraryCB();
     * cb.query().setFoo...(value);
     * libraryBhv.<span style="color: #DD4747">queryUpdate</span>(library, cb);
     * </pre>
     * @param library The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of LdLibrary. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(LdLibrary library, LdLibraryCB cb) {
        return doQueryUpdate(library, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * LdLibraryCB cb = new LdLibraryCB();
     * cb.query().setFoo...(value);
     * libraryBhv.<span style="color: #DD4747">queryDelete</span>(library, cb);
     * </pre>
     * @param cb The condition-bean of LdLibrary. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(LdLibraryCB cb) {
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
     * LdLibrary library = new LdLibrary();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * library.setFoo...(value);
     * library.setBar...(value);
     * InsertOption<LdLibraryCB> option = new InsertOption<LdLibraryCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * libraryBhv.<span style="color: #DD4747">varyingInsert</span>(library, option);
     * ... = library.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param library The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(LdLibrary library, InsertOption<LdLibraryCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(library, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, ExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * LdLibrary library = new LdLibrary();
     * library.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * library.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * library.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;LdLibraryCB&gt; option = new UpdateOption&lt;LdLibraryCB&gt;();
     *     option.self(new SpecifyQuery&lt;LdLibraryCB&gt;() {
     *         public void specify(LdLibraryCB cb) {
     *             cb.specify().<span style="color: #DD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     libraryBhv.<span style="color: #DD4747">varyingUpdate</span>(library, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param library The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(LdLibrary library, UpdateOption<LdLibraryCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(library, option);
    }

    /**
     * Update the entity with varying requests non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as updateNonstrict(entity).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * LdLibrary library = new LdLibrary();
     * library.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * library.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//library.setVersionNo(value);</span>
     * UpdateOption&lt;LdLibraryCB&gt; option = new UpdateOption&lt;LdLibraryCB&gt;();
     * option.self(new SpecifyQuery&lt;LdLibraryCB&gt;() {
     *     public void specify(LdLibraryCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * libraryBhv.<span style="color: #DD4747">varyingUpdateNonstrict</span>(library, option);
     * </pre>
     * @param library The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdateNonstrict(LdLibrary library, UpdateOption<LdLibraryCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdateNonstrict(library, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param library The entity of insert or update. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(LdLibrary library, InsertOption<LdLibraryCB> insertOption, UpdateOption<LdLibraryCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInsertOrUpdate(library, insertOption, updateOption);
    }

    /**
     * Insert or update the entity with varying requests non-strictly. (NonExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdateNonstrict(entity).
     * @param library The entity of insert or update. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdateNonstrict(LdLibrary library, InsertOption<LdLibraryCB> insertOption, UpdateOption<LdLibraryCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInsertOrUpdateNonstrict(library, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, ExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param library The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(LdLibrary library, DeleteOption<LdLibraryCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(library, option);
    }

    /**
     * Delete the entity with varying requests non-strictly. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as deleteNonstrict(entity).
     * @param library The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDeleteNonstrict(LdLibrary library, DeleteOption<LdLibraryCB> option) {
        assertDeleteOptionNotNull(option);
        doDeleteNonstrict(library, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param libraryList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<LdLibrary> libraryList, InsertOption<LdLibraryCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(libraryList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param libraryList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<LdLibrary> libraryList, UpdateOption<LdLibraryCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(libraryList, option);
    }

    /**
     * Batch-update the list with varying requests non-strictly. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param libraryList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdateNonstrict(List<LdLibrary> libraryList, UpdateOption<LdLibraryCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdateNonstrict(libraryList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param libraryList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<LdLibrary> libraryList, DeleteOption<LdLibraryCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(libraryList, option);
    }

    /**
     * Batch-delete the list with varying requests non-strictly. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDeleteNonstrict(entityList).
     * @param libraryList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDeleteNonstrict(List<LdLibrary> libraryList, DeleteOption<LdLibraryCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDeleteNonstrict(libraryList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<LdLibrary, LdLibraryCB> setupper, InsertOption<LdLibraryCB> option) {
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
     * LdLibrary library = new LdLibrary();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//library.setPK...(value);</span>
     * library.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//library.setVersionNo(value);</span>
     * LdLibraryCB cb = new LdLibraryCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;LdLibraryCB&gt; option = new UpdateOption&lt;LdLibraryCB&gt;();
     * option.self(new SpecifyQuery&lt;LdLibraryCB&gt;() {
     *     public void specify(LdLibraryCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * libraryBhv.<span style="color: #DD4747">varyingQueryUpdate</span>(library, cb, option);
     * </pre>
     * @param library The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of LdLibrary. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(LdLibrary library, LdLibraryCB cb, UpdateOption<LdLibraryCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(library, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of LdLibrary. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(LdLibraryCB cb, DeleteOption<LdLibraryCB> option) {
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
    public OutsideSqlBasicExecutor<LdLibraryBhv> outsideSql() {
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
    protected Class<? extends LdLibrary> typeOfSelectedEntity() { return LdLibrary.class; }
    protected Class<LdLibrary> typeOfHandlingEntity() { return LdLibrary.class; }
    protected Class<LdLibraryCB> typeOfHandlingConditionBean() { return LdLibraryCB.class; }
}
