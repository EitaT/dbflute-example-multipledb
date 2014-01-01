/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */package com.example.dbflute.multipledb.seasar.dbflute.librarydb.bsbhv;

import java.util.List;

import org.seasar.dbflute.*;
import org.seasar.dbflute.bhv.*;
import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.outsidesql.executor.*;
import com.example.dbflute.multipledb.seasar.dbflute.librarydb.exbhv.*;
import com.example.dbflute.multipledb.seasar.dbflute.librarydb.exentity.*;
import com.example.dbflute.multipledb.seasar.dbflute.librarydb.bsentity.dbmeta.*;
import com.example.dbflute.multipledb.seasar.dbflute.librarydb.cbean.*;

/**
 * The behavior of BLACK_LIST as TABLE. <br />
 * <pre>
 * [primary key]
 *     BLACK_LIST_ID
 * 
 * [column]
 *     BLACK_LIST_ID, LB_USER_ID, BLACK_RANK, R_USER, R_MODULE, R_TIMESTAMP, U_USER, U_MODULE, U_TIMESTAMP
 * 
 * [sequence]
 *     
 * 
 * [identity]
 *     BLACK_LIST_ID
 * 
 * [version-no]
 *     
 * 
 * [foreign table]
 *     LB_USER
 * 
 * [referrer table]
 *     BLACK_ACTION
 * 
 * [foreign property]
 *     lbUser
 * 
 * [referrer property]
 *     blackActionList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class LdBsBlackListBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "BLACK_LIST"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public DBMeta getDBMeta() { return LdBlackListDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public LdBlackListDbm getMyDBMeta() { return LdBlackListDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public Entity newEntity() { return newMyEntity(); }

    /** {@inheritDoc} */
    public ConditionBean newConditionBean() { return newMyConditionBean(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public LdBlackList newMyEntity() { return new LdBlackList(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public LdBlackListCB newMyConditionBean() { return new LdBlackListCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * LdBlackListCB cb = new LdBlackListCB();
     * cb.query().setFoo...(value);
     * int count = blackListBhv.<span style="color: #FD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of LdBlackList. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(LdBlackListCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(LdBlackListCB cb) { // called by selectCount(cb) 
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(LdBlackListCB cb) { // called by selectPage(cb)
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
     * LdBlackListCB cb = new LdBlackListCB();
     * cb.query().setFoo...(value);
     * LdBlackList blackList = blackListBhv.<span style="color: #FD4747">selectEntity</span>(cb);
     * if (blackList != null) {
     *     ... = blackList.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of LdBlackList. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public LdBlackList selectEntity(LdBlackListCB cb) {
        return doSelectEntity(cb, LdBlackList.class);
    }

    protected <ENTITY extends LdBlackList> ENTITY doSelectEntity(final LdBlackListCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityInternally(cb, entityType, new InternalSelectEntityCallback<ENTITY, LdBlackListCB>() {
            public List<ENTITY> callbackSelectList(LdBlackListCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); } });
    }

    @Override
    protected Entity doReadEntity(ConditionBean cb) {
        return selectEntity(downcast(cb));
    }

    /**
     * Select the entity by the condition-bean with deleted check.
     * <pre>
     * LdBlackListCB cb = new LdBlackListCB();
     * cb.query().setFoo...(value);
     * LdBlackList blackList = blackListBhv.<span style="color: #FD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = blackList.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of LdBlackList. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public LdBlackList selectEntityWithDeletedCheck(LdBlackListCB cb) {
        return doSelectEntityWithDeletedCheck(cb, LdBlackList.class);
    }

    protected <ENTITY extends LdBlackList> ENTITY doSelectEntityWithDeletedCheck(final LdBlackListCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityWithDeletedCheckInternally(cb, entityType, new InternalSelectEntityWithDeletedCheckCallback<ENTITY, LdBlackListCB>() {
            public List<ENTITY> callbackSelectList(LdBlackListCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); } });
    }

    @Override
    protected Entity doReadEntityWithDeletedCheck(ConditionBean cb) {
        return selectEntityWithDeletedCheck(downcast(cb));
    }

    /**
     * Select the entity by the primary-key value.
     * @param blackListId The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public LdBlackList selectByPKValue(Integer blackListId) {
        return doSelectByPKValue(blackListId, LdBlackList.class);
    }

    protected <ENTITY extends LdBlackList> ENTITY doSelectByPKValue(Integer blackListId, Class<ENTITY> entityType) {
        return doSelectEntity(buildPKCB(blackListId), entityType);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param blackListId The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public LdBlackList selectByPKValueWithDeletedCheck(Integer blackListId) {
        return doSelectByPKValueWithDeletedCheck(blackListId, LdBlackList.class);
    }

    protected <ENTITY extends LdBlackList> ENTITY doSelectByPKValueWithDeletedCheck(Integer blackListId, Class<ENTITY> entityType) {
        return doSelectEntityWithDeletedCheck(buildPKCB(blackListId), entityType);
    }

    private LdBlackListCB buildPKCB(Integer blackListId) {
        assertObjectNotNull("blackListId", blackListId);
        LdBlackListCB cb = newMyConditionBean();
        cb.query().setBlackListId_Equal(blackListId);
        return cb;
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * LdBlackListCB cb = new LdBlackListCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;LdBlackList&gt; blackListList = blackListBhv.<span style="color: #FD4747">selectList</span>(cb);
     * for (LdBlackList blackList : blackListList) {
     *     ... = blackList.get...();
     * }
     * </pre>
     * @param cb The condition-bean of LdBlackList. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<LdBlackList> selectList(LdBlackListCB cb) {
        return doSelectList(cb, LdBlackList.class);
    }

    protected <ENTITY extends LdBlackList> ListResultBean<ENTITY> doSelectList(LdBlackListCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", entityType);
        assertSpecifyDerivedReferrerEntityProperty(cb, entityType);
        return helpSelectListInternally(cb, entityType, new InternalSelectListCallback<ENTITY, LdBlackListCB>() {
            public List<ENTITY> callbackSelectList(LdBlackListCB cb, Class<ENTITY> entityType) { return delegateSelectList(cb, entityType); } });
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
     * LdBlackListCB cb = new LdBlackListCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #FD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;LdBlackList&gt; page = blackListBhv.<span style="color: #FD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (LdBlackList blackList : page) {
     *     ... = blackList.get...();
     * }
     * </pre>
     * @param cb The condition-bean of LdBlackList. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<LdBlackList> selectPage(LdBlackListCB cb) {
        return doSelectPage(cb, LdBlackList.class);
    }

    protected <ENTITY extends LdBlackList> PagingResultBean<ENTITY> doSelectPage(LdBlackListCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", entityType);
        return helpSelectPageInternally(cb, entityType, new InternalSelectPageCallback<ENTITY, LdBlackListCB>() {
            public int callbackSelectCount(LdBlackListCB cb) { return doSelectCountPlainly(cb); }
            public List<ENTITY> callbackSelectList(LdBlackListCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); }
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
     * LdBlackListCB cb = new LdBlackListCB();
     * cb.query().setFoo...(value);
     * blackListBhv.<span style="color: #FD4747">selectCursor</span>(cb, new EntityRowHandler&lt;LdBlackList&gt;() {
     *     public void handle(LdBlackList entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of LdBlackList. (NotNull)
     * @param entityRowHandler The handler of entity row of LdBlackList. (NotNull)
     */
    public void selectCursor(LdBlackListCB cb, EntityRowHandler<LdBlackList> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, LdBlackList.class);
    }

    protected <ENTITY extends LdBlackList> void doSelectCursor(LdBlackListCB cb, EntityRowHandler<ENTITY> entityRowHandler, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler<LdBlackList>", entityRowHandler); assertObjectNotNull("entityType", entityType);
        assertSpecifyDerivedReferrerEntityProperty(cb, entityType);
        helpSelectCursorInternally(cb, entityRowHandler, entityType, new InternalSelectCursorCallback<ENTITY, LdBlackListCB>() {
            public void callbackSelectCursor(LdBlackListCB cb, EntityRowHandler<ENTITY> entityRowHandler, Class<ENTITY> entityType) { delegateSelectCursor(cb, entityRowHandler, entityType); }
            public List<ENTITY> callbackSelectList(LdBlackListCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); }
        });
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * blackListBhv.<span style="color: #FD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(LdBlackListCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> SLFunction<LdBlackListCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
    }

    protected <RESULT, CB extends LdBlackListCB> SLFunction<CB, RESULT> doScalarSelect(Class<RESULT> resultType, CB cb) {
        assertObjectNotNull("resultType", resultType); assertCBStateValid(cb);
        cb.xsetupForScalarSelect(); cb.getSqlClause().disableSelectIndex(); // for when you use union
        return createSLFunction(cb, resultType);
    }

    protected <RESULT, CB extends LdBlackListCB> SLFunction<CB, RESULT> createSLFunction(CB cb, Class<RESULT> resultType) {
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
    //                                                                       Load Referrer
    //                                                                       =============
    /**
     * {Refer to overload method that has an argument of the list of entity.}
     * @param blackList The entity of blackList. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     */
    public void loadBlackActionList(LdBlackList blackList, ConditionBeanSetupper<LdBlackActionCB> conditionBeanSetupper) {
        xassLRArg(blackList, conditionBeanSetupper);
        loadBlackActionList(xnewLRLs(blackList), conditionBeanSetupper);
    }
    /**
     * Load referrer of blackActionList with the set-upper for condition-bean of referrer. <br />
     * BLACK_ACTION by BLACK_LIST_ID, named 'blackActionList'.
     * <pre>
     * blackListBhv.<span style="color: #FD4747">loadBlackActionList</span>(blackListList, new ConditionBeanSetupper&lt;LdBlackActionCB&gt;() {
     *     public void setup(LdBlackActionCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...(); <span style="color: #3F7E5E">// basically you should order referrer list</span>
     *     }
     * });
     * for (LdBlackList blackList : blackListList) {
     *     ... = blackList.<span style="color: #FD4747">getBlackActionList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key(and others too) is treated as case-insensitive. <br />
     * The condition-bean that the set-upper provides have settings before you touch it. It is as follows:
     * <pre>
     * cb.query().setBlackListId_InScope(pkList);
     * cb.query().addOrderBy_BlackListId_Asc();
     * </pre>
     * @param blackListList The entity list of blackList. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     */
    public void loadBlackActionList(List<LdBlackList> blackListList, ConditionBeanSetupper<LdBlackActionCB> conditionBeanSetupper) {
        xassLRArg(blackListList, conditionBeanSetupper);
        loadBlackActionList(blackListList, new LoadReferrerOption<LdBlackActionCB, LdBlackAction>().xinit(conditionBeanSetupper));
    }
    /**
     * {Refer to overload method that has an argument of the list of entity.}
     * @param blackList The entity of blackList. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadBlackActionList(LdBlackList blackList, LoadReferrerOption<LdBlackActionCB, LdBlackAction> loadReferrerOption) {
        xassLRArg(blackList, loadReferrerOption);
        loadBlackActionList(xnewLRLs(blackList), loadReferrerOption);
    }
    /**
     * {Refer to overload method that has an argument of condition-bean setupper.}
     * @param blackListList The entity list of blackList. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadBlackActionList(List<LdBlackList> blackListList, LoadReferrerOption<LdBlackActionCB, LdBlackAction> loadReferrerOption) {
        xassLRArg(blackListList, loadReferrerOption);
        if (blackListList.isEmpty()) { return; }
        final LdBlackActionBhv referrerBhv = xgetBSFLR().select(LdBlackActionBhv.class);
        helpLoadReferrerInternally(blackListList, loadReferrerOption, new InternalLoadReferrerCallback<LdBlackList, Integer, LdBlackActionCB, LdBlackAction>() {
            public Integer getPKVal(LdBlackList e)
            { return e.getBlackListId(); }
            public void setRfLs(LdBlackList e, List<LdBlackAction> ls)
            { e.setBlackActionList(ls); }
            public LdBlackActionCB newMyCB() { return referrerBhv.newMyConditionBean(); }
            public void qyFKIn(LdBlackActionCB cb, List<Integer> ls)
            { cb.query().setBlackListId_InScope(ls); }
            public void qyOdFKAsc(LdBlackActionCB cb) { cb.query().addOrderBy_BlackListId_Asc(); }
            public void spFKCol(LdBlackActionCB cb) { cb.specify().columnBlackListId(); }
            public List<LdBlackAction> selRfLs(LdBlackActionCB cb) { return referrerBhv.selectList(cb); }
            public Integer getFKVal(LdBlackAction e) { return e.getBlackListId(); }
            public void setlcEt(LdBlackAction re, LdBlackList le)
            { re.setBlackList(le); }
            public String getRfPrNm() { return "blackActionList"; }
        });
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'LdLbUser'.
     * @param blackListList The list of blackList. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<LdLbUser> pulloutLbUser(List<LdBlackList> blackListList) {
        return helpPulloutInternally(blackListList, new InternalPulloutCallback<LdBlackList, LdLbUser>() {
            public LdLbUser getFr(LdBlackList e) { return e.getLbUser(); }
            public boolean hasRf() { return true; }
            public void setRfLs(LdLbUser e, List<LdBlackList> ls)
            { if (!ls.isEmpty()) { e.setBlackListAsOne(ls.get(0)); } }
        });
    }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key blackListId.
     * @param blackListList The list of blackList. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Integer> extractBlackListIdList(List<LdBlackList> blackListList) {
        return helpExtractListInternally(blackListList, new InternalExtractCallback<LdBlackList, Integer>() {
            public Integer getCV(LdBlackList e) { return e.getBlackListId(); }
        });
    }

    /**
     * Extract the value list of (single) unique key lbUserId.
     * @param blackListList The list of blackList. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Integer> extractLbUserIdList(List<LdBlackList> blackListList) {
        return helpExtractListInternally(blackListList, new InternalExtractCallback<LdBlackList, Integer>() {
            public Integer getCV(LdBlackList e) { return e.getLbUserId(); }
        });
    }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * LdBlackList blackList = new LdBlackList();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * blackList.setFoo...(value);
     * blackList.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//blackList.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//blackList.set...;</span>
     * blackListBhv.<span style="color: #FD4747">insert</span>(blackList);
     * ... = blackList.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param blackList The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(LdBlackList blackList) {
        doInsert(blackList, null);
    }

    protected void doInsert(LdBlackList blackList, InsertOption<LdBlackListCB> option) {
        assertObjectNotNull("blackList", blackList);
        prepareInsertOption(option);
        delegateInsert(blackList, option);
    }

    protected void prepareInsertOption(InsertOption<LdBlackListCB> option) {
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
     * LdBlackList blackList = new LdBlackList();
     * blackList.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * blackList.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//blackList.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//blackList.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * blackList.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     blackListBhv.<span style="color: #FD4747">update</span>(blackList);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * } 
     * </pre>
     * @param blackList The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(final LdBlackList blackList) {
        doUpdate(blackList, null);
    }

    protected void doUpdate(LdBlackList blackList, final UpdateOption<LdBlackListCB> option) {
        assertObjectNotNull("blackList", blackList);
        prepareUpdateOption(option);
        helpUpdateInternally(blackList, new InternalUpdateCallback<LdBlackList>() {
            public int callbackDelegateUpdate(LdBlackList entity) { return delegateUpdate(entity, option); } });
    }

    protected void prepareUpdateOption(UpdateOption<LdBlackListCB> option) {
        if (option == null) { return; }
        assertUpdateOptionStatus(option);
        if (option.hasSelfSpecification()) {
            option.resolveSelfSpecification(createCBForVaryingUpdate());
        }
        if (option.hasSpecifiedUpdateColumn()) {
            option.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    protected LdBlackListCB createCBForVaryingUpdate() {
        LdBlackListCB cb = newMyConditionBean();
        cb.xsetupForVaryingUpdate();
        return cb;
    }

    protected LdBlackListCB createCBForSpecifiedUpdate() {
        LdBlackListCB cb = newMyConditionBean();
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
     * LdBlackList blackList = new LdBlackList();
     * blackList.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * blackList.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//blackList.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//blackList.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//blackList.setVersionNo(value);</span>
     * blackListBhv.<span style="color: #FD4747">updateNonstrict</span>(blackList);
     * </pre>
     * @param blackList The entity of update target. (NotNull, PrimaryKeyNotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void updateNonstrict(final LdBlackList blackList) {
        doUpdateNonstrict(blackList, null);
    }

    protected void doUpdateNonstrict(LdBlackList blackList, final UpdateOption<LdBlackListCB> option) {
        assertObjectNotNull("blackList", blackList);
        prepareUpdateOption(option);
        helpUpdateNonstrictInternally(blackList, new InternalUpdateNonstrictCallback<LdBlackList>() {
            public int callbackDelegateUpdateNonstrict(LdBlackList entity) { return delegateUpdateNonstrict(entity, option); } });
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
     * @param blackList The entity of insert or update target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(LdBlackList blackList) {
        doInesrtOrUpdate(blackList, null, null);
    }

    protected void doInesrtOrUpdate(LdBlackList blackList, final InsertOption<LdBlackListCB> insertOption, final UpdateOption<LdBlackListCB> updateOption) {
        helpInsertOrUpdateInternally(blackList, new InternalInsertOrUpdateCallback<LdBlackList, LdBlackListCB>() {
            public void callbackInsert(LdBlackList entity) { doInsert(entity, insertOption); }
            public void callbackUpdate(LdBlackList entity) { doUpdate(entity, updateOption); }
            public LdBlackListCB callbackNewMyConditionBean() { return newMyConditionBean(); }
            public int callbackSelectCount(LdBlackListCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrModify(Entity entity, InsertOption<? extends ConditionBean> insertOption,
            UpdateOption<? extends ConditionBean> updateOption) {
        if (insertOption == null && updateOption == null) { insertOrUpdate(downcast(entity)); }
        else {
            insertOption = insertOption == null ? new InsertOption<LdBlackListCB>() : insertOption;
            updateOption = updateOption == null ? new UpdateOption<LdBlackListCB>() : updateOption;
            varyingInsertOrUpdate(downcast(entity), downcast(insertOption), downcast(updateOption));
        }
    }

    /**
     * Insert or update the entity non-strictly modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br />
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() }
     * <p><span style="color: #FD4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param blackList The entity of insert or update target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdateNonstrict(LdBlackList blackList) {
        doInesrtOrUpdateNonstrict(blackList, null, null);
    }

    protected void doInesrtOrUpdateNonstrict(LdBlackList blackList, final InsertOption<LdBlackListCB> insertOption, final UpdateOption<LdBlackListCB> updateOption) {
        helpInsertOrUpdateInternally(blackList, new InternalInsertOrUpdateNonstrictCallback<LdBlackList>() {
            public void callbackInsert(LdBlackList entity) { doInsert(entity, insertOption); }
            public void callbackUpdateNonstrict(LdBlackList entity) { doUpdateNonstrict(entity, updateOption); }
        });
    }

    @Override
    protected void doCreateOrModifyNonstrict(Entity entity, InsertOption<? extends ConditionBean> insertOption,
            UpdateOption<? extends ConditionBean> updateOption) {
        if (insertOption == null && updateOption == null) { insertOrUpdateNonstrict(downcast(entity)); }
        else {
            insertOption = insertOption == null ? new InsertOption<LdBlackListCB>() : insertOption;
            updateOption = updateOption == null ? new UpdateOption<LdBlackListCB>() : updateOption;
            varyingInsertOrUpdateNonstrict(downcast(entity), downcast(insertOption), downcast(updateOption));
        }
    }

    /**
     * Delete the entity. (ZeroUpdateException, ExclusiveControl)
     * <pre>
     * LdBlackList blackList = new LdBlackList();
     * blackList.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * blackList.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     blackListBhv.<span style="color: #FD4747">delete</span>(blackList);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * } 
     * </pre>
     * @param blackList The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(LdBlackList blackList) {
        doDelete(blackList, null);
    }

    protected void doDelete(LdBlackList blackList, final DeleteOption<LdBlackListCB> option) {
        assertObjectNotNull("blackList", blackList);
        prepareDeleteOption(option);
        helpDeleteInternally(blackList, new InternalDeleteCallback<LdBlackList>() {
            public int callbackDelegateDelete(LdBlackList entity) { return delegateDelete(entity, option); } });
    }

    protected void prepareDeleteOption(DeleteOption<LdBlackListCB> option) {
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
     * LdBlackList blackList = new LdBlackList();
     * blackList.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//blackList.setVersionNo(value);</span>
     * blackListBhv.<span style="color: #FD4747">deleteNonstrict</span>(blackList);
     * </pre>
     * @param blackList The entity of delete target. (NotNull, PrimaryKeyNotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrict(LdBlackList blackList) {
        doDeleteNonstrict(blackList, null);
    }

    protected void doDeleteNonstrict(LdBlackList blackList, final DeleteOption<LdBlackListCB> option) {
        assertObjectNotNull("blackList", blackList);
        prepareDeleteOption(option);
        helpDeleteNonstrictInternally(blackList, new InternalDeleteNonstrictCallback<LdBlackList>() {
            public int callbackDelegateDeleteNonstrict(LdBlackList entity) { return delegateDeleteNonstrict(entity, option); } });
    }

    /**
     * Delete the entity non-strictly ignoring deleted. {ZeroUpdateException, NonExclusiveControl}
     * <pre>
     * LdBlackList blackList = new LdBlackList();
     * blackList.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//blackList.setVersionNo(value);</span>
     * blackListBhv.<span style="color: #FD4747">deleteNonstrictIgnoreDeleted</span>(blackList);
     * <span style="color: #3F7E5E">// if the target entity doesn't exist, no exception</span>
     * </pre>
     * @param blackList The entity of delete target. (NotNull, PrimaryKeyNotNull)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrictIgnoreDeleted(LdBlackList blackList) {
        doDeleteNonstrictIgnoreDeleted(blackList, null);
    }

    protected void doDeleteNonstrictIgnoreDeleted(LdBlackList blackList, final DeleteOption<LdBlackListCB> option) {
        assertObjectNotNull("blackList", blackList);
        prepareDeleteOption(option);
        helpDeleteNonstrictIgnoreDeletedInternally(blackList, new InternalDeleteNonstrictIgnoreDeletedCallback<LdBlackList>() {
            public int callbackDelegateDeleteNonstrict(LdBlackList entity) { return delegateDeleteNonstrict(entity, option); } });
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
     *     LdBlackList blackList = new LdBlackList();
     *     blackList.setFooName("foo");
     *     if (...) {
     *         blackList.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     blackListList.add(blackList);
     * }
     * blackListBhv.<span style="color: #FD4747">batchInsert</span>(blackListList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param blackListList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<LdBlackList> blackListList) {
        InsertOption<LdBlackListCB> option = createInsertUpdateOption();
        return doBatchInsert(blackListList, option);
    }

    protected int[] doBatchInsert(List<LdBlackList> blackListList, InsertOption<LdBlackListCB> option) {
        assertObjectNotNull("blackListList", blackListList);
        prepareBatchInsertOption(blackListList, option);
        return delegateBatchInsert(blackListList, option);
    }

    protected void prepareBatchInsertOption(List<LdBlackList> blackListList, InsertOption<LdBlackListCB> option) {
        option.xallowInsertColumnModifiedPropertiesFragmented();
        option.xacceptInsertColumnModifiedPropertiesIfNeeds(blackListList);
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
     *     LdBlackList blackList = new LdBlackList();
     *     blackList.setFooName("foo");
     *     if (...) {
     *         blackList.setFooPrice(123);
     *     } else {
     *         blackList.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//blackList.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     blackListList.add(blackList);
     * }
     * blackListBhv.<span style="color: #FD4747">batchUpdate</span>(blackListList);
     * </pre>
     * @param blackListList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<LdBlackList> blackListList) {
        UpdateOption<LdBlackListCB> option = createPlainUpdateOption();
        return doBatchUpdate(blackListList, option);
    }

    protected int[] doBatchUpdate(List<LdBlackList> blackListList, UpdateOption<LdBlackListCB> option) {
        assertObjectNotNull("blackListList", blackListList);
        prepareBatchUpdateOption(blackListList, option);
        return delegateBatchUpdate(blackListList, option);
    }

    protected void prepareBatchUpdateOption(List<LdBlackList> blackListList, UpdateOption<LdBlackListCB> option) {
        option.xacceptUpdateColumnModifiedPropertiesIfNeeds(blackListList);
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
     * blackListBhv.<span style="color: #FD4747">batchUpdate</span>(blackListList, new SpecifyQuery<LdBlackListCB>() {
     *     public void specify(LdBlackListCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #FD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #FD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span> 
     * blackListBhv.<span style="color: #FD4747">batchUpdate</span>(blackListList, new SpecifyQuery<LdBlackListCB>() {
     *     public void specify(LdBlackListCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #FD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param blackListList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<LdBlackList> blackListList, SpecifyQuery<LdBlackListCB> updateColumnSpec) {
        return doBatchUpdate(blackListList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    /**
     * Batch-update the entity list non-strictly modified-only of same-set columns. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <span style="color: #FD4747; font-size: 140%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     LdBlackList blackList = new LdBlackList();
     *     blackList.setFooName("foo");
     *     if (...) {
     *         blackList.setFooPrice(123);
     *     } else {
     *         blackList.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//blackList.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     blackListList.add(blackList);
     * }
     * blackListBhv.<span style="color: #FD4747">batchUpdate</span>(blackListList);
     * </pre>
     * @param blackListList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<LdBlackList> blackListList) {
        UpdateOption<LdBlackListCB> option = createPlainUpdateOption();
        return doBatchUpdateNonstrict(blackListList, option);
    }

    protected int[] doBatchUpdateNonstrict(List<LdBlackList> blackListList, UpdateOption<LdBlackListCB> option) {
        assertObjectNotNull("blackListList", blackListList);
        prepareBatchUpdateOption(blackListList, option);
        return delegateBatchUpdateNonstrict(blackListList, option);
    }

    /**
     * Batch-update the entity list non-strictly specified-only. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span> 
     * blackListBhv.<span style="color: #FD4747">batchUpdateNonstrict</span>(blackListList, new SpecifyQuery<LdBlackListCB>() {
     *     public void specify(LdBlackListCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #FD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #FD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span> 
     * blackListBhv.<span style="color: #FD4747">batchUpdateNonstrict</span>(blackListList, new SpecifyQuery<LdBlackListCB>() {
     *     public void specify(LdBlackListCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #FD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).</p>
     * @param blackListList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<LdBlackList> blackListList, SpecifyQuery<LdBlackListCB> updateColumnSpec) {
        return doBatchUpdateNonstrict(blackListList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> option) {
        if (option == null) { return batchUpdateNonstrict(downcast(ls)); }
        else { return varyingBatchUpdateNonstrict(downcast(ls), downcast(option)); }
    }

    /**
     * Batch-delete the entity list. (ExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param blackListList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchDelete(List<LdBlackList> blackListList) {
        return doBatchDelete(blackListList, null);
    }

    protected int[] doBatchDelete(List<LdBlackList> blackListList, DeleteOption<LdBlackListCB> option) {
        assertObjectNotNull("blackListList", blackListList);
        prepareDeleteOption(option);
        return delegateBatchDelete(blackListList, option);
    }

    @Override
    protected int[] doLumpRemove(List<Entity> ls, DeleteOption<? extends ConditionBean> option) {
        if (option == null) { return batchDelete(downcast(ls)); }
        else { return varyingBatchDelete(downcast(ls), downcast(option)); }
    }

    /**
     * Batch-delete the entity list non-strictly. {NonExclusiveControl} <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param blackListList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDeleteNonstrict(List<LdBlackList> blackListList) {
        return doBatchDeleteNonstrict(blackListList, null);
    }

    protected int[] doBatchDeleteNonstrict(List<LdBlackList> blackListList, DeleteOption<LdBlackListCB> option) {
        assertObjectNotNull("blackListList", blackListList);
        prepareDeleteOption(option);
        return delegateBatchDeleteNonstrict(blackListList, option);
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
     * blackListBhv.<span style="color: #FD4747">queryInsert</span>(new QueryInsertSetupper&lt;LdBlackList, LdBlackListCB&gt;() {
     *     public ConditionBean setup(blackList entity, LdBlackListCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<LdBlackList, LdBlackListCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(QueryInsertSetupper<LdBlackList, LdBlackListCB> setupper, InsertOption<LdBlackListCB> option) {
        assertObjectNotNull("setupper", setupper);
        prepareInsertOption(option);
        LdBlackList entity = new LdBlackList();
        LdBlackListCB intoCB = createCBForQueryInsert();
        ConditionBean resourceCB = setupper.setup(entity, intoCB);
        return delegateQueryInsert(entity, intoCB, resourceCB, option);
    }

    protected LdBlackListCB createCBForQueryInsert() {
        LdBlackListCB cb = newMyConditionBean();
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
     * LdBlackList blackList = new LdBlackList();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//blackList.setPK...(value);</span>
     * blackList.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//blackList.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//blackList.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//blackList.setVersionNo(value);</span>
     * LdBlackListCB cb = new LdBlackListCB();
     * cb.query().setFoo...(value);
     * blackListBhv.<span style="color: #FD4747">queryUpdate</span>(blackList, cb);
     * </pre>
     * @param blackList The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of LdBlackList. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(LdBlackList blackList, LdBlackListCB cb) {
        return doQueryUpdate(blackList, cb, null);
    }

    protected int doQueryUpdate(LdBlackList blackList, LdBlackListCB cb, UpdateOption<LdBlackListCB> option) {
        assertObjectNotNull("blackList", blackList); assertCBStateValid(cb);
        prepareUpdateOption(option);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryUpdate(blackList, cb, option) : 0;
    }

    @Override
    protected int doRangeModify(Entity entity, ConditionBean cb, UpdateOption<? extends ConditionBean> option) {
        if (option == null) { return queryUpdate(downcast(entity), (LdBlackListCB)cb); }
        else { return varyingQueryUpdate(downcast(entity), (LdBlackListCB)cb, downcast(option)); }
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * LdBlackListCB cb = new LdBlackListCB();
     * cb.query().setFoo...(value);
     * blackListBhv.<span style="color: #FD4747">queryDelete</span>(blackList, cb);
     * </pre>
     * @param cb The condition-bean of LdBlackList. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(LdBlackListCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(LdBlackListCB cb, DeleteOption<LdBlackListCB> option) {
        assertCBStateValid(cb);
        prepareDeleteOption(option);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryDelete(cb, option) : 0;
    }

    @Override
    protected int doRangeRemove(ConditionBean cb, DeleteOption<? extends ConditionBean> option) {
        if (option == null) { return queryDelete((LdBlackListCB)cb); }
        else { return varyingQueryDelete((LdBlackListCB)cb, downcast(option)); }
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
     * LdBlackList blackList = new LdBlackList();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * blackList.setFoo...(value);
     * blackList.setBar...(value);
     * InsertOption<LdBlackListCB> option = new InsertOption<LdBlackListCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * blackListBhv.<span style="color: #FD4747">varyingInsert</span>(blackList, option);
     * ... = blackList.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param blackList The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(LdBlackList blackList, InsertOption<LdBlackListCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(blackList, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, ExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * LdBlackList blackList = new LdBlackList();
     * blackList.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * blackList.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * blackList.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;LdBlackListCB&gt; option = new UpdateOption&lt;LdBlackListCB&gt;();
     *     option.self(new SpecifyQuery&lt;LdBlackListCB&gt;() {
     *         public void specify(LdBlackListCB cb) {
     *             cb.specify().<span style="color: #FD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     blackListBhv.<span style="color: #FD4747">varyingUpdate</span>(blackList, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param blackList The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(LdBlackList blackList, UpdateOption<LdBlackListCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(blackList, option);
    }

    /**
     * Update the entity with varying requests non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as updateNonstrict(entity).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * LdBlackList blackList = new LdBlackList();
     * blackList.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * blackList.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//blackList.setVersionNo(value);</span>
     * UpdateOption&lt;LdBlackListCB&gt; option = new UpdateOption&lt;LdBlackListCB&gt;();
     * option.self(new SpecifyQuery&lt;LdBlackListCB&gt;() {
     *     public void specify(LdBlackListCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * blackListBhv.<span style="color: #FD4747">varyingUpdateNonstrict</span>(blackList, option);
     * </pre>
     * @param blackList The entity of update target. (NotNull, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdateNonstrict(LdBlackList blackList, UpdateOption<LdBlackListCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdateNonstrict(blackList, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param blackList The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(LdBlackList blackList, InsertOption<LdBlackListCB> insertOption, UpdateOption<LdBlackListCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdate(blackList, insertOption, updateOption);
    }

    /**
     * Insert or update the entity with varying requests non-strictly. (NonExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdateNonstrict(entity).
     * @param blackList The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdateNonstrict(LdBlackList blackList, InsertOption<LdBlackListCB> insertOption, UpdateOption<LdBlackListCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdateNonstrict(blackList, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, ExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param blackList The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(LdBlackList blackList, DeleteOption<LdBlackListCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(blackList, option);
    }

    /**
     * Delete the entity with varying requests non-strictly. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as deleteNonstrict(entity).
     * @param blackList The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDeleteNonstrict(LdBlackList blackList, DeleteOption<LdBlackListCB> option) {
        assertDeleteOptionNotNull(option);
        doDeleteNonstrict(blackList, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param blackListList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<LdBlackList> blackListList, InsertOption<LdBlackListCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(blackListList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param blackListList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<LdBlackList> blackListList, UpdateOption<LdBlackListCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(blackListList, option);
    }

    /**
     * Batch-update the list with varying requests non-strictly. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param blackListList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdateNonstrict(List<LdBlackList> blackListList, UpdateOption<LdBlackListCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdateNonstrict(blackListList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param blackListList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<LdBlackList> blackListList, DeleteOption<LdBlackListCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(blackListList, option);
    }

    /**
     * Batch-delete the list with varying requests non-strictly. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDeleteNonstrict(entityList).
     * @param blackListList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDeleteNonstrict(List<LdBlackList> blackListList, DeleteOption<LdBlackListCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDeleteNonstrict(blackListList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<LdBlackList, LdBlackListCB> setupper, InsertOption<LdBlackListCB> option) {
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
     * LdBlackList blackList = new LdBlackList();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//blackList.setPK...(value);</span>
     * blackList.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//blackList.setVersionNo(value);</span>
     * LdBlackListCB cb = new LdBlackListCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;LdBlackListCB&gt; option = new UpdateOption&lt;LdBlackListCB&gt;();
     * option.self(new SpecifyQuery&lt;LdBlackListCB&gt;() {
     *     public void specify(LdBlackListCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * blackListBhv.<span style="color: #FD4747">varyingQueryUpdate</span>(blackList, cb, option);
     * </pre>
     * @param blackList The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of LdBlackList. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(LdBlackList blackList, LdBlackListCB cb, UpdateOption<LdBlackListCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(blackList, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of LdBlackList. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(LdBlackListCB cb, DeleteOption<LdBlackListCB> option) {
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
    public OutsideSqlBasicExecutor<LdBlackListBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCountUniquely(LdBlackListCB cb) { return invoke(createSelectCountCBCommand(cb, true)); }
    protected int delegateSelectCountPlainly(LdBlackListCB cb) { return invoke(createSelectCountCBCommand(cb, false)); }
    protected <ENTITY extends LdBlackList> void delegateSelectCursor(LdBlackListCB cb, EntityRowHandler<ENTITY> erh, Class<ENTITY> et)
    { invoke(createSelectCursorCBCommand(cb, erh, et)); }
    protected <ENTITY extends LdBlackList> List<ENTITY> delegateSelectList(LdBlackListCB cb, Class<ENTITY> et)
    { return invoke(createSelectListCBCommand(cb, et)); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(LdBlackList e, InsertOption<LdBlackListCB> op)
    { if (!processBeforeInsert(e, op)) { return 0; }
      return invoke(createInsertEntityCommand(e, op)); }
    protected int delegateUpdate(LdBlackList e, UpdateOption<LdBlackListCB> op)
    { if (!processBeforeUpdate(e, op)) { return 0; }
      return invoke(createUpdateEntityCommand(e, op)); }
    protected int delegateUpdateNonstrict(LdBlackList e, UpdateOption<LdBlackListCB> op)
    { if (!processBeforeUpdate(e, op)) { return 0; }
      return invoke(createUpdateNonstrictEntityCommand(e, op)); }
    protected int delegateDelete(LdBlackList e, DeleteOption<LdBlackListCB> op)
    { if (!processBeforeDelete(e, op)) { return 0; }
      return invoke(createDeleteEntityCommand(e, op)); }
    protected int delegateDeleteNonstrict(LdBlackList e, DeleteOption<LdBlackListCB> op)
    { if (!processBeforeDelete(e, op)) { return 0; }
      return invoke(createDeleteNonstrictEntityCommand(e, op)); }

    protected int[] delegateBatchInsert(List<LdBlackList> ls, InsertOption<LdBlackListCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchInsertCommand(processBatchInternally(ls, op), op)); }
    protected int[] delegateBatchUpdate(List<LdBlackList> ls, UpdateOption<LdBlackListCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateCommand(processBatchInternally(ls, op, false), op)); }
    protected int[] delegateBatchUpdateNonstrict(List<LdBlackList> ls, UpdateOption<LdBlackListCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateNonstrictCommand(processBatchInternally(ls, op, true), op)); }
    protected int[] delegateBatchDelete(List<LdBlackList> ls, DeleteOption<LdBlackListCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteCommand(processBatchInternally(ls, op, false), op)); }
    protected int[] delegateBatchDeleteNonstrict(List<LdBlackList> ls, DeleteOption<LdBlackListCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteNonstrictCommand(processBatchInternally(ls, op, true), op)); }

    protected int delegateQueryInsert(LdBlackList e, LdBlackListCB inCB, ConditionBean resCB, InsertOption<LdBlackListCB> op)
    { if (!processBeforeQueryInsert(e, inCB, resCB, op)) { return 0; } return invoke(createQueryInsertCBCommand(e, inCB, resCB, op));  }
    protected int delegateQueryUpdate(LdBlackList e, LdBlackListCB cb, UpdateOption<LdBlackListCB> op)
    { if (!processBeforeQueryUpdate(e, cb, op)) { return 0; } return invoke(createQueryUpdateCBCommand(e, cb, op));  }
    protected int delegateQueryDelete(LdBlackListCB cb, DeleteOption<LdBlackListCB> op)
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
        return downcast(entity).getUTimestamp() != null;
    }

    // ===================================================================================
    //                                                                     Downcast Helper
    //                                                                     ===============
    protected LdBlackList downcast(Entity entity) {
        return helpEntityDowncastInternally(entity, LdBlackList.class);
    }

    protected LdBlackListCB downcast(ConditionBean cb) {
        return helpConditionBeanDowncastInternally(cb, LdBlackListCB.class);
    }

    @SuppressWarnings("unchecked")
    protected List<LdBlackList> downcast(List<? extends Entity> entityList) {
        return (List<LdBlackList>)entityList;
    }

    @SuppressWarnings("unchecked")
    protected InsertOption<LdBlackListCB> downcast(InsertOption<? extends ConditionBean> option) {
        return (InsertOption<LdBlackListCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected UpdateOption<LdBlackListCB> downcast(UpdateOption<? extends ConditionBean> option) {
        return (UpdateOption<LdBlackListCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected DeleteOption<LdBlackListCB> downcast(DeleteOption<? extends ConditionBean> option) {
        return (DeleteOption<LdBlackListCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<LdBlackList, LdBlackListCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> option) {
        return (QueryInsertSetupper<LdBlackList, LdBlackListCB>)option;
    }
}
