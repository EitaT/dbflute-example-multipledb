package com.example.dbflute.multipledb.seasar.dbflute.memberdb.bsbhv;

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
import com.example.dbflute.multipledb.seasar.dbflute.memberdb.exbhv.*;
import com.example.dbflute.multipledb.seasar.dbflute.memberdb.bsbhv.loader.*;
import com.example.dbflute.multipledb.seasar.dbflute.memberdb.exentity.*;
import com.example.dbflute.multipledb.seasar.dbflute.memberdb.bsentity.dbmeta.*;
import com.example.dbflute.multipledb.seasar.dbflute.memberdb.cbean.*;

/**
 * The behavior of WITHDRAWAL_REASON as TABLE. <br />
 * <pre>
 * [primary key]
 *     WITHDRAWAL_REASON_CODE
 *
 * [column]
 *     WITHDRAWAL_REASON_CODE, WITHDRAWAL_REASON_TEXT, DISPLAY_ORDER
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
 *     MEMBER_WITHDRAWAL
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     memberWithdrawalList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class MbBsWithdrawalReasonBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "WITHDRAWAL_REASON"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** {@inheritDoc} */
    public DBMeta getDBMeta() { return MbWithdrawalReasonDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public MbWithdrawalReasonDbm getMyDBMeta() { return MbWithdrawalReasonDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public MbWithdrawalReason newEntity() { return new MbWithdrawalReason(); }

    /** {@inheritDoc} */
    public MbWithdrawalReasonCB newConditionBean() { return new MbWithdrawalReasonCB(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public MbWithdrawalReason newMyEntity() { return new MbWithdrawalReason(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public MbWithdrawalReasonCB newMyConditionBean() { return new MbWithdrawalReasonCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * MbWithdrawalReasonCB cb = new MbWithdrawalReasonCB();
     * cb.query().setFoo...(value);
     * int count = withdrawalReasonBhv.<span style="color: #DD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of MbWithdrawalReason. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(MbWithdrawalReasonCB cb) {
        return facadeSelectCount(cb);
    }

    protected int facadeSelectCount(MbWithdrawalReasonCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(MbWithdrawalReasonCB cb) { // called by selectCount(cb)
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(MbWithdrawalReasonCB cb) { // called by selectPage(cb)
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
     * MbWithdrawalReasonCB cb = new MbWithdrawalReasonCB();
     * cb.query().setFoo...(value);
     * MbWithdrawalReason withdrawalReason = withdrawalReasonBhv.<span style="color: #DD4747">selectEntity</span>(cb);
     * if (withdrawalReason != null) { <span style="color: #3F7E5E">// null check</span>
     *     ... = withdrawalReason.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of MbWithdrawalReason. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public MbWithdrawalReason selectEntity(MbWithdrawalReasonCB cb) {
        return facadeSelectEntity(cb);
    }

    protected MbWithdrawalReason facadeSelectEntity(MbWithdrawalReasonCB cb) {
        return doSelectEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends MbWithdrawalReason> ENTITY doSelectEntity(MbWithdrawalReasonCB cb, Class<ENTITY> tp) {
        return helpSelectEntityInternally(cb, tp);
    }

    protected <ENTITY extends MbWithdrawalReason> OptionalEntity<ENTITY> doSelectOptionalEntity(MbWithdrawalReasonCB cb, Class<ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)); }

    /**
     * Select the entity by the condition-bean with deleted check. <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, this method is good.</span>
     * <pre>
     * MbWithdrawalReasonCB cb = new MbWithdrawalReasonCB();
     * cb.query().setFoo...(value);
     * MbWithdrawalReason withdrawalReason = withdrawalReasonBhv.<span style="color: #DD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = withdrawalReason.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of MbWithdrawalReason. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public MbWithdrawalReason selectEntityWithDeletedCheck(MbWithdrawalReasonCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    protected MbWithdrawalReason facadeSelectEntityWithDeletedCheck(MbWithdrawalReasonCB cb) {
        return doSelectEntityWithDeletedCheck(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends MbWithdrawalReason> ENTITY doSelectEntityWithDeletedCheck(MbWithdrawalReasonCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectEntityWithDeletedCheckInternally(cb, tp);
    }

    protected Entity doReadEntityWithDeletedCheck(ConditionBean cb) { return facadeSelectEntityWithDeletedCheck(downcast(cb)); }

    /**
     * Select the entity by the primary-key value.
     * @param withdrawalReasonCode : PK, NotNull, CHAR(3). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public MbWithdrawalReason selectByPKValue(String withdrawalReasonCode) {
        return facadeSelectByPKValue(withdrawalReasonCode);
    }

    protected MbWithdrawalReason facadeSelectByPKValue(String withdrawalReasonCode) {
        return doSelectByPK(withdrawalReasonCode, typeOfSelectedEntity());
    }

    protected <ENTITY extends MbWithdrawalReason> ENTITY doSelectByPK(String withdrawalReasonCode, Class<ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(withdrawalReasonCode), tp);
    }

    protected <ENTITY extends MbWithdrawalReason> OptionalEntity<ENTITY> doSelectOptionalByPK(String withdrawalReasonCode, Class<ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(withdrawalReasonCode, tp), withdrawalReasonCode);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param withdrawalReasonCode : PK, NotNull, CHAR(3). (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public MbWithdrawalReason selectByPKValueWithDeletedCheck(String withdrawalReasonCode) {
        return doSelectByPKWithDeletedCheck(withdrawalReasonCode, typeOfSelectedEntity());
    }

    protected <ENTITY extends MbWithdrawalReason> ENTITY doSelectByPKWithDeletedCheck(String withdrawalReasonCode, Class<ENTITY> tp) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(withdrawalReasonCode), tp);
    }

    protected MbWithdrawalReasonCB xprepareCBAsPK(String withdrawalReasonCode) {
        assertObjectNotNull("withdrawalReasonCode", withdrawalReasonCode);
        return newConditionBean().acceptPK(withdrawalReasonCode);
    }

    /**
     * Select the entity by the unique-key value.
     * @param displayOrder : UQ, NotNull, INTEGER(10). (NotNull)
     * @return The optional entity selected by the unique key. (NotNull: if no data, empty entity)
     * @exception EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<MbWithdrawalReason> selectByUniqueOf(Integer displayOrder) {
        return facadeSelectByUniqueOf(displayOrder);
    }

    protected OptionalEntity<MbWithdrawalReason> facadeSelectByUniqueOf(Integer displayOrder) {
        return doSelectByUniqueOf(displayOrder, typeOfSelectedEntity());
    }

    protected <ENTITY extends MbWithdrawalReason> OptionalEntity<ENTITY> doSelectByUniqueOf(Integer displayOrder, Class<ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(xprepareCBAsUniqueOf(displayOrder), tp), displayOrder);
    }

    protected MbWithdrawalReasonCB xprepareCBAsUniqueOf(Integer displayOrder) {
        assertObjectNotNull("displayOrder", displayOrder);
        return newConditionBean().acceptUniqueOf(displayOrder);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * MbWithdrawalReasonCB cb = new MbWithdrawalReasonCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;MbWithdrawalReason&gt; withdrawalReasonList = withdrawalReasonBhv.<span style="color: #DD4747">selectList</span>(cb);
     * for (MbWithdrawalReason withdrawalReason : withdrawalReasonList) {
     *     ... = withdrawalReason.get...();
     * }
     * </pre>
     * @param cb The condition-bean of MbWithdrawalReason. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<MbWithdrawalReason> selectList(MbWithdrawalReasonCB cb) {
        return facadeSelectList(cb);
    }

    protected ListResultBean<MbWithdrawalReason> facadeSelectList(MbWithdrawalReasonCB cb) {
        return doSelectList(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends MbWithdrawalReason> ListResultBean<ENTITY> doSelectList(MbWithdrawalReasonCB cb, Class<ENTITY> tp) {
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
     * MbWithdrawalReasonCB cb = new MbWithdrawalReasonCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #DD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;MbWithdrawalReason&gt; page = withdrawalReasonBhv.<span style="color: #DD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (MbWithdrawalReason withdrawalReason : page) {
     *     ... = withdrawalReason.get...();
     * }
     * </pre>
     * @param cb The condition-bean of MbWithdrawalReason. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<MbWithdrawalReason> selectPage(MbWithdrawalReasonCB cb) {
        return facadeSelectPage(cb);
    }

    protected PagingResultBean<MbWithdrawalReason> facadeSelectPage(MbWithdrawalReasonCB cb) {
        return doSelectPage(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends MbWithdrawalReason> PagingResultBean<ENTITY> doSelectPage(MbWithdrawalReasonCB cb, Class<ENTITY> tp) {
        return helpSelectPageInternally(cb, tp);
    }

    protected PagingResultBean<? extends Entity> doReadPage(ConditionBean cb) { return facadeSelectPage(downcast(cb)); }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * MbWithdrawalReasonCB cb = new MbWithdrawalReasonCB();
     * cb.query().setFoo...(value);
     * withdrawalReasonBhv.<span style="color: #DD4747">selectCursor</span>(cb, new EntityRowHandler&lt;MbWithdrawalReason&gt;() {
     *     public void handle(MbWithdrawalReason entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of MbWithdrawalReason. (NotNull)
     * @param entityRowHandler The handler of entity row of MbWithdrawalReason. (NotNull)
     */
    public void selectCursor(MbWithdrawalReasonCB cb, EntityRowHandler<MbWithdrawalReason> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    protected void facadeSelectCursor(MbWithdrawalReasonCB cb, EntityRowHandler<MbWithdrawalReason> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, typeOfSelectedEntity());
    }

    protected <ENTITY extends MbWithdrawalReason> void doSelectCursor(MbWithdrawalReasonCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) {
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
     * withdrawalReasonBhv.<span style="color: #DD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(MbWithdrawalReasonCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<MbWithdrawalReasonCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return facadeScalarSelect(resultType);
    }

    protected <RESULT> HpSLSFunction<MbWithdrawalReasonCB, RESULT> facadeScalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newConditionBean());
    }

    protected <RESULT, CB extends MbWithdrawalReasonCB> HpSLSFunction<CB, RESULT> doScalarSelect(final Class<RESULT> tp, final CB cb) {
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
     * @param withdrawalReasonList The entity list of withdrawalReason. (NotNull)
     * @param handler The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<MbWithdrawalReason> withdrawalReasonList, ReferrerLoaderHandler<MbLoaderOfWithdrawalReason> handler) {
        xassLRArg(withdrawalReasonList, handler);
        handler.handle(new MbLoaderOfWithdrawalReason().ready(withdrawalReasonList, _behaviorSelector));
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
     * @param withdrawalReason The entity of withdrawalReason. (NotNull)
     * @param handler The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(MbWithdrawalReason withdrawalReason, ReferrerLoaderHandler<MbLoaderOfWithdrawalReason> handler) {
        xassLRArg(withdrawalReason, handler);
        handler.handle(new MbLoaderOfWithdrawalReason().ready(xnewLRAryLs(withdrawalReason), _behaviorSelector));
    }

    /**
     * Load referrer of memberWithdrawalList by the set-upper of referrer. <br />
     * MEMBER_WITHDRAWAL by WITHDRAWAL_REASON_CODE, named 'memberWithdrawalList'.
     * <pre>
     * withdrawalReasonBhv.<span style="color: #DD4747">loadMemberWithdrawalList</span>(withdrawalReasonList, new ConditionBeanSetupper&lt;MbMemberWithdrawalCB&gt;() {
     *     public void setup(MbMemberWithdrawalCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...();
     *     }
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedList(referrerList -&gt {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * for (MbWithdrawalReason withdrawalReason : withdrawalReasonList) {
     *     ... = withdrawalReason.<span style="color: #DD4747">getMemberWithdrawalList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setWithdrawalReasonCode_InScope(pkList);
     * cb.query().addOrderBy_WithdrawalReasonCode_Asc();
     * </pre>
     * @param withdrawalReasonList The entity list of withdrawalReason. (NotNull)
     * @param setupper The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MbMemberWithdrawal> loadMemberWithdrawalList(List<MbWithdrawalReason> withdrawalReasonList, ConditionBeanSetupper<MbMemberWithdrawalCB> setupper) {
        xassLRArg(withdrawalReasonList, setupper);
        return doLoadMemberWithdrawalList(withdrawalReasonList, new LoadReferrerOption<MbMemberWithdrawalCB, MbMemberWithdrawal>().xinit(setupper));
    }

    /**
     * Load referrer of memberWithdrawalList by the set-upper of referrer. <br />
     * MEMBER_WITHDRAWAL by WITHDRAWAL_REASON_CODE, named 'memberWithdrawalList'.
     * <pre>
     * withdrawalReasonBhv.<span style="color: #DD4747">loadMemberWithdrawalList</span>(withdrawalReasonList, new ConditionBeanSetupper&lt;MbMemberWithdrawalCB&gt;() {
     *     public void setup(MbMemberWithdrawalCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...();
     *     }
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedList(referrerList -&gt {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = withdrawalReason.<span style="color: #DD4747">getMemberWithdrawalList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setWithdrawalReasonCode_InScope(pkList);
     * cb.query().addOrderBy_WithdrawalReasonCode_Asc();
     * </pre>
     * @param withdrawalReason The entity of withdrawalReason. (NotNull)
     * @param setupper The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MbMemberWithdrawal> loadMemberWithdrawalList(MbWithdrawalReason withdrawalReason, ConditionBeanSetupper<MbMemberWithdrawalCB> setupper) {
        xassLRArg(withdrawalReason, setupper);
        return doLoadMemberWithdrawalList(xnewLRLs(withdrawalReason), new LoadReferrerOption<MbMemberWithdrawalCB, MbMemberWithdrawal>().xinit(setupper));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param withdrawalReason The entity of withdrawalReason. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MbMemberWithdrawal> loadMemberWithdrawalList(MbWithdrawalReason withdrawalReason, LoadReferrerOption<MbMemberWithdrawalCB, MbMemberWithdrawal> loadReferrerOption) {
        xassLRArg(withdrawalReason, loadReferrerOption);
        return loadMemberWithdrawalList(xnewLRLs(withdrawalReason), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean setupper.} #beforejava8
     * @param withdrawalReasonList The entity list of withdrawalReason. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<MbMemberWithdrawal> loadMemberWithdrawalList(List<MbWithdrawalReason> withdrawalReasonList, LoadReferrerOption<MbMemberWithdrawalCB, MbMemberWithdrawal> loadReferrerOption) {
        xassLRArg(withdrawalReasonList, loadReferrerOption);
        if (withdrawalReasonList.isEmpty()) { return (NestedReferrerListGateway<MbMemberWithdrawal>)EMPTY_NREF_LGWAY; }
        return doLoadMemberWithdrawalList(withdrawalReasonList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<MbMemberWithdrawal> doLoadMemberWithdrawalList(List<MbWithdrawalReason> withdrawalReasonList, LoadReferrerOption<MbMemberWithdrawalCB, MbMemberWithdrawal> option) {
        return helpLoadReferrerInternally(withdrawalReasonList, option, "memberWithdrawalList");
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key withdrawalReasonCode.
     * @param withdrawalReasonList The list of withdrawalReason. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<String> extractWithdrawalReasonCodeList(List<MbWithdrawalReason> withdrawalReasonList)
    { return helpExtractListInternally(withdrawalReasonList, "withdrawalReasonCode"); }

    /**
     * Extract the value list of (single) unique key displayOrder.
     * @param withdrawalReasonList The list of withdrawalReason. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Integer> extractDisplayOrderList(List<MbWithdrawalReason> withdrawalReasonList)
    { return helpExtractListInternally(withdrawalReasonList, "displayOrder"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * MbWithdrawalReason withdrawalReason = new MbWithdrawalReason();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * withdrawalReason.setFoo...(value);
     * withdrawalReason.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//withdrawalReason.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//withdrawalReason.set...;</span>
     * withdrawalReasonBhv.<span style="color: #DD4747">insert</span>(withdrawalReason);
     * ... = withdrawalReason.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param withdrawalReason The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(MbWithdrawalReason withdrawalReason) {
        doInsert(withdrawalReason, null);
    }

    protected void doInsert(MbWithdrawalReason et, InsertOption<MbWithdrawalReasonCB> op) {
        assertObjectNotNull("withdrawalReason", et); prepareInsertOption(op); delegateInsert(et, op);
    }

    protected void prepareInsertOption(InsertOption<MbWithdrawalReasonCB> op) {
        if (op == null) { return; } assertInsertOptionStatus(op);
        if (op.hasSpecifiedInsertColumn()) { op.resolveInsertColumnSpecification(createCBForSpecifiedUpdate()); }
    }

    protected void doCreate(Entity et, InsertOption<? extends ConditionBean> op) { doInsert(downcast(et), downcast(op)); }

    /**
     * Update the entity modified-only. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * MbWithdrawalReason withdrawalReason = new MbWithdrawalReason();
     * withdrawalReason.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * withdrawalReason.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//withdrawalReason.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//withdrawalReason.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * withdrawalReason.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     withdrawalReasonBhv.<span style="color: #DD4747">update</span>(withdrawalReason);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param withdrawalReason The entity of update. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(MbWithdrawalReason withdrawalReason) {
        doUpdate(withdrawalReason, null);
    }

    protected void doUpdate(MbWithdrawalReason et, UpdateOption<MbWithdrawalReasonCB> op) {
        assertObjectNotNull("withdrawalReason", et); prepareUpdateOption(op); helpUpdateInternally(et, op);
    }

    protected void prepareUpdateOption(UpdateOption<MbWithdrawalReasonCB> op) {
        if (op == null) { return; } assertUpdateOptionStatus(op);
        if (op.hasSelfSpecification()) { op.resolveSelfSpecification(createCBForVaryingUpdate()); }
        if (op.hasSpecifiedUpdateColumn()) { op.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate()); }
    }

    protected MbWithdrawalReasonCB createCBForVaryingUpdate()
    { MbWithdrawalReasonCB cb = newConditionBean(); cb.xsetupForVaryingUpdate(); return cb; }

    protected MbWithdrawalReasonCB createCBForSpecifiedUpdate()
    { MbWithdrawalReasonCB cb = newConditionBean(); cb.xsetupForSpecifiedUpdate(); return cb; }

    protected void doModify(Entity et, UpdateOption<? extends ConditionBean> op) { doUpdate(downcast(et), downcast(op)); }

    protected void doModifyNonstrict(Entity et, UpdateOption<? extends ConditionBean> op)
    { doModify(et, op); }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br />
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br />
     * <p><span style="color: #DD4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param withdrawalReason The entity of insert or update. (NotNull, ...depends on insert or update)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(MbWithdrawalReason withdrawalReason) {
        doInsertOrUpdate(withdrawalReason, null, null);
    }

    protected void doInsertOrUpdate(MbWithdrawalReason et, InsertOption<MbWithdrawalReasonCB> iop, UpdateOption<MbWithdrawalReasonCB> uop) {
        assertObjectNotNull("withdrawalReason", et); helpInsertOrUpdateInternally(et, iop, uop);
    }

    protected void doCreateOrModify(Entity et, InsertOption<? extends ConditionBean> iop, UpdateOption<? extends ConditionBean> uop)
    { doInsertOrUpdate(downcast(et), downcast(iop), downcast(uop)); }

    protected void doCreateOrModifyNonstrict(Entity et, InsertOption<? extends ConditionBean> iop, UpdateOption<? extends ConditionBean> uop)
    { doCreateOrModify(et, iop, uop); }

    /**
     * Delete the entity. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * MbWithdrawalReason withdrawalReason = new MbWithdrawalReason();
     * withdrawalReason.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * withdrawalReason.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     withdrawalReasonBhv.<span style="color: #DD4747">delete</span>(withdrawalReason);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param withdrawalReason The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(MbWithdrawalReason withdrawalReason) {
        doDelete(withdrawalReason, null);
    }

    protected void doDelete(MbWithdrawalReason et, final DeleteOption<MbWithdrawalReasonCB> op) {
        assertObjectNotNull("withdrawalReason", et); prepareDeleteOption(op); helpDeleteInternally(et, op);
    }

    protected void prepareDeleteOption(DeleteOption<MbWithdrawalReasonCB> op) { if (op != null) { assertDeleteOptionStatus(op); } }

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
     *     MbWithdrawalReason withdrawalReason = new MbWithdrawalReason();
     *     withdrawalReason.setFooName("foo");
     *     if (...) {
     *         withdrawalReason.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     withdrawalReasonList.add(withdrawalReason);
     * }
     * withdrawalReasonBhv.<span style="color: #DD4747">batchInsert</span>(withdrawalReasonList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param withdrawalReasonList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<MbWithdrawalReason> withdrawalReasonList) {
        return doBatchInsert(withdrawalReasonList, null);
    }

    protected int[] doBatchInsert(List<MbWithdrawalReason> ls, InsertOption<MbWithdrawalReasonCB> op) {
        assertObjectNotNull("withdrawalReasonList", ls);
        InsertOption<MbWithdrawalReasonCB> rlop; if (op != null) { rlop = op; } else { rlop = createPlainInsertOption(); }
        prepareBatchInsertOption(ls, rlop); // required
        return delegateBatchInsert(ls, rlop);
    }

    protected void prepareBatchInsertOption(List<MbWithdrawalReason> ls, InsertOption<MbWithdrawalReasonCB> op) {
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
     *     MbWithdrawalReason withdrawalReason = new MbWithdrawalReason();
     *     withdrawalReason.setFooName("foo");
     *     if (...) {
     *         withdrawalReason.setFooPrice(123);
     *     } else {
     *         withdrawalReason.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//withdrawalReason.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     withdrawalReasonList.add(withdrawalReason);
     * }
     * withdrawalReasonBhv.<span style="color: #DD4747">batchUpdate</span>(withdrawalReasonList);
     * </pre>
     * @param withdrawalReasonList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<MbWithdrawalReason> withdrawalReasonList) {
        return doBatchUpdate(withdrawalReasonList, null);
    }

    protected int[] doBatchUpdate(List<MbWithdrawalReason> ls, UpdateOption<MbWithdrawalReasonCB> op) {
        assertObjectNotNull("withdrawalReasonList", ls);
        UpdateOption<MbWithdrawalReasonCB> rlop; if (op != null) { rlop = op; } else { rlop = createPlainUpdateOption(); }
        prepareBatchUpdateOption(ls, rlop); // required
        return delegateBatchUpdate(ls, rlop);
    }

    protected void prepareBatchUpdateOption(List<MbWithdrawalReason> ls, UpdateOption<MbWithdrawalReasonCB> op) {
        op.xacceptUpdateColumnModifiedPropertiesIfNeeds(ls);
        prepareUpdateOption(op);
    }

    protected int[] doLumpModify(List<Entity> ls, UpdateOption<? extends ConditionBean> op) { return doBatchUpdate(downcast(ls), downcast(op)); }

    /**
     * Batch-update the entity list specified-only. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * withdrawalReasonBhv.<span style="color: #DD4747">batchUpdate</span>(withdrawalReasonList, new SpecifyQuery<MbWithdrawalReasonCB>() {
     *     public void specify(MbWithdrawalReasonCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #DD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #DD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * withdrawalReasonBhv.<span style="color: #DD4747">batchUpdate</span>(withdrawalReasonList, new SpecifyQuery<MbWithdrawalReasonCB>() {
     *     public void specify(MbWithdrawalReasonCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #DD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param withdrawalReasonList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<MbWithdrawalReason> withdrawalReasonList, SpecifyQuery<MbWithdrawalReasonCB> updateColumnSpec) {
        return doBatchUpdate(withdrawalReasonList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> op)
    { return doLumpModify(ls, op); }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param withdrawalReasonList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<MbWithdrawalReason> withdrawalReasonList) {
        return doBatchDelete(withdrawalReasonList, null);
    }

    protected int[] doBatchDelete(List<MbWithdrawalReason> ls, DeleteOption<MbWithdrawalReasonCB> op) {
        assertObjectNotNull("withdrawalReasonList", ls);
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
     * withdrawalReasonBhv.<span style="color: #DD4747">queryInsert</span>(new QueryInsertSetupper&lt;MbWithdrawalReason, MbWithdrawalReasonCB&gt;() {
     *     public ConditionBean setup(withdrawalReason entity, MbWithdrawalReasonCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<MbWithdrawalReason, MbWithdrawalReasonCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(QueryInsertSetupper<MbWithdrawalReason, MbWithdrawalReasonCB> sp, InsertOption<MbWithdrawalReasonCB> op) {
        assertObjectNotNull("setupper", sp); prepareInsertOption(op);
        MbWithdrawalReason et = newEntity(); MbWithdrawalReasonCB cb = createCBForQueryInsert();
        return delegateQueryInsert(et, cb, sp.setup(et, cb), op);
    }

    protected MbWithdrawalReasonCB createCBForQueryInsert()
    { MbWithdrawalReasonCB cb = newConditionBean(); cb.xsetupForQueryInsert(); return cb; }

    protected int doRangeCreate(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> setupper, InsertOption<? extends ConditionBean> op)
    { return doQueryInsert(downcast(setupper), downcast(op)); }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * MbWithdrawalReason withdrawalReason = new MbWithdrawalReason();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//withdrawalReason.setPK...(value);</span>
     * withdrawalReason.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//withdrawalReason.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//withdrawalReason.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//withdrawalReason.setVersionNo(value);</span>
     * MbWithdrawalReasonCB cb = new MbWithdrawalReasonCB();
     * cb.query().setFoo...(value);
     * withdrawalReasonBhv.<span style="color: #DD4747">queryUpdate</span>(withdrawalReason, cb);
     * </pre>
     * @param withdrawalReason The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of MbWithdrawalReason. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(MbWithdrawalReason withdrawalReason, MbWithdrawalReasonCB cb) {
        return doQueryUpdate(withdrawalReason, cb, null);
    }

    protected int doQueryUpdate(MbWithdrawalReason et, MbWithdrawalReasonCB cb, UpdateOption<MbWithdrawalReasonCB> op) {
        assertObjectNotNull("withdrawalReason", et); assertCBStateValid(cb); prepareUpdateOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryUpdate(et, cb, op) : 0;
    }

    protected int doRangeModify(Entity et, ConditionBean cb, UpdateOption<? extends ConditionBean> op)
    { return doQueryUpdate(downcast(et), downcast(cb), downcast(op)); }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * MbWithdrawalReasonCB cb = new MbWithdrawalReasonCB();
     * cb.query().setFoo...(value);
     * withdrawalReasonBhv.<span style="color: #DD4747">queryDelete</span>(withdrawalReason, cb);
     * </pre>
     * @param cb The condition-bean of MbWithdrawalReason. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(MbWithdrawalReasonCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(MbWithdrawalReasonCB cb, DeleteOption<MbWithdrawalReasonCB> op) {
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
     * MbWithdrawalReason withdrawalReason = new MbWithdrawalReason();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * withdrawalReason.setFoo...(value);
     * withdrawalReason.setBar...(value);
     * InsertOption<MbWithdrawalReasonCB> option = new InsertOption<MbWithdrawalReasonCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * withdrawalReasonBhv.<span style="color: #DD4747">varyingInsert</span>(withdrawalReason, option);
     * ... = withdrawalReason.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param withdrawalReason The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(MbWithdrawalReason withdrawalReason, InsertOption<MbWithdrawalReasonCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(withdrawalReason, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * MbWithdrawalReason withdrawalReason = new MbWithdrawalReason();
     * withdrawalReason.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * withdrawalReason.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * withdrawalReason.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;MbWithdrawalReasonCB&gt; option = new UpdateOption&lt;MbWithdrawalReasonCB&gt;();
     *     option.self(new SpecifyQuery&lt;MbWithdrawalReasonCB&gt;() {
     *         public void specify(MbWithdrawalReasonCB cb) {
     *             cb.specify().<span style="color: #DD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     withdrawalReasonBhv.<span style="color: #DD4747">varyingUpdate</span>(withdrawalReason, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param withdrawalReason The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(MbWithdrawalReason withdrawalReason, UpdateOption<MbWithdrawalReasonCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(withdrawalReason, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param withdrawalReason The entity of insert or update. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(MbWithdrawalReason withdrawalReason, InsertOption<MbWithdrawalReasonCB> insertOption, UpdateOption<MbWithdrawalReasonCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInsertOrUpdate(withdrawalReason, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param withdrawalReason The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(MbWithdrawalReason withdrawalReason, DeleteOption<MbWithdrawalReasonCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(withdrawalReason, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param withdrawalReasonList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<MbWithdrawalReason> withdrawalReasonList, InsertOption<MbWithdrawalReasonCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(withdrawalReasonList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param withdrawalReasonList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<MbWithdrawalReason> withdrawalReasonList, UpdateOption<MbWithdrawalReasonCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(withdrawalReasonList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param withdrawalReasonList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<MbWithdrawalReason> withdrawalReasonList, DeleteOption<MbWithdrawalReasonCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(withdrawalReasonList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<MbWithdrawalReason, MbWithdrawalReasonCB> setupper, InsertOption<MbWithdrawalReasonCB> option) {
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
     * MbWithdrawalReason withdrawalReason = new MbWithdrawalReason();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//withdrawalReason.setPK...(value);</span>
     * withdrawalReason.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//withdrawalReason.setVersionNo(value);</span>
     * MbWithdrawalReasonCB cb = new MbWithdrawalReasonCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;MbWithdrawalReasonCB&gt; option = new UpdateOption&lt;MbWithdrawalReasonCB&gt;();
     * option.self(new SpecifyQuery&lt;MbWithdrawalReasonCB&gt;() {
     *     public void specify(MbWithdrawalReasonCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * withdrawalReasonBhv.<span style="color: #DD4747">varyingQueryUpdate</span>(withdrawalReason, cb, option);
     * </pre>
     * @param withdrawalReason The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of MbWithdrawalReason. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(MbWithdrawalReason withdrawalReason, MbWithdrawalReasonCB cb, UpdateOption<MbWithdrawalReasonCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(withdrawalReason, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of MbWithdrawalReason. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(MbWithdrawalReasonCB cb, DeleteOption<MbWithdrawalReasonCB> option) {
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
    public OutsideSqlBasicExecutor<MbWithdrawalReasonBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                       Assist Helper
    //                                                                       =============
    protected Class<MbWithdrawalReason> typeOfSelectedEntity() { return MbWithdrawalReason.class; }
    protected MbWithdrawalReason downcast(Entity et) { return helpEntityDowncastInternally(et, MbWithdrawalReason.class); }
    protected MbWithdrawalReasonCB downcast(ConditionBean cb) { return helpConditionBeanDowncastInternally(cb, MbWithdrawalReasonCB.class); }
    @SuppressWarnings("unchecked")
    protected List<MbWithdrawalReason> downcast(List<? extends Entity> ls) { return (List<MbWithdrawalReason>)ls; }
    @SuppressWarnings("unchecked")
    protected InsertOption<MbWithdrawalReasonCB> downcast(InsertOption<? extends ConditionBean> op) { return (InsertOption<MbWithdrawalReasonCB>)op; }
    @SuppressWarnings("unchecked")
    protected UpdateOption<MbWithdrawalReasonCB> downcast(UpdateOption<? extends ConditionBean> op) { return (UpdateOption<MbWithdrawalReasonCB>)op; }
    @SuppressWarnings("unchecked")
    protected DeleteOption<MbWithdrawalReasonCB> downcast(DeleteOption<? extends ConditionBean> op) { return (DeleteOption<MbWithdrawalReasonCB>)op; }
    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<MbWithdrawalReason, MbWithdrawalReasonCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> sp)
    { return (QueryInsertSetupper<MbWithdrawalReason, MbWithdrawalReasonCB>)sp; }
}
