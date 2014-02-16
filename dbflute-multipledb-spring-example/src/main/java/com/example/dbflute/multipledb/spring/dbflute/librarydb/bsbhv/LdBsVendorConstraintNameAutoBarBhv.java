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
 * The behavior of VENDOR_CONSTRAINT_NAME_AUTO_BAR as TABLE. <br />
 * <pre>
 * [primary key]
 *     CONSTRAINT_NAME_AUTO_BAR_ID
 *
 * [column]
 *     CONSTRAINT_NAME_AUTO_BAR_ID, CONSTRAINT_NAME_AUTO_BAR_NAME
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
public abstract class LdBsVendorConstraintNameAutoBarBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "VENDOR_CONSTRAINT_NAME_AUTO_BAR"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public DBMeta getDBMeta() { return LdVendorConstraintNameAutoBarDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public LdVendorConstraintNameAutoBarDbm getMyDBMeta() { return LdVendorConstraintNameAutoBarDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public Entity newEntity() { return newMyEntity(); }

    /** {@inheritDoc} */
    public ConditionBean newConditionBean() { return newMyConditionBean(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public LdVendorConstraintNameAutoBar newMyEntity() { return new LdVendorConstraintNameAutoBar(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public LdVendorConstraintNameAutoBarCB newMyConditionBean() { return new LdVendorConstraintNameAutoBarCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * LdVendorConstraintNameAutoBarCB cb = new LdVendorConstraintNameAutoBarCB();
     * cb.query().setFoo...(value);
     * int count = vendorConstraintNameAutoBarBhv.<span style="color: #FD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of LdVendorConstraintNameAutoBar. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(LdVendorConstraintNameAutoBarCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(LdVendorConstraintNameAutoBarCB cb) { // called by selectCount(cb)
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(LdVendorConstraintNameAutoBarCB cb) { // called by selectPage(cb)
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
     * LdVendorConstraintNameAutoBarCB cb = new LdVendorConstraintNameAutoBarCB();
     * cb.query().setFoo...(value);
     * LdVendorConstraintNameAutoBar vendorConstraintNameAutoBar = vendorConstraintNameAutoBarBhv.<span style="color: #FD4747">selectEntity</span>(cb);
     * if (vendorConstraintNameAutoBar != null) {
     *     ... = vendorConstraintNameAutoBar.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of LdVendorConstraintNameAutoBar. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public LdVendorConstraintNameAutoBar selectEntity(LdVendorConstraintNameAutoBarCB cb) {
        return doSelectEntity(cb, LdVendorConstraintNameAutoBar.class);
    }

    protected <ENTITY extends LdVendorConstraintNameAutoBar> ENTITY doSelectEntity(final LdVendorConstraintNameAutoBarCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb);
        return helpSelectEntityInternally(cb, tp, new InternalSelectEntityCallback<ENTITY, LdVendorConstraintNameAutoBarCB>() {
            public List<ENTITY> callbackSelectList(LdVendorConstraintNameAutoBarCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); } });
    }

    @Override
    protected Entity doReadEntity(ConditionBean cb) {
        return selectEntity(downcast(cb));
    }

    /**
     * Select the entity by the condition-bean with deleted check.
     * <pre>
     * LdVendorConstraintNameAutoBarCB cb = new LdVendorConstraintNameAutoBarCB();
     * cb.query().setFoo...(value);
     * LdVendorConstraintNameAutoBar vendorConstraintNameAutoBar = vendorConstraintNameAutoBarBhv.<span style="color: #FD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = vendorConstraintNameAutoBar.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of LdVendorConstraintNameAutoBar. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public LdVendorConstraintNameAutoBar selectEntityWithDeletedCheck(LdVendorConstraintNameAutoBarCB cb) {
        return doSelectEntityWithDeletedCheck(cb, LdVendorConstraintNameAutoBar.class);
    }

    protected <ENTITY extends LdVendorConstraintNameAutoBar> ENTITY doSelectEntityWithDeletedCheck(final LdVendorConstraintNameAutoBarCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb);
        return helpSelectEntityWithDeletedCheckInternally(cb, tp, new InternalSelectEntityWithDeletedCheckCallback<ENTITY, LdVendorConstraintNameAutoBarCB>() {
            public List<ENTITY> callbackSelectList(LdVendorConstraintNameAutoBarCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); } });
    }

    @Override
    protected Entity doReadEntityWithDeletedCheck(ConditionBean cb) {
        return selectEntityWithDeletedCheck(downcast(cb));
    }

    /**
     * Select the entity by the primary-key value.
     * @param constraintNameAutoBarId The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public LdVendorConstraintNameAutoBar selectByPKValue(java.math.BigDecimal constraintNameAutoBarId) {
        return doSelectByPKValue(constraintNameAutoBarId, LdVendorConstraintNameAutoBar.class);
    }

    protected <ENTITY extends LdVendorConstraintNameAutoBar> ENTITY doSelectByPKValue(java.math.BigDecimal constraintNameAutoBarId, Class<ENTITY> entityType) {
        return doSelectEntity(buildPKCB(constraintNameAutoBarId), entityType);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param constraintNameAutoBarId The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public LdVendorConstraintNameAutoBar selectByPKValueWithDeletedCheck(java.math.BigDecimal constraintNameAutoBarId) {
        return doSelectByPKValueWithDeletedCheck(constraintNameAutoBarId, LdVendorConstraintNameAutoBar.class);
    }

    protected <ENTITY extends LdVendorConstraintNameAutoBar> ENTITY doSelectByPKValueWithDeletedCheck(java.math.BigDecimal constraintNameAutoBarId, Class<ENTITY> entityType) {
        return doSelectEntityWithDeletedCheck(buildPKCB(constraintNameAutoBarId), entityType);
    }

    private LdVendorConstraintNameAutoBarCB buildPKCB(java.math.BigDecimal constraintNameAutoBarId) {
        assertObjectNotNull("constraintNameAutoBarId", constraintNameAutoBarId);
        LdVendorConstraintNameAutoBarCB cb = newMyConditionBean();
        cb.query().setConstraintNameAutoBarId_Equal(constraintNameAutoBarId);
        return cb;
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * LdVendorConstraintNameAutoBarCB cb = new LdVendorConstraintNameAutoBarCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;LdVendorConstraintNameAutoBar&gt; vendorConstraintNameAutoBarList = vendorConstraintNameAutoBarBhv.<span style="color: #FD4747">selectList</span>(cb);
     * for (LdVendorConstraintNameAutoBar vendorConstraintNameAutoBar : vendorConstraintNameAutoBarList) {
     *     ... = vendorConstraintNameAutoBar.get...();
     * }
     * </pre>
     * @param cb The condition-bean of LdVendorConstraintNameAutoBar. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<LdVendorConstraintNameAutoBar> selectList(LdVendorConstraintNameAutoBarCB cb) {
        return doSelectList(cb, LdVendorConstraintNameAutoBar.class);
    }

    protected <ENTITY extends LdVendorConstraintNameAutoBar> ListResultBean<ENTITY> doSelectList(LdVendorConstraintNameAutoBarCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        return helpSelectListInternally(cb, tp, new InternalSelectListCallback<ENTITY, LdVendorConstraintNameAutoBarCB>() {
            public List<ENTITY> callbackSelectList(LdVendorConstraintNameAutoBarCB cb, Class<ENTITY> tp) { return delegateSelectList(cb, tp); } });
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
     * LdVendorConstraintNameAutoBarCB cb = new LdVendorConstraintNameAutoBarCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #FD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;LdVendorConstraintNameAutoBar&gt; page = vendorConstraintNameAutoBarBhv.<span style="color: #FD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (LdVendorConstraintNameAutoBar vendorConstraintNameAutoBar : page) {
     *     ... = vendorConstraintNameAutoBar.get...();
     * }
     * </pre>
     * @param cb The condition-bean of LdVendorConstraintNameAutoBar. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<LdVendorConstraintNameAutoBar> selectPage(LdVendorConstraintNameAutoBarCB cb) {
        return doSelectPage(cb, LdVendorConstraintNameAutoBar.class);
    }

    protected <ENTITY extends LdVendorConstraintNameAutoBar> PagingResultBean<ENTITY> doSelectPage(LdVendorConstraintNameAutoBarCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectPageInternally(cb, tp, new InternalSelectPageCallback<ENTITY, LdVendorConstraintNameAutoBarCB>() {
            public int callbackSelectCount(LdVendorConstraintNameAutoBarCB cb) { return doSelectCountPlainly(cb); }
            public List<ENTITY> callbackSelectList(LdVendorConstraintNameAutoBarCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); }
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
     * LdVendorConstraintNameAutoBarCB cb = new LdVendorConstraintNameAutoBarCB();
     * cb.query().setFoo...(value);
     * vendorConstraintNameAutoBarBhv.<span style="color: #FD4747">selectCursor</span>(cb, new EntityRowHandler&lt;LdVendorConstraintNameAutoBar&gt;() {
     *     public void handle(LdVendorConstraintNameAutoBar entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of LdVendorConstraintNameAutoBar. (NotNull)
     * @param entityRowHandler The handler of entity row of LdVendorConstraintNameAutoBar. (NotNull)
     */
    public void selectCursor(LdVendorConstraintNameAutoBarCB cb, EntityRowHandler<LdVendorConstraintNameAutoBar> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, LdVendorConstraintNameAutoBar.class);
    }

    protected <ENTITY extends LdVendorConstraintNameAutoBar> void doSelectCursor(LdVendorConstraintNameAutoBarCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler", handler); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        helpSelectCursorInternally(cb, handler, tp, new InternalSelectCursorCallback<ENTITY, LdVendorConstraintNameAutoBarCB>() {
            public void callbackSelectCursor(LdVendorConstraintNameAutoBarCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) { delegateSelectCursor(cb, handler, tp); }
            public List<ENTITY> callbackSelectList(LdVendorConstraintNameAutoBarCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); }
        });
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * vendorConstraintNameAutoBarBhv.<span style="color: #FD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(LdVendorConstraintNameAutoBarCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> SLFunction<LdVendorConstraintNameAutoBarCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
    }

    protected <RESULT, CB extends LdVendorConstraintNameAutoBarCB> SLFunction<CB, RESULT> doScalarSelect(Class<RESULT> tp, CB cb) {
        assertObjectNotNull("resultType", tp); assertCBStateValid(cb);
        cb.xsetupForScalarSelect(); cb.getSqlClause().disableSelectIndex(); // for when you use union
        return createSLFunction(cb, tp);
    }

    protected <RESULT, CB extends LdVendorConstraintNameAutoBarCB> SLFunction<CB, RESULT> createSLFunction(CB cb, Class<RESULT> tp) {
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
     * @param vendorConstraintNameAutoBar The entity of vendorConstraintNameAutoBar. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     */
    public void loadVendorConstraintNameAutoRefList(LdVendorConstraintNameAutoBar vendorConstraintNameAutoBar, ConditionBeanSetupper<LdVendorConstraintNameAutoRefCB> conditionBeanSetupper) {
        xassLRArg(vendorConstraintNameAutoBar, conditionBeanSetupper);
        loadVendorConstraintNameAutoRefList(xnewLRLs(vendorConstraintNameAutoBar), conditionBeanSetupper);
    }
    /**
     * Load referrer of vendorConstraintNameAutoRefList with the set-upper for condition-bean of referrer. <br />
     * VENDOR_CONSTRAINT_NAME_AUTO_REF by CONSTRAINT_NAME_AUTO_BAR_ID, named 'vendorConstraintNameAutoRefList'.
     * <pre>
     * vendorConstraintNameAutoBarBhv.<span style="color: #FD4747">loadVendorConstraintNameAutoRefList</span>(vendorConstraintNameAutoBarList, new ConditionBeanSetupper&lt;LdVendorConstraintNameAutoRefCB&gt;() {
     *     public void setup(LdVendorConstraintNameAutoRefCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...(); <span style="color: #3F7E5E">// basically you should order referrer list</span>
     *     }
     * });
     * for (LdVendorConstraintNameAutoBar vendorConstraintNameAutoBar : vendorConstraintNameAutoBarList) {
     *     ... = vendorConstraintNameAutoBar.<span style="color: #FD4747">getVendorConstraintNameAutoRefList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key(and others too) is treated as case-insensitive. <br />
     * The condition-bean that the set-upper provides have settings before you touch it. It is as follows:
     * <pre>
     * cb.query().setConstraintNameAutoBarId_InScope(pkList);
     * cb.query().addOrderBy_ConstraintNameAutoBarId_Asc();
     * </pre>
     * @param vendorConstraintNameAutoBarList The entity list of vendorConstraintNameAutoBar. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     */
    public void loadVendorConstraintNameAutoRefList(List<LdVendorConstraintNameAutoBar> vendorConstraintNameAutoBarList, ConditionBeanSetupper<LdVendorConstraintNameAutoRefCB> conditionBeanSetupper) {
        xassLRArg(vendorConstraintNameAutoBarList, conditionBeanSetupper);
        loadVendorConstraintNameAutoRefList(vendorConstraintNameAutoBarList, new LoadReferrerOption<LdVendorConstraintNameAutoRefCB, LdVendorConstraintNameAutoRef>().xinit(conditionBeanSetupper));
    }
    /**
     * {Refer to overload method that has an argument of the list of entity.}
     * @param vendorConstraintNameAutoBar The entity of vendorConstraintNameAutoBar. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadVendorConstraintNameAutoRefList(LdVendorConstraintNameAutoBar vendorConstraintNameAutoBar, LoadReferrerOption<LdVendorConstraintNameAutoRefCB, LdVendorConstraintNameAutoRef> loadReferrerOption) {
        xassLRArg(vendorConstraintNameAutoBar, loadReferrerOption);
        loadVendorConstraintNameAutoRefList(xnewLRLs(vendorConstraintNameAutoBar), loadReferrerOption);
    }
    /**
     * {Refer to overload method that has an argument of condition-bean setupper.}
     * @param vendorConstraintNameAutoBarList The entity list of vendorConstraintNameAutoBar. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadVendorConstraintNameAutoRefList(List<LdVendorConstraintNameAutoBar> vendorConstraintNameAutoBarList, LoadReferrerOption<LdVendorConstraintNameAutoRefCB, LdVendorConstraintNameAutoRef> loadReferrerOption) {
        xassLRArg(vendorConstraintNameAutoBarList, loadReferrerOption);
        if (vendorConstraintNameAutoBarList.isEmpty()) { return; }
        final LdVendorConstraintNameAutoRefBhv referrerBhv = xgetBSFLR().select(LdVendorConstraintNameAutoRefBhv.class);
        helpLoadReferrerInternally(vendorConstraintNameAutoBarList, loadReferrerOption, new InternalLoadReferrerCallback<LdVendorConstraintNameAutoBar, java.math.BigDecimal, LdVendorConstraintNameAutoRefCB, LdVendorConstraintNameAutoRef>() {
            public java.math.BigDecimal getPKVal(LdVendorConstraintNameAutoBar et)
            { return et.getConstraintNameAutoBarId(); }
            public void setRfLs(LdVendorConstraintNameAutoBar et, List<LdVendorConstraintNameAutoRef> ls)
            { et.setVendorConstraintNameAutoRefList(ls); }
            public LdVendorConstraintNameAutoRefCB newMyCB() { return referrerBhv.newMyConditionBean(); }
            public void qyFKIn(LdVendorConstraintNameAutoRefCB cb, List<java.math.BigDecimal> ls)
            { cb.query().setConstraintNameAutoBarId_InScope(ls); }
            public void qyOdFKAsc(LdVendorConstraintNameAutoRefCB cb) { cb.query().addOrderBy_ConstraintNameAutoBarId_Asc(); }
            public void spFKCol(LdVendorConstraintNameAutoRefCB cb) { cb.specify().columnConstraintNameAutoBarId(); }
            public List<LdVendorConstraintNameAutoRef> selRfLs(LdVendorConstraintNameAutoRefCB cb) { return referrerBhv.selectList(cb); }
            public java.math.BigDecimal getFKVal(LdVendorConstraintNameAutoRef re) { return re.getConstraintNameAutoBarId(); }
            public void setlcEt(LdVendorConstraintNameAutoRef re, LdVendorConstraintNameAutoBar le)
            { re.setVendorConstraintNameAutoBar(le); }
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
     * Extract the value list of (single) primary key constraintNameAutoBarId.
     * @param vendorConstraintNameAutoBarList The list of vendorConstraintNameAutoBar. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<java.math.BigDecimal> extractConstraintNameAutoBarIdList(List<LdVendorConstraintNameAutoBar> vendorConstraintNameAutoBarList) {
        return helpExtractListInternally(vendorConstraintNameAutoBarList, new InternalExtractCallback<LdVendorConstraintNameAutoBar, java.math.BigDecimal>() {
            public java.math.BigDecimal getCV(LdVendorConstraintNameAutoBar et) { return et.getConstraintNameAutoBarId(); }
        });
    }

    /**
     * Extract the value list of (single) unique key constraintNameAutoBarName.
     * @param vendorConstraintNameAutoBarList The list of vendorConstraintNameAutoBar. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<String> extractConstraintNameAutoBarNameList(List<LdVendorConstraintNameAutoBar> vendorConstraintNameAutoBarList) {
        return helpExtractListInternally(vendorConstraintNameAutoBarList, new InternalExtractCallback<LdVendorConstraintNameAutoBar, String>() {
            public String getCV(LdVendorConstraintNameAutoBar et) { return et.getConstraintNameAutoBarName(); }
        });
    }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * LdVendorConstraintNameAutoBar vendorConstraintNameAutoBar = new LdVendorConstraintNameAutoBar();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * vendorConstraintNameAutoBar.setFoo...(value);
     * vendorConstraintNameAutoBar.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//vendorConstraintNameAutoBar.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//vendorConstraintNameAutoBar.set...;</span>
     * vendorConstraintNameAutoBarBhv.<span style="color: #FD4747">insert</span>(vendorConstraintNameAutoBar);
     * ... = vendorConstraintNameAutoBar.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param vendorConstraintNameAutoBar The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(LdVendorConstraintNameAutoBar vendorConstraintNameAutoBar) {
        doInsert(vendorConstraintNameAutoBar, null);
    }

    protected void doInsert(LdVendorConstraintNameAutoBar vendorConstraintNameAutoBar, InsertOption<LdVendorConstraintNameAutoBarCB> op) {
        assertObjectNotNull("vendorConstraintNameAutoBar", vendorConstraintNameAutoBar);
        prepareInsertOption(op);
        delegateInsert(vendorConstraintNameAutoBar, op);
    }

    protected void prepareInsertOption(InsertOption<LdVendorConstraintNameAutoBarCB> op) {
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
     * LdVendorConstraintNameAutoBar vendorConstraintNameAutoBar = new LdVendorConstraintNameAutoBar();
     * vendorConstraintNameAutoBar.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * vendorConstraintNameAutoBar.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//vendorConstraintNameAutoBar.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//vendorConstraintNameAutoBar.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * vendorConstraintNameAutoBar.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     vendorConstraintNameAutoBarBhv.<span style="color: #FD4747">update</span>(vendorConstraintNameAutoBar);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param vendorConstraintNameAutoBar The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(final LdVendorConstraintNameAutoBar vendorConstraintNameAutoBar) {
        doUpdate(vendorConstraintNameAutoBar, null);
    }

    protected void doUpdate(LdVendorConstraintNameAutoBar vendorConstraintNameAutoBar, final UpdateOption<LdVendorConstraintNameAutoBarCB> op) {
        assertObjectNotNull("vendorConstraintNameAutoBar", vendorConstraintNameAutoBar);
        prepareUpdateOption(op);
        helpUpdateInternally(vendorConstraintNameAutoBar, new InternalUpdateCallback<LdVendorConstraintNameAutoBar>() {
            public int callbackDelegateUpdate(LdVendorConstraintNameAutoBar et) { return delegateUpdate(et, op); } });
    }

    protected void prepareUpdateOption(UpdateOption<LdVendorConstraintNameAutoBarCB> op) {
        if (op == null) { return; }
        assertUpdateOptionStatus(op);
        if (op.hasSelfSpecification()) {
            op.resolveSelfSpecification(createCBForVaryingUpdate());
        }
        if (op.hasSpecifiedUpdateColumn()) {
            op.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    protected LdVendorConstraintNameAutoBarCB createCBForVaryingUpdate() {
        LdVendorConstraintNameAutoBarCB cb = newMyConditionBean();
        cb.xsetupForVaryingUpdate();
        return cb;
    }

    protected LdVendorConstraintNameAutoBarCB createCBForSpecifiedUpdate() {
        LdVendorConstraintNameAutoBarCB cb = newMyConditionBean();
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
     * @param vendorConstraintNameAutoBar The entity of insert or update target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(LdVendorConstraintNameAutoBar vendorConstraintNameAutoBar) {
        doInesrtOrUpdate(vendorConstraintNameAutoBar, null, null);
    }

    protected void doInesrtOrUpdate(LdVendorConstraintNameAutoBar vendorConstraintNameAutoBar, final InsertOption<LdVendorConstraintNameAutoBarCB> iop, final UpdateOption<LdVendorConstraintNameAutoBarCB> uop) {
        helpInsertOrUpdateInternally(vendorConstraintNameAutoBar, new InternalInsertOrUpdateCallback<LdVendorConstraintNameAutoBar, LdVendorConstraintNameAutoBarCB>() {
            public void callbackInsert(LdVendorConstraintNameAutoBar et) { doInsert(et, iop); }
            public void callbackUpdate(LdVendorConstraintNameAutoBar et) { doUpdate(et, uop); }
            public LdVendorConstraintNameAutoBarCB callbackNewMyConditionBean() { return newMyConditionBean(); }
            public int callbackSelectCount(LdVendorConstraintNameAutoBarCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrModify(Entity et, InsertOption<? extends ConditionBean> iop, UpdateOption<? extends ConditionBean> uop) {
        if (iop == null && uop == null) { insertOrUpdate(downcast(et)); }
        else {
            iop = iop != null ? iop : new InsertOption<LdVendorConstraintNameAutoBarCB>();
            uop = uop != null ? uop : new UpdateOption<LdVendorConstraintNameAutoBarCB>();
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
     * LdVendorConstraintNameAutoBar vendorConstraintNameAutoBar = new LdVendorConstraintNameAutoBar();
     * vendorConstraintNameAutoBar.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * vendorConstraintNameAutoBar.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     vendorConstraintNameAutoBarBhv.<span style="color: #FD4747">delete</span>(vendorConstraintNameAutoBar);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param vendorConstraintNameAutoBar The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(LdVendorConstraintNameAutoBar vendorConstraintNameAutoBar) {
        doDelete(vendorConstraintNameAutoBar, null);
    }

    protected void doDelete(LdVendorConstraintNameAutoBar vendorConstraintNameAutoBar, final DeleteOption<LdVendorConstraintNameAutoBarCB> op) {
        assertObjectNotNull("vendorConstraintNameAutoBar", vendorConstraintNameAutoBar);
        prepareDeleteOption(op);
        helpDeleteInternally(vendorConstraintNameAutoBar, new InternalDeleteCallback<LdVendorConstraintNameAutoBar>() {
            public int callbackDelegateDelete(LdVendorConstraintNameAutoBar et) { return delegateDelete(et, op); } });
    }

    protected void prepareDeleteOption(DeleteOption<LdVendorConstraintNameAutoBarCB> op) {
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
     *     LdVendorConstraintNameAutoBar vendorConstraintNameAutoBar = new LdVendorConstraintNameAutoBar();
     *     vendorConstraintNameAutoBar.setFooName("foo");
     *     if (...) {
     *         vendorConstraintNameAutoBar.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     vendorConstraintNameAutoBarList.add(vendorConstraintNameAutoBar);
     * }
     * vendorConstraintNameAutoBarBhv.<span style="color: #FD4747">batchInsert</span>(vendorConstraintNameAutoBarList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param vendorConstraintNameAutoBarList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<LdVendorConstraintNameAutoBar> vendorConstraintNameAutoBarList) {
        InsertOption<LdVendorConstraintNameAutoBarCB> op = createInsertUpdateOption();
        return doBatchInsert(vendorConstraintNameAutoBarList, op);
    }

    protected int[] doBatchInsert(List<LdVendorConstraintNameAutoBar> vendorConstraintNameAutoBarList, InsertOption<LdVendorConstraintNameAutoBarCB> op) {
        assertObjectNotNull("vendorConstraintNameAutoBarList", vendorConstraintNameAutoBarList);
        prepareBatchInsertOption(vendorConstraintNameAutoBarList, op);
        return delegateBatchInsert(vendorConstraintNameAutoBarList, op);
    }

    protected void prepareBatchInsertOption(List<LdVendorConstraintNameAutoBar> vendorConstraintNameAutoBarList, InsertOption<LdVendorConstraintNameAutoBarCB> op) {
        op.xallowInsertColumnModifiedPropertiesFragmented();
        op.xacceptInsertColumnModifiedPropertiesIfNeeds(vendorConstraintNameAutoBarList);
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
     *     LdVendorConstraintNameAutoBar vendorConstraintNameAutoBar = new LdVendorConstraintNameAutoBar();
     *     vendorConstraintNameAutoBar.setFooName("foo");
     *     if (...) {
     *         vendorConstraintNameAutoBar.setFooPrice(123);
     *     } else {
     *         vendorConstraintNameAutoBar.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//vendorConstraintNameAutoBar.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     vendorConstraintNameAutoBarList.add(vendorConstraintNameAutoBar);
     * }
     * vendorConstraintNameAutoBarBhv.<span style="color: #FD4747">batchUpdate</span>(vendorConstraintNameAutoBarList);
     * </pre>
     * @param vendorConstraintNameAutoBarList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<LdVendorConstraintNameAutoBar> vendorConstraintNameAutoBarList) {
        UpdateOption<LdVendorConstraintNameAutoBarCB> op = createPlainUpdateOption();
        return doBatchUpdate(vendorConstraintNameAutoBarList, op);
    }

    protected int[] doBatchUpdate(List<LdVendorConstraintNameAutoBar> vendorConstraintNameAutoBarList, UpdateOption<LdVendorConstraintNameAutoBarCB> op) {
        assertObjectNotNull("vendorConstraintNameAutoBarList", vendorConstraintNameAutoBarList);
        prepareBatchUpdateOption(vendorConstraintNameAutoBarList, op);
        return delegateBatchUpdate(vendorConstraintNameAutoBarList, op);
    }

    protected void prepareBatchUpdateOption(List<LdVendorConstraintNameAutoBar> vendorConstraintNameAutoBarList, UpdateOption<LdVendorConstraintNameAutoBarCB> op) {
        op.xacceptUpdateColumnModifiedPropertiesIfNeeds(vendorConstraintNameAutoBarList);
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
     * vendorConstraintNameAutoBarBhv.<span style="color: #FD4747">batchUpdate</span>(vendorConstraintNameAutoBarList, new SpecifyQuery<LdVendorConstraintNameAutoBarCB>() {
     *     public void specify(LdVendorConstraintNameAutoBarCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #FD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #FD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * vendorConstraintNameAutoBarBhv.<span style="color: #FD4747">batchUpdate</span>(vendorConstraintNameAutoBarList, new SpecifyQuery<LdVendorConstraintNameAutoBarCB>() {
     *     public void specify(LdVendorConstraintNameAutoBarCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #FD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param vendorConstraintNameAutoBarList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<LdVendorConstraintNameAutoBar> vendorConstraintNameAutoBarList, SpecifyQuery<LdVendorConstraintNameAutoBarCB> updateColumnSpec) {
        return doBatchUpdate(vendorConstraintNameAutoBarList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> op) {
        return doLumpModify(ls, op);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param vendorConstraintNameAutoBarList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<LdVendorConstraintNameAutoBar> vendorConstraintNameAutoBarList) {
        return doBatchDelete(vendorConstraintNameAutoBarList, null);
    }

    protected int[] doBatchDelete(List<LdVendorConstraintNameAutoBar> vendorConstraintNameAutoBarList, DeleteOption<LdVendorConstraintNameAutoBarCB> op) {
        assertObjectNotNull("vendorConstraintNameAutoBarList", vendorConstraintNameAutoBarList);
        prepareDeleteOption(op);
        return delegateBatchDelete(vendorConstraintNameAutoBarList, op);
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
     * vendorConstraintNameAutoBarBhv.<span style="color: #FD4747">queryInsert</span>(new QueryInsertSetupper&lt;LdVendorConstraintNameAutoBar, LdVendorConstraintNameAutoBarCB&gt;() {
     *     public ConditionBean setup(vendorConstraintNameAutoBar entity, LdVendorConstraintNameAutoBarCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<LdVendorConstraintNameAutoBar, LdVendorConstraintNameAutoBarCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(QueryInsertSetupper<LdVendorConstraintNameAutoBar, LdVendorConstraintNameAutoBarCB> sp, InsertOption<LdVendorConstraintNameAutoBarCB> op) {
        assertObjectNotNull("setupper", sp);
        prepareInsertOption(op);
        LdVendorConstraintNameAutoBar e = new LdVendorConstraintNameAutoBar();
        LdVendorConstraintNameAutoBarCB cb = createCBForQueryInsert();
        return delegateQueryInsert(e, cb, sp.setup(e, cb), op);
    }

    protected LdVendorConstraintNameAutoBarCB createCBForQueryInsert() {
        LdVendorConstraintNameAutoBarCB cb = newMyConditionBean();
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
     * LdVendorConstraintNameAutoBar vendorConstraintNameAutoBar = new LdVendorConstraintNameAutoBar();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//vendorConstraintNameAutoBar.setPK...(value);</span>
     * vendorConstraintNameAutoBar.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//vendorConstraintNameAutoBar.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//vendorConstraintNameAutoBar.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//vendorConstraintNameAutoBar.setVersionNo(value);</span>
     * LdVendorConstraintNameAutoBarCB cb = new LdVendorConstraintNameAutoBarCB();
     * cb.query().setFoo...(value);
     * vendorConstraintNameAutoBarBhv.<span style="color: #FD4747">queryUpdate</span>(vendorConstraintNameAutoBar, cb);
     * </pre>
     * @param vendorConstraintNameAutoBar The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of LdVendorConstraintNameAutoBar. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(LdVendorConstraintNameAutoBar vendorConstraintNameAutoBar, LdVendorConstraintNameAutoBarCB cb) {
        return doQueryUpdate(vendorConstraintNameAutoBar, cb, null);
    }

    protected int doQueryUpdate(LdVendorConstraintNameAutoBar vendorConstraintNameAutoBar, LdVendorConstraintNameAutoBarCB cb, UpdateOption<LdVendorConstraintNameAutoBarCB> op) {
        assertObjectNotNull("vendorConstraintNameAutoBar", vendorConstraintNameAutoBar); assertCBStateValid(cb);
        prepareUpdateOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryUpdate(vendorConstraintNameAutoBar, cb, op) : 0;
    }

    @Override
    protected int doRangeModify(Entity et, ConditionBean cb, UpdateOption<? extends ConditionBean> op) {
        if (op == null) { return queryUpdate(downcast(et), (LdVendorConstraintNameAutoBarCB)cb); }
        else { return varyingQueryUpdate(downcast(et), (LdVendorConstraintNameAutoBarCB)cb, downcast(op)); }
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * LdVendorConstraintNameAutoBarCB cb = new LdVendorConstraintNameAutoBarCB();
     * cb.query().setFoo...(value);
     * vendorConstraintNameAutoBarBhv.<span style="color: #FD4747">queryDelete</span>(vendorConstraintNameAutoBar, cb);
     * </pre>
     * @param cb The condition-bean of LdVendorConstraintNameAutoBar. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(LdVendorConstraintNameAutoBarCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(LdVendorConstraintNameAutoBarCB cb, DeleteOption<LdVendorConstraintNameAutoBarCB> op) {
        assertCBStateValid(cb);
        prepareDeleteOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryDelete(cb, op) : 0;
    }

    @Override
    protected int doRangeRemove(ConditionBean cb, DeleteOption<? extends ConditionBean> op) {
        if (op == null) { return queryDelete((LdVendorConstraintNameAutoBarCB)cb); }
        else { return varyingQueryDelete((LdVendorConstraintNameAutoBarCB)cb, downcast(op)); }
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
     * LdVendorConstraintNameAutoBar vendorConstraintNameAutoBar = new LdVendorConstraintNameAutoBar();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * vendorConstraintNameAutoBar.setFoo...(value);
     * vendorConstraintNameAutoBar.setBar...(value);
     * InsertOption<LdVendorConstraintNameAutoBarCB> option = new InsertOption<LdVendorConstraintNameAutoBarCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * vendorConstraintNameAutoBarBhv.<span style="color: #FD4747">varyingInsert</span>(vendorConstraintNameAutoBar, option);
     * ... = vendorConstraintNameAutoBar.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param vendorConstraintNameAutoBar The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(LdVendorConstraintNameAutoBar vendorConstraintNameAutoBar, InsertOption<LdVendorConstraintNameAutoBarCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(vendorConstraintNameAutoBar, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * LdVendorConstraintNameAutoBar vendorConstraintNameAutoBar = new LdVendorConstraintNameAutoBar();
     * vendorConstraintNameAutoBar.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * vendorConstraintNameAutoBar.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * vendorConstraintNameAutoBar.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;LdVendorConstraintNameAutoBarCB&gt; option = new UpdateOption&lt;LdVendorConstraintNameAutoBarCB&gt;();
     *     option.self(new SpecifyQuery&lt;LdVendorConstraintNameAutoBarCB&gt;() {
     *         public void specify(LdVendorConstraintNameAutoBarCB cb) {
     *             cb.specify().<span style="color: #FD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     vendorConstraintNameAutoBarBhv.<span style="color: #FD4747">varyingUpdate</span>(vendorConstraintNameAutoBar, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param vendorConstraintNameAutoBar The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(LdVendorConstraintNameAutoBar vendorConstraintNameAutoBar, UpdateOption<LdVendorConstraintNameAutoBarCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(vendorConstraintNameAutoBar, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param vendorConstraintNameAutoBar The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(LdVendorConstraintNameAutoBar vendorConstraintNameAutoBar, InsertOption<LdVendorConstraintNameAutoBarCB> insertOption, UpdateOption<LdVendorConstraintNameAutoBarCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdate(vendorConstraintNameAutoBar, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param vendorConstraintNameAutoBar The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(LdVendorConstraintNameAutoBar vendorConstraintNameAutoBar, DeleteOption<LdVendorConstraintNameAutoBarCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(vendorConstraintNameAutoBar, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param vendorConstraintNameAutoBarList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<LdVendorConstraintNameAutoBar> vendorConstraintNameAutoBarList, InsertOption<LdVendorConstraintNameAutoBarCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(vendorConstraintNameAutoBarList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param vendorConstraintNameAutoBarList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<LdVendorConstraintNameAutoBar> vendorConstraintNameAutoBarList, UpdateOption<LdVendorConstraintNameAutoBarCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(vendorConstraintNameAutoBarList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param vendorConstraintNameAutoBarList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<LdVendorConstraintNameAutoBar> vendorConstraintNameAutoBarList, DeleteOption<LdVendorConstraintNameAutoBarCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(vendorConstraintNameAutoBarList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<LdVendorConstraintNameAutoBar, LdVendorConstraintNameAutoBarCB> setupper, InsertOption<LdVendorConstraintNameAutoBarCB> option) {
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
     * LdVendorConstraintNameAutoBar vendorConstraintNameAutoBar = new LdVendorConstraintNameAutoBar();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//vendorConstraintNameAutoBar.setPK...(value);</span>
     * vendorConstraintNameAutoBar.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//vendorConstraintNameAutoBar.setVersionNo(value);</span>
     * LdVendorConstraintNameAutoBarCB cb = new LdVendorConstraintNameAutoBarCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;LdVendorConstraintNameAutoBarCB&gt; option = new UpdateOption&lt;LdVendorConstraintNameAutoBarCB&gt;();
     * option.self(new SpecifyQuery&lt;LdVendorConstraintNameAutoBarCB&gt;() {
     *     public void specify(LdVendorConstraintNameAutoBarCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * vendorConstraintNameAutoBarBhv.<span style="color: #FD4747">varyingQueryUpdate</span>(vendorConstraintNameAutoBar, cb, option);
     * </pre>
     * @param vendorConstraintNameAutoBar The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of LdVendorConstraintNameAutoBar. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(LdVendorConstraintNameAutoBar vendorConstraintNameAutoBar, LdVendorConstraintNameAutoBarCB cb, UpdateOption<LdVendorConstraintNameAutoBarCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(vendorConstraintNameAutoBar, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of LdVendorConstraintNameAutoBar. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(LdVendorConstraintNameAutoBarCB cb, DeleteOption<LdVendorConstraintNameAutoBarCB> option) {
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
    public OutsideSqlBasicExecutor<LdVendorConstraintNameAutoBarBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCountUniquely(LdVendorConstraintNameAutoBarCB cb) { return invoke(createSelectCountCBCommand(cb, true)); }
    protected int delegateSelectCountPlainly(LdVendorConstraintNameAutoBarCB cb) { return invoke(createSelectCountCBCommand(cb, false)); }
    protected <ENTITY extends LdVendorConstraintNameAutoBar> void delegateSelectCursor(LdVendorConstraintNameAutoBarCB cb, EntityRowHandler<ENTITY> rh, Class<ENTITY> tp)
    { invoke(createSelectCursorCBCommand(cb, rh, tp)); }
    protected <ENTITY extends LdVendorConstraintNameAutoBar> List<ENTITY> delegateSelectList(LdVendorConstraintNameAutoBarCB cb, Class<ENTITY> tp)
    { return invoke(createSelectListCBCommand(cb, tp)); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(LdVendorConstraintNameAutoBar et, InsertOption<LdVendorConstraintNameAutoBarCB> op)
    { if (!processBeforeInsert(et, op)) { return 0; }
      return invoke(createInsertEntityCommand(et, op)); }
    protected int delegateUpdate(LdVendorConstraintNameAutoBar et, UpdateOption<LdVendorConstraintNameAutoBarCB> op)
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return delegateUpdateNonstrict(et, op); }
    protected int delegateUpdateNonstrict(LdVendorConstraintNameAutoBar et, UpdateOption<LdVendorConstraintNameAutoBarCB> op)
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return invoke(createUpdateNonstrictEntityCommand(et, op)); }
    protected int delegateDelete(LdVendorConstraintNameAutoBar et, DeleteOption<LdVendorConstraintNameAutoBarCB> op)
    { if (!processBeforeDelete(et, op)) { return 0; }
      return delegateDeleteNonstrict(et, op); }
    protected int delegateDeleteNonstrict(LdVendorConstraintNameAutoBar et, DeleteOption<LdVendorConstraintNameAutoBarCB> op)
    { if (!processBeforeDelete(et, op)) { return 0; }
      return invoke(createDeleteNonstrictEntityCommand(et, op)); }

    protected int[] delegateBatchInsert(List<LdVendorConstraintNameAutoBar> ls, InsertOption<LdVendorConstraintNameAutoBarCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchInsertCommand(processBatchInternally(ls, op), op)); }
    protected int[] delegateBatchUpdate(List<LdVendorConstraintNameAutoBar> ls, UpdateOption<LdVendorConstraintNameAutoBarCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchUpdateNonstrict(ls, op); }
    protected int[] delegateBatchUpdateNonstrict(List<LdVendorConstraintNameAutoBar> ls, UpdateOption<LdVendorConstraintNameAutoBarCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateNonstrictCommand(processBatchInternally(ls, op, true), op)); }
    protected int[] delegateBatchDelete(List<LdVendorConstraintNameAutoBar> ls, DeleteOption<LdVendorConstraintNameAutoBarCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchDeleteNonstrict(ls, op); }
    protected int[] delegateBatchDeleteNonstrict(List<LdVendorConstraintNameAutoBar> ls, DeleteOption<LdVendorConstraintNameAutoBarCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteNonstrictCommand(processBatchInternally(ls, op, true), op)); }

    protected int delegateQueryInsert(LdVendorConstraintNameAutoBar et, LdVendorConstraintNameAutoBarCB inCB, ConditionBean resCB, InsertOption<LdVendorConstraintNameAutoBarCB> op)
    { if (!processBeforeQueryInsert(et, inCB, resCB, op)) { return 0; } return invoke(createQueryInsertCBCommand(et, inCB, resCB, op));  }
    protected int delegateQueryUpdate(LdVendorConstraintNameAutoBar et, LdVendorConstraintNameAutoBarCB cb, UpdateOption<LdVendorConstraintNameAutoBarCB> op)
    { if (!processBeforeQueryUpdate(et, cb, op)) { return 0; } return invoke(createQueryUpdateCBCommand(et, cb, op));  }
    protected int delegateQueryDelete(LdVendorConstraintNameAutoBarCB cb, DeleteOption<LdVendorConstraintNameAutoBarCB> op)
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
    protected LdVendorConstraintNameAutoBar downcast(Entity et) {
        return helpEntityDowncastInternally(et, LdVendorConstraintNameAutoBar.class);
    }

    protected LdVendorConstraintNameAutoBarCB downcast(ConditionBean cb) {
        return helpConditionBeanDowncastInternally(cb, LdVendorConstraintNameAutoBarCB.class);
    }

    @SuppressWarnings("unchecked")
    protected List<LdVendorConstraintNameAutoBar> downcast(List<? extends Entity> ls) {
        return (List<LdVendorConstraintNameAutoBar>)ls;
    }

    @SuppressWarnings("unchecked")
    protected InsertOption<LdVendorConstraintNameAutoBarCB> downcast(InsertOption<? extends ConditionBean> op) {
        return (InsertOption<LdVendorConstraintNameAutoBarCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected UpdateOption<LdVendorConstraintNameAutoBarCB> downcast(UpdateOption<? extends ConditionBean> op) {
        return (UpdateOption<LdVendorConstraintNameAutoBarCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected DeleteOption<LdVendorConstraintNameAutoBarCB> downcast(DeleteOption<? extends ConditionBean> op) {
        return (DeleteOption<LdVendorConstraintNameAutoBarCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<LdVendorConstraintNameAutoBar, LdVendorConstraintNameAutoBarCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> sp) {
        return (QueryInsertSetupper<LdVendorConstraintNameAutoBar, LdVendorConstraintNameAutoBarCB>)sp;
    }
}
