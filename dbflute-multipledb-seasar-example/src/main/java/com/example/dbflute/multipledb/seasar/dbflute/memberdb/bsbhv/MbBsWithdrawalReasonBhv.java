package com.example.dbflute.multipledb.seasar.dbflute.memberdb.bsbhv;

import java.util.List;

import org.seasar.dbflute.*;
import org.seasar.dbflute.bhv.*;
import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.exception.*;
import org.seasar.dbflute.optional.*;
import org.seasar.dbflute.outsidesql.executor.*;
import com.example.dbflute.multipledb.seasar.dbflute.memberdb.exbhv.*;
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
    /** @return The instance of DBMeta. (NotNull) */
    public DBMeta getDBMeta() { return MbWithdrawalReasonDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public MbWithdrawalReasonDbm getMyDBMeta() { return MbWithdrawalReasonDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public Entity newEntity() { return newMyEntity(); }

    /** {@inheritDoc} */
    public ConditionBean newConditionBean() { return newMyConditionBean(); }

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

    @Override
    protected int doReadCount(ConditionBean cb) {
        return selectCount(downcast(cb));
    }

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
        return doSelectEntity(cb, MbWithdrawalReason.class);
    }

    protected <ENTITY extends MbWithdrawalReason> ENTITY doSelectEntity(MbWithdrawalReasonCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectEntityInternally(cb, tp, new InternalSelectEntityCallback<ENTITY, MbWithdrawalReasonCB>() {
            public List<ENTITY> callbackSelectList(MbWithdrawalReasonCB lcb, Class<ENTITY> ltp) { return doSelectList(lcb, ltp); } });
    }

    protected <ENTITY extends MbWithdrawalReason> OptionalEntity<ENTITY> doSelectOptionalEntity(MbWithdrawalReasonCB cb, Class<ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    @Override
    protected Entity doReadEntity(ConditionBean cb) {
        return selectEntity(downcast(cb));
    }

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
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (point is not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public MbWithdrawalReason selectEntityWithDeletedCheck(MbWithdrawalReasonCB cb) {
        return doSelectEntityWithDeletedCheck(cb, MbWithdrawalReason.class);
    }

    protected <ENTITY extends MbWithdrawalReason> ENTITY doSelectEntityWithDeletedCheck(MbWithdrawalReasonCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectEntityWithDeletedCheckInternally(cb, tp, new InternalSelectEntityWithDeletedCheckCallback<ENTITY, MbWithdrawalReasonCB>() {
            public List<ENTITY> callbackSelectList(MbWithdrawalReasonCB lcb, Class<ENTITY> ltp) { return doSelectList(lcb, ltp); } });
    }

    @Override
    protected Entity doReadEntityWithDeletedCheck(ConditionBean cb) {
        return selectEntityWithDeletedCheck(downcast(cb));
    }

    /**
     * Select the entity by the primary-key value.
     * @param withdrawalReasonCode The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public MbWithdrawalReason selectByPKValue(String withdrawalReasonCode) {
        return doSelectByPKValue(withdrawalReasonCode, MbWithdrawalReason.class);
    }

    protected <ENTITY extends MbWithdrawalReason> ENTITY doSelectByPKValue(String withdrawalReasonCode, Class<ENTITY> entityType) {
        return doSelectEntity(buildPKCB(withdrawalReasonCode), entityType);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param withdrawalReasonCode The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public MbWithdrawalReason selectByPKValueWithDeletedCheck(String withdrawalReasonCode) {
        return doSelectByPKValueWithDeletedCheck(withdrawalReasonCode, MbWithdrawalReason.class);
    }

    protected <ENTITY extends MbWithdrawalReason> ENTITY doSelectByPKValueWithDeletedCheck(String withdrawalReasonCode, Class<ENTITY> entityType) {
        return doSelectEntityWithDeletedCheck(buildPKCB(withdrawalReasonCode), entityType);
    }

    private MbWithdrawalReasonCB buildPKCB(String withdrawalReasonCode) {
        assertObjectNotNull("withdrawalReasonCode", withdrawalReasonCode);
        MbWithdrawalReasonCB cb = newMyConditionBean();
        cb.query().setWithdrawalReasonCode_Equal(withdrawalReasonCode);
        return cb;
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
        return doSelectList(cb, MbWithdrawalReason.class);
    }

    protected <ENTITY extends MbWithdrawalReason> ListResultBean<ENTITY> doSelectList(MbWithdrawalReasonCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        return helpSelectListInternally(cb, tp, new InternalSelectListCallback<ENTITY, MbWithdrawalReasonCB>() {
            public List<ENTITY> callbackSelectList(MbWithdrawalReasonCB lcb, Class<ENTITY> ltp) { return delegateSelectList(lcb, ltp); } });
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
        return doSelectPage(cb, MbWithdrawalReason.class);
    }

    protected <ENTITY extends MbWithdrawalReason> PagingResultBean<ENTITY> doSelectPage(MbWithdrawalReasonCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectPageInternally(cb, tp, new InternalSelectPageCallback<ENTITY, MbWithdrawalReasonCB>() {
            public int callbackSelectCount(MbWithdrawalReasonCB cb) { return doSelectCountPlainly(cb); }
            public List<ENTITY> callbackSelectList(MbWithdrawalReasonCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); }
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
        doSelectCursor(cb, entityRowHandler, MbWithdrawalReason.class);
    }

    protected <ENTITY extends MbWithdrawalReason> void doSelectCursor(MbWithdrawalReasonCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler", handler); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        helpSelectCursorInternally(cb, handler, tp, new InternalSelectCursorCallback<ENTITY, MbWithdrawalReasonCB>() {
            public void callbackSelectCursor(MbWithdrawalReasonCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) { delegateSelectCursor(cb, handler, tp); }
            public List<ENTITY> callbackSelectList(MbWithdrawalReasonCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); }
        });
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
    public <RESULT> SLFunction<MbWithdrawalReasonCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
    }

    protected <RESULT, CB extends MbWithdrawalReasonCB> SLFunction<CB, RESULT> doScalarSelect(Class<RESULT> tp, CB cb) {
        assertObjectNotNull("resultType", tp); assertCBStateValid(cb);
        cb.xsetupForScalarSelect(); cb.getSqlClause().disableSelectIndex(); // for when you use union
        return createSLFunction(cb, tp);
    }

    protected <RESULT, CB extends MbWithdrawalReasonCB> SLFunction<CB, RESULT> createSLFunction(CB cb, Class<RESULT> tp) {
        return new SLFunction<CB, RESULT>(cb, tp);
    }

    protected <RESULT> SLFunction<? extends ConditionBean, RESULT> doReadScalar(Class<RESULT> tp) {
        return doScalarSelect(tp, newMyConditionBean());
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
    public NestedReferrerLoader<MbMemberWithdrawal> loadMemberWithdrawalList(List<MbWithdrawalReason> withdrawalReasonList, ConditionBeanSetupper<MbMemberWithdrawalCB> setupper) {
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
    public NestedReferrerLoader<MbMemberWithdrawal> loadMemberWithdrawalList(MbWithdrawalReason withdrawalReason, ConditionBeanSetupper<MbMemberWithdrawalCB> setupper) {
        xassLRArg(withdrawalReason, setupper);
        return doLoadMemberWithdrawalList(xnewLRLs(withdrawalReason), new LoadReferrerOption<MbMemberWithdrawalCB, MbMemberWithdrawal>().xinit(setupper));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param withdrawalReason The entity of withdrawalReason. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoader<MbMemberWithdrawal> loadMemberWithdrawalList(MbWithdrawalReason withdrawalReason, LoadReferrerOption<MbMemberWithdrawalCB, MbMemberWithdrawal> loadReferrerOption) {
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
    public NestedReferrerLoader<MbMemberWithdrawal> loadMemberWithdrawalList(List<MbWithdrawalReason> withdrawalReasonList, LoadReferrerOption<MbMemberWithdrawalCB, MbMemberWithdrawal> loadReferrerOption) {
        xassLRArg(withdrawalReasonList, loadReferrerOption);
        if (withdrawalReasonList.isEmpty()) { return (NestedReferrerLoader<MbMemberWithdrawal>)EMPTY_LOADER; }
        return doLoadMemberWithdrawalList(withdrawalReasonList, loadReferrerOption);
    }

    protected NestedReferrerLoader<MbMemberWithdrawal> doLoadMemberWithdrawalList(List<MbWithdrawalReason> withdrawalReasonList, LoadReferrerOption<MbMemberWithdrawalCB, MbMemberWithdrawal> option) {
        final MbMemberWithdrawalBhv referrerBhv = xgetBSFLR().select(MbMemberWithdrawalBhv.class);
        return helpLoadReferrerInternally(withdrawalReasonList, option, new InternalLoadReferrerCallback<MbWithdrawalReason, String, MbMemberWithdrawalCB, MbMemberWithdrawal>() {
            public String getPKVal(MbWithdrawalReason et)
            { return et.getWithdrawalReasonCode(); }
            public void setRfLs(MbWithdrawalReason et, List<MbMemberWithdrawal> ls)
            { et.setMemberWithdrawalList(ls); }
            public MbMemberWithdrawalCB newMyCB() { return referrerBhv.newMyConditionBean(); }
            public void qyFKIn(MbMemberWithdrawalCB cb, List<String> ls)
            { cb.query().setWithdrawalReasonCode_InScope(ls); }
            public void qyOdFKAsc(MbMemberWithdrawalCB cb) { cb.query().addOrderBy_WithdrawalReasonCode_Asc(); }
            public void spFKCol(MbMemberWithdrawalCB cb) { cb.specify().columnWithdrawalReasonCode(); }
            public List<MbMemberWithdrawal> selRfLs(MbMemberWithdrawalCB cb) { return referrerBhv.selectList(cb); }
            public String getFKVal(MbMemberWithdrawal re) { return re.getWithdrawalReasonCode(); }
            public void setlcEt(MbMemberWithdrawal re, MbWithdrawalReason le)
            { re.setWithdrawalReason(le); }
            public String getRfPrNm() { return "memberWithdrawalList"; }
        });
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
    public List<String> extractWithdrawalReasonCodeList(List<MbWithdrawalReason> withdrawalReasonList) {
        return helpExtractListInternally(withdrawalReasonList, new InternalExtractCallback<MbWithdrawalReason, String>() {
            public String getCV(MbWithdrawalReason et) { return et.getWithdrawalReasonCode(); }
        });
    }

    /**
     * Extract the value list of (single) unique key displayOrder.
     * @param withdrawalReasonList The list of withdrawalReason. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Integer> extractDisplayOrderList(List<MbWithdrawalReason> withdrawalReasonList) {
        return helpExtractListInternally(withdrawalReasonList, new InternalExtractCallback<MbWithdrawalReason, Integer>() {
            public Integer getCV(MbWithdrawalReason et) { return et.getDisplayOrder(); }
        });
    }

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
     * @param withdrawalReason The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(MbWithdrawalReason withdrawalReason) {
        doInsert(withdrawalReason, null);
    }

    protected void doInsert(MbWithdrawalReason withdrawalReason, InsertOption<MbWithdrawalReasonCB> op) {
        assertObjectNotNull("withdrawalReason", withdrawalReason);
        prepareInsertOption(op);
        delegateInsert(withdrawalReason, op);
    }

    protected void prepareInsertOption(InsertOption<MbWithdrawalReasonCB> op) {
        if (op == null) { return; }
        assertInsertOptionStatus(op);
        if (op.hasSpecifiedInsertColumn()) {
            op.resolveInsertColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    @Override
    protected void doCreate(Entity et, InsertOption<? extends ConditionBean> op) {
        if (op == null) { insert(downcast(et)); }
        else { varyingInsert(downcast(et), downcast(op)); }
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * MbWithdrawalReason withdrawalReason = new MbWithdrawalReason();
     * withdrawalReason.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * withdrawalReason.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//withdrawalReason.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//withdrawalReason.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * withdrawalReason.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     withdrawalReasonBhv.<span style="color: #DD4747">update</span>(withdrawalReason);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param withdrawalReason The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(final MbWithdrawalReason withdrawalReason) {
        doUpdate(withdrawalReason, null);
    }

    protected void doUpdate(MbWithdrawalReason withdrawalReason, final UpdateOption<MbWithdrawalReasonCB> op) {
        assertObjectNotNull("withdrawalReason", withdrawalReason);
        prepareUpdateOption(op);
        helpUpdateInternally(withdrawalReason, new InternalUpdateCallback<MbWithdrawalReason>() {
            public int callbackDelegateUpdate(MbWithdrawalReason et) { return delegateUpdate(et, op); } });
    }

    protected void prepareUpdateOption(UpdateOption<MbWithdrawalReasonCB> op) {
        if (op == null) { return; }
        assertUpdateOptionStatus(op);
        if (op.hasSelfSpecification()) {
            op.resolveSelfSpecification(createCBForVaryingUpdate());
        }
        if (op.hasSpecifiedUpdateColumn()) {
            op.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    protected MbWithdrawalReasonCB createCBForVaryingUpdate() {
        MbWithdrawalReasonCB cb = newMyConditionBean();
        cb.xsetupForVaryingUpdate();
        return cb;
    }

    protected MbWithdrawalReasonCB createCBForSpecifiedUpdate() {
        MbWithdrawalReasonCB cb = newMyConditionBean();
        cb.xsetupForSpecifiedUpdate();
        return cb;
    }

    @Override
    protected void doModify(Entity et, UpdateOption<? extends ConditionBean> op) {
        if (op == null) { update(downcast(et)); }
        else { varyingUpdate(downcast(et), downcast(op)); }
    }

    @Override
    protected void doModifyNonstrict(Entity et, UpdateOption<? extends ConditionBean> op) {
        doModify(et, op);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br />
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br />
     * <p><span style="color: #DD4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param withdrawalReason The entity of insert or update target. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(MbWithdrawalReason withdrawalReason) {
        doInesrtOrUpdate(withdrawalReason, null, null);
    }

    protected void doInesrtOrUpdate(MbWithdrawalReason withdrawalReason, final InsertOption<MbWithdrawalReasonCB> iop, final UpdateOption<MbWithdrawalReasonCB> uop) {
        helpInsertOrUpdateInternally(withdrawalReason, new InternalInsertOrUpdateCallback<MbWithdrawalReason, MbWithdrawalReasonCB>() {
            public void callbackInsert(MbWithdrawalReason et) { doInsert(et, iop); }
            public void callbackUpdate(MbWithdrawalReason et) { doUpdate(et, uop); }
            public MbWithdrawalReasonCB callbackNewMyConditionBean() { return newMyConditionBean(); }
            public int callbackSelectCount(MbWithdrawalReasonCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrModify(Entity et, InsertOption<? extends ConditionBean> iop, UpdateOption<? extends ConditionBean> uop) {
        if (iop == null && uop == null) { insertOrUpdate(downcast(et)); }
        else {
            iop = iop != null ? iop : new InsertOption<MbWithdrawalReasonCB>();
            uop = uop != null ? uop : new UpdateOption<MbWithdrawalReasonCB>();
            varyingInsertOrUpdate(downcast(et), downcast(iop), downcast(uop));
        }
    }

    @Override
    protected void doCreateOrModifyNonstrict(Entity et, InsertOption<? extends ConditionBean> iop, UpdateOption<? extends ConditionBean> uop) {
        doCreateOrModify(et, iop, uop);
    }

    /**
     * Delete the entity. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * MbWithdrawalReason withdrawalReason = new MbWithdrawalReason();
     * withdrawalReason.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * withdrawalReason.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     withdrawalReasonBhv.<span style="color: #DD4747">delete</span>(withdrawalReason);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param withdrawalReason The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(MbWithdrawalReason withdrawalReason) {
        doDelete(withdrawalReason, null);
    }

    protected void doDelete(MbWithdrawalReason withdrawalReason, final DeleteOption<MbWithdrawalReasonCB> op) {
        assertObjectNotNull("withdrawalReason", withdrawalReason);
        prepareDeleteOption(op);
        helpDeleteInternally(withdrawalReason, new InternalDeleteCallback<MbWithdrawalReason>() {
            public int callbackDelegateDelete(MbWithdrawalReason et) { return delegateDelete(et, op); } });
    }

    protected void prepareDeleteOption(DeleteOption<MbWithdrawalReasonCB> op) {
        if (op == null) { return; }
        assertDeleteOptionStatus(op);
    }

    @Override
    protected void doRemove(Entity et, DeleteOption<? extends ConditionBean> op) {
        if (op == null) { delete(downcast(et)); }
        else { varyingDelete(downcast(et), downcast(op)); }
    }

    @Override
    protected void doRemoveNonstrict(Entity et, DeleteOption<? extends ConditionBean> op) {
        doRemove(et, op);
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
        InsertOption<MbWithdrawalReasonCB> op = createInsertUpdateOption();
        return doBatchInsert(withdrawalReasonList, op);
    }

    protected int[] doBatchInsert(List<MbWithdrawalReason> withdrawalReasonList, InsertOption<MbWithdrawalReasonCB> op) {
        assertObjectNotNull("withdrawalReasonList", withdrawalReasonList);
        prepareBatchInsertOption(withdrawalReasonList, op);
        return delegateBatchInsert(withdrawalReasonList, op);
    }

    protected void prepareBatchInsertOption(List<MbWithdrawalReason> withdrawalReasonList, InsertOption<MbWithdrawalReasonCB> op) {
        op.xallowInsertColumnModifiedPropertiesFragmented();
        op.xacceptInsertColumnModifiedPropertiesIfNeeds(withdrawalReasonList);
        prepareInsertOption(op);
    }

    @Override
    protected int[] doLumpCreate(List<Entity> ls, InsertOption<? extends ConditionBean> op) {
        if (op == null) { return batchInsert(downcast(ls)); }
        else { return varyingBatchInsert(downcast(ls), downcast(op)); }
    }

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
        UpdateOption<MbWithdrawalReasonCB> op = createPlainUpdateOption();
        return doBatchUpdate(withdrawalReasonList, op);
    }

    protected int[] doBatchUpdate(List<MbWithdrawalReason> withdrawalReasonList, UpdateOption<MbWithdrawalReasonCB> op) {
        assertObjectNotNull("withdrawalReasonList", withdrawalReasonList);
        prepareBatchUpdateOption(withdrawalReasonList, op);
        return delegateBatchUpdate(withdrawalReasonList, op);
    }

    protected void prepareBatchUpdateOption(List<MbWithdrawalReason> withdrawalReasonList, UpdateOption<MbWithdrawalReasonCB> op) {
        op.xacceptUpdateColumnModifiedPropertiesIfNeeds(withdrawalReasonList);
        prepareUpdateOption(op);
    }

    @Override
    protected int[] doLumpModify(List<Entity> ls, UpdateOption<? extends ConditionBean> op) {
        if (op == null) { return batchUpdate(downcast(ls)); }
        else { return varyingBatchUpdate(downcast(ls), downcast(op)); }
    }

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
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> op) {
        return doLumpModify(ls, op);
    }

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

    protected int[] doBatchDelete(List<MbWithdrawalReason> withdrawalReasonList, DeleteOption<MbWithdrawalReasonCB> op) {
        assertObjectNotNull("withdrawalReasonList", withdrawalReasonList);
        prepareDeleteOption(op);
        return delegateBatchDelete(withdrawalReasonList, op);
    }

    @Override
    protected int[] doLumpRemove(List<Entity> ls, DeleteOption<? extends ConditionBean> op) {
        if (op == null) { return batchDelete(downcast(ls)); }
        else { return varyingBatchDelete(downcast(ls), downcast(op)); }
    }

    @Override
    protected int[] doLumpRemoveNonstrict(List<Entity> ls, DeleteOption<? extends ConditionBean> op) {
        return doLumpRemove(ls, op);
    }

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
    public int queryInsert(QueryInsertSetupper<MbWithdrawalReason, MbWithdrawalReasonCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(QueryInsertSetupper<MbWithdrawalReason, MbWithdrawalReasonCB> sp, InsertOption<MbWithdrawalReasonCB> op) {
        assertObjectNotNull("setupper", sp);
        prepareInsertOption(op);
        MbWithdrawalReason e = new MbWithdrawalReason();
        MbWithdrawalReasonCB cb = createCBForQueryInsert();
        return delegateQueryInsert(e, cb, sp.setup(e, cb), op);
    }

    protected MbWithdrawalReasonCB createCBForQueryInsert() {
        MbWithdrawalReasonCB cb = newMyConditionBean();
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
     * MbWithdrawalReason withdrawalReason = new MbWithdrawalReason();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//withdrawalReason.setPK...(value);</span>
     * withdrawalReason.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//withdrawalReason.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//withdrawalReason.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
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

    protected int doQueryUpdate(MbWithdrawalReason withdrawalReason, MbWithdrawalReasonCB cb, UpdateOption<MbWithdrawalReasonCB> op) {
        assertObjectNotNull("withdrawalReason", withdrawalReason); assertCBStateValid(cb);
        prepareUpdateOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryUpdate(withdrawalReason, cb, op) : 0;
    }

    @Override
    protected int doRangeModify(Entity et, ConditionBean cb, UpdateOption<? extends ConditionBean> op) {
        if (op == null) { return queryUpdate(downcast(et), (MbWithdrawalReasonCB)cb); }
        else { return varyingQueryUpdate(downcast(et), (MbWithdrawalReasonCB)cb, downcast(op)); }
    }

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
        assertCBStateValid(cb);
        prepareDeleteOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryDelete(cb, op) : 0;
    }

    @Override
    protected int doRangeRemove(ConditionBean cb, DeleteOption<? extends ConditionBean> op) {
        if (op == null) { return queryDelete((MbWithdrawalReasonCB)cb); }
        else { return varyingQueryDelete((MbWithdrawalReasonCB)cb, downcast(op)); }
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
     * @param withdrawalReason The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
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
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
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
     * @param withdrawalReason The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
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
     * @param withdrawalReason The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(MbWithdrawalReason withdrawalReason, InsertOption<MbWithdrawalReasonCB> insertOption, UpdateOption<MbWithdrawalReasonCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdate(withdrawalReason, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param withdrawalReason The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
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
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
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
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCountUniquely(MbWithdrawalReasonCB cb) { return invoke(createSelectCountCBCommand(cb, true)); }
    protected int delegateSelectCountPlainly(MbWithdrawalReasonCB cb) { return invoke(createSelectCountCBCommand(cb, false)); }
    protected <ENTITY extends MbWithdrawalReason> void delegateSelectCursor(MbWithdrawalReasonCB cb, EntityRowHandler<ENTITY> rh, Class<ENTITY> tp)
    { invoke(createSelectCursorCBCommand(cb, rh, tp)); }
    protected <ENTITY extends MbWithdrawalReason> List<ENTITY> delegateSelectList(MbWithdrawalReasonCB cb, Class<ENTITY> tp)
    { return invoke(createSelectListCBCommand(cb, tp)); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(MbWithdrawalReason et, InsertOption<MbWithdrawalReasonCB> op)
    { if (!processBeforeInsert(et, op)) { return 0; }
      return invoke(createInsertEntityCommand(et, op)); }
    protected int delegateUpdate(MbWithdrawalReason et, UpdateOption<MbWithdrawalReasonCB> op)
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return delegateUpdateNonstrict(et, op); }
    protected int delegateUpdateNonstrict(MbWithdrawalReason et, UpdateOption<MbWithdrawalReasonCB> op)
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return invoke(createUpdateNonstrictEntityCommand(et, op)); }
    protected int delegateDelete(MbWithdrawalReason et, DeleteOption<MbWithdrawalReasonCB> op)
    { if (!processBeforeDelete(et, op)) { return 0; }
      return delegateDeleteNonstrict(et, op); }
    protected int delegateDeleteNonstrict(MbWithdrawalReason et, DeleteOption<MbWithdrawalReasonCB> op)
    { if (!processBeforeDelete(et, op)) { return 0; }
      return invoke(createDeleteNonstrictEntityCommand(et, op)); }

    protected int[] delegateBatchInsert(List<MbWithdrawalReason> ls, InsertOption<MbWithdrawalReasonCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchInsertCommand(processBatchInternally(ls, op), op)); }
    protected int[] delegateBatchUpdate(List<MbWithdrawalReason> ls, UpdateOption<MbWithdrawalReasonCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchUpdateNonstrict(ls, op); }
    protected int[] delegateBatchUpdateNonstrict(List<MbWithdrawalReason> ls, UpdateOption<MbWithdrawalReasonCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateNonstrictCommand(processBatchInternally(ls, op, true), op)); }
    protected int[] delegateBatchDelete(List<MbWithdrawalReason> ls, DeleteOption<MbWithdrawalReasonCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchDeleteNonstrict(ls, op); }
    protected int[] delegateBatchDeleteNonstrict(List<MbWithdrawalReason> ls, DeleteOption<MbWithdrawalReasonCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteNonstrictCommand(processBatchInternally(ls, op, true), op)); }

    protected int delegateQueryInsert(MbWithdrawalReason et, MbWithdrawalReasonCB inCB, ConditionBean resCB, InsertOption<MbWithdrawalReasonCB> op)
    { if (!processBeforeQueryInsert(et, inCB, resCB, op)) { return 0; } return invoke(createQueryInsertCBCommand(et, inCB, resCB, op));  }
    protected int delegateQueryUpdate(MbWithdrawalReason et, MbWithdrawalReasonCB cb, UpdateOption<MbWithdrawalReasonCB> op)
    { if (!processBeforeQueryUpdate(et, cb, op)) { return 0; } return invoke(createQueryUpdateCBCommand(et, cb, op));  }
    protected int delegateQueryDelete(MbWithdrawalReasonCB cb, DeleteOption<MbWithdrawalReasonCB> op)
    { if (!processBeforeQueryDelete(cb, op)) { return 0; } return invoke(createQueryDeleteCBCommand(cb, op));  }

    // ===================================================================================
    //                                                                Optimistic Lock Info
    //                                                                ====================
    /**
     * {@inheritDoc}
     */
    @Override
    protected boolean hasVersionNoValue(Entity et) {
        return false;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected boolean hasUpdateDateValue(Entity et) {
        return false;
    }

    // ===================================================================================
    //                                                                     Downcast Helper
    //                                                                     ===============
    protected MbWithdrawalReason downcast(Entity et) {
        return helpEntityDowncastInternally(et, MbWithdrawalReason.class);
    }

    protected MbWithdrawalReasonCB downcast(ConditionBean cb) {
        return helpConditionBeanDowncastInternally(cb, MbWithdrawalReasonCB.class);
    }

    @SuppressWarnings("unchecked")
    protected List<MbWithdrawalReason> downcast(List<? extends Entity> ls) {
        return (List<MbWithdrawalReason>)ls;
    }

    @SuppressWarnings("unchecked")
    protected InsertOption<MbWithdrawalReasonCB> downcast(InsertOption<? extends ConditionBean> op) {
        return (InsertOption<MbWithdrawalReasonCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected UpdateOption<MbWithdrawalReasonCB> downcast(UpdateOption<? extends ConditionBean> op) {
        return (UpdateOption<MbWithdrawalReasonCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected DeleteOption<MbWithdrawalReasonCB> downcast(DeleteOption<? extends ConditionBean> op) {
        return (DeleteOption<MbWithdrawalReasonCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<MbWithdrawalReason, MbWithdrawalReasonCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> sp) {
        return (QueryInsertSetupper<MbWithdrawalReason, MbWithdrawalReasonCB>)sp;
    }
}
