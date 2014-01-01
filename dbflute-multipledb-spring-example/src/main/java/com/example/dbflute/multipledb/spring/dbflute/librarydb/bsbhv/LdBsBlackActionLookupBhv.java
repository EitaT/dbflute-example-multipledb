/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */package com.example.dbflute.multipledb.spring.dbflute.librarydb.bsbhv;

import java.util.List;

import org.seasar.dbflute.*;
import org.seasar.dbflute.bhv.*;
import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.outsidesql.executor.*;
import com.example.dbflute.multipledb.spring.dbflute.librarydb.exbhv.*;
import com.example.dbflute.multipledb.spring.dbflute.librarydb.exentity.*;
import com.example.dbflute.multipledb.spring.dbflute.librarydb.bsentity.dbmeta.*;
import com.example.dbflute.multipledb.spring.dbflute.librarydb.cbean.*;

/**
 * The behavior of BLACK_ACTION_LOOKUP as TABLE. <br />
 * <pre>
 * [primary key]
 *     BLACK_ACTION_CODE
 * 
 * [column]
 *     BLACK_ACTION_CODE, BLACK_ACTION_NAME, R_USER, R_MODULE, R_TIMESTAMP, U_USER, U_MODULE, U_TIMESTAMP
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
 *     BLACK_ACTION
 * 
 * [foreign property]
 *     
 * 
 * [referrer property]
 *     blackActionList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class LdBsBlackActionLookupBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "BLACK_ACTION_LOOKUP"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public DBMeta getDBMeta() { return LdBlackActionLookupDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public LdBlackActionLookupDbm getMyDBMeta() { return LdBlackActionLookupDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public Entity newEntity() { return newMyEntity(); }

    /** {@inheritDoc} */
    public ConditionBean newConditionBean() { return newMyConditionBean(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public LdBlackActionLookup newMyEntity() { return new LdBlackActionLookup(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public LdBlackActionLookupCB newMyConditionBean() { return new LdBlackActionLookupCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * LdBlackActionLookupCB cb = new LdBlackActionLookupCB();
     * cb.query().setFoo...(value);
     * int count = blackActionLookupBhv.<span style="color: #FD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of LdBlackActionLookup. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(LdBlackActionLookupCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(LdBlackActionLookupCB cb) { // called by selectCount(cb) 
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(LdBlackActionLookupCB cb) { // called by selectPage(cb)
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
     * LdBlackActionLookupCB cb = new LdBlackActionLookupCB();
     * cb.query().setFoo...(value);
     * LdBlackActionLookup blackActionLookup = blackActionLookupBhv.<span style="color: #FD4747">selectEntity</span>(cb);
     * if (blackActionLookup != null) {
     *     ... = blackActionLookup.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of LdBlackActionLookup. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public LdBlackActionLookup selectEntity(LdBlackActionLookupCB cb) {
        return doSelectEntity(cb, LdBlackActionLookup.class);
    }

    protected <ENTITY extends LdBlackActionLookup> ENTITY doSelectEntity(final LdBlackActionLookupCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityInternally(cb, entityType, new InternalSelectEntityCallback<ENTITY, LdBlackActionLookupCB>() {
            public List<ENTITY> callbackSelectList(LdBlackActionLookupCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); } });
    }

    @Override
    protected Entity doReadEntity(ConditionBean cb) {
        return selectEntity(downcast(cb));
    }

    /**
     * Select the entity by the condition-bean with deleted check.
     * <pre>
     * LdBlackActionLookupCB cb = new LdBlackActionLookupCB();
     * cb.query().setFoo...(value);
     * LdBlackActionLookup blackActionLookup = blackActionLookupBhv.<span style="color: #FD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = blackActionLookup.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of LdBlackActionLookup. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public LdBlackActionLookup selectEntityWithDeletedCheck(LdBlackActionLookupCB cb) {
        return doSelectEntityWithDeletedCheck(cb, LdBlackActionLookup.class);
    }

    protected <ENTITY extends LdBlackActionLookup> ENTITY doSelectEntityWithDeletedCheck(final LdBlackActionLookupCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityWithDeletedCheckInternally(cb, entityType, new InternalSelectEntityWithDeletedCheckCallback<ENTITY, LdBlackActionLookupCB>() {
            public List<ENTITY> callbackSelectList(LdBlackActionLookupCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); } });
    }

    @Override
    protected Entity doReadEntityWithDeletedCheck(ConditionBean cb) {
        return selectEntityWithDeletedCheck(downcast(cb));
    }

    /**
     * Select the entity by the primary-key value.
     * @param blackActionCode The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public LdBlackActionLookup selectByPKValue(String blackActionCode) {
        return doSelectByPKValue(blackActionCode, LdBlackActionLookup.class);
    }

    protected <ENTITY extends LdBlackActionLookup> ENTITY doSelectByPKValue(String blackActionCode, Class<ENTITY> entityType) {
        return doSelectEntity(buildPKCB(blackActionCode), entityType);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param blackActionCode The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public LdBlackActionLookup selectByPKValueWithDeletedCheck(String blackActionCode) {
        return doSelectByPKValueWithDeletedCheck(blackActionCode, LdBlackActionLookup.class);
    }

    protected <ENTITY extends LdBlackActionLookup> ENTITY doSelectByPKValueWithDeletedCheck(String blackActionCode, Class<ENTITY> entityType) {
        return doSelectEntityWithDeletedCheck(buildPKCB(blackActionCode), entityType);
    }

    private LdBlackActionLookupCB buildPKCB(String blackActionCode) {
        assertObjectNotNull("blackActionCode", blackActionCode);
        LdBlackActionLookupCB cb = newMyConditionBean();
        cb.query().setBlackActionCode_Equal(blackActionCode);
        return cb;
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * LdBlackActionLookupCB cb = new LdBlackActionLookupCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;LdBlackActionLookup&gt; blackActionLookupList = blackActionLookupBhv.<span style="color: #FD4747">selectList</span>(cb);
     * for (LdBlackActionLookup blackActionLookup : blackActionLookupList) {
     *     ... = blackActionLookup.get...();
     * }
     * </pre>
     * @param cb The condition-bean of LdBlackActionLookup. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<LdBlackActionLookup> selectList(LdBlackActionLookupCB cb) {
        return doSelectList(cb, LdBlackActionLookup.class);
    }

    protected <ENTITY extends LdBlackActionLookup> ListResultBean<ENTITY> doSelectList(LdBlackActionLookupCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", entityType);
        assertSpecifyDerivedReferrerEntityProperty(cb, entityType);
        return helpSelectListInternally(cb, entityType, new InternalSelectListCallback<ENTITY, LdBlackActionLookupCB>() {
            public List<ENTITY> callbackSelectList(LdBlackActionLookupCB cb, Class<ENTITY> entityType) { return delegateSelectList(cb, entityType); } });
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
     * LdBlackActionLookupCB cb = new LdBlackActionLookupCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #FD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;LdBlackActionLookup&gt; page = blackActionLookupBhv.<span style="color: #FD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (LdBlackActionLookup blackActionLookup : page) {
     *     ... = blackActionLookup.get...();
     * }
     * </pre>
     * @param cb The condition-bean of LdBlackActionLookup. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<LdBlackActionLookup> selectPage(LdBlackActionLookupCB cb) {
        return doSelectPage(cb, LdBlackActionLookup.class);
    }

    protected <ENTITY extends LdBlackActionLookup> PagingResultBean<ENTITY> doSelectPage(LdBlackActionLookupCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", entityType);
        return helpSelectPageInternally(cb, entityType, new InternalSelectPageCallback<ENTITY, LdBlackActionLookupCB>() {
            public int callbackSelectCount(LdBlackActionLookupCB cb) { return doSelectCountPlainly(cb); }
            public List<ENTITY> callbackSelectList(LdBlackActionLookupCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); }
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
     * LdBlackActionLookupCB cb = new LdBlackActionLookupCB();
     * cb.query().setFoo...(value);
     * blackActionLookupBhv.<span style="color: #FD4747">selectCursor</span>(cb, new EntityRowHandler&lt;LdBlackActionLookup&gt;() {
     *     public void handle(LdBlackActionLookup entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of LdBlackActionLookup. (NotNull)
     * @param entityRowHandler The handler of entity row of LdBlackActionLookup. (NotNull)
     */
    public void selectCursor(LdBlackActionLookupCB cb, EntityRowHandler<LdBlackActionLookup> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, LdBlackActionLookup.class);
    }

    protected <ENTITY extends LdBlackActionLookup> void doSelectCursor(LdBlackActionLookupCB cb, EntityRowHandler<ENTITY> entityRowHandler, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler<LdBlackActionLookup>", entityRowHandler); assertObjectNotNull("entityType", entityType);
        assertSpecifyDerivedReferrerEntityProperty(cb, entityType);
        helpSelectCursorInternally(cb, entityRowHandler, entityType, new InternalSelectCursorCallback<ENTITY, LdBlackActionLookupCB>() {
            public void callbackSelectCursor(LdBlackActionLookupCB cb, EntityRowHandler<ENTITY> entityRowHandler, Class<ENTITY> entityType) { delegateSelectCursor(cb, entityRowHandler, entityType); }
            public List<ENTITY> callbackSelectList(LdBlackActionLookupCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); }
        });
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * blackActionLookupBhv.<span style="color: #FD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(LdBlackActionLookupCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> SLFunction<LdBlackActionLookupCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
    }

    protected <RESULT, CB extends LdBlackActionLookupCB> SLFunction<CB, RESULT> doScalarSelect(Class<RESULT> resultType, CB cb) {
        assertObjectNotNull("resultType", resultType); assertCBStateValid(cb);
        cb.xsetupForScalarSelect(); cb.getSqlClause().disableSelectIndex(); // for when you use union
        return createSLFunction(cb, resultType);
    }

    protected <RESULT, CB extends LdBlackActionLookupCB> SLFunction<CB, RESULT> createSLFunction(CB cb, Class<RESULT> resultType) {
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
     * @param blackActionLookup The entity of blackActionLookup. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     */
    public void loadBlackActionList(LdBlackActionLookup blackActionLookup, ConditionBeanSetupper<LdBlackActionCB> conditionBeanSetupper) {
        xassLRArg(blackActionLookup, conditionBeanSetupper);
        loadBlackActionList(xnewLRLs(blackActionLookup), conditionBeanSetupper);
    }
    /**
     * Load referrer of blackActionList with the set-upper for condition-bean of referrer. <br />
     * BLACK_ACTION by BLACK_ACTION_CODE, named 'blackActionList'.
     * <pre>
     * blackActionLookupBhv.<span style="color: #FD4747">loadBlackActionList</span>(blackActionLookupList, new ConditionBeanSetupper&lt;LdBlackActionCB&gt;() {
     *     public void setup(LdBlackActionCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...(); <span style="color: #3F7E5E">// basically you should order referrer list</span>
     *     }
     * });
     * for (LdBlackActionLookup blackActionLookup : blackActionLookupList) {
     *     ... = blackActionLookup.<span style="color: #FD4747">getBlackActionList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key(and others too) is treated as case-insensitive. <br />
     * The condition-bean that the set-upper provides have settings before you touch it. It is as follows:
     * <pre>
     * cb.query().setBlackActionCode_InScope(pkList);
     * cb.query().addOrderBy_BlackActionCode_Asc();
     * </pre>
     * @param blackActionLookupList The entity list of blackActionLookup. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     */
    public void loadBlackActionList(List<LdBlackActionLookup> blackActionLookupList, ConditionBeanSetupper<LdBlackActionCB> conditionBeanSetupper) {
        xassLRArg(blackActionLookupList, conditionBeanSetupper);
        loadBlackActionList(blackActionLookupList, new LoadReferrerOption<LdBlackActionCB, LdBlackAction>().xinit(conditionBeanSetupper));
    }
    /**
     * {Refer to overload method that has an argument of the list of entity.}
     * @param blackActionLookup The entity of blackActionLookup. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadBlackActionList(LdBlackActionLookup blackActionLookup, LoadReferrerOption<LdBlackActionCB, LdBlackAction> loadReferrerOption) {
        xassLRArg(blackActionLookup, loadReferrerOption);
        loadBlackActionList(xnewLRLs(blackActionLookup), loadReferrerOption);
    }
    /**
     * {Refer to overload method that has an argument of condition-bean setupper.}
     * @param blackActionLookupList The entity list of blackActionLookup. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadBlackActionList(List<LdBlackActionLookup> blackActionLookupList, LoadReferrerOption<LdBlackActionCB, LdBlackAction> loadReferrerOption) {
        xassLRArg(blackActionLookupList, loadReferrerOption);
        if (blackActionLookupList.isEmpty()) { return; }
        final LdBlackActionBhv referrerBhv = xgetBSFLR().select(LdBlackActionBhv.class);
        helpLoadReferrerInternally(blackActionLookupList, loadReferrerOption, new InternalLoadReferrerCallback<LdBlackActionLookup, String, LdBlackActionCB, LdBlackAction>() {
            public String getPKVal(LdBlackActionLookup e)
            { return e.getBlackActionCode(); }
            public void setRfLs(LdBlackActionLookup e, List<LdBlackAction> ls)
            { e.setBlackActionList(ls); }
            public LdBlackActionCB newMyCB() { return referrerBhv.newMyConditionBean(); }
            public void qyFKIn(LdBlackActionCB cb, List<String> ls)
            { cb.query().setBlackActionCode_InScope(ls); }
            public void qyOdFKAsc(LdBlackActionCB cb) { cb.query().addOrderBy_BlackActionCode_Asc(); }
            public void spFKCol(LdBlackActionCB cb) { cb.specify().columnBlackActionCode(); }
            public List<LdBlackAction> selRfLs(LdBlackActionCB cb) { return referrerBhv.selectList(cb); }
            public String getFKVal(LdBlackAction e) { return e.getBlackActionCode(); }
            public void setlcEt(LdBlackAction re, LdBlackActionLookup le)
            { re.setBlackActionLookup(le); }
            public String getRfPrNm() { return "blackActionList"; }
        });
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key blackActionCode.
     * @param blackActionLookupList The list of blackActionLookup. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<String> extractBlackActionCodeList(List<LdBlackActionLookup> blackActionLookupList) {
        return helpExtractListInternally(blackActionLookupList, new InternalExtractCallback<LdBlackActionLookup, String>() {
            public String getCV(LdBlackActionLookup e) { return e.getBlackActionCode(); }
        });
    }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * LdBlackActionLookup blackActionLookup = new LdBlackActionLookup();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * blackActionLookup.setFoo...(value);
     * blackActionLookup.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//blackActionLookup.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//blackActionLookup.set...;</span>
     * blackActionLookupBhv.<span style="color: #FD4747">insert</span>(blackActionLookup);
     * ... = blackActionLookup.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param blackActionLookup The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(LdBlackActionLookup blackActionLookup) {
        doInsert(blackActionLookup, null);
    }

    protected void doInsert(LdBlackActionLookup blackActionLookup, InsertOption<LdBlackActionLookupCB> option) {
        assertObjectNotNull("blackActionLookup", blackActionLookup);
        prepareInsertOption(option);
        delegateInsert(blackActionLookup, option);
    }

    protected void prepareInsertOption(InsertOption<LdBlackActionLookupCB> option) {
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
     * LdBlackActionLookup blackActionLookup = new LdBlackActionLookup();
     * blackActionLookup.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * blackActionLookup.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//blackActionLookup.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//blackActionLookup.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * blackActionLookup.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     blackActionLookupBhv.<span style="color: #FD4747">update</span>(blackActionLookup);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * } 
     * </pre>
     * @param blackActionLookup The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(final LdBlackActionLookup blackActionLookup) {
        doUpdate(blackActionLookup, null);
    }

    protected void doUpdate(LdBlackActionLookup blackActionLookup, final UpdateOption<LdBlackActionLookupCB> option) {
        assertObjectNotNull("blackActionLookup", blackActionLookup);
        prepareUpdateOption(option);
        helpUpdateInternally(blackActionLookup, new InternalUpdateCallback<LdBlackActionLookup>() {
            public int callbackDelegateUpdate(LdBlackActionLookup entity) { return delegateUpdate(entity, option); } });
    }

    protected void prepareUpdateOption(UpdateOption<LdBlackActionLookupCB> option) {
        if (option == null) { return; }
        assertUpdateOptionStatus(option);
        if (option.hasSelfSpecification()) {
            option.resolveSelfSpecification(createCBForVaryingUpdate());
        }
        if (option.hasSpecifiedUpdateColumn()) {
            option.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    protected LdBlackActionLookupCB createCBForVaryingUpdate() {
        LdBlackActionLookupCB cb = newMyConditionBean();
        cb.xsetupForVaryingUpdate();
        return cb;
    }

    protected LdBlackActionLookupCB createCBForSpecifiedUpdate() {
        LdBlackActionLookupCB cb = newMyConditionBean();
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
     * LdBlackActionLookup blackActionLookup = new LdBlackActionLookup();
     * blackActionLookup.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * blackActionLookup.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//blackActionLookup.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//blackActionLookup.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//blackActionLookup.setVersionNo(value);</span>
     * blackActionLookupBhv.<span style="color: #FD4747">updateNonstrict</span>(blackActionLookup);
     * </pre>
     * @param blackActionLookup The entity of update target. (NotNull, PrimaryKeyNotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void updateNonstrict(final LdBlackActionLookup blackActionLookup) {
        doUpdateNonstrict(blackActionLookup, null);
    }

    protected void doUpdateNonstrict(LdBlackActionLookup blackActionLookup, final UpdateOption<LdBlackActionLookupCB> option) {
        assertObjectNotNull("blackActionLookup", blackActionLookup);
        prepareUpdateOption(option);
        helpUpdateNonstrictInternally(blackActionLookup, new InternalUpdateNonstrictCallback<LdBlackActionLookup>() {
            public int callbackDelegateUpdateNonstrict(LdBlackActionLookup entity) { return delegateUpdateNonstrict(entity, option); } });
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
     * @param blackActionLookup The entity of insert or update target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(LdBlackActionLookup blackActionLookup) {
        doInesrtOrUpdate(blackActionLookup, null, null);
    }

    protected void doInesrtOrUpdate(LdBlackActionLookup blackActionLookup, final InsertOption<LdBlackActionLookupCB> insertOption, final UpdateOption<LdBlackActionLookupCB> updateOption) {
        helpInsertOrUpdateInternally(blackActionLookup, new InternalInsertOrUpdateCallback<LdBlackActionLookup, LdBlackActionLookupCB>() {
            public void callbackInsert(LdBlackActionLookup entity) { doInsert(entity, insertOption); }
            public void callbackUpdate(LdBlackActionLookup entity) { doUpdate(entity, updateOption); }
            public LdBlackActionLookupCB callbackNewMyConditionBean() { return newMyConditionBean(); }
            public int callbackSelectCount(LdBlackActionLookupCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrModify(Entity entity, InsertOption<? extends ConditionBean> insertOption,
            UpdateOption<? extends ConditionBean> updateOption) {
        if (insertOption == null && updateOption == null) { insertOrUpdate(downcast(entity)); }
        else {
            insertOption = insertOption == null ? new InsertOption<LdBlackActionLookupCB>() : insertOption;
            updateOption = updateOption == null ? new UpdateOption<LdBlackActionLookupCB>() : updateOption;
            varyingInsertOrUpdate(downcast(entity), downcast(insertOption), downcast(updateOption));
        }
    }

    /**
     * Insert or update the entity non-strictly modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br />
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() }
     * <p><span style="color: #FD4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param blackActionLookup The entity of insert or update target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdateNonstrict(LdBlackActionLookup blackActionLookup) {
        doInesrtOrUpdateNonstrict(blackActionLookup, null, null);
    }

    protected void doInesrtOrUpdateNonstrict(LdBlackActionLookup blackActionLookup, final InsertOption<LdBlackActionLookupCB> insertOption, final UpdateOption<LdBlackActionLookupCB> updateOption) {
        helpInsertOrUpdateInternally(blackActionLookup, new InternalInsertOrUpdateNonstrictCallback<LdBlackActionLookup>() {
            public void callbackInsert(LdBlackActionLookup entity) { doInsert(entity, insertOption); }
            public void callbackUpdateNonstrict(LdBlackActionLookup entity) { doUpdateNonstrict(entity, updateOption); }
        });
    }

    @Override
    protected void doCreateOrModifyNonstrict(Entity entity, InsertOption<? extends ConditionBean> insertOption,
            UpdateOption<? extends ConditionBean> updateOption) {
        if (insertOption == null && updateOption == null) { insertOrUpdateNonstrict(downcast(entity)); }
        else {
            insertOption = insertOption == null ? new InsertOption<LdBlackActionLookupCB>() : insertOption;
            updateOption = updateOption == null ? new UpdateOption<LdBlackActionLookupCB>() : updateOption;
            varyingInsertOrUpdateNonstrict(downcast(entity), downcast(insertOption), downcast(updateOption));
        }
    }

    /**
     * Delete the entity. (ZeroUpdateException, ExclusiveControl)
     * <pre>
     * LdBlackActionLookup blackActionLookup = new LdBlackActionLookup();
     * blackActionLookup.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * blackActionLookup.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     blackActionLookupBhv.<span style="color: #FD4747">delete</span>(blackActionLookup);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * } 
     * </pre>
     * @param blackActionLookup The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(LdBlackActionLookup blackActionLookup) {
        doDelete(blackActionLookup, null);
    }

    protected void doDelete(LdBlackActionLookup blackActionLookup, final DeleteOption<LdBlackActionLookupCB> option) {
        assertObjectNotNull("blackActionLookup", blackActionLookup);
        prepareDeleteOption(option);
        helpDeleteInternally(blackActionLookup, new InternalDeleteCallback<LdBlackActionLookup>() {
            public int callbackDelegateDelete(LdBlackActionLookup entity) { return delegateDelete(entity, option); } });
    }

    protected void prepareDeleteOption(DeleteOption<LdBlackActionLookupCB> option) {
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
     * LdBlackActionLookup blackActionLookup = new LdBlackActionLookup();
     * blackActionLookup.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//blackActionLookup.setVersionNo(value);</span>
     * blackActionLookupBhv.<span style="color: #FD4747">deleteNonstrict</span>(blackActionLookup);
     * </pre>
     * @param blackActionLookup The entity of delete target. (NotNull, PrimaryKeyNotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrict(LdBlackActionLookup blackActionLookup) {
        doDeleteNonstrict(blackActionLookup, null);
    }

    protected void doDeleteNonstrict(LdBlackActionLookup blackActionLookup, final DeleteOption<LdBlackActionLookupCB> option) {
        assertObjectNotNull("blackActionLookup", blackActionLookup);
        prepareDeleteOption(option);
        helpDeleteNonstrictInternally(blackActionLookup, new InternalDeleteNonstrictCallback<LdBlackActionLookup>() {
            public int callbackDelegateDeleteNonstrict(LdBlackActionLookup entity) { return delegateDeleteNonstrict(entity, option); } });
    }

    /**
     * Delete the entity non-strictly ignoring deleted. {ZeroUpdateException, NonExclusiveControl}
     * <pre>
     * LdBlackActionLookup blackActionLookup = new LdBlackActionLookup();
     * blackActionLookup.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//blackActionLookup.setVersionNo(value);</span>
     * blackActionLookupBhv.<span style="color: #FD4747">deleteNonstrictIgnoreDeleted</span>(blackActionLookup);
     * <span style="color: #3F7E5E">// if the target entity doesn't exist, no exception</span>
     * </pre>
     * @param blackActionLookup The entity of delete target. (NotNull, PrimaryKeyNotNull)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrictIgnoreDeleted(LdBlackActionLookup blackActionLookup) {
        doDeleteNonstrictIgnoreDeleted(blackActionLookup, null);
    }

    protected void doDeleteNonstrictIgnoreDeleted(LdBlackActionLookup blackActionLookup, final DeleteOption<LdBlackActionLookupCB> option) {
        assertObjectNotNull("blackActionLookup", blackActionLookup);
        prepareDeleteOption(option);
        helpDeleteNonstrictIgnoreDeletedInternally(blackActionLookup, new InternalDeleteNonstrictIgnoreDeletedCallback<LdBlackActionLookup>() {
            public int callbackDelegateDeleteNonstrict(LdBlackActionLookup entity) { return delegateDeleteNonstrict(entity, option); } });
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
     *     LdBlackActionLookup blackActionLookup = new LdBlackActionLookup();
     *     blackActionLookup.setFooName("foo");
     *     if (...) {
     *         blackActionLookup.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     blackActionLookupList.add(blackActionLookup);
     * }
     * blackActionLookupBhv.<span style="color: #FD4747">batchInsert</span>(blackActionLookupList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param blackActionLookupList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<LdBlackActionLookup> blackActionLookupList) {
        InsertOption<LdBlackActionLookupCB> option = createInsertUpdateOption();
        return doBatchInsert(blackActionLookupList, option);
    }

    protected int[] doBatchInsert(List<LdBlackActionLookup> blackActionLookupList, InsertOption<LdBlackActionLookupCB> option) {
        assertObjectNotNull("blackActionLookupList", blackActionLookupList);
        prepareBatchInsertOption(blackActionLookupList, option);
        return delegateBatchInsert(blackActionLookupList, option);
    }

    protected void prepareBatchInsertOption(List<LdBlackActionLookup> blackActionLookupList, InsertOption<LdBlackActionLookupCB> option) {
        option.xallowInsertColumnModifiedPropertiesFragmented();
        option.xacceptInsertColumnModifiedPropertiesIfNeeds(blackActionLookupList);
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
     *     LdBlackActionLookup blackActionLookup = new LdBlackActionLookup();
     *     blackActionLookup.setFooName("foo");
     *     if (...) {
     *         blackActionLookup.setFooPrice(123);
     *     } else {
     *         blackActionLookup.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//blackActionLookup.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     blackActionLookupList.add(blackActionLookup);
     * }
     * blackActionLookupBhv.<span style="color: #FD4747">batchUpdate</span>(blackActionLookupList);
     * </pre>
     * @param blackActionLookupList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<LdBlackActionLookup> blackActionLookupList) {
        UpdateOption<LdBlackActionLookupCB> option = createPlainUpdateOption();
        return doBatchUpdate(blackActionLookupList, option);
    }

    protected int[] doBatchUpdate(List<LdBlackActionLookup> blackActionLookupList, UpdateOption<LdBlackActionLookupCB> option) {
        assertObjectNotNull("blackActionLookupList", blackActionLookupList);
        prepareBatchUpdateOption(blackActionLookupList, option);
        return delegateBatchUpdate(blackActionLookupList, option);
    }

    protected void prepareBatchUpdateOption(List<LdBlackActionLookup> blackActionLookupList, UpdateOption<LdBlackActionLookupCB> option) {
        option.xacceptUpdateColumnModifiedPropertiesIfNeeds(blackActionLookupList);
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
     * blackActionLookupBhv.<span style="color: #FD4747">batchUpdate</span>(blackActionLookupList, new SpecifyQuery<LdBlackActionLookupCB>() {
     *     public void specify(LdBlackActionLookupCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #FD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #FD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span> 
     * blackActionLookupBhv.<span style="color: #FD4747">batchUpdate</span>(blackActionLookupList, new SpecifyQuery<LdBlackActionLookupCB>() {
     *     public void specify(LdBlackActionLookupCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #FD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param blackActionLookupList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<LdBlackActionLookup> blackActionLookupList, SpecifyQuery<LdBlackActionLookupCB> updateColumnSpec) {
        return doBatchUpdate(blackActionLookupList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    /**
     * Batch-update the entity list non-strictly modified-only of same-set columns. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <span style="color: #FD4747; font-size: 140%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     LdBlackActionLookup blackActionLookup = new LdBlackActionLookup();
     *     blackActionLookup.setFooName("foo");
     *     if (...) {
     *         blackActionLookup.setFooPrice(123);
     *     } else {
     *         blackActionLookup.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//blackActionLookup.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     blackActionLookupList.add(blackActionLookup);
     * }
     * blackActionLookupBhv.<span style="color: #FD4747">batchUpdate</span>(blackActionLookupList);
     * </pre>
     * @param blackActionLookupList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<LdBlackActionLookup> blackActionLookupList) {
        UpdateOption<LdBlackActionLookupCB> option = createPlainUpdateOption();
        return doBatchUpdateNonstrict(blackActionLookupList, option);
    }

    protected int[] doBatchUpdateNonstrict(List<LdBlackActionLookup> blackActionLookupList, UpdateOption<LdBlackActionLookupCB> option) {
        assertObjectNotNull("blackActionLookupList", blackActionLookupList);
        prepareBatchUpdateOption(blackActionLookupList, option);
        return delegateBatchUpdateNonstrict(blackActionLookupList, option);
    }

    /**
     * Batch-update the entity list non-strictly specified-only. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span> 
     * blackActionLookupBhv.<span style="color: #FD4747">batchUpdateNonstrict</span>(blackActionLookupList, new SpecifyQuery<LdBlackActionLookupCB>() {
     *     public void specify(LdBlackActionLookupCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #FD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #FD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span> 
     * blackActionLookupBhv.<span style="color: #FD4747">batchUpdateNonstrict</span>(blackActionLookupList, new SpecifyQuery<LdBlackActionLookupCB>() {
     *     public void specify(LdBlackActionLookupCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #FD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).</p>
     * @param blackActionLookupList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<LdBlackActionLookup> blackActionLookupList, SpecifyQuery<LdBlackActionLookupCB> updateColumnSpec) {
        return doBatchUpdateNonstrict(blackActionLookupList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> option) {
        if (option == null) { return batchUpdateNonstrict(downcast(ls)); }
        else { return varyingBatchUpdateNonstrict(downcast(ls), downcast(option)); }
    }

    /**
     * Batch-delete the entity list. (ExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param blackActionLookupList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchDelete(List<LdBlackActionLookup> blackActionLookupList) {
        return doBatchDelete(blackActionLookupList, null);
    }

    protected int[] doBatchDelete(List<LdBlackActionLookup> blackActionLookupList, DeleteOption<LdBlackActionLookupCB> option) {
        assertObjectNotNull("blackActionLookupList", blackActionLookupList);
        prepareDeleteOption(option);
        return delegateBatchDelete(blackActionLookupList, option);
    }

    @Override
    protected int[] doLumpRemove(List<Entity> ls, DeleteOption<? extends ConditionBean> option) {
        if (option == null) { return batchDelete(downcast(ls)); }
        else { return varyingBatchDelete(downcast(ls), downcast(option)); }
    }

    /**
     * Batch-delete the entity list non-strictly. {NonExclusiveControl} <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param blackActionLookupList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDeleteNonstrict(List<LdBlackActionLookup> blackActionLookupList) {
        return doBatchDeleteNonstrict(blackActionLookupList, null);
    }

    protected int[] doBatchDeleteNonstrict(List<LdBlackActionLookup> blackActionLookupList, DeleteOption<LdBlackActionLookupCB> option) {
        assertObjectNotNull("blackActionLookupList", blackActionLookupList);
        prepareDeleteOption(option);
        return delegateBatchDeleteNonstrict(blackActionLookupList, option);
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
     * blackActionLookupBhv.<span style="color: #FD4747">queryInsert</span>(new QueryInsertSetupper&lt;LdBlackActionLookup, LdBlackActionLookupCB&gt;() {
     *     public ConditionBean setup(blackActionLookup entity, LdBlackActionLookupCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<LdBlackActionLookup, LdBlackActionLookupCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(QueryInsertSetupper<LdBlackActionLookup, LdBlackActionLookupCB> setupper, InsertOption<LdBlackActionLookupCB> option) {
        assertObjectNotNull("setupper", setupper);
        prepareInsertOption(option);
        LdBlackActionLookup entity = new LdBlackActionLookup();
        LdBlackActionLookupCB intoCB = createCBForQueryInsert();
        ConditionBean resourceCB = setupper.setup(entity, intoCB);
        return delegateQueryInsert(entity, intoCB, resourceCB, option);
    }

    protected LdBlackActionLookupCB createCBForQueryInsert() {
        LdBlackActionLookupCB cb = newMyConditionBean();
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
     * LdBlackActionLookup blackActionLookup = new LdBlackActionLookup();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//blackActionLookup.setPK...(value);</span>
     * blackActionLookup.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//blackActionLookup.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//blackActionLookup.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//blackActionLookup.setVersionNo(value);</span>
     * LdBlackActionLookupCB cb = new LdBlackActionLookupCB();
     * cb.query().setFoo...(value);
     * blackActionLookupBhv.<span style="color: #FD4747">queryUpdate</span>(blackActionLookup, cb);
     * </pre>
     * @param blackActionLookup The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of LdBlackActionLookup. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(LdBlackActionLookup blackActionLookup, LdBlackActionLookupCB cb) {
        return doQueryUpdate(blackActionLookup, cb, null);
    }

    protected int doQueryUpdate(LdBlackActionLookup blackActionLookup, LdBlackActionLookupCB cb, UpdateOption<LdBlackActionLookupCB> option) {
        assertObjectNotNull("blackActionLookup", blackActionLookup); assertCBStateValid(cb);
        prepareUpdateOption(option);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryUpdate(blackActionLookup, cb, option) : 0;
    }

    @Override
    protected int doRangeModify(Entity entity, ConditionBean cb, UpdateOption<? extends ConditionBean> option) {
        if (option == null) { return queryUpdate(downcast(entity), (LdBlackActionLookupCB)cb); }
        else { return varyingQueryUpdate(downcast(entity), (LdBlackActionLookupCB)cb, downcast(option)); }
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * LdBlackActionLookupCB cb = new LdBlackActionLookupCB();
     * cb.query().setFoo...(value);
     * blackActionLookupBhv.<span style="color: #FD4747">queryDelete</span>(blackActionLookup, cb);
     * </pre>
     * @param cb The condition-bean of LdBlackActionLookup. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(LdBlackActionLookupCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(LdBlackActionLookupCB cb, DeleteOption<LdBlackActionLookupCB> option) {
        assertCBStateValid(cb);
        prepareDeleteOption(option);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryDelete(cb, option) : 0;
    }

    @Override
    protected int doRangeRemove(ConditionBean cb, DeleteOption<? extends ConditionBean> option) {
        if (option == null) { return queryDelete((LdBlackActionLookupCB)cb); }
        else { return varyingQueryDelete((LdBlackActionLookupCB)cb, downcast(option)); }
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
     * LdBlackActionLookup blackActionLookup = new LdBlackActionLookup();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * blackActionLookup.setFoo...(value);
     * blackActionLookup.setBar...(value);
     * InsertOption<LdBlackActionLookupCB> option = new InsertOption<LdBlackActionLookupCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * blackActionLookupBhv.<span style="color: #FD4747">varyingInsert</span>(blackActionLookup, option);
     * ... = blackActionLookup.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param blackActionLookup The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(LdBlackActionLookup blackActionLookup, InsertOption<LdBlackActionLookupCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(blackActionLookup, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, ExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * LdBlackActionLookup blackActionLookup = new LdBlackActionLookup();
     * blackActionLookup.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * blackActionLookup.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * blackActionLookup.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;LdBlackActionLookupCB&gt; option = new UpdateOption&lt;LdBlackActionLookupCB&gt;();
     *     option.self(new SpecifyQuery&lt;LdBlackActionLookupCB&gt;() {
     *         public void specify(LdBlackActionLookupCB cb) {
     *             cb.specify().<span style="color: #FD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     blackActionLookupBhv.<span style="color: #FD4747">varyingUpdate</span>(blackActionLookup, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param blackActionLookup The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(LdBlackActionLookup blackActionLookup, UpdateOption<LdBlackActionLookupCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(blackActionLookup, option);
    }

    /**
     * Update the entity with varying requests non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as updateNonstrict(entity).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * LdBlackActionLookup blackActionLookup = new LdBlackActionLookup();
     * blackActionLookup.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * blackActionLookup.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//blackActionLookup.setVersionNo(value);</span>
     * UpdateOption&lt;LdBlackActionLookupCB&gt; option = new UpdateOption&lt;LdBlackActionLookupCB&gt;();
     * option.self(new SpecifyQuery&lt;LdBlackActionLookupCB&gt;() {
     *     public void specify(LdBlackActionLookupCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * blackActionLookupBhv.<span style="color: #FD4747">varyingUpdateNonstrict</span>(blackActionLookup, option);
     * </pre>
     * @param blackActionLookup The entity of update target. (NotNull, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdateNonstrict(LdBlackActionLookup blackActionLookup, UpdateOption<LdBlackActionLookupCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdateNonstrict(blackActionLookup, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param blackActionLookup The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(LdBlackActionLookup blackActionLookup, InsertOption<LdBlackActionLookupCB> insertOption, UpdateOption<LdBlackActionLookupCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdate(blackActionLookup, insertOption, updateOption);
    }

    /**
     * Insert or update the entity with varying requests non-strictly. (NonExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdateNonstrict(entity).
     * @param blackActionLookup The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdateNonstrict(LdBlackActionLookup blackActionLookup, InsertOption<LdBlackActionLookupCB> insertOption, UpdateOption<LdBlackActionLookupCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdateNonstrict(blackActionLookup, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, ExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param blackActionLookup The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(LdBlackActionLookup blackActionLookup, DeleteOption<LdBlackActionLookupCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(blackActionLookup, option);
    }

    /**
     * Delete the entity with varying requests non-strictly. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as deleteNonstrict(entity).
     * @param blackActionLookup The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDeleteNonstrict(LdBlackActionLookup blackActionLookup, DeleteOption<LdBlackActionLookupCB> option) {
        assertDeleteOptionNotNull(option);
        doDeleteNonstrict(blackActionLookup, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param blackActionLookupList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<LdBlackActionLookup> blackActionLookupList, InsertOption<LdBlackActionLookupCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(blackActionLookupList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param blackActionLookupList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<LdBlackActionLookup> blackActionLookupList, UpdateOption<LdBlackActionLookupCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(blackActionLookupList, option);
    }

    /**
     * Batch-update the list with varying requests non-strictly. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param blackActionLookupList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdateNonstrict(List<LdBlackActionLookup> blackActionLookupList, UpdateOption<LdBlackActionLookupCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdateNonstrict(blackActionLookupList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param blackActionLookupList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<LdBlackActionLookup> blackActionLookupList, DeleteOption<LdBlackActionLookupCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(blackActionLookupList, option);
    }

    /**
     * Batch-delete the list with varying requests non-strictly. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDeleteNonstrict(entityList).
     * @param blackActionLookupList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDeleteNonstrict(List<LdBlackActionLookup> blackActionLookupList, DeleteOption<LdBlackActionLookupCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDeleteNonstrict(blackActionLookupList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<LdBlackActionLookup, LdBlackActionLookupCB> setupper, InsertOption<LdBlackActionLookupCB> option) {
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
     * LdBlackActionLookup blackActionLookup = new LdBlackActionLookup();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//blackActionLookup.setPK...(value);</span>
     * blackActionLookup.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//blackActionLookup.setVersionNo(value);</span>
     * LdBlackActionLookupCB cb = new LdBlackActionLookupCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;LdBlackActionLookupCB&gt; option = new UpdateOption&lt;LdBlackActionLookupCB&gt;();
     * option.self(new SpecifyQuery&lt;LdBlackActionLookupCB&gt;() {
     *     public void specify(LdBlackActionLookupCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * blackActionLookupBhv.<span style="color: #FD4747">varyingQueryUpdate</span>(blackActionLookup, cb, option);
     * </pre>
     * @param blackActionLookup The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of LdBlackActionLookup. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(LdBlackActionLookup blackActionLookup, LdBlackActionLookupCB cb, UpdateOption<LdBlackActionLookupCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(blackActionLookup, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of LdBlackActionLookup. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(LdBlackActionLookupCB cb, DeleteOption<LdBlackActionLookupCB> option) {
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
    public OutsideSqlBasicExecutor<LdBlackActionLookupBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCountUniquely(LdBlackActionLookupCB cb) { return invoke(createSelectCountCBCommand(cb, true)); }
    protected int delegateSelectCountPlainly(LdBlackActionLookupCB cb) { return invoke(createSelectCountCBCommand(cb, false)); }
    protected <ENTITY extends LdBlackActionLookup> void delegateSelectCursor(LdBlackActionLookupCB cb, EntityRowHandler<ENTITY> erh, Class<ENTITY> et)
    { invoke(createSelectCursorCBCommand(cb, erh, et)); }
    protected <ENTITY extends LdBlackActionLookup> List<ENTITY> delegateSelectList(LdBlackActionLookupCB cb, Class<ENTITY> et)
    { return invoke(createSelectListCBCommand(cb, et)); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(LdBlackActionLookup e, InsertOption<LdBlackActionLookupCB> op)
    { if (!processBeforeInsert(e, op)) { return 0; }
      return invoke(createInsertEntityCommand(e, op)); }
    protected int delegateUpdate(LdBlackActionLookup e, UpdateOption<LdBlackActionLookupCB> op)
    { if (!processBeforeUpdate(e, op)) { return 0; }
      return invoke(createUpdateEntityCommand(e, op)); }
    protected int delegateUpdateNonstrict(LdBlackActionLookup e, UpdateOption<LdBlackActionLookupCB> op)
    { if (!processBeforeUpdate(e, op)) { return 0; }
      return invoke(createUpdateNonstrictEntityCommand(e, op)); }
    protected int delegateDelete(LdBlackActionLookup e, DeleteOption<LdBlackActionLookupCB> op)
    { if (!processBeforeDelete(e, op)) { return 0; }
      return invoke(createDeleteEntityCommand(e, op)); }
    protected int delegateDeleteNonstrict(LdBlackActionLookup e, DeleteOption<LdBlackActionLookupCB> op)
    { if (!processBeforeDelete(e, op)) { return 0; }
      return invoke(createDeleteNonstrictEntityCommand(e, op)); }

    protected int[] delegateBatchInsert(List<LdBlackActionLookup> ls, InsertOption<LdBlackActionLookupCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchInsertCommand(processBatchInternally(ls, op), op)); }
    protected int[] delegateBatchUpdate(List<LdBlackActionLookup> ls, UpdateOption<LdBlackActionLookupCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateCommand(processBatchInternally(ls, op, false), op)); }
    protected int[] delegateBatchUpdateNonstrict(List<LdBlackActionLookup> ls, UpdateOption<LdBlackActionLookupCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateNonstrictCommand(processBatchInternally(ls, op, true), op)); }
    protected int[] delegateBatchDelete(List<LdBlackActionLookup> ls, DeleteOption<LdBlackActionLookupCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteCommand(processBatchInternally(ls, op, false), op)); }
    protected int[] delegateBatchDeleteNonstrict(List<LdBlackActionLookup> ls, DeleteOption<LdBlackActionLookupCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteNonstrictCommand(processBatchInternally(ls, op, true), op)); }

    protected int delegateQueryInsert(LdBlackActionLookup e, LdBlackActionLookupCB inCB, ConditionBean resCB, InsertOption<LdBlackActionLookupCB> op)
    { if (!processBeforeQueryInsert(e, inCB, resCB, op)) { return 0; } return invoke(createQueryInsertCBCommand(e, inCB, resCB, op));  }
    protected int delegateQueryUpdate(LdBlackActionLookup e, LdBlackActionLookupCB cb, UpdateOption<LdBlackActionLookupCB> op)
    { if (!processBeforeQueryUpdate(e, cb, op)) { return 0; } return invoke(createQueryUpdateCBCommand(e, cb, op));  }
    protected int delegateQueryDelete(LdBlackActionLookupCB cb, DeleteOption<LdBlackActionLookupCB> op)
    { if (!processBeforeQueryDelete(cb, op)) { return 0; } return invoke(createQueryDeleteCBCommand(cb, op));  }

    // ===================================================================================
    //                                                                     Filter Override
    //                                                                     ===============
    @Override
    protected void filterEntityOfInsert(Entity targetEntity, InsertOption<? extends ConditionBean> option) {
        super.filterEntityOfInsert(targetEntity, option);
        LdBlackActionLookup entity = downcast(targetEntity);
        entity.setRUser(org.seasar.dbflute.AccessContext.getAccessUserOnThread());
        entity.setRTimestamp(org.seasar.dbflute.AccessContext.getAccessTimestampOnThread());
    }

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
    protected LdBlackActionLookup downcast(Entity entity) {
        return helpEntityDowncastInternally(entity, LdBlackActionLookup.class);
    }

    protected LdBlackActionLookupCB downcast(ConditionBean cb) {
        return helpConditionBeanDowncastInternally(cb, LdBlackActionLookupCB.class);
    }

    @SuppressWarnings("unchecked")
    protected List<LdBlackActionLookup> downcast(List<? extends Entity> entityList) {
        return (List<LdBlackActionLookup>)entityList;
    }

    @SuppressWarnings("unchecked")
    protected InsertOption<LdBlackActionLookupCB> downcast(InsertOption<? extends ConditionBean> option) {
        return (InsertOption<LdBlackActionLookupCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected UpdateOption<LdBlackActionLookupCB> downcast(UpdateOption<? extends ConditionBean> option) {
        return (UpdateOption<LdBlackActionLookupCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected DeleteOption<LdBlackActionLookupCB> downcast(DeleteOption<? extends ConditionBean> option) {
        return (DeleteOption<LdBlackActionLookupCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<LdBlackActionLookup, LdBlackActionLookupCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> option) {
        return (QueryInsertSetupper<LdBlackActionLookup, LdBlackActionLookupCB>)option;
    }
}
