/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */package com.example.dbflute.multipledb.seasar.dbflute.librarydb.bsbhv;

import java.util.List;

import org.seasar.dbflute.*;
import org.seasar.dbflute.bhv.*;
import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.exception.*;
import org.seasar.dbflute.optional.*;
import org.seasar.dbflute.outsidesql.executor.*;
import com.example.dbflute.multipledb.seasar.dbflute.librarydb.exbhv.*;
import com.example.dbflute.multipledb.seasar.dbflute.librarydb.exentity.*;
import com.example.dbflute.multipledb.seasar.dbflute.librarydb.bsentity.dbmeta.*;
import com.example.dbflute.multipledb.seasar.dbflute.librarydb.cbean.*;

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
     * int count = blackActionLookupBhv.<span style="color: #DD4747">selectCount</span>(cb);
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
     * Select the entity by the condition-bean. #beforejava8 <br />
     * <span style="color: #AD4747; font-size: 120%">The return might be null if no data, so you should have null check.</span> <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, use selectEntityWithDeletedCheck().</span>
     * <pre>
     * LdBlackActionLookupCB cb = new LdBlackActionLookupCB();
     * cb.query().setFoo...(value);
     * LdBlackActionLookup blackActionLookup = blackActionLookupBhv.<span style="color: #DD4747">selectEntity</span>(cb);
     * if (blackActionLookup != null) { <span style="color: #3F7E5E">// null check</span>
     *     ... = blackActionLookup.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of LdBlackActionLookup. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public LdBlackActionLookup selectEntity(LdBlackActionLookupCB cb) {
        return doSelectEntity(cb, LdBlackActionLookup.class);
    }

    protected <ENTITY extends LdBlackActionLookup> ENTITY doSelectEntity(LdBlackActionLookupCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectEntityInternally(cb, tp, new InternalSelectEntityCallback<ENTITY, LdBlackActionLookupCB>() {
            public List<ENTITY> callbackSelectList(LdBlackActionLookupCB lcb, Class<ENTITY> ltp) { return doSelectList(lcb, ltp); } });
    }

    protected <ENTITY extends LdBlackActionLookup> OptionalEntity<ENTITY> doSelectOptionalEntity(LdBlackActionLookupCB cb, Class<ENTITY> tp) {
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
     * LdBlackActionLookupCB cb = new LdBlackActionLookupCB();
     * cb.query().setFoo...(value);
     * LdBlackActionLookup blackActionLookup = blackActionLookupBhv.<span style="color: #DD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = blackActionLookup.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of LdBlackActionLookup. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (point is not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public LdBlackActionLookup selectEntityWithDeletedCheck(LdBlackActionLookupCB cb) {
        return doSelectEntityWithDeletedCheck(cb, LdBlackActionLookup.class);
    }

    protected <ENTITY extends LdBlackActionLookup> ENTITY doSelectEntityWithDeletedCheck(LdBlackActionLookupCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectEntityWithDeletedCheckInternally(cb, tp, new InternalSelectEntityWithDeletedCheckCallback<ENTITY, LdBlackActionLookupCB>() {
            public List<ENTITY> callbackSelectList(LdBlackActionLookupCB lcb, Class<ENTITY> ltp) { return doSelectList(lcb, ltp); } });
    }

    @Override
    protected Entity doReadEntityWithDeletedCheck(ConditionBean cb) {
        return selectEntityWithDeletedCheck(downcast(cb));
    }

    /**
     * Select the entity by the primary-key value.
     * @param blackActionCode The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
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
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
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
     * ListResultBean&lt;LdBlackActionLookup&gt; blackActionLookupList = blackActionLookupBhv.<span style="color: #DD4747">selectList</span>(cb);
     * for (LdBlackActionLookup blackActionLookup : blackActionLookupList) {
     *     ... = blackActionLookup.get...();
     * }
     * </pre>
     * @param cb The condition-bean of LdBlackActionLookup. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<LdBlackActionLookup> selectList(LdBlackActionLookupCB cb) {
        return doSelectList(cb, LdBlackActionLookup.class);
    }

    protected <ENTITY extends LdBlackActionLookup> ListResultBean<ENTITY> doSelectList(LdBlackActionLookupCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        return helpSelectListInternally(cb, tp, new InternalSelectListCallback<ENTITY, LdBlackActionLookupCB>() {
            public List<ENTITY> callbackSelectList(LdBlackActionLookupCB lcb, Class<ENTITY> ltp) { return delegateSelectList(lcb, ltp); } });
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
     * cb.<span style="color: #DD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;LdBlackActionLookup&gt; page = blackActionLookupBhv.<span style="color: #DD4747">selectPage</span>(cb);
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
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<LdBlackActionLookup> selectPage(LdBlackActionLookupCB cb) {
        return doSelectPage(cb, LdBlackActionLookup.class);
    }

    protected <ENTITY extends LdBlackActionLookup> PagingResultBean<ENTITY> doSelectPage(LdBlackActionLookupCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectPageInternally(cb, tp, new InternalSelectPageCallback<ENTITY, LdBlackActionLookupCB>() {
            public int callbackSelectCount(LdBlackActionLookupCB cb) { return doSelectCountPlainly(cb); }
            public List<ENTITY> callbackSelectList(LdBlackActionLookupCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); }
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
     * blackActionLookupBhv.<span style="color: #DD4747">selectCursor</span>(cb, new EntityRowHandler&lt;LdBlackActionLookup&gt;() {
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

    protected <ENTITY extends LdBlackActionLookup> void doSelectCursor(LdBlackActionLookupCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler", handler); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        helpSelectCursorInternally(cb, handler, tp, new InternalSelectCursorCallback<ENTITY, LdBlackActionLookupCB>() {
            public void callbackSelectCursor(LdBlackActionLookupCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) { delegateSelectCursor(cb, handler, tp); }
            public List<ENTITY> callbackSelectList(LdBlackActionLookupCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); }
        });
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * blackActionLookupBhv.<span style="color: #DD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(LdBlackActionLookupCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
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

    protected <RESULT, CB extends LdBlackActionLookupCB> SLFunction<CB, RESULT> doScalarSelect(Class<RESULT> tp, CB cb) {
        assertObjectNotNull("resultType", tp); assertCBStateValid(cb);
        cb.xsetupForScalarSelect(); cb.getSqlClause().disableSelectIndex(); // for when you use union
        return createSLFunction(cb, tp);
    }

    protected <RESULT, CB extends LdBlackActionLookupCB> SLFunction<CB, RESULT> createSLFunction(CB cb, Class<RESULT> tp) {
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
     * Load referrer of blackActionList by the set-upper of referrer. <br />
     * BLACK_ACTION by BLACK_ACTION_CODE, named 'blackActionList'.
     * <pre>
     * blackActionLookupBhv.<span style="color: #DD4747">loadBlackActionList</span>(blackActionLookupList, new ConditionBeanSetupper&lt;LdBlackActionCB&gt;() {
     *     public void setup(LdBlackActionCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...();
     *     }
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedList(referrerList -&gt {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * for (LdBlackActionLookup blackActionLookup : blackActionLookupList) {
     *     ... = blackActionLookup.<span style="color: #DD4747">getBlackActionList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setBlackActionCode_InScope(pkList);
     * cb.query().addOrderBy_BlackActionCode_Asc();
     * </pre>
     * @param blackActionLookupList The entity list of blackActionLookup. (NotNull)
     * @param setupper The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoader<LdBlackAction> loadBlackActionList(List<LdBlackActionLookup> blackActionLookupList, ConditionBeanSetupper<LdBlackActionCB> setupper) {
        xassLRArg(blackActionLookupList, setupper);
        return doLoadBlackActionList(blackActionLookupList, new LoadReferrerOption<LdBlackActionCB, LdBlackAction>().xinit(setupper));
    }

    /**
     * Load referrer of blackActionList by the set-upper of referrer. <br />
     * BLACK_ACTION by BLACK_ACTION_CODE, named 'blackActionList'.
     * <pre>
     * blackActionLookupBhv.<span style="color: #DD4747">loadBlackActionList</span>(blackActionLookupList, new ConditionBeanSetupper&lt;LdBlackActionCB&gt;() {
     *     public void setup(LdBlackActionCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...();
     *     }
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedList(referrerList -&gt {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = blackActionLookup.<span style="color: #DD4747">getBlackActionList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setBlackActionCode_InScope(pkList);
     * cb.query().addOrderBy_BlackActionCode_Asc();
     * </pre>
     * @param blackActionLookup The entity of blackActionLookup. (NotNull)
     * @param setupper The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoader<LdBlackAction> loadBlackActionList(LdBlackActionLookup blackActionLookup, ConditionBeanSetupper<LdBlackActionCB> setupper) {
        xassLRArg(blackActionLookup, setupper);
        return doLoadBlackActionList(xnewLRLs(blackActionLookup), new LoadReferrerOption<LdBlackActionCB, LdBlackAction>().xinit(setupper));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param blackActionLookup The entity of blackActionLookup. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoader<LdBlackAction> loadBlackActionList(LdBlackActionLookup blackActionLookup, LoadReferrerOption<LdBlackActionCB, LdBlackAction> loadReferrerOption) {
        xassLRArg(blackActionLookup, loadReferrerOption);
        return loadBlackActionList(xnewLRLs(blackActionLookup), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean setupper.} #beforejava8
     * @param blackActionLookupList The entity list of blackActionLookup. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerLoader<LdBlackAction> loadBlackActionList(List<LdBlackActionLookup> blackActionLookupList, LoadReferrerOption<LdBlackActionCB, LdBlackAction> loadReferrerOption) {
        xassLRArg(blackActionLookupList, loadReferrerOption);
        if (blackActionLookupList.isEmpty()) { return (NestedReferrerLoader<LdBlackAction>)EMPTY_LOADER; }
        return doLoadBlackActionList(blackActionLookupList, loadReferrerOption);
    }

    protected NestedReferrerLoader<LdBlackAction> doLoadBlackActionList(List<LdBlackActionLookup> blackActionLookupList, LoadReferrerOption<LdBlackActionCB, LdBlackAction> option) {
        final LdBlackActionBhv referrerBhv = xgetBSFLR().select(LdBlackActionBhv.class);
        return helpLoadReferrerInternally(blackActionLookupList, option, new InternalLoadReferrerCallback<LdBlackActionLookup, String, LdBlackActionCB, LdBlackAction>() {
            public String getPKVal(LdBlackActionLookup et)
            { return et.getBlackActionCode(); }
            public void setRfLs(LdBlackActionLookup et, List<LdBlackAction> ls)
            { et.setBlackActionList(ls); }
            public LdBlackActionCB newMyCB() { return referrerBhv.newMyConditionBean(); }
            public void qyFKIn(LdBlackActionCB cb, List<String> ls)
            { cb.query().setBlackActionCode_InScope(ls); }
            public void qyOdFKAsc(LdBlackActionCB cb) { cb.query().addOrderBy_BlackActionCode_Asc(); }
            public void spFKCol(LdBlackActionCB cb) { cb.specify().columnBlackActionCode(); }
            public List<LdBlackAction> selRfLs(LdBlackActionCB cb) { return referrerBhv.selectList(cb); }
            public String getFKVal(LdBlackAction re) { return re.getBlackActionCode(); }
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
            public String getCV(LdBlackActionLookup et) { return et.getBlackActionCode(); }
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
     * blackActionLookupBhv.<span style="color: #DD4747">insert</span>(blackActionLookup);
     * ... = blackActionLookup.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param blackActionLookup The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(LdBlackActionLookup blackActionLookup) {
        doInsert(blackActionLookup, null);
    }

    protected void doInsert(LdBlackActionLookup blackActionLookup, InsertOption<LdBlackActionLookupCB> op) {
        assertObjectNotNull("blackActionLookup", blackActionLookup);
        prepareInsertOption(op);
        delegateInsert(blackActionLookup, op);
    }

    protected void prepareInsertOption(InsertOption<LdBlackActionLookupCB> op) {
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
     * LdBlackActionLookup blackActionLookup = new LdBlackActionLookup();
     * blackActionLookup.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * blackActionLookup.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//blackActionLookup.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//blackActionLookup.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * blackActionLookup.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     blackActionLookupBhv.<span style="color: #DD4747">update</span>(blackActionLookup);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param blackActionLookup The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(final LdBlackActionLookup blackActionLookup) {
        doUpdate(blackActionLookup, null);
    }

    protected void doUpdate(LdBlackActionLookup blackActionLookup, final UpdateOption<LdBlackActionLookupCB> op) {
        assertObjectNotNull("blackActionLookup", blackActionLookup);
        prepareUpdateOption(op);
        helpUpdateInternally(blackActionLookup, new InternalUpdateCallback<LdBlackActionLookup>() {
            public int callbackDelegateUpdate(LdBlackActionLookup et) { return delegateUpdate(et, op); } });
    }

    protected void prepareUpdateOption(UpdateOption<LdBlackActionLookupCB> op) {
        if (op == null) { return; }
        assertUpdateOptionStatus(op);
        if (op.hasSelfSpecification()) {
            op.resolveSelfSpecification(createCBForVaryingUpdate());
        }
        if (op.hasSpecifiedUpdateColumn()) {
            op.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate());
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
    protected void doModify(Entity et, UpdateOption<? extends ConditionBean> op) {
        if (op == null) { update(downcast(et)); }
        else { varyingUpdate(downcast(et), downcast(op)); }
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
     * blackActionLookupBhv.<span style="color: #DD4747">updateNonstrict</span>(blackActionLookup);
     * </pre>
     * @param blackActionLookup The entity of update target. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void updateNonstrict(final LdBlackActionLookup blackActionLookup) {
        doUpdateNonstrict(blackActionLookup, null);
    }

    protected void doUpdateNonstrict(LdBlackActionLookup blackActionLookup, final UpdateOption<LdBlackActionLookupCB> op) {
        assertObjectNotNull("blackActionLookup", blackActionLookup);
        prepareUpdateOption(op);
        helpUpdateNonstrictInternally(blackActionLookup, new InternalUpdateNonstrictCallback<LdBlackActionLookup>() {
            public int callbackDelegateUpdateNonstrict(LdBlackActionLookup et) { return delegateUpdateNonstrict(et, op); } });
    }

    @Override
    protected void doModifyNonstrict(Entity et, UpdateOption<? extends ConditionBean> op) {
        if (op == null) { updateNonstrict(downcast(et)); }
        else { varyingUpdateNonstrict(downcast(et), downcast(op)); }
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, ExclusiveControl) <br />
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br />
     * <p><span style="color: #DD4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param blackActionLookup The entity of insert or update target. (NotNull)
     * @exception EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(LdBlackActionLookup blackActionLookup) {
        doInesrtOrUpdate(blackActionLookup, null, null);
    }

    protected void doInesrtOrUpdate(LdBlackActionLookup blackActionLookup, final InsertOption<LdBlackActionLookupCB> iop, final UpdateOption<LdBlackActionLookupCB> uop) {
        helpInsertOrUpdateInternally(blackActionLookup, new InternalInsertOrUpdateCallback<LdBlackActionLookup, LdBlackActionLookupCB>() {
            public void callbackInsert(LdBlackActionLookup et) { doInsert(et, iop); }
            public void callbackUpdate(LdBlackActionLookup et) { doUpdate(et, uop); }
            public LdBlackActionLookupCB callbackNewMyConditionBean() { return newMyConditionBean(); }
            public int callbackSelectCount(LdBlackActionLookupCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrModify(Entity et, InsertOption<? extends ConditionBean> iop, UpdateOption<? extends ConditionBean> uop) {
        if (iop == null && uop == null) { insertOrUpdate(downcast(et)); }
        else {
            iop = iop != null ? iop : new InsertOption<LdBlackActionLookupCB>();
            uop = uop != null ? uop : new UpdateOption<LdBlackActionLookupCB>();
            varyingInsertOrUpdate(downcast(et), downcast(iop), downcast(uop));
        }
    }

    /**
     * Insert or update the entity non-strictly modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br />
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() }
     * <p><span style="color: #DD4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param blackActionLookup The entity of insert or update target. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdateNonstrict(LdBlackActionLookup blackActionLookup) {
        doInesrtOrUpdateNonstrict(blackActionLookup, null, null);
    }

    protected void doInesrtOrUpdateNonstrict(LdBlackActionLookup blackActionLookup, final InsertOption<LdBlackActionLookupCB> iop, final UpdateOption<LdBlackActionLookupCB> uop) {
        helpInsertOrUpdateInternally(blackActionLookup, new InternalInsertOrUpdateNonstrictCallback<LdBlackActionLookup>() {
            public void callbackInsert(LdBlackActionLookup et) { doInsert(et, iop); }
            public void callbackUpdateNonstrict(LdBlackActionLookup et) { doUpdateNonstrict(et, uop); }
        });
    }

    @Override
    protected void doCreateOrModifyNonstrict(Entity et, InsertOption<? extends ConditionBean> iop, UpdateOption<? extends ConditionBean> uop) {
        if (iop == null && uop == null) { insertOrUpdateNonstrict(downcast(et)); }
        else {
            iop = iop != null ? iop : new InsertOption<LdBlackActionLookupCB>();
            uop = uop != null ? uop : new UpdateOption<LdBlackActionLookupCB>();
            varyingInsertOrUpdateNonstrict(downcast(et), downcast(iop), downcast(uop));
        }
    }

    /**
     * Delete the entity. (ZeroUpdateException, ExclusiveControl)
     * <pre>
     * LdBlackActionLookup blackActionLookup = new LdBlackActionLookup();
     * blackActionLookup.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * blackActionLookup.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     blackActionLookupBhv.<span style="color: #DD4747">delete</span>(blackActionLookup);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param blackActionLookup The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(LdBlackActionLookup blackActionLookup) {
        doDelete(blackActionLookup, null);
    }

    protected void doDelete(LdBlackActionLookup blackActionLookup, final DeleteOption<LdBlackActionLookupCB> op) {
        assertObjectNotNull("blackActionLookup", blackActionLookup);
        prepareDeleteOption(op);
        helpDeleteInternally(blackActionLookup, new InternalDeleteCallback<LdBlackActionLookup>() {
            public int callbackDelegateDelete(LdBlackActionLookup et) { return delegateDelete(et, op); } });
    }

    protected void prepareDeleteOption(DeleteOption<LdBlackActionLookupCB> op) {
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
     * LdBlackActionLookup blackActionLookup = new LdBlackActionLookup();
     * blackActionLookup.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//blackActionLookup.setVersionNo(value);</span>
     * blackActionLookupBhv.<span style="color: #DD4747">deleteNonstrict</span>(blackActionLookup);
     * </pre>
     * @param blackActionLookup The entity of delete target. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrict(LdBlackActionLookup blackActionLookup) {
        doDeleteNonstrict(blackActionLookup, null);
    }

    protected void doDeleteNonstrict(LdBlackActionLookup blackActionLookup, final DeleteOption<LdBlackActionLookupCB> op) {
        assertObjectNotNull("blackActionLookup", blackActionLookup);
        prepareDeleteOption(op);
        helpDeleteNonstrictInternally(blackActionLookup, new InternalDeleteNonstrictCallback<LdBlackActionLookup>() {
            public int callbackDelegateDeleteNonstrict(LdBlackActionLookup et) { return delegateDeleteNonstrict(et, op); } });
    }

    /**
     * Delete the entity non-strictly ignoring deleted. {ZeroUpdateException, NonExclusiveControl}
     * <pre>
     * LdBlackActionLookup blackActionLookup = new LdBlackActionLookup();
     * blackActionLookup.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//blackActionLookup.setVersionNo(value);</span>
     * blackActionLookupBhv.<span style="color: #DD4747">deleteNonstrictIgnoreDeleted</span>(blackActionLookup);
     * <span style="color: #3F7E5E">// if the target entity doesn't exist, no exception</span>
     * </pre>
     * @param blackActionLookup The entity of delete target. (NotNull, PrimaryKeyNotNull)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrictIgnoreDeleted(LdBlackActionLookup blackActionLookup) {
        doDeleteNonstrictIgnoreDeleted(blackActionLookup, null);
    }

    protected void doDeleteNonstrictIgnoreDeleted(LdBlackActionLookup blackActionLookup, final DeleteOption<LdBlackActionLookupCB> op) {
        assertObjectNotNull("blackActionLookup", blackActionLookup);
        prepareDeleteOption(op);
        helpDeleteNonstrictIgnoreDeletedInternally(blackActionLookup, new InternalDeleteNonstrictIgnoreDeletedCallback<LdBlackActionLookup>() {
            public int callbackDelegateDeleteNonstrict(LdBlackActionLookup et) { return delegateDeleteNonstrict(et, op); } });
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
     * <p><span style="color: #DD4747; font-size: 120%">The columns of least common multiple are registered like this:</span></p>
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
     * blackActionLookupBhv.<span style="color: #DD4747">batchInsert</span>(blackActionLookupList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param blackActionLookupList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<LdBlackActionLookup> blackActionLookupList) {
        InsertOption<LdBlackActionLookupCB> op = createInsertUpdateOption();
        return doBatchInsert(blackActionLookupList, op);
    }

    protected int[] doBatchInsert(List<LdBlackActionLookup> blackActionLookupList, InsertOption<LdBlackActionLookupCB> op) {
        assertObjectNotNull("blackActionLookupList", blackActionLookupList);
        prepareBatchInsertOption(blackActionLookupList, op);
        return delegateBatchInsert(blackActionLookupList, op);
    }

    protected void prepareBatchInsertOption(List<LdBlackActionLookup> blackActionLookupList, InsertOption<LdBlackActionLookupCB> op) {
        op.xallowInsertColumnModifiedPropertiesFragmented();
        op.xacceptInsertColumnModifiedPropertiesIfNeeds(blackActionLookupList);
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
     * <span style="color: #DD4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
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
     * blackActionLookupBhv.<span style="color: #DD4747">batchUpdate</span>(blackActionLookupList);
     * </pre>
     * @param blackActionLookupList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<LdBlackActionLookup> blackActionLookupList) {
        UpdateOption<LdBlackActionLookupCB> op = createPlainUpdateOption();
        return doBatchUpdate(blackActionLookupList, op);
    }

    protected int[] doBatchUpdate(List<LdBlackActionLookup> blackActionLookupList, UpdateOption<LdBlackActionLookupCB> op) {
        assertObjectNotNull("blackActionLookupList", blackActionLookupList);
        prepareBatchUpdateOption(blackActionLookupList, op);
        return delegateBatchUpdate(blackActionLookupList, op);
    }

    protected void prepareBatchUpdateOption(List<LdBlackActionLookup> blackActionLookupList, UpdateOption<LdBlackActionLookupCB> op) {
        op.xacceptUpdateColumnModifiedPropertiesIfNeeds(blackActionLookupList);
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
     * blackActionLookupBhv.<span style="color: #DD4747">batchUpdate</span>(blackActionLookupList, new SpecifyQuery<LdBlackActionLookupCB>() {
     *     public void specify(LdBlackActionLookupCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #DD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #DD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * blackActionLookupBhv.<span style="color: #DD4747">batchUpdate</span>(blackActionLookupList, new SpecifyQuery<LdBlackActionLookupCB>() {
     *     public void specify(LdBlackActionLookupCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #DD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
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
     * @exception BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<LdBlackActionLookup> blackActionLookupList, SpecifyQuery<LdBlackActionLookupCB> updateColumnSpec) {
        return doBatchUpdate(blackActionLookupList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    /**
     * Batch-update the entity list non-strictly modified-only of same-set columns. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <span style="color: #DD4747; font-size: 140%">You should specify same-set columns to all entities like this:</span>
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
     * blackActionLookupBhv.<span style="color: #DD4747">batchUpdate</span>(blackActionLookupList);
     * </pre>
     * @param blackActionLookupList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<LdBlackActionLookup> blackActionLookupList) {
        UpdateOption<LdBlackActionLookupCB> option = createPlainUpdateOption();
        return doBatchUpdateNonstrict(blackActionLookupList, option);
    }

    protected int[] doBatchUpdateNonstrict(List<LdBlackActionLookup> blackActionLookupList, UpdateOption<LdBlackActionLookupCB> op) {
        assertObjectNotNull("blackActionLookupList", blackActionLookupList);
        prepareBatchUpdateOption(blackActionLookupList, op);
        return delegateBatchUpdateNonstrict(blackActionLookupList, op);
    }

    /**
     * Batch-update the entity list non-strictly specified-only. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * blackActionLookupBhv.<span style="color: #DD4747">batchUpdateNonstrict</span>(blackActionLookupList, new SpecifyQuery<LdBlackActionLookupCB>() {
     *     public void specify(LdBlackActionLookupCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #DD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #DD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * blackActionLookupBhv.<span style="color: #DD4747">batchUpdateNonstrict</span>(blackActionLookupList, new SpecifyQuery<LdBlackActionLookupCB>() {
     *     public void specify(LdBlackActionLookupCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #DD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
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
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<LdBlackActionLookup> blackActionLookupList, SpecifyQuery<LdBlackActionLookupCB> updateColumnSpec) {
        return doBatchUpdateNonstrict(blackActionLookupList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> op) {
        if (op == null) { return batchUpdateNonstrict(downcast(ls)); }
        else { return varyingBatchUpdateNonstrict(downcast(ls), downcast(op)); }
    }

    /**
     * Batch-delete the entity list. (ExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param blackActionLookupList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchDelete(List<LdBlackActionLookup> blackActionLookupList) {
        return doBatchDelete(blackActionLookupList, null);
    }

    protected int[] doBatchDelete(List<LdBlackActionLookup> blackActionLookupList, DeleteOption<LdBlackActionLookupCB> op) {
        assertObjectNotNull("blackActionLookupList", blackActionLookupList);
        prepareDeleteOption(op);
        return delegateBatchDelete(blackActionLookupList, op);
    }

    @Override
    protected int[] doLumpRemove(List<Entity> ls, DeleteOption<? extends ConditionBean> op) {
        if (op == null) { return batchDelete(downcast(ls)); }
        else { return varyingBatchDelete(downcast(ls), downcast(op)); }
    }

    /**
     * Batch-delete the entity list non-strictly. {NonExclusiveControl} <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param blackActionLookupList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDeleteNonstrict(List<LdBlackActionLookup> blackActionLookupList) {
        return doBatchDeleteNonstrict(blackActionLookupList, null);
    }

    protected int[] doBatchDeleteNonstrict(List<LdBlackActionLookup> blackActionLookupList, DeleteOption<LdBlackActionLookupCB> op) {
        assertObjectNotNull("blackActionLookupList", blackActionLookupList);
        prepareDeleteOption(op);
        return delegateBatchDeleteNonstrict(blackActionLookupList, op);
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
     * blackActionLookupBhv.<span style="color: #DD4747">queryInsert</span>(new QueryInsertSetupper&lt;LdBlackActionLookup, LdBlackActionLookupCB&gt;() {
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

    protected int doQueryInsert(QueryInsertSetupper<LdBlackActionLookup, LdBlackActionLookupCB> sp, InsertOption<LdBlackActionLookupCB> op) {
        assertObjectNotNull("setupper", sp);
        prepareInsertOption(op);
        LdBlackActionLookup e = new LdBlackActionLookup();
        LdBlackActionLookupCB cb = createCBForQueryInsert();
        return delegateQueryInsert(e, cb, sp.setup(e, cb), op);
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
     * blackActionLookupBhv.<span style="color: #DD4747">queryUpdate</span>(blackActionLookup, cb);
     * </pre>
     * @param blackActionLookup The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of LdBlackActionLookup. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(LdBlackActionLookup blackActionLookup, LdBlackActionLookupCB cb) {
        return doQueryUpdate(blackActionLookup, cb, null);
    }

    protected int doQueryUpdate(LdBlackActionLookup blackActionLookup, LdBlackActionLookupCB cb, UpdateOption<LdBlackActionLookupCB> op) {
        assertObjectNotNull("blackActionLookup", blackActionLookup); assertCBStateValid(cb);
        prepareUpdateOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryUpdate(blackActionLookup, cb, op) : 0;
    }

    @Override
    protected int doRangeModify(Entity et, ConditionBean cb, UpdateOption<? extends ConditionBean> op) {
        if (op == null) { return queryUpdate(downcast(et), (LdBlackActionLookupCB)cb); }
        else { return varyingQueryUpdate(downcast(et), (LdBlackActionLookupCB)cb, downcast(op)); }
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * LdBlackActionLookupCB cb = new LdBlackActionLookupCB();
     * cb.query().setFoo...(value);
     * blackActionLookupBhv.<span style="color: #DD4747">queryDelete</span>(blackActionLookup, cb);
     * </pre>
     * @param cb The condition-bean of LdBlackActionLookup. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(LdBlackActionLookupCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(LdBlackActionLookupCB cb, DeleteOption<LdBlackActionLookupCB> op) {
        assertCBStateValid(cb);
        prepareDeleteOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryDelete(cb, op) : 0;
    }

    @Override
    protected int doRangeRemove(ConditionBean cb, DeleteOption<? extends ConditionBean> op) {
        if (op == null) { return queryDelete((LdBlackActionLookupCB)cb); }
        else { return varyingQueryDelete((LdBlackActionLookupCB)cb, downcast(op)); }
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
     * blackActionLookupBhv.<span style="color: #DD4747">varyingInsert</span>(blackActionLookup, option);
     * ... = blackActionLookup.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param blackActionLookup The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
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
     * blackActionLookup.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;LdBlackActionLookupCB&gt; option = new UpdateOption&lt;LdBlackActionLookupCB&gt;();
     *     option.self(new SpecifyQuery&lt;LdBlackActionLookupCB&gt;() {
     *         public void specify(LdBlackActionLookupCB cb) {
     *             cb.specify().<span style="color: #DD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     blackActionLookupBhv.<span style="color: #DD4747">varyingUpdate</span>(blackActionLookup, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param blackActionLookup The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
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
     *         cb.specify().<span style="color: #DD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * blackActionLookupBhv.<span style="color: #DD4747">varyingUpdateNonstrict</span>(blackActionLookup, option);
     * </pre>
     * @param blackActionLookup The entity of update target. (NotNull, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
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
     * @exception EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
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
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
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
     * @exception EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception EntityDuplicatedException When the entity has been duplicated.
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
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
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
     *         cb.specify().<span style="color: #DD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * blackActionLookupBhv.<span style="color: #DD4747">varyingQueryUpdate</span>(blackActionLookup, cb, option);
     * </pre>
     * @param blackActionLookup The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of LdBlackActionLookup. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
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
     * @exception NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
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
    protected <ENTITY extends LdBlackActionLookup> void delegateSelectCursor(LdBlackActionLookupCB cb, EntityRowHandler<ENTITY> rh, Class<ENTITY> tp)
    { invoke(createSelectCursorCBCommand(cb, rh, tp)); }
    protected <ENTITY extends LdBlackActionLookup> List<ENTITY> delegateSelectList(LdBlackActionLookupCB cb, Class<ENTITY> tp)
    { return invoke(createSelectListCBCommand(cb, tp)); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(LdBlackActionLookup et, InsertOption<LdBlackActionLookupCB> op)
    { if (!processBeforeInsert(et, op)) { return 0; }
      return invoke(createInsertEntityCommand(et, op)); }
    protected int delegateUpdate(LdBlackActionLookup et, UpdateOption<LdBlackActionLookupCB> op)
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return invoke(createUpdateEntityCommand(et, op)); }
    protected int delegateUpdateNonstrict(LdBlackActionLookup et, UpdateOption<LdBlackActionLookupCB> op)
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return invoke(createUpdateNonstrictEntityCommand(et, op)); }
    protected int delegateDelete(LdBlackActionLookup et, DeleteOption<LdBlackActionLookupCB> op)
    { if (!processBeforeDelete(et, op)) { return 0; }
      return invoke(createDeleteEntityCommand(et, op)); }
    protected int delegateDeleteNonstrict(LdBlackActionLookup et, DeleteOption<LdBlackActionLookupCB> op)
    { if (!processBeforeDelete(et, op)) { return 0; }
      return invoke(createDeleteNonstrictEntityCommand(et, op)); }

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

    protected int delegateQueryInsert(LdBlackActionLookup et, LdBlackActionLookupCB inCB, ConditionBean resCB, InsertOption<LdBlackActionLookupCB> op)
    { if (!processBeforeQueryInsert(et, inCB, resCB, op)) { return 0; } return invoke(createQueryInsertCBCommand(et, inCB, resCB, op));  }
    protected int delegateQueryUpdate(LdBlackActionLookup et, LdBlackActionLookupCB cb, UpdateOption<LdBlackActionLookupCB> op)
    { if (!processBeforeQueryUpdate(et, cb, op)) { return 0; } return invoke(createQueryUpdateCBCommand(et, cb, op));  }
    protected int delegateQueryDelete(LdBlackActionLookupCB cb, DeleteOption<LdBlackActionLookupCB> op)
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
    protected LdBlackActionLookup downcast(Entity et) {
        return helpEntityDowncastInternally(et, LdBlackActionLookup.class);
    }

    protected LdBlackActionLookupCB downcast(ConditionBean cb) {
        return helpConditionBeanDowncastInternally(cb, LdBlackActionLookupCB.class);
    }

    @SuppressWarnings("unchecked")
    protected List<LdBlackActionLookup> downcast(List<? extends Entity> ls) {
        return (List<LdBlackActionLookup>)ls;
    }

    @SuppressWarnings("unchecked")
    protected InsertOption<LdBlackActionLookupCB> downcast(InsertOption<? extends ConditionBean> op) {
        return (InsertOption<LdBlackActionLookupCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected UpdateOption<LdBlackActionLookupCB> downcast(UpdateOption<? extends ConditionBean> op) {
        return (UpdateOption<LdBlackActionLookupCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected DeleteOption<LdBlackActionLookupCB> downcast(DeleteOption<? extends ConditionBean> op) {
        return (DeleteOption<LdBlackActionLookupCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<LdBlackActionLookup, LdBlackActionLookupCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> sp) {
        return (QueryInsertSetupper<LdBlackActionLookup, LdBlackActionLookupCB>)sp;
    }
}
