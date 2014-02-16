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
 * The behavior of SERVICE_RANK as TABLE. <br />
 * <pre>
 * [primary key]
 *     SERVICE_RANK_CODE
 *
 * [column]
 *     SERVICE_RANK_CODE, SERVICE_RANK_NAME, SERVICE_POINT_INCIDENCE, NEW_ACCEPTABLE_FLG, DESCRIPTION, DISPLAY_ORDER
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
 *     MEMBER_SERVICE
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     memberServiceList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class MbBsServiceRankBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "SERVICE_RANK"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public DBMeta getDBMeta() { return MbServiceRankDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public MbServiceRankDbm getMyDBMeta() { return MbServiceRankDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public Entity newEntity() { return newMyEntity(); }

    /** {@inheritDoc} */
    public ConditionBean newConditionBean() { return newMyConditionBean(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public MbServiceRank newMyEntity() { return new MbServiceRank(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public MbServiceRankCB newMyConditionBean() { return new MbServiceRankCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * MbServiceRankCB cb = new MbServiceRankCB();
     * cb.query().setFoo...(value);
     * int count = serviceRankBhv.<span style="color: #FD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of MbServiceRank. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(MbServiceRankCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(MbServiceRankCB cb) { // called by selectCount(cb)
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(MbServiceRankCB cb) { // called by selectPage(cb)
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
     * MbServiceRankCB cb = new MbServiceRankCB();
     * cb.query().setFoo...(value);
     * MbServiceRank serviceRank = serviceRankBhv.<span style="color: #FD4747">selectEntity</span>(cb);
     * if (serviceRank != null) {
     *     ... = serviceRank.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of MbServiceRank. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public MbServiceRank selectEntity(MbServiceRankCB cb) {
        return doSelectEntity(cb, MbServiceRank.class);
    }

    protected <ENTITY extends MbServiceRank> ENTITY doSelectEntity(final MbServiceRankCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb);
        return helpSelectEntityInternally(cb, tp, new InternalSelectEntityCallback<ENTITY, MbServiceRankCB>() {
            public List<ENTITY> callbackSelectList(MbServiceRankCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); } });
    }

    @Override
    protected Entity doReadEntity(ConditionBean cb) {
        return selectEntity(downcast(cb));
    }

    /**
     * Select the entity by the condition-bean with deleted check.
     * <pre>
     * MbServiceRankCB cb = new MbServiceRankCB();
     * cb.query().setFoo...(value);
     * MbServiceRank serviceRank = serviceRankBhv.<span style="color: #FD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = serviceRank.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of MbServiceRank. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public MbServiceRank selectEntityWithDeletedCheck(MbServiceRankCB cb) {
        return doSelectEntityWithDeletedCheck(cb, MbServiceRank.class);
    }

    protected <ENTITY extends MbServiceRank> ENTITY doSelectEntityWithDeletedCheck(final MbServiceRankCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb);
        return helpSelectEntityWithDeletedCheckInternally(cb, tp, new InternalSelectEntityWithDeletedCheckCallback<ENTITY, MbServiceRankCB>() {
            public List<ENTITY> callbackSelectList(MbServiceRankCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); } });
    }

    @Override
    protected Entity doReadEntityWithDeletedCheck(ConditionBean cb) {
        return selectEntityWithDeletedCheck(downcast(cb));
    }

    /**
     * Select the entity by the primary-key value.
     * @param serviceRankCode The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public MbServiceRank selectByPKValue(String serviceRankCode) {
        return doSelectByPKValue(serviceRankCode, MbServiceRank.class);
    }

    protected <ENTITY extends MbServiceRank> ENTITY doSelectByPKValue(String serviceRankCode, Class<ENTITY> entityType) {
        return doSelectEntity(buildPKCB(serviceRankCode), entityType);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param serviceRankCode The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public MbServiceRank selectByPKValueWithDeletedCheck(String serviceRankCode) {
        return doSelectByPKValueWithDeletedCheck(serviceRankCode, MbServiceRank.class);
    }

    protected <ENTITY extends MbServiceRank> ENTITY doSelectByPKValueWithDeletedCheck(String serviceRankCode, Class<ENTITY> entityType) {
        return doSelectEntityWithDeletedCheck(buildPKCB(serviceRankCode), entityType);
    }

    private MbServiceRankCB buildPKCB(String serviceRankCode) {
        assertObjectNotNull("serviceRankCode", serviceRankCode);
        MbServiceRankCB cb = newMyConditionBean();
        cb.query().setServiceRankCode_Equal(serviceRankCode);
        return cb;
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * MbServiceRankCB cb = new MbServiceRankCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;MbServiceRank&gt; serviceRankList = serviceRankBhv.<span style="color: #FD4747">selectList</span>(cb);
     * for (MbServiceRank serviceRank : serviceRankList) {
     *     ... = serviceRank.get...();
     * }
     * </pre>
     * @param cb The condition-bean of MbServiceRank. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<MbServiceRank> selectList(MbServiceRankCB cb) {
        return doSelectList(cb, MbServiceRank.class);
    }

    protected <ENTITY extends MbServiceRank> ListResultBean<ENTITY> doSelectList(MbServiceRankCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        return helpSelectListInternally(cb, tp, new InternalSelectListCallback<ENTITY, MbServiceRankCB>() {
            public List<ENTITY> callbackSelectList(MbServiceRankCB cb, Class<ENTITY> tp) { return delegateSelectList(cb, tp); } });
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
     * MbServiceRankCB cb = new MbServiceRankCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #FD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;MbServiceRank&gt; page = serviceRankBhv.<span style="color: #FD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (MbServiceRank serviceRank : page) {
     *     ... = serviceRank.get...();
     * }
     * </pre>
     * @param cb The condition-bean of MbServiceRank. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<MbServiceRank> selectPage(MbServiceRankCB cb) {
        return doSelectPage(cb, MbServiceRank.class);
    }

    protected <ENTITY extends MbServiceRank> PagingResultBean<ENTITY> doSelectPage(MbServiceRankCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectPageInternally(cb, tp, new InternalSelectPageCallback<ENTITY, MbServiceRankCB>() {
            public int callbackSelectCount(MbServiceRankCB cb) { return doSelectCountPlainly(cb); }
            public List<ENTITY> callbackSelectList(MbServiceRankCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); }
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
     * MbServiceRankCB cb = new MbServiceRankCB();
     * cb.query().setFoo...(value);
     * serviceRankBhv.<span style="color: #FD4747">selectCursor</span>(cb, new EntityRowHandler&lt;MbServiceRank&gt;() {
     *     public void handle(MbServiceRank entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of MbServiceRank. (NotNull)
     * @param entityRowHandler The handler of entity row of MbServiceRank. (NotNull)
     */
    public void selectCursor(MbServiceRankCB cb, EntityRowHandler<MbServiceRank> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, MbServiceRank.class);
    }

    protected <ENTITY extends MbServiceRank> void doSelectCursor(MbServiceRankCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler", handler); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        helpSelectCursorInternally(cb, handler, tp, new InternalSelectCursorCallback<ENTITY, MbServiceRankCB>() {
            public void callbackSelectCursor(MbServiceRankCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) { delegateSelectCursor(cb, handler, tp); }
            public List<ENTITY> callbackSelectList(MbServiceRankCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); }
        });
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * serviceRankBhv.<span style="color: #FD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(MbServiceRankCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> SLFunction<MbServiceRankCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
    }

    protected <RESULT, CB extends MbServiceRankCB> SLFunction<CB, RESULT> doScalarSelect(Class<RESULT> tp, CB cb) {
        assertObjectNotNull("resultType", tp); assertCBStateValid(cb);
        cb.xsetupForScalarSelect(); cb.getSqlClause().disableSelectIndex(); // for when you use union
        return createSLFunction(cb, tp);
    }

    protected <RESULT, CB extends MbServiceRankCB> SLFunction<CB, RESULT> createSLFunction(CB cb, Class<RESULT> tp) {
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
     * @param serviceRank The entity of serviceRank. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     */
    public void loadMemberServiceList(MbServiceRank serviceRank, ConditionBeanSetupper<MbMemberServiceCB> conditionBeanSetupper) {
        xassLRArg(serviceRank, conditionBeanSetupper);
        loadMemberServiceList(xnewLRLs(serviceRank), conditionBeanSetupper);
    }
    /**
     * Load referrer of memberServiceList with the set-upper for condition-bean of referrer. <br />
     * MEMBER_SERVICE by SERVICE_RANK_CODE, named 'memberServiceList'.
     * <pre>
     * serviceRankBhv.<span style="color: #FD4747">loadMemberServiceList</span>(serviceRankList, new ConditionBeanSetupper&lt;MbMemberServiceCB&gt;() {
     *     public void setup(MbMemberServiceCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...(); <span style="color: #3F7E5E">// basically you should order referrer list</span>
     *     }
     * });
     * for (MbServiceRank serviceRank : serviceRankList) {
     *     ... = serviceRank.<span style="color: #FD4747">getMemberServiceList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key(and others too) is treated as case-insensitive. <br />
     * The condition-bean that the set-upper provides have settings before you touch it. It is as follows:
     * <pre>
     * cb.query().setServiceRankCode_InScope(pkList);
     * cb.query().addOrderBy_ServiceRankCode_Asc();
     * </pre>
     * @param serviceRankList The entity list of serviceRank. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     */
    public void loadMemberServiceList(List<MbServiceRank> serviceRankList, ConditionBeanSetupper<MbMemberServiceCB> conditionBeanSetupper) {
        xassLRArg(serviceRankList, conditionBeanSetupper);
        loadMemberServiceList(serviceRankList, new LoadReferrerOption<MbMemberServiceCB, MbMemberService>().xinit(conditionBeanSetupper));
    }
    /**
     * {Refer to overload method that has an argument of the list of entity.}
     * @param serviceRank The entity of serviceRank. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadMemberServiceList(MbServiceRank serviceRank, LoadReferrerOption<MbMemberServiceCB, MbMemberService> loadReferrerOption) {
        xassLRArg(serviceRank, loadReferrerOption);
        loadMemberServiceList(xnewLRLs(serviceRank), loadReferrerOption);
    }
    /**
     * {Refer to overload method that has an argument of condition-bean setupper.}
     * @param serviceRankList The entity list of serviceRank. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadMemberServiceList(List<MbServiceRank> serviceRankList, LoadReferrerOption<MbMemberServiceCB, MbMemberService> loadReferrerOption) {
        xassLRArg(serviceRankList, loadReferrerOption);
        if (serviceRankList.isEmpty()) { return; }
        final MbMemberServiceBhv referrerBhv = xgetBSFLR().select(MbMemberServiceBhv.class);
        helpLoadReferrerInternally(serviceRankList, loadReferrerOption, new InternalLoadReferrerCallback<MbServiceRank, String, MbMemberServiceCB, MbMemberService>() {
            public String getPKVal(MbServiceRank et)
            { return et.getServiceRankCode(); }
            public void setRfLs(MbServiceRank et, List<MbMemberService> ls)
            { et.setMemberServiceList(ls); }
            public MbMemberServiceCB newMyCB() { return referrerBhv.newMyConditionBean(); }
            public void qyFKIn(MbMemberServiceCB cb, List<String> ls)
            { cb.query().setServiceRankCode_InScope(ls); }
            public void qyOdFKAsc(MbMemberServiceCB cb) { cb.query().addOrderBy_ServiceRankCode_Asc(); }
            public void spFKCol(MbMemberServiceCB cb) { cb.specify().columnServiceRankCode(); }
            public List<MbMemberService> selRfLs(MbMemberServiceCB cb) { return referrerBhv.selectList(cb); }
            public String getFKVal(MbMemberService re) { return re.getServiceRankCode(); }
            public void setlcEt(MbMemberService re, MbServiceRank le)
            { re.setServiceRank(le); }
            public String getRfPrNm() { return "memberServiceList"; }
        });
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key serviceRankCode.
     * @param serviceRankList The list of serviceRank. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<String> extractServiceRankCodeList(List<MbServiceRank> serviceRankList) {
        return helpExtractListInternally(serviceRankList, new InternalExtractCallback<MbServiceRank, String>() {
            public String getCV(MbServiceRank et) { return et.getServiceRankCode(); }
        });
    }

    /**
     * Extract the value list of (single) unique key displayOrder.
     * @param serviceRankList The list of serviceRank. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Integer> extractDisplayOrderList(List<MbServiceRank> serviceRankList) {
        return helpExtractListInternally(serviceRankList, new InternalExtractCallback<MbServiceRank, Integer>() {
            public Integer getCV(MbServiceRank et) { return et.getDisplayOrder(); }
        });
    }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * MbServiceRank serviceRank = new MbServiceRank();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * serviceRank.setFoo...(value);
     * serviceRank.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//serviceRank.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//serviceRank.set...;</span>
     * serviceRankBhv.<span style="color: #FD4747">insert</span>(serviceRank);
     * ... = serviceRank.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param serviceRank The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(MbServiceRank serviceRank) {
        doInsert(serviceRank, null);
    }

    protected void doInsert(MbServiceRank serviceRank, InsertOption<MbServiceRankCB> op) {
        assertObjectNotNull("serviceRank", serviceRank);
        prepareInsertOption(op);
        delegateInsert(serviceRank, op);
    }

    protected void prepareInsertOption(InsertOption<MbServiceRankCB> op) {
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
     * MbServiceRank serviceRank = new MbServiceRank();
     * serviceRank.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * serviceRank.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//serviceRank.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//serviceRank.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * serviceRank.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     serviceRankBhv.<span style="color: #FD4747">update</span>(serviceRank);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param serviceRank The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(final MbServiceRank serviceRank) {
        doUpdate(serviceRank, null);
    }

    protected void doUpdate(MbServiceRank serviceRank, final UpdateOption<MbServiceRankCB> op) {
        assertObjectNotNull("serviceRank", serviceRank);
        prepareUpdateOption(op);
        helpUpdateInternally(serviceRank, new InternalUpdateCallback<MbServiceRank>() {
            public int callbackDelegateUpdate(MbServiceRank et) { return delegateUpdate(et, op); } });
    }

    protected void prepareUpdateOption(UpdateOption<MbServiceRankCB> op) {
        if (op == null) { return; }
        assertUpdateOptionStatus(op);
        if (op.hasSelfSpecification()) {
            op.resolveSelfSpecification(createCBForVaryingUpdate());
        }
        if (op.hasSpecifiedUpdateColumn()) {
            op.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    protected MbServiceRankCB createCBForVaryingUpdate() {
        MbServiceRankCB cb = newMyConditionBean();
        cb.xsetupForVaryingUpdate();
        return cb;
    }

    protected MbServiceRankCB createCBForSpecifiedUpdate() {
        MbServiceRankCB cb = newMyConditionBean();
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
     * <p><span style="color: #FD4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param serviceRank The entity of insert or update target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(MbServiceRank serviceRank) {
        doInesrtOrUpdate(serviceRank, null, null);
    }

    protected void doInesrtOrUpdate(MbServiceRank serviceRank, final InsertOption<MbServiceRankCB> iop, final UpdateOption<MbServiceRankCB> uop) {
        helpInsertOrUpdateInternally(serviceRank, new InternalInsertOrUpdateCallback<MbServiceRank, MbServiceRankCB>() {
            public void callbackInsert(MbServiceRank et) { doInsert(et, iop); }
            public void callbackUpdate(MbServiceRank et) { doUpdate(et, uop); }
            public MbServiceRankCB callbackNewMyConditionBean() { return newMyConditionBean(); }
            public int callbackSelectCount(MbServiceRankCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrModify(Entity et, InsertOption<? extends ConditionBean> iop, UpdateOption<? extends ConditionBean> uop) {
        if (iop == null && uop == null) { insertOrUpdate(downcast(et)); }
        else {
            iop = iop != null ? iop : new InsertOption<MbServiceRankCB>();
            uop = uop != null ? uop : new UpdateOption<MbServiceRankCB>();
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
     * MbServiceRank serviceRank = new MbServiceRank();
     * serviceRank.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * serviceRank.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     serviceRankBhv.<span style="color: #FD4747">delete</span>(serviceRank);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param serviceRank The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(MbServiceRank serviceRank) {
        doDelete(serviceRank, null);
    }

    protected void doDelete(MbServiceRank serviceRank, final DeleteOption<MbServiceRankCB> op) {
        assertObjectNotNull("serviceRank", serviceRank);
        prepareDeleteOption(op);
        helpDeleteInternally(serviceRank, new InternalDeleteCallback<MbServiceRank>() {
            public int callbackDelegateDelete(MbServiceRank et) { return delegateDelete(et, op); } });
    }

    protected void prepareDeleteOption(DeleteOption<MbServiceRankCB> op) {
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
     * <p><span style="color: #FD4747; font-size: 120%">The columns of least common multiple are registered like this:</span></p>
     * <pre>
     * for (... : ...) {
     *     MbServiceRank serviceRank = new MbServiceRank();
     *     serviceRank.setFooName("foo");
     *     if (...) {
     *         serviceRank.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     serviceRankList.add(serviceRank);
     * }
     * serviceRankBhv.<span style="color: #FD4747">batchInsert</span>(serviceRankList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param serviceRankList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<MbServiceRank> serviceRankList) {
        InsertOption<MbServiceRankCB> op = createInsertUpdateOption();
        return doBatchInsert(serviceRankList, op);
    }

    protected int[] doBatchInsert(List<MbServiceRank> serviceRankList, InsertOption<MbServiceRankCB> op) {
        assertObjectNotNull("serviceRankList", serviceRankList);
        prepareBatchInsertOption(serviceRankList, op);
        return delegateBatchInsert(serviceRankList, op);
    }

    protected void prepareBatchInsertOption(List<MbServiceRank> serviceRankList, InsertOption<MbServiceRankCB> op) {
        op.xallowInsertColumnModifiedPropertiesFragmented();
        op.xacceptInsertColumnModifiedPropertiesIfNeeds(serviceRankList);
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
     * <span style="color: #FD4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     MbServiceRank serviceRank = new MbServiceRank();
     *     serviceRank.setFooName("foo");
     *     if (...) {
     *         serviceRank.setFooPrice(123);
     *     } else {
     *         serviceRank.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//serviceRank.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     serviceRankList.add(serviceRank);
     * }
     * serviceRankBhv.<span style="color: #FD4747">batchUpdate</span>(serviceRankList);
     * </pre>
     * @param serviceRankList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<MbServiceRank> serviceRankList) {
        UpdateOption<MbServiceRankCB> op = createPlainUpdateOption();
        return doBatchUpdate(serviceRankList, op);
    }

    protected int[] doBatchUpdate(List<MbServiceRank> serviceRankList, UpdateOption<MbServiceRankCB> op) {
        assertObjectNotNull("serviceRankList", serviceRankList);
        prepareBatchUpdateOption(serviceRankList, op);
        return delegateBatchUpdate(serviceRankList, op);
    }

    protected void prepareBatchUpdateOption(List<MbServiceRank> serviceRankList, UpdateOption<MbServiceRankCB> op) {
        op.xacceptUpdateColumnModifiedPropertiesIfNeeds(serviceRankList);
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
     * serviceRankBhv.<span style="color: #FD4747">batchUpdate</span>(serviceRankList, new SpecifyQuery<MbServiceRankCB>() {
     *     public void specify(MbServiceRankCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #FD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #FD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * serviceRankBhv.<span style="color: #FD4747">batchUpdate</span>(serviceRankList, new SpecifyQuery<MbServiceRankCB>() {
     *     public void specify(MbServiceRankCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #FD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param serviceRankList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<MbServiceRank> serviceRankList, SpecifyQuery<MbServiceRankCB> updateColumnSpec) {
        return doBatchUpdate(serviceRankList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> op) {
        return doLumpModify(ls, op);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param serviceRankList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<MbServiceRank> serviceRankList) {
        return doBatchDelete(serviceRankList, null);
    }

    protected int[] doBatchDelete(List<MbServiceRank> serviceRankList, DeleteOption<MbServiceRankCB> op) {
        assertObjectNotNull("serviceRankList", serviceRankList);
        prepareDeleteOption(op);
        return delegateBatchDelete(serviceRankList, op);
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
     * serviceRankBhv.<span style="color: #FD4747">queryInsert</span>(new QueryInsertSetupper&lt;MbServiceRank, MbServiceRankCB&gt;() {
     *     public ConditionBean setup(serviceRank entity, MbServiceRankCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<MbServiceRank, MbServiceRankCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(QueryInsertSetupper<MbServiceRank, MbServiceRankCB> sp, InsertOption<MbServiceRankCB> op) {
        assertObjectNotNull("setupper", sp);
        prepareInsertOption(op);
        MbServiceRank e = new MbServiceRank();
        MbServiceRankCB cb = createCBForQueryInsert();
        return delegateQueryInsert(e, cb, sp.setup(e, cb), op);
    }

    protected MbServiceRankCB createCBForQueryInsert() {
        MbServiceRankCB cb = newMyConditionBean();
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
     * MbServiceRank serviceRank = new MbServiceRank();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//serviceRank.setPK...(value);</span>
     * serviceRank.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//serviceRank.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//serviceRank.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//serviceRank.setVersionNo(value);</span>
     * MbServiceRankCB cb = new MbServiceRankCB();
     * cb.query().setFoo...(value);
     * serviceRankBhv.<span style="color: #FD4747">queryUpdate</span>(serviceRank, cb);
     * </pre>
     * @param serviceRank The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of MbServiceRank. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(MbServiceRank serviceRank, MbServiceRankCB cb) {
        return doQueryUpdate(serviceRank, cb, null);
    }

    protected int doQueryUpdate(MbServiceRank serviceRank, MbServiceRankCB cb, UpdateOption<MbServiceRankCB> op) {
        assertObjectNotNull("serviceRank", serviceRank); assertCBStateValid(cb);
        prepareUpdateOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryUpdate(serviceRank, cb, op) : 0;
    }

    @Override
    protected int doRangeModify(Entity et, ConditionBean cb, UpdateOption<? extends ConditionBean> op) {
        if (op == null) { return queryUpdate(downcast(et), (MbServiceRankCB)cb); }
        else { return varyingQueryUpdate(downcast(et), (MbServiceRankCB)cb, downcast(op)); }
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * MbServiceRankCB cb = new MbServiceRankCB();
     * cb.query().setFoo...(value);
     * serviceRankBhv.<span style="color: #FD4747">queryDelete</span>(serviceRank, cb);
     * </pre>
     * @param cb The condition-bean of MbServiceRank. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(MbServiceRankCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(MbServiceRankCB cb, DeleteOption<MbServiceRankCB> op) {
        assertCBStateValid(cb);
        prepareDeleteOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryDelete(cb, op) : 0;
    }

    @Override
    protected int doRangeRemove(ConditionBean cb, DeleteOption<? extends ConditionBean> op) {
        if (op == null) { return queryDelete((MbServiceRankCB)cb); }
        else { return varyingQueryDelete((MbServiceRankCB)cb, downcast(op)); }
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
     * MbServiceRank serviceRank = new MbServiceRank();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * serviceRank.setFoo...(value);
     * serviceRank.setBar...(value);
     * InsertOption<MbServiceRankCB> option = new InsertOption<MbServiceRankCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * serviceRankBhv.<span style="color: #FD4747">varyingInsert</span>(serviceRank, option);
     * ... = serviceRank.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param serviceRank The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(MbServiceRank serviceRank, InsertOption<MbServiceRankCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(serviceRank, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * MbServiceRank serviceRank = new MbServiceRank();
     * serviceRank.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * serviceRank.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * serviceRank.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;MbServiceRankCB&gt; option = new UpdateOption&lt;MbServiceRankCB&gt;();
     *     option.self(new SpecifyQuery&lt;MbServiceRankCB&gt;() {
     *         public void specify(MbServiceRankCB cb) {
     *             cb.specify().<span style="color: #FD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     serviceRankBhv.<span style="color: #FD4747">varyingUpdate</span>(serviceRank, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param serviceRank The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(MbServiceRank serviceRank, UpdateOption<MbServiceRankCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(serviceRank, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param serviceRank The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(MbServiceRank serviceRank, InsertOption<MbServiceRankCB> insertOption, UpdateOption<MbServiceRankCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdate(serviceRank, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param serviceRank The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(MbServiceRank serviceRank, DeleteOption<MbServiceRankCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(serviceRank, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param serviceRankList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<MbServiceRank> serviceRankList, InsertOption<MbServiceRankCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(serviceRankList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param serviceRankList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<MbServiceRank> serviceRankList, UpdateOption<MbServiceRankCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(serviceRankList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param serviceRankList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<MbServiceRank> serviceRankList, DeleteOption<MbServiceRankCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(serviceRankList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<MbServiceRank, MbServiceRankCB> setupper, InsertOption<MbServiceRankCB> option) {
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
     * MbServiceRank serviceRank = new MbServiceRank();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//serviceRank.setPK...(value);</span>
     * serviceRank.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//serviceRank.setVersionNo(value);</span>
     * MbServiceRankCB cb = new MbServiceRankCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;MbServiceRankCB&gt; option = new UpdateOption&lt;MbServiceRankCB&gt;();
     * option.self(new SpecifyQuery&lt;MbServiceRankCB&gt;() {
     *     public void specify(MbServiceRankCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * serviceRankBhv.<span style="color: #FD4747">varyingQueryUpdate</span>(serviceRank, cb, option);
     * </pre>
     * @param serviceRank The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of MbServiceRank. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(MbServiceRank serviceRank, MbServiceRankCB cb, UpdateOption<MbServiceRankCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(serviceRank, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of MbServiceRank. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(MbServiceRankCB cb, DeleteOption<MbServiceRankCB> option) {
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
    public OutsideSqlBasicExecutor<MbServiceRankBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCountUniquely(MbServiceRankCB cb) { return invoke(createSelectCountCBCommand(cb, true)); }
    protected int delegateSelectCountPlainly(MbServiceRankCB cb) { return invoke(createSelectCountCBCommand(cb, false)); }
    protected <ENTITY extends MbServiceRank> void delegateSelectCursor(MbServiceRankCB cb, EntityRowHandler<ENTITY> rh, Class<ENTITY> tp)
    { invoke(createSelectCursorCBCommand(cb, rh, tp)); }
    protected <ENTITY extends MbServiceRank> List<ENTITY> delegateSelectList(MbServiceRankCB cb, Class<ENTITY> tp)
    { return invoke(createSelectListCBCommand(cb, tp)); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(MbServiceRank et, InsertOption<MbServiceRankCB> op)
    { if (!processBeforeInsert(et, op)) { return 0; }
      return invoke(createInsertEntityCommand(et, op)); }
    protected int delegateUpdate(MbServiceRank et, UpdateOption<MbServiceRankCB> op)
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return delegateUpdateNonstrict(et, op); }
    protected int delegateUpdateNonstrict(MbServiceRank et, UpdateOption<MbServiceRankCB> op)
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return invoke(createUpdateNonstrictEntityCommand(et, op)); }
    protected int delegateDelete(MbServiceRank et, DeleteOption<MbServiceRankCB> op)
    { if (!processBeforeDelete(et, op)) { return 0; }
      return delegateDeleteNonstrict(et, op); }
    protected int delegateDeleteNonstrict(MbServiceRank et, DeleteOption<MbServiceRankCB> op)
    { if (!processBeforeDelete(et, op)) { return 0; }
      return invoke(createDeleteNonstrictEntityCommand(et, op)); }

    protected int[] delegateBatchInsert(List<MbServiceRank> ls, InsertOption<MbServiceRankCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchInsertCommand(processBatchInternally(ls, op), op)); }
    protected int[] delegateBatchUpdate(List<MbServiceRank> ls, UpdateOption<MbServiceRankCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchUpdateNonstrict(ls, op); }
    protected int[] delegateBatchUpdateNonstrict(List<MbServiceRank> ls, UpdateOption<MbServiceRankCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateNonstrictCommand(processBatchInternally(ls, op, true), op)); }
    protected int[] delegateBatchDelete(List<MbServiceRank> ls, DeleteOption<MbServiceRankCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchDeleteNonstrict(ls, op); }
    protected int[] delegateBatchDeleteNonstrict(List<MbServiceRank> ls, DeleteOption<MbServiceRankCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteNonstrictCommand(processBatchInternally(ls, op, true), op)); }

    protected int delegateQueryInsert(MbServiceRank et, MbServiceRankCB inCB, ConditionBean resCB, InsertOption<MbServiceRankCB> op)
    { if (!processBeforeQueryInsert(et, inCB, resCB, op)) { return 0; } return invoke(createQueryInsertCBCommand(et, inCB, resCB, op));  }
    protected int delegateQueryUpdate(MbServiceRank et, MbServiceRankCB cb, UpdateOption<MbServiceRankCB> op)
    { if (!processBeforeQueryUpdate(et, cb, op)) { return 0; } return invoke(createQueryUpdateCBCommand(et, cb, op));  }
    protected int delegateQueryDelete(MbServiceRankCB cb, DeleteOption<MbServiceRankCB> op)
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
    protected MbServiceRank downcast(Entity et) {
        return helpEntityDowncastInternally(et, MbServiceRank.class);
    }

    protected MbServiceRankCB downcast(ConditionBean cb) {
        return helpConditionBeanDowncastInternally(cb, MbServiceRankCB.class);
    }

    @SuppressWarnings("unchecked")
    protected List<MbServiceRank> downcast(List<? extends Entity> ls) {
        return (List<MbServiceRank>)ls;
    }

    @SuppressWarnings("unchecked")
    protected InsertOption<MbServiceRankCB> downcast(InsertOption<? extends ConditionBean> op) {
        return (InsertOption<MbServiceRankCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected UpdateOption<MbServiceRankCB> downcast(UpdateOption<? extends ConditionBean> op) {
        return (UpdateOption<MbServiceRankCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected DeleteOption<MbServiceRankCB> downcast(DeleteOption<? extends ConditionBean> op) {
        return (DeleteOption<MbServiceRankCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<MbServiceRank, MbServiceRankCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> sp) {
        return (QueryInsertSetupper<MbServiceRank, MbServiceRankCB>)sp;
    }
}
