/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */package com.example.dbflute.multipledb.spring.dbflute.librarydb.bsbhv;

import java.util.List;

import org.seasar.dbflute.*;
import org.seasar.dbflute.bhv.*;
import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.exception.*;
import org.seasar.dbflute.optional.*;
import org.seasar.dbflute.outsidesql.executor.*;
import com.example.dbflute.multipledb.spring.dbflute.librarydb.exbhv.*;
import com.example.dbflute.multipledb.spring.dbflute.librarydb.exentity.*;
import com.example.dbflute.multipledb.spring.dbflute.librarydb.bsentity.dbmeta.*;
import com.example.dbflute.multipledb.spring.dbflute.librarydb.cbean.*;

/**
 * The behavior of VENDOR_CONSTRAINT_NAME_AUTO_FOO as TABLE. <br />
 * <pre>
 * [primary key]
 *     CONSTRAINT_NAME_AUTO_FOO_ID
 *
 * [column]
 *     CONSTRAINT_NAME_AUTO_FOO_ID, CONSTRAINT_NAME_AUTO_FOO_NAME
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
 *     VENDOR_CONSTRAINT_NAME_AUTO_REF
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     vendorConstraintNameAutoRefList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class LdBsVendorConstraintNameAutoFooBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "VENDOR_CONSTRAINT_NAME_AUTO_FOO"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public DBMeta getDBMeta() { return LdVendorConstraintNameAutoFooDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public LdVendorConstraintNameAutoFooDbm getMyDBMeta() { return LdVendorConstraintNameAutoFooDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public Entity newEntity() { return newMyEntity(); }

    /** {@inheritDoc} */
    public ConditionBean newConditionBean() { return newMyConditionBean(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public LdVendorConstraintNameAutoFoo newMyEntity() { return new LdVendorConstraintNameAutoFoo(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public LdVendorConstraintNameAutoFooCB newMyConditionBean() { return new LdVendorConstraintNameAutoFooCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * LdVendorConstraintNameAutoFooCB cb = new LdVendorConstraintNameAutoFooCB();
     * cb.query().setFoo...(value);
     * int count = vendorConstraintNameAutoFooBhv.<span style="color: #DD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of LdVendorConstraintNameAutoFoo. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(LdVendorConstraintNameAutoFooCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(LdVendorConstraintNameAutoFooCB cb) { // called by selectCount(cb)
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(LdVendorConstraintNameAutoFooCB cb) { // called by selectPage(cb)
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
     * LdVendorConstraintNameAutoFooCB cb = new LdVendorConstraintNameAutoFooCB();
     * cb.query().setFoo...(value);
     * LdVendorConstraintNameAutoFoo vendorConstraintNameAutoFoo = vendorConstraintNameAutoFooBhv.<span style="color: #DD4747">selectEntity</span>(cb);
     * if (vendorConstraintNameAutoFoo != null) { <span style="color: #3F7E5E">// null check</span>
     *     ... = vendorConstraintNameAutoFoo.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of LdVendorConstraintNameAutoFoo. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public LdVendorConstraintNameAutoFoo selectEntity(LdVendorConstraintNameAutoFooCB cb) {
        return doSelectEntity(cb, LdVendorConstraintNameAutoFoo.class);
    }

    protected <ENTITY extends LdVendorConstraintNameAutoFoo> ENTITY doSelectEntity(LdVendorConstraintNameAutoFooCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectEntityInternally(cb, tp, new InternalSelectEntityCallback<ENTITY, LdVendorConstraintNameAutoFooCB>() {
            public List<ENTITY> callbackSelectList(LdVendorConstraintNameAutoFooCB lcb, Class<ENTITY> ltp) { return doSelectList(lcb, ltp); } });
    }

    protected <ENTITY extends LdVendorConstraintNameAutoFoo> OptionalEntity<ENTITY> doSelectOptionalEntity(LdVendorConstraintNameAutoFooCB cb, Class<ENTITY> tp) {
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
     * LdVendorConstraintNameAutoFooCB cb = new LdVendorConstraintNameAutoFooCB();
     * cb.query().setFoo...(value);
     * LdVendorConstraintNameAutoFoo vendorConstraintNameAutoFoo = vendorConstraintNameAutoFooBhv.<span style="color: #DD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = vendorConstraintNameAutoFoo.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of LdVendorConstraintNameAutoFoo. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (point is not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public LdVendorConstraintNameAutoFoo selectEntityWithDeletedCheck(LdVendorConstraintNameAutoFooCB cb) {
        return doSelectEntityWithDeletedCheck(cb, LdVendorConstraintNameAutoFoo.class);
    }

    protected <ENTITY extends LdVendorConstraintNameAutoFoo> ENTITY doSelectEntityWithDeletedCheck(LdVendorConstraintNameAutoFooCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectEntityWithDeletedCheckInternally(cb, tp, new InternalSelectEntityWithDeletedCheckCallback<ENTITY, LdVendorConstraintNameAutoFooCB>() {
            public List<ENTITY> callbackSelectList(LdVendorConstraintNameAutoFooCB lcb, Class<ENTITY> ltp) { return doSelectList(lcb, ltp); } });
    }

    @Override
    protected Entity doReadEntityWithDeletedCheck(ConditionBean cb) {
        return selectEntityWithDeletedCheck(downcast(cb));
    }

    /**
     * Select the entity by the primary-key value.
     * @param constraintNameAutoFooId The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public LdVendorConstraintNameAutoFoo selectByPKValue(java.math.BigDecimal constraintNameAutoFooId) {
        return doSelectByPKValue(constraintNameAutoFooId, LdVendorConstraintNameAutoFoo.class);
    }

    protected <ENTITY extends LdVendorConstraintNameAutoFoo> ENTITY doSelectByPKValue(java.math.BigDecimal constraintNameAutoFooId, Class<ENTITY> entityType) {
        return doSelectEntity(buildPKCB(constraintNameAutoFooId), entityType);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param constraintNameAutoFooId The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public LdVendorConstraintNameAutoFoo selectByPKValueWithDeletedCheck(java.math.BigDecimal constraintNameAutoFooId) {
        return doSelectByPKValueWithDeletedCheck(constraintNameAutoFooId, LdVendorConstraintNameAutoFoo.class);
    }

    protected <ENTITY extends LdVendorConstraintNameAutoFoo> ENTITY doSelectByPKValueWithDeletedCheck(java.math.BigDecimal constraintNameAutoFooId, Class<ENTITY> entityType) {
        return doSelectEntityWithDeletedCheck(buildPKCB(constraintNameAutoFooId), entityType);
    }

    private LdVendorConstraintNameAutoFooCB buildPKCB(java.math.BigDecimal constraintNameAutoFooId) {
        assertObjectNotNull("constraintNameAutoFooId", constraintNameAutoFooId);
        LdVendorConstraintNameAutoFooCB cb = newMyConditionBean();
        cb.query().setConstraintNameAutoFooId_Equal(constraintNameAutoFooId);
        return cb;
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * LdVendorConstraintNameAutoFooCB cb = new LdVendorConstraintNameAutoFooCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;LdVendorConstraintNameAutoFoo&gt; vendorConstraintNameAutoFooList = vendorConstraintNameAutoFooBhv.<span style="color: #DD4747">selectList</span>(cb);
     * for (LdVendorConstraintNameAutoFoo vendorConstraintNameAutoFoo : vendorConstraintNameAutoFooList) {
     *     ... = vendorConstraintNameAutoFoo.get...();
     * }
     * </pre>
     * @param cb The condition-bean of LdVendorConstraintNameAutoFoo. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<LdVendorConstraintNameAutoFoo> selectList(LdVendorConstraintNameAutoFooCB cb) {
        return doSelectList(cb, LdVendorConstraintNameAutoFoo.class);
    }

    protected <ENTITY extends LdVendorConstraintNameAutoFoo> ListResultBean<ENTITY> doSelectList(LdVendorConstraintNameAutoFooCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        return helpSelectListInternally(cb, tp, new InternalSelectListCallback<ENTITY, LdVendorConstraintNameAutoFooCB>() {
            public List<ENTITY> callbackSelectList(LdVendorConstraintNameAutoFooCB lcb, Class<ENTITY> ltp) { return delegateSelectList(lcb, ltp); } });
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
     * LdVendorConstraintNameAutoFooCB cb = new LdVendorConstraintNameAutoFooCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #DD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;LdVendorConstraintNameAutoFoo&gt; page = vendorConstraintNameAutoFooBhv.<span style="color: #DD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (LdVendorConstraintNameAutoFoo vendorConstraintNameAutoFoo : page) {
     *     ... = vendorConstraintNameAutoFoo.get...();
     * }
     * </pre>
     * @param cb The condition-bean of LdVendorConstraintNameAutoFoo. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<LdVendorConstraintNameAutoFoo> selectPage(LdVendorConstraintNameAutoFooCB cb) {
        return doSelectPage(cb, LdVendorConstraintNameAutoFoo.class);
    }

    protected <ENTITY extends LdVendorConstraintNameAutoFoo> PagingResultBean<ENTITY> doSelectPage(LdVendorConstraintNameAutoFooCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectPageInternally(cb, tp, new InternalSelectPageCallback<ENTITY, LdVendorConstraintNameAutoFooCB>() {
            public int callbackSelectCount(LdVendorConstraintNameAutoFooCB cb) { return doSelectCountPlainly(cb); }
            public List<ENTITY> callbackSelectList(LdVendorConstraintNameAutoFooCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); }
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
     * LdVendorConstraintNameAutoFooCB cb = new LdVendorConstraintNameAutoFooCB();
     * cb.query().setFoo...(value);
     * vendorConstraintNameAutoFooBhv.<span style="color: #DD4747">selectCursor</span>(cb, new EntityRowHandler&lt;LdVendorConstraintNameAutoFoo&gt;() {
     *     public void handle(LdVendorConstraintNameAutoFoo entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of LdVendorConstraintNameAutoFoo. (NotNull)
     * @param entityRowHandler The handler of entity row of LdVendorConstraintNameAutoFoo. (NotNull)
     */
    public void selectCursor(LdVendorConstraintNameAutoFooCB cb, EntityRowHandler<LdVendorConstraintNameAutoFoo> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, LdVendorConstraintNameAutoFoo.class);
    }

    protected <ENTITY extends LdVendorConstraintNameAutoFoo> void doSelectCursor(LdVendorConstraintNameAutoFooCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler", handler); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        helpSelectCursorInternally(cb, handler, tp, new InternalSelectCursorCallback<ENTITY, LdVendorConstraintNameAutoFooCB>() {
            public void callbackSelectCursor(LdVendorConstraintNameAutoFooCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) { delegateSelectCursor(cb, handler, tp); }
            public List<ENTITY> callbackSelectList(LdVendorConstraintNameAutoFooCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); }
        });
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * vendorConstraintNameAutoFooBhv.<span style="color: #DD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(LdVendorConstraintNameAutoFooCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> SLFunction<LdVendorConstraintNameAutoFooCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
    }

    protected <RESULT, CB extends LdVendorConstraintNameAutoFooCB> SLFunction<CB, RESULT> doScalarSelect(Class<RESULT> tp, CB cb) {
        assertObjectNotNull("resultType", tp); assertCBStateValid(cb);
        cb.xsetupForScalarSelect(); cb.getSqlClause().disableSelectIndex(); // for when you use union
        return createSLFunction(cb, tp);
    }

    protected <RESULT, CB extends LdVendorConstraintNameAutoFooCB> SLFunction<CB, RESULT> createSLFunction(CB cb, Class<RESULT> tp) {
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
     * Load referrer of vendorConstraintNameAutoRefList by the set-upper of referrer. <br />
     * VENDOR_CONSTRAINT_NAME_AUTO_REF by CONSTRAINT_NAME_AUTO_FOO_ID, named 'vendorConstraintNameAutoRefList'.
     * <pre>
     * vendorConstraintNameAutoFooBhv.<span style="color: #DD4747">loadVendorConstraintNameAutoRefList</span>(vendorConstraintNameAutoFooList, new ConditionBeanSetupper&lt;LdVendorConstraintNameAutoRefCB&gt;() {
     *     public void setup(LdVendorConstraintNameAutoRefCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...();
     *     }
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedList(referrerList -&gt {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * for (LdVendorConstraintNameAutoFoo vendorConstraintNameAutoFoo : vendorConstraintNameAutoFooList) {
     *     ... = vendorConstraintNameAutoFoo.<span style="color: #DD4747">getVendorConstraintNameAutoRefList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setConstraintNameAutoFooId_InScope(pkList);
     * cb.query().addOrderBy_ConstraintNameAutoFooId_Asc();
     * </pre>
     * @param vendorConstraintNameAutoFooList The entity list of vendorConstraintNameAutoFoo. (NotNull)
     * @param setupper The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoader<LdVendorConstraintNameAutoRef> loadVendorConstraintNameAutoRefList(List<LdVendorConstraintNameAutoFoo> vendorConstraintNameAutoFooList, ConditionBeanSetupper<LdVendorConstraintNameAutoRefCB> setupper) {
        xassLRArg(vendorConstraintNameAutoFooList, setupper);
        return doLoadVendorConstraintNameAutoRefList(vendorConstraintNameAutoFooList, new LoadReferrerOption<LdVendorConstraintNameAutoRefCB, LdVendorConstraintNameAutoRef>().xinit(setupper));
    }

    /**
     * Load referrer of vendorConstraintNameAutoRefList by the set-upper of referrer. <br />
     * VENDOR_CONSTRAINT_NAME_AUTO_REF by CONSTRAINT_NAME_AUTO_FOO_ID, named 'vendorConstraintNameAutoRefList'.
     * <pre>
     * vendorConstraintNameAutoFooBhv.<span style="color: #DD4747">loadVendorConstraintNameAutoRefList</span>(vendorConstraintNameAutoFooList, new ConditionBeanSetupper&lt;LdVendorConstraintNameAutoRefCB&gt;() {
     *     public void setup(LdVendorConstraintNameAutoRefCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...();
     *     }
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedList(referrerList -&gt {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = vendorConstraintNameAutoFoo.<span style="color: #DD4747">getVendorConstraintNameAutoRefList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setConstraintNameAutoFooId_InScope(pkList);
     * cb.query().addOrderBy_ConstraintNameAutoFooId_Asc();
     * </pre>
     * @param vendorConstraintNameAutoFoo The entity of vendorConstraintNameAutoFoo. (NotNull)
     * @param setupper The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoader<LdVendorConstraintNameAutoRef> loadVendorConstraintNameAutoRefList(LdVendorConstraintNameAutoFoo vendorConstraintNameAutoFoo, ConditionBeanSetupper<LdVendorConstraintNameAutoRefCB> setupper) {
        xassLRArg(vendorConstraintNameAutoFoo, setupper);
        return doLoadVendorConstraintNameAutoRefList(xnewLRLs(vendorConstraintNameAutoFoo), new LoadReferrerOption<LdVendorConstraintNameAutoRefCB, LdVendorConstraintNameAutoRef>().xinit(setupper));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param vendorConstraintNameAutoFoo The entity of vendorConstraintNameAutoFoo. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoader<LdVendorConstraintNameAutoRef> loadVendorConstraintNameAutoRefList(LdVendorConstraintNameAutoFoo vendorConstraintNameAutoFoo, LoadReferrerOption<LdVendorConstraintNameAutoRefCB, LdVendorConstraintNameAutoRef> loadReferrerOption) {
        xassLRArg(vendorConstraintNameAutoFoo, loadReferrerOption);
        return loadVendorConstraintNameAutoRefList(xnewLRLs(vendorConstraintNameAutoFoo), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean setupper.} #beforejava8
     * @param vendorConstraintNameAutoFooList The entity list of vendorConstraintNameAutoFoo. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerLoader<LdVendorConstraintNameAutoRef> loadVendorConstraintNameAutoRefList(List<LdVendorConstraintNameAutoFoo> vendorConstraintNameAutoFooList, LoadReferrerOption<LdVendorConstraintNameAutoRefCB, LdVendorConstraintNameAutoRef> loadReferrerOption) {
        xassLRArg(vendorConstraintNameAutoFooList, loadReferrerOption);
        if (vendorConstraintNameAutoFooList.isEmpty()) { return (NestedReferrerLoader<LdVendorConstraintNameAutoRef>)EMPTY_LOADER; }
        return doLoadVendorConstraintNameAutoRefList(vendorConstraintNameAutoFooList, loadReferrerOption);
    }

    protected NestedReferrerLoader<LdVendorConstraintNameAutoRef> doLoadVendorConstraintNameAutoRefList(List<LdVendorConstraintNameAutoFoo> vendorConstraintNameAutoFooList, LoadReferrerOption<LdVendorConstraintNameAutoRefCB, LdVendorConstraintNameAutoRef> option) {
        final LdVendorConstraintNameAutoRefBhv referrerBhv = xgetBSFLR().select(LdVendorConstraintNameAutoRefBhv.class);
        return helpLoadReferrerInternally(vendorConstraintNameAutoFooList, option, new InternalLoadReferrerCallback<LdVendorConstraintNameAutoFoo, java.math.BigDecimal, LdVendorConstraintNameAutoRefCB, LdVendorConstraintNameAutoRef>() {
            public java.math.BigDecimal getPKVal(LdVendorConstraintNameAutoFoo et)
            { return et.getConstraintNameAutoFooId(); }
            public void setRfLs(LdVendorConstraintNameAutoFoo et, List<LdVendorConstraintNameAutoRef> ls)
            { et.setVendorConstraintNameAutoRefList(ls); }
            public LdVendorConstraintNameAutoRefCB newMyCB() { return referrerBhv.newMyConditionBean(); }
            public void qyFKIn(LdVendorConstraintNameAutoRefCB cb, List<java.math.BigDecimal> ls)
            { cb.query().setConstraintNameAutoFooId_InScope(ls); }
            public void qyOdFKAsc(LdVendorConstraintNameAutoRefCB cb) { cb.query().addOrderBy_ConstraintNameAutoFooId_Asc(); }
            public void spFKCol(LdVendorConstraintNameAutoRefCB cb) { cb.specify().columnConstraintNameAutoFooId(); }
            public List<LdVendorConstraintNameAutoRef> selRfLs(LdVendorConstraintNameAutoRefCB cb) { return referrerBhv.selectList(cb); }
            public java.math.BigDecimal getFKVal(LdVendorConstraintNameAutoRef re) { return re.getConstraintNameAutoFooId(); }
            public void setlcEt(LdVendorConstraintNameAutoRef re, LdVendorConstraintNameAutoFoo le)
            { re.setVendorConstraintNameAutoFoo(le); }
            public String getRfPrNm() { return "vendorConstraintNameAutoRefList"; }
        });
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key constraintNameAutoFooId.
     * @param vendorConstraintNameAutoFooList The list of vendorConstraintNameAutoFoo. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<java.math.BigDecimal> extractConstraintNameAutoFooIdList(List<LdVendorConstraintNameAutoFoo> vendorConstraintNameAutoFooList) {
        return helpExtractListInternally(vendorConstraintNameAutoFooList, new InternalExtractCallback<LdVendorConstraintNameAutoFoo, java.math.BigDecimal>() {
            public java.math.BigDecimal getCV(LdVendorConstraintNameAutoFoo et) { return et.getConstraintNameAutoFooId(); }
        });
    }

    /**
     * Extract the value list of (single) unique key constraintNameAutoFooName.
     * @param vendorConstraintNameAutoFooList The list of vendorConstraintNameAutoFoo. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<String> extractConstraintNameAutoFooNameList(List<LdVendorConstraintNameAutoFoo> vendorConstraintNameAutoFooList) {
        return helpExtractListInternally(vendorConstraintNameAutoFooList, new InternalExtractCallback<LdVendorConstraintNameAutoFoo, String>() {
            public String getCV(LdVendorConstraintNameAutoFoo et) { return et.getConstraintNameAutoFooName(); }
        });
    }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * LdVendorConstraintNameAutoFoo vendorConstraintNameAutoFoo = new LdVendorConstraintNameAutoFoo();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * vendorConstraintNameAutoFoo.setFoo...(value);
     * vendorConstraintNameAutoFoo.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//vendorConstraintNameAutoFoo.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//vendorConstraintNameAutoFoo.set...;</span>
     * vendorConstraintNameAutoFooBhv.<span style="color: #DD4747">insert</span>(vendorConstraintNameAutoFoo);
     * ... = vendorConstraintNameAutoFoo.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param vendorConstraintNameAutoFoo The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(LdVendorConstraintNameAutoFoo vendorConstraintNameAutoFoo) {
        doInsert(vendorConstraintNameAutoFoo, null);
    }

    protected void doInsert(LdVendorConstraintNameAutoFoo vendorConstraintNameAutoFoo, InsertOption<LdVendorConstraintNameAutoFooCB> op) {
        assertObjectNotNull("vendorConstraintNameAutoFoo", vendorConstraintNameAutoFoo);
        prepareInsertOption(op);
        delegateInsert(vendorConstraintNameAutoFoo, op);
    }

    protected void prepareInsertOption(InsertOption<LdVendorConstraintNameAutoFooCB> op) {
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
     * LdVendorConstraintNameAutoFoo vendorConstraintNameAutoFoo = new LdVendorConstraintNameAutoFoo();
     * vendorConstraintNameAutoFoo.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * vendorConstraintNameAutoFoo.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//vendorConstraintNameAutoFoo.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//vendorConstraintNameAutoFoo.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * vendorConstraintNameAutoFoo.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     vendorConstraintNameAutoFooBhv.<span style="color: #DD4747">update</span>(vendorConstraintNameAutoFoo);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param vendorConstraintNameAutoFoo The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(final LdVendorConstraintNameAutoFoo vendorConstraintNameAutoFoo) {
        doUpdate(vendorConstraintNameAutoFoo, null);
    }

    protected void doUpdate(LdVendorConstraintNameAutoFoo vendorConstraintNameAutoFoo, final UpdateOption<LdVendorConstraintNameAutoFooCB> op) {
        assertObjectNotNull("vendorConstraintNameAutoFoo", vendorConstraintNameAutoFoo);
        prepareUpdateOption(op);
        helpUpdateInternally(vendorConstraintNameAutoFoo, new InternalUpdateCallback<LdVendorConstraintNameAutoFoo>() {
            public int callbackDelegateUpdate(LdVendorConstraintNameAutoFoo et) { return delegateUpdate(et, op); } });
    }

    protected void prepareUpdateOption(UpdateOption<LdVendorConstraintNameAutoFooCB> op) {
        if (op == null) { return; }
        assertUpdateOptionStatus(op);
        if (op.hasSelfSpecification()) {
            op.resolveSelfSpecification(createCBForVaryingUpdate());
        }
        if (op.hasSpecifiedUpdateColumn()) {
            op.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    protected LdVendorConstraintNameAutoFooCB createCBForVaryingUpdate() {
        LdVendorConstraintNameAutoFooCB cb = newMyConditionBean();
        cb.xsetupForVaryingUpdate();
        return cb;
    }

    protected LdVendorConstraintNameAutoFooCB createCBForSpecifiedUpdate() {
        LdVendorConstraintNameAutoFooCB cb = newMyConditionBean();
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
     * @param vendorConstraintNameAutoFoo The entity of insert or update target. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(LdVendorConstraintNameAutoFoo vendorConstraintNameAutoFoo) {
        doInesrtOrUpdate(vendorConstraintNameAutoFoo, null, null);
    }

    protected void doInesrtOrUpdate(LdVendorConstraintNameAutoFoo vendorConstraintNameAutoFoo, final InsertOption<LdVendorConstraintNameAutoFooCB> iop, final UpdateOption<LdVendorConstraintNameAutoFooCB> uop) {
        helpInsertOrUpdateInternally(vendorConstraintNameAutoFoo, new InternalInsertOrUpdateCallback<LdVendorConstraintNameAutoFoo, LdVendorConstraintNameAutoFooCB>() {
            public void callbackInsert(LdVendorConstraintNameAutoFoo et) { doInsert(et, iop); }
            public void callbackUpdate(LdVendorConstraintNameAutoFoo et) { doUpdate(et, uop); }
            public LdVendorConstraintNameAutoFooCB callbackNewMyConditionBean() { return newMyConditionBean(); }
            public int callbackSelectCount(LdVendorConstraintNameAutoFooCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrModify(Entity et, InsertOption<? extends ConditionBean> iop, UpdateOption<? extends ConditionBean> uop) {
        if (iop == null && uop == null) { insertOrUpdate(downcast(et)); }
        else {
            iop = iop != null ? iop : new InsertOption<LdVendorConstraintNameAutoFooCB>();
            uop = uop != null ? uop : new UpdateOption<LdVendorConstraintNameAutoFooCB>();
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
     * LdVendorConstraintNameAutoFoo vendorConstraintNameAutoFoo = new LdVendorConstraintNameAutoFoo();
     * vendorConstraintNameAutoFoo.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * vendorConstraintNameAutoFoo.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     vendorConstraintNameAutoFooBhv.<span style="color: #DD4747">delete</span>(vendorConstraintNameAutoFoo);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param vendorConstraintNameAutoFoo The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(LdVendorConstraintNameAutoFoo vendorConstraintNameAutoFoo) {
        doDelete(vendorConstraintNameAutoFoo, null);
    }

    protected void doDelete(LdVendorConstraintNameAutoFoo vendorConstraintNameAutoFoo, final DeleteOption<LdVendorConstraintNameAutoFooCB> op) {
        assertObjectNotNull("vendorConstraintNameAutoFoo", vendorConstraintNameAutoFoo);
        prepareDeleteOption(op);
        helpDeleteInternally(vendorConstraintNameAutoFoo, new InternalDeleteCallback<LdVendorConstraintNameAutoFoo>() {
            public int callbackDelegateDelete(LdVendorConstraintNameAutoFoo et) { return delegateDelete(et, op); } });
    }

    protected void prepareDeleteOption(DeleteOption<LdVendorConstraintNameAutoFooCB> op) {
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
     *     LdVendorConstraintNameAutoFoo vendorConstraintNameAutoFoo = new LdVendorConstraintNameAutoFoo();
     *     vendorConstraintNameAutoFoo.setFooName("foo");
     *     if (...) {
     *         vendorConstraintNameAutoFoo.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     vendorConstraintNameAutoFooList.add(vendorConstraintNameAutoFoo);
     * }
     * vendorConstraintNameAutoFooBhv.<span style="color: #DD4747">batchInsert</span>(vendorConstraintNameAutoFooList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param vendorConstraintNameAutoFooList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<LdVendorConstraintNameAutoFoo> vendorConstraintNameAutoFooList) {
        InsertOption<LdVendorConstraintNameAutoFooCB> op = createInsertUpdateOption();
        return doBatchInsert(vendorConstraintNameAutoFooList, op);
    }

    protected int[] doBatchInsert(List<LdVendorConstraintNameAutoFoo> vendorConstraintNameAutoFooList, InsertOption<LdVendorConstraintNameAutoFooCB> op) {
        assertObjectNotNull("vendorConstraintNameAutoFooList", vendorConstraintNameAutoFooList);
        prepareBatchInsertOption(vendorConstraintNameAutoFooList, op);
        return delegateBatchInsert(vendorConstraintNameAutoFooList, op);
    }

    protected void prepareBatchInsertOption(List<LdVendorConstraintNameAutoFoo> vendorConstraintNameAutoFooList, InsertOption<LdVendorConstraintNameAutoFooCB> op) {
        op.xallowInsertColumnModifiedPropertiesFragmented();
        op.xacceptInsertColumnModifiedPropertiesIfNeeds(vendorConstraintNameAutoFooList);
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
     *     LdVendorConstraintNameAutoFoo vendorConstraintNameAutoFoo = new LdVendorConstraintNameAutoFoo();
     *     vendorConstraintNameAutoFoo.setFooName("foo");
     *     if (...) {
     *         vendorConstraintNameAutoFoo.setFooPrice(123);
     *     } else {
     *         vendorConstraintNameAutoFoo.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//vendorConstraintNameAutoFoo.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     vendorConstraintNameAutoFooList.add(vendorConstraintNameAutoFoo);
     * }
     * vendorConstraintNameAutoFooBhv.<span style="color: #DD4747">batchUpdate</span>(vendorConstraintNameAutoFooList);
     * </pre>
     * @param vendorConstraintNameAutoFooList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<LdVendorConstraintNameAutoFoo> vendorConstraintNameAutoFooList) {
        UpdateOption<LdVendorConstraintNameAutoFooCB> op = createPlainUpdateOption();
        return doBatchUpdate(vendorConstraintNameAutoFooList, op);
    }

    protected int[] doBatchUpdate(List<LdVendorConstraintNameAutoFoo> vendorConstraintNameAutoFooList, UpdateOption<LdVendorConstraintNameAutoFooCB> op) {
        assertObjectNotNull("vendorConstraintNameAutoFooList", vendorConstraintNameAutoFooList);
        prepareBatchUpdateOption(vendorConstraintNameAutoFooList, op);
        return delegateBatchUpdate(vendorConstraintNameAutoFooList, op);
    }

    protected void prepareBatchUpdateOption(List<LdVendorConstraintNameAutoFoo> vendorConstraintNameAutoFooList, UpdateOption<LdVendorConstraintNameAutoFooCB> op) {
        op.xacceptUpdateColumnModifiedPropertiesIfNeeds(vendorConstraintNameAutoFooList);
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
     * vendorConstraintNameAutoFooBhv.<span style="color: #DD4747">batchUpdate</span>(vendorConstraintNameAutoFooList, new SpecifyQuery<LdVendorConstraintNameAutoFooCB>() {
     *     public void specify(LdVendorConstraintNameAutoFooCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #DD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #DD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * vendorConstraintNameAutoFooBhv.<span style="color: #DD4747">batchUpdate</span>(vendorConstraintNameAutoFooList, new SpecifyQuery<LdVendorConstraintNameAutoFooCB>() {
     *     public void specify(LdVendorConstraintNameAutoFooCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #DD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param vendorConstraintNameAutoFooList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<LdVendorConstraintNameAutoFoo> vendorConstraintNameAutoFooList, SpecifyQuery<LdVendorConstraintNameAutoFooCB> updateColumnSpec) {
        return doBatchUpdate(vendorConstraintNameAutoFooList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> op) {
        return doLumpModify(ls, op);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param vendorConstraintNameAutoFooList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<LdVendorConstraintNameAutoFoo> vendorConstraintNameAutoFooList) {
        return doBatchDelete(vendorConstraintNameAutoFooList, null);
    }

    protected int[] doBatchDelete(List<LdVendorConstraintNameAutoFoo> vendorConstraintNameAutoFooList, DeleteOption<LdVendorConstraintNameAutoFooCB> op) {
        assertObjectNotNull("vendorConstraintNameAutoFooList", vendorConstraintNameAutoFooList);
        prepareDeleteOption(op);
        return delegateBatchDelete(vendorConstraintNameAutoFooList, op);
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
     * vendorConstraintNameAutoFooBhv.<span style="color: #DD4747">queryInsert</span>(new QueryInsertSetupper&lt;LdVendorConstraintNameAutoFoo, LdVendorConstraintNameAutoFooCB&gt;() {
     *     public ConditionBean setup(vendorConstraintNameAutoFoo entity, LdVendorConstraintNameAutoFooCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<LdVendorConstraintNameAutoFoo, LdVendorConstraintNameAutoFooCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(QueryInsertSetupper<LdVendorConstraintNameAutoFoo, LdVendorConstraintNameAutoFooCB> sp, InsertOption<LdVendorConstraintNameAutoFooCB> op) {
        assertObjectNotNull("setupper", sp);
        prepareInsertOption(op);
        LdVendorConstraintNameAutoFoo e = new LdVendorConstraintNameAutoFoo();
        LdVendorConstraintNameAutoFooCB cb = createCBForQueryInsert();
        return delegateQueryInsert(e, cb, sp.setup(e, cb), op);
    }

    protected LdVendorConstraintNameAutoFooCB createCBForQueryInsert() {
        LdVendorConstraintNameAutoFooCB cb = newMyConditionBean();
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
     * LdVendorConstraintNameAutoFoo vendorConstraintNameAutoFoo = new LdVendorConstraintNameAutoFoo();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//vendorConstraintNameAutoFoo.setPK...(value);</span>
     * vendorConstraintNameAutoFoo.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//vendorConstraintNameAutoFoo.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//vendorConstraintNameAutoFoo.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//vendorConstraintNameAutoFoo.setVersionNo(value);</span>
     * LdVendorConstraintNameAutoFooCB cb = new LdVendorConstraintNameAutoFooCB();
     * cb.query().setFoo...(value);
     * vendorConstraintNameAutoFooBhv.<span style="color: #DD4747">queryUpdate</span>(vendorConstraintNameAutoFoo, cb);
     * </pre>
     * @param vendorConstraintNameAutoFoo The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of LdVendorConstraintNameAutoFoo. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(LdVendorConstraintNameAutoFoo vendorConstraintNameAutoFoo, LdVendorConstraintNameAutoFooCB cb) {
        return doQueryUpdate(vendorConstraintNameAutoFoo, cb, null);
    }

    protected int doQueryUpdate(LdVendorConstraintNameAutoFoo vendorConstraintNameAutoFoo, LdVendorConstraintNameAutoFooCB cb, UpdateOption<LdVendorConstraintNameAutoFooCB> op) {
        assertObjectNotNull("vendorConstraintNameAutoFoo", vendorConstraintNameAutoFoo); assertCBStateValid(cb);
        prepareUpdateOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryUpdate(vendorConstraintNameAutoFoo, cb, op) : 0;
    }

    @Override
    protected int doRangeModify(Entity et, ConditionBean cb, UpdateOption<? extends ConditionBean> op) {
        if (op == null) { return queryUpdate(downcast(et), (LdVendorConstraintNameAutoFooCB)cb); }
        else { return varyingQueryUpdate(downcast(et), (LdVendorConstraintNameAutoFooCB)cb, downcast(op)); }
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * LdVendorConstraintNameAutoFooCB cb = new LdVendorConstraintNameAutoFooCB();
     * cb.query().setFoo...(value);
     * vendorConstraintNameAutoFooBhv.<span style="color: #DD4747">queryDelete</span>(vendorConstraintNameAutoFoo, cb);
     * </pre>
     * @param cb The condition-bean of LdVendorConstraintNameAutoFoo. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(LdVendorConstraintNameAutoFooCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(LdVendorConstraintNameAutoFooCB cb, DeleteOption<LdVendorConstraintNameAutoFooCB> op) {
        assertCBStateValid(cb);
        prepareDeleteOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryDelete(cb, op) : 0;
    }

    @Override
    protected int doRangeRemove(ConditionBean cb, DeleteOption<? extends ConditionBean> op) {
        if (op == null) { return queryDelete((LdVendorConstraintNameAutoFooCB)cb); }
        else { return varyingQueryDelete((LdVendorConstraintNameAutoFooCB)cb, downcast(op)); }
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
     * LdVendorConstraintNameAutoFoo vendorConstraintNameAutoFoo = new LdVendorConstraintNameAutoFoo();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * vendorConstraintNameAutoFoo.setFoo...(value);
     * vendorConstraintNameAutoFoo.setBar...(value);
     * InsertOption<LdVendorConstraintNameAutoFooCB> option = new InsertOption<LdVendorConstraintNameAutoFooCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * vendorConstraintNameAutoFooBhv.<span style="color: #DD4747">varyingInsert</span>(vendorConstraintNameAutoFoo, option);
     * ... = vendorConstraintNameAutoFoo.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param vendorConstraintNameAutoFoo The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(LdVendorConstraintNameAutoFoo vendorConstraintNameAutoFoo, InsertOption<LdVendorConstraintNameAutoFooCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(vendorConstraintNameAutoFoo, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * LdVendorConstraintNameAutoFoo vendorConstraintNameAutoFoo = new LdVendorConstraintNameAutoFoo();
     * vendorConstraintNameAutoFoo.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * vendorConstraintNameAutoFoo.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * vendorConstraintNameAutoFoo.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;LdVendorConstraintNameAutoFooCB&gt; option = new UpdateOption&lt;LdVendorConstraintNameAutoFooCB&gt;();
     *     option.self(new SpecifyQuery&lt;LdVendorConstraintNameAutoFooCB&gt;() {
     *         public void specify(LdVendorConstraintNameAutoFooCB cb) {
     *             cb.specify().<span style="color: #DD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     vendorConstraintNameAutoFooBhv.<span style="color: #DD4747">varyingUpdate</span>(vendorConstraintNameAutoFoo, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param vendorConstraintNameAutoFoo The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(LdVendorConstraintNameAutoFoo vendorConstraintNameAutoFoo, UpdateOption<LdVendorConstraintNameAutoFooCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(vendorConstraintNameAutoFoo, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param vendorConstraintNameAutoFoo The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(LdVendorConstraintNameAutoFoo vendorConstraintNameAutoFoo, InsertOption<LdVendorConstraintNameAutoFooCB> insertOption, UpdateOption<LdVendorConstraintNameAutoFooCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdate(vendorConstraintNameAutoFoo, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param vendorConstraintNameAutoFoo The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(LdVendorConstraintNameAutoFoo vendorConstraintNameAutoFoo, DeleteOption<LdVendorConstraintNameAutoFooCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(vendorConstraintNameAutoFoo, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param vendorConstraintNameAutoFooList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<LdVendorConstraintNameAutoFoo> vendorConstraintNameAutoFooList, InsertOption<LdVendorConstraintNameAutoFooCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(vendorConstraintNameAutoFooList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param vendorConstraintNameAutoFooList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<LdVendorConstraintNameAutoFoo> vendorConstraintNameAutoFooList, UpdateOption<LdVendorConstraintNameAutoFooCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(vendorConstraintNameAutoFooList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param vendorConstraintNameAutoFooList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<LdVendorConstraintNameAutoFoo> vendorConstraintNameAutoFooList, DeleteOption<LdVendorConstraintNameAutoFooCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(vendorConstraintNameAutoFooList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<LdVendorConstraintNameAutoFoo, LdVendorConstraintNameAutoFooCB> setupper, InsertOption<LdVendorConstraintNameAutoFooCB> option) {
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
     * LdVendorConstraintNameAutoFoo vendorConstraintNameAutoFoo = new LdVendorConstraintNameAutoFoo();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//vendorConstraintNameAutoFoo.setPK...(value);</span>
     * vendorConstraintNameAutoFoo.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//vendorConstraintNameAutoFoo.setVersionNo(value);</span>
     * LdVendorConstraintNameAutoFooCB cb = new LdVendorConstraintNameAutoFooCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;LdVendorConstraintNameAutoFooCB&gt; option = new UpdateOption&lt;LdVendorConstraintNameAutoFooCB&gt;();
     * option.self(new SpecifyQuery&lt;LdVendorConstraintNameAutoFooCB&gt;() {
     *     public void specify(LdVendorConstraintNameAutoFooCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * vendorConstraintNameAutoFooBhv.<span style="color: #DD4747">varyingQueryUpdate</span>(vendorConstraintNameAutoFoo, cb, option);
     * </pre>
     * @param vendorConstraintNameAutoFoo The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of LdVendorConstraintNameAutoFoo. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(LdVendorConstraintNameAutoFoo vendorConstraintNameAutoFoo, LdVendorConstraintNameAutoFooCB cb, UpdateOption<LdVendorConstraintNameAutoFooCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(vendorConstraintNameAutoFoo, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of LdVendorConstraintNameAutoFoo. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(LdVendorConstraintNameAutoFooCB cb, DeleteOption<LdVendorConstraintNameAutoFooCB> option) {
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
    public OutsideSqlBasicExecutor<LdVendorConstraintNameAutoFooBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCountUniquely(LdVendorConstraintNameAutoFooCB cb) { return invoke(createSelectCountCBCommand(cb, true)); }
    protected int delegateSelectCountPlainly(LdVendorConstraintNameAutoFooCB cb) { return invoke(createSelectCountCBCommand(cb, false)); }
    protected <ENTITY extends LdVendorConstraintNameAutoFoo> void delegateSelectCursor(LdVendorConstraintNameAutoFooCB cb, EntityRowHandler<ENTITY> rh, Class<ENTITY> tp)
    { invoke(createSelectCursorCBCommand(cb, rh, tp)); }
    protected <ENTITY extends LdVendorConstraintNameAutoFoo> List<ENTITY> delegateSelectList(LdVendorConstraintNameAutoFooCB cb, Class<ENTITY> tp)
    { return invoke(createSelectListCBCommand(cb, tp)); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(LdVendorConstraintNameAutoFoo et, InsertOption<LdVendorConstraintNameAutoFooCB> op)
    { if (!processBeforeInsert(et, op)) { return 0; }
      return invoke(createInsertEntityCommand(et, op)); }
    protected int delegateUpdate(LdVendorConstraintNameAutoFoo et, UpdateOption<LdVendorConstraintNameAutoFooCB> op)
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return delegateUpdateNonstrict(et, op); }
    protected int delegateUpdateNonstrict(LdVendorConstraintNameAutoFoo et, UpdateOption<LdVendorConstraintNameAutoFooCB> op)
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return invoke(createUpdateNonstrictEntityCommand(et, op)); }
    protected int delegateDelete(LdVendorConstraintNameAutoFoo et, DeleteOption<LdVendorConstraintNameAutoFooCB> op)
    { if (!processBeforeDelete(et, op)) { return 0; }
      return delegateDeleteNonstrict(et, op); }
    protected int delegateDeleteNonstrict(LdVendorConstraintNameAutoFoo et, DeleteOption<LdVendorConstraintNameAutoFooCB> op)
    { if (!processBeforeDelete(et, op)) { return 0; }
      return invoke(createDeleteNonstrictEntityCommand(et, op)); }

    protected int[] delegateBatchInsert(List<LdVendorConstraintNameAutoFoo> ls, InsertOption<LdVendorConstraintNameAutoFooCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchInsertCommand(processBatchInternally(ls, op), op)); }
    protected int[] delegateBatchUpdate(List<LdVendorConstraintNameAutoFoo> ls, UpdateOption<LdVendorConstraintNameAutoFooCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchUpdateNonstrict(ls, op); }
    protected int[] delegateBatchUpdateNonstrict(List<LdVendorConstraintNameAutoFoo> ls, UpdateOption<LdVendorConstraintNameAutoFooCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateNonstrictCommand(processBatchInternally(ls, op, true), op)); }
    protected int[] delegateBatchDelete(List<LdVendorConstraintNameAutoFoo> ls, DeleteOption<LdVendorConstraintNameAutoFooCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchDeleteNonstrict(ls, op); }
    protected int[] delegateBatchDeleteNonstrict(List<LdVendorConstraintNameAutoFoo> ls, DeleteOption<LdVendorConstraintNameAutoFooCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteNonstrictCommand(processBatchInternally(ls, op, true), op)); }

    protected int delegateQueryInsert(LdVendorConstraintNameAutoFoo et, LdVendorConstraintNameAutoFooCB inCB, ConditionBean resCB, InsertOption<LdVendorConstraintNameAutoFooCB> op)
    { if (!processBeforeQueryInsert(et, inCB, resCB, op)) { return 0; } return invoke(createQueryInsertCBCommand(et, inCB, resCB, op));  }
    protected int delegateQueryUpdate(LdVendorConstraintNameAutoFoo et, LdVendorConstraintNameAutoFooCB cb, UpdateOption<LdVendorConstraintNameAutoFooCB> op)
    { if (!processBeforeQueryUpdate(et, cb, op)) { return 0; } return invoke(createQueryUpdateCBCommand(et, cb, op));  }
    protected int delegateQueryDelete(LdVendorConstraintNameAutoFooCB cb, DeleteOption<LdVendorConstraintNameAutoFooCB> op)
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
    protected LdVendorConstraintNameAutoFoo downcast(Entity et) {
        return helpEntityDowncastInternally(et, LdVendorConstraintNameAutoFoo.class);
    }

    protected LdVendorConstraintNameAutoFooCB downcast(ConditionBean cb) {
        return helpConditionBeanDowncastInternally(cb, LdVendorConstraintNameAutoFooCB.class);
    }

    @SuppressWarnings("unchecked")
    protected List<LdVendorConstraintNameAutoFoo> downcast(List<? extends Entity> ls) {
        return (List<LdVendorConstraintNameAutoFoo>)ls;
    }

    @SuppressWarnings("unchecked")
    protected InsertOption<LdVendorConstraintNameAutoFooCB> downcast(InsertOption<? extends ConditionBean> op) {
        return (InsertOption<LdVendorConstraintNameAutoFooCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected UpdateOption<LdVendorConstraintNameAutoFooCB> downcast(UpdateOption<? extends ConditionBean> op) {
        return (UpdateOption<LdVendorConstraintNameAutoFooCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected DeleteOption<LdVendorConstraintNameAutoFooCB> downcast(DeleteOption<? extends ConditionBean> op) {
        return (DeleteOption<LdVendorConstraintNameAutoFooCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<LdVendorConstraintNameAutoFoo, LdVendorConstraintNameAutoFooCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> sp) {
        return (QueryInsertSetupper<LdVendorConstraintNameAutoFoo, LdVendorConstraintNameAutoFooCB>)sp;
    }
}
