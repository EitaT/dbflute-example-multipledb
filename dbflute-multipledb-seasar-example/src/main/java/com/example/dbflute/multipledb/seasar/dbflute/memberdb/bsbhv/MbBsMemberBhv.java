package com.example.dbflute.multipledb.seasar.dbflute.memberdb.bsbhv;

import java.util.List;

import org.seasar.dbflute.*;
import org.seasar.dbflute.bhv.*;
import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.outsidesql.executor.*;
import com.example.dbflute.multipledb.seasar.dbflute.memberdb.exbhv.*;
import com.example.dbflute.multipledb.seasar.dbflute.memberdb.exentity.*;
import com.example.dbflute.multipledb.seasar.dbflute.memberdb.bsentity.dbmeta.*;
import com.example.dbflute.multipledb.seasar.dbflute.memberdb.cbean.*;

/**
 * The behavior of MEMBER as TABLE. <br />
 * <pre>
 * [primary key]
 *     MEMBER_ID
 *
 * [column]
 *     MEMBER_ID, MEMBER_NAME, MEMBER_ACCOUNT, MEMBER_STATUS_CODE, FORMALIZED_DATETIME, BIRTHDATE, REGISTER_DATETIME, REGISTER_USER, UPDATE_DATETIME, UPDATE_USER, VERSION_NO
 *
 * [sequence]
 *     
 *
 * [identity]
 *     MEMBER_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     MEMBER_STATUS, MEMBER_LOGIN(AsLatest), MEMBER_SECURITY(AsOne), MEMBER_SERVICE(AsOne), MEMBER_WITHDRAWAL(AsOne)
 *
 * [referrer table]
 *     MEMBER_ADDRESS, MEMBER_LOGIN, PURCHASE, MEMBER_SECURITY, MEMBER_SERVICE, MEMBER_WITHDRAWAL
 *
 * [foreign property]
 *     memberStatus, memberLoginAsLatest, memberSecurityAsOne, memberServiceAsOne, memberWithdrawalAsOne
 *
 * [referrer property]
 *     memberAddressList, memberLoginList, purchaseList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class MbBsMemberBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    public static final String PATH_selectLatestFormalizedDatetime = "selectLatestFormalizedDatetime";
    public static final String PATH_selectMemberName = "selectMemberName";
    public static final String PATH_selectOptionMember = "selectOptionMember";
    public static final String PATH_selectPurchaseMaxPriceMember = "selectPurchaseMaxPriceMember";
    public static final String PATH_selectPurchaseSummaryMember = "selectPurchaseSummaryMember";
    public static final String PATH_selectSimpleMember = "selectSimpleMember";
    public static final String PATH_selectUnpaidSummaryMember = "selectUnpaidSummaryMember";
    public static final String PATH_updateForcedWithdrawal = "updateForcedWithdrawal";
    public static final String PATH_various_pmbcheck_selectResolvedPackageName = "various:pmbcheck:selectResolvedPackageName";
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "MEMBER"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public DBMeta getDBMeta() { return MbMemberDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public MbMemberDbm getMyDBMeta() { return MbMemberDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public Entity newEntity() { return newMyEntity(); }

    /** {@inheritDoc} */
    public ConditionBean newConditionBean() { return newMyConditionBean(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public MbMember newMyEntity() { return new MbMember(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public MbMemberCB newMyConditionBean() { return new MbMemberCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * MbMemberCB cb = new MbMemberCB();
     * cb.query().setFoo...(value);
     * int count = memberBhv.<span style="color: #FD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of MbMember. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(MbMemberCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(MbMemberCB cb) { // called by selectCount(cb)
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(MbMemberCB cb) { // called by selectPage(cb)
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
     * MbMemberCB cb = new MbMemberCB();
     * cb.query().setFoo...(value);
     * MbMember member = memberBhv.<span style="color: #FD4747">selectEntity</span>(cb);
     * if (member != null) {
     *     ... = member.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of MbMember. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public MbMember selectEntity(MbMemberCB cb) {
        return doSelectEntity(cb, MbMember.class);
    }

    protected <ENTITY extends MbMember> ENTITY doSelectEntity(final MbMemberCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb);
        return helpSelectEntityInternally(cb, tp, new InternalSelectEntityCallback<ENTITY, MbMemberCB>() {
            public List<ENTITY> callbackSelectList(MbMemberCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); } });
    }

    @Override
    protected Entity doReadEntity(ConditionBean cb) {
        return selectEntity(downcast(cb));
    }

    /**
     * Select the entity by the condition-bean with deleted check.
     * <pre>
     * MbMemberCB cb = new MbMemberCB();
     * cb.query().setFoo...(value);
     * MbMember member = memberBhv.<span style="color: #FD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = member.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of MbMember. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public MbMember selectEntityWithDeletedCheck(MbMemberCB cb) {
        return doSelectEntityWithDeletedCheck(cb, MbMember.class);
    }

    protected <ENTITY extends MbMember> ENTITY doSelectEntityWithDeletedCheck(final MbMemberCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb);
        return helpSelectEntityWithDeletedCheckInternally(cb, tp, new InternalSelectEntityWithDeletedCheckCallback<ENTITY, MbMemberCB>() {
            public List<ENTITY> callbackSelectList(MbMemberCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); } });
    }

    @Override
    protected Entity doReadEntityWithDeletedCheck(ConditionBean cb) {
        return selectEntityWithDeletedCheck(downcast(cb));
    }

    /**
     * Select the entity by the primary-key value.
     * @param memberId The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public MbMember selectByPKValue(Integer memberId) {
        return doSelectByPKValue(memberId, MbMember.class);
    }

    protected <ENTITY extends MbMember> ENTITY doSelectByPKValue(Integer memberId, Class<ENTITY> entityType) {
        return doSelectEntity(buildPKCB(memberId), entityType);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param memberId The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public MbMember selectByPKValueWithDeletedCheck(Integer memberId) {
        return doSelectByPKValueWithDeletedCheck(memberId, MbMember.class);
    }

    protected <ENTITY extends MbMember> ENTITY doSelectByPKValueWithDeletedCheck(Integer memberId, Class<ENTITY> entityType) {
        return doSelectEntityWithDeletedCheck(buildPKCB(memberId), entityType);
    }

    private MbMemberCB buildPKCB(Integer memberId) {
        assertObjectNotNull("memberId", memberId);
        MbMemberCB cb = newMyConditionBean();
        cb.query().setMemberId_Equal(memberId);
        return cb;
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * MbMemberCB cb = new MbMemberCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;MbMember&gt; memberList = memberBhv.<span style="color: #FD4747">selectList</span>(cb);
     * for (MbMember member : memberList) {
     *     ... = member.get...();
     * }
     * </pre>
     * @param cb The condition-bean of MbMember. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<MbMember> selectList(MbMemberCB cb) {
        return doSelectList(cb, MbMember.class);
    }

    protected <ENTITY extends MbMember> ListResultBean<ENTITY> doSelectList(MbMemberCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        return helpSelectListInternally(cb, tp, new InternalSelectListCallback<ENTITY, MbMemberCB>() {
            public List<ENTITY> callbackSelectList(MbMemberCB cb, Class<ENTITY> tp) { return delegateSelectList(cb, tp); } });
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
     * MbMemberCB cb = new MbMemberCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #FD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;MbMember&gt; page = memberBhv.<span style="color: #FD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (MbMember member : page) {
     *     ... = member.get...();
     * }
     * </pre>
     * @param cb The condition-bean of MbMember. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<MbMember> selectPage(MbMemberCB cb) {
        return doSelectPage(cb, MbMember.class);
    }

    protected <ENTITY extends MbMember> PagingResultBean<ENTITY> doSelectPage(MbMemberCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectPageInternally(cb, tp, new InternalSelectPageCallback<ENTITY, MbMemberCB>() {
            public int callbackSelectCount(MbMemberCB cb) { return doSelectCountPlainly(cb); }
            public List<ENTITY> callbackSelectList(MbMemberCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); }
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
     * MbMemberCB cb = new MbMemberCB();
     * cb.query().setFoo...(value);
     * memberBhv.<span style="color: #FD4747">selectCursor</span>(cb, new EntityRowHandler&lt;MbMember&gt;() {
     *     public void handle(MbMember entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of MbMember. (NotNull)
     * @param entityRowHandler The handler of entity row of MbMember. (NotNull)
     */
    public void selectCursor(MbMemberCB cb, EntityRowHandler<MbMember> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, MbMember.class);
    }

    protected <ENTITY extends MbMember> void doSelectCursor(MbMemberCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler", handler); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        helpSelectCursorInternally(cb, handler, tp, new InternalSelectCursorCallback<ENTITY, MbMemberCB>() {
            public void callbackSelectCursor(MbMemberCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) { delegateSelectCursor(cb, handler, tp); }
            public List<ENTITY> callbackSelectList(MbMemberCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); }
        });
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * memberBhv.<span style="color: #FD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(MbMemberCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> SLFunction<MbMemberCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
    }

    protected <RESULT, CB extends MbMemberCB> SLFunction<CB, RESULT> doScalarSelect(Class<RESULT> tp, CB cb) {
        assertObjectNotNull("resultType", tp); assertCBStateValid(cb);
        cb.xsetupForScalarSelect(); cb.getSqlClause().disableSelectIndex(); // for when you use union
        return createSLFunction(cb, tp);
    }

    protected <RESULT, CB extends MbMemberCB> SLFunction<CB, RESULT> createSLFunction(CB cb, Class<RESULT> tp) {
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
     * {Refer to overload method that has an argument of the list of entity.}
     * @param member The entity of member. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     */
    public void loadMemberAddressList(MbMember member, ConditionBeanSetupper<MbMemberAddressCB> conditionBeanSetupper) {
        xassLRArg(member, conditionBeanSetupper);
        loadMemberAddressList(xnewLRLs(member), conditionBeanSetupper);
    }
    /**
     * Load referrer of memberAddressList with the set-upper for condition-bean of referrer. <br />
     * MEMBER_ADDRESS by MEMBER_ID, named 'memberAddressList'.
     * <pre>
     * memberBhv.<span style="color: #FD4747">loadMemberAddressList</span>(memberList, new ConditionBeanSetupper&lt;MbMemberAddressCB&gt;() {
     *     public void setup(MbMemberAddressCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...(); <span style="color: #3F7E5E">// basically you should order referrer list</span>
     *     }
     * });
     * for (MbMember member : memberList) {
     *     ... = member.<span style="color: #FD4747">getMemberAddressList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key(and others too) is treated as case-insensitive. <br />
     * The condition-bean that the set-upper provides have settings before you touch it. It is as follows:
     * <pre>
     * cb.query().setMemberId_InScope(pkList);
     * cb.query().addOrderBy_MemberId_Asc();
     * </pre>
     * @param memberList The entity list of member. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     */
    public void loadMemberAddressList(List<MbMember> memberList, ConditionBeanSetupper<MbMemberAddressCB> conditionBeanSetupper) {
        xassLRArg(memberList, conditionBeanSetupper);
        loadMemberAddressList(memberList, new LoadReferrerOption<MbMemberAddressCB, MbMemberAddress>().xinit(conditionBeanSetupper));
    }
    /**
     * {Refer to overload method that has an argument of the list of entity.}
     * @param member The entity of member. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadMemberAddressList(MbMember member, LoadReferrerOption<MbMemberAddressCB, MbMemberAddress> loadReferrerOption) {
        xassLRArg(member, loadReferrerOption);
        loadMemberAddressList(xnewLRLs(member), loadReferrerOption);
    }
    /**
     * {Refer to overload method that has an argument of condition-bean setupper.}
     * @param memberList The entity list of member. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadMemberAddressList(List<MbMember> memberList, LoadReferrerOption<MbMemberAddressCB, MbMemberAddress> loadReferrerOption) {
        xassLRArg(memberList, loadReferrerOption);
        if (memberList.isEmpty()) { return; }
        final MbMemberAddressBhv referrerBhv = xgetBSFLR().select(MbMemberAddressBhv.class);
        helpLoadReferrerInternally(memberList, loadReferrerOption, new InternalLoadReferrerCallback<MbMember, Integer, MbMemberAddressCB, MbMemberAddress>() {
            public Integer getPKVal(MbMember et)
            { return et.getMemberId(); }
            public void setRfLs(MbMember et, List<MbMemberAddress> ls)
            { et.setMemberAddressList(ls); }
            public MbMemberAddressCB newMyCB() { return referrerBhv.newMyConditionBean(); }
            public void qyFKIn(MbMemberAddressCB cb, List<Integer> ls)
            { cb.query().setMemberId_InScope(ls); }
            public void qyOdFKAsc(MbMemberAddressCB cb) { cb.query().addOrderBy_MemberId_Asc(); }
            public void spFKCol(MbMemberAddressCB cb) { cb.specify().columnMemberId(); }
            public List<MbMemberAddress> selRfLs(MbMemberAddressCB cb) { return referrerBhv.selectList(cb); }
            public Integer getFKVal(MbMemberAddress re) { return re.getMemberId(); }
            public void setlcEt(MbMemberAddress re, MbMember le)
            { re.setMember(le); }
            public String getRfPrNm() { return "memberAddressList"; }
        });
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.}
     * @param member The entity of member. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     */
    public void loadMemberLoginList(MbMember member, ConditionBeanSetupper<MbMemberLoginCB> conditionBeanSetupper) {
        xassLRArg(member, conditionBeanSetupper);
        loadMemberLoginList(xnewLRLs(member), conditionBeanSetupper);
    }
    /**
     * Load referrer of memberLoginList with the set-upper for condition-bean of referrer. <br />
     * MEMBER_LOGIN by MEMBER_ID, named 'memberLoginList'.
     * <pre>
     * memberBhv.<span style="color: #FD4747">loadMemberLoginList</span>(memberList, new ConditionBeanSetupper&lt;MbMemberLoginCB&gt;() {
     *     public void setup(MbMemberLoginCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...(); <span style="color: #3F7E5E">// basically you should order referrer list</span>
     *     }
     * });
     * for (MbMember member : memberList) {
     *     ... = member.<span style="color: #FD4747">getMemberLoginList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key(and others too) is treated as case-insensitive. <br />
     * The condition-bean that the set-upper provides have settings before you touch it. It is as follows:
     * <pre>
     * cb.query().setMemberId_InScope(pkList);
     * cb.query().addOrderBy_MemberId_Asc();
     * </pre>
     * @param memberList The entity list of member. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     */
    public void loadMemberLoginList(List<MbMember> memberList, ConditionBeanSetupper<MbMemberLoginCB> conditionBeanSetupper) {
        xassLRArg(memberList, conditionBeanSetupper);
        loadMemberLoginList(memberList, new LoadReferrerOption<MbMemberLoginCB, MbMemberLogin>().xinit(conditionBeanSetupper));
    }
    /**
     * {Refer to overload method that has an argument of the list of entity.}
     * @param member The entity of member. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadMemberLoginList(MbMember member, LoadReferrerOption<MbMemberLoginCB, MbMemberLogin> loadReferrerOption) {
        xassLRArg(member, loadReferrerOption);
        loadMemberLoginList(xnewLRLs(member), loadReferrerOption);
    }
    /**
     * {Refer to overload method that has an argument of condition-bean setupper.}
     * @param memberList The entity list of member. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadMemberLoginList(List<MbMember> memberList, LoadReferrerOption<MbMemberLoginCB, MbMemberLogin> loadReferrerOption) {
        xassLRArg(memberList, loadReferrerOption);
        if (memberList.isEmpty()) { return; }
        final MbMemberLoginBhv referrerBhv = xgetBSFLR().select(MbMemberLoginBhv.class);
        helpLoadReferrerInternally(memberList, loadReferrerOption, new InternalLoadReferrerCallback<MbMember, Integer, MbMemberLoginCB, MbMemberLogin>() {
            public Integer getPKVal(MbMember et)
            { return et.getMemberId(); }
            public void setRfLs(MbMember et, List<MbMemberLogin> ls)
            { et.setMemberLoginList(ls); }
            public MbMemberLoginCB newMyCB() { return referrerBhv.newMyConditionBean(); }
            public void qyFKIn(MbMemberLoginCB cb, List<Integer> ls)
            { cb.query().setMemberId_InScope(ls); }
            public void qyOdFKAsc(MbMemberLoginCB cb) { cb.query().addOrderBy_MemberId_Asc(); }
            public void spFKCol(MbMemberLoginCB cb) { cb.specify().columnMemberId(); }
            public List<MbMemberLogin> selRfLs(MbMemberLoginCB cb) { return referrerBhv.selectList(cb); }
            public Integer getFKVal(MbMemberLogin re) { return re.getMemberId(); }
            public void setlcEt(MbMemberLogin re, MbMember le)
            { re.setMember(le); }
            public String getRfPrNm() { return "memberLoginList"; }
        });
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.}
     * @param member The entity of member. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     */
    public void loadPurchaseList(MbMember member, ConditionBeanSetupper<MbPurchaseCB> conditionBeanSetupper) {
        xassLRArg(member, conditionBeanSetupper);
        loadPurchaseList(xnewLRLs(member), conditionBeanSetupper);
    }
    /**
     * Load referrer of purchaseList with the set-upper for condition-bean of referrer. <br />
     * PURCHASE by MEMBER_ID, named 'purchaseList'.
     * <pre>
     * memberBhv.<span style="color: #FD4747">loadPurchaseList</span>(memberList, new ConditionBeanSetupper&lt;MbPurchaseCB&gt;() {
     *     public void setup(MbPurchaseCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...(); <span style="color: #3F7E5E">// basically you should order referrer list</span>
     *     }
     * });
     * for (MbMember member : memberList) {
     *     ... = member.<span style="color: #FD4747">getPurchaseList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key(and others too) is treated as case-insensitive. <br />
     * The condition-bean that the set-upper provides have settings before you touch it. It is as follows:
     * <pre>
     * cb.query().setMemberId_InScope(pkList);
     * cb.query().addOrderBy_MemberId_Asc();
     * </pre>
     * @param memberList The entity list of member. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     */
    public void loadPurchaseList(List<MbMember> memberList, ConditionBeanSetupper<MbPurchaseCB> conditionBeanSetupper) {
        xassLRArg(memberList, conditionBeanSetupper);
        loadPurchaseList(memberList, new LoadReferrerOption<MbPurchaseCB, MbPurchase>().xinit(conditionBeanSetupper));
    }
    /**
     * {Refer to overload method that has an argument of the list of entity.}
     * @param member The entity of member. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadPurchaseList(MbMember member, LoadReferrerOption<MbPurchaseCB, MbPurchase> loadReferrerOption) {
        xassLRArg(member, loadReferrerOption);
        loadPurchaseList(xnewLRLs(member), loadReferrerOption);
    }
    /**
     * {Refer to overload method that has an argument of condition-bean setupper.}
     * @param memberList The entity list of member. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadPurchaseList(List<MbMember> memberList, LoadReferrerOption<MbPurchaseCB, MbPurchase> loadReferrerOption) {
        xassLRArg(memberList, loadReferrerOption);
        if (memberList.isEmpty()) { return; }
        final MbPurchaseBhv referrerBhv = xgetBSFLR().select(MbPurchaseBhv.class);
        helpLoadReferrerInternally(memberList, loadReferrerOption, new InternalLoadReferrerCallback<MbMember, Integer, MbPurchaseCB, MbPurchase>() {
            public Integer getPKVal(MbMember et)
            { return et.getMemberId(); }
            public void setRfLs(MbMember et, List<MbPurchase> ls)
            { et.setPurchaseList(ls); }
            public MbPurchaseCB newMyCB() { return referrerBhv.newMyConditionBean(); }
            public void qyFKIn(MbPurchaseCB cb, List<Integer> ls)
            { cb.query().setMemberId_InScope(ls); }
            public void qyOdFKAsc(MbPurchaseCB cb) { cb.query().addOrderBy_MemberId_Asc(); }
            public void spFKCol(MbPurchaseCB cb) { cb.specify().columnMemberId(); }
            public List<MbPurchase> selRfLs(MbPurchaseCB cb) { return referrerBhv.selectList(cb); }
            public Integer getFKVal(MbPurchase re) { return re.getMemberId(); }
            public void setlcEt(MbPurchase re, MbMember le)
            { re.setMember(le); }
            public String getRfPrNm() { return "purchaseList"; }
        });
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'MbMemberStatus'.
     * @param memberList The list of member. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MbMemberStatus> pulloutMemberStatus(List<MbMember> memberList) {
        return helpPulloutInternally(memberList, new InternalPulloutCallback<MbMember, MbMemberStatus>() {
            public MbMemberStatus getFr(MbMember et) { return et.getMemberStatus(); }
            public boolean hasRf() { return true; }
            public void setRfLs(MbMemberStatus et, List<MbMember> ls)
            { et.setMemberList(ls); }
        });
    }
    /**
     * Pull out the list of foreign table 'MbMemberLogin'.
     * @param memberList The list of member. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MbMemberLogin> pulloutMemberLoginAsLatest(List<MbMember> memberList) {
        return helpPulloutInternally(memberList, new InternalPulloutCallback<MbMember, MbMemberLogin>() {
            public MbMemberLogin getFr(MbMember et) { return et.getMemberLoginAsLatest(); }
            public boolean hasRf() { return false; }
            public void setRfLs(MbMemberLogin et, List<MbMember> ls)
            { throw new UnsupportedOperationException(); }
        });
    }
    /**
     * Pull out the list of referrer-as-one table 'MbMemberSecurity'.
     * @param memberList The list of member. (NotNull, EmptyAllowed)
     * @return The list of referrer-as-one table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MbMemberSecurity> pulloutMemberSecurityAsOne(List<MbMember> memberList) {
        return helpPulloutInternally(memberList, new InternalPulloutCallback<MbMember, MbMemberSecurity>() {
            public MbMemberSecurity getFr(MbMember et) { return et.getMemberSecurityAsOne(); }
            public boolean hasRf() { return true; }
            public void setRfLs(MbMemberSecurity et, List<MbMember> ls)
            { if (!ls.isEmpty()) { et.setMember(ls.get(0)); } }
        });
    }
    /**
     * Pull out the list of referrer-as-one table 'MbMemberService'.
     * @param memberList The list of member. (NotNull, EmptyAllowed)
     * @return The list of referrer-as-one table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MbMemberService> pulloutMemberServiceAsOne(List<MbMember> memberList) {
        return helpPulloutInternally(memberList, new InternalPulloutCallback<MbMember, MbMemberService>() {
            public MbMemberService getFr(MbMember et) { return et.getMemberServiceAsOne(); }
            public boolean hasRf() { return true; }
            public void setRfLs(MbMemberService et, List<MbMember> ls)
            { if (!ls.isEmpty()) { et.setMember(ls.get(0)); } }
        });
    }
    /**
     * Pull out the list of referrer-as-one table 'MbMemberWithdrawal'.
     * @param memberList The list of member. (NotNull, EmptyAllowed)
     * @return The list of referrer-as-one table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MbMemberWithdrawal> pulloutMemberWithdrawalAsOne(List<MbMember> memberList) {
        return helpPulloutInternally(memberList, new InternalPulloutCallback<MbMember, MbMemberWithdrawal>() {
            public MbMemberWithdrawal getFr(MbMember et) { return et.getMemberWithdrawalAsOne(); }
            public boolean hasRf() { return true; }
            public void setRfLs(MbMemberWithdrawal et, List<MbMember> ls)
            { if (!ls.isEmpty()) { et.setMember(ls.get(0)); } }
        });
    }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key memberId.
     * @param memberList The list of member. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Integer> extractMemberIdList(List<MbMember> memberList) {
        return helpExtractListInternally(memberList, new InternalExtractCallback<MbMember, Integer>() {
            public Integer getCV(MbMember et) { return et.getMemberId(); }
        });
    }

    /**
     * Extract the value list of (single) unique key memberAccount.
     * @param memberList The list of member. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<String> extractMemberAccountList(List<MbMember> memberList) {
        return helpExtractListInternally(memberList, new InternalExtractCallback<MbMember, String>() {
            public String getCV(MbMember et) { return et.getMemberAccount(); }
        });
    }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * MbMember member = new MbMember();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * member.setFoo...(value);
     * member.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//member.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//member.set...;</span>
     * memberBhv.<span style="color: #FD4747">insert</span>(member);
     * ... = member.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param member The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(MbMember member) {
        doInsert(member, null);
    }

    protected void doInsert(MbMember member, InsertOption<MbMemberCB> op) {
        assertObjectNotNull("member", member);
        prepareInsertOption(op);
        delegateInsert(member, op);
    }

    protected void prepareInsertOption(InsertOption<MbMemberCB> op) {
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
     * Update the entity modified-only. (ZeroUpdateException, ExclusiveControl)
     * <pre>
     * MbMember member = new MbMember();
     * member.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * member.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//member.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//member.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * member.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     memberBhv.<span style="color: #FD4747">update</span>(member);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param member The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(final MbMember member) {
        doUpdate(member, null);
    }

    protected void doUpdate(MbMember member, final UpdateOption<MbMemberCB> op) {
        assertObjectNotNull("member", member);
        prepareUpdateOption(op);
        helpUpdateInternally(member, new InternalUpdateCallback<MbMember>() {
            public int callbackDelegateUpdate(MbMember et) { return delegateUpdate(et, op); } });
    }

    protected void prepareUpdateOption(UpdateOption<MbMemberCB> op) {
        if (op == null) { return; }
        assertUpdateOptionStatus(op);
        if (op.hasSelfSpecification()) {
            op.resolveSelfSpecification(createCBForVaryingUpdate());
        }
        if (op.hasSpecifiedUpdateColumn()) {
            op.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    protected MbMemberCB createCBForVaryingUpdate() {
        MbMemberCB cb = newMyConditionBean();
        cb.xsetupForVaryingUpdate();
        return cb;
    }

    protected MbMemberCB createCBForSpecifiedUpdate() {
        MbMemberCB cb = newMyConditionBean();
        cb.xsetupForSpecifiedUpdate();
        return cb;
    }

    @Override
    protected void doModify(Entity et, UpdateOption<? extends ConditionBean> op) {
        if (op == null) { update(downcast(et)); }
        else { varyingUpdate(downcast(et), downcast(op)); }
    }

    /**
     * Update the entity non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * MbMember member = new MbMember();
     * member.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * member.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//member.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//member.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//member.setVersionNo(value);</span>
     * memberBhv.<span style="color: #FD4747">updateNonstrict</span>(member);
     * </pre>
     * @param member The entity of update target. (NotNull, PrimaryKeyNotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void updateNonstrict(final MbMember member) {
        doUpdateNonstrict(member, null);
    }

    protected void doUpdateNonstrict(MbMember member, final UpdateOption<MbMemberCB> op) {
        assertObjectNotNull("member", member);
        prepareUpdateOption(op);
        helpUpdateNonstrictInternally(member, new InternalUpdateNonstrictCallback<MbMember>() {
            public int callbackDelegateUpdateNonstrict(MbMember et) { return delegateUpdateNonstrict(et, op); } });
    }

    @Override
    protected void doModifyNonstrict(Entity et, UpdateOption<? extends ConditionBean> op) {
        if (op == null) { updateNonstrict(downcast(et)); }
        else { varyingUpdateNonstrict(downcast(et), downcast(op)); }
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, ExclusiveControl) <br />
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br />
     * <p><span style="color: #FD4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param member The entity of insert or update target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(MbMember member) {
        doInesrtOrUpdate(member, null, null);
    }

    protected void doInesrtOrUpdate(MbMember member, final InsertOption<MbMemberCB> iop, final UpdateOption<MbMemberCB> uop) {
        helpInsertOrUpdateInternally(member, new InternalInsertOrUpdateCallback<MbMember, MbMemberCB>() {
            public void callbackInsert(MbMember et) { doInsert(et, iop); }
            public void callbackUpdate(MbMember et) { doUpdate(et, uop); }
            public MbMemberCB callbackNewMyConditionBean() { return newMyConditionBean(); }
            public int callbackSelectCount(MbMemberCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrModify(Entity et, InsertOption<? extends ConditionBean> iop, UpdateOption<? extends ConditionBean> uop) {
        if (iop == null && uop == null) { insertOrUpdate(downcast(et)); }
        else {
            iop = iop != null ? iop : new InsertOption<MbMemberCB>();
            uop = uop != null ? uop : new UpdateOption<MbMemberCB>();
            varyingInsertOrUpdate(downcast(et), downcast(iop), downcast(uop));
        }
    }

    /**
     * Insert or update the entity non-strictly modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br />
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() }
     * <p><span style="color: #FD4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param member The entity of insert or update target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdateNonstrict(MbMember member) {
        doInesrtOrUpdateNonstrict(member, null, null);
    }

    protected void doInesrtOrUpdateNonstrict(MbMember member, final InsertOption<MbMemberCB> iop, final UpdateOption<MbMemberCB> uop) {
        helpInsertOrUpdateInternally(member, new InternalInsertOrUpdateNonstrictCallback<MbMember>() {
            public void callbackInsert(MbMember et) { doInsert(et, iop); }
            public void callbackUpdateNonstrict(MbMember et) { doUpdateNonstrict(et, uop); }
        });
    }

    @Override
    protected void doCreateOrModifyNonstrict(Entity et, InsertOption<? extends ConditionBean> iop, UpdateOption<? extends ConditionBean> uop) {
        if (iop == null && uop == null) { insertOrUpdateNonstrict(downcast(et)); }
        else {
            iop = iop != null ? iop : new InsertOption<MbMemberCB>();
            uop = uop != null ? uop : new UpdateOption<MbMemberCB>();
            varyingInsertOrUpdateNonstrict(downcast(et), downcast(iop), downcast(uop));
        }
    }

    /**
     * Delete the entity. (ZeroUpdateException, ExclusiveControl)
     * <pre>
     * MbMember member = new MbMember();
     * member.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * member.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     memberBhv.<span style="color: #FD4747">delete</span>(member);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param member The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(MbMember member) {
        doDelete(member, null);
    }

    protected void doDelete(MbMember member, final DeleteOption<MbMemberCB> op) {
        assertObjectNotNull("member", member);
        prepareDeleteOption(op);
        helpDeleteInternally(member, new InternalDeleteCallback<MbMember>() {
            public int callbackDelegateDelete(MbMember et) { return delegateDelete(et, op); } });
    }

    protected void prepareDeleteOption(DeleteOption<MbMemberCB> op) {
        if (op == null) { return; }
        assertDeleteOptionStatus(op);
    }

    @Override
    protected void doRemove(Entity et, DeleteOption<? extends ConditionBean> op) {
        if (op == null) { delete(downcast(et)); }
        else { varyingDelete(downcast(et), downcast(op)); }
    }

    /**
     * Delete the entity non-strictly. {ZeroUpdateException, NonExclusiveControl}
     * <pre>
     * MbMember member = new MbMember();
     * member.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//member.setVersionNo(value);</span>
     * memberBhv.<span style="color: #FD4747">deleteNonstrict</span>(member);
     * </pre>
     * @param member The entity of delete target. (NotNull, PrimaryKeyNotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrict(MbMember member) {
        doDeleteNonstrict(member, null);
    }

    protected void doDeleteNonstrict(MbMember member, final DeleteOption<MbMemberCB> op) {
        assertObjectNotNull("member", member);
        prepareDeleteOption(op);
        helpDeleteNonstrictInternally(member, new InternalDeleteNonstrictCallback<MbMember>() {
            public int callbackDelegateDeleteNonstrict(MbMember et) { return delegateDeleteNonstrict(et, op); } });
    }

    /**
     * Delete the entity non-strictly ignoring deleted. {ZeroUpdateException, NonExclusiveControl}
     * <pre>
     * MbMember member = new MbMember();
     * member.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//member.setVersionNo(value);</span>
     * memberBhv.<span style="color: #FD4747">deleteNonstrictIgnoreDeleted</span>(member);
     * <span style="color: #3F7E5E">// if the target entity doesn't exist, no exception</span>
     * </pre>
     * @param member The entity of delete target. (NotNull, PrimaryKeyNotNull)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrictIgnoreDeleted(MbMember member) {
        doDeleteNonstrictIgnoreDeleted(member, null);
    }

    protected void doDeleteNonstrictIgnoreDeleted(MbMember member, final DeleteOption<MbMemberCB> op) {
        assertObjectNotNull("member", member);
        prepareDeleteOption(op);
        helpDeleteNonstrictIgnoreDeletedInternally(member, new InternalDeleteNonstrictIgnoreDeletedCallback<MbMember>() {
            public int callbackDelegateDeleteNonstrict(MbMember et) { return delegateDeleteNonstrict(et, op); } });
    }

    @Override
    protected void doRemoveNonstrict(Entity et, DeleteOption<? extends ConditionBean> op) {
        if (op == null) { deleteNonstrict(downcast(et)); }
        else { varyingDeleteNonstrict(downcast(et), downcast(op)); }
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
     *     MbMember member = new MbMember();
     *     member.setFooName("foo");
     *     if (...) {
     *         member.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     memberList.add(member);
     * }
     * memberBhv.<span style="color: #FD4747">batchInsert</span>(memberList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param memberList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<MbMember> memberList) {
        InsertOption<MbMemberCB> op = createInsertUpdateOption();
        return doBatchInsert(memberList, op);
    }

    protected int[] doBatchInsert(List<MbMember> memberList, InsertOption<MbMemberCB> op) {
        assertObjectNotNull("memberList", memberList);
        prepareBatchInsertOption(memberList, op);
        return delegateBatchInsert(memberList, op);
    }

    protected void prepareBatchInsertOption(List<MbMember> memberList, InsertOption<MbMemberCB> op) {
        op.xallowInsertColumnModifiedPropertiesFragmented();
        op.xacceptInsertColumnModifiedPropertiesIfNeeds(memberList);
        prepareInsertOption(op);
    }

    @Override
    protected int[] doLumpCreate(List<Entity> ls, InsertOption<? extends ConditionBean> op) {
        if (op == null) { return batchInsert(downcast(ls)); }
        else { return varyingBatchInsert(downcast(ls), downcast(op)); }
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (ExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <span style="color: #FD4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     MbMember member = new MbMember();
     *     member.setFooName("foo");
     *     if (...) {
     *         member.setFooPrice(123);
     *     } else {
     *         member.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//member.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     memberList.add(member);
     * }
     * memberBhv.<span style="color: #FD4747">batchUpdate</span>(memberList);
     * </pre>
     * @param memberList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<MbMember> memberList) {
        UpdateOption<MbMemberCB> op = createPlainUpdateOption();
        return doBatchUpdate(memberList, op);
    }

    protected int[] doBatchUpdate(List<MbMember> memberList, UpdateOption<MbMemberCB> op) {
        assertObjectNotNull("memberList", memberList);
        prepareBatchUpdateOption(memberList, op);
        return delegateBatchUpdate(memberList, op);
    }

    protected void prepareBatchUpdateOption(List<MbMember> memberList, UpdateOption<MbMemberCB> op) {
        op.xacceptUpdateColumnModifiedPropertiesIfNeeds(memberList);
        prepareUpdateOption(op);
    }

    @Override
    protected int[] doLumpModify(List<Entity> ls, UpdateOption<? extends ConditionBean> op) {
        if (op == null) { return batchUpdate(downcast(ls)); }
        else { return varyingBatchUpdate(downcast(ls), downcast(op)); }
    }

    /**
     * Batch-update the entity list specified-only. (ExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * memberBhv.<span style="color: #FD4747">batchUpdate</span>(memberList, new SpecifyQuery<MbMemberCB>() {
     *     public void specify(MbMemberCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #FD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #FD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * memberBhv.<span style="color: #FD4747">batchUpdate</span>(memberList, new SpecifyQuery<MbMemberCB>() {
     *     public void specify(MbMemberCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #FD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param memberList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<MbMember> memberList, SpecifyQuery<MbMemberCB> updateColumnSpec) {
        return doBatchUpdate(memberList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    /**
     * Batch-update the entity list non-strictly modified-only of same-set columns. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <span style="color: #FD4747; font-size: 140%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     MbMember member = new MbMember();
     *     member.setFooName("foo");
     *     if (...) {
     *         member.setFooPrice(123);
     *     } else {
     *         member.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//member.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     memberList.add(member);
     * }
     * memberBhv.<span style="color: #FD4747">batchUpdate</span>(memberList);
     * </pre>
     * @param memberList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<MbMember> memberList) {
        UpdateOption<MbMemberCB> option = createPlainUpdateOption();
        return doBatchUpdateNonstrict(memberList, option);
    }

    protected int[] doBatchUpdateNonstrict(List<MbMember> memberList, UpdateOption<MbMemberCB> op) {
        assertObjectNotNull("memberList", memberList);
        prepareBatchUpdateOption(memberList, op);
        return delegateBatchUpdateNonstrict(memberList, op);
    }

    /**
     * Batch-update the entity list non-strictly specified-only. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * memberBhv.<span style="color: #FD4747">batchUpdateNonstrict</span>(memberList, new SpecifyQuery<MbMemberCB>() {
     *     public void specify(MbMemberCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #FD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #FD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * memberBhv.<span style="color: #FD4747">batchUpdateNonstrict</span>(memberList, new SpecifyQuery<MbMemberCB>() {
     *     public void specify(MbMemberCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #FD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).</p>
     * @param memberList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<MbMember> memberList, SpecifyQuery<MbMemberCB> updateColumnSpec) {
        return doBatchUpdateNonstrict(memberList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> op) {
        if (op == null) { return batchUpdateNonstrict(downcast(ls)); }
        else { return varyingBatchUpdateNonstrict(downcast(ls), downcast(op)); }
    }

    /**
     * Batch-delete the entity list. (ExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param memberList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchDelete(List<MbMember> memberList) {
        return doBatchDelete(memberList, null);
    }

    protected int[] doBatchDelete(List<MbMember> memberList, DeleteOption<MbMemberCB> op) {
        assertObjectNotNull("memberList", memberList);
        prepareDeleteOption(op);
        return delegateBatchDelete(memberList, op);
    }

    @Override
    protected int[] doLumpRemove(List<Entity> ls, DeleteOption<? extends ConditionBean> op) {
        if (op == null) { return batchDelete(downcast(ls)); }
        else { return varyingBatchDelete(downcast(ls), downcast(op)); }
    }

    /**
     * Batch-delete the entity list non-strictly. {NonExclusiveControl} <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param memberList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDeleteNonstrict(List<MbMember> memberList) {
        return doBatchDeleteNonstrict(memberList, null);
    }

    protected int[] doBatchDeleteNonstrict(List<MbMember> memberList, DeleteOption<MbMemberCB> op) {
        assertObjectNotNull("memberList", memberList);
        prepareDeleteOption(op);
        return delegateBatchDeleteNonstrict(memberList, op);
    }

    @Override
    protected int[] doLumpRemoveNonstrict(List<Entity> ls, DeleteOption<? extends ConditionBean> op) {
        if (op == null) { return batchDeleteNonstrict(downcast(ls)); }
        else { return varyingBatchDeleteNonstrict(downcast(ls), downcast(op)); }
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * memberBhv.<span style="color: #FD4747">queryInsert</span>(new QueryInsertSetupper&lt;MbMember, MbMemberCB&gt;() {
     *     public ConditionBean setup(member entity, MbMemberCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<MbMember, MbMemberCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(QueryInsertSetupper<MbMember, MbMemberCB> sp, InsertOption<MbMemberCB> op) {
        assertObjectNotNull("setupper", sp);
        prepareInsertOption(op);
        MbMember e = new MbMember();
        MbMemberCB cb = createCBForQueryInsert();
        return delegateQueryInsert(e, cb, sp.setup(e, cb), op);
    }

    protected MbMemberCB createCBForQueryInsert() {
        MbMemberCB cb = newMyConditionBean();
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
     * MbMember member = new MbMember();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//member.setPK...(value);</span>
     * member.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//member.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//member.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//member.setVersionNo(value);</span>
     * MbMemberCB cb = new MbMemberCB();
     * cb.query().setFoo...(value);
     * memberBhv.<span style="color: #FD4747">queryUpdate</span>(member, cb);
     * </pre>
     * @param member The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of MbMember. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(MbMember member, MbMemberCB cb) {
        return doQueryUpdate(member, cb, null);
    }

    protected int doQueryUpdate(MbMember member, MbMemberCB cb, UpdateOption<MbMemberCB> op) {
        assertObjectNotNull("member", member); assertCBStateValid(cb);
        prepareUpdateOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryUpdate(member, cb, op) : 0;
    }

    @Override
    protected int doRangeModify(Entity et, ConditionBean cb, UpdateOption<? extends ConditionBean> op) {
        if (op == null) { return queryUpdate(downcast(et), (MbMemberCB)cb); }
        else { return varyingQueryUpdate(downcast(et), (MbMemberCB)cb, downcast(op)); }
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * MbMemberCB cb = new MbMemberCB();
     * cb.query().setFoo...(value);
     * memberBhv.<span style="color: #FD4747">queryDelete</span>(member, cb);
     * </pre>
     * @param cb The condition-bean of MbMember. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(MbMemberCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(MbMemberCB cb, DeleteOption<MbMemberCB> op) {
        assertCBStateValid(cb);
        prepareDeleteOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryDelete(cb, op) : 0;
    }

    @Override
    protected int doRangeRemove(ConditionBean cb, DeleteOption<? extends ConditionBean> op) {
        if (op == null) { return queryDelete((MbMemberCB)cb); }
        else { return varyingQueryDelete((MbMemberCB)cb, downcast(op)); }
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
     * MbMember member = new MbMember();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * member.setFoo...(value);
     * member.setBar...(value);
     * InsertOption<MbMemberCB> option = new InsertOption<MbMemberCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * memberBhv.<span style="color: #FD4747">varyingInsert</span>(member, option);
     * ... = member.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param member The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(MbMember member, InsertOption<MbMemberCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(member, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, ExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * MbMember member = new MbMember();
     * member.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * member.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * member.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;MbMemberCB&gt; option = new UpdateOption&lt;MbMemberCB&gt;();
     *     option.self(new SpecifyQuery&lt;MbMemberCB&gt;() {
     *         public void specify(MbMemberCB cb) {
     *             cb.specify().<span style="color: #FD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     memberBhv.<span style="color: #FD4747">varyingUpdate</span>(member, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param member The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(MbMember member, UpdateOption<MbMemberCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(member, option);
    }

    /**
     * Update the entity with varying requests non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as updateNonstrict(entity).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * MbMember member = new MbMember();
     * member.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * member.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//member.setVersionNo(value);</span>
     * UpdateOption&lt;MbMemberCB&gt; option = new UpdateOption&lt;MbMemberCB&gt;();
     * option.self(new SpecifyQuery&lt;MbMemberCB&gt;() {
     *     public void specify(MbMemberCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * memberBhv.<span style="color: #FD4747">varyingUpdateNonstrict</span>(member, option);
     * </pre>
     * @param member The entity of update target. (NotNull, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdateNonstrict(MbMember member, UpdateOption<MbMemberCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdateNonstrict(member, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param member The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(MbMember member, InsertOption<MbMemberCB> insertOption, UpdateOption<MbMemberCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdate(member, insertOption, updateOption);
    }

    /**
     * Insert or update the entity with varying requests non-strictly. (NonExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdateNonstrict(entity).
     * @param member The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdateNonstrict(MbMember member, InsertOption<MbMemberCB> insertOption, UpdateOption<MbMemberCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdateNonstrict(member, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, ExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param member The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(MbMember member, DeleteOption<MbMemberCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(member, option);
    }

    /**
     * Delete the entity with varying requests non-strictly. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as deleteNonstrict(entity).
     * @param member The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDeleteNonstrict(MbMember member, DeleteOption<MbMemberCB> option) {
        assertDeleteOptionNotNull(option);
        doDeleteNonstrict(member, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param memberList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<MbMember> memberList, InsertOption<MbMemberCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(memberList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param memberList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<MbMember> memberList, UpdateOption<MbMemberCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(memberList, option);
    }

    /**
     * Batch-update the list with varying requests non-strictly. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param memberList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdateNonstrict(List<MbMember> memberList, UpdateOption<MbMemberCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdateNonstrict(memberList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param memberList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<MbMember> memberList, DeleteOption<MbMemberCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(memberList, option);
    }

    /**
     * Batch-delete the list with varying requests non-strictly. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDeleteNonstrict(entityList).
     * @param memberList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDeleteNonstrict(List<MbMember> memberList, DeleteOption<MbMemberCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDeleteNonstrict(memberList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<MbMember, MbMemberCB> setupper, InsertOption<MbMemberCB> option) {
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
     * MbMember member = new MbMember();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//member.setPK...(value);</span>
     * member.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//member.setVersionNo(value);</span>
     * MbMemberCB cb = new MbMemberCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;MbMemberCB&gt; option = new UpdateOption&lt;MbMemberCB&gt;();
     * option.self(new SpecifyQuery&lt;MbMemberCB&gt;() {
     *     public void specify(MbMemberCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * memberBhv.<span style="color: #FD4747">varyingQueryUpdate</span>(member, cb, option);
     * </pre>
     * @param member The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of MbMember. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(MbMember member, MbMemberCB cb, UpdateOption<MbMemberCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(member, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of MbMember. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(MbMemberCB cb, DeleteOption<MbMemberCB> option) {
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
    public OutsideSqlBasicExecutor<MbMemberBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCountUniquely(MbMemberCB cb) { return invoke(createSelectCountCBCommand(cb, true)); }
    protected int delegateSelectCountPlainly(MbMemberCB cb) { return invoke(createSelectCountCBCommand(cb, false)); }
    protected <ENTITY extends MbMember> void delegateSelectCursor(MbMemberCB cb, EntityRowHandler<ENTITY> rh, Class<ENTITY> tp)
    { invoke(createSelectCursorCBCommand(cb, rh, tp)); }
    protected <ENTITY extends MbMember> List<ENTITY> delegateSelectList(MbMemberCB cb, Class<ENTITY> tp)
    { return invoke(createSelectListCBCommand(cb, tp)); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(MbMember et, InsertOption<MbMemberCB> op)
    { if (!processBeforeInsert(et, op)) { return 0; }
      return invoke(createInsertEntityCommand(et, op)); }
    protected int delegateUpdate(MbMember et, UpdateOption<MbMemberCB> op)
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return invoke(createUpdateEntityCommand(et, op)); }
    protected int delegateUpdateNonstrict(MbMember et, UpdateOption<MbMemberCB> op)
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return invoke(createUpdateNonstrictEntityCommand(et, op)); }
    protected int delegateDelete(MbMember et, DeleteOption<MbMemberCB> op)
    { if (!processBeforeDelete(et, op)) { return 0; }
      return invoke(createDeleteEntityCommand(et, op)); }
    protected int delegateDeleteNonstrict(MbMember et, DeleteOption<MbMemberCB> op)
    { if (!processBeforeDelete(et, op)) { return 0; }
      return invoke(createDeleteNonstrictEntityCommand(et, op)); }

    protected int[] delegateBatchInsert(List<MbMember> ls, InsertOption<MbMemberCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchInsertCommand(processBatchInternally(ls, op), op)); }
    protected int[] delegateBatchUpdate(List<MbMember> ls, UpdateOption<MbMemberCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateCommand(processBatchInternally(ls, op, false), op)); }
    protected int[] delegateBatchUpdateNonstrict(List<MbMember> ls, UpdateOption<MbMemberCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateNonstrictCommand(processBatchInternally(ls, op, true), op)); }
    protected int[] delegateBatchDelete(List<MbMember> ls, DeleteOption<MbMemberCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteCommand(processBatchInternally(ls, op, false), op)); }
    protected int[] delegateBatchDeleteNonstrict(List<MbMember> ls, DeleteOption<MbMemberCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteNonstrictCommand(processBatchInternally(ls, op, true), op)); }

    protected int delegateQueryInsert(MbMember et, MbMemberCB inCB, ConditionBean resCB, InsertOption<MbMemberCB> op)
    { if (!processBeforeQueryInsert(et, inCB, resCB, op)) { return 0; } return invoke(createQueryInsertCBCommand(et, inCB, resCB, op));  }
    protected int delegateQueryUpdate(MbMember et, MbMemberCB cb, UpdateOption<MbMemberCB> op)
    { if (!processBeforeQueryUpdate(et, cb, op)) { return 0; } return invoke(createQueryUpdateCBCommand(et, cb, op));  }
    protected int delegateQueryDelete(MbMemberCB cb, DeleteOption<MbMemberCB> op)
    { if (!processBeforeQueryDelete(cb, op)) { return 0; } return invoke(createQueryDeleteCBCommand(cb, op));  }

    // ===================================================================================
    //                                                                Optimistic Lock Info
    //                                                                ====================
    /**
     * {@inheritDoc}
     */
    @Override
    protected boolean hasVersionNoValue(Entity et) {
        return !(downcast(et).getVersionNo() + "").equals("null");// For primitive type
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
    protected MbMember downcast(Entity et) {
        return helpEntityDowncastInternally(et, MbMember.class);
    }

    protected MbMemberCB downcast(ConditionBean cb) {
        return helpConditionBeanDowncastInternally(cb, MbMemberCB.class);
    }

    @SuppressWarnings("unchecked")
    protected List<MbMember> downcast(List<? extends Entity> ls) {
        return (List<MbMember>)ls;
    }

    @SuppressWarnings("unchecked")
    protected InsertOption<MbMemberCB> downcast(InsertOption<? extends ConditionBean> op) {
        return (InsertOption<MbMemberCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected UpdateOption<MbMemberCB> downcast(UpdateOption<? extends ConditionBean> op) {
        return (UpdateOption<MbMemberCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected DeleteOption<MbMemberCB> downcast(DeleteOption<? extends ConditionBean> op) {
        return (DeleteOption<MbMemberCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<MbMember, MbMemberCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> sp) {
        return (QueryInsertSetupper<MbMember, MbMemberCB>)sp;
    }
}
