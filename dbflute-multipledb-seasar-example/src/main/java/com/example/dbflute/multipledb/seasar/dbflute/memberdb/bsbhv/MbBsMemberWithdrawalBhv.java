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
 * The behavior of MEMBER_WITHDRAWAL as TABLE. <br />
 * <pre>
 * [primary key]
 *     MEMBER_ID
 * 
 * [column]
 *     MEMBER_ID, WITHDRAWAL_REASON_CODE, WITHDRAWAL_REASON_INPUT_TEXT, WITHDRAWAL_DATETIME, REGISTER_DATETIME, REGISTER_USER, UPDATE_DATETIME, UPDATE_USER, VERSION_NO
 * 
 * [sequence]
 *     
 * 
 * [identity]
 *     
 * 
 * [version-no]
 *     VERSION_NO
 * 
 * [foreign table]
 *     MEMBER, WITHDRAWAL_REASON
 * 
 * [referrer table]
 *     
 * 
 * [foreign property]
 *     member, withdrawalReason
 * 
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class MbBsMemberWithdrawalBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "MEMBER_WITHDRAWAL"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public DBMeta getDBMeta() { return MbMemberWithdrawalDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public MbMemberWithdrawalDbm getMyDBMeta() { return MbMemberWithdrawalDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public Entity newEntity() { return newMyEntity(); }

    /** {@inheritDoc} */
    public ConditionBean newConditionBean() { return newMyConditionBean(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public MbMemberWithdrawal newMyEntity() { return new MbMemberWithdrawal(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public MbMemberWithdrawalCB newMyConditionBean() { return new MbMemberWithdrawalCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * MbMemberWithdrawalCB cb = new MbMemberWithdrawalCB();
     * cb.query().setFoo...(value);
     * int count = memberWithdrawalBhv.<span style="color: #FD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of MbMemberWithdrawal. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(MbMemberWithdrawalCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(MbMemberWithdrawalCB cb) { // called by selectCount(cb) 
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(MbMemberWithdrawalCB cb) { // called by selectPage(cb)
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
     * MbMemberWithdrawalCB cb = new MbMemberWithdrawalCB();
     * cb.query().setFoo...(value);
     * MbMemberWithdrawal memberWithdrawal = memberWithdrawalBhv.<span style="color: #FD4747">selectEntity</span>(cb);
     * if (memberWithdrawal != null) {
     *     ... = memberWithdrawal.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of MbMemberWithdrawal. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public MbMemberWithdrawal selectEntity(MbMemberWithdrawalCB cb) {
        return doSelectEntity(cb, MbMemberWithdrawal.class);
    }

    protected <ENTITY extends MbMemberWithdrawal> ENTITY doSelectEntity(final MbMemberWithdrawalCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityInternally(cb, entityType, new InternalSelectEntityCallback<ENTITY, MbMemberWithdrawalCB>() {
            public List<ENTITY> callbackSelectList(MbMemberWithdrawalCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); } });
    }

    @Override
    protected Entity doReadEntity(ConditionBean cb) {
        return selectEntity(downcast(cb));
    }

    /**
     * Select the entity by the condition-bean with deleted check.
     * <pre>
     * MbMemberWithdrawalCB cb = new MbMemberWithdrawalCB();
     * cb.query().setFoo...(value);
     * MbMemberWithdrawal memberWithdrawal = memberWithdrawalBhv.<span style="color: #FD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = memberWithdrawal.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of MbMemberWithdrawal. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public MbMemberWithdrawal selectEntityWithDeletedCheck(MbMemberWithdrawalCB cb) {
        return doSelectEntityWithDeletedCheck(cb, MbMemberWithdrawal.class);
    }

    protected <ENTITY extends MbMemberWithdrawal> ENTITY doSelectEntityWithDeletedCheck(final MbMemberWithdrawalCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityWithDeletedCheckInternally(cb, entityType, new InternalSelectEntityWithDeletedCheckCallback<ENTITY, MbMemberWithdrawalCB>() {
            public List<ENTITY> callbackSelectList(MbMemberWithdrawalCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); } });
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
    public MbMemberWithdrawal selectByPKValue(Integer memberId) {
        return doSelectByPKValue(memberId, MbMemberWithdrawal.class);
    }

    protected <ENTITY extends MbMemberWithdrawal> ENTITY doSelectByPKValue(Integer memberId, Class<ENTITY> entityType) {
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
    public MbMemberWithdrawal selectByPKValueWithDeletedCheck(Integer memberId) {
        return doSelectByPKValueWithDeletedCheck(memberId, MbMemberWithdrawal.class);
    }

    protected <ENTITY extends MbMemberWithdrawal> ENTITY doSelectByPKValueWithDeletedCheck(Integer memberId, Class<ENTITY> entityType) {
        return doSelectEntityWithDeletedCheck(buildPKCB(memberId), entityType);
    }

    private MbMemberWithdrawalCB buildPKCB(Integer memberId) {
        assertObjectNotNull("memberId", memberId);
        MbMemberWithdrawalCB cb = newMyConditionBean();
        cb.query().setMemberId_Equal(memberId);
        return cb;
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * MbMemberWithdrawalCB cb = new MbMemberWithdrawalCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;MbMemberWithdrawal&gt; memberWithdrawalList = memberWithdrawalBhv.<span style="color: #FD4747">selectList</span>(cb);
     * for (MbMemberWithdrawal memberWithdrawal : memberWithdrawalList) {
     *     ... = memberWithdrawal.get...();
     * }
     * </pre>
     * @param cb The condition-bean of MbMemberWithdrawal. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<MbMemberWithdrawal> selectList(MbMemberWithdrawalCB cb) {
        return doSelectList(cb, MbMemberWithdrawal.class);
    }

    protected <ENTITY extends MbMemberWithdrawal> ListResultBean<ENTITY> doSelectList(MbMemberWithdrawalCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", entityType);
        assertSpecifyDerivedReferrerEntityProperty(cb, entityType);
        return helpSelectListInternally(cb, entityType, new InternalSelectListCallback<ENTITY, MbMemberWithdrawalCB>() {
            public List<ENTITY> callbackSelectList(MbMemberWithdrawalCB cb, Class<ENTITY> entityType) { return delegateSelectList(cb, entityType); } });
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
     * MbMemberWithdrawalCB cb = new MbMemberWithdrawalCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #FD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;MbMemberWithdrawal&gt; page = memberWithdrawalBhv.<span style="color: #FD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (MbMemberWithdrawal memberWithdrawal : page) {
     *     ... = memberWithdrawal.get...();
     * }
     * </pre>
     * @param cb The condition-bean of MbMemberWithdrawal. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<MbMemberWithdrawal> selectPage(MbMemberWithdrawalCB cb) {
        return doSelectPage(cb, MbMemberWithdrawal.class);
    }

    protected <ENTITY extends MbMemberWithdrawal> PagingResultBean<ENTITY> doSelectPage(MbMemberWithdrawalCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", entityType);
        return helpSelectPageInternally(cb, entityType, new InternalSelectPageCallback<ENTITY, MbMemberWithdrawalCB>() {
            public int callbackSelectCount(MbMemberWithdrawalCB cb) { return doSelectCountPlainly(cb); }
            public List<ENTITY> callbackSelectList(MbMemberWithdrawalCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); }
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
     * MbMemberWithdrawalCB cb = new MbMemberWithdrawalCB();
     * cb.query().setFoo...(value);
     * memberWithdrawalBhv.<span style="color: #FD4747">selectCursor</span>(cb, new EntityRowHandler&lt;MbMemberWithdrawal&gt;() {
     *     public void handle(MbMemberWithdrawal entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of MbMemberWithdrawal. (NotNull)
     * @param entityRowHandler The handler of entity row of MbMemberWithdrawal. (NotNull)
     */
    public void selectCursor(MbMemberWithdrawalCB cb, EntityRowHandler<MbMemberWithdrawal> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, MbMemberWithdrawal.class);
    }

    protected <ENTITY extends MbMemberWithdrawal> void doSelectCursor(MbMemberWithdrawalCB cb, EntityRowHandler<ENTITY> entityRowHandler, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler<MbMemberWithdrawal>", entityRowHandler); assertObjectNotNull("entityType", entityType);
        assertSpecifyDerivedReferrerEntityProperty(cb, entityType);
        helpSelectCursorInternally(cb, entityRowHandler, entityType, new InternalSelectCursorCallback<ENTITY, MbMemberWithdrawalCB>() {
            public void callbackSelectCursor(MbMemberWithdrawalCB cb, EntityRowHandler<ENTITY> entityRowHandler, Class<ENTITY> entityType) { delegateSelectCursor(cb, entityRowHandler, entityType); }
            public List<ENTITY> callbackSelectList(MbMemberWithdrawalCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); }
        });
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * memberWithdrawalBhv.<span style="color: #FD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(MbMemberWithdrawalCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> SLFunction<MbMemberWithdrawalCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
    }

    protected <RESULT, CB extends MbMemberWithdrawalCB> SLFunction<CB, RESULT> doScalarSelect(Class<RESULT> resultType, CB cb) {
        assertObjectNotNull("resultType", resultType); assertCBStateValid(cb);
        cb.xsetupForScalarSelect(); cb.getSqlClause().disableSelectIndex(); // for when you use union
        return createSLFunction(cb, resultType);
    }

    protected <RESULT, CB extends MbMemberWithdrawalCB> SLFunction<CB, RESULT> createSLFunction(CB cb, Class<RESULT> resultType) {
        return new SLFunction<CB, RESULT>(cb, resultType);
    }

    protected <RESULT> SLFunction<? extends ConditionBean, RESULT> doReadScalar(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
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
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'MbMember'.
     * @param memberWithdrawalList The list of memberWithdrawal. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MbMember> pulloutMember(List<MbMemberWithdrawal> memberWithdrawalList) {
        return helpPulloutInternally(memberWithdrawalList, new InternalPulloutCallback<MbMemberWithdrawal, MbMember>() {
            public MbMember getFr(MbMemberWithdrawal e) { return e.getMember(); }
            public boolean hasRf() { return true; }
            public void setRfLs(MbMember e, List<MbMemberWithdrawal> ls)
            { if (!ls.isEmpty()) { e.setMemberWithdrawalAsOne(ls.get(0)); } }
        });
    }
    /**
     * Pull out the list of foreign table 'MbWithdrawalReason'.
     * @param memberWithdrawalList The list of memberWithdrawal. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MbWithdrawalReason> pulloutWithdrawalReason(List<MbMemberWithdrawal> memberWithdrawalList) {
        return helpPulloutInternally(memberWithdrawalList, new InternalPulloutCallback<MbMemberWithdrawal, MbWithdrawalReason>() {
            public MbWithdrawalReason getFr(MbMemberWithdrawal e) { return e.getWithdrawalReason(); }
            public boolean hasRf() { return true; }
            public void setRfLs(MbWithdrawalReason e, List<MbMemberWithdrawal> ls)
            { e.setMemberWithdrawalList(ls); }
        });
    }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key memberId.
     * @param memberWithdrawalList The list of memberWithdrawal. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Integer> extractMemberIdList(List<MbMemberWithdrawal> memberWithdrawalList) {
        return helpExtractListInternally(memberWithdrawalList, new InternalExtractCallback<MbMemberWithdrawal, Integer>() {
            public Integer getCV(MbMemberWithdrawal e) { return e.getMemberId(); }
        });
    }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * MbMemberWithdrawal memberWithdrawal = new MbMemberWithdrawal();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * memberWithdrawal.setFoo...(value);
     * memberWithdrawal.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//memberWithdrawal.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//memberWithdrawal.set...;</span>
     * memberWithdrawalBhv.<span style="color: #FD4747">insert</span>(memberWithdrawal);
     * ... = memberWithdrawal.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param memberWithdrawal The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(MbMemberWithdrawal memberWithdrawal) {
        doInsert(memberWithdrawal, null);
    }

    protected void doInsert(MbMemberWithdrawal memberWithdrawal, InsertOption<MbMemberWithdrawalCB> option) {
        assertObjectNotNull("memberWithdrawal", memberWithdrawal);
        prepareInsertOption(option);
        delegateInsert(memberWithdrawal, option);
    }

    protected void prepareInsertOption(InsertOption<MbMemberWithdrawalCB> option) {
        if (option == null) { return; }
        assertInsertOptionStatus(option);
        if (option.hasSpecifiedInsertColumn()) {
            option.resolveInsertColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    @Override
    protected void doCreate(Entity entity, InsertOption<? extends ConditionBean> option) {
        if (option == null) { insert(downcast(entity)); }
        else { varyingInsert(downcast(entity), downcast(option)); }
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, ExclusiveControl)
     * <pre>
     * MbMemberWithdrawal memberWithdrawal = new MbMemberWithdrawal();
     * memberWithdrawal.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * memberWithdrawal.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//memberWithdrawal.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//memberWithdrawal.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * memberWithdrawal.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     memberWithdrawalBhv.<span style="color: #FD4747">update</span>(memberWithdrawal);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * } 
     * </pre>
     * @param memberWithdrawal The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(final MbMemberWithdrawal memberWithdrawal) {
        doUpdate(memberWithdrawal, null);
    }

    protected void doUpdate(MbMemberWithdrawal memberWithdrawal, final UpdateOption<MbMemberWithdrawalCB> option) {
        assertObjectNotNull("memberWithdrawal", memberWithdrawal);
        prepareUpdateOption(option);
        helpUpdateInternally(memberWithdrawal, new InternalUpdateCallback<MbMemberWithdrawal>() {
            public int callbackDelegateUpdate(MbMemberWithdrawal entity) { return delegateUpdate(entity, option); } });
    }

    protected void prepareUpdateOption(UpdateOption<MbMemberWithdrawalCB> option) {
        if (option == null) { return; }
        assertUpdateOptionStatus(option);
        if (option.hasSelfSpecification()) {
            option.resolveSelfSpecification(createCBForVaryingUpdate());
        }
        if (option.hasSpecifiedUpdateColumn()) {
            option.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    protected MbMemberWithdrawalCB createCBForVaryingUpdate() {
        MbMemberWithdrawalCB cb = newMyConditionBean();
        cb.xsetupForVaryingUpdate();
        return cb;
    }

    protected MbMemberWithdrawalCB createCBForSpecifiedUpdate() {
        MbMemberWithdrawalCB cb = newMyConditionBean();
        cb.xsetupForSpecifiedUpdate();
        return cb;
    }

    @Override
    protected void doModify(Entity entity, UpdateOption<? extends ConditionBean> option) {
        if (option == null) { update(downcast(entity)); }
        else { varyingUpdate(downcast(entity), downcast(option)); }
    }

    /**
     * Update the entity non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * MbMemberWithdrawal memberWithdrawal = new MbMemberWithdrawal();
     * memberWithdrawal.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * memberWithdrawal.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//memberWithdrawal.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//memberWithdrawal.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//memberWithdrawal.setVersionNo(value);</span>
     * memberWithdrawalBhv.<span style="color: #FD4747">updateNonstrict</span>(memberWithdrawal);
     * </pre>
     * @param memberWithdrawal The entity of update target. (NotNull, PrimaryKeyNotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void updateNonstrict(final MbMemberWithdrawal memberWithdrawal) {
        doUpdateNonstrict(memberWithdrawal, null);
    }

    protected void doUpdateNonstrict(MbMemberWithdrawal memberWithdrawal, final UpdateOption<MbMemberWithdrawalCB> option) {
        assertObjectNotNull("memberWithdrawal", memberWithdrawal);
        prepareUpdateOption(option);
        helpUpdateNonstrictInternally(memberWithdrawal, new InternalUpdateNonstrictCallback<MbMemberWithdrawal>() {
            public int callbackDelegateUpdateNonstrict(MbMemberWithdrawal entity) { return delegateUpdateNonstrict(entity, option); } });
    }

    @Override
    protected void doModifyNonstrict(Entity entity, UpdateOption<? extends ConditionBean> option) {
        if (option == null) { updateNonstrict(downcast(entity)); }
        else { varyingUpdateNonstrict(downcast(entity), downcast(option)); }
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, ExclusiveControl) <br />
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br />
     * <p><span style="color: #FD4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param memberWithdrawal The entity of insert or update target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(MbMemberWithdrawal memberWithdrawal) {
        doInesrtOrUpdate(memberWithdrawal, null, null);
    }

    protected void doInesrtOrUpdate(MbMemberWithdrawal memberWithdrawal, final InsertOption<MbMemberWithdrawalCB> insertOption, final UpdateOption<MbMemberWithdrawalCB> updateOption) {
        helpInsertOrUpdateInternally(memberWithdrawal, new InternalInsertOrUpdateCallback<MbMemberWithdrawal, MbMemberWithdrawalCB>() {
            public void callbackInsert(MbMemberWithdrawal entity) { doInsert(entity, insertOption); }
            public void callbackUpdate(MbMemberWithdrawal entity) { doUpdate(entity, updateOption); }
            public MbMemberWithdrawalCB callbackNewMyConditionBean() { return newMyConditionBean(); }
            public int callbackSelectCount(MbMemberWithdrawalCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrModify(Entity entity, InsertOption<? extends ConditionBean> insertOption,
            UpdateOption<? extends ConditionBean> updateOption) {
        if (insertOption == null && updateOption == null) { insertOrUpdate(downcast(entity)); }
        else {
            insertOption = insertOption == null ? new InsertOption<MbMemberWithdrawalCB>() : insertOption;
            updateOption = updateOption == null ? new UpdateOption<MbMemberWithdrawalCB>() : updateOption;
            varyingInsertOrUpdate(downcast(entity), downcast(insertOption), downcast(updateOption));
        }
    }

    /**
     * Insert or update the entity non-strictly modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br />
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() }
     * <p><span style="color: #FD4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param memberWithdrawal The entity of insert or update target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdateNonstrict(MbMemberWithdrawal memberWithdrawal) {
        doInesrtOrUpdateNonstrict(memberWithdrawal, null, null);
    }

    protected void doInesrtOrUpdateNonstrict(MbMemberWithdrawal memberWithdrawal, final InsertOption<MbMemberWithdrawalCB> insertOption, final UpdateOption<MbMemberWithdrawalCB> updateOption) {
        helpInsertOrUpdateInternally(memberWithdrawal, new InternalInsertOrUpdateNonstrictCallback<MbMemberWithdrawal>() {
            public void callbackInsert(MbMemberWithdrawal entity) { doInsert(entity, insertOption); }
            public void callbackUpdateNonstrict(MbMemberWithdrawal entity) { doUpdateNonstrict(entity, updateOption); }
        });
    }

    @Override
    protected void doCreateOrModifyNonstrict(Entity entity, InsertOption<? extends ConditionBean> insertOption,
            UpdateOption<? extends ConditionBean> updateOption) {
        if (insertOption == null && updateOption == null) { insertOrUpdateNonstrict(downcast(entity)); }
        else {
            insertOption = insertOption == null ? new InsertOption<MbMemberWithdrawalCB>() : insertOption;
            updateOption = updateOption == null ? new UpdateOption<MbMemberWithdrawalCB>() : updateOption;
            varyingInsertOrUpdateNonstrict(downcast(entity), downcast(insertOption), downcast(updateOption));
        }
    }

    /**
     * Delete the entity. (ZeroUpdateException, ExclusiveControl)
     * <pre>
     * MbMemberWithdrawal memberWithdrawal = new MbMemberWithdrawal();
     * memberWithdrawal.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * memberWithdrawal.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     memberWithdrawalBhv.<span style="color: #FD4747">delete</span>(memberWithdrawal);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * } 
     * </pre>
     * @param memberWithdrawal The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(MbMemberWithdrawal memberWithdrawal) {
        doDelete(memberWithdrawal, null);
    }

    protected void doDelete(MbMemberWithdrawal memberWithdrawal, final DeleteOption<MbMemberWithdrawalCB> option) {
        assertObjectNotNull("memberWithdrawal", memberWithdrawal);
        prepareDeleteOption(option);
        helpDeleteInternally(memberWithdrawal, new InternalDeleteCallback<MbMemberWithdrawal>() {
            public int callbackDelegateDelete(MbMemberWithdrawal entity) { return delegateDelete(entity, option); } });
    }

    protected void prepareDeleteOption(DeleteOption<MbMemberWithdrawalCB> option) {
        if (option == null) { return; }
        assertDeleteOptionStatus(option);
    }

    @Override
    protected void doRemove(Entity entity, DeleteOption<? extends ConditionBean> option) {
        if (option == null) { delete(downcast(entity)); }
        else { varyingDelete(downcast(entity), downcast(option)); }
    }

    /**
     * Delete the entity non-strictly. {ZeroUpdateException, NonExclusiveControl}
     * <pre>
     * MbMemberWithdrawal memberWithdrawal = new MbMemberWithdrawal();
     * memberWithdrawal.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//memberWithdrawal.setVersionNo(value);</span>
     * memberWithdrawalBhv.<span style="color: #FD4747">deleteNonstrict</span>(memberWithdrawal);
     * </pre>
     * @param memberWithdrawal The entity of delete target. (NotNull, PrimaryKeyNotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrict(MbMemberWithdrawal memberWithdrawal) {
        doDeleteNonstrict(memberWithdrawal, null);
    }

    protected void doDeleteNonstrict(MbMemberWithdrawal memberWithdrawal, final DeleteOption<MbMemberWithdrawalCB> option) {
        assertObjectNotNull("memberWithdrawal", memberWithdrawal);
        prepareDeleteOption(option);
        helpDeleteNonstrictInternally(memberWithdrawal, new InternalDeleteNonstrictCallback<MbMemberWithdrawal>() {
            public int callbackDelegateDeleteNonstrict(MbMemberWithdrawal entity) { return delegateDeleteNonstrict(entity, option); } });
    }

    /**
     * Delete the entity non-strictly ignoring deleted. {ZeroUpdateException, NonExclusiveControl}
     * <pre>
     * MbMemberWithdrawal memberWithdrawal = new MbMemberWithdrawal();
     * memberWithdrawal.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//memberWithdrawal.setVersionNo(value);</span>
     * memberWithdrawalBhv.<span style="color: #FD4747">deleteNonstrictIgnoreDeleted</span>(memberWithdrawal);
     * <span style="color: #3F7E5E">// if the target entity doesn't exist, no exception</span>
     * </pre>
     * @param memberWithdrawal The entity of delete target. (NotNull, PrimaryKeyNotNull)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrictIgnoreDeleted(MbMemberWithdrawal memberWithdrawal) {
        doDeleteNonstrictIgnoreDeleted(memberWithdrawal, null);
    }

    protected void doDeleteNonstrictIgnoreDeleted(MbMemberWithdrawal memberWithdrawal, final DeleteOption<MbMemberWithdrawalCB> option) {
        assertObjectNotNull("memberWithdrawal", memberWithdrawal);
        prepareDeleteOption(option);
        helpDeleteNonstrictIgnoreDeletedInternally(memberWithdrawal, new InternalDeleteNonstrictIgnoreDeletedCallback<MbMemberWithdrawal>() {
            public int callbackDelegateDeleteNonstrict(MbMemberWithdrawal entity) { return delegateDeleteNonstrict(entity, option); } });
    }

    @Override
    protected void doRemoveNonstrict(Entity entity, DeleteOption<? extends ConditionBean> option) {
        if (option == null) { deleteNonstrict(downcast(entity)); }
        else { varyingDeleteNonstrict(downcast(entity), downcast(option)); }
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
     *     MbMemberWithdrawal memberWithdrawal = new MbMemberWithdrawal();
     *     memberWithdrawal.setFooName("foo");
     *     if (...) {
     *         memberWithdrawal.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     memberWithdrawalList.add(memberWithdrawal);
     * }
     * memberWithdrawalBhv.<span style="color: #FD4747">batchInsert</span>(memberWithdrawalList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param memberWithdrawalList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<MbMemberWithdrawal> memberWithdrawalList) {
        InsertOption<MbMemberWithdrawalCB> option = createInsertUpdateOption();
        return doBatchInsert(memberWithdrawalList, option);
    }

    protected int[] doBatchInsert(List<MbMemberWithdrawal> memberWithdrawalList, InsertOption<MbMemberWithdrawalCB> option) {
        assertObjectNotNull("memberWithdrawalList", memberWithdrawalList);
        prepareBatchInsertOption(memberWithdrawalList, option);
        return delegateBatchInsert(memberWithdrawalList, option);
    }

    protected void prepareBatchInsertOption(List<MbMemberWithdrawal> memberWithdrawalList, InsertOption<MbMemberWithdrawalCB> option) {
        option.xallowInsertColumnModifiedPropertiesFragmented();
        option.xacceptInsertColumnModifiedPropertiesIfNeeds(memberWithdrawalList);
        prepareInsertOption(option);
    }

    @Override
    protected int[] doLumpCreate(List<Entity> ls, InsertOption<? extends ConditionBean> option) {
        if (option == null) { return batchInsert(downcast(ls)); }
        else { return varyingBatchInsert(downcast(ls), downcast(option)); }
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (ExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <span style="color: #FD4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     MbMemberWithdrawal memberWithdrawal = new MbMemberWithdrawal();
     *     memberWithdrawal.setFooName("foo");
     *     if (...) {
     *         memberWithdrawal.setFooPrice(123);
     *     } else {
     *         memberWithdrawal.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//memberWithdrawal.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     memberWithdrawalList.add(memberWithdrawal);
     * }
     * memberWithdrawalBhv.<span style="color: #FD4747">batchUpdate</span>(memberWithdrawalList);
     * </pre>
     * @param memberWithdrawalList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<MbMemberWithdrawal> memberWithdrawalList) {
        UpdateOption<MbMemberWithdrawalCB> option = createPlainUpdateOption();
        return doBatchUpdate(memberWithdrawalList, option);
    }

    protected int[] doBatchUpdate(List<MbMemberWithdrawal> memberWithdrawalList, UpdateOption<MbMemberWithdrawalCB> option) {
        assertObjectNotNull("memberWithdrawalList", memberWithdrawalList);
        prepareBatchUpdateOption(memberWithdrawalList, option);
        return delegateBatchUpdate(memberWithdrawalList, option);
    }

    protected void prepareBatchUpdateOption(List<MbMemberWithdrawal> memberWithdrawalList, UpdateOption<MbMemberWithdrawalCB> option) {
        option.xacceptUpdateColumnModifiedPropertiesIfNeeds(memberWithdrawalList);
        prepareUpdateOption(option);
    }

    @Override
    protected int[] doLumpModify(List<Entity> ls, UpdateOption<? extends ConditionBean> option) {
        if (option == null) { return batchUpdate(downcast(ls)); }
        else { return varyingBatchUpdate(downcast(ls), downcast(option)); }
    }

    /**
     * Batch-update the entity list specified-only. (ExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span> 
     * memberWithdrawalBhv.<span style="color: #FD4747">batchUpdate</span>(memberWithdrawalList, new SpecifyQuery<MbMemberWithdrawalCB>() {
     *     public void specify(MbMemberWithdrawalCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #FD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #FD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span> 
     * memberWithdrawalBhv.<span style="color: #FD4747">batchUpdate</span>(memberWithdrawalList, new SpecifyQuery<MbMemberWithdrawalCB>() {
     *     public void specify(MbMemberWithdrawalCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #FD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param memberWithdrawalList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<MbMemberWithdrawal> memberWithdrawalList, SpecifyQuery<MbMemberWithdrawalCB> updateColumnSpec) {
        return doBatchUpdate(memberWithdrawalList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    /**
     * Batch-update the entity list non-strictly modified-only of same-set columns. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <span style="color: #FD4747; font-size: 140%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     MbMemberWithdrawal memberWithdrawal = new MbMemberWithdrawal();
     *     memberWithdrawal.setFooName("foo");
     *     if (...) {
     *         memberWithdrawal.setFooPrice(123);
     *     } else {
     *         memberWithdrawal.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//memberWithdrawal.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     memberWithdrawalList.add(memberWithdrawal);
     * }
     * memberWithdrawalBhv.<span style="color: #FD4747">batchUpdate</span>(memberWithdrawalList);
     * </pre>
     * @param memberWithdrawalList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<MbMemberWithdrawal> memberWithdrawalList) {
        UpdateOption<MbMemberWithdrawalCB> option = createPlainUpdateOption();
        return doBatchUpdateNonstrict(memberWithdrawalList, option);
    }

    protected int[] doBatchUpdateNonstrict(List<MbMemberWithdrawal> memberWithdrawalList, UpdateOption<MbMemberWithdrawalCB> option) {
        assertObjectNotNull("memberWithdrawalList", memberWithdrawalList);
        prepareBatchUpdateOption(memberWithdrawalList, option);
        return delegateBatchUpdateNonstrict(memberWithdrawalList, option);
    }

    /**
     * Batch-update the entity list non-strictly specified-only. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span> 
     * memberWithdrawalBhv.<span style="color: #FD4747">batchUpdateNonstrict</span>(memberWithdrawalList, new SpecifyQuery<MbMemberWithdrawalCB>() {
     *     public void specify(MbMemberWithdrawalCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #FD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #FD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span> 
     * memberWithdrawalBhv.<span style="color: #FD4747">batchUpdateNonstrict</span>(memberWithdrawalList, new SpecifyQuery<MbMemberWithdrawalCB>() {
     *     public void specify(MbMemberWithdrawalCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #FD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).</p>
     * @param memberWithdrawalList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<MbMemberWithdrawal> memberWithdrawalList, SpecifyQuery<MbMemberWithdrawalCB> updateColumnSpec) {
        return doBatchUpdateNonstrict(memberWithdrawalList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> option) {
        if (option == null) { return batchUpdateNonstrict(downcast(ls)); }
        else { return varyingBatchUpdateNonstrict(downcast(ls), downcast(option)); }
    }

    /**
     * Batch-delete the entity list. (ExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param memberWithdrawalList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchDelete(List<MbMemberWithdrawal> memberWithdrawalList) {
        return doBatchDelete(memberWithdrawalList, null);
    }

    protected int[] doBatchDelete(List<MbMemberWithdrawal> memberWithdrawalList, DeleteOption<MbMemberWithdrawalCB> option) {
        assertObjectNotNull("memberWithdrawalList", memberWithdrawalList);
        prepareDeleteOption(option);
        return delegateBatchDelete(memberWithdrawalList, option);
    }

    @Override
    protected int[] doLumpRemove(List<Entity> ls, DeleteOption<? extends ConditionBean> option) {
        if (option == null) { return batchDelete(downcast(ls)); }
        else { return varyingBatchDelete(downcast(ls), downcast(option)); }
    }

    /**
     * Batch-delete the entity list non-strictly. {NonExclusiveControl} <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param memberWithdrawalList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDeleteNonstrict(List<MbMemberWithdrawal> memberWithdrawalList) {
        return doBatchDeleteNonstrict(memberWithdrawalList, null);
    }

    protected int[] doBatchDeleteNonstrict(List<MbMemberWithdrawal> memberWithdrawalList, DeleteOption<MbMemberWithdrawalCB> option) {
        assertObjectNotNull("memberWithdrawalList", memberWithdrawalList);
        prepareDeleteOption(option);
        return delegateBatchDeleteNonstrict(memberWithdrawalList, option);
    }

    @Override
    protected int[] doLumpRemoveNonstrict(List<Entity> ls, DeleteOption<? extends ConditionBean> option) {
        if (option == null) { return batchDeleteNonstrict(downcast(ls)); }
        else { return varyingBatchDeleteNonstrict(downcast(ls), downcast(option)); }
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * memberWithdrawalBhv.<span style="color: #FD4747">queryInsert</span>(new QueryInsertSetupper&lt;MbMemberWithdrawal, MbMemberWithdrawalCB&gt;() {
     *     public ConditionBean setup(memberWithdrawal entity, MbMemberWithdrawalCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<MbMemberWithdrawal, MbMemberWithdrawalCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(QueryInsertSetupper<MbMemberWithdrawal, MbMemberWithdrawalCB> setupper, InsertOption<MbMemberWithdrawalCB> option) {
        assertObjectNotNull("setupper", setupper);
        prepareInsertOption(option);
        MbMemberWithdrawal entity = new MbMemberWithdrawal();
        MbMemberWithdrawalCB intoCB = createCBForQueryInsert();
        ConditionBean resourceCB = setupper.setup(entity, intoCB);
        return delegateQueryInsert(entity, intoCB, resourceCB, option);
    }

    protected MbMemberWithdrawalCB createCBForQueryInsert() {
        MbMemberWithdrawalCB cb = newMyConditionBean();
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
     * MbMemberWithdrawal memberWithdrawal = new MbMemberWithdrawal();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//memberWithdrawal.setPK...(value);</span>
     * memberWithdrawal.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//memberWithdrawal.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//memberWithdrawal.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//memberWithdrawal.setVersionNo(value);</span>
     * MbMemberWithdrawalCB cb = new MbMemberWithdrawalCB();
     * cb.query().setFoo...(value);
     * memberWithdrawalBhv.<span style="color: #FD4747">queryUpdate</span>(memberWithdrawal, cb);
     * </pre>
     * @param memberWithdrawal The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of MbMemberWithdrawal. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(MbMemberWithdrawal memberWithdrawal, MbMemberWithdrawalCB cb) {
        return doQueryUpdate(memberWithdrawal, cb, null);
    }

    protected int doQueryUpdate(MbMemberWithdrawal memberWithdrawal, MbMemberWithdrawalCB cb, UpdateOption<MbMemberWithdrawalCB> option) {
        assertObjectNotNull("memberWithdrawal", memberWithdrawal); assertCBStateValid(cb);
        prepareUpdateOption(option);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryUpdate(memberWithdrawal, cb, option) : 0;
    }

    @Override
    protected int doRangeModify(Entity entity, ConditionBean cb, UpdateOption<? extends ConditionBean> option) {
        if (option == null) { return queryUpdate(downcast(entity), (MbMemberWithdrawalCB)cb); }
        else { return varyingQueryUpdate(downcast(entity), (MbMemberWithdrawalCB)cb, downcast(option)); }
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * MbMemberWithdrawalCB cb = new MbMemberWithdrawalCB();
     * cb.query().setFoo...(value);
     * memberWithdrawalBhv.<span style="color: #FD4747">queryDelete</span>(memberWithdrawal, cb);
     * </pre>
     * @param cb The condition-bean of MbMemberWithdrawal. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(MbMemberWithdrawalCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(MbMemberWithdrawalCB cb, DeleteOption<MbMemberWithdrawalCB> option) {
        assertCBStateValid(cb);
        prepareDeleteOption(option);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryDelete(cb, option) : 0;
    }

    @Override
    protected int doRangeRemove(ConditionBean cb, DeleteOption<? extends ConditionBean> option) {
        if (option == null) { return queryDelete((MbMemberWithdrawalCB)cb); }
        else { return varyingQueryDelete((MbMemberWithdrawalCB)cb, downcast(option)); }
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
     * MbMemberWithdrawal memberWithdrawal = new MbMemberWithdrawal();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * memberWithdrawal.setFoo...(value);
     * memberWithdrawal.setBar...(value);
     * InsertOption<MbMemberWithdrawalCB> option = new InsertOption<MbMemberWithdrawalCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * memberWithdrawalBhv.<span style="color: #FD4747">varyingInsert</span>(memberWithdrawal, option);
     * ... = memberWithdrawal.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param memberWithdrawal The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(MbMemberWithdrawal memberWithdrawal, InsertOption<MbMemberWithdrawalCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(memberWithdrawal, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, ExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * MbMemberWithdrawal memberWithdrawal = new MbMemberWithdrawal();
     * memberWithdrawal.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * memberWithdrawal.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * memberWithdrawal.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;MbMemberWithdrawalCB&gt; option = new UpdateOption&lt;MbMemberWithdrawalCB&gt;();
     *     option.self(new SpecifyQuery&lt;MbMemberWithdrawalCB&gt;() {
     *         public void specify(MbMemberWithdrawalCB cb) {
     *             cb.specify().<span style="color: #FD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     memberWithdrawalBhv.<span style="color: #FD4747">varyingUpdate</span>(memberWithdrawal, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param memberWithdrawal The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(MbMemberWithdrawal memberWithdrawal, UpdateOption<MbMemberWithdrawalCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(memberWithdrawal, option);
    }

    /**
     * Update the entity with varying requests non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as updateNonstrict(entity).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * MbMemberWithdrawal memberWithdrawal = new MbMemberWithdrawal();
     * memberWithdrawal.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * memberWithdrawal.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//memberWithdrawal.setVersionNo(value);</span>
     * UpdateOption&lt;MbMemberWithdrawalCB&gt; option = new UpdateOption&lt;MbMemberWithdrawalCB&gt;();
     * option.self(new SpecifyQuery&lt;MbMemberWithdrawalCB&gt;() {
     *     public void specify(MbMemberWithdrawalCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * memberWithdrawalBhv.<span style="color: #FD4747">varyingUpdateNonstrict</span>(memberWithdrawal, option);
     * </pre>
     * @param memberWithdrawal The entity of update target. (NotNull, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdateNonstrict(MbMemberWithdrawal memberWithdrawal, UpdateOption<MbMemberWithdrawalCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdateNonstrict(memberWithdrawal, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param memberWithdrawal The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(MbMemberWithdrawal memberWithdrawal, InsertOption<MbMemberWithdrawalCB> insertOption, UpdateOption<MbMemberWithdrawalCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdate(memberWithdrawal, insertOption, updateOption);
    }

    /**
     * Insert or update the entity with varying requests non-strictly. (NonExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdateNonstrict(entity).
     * @param memberWithdrawal The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdateNonstrict(MbMemberWithdrawal memberWithdrawal, InsertOption<MbMemberWithdrawalCB> insertOption, UpdateOption<MbMemberWithdrawalCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdateNonstrict(memberWithdrawal, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, ExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param memberWithdrawal The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(MbMemberWithdrawal memberWithdrawal, DeleteOption<MbMemberWithdrawalCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(memberWithdrawal, option);
    }

    /**
     * Delete the entity with varying requests non-strictly. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as deleteNonstrict(entity).
     * @param memberWithdrawal The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDeleteNonstrict(MbMemberWithdrawal memberWithdrawal, DeleteOption<MbMemberWithdrawalCB> option) {
        assertDeleteOptionNotNull(option);
        doDeleteNonstrict(memberWithdrawal, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param memberWithdrawalList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<MbMemberWithdrawal> memberWithdrawalList, InsertOption<MbMemberWithdrawalCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(memberWithdrawalList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param memberWithdrawalList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<MbMemberWithdrawal> memberWithdrawalList, UpdateOption<MbMemberWithdrawalCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(memberWithdrawalList, option);
    }

    /**
     * Batch-update the list with varying requests non-strictly. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param memberWithdrawalList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdateNonstrict(List<MbMemberWithdrawal> memberWithdrawalList, UpdateOption<MbMemberWithdrawalCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdateNonstrict(memberWithdrawalList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param memberWithdrawalList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<MbMemberWithdrawal> memberWithdrawalList, DeleteOption<MbMemberWithdrawalCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(memberWithdrawalList, option);
    }

    /**
     * Batch-delete the list with varying requests non-strictly. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDeleteNonstrict(entityList).
     * @param memberWithdrawalList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDeleteNonstrict(List<MbMemberWithdrawal> memberWithdrawalList, DeleteOption<MbMemberWithdrawalCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDeleteNonstrict(memberWithdrawalList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<MbMemberWithdrawal, MbMemberWithdrawalCB> setupper, InsertOption<MbMemberWithdrawalCB> option) {
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
     * MbMemberWithdrawal memberWithdrawal = new MbMemberWithdrawal();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//memberWithdrawal.setPK...(value);</span>
     * memberWithdrawal.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//memberWithdrawal.setVersionNo(value);</span>
     * MbMemberWithdrawalCB cb = new MbMemberWithdrawalCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;MbMemberWithdrawalCB&gt; option = new UpdateOption&lt;MbMemberWithdrawalCB&gt;();
     * option.self(new SpecifyQuery&lt;MbMemberWithdrawalCB&gt;() {
     *     public void specify(MbMemberWithdrawalCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * memberWithdrawalBhv.<span style="color: #FD4747">varyingQueryUpdate</span>(memberWithdrawal, cb, option);
     * </pre>
     * @param memberWithdrawal The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of MbMemberWithdrawal. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(MbMemberWithdrawal memberWithdrawal, MbMemberWithdrawalCB cb, UpdateOption<MbMemberWithdrawalCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(memberWithdrawal, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of MbMemberWithdrawal. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(MbMemberWithdrawalCB cb, DeleteOption<MbMemberWithdrawalCB> option) {
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
    public OutsideSqlBasicExecutor<MbMemberWithdrawalBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCountUniquely(MbMemberWithdrawalCB cb) { return invoke(createSelectCountCBCommand(cb, true)); }
    protected int delegateSelectCountPlainly(MbMemberWithdrawalCB cb) { return invoke(createSelectCountCBCommand(cb, false)); }
    protected <ENTITY extends MbMemberWithdrawal> void delegateSelectCursor(MbMemberWithdrawalCB cb, EntityRowHandler<ENTITY> erh, Class<ENTITY> et)
    { invoke(createSelectCursorCBCommand(cb, erh, et)); }
    protected <ENTITY extends MbMemberWithdrawal> List<ENTITY> delegateSelectList(MbMemberWithdrawalCB cb, Class<ENTITY> et)
    { return invoke(createSelectListCBCommand(cb, et)); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(MbMemberWithdrawal e, InsertOption<MbMemberWithdrawalCB> op)
    { if (!processBeforeInsert(e, op)) { return 0; }
      return invoke(createInsertEntityCommand(e, op)); }
    protected int delegateUpdate(MbMemberWithdrawal e, UpdateOption<MbMemberWithdrawalCB> op)
    { if (!processBeforeUpdate(e, op)) { return 0; }
      return invoke(createUpdateEntityCommand(e, op)); }
    protected int delegateUpdateNonstrict(MbMemberWithdrawal e, UpdateOption<MbMemberWithdrawalCB> op)
    { if (!processBeforeUpdate(e, op)) { return 0; }
      return invoke(createUpdateNonstrictEntityCommand(e, op)); }
    protected int delegateDelete(MbMemberWithdrawal e, DeleteOption<MbMemberWithdrawalCB> op)
    { if (!processBeforeDelete(e, op)) { return 0; }
      return invoke(createDeleteEntityCommand(e, op)); }
    protected int delegateDeleteNonstrict(MbMemberWithdrawal e, DeleteOption<MbMemberWithdrawalCB> op)
    { if (!processBeforeDelete(e, op)) { return 0; }
      return invoke(createDeleteNonstrictEntityCommand(e, op)); }

    protected int[] delegateBatchInsert(List<MbMemberWithdrawal> ls, InsertOption<MbMemberWithdrawalCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchInsertCommand(processBatchInternally(ls, op), op)); }
    protected int[] delegateBatchUpdate(List<MbMemberWithdrawal> ls, UpdateOption<MbMemberWithdrawalCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateCommand(processBatchInternally(ls, op, false), op)); }
    protected int[] delegateBatchUpdateNonstrict(List<MbMemberWithdrawal> ls, UpdateOption<MbMemberWithdrawalCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateNonstrictCommand(processBatchInternally(ls, op, true), op)); }
    protected int[] delegateBatchDelete(List<MbMemberWithdrawal> ls, DeleteOption<MbMemberWithdrawalCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteCommand(processBatchInternally(ls, op, false), op)); }
    protected int[] delegateBatchDeleteNonstrict(List<MbMemberWithdrawal> ls, DeleteOption<MbMemberWithdrawalCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteNonstrictCommand(processBatchInternally(ls, op, true), op)); }

    protected int delegateQueryInsert(MbMemberWithdrawal e, MbMemberWithdrawalCB inCB, ConditionBean resCB, InsertOption<MbMemberWithdrawalCB> op)
    { if (!processBeforeQueryInsert(e, inCB, resCB, op)) { return 0; } return invoke(createQueryInsertCBCommand(e, inCB, resCB, op));  }
    protected int delegateQueryUpdate(MbMemberWithdrawal e, MbMemberWithdrawalCB cb, UpdateOption<MbMemberWithdrawalCB> op)
    { if (!processBeforeQueryUpdate(e, cb, op)) { return 0; } return invoke(createQueryUpdateCBCommand(e, cb, op));  }
    protected int delegateQueryDelete(MbMemberWithdrawalCB cb, DeleteOption<MbMemberWithdrawalCB> op)
    { if (!processBeforeQueryDelete(cb, op)) { return 0; } return invoke(createQueryDeleteCBCommand(cb, op));  }

    // ===================================================================================
    //                                                                Optimistic Lock Info
    //                                                                ====================
    /**
     * {@inheritDoc}
     */
    @Override
    protected boolean hasVersionNoValue(Entity entity) {
        return !(downcast(entity).getVersionNo() + "").equals("null");// For primitive type
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected boolean hasUpdateDateValue(Entity entity) {
        return false;
    }

    // ===================================================================================
    //                                                                     Downcast Helper
    //                                                                     ===============
    protected MbMemberWithdrawal downcast(Entity entity) {
        return helpEntityDowncastInternally(entity, MbMemberWithdrawal.class);
    }

    protected MbMemberWithdrawalCB downcast(ConditionBean cb) {
        return helpConditionBeanDowncastInternally(cb, MbMemberWithdrawalCB.class);
    }

    @SuppressWarnings("unchecked")
    protected List<MbMemberWithdrawal> downcast(List<? extends Entity> entityList) {
        return (List<MbMemberWithdrawal>)entityList;
    }

    @SuppressWarnings("unchecked")
    protected InsertOption<MbMemberWithdrawalCB> downcast(InsertOption<? extends ConditionBean> option) {
        return (InsertOption<MbMemberWithdrawalCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected UpdateOption<MbMemberWithdrawalCB> downcast(UpdateOption<? extends ConditionBean> option) {
        return (UpdateOption<MbMemberWithdrawalCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected DeleteOption<MbMemberWithdrawalCB> downcast(DeleteOption<? extends ConditionBean> option) {
        return (DeleteOption<MbMemberWithdrawalCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<MbMemberWithdrawal, MbMemberWithdrawalCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> option) {
        return (QueryInsertSetupper<MbMemberWithdrawal, MbMemberWithdrawalCB>)option;
    }
}
