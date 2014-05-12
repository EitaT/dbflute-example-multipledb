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
 * The behavior of REGION as TABLE. <br />
 * <pre>
 * [primary key]
 *     REGION_ID
 *
 * [column]
 *     REGION_ID, REGION_NAME
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
 *     MEMBER_ADDRESS
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     memberAddressList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class MbBsRegionBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "REGION"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public DBMeta getDBMeta() { return MbRegionDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public MbRegionDbm getMyDBMeta() { return MbRegionDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public Entity newEntity() { return newMyEntity(); }

    /** {@inheritDoc} */
    public ConditionBean newConditionBean() { return newMyConditionBean(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public MbRegion newMyEntity() { return new MbRegion(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public MbRegionCB newMyConditionBean() { return new MbRegionCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * MbRegionCB cb = new MbRegionCB();
     * cb.query().setFoo...(value);
     * int count = regionBhv.<span style="color: #DD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of MbRegion. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(MbRegionCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(MbRegionCB cb) { // called by selectCount(cb)
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(MbRegionCB cb) { // called by selectPage(cb)
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
     * MbRegionCB cb = new MbRegionCB();
     * cb.query().setFoo...(value);
     * MbRegion region = regionBhv.<span style="color: #DD4747">selectEntity</span>(cb);
     * if (region != null) { <span style="color: #3F7E5E">// null check</span>
     *     ... = region.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of MbRegion. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public MbRegion selectEntity(MbRegionCB cb) {
        return doSelectEntity(cb, MbRegion.class);
    }

    protected <ENTITY extends MbRegion> ENTITY doSelectEntity(MbRegionCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectEntityInternally(cb, tp, new InternalSelectEntityCallback<ENTITY, MbRegionCB>() {
            public List<ENTITY> callbackSelectList(MbRegionCB lcb, Class<ENTITY> ltp) { return doSelectList(lcb, ltp); } });
    }

    protected <ENTITY extends MbRegion> OptionalEntity<ENTITY> doSelectOptionalEntity(MbRegionCB cb, Class<ENTITY> tp) {
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
     * MbRegionCB cb = new MbRegionCB();
     * cb.query().setFoo...(value);
     * MbRegion region = regionBhv.<span style="color: #DD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = region.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of MbRegion. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (point is not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public MbRegion selectEntityWithDeletedCheck(MbRegionCB cb) {
        return doSelectEntityWithDeletedCheck(cb, MbRegion.class);
    }

    protected <ENTITY extends MbRegion> ENTITY doSelectEntityWithDeletedCheck(MbRegionCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectEntityWithDeletedCheckInternally(cb, tp, new InternalSelectEntityWithDeletedCheckCallback<ENTITY, MbRegionCB>() {
            public List<ENTITY> callbackSelectList(MbRegionCB lcb, Class<ENTITY> ltp) { return doSelectList(lcb, ltp); } });
    }

    @Override
    protected Entity doReadEntityWithDeletedCheck(ConditionBean cb) {
        return selectEntityWithDeletedCheck(downcast(cb));
    }

    /**
     * Select the entity by the primary-key value.
     * @param regionId The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public MbRegion selectByPKValue(Integer regionId) {
        return doSelectByPKValue(regionId, MbRegion.class);
    }

    protected <ENTITY extends MbRegion> ENTITY doSelectByPKValue(Integer regionId, Class<ENTITY> entityType) {
        return doSelectEntity(buildPKCB(regionId), entityType);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param regionId The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public MbRegion selectByPKValueWithDeletedCheck(Integer regionId) {
        return doSelectByPKValueWithDeletedCheck(regionId, MbRegion.class);
    }

    protected <ENTITY extends MbRegion> ENTITY doSelectByPKValueWithDeletedCheck(Integer regionId, Class<ENTITY> entityType) {
        return doSelectEntityWithDeletedCheck(buildPKCB(regionId), entityType);
    }

    private MbRegionCB buildPKCB(Integer regionId) {
        assertObjectNotNull("regionId", regionId);
        MbRegionCB cb = newMyConditionBean();
        cb.query().setRegionId_Equal(regionId);
        return cb;
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * MbRegionCB cb = new MbRegionCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;MbRegion&gt; regionList = regionBhv.<span style="color: #DD4747">selectList</span>(cb);
     * for (MbRegion region : regionList) {
     *     ... = region.get...();
     * }
     * </pre>
     * @param cb The condition-bean of MbRegion. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<MbRegion> selectList(MbRegionCB cb) {
        return doSelectList(cb, MbRegion.class);
    }

    protected <ENTITY extends MbRegion> ListResultBean<ENTITY> doSelectList(MbRegionCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        return helpSelectListInternally(cb, tp, new InternalSelectListCallback<ENTITY, MbRegionCB>() {
            public List<ENTITY> callbackSelectList(MbRegionCB lcb, Class<ENTITY> ltp) { return delegateSelectList(lcb, ltp); } });
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
     * MbRegionCB cb = new MbRegionCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #DD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;MbRegion&gt; page = regionBhv.<span style="color: #DD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (MbRegion region : page) {
     *     ... = region.get...();
     * }
     * </pre>
     * @param cb The condition-bean of MbRegion. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<MbRegion> selectPage(MbRegionCB cb) {
        return doSelectPage(cb, MbRegion.class);
    }

    protected <ENTITY extends MbRegion> PagingResultBean<ENTITY> doSelectPage(MbRegionCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectPageInternally(cb, tp, new InternalSelectPageCallback<ENTITY, MbRegionCB>() {
            public int callbackSelectCount(MbRegionCB cb) { return doSelectCountPlainly(cb); }
            public List<ENTITY> callbackSelectList(MbRegionCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); }
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
     * MbRegionCB cb = new MbRegionCB();
     * cb.query().setFoo...(value);
     * regionBhv.<span style="color: #DD4747">selectCursor</span>(cb, new EntityRowHandler&lt;MbRegion&gt;() {
     *     public void handle(MbRegion entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of MbRegion. (NotNull)
     * @param entityRowHandler The handler of entity row of MbRegion. (NotNull)
     */
    public void selectCursor(MbRegionCB cb, EntityRowHandler<MbRegion> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, MbRegion.class);
    }

    protected <ENTITY extends MbRegion> void doSelectCursor(MbRegionCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler", handler); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        helpSelectCursorInternally(cb, handler, tp, new InternalSelectCursorCallback<ENTITY, MbRegionCB>() {
            public void callbackSelectCursor(MbRegionCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) { delegateSelectCursor(cb, handler, tp); }
            public List<ENTITY> callbackSelectList(MbRegionCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); }
        });
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * regionBhv.<span style="color: #DD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(MbRegionCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> SLFunction<MbRegionCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
    }

    protected <RESULT, CB extends MbRegionCB> SLFunction<CB, RESULT> doScalarSelect(Class<RESULT> tp, CB cb) {
        assertObjectNotNull("resultType", tp); assertCBStateValid(cb);
        cb.xsetupForScalarSelect(); cb.getSqlClause().disableSelectIndex(); // for when you use union
        return createSLFunction(cb, tp);
    }

    protected <RESULT, CB extends MbRegionCB> SLFunction<CB, RESULT> createSLFunction(CB cb, Class<RESULT> tp) {
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
     * Load referrer of memberAddressList by the set-upper of referrer. <br />
     * MEMBER_ADDRESS by REGION_ID, named 'memberAddressList'.
     * <pre>
     * regionBhv.<span style="color: #DD4747">loadMemberAddressList</span>(regionList, new ConditionBeanSetupper&lt;MbMemberAddressCB&gt;() {
     *     public void setup(MbMemberAddressCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...();
     *     }
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedList(referrerList -&gt {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * for (MbRegion region : regionList) {
     *     ... = region.<span style="color: #DD4747">getMemberAddressList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setRegionId_InScope(pkList);
     * cb.query().addOrderBy_RegionId_Asc();
     * </pre>
     * @param regionList The entity list of region. (NotNull)
     * @param setupper The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoader<MbMemberAddress> loadMemberAddressList(List<MbRegion> regionList, ConditionBeanSetupper<MbMemberAddressCB> setupper) {
        xassLRArg(regionList, setupper);
        return doLoadMemberAddressList(regionList, new LoadReferrerOption<MbMemberAddressCB, MbMemberAddress>().xinit(setupper));
    }

    /**
     * Load referrer of memberAddressList by the set-upper of referrer. <br />
     * MEMBER_ADDRESS by REGION_ID, named 'memberAddressList'.
     * <pre>
     * regionBhv.<span style="color: #DD4747">loadMemberAddressList</span>(regionList, new ConditionBeanSetupper&lt;MbMemberAddressCB&gt;() {
     *     public void setup(MbMemberAddressCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...();
     *     }
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedList(referrerList -&gt {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = region.<span style="color: #DD4747">getMemberAddressList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setRegionId_InScope(pkList);
     * cb.query().addOrderBy_RegionId_Asc();
     * </pre>
     * @param region The entity of region. (NotNull)
     * @param setupper The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoader<MbMemberAddress> loadMemberAddressList(MbRegion region, ConditionBeanSetupper<MbMemberAddressCB> setupper) {
        xassLRArg(region, setupper);
        return doLoadMemberAddressList(xnewLRLs(region), new LoadReferrerOption<MbMemberAddressCB, MbMemberAddress>().xinit(setupper));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param region The entity of region. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoader<MbMemberAddress> loadMemberAddressList(MbRegion region, LoadReferrerOption<MbMemberAddressCB, MbMemberAddress> loadReferrerOption) {
        xassLRArg(region, loadReferrerOption);
        return loadMemberAddressList(xnewLRLs(region), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean setupper.} #beforejava8
     * @param regionList The entity list of region. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerLoader<MbMemberAddress> loadMemberAddressList(List<MbRegion> regionList, LoadReferrerOption<MbMemberAddressCB, MbMemberAddress> loadReferrerOption) {
        xassLRArg(regionList, loadReferrerOption);
        if (regionList.isEmpty()) { return (NestedReferrerLoader<MbMemberAddress>)EMPTY_LOADER; }
        return doLoadMemberAddressList(regionList, loadReferrerOption);
    }

    protected NestedReferrerLoader<MbMemberAddress> doLoadMemberAddressList(List<MbRegion> regionList, LoadReferrerOption<MbMemberAddressCB, MbMemberAddress> option) {
        final MbMemberAddressBhv referrerBhv = xgetBSFLR().select(MbMemberAddressBhv.class);
        return helpLoadReferrerInternally(regionList, option, new InternalLoadReferrerCallback<MbRegion, Integer, MbMemberAddressCB, MbMemberAddress>() {
            public Integer getPKVal(MbRegion et)
            { return et.getRegionId(); }
            public void setRfLs(MbRegion et, List<MbMemberAddress> ls)
            { et.setMemberAddressList(ls); }
            public MbMemberAddressCB newMyCB() { return referrerBhv.newMyConditionBean(); }
            public void qyFKIn(MbMemberAddressCB cb, List<Integer> ls)
            { cb.query().setRegionId_InScope(ls); }
            public void qyOdFKAsc(MbMemberAddressCB cb) { cb.query().addOrderBy_RegionId_Asc(); }
            public void spFKCol(MbMemberAddressCB cb) { cb.specify().columnRegionId(); }
            public List<MbMemberAddress> selRfLs(MbMemberAddressCB cb) { return referrerBhv.selectList(cb); }
            public Integer getFKVal(MbMemberAddress re) { return re.getRegionId(); }
            public void setlcEt(MbMemberAddress re, MbRegion le)
            { re.setRegion(le); }
            public String getRfPrNm() { return "memberAddressList"; }
        });
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key regionId.
     * @param regionList The list of region. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Integer> extractRegionIdList(List<MbRegion> regionList) {
        return helpExtractListInternally(regionList, new InternalExtractCallback<MbRegion, Integer>() {
            public Integer getCV(MbRegion et) { return et.getRegionId(); }
        });
    }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * MbRegion region = new MbRegion();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * region.setFoo...(value);
     * region.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//region.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//region.set...;</span>
     * regionBhv.<span style="color: #DD4747">insert</span>(region);
     * ... = region.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param region The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(MbRegion region) {
        doInsert(region, null);
    }

    protected void doInsert(MbRegion region, InsertOption<MbRegionCB> op) {
        assertObjectNotNull("region", region);
        prepareInsertOption(op);
        delegateInsert(region, op);
    }

    protected void prepareInsertOption(InsertOption<MbRegionCB> op) {
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
     * MbRegion region = new MbRegion();
     * region.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * region.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//region.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//region.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * region.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     regionBhv.<span style="color: #DD4747">update</span>(region);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param region The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(final MbRegion region) {
        doUpdate(region, null);
    }

    protected void doUpdate(MbRegion region, final UpdateOption<MbRegionCB> op) {
        assertObjectNotNull("region", region);
        prepareUpdateOption(op);
        helpUpdateInternally(region, new InternalUpdateCallback<MbRegion>() {
            public int callbackDelegateUpdate(MbRegion et) { return delegateUpdate(et, op); } });
    }

    protected void prepareUpdateOption(UpdateOption<MbRegionCB> op) {
        if (op == null) { return; }
        assertUpdateOptionStatus(op);
        if (op.hasSelfSpecification()) {
            op.resolveSelfSpecification(createCBForVaryingUpdate());
        }
        if (op.hasSpecifiedUpdateColumn()) {
            op.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    protected MbRegionCB createCBForVaryingUpdate() {
        MbRegionCB cb = newMyConditionBean();
        cb.xsetupForVaryingUpdate();
        return cb;
    }

    protected MbRegionCB createCBForSpecifiedUpdate() {
        MbRegionCB cb = newMyConditionBean();
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
     * @param region The entity of insert or update target. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(MbRegion region) {
        doInesrtOrUpdate(region, null, null);
    }

    protected void doInesrtOrUpdate(MbRegion region, final InsertOption<MbRegionCB> iop, final UpdateOption<MbRegionCB> uop) {
        helpInsertOrUpdateInternally(region, new InternalInsertOrUpdateCallback<MbRegion, MbRegionCB>() {
            public void callbackInsert(MbRegion et) { doInsert(et, iop); }
            public void callbackUpdate(MbRegion et) { doUpdate(et, uop); }
            public MbRegionCB callbackNewMyConditionBean() { return newMyConditionBean(); }
            public int callbackSelectCount(MbRegionCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrModify(Entity et, InsertOption<? extends ConditionBean> iop, UpdateOption<? extends ConditionBean> uop) {
        if (iop == null && uop == null) { insertOrUpdate(downcast(et)); }
        else {
            iop = iop != null ? iop : new InsertOption<MbRegionCB>();
            uop = uop != null ? uop : new UpdateOption<MbRegionCB>();
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
     * MbRegion region = new MbRegion();
     * region.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * region.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     regionBhv.<span style="color: #DD4747">delete</span>(region);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param region The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(MbRegion region) {
        doDelete(region, null);
    }

    protected void doDelete(MbRegion region, final DeleteOption<MbRegionCB> op) {
        assertObjectNotNull("region", region);
        prepareDeleteOption(op);
        helpDeleteInternally(region, new InternalDeleteCallback<MbRegion>() {
            public int callbackDelegateDelete(MbRegion et) { return delegateDelete(et, op); } });
    }

    protected void prepareDeleteOption(DeleteOption<MbRegionCB> op) {
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
     *     MbRegion region = new MbRegion();
     *     region.setFooName("foo");
     *     if (...) {
     *         region.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     regionList.add(region);
     * }
     * regionBhv.<span style="color: #DD4747">batchInsert</span>(regionList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param regionList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<MbRegion> regionList) {
        InsertOption<MbRegionCB> op = createInsertUpdateOption();
        return doBatchInsert(regionList, op);
    }

    protected int[] doBatchInsert(List<MbRegion> regionList, InsertOption<MbRegionCB> op) {
        assertObjectNotNull("regionList", regionList);
        prepareBatchInsertOption(regionList, op);
        return delegateBatchInsert(regionList, op);
    }

    protected void prepareBatchInsertOption(List<MbRegion> regionList, InsertOption<MbRegionCB> op) {
        op.xallowInsertColumnModifiedPropertiesFragmented();
        op.xacceptInsertColumnModifiedPropertiesIfNeeds(regionList);
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
     *     MbRegion region = new MbRegion();
     *     region.setFooName("foo");
     *     if (...) {
     *         region.setFooPrice(123);
     *     } else {
     *         region.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//region.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     regionList.add(region);
     * }
     * regionBhv.<span style="color: #DD4747">batchUpdate</span>(regionList);
     * </pre>
     * @param regionList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<MbRegion> regionList) {
        UpdateOption<MbRegionCB> op = createPlainUpdateOption();
        return doBatchUpdate(regionList, op);
    }

    protected int[] doBatchUpdate(List<MbRegion> regionList, UpdateOption<MbRegionCB> op) {
        assertObjectNotNull("regionList", regionList);
        prepareBatchUpdateOption(regionList, op);
        return delegateBatchUpdate(regionList, op);
    }

    protected void prepareBatchUpdateOption(List<MbRegion> regionList, UpdateOption<MbRegionCB> op) {
        op.xacceptUpdateColumnModifiedPropertiesIfNeeds(regionList);
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
     * regionBhv.<span style="color: #DD4747">batchUpdate</span>(regionList, new SpecifyQuery<MbRegionCB>() {
     *     public void specify(MbRegionCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #DD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #DD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * regionBhv.<span style="color: #DD4747">batchUpdate</span>(regionList, new SpecifyQuery<MbRegionCB>() {
     *     public void specify(MbRegionCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #DD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param regionList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<MbRegion> regionList, SpecifyQuery<MbRegionCB> updateColumnSpec) {
        return doBatchUpdate(regionList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> op) {
        return doLumpModify(ls, op);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param regionList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<MbRegion> regionList) {
        return doBatchDelete(regionList, null);
    }

    protected int[] doBatchDelete(List<MbRegion> regionList, DeleteOption<MbRegionCB> op) {
        assertObjectNotNull("regionList", regionList);
        prepareDeleteOption(op);
        return delegateBatchDelete(regionList, op);
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
     * regionBhv.<span style="color: #DD4747">queryInsert</span>(new QueryInsertSetupper&lt;MbRegion, MbRegionCB&gt;() {
     *     public ConditionBean setup(region entity, MbRegionCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<MbRegion, MbRegionCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(QueryInsertSetupper<MbRegion, MbRegionCB> sp, InsertOption<MbRegionCB> op) {
        assertObjectNotNull("setupper", sp);
        prepareInsertOption(op);
        MbRegion e = new MbRegion();
        MbRegionCB cb = createCBForQueryInsert();
        return delegateQueryInsert(e, cb, sp.setup(e, cb), op);
    }

    protected MbRegionCB createCBForQueryInsert() {
        MbRegionCB cb = newMyConditionBean();
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
     * MbRegion region = new MbRegion();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//region.setPK...(value);</span>
     * region.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//region.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//region.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//region.setVersionNo(value);</span>
     * MbRegionCB cb = new MbRegionCB();
     * cb.query().setFoo...(value);
     * regionBhv.<span style="color: #DD4747">queryUpdate</span>(region, cb);
     * </pre>
     * @param region The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of MbRegion. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(MbRegion region, MbRegionCB cb) {
        return doQueryUpdate(region, cb, null);
    }

    protected int doQueryUpdate(MbRegion region, MbRegionCB cb, UpdateOption<MbRegionCB> op) {
        assertObjectNotNull("region", region); assertCBStateValid(cb);
        prepareUpdateOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryUpdate(region, cb, op) : 0;
    }

    @Override
    protected int doRangeModify(Entity et, ConditionBean cb, UpdateOption<? extends ConditionBean> op) {
        if (op == null) { return queryUpdate(downcast(et), (MbRegionCB)cb); }
        else { return varyingQueryUpdate(downcast(et), (MbRegionCB)cb, downcast(op)); }
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * MbRegionCB cb = new MbRegionCB();
     * cb.query().setFoo...(value);
     * regionBhv.<span style="color: #DD4747">queryDelete</span>(region, cb);
     * </pre>
     * @param cb The condition-bean of MbRegion. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(MbRegionCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(MbRegionCB cb, DeleteOption<MbRegionCB> op) {
        assertCBStateValid(cb);
        prepareDeleteOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryDelete(cb, op) : 0;
    }

    @Override
    protected int doRangeRemove(ConditionBean cb, DeleteOption<? extends ConditionBean> op) {
        if (op == null) { return queryDelete((MbRegionCB)cb); }
        else { return varyingQueryDelete((MbRegionCB)cb, downcast(op)); }
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
     * MbRegion region = new MbRegion();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * region.setFoo...(value);
     * region.setBar...(value);
     * InsertOption<MbRegionCB> option = new InsertOption<MbRegionCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * regionBhv.<span style="color: #DD4747">varyingInsert</span>(region, option);
     * ... = region.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param region The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(MbRegion region, InsertOption<MbRegionCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(region, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * MbRegion region = new MbRegion();
     * region.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * region.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * region.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;MbRegionCB&gt; option = new UpdateOption&lt;MbRegionCB&gt;();
     *     option.self(new SpecifyQuery&lt;MbRegionCB&gt;() {
     *         public void specify(MbRegionCB cb) {
     *             cb.specify().<span style="color: #DD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     regionBhv.<span style="color: #DD4747">varyingUpdate</span>(region, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param region The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(MbRegion region, UpdateOption<MbRegionCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(region, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param region The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(MbRegion region, InsertOption<MbRegionCB> insertOption, UpdateOption<MbRegionCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdate(region, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param region The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(MbRegion region, DeleteOption<MbRegionCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(region, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param regionList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<MbRegion> regionList, InsertOption<MbRegionCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(regionList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param regionList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<MbRegion> regionList, UpdateOption<MbRegionCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(regionList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param regionList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<MbRegion> regionList, DeleteOption<MbRegionCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(regionList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<MbRegion, MbRegionCB> setupper, InsertOption<MbRegionCB> option) {
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
     * MbRegion region = new MbRegion();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//region.setPK...(value);</span>
     * region.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//region.setVersionNo(value);</span>
     * MbRegionCB cb = new MbRegionCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;MbRegionCB&gt; option = new UpdateOption&lt;MbRegionCB&gt;();
     * option.self(new SpecifyQuery&lt;MbRegionCB&gt;() {
     *     public void specify(MbRegionCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * regionBhv.<span style="color: #DD4747">varyingQueryUpdate</span>(region, cb, option);
     * </pre>
     * @param region The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of MbRegion. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(MbRegion region, MbRegionCB cb, UpdateOption<MbRegionCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(region, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of MbRegion. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(MbRegionCB cb, DeleteOption<MbRegionCB> option) {
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
    public OutsideSqlBasicExecutor<MbRegionBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCountUniquely(MbRegionCB cb) { return invoke(createSelectCountCBCommand(cb, true)); }
    protected int delegateSelectCountPlainly(MbRegionCB cb) { return invoke(createSelectCountCBCommand(cb, false)); }
    protected <ENTITY extends MbRegion> void delegateSelectCursor(MbRegionCB cb, EntityRowHandler<ENTITY> rh, Class<ENTITY> tp)
    { invoke(createSelectCursorCBCommand(cb, rh, tp)); }
    protected <ENTITY extends MbRegion> List<ENTITY> delegateSelectList(MbRegionCB cb, Class<ENTITY> tp)
    { return invoke(createSelectListCBCommand(cb, tp)); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(MbRegion et, InsertOption<MbRegionCB> op)
    { if (!processBeforeInsert(et, op)) { return 0; }
      return invoke(createInsertEntityCommand(et, op)); }
    protected int delegateUpdate(MbRegion et, UpdateOption<MbRegionCB> op)
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return delegateUpdateNonstrict(et, op); }
    protected int delegateUpdateNonstrict(MbRegion et, UpdateOption<MbRegionCB> op)
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return invoke(createUpdateNonstrictEntityCommand(et, op)); }
    protected int delegateDelete(MbRegion et, DeleteOption<MbRegionCB> op)
    { if (!processBeforeDelete(et, op)) { return 0; }
      return delegateDeleteNonstrict(et, op); }
    protected int delegateDeleteNonstrict(MbRegion et, DeleteOption<MbRegionCB> op)
    { if (!processBeforeDelete(et, op)) { return 0; }
      return invoke(createDeleteNonstrictEntityCommand(et, op)); }

    protected int[] delegateBatchInsert(List<MbRegion> ls, InsertOption<MbRegionCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchInsertCommand(processBatchInternally(ls, op), op)); }
    protected int[] delegateBatchUpdate(List<MbRegion> ls, UpdateOption<MbRegionCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchUpdateNonstrict(ls, op); }
    protected int[] delegateBatchUpdateNonstrict(List<MbRegion> ls, UpdateOption<MbRegionCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateNonstrictCommand(processBatchInternally(ls, op, true), op)); }
    protected int[] delegateBatchDelete(List<MbRegion> ls, DeleteOption<MbRegionCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchDeleteNonstrict(ls, op); }
    protected int[] delegateBatchDeleteNonstrict(List<MbRegion> ls, DeleteOption<MbRegionCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteNonstrictCommand(processBatchInternally(ls, op, true), op)); }

    protected int delegateQueryInsert(MbRegion et, MbRegionCB inCB, ConditionBean resCB, InsertOption<MbRegionCB> op)
    { if (!processBeforeQueryInsert(et, inCB, resCB, op)) { return 0; } return invoke(createQueryInsertCBCommand(et, inCB, resCB, op));  }
    protected int delegateQueryUpdate(MbRegion et, MbRegionCB cb, UpdateOption<MbRegionCB> op)
    { if (!processBeforeQueryUpdate(et, cb, op)) { return 0; } return invoke(createQueryUpdateCBCommand(et, cb, op));  }
    protected int delegateQueryDelete(MbRegionCB cb, DeleteOption<MbRegionCB> op)
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
    protected MbRegion downcast(Entity et) {
        return helpEntityDowncastInternally(et, MbRegion.class);
    }

    protected MbRegionCB downcast(ConditionBean cb) {
        return helpConditionBeanDowncastInternally(cb, MbRegionCB.class);
    }

    @SuppressWarnings("unchecked")
    protected List<MbRegion> downcast(List<? extends Entity> ls) {
        return (List<MbRegion>)ls;
    }

    @SuppressWarnings("unchecked")
    protected InsertOption<MbRegionCB> downcast(InsertOption<? extends ConditionBean> op) {
        return (InsertOption<MbRegionCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected UpdateOption<MbRegionCB> downcast(UpdateOption<? extends ConditionBean> op) {
        return (UpdateOption<MbRegionCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected DeleteOption<MbRegionCB> downcast(DeleteOption<? extends ConditionBean> op) {
        return (DeleteOption<MbRegionCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<MbRegion, MbRegionCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> sp) {
        return (QueryInsertSetupper<MbRegion, MbRegionCB>)sp;
    }
}
