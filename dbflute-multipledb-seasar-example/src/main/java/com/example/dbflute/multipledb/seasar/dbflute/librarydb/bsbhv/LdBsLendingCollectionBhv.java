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
 * The behavior of LENDING_COLLECTION as TABLE. <br />
 * <pre>
 * [primary key]
 *     LIBRARY_ID, LB_USER_ID, LENDING_DATE, COLLECTION_ID
 *
 * [column]
 *     LIBRARY_ID, LB_USER_ID, LENDING_DATE, COLLECTION_ID, RETURN_LIMIT_DATE, R_USER, R_MODULE, R_TIMESTAMP, U_USER, U_MODULE, U_TIMESTAMP
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
 *     COLLECTION, LENDING, LIBRARY_USER
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     collection, lending, libraryUser
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class LdBsLendingCollectionBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "LENDING_COLLECTION"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public DBMeta getDBMeta() { return LdLendingCollectionDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public LdLendingCollectionDbm getMyDBMeta() { return LdLendingCollectionDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public Entity newEntity() { return newMyEntity(); }

    /** {@inheritDoc} */
    public ConditionBean newConditionBean() { return newMyConditionBean(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public LdLendingCollection newMyEntity() { return new LdLendingCollection(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public LdLendingCollectionCB newMyConditionBean() { return new LdLendingCollectionCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * LdLendingCollectionCB cb = new LdLendingCollectionCB();
     * cb.query().setFoo...(value);
     * int count = lendingCollectionBhv.<span style="color: #FD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of LdLendingCollection. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(LdLendingCollectionCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(LdLendingCollectionCB cb) { // called by selectCount(cb)
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(LdLendingCollectionCB cb) { // called by selectPage(cb)
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
     * LdLendingCollectionCB cb = new LdLendingCollectionCB();
     * cb.query().setFoo...(value);
     * LdLendingCollection lendingCollection = lendingCollectionBhv.<span style="color: #FD4747">selectEntity</span>(cb);
     * if (lendingCollection != null) {
     *     ... = lendingCollection.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of LdLendingCollection. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public LdLendingCollection selectEntity(LdLendingCollectionCB cb) {
        return doSelectEntity(cb, LdLendingCollection.class);
    }

    protected <ENTITY extends LdLendingCollection> ENTITY doSelectEntity(LdLendingCollectionCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectEntityInternally(cb, tp, new InternalSelectEntityCallback<ENTITY, LdLendingCollectionCB>() {
            public List<ENTITY> callbackSelectList(LdLendingCollectionCB lcb, Class<ENTITY> ltp) { return doSelectList(lcb, ltp); } });
    }

    @Override
    protected Entity doReadEntity(ConditionBean cb) {
        return selectEntity(downcast(cb));
    }

    /**
     * Select the entity by the condition-bean with deleted check.
     * <pre>
     * LdLendingCollectionCB cb = new LdLendingCollectionCB();
     * cb.query().setFoo...(value);
     * LdLendingCollection lendingCollection = lendingCollectionBhv.<span style="color: #FD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = lendingCollection.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of LdLendingCollection. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public LdLendingCollection selectEntityWithDeletedCheck(LdLendingCollectionCB cb) {
        return doSelectEntityWithDeletedCheck(cb, LdLendingCollection.class);
    }

    protected <ENTITY extends LdLendingCollection> ENTITY doSelectEntityWithDeletedCheck(LdLendingCollectionCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectEntityWithDeletedCheckInternally(cb, tp, new InternalSelectEntityWithDeletedCheckCallback<ENTITY, LdLendingCollectionCB>() {
            public List<ENTITY> callbackSelectList(LdLendingCollectionCB lcb, Class<ENTITY> ltp) { return doSelectList(lcb, ltp); } });
    }

    @Override
    protected Entity doReadEntityWithDeletedCheck(ConditionBean cb) {
        return selectEntityWithDeletedCheck(downcast(cb));
    }

    /**
     * Select the entity by the primary-key value.
     * @param libraryId The one of primary key. (NotNull)
     * @param lbUserId The one of primary key. (NotNull)
     * @param lendingDate The one of primary key. (NotNull)
     * @param collectionId The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public LdLendingCollection selectByPKValue(Integer libraryId, Integer lbUserId, java.sql.Timestamp lendingDate, Integer collectionId) {
        return doSelectByPKValue(libraryId, lbUserId, lendingDate, collectionId, LdLendingCollection.class);
    }

    protected <ENTITY extends LdLendingCollection> ENTITY doSelectByPKValue(Integer libraryId, Integer lbUserId, java.sql.Timestamp lendingDate, Integer collectionId, Class<ENTITY> entityType) {
        return doSelectEntity(buildPKCB(libraryId, lbUserId, lendingDate, collectionId), entityType);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param libraryId The one of primary key. (NotNull)
     * @param lbUserId The one of primary key. (NotNull)
     * @param lendingDate The one of primary key. (NotNull)
     * @param collectionId The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public LdLendingCollection selectByPKValueWithDeletedCheck(Integer libraryId, Integer lbUserId, java.sql.Timestamp lendingDate, Integer collectionId) {
        return doSelectByPKValueWithDeletedCheck(libraryId, lbUserId, lendingDate, collectionId, LdLendingCollection.class);
    }

    protected <ENTITY extends LdLendingCollection> ENTITY doSelectByPKValueWithDeletedCheck(Integer libraryId, Integer lbUserId, java.sql.Timestamp lendingDate, Integer collectionId, Class<ENTITY> entityType) {
        return doSelectEntityWithDeletedCheck(buildPKCB(libraryId, lbUserId, lendingDate, collectionId), entityType);
    }

    private LdLendingCollectionCB buildPKCB(Integer libraryId, Integer lbUserId, java.sql.Timestamp lendingDate, Integer collectionId) {
        assertObjectNotNull("libraryId", libraryId);assertObjectNotNull("lbUserId", lbUserId);assertObjectNotNull("lendingDate", lendingDate);assertObjectNotNull("collectionId", collectionId);
        LdLendingCollectionCB cb = newMyConditionBean();
        cb.query().setLibraryId_Equal(libraryId);cb.query().setLbUserId_Equal(lbUserId);cb.query().setLendingDate_Equal(lendingDate);cb.query().setCollectionId_Equal(collectionId);
        return cb;
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * LdLendingCollectionCB cb = new LdLendingCollectionCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;LdLendingCollection&gt; lendingCollectionList = lendingCollectionBhv.<span style="color: #FD4747">selectList</span>(cb);
     * for (LdLendingCollection lendingCollection : lendingCollectionList) {
     *     ... = lendingCollection.get...();
     * }
     * </pre>
     * @param cb The condition-bean of LdLendingCollection. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<LdLendingCollection> selectList(LdLendingCollectionCB cb) {
        return doSelectList(cb, LdLendingCollection.class);
    }

    protected <ENTITY extends LdLendingCollection> ListResultBean<ENTITY> doSelectList(LdLendingCollectionCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        return helpSelectListInternally(cb, tp, new InternalSelectListCallback<ENTITY, LdLendingCollectionCB>() {
            public List<ENTITY> callbackSelectList(LdLendingCollectionCB lcb, Class<ENTITY> ltp) { return delegateSelectList(lcb, ltp); } });
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
     * LdLendingCollectionCB cb = new LdLendingCollectionCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #FD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;LdLendingCollection&gt; page = lendingCollectionBhv.<span style="color: #FD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (LdLendingCollection lendingCollection : page) {
     *     ... = lendingCollection.get...();
     * }
     * </pre>
     * @param cb The condition-bean of LdLendingCollection. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<LdLendingCollection> selectPage(LdLendingCollectionCB cb) {
        return doSelectPage(cb, LdLendingCollection.class);
    }

    protected <ENTITY extends LdLendingCollection> PagingResultBean<ENTITY> doSelectPage(LdLendingCollectionCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectPageInternally(cb, tp, new InternalSelectPageCallback<ENTITY, LdLendingCollectionCB>() {
            public int callbackSelectCount(LdLendingCollectionCB cb) { return doSelectCountPlainly(cb); }
            public List<ENTITY> callbackSelectList(LdLendingCollectionCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); }
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
     * LdLendingCollectionCB cb = new LdLendingCollectionCB();
     * cb.query().setFoo...(value);
     * lendingCollectionBhv.<span style="color: #FD4747">selectCursor</span>(cb, new EntityRowHandler&lt;LdLendingCollection&gt;() {
     *     public void handle(LdLendingCollection entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of LdLendingCollection. (NotNull)
     * @param entityRowHandler The handler of entity row of LdLendingCollection. (NotNull)
     */
    public void selectCursor(LdLendingCollectionCB cb, EntityRowHandler<LdLendingCollection> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, LdLendingCollection.class);
    }

    protected <ENTITY extends LdLendingCollection> void doSelectCursor(LdLendingCollectionCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler", handler); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        helpSelectCursorInternally(cb, handler, tp, new InternalSelectCursorCallback<ENTITY, LdLendingCollectionCB>() {
            public void callbackSelectCursor(LdLendingCollectionCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) { delegateSelectCursor(cb, handler, tp); }
            public List<ENTITY> callbackSelectList(LdLendingCollectionCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); }
        });
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * lendingCollectionBhv.<span style="color: #FD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(LdLendingCollectionCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> SLFunction<LdLendingCollectionCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
    }

    protected <RESULT, CB extends LdLendingCollectionCB> SLFunction<CB, RESULT> doScalarSelect(Class<RESULT> tp, CB cb) {
        assertObjectNotNull("resultType", tp); assertCBStateValid(cb);
        cb.xsetupForScalarSelect(); cb.getSqlClause().disableSelectIndex(); // for when you use union
        return createSLFunction(cb, tp);
    }

    protected <RESULT, CB extends LdLendingCollectionCB> SLFunction<CB, RESULT> createSLFunction(CB cb, Class<RESULT> tp) {
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
    /**
     * Pull out the list of foreign table 'LdCollection'.
     * @param lendingCollectionList The list of lendingCollection. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<LdCollection> pulloutCollection(List<LdLendingCollection> lendingCollectionList) {
        return helpPulloutInternally(lendingCollectionList, new InternalPulloutCallback<LdLendingCollection, LdCollection>() {
            public LdCollection getFr(LdLendingCollection et) { return et.getCollection(); }
            public boolean hasRf() { return true; }
            public void setRfLs(LdCollection et, List<LdLendingCollection> ls)
            { et.setLendingCollectionList(ls); }
        });
    }
    /**
     * Pull out the list of foreign table 'LdLending'.
     * @param lendingCollectionList The list of lendingCollection. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<LdLending> pulloutLending(List<LdLendingCollection> lendingCollectionList) {
        return helpPulloutInternally(lendingCollectionList, new InternalPulloutCallback<LdLendingCollection, LdLending>() {
            public LdLending getFr(LdLendingCollection et) { return et.getLending(); }
            public boolean hasRf() { return true; }
            public void setRfLs(LdLending et, List<LdLendingCollection> ls)
            { et.setLendingCollectionList(ls); }
        });
    }
    /**
     * Pull out the list of foreign table 'LdLibraryUser'.
     * @param lendingCollectionList The list of lendingCollection. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<LdLibraryUser> pulloutLibraryUser(List<LdLendingCollection> lendingCollectionList) {
        return helpPulloutInternally(lendingCollectionList, new InternalPulloutCallback<LdLendingCollection, LdLibraryUser>() {
            public LdLibraryUser getFr(LdLendingCollection et) { return et.getLibraryUser(); }
            public boolean hasRf() { return true; }
            public void setRfLs(LdLibraryUser et, List<LdLendingCollection> ls)
            { et.setLendingCollectionList(ls); }
        });
    }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * LdLendingCollection lendingCollection = new LdLendingCollection();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * lendingCollection.setFoo...(value);
     * lendingCollection.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//lendingCollection.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//lendingCollection.set...;</span>
     * lendingCollectionBhv.<span style="color: #FD4747">insert</span>(lendingCollection);
     * ... = lendingCollection.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param lendingCollection The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(LdLendingCollection lendingCollection) {
        doInsert(lendingCollection, null);
    }

    protected void doInsert(LdLendingCollection lendingCollection, InsertOption<LdLendingCollectionCB> op) {
        assertObjectNotNull("lendingCollection", lendingCollection);
        prepareInsertOption(op);
        delegateInsert(lendingCollection, op);
    }

    protected void prepareInsertOption(InsertOption<LdLendingCollectionCB> op) {
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
     * LdLendingCollection lendingCollection = new LdLendingCollection();
     * lendingCollection.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * lendingCollection.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//lendingCollection.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//lendingCollection.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * lendingCollection.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     lendingCollectionBhv.<span style="color: #FD4747">update</span>(lendingCollection);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param lendingCollection The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(final LdLendingCollection lendingCollection) {
        doUpdate(lendingCollection, null);
    }

    protected void doUpdate(LdLendingCollection lendingCollection, final UpdateOption<LdLendingCollectionCB> op) {
        assertObjectNotNull("lendingCollection", lendingCollection);
        prepareUpdateOption(op);
        helpUpdateInternally(lendingCollection, new InternalUpdateCallback<LdLendingCollection>() {
            public int callbackDelegateUpdate(LdLendingCollection et) { return delegateUpdate(et, op); } });
    }

    protected void prepareUpdateOption(UpdateOption<LdLendingCollectionCB> op) {
        if (op == null) { return; }
        assertUpdateOptionStatus(op);
        if (op.hasSelfSpecification()) {
            op.resolveSelfSpecification(createCBForVaryingUpdate());
        }
        if (op.hasSpecifiedUpdateColumn()) {
            op.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    protected LdLendingCollectionCB createCBForVaryingUpdate() {
        LdLendingCollectionCB cb = newMyConditionBean();
        cb.xsetupForVaryingUpdate();
        return cb;
    }

    protected LdLendingCollectionCB createCBForSpecifiedUpdate() {
        LdLendingCollectionCB cb = newMyConditionBean();
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
     * LdLendingCollection lendingCollection = new LdLendingCollection();
     * lendingCollection.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * lendingCollection.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//lendingCollection.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//lendingCollection.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//lendingCollection.setVersionNo(value);</span>
     * lendingCollectionBhv.<span style="color: #FD4747">updateNonstrict</span>(lendingCollection);
     * </pre>
     * @param lendingCollection The entity of update target. (NotNull, PrimaryKeyNotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void updateNonstrict(final LdLendingCollection lendingCollection) {
        doUpdateNonstrict(lendingCollection, null);
    }

    protected void doUpdateNonstrict(LdLendingCollection lendingCollection, final UpdateOption<LdLendingCollectionCB> op) {
        assertObjectNotNull("lendingCollection", lendingCollection);
        prepareUpdateOption(op);
        helpUpdateNonstrictInternally(lendingCollection, new InternalUpdateNonstrictCallback<LdLendingCollection>() {
            public int callbackDelegateUpdateNonstrict(LdLendingCollection et) { return delegateUpdateNonstrict(et, op); } });
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
     * @param lendingCollection The entity of insert or update target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(LdLendingCollection lendingCollection) {
        doInesrtOrUpdate(lendingCollection, null, null);
    }

    protected void doInesrtOrUpdate(LdLendingCollection lendingCollection, final InsertOption<LdLendingCollectionCB> iop, final UpdateOption<LdLendingCollectionCB> uop) {
        helpInsertOrUpdateInternally(lendingCollection, new InternalInsertOrUpdateCallback<LdLendingCollection, LdLendingCollectionCB>() {
            public void callbackInsert(LdLendingCollection et) { doInsert(et, iop); }
            public void callbackUpdate(LdLendingCollection et) { doUpdate(et, uop); }
            public LdLendingCollectionCB callbackNewMyConditionBean() { return newMyConditionBean(); }
            public int callbackSelectCount(LdLendingCollectionCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrModify(Entity et, InsertOption<? extends ConditionBean> iop, UpdateOption<? extends ConditionBean> uop) {
        if (iop == null && uop == null) { insertOrUpdate(downcast(et)); }
        else {
            iop = iop != null ? iop : new InsertOption<LdLendingCollectionCB>();
            uop = uop != null ? uop : new UpdateOption<LdLendingCollectionCB>();
            varyingInsertOrUpdate(downcast(et), downcast(iop), downcast(uop));
        }
    }

    /**
     * Insert or update the entity non-strictly modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br />
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() }
     * <p><span style="color: #FD4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param lendingCollection The entity of insert or update target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdateNonstrict(LdLendingCollection lendingCollection) {
        doInesrtOrUpdateNonstrict(lendingCollection, null, null);
    }

    protected void doInesrtOrUpdateNonstrict(LdLendingCollection lendingCollection, final InsertOption<LdLendingCollectionCB> iop, final UpdateOption<LdLendingCollectionCB> uop) {
        helpInsertOrUpdateInternally(lendingCollection, new InternalInsertOrUpdateNonstrictCallback<LdLendingCollection>() {
            public void callbackInsert(LdLendingCollection et) { doInsert(et, iop); }
            public void callbackUpdateNonstrict(LdLendingCollection et) { doUpdateNonstrict(et, uop); }
        });
    }

    @Override
    protected void doCreateOrModifyNonstrict(Entity et, InsertOption<? extends ConditionBean> iop, UpdateOption<? extends ConditionBean> uop) {
        if (iop == null && uop == null) { insertOrUpdateNonstrict(downcast(et)); }
        else {
            iop = iop != null ? iop : new InsertOption<LdLendingCollectionCB>();
            uop = uop != null ? uop : new UpdateOption<LdLendingCollectionCB>();
            varyingInsertOrUpdateNonstrict(downcast(et), downcast(iop), downcast(uop));
        }
    }

    /**
     * Delete the entity. (ZeroUpdateException, ExclusiveControl)
     * <pre>
     * LdLendingCollection lendingCollection = new LdLendingCollection();
     * lendingCollection.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * lendingCollection.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     lendingCollectionBhv.<span style="color: #FD4747">delete</span>(lendingCollection);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param lendingCollection The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(LdLendingCollection lendingCollection) {
        doDelete(lendingCollection, null);
    }

    protected void doDelete(LdLendingCollection lendingCollection, final DeleteOption<LdLendingCollectionCB> op) {
        assertObjectNotNull("lendingCollection", lendingCollection);
        prepareDeleteOption(op);
        helpDeleteInternally(lendingCollection, new InternalDeleteCallback<LdLendingCollection>() {
            public int callbackDelegateDelete(LdLendingCollection et) { return delegateDelete(et, op); } });
    }

    protected void prepareDeleteOption(DeleteOption<LdLendingCollectionCB> op) {
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
     * LdLendingCollection lendingCollection = new LdLendingCollection();
     * lendingCollection.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//lendingCollection.setVersionNo(value);</span>
     * lendingCollectionBhv.<span style="color: #FD4747">deleteNonstrict</span>(lendingCollection);
     * </pre>
     * @param lendingCollection The entity of delete target. (NotNull, PrimaryKeyNotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrict(LdLendingCollection lendingCollection) {
        doDeleteNonstrict(lendingCollection, null);
    }

    protected void doDeleteNonstrict(LdLendingCollection lendingCollection, final DeleteOption<LdLendingCollectionCB> op) {
        assertObjectNotNull("lendingCollection", lendingCollection);
        prepareDeleteOption(op);
        helpDeleteNonstrictInternally(lendingCollection, new InternalDeleteNonstrictCallback<LdLendingCollection>() {
            public int callbackDelegateDeleteNonstrict(LdLendingCollection et) { return delegateDeleteNonstrict(et, op); } });
    }

    /**
     * Delete the entity non-strictly ignoring deleted. {ZeroUpdateException, NonExclusiveControl}
     * <pre>
     * LdLendingCollection lendingCollection = new LdLendingCollection();
     * lendingCollection.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//lendingCollection.setVersionNo(value);</span>
     * lendingCollectionBhv.<span style="color: #FD4747">deleteNonstrictIgnoreDeleted</span>(lendingCollection);
     * <span style="color: #3F7E5E">// if the target entity doesn't exist, no exception</span>
     * </pre>
     * @param lendingCollection The entity of delete target. (NotNull, PrimaryKeyNotNull)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrictIgnoreDeleted(LdLendingCollection lendingCollection) {
        doDeleteNonstrictIgnoreDeleted(lendingCollection, null);
    }

    protected void doDeleteNonstrictIgnoreDeleted(LdLendingCollection lendingCollection, final DeleteOption<LdLendingCollectionCB> op) {
        assertObjectNotNull("lendingCollection", lendingCollection);
        prepareDeleteOption(op);
        helpDeleteNonstrictIgnoreDeletedInternally(lendingCollection, new InternalDeleteNonstrictIgnoreDeletedCallback<LdLendingCollection>() {
            public int callbackDelegateDeleteNonstrict(LdLendingCollection et) { return delegateDeleteNonstrict(et, op); } });
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
     *     LdLendingCollection lendingCollection = new LdLendingCollection();
     *     lendingCollection.setFooName("foo");
     *     if (...) {
     *         lendingCollection.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     lendingCollectionList.add(lendingCollection);
     * }
     * lendingCollectionBhv.<span style="color: #FD4747">batchInsert</span>(lendingCollectionList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param lendingCollectionList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<LdLendingCollection> lendingCollectionList) {
        InsertOption<LdLendingCollectionCB> op = createInsertUpdateOption();
        return doBatchInsert(lendingCollectionList, op);
    }

    protected int[] doBatchInsert(List<LdLendingCollection> lendingCollectionList, InsertOption<LdLendingCollectionCB> op) {
        assertObjectNotNull("lendingCollectionList", lendingCollectionList);
        prepareBatchInsertOption(lendingCollectionList, op);
        return delegateBatchInsert(lendingCollectionList, op);
    }

    protected void prepareBatchInsertOption(List<LdLendingCollection> lendingCollectionList, InsertOption<LdLendingCollectionCB> op) {
        op.xallowInsertColumnModifiedPropertiesFragmented();
        op.xacceptInsertColumnModifiedPropertiesIfNeeds(lendingCollectionList);
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
     *     LdLendingCollection lendingCollection = new LdLendingCollection();
     *     lendingCollection.setFooName("foo");
     *     if (...) {
     *         lendingCollection.setFooPrice(123);
     *     } else {
     *         lendingCollection.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//lendingCollection.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     lendingCollectionList.add(lendingCollection);
     * }
     * lendingCollectionBhv.<span style="color: #FD4747">batchUpdate</span>(lendingCollectionList);
     * </pre>
     * @param lendingCollectionList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<LdLendingCollection> lendingCollectionList) {
        UpdateOption<LdLendingCollectionCB> op = createPlainUpdateOption();
        return doBatchUpdate(lendingCollectionList, op);
    }

    protected int[] doBatchUpdate(List<LdLendingCollection> lendingCollectionList, UpdateOption<LdLendingCollectionCB> op) {
        assertObjectNotNull("lendingCollectionList", lendingCollectionList);
        prepareBatchUpdateOption(lendingCollectionList, op);
        return delegateBatchUpdate(lendingCollectionList, op);
    }

    protected void prepareBatchUpdateOption(List<LdLendingCollection> lendingCollectionList, UpdateOption<LdLendingCollectionCB> op) {
        op.xacceptUpdateColumnModifiedPropertiesIfNeeds(lendingCollectionList);
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
     * lendingCollectionBhv.<span style="color: #FD4747">batchUpdate</span>(lendingCollectionList, new SpecifyQuery<LdLendingCollectionCB>() {
     *     public void specify(LdLendingCollectionCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #FD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #FD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * lendingCollectionBhv.<span style="color: #FD4747">batchUpdate</span>(lendingCollectionList, new SpecifyQuery<LdLendingCollectionCB>() {
     *     public void specify(LdLendingCollectionCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #FD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param lendingCollectionList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<LdLendingCollection> lendingCollectionList, SpecifyQuery<LdLendingCollectionCB> updateColumnSpec) {
        return doBatchUpdate(lendingCollectionList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    /**
     * Batch-update the entity list non-strictly modified-only of same-set columns. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <span style="color: #FD4747; font-size: 140%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     LdLendingCollection lendingCollection = new LdLendingCollection();
     *     lendingCollection.setFooName("foo");
     *     if (...) {
     *         lendingCollection.setFooPrice(123);
     *     } else {
     *         lendingCollection.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//lendingCollection.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     lendingCollectionList.add(lendingCollection);
     * }
     * lendingCollectionBhv.<span style="color: #FD4747">batchUpdate</span>(lendingCollectionList);
     * </pre>
     * @param lendingCollectionList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<LdLendingCollection> lendingCollectionList) {
        UpdateOption<LdLendingCollectionCB> option = createPlainUpdateOption();
        return doBatchUpdateNonstrict(lendingCollectionList, option);
    }

    protected int[] doBatchUpdateNonstrict(List<LdLendingCollection> lendingCollectionList, UpdateOption<LdLendingCollectionCB> op) {
        assertObjectNotNull("lendingCollectionList", lendingCollectionList);
        prepareBatchUpdateOption(lendingCollectionList, op);
        return delegateBatchUpdateNonstrict(lendingCollectionList, op);
    }

    /**
     * Batch-update the entity list non-strictly specified-only. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * lendingCollectionBhv.<span style="color: #FD4747">batchUpdateNonstrict</span>(lendingCollectionList, new SpecifyQuery<LdLendingCollectionCB>() {
     *     public void specify(LdLendingCollectionCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #FD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #FD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * lendingCollectionBhv.<span style="color: #FD4747">batchUpdateNonstrict</span>(lendingCollectionList, new SpecifyQuery<LdLendingCollectionCB>() {
     *     public void specify(LdLendingCollectionCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #FD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).</p>
     * @param lendingCollectionList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<LdLendingCollection> lendingCollectionList, SpecifyQuery<LdLendingCollectionCB> updateColumnSpec) {
        return doBatchUpdateNonstrict(lendingCollectionList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> op) {
        if (op == null) { return batchUpdateNonstrict(downcast(ls)); }
        else { return varyingBatchUpdateNonstrict(downcast(ls), downcast(op)); }
    }

    /**
     * Batch-delete the entity list. (ExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param lendingCollectionList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchDelete(List<LdLendingCollection> lendingCollectionList) {
        return doBatchDelete(lendingCollectionList, null);
    }

    protected int[] doBatchDelete(List<LdLendingCollection> lendingCollectionList, DeleteOption<LdLendingCollectionCB> op) {
        assertObjectNotNull("lendingCollectionList", lendingCollectionList);
        prepareDeleteOption(op);
        return delegateBatchDelete(lendingCollectionList, op);
    }

    @Override
    protected int[] doLumpRemove(List<Entity> ls, DeleteOption<? extends ConditionBean> op) {
        if (op == null) { return batchDelete(downcast(ls)); }
        else { return varyingBatchDelete(downcast(ls), downcast(op)); }
    }

    /**
     * Batch-delete the entity list non-strictly. {NonExclusiveControl} <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param lendingCollectionList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDeleteNonstrict(List<LdLendingCollection> lendingCollectionList) {
        return doBatchDeleteNonstrict(lendingCollectionList, null);
    }

    protected int[] doBatchDeleteNonstrict(List<LdLendingCollection> lendingCollectionList, DeleteOption<LdLendingCollectionCB> op) {
        assertObjectNotNull("lendingCollectionList", lendingCollectionList);
        prepareDeleteOption(op);
        return delegateBatchDeleteNonstrict(lendingCollectionList, op);
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
     * lendingCollectionBhv.<span style="color: #FD4747">queryInsert</span>(new QueryInsertSetupper&lt;LdLendingCollection, LdLendingCollectionCB&gt;() {
     *     public ConditionBean setup(lendingCollection entity, LdLendingCollectionCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<LdLendingCollection, LdLendingCollectionCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(QueryInsertSetupper<LdLendingCollection, LdLendingCollectionCB> sp, InsertOption<LdLendingCollectionCB> op) {
        assertObjectNotNull("setupper", sp);
        prepareInsertOption(op);
        LdLendingCollection e = new LdLendingCollection();
        LdLendingCollectionCB cb = createCBForQueryInsert();
        return delegateQueryInsert(e, cb, sp.setup(e, cb), op);
    }

    protected LdLendingCollectionCB createCBForQueryInsert() {
        LdLendingCollectionCB cb = newMyConditionBean();
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
     * LdLendingCollection lendingCollection = new LdLendingCollection();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//lendingCollection.setPK...(value);</span>
     * lendingCollection.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//lendingCollection.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//lendingCollection.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//lendingCollection.setVersionNo(value);</span>
     * LdLendingCollectionCB cb = new LdLendingCollectionCB();
     * cb.query().setFoo...(value);
     * lendingCollectionBhv.<span style="color: #FD4747">queryUpdate</span>(lendingCollection, cb);
     * </pre>
     * @param lendingCollection The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of LdLendingCollection. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(LdLendingCollection lendingCollection, LdLendingCollectionCB cb) {
        return doQueryUpdate(lendingCollection, cb, null);
    }

    protected int doQueryUpdate(LdLendingCollection lendingCollection, LdLendingCollectionCB cb, UpdateOption<LdLendingCollectionCB> op) {
        assertObjectNotNull("lendingCollection", lendingCollection); assertCBStateValid(cb);
        prepareUpdateOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryUpdate(lendingCollection, cb, op) : 0;
    }

    @Override
    protected int doRangeModify(Entity et, ConditionBean cb, UpdateOption<? extends ConditionBean> op) {
        if (op == null) { return queryUpdate(downcast(et), (LdLendingCollectionCB)cb); }
        else { return varyingQueryUpdate(downcast(et), (LdLendingCollectionCB)cb, downcast(op)); }
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * LdLendingCollectionCB cb = new LdLendingCollectionCB();
     * cb.query().setFoo...(value);
     * lendingCollectionBhv.<span style="color: #FD4747">queryDelete</span>(lendingCollection, cb);
     * </pre>
     * @param cb The condition-bean of LdLendingCollection. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(LdLendingCollectionCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(LdLendingCollectionCB cb, DeleteOption<LdLendingCollectionCB> op) {
        assertCBStateValid(cb);
        prepareDeleteOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryDelete(cb, op) : 0;
    }

    @Override
    protected int doRangeRemove(ConditionBean cb, DeleteOption<? extends ConditionBean> op) {
        if (op == null) { return queryDelete((LdLendingCollectionCB)cb); }
        else { return varyingQueryDelete((LdLendingCollectionCB)cb, downcast(op)); }
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
     * LdLendingCollection lendingCollection = new LdLendingCollection();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * lendingCollection.setFoo...(value);
     * lendingCollection.setBar...(value);
     * InsertOption<LdLendingCollectionCB> option = new InsertOption<LdLendingCollectionCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * lendingCollectionBhv.<span style="color: #FD4747">varyingInsert</span>(lendingCollection, option);
     * ... = lendingCollection.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param lendingCollection The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(LdLendingCollection lendingCollection, InsertOption<LdLendingCollectionCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(lendingCollection, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, ExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * LdLendingCollection lendingCollection = new LdLendingCollection();
     * lendingCollection.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * lendingCollection.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * lendingCollection.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;LdLendingCollectionCB&gt; option = new UpdateOption&lt;LdLendingCollectionCB&gt;();
     *     option.self(new SpecifyQuery&lt;LdLendingCollectionCB&gt;() {
     *         public void specify(LdLendingCollectionCB cb) {
     *             cb.specify().<span style="color: #FD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     lendingCollectionBhv.<span style="color: #FD4747">varyingUpdate</span>(lendingCollection, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param lendingCollection The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(LdLendingCollection lendingCollection, UpdateOption<LdLendingCollectionCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(lendingCollection, option);
    }

    /**
     * Update the entity with varying requests non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as updateNonstrict(entity).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * LdLendingCollection lendingCollection = new LdLendingCollection();
     * lendingCollection.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * lendingCollection.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//lendingCollection.setVersionNo(value);</span>
     * UpdateOption&lt;LdLendingCollectionCB&gt; option = new UpdateOption&lt;LdLendingCollectionCB&gt;();
     * option.self(new SpecifyQuery&lt;LdLendingCollectionCB&gt;() {
     *     public void specify(LdLendingCollectionCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * lendingCollectionBhv.<span style="color: #FD4747">varyingUpdateNonstrict</span>(lendingCollection, option);
     * </pre>
     * @param lendingCollection The entity of update target. (NotNull, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdateNonstrict(LdLendingCollection lendingCollection, UpdateOption<LdLendingCollectionCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdateNonstrict(lendingCollection, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param lendingCollection The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(LdLendingCollection lendingCollection, InsertOption<LdLendingCollectionCB> insertOption, UpdateOption<LdLendingCollectionCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdate(lendingCollection, insertOption, updateOption);
    }

    /**
     * Insert or update the entity with varying requests non-strictly. (NonExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdateNonstrict(entity).
     * @param lendingCollection The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdateNonstrict(LdLendingCollection lendingCollection, InsertOption<LdLendingCollectionCB> insertOption, UpdateOption<LdLendingCollectionCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdateNonstrict(lendingCollection, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, ExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param lendingCollection The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(LdLendingCollection lendingCollection, DeleteOption<LdLendingCollectionCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(lendingCollection, option);
    }

    /**
     * Delete the entity with varying requests non-strictly. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as deleteNonstrict(entity).
     * @param lendingCollection The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDeleteNonstrict(LdLendingCollection lendingCollection, DeleteOption<LdLendingCollectionCB> option) {
        assertDeleteOptionNotNull(option);
        doDeleteNonstrict(lendingCollection, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param lendingCollectionList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<LdLendingCollection> lendingCollectionList, InsertOption<LdLendingCollectionCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(lendingCollectionList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param lendingCollectionList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<LdLendingCollection> lendingCollectionList, UpdateOption<LdLendingCollectionCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(lendingCollectionList, option);
    }

    /**
     * Batch-update the list with varying requests non-strictly. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param lendingCollectionList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdateNonstrict(List<LdLendingCollection> lendingCollectionList, UpdateOption<LdLendingCollectionCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdateNonstrict(lendingCollectionList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param lendingCollectionList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<LdLendingCollection> lendingCollectionList, DeleteOption<LdLendingCollectionCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(lendingCollectionList, option);
    }

    /**
     * Batch-delete the list with varying requests non-strictly. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDeleteNonstrict(entityList).
     * @param lendingCollectionList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDeleteNonstrict(List<LdLendingCollection> lendingCollectionList, DeleteOption<LdLendingCollectionCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDeleteNonstrict(lendingCollectionList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<LdLendingCollection, LdLendingCollectionCB> setupper, InsertOption<LdLendingCollectionCB> option) {
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
     * LdLendingCollection lendingCollection = new LdLendingCollection();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//lendingCollection.setPK...(value);</span>
     * lendingCollection.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//lendingCollection.setVersionNo(value);</span>
     * LdLendingCollectionCB cb = new LdLendingCollectionCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;LdLendingCollectionCB&gt; option = new UpdateOption&lt;LdLendingCollectionCB&gt;();
     * option.self(new SpecifyQuery&lt;LdLendingCollectionCB&gt;() {
     *     public void specify(LdLendingCollectionCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * lendingCollectionBhv.<span style="color: #FD4747">varyingQueryUpdate</span>(lendingCollection, cb, option);
     * </pre>
     * @param lendingCollection The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of LdLendingCollection. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(LdLendingCollection lendingCollection, LdLendingCollectionCB cb, UpdateOption<LdLendingCollectionCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(lendingCollection, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of LdLendingCollection. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(LdLendingCollectionCB cb, DeleteOption<LdLendingCollectionCB> option) {
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
    public OutsideSqlBasicExecutor<LdLendingCollectionBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCountUniquely(LdLendingCollectionCB cb) { return invoke(createSelectCountCBCommand(cb, true)); }
    protected int delegateSelectCountPlainly(LdLendingCollectionCB cb) { return invoke(createSelectCountCBCommand(cb, false)); }
    protected <ENTITY extends LdLendingCollection> void delegateSelectCursor(LdLendingCollectionCB cb, EntityRowHandler<ENTITY> rh, Class<ENTITY> tp)
    { invoke(createSelectCursorCBCommand(cb, rh, tp)); }
    protected <ENTITY extends LdLendingCollection> List<ENTITY> delegateSelectList(LdLendingCollectionCB cb, Class<ENTITY> tp)
    { return invoke(createSelectListCBCommand(cb, tp)); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(LdLendingCollection et, InsertOption<LdLendingCollectionCB> op)
    { if (!processBeforeInsert(et, op)) { return 0; }
      return invoke(createInsertEntityCommand(et, op)); }
    protected int delegateUpdate(LdLendingCollection et, UpdateOption<LdLendingCollectionCB> op)
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return invoke(createUpdateEntityCommand(et, op)); }
    protected int delegateUpdateNonstrict(LdLendingCollection et, UpdateOption<LdLendingCollectionCB> op)
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return invoke(createUpdateNonstrictEntityCommand(et, op)); }
    protected int delegateDelete(LdLendingCollection et, DeleteOption<LdLendingCollectionCB> op)
    { if (!processBeforeDelete(et, op)) { return 0; }
      return invoke(createDeleteEntityCommand(et, op)); }
    protected int delegateDeleteNonstrict(LdLendingCollection et, DeleteOption<LdLendingCollectionCB> op)
    { if (!processBeforeDelete(et, op)) { return 0; }
      return invoke(createDeleteNonstrictEntityCommand(et, op)); }

    protected int[] delegateBatchInsert(List<LdLendingCollection> ls, InsertOption<LdLendingCollectionCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchInsertCommand(processBatchInternally(ls, op), op)); }
    protected int[] delegateBatchUpdate(List<LdLendingCollection> ls, UpdateOption<LdLendingCollectionCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateCommand(processBatchInternally(ls, op, false), op)); }
    protected int[] delegateBatchUpdateNonstrict(List<LdLendingCollection> ls, UpdateOption<LdLendingCollectionCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateNonstrictCommand(processBatchInternally(ls, op, true), op)); }
    protected int[] delegateBatchDelete(List<LdLendingCollection> ls, DeleteOption<LdLendingCollectionCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteCommand(processBatchInternally(ls, op, false), op)); }
    protected int[] delegateBatchDeleteNonstrict(List<LdLendingCollection> ls, DeleteOption<LdLendingCollectionCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteNonstrictCommand(processBatchInternally(ls, op, true), op)); }

    protected int delegateQueryInsert(LdLendingCollection et, LdLendingCollectionCB inCB, ConditionBean resCB, InsertOption<LdLendingCollectionCB> op)
    { if (!processBeforeQueryInsert(et, inCB, resCB, op)) { return 0; } return invoke(createQueryInsertCBCommand(et, inCB, resCB, op));  }
    protected int delegateQueryUpdate(LdLendingCollection et, LdLendingCollectionCB cb, UpdateOption<LdLendingCollectionCB> op)
    { if (!processBeforeQueryUpdate(et, cb, op)) { return 0; } return invoke(createQueryUpdateCBCommand(et, cb, op));  }
    protected int delegateQueryDelete(LdLendingCollectionCB cb, DeleteOption<LdLendingCollectionCB> op)
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
    protected LdLendingCollection downcast(Entity et) {
        return helpEntityDowncastInternally(et, LdLendingCollection.class);
    }

    protected LdLendingCollectionCB downcast(ConditionBean cb) {
        return helpConditionBeanDowncastInternally(cb, LdLendingCollectionCB.class);
    }

    @SuppressWarnings("unchecked")
    protected List<LdLendingCollection> downcast(List<? extends Entity> ls) {
        return (List<LdLendingCollection>)ls;
    }

    @SuppressWarnings("unchecked")
    protected InsertOption<LdLendingCollectionCB> downcast(InsertOption<? extends ConditionBean> op) {
        return (InsertOption<LdLendingCollectionCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected UpdateOption<LdLendingCollectionCB> downcast(UpdateOption<? extends ConditionBean> op) {
        return (UpdateOption<LdLendingCollectionCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected DeleteOption<LdLendingCollectionCB> downcast(DeleteOption<? extends ConditionBean> op) {
        return (DeleteOption<LdLendingCollectionCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<LdLendingCollection, LdLendingCollectionCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> sp) {
        return (QueryInsertSetupper<LdLendingCollection, LdLendingCollectionCB>)sp;
    }
}
