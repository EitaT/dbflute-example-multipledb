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
 * The behavior of COLLECTION_STATUS_LOOKUP as TABLE. <br />
 * <pre>
 * [primary key]
 *     COLLECTION_STATUS_CODE
 *
 * [column]
 *     COLLECTION_STATUS_CODE, COLLECTION_STATUS_NAME, R_USER, R_MODULE, R_TIMESTAMP, U_USER, U_MODULE, U_TIMESTAMP
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
 *     COLLECTION_STATUS
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     collectionStatusList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class LdBsCollectionStatusLookupBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "COLLECTION_STATUS_LOOKUP"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public DBMeta getDBMeta() { return LdCollectionStatusLookupDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public LdCollectionStatusLookupDbm getMyDBMeta() { return LdCollectionStatusLookupDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public Entity newEntity() { return newMyEntity(); }

    /** {@inheritDoc} */
    public ConditionBean newConditionBean() { return newMyConditionBean(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public LdCollectionStatusLookup newMyEntity() { return new LdCollectionStatusLookup(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public LdCollectionStatusLookupCB newMyConditionBean() { return new LdCollectionStatusLookupCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * LdCollectionStatusLookupCB cb = new LdCollectionStatusLookupCB();
     * cb.query().setFoo...(value);
     * int count = collectionStatusLookupBhv.<span style="color: #FD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of LdCollectionStatusLookup. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(LdCollectionStatusLookupCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(LdCollectionStatusLookupCB cb) { // called by selectCount(cb)
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(LdCollectionStatusLookupCB cb) { // called by selectPage(cb)
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
     * LdCollectionStatusLookupCB cb = new LdCollectionStatusLookupCB();
     * cb.query().setFoo...(value);
     * LdCollectionStatusLookup collectionStatusLookup = collectionStatusLookupBhv.<span style="color: #FD4747">selectEntity</span>(cb);
     * if (collectionStatusLookup != null) {
     *     ... = collectionStatusLookup.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of LdCollectionStatusLookup. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public LdCollectionStatusLookup selectEntity(LdCollectionStatusLookupCB cb) {
        return doSelectEntity(cb, LdCollectionStatusLookup.class);
    }

    protected <ENTITY extends LdCollectionStatusLookup> ENTITY doSelectEntity(LdCollectionStatusLookupCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectEntityInternally(cb, tp, new InternalSelectEntityCallback<ENTITY, LdCollectionStatusLookupCB>() {
            public List<ENTITY> callbackSelectList(LdCollectionStatusLookupCB lcb, Class<ENTITY> ltp) { return doSelectList(lcb, ltp); } });
    }

    @Override
    protected Entity doReadEntity(ConditionBean cb) {
        return selectEntity(downcast(cb));
    }

    /**
     * Select the entity by the condition-bean with deleted check.
     * <pre>
     * LdCollectionStatusLookupCB cb = new LdCollectionStatusLookupCB();
     * cb.query().setFoo...(value);
     * LdCollectionStatusLookup collectionStatusLookup = collectionStatusLookupBhv.<span style="color: #FD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = collectionStatusLookup.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of LdCollectionStatusLookup. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public LdCollectionStatusLookup selectEntityWithDeletedCheck(LdCollectionStatusLookupCB cb) {
        return doSelectEntityWithDeletedCheck(cb, LdCollectionStatusLookup.class);
    }

    protected <ENTITY extends LdCollectionStatusLookup> ENTITY doSelectEntityWithDeletedCheck(LdCollectionStatusLookupCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectEntityWithDeletedCheckInternally(cb, tp, new InternalSelectEntityWithDeletedCheckCallback<ENTITY, LdCollectionStatusLookupCB>() {
            public List<ENTITY> callbackSelectList(LdCollectionStatusLookupCB lcb, Class<ENTITY> ltp) { return doSelectList(lcb, ltp); } });
    }

    @Override
    protected Entity doReadEntityWithDeletedCheck(ConditionBean cb) {
        return selectEntityWithDeletedCheck(downcast(cb));
    }

    /**
     * Select the entity by the primary-key value.
     * @param collectionStatusCode The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public LdCollectionStatusLookup selectByPKValue(String collectionStatusCode) {
        return doSelectByPKValue(collectionStatusCode, LdCollectionStatusLookup.class);
    }

    protected <ENTITY extends LdCollectionStatusLookup> ENTITY doSelectByPKValue(String collectionStatusCode, Class<ENTITY> entityType) {
        return doSelectEntity(buildPKCB(collectionStatusCode), entityType);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param collectionStatusCode The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public LdCollectionStatusLookup selectByPKValueWithDeletedCheck(String collectionStatusCode) {
        return doSelectByPKValueWithDeletedCheck(collectionStatusCode, LdCollectionStatusLookup.class);
    }

    protected <ENTITY extends LdCollectionStatusLookup> ENTITY doSelectByPKValueWithDeletedCheck(String collectionStatusCode, Class<ENTITY> entityType) {
        return doSelectEntityWithDeletedCheck(buildPKCB(collectionStatusCode), entityType);
    }

    private LdCollectionStatusLookupCB buildPKCB(String collectionStatusCode) {
        assertObjectNotNull("collectionStatusCode", collectionStatusCode);
        LdCollectionStatusLookupCB cb = newMyConditionBean();
        cb.query().setCollectionStatusCode_Equal(collectionStatusCode);
        return cb;
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * LdCollectionStatusLookupCB cb = new LdCollectionStatusLookupCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;LdCollectionStatusLookup&gt; collectionStatusLookupList = collectionStatusLookupBhv.<span style="color: #FD4747">selectList</span>(cb);
     * for (LdCollectionStatusLookup collectionStatusLookup : collectionStatusLookupList) {
     *     ... = collectionStatusLookup.get...();
     * }
     * </pre>
     * @param cb The condition-bean of LdCollectionStatusLookup. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<LdCollectionStatusLookup> selectList(LdCollectionStatusLookupCB cb) {
        return doSelectList(cb, LdCollectionStatusLookup.class);
    }

    protected <ENTITY extends LdCollectionStatusLookup> ListResultBean<ENTITY> doSelectList(LdCollectionStatusLookupCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        return helpSelectListInternally(cb, tp, new InternalSelectListCallback<ENTITY, LdCollectionStatusLookupCB>() {
            public List<ENTITY> callbackSelectList(LdCollectionStatusLookupCB lcb, Class<ENTITY> ltp) { return delegateSelectList(lcb, ltp); } });
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
     * LdCollectionStatusLookupCB cb = new LdCollectionStatusLookupCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #FD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;LdCollectionStatusLookup&gt; page = collectionStatusLookupBhv.<span style="color: #FD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (LdCollectionStatusLookup collectionStatusLookup : page) {
     *     ... = collectionStatusLookup.get...();
     * }
     * </pre>
     * @param cb The condition-bean of LdCollectionStatusLookup. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<LdCollectionStatusLookup> selectPage(LdCollectionStatusLookupCB cb) {
        return doSelectPage(cb, LdCollectionStatusLookup.class);
    }

    protected <ENTITY extends LdCollectionStatusLookup> PagingResultBean<ENTITY> doSelectPage(LdCollectionStatusLookupCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectPageInternally(cb, tp, new InternalSelectPageCallback<ENTITY, LdCollectionStatusLookupCB>() {
            public int callbackSelectCount(LdCollectionStatusLookupCB cb) { return doSelectCountPlainly(cb); }
            public List<ENTITY> callbackSelectList(LdCollectionStatusLookupCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); }
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
     * LdCollectionStatusLookupCB cb = new LdCollectionStatusLookupCB();
     * cb.query().setFoo...(value);
     * collectionStatusLookupBhv.<span style="color: #FD4747">selectCursor</span>(cb, new EntityRowHandler&lt;LdCollectionStatusLookup&gt;() {
     *     public void handle(LdCollectionStatusLookup entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of LdCollectionStatusLookup. (NotNull)
     * @param entityRowHandler The handler of entity row of LdCollectionStatusLookup. (NotNull)
     */
    public void selectCursor(LdCollectionStatusLookupCB cb, EntityRowHandler<LdCollectionStatusLookup> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, LdCollectionStatusLookup.class);
    }

    protected <ENTITY extends LdCollectionStatusLookup> void doSelectCursor(LdCollectionStatusLookupCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler", handler); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        helpSelectCursorInternally(cb, handler, tp, new InternalSelectCursorCallback<ENTITY, LdCollectionStatusLookupCB>() {
            public void callbackSelectCursor(LdCollectionStatusLookupCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) { delegateSelectCursor(cb, handler, tp); }
            public List<ENTITY> callbackSelectList(LdCollectionStatusLookupCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); }
        });
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * collectionStatusLookupBhv.<span style="color: #FD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(LdCollectionStatusLookupCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> SLFunction<LdCollectionStatusLookupCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
    }

    protected <RESULT, CB extends LdCollectionStatusLookupCB> SLFunction<CB, RESULT> doScalarSelect(Class<RESULT> tp, CB cb) {
        assertObjectNotNull("resultType", tp); assertCBStateValid(cb);
        cb.xsetupForScalarSelect(); cb.getSqlClause().disableSelectIndex(); // for when you use union
        return createSLFunction(cb, tp);
    }

    protected <RESULT, CB extends LdCollectionStatusLookupCB> SLFunction<CB, RESULT> createSLFunction(CB cb, Class<RESULT> tp) {
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
     * @param collectionStatusLookup The entity of collectionStatusLookup. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     */
    public void loadCollectionStatusList(LdCollectionStatusLookup collectionStatusLookup, ConditionBeanSetupper<LdCollectionStatusCB> conditionBeanSetupper) {
        xassLRArg(collectionStatusLookup, conditionBeanSetupper);
        loadCollectionStatusList(xnewLRLs(collectionStatusLookup), conditionBeanSetupper);
    }
    /**
     * Load referrer of collectionStatusList with the set-upper for condition-bean of referrer. <br />
     * COLLECTION_STATUS by COLLECTION_STATUS_CODE, named 'collectionStatusList'.
     * <pre>
     * collectionStatusLookupBhv.<span style="color: #FD4747">loadCollectionStatusList</span>(collectionStatusLookupList, new ConditionBeanSetupper&lt;LdCollectionStatusCB&gt;() {
     *     public void setup(LdCollectionStatusCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...(); <span style="color: #3F7E5E">// basically you should order referrer list</span>
     *     }
     * });
     * for (LdCollectionStatusLookup collectionStatusLookup : collectionStatusLookupList) {
     *     ... = collectionStatusLookup.<span style="color: #FD4747">getCollectionStatusList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key(and others too) is treated as case-insensitive. <br />
     * The condition-bean that the set-upper provides have settings before you touch it. It is as follows:
     * <pre>
     * cb.query().setCollectionStatusCode_InScope(pkList);
     * cb.query().addOrderBy_CollectionStatusCode_Asc();
     * </pre>
     * @param collectionStatusLookupList The entity list of collectionStatusLookup. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     */
    public void loadCollectionStatusList(List<LdCollectionStatusLookup> collectionStatusLookupList, ConditionBeanSetupper<LdCollectionStatusCB> conditionBeanSetupper) {
        xassLRArg(collectionStatusLookupList, conditionBeanSetupper);
        loadCollectionStatusList(collectionStatusLookupList, new LoadReferrerOption<LdCollectionStatusCB, LdCollectionStatus>().xinit(conditionBeanSetupper));
    }
    /**
     * {Refer to overload method that has an argument of the list of entity.}
     * @param collectionStatusLookup The entity of collectionStatusLookup. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadCollectionStatusList(LdCollectionStatusLookup collectionStatusLookup, LoadReferrerOption<LdCollectionStatusCB, LdCollectionStatus> loadReferrerOption) {
        xassLRArg(collectionStatusLookup, loadReferrerOption);
        loadCollectionStatusList(xnewLRLs(collectionStatusLookup), loadReferrerOption);
    }
    /**
     * {Refer to overload method that has an argument of condition-bean setupper.}
     * @param collectionStatusLookupList The entity list of collectionStatusLookup. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadCollectionStatusList(List<LdCollectionStatusLookup> collectionStatusLookupList, LoadReferrerOption<LdCollectionStatusCB, LdCollectionStatus> loadReferrerOption) {
        xassLRArg(collectionStatusLookupList, loadReferrerOption);
        if (collectionStatusLookupList.isEmpty()) { return; }
        final LdCollectionStatusBhv referrerBhv = xgetBSFLR().select(LdCollectionStatusBhv.class);
        helpLoadReferrerInternally(collectionStatusLookupList, loadReferrerOption, new InternalLoadReferrerCallback<LdCollectionStatusLookup, String, LdCollectionStatusCB, LdCollectionStatus>() {
            public String getPKVal(LdCollectionStatusLookup et)
            { return et.getCollectionStatusCode(); }
            public void setRfLs(LdCollectionStatusLookup et, List<LdCollectionStatus> ls)
            { et.setCollectionStatusList(ls); }
            public LdCollectionStatusCB newMyCB() { return referrerBhv.newMyConditionBean(); }
            public void qyFKIn(LdCollectionStatusCB cb, List<String> ls)
            { cb.query().setCollectionStatusCode_InScope(ls); }
            public void qyOdFKAsc(LdCollectionStatusCB cb) { cb.query().addOrderBy_CollectionStatusCode_Asc(); }
            public void spFKCol(LdCollectionStatusCB cb) { cb.specify().columnCollectionStatusCode(); }
            public List<LdCollectionStatus> selRfLs(LdCollectionStatusCB cb) { return referrerBhv.selectList(cb); }
            public String getFKVal(LdCollectionStatus re) { return re.getCollectionStatusCode(); }
            public void setlcEt(LdCollectionStatus re, LdCollectionStatusLookup le)
            { re.setCollectionStatusLookup(le); }
            public String getRfPrNm() { return "collectionStatusList"; }
        });
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key collectionStatusCode.
     * @param collectionStatusLookupList The list of collectionStatusLookup. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<String> extractCollectionStatusCodeList(List<LdCollectionStatusLookup> collectionStatusLookupList) {
        return helpExtractListInternally(collectionStatusLookupList, new InternalExtractCallback<LdCollectionStatusLookup, String>() {
            public String getCV(LdCollectionStatusLookup et) { return et.getCollectionStatusCode(); }
        });
    }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * LdCollectionStatusLookup collectionStatusLookup = new LdCollectionStatusLookup();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * collectionStatusLookup.setFoo...(value);
     * collectionStatusLookup.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//collectionStatusLookup.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//collectionStatusLookup.set...;</span>
     * collectionStatusLookupBhv.<span style="color: #FD4747">insert</span>(collectionStatusLookup);
     * ... = collectionStatusLookup.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param collectionStatusLookup The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(LdCollectionStatusLookup collectionStatusLookup) {
        doInsert(collectionStatusLookup, null);
    }

    protected void doInsert(LdCollectionStatusLookup collectionStatusLookup, InsertOption<LdCollectionStatusLookupCB> op) {
        assertObjectNotNull("collectionStatusLookup", collectionStatusLookup);
        prepareInsertOption(op);
        delegateInsert(collectionStatusLookup, op);
    }

    protected void prepareInsertOption(InsertOption<LdCollectionStatusLookupCB> op) {
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
     * LdCollectionStatusLookup collectionStatusLookup = new LdCollectionStatusLookup();
     * collectionStatusLookup.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * collectionStatusLookup.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//collectionStatusLookup.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//collectionStatusLookup.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * collectionStatusLookup.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     collectionStatusLookupBhv.<span style="color: #FD4747">update</span>(collectionStatusLookup);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param collectionStatusLookup The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(final LdCollectionStatusLookup collectionStatusLookup) {
        doUpdate(collectionStatusLookup, null);
    }

    protected void doUpdate(LdCollectionStatusLookup collectionStatusLookup, final UpdateOption<LdCollectionStatusLookupCB> op) {
        assertObjectNotNull("collectionStatusLookup", collectionStatusLookup);
        prepareUpdateOption(op);
        helpUpdateInternally(collectionStatusLookup, new InternalUpdateCallback<LdCollectionStatusLookup>() {
            public int callbackDelegateUpdate(LdCollectionStatusLookup et) { return delegateUpdate(et, op); } });
    }

    protected void prepareUpdateOption(UpdateOption<LdCollectionStatusLookupCB> op) {
        if (op == null) { return; }
        assertUpdateOptionStatus(op);
        if (op.hasSelfSpecification()) {
            op.resolveSelfSpecification(createCBForVaryingUpdate());
        }
        if (op.hasSpecifiedUpdateColumn()) {
            op.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    protected LdCollectionStatusLookupCB createCBForVaryingUpdate() {
        LdCollectionStatusLookupCB cb = newMyConditionBean();
        cb.xsetupForVaryingUpdate();
        return cb;
    }

    protected LdCollectionStatusLookupCB createCBForSpecifiedUpdate() {
        LdCollectionStatusLookupCB cb = newMyConditionBean();
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
     * LdCollectionStatusLookup collectionStatusLookup = new LdCollectionStatusLookup();
     * collectionStatusLookup.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * collectionStatusLookup.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//collectionStatusLookup.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//collectionStatusLookup.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//collectionStatusLookup.setVersionNo(value);</span>
     * collectionStatusLookupBhv.<span style="color: #FD4747">updateNonstrict</span>(collectionStatusLookup);
     * </pre>
     * @param collectionStatusLookup The entity of update target. (NotNull, PrimaryKeyNotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void updateNonstrict(final LdCollectionStatusLookup collectionStatusLookup) {
        doUpdateNonstrict(collectionStatusLookup, null);
    }

    protected void doUpdateNonstrict(LdCollectionStatusLookup collectionStatusLookup, final UpdateOption<LdCollectionStatusLookupCB> op) {
        assertObjectNotNull("collectionStatusLookup", collectionStatusLookup);
        prepareUpdateOption(op);
        helpUpdateNonstrictInternally(collectionStatusLookup, new InternalUpdateNonstrictCallback<LdCollectionStatusLookup>() {
            public int callbackDelegateUpdateNonstrict(LdCollectionStatusLookup et) { return delegateUpdateNonstrict(et, op); } });
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
     * @param collectionStatusLookup The entity of insert or update target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(LdCollectionStatusLookup collectionStatusLookup) {
        doInesrtOrUpdate(collectionStatusLookup, null, null);
    }

    protected void doInesrtOrUpdate(LdCollectionStatusLookup collectionStatusLookup, final InsertOption<LdCollectionStatusLookupCB> iop, final UpdateOption<LdCollectionStatusLookupCB> uop) {
        helpInsertOrUpdateInternally(collectionStatusLookup, new InternalInsertOrUpdateCallback<LdCollectionStatusLookup, LdCollectionStatusLookupCB>() {
            public void callbackInsert(LdCollectionStatusLookup et) { doInsert(et, iop); }
            public void callbackUpdate(LdCollectionStatusLookup et) { doUpdate(et, uop); }
            public LdCollectionStatusLookupCB callbackNewMyConditionBean() { return newMyConditionBean(); }
            public int callbackSelectCount(LdCollectionStatusLookupCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrModify(Entity et, InsertOption<? extends ConditionBean> iop, UpdateOption<? extends ConditionBean> uop) {
        if (iop == null && uop == null) { insertOrUpdate(downcast(et)); }
        else {
            iop = iop != null ? iop : new InsertOption<LdCollectionStatusLookupCB>();
            uop = uop != null ? uop : new UpdateOption<LdCollectionStatusLookupCB>();
            varyingInsertOrUpdate(downcast(et), downcast(iop), downcast(uop));
        }
    }

    /**
     * Insert or update the entity non-strictly modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br />
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() }
     * <p><span style="color: #FD4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param collectionStatusLookup The entity of insert or update target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdateNonstrict(LdCollectionStatusLookup collectionStatusLookup) {
        doInesrtOrUpdateNonstrict(collectionStatusLookup, null, null);
    }

    protected void doInesrtOrUpdateNonstrict(LdCollectionStatusLookup collectionStatusLookup, final InsertOption<LdCollectionStatusLookupCB> iop, final UpdateOption<LdCollectionStatusLookupCB> uop) {
        helpInsertOrUpdateInternally(collectionStatusLookup, new InternalInsertOrUpdateNonstrictCallback<LdCollectionStatusLookup>() {
            public void callbackInsert(LdCollectionStatusLookup et) { doInsert(et, iop); }
            public void callbackUpdateNonstrict(LdCollectionStatusLookup et) { doUpdateNonstrict(et, uop); }
        });
    }

    @Override
    protected void doCreateOrModifyNonstrict(Entity et, InsertOption<? extends ConditionBean> iop, UpdateOption<? extends ConditionBean> uop) {
        if (iop == null && uop == null) { insertOrUpdateNonstrict(downcast(et)); }
        else {
            iop = iop != null ? iop : new InsertOption<LdCollectionStatusLookupCB>();
            uop = uop != null ? uop : new UpdateOption<LdCollectionStatusLookupCB>();
            varyingInsertOrUpdateNonstrict(downcast(et), downcast(iop), downcast(uop));
        }
    }

    /**
     * Delete the entity. (ZeroUpdateException, ExclusiveControl)
     * <pre>
     * LdCollectionStatusLookup collectionStatusLookup = new LdCollectionStatusLookup();
     * collectionStatusLookup.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * collectionStatusLookup.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     collectionStatusLookupBhv.<span style="color: #FD4747">delete</span>(collectionStatusLookup);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param collectionStatusLookup The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(LdCollectionStatusLookup collectionStatusLookup) {
        doDelete(collectionStatusLookup, null);
    }

    protected void doDelete(LdCollectionStatusLookup collectionStatusLookup, final DeleteOption<LdCollectionStatusLookupCB> op) {
        assertObjectNotNull("collectionStatusLookup", collectionStatusLookup);
        prepareDeleteOption(op);
        helpDeleteInternally(collectionStatusLookup, new InternalDeleteCallback<LdCollectionStatusLookup>() {
            public int callbackDelegateDelete(LdCollectionStatusLookup et) { return delegateDelete(et, op); } });
    }

    protected void prepareDeleteOption(DeleteOption<LdCollectionStatusLookupCB> op) {
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
     * LdCollectionStatusLookup collectionStatusLookup = new LdCollectionStatusLookup();
     * collectionStatusLookup.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//collectionStatusLookup.setVersionNo(value);</span>
     * collectionStatusLookupBhv.<span style="color: #FD4747">deleteNonstrict</span>(collectionStatusLookup);
     * </pre>
     * @param collectionStatusLookup The entity of delete target. (NotNull, PrimaryKeyNotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrict(LdCollectionStatusLookup collectionStatusLookup) {
        doDeleteNonstrict(collectionStatusLookup, null);
    }

    protected void doDeleteNonstrict(LdCollectionStatusLookup collectionStatusLookup, final DeleteOption<LdCollectionStatusLookupCB> op) {
        assertObjectNotNull("collectionStatusLookup", collectionStatusLookup);
        prepareDeleteOption(op);
        helpDeleteNonstrictInternally(collectionStatusLookup, new InternalDeleteNonstrictCallback<LdCollectionStatusLookup>() {
            public int callbackDelegateDeleteNonstrict(LdCollectionStatusLookup et) { return delegateDeleteNonstrict(et, op); } });
    }

    /**
     * Delete the entity non-strictly ignoring deleted. {ZeroUpdateException, NonExclusiveControl}
     * <pre>
     * LdCollectionStatusLookup collectionStatusLookup = new LdCollectionStatusLookup();
     * collectionStatusLookup.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//collectionStatusLookup.setVersionNo(value);</span>
     * collectionStatusLookupBhv.<span style="color: #FD4747">deleteNonstrictIgnoreDeleted</span>(collectionStatusLookup);
     * <span style="color: #3F7E5E">// if the target entity doesn't exist, no exception</span>
     * </pre>
     * @param collectionStatusLookup The entity of delete target. (NotNull, PrimaryKeyNotNull)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrictIgnoreDeleted(LdCollectionStatusLookup collectionStatusLookup) {
        doDeleteNonstrictIgnoreDeleted(collectionStatusLookup, null);
    }

    protected void doDeleteNonstrictIgnoreDeleted(LdCollectionStatusLookup collectionStatusLookup, final DeleteOption<LdCollectionStatusLookupCB> op) {
        assertObjectNotNull("collectionStatusLookup", collectionStatusLookup);
        prepareDeleteOption(op);
        helpDeleteNonstrictIgnoreDeletedInternally(collectionStatusLookup, new InternalDeleteNonstrictIgnoreDeletedCallback<LdCollectionStatusLookup>() {
            public int callbackDelegateDeleteNonstrict(LdCollectionStatusLookup et) { return delegateDeleteNonstrict(et, op); } });
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
     *     LdCollectionStatusLookup collectionStatusLookup = new LdCollectionStatusLookup();
     *     collectionStatusLookup.setFooName("foo");
     *     if (...) {
     *         collectionStatusLookup.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     collectionStatusLookupList.add(collectionStatusLookup);
     * }
     * collectionStatusLookupBhv.<span style="color: #FD4747">batchInsert</span>(collectionStatusLookupList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param collectionStatusLookupList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<LdCollectionStatusLookup> collectionStatusLookupList) {
        InsertOption<LdCollectionStatusLookupCB> op = createInsertUpdateOption();
        return doBatchInsert(collectionStatusLookupList, op);
    }

    protected int[] doBatchInsert(List<LdCollectionStatusLookup> collectionStatusLookupList, InsertOption<LdCollectionStatusLookupCB> op) {
        assertObjectNotNull("collectionStatusLookupList", collectionStatusLookupList);
        prepareBatchInsertOption(collectionStatusLookupList, op);
        return delegateBatchInsert(collectionStatusLookupList, op);
    }

    protected void prepareBatchInsertOption(List<LdCollectionStatusLookup> collectionStatusLookupList, InsertOption<LdCollectionStatusLookupCB> op) {
        op.xallowInsertColumnModifiedPropertiesFragmented();
        op.xacceptInsertColumnModifiedPropertiesIfNeeds(collectionStatusLookupList);
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
     *     LdCollectionStatusLookup collectionStatusLookup = new LdCollectionStatusLookup();
     *     collectionStatusLookup.setFooName("foo");
     *     if (...) {
     *         collectionStatusLookup.setFooPrice(123);
     *     } else {
     *         collectionStatusLookup.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//collectionStatusLookup.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     collectionStatusLookupList.add(collectionStatusLookup);
     * }
     * collectionStatusLookupBhv.<span style="color: #FD4747">batchUpdate</span>(collectionStatusLookupList);
     * </pre>
     * @param collectionStatusLookupList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<LdCollectionStatusLookup> collectionStatusLookupList) {
        UpdateOption<LdCollectionStatusLookupCB> op = createPlainUpdateOption();
        return doBatchUpdate(collectionStatusLookupList, op);
    }

    protected int[] doBatchUpdate(List<LdCollectionStatusLookup> collectionStatusLookupList, UpdateOption<LdCollectionStatusLookupCB> op) {
        assertObjectNotNull("collectionStatusLookupList", collectionStatusLookupList);
        prepareBatchUpdateOption(collectionStatusLookupList, op);
        return delegateBatchUpdate(collectionStatusLookupList, op);
    }

    protected void prepareBatchUpdateOption(List<LdCollectionStatusLookup> collectionStatusLookupList, UpdateOption<LdCollectionStatusLookupCB> op) {
        op.xacceptUpdateColumnModifiedPropertiesIfNeeds(collectionStatusLookupList);
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
     * collectionStatusLookupBhv.<span style="color: #FD4747">batchUpdate</span>(collectionStatusLookupList, new SpecifyQuery<LdCollectionStatusLookupCB>() {
     *     public void specify(LdCollectionStatusLookupCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #FD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #FD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * collectionStatusLookupBhv.<span style="color: #FD4747">batchUpdate</span>(collectionStatusLookupList, new SpecifyQuery<LdCollectionStatusLookupCB>() {
     *     public void specify(LdCollectionStatusLookupCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #FD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param collectionStatusLookupList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<LdCollectionStatusLookup> collectionStatusLookupList, SpecifyQuery<LdCollectionStatusLookupCB> updateColumnSpec) {
        return doBatchUpdate(collectionStatusLookupList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    /**
     * Batch-update the entity list non-strictly modified-only of same-set columns. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <span style="color: #FD4747; font-size: 140%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     LdCollectionStatusLookup collectionStatusLookup = new LdCollectionStatusLookup();
     *     collectionStatusLookup.setFooName("foo");
     *     if (...) {
     *         collectionStatusLookup.setFooPrice(123);
     *     } else {
     *         collectionStatusLookup.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//collectionStatusLookup.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     collectionStatusLookupList.add(collectionStatusLookup);
     * }
     * collectionStatusLookupBhv.<span style="color: #FD4747">batchUpdate</span>(collectionStatusLookupList);
     * </pre>
     * @param collectionStatusLookupList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<LdCollectionStatusLookup> collectionStatusLookupList) {
        UpdateOption<LdCollectionStatusLookupCB> option = createPlainUpdateOption();
        return doBatchUpdateNonstrict(collectionStatusLookupList, option);
    }

    protected int[] doBatchUpdateNonstrict(List<LdCollectionStatusLookup> collectionStatusLookupList, UpdateOption<LdCollectionStatusLookupCB> op) {
        assertObjectNotNull("collectionStatusLookupList", collectionStatusLookupList);
        prepareBatchUpdateOption(collectionStatusLookupList, op);
        return delegateBatchUpdateNonstrict(collectionStatusLookupList, op);
    }

    /**
     * Batch-update the entity list non-strictly specified-only. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * collectionStatusLookupBhv.<span style="color: #FD4747">batchUpdateNonstrict</span>(collectionStatusLookupList, new SpecifyQuery<LdCollectionStatusLookupCB>() {
     *     public void specify(LdCollectionStatusLookupCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #FD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #FD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * collectionStatusLookupBhv.<span style="color: #FD4747">batchUpdateNonstrict</span>(collectionStatusLookupList, new SpecifyQuery<LdCollectionStatusLookupCB>() {
     *     public void specify(LdCollectionStatusLookupCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #FD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).</p>
     * @param collectionStatusLookupList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<LdCollectionStatusLookup> collectionStatusLookupList, SpecifyQuery<LdCollectionStatusLookupCB> updateColumnSpec) {
        return doBatchUpdateNonstrict(collectionStatusLookupList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> op) {
        if (op == null) { return batchUpdateNonstrict(downcast(ls)); }
        else { return varyingBatchUpdateNonstrict(downcast(ls), downcast(op)); }
    }

    /**
     * Batch-delete the entity list. (ExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param collectionStatusLookupList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchDelete(List<LdCollectionStatusLookup> collectionStatusLookupList) {
        return doBatchDelete(collectionStatusLookupList, null);
    }

    protected int[] doBatchDelete(List<LdCollectionStatusLookup> collectionStatusLookupList, DeleteOption<LdCollectionStatusLookupCB> op) {
        assertObjectNotNull("collectionStatusLookupList", collectionStatusLookupList);
        prepareDeleteOption(op);
        return delegateBatchDelete(collectionStatusLookupList, op);
    }

    @Override
    protected int[] doLumpRemove(List<Entity> ls, DeleteOption<? extends ConditionBean> op) {
        if (op == null) { return batchDelete(downcast(ls)); }
        else { return varyingBatchDelete(downcast(ls), downcast(op)); }
    }

    /**
     * Batch-delete the entity list non-strictly. {NonExclusiveControl} <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param collectionStatusLookupList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDeleteNonstrict(List<LdCollectionStatusLookup> collectionStatusLookupList) {
        return doBatchDeleteNonstrict(collectionStatusLookupList, null);
    }

    protected int[] doBatchDeleteNonstrict(List<LdCollectionStatusLookup> collectionStatusLookupList, DeleteOption<LdCollectionStatusLookupCB> op) {
        assertObjectNotNull("collectionStatusLookupList", collectionStatusLookupList);
        prepareDeleteOption(op);
        return delegateBatchDeleteNonstrict(collectionStatusLookupList, op);
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
     * collectionStatusLookupBhv.<span style="color: #FD4747">queryInsert</span>(new QueryInsertSetupper&lt;LdCollectionStatusLookup, LdCollectionStatusLookupCB&gt;() {
     *     public ConditionBean setup(collectionStatusLookup entity, LdCollectionStatusLookupCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<LdCollectionStatusLookup, LdCollectionStatusLookupCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(QueryInsertSetupper<LdCollectionStatusLookup, LdCollectionStatusLookupCB> sp, InsertOption<LdCollectionStatusLookupCB> op) {
        assertObjectNotNull("setupper", sp);
        prepareInsertOption(op);
        LdCollectionStatusLookup e = new LdCollectionStatusLookup();
        LdCollectionStatusLookupCB cb = createCBForQueryInsert();
        return delegateQueryInsert(e, cb, sp.setup(e, cb), op);
    }

    protected LdCollectionStatusLookupCB createCBForQueryInsert() {
        LdCollectionStatusLookupCB cb = newMyConditionBean();
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
     * LdCollectionStatusLookup collectionStatusLookup = new LdCollectionStatusLookup();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//collectionStatusLookup.setPK...(value);</span>
     * collectionStatusLookup.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//collectionStatusLookup.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//collectionStatusLookup.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//collectionStatusLookup.setVersionNo(value);</span>
     * LdCollectionStatusLookupCB cb = new LdCollectionStatusLookupCB();
     * cb.query().setFoo...(value);
     * collectionStatusLookupBhv.<span style="color: #FD4747">queryUpdate</span>(collectionStatusLookup, cb);
     * </pre>
     * @param collectionStatusLookup The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of LdCollectionStatusLookup. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(LdCollectionStatusLookup collectionStatusLookup, LdCollectionStatusLookupCB cb) {
        return doQueryUpdate(collectionStatusLookup, cb, null);
    }

    protected int doQueryUpdate(LdCollectionStatusLookup collectionStatusLookup, LdCollectionStatusLookupCB cb, UpdateOption<LdCollectionStatusLookupCB> op) {
        assertObjectNotNull("collectionStatusLookup", collectionStatusLookup); assertCBStateValid(cb);
        prepareUpdateOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryUpdate(collectionStatusLookup, cb, op) : 0;
    }

    @Override
    protected int doRangeModify(Entity et, ConditionBean cb, UpdateOption<? extends ConditionBean> op) {
        if (op == null) { return queryUpdate(downcast(et), (LdCollectionStatusLookupCB)cb); }
        else { return varyingQueryUpdate(downcast(et), (LdCollectionStatusLookupCB)cb, downcast(op)); }
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * LdCollectionStatusLookupCB cb = new LdCollectionStatusLookupCB();
     * cb.query().setFoo...(value);
     * collectionStatusLookupBhv.<span style="color: #FD4747">queryDelete</span>(collectionStatusLookup, cb);
     * </pre>
     * @param cb The condition-bean of LdCollectionStatusLookup. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(LdCollectionStatusLookupCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(LdCollectionStatusLookupCB cb, DeleteOption<LdCollectionStatusLookupCB> op) {
        assertCBStateValid(cb);
        prepareDeleteOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryDelete(cb, op) : 0;
    }

    @Override
    protected int doRangeRemove(ConditionBean cb, DeleteOption<? extends ConditionBean> op) {
        if (op == null) { return queryDelete((LdCollectionStatusLookupCB)cb); }
        else { return varyingQueryDelete((LdCollectionStatusLookupCB)cb, downcast(op)); }
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
     * LdCollectionStatusLookup collectionStatusLookup = new LdCollectionStatusLookup();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * collectionStatusLookup.setFoo...(value);
     * collectionStatusLookup.setBar...(value);
     * InsertOption<LdCollectionStatusLookupCB> option = new InsertOption<LdCollectionStatusLookupCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * collectionStatusLookupBhv.<span style="color: #FD4747">varyingInsert</span>(collectionStatusLookup, option);
     * ... = collectionStatusLookup.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param collectionStatusLookup The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(LdCollectionStatusLookup collectionStatusLookup, InsertOption<LdCollectionStatusLookupCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(collectionStatusLookup, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, ExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * LdCollectionStatusLookup collectionStatusLookup = new LdCollectionStatusLookup();
     * collectionStatusLookup.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * collectionStatusLookup.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * collectionStatusLookup.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;LdCollectionStatusLookupCB&gt; option = new UpdateOption&lt;LdCollectionStatusLookupCB&gt;();
     *     option.self(new SpecifyQuery&lt;LdCollectionStatusLookupCB&gt;() {
     *         public void specify(LdCollectionStatusLookupCB cb) {
     *             cb.specify().<span style="color: #FD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     collectionStatusLookupBhv.<span style="color: #FD4747">varyingUpdate</span>(collectionStatusLookup, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param collectionStatusLookup The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(LdCollectionStatusLookup collectionStatusLookup, UpdateOption<LdCollectionStatusLookupCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(collectionStatusLookup, option);
    }

    /**
     * Update the entity with varying requests non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as updateNonstrict(entity).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * LdCollectionStatusLookup collectionStatusLookup = new LdCollectionStatusLookup();
     * collectionStatusLookup.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * collectionStatusLookup.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//collectionStatusLookup.setVersionNo(value);</span>
     * UpdateOption&lt;LdCollectionStatusLookupCB&gt; option = new UpdateOption&lt;LdCollectionStatusLookupCB&gt;();
     * option.self(new SpecifyQuery&lt;LdCollectionStatusLookupCB&gt;() {
     *     public void specify(LdCollectionStatusLookupCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * collectionStatusLookupBhv.<span style="color: #FD4747">varyingUpdateNonstrict</span>(collectionStatusLookup, option);
     * </pre>
     * @param collectionStatusLookup The entity of update target. (NotNull, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdateNonstrict(LdCollectionStatusLookup collectionStatusLookup, UpdateOption<LdCollectionStatusLookupCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdateNonstrict(collectionStatusLookup, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param collectionStatusLookup The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(LdCollectionStatusLookup collectionStatusLookup, InsertOption<LdCollectionStatusLookupCB> insertOption, UpdateOption<LdCollectionStatusLookupCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdate(collectionStatusLookup, insertOption, updateOption);
    }

    /**
     * Insert or update the entity with varying requests non-strictly. (NonExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdateNonstrict(entity).
     * @param collectionStatusLookup The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdateNonstrict(LdCollectionStatusLookup collectionStatusLookup, InsertOption<LdCollectionStatusLookupCB> insertOption, UpdateOption<LdCollectionStatusLookupCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdateNonstrict(collectionStatusLookup, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, ExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param collectionStatusLookup The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(LdCollectionStatusLookup collectionStatusLookup, DeleteOption<LdCollectionStatusLookupCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(collectionStatusLookup, option);
    }

    /**
     * Delete the entity with varying requests non-strictly. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as deleteNonstrict(entity).
     * @param collectionStatusLookup The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDeleteNonstrict(LdCollectionStatusLookup collectionStatusLookup, DeleteOption<LdCollectionStatusLookupCB> option) {
        assertDeleteOptionNotNull(option);
        doDeleteNonstrict(collectionStatusLookup, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param collectionStatusLookupList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<LdCollectionStatusLookup> collectionStatusLookupList, InsertOption<LdCollectionStatusLookupCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(collectionStatusLookupList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param collectionStatusLookupList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<LdCollectionStatusLookup> collectionStatusLookupList, UpdateOption<LdCollectionStatusLookupCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(collectionStatusLookupList, option);
    }

    /**
     * Batch-update the list with varying requests non-strictly. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param collectionStatusLookupList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdateNonstrict(List<LdCollectionStatusLookup> collectionStatusLookupList, UpdateOption<LdCollectionStatusLookupCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdateNonstrict(collectionStatusLookupList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param collectionStatusLookupList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<LdCollectionStatusLookup> collectionStatusLookupList, DeleteOption<LdCollectionStatusLookupCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(collectionStatusLookupList, option);
    }

    /**
     * Batch-delete the list with varying requests non-strictly. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDeleteNonstrict(entityList).
     * @param collectionStatusLookupList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDeleteNonstrict(List<LdCollectionStatusLookup> collectionStatusLookupList, DeleteOption<LdCollectionStatusLookupCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDeleteNonstrict(collectionStatusLookupList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<LdCollectionStatusLookup, LdCollectionStatusLookupCB> setupper, InsertOption<LdCollectionStatusLookupCB> option) {
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
     * LdCollectionStatusLookup collectionStatusLookup = new LdCollectionStatusLookup();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//collectionStatusLookup.setPK...(value);</span>
     * collectionStatusLookup.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//collectionStatusLookup.setVersionNo(value);</span>
     * LdCollectionStatusLookupCB cb = new LdCollectionStatusLookupCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;LdCollectionStatusLookupCB&gt; option = new UpdateOption&lt;LdCollectionStatusLookupCB&gt;();
     * option.self(new SpecifyQuery&lt;LdCollectionStatusLookupCB&gt;() {
     *     public void specify(LdCollectionStatusLookupCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * collectionStatusLookupBhv.<span style="color: #FD4747">varyingQueryUpdate</span>(collectionStatusLookup, cb, option);
     * </pre>
     * @param collectionStatusLookup The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of LdCollectionStatusLookup. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(LdCollectionStatusLookup collectionStatusLookup, LdCollectionStatusLookupCB cb, UpdateOption<LdCollectionStatusLookupCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(collectionStatusLookup, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of LdCollectionStatusLookup. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(LdCollectionStatusLookupCB cb, DeleteOption<LdCollectionStatusLookupCB> option) {
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
    public OutsideSqlBasicExecutor<LdCollectionStatusLookupBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCountUniquely(LdCollectionStatusLookupCB cb) { return invoke(createSelectCountCBCommand(cb, true)); }
    protected int delegateSelectCountPlainly(LdCollectionStatusLookupCB cb) { return invoke(createSelectCountCBCommand(cb, false)); }
    protected <ENTITY extends LdCollectionStatusLookup> void delegateSelectCursor(LdCollectionStatusLookupCB cb, EntityRowHandler<ENTITY> rh, Class<ENTITY> tp)
    { invoke(createSelectCursorCBCommand(cb, rh, tp)); }
    protected <ENTITY extends LdCollectionStatusLookup> List<ENTITY> delegateSelectList(LdCollectionStatusLookupCB cb, Class<ENTITY> tp)
    { return invoke(createSelectListCBCommand(cb, tp)); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(LdCollectionStatusLookup et, InsertOption<LdCollectionStatusLookupCB> op)
    { if (!processBeforeInsert(et, op)) { return 0; }
      return invoke(createInsertEntityCommand(et, op)); }
    protected int delegateUpdate(LdCollectionStatusLookup et, UpdateOption<LdCollectionStatusLookupCB> op)
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return invoke(createUpdateEntityCommand(et, op)); }
    protected int delegateUpdateNonstrict(LdCollectionStatusLookup et, UpdateOption<LdCollectionStatusLookupCB> op)
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return invoke(createUpdateNonstrictEntityCommand(et, op)); }
    protected int delegateDelete(LdCollectionStatusLookup et, DeleteOption<LdCollectionStatusLookupCB> op)
    { if (!processBeforeDelete(et, op)) { return 0; }
      return invoke(createDeleteEntityCommand(et, op)); }
    protected int delegateDeleteNonstrict(LdCollectionStatusLookup et, DeleteOption<LdCollectionStatusLookupCB> op)
    { if (!processBeforeDelete(et, op)) { return 0; }
      return invoke(createDeleteNonstrictEntityCommand(et, op)); }

    protected int[] delegateBatchInsert(List<LdCollectionStatusLookup> ls, InsertOption<LdCollectionStatusLookupCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchInsertCommand(processBatchInternally(ls, op), op)); }
    protected int[] delegateBatchUpdate(List<LdCollectionStatusLookup> ls, UpdateOption<LdCollectionStatusLookupCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateCommand(processBatchInternally(ls, op, false), op)); }
    protected int[] delegateBatchUpdateNonstrict(List<LdCollectionStatusLookup> ls, UpdateOption<LdCollectionStatusLookupCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateNonstrictCommand(processBatchInternally(ls, op, true), op)); }
    protected int[] delegateBatchDelete(List<LdCollectionStatusLookup> ls, DeleteOption<LdCollectionStatusLookupCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteCommand(processBatchInternally(ls, op, false), op)); }
    protected int[] delegateBatchDeleteNonstrict(List<LdCollectionStatusLookup> ls, DeleteOption<LdCollectionStatusLookupCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteNonstrictCommand(processBatchInternally(ls, op, true), op)); }

    protected int delegateQueryInsert(LdCollectionStatusLookup et, LdCollectionStatusLookupCB inCB, ConditionBean resCB, InsertOption<LdCollectionStatusLookupCB> op)
    { if (!processBeforeQueryInsert(et, inCB, resCB, op)) { return 0; } return invoke(createQueryInsertCBCommand(et, inCB, resCB, op));  }
    protected int delegateQueryUpdate(LdCollectionStatusLookup et, LdCollectionStatusLookupCB cb, UpdateOption<LdCollectionStatusLookupCB> op)
    { if (!processBeforeQueryUpdate(et, cb, op)) { return 0; } return invoke(createQueryUpdateCBCommand(et, cb, op));  }
    protected int delegateQueryDelete(LdCollectionStatusLookupCB cb, DeleteOption<LdCollectionStatusLookupCB> op)
    { if (!processBeforeQueryDelete(cb, op)) { return 0; } return invoke(createQueryDeleteCBCommand(cb, op));  }

    // ===================================================================================
    //                                                                     Filter Override
    //                                                                     ===============
    @Override
    protected void filterEntityOfInsert(Entity tgt, InsertOption<? extends ConditionBean> op) {
        super.filterEntityOfInsert(tgt, op);
        LdCollectionStatusLookup et = downcast(tgt);
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
    protected LdCollectionStatusLookup downcast(Entity et) {
        return helpEntityDowncastInternally(et, LdCollectionStatusLookup.class);
    }

    protected LdCollectionStatusLookupCB downcast(ConditionBean cb) {
        return helpConditionBeanDowncastInternally(cb, LdCollectionStatusLookupCB.class);
    }

    @SuppressWarnings("unchecked")
    protected List<LdCollectionStatusLookup> downcast(List<? extends Entity> ls) {
        return (List<LdCollectionStatusLookup>)ls;
    }

    @SuppressWarnings("unchecked")
    protected InsertOption<LdCollectionStatusLookupCB> downcast(InsertOption<? extends ConditionBean> op) {
        return (InsertOption<LdCollectionStatusLookupCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected UpdateOption<LdCollectionStatusLookupCB> downcast(UpdateOption<? extends ConditionBean> op) {
        return (UpdateOption<LdCollectionStatusLookupCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected DeleteOption<LdCollectionStatusLookupCB> downcast(DeleteOption<? extends ConditionBean> op) {
        return (DeleteOption<LdCollectionStatusLookupCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<LdCollectionStatusLookup, LdCollectionStatusLookupCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> sp) {
        return (QueryInsertSetupper<LdCollectionStatusLookup, LdCollectionStatusLookupCB>)sp;
    }
}
