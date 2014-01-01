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
 * The behavior of MEMBER_LOGIN as TABLE. <br />
 * <pre>
 * [primary key]
 *     MEMBER_LOGIN_ID
 * 
 * [column]
 *     MEMBER_LOGIN_ID, MEMBER_ID, LOGIN_DATETIME, MOBILE_LOGIN_FLG, LOGIN_MEMBER_STATUS_CODE
 * 
 * [sequence]
 *     
 * 
 * [identity]
 *     MEMBER_LOGIN_ID
 * 
 * [version-no]
 *     
 * 
 * [foreign table]
 *     MEMBER, MEMBER_STATUS
 * 
 * [referrer table]
 *     
 * 
 * [foreign property]
 *     member, memberStatus
 * 
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class MbBsMemberLoginBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "MEMBER_LOGIN"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public DBMeta getDBMeta() { return MbMemberLoginDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public MbMemberLoginDbm getMyDBMeta() { return MbMemberLoginDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public Entity newEntity() { return newMyEntity(); }

    /** {@inheritDoc} */
    public ConditionBean newConditionBean() { return newMyConditionBean(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public MbMemberLogin newMyEntity() { return new MbMemberLogin(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public MbMemberLoginCB newMyConditionBean() { return new MbMemberLoginCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * MbMemberLoginCB cb = new MbMemberLoginCB();
     * cb.query().setFoo...(value);
     * int count = memberLoginBhv.<span style="color: #FD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of MbMemberLogin. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(MbMemberLoginCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(MbMemberLoginCB cb) { // called by selectCount(cb) 
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(MbMemberLoginCB cb) { // called by selectPage(cb)
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
     * MbMemberLoginCB cb = new MbMemberLoginCB();
     * cb.query().setFoo...(value);
     * MbMemberLogin memberLogin = memberLoginBhv.<span style="color: #FD4747">selectEntity</span>(cb);
     * if (memberLogin != null) {
     *     ... = memberLogin.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of MbMemberLogin. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public MbMemberLogin selectEntity(MbMemberLoginCB cb) {
        return doSelectEntity(cb, MbMemberLogin.class);
    }

    protected <ENTITY extends MbMemberLogin> ENTITY doSelectEntity(final MbMemberLoginCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityInternally(cb, entityType, new InternalSelectEntityCallback<ENTITY, MbMemberLoginCB>() {
            public List<ENTITY> callbackSelectList(MbMemberLoginCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); } });
    }

    @Override
    protected Entity doReadEntity(ConditionBean cb) {
        return selectEntity(downcast(cb));
    }

    /**
     * Select the entity by the condition-bean with deleted check.
     * <pre>
     * MbMemberLoginCB cb = new MbMemberLoginCB();
     * cb.query().setFoo...(value);
     * MbMemberLogin memberLogin = memberLoginBhv.<span style="color: #FD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = memberLogin.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of MbMemberLogin. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public MbMemberLogin selectEntityWithDeletedCheck(MbMemberLoginCB cb) {
        return doSelectEntityWithDeletedCheck(cb, MbMemberLogin.class);
    }

    protected <ENTITY extends MbMemberLogin> ENTITY doSelectEntityWithDeletedCheck(final MbMemberLoginCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityWithDeletedCheckInternally(cb, entityType, new InternalSelectEntityWithDeletedCheckCallback<ENTITY, MbMemberLoginCB>() {
            public List<ENTITY> callbackSelectList(MbMemberLoginCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); } });
    }

    @Override
    protected Entity doReadEntityWithDeletedCheck(ConditionBean cb) {
        return selectEntityWithDeletedCheck(downcast(cb));
    }

    /**
     * Select the entity by the primary-key value.
     * @param memberLoginId The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public MbMemberLogin selectByPKValue(Long memberLoginId) {
        return doSelectByPKValue(memberLoginId, MbMemberLogin.class);
    }

    protected <ENTITY extends MbMemberLogin> ENTITY doSelectByPKValue(Long memberLoginId, Class<ENTITY> entityType) {
        return doSelectEntity(buildPKCB(memberLoginId), entityType);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param memberLoginId The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public MbMemberLogin selectByPKValueWithDeletedCheck(Long memberLoginId) {
        return doSelectByPKValueWithDeletedCheck(memberLoginId, MbMemberLogin.class);
    }

    protected <ENTITY extends MbMemberLogin> ENTITY doSelectByPKValueWithDeletedCheck(Long memberLoginId, Class<ENTITY> entityType) {
        return doSelectEntityWithDeletedCheck(buildPKCB(memberLoginId), entityType);
    }

    private MbMemberLoginCB buildPKCB(Long memberLoginId) {
        assertObjectNotNull("memberLoginId", memberLoginId);
        MbMemberLoginCB cb = newMyConditionBean();
        cb.query().setMemberLoginId_Equal(memberLoginId);
        return cb;
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * MbMemberLoginCB cb = new MbMemberLoginCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;MbMemberLogin&gt; memberLoginList = memberLoginBhv.<span style="color: #FD4747">selectList</span>(cb);
     * for (MbMemberLogin memberLogin : memberLoginList) {
     *     ... = memberLogin.get...();
     * }
     * </pre>
     * @param cb The condition-bean of MbMemberLogin. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<MbMemberLogin> selectList(MbMemberLoginCB cb) {
        return doSelectList(cb, MbMemberLogin.class);
    }

    protected <ENTITY extends MbMemberLogin> ListResultBean<ENTITY> doSelectList(MbMemberLoginCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", entityType);
        assertSpecifyDerivedReferrerEntityProperty(cb, entityType);
        return helpSelectListInternally(cb, entityType, new InternalSelectListCallback<ENTITY, MbMemberLoginCB>() {
            public List<ENTITY> callbackSelectList(MbMemberLoginCB cb, Class<ENTITY> entityType) { return delegateSelectList(cb, entityType); } });
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
     * MbMemberLoginCB cb = new MbMemberLoginCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #FD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;MbMemberLogin&gt; page = memberLoginBhv.<span style="color: #FD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (MbMemberLogin memberLogin : page) {
     *     ... = memberLogin.get...();
     * }
     * </pre>
     * @param cb The condition-bean of MbMemberLogin. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<MbMemberLogin> selectPage(MbMemberLoginCB cb) {
        return doSelectPage(cb, MbMemberLogin.class);
    }

    protected <ENTITY extends MbMemberLogin> PagingResultBean<ENTITY> doSelectPage(MbMemberLoginCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", entityType);
        return helpSelectPageInternally(cb, entityType, new InternalSelectPageCallback<ENTITY, MbMemberLoginCB>() {
            public int callbackSelectCount(MbMemberLoginCB cb) { return doSelectCountPlainly(cb); }
            public List<ENTITY> callbackSelectList(MbMemberLoginCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); }
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
     * MbMemberLoginCB cb = new MbMemberLoginCB();
     * cb.query().setFoo...(value);
     * memberLoginBhv.<span style="color: #FD4747">selectCursor</span>(cb, new EntityRowHandler&lt;MbMemberLogin&gt;() {
     *     public void handle(MbMemberLogin entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of MbMemberLogin. (NotNull)
     * @param entityRowHandler The handler of entity row of MbMemberLogin. (NotNull)
     */
    public void selectCursor(MbMemberLoginCB cb, EntityRowHandler<MbMemberLogin> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, MbMemberLogin.class);
    }

    protected <ENTITY extends MbMemberLogin> void doSelectCursor(MbMemberLoginCB cb, EntityRowHandler<ENTITY> entityRowHandler, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler<MbMemberLogin>", entityRowHandler); assertObjectNotNull("entityType", entityType);
        assertSpecifyDerivedReferrerEntityProperty(cb, entityType);
        helpSelectCursorInternally(cb, entityRowHandler, entityType, new InternalSelectCursorCallback<ENTITY, MbMemberLoginCB>() {
            public void callbackSelectCursor(MbMemberLoginCB cb, EntityRowHandler<ENTITY> entityRowHandler, Class<ENTITY> entityType) { delegateSelectCursor(cb, entityRowHandler, entityType); }
            public List<ENTITY> callbackSelectList(MbMemberLoginCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); }
        });
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * memberLoginBhv.<span style="color: #FD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(MbMemberLoginCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> SLFunction<MbMemberLoginCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
    }

    protected <RESULT, CB extends MbMemberLoginCB> SLFunction<CB, RESULT> doScalarSelect(Class<RESULT> resultType, CB cb) {
        assertObjectNotNull("resultType", resultType); assertCBStateValid(cb);
        cb.xsetupForScalarSelect(); cb.getSqlClause().disableSelectIndex(); // for when you use union
        return createSLFunction(cb, resultType);
    }

    protected <RESULT, CB extends MbMemberLoginCB> SLFunction<CB, RESULT> createSLFunction(CB cb, Class<RESULT> resultType) {
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
     * @param memberLoginList The list of memberLogin. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MbMember> pulloutMember(List<MbMemberLogin> memberLoginList) {
        return helpPulloutInternally(memberLoginList, new InternalPulloutCallback<MbMemberLogin, MbMember>() {
            public MbMember getFr(MbMemberLogin e) { return e.getMember(); }
            public boolean hasRf() { return true; }
            public void setRfLs(MbMember e, List<MbMemberLogin> ls)
            { e.setMemberLoginList(ls); }
        });
    }
    /**
     * Pull out the list of foreign table 'MbMemberStatus'.
     * @param memberLoginList The list of memberLogin. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MbMemberStatus> pulloutMemberStatus(List<MbMemberLogin> memberLoginList) {
        return helpPulloutInternally(memberLoginList, new InternalPulloutCallback<MbMemberLogin, MbMemberStatus>() {
            public MbMemberStatus getFr(MbMemberLogin e) { return e.getMemberStatus(); }
            public boolean hasRf() { return true; }
            public void setRfLs(MbMemberStatus e, List<MbMemberLogin> ls)
            { e.setMemberLoginList(ls); }
        });
    }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key memberLoginId.
     * @param memberLoginList The list of memberLogin. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractMemberLoginIdList(List<MbMemberLogin> memberLoginList) {
        return helpExtractListInternally(memberLoginList, new InternalExtractCallback<MbMemberLogin, Long>() {
            public Long getCV(MbMemberLogin e) { return e.getMemberLoginId(); }
        });
    }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * MbMemberLogin memberLogin = new MbMemberLogin();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * memberLogin.setFoo...(value);
     * memberLogin.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//memberLogin.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//memberLogin.set...;</span>
     * memberLoginBhv.<span style="color: #FD4747">insert</span>(memberLogin);
     * ... = memberLogin.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param memberLogin The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(MbMemberLogin memberLogin) {
        doInsert(memberLogin, null);
    }

    protected void doInsert(MbMemberLogin memberLogin, InsertOption<MbMemberLoginCB> option) {
        assertObjectNotNull("memberLogin", memberLogin);
        prepareInsertOption(option);
        delegateInsert(memberLogin, option);
    }

    protected void prepareInsertOption(InsertOption<MbMemberLoginCB> option) {
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
     * Update the entity modified-only. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * MbMemberLogin memberLogin = new MbMemberLogin();
     * memberLogin.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * memberLogin.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//memberLogin.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//memberLogin.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * memberLogin.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     memberLoginBhv.<span style="color: #FD4747">update</span>(memberLogin);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * } 
     * </pre>
     * @param memberLogin The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(final MbMemberLogin memberLogin) {
        doUpdate(memberLogin, null);
    }

    protected void doUpdate(MbMemberLogin memberLogin, final UpdateOption<MbMemberLoginCB> option) {
        assertObjectNotNull("memberLogin", memberLogin);
        prepareUpdateOption(option);
        helpUpdateInternally(memberLogin, new InternalUpdateCallback<MbMemberLogin>() {
            public int callbackDelegateUpdate(MbMemberLogin entity) { return delegateUpdate(entity, option); } });
    }

    protected void prepareUpdateOption(UpdateOption<MbMemberLoginCB> option) {
        if (option == null) { return; }
        assertUpdateOptionStatus(option);
        if (option.hasSelfSpecification()) {
            option.resolveSelfSpecification(createCBForVaryingUpdate());
        }
        if (option.hasSpecifiedUpdateColumn()) {
            option.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    protected MbMemberLoginCB createCBForVaryingUpdate() {
        MbMemberLoginCB cb = newMyConditionBean();
        cb.xsetupForVaryingUpdate();
        return cb;
    }

    protected MbMemberLoginCB createCBForSpecifiedUpdate() {
        MbMemberLoginCB cb = newMyConditionBean();
        cb.xsetupForSpecifiedUpdate();
        return cb;
    }

    @Override
    protected void doModify(Entity entity, UpdateOption<? extends ConditionBean> option) {
        if (option == null) { update(downcast(entity)); }
        else { varyingUpdate(downcast(entity), downcast(option)); }
    }

    @Override
    protected void doModifyNonstrict(Entity entity, UpdateOption<? extends ConditionBean> option) {
        doModify(entity, option);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br />
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br />
     * <p><span style="color: #FD4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param memberLogin The entity of insert or update target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(MbMemberLogin memberLogin) {
        doInesrtOrUpdate(memberLogin, null, null);
    }

    protected void doInesrtOrUpdate(MbMemberLogin memberLogin, final InsertOption<MbMemberLoginCB> insertOption, final UpdateOption<MbMemberLoginCB> updateOption) {
        helpInsertOrUpdateInternally(memberLogin, new InternalInsertOrUpdateCallback<MbMemberLogin, MbMemberLoginCB>() {
            public void callbackInsert(MbMemberLogin entity) { doInsert(entity, insertOption); }
            public void callbackUpdate(MbMemberLogin entity) { doUpdate(entity, updateOption); }
            public MbMemberLoginCB callbackNewMyConditionBean() { return newMyConditionBean(); }
            public int callbackSelectCount(MbMemberLoginCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrModify(Entity entity, InsertOption<? extends ConditionBean> insertOption,
            UpdateOption<? extends ConditionBean> updateOption) {
        if (insertOption == null && updateOption == null) { insertOrUpdate(downcast(entity)); }
        else {
            insertOption = insertOption == null ? new InsertOption<MbMemberLoginCB>() : insertOption;
            updateOption = updateOption == null ? new UpdateOption<MbMemberLoginCB>() : updateOption;
            varyingInsertOrUpdate(downcast(entity), downcast(insertOption), downcast(updateOption));
        }
    }

    @Override
    protected void doCreateOrModifyNonstrict(Entity entity, InsertOption<? extends ConditionBean> insertOption,
            UpdateOption<? extends ConditionBean> updateOption) {
        doCreateOrModify(entity, insertOption, updateOption);
    }

    /**
     * Delete the entity. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * MbMemberLogin memberLogin = new MbMemberLogin();
     * memberLogin.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * memberLogin.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     memberLoginBhv.<span style="color: #FD4747">delete</span>(memberLogin);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * } 
     * </pre>
     * @param memberLogin The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(MbMemberLogin memberLogin) {
        doDelete(memberLogin, null);
    }

    protected void doDelete(MbMemberLogin memberLogin, final DeleteOption<MbMemberLoginCB> option) {
        assertObjectNotNull("memberLogin", memberLogin);
        prepareDeleteOption(option);
        helpDeleteInternally(memberLogin, new InternalDeleteCallback<MbMemberLogin>() {
            public int callbackDelegateDelete(MbMemberLogin entity) { return delegateDelete(entity, option); } });
    }

    protected void prepareDeleteOption(DeleteOption<MbMemberLoginCB> option) {
        if (option == null) { return; }
        assertDeleteOptionStatus(option);
    }

    @Override
    protected void doRemove(Entity entity, DeleteOption<? extends ConditionBean> option) {
        if (option == null) { delete(downcast(entity)); }
        else { varyingDelete(downcast(entity), downcast(option)); }
    }

    @Override
    protected void doRemoveNonstrict(Entity entity, DeleteOption<? extends ConditionBean> option) {
        doRemove(entity, option);
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
     *     MbMemberLogin memberLogin = new MbMemberLogin();
     *     memberLogin.setFooName("foo");
     *     if (...) {
     *         memberLogin.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     memberLoginList.add(memberLogin);
     * }
     * memberLoginBhv.<span style="color: #FD4747">batchInsert</span>(memberLoginList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param memberLoginList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<MbMemberLogin> memberLoginList) {
        InsertOption<MbMemberLoginCB> option = createInsertUpdateOption();
        return doBatchInsert(memberLoginList, option);
    }

    protected int[] doBatchInsert(List<MbMemberLogin> memberLoginList, InsertOption<MbMemberLoginCB> option) {
        assertObjectNotNull("memberLoginList", memberLoginList);
        prepareBatchInsertOption(memberLoginList, option);
        return delegateBatchInsert(memberLoginList, option);
    }

    protected void prepareBatchInsertOption(List<MbMemberLogin> memberLoginList, InsertOption<MbMemberLoginCB> option) {
        option.xallowInsertColumnModifiedPropertiesFragmented();
        option.xacceptInsertColumnModifiedPropertiesIfNeeds(memberLoginList);
        prepareInsertOption(option);
    }

    @Override
    protected int[] doLumpCreate(List<Entity> ls, InsertOption<? extends ConditionBean> option) {
        if (option == null) { return batchInsert(downcast(ls)); }
        else { return varyingBatchInsert(downcast(ls), downcast(option)); }
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <span style="color: #FD4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     MbMemberLogin memberLogin = new MbMemberLogin();
     *     memberLogin.setFooName("foo");
     *     if (...) {
     *         memberLogin.setFooPrice(123);
     *     } else {
     *         memberLogin.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//memberLogin.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     memberLoginList.add(memberLogin);
     * }
     * memberLoginBhv.<span style="color: #FD4747">batchUpdate</span>(memberLoginList);
     * </pre>
     * @param memberLoginList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<MbMemberLogin> memberLoginList) {
        UpdateOption<MbMemberLoginCB> option = createPlainUpdateOption();
        return doBatchUpdate(memberLoginList, option);
    }

    protected int[] doBatchUpdate(List<MbMemberLogin> memberLoginList, UpdateOption<MbMemberLoginCB> option) {
        assertObjectNotNull("memberLoginList", memberLoginList);
        prepareBatchUpdateOption(memberLoginList, option);
        return delegateBatchUpdate(memberLoginList, option);
    }

    protected void prepareBatchUpdateOption(List<MbMemberLogin> memberLoginList, UpdateOption<MbMemberLoginCB> option) {
        option.xacceptUpdateColumnModifiedPropertiesIfNeeds(memberLoginList);
        prepareUpdateOption(option);
    }

    @Override
    protected int[] doLumpModify(List<Entity> ls, UpdateOption<? extends ConditionBean> option) {
        if (option == null) { return batchUpdate(downcast(ls)); }
        else { return varyingBatchUpdate(downcast(ls), downcast(option)); }
    }

    /**
     * Batch-update the entity list specified-only. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span> 
     * memberLoginBhv.<span style="color: #FD4747">batchUpdate</span>(memberLoginList, new SpecifyQuery<MbMemberLoginCB>() {
     *     public void specify(MbMemberLoginCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #FD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #FD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span> 
     * memberLoginBhv.<span style="color: #FD4747">batchUpdate</span>(memberLoginList, new SpecifyQuery<MbMemberLoginCB>() {
     *     public void specify(MbMemberLoginCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #FD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param memberLoginList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<MbMemberLogin> memberLoginList, SpecifyQuery<MbMemberLoginCB> updateColumnSpec) {
        return doBatchUpdate(memberLoginList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> option) {
        return doLumpModify(ls, option);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param memberLoginList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<MbMemberLogin> memberLoginList) {
        return doBatchDelete(memberLoginList, null);
    }

    protected int[] doBatchDelete(List<MbMemberLogin> memberLoginList, DeleteOption<MbMemberLoginCB> option) {
        assertObjectNotNull("memberLoginList", memberLoginList);
        prepareDeleteOption(option);
        return delegateBatchDelete(memberLoginList, option);
    }

    @Override
    protected int[] doLumpRemove(List<Entity> ls, DeleteOption<? extends ConditionBean> option) {
        if (option == null) { return batchDelete(downcast(ls)); }
        else { return varyingBatchDelete(downcast(ls), downcast(option)); }
    }

    @Override
    protected int[] doLumpRemoveNonstrict(List<Entity> ls, DeleteOption<? extends ConditionBean> option) {
        return doLumpRemove(ls, option);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * memberLoginBhv.<span style="color: #FD4747">queryInsert</span>(new QueryInsertSetupper&lt;MbMemberLogin, MbMemberLoginCB&gt;() {
     *     public ConditionBean setup(memberLogin entity, MbMemberLoginCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<MbMemberLogin, MbMemberLoginCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(QueryInsertSetupper<MbMemberLogin, MbMemberLoginCB> setupper, InsertOption<MbMemberLoginCB> option) {
        assertObjectNotNull("setupper", setupper);
        prepareInsertOption(option);
        MbMemberLogin entity = new MbMemberLogin();
        MbMemberLoginCB intoCB = createCBForQueryInsert();
        ConditionBean resourceCB = setupper.setup(entity, intoCB);
        return delegateQueryInsert(entity, intoCB, resourceCB, option);
    }

    protected MbMemberLoginCB createCBForQueryInsert() {
        MbMemberLoginCB cb = newMyConditionBean();
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
     * MbMemberLogin memberLogin = new MbMemberLogin();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//memberLogin.setPK...(value);</span>
     * memberLogin.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//memberLogin.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//memberLogin.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//memberLogin.setVersionNo(value);</span>
     * MbMemberLoginCB cb = new MbMemberLoginCB();
     * cb.query().setFoo...(value);
     * memberLoginBhv.<span style="color: #FD4747">queryUpdate</span>(memberLogin, cb);
     * </pre>
     * @param memberLogin The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of MbMemberLogin. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(MbMemberLogin memberLogin, MbMemberLoginCB cb) {
        return doQueryUpdate(memberLogin, cb, null);
    }

    protected int doQueryUpdate(MbMemberLogin memberLogin, MbMemberLoginCB cb, UpdateOption<MbMemberLoginCB> option) {
        assertObjectNotNull("memberLogin", memberLogin); assertCBStateValid(cb);
        prepareUpdateOption(option);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryUpdate(memberLogin, cb, option) : 0;
    }

    @Override
    protected int doRangeModify(Entity entity, ConditionBean cb, UpdateOption<? extends ConditionBean> option) {
        if (option == null) { return queryUpdate(downcast(entity), (MbMemberLoginCB)cb); }
        else { return varyingQueryUpdate(downcast(entity), (MbMemberLoginCB)cb, downcast(option)); }
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * MbMemberLoginCB cb = new MbMemberLoginCB();
     * cb.query().setFoo...(value);
     * memberLoginBhv.<span style="color: #FD4747">queryDelete</span>(memberLogin, cb);
     * </pre>
     * @param cb The condition-bean of MbMemberLogin. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(MbMemberLoginCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(MbMemberLoginCB cb, DeleteOption<MbMemberLoginCB> option) {
        assertCBStateValid(cb);
        prepareDeleteOption(option);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryDelete(cb, option) : 0;
    }

    @Override
    protected int doRangeRemove(ConditionBean cb, DeleteOption<? extends ConditionBean> option) {
        if (option == null) { return queryDelete((MbMemberLoginCB)cb); }
        else { return varyingQueryDelete((MbMemberLoginCB)cb, downcast(option)); }
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
     * MbMemberLogin memberLogin = new MbMemberLogin();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * memberLogin.setFoo...(value);
     * memberLogin.setBar...(value);
     * InsertOption<MbMemberLoginCB> option = new InsertOption<MbMemberLoginCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * memberLoginBhv.<span style="color: #FD4747">varyingInsert</span>(memberLogin, option);
     * ... = memberLogin.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param memberLogin The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(MbMemberLogin memberLogin, InsertOption<MbMemberLoginCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(memberLogin, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * MbMemberLogin memberLogin = new MbMemberLogin();
     * memberLogin.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * memberLogin.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * memberLogin.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;MbMemberLoginCB&gt; option = new UpdateOption&lt;MbMemberLoginCB&gt;();
     *     option.self(new SpecifyQuery&lt;MbMemberLoginCB&gt;() {
     *         public void specify(MbMemberLoginCB cb) {
     *             cb.specify().<span style="color: #FD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     memberLoginBhv.<span style="color: #FD4747">varyingUpdate</span>(memberLogin, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param memberLogin The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(MbMemberLogin memberLogin, UpdateOption<MbMemberLoginCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(memberLogin, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param memberLogin The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(MbMemberLogin memberLogin, InsertOption<MbMemberLoginCB> insertOption, UpdateOption<MbMemberLoginCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdate(memberLogin, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param memberLogin The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(MbMemberLogin memberLogin, DeleteOption<MbMemberLoginCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(memberLogin, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param memberLoginList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<MbMemberLogin> memberLoginList, InsertOption<MbMemberLoginCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(memberLoginList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param memberLoginList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<MbMemberLogin> memberLoginList, UpdateOption<MbMemberLoginCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(memberLoginList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param memberLoginList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<MbMemberLogin> memberLoginList, DeleteOption<MbMemberLoginCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(memberLoginList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<MbMemberLogin, MbMemberLoginCB> setupper, InsertOption<MbMemberLoginCB> option) {
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
     * MbMemberLogin memberLogin = new MbMemberLogin();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//memberLogin.setPK...(value);</span>
     * memberLogin.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//memberLogin.setVersionNo(value);</span>
     * MbMemberLoginCB cb = new MbMemberLoginCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;MbMemberLoginCB&gt; option = new UpdateOption&lt;MbMemberLoginCB&gt;();
     * option.self(new SpecifyQuery&lt;MbMemberLoginCB&gt;() {
     *     public void specify(MbMemberLoginCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * memberLoginBhv.<span style="color: #FD4747">varyingQueryUpdate</span>(memberLogin, cb, option);
     * </pre>
     * @param memberLogin The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of MbMemberLogin. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(MbMemberLogin memberLogin, MbMemberLoginCB cb, UpdateOption<MbMemberLoginCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(memberLogin, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of MbMemberLogin. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(MbMemberLoginCB cb, DeleteOption<MbMemberLoginCB> option) {
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
    public OutsideSqlBasicExecutor<MbMemberLoginBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCountUniquely(MbMemberLoginCB cb) { return invoke(createSelectCountCBCommand(cb, true)); }
    protected int delegateSelectCountPlainly(MbMemberLoginCB cb) { return invoke(createSelectCountCBCommand(cb, false)); }
    protected <ENTITY extends MbMemberLogin> void delegateSelectCursor(MbMemberLoginCB cb, EntityRowHandler<ENTITY> erh, Class<ENTITY> et)
    { invoke(createSelectCursorCBCommand(cb, erh, et)); }
    protected <ENTITY extends MbMemberLogin> List<ENTITY> delegateSelectList(MbMemberLoginCB cb, Class<ENTITY> et)
    { return invoke(createSelectListCBCommand(cb, et)); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(MbMemberLogin e, InsertOption<MbMemberLoginCB> op)
    { if (!processBeforeInsert(e, op)) { return 0; }
      return invoke(createInsertEntityCommand(e, op)); }
    protected int delegateUpdate(MbMemberLogin e, UpdateOption<MbMemberLoginCB> op)
    { if (!processBeforeUpdate(e, op)) { return 0; }
      return delegateUpdateNonstrict(e, op); }
    protected int delegateUpdateNonstrict(MbMemberLogin e, UpdateOption<MbMemberLoginCB> op)
    { if (!processBeforeUpdate(e, op)) { return 0; }
      return invoke(createUpdateNonstrictEntityCommand(e, op)); }
    protected int delegateDelete(MbMemberLogin e, DeleteOption<MbMemberLoginCB> op)
    { if (!processBeforeDelete(e, op)) { return 0; }
      return delegateDeleteNonstrict(e, op); }
    protected int delegateDeleteNonstrict(MbMemberLogin e, DeleteOption<MbMemberLoginCB> op)
    { if (!processBeforeDelete(e, op)) { return 0; }
      return invoke(createDeleteNonstrictEntityCommand(e, op)); }

    protected int[] delegateBatchInsert(List<MbMemberLogin> ls, InsertOption<MbMemberLoginCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchInsertCommand(processBatchInternally(ls, op), op)); }
    protected int[] delegateBatchUpdate(List<MbMemberLogin> ls, UpdateOption<MbMemberLoginCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchUpdateNonstrict(ls, op); }
    protected int[] delegateBatchUpdateNonstrict(List<MbMemberLogin> ls, UpdateOption<MbMemberLoginCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateNonstrictCommand(processBatchInternally(ls, op, true), op)); }
    protected int[] delegateBatchDelete(List<MbMemberLogin> ls, DeleteOption<MbMemberLoginCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchDeleteNonstrict(ls, op); }
    protected int[] delegateBatchDeleteNonstrict(List<MbMemberLogin> ls, DeleteOption<MbMemberLoginCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteNonstrictCommand(processBatchInternally(ls, op, true), op)); }

    protected int delegateQueryInsert(MbMemberLogin e, MbMemberLoginCB inCB, ConditionBean resCB, InsertOption<MbMemberLoginCB> op)
    { if (!processBeforeQueryInsert(e, inCB, resCB, op)) { return 0; } return invoke(createQueryInsertCBCommand(e, inCB, resCB, op));  }
    protected int delegateQueryUpdate(MbMemberLogin e, MbMemberLoginCB cb, UpdateOption<MbMemberLoginCB> op)
    { if (!processBeforeQueryUpdate(e, cb, op)) { return 0; } return invoke(createQueryUpdateCBCommand(e, cb, op));  }
    protected int delegateQueryDelete(MbMemberLoginCB cb, DeleteOption<MbMemberLoginCB> op)
    { if (!processBeforeQueryDelete(cb, op)) { return 0; } return invoke(createQueryDeleteCBCommand(cb, op));  }

    // ===================================================================================
    //                                                                Optimistic Lock Info
    //                                                                ====================
    /**
     * {@inheritDoc}
     */
    @Override
    protected boolean hasVersionNoValue(Entity entity) {
        return false;
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
    protected MbMemberLogin downcast(Entity entity) {
        return helpEntityDowncastInternally(entity, MbMemberLogin.class);
    }

    protected MbMemberLoginCB downcast(ConditionBean cb) {
        return helpConditionBeanDowncastInternally(cb, MbMemberLoginCB.class);
    }

    @SuppressWarnings("unchecked")
    protected List<MbMemberLogin> downcast(List<? extends Entity> entityList) {
        return (List<MbMemberLogin>)entityList;
    }

    @SuppressWarnings("unchecked")
    protected InsertOption<MbMemberLoginCB> downcast(InsertOption<? extends ConditionBean> option) {
        return (InsertOption<MbMemberLoginCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected UpdateOption<MbMemberLoginCB> downcast(UpdateOption<? extends ConditionBean> option) {
        return (UpdateOption<MbMemberLoginCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected DeleteOption<MbMemberLoginCB> downcast(DeleteOption<? extends ConditionBean> option) {
        return (DeleteOption<MbMemberLoginCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<MbMemberLogin, MbMemberLoginCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> option) {
        return (QueryInsertSetupper<MbMemberLogin, MbMemberLoginCB>)option;
    }
}
