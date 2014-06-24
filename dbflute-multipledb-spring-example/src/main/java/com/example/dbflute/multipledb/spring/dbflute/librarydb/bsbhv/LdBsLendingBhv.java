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
 * The behavior of LENDING as TABLE. <br />
 * <pre>
 * [primary key]
 *     LIBRARY_ID, LB_USER_ID, LENDING_DATE
 *
 * [column]
 *     LIBRARY_ID, LB_USER_ID, LENDING_DATE, R_USER, R_MODULE, R_TIMESTAMP, U_USER, U_MODULE, U_TIMESTAMP
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
 *     LIBRARY_USER
 *
 * [referrer table]
 *     LENDING_COLLECTION
 *
 * [foreign property]
 *     libraryUser
 *
 * [referrer property]
 *     lendingCollectionList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class LdBsLendingBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "LENDING"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** {@inheritDoc} */
    public DBMeta getDBMeta() { return LdLendingDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public LdLendingDbm getMyDBMeta() { return LdLendingDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public LdLending newEntity() { return new LdLending(); }

    /** {@inheritDoc} */
    public LdLendingCB newConditionBean() { return new LdLendingCB(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public LdLending newMyEntity() { return new LdLending(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public LdLendingCB newMyConditionBean() { return new LdLendingCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * LdLendingCB cb = new LdLendingCB();
     * cb.query().setFoo...(value);
     * int count = lendingBhv.<span style="color: #DD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of LdLending. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(LdLendingCB cb) {
        return facadeSelectCount(cb);
    }

    protected int facadeSelectCount(LdLendingCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(LdLendingCB cb) { // called by selectCount(cb)
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(LdLendingCB cb) { // called by selectPage(cb)
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
     * LdLendingCB cb = new LdLendingCB();
     * cb.query().setFoo...(value);
     * LdLending lending = lendingBhv.<span style="color: #DD4747">selectEntity</span>(cb);
     * if (lending != null) { <span style="color: #3F7E5E">// null check</span>
     *     ... = lending.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of LdLending. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public LdLending selectEntity(LdLendingCB cb) {
        return facadeSelectEntity(cb);
    }

    protected LdLending facadeSelectEntity(LdLendingCB cb) {
        return doSelectEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends LdLending> ENTITY doSelectEntity(LdLendingCB cb, Class<ENTITY> tp) {
        return helpSelectEntityInternally(cb, tp);
    }

    protected <ENTITY extends LdLending> OptionalEntity<ENTITY> doSelectOptionalEntity(LdLendingCB cb, Class<ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)); }

    /**
     * Select the entity by the condition-bean with deleted check. <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, this method is good.</span>
     * <pre>
     * LdLendingCB cb = new LdLendingCB();
     * cb.query().setFoo...(value);
     * LdLending lending = lendingBhv.<span style="color: #DD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = lending.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of LdLending. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public LdLending selectEntityWithDeletedCheck(LdLendingCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    protected LdLending facadeSelectEntityWithDeletedCheck(LdLendingCB cb) {
        return doSelectEntityWithDeletedCheck(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends LdLending> ENTITY doSelectEntityWithDeletedCheck(LdLendingCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectEntityWithDeletedCheckInternally(cb, tp);
    }

    protected Entity doReadEntityWithDeletedCheck(ConditionBean cb) { return facadeSelectEntityWithDeletedCheck(downcast(cb)); }

    /**
     * Select the entity by the primary-key value.
     * @param libraryId : PK, IX+, NotNull, SMALLINT(5), FK to LIBRARY_USER. (NotNull)
     * @param lbUserId : PK, NotNull, INTEGER(10), FK to LIBRARY_USER. (NotNull)
     * @param lendingDate : PK, NotNull, TIMESTAMP(26, 6). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public LdLending selectByPKValue(Integer libraryId, Integer lbUserId, java.sql.Timestamp lendingDate) {
        return facadeSelectByPKValue(libraryId, lbUserId, lendingDate);
    }

    protected LdLending facadeSelectByPKValue(Integer libraryId, Integer lbUserId, java.sql.Timestamp lendingDate) {
        return doSelectByPK(libraryId, lbUserId, lendingDate, typeOfSelectedEntity());
    }

    protected <ENTITY extends LdLending> ENTITY doSelectByPK(Integer libraryId, Integer lbUserId, java.sql.Timestamp lendingDate, Class<ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(libraryId, lbUserId, lendingDate), tp);
    }

    protected <ENTITY extends LdLending> OptionalEntity<ENTITY> doSelectOptionalByPK(Integer libraryId, Integer lbUserId, java.sql.Timestamp lendingDate, Class<ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(libraryId, lbUserId, lendingDate, tp), libraryId, lbUserId, lendingDate);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param libraryId : PK, IX+, NotNull, SMALLINT(5), FK to LIBRARY_USER. (NotNull)
     * @param lbUserId : PK, NotNull, INTEGER(10), FK to LIBRARY_USER. (NotNull)
     * @param lendingDate : PK, NotNull, TIMESTAMP(26, 6). (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public LdLending selectByPKValueWithDeletedCheck(Integer libraryId, Integer lbUserId, java.sql.Timestamp lendingDate) {
        return doSelectByPKWithDeletedCheck(libraryId, lbUserId, lendingDate, typeOfSelectedEntity());
    }

    protected <ENTITY extends LdLending> ENTITY doSelectByPKWithDeletedCheck(Integer libraryId, Integer lbUserId, java.sql.Timestamp lendingDate, Class<ENTITY> tp) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(libraryId, lbUserId, lendingDate), tp);
    }

    protected LdLendingCB xprepareCBAsPK(Integer libraryId, Integer lbUserId, java.sql.Timestamp lendingDate) {
        assertObjectNotNull("libraryId", libraryId);assertObjectNotNull("lbUserId", lbUserId);assertObjectNotNull("lendingDate", lendingDate);
        return newConditionBean().acceptPK(libraryId, lbUserId, lendingDate);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * LdLendingCB cb = new LdLendingCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;LdLending&gt; lendingList = lendingBhv.<span style="color: #DD4747">selectList</span>(cb);
     * for (LdLending lending : lendingList) {
     *     ... = lending.get...();
     * }
     * </pre>
     * @param cb The condition-bean of LdLending. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<LdLending> selectList(LdLendingCB cb) {
        return facadeSelectList(cb);
    }

    protected ListResultBean<LdLending> facadeSelectList(LdLendingCB cb) {
        return doSelectList(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends LdLending> ListResultBean<ENTITY> doSelectList(LdLendingCB cb, Class<ENTITY> tp) {
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
     * LdLendingCB cb = new LdLendingCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #DD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;LdLending&gt; page = lendingBhv.<span style="color: #DD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (LdLending lending : page) {
     *     ... = lending.get...();
     * }
     * </pre>
     * @param cb The condition-bean of LdLending. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<LdLending> selectPage(LdLendingCB cb) {
        return facadeSelectPage(cb);
    }

    protected PagingResultBean<LdLending> facadeSelectPage(LdLendingCB cb) {
        return doSelectPage(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends LdLending> PagingResultBean<ENTITY> doSelectPage(LdLendingCB cb, Class<ENTITY> tp) {
        return helpSelectPageInternally(cb, tp);
    }

    protected PagingResultBean<? extends Entity> doReadPage(ConditionBean cb) { return facadeSelectPage(downcast(cb)); }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * LdLendingCB cb = new LdLendingCB();
     * cb.query().setFoo...(value);
     * lendingBhv.<span style="color: #DD4747">selectCursor</span>(cb, new EntityRowHandler&lt;LdLending&gt;() {
     *     public void handle(LdLending entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of LdLending. (NotNull)
     * @param entityRowHandler The handler of entity row of LdLending. (NotNull)
     */
    public void selectCursor(LdLendingCB cb, EntityRowHandler<LdLending> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    protected void facadeSelectCursor(LdLendingCB cb, EntityRowHandler<LdLending> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, typeOfSelectedEntity());
    }

    protected <ENTITY extends LdLending> void doSelectCursor(LdLendingCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) {
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
     * lendingBhv.<span style="color: #DD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(LdLendingCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<LdLendingCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return facadeScalarSelect(resultType);
    }

    protected <RESULT> HpSLSFunction<LdLendingCB, RESULT> facadeScalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newConditionBean());
    }

    protected <RESULT, CB extends LdLendingCB> HpSLSFunction<CB, RESULT> doScalarSelect(final Class<RESULT> tp, final CB cb) {
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
     * @param lendingList The entity list of lending. (NotNull)
     * @param handler The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<LdLending> lendingList, ReferrerLoaderHandler<LdLoaderOfLending> handler) {
        xassLRArg(lendingList, handler);
        handler.handle(new LdLoaderOfLending().ready(lendingList, _behaviorSelector));
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
     * @param lending The entity of lending. (NotNull)
     * @param handler The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(LdLending lending, ReferrerLoaderHandler<LdLoaderOfLending> handler) {
        xassLRArg(lending, handler);
        handler.handle(new LdLoaderOfLending().ready(xnewLRAryLs(lending), _behaviorSelector));
    }

    /**
     * Load referrer of lendingCollectionList by the set-upper of referrer. <br />
     * LENDING_COLLECTION by LIBRARY_ID, LB_USER_ID, LENDING_DATE, named 'lendingCollectionList'.
     * <pre>
     * lendingBhv.<span style="color: #DD4747">loadLendingCollectionList</span>(lendingList, new ConditionBeanSetupper&lt;LdLendingCollectionCB&gt;() {
     *     public void setup(LdLendingCollectionCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...();
     *     }
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedList(referrerList -&gt {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * for (LdLending lending : lendingList) {
     *     ... = lending.<span style="color: #DD4747">getLendingCollectionList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().set[ForeignKey]_InScope(pkList);
     * cb.query().addOrderBy_[ForeignKey]_Asc();
     * </pre>
     * @param lendingList The entity list of lending. (NotNull)
     * @param setupper The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<LdLendingCollection> loadLendingCollectionList(List<LdLending> lendingList, ConditionBeanSetupper<LdLendingCollectionCB> setupper) {
        xassLRArg(lendingList, setupper);
        return doLoadLendingCollectionList(lendingList, new LoadReferrerOption<LdLendingCollectionCB, LdLendingCollection>().xinit(setupper));
    }

    /**
     * Load referrer of lendingCollectionList by the set-upper of referrer. <br />
     * LENDING_COLLECTION by LIBRARY_ID, LB_USER_ID, LENDING_DATE, named 'lendingCollectionList'.
     * <pre>
     * lendingBhv.<span style="color: #DD4747">loadLendingCollectionList</span>(lendingList, new ConditionBeanSetupper&lt;LdLendingCollectionCB&gt;() {
     *     public void setup(LdLendingCollectionCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...();
     *     }
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedList(referrerList -&gt {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = lending.<span style="color: #DD4747">getLendingCollectionList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().set[ForeignKey]_InScope(pkList);
     * cb.query().addOrderBy_[ForeignKey]_Asc();
     * </pre>
     * @param lending The entity of lending. (NotNull)
     * @param setupper The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<LdLendingCollection> loadLendingCollectionList(LdLending lending, ConditionBeanSetupper<LdLendingCollectionCB> setupper) {
        xassLRArg(lending, setupper);
        return doLoadLendingCollectionList(xnewLRLs(lending), new LoadReferrerOption<LdLendingCollectionCB, LdLendingCollection>().xinit(setupper));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param lending The entity of lending. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<LdLendingCollection> loadLendingCollectionList(LdLending lending, LoadReferrerOption<LdLendingCollectionCB, LdLendingCollection> loadReferrerOption) {
        xassLRArg(lending, loadReferrerOption);
        return loadLendingCollectionList(xnewLRLs(lending), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean setupper.} #beforejava8
     * @param lendingList The entity list of lending. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<LdLendingCollection> loadLendingCollectionList(List<LdLending> lendingList, LoadReferrerOption<LdLendingCollectionCB, LdLendingCollection> loadReferrerOption) {
        xassLRArg(lendingList, loadReferrerOption);
        if (lendingList.isEmpty()) { return (NestedReferrerListGateway<LdLendingCollection>)EMPTY_NREF_LGWAY; }
        return doLoadLendingCollectionList(lendingList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<LdLendingCollection> doLoadLendingCollectionList(List<LdLending> lendingList, LoadReferrerOption<LdLendingCollectionCB, LdLendingCollection> option) {
        return helpLoadReferrerInternally(lendingList, option, "lendingCollectionList");
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'LdLibraryUser'.
     * @param lendingList The list of lending. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<LdLibraryUser> pulloutLibraryUser(List<LdLending> lendingList)
    { return helpPulloutInternally(lendingList, "libraryUser"); }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * LdLending lending = new LdLending();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * lending.setFoo...(value);
     * lending.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//lending.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//lending.set...;</span>
     * lendingBhv.<span style="color: #DD4747">insert</span>(lending);
     * ... = lending.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param lending The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(LdLending lending) {
        doInsert(lending, null);
    }

    protected void doInsert(LdLending et, InsertOption<LdLendingCB> op) {
        assertObjectNotNull("lending", et); prepareInsertOption(op); delegateInsert(et, op);
    }

    protected void prepareInsertOption(InsertOption<LdLendingCB> op) {
        if (op == null) { return; } assertInsertOptionStatus(op);
        if (op.hasSpecifiedInsertColumn()) { op.resolveInsertColumnSpecification(createCBForSpecifiedUpdate()); }
    }

    protected void doCreate(Entity et, InsertOption<? extends ConditionBean> op) { doInsert(downcast(et), downcast(op)); }

    /**
     * Update the entity modified-only. (ZeroUpdateException, ExclusiveControl)
     * <pre>
     * LdLending lending = new LdLending();
     * lending.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * lending.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//lending.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//lending.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * lending.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     lendingBhv.<span style="color: #DD4747">update</span>(lending);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param lending The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @exception EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(LdLending lending) {
        doUpdate(lending, null);
    }

    protected void doUpdate(LdLending et, UpdateOption<LdLendingCB> op) {
        assertObjectNotNull("lending", et); prepareUpdateOption(op); helpUpdateInternally(et, op);
    }

    protected void prepareUpdateOption(UpdateOption<LdLendingCB> op) {
        if (op == null) { return; } assertUpdateOptionStatus(op);
        if (op.hasSelfSpecification()) { op.resolveSelfSpecification(createCBForVaryingUpdate()); }
        if (op.hasSpecifiedUpdateColumn()) { op.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate()); }
    }

    protected LdLendingCB createCBForVaryingUpdate()
    { LdLendingCB cb = newConditionBean(); cb.xsetupForVaryingUpdate(); return cb; }

    protected LdLendingCB createCBForSpecifiedUpdate()
    { LdLendingCB cb = newConditionBean(); cb.xsetupForSpecifiedUpdate(); return cb; }

    protected void doModify(Entity et, UpdateOption<? extends ConditionBean> op) { doUpdate(downcast(et), downcast(op)); }

    /**
     * Update the entity non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * LdLending lending = new LdLending();
     * lending.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * lending.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//lending.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//lending.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//lending.setVersionNo(value);</span>
     * lendingBhv.<span style="color: #DD4747">updateNonstrict</span>(lending);
     * </pre>
     * @param lending The entity of update. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void updateNonstrict(LdLending lending) {
        doUpdateNonstrict(lending, null);
    }

    protected void doUpdateNonstrict(LdLending et, UpdateOption<LdLendingCB> op) {
        assertObjectNotNull("lending", et); prepareUpdateOption(op); helpUpdateNonstrictInternally(et, op);
    }

    protected void doModifyNonstrict(Entity et, UpdateOption<? extends ConditionBean> op)
    { doUpdateNonstrict(downcast(et), downcast(op)); }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, ExclusiveControl) <br />
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br />
     * <p><span style="color: #DD4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param lending The entity of insert or update. (NotNull, ...depends on insert or update)
     * @exception EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(LdLending lending) {
        doInsertOrUpdate(lending, null, null);
    }

    protected void doInsertOrUpdate(LdLending et, InsertOption<LdLendingCB> iop, UpdateOption<LdLendingCB> uop) {
        assertObjectNotNull("lending", et); helpInsertOrUpdateInternally(et, iop, uop);
    }

    protected void doCreateOrModify(Entity et, InsertOption<? extends ConditionBean> iop, UpdateOption<? extends ConditionBean> uop)
    { doInsertOrUpdate(downcast(et), downcast(iop), downcast(uop)); }

    /**
     * Insert or update the entity non-strictly modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br />
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() }
     * <p><span style="color: #DD4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param lending The entity of insert or update. (NotNull, ...depends on insert or update)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdateNonstrict(LdLending lending) {
        doInsertOrUpdateNonstrict(lending, null, null);
    }

    protected void doInsertOrUpdateNonstrict(LdLending et, InsertOption<LdLendingCB> iop, UpdateOption<LdLendingCB> uop) {
        assertObjectNotNull("lending", et); helpInsertOrUpdateNonstrictInternally(et, iop, uop);
    }

    protected void doCreateOrModifyNonstrict(Entity et, InsertOption<? extends ConditionBean> iop, UpdateOption<? extends ConditionBean> uop)
    { doInsertOrUpdateNonstrict(downcast(et), downcast(iop), downcast(uop)); }

    /**
     * Delete the entity. (ZeroUpdateException, ExclusiveControl)
     * <pre>
     * LdLending lending = new LdLending();
     * lending.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * lending.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     lendingBhv.<span style="color: #DD4747">delete</span>(lending);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param lending The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @exception EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(LdLending lending) {
        doDelete(lending, null);
    }

    protected void doDelete(LdLending et, final DeleteOption<LdLendingCB> op) {
        assertObjectNotNull("lending", et); prepareDeleteOption(op); helpDeleteInternally(et, op);
    }

    protected void prepareDeleteOption(DeleteOption<LdLendingCB> op) { if (op != null) { assertDeleteOptionStatus(op); } }

    protected void doRemove(Entity et, DeleteOption<? extends ConditionBean> op) { doDelete(downcast(et), downcast(op)); }

    /**
     * Delete the entity non-strictly. {ZeroUpdateException, NonExclusiveControl}
     * <pre>
     * LdLending lending = new LdLending();
     * lending.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//lending.setVersionNo(value);</span>
     * lendingBhv.<span style="color: #DD4747">deleteNonstrict</span>(lending);
     * </pre>
     * @param lending The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrict(LdLending lending) {
        doDeleteNonstrict(lending, null);
    }

    protected void doDeleteNonstrict(LdLending et, final DeleteOption<LdLendingCB> op) {
        assertObjectNotNull("lending", et); prepareDeleteOption(op); helpDeleteNonstrictInternally(et, op);
    }

    /**
     * Delete the entity non-strictly ignoring deleted. {ZeroUpdateException, NonExclusiveControl}
     * <pre>
     * LdLending lending = new LdLending();
     * lending.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//lending.setVersionNo(value);</span>
     * lendingBhv.<span style="color: #DD4747">deleteNonstrictIgnoreDeleted</span>(lending);
     * <span style="color: #3F7E5E">// if the target entity doesn't exist, no exception</span>
     * </pre>
     * @param lending The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrictIgnoreDeleted(LdLending lending) {
        doDeleteNonstrictIgnoreDeleted(lending, null);
    }

    protected void doDeleteNonstrictIgnoreDeleted(LdLending et, final DeleteOption<LdLendingCB> op) {
        assertObjectNotNull("lending", et); prepareDeleteOption(op); helpDeleteNonstrictIgnoreDeletedInternally(et, op);
    }

    protected void doRemoveNonstrict(Entity et, DeleteOption<? extends ConditionBean> op)
    { doDeleteNonstrict(downcast(et), downcast(op)); }

    // ===================================================================================
    //                                                                        Batch Update
    //                                                                        ============
    /**
     * Batch-insert the entity list modified-only of same-set columns. (DefaultConstraintsEnabled) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <p><span style="color: #DD4747; font-size: 120%">The columns of least common multiple are registered like this:</span></p>
     * <pre>
     * for (... : ...) {
     *     LdLending lending = new LdLending();
     *     lending.setFooName("foo");
     *     if (...) {
     *         lending.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     lendingList.add(lending);
     * }
     * lendingBhv.<span style="color: #DD4747">batchInsert</span>(lendingList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param lendingList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<LdLending> lendingList) {
        return doBatchInsert(lendingList, null);
    }

    protected int[] doBatchInsert(List<LdLending> ls, InsertOption<LdLendingCB> op) {
        assertObjectNotNull("lendingList", ls);
        InsertOption<LdLendingCB> rlop; if (op != null) { rlop = op; } else { rlop = createPlainInsertOption(); }
        prepareBatchInsertOption(ls, rlop); // required
        return delegateBatchInsert(ls, rlop);
    }

    protected void prepareBatchInsertOption(List<LdLending> ls, InsertOption<LdLendingCB> op) {
        op.xallowInsertColumnModifiedPropertiesFragmented();
        op.xacceptInsertColumnModifiedPropertiesIfNeeds(ls);
        prepareInsertOption(op);
    }

    protected int[] doLumpCreate(List<Entity> ls, InsertOption<? extends ConditionBean> op) { return doBatchInsert(downcast(ls), downcast(op)); }

    /**
     * Batch-update the entity list modified-only of same-set columns. (ExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <span style="color: #DD4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     LdLending lending = new LdLending();
     *     lending.setFooName("foo");
     *     if (...) {
     *         lending.setFooPrice(123);
     *     } else {
     *         lending.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//lending.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     lendingList.add(lending);
     * }
     * lendingBhv.<span style="color: #DD4747">batchUpdate</span>(lendingList);
     * </pre>
     * @param lendingList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<LdLending> lendingList) {
        return doBatchUpdate(lendingList, null);
    }

    protected int[] doBatchUpdate(List<LdLending> ls, UpdateOption<LdLendingCB> op) {
        assertObjectNotNull("lendingList", ls);
        UpdateOption<LdLendingCB> rlop; if (op != null) { rlop = op; } else { rlop = createPlainUpdateOption(); }
        prepareBatchUpdateOption(ls, rlop); // required
        return delegateBatchUpdate(ls, rlop);
    }

    protected void prepareBatchUpdateOption(List<LdLending> ls, UpdateOption<LdLendingCB> op) {
        op.xacceptUpdateColumnModifiedPropertiesIfNeeds(ls);
        prepareUpdateOption(op);
    }

    protected int[] doLumpModify(List<Entity> ls, UpdateOption<? extends ConditionBean> op) { return doBatchUpdate(downcast(ls), downcast(op)); }

    /**
     * Batch-update the entity list specified-only. (ExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * lendingBhv.<span style="color: #DD4747">batchUpdate</span>(lendingList, new SpecifyQuery<LdLendingCB>() {
     *     public void specify(LdLendingCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #DD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #DD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * lendingBhv.<span style="color: #DD4747">batchUpdate</span>(lendingList, new SpecifyQuery<LdLendingCB>() {
     *     public void specify(LdLendingCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #DD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param lendingList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<LdLending> lendingList, SpecifyQuery<LdLendingCB> updateColumnSpec) {
        return doBatchUpdate(lendingList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    /**
     * Batch-update the entity list non-strictly modified-only of same-set columns. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <span style="color: #DD4747; font-size: 140%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     LdLending lending = new LdLending();
     *     lending.setFooName("foo");
     *     if (...) {
     *         lending.setFooPrice(123);
     *     } else {
     *         lending.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//lending.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     lendingList.add(lending);
     * }
     * lendingBhv.<span style="color: #DD4747">batchUpdate</span>(lendingList);
     * </pre>
     * @param lendingList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<LdLending> lendingList) {
        return doBatchUpdateNonstrict(lendingList, null);
    }

    protected int[] doBatchUpdateNonstrict(List<LdLending> ls, UpdateOption<LdLendingCB> op) {
        assertObjectNotNull("lendingList", ls);
        UpdateOption<LdLendingCB> rlop; if (op != null) { rlop = op; } else { rlop = createPlainUpdateOption(); }
        prepareBatchUpdateOption(ls, rlop);
        return delegateBatchUpdateNonstrict(ls, rlop);
    }

    /**
     * Batch-update the entity list non-strictly specified-only. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * lendingBhv.<span style="color: #DD4747">batchUpdateNonstrict</span>(lendingList, new SpecifyQuery<LdLendingCB>() {
     *     public void specify(LdLendingCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #DD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #DD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * lendingBhv.<span style="color: #DD4747">batchUpdateNonstrict</span>(lendingList, new SpecifyQuery<LdLendingCB>() {
     *     public void specify(LdLendingCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #DD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).</p>
     * @param lendingList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<LdLending> lendingList, SpecifyQuery<LdLendingCB> updateColumnSpec) {
        return doBatchUpdateNonstrict(lendingList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> op)
    { return doBatchUpdateNonstrict(downcast(ls), downcast(op)); }

    /**
     * Batch-delete the entity list. (ExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param lendingList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchDelete(List<LdLending> lendingList) {
        return doBatchDelete(lendingList, null);
    }

    protected int[] doBatchDelete(List<LdLending> ls, DeleteOption<LdLendingCB> op) {
        assertObjectNotNull("lendingList", ls);
        prepareDeleteOption(op);
        return delegateBatchDelete(ls, op);
    }

    protected int[] doLumpRemove(List<Entity> ls, DeleteOption<? extends ConditionBean> op) { return doBatchDelete(downcast(ls), downcast(op)); }

    /**
     * Batch-delete the entity list non-strictly. {NonExclusiveControl} <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param lendingList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDeleteNonstrict(List<LdLending> lendingList) {
        return doBatchDeleteNonstrict(lendingList, null);
    }

    protected int[] doBatchDeleteNonstrict(List<LdLending> ls, DeleteOption<LdLendingCB> op) {
        assertObjectNotNull("lendingList", ls);
        prepareDeleteOption(op);
        return delegateBatchDeleteNonstrict(ls, op);
    }

    protected int[] doLumpRemoveNonstrict(List<Entity> ls, DeleteOption<? extends ConditionBean> op)
    { return doBatchDeleteNonstrict(downcast(ls), downcast(op)); }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * lendingBhv.<span style="color: #DD4747">queryInsert</span>(new QueryInsertSetupper&lt;LdLending, LdLendingCB&gt;() {
     *     public ConditionBean setup(lending entity, LdLendingCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<LdLending, LdLendingCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(QueryInsertSetupper<LdLending, LdLendingCB> sp, InsertOption<LdLendingCB> op) {
        assertObjectNotNull("setupper", sp); prepareInsertOption(op);
        LdLending et = newEntity(); LdLendingCB cb = createCBForQueryInsert();
        return delegateQueryInsert(et, cb, sp.setup(et, cb), op);
    }

    protected LdLendingCB createCBForQueryInsert()
    { LdLendingCB cb = newConditionBean(); cb.xsetupForQueryInsert(); return cb; }

    protected int doRangeCreate(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> setupper, InsertOption<? extends ConditionBean> op)
    { return doQueryInsert(downcast(setupper), downcast(op)); }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * LdLending lending = new LdLending();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//lending.setPK...(value);</span>
     * lending.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//lending.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//lending.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//lending.setVersionNo(value);</span>
     * LdLendingCB cb = new LdLendingCB();
     * cb.query().setFoo...(value);
     * lendingBhv.<span style="color: #DD4747">queryUpdate</span>(lending, cb);
     * </pre>
     * @param lending The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of LdLending. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(LdLending lending, LdLendingCB cb) {
        return doQueryUpdate(lending, cb, null);
    }

    protected int doQueryUpdate(LdLending et, LdLendingCB cb, UpdateOption<LdLendingCB> op) {
        assertObjectNotNull("lending", et); assertCBStateValid(cb); prepareUpdateOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryUpdate(et, cb, op) : 0;
    }

    protected int doRangeModify(Entity et, ConditionBean cb, UpdateOption<? extends ConditionBean> op)
    { return doQueryUpdate(downcast(et), downcast(cb), downcast(op)); }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * LdLendingCB cb = new LdLendingCB();
     * cb.query().setFoo...(value);
     * lendingBhv.<span style="color: #DD4747">queryDelete</span>(lending, cb);
     * </pre>
     * @param cb The condition-bean of LdLending. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(LdLendingCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(LdLendingCB cb, DeleteOption<LdLendingCB> op) {
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
     * LdLending lending = new LdLending();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * lending.setFoo...(value);
     * lending.setBar...(value);
     * InsertOption<LdLendingCB> option = new InsertOption<LdLendingCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * lendingBhv.<span style="color: #DD4747">varyingInsert</span>(lending, option);
     * ... = lending.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param lending The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(LdLending lending, InsertOption<LdLendingCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(lending, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, ExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * LdLending lending = new LdLending();
     * lending.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * lending.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * lending.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;LdLendingCB&gt; option = new UpdateOption&lt;LdLendingCB&gt;();
     *     option.self(new SpecifyQuery&lt;LdLendingCB&gt;() {
     *         public void specify(LdLendingCB cb) {
     *             cb.specify().<span style="color: #DD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     lendingBhv.<span style="color: #DD4747">varyingUpdate</span>(lending, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param lending The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(LdLending lending, UpdateOption<LdLendingCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(lending, option);
    }

    /**
     * Update the entity with varying requests non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as updateNonstrict(entity).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * LdLending lending = new LdLending();
     * lending.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * lending.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//lending.setVersionNo(value);</span>
     * UpdateOption&lt;LdLendingCB&gt; option = new UpdateOption&lt;LdLendingCB&gt;();
     * option.self(new SpecifyQuery&lt;LdLendingCB&gt;() {
     *     public void specify(LdLendingCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * lendingBhv.<span style="color: #DD4747">varyingUpdateNonstrict</span>(lending, option);
     * </pre>
     * @param lending The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdateNonstrict(LdLending lending, UpdateOption<LdLendingCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdateNonstrict(lending, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param lending The entity of insert or update. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(LdLending lending, InsertOption<LdLendingCB> insertOption, UpdateOption<LdLendingCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInsertOrUpdate(lending, insertOption, updateOption);
    }

    /**
     * Insert or update the entity with varying requests non-strictly. (NonExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdateNonstrict(entity).
     * @param lending The entity of insert or update. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdateNonstrict(LdLending lending, InsertOption<LdLendingCB> insertOption, UpdateOption<LdLendingCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInsertOrUpdateNonstrict(lending, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, ExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param lending The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(LdLending lending, DeleteOption<LdLendingCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(lending, option);
    }

    /**
     * Delete the entity with varying requests non-strictly. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as deleteNonstrict(entity).
     * @param lending The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDeleteNonstrict(LdLending lending, DeleteOption<LdLendingCB> option) {
        assertDeleteOptionNotNull(option);
        doDeleteNonstrict(lending, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param lendingList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<LdLending> lendingList, InsertOption<LdLendingCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(lendingList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param lendingList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<LdLending> lendingList, UpdateOption<LdLendingCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(lendingList, option);
    }

    /**
     * Batch-update the list with varying requests non-strictly. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param lendingList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdateNonstrict(List<LdLending> lendingList, UpdateOption<LdLendingCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdateNonstrict(lendingList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param lendingList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<LdLending> lendingList, DeleteOption<LdLendingCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(lendingList, option);
    }

    /**
     * Batch-delete the list with varying requests non-strictly. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDeleteNonstrict(entityList).
     * @param lendingList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDeleteNonstrict(List<LdLending> lendingList, DeleteOption<LdLendingCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDeleteNonstrict(lendingList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<LdLending, LdLendingCB> setupper, InsertOption<LdLendingCB> option) {
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
     * LdLending lending = new LdLending();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//lending.setPK...(value);</span>
     * lending.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//lending.setVersionNo(value);</span>
     * LdLendingCB cb = new LdLendingCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;LdLendingCB&gt; option = new UpdateOption&lt;LdLendingCB&gt;();
     * option.self(new SpecifyQuery&lt;LdLendingCB&gt;() {
     *     public void specify(LdLendingCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * lendingBhv.<span style="color: #DD4747">varyingQueryUpdate</span>(lending, cb, option);
     * </pre>
     * @param lending The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of LdLending. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(LdLending lending, LdLendingCB cb, UpdateOption<LdLendingCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(lending, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of LdLending. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(LdLendingCB cb, DeleteOption<LdLendingCB> option) {
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
    public OutsideSqlBasicExecutor<LdLendingBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                     Filter Override
    //                                                                     ===============
    @Override
    protected void filterEntityOfInsert(Entity tgt, InsertOption<? extends ConditionBean> op) {
        super.filterEntityOfInsert(tgt, op);
        LdLending et = downcast(tgt);
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
    protected Class<LdLending> typeOfSelectedEntity() { return LdLending.class; }
    protected LdLending downcast(Entity et) { return helpEntityDowncastInternally(et, LdLending.class); }
    protected LdLendingCB downcast(ConditionBean cb) { return helpConditionBeanDowncastInternally(cb, LdLendingCB.class); }
    @SuppressWarnings("unchecked")
    protected List<LdLending> downcast(List<? extends Entity> ls) { return (List<LdLending>)ls; }
    @SuppressWarnings("unchecked")
    protected InsertOption<LdLendingCB> downcast(InsertOption<? extends ConditionBean> op) { return (InsertOption<LdLendingCB>)op; }
    @SuppressWarnings("unchecked")
    protected UpdateOption<LdLendingCB> downcast(UpdateOption<? extends ConditionBean> op) { return (UpdateOption<LdLendingCB>)op; }
    @SuppressWarnings("unchecked")
    protected DeleteOption<LdLendingCB> downcast(DeleteOption<? extends ConditionBean> op) { return (DeleteOption<LdLendingCB>)op; }
    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<LdLending, LdLendingCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> sp)
    { return (QueryInsertSetupper<LdLending, LdLendingCB>)sp; }
}
