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
 * The behavior of MEMBER_ADDRESS as TABLE. <br />
 * <pre>
 * [primary key]
 *     MEMBER_ADDRESS_ID
 * 
 * [column]
 *     MEMBER_ADDRESS_ID, MEMBER_ID, VALID_BEGIN_DATE, VALID_END_DATE, ADDRESS, REGION_ID, REGISTER_DATETIME, REGISTER_USER, UPDATE_DATETIME, UPDATE_USER, VERSION_NO
 * 
 * [sequence]
 *     
 * 
 * [identity]
 *     MEMBER_ADDRESS_ID
 * 
 * [version-no]
 *     VERSION_NO
 * 
 * [foreign table]
 *     MEMBER, REGION
 * 
 * [referrer table]
 *     
 * 
 * [foreign property]
 *     member, region
 * 
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class MbBsMemberAddressBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "MEMBER_ADDRESS"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public DBMeta getDBMeta() { return MbMemberAddressDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public MbMemberAddressDbm getMyDBMeta() { return MbMemberAddressDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public Entity newEntity() { return newMyEntity(); }

    /** {@inheritDoc} */
    public ConditionBean newConditionBean() { return newMyConditionBean(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public MbMemberAddress newMyEntity() { return new MbMemberAddress(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public MbMemberAddressCB newMyConditionBean() { return new MbMemberAddressCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * MbMemberAddressCB cb = new MbMemberAddressCB();
     * cb.query().setFoo...(value);
     * int count = memberAddressBhv.<span style="color: #FD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of MbMemberAddress. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(MbMemberAddressCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(MbMemberAddressCB cb) { // called by selectCount(cb) 
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(MbMemberAddressCB cb) { // called by selectPage(cb)
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
     * MbMemberAddressCB cb = new MbMemberAddressCB();
     * cb.query().setFoo...(value);
     * MbMemberAddress memberAddress = memberAddressBhv.<span style="color: #FD4747">selectEntity</span>(cb);
     * if (memberAddress != null) {
     *     ... = memberAddress.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of MbMemberAddress. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public MbMemberAddress selectEntity(MbMemberAddressCB cb) {
        return doSelectEntity(cb, MbMemberAddress.class);
    }

    protected <ENTITY extends MbMemberAddress> ENTITY doSelectEntity(final MbMemberAddressCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityInternally(cb, entityType, new InternalSelectEntityCallback<ENTITY, MbMemberAddressCB>() {
            public List<ENTITY> callbackSelectList(MbMemberAddressCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); } });
    }

    @Override
    protected Entity doReadEntity(ConditionBean cb) {
        return selectEntity(downcast(cb));
    }

    /**
     * Select the entity by the condition-bean with deleted check.
     * <pre>
     * MbMemberAddressCB cb = new MbMemberAddressCB();
     * cb.query().setFoo...(value);
     * MbMemberAddress memberAddress = memberAddressBhv.<span style="color: #FD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = memberAddress.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of MbMemberAddress. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public MbMemberAddress selectEntityWithDeletedCheck(MbMemberAddressCB cb) {
        return doSelectEntityWithDeletedCheck(cb, MbMemberAddress.class);
    }

    protected <ENTITY extends MbMemberAddress> ENTITY doSelectEntityWithDeletedCheck(final MbMemberAddressCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityWithDeletedCheckInternally(cb, entityType, new InternalSelectEntityWithDeletedCheckCallback<ENTITY, MbMemberAddressCB>() {
            public List<ENTITY> callbackSelectList(MbMemberAddressCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); } });
    }

    @Override
    protected Entity doReadEntityWithDeletedCheck(ConditionBean cb) {
        return selectEntityWithDeletedCheck(downcast(cb));
    }

    /**
     * Select the entity by the primary-key value.
     * @param memberAddressId The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public MbMemberAddress selectByPKValue(Integer memberAddressId) {
        return doSelectByPKValue(memberAddressId, MbMemberAddress.class);
    }

    protected <ENTITY extends MbMemberAddress> ENTITY doSelectByPKValue(Integer memberAddressId, Class<ENTITY> entityType) {
        return doSelectEntity(buildPKCB(memberAddressId), entityType);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param memberAddressId The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public MbMemberAddress selectByPKValueWithDeletedCheck(Integer memberAddressId) {
        return doSelectByPKValueWithDeletedCheck(memberAddressId, MbMemberAddress.class);
    }

    protected <ENTITY extends MbMemberAddress> ENTITY doSelectByPKValueWithDeletedCheck(Integer memberAddressId, Class<ENTITY> entityType) {
        return doSelectEntityWithDeletedCheck(buildPKCB(memberAddressId), entityType);
    }

    private MbMemberAddressCB buildPKCB(Integer memberAddressId) {
        assertObjectNotNull("memberAddressId", memberAddressId);
        MbMemberAddressCB cb = newMyConditionBean();
        cb.query().setMemberAddressId_Equal(memberAddressId);
        return cb;
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * MbMemberAddressCB cb = new MbMemberAddressCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;MbMemberAddress&gt; memberAddressList = memberAddressBhv.<span style="color: #FD4747">selectList</span>(cb);
     * for (MbMemberAddress memberAddress : memberAddressList) {
     *     ... = memberAddress.get...();
     * }
     * </pre>
     * @param cb The condition-bean of MbMemberAddress. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<MbMemberAddress> selectList(MbMemberAddressCB cb) {
        return doSelectList(cb, MbMemberAddress.class);
    }

    protected <ENTITY extends MbMemberAddress> ListResultBean<ENTITY> doSelectList(MbMemberAddressCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", entityType);
        assertSpecifyDerivedReferrerEntityProperty(cb, entityType);
        return helpSelectListInternally(cb, entityType, new InternalSelectListCallback<ENTITY, MbMemberAddressCB>() {
            public List<ENTITY> callbackSelectList(MbMemberAddressCB cb, Class<ENTITY> entityType) { return delegateSelectList(cb, entityType); } });
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
     * MbMemberAddressCB cb = new MbMemberAddressCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #FD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;MbMemberAddress&gt; page = memberAddressBhv.<span style="color: #FD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (MbMemberAddress memberAddress : page) {
     *     ... = memberAddress.get...();
     * }
     * </pre>
     * @param cb The condition-bean of MbMemberAddress. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<MbMemberAddress> selectPage(MbMemberAddressCB cb) {
        return doSelectPage(cb, MbMemberAddress.class);
    }

    protected <ENTITY extends MbMemberAddress> PagingResultBean<ENTITY> doSelectPage(MbMemberAddressCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", entityType);
        return helpSelectPageInternally(cb, entityType, new InternalSelectPageCallback<ENTITY, MbMemberAddressCB>() {
            public int callbackSelectCount(MbMemberAddressCB cb) { return doSelectCountPlainly(cb); }
            public List<ENTITY> callbackSelectList(MbMemberAddressCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); }
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
     * MbMemberAddressCB cb = new MbMemberAddressCB();
     * cb.query().setFoo...(value);
     * memberAddressBhv.<span style="color: #FD4747">selectCursor</span>(cb, new EntityRowHandler&lt;MbMemberAddress&gt;() {
     *     public void handle(MbMemberAddress entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of MbMemberAddress. (NotNull)
     * @param entityRowHandler The handler of entity row of MbMemberAddress. (NotNull)
     */
    public void selectCursor(MbMemberAddressCB cb, EntityRowHandler<MbMemberAddress> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, MbMemberAddress.class);
    }

    protected <ENTITY extends MbMemberAddress> void doSelectCursor(MbMemberAddressCB cb, EntityRowHandler<ENTITY> entityRowHandler, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler<MbMemberAddress>", entityRowHandler); assertObjectNotNull("entityType", entityType);
        assertSpecifyDerivedReferrerEntityProperty(cb, entityType);
        helpSelectCursorInternally(cb, entityRowHandler, entityType, new InternalSelectCursorCallback<ENTITY, MbMemberAddressCB>() {
            public void callbackSelectCursor(MbMemberAddressCB cb, EntityRowHandler<ENTITY> entityRowHandler, Class<ENTITY> entityType) { delegateSelectCursor(cb, entityRowHandler, entityType); }
            public List<ENTITY> callbackSelectList(MbMemberAddressCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); }
        });
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * memberAddressBhv.<span style="color: #FD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(MbMemberAddressCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> SLFunction<MbMemberAddressCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
    }

    protected <RESULT, CB extends MbMemberAddressCB> SLFunction<CB, RESULT> doScalarSelect(Class<RESULT> resultType, CB cb) {
        assertObjectNotNull("resultType", resultType); assertCBStateValid(cb);
        cb.xsetupForScalarSelect(); cb.getSqlClause().disableSelectIndex(); // for when you use union
        return createSLFunction(cb, resultType);
    }

    protected <RESULT, CB extends MbMemberAddressCB> SLFunction<CB, RESULT> createSLFunction(CB cb, Class<RESULT> resultType) {
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
     * @param memberAddressList The list of memberAddress. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MbMember> pulloutMember(List<MbMemberAddress> memberAddressList) {
        return helpPulloutInternally(memberAddressList, new InternalPulloutCallback<MbMemberAddress, MbMember>() {
            public MbMember getFr(MbMemberAddress e) { return e.getMember(); }
            public boolean hasRf() { return true; }
            public void setRfLs(MbMember e, List<MbMemberAddress> ls)
            { e.setMemberAddressList(ls); }
        });
    }
    /**
     * Pull out the list of foreign table 'MbRegion'.
     * @param memberAddressList The list of memberAddress. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MbRegion> pulloutRegion(List<MbMemberAddress> memberAddressList) {
        return helpPulloutInternally(memberAddressList, new InternalPulloutCallback<MbMemberAddress, MbRegion>() {
            public MbRegion getFr(MbMemberAddress e) { return e.getRegion(); }
            public boolean hasRf() { return true; }
            public void setRfLs(MbRegion e, List<MbMemberAddress> ls)
            { e.setMemberAddressList(ls); }
        });
    }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key memberAddressId.
     * @param memberAddressList The list of memberAddress. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Integer> extractMemberAddressIdList(List<MbMemberAddress> memberAddressList) {
        return helpExtractListInternally(memberAddressList, new InternalExtractCallback<MbMemberAddress, Integer>() {
            public Integer getCV(MbMemberAddress e) { return e.getMemberAddressId(); }
        });
    }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * MbMemberAddress memberAddress = new MbMemberAddress();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * memberAddress.setFoo...(value);
     * memberAddress.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//memberAddress.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//memberAddress.set...;</span>
     * memberAddressBhv.<span style="color: #FD4747">insert</span>(memberAddress);
     * ... = memberAddress.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param memberAddress The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(MbMemberAddress memberAddress) {
        doInsert(memberAddress, null);
    }

    protected void doInsert(MbMemberAddress memberAddress, InsertOption<MbMemberAddressCB> option) {
        assertObjectNotNull("memberAddress", memberAddress);
        prepareInsertOption(option);
        delegateInsert(memberAddress, option);
    }

    protected void prepareInsertOption(InsertOption<MbMemberAddressCB> option) {
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
     * MbMemberAddress memberAddress = new MbMemberAddress();
     * memberAddress.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * memberAddress.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//memberAddress.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//memberAddress.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * memberAddress.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     memberAddressBhv.<span style="color: #FD4747">update</span>(memberAddress);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * } 
     * </pre>
     * @param memberAddress The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(final MbMemberAddress memberAddress) {
        doUpdate(memberAddress, null);
    }

    protected void doUpdate(MbMemberAddress memberAddress, final UpdateOption<MbMemberAddressCB> option) {
        assertObjectNotNull("memberAddress", memberAddress);
        prepareUpdateOption(option);
        helpUpdateInternally(memberAddress, new InternalUpdateCallback<MbMemberAddress>() {
            public int callbackDelegateUpdate(MbMemberAddress entity) { return delegateUpdate(entity, option); } });
    }

    protected void prepareUpdateOption(UpdateOption<MbMemberAddressCB> option) {
        if (option == null) { return; }
        assertUpdateOptionStatus(option);
        if (option.hasSelfSpecification()) {
            option.resolveSelfSpecification(createCBForVaryingUpdate());
        }
        if (option.hasSpecifiedUpdateColumn()) {
            option.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    protected MbMemberAddressCB createCBForVaryingUpdate() {
        MbMemberAddressCB cb = newMyConditionBean();
        cb.xsetupForVaryingUpdate();
        return cb;
    }

    protected MbMemberAddressCB createCBForSpecifiedUpdate() {
        MbMemberAddressCB cb = newMyConditionBean();
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
     * MbMemberAddress memberAddress = new MbMemberAddress();
     * memberAddress.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * memberAddress.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//memberAddress.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//memberAddress.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//memberAddress.setVersionNo(value);</span>
     * memberAddressBhv.<span style="color: #FD4747">updateNonstrict</span>(memberAddress);
     * </pre>
     * @param memberAddress The entity of update target. (NotNull, PrimaryKeyNotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void updateNonstrict(final MbMemberAddress memberAddress) {
        doUpdateNonstrict(memberAddress, null);
    }

    protected void doUpdateNonstrict(MbMemberAddress memberAddress, final UpdateOption<MbMemberAddressCB> option) {
        assertObjectNotNull("memberAddress", memberAddress);
        prepareUpdateOption(option);
        helpUpdateNonstrictInternally(memberAddress, new InternalUpdateNonstrictCallback<MbMemberAddress>() {
            public int callbackDelegateUpdateNonstrict(MbMemberAddress entity) { return delegateUpdateNonstrict(entity, option); } });
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
     * @param memberAddress The entity of insert or update target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(MbMemberAddress memberAddress) {
        doInesrtOrUpdate(memberAddress, null, null);
    }

    protected void doInesrtOrUpdate(MbMemberAddress memberAddress, final InsertOption<MbMemberAddressCB> insertOption, final UpdateOption<MbMemberAddressCB> updateOption) {
        helpInsertOrUpdateInternally(memberAddress, new InternalInsertOrUpdateCallback<MbMemberAddress, MbMemberAddressCB>() {
            public void callbackInsert(MbMemberAddress entity) { doInsert(entity, insertOption); }
            public void callbackUpdate(MbMemberAddress entity) { doUpdate(entity, updateOption); }
            public MbMemberAddressCB callbackNewMyConditionBean() { return newMyConditionBean(); }
            public int callbackSelectCount(MbMemberAddressCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrModify(Entity entity, InsertOption<? extends ConditionBean> insertOption,
            UpdateOption<? extends ConditionBean> updateOption) {
        if (insertOption == null && updateOption == null) { insertOrUpdate(downcast(entity)); }
        else {
            insertOption = insertOption == null ? new InsertOption<MbMemberAddressCB>() : insertOption;
            updateOption = updateOption == null ? new UpdateOption<MbMemberAddressCB>() : updateOption;
            varyingInsertOrUpdate(downcast(entity), downcast(insertOption), downcast(updateOption));
        }
    }

    /**
     * Insert or update the entity non-strictly modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br />
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() }
     * <p><span style="color: #FD4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param memberAddress The entity of insert or update target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdateNonstrict(MbMemberAddress memberAddress) {
        doInesrtOrUpdateNonstrict(memberAddress, null, null);
    }

    protected void doInesrtOrUpdateNonstrict(MbMemberAddress memberAddress, final InsertOption<MbMemberAddressCB> insertOption, final UpdateOption<MbMemberAddressCB> updateOption) {
        helpInsertOrUpdateInternally(memberAddress, new InternalInsertOrUpdateNonstrictCallback<MbMemberAddress>() {
            public void callbackInsert(MbMemberAddress entity) { doInsert(entity, insertOption); }
            public void callbackUpdateNonstrict(MbMemberAddress entity) { doUpdateNonstrict(entity, updateOption); }
        });
    }

    @Override
    protected void doCreateOrModifyNonstrict(Entity entity, InsertOption<? extends ConditionBean> insertOption,
            UpdateOption<? extends ConditionBean> updateOption) {
        if (insertOption == null && updateOption == null) { insertOrUpdateNonstrict(downcast(entity)); }
        else {
            insertOption = insertOption == null ? new InsertOption<MbMemberAddressCB>() : insertOption;
            updateOption = updateOption == null ? new UpdateOption<MbMemberAddressCB>() : updateOption;
            varyingInsertOrUpdateNonstrict(downcast(entity), downcast(insertOption), downcast(updateOption));
        }
    }

    /**
     * Delete the entity. (ZeroUpdateException, ExclusiveControl)
     * <pre>
     * MbMemberAddress memberAddress = new MbMemberAddress();
     * memberAddress.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * memberAddress.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     memberAddressBhv.<span style="color: #FD4747">delete</span>(memberAddress);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * } 
     * </pre>
     * @param memberAddress The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(MbMemberAddress memberAddress) {
        doDelete(memberAddress, null);
    }

    protected void doDelete(MbMemberAddress memberAddress, final DeleteOption<MbMemberAddressCB> option) {
        assertObjectNotNull("memberAddress", memberAddress);
        prepareDeleteOption(option);
        helpDeleteInternally(memberAddress, new InternalDeleteCallback<MbMemberAddress>() {
            public int callbackDelegateDelete(MbMemberAddress entity) { return delegateDelete(entity, option); } });
    }

    protected void prepareDeleteOption(DeleteOption<MbMemberAddressCB> option) {
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
     * MbMemberAddress memberAddress = new MbMemberAddress();
     * memberAddress.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//memberAddress.setVersionNo(value);</span>
     * memberAddressBhv.<span style="color: #FD4747">deleteNonstrict</span>(memberAddress);
     * </pre>
     * @param memberAddress The entity of delete target. (NotNull, PrimaryKeyNotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrict(MbMemberAddress memberAddress) {
        doDeleteNonstrict(memberAddress, null);
    }

    protected void doDeleteNonstrict(MbMemberAddress memberAddress, final DeleteOption<MbMemberAddressCB> option) {
        assertObjectNotNull("memberAddress", memberAddress);
        prepareDeleteOption(option);
        helpDeleteNonstrictInternally(memberAddress, new InternalDeleteNonstrictCallback<MbMemberAddress>() {
            public int callbackDelegateDeleteNonstrict(MbMemberAddress entity) { return delegateDeleteNonstrict(entity, option); } });
    }

    /**
     * Delete the entity non-strictly ignoring deleted. {ZeroUpdateException, NonExclusiveControl}
     * <pre>
     * MbMemberAddress memberAddress = new MbMemberAddress();
     * memberAddress.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//memberAddress.setVersionNo(value);</span>
     * memberAddressBhv.<span style="color: #FD4747">deleteNonstrictIgnoreDeleted</span>(memberAddress);
     * <span style="color: #3F7E5E">// if the target entity doesn't exist, no exception</span>
     * </pre>
     * @param memberAddress The entity of delete target. (NotNull, PrimaryKeyNotNull)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrictIgnoreDeleted(MbMemberAddress memberAddress) {
        doDeleteNonstrictIgnoreDeleted(memberAddress, null);
    }

    protected void doDeleteNonstrictIgnoreDeleted(MbMemberAddress memberAddress, final DeleteOption<MbMemberAddressCB> option) {
        assertObjectNotNull("memberAddress", memberAddress);
        prepareDeleteOption(option);
        helpDeleteNonstrictIgnoreDeletedInternally(memberAddress, new InternalDeleteNonstrictIgnoreDeletedCallback<MbMemberAddress>() {
            public int callbackDelegateDeleteNonstrict(MbMemberAddress entity) { return delegateDeleteNonstrict(entity, option); } });
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
     *     MbMemberAddress memberAddress = new MbMemberAddress();
     *     memberAddress.setFooName("foo");
     *     if (...) {
     *         memberAddress.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     memberAddressList.add(memberAddress);
     * }
     * memberAddressBhv.<span style="color: #FD4747">batchInsert</span>(memberAddressList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param memberAddressList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<MbMemberAddress> memberAddressList) {
        InsertOption<MbMemberAddressCB> option = createInsertUpdateOption();
        return doBatchInsert(memberAddressList, option);
    }

    protected int[] doBatchInsert(List<MbMemberAddress> memberAddressList, InsertOption<MbMemberAddressCB> option) {
        assertObjectNotNull("memberAddressList", memberAddressList);
        prepareBatchInsertOption(memberAddressList, option);
        return delegateBatchInsert(memberAddressList, option);
    }

    protected void prepareBatchInsertOption(List<MbMemberAddress> memberAddressList, InsertOption<MbMemberAddressCB> option) {
        option.xallowInsertColumnModifiedPropertiesFragmented();
        option.xacceptInsertColumnModifiedPropertiesIfNeeds(memberAddressList);
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
     *     MbMemberAddress memberAddress = new MbMemberAddress();
     *     memberAddress.setFooName("foo");
     *     if (...) {
     *         memberAddress.setFooPrice(123);
     *     } else {
     *         memberAddress.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//memberAddress.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     memberAddressList.add(memberAddress);
     * }
     * memberAddressBhv.<span style="color: #FD4747">batchUpdate</span>(memberAddressList);
     * </pre>
     * @param memberAddressList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<MbMemberAddress> memberAddressList) {
        UpdateOption<MbMemberAddressCB> option = createPlainUpdateOption();
        return doBatchUpdate(memberAddressList, option);
    }

    protected int[] doBatchUpdate(List<MbMemberAddress> memberAddressList, UpdateOption<MbMemberAddressCB> option) {
        assertObjectNotNull("memberAddressList", memberAddressList);
        prepareBatchUpdateOption(memberAddressList, option);
        return delegateBatchUpdate(memberAddressList, option);
    }

    protected void prepareBatchUpdateOption(List<MbMemberAddress> memberAddressList, UpdateOption<MbMemberAddressCB> option) {
        option.xacceptUpdateColumnModifiedPropertiesIfNeeds(memberAddressList);
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
     * memberAddressBhv.<span style="color: #FD4747">batchUpdate</span>(memberAddressList, new SpecifyQuery<MbMemberAddressCB>() {
     *     public void specify(MbMemberAddressCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #FD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #FD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span> 
     * memberAddressBhv.<span style="color: #FD4747">batchUpdate</span>(memberAddressList, new SpecifyQuery<MbMemberAddressCB>() {
     *     public void specify(MbMemberAddressCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #FD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param memberAddressList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<MbMemberAddress> memberAddressList, SpecifyQuery<MbMemberAddressCB> updateColumnSpec) {
        return doBatchUpdate(memberAddressList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    /**
     * Batch-update the entity list non-strictly modified-only of same-set columns. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <span style="color: #FD4747; font-size: 140%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     MbMemberAddress memberAddress = new MbMemberAddress();
     *     memberAddress.setFooName("foo");
     *     if (...) {
     *         memberAddress.setFooPrice(123);
     *     } else {
     *         memberAddress.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//memberAddress.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     memberAddressList.add(memberAddress);
     * }
     * memberAddressBhv.<span style="color: #FD4747">batchUpdate</span>(memberAddressList);
     * </pre>
     * @param memberAddressList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<MbMemberAddress> memberAddressList) {
        UpdateOption<MbMemberAddressCB> option = createPlainUpdateOption();
        return doBatchUpdateNonstrict(memberAddressList, option);
    }

    protected int[] doBatchUpdateNonstrict(List<MbMemberAddress> memberAddressList, UpdateOption<MbMemberAddressCB> option) {
        assertObjectNotNull("memberAddressList", memberAddressList);
        prepareBatchUpdateOption(memberAddressList, option);
        return delegateBatchUpdateNonstrict(memberAddressList, option);
    }

    /**
     * Batch-update the entity list non-strictly specified-only. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span> 
     * memberAddressBhv.<span style="color: #FD4747">batchUpdateNonstrict</span>(memberAddressList, new SpecifyQuery<MbMemberAddressCB>() {
     *     public void specify(MbMemberAddressCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #FD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #FD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span> 
     * memberAddressBhv.<span style="color: #FD4747">batchUpdateNonstrict</span>(memberAddressList, new SpecifyQuery<MbMemberAddressCB>() {
     *     public void specify(MbMemberAddressCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #FD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).</p>
     * @param memberAddressList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<MbMemberAddress> memberAddressList, SpecifyQuery<MbMemberAddressCB> updateColumnSpec) {
        return doBatchUpdateNonstrict(memberAddressList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> option) {
        if (option == null) { return batchUpdateNonstrict(downcast(ls)); }
        else { return varyingBatchUpdateNonstrict(downcast(ls), downcast(option)); }
    }

    /**
     * Batch-delete the entity list. (ExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param memberAddressList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchDelete(List<MbMemberAddress> memberAddressList) {
        return doBatchDelete(memberAddressList, null);
    }

    protected int[] doBatchDelete(List<MbMemberAddress> memberAddressList, DeleteOption<MbMemberAddressCB> option) {
        assertObjectNotNull("memberAddressList", memberAddressList);
        prepareDeleteOption(option);
        return delegateBatchDelete(memberAddressList, option);
    }

    @Override
    protected int[] doLumpRemove(List<Entity> ls, DeleteOption<? extends ConditionBean> option) {
        if (option == null) { return batchDelete(downcast(ls)); }
        else { return varyingBatchDelete(downcast(ls), downcast(option)); }
    }

    /**
     * Batch-delete the entity list non-strictly. {NonExclusiveControl} <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param memberAddressList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDeleteNonstrict(List<MbMemberAddress> memberAddressList) {
        return doBatchDeleteNonstrict(memberAddressList, null);
    }

    protected int[] doBatchDeleteNonstrict(List<MbMemberAddress> memberAddressList, DeleteOption<MbMemberAddressCB> option) {
        assertObjectNotNull("memberAddressList", memberAddressList);
        prepareDeleteOption(option);
        return delegateBatchDeleteNonstrict(memberAddressList, option);
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
     * memberAddressBhv.<span style="color: #FD4747">queryInsert</span>(new QueryInsertSetupper&lt;MbMemberAddress, MbMemberAddressCB&gt;() {
     *     public ConditionBean setup(memberAddress entity, MbMemberAddressCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<MbMemberAddress, MbMemberAddressCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(QueryInsertSetupper<MbMemberAddress, MbMemberAddressCB> setupper, InsertOption<MbMemberAddressCB> option) {
        assertObjectNotNull("setupper", setupper);
        prepareInsertOption(option);
        MbMemberAddress entity = new MbMemberAddress();
        MbMemberAddressCB intoCB = createCBForQueryInsert();
        ConditionBean resourceCB = setupper.setup(entity, intoCB);
        return delegateQueryInsert(entity, intoCB, resourceCB, option);
    }

    protected MbMemberAddressCB createCBForQueryInsert() {
        MbMemberAddressCB cb = newMyConditionBean();
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
     * MbMemberAddress memberAddress = new MbMemberAddress();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//memberAddress.setPK...(value);</span>
     * memberAddress.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//memberAddress.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//memberAddress.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//memberAddress.setVersionNo(value);</span>
     * MbMemberAddressCB cb = new MbMemberAddressCB();
     * cb.query().setFoo...(value);
     * memberAddressBhv.<span style="color: #FD4747">queryUpdate</span>(memberAddress, cb);
     * </pre>
     * @param memberAddress The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of MbMemberAddress. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(MbMemberAddress memberAddress, MbMemberAddressCB cb) {
        return doQueryUpdate(memberAddress, cb, null);
    }

    protected int doQueryUpdate(MbMemberAddress memberAddress, MbMemberAddressCB cb, UpdateOption<MbMemberAddressCB> option) {
        assertObjectNotNull("memberAddress", memberAddress); assertCBStateValid(cb);
        prepareUpdateOption(option);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryUpdate(memberAddress, cb, option) : 0;
    }

    @Override
    protected int doRangeModify(Entity entity, ConditionBean cb, UpdateOption<? extends ConditionBean> option) {
        if (option == null) { return queryUpdate(downcast(entity), (MbMemberAddressCB)cb); }
        else { return varyingQueryUpdate(downcast(entity), (MbMemberAddressCB)cb, downcast(option)); }
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * MbMemberAddressCB cb = new MbMemberAddressCB();
     * cb.query().setFoo...(value);
     * memberAddressBhv.<span style="color: #FD4747">queryDelete</span>(memberAddress, cb);
     * </pre>
     * @param cb The condition-bean of MbMemberAddress. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(MbMemberAddressCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(MbMemberAddressCB cb, DeleteOption<MbMemberAddressCB> option) {
        assertCBStateValid(cb);
        prepareDeleteOption(option);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryDelete(cb, option) : 0;
    }

    @Override
    protected int doRangeRemove(ConditionBean cb, DeleteOption<? extends ConditionBean> option) {
        if (option == null) { return queryDelete((MbMemberAddressCB)cb); }
        else { return varyingQueryDelete((MbMemberAddressCB)cb, downcast(option)); }
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
     * MbMemberAddress memberAddress = new MbMemberAddress();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * memberAddress.setFoo...(value);
     * memberAddress.setBar...(value);
     * InsertOption<MbMemberAddressCB> option = new InsertOption<MbMemberAddressCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * memberAddressBhv.<span style="color: #FD4747">varyingInsert</span>(memberAddress, option);
     * ... = memberAddress.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param memberAddress The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(MbMemberAddress memberAddress, InsertOption<MbMemberAddressCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(memberAddress, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, ExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * MbMemberAddress memberAddress = new MbMemberAddress();
     * memberAddress.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * memberAddress.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * memberAddress.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;MbMemberAddressCB&gt; option = new UpdateOption&lt;MbMemberAddressCB&gt;();
     *     option.self(new SpecifyQuery&lt;MbMemberAddressCB&gt;() {
     *         public void specify(MbMemberAddressCB cb) {
     *             cb.specify().<span style="color: #FD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     memberAddressBhv.<span style="color: #FD4747">varyingUpdate</span>(memberAddress, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param memberAddress The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(MbMemberAddress memberAddress, UpdateOption<MbMemberAddressCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(memberAddress, option);
    }

    /**
     * Update the entity with varying requests non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as updateNonstrict(entity).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * MbMemberAddress memberAddress = new MbMemberAddress();
     * memberAddress.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * memberAddress.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//memberAddress.setVersionNo(value);</span>
     * UpdateOption&lt;MbMemberAddressCB&gt; option = new UpdateOption&lt;MbMemberAddressCB&gt;();
     * option.self(new SpecifyQuery&lt;MbMemberAddressCB&gt;() {
     *     public void specify(MbMemberAddressCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * memberAddressBhv.<span style="color: #FD4747">varyingUpdateNonstrict</span>(memberAddress, option);
     * </pre>
     * @param memberAddress The entity of update target. (NotNull, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdateNonstrict(MbMemberAddress memberAddress, UpdateOption<MbMemberAddressCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdateNonstrict(memberAddress, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param memberAddress The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(MbMemberAddress memberAddress, InsertOption<MbMemberAddressCB> insertOption, UpdateOption<MbMemberAddressCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdate(memberAddress, insertOption, updateOption);
    }

    /**
     * Insert or update the entity with varying requests non-strictly. (NonExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdateNonstrict(entity).
     * @param memberAddress The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdateNonstrict(MbMemberAddress memberAddress, InsertOption<MbMemberAddressCB> insertOption, UpdateOption<MbMemberAddressCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdateNonstrict(memberAddress, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, ExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param memberAddress The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(MbMemberAddress memberAddress, DeleteOption<MbMemberAddressCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(memberAddress, option);
    }

    /**
     * Delete the entity with varying requests non-strictly. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as deleteNonstrict(entity).
     * @param memberAddress The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDeleteNonstrict(MbMemberAddress memberAddress, DeleteOption<MbMemberAddressCB> option) {
        assertDeleteOptionNotNull(option);
        doDeleteNonstrict(memberAddress, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param memberAddressList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<MbMemberAddress> memberAddressList, InsertOption<MbMemberAddressCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(memberAddressList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param memberAddressList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<MbMemberAddress> memberAddressList, UpdateOption<MbMemberAddressCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(memberAddressList, option);
    }

    /**
     * Batch-update the list with varying requests non-strictly. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param memberAddressList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdateNonstrict(List<MbMemberAddress> memberAddressList, UpdateOption<MbMemberAddressCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdateNonstrict(memberAddressList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param memberAddressList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<MbMemberAddress> memberAddressList, DeleteOption<MbMemberAddressCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(memberAddressList, option);
    }

    /**
     * Batch-delete the list with varying requests non-strictly. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDeleteNonstrict(entityList).
     * @param memberAddressList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDeleteNonstrict(List<MbMemberAddress> memberAddressList, DeleteOption<MbMemberAddressCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDeleteNonstrict(memberAddressList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<MbMemberAddress, MbMemberAddressCB> setupper, InsertOption<MbMemberAddressCB> option) {
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
     * MbMemberAddress memberAddress = new MbMemberAddress();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//memberAddress.setPK...(value);</span>
     * memberAddress.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//memberAddress.setVersionNo(value);</span>
     * MbMemberAddressCB cb = new MbMemberAddressCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;MbMemberAddressCB&gt; option = new UpdateOption&lt;MbMemberAddressCB&gt;();
     * option.self(new SpecifyQuery&lt;MbMemberAddressCB&gt;() {
     *     public void specify(MbMemberAddressCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * memberAddressBhv.<span style="color: #FD4747">varyingQueryUpdate</span>(memberAddress, cb, option);
     * </pre>
     * @param memberAddress The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of MbMemberAddress. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(MbMemberAddress memberAddress, MbMemberAddressCB cb, UpdateOption<MbMemberAddressCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(memberAddress, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of MbMemberAddress. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(MbMemberAddressCB cb, DeleteOption<MbMemberAddressCB> option) {
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
    public OutsideSqlBasicExecutor<MbMemberAddressBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCountUniquely(MbMemberAddressCB cb) { return invoke(createSelectCountCBCommand(cb, true)); }
    protected int delegateSelectCountPlainly(MbMemberAddressCB cb) { return invoke(createSelectCountCBCommand(cb, false)); }
    protected <ENTITY extends MbMemberAddress> void delegateSelectCursor(MbMemberAddressCB cb, EntityRowHandler<ENTITY> erh, Class<ENTITY> et)
    { invoke(createSelectCursorCBCommand(cb, erh, et)); }
    protected <ENTITY extends MbMemberAddress> List<ENTITY> delegateSelectList(MbMemberAddressCB cb, Class<ENTITY> et)
    { return invoke(createSelectListCBCommand(cb, et)); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(MbMemberAddress e, InsertOption<MbMemberAddressCB> op)
    { if (!processBeforeInsert(e, op)) { return 0; }
      return invoke(createInsertEntityCommand(e, op)); }
    protected int delegateUpdate(MbMemberAddress e, UpdateOption<MbMemberAddressCB> op)
    { if (!processBeforeUpdate(e, op)) { return 0; }
      return invoke(createUpdateEntityCommand(e, op)); }
    protected int delegateUpdateNonstrict(MbMemberAddress e, UpdateOption<MbMemberAddressCB> op)
    { if (!processBeforeUpdate(e, op)) { return 0; }
      return invoke(createUpdateNonstrictEntityCommand(e, op)); }
    protected int delegateDelete(MbMemberAddress e, DeleteOption<MbMemberAddressCB> op)
    { if (!processBeforeDelete(e, op)) { return 0; }
      return invoke(createDeleteEntityCommand(e, op)); }
    protected int delegateDeleteNonstrict(MbMemberAddress e, DeleteOption<MbMemberAddressCB> op)
    { if (!processBeforeDelete(e, op)) { return 0; }
      return invoke(createDeleteNonstrictEntityCommand(e, op)); }

    protected int[] delegateBatchInsert(List<MbMemberAddress> ls, InsertOption<MbMemberAddressCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchInsertCommand(processBatchInternally(ls, op), op)); }
    protected int[] delegateBatchUpdate(List<MbMemberAddress> ls, UpdateOption<MbMemberAddressCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateCommand(processBatchInternally(ls, op, false), op)); }
    protected int[] delegateBatchUpdateNonstrict(List<MbMemberAddress> ls, UpdateOption<MbMemberAddressCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateNonstrictCommand(processBatchInternally(ls, op, true), op)); }
    protected int[] delegateBatchDelete(List<MbMemberAddress> ls, DeleteOption<MbMemberAddressCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteCommand(processBatchInternally(ls, op, false), op)); }
    protected int[] delegateBatchDeleteNonstrict(List<MbMemberAddress> ls, DeleteOption<MbMemberAddressCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteNonstrictCommand(processBatchInternally(ls, op, true), op)); }

    protected int delegateQueryInsert(MbMemberAddress e, MbMemberAddressCB inCB, ConditionBean resCB, InsertOption<MbMemberAddressCB> op)
    { if (!processBeforeQueryInsert(e, inCB, resCB, op)) { return 0; } return invoke(createQueryInsertCBCommand(e, inCB, resCB, op));  }
    protected int delegateQueryUpdate(MbMemberAddress e, MbMemberAddressCB cb, UpdateOption<MbMemberAddressCB> op)
    { if (!processBeforeQueryUpdate(e, cb, op)) { return 0; } return invoke(createQueryUpdateCBCommand(e, cb, op));  }
    protected int delegateQueryDelete(MbMemberAddressCB cb, DeleteOption<MbMemberAddressCB> op)
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
    protected MbMemberAddress downcast(Entity entity) {
        return helpEntityDowncastInternally(entity, MbMemberAddress.class);
    }

    protected MbMemberAddressCB downcast(ConditionBean cb) {
        return helpConditionBeanDowncastInternally(cb, MbMemberAddressCB.class);
    }

    @SuppressWarnings("unchecked")
    protected List<MbMemberAddress> downcast(List<? extends Entity> entityList) {
        return (List<MbMemberAddress>)entityList;
    }

    @SuppressWarnings("unchecked")
    protected InsertOption<MbMemberAddressCB> downcast(InsertOption<? extends ConditionBean> option) {
        return (InsertOption<MbMemberAddressCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected UpdateOption<MbMemberAddressCB> downcast(UpdateOption<? extends ConditionBean> option) {
        return (UpdateOption<MbMemberAddressCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected DeleteOption<MbMemberAddressCB> downcast(DeleteOption<? extends ConditionBean> option) {
        return (DeleteOption<MbMemberAddressCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<MbMemberAddress, MbMemberAddressCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> option) {
        return (QueryInsertSetupper<MbMemberAddress, MbMemberAddressCB>)option;
    }
}
