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
 * The behavior of LB_USER as TABLE. <br />
 * <pre>
 * [primary key]
 *     LB_USER_ID
 *
 * [column]
 *     LB_USER_ID, LB_USER_NAME, USER_PASSWORD, R_USER, R_MODULE, R_TIMESTAMP, U_USER, U_MODULE, U_TIMESTAMP
 *
 * [sequence]
 *     
 *
 * [identity]
 *     LB_USER_ID
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     BLACK_LIST(AsOne)
 *
 * [referrer table]
 *     LIBRARY_USER, BLACK_LIST
 *
 * [foreign property]
 *     blackListAsOne
 *
 * [referrer property]
 *     libraryUserList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class LdBsLbUserBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "LB_USER"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public DBMeta getDBMeta() { return LdLbUserDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public LdLbUserDbm getMyDBMeta() { return LdLbUserDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public Entity newEntity() { return newMyEntity(); }

    /** {@inheritDoc} */
    public ConditionBean newConditionBean() { return newMyConditionBean(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public LdLbUser newMyEntity() { return new LdLbUser(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public LdLbUserCB newMyConditionBean() { return new LdLbUserCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * LdLbUserCB cb = new LdLbUserCB();
     * cb.query().setFoo...(value);
     * int count = lbUserBhv.<span style="color: #FD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of LdLbUser. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(LdLbUserCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(LdLbUserCB cb) { // called by selectCount(cb)
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(LdLbUserCB cb) { // called by selectPage(cb)
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
     * LdLbUserCB cb = new LdLbUserCB();
     * cb.query().setFoo...(value);
     * LdLbUser lbUser = lbUserBhv.<span style="color: #FD4747">selectEntity</span>(cb);
     * if (lbUser != null) {
     *     ... = lbUser.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of LdLbUser. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public LdLbUser selectEntity(LdLbUserCB cb) {
        return doSelectEntity(cb, LdLbUser.class);
    }

    protected <ENTITY extends LdLbUser> ENTITY doSelectEntity(final LdLbUserCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb);
        return helpSelectEntityInternally(cb, tp, new InternalSelectEntityCallback<ENTITY, LdLbUserCB>() {
            public List<ENTITY> callbackSelectList(LdLbUserCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); } });
    }

    @Override
    protected Entity doReadEntity(ConditionBean cb) {
        return selectEntity(downcast(cb));
    }

    /**
     * Select the entity by the condition-bean with deleted check.
     * <pre>
     * LdLbUserCB cb = new LdLbUserCB();
     * cb.query().setFoo...(value);
     * LdLbUser lbUser = lbUserBhv.<span style="color: #FD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = lbUser.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of LdLbUser. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public LdLbUser selectEntityWithDeletedCheck(LdLbUserCB cb) {
        return doSelectEntityWithDeletedCheck(cb, LdLbUser.class);
    }

    protected <ENTITY extends LdLbUser> ENTITY doSelectEntityWithDeletedCheck(final LdLbUserCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb);
        return helpSelectEntityWithDeletedCheckInternally(cb, tp, new InternalSelectEntityWithDeletedCheckCallback<ENTITY, LdLbUserCB>() {
            public List<ENTITY> callbackSelectList(LdLbUserCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); } });
    }

    @Override
    protected Entity doReadEntityWithDeletedCheck(ConditionBean cb) {
        return selectEntityWithDeletedCheck(downcast(cb));
    }

    /**
     * Select the entity by the primary-key value.
     * @param lbUserId The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public LdLbUser selectByPKValue(Integer lbUserId) {
        return doSelectByPKValue(lbUserId, LdLbUser.class);
    }

    protected <ENTITY extends LdLbUser> ENTITY doSelectByPKValue(Integer lbUserId, Class<ENTITY> entityType) {
        return doSelectEntity(buildPKCB(lbUserId), entityType);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param lbUserId The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public LdLbUser selectByPKValueWithDeletedCheck(Integer lbUserId) {
        return doSelectByPKValueWithDeletedCheck(lbUserId, LdLbUser.class);
    }

    protected <ENTITY extends LdLbUser> ENTITY doSelectByPKValueWithDeletedCheck(Integer lbUserId, Class<ENTITY> entityType) {
        return doSelectEntityWithDeletedCheck(buildPKCB(lbUserId), entityType);
    }

    private LdLbUserCB buildPKCB(Integer lbUserId) {
        assertObjectNotNull("lbUserId", lbUserId);
        LdLbUserCB cb = newMyConditionBean();
        cb.query().setLbUserId_Equal(lbUserId);
        return cb;
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * LdLbUserCB cb = new LdLbUserCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;LdLbUser&gt; lbUserList = lbUserBhv.<span style="color: #FD4747">selectList</span>(cb);
     * for (LdLbUser lbUser : lbUserList) {
     *     ... = lbUser.get...();
     * }
     * </pre>
     * @param cb The condition-bean of LdLbUser. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<LdLbUser> selectList(LdLbUserCB cb) {
        return doSelectList(cb, LdLbUser.class);
    }

    protected <ENTITY extends LdLbUser> ListResultBean<ENTITY> doSelectList(LdLbUserCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        return helpSelectListInternally(cb, tp, new InternalSelectListCallback<ENTITY, LdLbUserCB>() {
            public List<ENTITY> callbackSelectList(LdLbUserCB cb, Class<ENTITY> tp) { return delegateSelectList(cb, tp); } });
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
     * LdLbUserCB cb = new LdLbUserCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #FD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;LdLbUser&gt; page = lbUserBhv.<span style="color: #FD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (LdLbUser lbUser : page) {
     *     ... = lbUser.get...();
     * }
     * </pre>
     * @param cb The condition-bean of LdLbUser. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<LdLbUser> selectPage(LdLbUserCB cb) {
        return doSelectPage(cb, LdLbUser.class);
    }

    protected <ENTITY extends LdLbUser> PagingResultBean<ENTITY> doSelectPage(LdLbUserCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectPageInternally(cb, tp, new InternalSelectPageCallback<ENTITY, LdLbUserCB>() {
            public int callbackSelectCount(LdLbUserCB cb) { return doSelectCountPlainly(cb); }
            public List<ENTITY> callbackSelectList(LdLbUserCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); }
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
     * LdLbUserCB cb = new LdLbUserCB();
     * cb.query().setFoo...(value);
     * lbUserBhv.<span style="color: #FD4747">selectCursor</span>(cb, new EntityRowHandler&lt;LdLbUser&gt;() {
     *     public void handle(LdLbUser entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of LdLbUser. (NotNull)
     * @param entityRowHandler The handler of entity row of LdLbUser. (NotNull)
     */
    public void selectCursor(LdLbUserCB cb, EntityRowHandler<LdLbUser> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, LdLbUser.class);
    }

    protected <ENTITY extends LdLbUser> void doSelectCursor(LdLbUserCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler", handler); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        helpSelectCursorInternally(cb, handler, tp, new InternalSelectCursorCallback<ENTITY, LdLbUserCB>() {
            public void callbackSelectCursor(LdLbUserCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) { delegateSelectCursor(cb, handler, tp); }
            public List<ENTITY> callbackSelectList(LdLbUserCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); }
        });
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * lbUserBhv.<span style="color: #FD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(LdLbUserCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> SLFunction<LdLbUserCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
    }

    protected <RESULT, CB extends LdLbUserCB> SLFunction<CB, RESULT> doScalarSelect(Class<RESULT> tp, CB cb) {
        assertObjectNotNull("resultType", tp); assertCBStateValid(cb);
        cb.xsetupForScalarSelect(); cb.getSqlClause().disableSelectIndex(); // for when you use union
        return createSLFunction(cb, tp);
    }

    protected <RESULT, CB extends LdLbUserCB> SLFunction<CB, RESULT> createSLFunction(CB cb, Class<RESULT> tp) {
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
     * @param lbUser The entity of lbUser. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     */
    public void loadLibraryUserList(LdLbUser lbUser, ConditionBeanSetupper<LdLibraryUserCB> conditionBeanSetupper) {
        xassLRArg(lbUser, conditionBeanSetupper);
        loadLibraryUserList(xnewLRLs(lbUser), conditionBeanSetupper);
    }
    /**
     * Load referrer of libraryUserList with the set-upper for condition-bean of referrer. <br />
     * LIBRARY_USER by LB_USER_ID, named 'libraryUserList'.
     * <pre>
     * lbUserBhv.<span style="color: #FD4747">loadLibraryUserList</span>(lbUserList, new ConditionBeanSetupper&lt;LdLibraryUserCB&gt;() {
     *     public void setup(LdLibraryUserCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...(); <span style="color: #3F7E5E">// basically you should order referrer list</span>
     *     }
     * });
     * for (LdLbUser lbUser : lbUserList) {
     *     ... = lbUser.<span style="color: #FD4747">getLibraryUserList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key(and others too) is treated as case-insensitive. <br />
     * The condition-bean that the set-upper provides have settings before you touch it. It is as follows:
     * <pre>
     * cb.query().setLbUserId_InScope(pkList);
     * cb.query().addOrderBy_LbUserId_Asc();
     * </pre>
     * @param lbUserList The entity list of lbUser. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     */
    public void loadLibraryUserList(List<LdLbUser> lbUserList, ConditionBeanSetupper<LdLibraryUserCB> conditionBeanSetupper) {
        xassLRArg(lbUserList, conditionBeanSetupper);
        loadLibraryUserList(lbUserList, new LoadReferrerOption<LdLibraryUserCB, LdLibraryUser>().xinit(conditionBeanSetupper));
    }
    /**
     * {Refer to overload method that has an argument of the list of entity.}
     * @param lbUser The entity of lbUser. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadLibraryUserList(LdLbUser lbUser, LoadReferrerOption<LdLibraryUserCB, LdLibraryUser> loadReferrerOption) {
        xassLRArg(lbUser, loadReferrerOption);
        loadLibraryUserList(xnewLRLs(lbUser), loadReferrerOption);
    }
    /**
     * {Refer to overload method that has an argument of condition-bean setupper.}
     * @param lbUserList The entity list of lbUser. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadLibraryUserList(List<LdLbUser> lbUserList, LoadReferrerOption<LdLibraryUserCB, LdLibraryUser> loadReferrerOption) {
        xassLRArg(lbUserList, loadReferrerOption);
        if (lbUserList.isEmpty()) { return; }
        final LdLibraryUserBhv referrerBhv = xgetBSFLR().select(LdLibraryUserBhv.class);
        helpLoadReferrerInternally(lbUserList, loadReferrerOption, new InternalLoadReferrerCallback<LdLbUser, Integer, LdLibraryUserCB, LdLibraryUser>() {
            public Integer getPKVal(LdLbUser et)
            { return et.getLbUserId(); }
            public void setRfLs(LdLbUser et, List<LdLibraryUser> ls)
            { et.setLibraryUserList(ls); }
            public LdLibraryUserCB newMyCB() { return referrerBhv.newMyConditionBean(); }
            public void qyFKIn(LdLibraryUserCB cb, List<Integer> ls)
            { cb.query().setLbUserId_InScope(ls); }
            public void qyOdFKAsc(LdLibraryUserCB cb) { cb.query().addOrderBy_LbUserId_Asc(); }
            public void spFKCol(LdLibraryUserCB cb) { cb.specify().columnLbUserId(); }
            public List<LdLibraryUser> selRfLs(LdLibraryUserCB cb) { return referrerBhv.selectList(cb); }
            public Integer getFKVal(LdLibraryUser re) { return re.getLbUserId(); }
            public void setlcEt(LdLibraryUser re, LdLbUser le)
            { re.setLbUser(le); }
            public String getRfPrNm() { return "libraryUserList"; }
        });
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of referrer-as-one table 'LdBlackList'.
     * @param lbUserList The list of lbUser. (NotNull, EmptyAllowed)
     * @return The list of referrer-as-one table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<LdBlackList> pulloutBlackListAsOne(List<LdLbUser> lbUserList) {
        return helpPulloutInternally(lbUserList, new InternalPulloutCallback<LdLbUser, LdBlackList>() {
            public LdBlackList getFr(LdLbUser et) { return et.getBlackListAsOne(); }
            public boolean hasRf() { return true; }
            public void setRfLs(LdBlackList et, List<LdLbUser> ls)
            { if (!ls.isEmpty()) { et.setLbUser(ls.get(0)); } }
        });
    }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key lbUserId.
     * @param lbUserList The list of lbUser. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Integer> extractLbUserIdList(List<LdLbUser> lbUserList) {
        return helpExtractListInternally(lbUserList, new InternalExtractCallback<LdLbUser, Integer>() {
            public Integer getCV(LdLbUser et) { return et.getLbUserId(); }
        });
    }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * LdLbUser lbUser = new LdLbUser();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * lbUser.setFoo...(value);
     * lbUser.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//lbUser.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//lbUser.set...;</span>
     * lbUserBhv.<span style="color: #FD4747">insert</span>(lbUser);
     * ... = lbUser.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param lbUser The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(LdLbUser lbUser) {
        doInsert(lbUser, null);
    }

    protected void doInsert(LdLbUser lbUser, InsertOption<LdLbUserCB> op) {
        assertObjectNotNull("lbUser", lbUser);
        prepareInsertOption(op);
        delegateInsert(lbUser, op);
    }

    protected void prepareInsertOption(InsertOption<LdLbUserCB> op) {
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
     * LdLbUser lbUser = new LdLbUser();
     * lbUser.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * lbUser.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//lbUser.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//lbUser.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * lbUser.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     lbUserBhv.<span style="color: #FD4747">update</span>(lbUser);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param lbUser The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(final LdLbUser lbUser) {
        doUpdate(lbUser, null);
    }

    protected void doUpdate(LdLbUser lbUser, final UpdateOption<LdLbUserCB> op) {
        assertObjectNotNull("lbUser", lbUser);
        prepareUpdateOption(op);
        helpUpdateInternally(lbUser, new InternalUpdateCallback<LdLbUser>() {
            public int callbackDelegateUpdate(LdLbUser et) { return delegateUpdate(et, op); } });
    }

    protected void prepareUpdateOption(UpdateOption<LdLbUserCB> op) {
        if (op == null) { return; }
        assertUpdateOptionStatus(op);
        if (op.hasSelfSpecification()) {
            op.resolveSelfSpecification(createCBForVaryingUpdate());
        }
        if (op.hasSpecifiedUpdateColumn()) {
            op.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    protected LdLbUserCB createCBForVaryingUpdate() {
        LdLbUserCB cb = newMyConditionBean();
        cb.xsetupForVaryingUpdate();
        return cb;
    }

    protected LdLbUserCB createCBForSpecifiedUpdate() {
        LdLbUserCB cb = newMyConditionBean();
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
     * LdLbUser lbUser = new LdLbUser();
     * lbUser.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * lbUser.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//lbUser.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//lbUser.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//lbUser.setVersionNo(value);</span>
     * lbUserBhv.<span style="color: #FD4747">updateNonstrict</span>(lbUser);
     * </pre>
     * @param lbUser The entity of update target. (NotNull, PrimaryKeyNotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void updateNonstrict(final LdLbUser lbUser) {
        doUpdateNonstrict(lbUser, null);
    }

    protected void doUpdateNonstrict(LdLbUser lbUser, final UpdateOption<LdLbUserCB> op) {
        assertObjectNotNull("lbUser", lbUser);
        prepareUpdateOption(op);
        helpUpdateNonstrictInternally(lbUser, new InternalUpdateNonstrictCallback<LdLbUser>() {
            public int callbackDelegateUpdateNonstrict(LdLbUser et) { return delegateUpdateNonstrict(et, op); } });
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
     * @param lbUser The entity of insert or update target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(LdLbUser lbUser) {
        doInesrtOrUpdate(lbUser, null, null);
    }

    protected void doInesrtOrUpdate(LdLbUser lbUser, final InsertOption<LdLbUserCB> iop, final UpdateOption<LdLbUserCB> uop) {
        helpInsertOrUpdateInternally(lbUser, new InternalInsertOrUpdateCallback<LdLbUser, LdLbUserCB>() {
            public void callbackInsert(LdLbUser et) { doInsert(et, iop); }
            public void callbackUpdate(LdLbUser et) { doUpdate(et, uop); }
            public LdLbUserCB callbackNewMyConditionBean() { return newMyConditionBean(); }
            public int callbackSelectCount(LdLbUserCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrModify(Entity et, InsertOption<? extends ConditionBean> iop, UpdateOption<? extends ConditionBean> uop) {
        if (iop == null && uop == null) { insertOrUpdate(downcast(et)); }
        else {
            iop = iop != null ? iop : new InsertOption<LdLbUserCB>();
            uop = uop != null ? uop : new UpdateOption<LdLbUserCB>();
            varyingInsertOrUpdate(downcast(et), downcast(iop), downcast(uop));
        }
    }

    /**
     * Insert or update the entity non-strictly modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br />
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() }
     * <p><span style="color: #FD4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param lbUser The entity of insert or update target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdateNonstrict(LdLbUser lbUser) {
        doInesrtOrUpdateNonstrict(lbUser, null, null);
    }

    protected void doInesrtOrUpdateNonstrict(LdLbUser lbUser, final InsertOption<LdLbUserCB> iop, final UpdateOption<LdLbUserCB> uop) {
        helpInsertOrUpdateInternally(lbUser, new InternalInsertOrUpdateNonstrictCallback<LdLbUser>() {
            public void callbackInsert(LdLbUser et) { doInsert(et, iop); }
            public void callbackUpdateNonstrict(LdLbUser et) { doUpdateNonstrict(et, uop); }
        });
    }

    @Override
    protected void doCreateOrModifyNonstrict(Entity et, InsertOption<? extends ConditionBean> iop, UpdateOption<? extends ConditionBean> uop) {
        if (iop == null && uop == null) { insertOrUpdateNonstrict(downcast(et)); }
        else {
            iop = iop != null ? iop : new InsertOption<LdLbUserCB>();
            uop = uop != null ? uop : new UpdateOption<LdLbUserCB>();
            varyingInsertOrUpdateNonstrict(downcast(et), downcast(iop), downcast(uop));
        }
    }

    /**
     * Delete the entity. (ZeroUpdateException, ExclusiveControl)
     * <pre>
     * LdLbUser lbUser = new LdLbUser();
     * lbUser.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * lbUser.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     lbUserBhv.<span style="color: #FD4747">delete</span>(lbUser);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param lbUser The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(LdLbUser lbUser) {
        doDelete(lbUser, null);
    }

    protected void doDelete(LdLbUser lbUser, final DeleteOption<LdLbUserCB> op) {
        assertObjectNotNull("lbUser", lbUser);
        prepareDeleteOption(op);
        helpDeleteInternally(lbUser, new InternalDeleteCallback<LdLbUser>() {
            public int callbackDelegateDelete(LdLbUser et) { return delegateDelete(et, op); } });
    }

    protected void prepareDeleteOption(DeleteOption<LdLbUserCB> op) {
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
     * LdLbUser lbUser = new LdLbUser();
     * lbUser.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//lbUser.setVersionNo(value);</span>
     * lbUserBhv.<span style="color: #FD4747">deleteNonstrict</span>(lbUser);
     * </pre>
     * @param lbUser The entity of delete target. (NotNull, PrimaryKeyNotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrict(LdLbUser lbUser) {
        doDeleteNonstrict(lbUser, null);
    }

    protected void doDeleteNonstrict(LdLbUser lbUser, final DeleteOption<LdLbUserCB> op) {
        assertObjectNotNull("lbUser", lbUser);
        prepareDeleteOption(op);
        helpDeleteNonstrictInternally(lbUser, new InternalDeleteNonstrictCallback<LdLbUser>() {
            public int callbackDelegateDeleteNonstrict(LdLbUser et) { return delegateDeleteNonstrict(et, op); } });
    }

    /**
     * Delete the entity non-strictly ignoring deleted. {ZeroUpdateException, NonExclusiveControl}
     * <pre>
     * LdLbUser lbUser = new LdLbUser();
     * lbUser.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//lbUser.setVersionNo(value);</span>
     * lbUserBhv.<span style="color: #FD4747">deleteNonstrictIgnoreDeleted</span>(lbUser);
     * <span style="color: #3F7E5E">// if the target entity doesn't exist, no exception</span>
     * </pre>
     * @param lbUser The entity of delete target. (NotNull, PrimaryKeyNotNull)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrictIgnoreDeleted(LdLbUser lbUser) {
        doDeleteNonstrictIgnoreDeleted(lbUser, null);
    }

    protected void doDeleteNonstrictIgnoreDeleted(LdLbUser lbUser, final DeleteOption<LdLbUserCB> op) {
        assertObjectNotNull("lbUser", lbUser);
        prepareDeleteOption(op);
        helpDeleteNonstrictIgnoreDeletedInternally(lbUser, new InternalDeleteNonstrictIgnoreDeletedCallback<LdLbUser>() {
            public int callbackDelegateDeleteNonstrict(LdLbUser et) { return delegateDeleteNonstrict(et, op); } });
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
     *     LdLbUser lbUser = new LdLbUser();
     *     lbUser.setFooName("foo");
     *     if (...) {
     *         lbUser.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     lbUserList.add(lbUser);
     * }
     * lbUserBhv.<span style="color: #FD4747">batchInsert</span>(lbUserList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param lbUserList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<LdLbUser> lbUserList) {
        InsertOption<LdLbUserCB> op = createInsertUpdateOption();
        return doBatchInsert(lbUserList, op);
    }

    protected int[] doBatchInsert(List<LdLbUser> lbUserList, InsertOption<LdLbUserCB> op) {
        assertObjectNotNull("lbUserList", lbUserList);
        prepareBatchInsertOption(lbUserList, op);
        return delegateBatchInsert(lbUserList, op);
    }

    protected void prepareBatchInsertOption(List<LdLbUser> lbUserList, InsertOption<LdLbUserCB> op) {
        op.xallowInsertColumnModifiedPropertiesFragmented();
        op.xacceptInsertColumnModifiedPropertiesIfNeeds(lbUserList);
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
     *     LdLbUser lbUser = new LdLbUser();
     *     lbUser.setFooName("foo");
     *     if (...) {
     *         lbUser.setFooPrice(123);
     *     } else {
     *         lbUser.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//lbUser.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     lbUserList.add(lbUser);
     * }
     * lbUserBhv.<span style="color: #FD4747">batchUpdate</span>(lbUserList);
     * </pre>
     * @param lbUserList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<LdLbUser> lbUserList) {
        UpdateOption<LdLbUserCB> op = createPlainUpdateOption();
        return doBatchUpdate(lbUserList, op);
    }

    protected int[] doBatchUpdate(List<LdLbUser> lbUserList, UpdateOption<LdLbUserCB> op) {
        assertObjectNotNull("lbUserList", lbUserList);
        prepareBatchUpdateOption(lbUserList, op);
        return delegateBatchUpdate(lbUserList, op);
    }

    protected void prepareBatchUpdateOption(List<LdLbUser> lbUserList, UpdateOption<LdLbUserCB> op) {
        op.xacceptUpdateColumnModifiedPropertiesIfNeeds(lbUserList);
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
     * lbUserBhv.<span style="color: #FD4747">batchUpdate</span>(lbUserList, new SpecifyQuery<LdLbUserCB>() {
     *     public void specify(LdLbUserCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #FD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #FD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * lbUserBhv.<span style="color: #FD4747">batchUpdate</span>(lbUserList, new SpecifyQuery<LdLbUserCB>() {
     *     public void specify(LdLbUserCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #FD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param lbUserList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<LdLbUser> lbUserList, SpecifyQuery<LdLbUserCB> updateColumnSpec) {
        return doBatchUpdate(lbUserList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    /**
     * Batch-update the entity list non-strictly modified-only of same-set columns. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <span style="color: #FD4747; font-size: 140%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     LdLbUser lbUser = new LdLbUser();
     *     lbUser.setFooName("foo");
     *     if (...) {
     *         lbUser.setFooPrice(123);
     *     } else {
     *         lbUser.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//lbUser.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     lbUserList.add(lbUser);
     * }
     * lbUserBhv.<span style="color: #FD4747">batchUpdate</span>(lbUserList);
     * </pre>
     * @param lbUserList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<LdLbUser> lbUserList) {
        UpdateOption<LdLbUserCB> option = createPlainUpdateOption();
        return doBatchUpdateNonstrict(lbUserList, option);
    }

    protected int[] doBatchUpdateNonstrict(List<LdLbUser> lbUserList, UpdateOption<LdLbUserCB> op) {
        assertObjectNotNull("lbUserList", lbUserList);
        prepareBatchUpdateOption(lbUserList, op);
        return delegateBatchUpdateNonstrict(lbUserList, op);
    }

    /**
     * Batch-update the entity list non-strictly specified-only. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * lbUserBhv.<span style="color: #FD4747">batchUpdateNonstrict</span>(lbUserList, new SpecifyQuery<LdLbUserCB>() {
     *     public void specify(LdLbUserCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #FD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #FD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * lbUserBhv.<span style="color: #FD4747">batchUpdateNonstrict</span>(lbUserList, new SpecifyQuery<LdLbUserCB>() {
     *     public void specify(LdLbUserCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #FD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).</p>
     * @param lbUserList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<LdLbUser> lbUserList, SpecifyQuery<LdLbUserCB> updateColumnSpec) {
        return doBatchUpdateNonstrict(lbUserList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> op) {
        if (op == null) { return batchUpdateNonstrict(downcast(ls)); }
        else { return varyingBatchUpdateNonstrict(downcast(ls), downcast(op)); }
    }

    /**
     * Batch-delete the entity list. (ExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param lbUserList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchDelete(List<LdLbUser> lbUserList) {
        return doBatchDelete(lbUserList, null);
    }

    protected int[] doBatchDelete(List<LdLbUser> lbUserList, DeleteOption<LdLbUserCB> op) {
        assertObjectNotNull("lbUserList", lbUserList);
        prepareDeleteOption(op);
        return delegateBatchDelete(lbUserList, op);
    }

    @Override
    protected int[] doLumpRemove(List<Entity> ls, DeleteOption<? extends ConditionBean> op) {
        if (op == null) { return batchDelete(downcast(ls)); }
        else { return varyingBatchDelete(downcast(ls), downcast(op)); }
    }

    /**
     * Batch-delete the entity list non-strictly. {NonExclusiveControl} <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param lbUserList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDeleteNonstrict(List<LdLbUser> lbUserList) {
        return doBatchDeleteNonstrict(lbUserList, null);
    }

    protected int[] doBatchDeleteNonstrict(List<LdLbUser> lbUserList, DeleteOption<LdLbUserCB> op) {
        assertObjectNotNull("lbUserList", lbUserList);
        prepareDeleteOption(op);
        return delegateBatchDeleteNonstrict(lbUserList, op);
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
     * lbUserBhv.<span style="color: #FD4747">queryInsert</span>(new QueryInsertSetupper&lt;LdLbUser, LdLbUserCB&gt;() {
     *     public ConditionBean setup(lbUser entity, LdLbUserCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<LdLbUser, LdLbUserCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(QueryInsertSetupper<LdLbUser, LdLbUserCB> sp, InsertOption<LdLbUserCB> op) {
        assertObjectNotNull("setupper", sp);
        prepareInsertOption(op);
        LdLbUser e = new LdLbUser();
        LdLbUserCB cb = createCBForQueryInsert();
        return delegateQueryInsert(e, cb, sp.setup(e, cb), op);
    }

    protected LdLbUserCB createCBForQueryInsert() {
        LdLbUserCB cb = newMyConditionBean();
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
     * LdLbUser lbUser = new LdLbUser();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//lbUser.setPK...(value);</span>
     * lbUser.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//lbUser.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//lbUser.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//lbUser.setVersionNo(value);</span>
     * LdLbUserCB cb = new LdLbUserCB();
     * cb.query().setFoo...(value);
     * lbUserBhv.<span style="color: #FD4747">queryUpdate</span>(lbUser, cb);
     * </pre>
     * @param lbUser The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of LdLbUser. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(LdLbUser lbUser, LdLbUserCB cb) {
        return doQueryUpdate(lbUser, cb, null);
    }

    protected int doQueryUpdate(LdLbUser lbUser, LdLbUserCB cb, UpdateOption<LdLbUserCB> op) {
        assertObjectNotNull("lbUser", lbUser); assertCBStateValid(cb);
        prepareUpdateOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryUpdate(lbUser, cb, op) : 0;
    }

    @Override
    protected int doRangeModify(Entity et, ConditionBean cb, UpdateOption<? extends ConditionBean> op) {
        if (op == null) { return queryUpdate(downcast(et), (LdLbUserCB)cb); }
        else { return varyingQueryUpdate(downcast(et), (LdLbUserCB)cb, downcast(op)); }
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * LdLbUserCB cb = new LdLbUserCB();
     * cb.query().setFoo...(value);
     * lbUserBhv.<span style="color: #FD4747">queryDelete</span>(lbUser, cb);
     * </pre>
     * @param cb The condition-bean of LdLbUser. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(LdLbUserCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(LdLbUserCB cb, DeleteOption<LdLbUserCB> op) {
        assertCBStateValid(cb);
        prepareDeleteOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryDelete(cb, op) : 0;
    }

    @Override
    protected int doRangeRemove(ConditionBean cb, DeleteOption<? extends ConditionBean> op) {
        if (op == null) { return queryDelete((LdLbUserCB)cb); }
        else { return varyingQueryDelete((LdLbUserCB)cb, downcast(op)); }
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
     * LdLbUser lbUser = new LdLbUser();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * lbUser.setFoo...(value);
     * lbUser.setBar...(value);
     * InsertOption<LdLbUserCB> option = new InsertOption<LdLbUserCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * lbUserBhv.<span style="color: #FD4747">varyingInsert</span>(lbUser, option);
     * ... = lbUser.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param lbUser The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(LdLbUser lbUser, InsertOption<LdLbUserCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(lbUser, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, ExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * LdLbUser lbUser = new LdLbUser();
     * lbUser.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * lbUser.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * lbUser.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;LdLbUserCB&gt; option = new UpdateOption&lt;LdLbUserCB&gt;();
     *     option.self(new SpecifyQuery&lt;LdLbUserCB&gt;() {
     *         public void specify(LdLbUserCB cb) {
     *             cb.specify().<span style="color: #FD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     lbUserBhv.<span style="color: #FD4747">varyingUpdate</span>(lbUser, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param lbUser The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(LdLbUser lbUser, UpdateOption<LdLbUserCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(lbUser, option);
    }

    /**
     * Update the entity with varying requests non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as updateNonstrict(entity).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * LdLbUser lbUser = new LdLbUser();
     * lbUser.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * lbUser.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//lbUser.setVersionNo(value);</span>
     * UpdateOption&lt;LdLbUserCB&gt; option = new UpdateOption&lt;LdLbUserCB&gt;();
     * option.self(new SpecifyQuery&lt;LdLbUserCB&gt;() {
     *     public void specify(LdLbUserCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * lbUserBhv.<span style="color: #FD4747">varyingUpdateNonstrict</span>(lbUser, option);
     * </pre>
     * @param lbUser The entity of update target. (NotNull, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdateNonstrict(LdLbUser lbUser, UpdateOption<LdLbUserCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdateNonstrict(lbUser, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param lbUser The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(LdLbUser lbUser, InsertOption<LdLbUserCB> insertOption, UpdateOption<LdLbUserCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdate(lbUser, insertOption, updateOption);
    }

    /**
     * Insert or update the entity with varying requests non-strictly. (NonExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdateNonstrict(entity).
     * @param lbUser The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdateNonstrict(LdLbUser lbUser, InsertOption<LdLbUserCB> insertOption, UpdateOption<LdLbUserCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdateNonstrict(lbUser, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, ExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param lbUser The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(LdLbUser lbUser, DeleteOption<LdLbUserCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(lbUser, option);
    }

    /**
     * Delete the entity with varying requests non-strictly. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as deleteNonstrict(entity).
     * @param lbUser The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDeleteNonstrict(LdLbUser lbUser, DeleteOption<LdLbUserCB> option) {
        assertDeleteOptionNotNull(option);
        doDeleteNonstrict(lbUser, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param lbUserList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<LdLbUser> lbUserList, InsertOption<LdLbUserCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(lbUserList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param lbUserList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<LdLbUser> lbUserList, UpdateOption<LdLbUserCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(lbUserList, option);
    }

    /**
     * Batch-update the list with varying requests non-strictly. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param lbUserList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdateNonstrict(List<LdLbUser> lbUserList, UpdateOption<LdLbUserCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdateNonstrict(lbUserList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param lbUserList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<LdLbUser> lbUserList, DeleteOption<LdLbUserCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(lbUserList, option);
    }

    /**
     * Batch-delete the list with varying requests non-strictly. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDeleteNonstrict(entityList).
     * @param lbUserList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDeleteNonstrict(List<LdLbUser> lbUserList, DeleteOption<LdLbUserCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDeleteNonstrict(lbUserList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<LdLbUser, LdLbUserCB> setupper, InsertOption<LdLbUserCB> option) {
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
     * LdLbUser lbUser = new LdLbUser();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//lbUser.setPK...(value);</span>
     * lbUser.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//lbUser.setVersionNo(value);</span>
     * LdLbUserCB cb = new LdLbUserCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;LdLbUserCB&gt; option = new UpdateOption&lt;LdLbUserCB&gt;();
     * option.self(new SpecifyQuery&lt;LdLbUserCB&gt;() {
     *     public void specify(LdLbUserCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * lbUserBhv.<span style="color: #FD4747">varyingQueryUpdate</span>(lbUser, cb, option);
     * </pre>
     * @param lbUser The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of LdLbUser. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(LdLbUser lbUser, LdLbUserCB cb, UpdateOption<LdLbUserCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(lbUser, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of LdLbUser. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(LdLbUserCB cb, DeleteOption<LdLbUserCB> option) {
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
    public OutsideSqlBasicExecutor<LdLbUserBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCountUniquely(LdLbUserCB cb) { return invoke(createSelectCountCBCommand(cb, true)); }
    protected int delegateSelectCountPlainly(LdLbUserCB cb) { return invoke(createSelectCountCBCommand(cb, false)); }
    protected <ENTITY extends LdLbUser> void delegateSelectCursor(LdLbUserCB cb, EntityRowHandler<ENTITY> rh, Class<ENTITY> tp)
    { invoke(createSelectCursorCBCommand(cb, rh, tp)); }
    protected <ENTITY extends LdLbUser> List<ENTITY> delegateSelectList(LdLbUserCB cb, Class<ENTITY> tp)
    { return invoke(createSelectListCBCommand(cb, tp)); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(LdLbUser et, InsertOption<LdLbUserCB> op)
    { if (!processBeforeInsert(et, op)) { return 0; }
      return invoke(createInsertEntityCommand(et, op)); }
    protected int delegateUpdate(LdLbUser et, UpdateOption<LdLbUserCB> op)
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return invoke(createUpdateEntityCommand(et, op)); }
    protected int delegateUpdateNonstrict(LdLbUser et, UpdateOption<LdLbUserCB> op)
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return invoke(createUpdateNonstrictEntityCommand(et, op)); }
    protected int delegateDelete(LdLbUser et, DeleteOption<LdLbUserCB> op)
    { if (!processBeforeDelete(et, op)) { return 0; }
      return invoke(createDeleteEntityCommand(et, op)); }
    protected int delegateDeleteNonstrict(LdLbUser et, DeleteOption<LdLbUserCB> op)
    { if (!processBeforeDelete(et, op)) { return 0; }
      return invoke(createDeleteNonstrictEntityCommand(et, op)); }

    protected int[] delegateBatchInsert(List<LdLbUser> ls, InsertOption<LdLbUserCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchInsertCommand(processBatchInternally(ls, op), op)); }
    protected int[] delegateBatchUpdate(List<LdLbUser> ls, UpdateOption<LdLbUserCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateCommand(processBatchInternally(ls, op, false), op)); }
    protected int[] delegateBatchUpdateNonstrict(List<LdLbUser> ls, UpdateOption<LdLbUserCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateNonstrictCommand(processBatchInternally(ls, op, true), op)); }
    protected int[] delegateBatchDelete(List<LdLbUser> ls, DeleteOption<LdLbUserCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteCommand(processBatchInternally(ls, op, false), op)); }
    protected int[] delegateBatchDeleteNonstrict(List<LdLbUser> ls, DeleteOption<LdLbUserCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteNonstrictCommand(processBatchInternally(ls, op, true), op)); }

    protected int delegateQueryInsert(LdLbUser et, LdLbUserCB inCB, ConditionBean resCB, InsertOption<LdLbUserCB> op)
    { if (!processBeforeQueryInsert(et, inCB, resCB, op)) { return 0; } return invoke(createQueryInsertCBCommand(et, inCB, resCB, op));  }
    protected int delegateQueryUpdate(LdLbUser et, LdLbUserCB cb, UpdateOption<LdLbUserCB> op)
    { if (!processBeforeQueryUpdate(et, cb, op)) { return 0; } return invoke(createQueryUpdateCBCommand(et, cb, op));  }
    protected int delegateQueryDelete(LdLbUserCB cb, DeleteOption<LdLbUserCB> op)
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
        return downcast(et).getUTimestamp() != null;
    }

    // ===================================================================================
    //                                                                     Downcast Helper
    //                                                                     ===============
    protected LdLbUser downcast(Entity et) {
        return helpEntityDowncastInternally(et, LdLbUser.class);
    }

    protected LdLbUserCB downcast(ConditionBean cb) {
        return helpConditionBeanDowncastInternally(cb, LdLbUserCB.class);
    }

    @SuppressWarnings("unchecked")
    protected List<LdLbUser> downcast(List<? extends Entity> ls) {
        return (List<LdLbUser>)ls;
    }

    @SuppressWarnings("unchecked")
    protected InsertOption<LdLbUserCB> downcast(InsertOption<? extends ConditionBean> op) {
        return (InsertOption<LdLbUserCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected UpdateOption<LdLbUserCB> downcast(UpdateOption<? extends ConditionBean> op) {
        return (UpdateOption<LdLbUserCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected DeleteOption<LdLbUserCB> downcast(DeleteOption<? extends ConditionBean> op) {
        return (DeleteOption<LdLbUserCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<LdLbUser, LdLbUserCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> sp) {
        return (QueryInsertSetupper<LdLbUser, LdLbUserCB>)sp;
    }
}
