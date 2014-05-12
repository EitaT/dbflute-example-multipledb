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
 * The behavior of VENDOR_CHECK as TABLE. <br />
 * <pre>
 * [primary key]
 *     
 *
 * [column]
 *     VENDOR_CHECK_ID, TYPE_OF_CHAR, TYPE_OF_VARCHAR, TYPE_OF_LONG_VARCHAR, TYPE_OF_CLOB, TYPE_OF_DECIMAL_INTEGER, TYPE_OF_DECIMAL_BIGINT, TYPE_OF_DECIMAL_DECIMAL, TYPE_OF_BIGINT, TYPE_OF_INTEGER, TYPE_OF_DATE, TYPE_OF_TIMESTAMP, TYPE_OF_TIME
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
 *     
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class LdBsVendorCheckBhv extends AbstractBehaviorReadable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "VENDOR_CHECK"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public DBMeta getDBMeta() { return LdVendorCheckDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public LdVendorCheckDbm getMyDBMeta() { return LdVendorCheckDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public Entity newEntity() { return newMyEntity(); }

    /** {@inheritDoc} */
    public ConditionBean newConditionBean() { return newMyConditionBean(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public LdVendorCheck newMyEntity() { return new LdVendorCheck(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public LdVendorCheckCB newMyConditionBean() { return new LdVendorCheckCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * LdVendorCheckCB cb = new LdVendorCheckCB();
     * cb.query().setFoo...(value);
     * int count = vendorCheckBhv.<span style="color: #DD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of LdVendorCheck. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(LdVendorCheckCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(LdVendorCheckCB cb) { // called by selectCount(cb)
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(LdVendorCheckCB cb) { // called by selectPage(cb)
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
     * LdVendorCheckCB cb = new LdVendorCheckCB();
     * cb.query().setFoo...(value);
     * LdVendorCheck vendorCheck = vendorCheckBhv.<span style="color: #DD4747">selectEntity</span>(cb);
     * if (vendorCheck != null) { <span style="color: #3F7E5E">// null check</span>
     *     ... = vendorCheck.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of LdVendorCheck. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public LdVendorCheck selectEntity(LdVendorCheckCB cb) {
        return doSelectEntity(cb, LdVendorCheck.class);
    }

    protected <ENTITY extends LdVendorCheck> ENTITY doSelectEntity(LdVendorCheckCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectEntityInternally(cb, tp, new InternalSelectEntityCallback<ENTITY, LdVendorCheckCB>() {
            public List<ENTITY> callbackSelectList(LdVendorCheckCB lcb, Class<ENTITY> ltp) { return doSelectList(lcb, ltp); } });
    }

    protected <ENTITY extends LdVendorCheck> OptionalEntity<ENTITY> doSelectOptionalEntity(LdVendorCheckCB cb, Class<ENTITY> tp) {
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
     * LdVendorCheckCB cb = new LdVendorCheckCB();
     * cb.query().setFoo...(value);
     * LdVendorCheck vendorCheck = vendorCheckBhv.<span style="color: #DD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = vendorCheck.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of LdVendorCheck. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (point is not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public LdVendorCheck selectEntityWithDeletedCheck(LdVendorCheckCB cb) {
        return doSelectEntityWithDeletedCheck(cb, LdVendorCheck.class);
    }

    protected <ENTITY extends LdVendorCheck> ENTITY doSelectEntityWithDeletedCheck(LdVendorCheckCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectEntityWithDeletedCheckInternally(cb, tp, new InternalSelectEntityWithDeletedCheckCallback<ENTITY, LdVendorCheckCB>() {
            public List<ENTITY> callbackSelectList(LdVendorCheckCB lcb, Class<ENTITY> ltp) { return doSelectList(lcb, ltp); } });
    }

    @Override
    protected Entity doReadEntityWithDeletedCheck(ConditionBean cb) {
        return selectEntityWithDeletedCheck(downcast(cb));
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * LdVendorCheckCB cb = new LdVendorCheckCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;LdVendorCheck&gt; vendorCheckList = vendorCheckBhv.<span style="color: #DD4747">selectList</span>(cb);
     * for (LdVendorCheck vendorCheck : vendorCheckList) {
     *     ... = vendorCheck.get...();
     * }
     * </pre>
     * @param cb The condition-bean of LdVendorCheck. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<LdVendorCheck> selectList(LdVendorCheckCB cb) {
        return doSelectList(cb, LdVendorCheck.class);
    }

    protected <ENTITY extends LdVendorCheck> ListResultBean<ENTITY> doSelectList(LdVendorCheckCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        return helpSelectListInternally(cb, tp, new InternalSelectListCallback<ENTITY, LdVendorCheckCB>() {
            public List<ENTITY> callbackSelectList(LdVendorCheckCB lcb, Class<ENTITY> ltp) { return delegateSelectList(lcb, ltp); } });
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
     * LdVendorCheckCB cb = new LdVendorCheckCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #DD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;LdVendorCheck&gt; page = vendorCheckBhv.<span style="color: #DD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (LdVendorCheck vendorCheck : page) {
     *     ... = vendorCheck.get...();
     * }
     * </pre>
     * @param cb The condition-bean of LdVendorCheck. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<LdVendorCheck> selectPage(LdVendorCheckCB cb) {
        return doSelectPage(cb, LdVendorCheck.class);
    }

    protected <ENTITY extends LdVendorCheck> PagingResultBean<ENTITY> doSelectPage(LdVendorCheckCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectPageInternally(cb, tp, new InternalSelectPageCallback<ENTITY, LdVendorCheckCB>() {
            public int callbackSelectCount(LdVendorCheckCB cb) { return doSelectCountPlainly(cb); }
            public List<ENTITY> callbackSelectList(LdVendorCheckCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); }
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
     * LdVendorCheckCB cb = new LdVendorCheckCB();
     * cb.query().setFoo...(value);
     * vendorCheckBhv.<span style="color: #DD4747">selectCursor</span>(cb, new EntityRowHandler&lt;LdVendorCheck&gt;() {
     *     public void handle(LdVendorCheck entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of LdVendorCheck. (NotNull)
     * @param entityRowHandler The handler of entity row of LdVendorCheck. (NotNull)
     */
    public void selectCursor(LdVendorCheckCB cb, EntityRowHandler<LdVendorCheck> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, LdVendorCheck.class);
    }

    protected <ENTITY extends LdVendorCheck> void doSelectCursor(LdVendorCheckCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler", handler); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        helpSelectCursorInternally(cb, handler, tp, new InternalSelectCursorCallback<ENTITY, LdVendorCheckCB>() {
            public void callbackSelectCursor(LdVendorCheckCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) { delegateSelectCursor(cb, handler, tp); }
            public List<ENTITY> callbackSelectList(LdVendorCheckCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); }
        });
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * vendorCheckBhv.<span style="color: #DD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(LdVendorCheckCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> SLFunction<LdVendorCheckCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
    }

    protected <RESULT, CB extends LdVendorCheckCB> SLFunction<CB, RESULT> doScalarSelect(Class<RESULT> tp, CB cb) {
        assertObjectNotNull("resultType", tp); assertCBStateValid(cb);
        cb.xsetupForScalarSelect(); cb.getSqlClause().disableSelectIndex(); // for when you use union
        return createSLFunction(cb, tp);
    }

    protected <RESULT, CB extends LdVendorCheckCB> SLFunction<CB, RESULT> createSLFunction(CB cb, Class<RESULT> tp) {
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
    //                                                                   Pull out Relation
    //                                                                   =================

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity for a table not defined primary key. <br />
     * The auto-setup for common columns is unsupported.
     * <pre>
     * LdVendorCheck vendorCheck = new LdVendorCheck();
     * vendorCheck.setFoo...(value);
     * vendorCheck.setBar...(value);
     * vendorCheckBhv.<span style="color: #DD4747">insert</span>(vendorCheck);
     * </pre>
     * @param vendorCheck The entity for insert. (NotNull)
     */
    public void insert(LdVendorCheck vendorCheck) {
        assertEntityNotNull(vendorCheck);
        delegateInsert(vendorCheck, null);
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
    public OutsideSqlBasicExecutor<LdVendorCheckBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCountUniquely(LdVendorCheckCB cb) { return invoke(createSelectCountCBCommand(cb, true)); }
    protected int delegateSelectCountPlainly(LdVendorCheckCB cb) { return invoke(createSelectCountCBCommand(cb, false)); }
    protected <ENTITY extends LdVendorCheck> void delegateSelectCursor(LdVendorCheckCB cb, EntityRowHandler<ENTITY> rh, Class<ENTITY> tp)
    { invoke(createSelectCursorCBCommand(cb, rh, tp)); }
    protected <ENTITY extends LdVendorCheck> List<ENTITY> delegateSelectList(LdVendorCheckCB cb, Class<ENTITY> tp)
    { return invoke(createSelectListCBCommand(cb, tp)); }
    protected int delegateInsert(LdVendorCheck et, InsertOption<LdVendorCheckCB> op) {
        // only filtering for extension is supported (filtering for common columns is unsupported)
        assertEntityNotNull(et); filterEntityOfInsert(et, op);
        return invoke(createInsertEntityCommand(et, op));
    }

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
    protected LdVendorCheck downcast(Entity et) {
        return helpEntityDowncastInternally(et, LdVendorCheck.class);
    }

    protected LdVendorCheckCB downcast(ConditionBean cb) {
        return helpConditionBeanDowncastInternally(cb, LdVendorCheckCB.class);
    }

    @SuppressWarnings("unchecked")
    protected List<LdVendorCheck> downcast(List<? extends Entity> ls) {
        return (List<LdVendorCheck>)ls;
    }
}
