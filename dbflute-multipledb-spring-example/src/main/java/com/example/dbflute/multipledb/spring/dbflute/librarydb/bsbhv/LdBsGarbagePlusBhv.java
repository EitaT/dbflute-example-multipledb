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
 * The behavior of GARBAGE_PLUS as TABLE. <br />
 * <pre>
 * [primary key]
 *     
 *
 * [column]
 *     GARBAGE_MEMO, GARBAGE_TIME, GARBAGE_COUNT, R_USER, R_MODULE, R_TIMESTAMP, U_USER, U_MODULE, U_TIMESTAMP
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
public abstract class LdBsGarbagePlusBhv extends AbstractBehaviorReadable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "GARBAGE_PLUS"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public DBMeta getDBMeta() { return LdGarbagePlusDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public LdGarbagePlusDbm getMyDBMeta() { return LdGarbagePlusDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public Entity newEntity() { return newMyEntity(); }

    /** {@inheritDoc} */
    public ConditionBean newConditionBean() { return newMyConditionBean(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public LdGarbagePlus newMyEntity() { return new LdGarbagePlus(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public LdGarbagePlusCB newMyConditionBean() { return new LdGarbagePlusCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * LdGarbagePlusCB cb = new LdGarbagePlusCB();
     * cb.query().setFoo...(value);
     * int count = garbagePlusBhv.<span style="color: #FD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of LdGarbagePlus. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(LdGarbagePlusCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(LdGarbagePlusCB cb) { // called by selectCount(cb)
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(LdGarbagePlusCB cb) { // called by selectPage(cb)
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
     * LdGarbagePlusCB cb = new LdGarbagePlusCB();
     * cb.query().setFoo...(value);
     * LdGarbagePlus garbagePlus = garbagePlusBhv.<span style="color: #FD4747">selectEntity</span>(cb);
     * if (garbagePlus != null) {
     *     ... = garbagePlus.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of LdGarbagePlus. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public LdGarbagePlus selectEntity(LdGarbagePlusCB cb) {
        return doSelectEntity(cb, LdGarbagePlus.class);
    }

    protected <ENTITY extends LdGarbagePlus> ENTITY doSelectEntity(final LdGarbagePlusCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb);
        return helpSelectEntityInternally(cb, tp, new InternalSelectEntityCallback<ENTITY, LdGarbagePlusCB>() {
            public List<ENTITY> callbackSelectList(LdGarbagePlusCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); } });
    }

    @Override
    protected Entity doReadEntity(ConditionBean cb) {
        return selectEntity(downcast(cb));
    }

    /**
     * Select the entity by the condition-bean with deleted check.
     * <pre>
     * LdGarbagePlusCB cb = new LdGarbagePlusCB();
     * cb.query().setFoo...(value);
     * LdGarbagePlus garbagePlus = garbagePlusBhv.<span style="color: #FD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = garbagePlus.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of LdGarbagePlus. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public LdGarbagePlus selectEntityWithDeletedCheck(LdGarbagePlusCB cb) {
        return doSelectEntityWithDeletedCheck(cb, LdGarbagePlus.class);
    }

    protected <ENTITY extends LdGarbagePlus> ENTITY doSelectEntityWithDeletedCheck(final LdGarbagePlusCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb);
        return helpSelectEntityWithDeletedCheckInternally(cb, tp, new InternalSelectEntityWithDeletedCheckCallback<ENTITY, LdGarbagePlusCB>() {
            public List<ENTITY> callbackSelectList(LdGarbagePlusCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); } });
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
     * LdGarbagePlusCB cb = new LdGarbagePlusCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;LdGarbagePlus&gt; garbagePlusList = garbagePlusBhv.<span style="color: #FD4747">selectList</span>(cb);
     * for (LdGarbagePlus garbagePlus : garbagePlusList) {
     *     ... = garbagePlus.get...();
     * }
     * </pre>
     * @param cb The condition-bean of LdGarbagePlus. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<LdGarbagePlus> selectList(LdGarbagePlusCB cb) {
        return doSelectList(cb, LdGarbagePlus.class);
    }

    protected <ENTITY extends LdGarbagePlus> ListResultBean<ENTITY> doSelectList(LdGarbagePlusCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        return helpSelectListInternally(cb, tp, new InternalSelectListCallback<ENTITY, LdGarbagePlusCB>() {
            public List<ENTITY> callbackSelectList(LdGarbagePlusCB cb, Class<ENTITY> tp) { return delegateSelectList(cb, tp); } });
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
     * LdGarbagePlusCB cb = new LdGarbagePlusCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #FD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;LdGarbagePlus&gt; page = garbagePlusBhv.<span style="color: #FD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (LdGarbagePlus garbagePlus : page) {
     *     ... = garbagePlus.get...();
     * }
     * </pre>
     * @param cb The condition-bean of LdGarbagePlus. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<LdGarbagePlus> selectPage(LdGarbagePlusCB cb) {
        return doSelectPage(cb, LdGarbagePlus.class);
    }

    protected <ENTITY extends LdGarbagePlus> PagingResultBean<ENTITY> doSelectPage(LdGarbagePlusCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectPageInternally(cb, tp, new InternalSelectPageCallback<ENTITY, LdGarbagePlusCB>() {
            public int callbackSelectCount(LdGarbagePlusCB cb) { return doSelectCountPlainly(cb); }
            public List<ENTITY> callbackSelectList(LdGarbagePlusCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); }
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
     * LdGarbagePlusCB cb = new LdGarbagePlusCB();
     * cb.query().setFoo...(value);
     * garbagePlusBhv.<span style="color: #FD4747">selectCursor</span>(cb, new EntityRowHandler&lt;LdGarbagePlus&gt;() {
     *     public void handle(LdGarbagePlus entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of LdGarbagePlus. (NotNull)
     * @param entityRowHandler The handler of entity row of LdGarbagePlus. (NotNull)
     */
    public void selectCursor(LdGarbagePlusCB cb, EntityRowHandler<LdGarbagePlus> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, LdGarbagePlus.class);
    }

    protected <ENTITY extends LdGarbagePlus> void doSelectCursor(LdGarbagePlusCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler", handler); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        helpSelectCursorInternally(cb, handler, tp, new InternalSelectCursorCallback<ENTITY, LdGarbagePlusCB>() {
            public void callbackSelectCursor(LdGarbagePlusCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) { delegateSelectCursor(cb, handler, tp); }
            public List<ENTITY> callbackSelectList(LdGarbagePlusCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); }
        });
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * garbagePlusBhv.<span style="color: #FD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(LdGarbagePlusCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> SLFunction<LdGarbagePlusCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
    }

    protected <RESULT, CB extends LdGarbagePlusCB> SLFunction<CB, RESULT> doScalarSelect(Class<RESULT> tp, CB cb) {
        assertObjectNotNull("resultType", tp); assertCBStateValid(cb);
        cb.xsetupForScalarSelect(); cb.getSqlClause().disableSelectIndex(); // for when you use union
        return createSLFunction(cb, tp);
    }

    protected <RESULT, CB extends LdGarbagePlusCB> SLFunction<CB, RESULT> createSLFunction(CB cb, Class<RESULT> tp) {
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
     * LdGarbagePlus garbagePlus = new LdGarbagePlus();
     * garbagePlus.setFoo...(value);
     * garbagePlus.setBar...(value);
     * garbagePlusBhv.<span style="color: #FD4747">insert</span>(garbagePlus);
     * </pre>
     * @param garbagePlus The entity for insert. (NotNull)
     */
    public void insert(LdGarbagePlus garbagePlus) {
        assertEntityNotNull(garbagePlus);
        delegateInsert(garbagePlus, null);
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
    public OutsideSqlBasicExecutor<LdGarbagePlusBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCountUniquely(LdGarbagePlusCB cb) { return invoke(createSelectCountCBCommand(cb, true)); }
    protected int delegateSelectCountPlainly(LdGarbagePlusCB cb) { return invoke(createSelectCountCBCommand(cb, false)); }
    protected <ENTITY extends LdGarbagePlus> void delegateSelectCursor(LdGarbagePlusCB cb, EntityRowHandler<ENTITY> rh, Class<ENTITY> tp)
    { invoke(createSelectCursorCBCommand(cb, rh, tp)); }
    protected <ENTITY extends LdGarbagePlus> List<ENTITY> delegateSelectList(LdGarbagePlusCB cb, Class<ENTITY> tp)
    { return invoke(createSelectListCBCommand(cb, tp)); }
    protected int delegateInsert(LdGarbagePlus et, InsertOption<LdGarbagePlusCB> op) {
        // only filtering for extension is supported (filtering for common columns is unsupported)
        assertEntityNotNull(et); filterEntityOfInsert(et, op);
        return invoke(createInsertEntityCommand(et, op));
    }

    // ===================================================================================
    //                                                                     Filter Override
    //                                                                     ===============
    @Override
    protected void filterEntityOfInsert(Entity tgt, InsertOption<? extends ConditionBean> op) {
        super.filterEntityOfInsert(tgt, op);
        LdGarbagePlus et = downcast(tgt);
        et.setGarbageTime(org.seasar.dbflute.AccessContext.getAccessTimestampOnThread());
        et.setRUser(org.seasar.dbflute.AccessContext.getAccessUserOnThread());
        et.setRTimestamp(org.seasar.dbflute.AccessContext.getAccessTimestampOnThread());
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
        return downcast(et).getUTimestamp() != null;
    }

    // ===================================================================================
    //                                                                     Downcast Helper
    //                                                                     ===============
    protected LdGarbagePlus downcast(Entity et) {
        return helpEntityDowncastInternally(et, LdGarbagePlus.class);
    }

    protected LdGarbagePlusCB downcast(ConditionBean cb) {
        return helpConditionBeanDowncastInternally(cb, LdGarbagePlusCB.class);
    }

    @SuppressWarnings("unchecked")
    protected List<LdGarbagePlus> downcast(List<? extends Entity> ls) {
        return (List<LdGarbagePlus>)ls;
    }
}
