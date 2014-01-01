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
 * The behavior of COLLECTION as TABLE. <br />
 * <pre>
 * [primary key]
 *     COLLECTION_ID
 * 
 * [column]
 *     COLLECTION_ID, LIBRARY_ID, BOOK_ID, ARRIVAL_DATE, R_USER, R_MODULE, R_TIMESTAMP, U_USER, U_MODULE, U_TIMESTAMP
 * 
 * [sequence]
 *     
 * 
 * [identity]
 *     COLLECTION_ID
 * 
 * [version-no]
 *     
 * 
 * [foreign table]
 *     BOOK, LIBRARY, COLLECTION_STATUS(AsOne)
 * 
 * [referrer table]
 *     LENDING_COLLECTION, COLLECTION_STATUS
 * 
 * [foreign property]
 *     book, library, collectionStatusAsOne
 * 
 * [referrer property]
 *     lendingCollectionList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class LdBsCollectionBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "COLLECTION"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public DBMeta getDBMeta() { return LdCollectionDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public LdCollectionDbm getMyDBMeta() { return LdCollectionDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public Entity newEntity() { return newMyEntity(); }

    /** {@inheritDoc} */
    public ConditionBean newConditionBean() { return newMyConditionBean(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public LdCollection newMyEntity() { return new LdCollection(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public LdCollectionCB newMyConditionBean() { return new LdCollectionCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * LdCollectionCB cb = new LdCollectionCB();
     * cb.query().setFoo...(value);
     * int count = collectionBhv.<span style="color: #FD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of LdCollection. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(LdCollectionCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(LdCollectionCB cb) { // called by selectCount(cb) 
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(LdCollectionCB cb) { // called by selectPage(cb)
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
     * LdCollectionCB cb = new LdCollectionCB();
     * cb.query().setFoo...(value);
     * LdCollection collection = collectionBhv.<span style="color: #FD4747">selectEntity</span>(cb);
     * if (collection != null) {
     *     ... = collection.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of LdCollection. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public LdCollection selectEntity(LdCollectionCB cb) {
        return doSelectEntity(cb, LdCollection.class);
    }

    protected <ENTITY extends LdCollection> ENTITY doSelectEntity(final LdCollectionCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityInternally(cb, entityType, new InternalSelectEntityCallback<ENTITY, LdCollectionCB>() {
            public List<ENTITY> callbackSelectList(LdCollectionCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); } });
    }

    @Override
    protected Entity doReadEntity(ConditionBean cb) {
        return selectEntity(downcast(cb));
    }

    /**
     * Select the entity by the condition-bean with deleted check.
     * <pre>
     * LdCollectionCB cb = new LdCollectionCB();
     * cb.query().setFoo...(value);
     * LdCollection collection = collectionBhv.<span style="color: #FD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = collection.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of LdCollection. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public LdCollection selectEntityWithDeletedCheck(LdCollectionCB cb) {
        return doSelectEntityWithDeletedCheck(cb, LdCollection.class);
    }

    protected <ENTITY extends LdCollection> ENTITY doSelectEntityWithDeletedCheck(final LdCollectionCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityWithDeletedCheckInternally(cb, entityType, new InternalSelectEntityWithDeletedCheckCallback<ENTITY, LdCollectionCB>() {
            public List<ENTITY> callbackSelectList(LdCollectionCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); } });
    }

    @Override
    protected Entity doReadEntityWithDeletedCheck(ConditionBean cb) {
        return selectEntityWithDeletedCheck(downcast(cb));
    }

    /**
     * Select the entity by the primary-key value.
     * @param collectionId The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public LdCollection selectByPKValue(Integer collectionId) {
        return doSelectByPKValue(collectionId, LdCollection.class);
    }

    protected <ENTITY extends LdCollection> ENTITY doSelectByPKValue(Integer collectionId, Class<ENTITY> entityType) {
        return doSelectEntity(buildPKCB(collectionId), entityType);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param collectionId The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public LdCollection selectByPKValueWithDeletedCheck(Integer collectionId) {
        return doSelectByPKValueWithDeletedCheck(collectionId, LdCollection.class);
    }

    protected <ENTITY extends LdCollection> ENTITY doSelectByPKValueWithDeletedCheck(Integer collectionId, Class<ENTITY> entityType) {
        return doSelectEntityWithDeletedCheck(buildPKCB(collectionId), entityType);
    }

    private LdCollectionCB buildPKCB(Integer collectionId) {
        assertObjectNotNull("collectionId", collectionId);
        LdCollectionCB cb = newMyConditionBean();
        cb.query().setCollectionId_Equal(collectionId);
        return cb;
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * LdCollectionCB cb = new LdCollectionCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;LdCollection&gt; collectionList = collectionBhv.<span style="color: #FD4747">selectList</span>(cb);
     * for (LdCollection collection : collectionList) {
     *     ... = collection.get...();
     * }
     * </pre>
     * @param cb The condition-bean of LdCollection. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<LdCollection> selectList(LdCollectionCB cb) {
        return doSelectList(cb, LdCollection.class);
    }

    protected <ENTITY extends LdCollection> ListResultBean<ENTITY> doSelectList(LdCollectionCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", entityType);
        assertSpecifyDerivedReferrerEntityProperty(cb, entityType);
        return helpSelectListInternally(cb, entityType, new InternalSelectListCallback<ENTITY, LdCollectionCB>() {
            public List<ENTITY> callbackSelectList(LdCollectionCB cb, Class<ENTITY> entityType) { return delegateSelectList(cb, entityType); } });
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
     * LdCollectionCB cb = new LdCollectionCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #FD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;LdCollection&gt; page = collectionBhv.<span style="color: #FD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (LdCollection collection : page) {
     *     ... = collection.get...();
     * }
     * </pre>
     * @param cb The condition-bean of LdCollection. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<LdCollection> selectPage(LdCollectionCB cb) {
        return doSelectPage(cb, LdCollection.class);
    }

    protected <ENTITY extends LdCollection> PagingResultBean<ENTITY> doSelectPage(LdCollectionCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", entityType);
        return helpSelectPageInternally(cb, entityType, new InternalSelectPageCallback<ENTITY, LdCollectionCB>() {
            public int callbackSelectCount(LdCollectionCB cb) { return doSelectCountPlainly(cb); }
            public List<ENTITY> callbackSelectList(LdCollectionCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); }
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
     * LdCollectionCB cb = new LdCollectionCB();
     * cb.query().setFoo...(value);
     * collectionBhv.<span style="color: #FD4747">selectCursor</span>(cb, new EntityRowHandler&lt;LdCollection&gt;() {
     *     public void handle(LdCollection entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of LdCollection. (NotNull)
     * @param entityRowHandler The handler of entity row of LdCollection. (NotNull)
     */
    public void selectCursor(LdCollectionCB cb, EntityRowHandler<LdCollection> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, LdCollection.class);
    }

    protected <ENTITY extends LdCollection> void doSelectCursor(LdCollectionCB cb, EntityRowHandler<ENTITY> entityRowHandler, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler<LdCollection>", entityRowHandler); assertObjectNotNull("entityType", entityType);
        assertSpecifyDerivedReferrerEntityProperty(cb, entityType);
        helpSelectCursorInternally(cb, entityRowHandler, entityType, new InternalSelectCursorCallback<ENTITY, LdCollectionCB>() {
            public void callbackSelectCursor(LdCollectionCB cb, EntityRowHandler<ENTITY> entityRowHandler, Class<ENTITY> entityType) { delegateSelectCursor(cb, entityRowHandler, entityType); }
            public List<ENTITY> callbackSelectList(LdCollectionCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); }
        });
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * collectionBhv.<span style="color: #FD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(LdCollectionCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> SLFunction<LdCollectionCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
    }

    protected <RESULT, CB extends LdCollectionCB> SLFunction<CB, RESULT> doScalarSelect(Class<RESULT> resultType, CB cb) {
        assertObjectNotNull("resultType", resultType); assertCBStateValid(cb);
        cb.xsetupForScalarSelect(); cb.getSqlClause().disableSelectIndex(); // for when you use union
        return createSLFunction(cb, resultType);
    }

    protected <RESULT, CB extends LdCollectionCB> SLFunction<CB, RESULT> createSLFunction(CB cb, Class<RESULT> resultType) {
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
     * @param collection The entity of collection. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     */
    public void loadLendingCollectionList(LdCollection collection, ConditionBeanSetupper<LdLendingCollectionCB> conditionBeanSetupper) {
        xassLRArg(collection, conditionBeanSetupper);
        loadLendingCollectionList(xnewLRLs(collection), conditionBeanSetupper);
    }
    /**
     * Load referrer of lendingCollectionList with the set-upper for condition-bean of referrer. <br />
     * LENDING_COLLECTION by COLLECTION_ID, named 'lendingCollectionList'.
     * <pre>
     * collectionBhv.<span style="color: #FD4747">loadLendingCollectionList</span>(collectionList, new ConditionBeanSetupper&lt;LdLendingCollectionCB&gt;() {
     *     public void setup(LdLendingCollectionCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...(); <span style="color: #3F7E5E">// basically you should order referrer list</span>
     *     }
     * });
     * for (LdCollection collection : collectionList) {
     *     ... = collection.<span style="color: #FD4747">getLendingCollectionList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key(and others too) is treated as case-insensitive. <br />
     * The condition-bean that the set-upper provides have settings before you touch it. It is as follows:
     * <pre>
     * cb.query().setCollectionId_InScope(pkList);
     * cb.query().addOrderBy_CollectionId_Asc();
     * </pre>
     * @param collectionList The entity list of collection. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     */
    public void loadLendingCollectionList(List<LdCollection> collectionList, ConditionBeanSetupper<LdLendingCollectionCB> conditionBeanSetupper) {
        xassLRArg(collectionList, conditionBeanSetupper);
        loadLendingCollectionList(collectionList, new LoadReferrerOption<LdLendingCollectionCB, LdLendingCollection>().xinit(conditionBeanSetupper));
    }
    /**
     * {Refer to overload method that has an argument of the list of entity.}
     * @param collection The entity of collection. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadLendingCollectionList(LdCollection collection, LoadReferrerOption<LdLendingCollectionCB, LdLendingCollection> loadReferrerOption) {
        xassLRArg(collection, loadReferrerOption);
        loadLendingCollectionList(xnewLRLs(collection), loadReferrerOption);
    }
    /**
     * {Refer to overload method that has an argument of condition-bean setupper.}
     * @param collectionList The entity list of collection. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadLendingCollectionList(List<LdCollection> collectionList, LoadReferrerOption<LdLendingCollectionCB, LdLendingCollection> loadReferrerOption) {
        xassLRArg(collectionList, loadReferrerOption);
        if (collectionList.isEmpty()) { return; }
        final LdLendingCollectionBhv referrerBhv = xgetBSFLR().select(LdLendingCollectionBhv.class);
        helpLoadReferrerInternally(collectionList, loadReferrerOption, new InternalLoadReferrerCallback<LdCollection, Integer, LdLendingCollectionCB, LdLendingCollection>() {
            public Integer getPKVal(LdCollection e)
            { return e.getCollectionId(); }
            public void setRfLs(LdCollection e, List<LdLendingCollection> ls)
            { e.setLendingCollectionList(ls); }
            public LdLendingCollectionCB newMyCB() { return referrerBhv.newMyConditionBean(); }
            public void qyFKIn(LdLendingCollectionCB cb, List<Integer> ls)
            { cb.query().setCollectionId_InScope(ls); }
            public void qyOdFKAsc(LdLendingCollectionCB cb) { cb.query().addOrderBy_CollectionId_Asc(); }
            public void spFKCol(LdLendingCollectionCB cb) { cb.specify().columnCollectionId(); }
            public List<LdLendingCollection> selRfLs(LdLendingCollectionCB cb) { return referrerBhv.selectList(cb); }
            public Integer getFKVal(LdLendingCollection e) { return e.getCollectionId(); }
            public void setlcEt(LdLendingCollection re, LdCollection le)
            { re.setCollection(le); }
            public String getRfPrNm() { return "lendingCollectionList"; }
        });
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'LdBook'.
     * @param collectionList The list of collection. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<LdBook> pulloutBook(List<LdCollection> collectionList) {
        return helpPulloutInternally(collectionList, new InternalPulloutCallback<LdCollection, LdBook>() {
            public LdBook getFr(LdCollection e) { return e.getBook(); }
            public boolean hasRf() { return true; }
            public void setRfLs(LdBook e, List<LdCollection> ls)
            { e.setCollectionList(ls); }
        });
    }
    /**
     * Pull out the list of foreign table 'LdLibrary'.
     * @param collectionList The list of collection. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<LdLibrary> pulloutLibrary(List<LdCollection> collectionList) {
        return helpPulloutInternally(collectionList, new InternalPulloutCallback<LdCollection, LdLibrary>() {
            public LdLibrary getFr(LdCollection e) { return e.getLibrary(); }
            public boolean hasRf() { return true; }
            public void setRfLs(LdLibrary e, List<LdCollection> ls)
            { e.setCollectionList(ls); }
        });
    }
    /**
     * Pull out the list of referrer-as-one table 'LdCollectionStatus'.
     * @param collectionList The list of collection. (NotNull, EmptyAllowed)
     * @return The list of referrer-as-one table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<LdCollectionStatus> pulloutCollectionStatusAsOne(List<LdCollection> collectionList) {
        return helpPulloutInternally(collectionList, new InternalPulloutCallback<LdCollection, LdCollectionStatus>() {
            public LdCollectionStatus getFr(LdCollection e) { return e.getCollectionStatusAsOne(); }
            public boolean hasRf() { return true; }
            public void setRfLs(LdCollectionStatus e, List<LdCollection> ls)
            { if (!ls.isEmpty()) { e.setCollection(ls.get(0)); } }
        });
    }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key collectionId.
     * @param collectionList The list of collection. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Integer> extractCollectionIdList(List<LdCollection> collectionList) {
        return helpExtractListInternally(collectionList, new InternalExtractCallback<LdCollection, Integer>() {
            public Integer getCV(LdCollection e) { return e.getCollectionId(); }
        });
    }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * LdCollection collection = new LdCollection();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * collection.setFoo...(value);
     * collection.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//collection.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//collection.set...;</span>
     * collectionBhv.<span style="color: #FD4747">insert</span>(collection);
     * ... = collection.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param collection The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(LdCollection collection) {
        doInsert(collection, null);
    }

    protected void doInsert(LdCollection collection, InsertOption<LdCollectionCB> option) {
        assertObjectNotNull("collection", collection);
        prepareInsertOption(option);
        delegateInsert(collection, option);
    }

    protected void prepareInsertOption(InsertOption<LdCollectionCB> option) {
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
     * LdCollection collection = new LdCollection();
     * collection.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * collection.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//collection.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//collection.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * collection.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     collectionBhv.<span style="color: #FD4747">update</span>(collection);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * } 
     * </pre>
     * @param collection The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(final LdCollection collection) {
        doUpdate(collection, null);
    }

    protected void doUpdate(LdCollection collection, final UpdateOption<LdCollectionCB> option) {
        assertObjectNotNull("collection", collection);
        prepareUpdateOption(option);
        helpUpdateInternally(collection, new InternalUpdateCallback<LdCollection>() {
            public int callbackDelegateUpdate(LdCollection entity) { return delegateUpdate(entity, option); } });
    }

    protected void prepareUpdateOption(UpdateOption<LdCollectionCB> option) {
        if (option == null) { return; }
        assertUpdateOptionStatus(option);
        if (option.hasSelfSpecification()) {
            option.resolveSelfSpecification(createCBForVaryingUpdate());
        }
        if (option.hasSpecifiedUpdateColumn()) {
            option.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    protected LdCollectionCB createCBForVaryingUpdate() {
        LdCollectionCB cb = newMyConditionBean();
        cb.xsetupForVaryingUpdate();
        return cb;
    }

    protected LdCollectionCB createCBForSpecifiedUpdate() {
        LdCollectionCB cb = newMyConditionBean();
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
     * LdCollection collection = new LdCollection();
     * collection.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * collection.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//collection.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//collection.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//collection.setVersionNo(value);</span>
     * collectionBhv.<span style="color: #FD4747">updateNonstrict</span>(collection);
     * </pre>
     * @param collection The entity of update target. (NotNull, PrimaryKeyNotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void updateNonstrict(final LdCollection collection) {
        doUpdateNonstrict(collection, null);
    }

    protected void doUpdateNonstrict(LdCollection collection, final UpdateOption<LdCollectionCB> option) {
        assertObjectNotNull("collection", collection);
        prepareUpdateOption(option);
        helpUpdateNonstrictInternally(collection, new InternalUpdateNonstrictCallback<LdCollection>() {
            public int callbackDelegateUpdateNonstrict(LdCollection entity) { return delegateUpdateNonstrict(entity, option); } });
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
     * @param collection The entity of insert or update target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(LdCollection collection) {
        doInesrtOrUpdate(collection, null, null);
    }

    protected void doInesrtOrUpdate(LdCollection collection, final InsertOption<LdCollectionCB> insertOption, final UpdateOption<LdCollectionCB> updateOption) {
        helpInsertOrUpdateInternally(collection, new InternalInsertOrUpdateCallback<LdCollection, LdCollectionCB>() {
            public void callbackInsert(LdCollection entity) { doInsert(entity, insertOption); }
            public void callbackUpdate(LdCollection entity) { doUpdate(entity, updateOption); }
            public LdCollectionCB callbackNewMyConditionBean() { return newMyConditionBean(); }
            public int callbackSelectCount(LdCollectionCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrModify(Entity entity, InsertOption<? extends ConditionBean> insertOption,
            UpdateOption<? extends ConditionBean> updateOption) {
        if (insertOption == null && updateOption == null) { insertOrUpdate(downcast(entity)); }
        else {
            insertOption = insertOption == null ? new InsertOption<LdCollectionCB>() : insertOption;
            updateOption = updateOption == null ? new UpdateOption<LdCollectionCB>() : updateOption;
            varyingInsertOrUpdate(downcast(entity), downcast(insertOption), downcast(updateOption));
        }
    }

    /**
     * Insert or update the entity non-strictly modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br />
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() }
     * <p><span style="color: #FD4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param collection The entity of insert or update target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdateNonstrict(LdCollection collection) {
        doInesrtOrUpdateNonstrict(collection, null, null);
    }

    protected void doInesrtOrUpdateNonstrict(LdCollection collection, final InsertOption<LdCollectionCB> insertOption, final UpdateOption<LdCollectionCB> updateOption) {
        helpInsertOrUpdateInternally(collection, new InternalInsertOrUpdateNonstrictCallback<LdCollection>() {
            public void callbackInsert(LdCollection entity) { doInsert(entity, insertOption); }
            public void callbackUpdateNonstrict(LdCollection entity) { doUpdateNonstrict(entity, updateOption); }
        });
    }

    @Override
    protected void doCreateOrModifyNonstrict(Entity entity, InsertOption<? extends ConditionBean> insertOption,
            UpdateOption<? extends ConditionBean> updateOption) {
        if (insertOption == null && updateOption == null) { insertOrUpdateNonstrict(downcast(entity)); }
        else {
            insertOption = insertOption == null ? new InsertOption<LdCollectionCB>() : insertOption;
            updateOption = updateOption == null ? new UpdateOption<LdCollectionCB>() : updateOption;
            varyingInsertOrUpdateNonstrict(downcast(entity), downcast(insertOption), downcast(updateOption));
        }
    }

    /**
     * Delete the entity. (ZeroUpdateException, ExclusiveControl)
     * <pre>
     * LdCollection collection = new LdCollection();
     * collection.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * collection.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     collectionBhv.<span style="color: #FD4747">delete</span>(collection);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * } 
     * </pre>
     * @param collection The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(LdCollection collection) {
        doDelete(collection, null);
    }

    protected void doDelete(LdCollection collection, final DeleteOption<LdCollectionCB> option) {
        assertObjectNotNull("collection", collection);
        prepareDeleteOption(option);
        helpDeleteInternally(collection, new InternalDeleteCallback<LdCollection>() {
            public int callbackDelegateDelete(LdCollection entity) { return delegateDelete(entity, option); } });
    }

    protected void prepareDeleteOption(DeleteOption<LdCollectionCB> option) {
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
     * LdCollection collection = new LdCollection();
     * collection.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//collection.setVersionNo(value);</span>
     * collectionBhv.<span style="color: #FD4747">deleteNonstrict</span>(collection);
     * </pre>
     * @param collection The entity of delete target. (NotNull, PrimaryKeyNotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrict(LdCollection collection) {
        doDeleteNonstrict(collection, null);
    }

    protected void doDeleteNonstrict(LdCollection collection, final DeleteOption<LdCollectionCB> option) {
        assertObjectNotNull("collection", collection);
        prepareDeleteOption(option);
        helpDeleteNonstrictInternally(collection, new InternalDeleteNonstrictCallback<LdCollection>() {
            public int callbackDelegateDeleteNonstrict(LdCollection entity) { return delegateDeleteNonstrict(entity, option); } });
    }

    /**
     * Delete the entity non-strictly ignoring deleted. {ZeroUpdateException, NonExclusiveControl}
     * <pre>
     * LdCollection collection = new LdCollection();
     * collection.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//collection.setVersionNo(value);</span>
     * collectionBhv.<span style="color: #FD4747">deleteNonstrictIgnoreDeleted</span>(collection);
     * <span style="color: #3F7E5E">// if the target entity doesn't exist, no exception</span>
     * </pre>
     * @param collection The entity of delete target. (NotNull, PrimaryKeyNotNull)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrictIgnoreDeleted(LdCollection collection) {
        doDeleteNonstrictIgnoreDeleted(collection, null);
    }

    protected void doDeleteNonstrictIgnoreDeleted(LdCollection collection, final DeleteOption<LdCollectionCB> option) {
        assertObjectNotNull("collection", collection);
        prepareDeleteOption(option);
        helpDeleteNonstrictIgnoreDeletedInternally(collection, new InternalDeleteNonstrictIgnoreDeletedCallback<LdCollection>() {
            public int callbackDelegateDeleteNonstrict(LdCollection entity) { return delegateDeleteNonstrict(entity, option); } });
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
     *     LdCollection collection = new LdCollection();
     *     collection.setFooName("foo");
     *     if (...) {
     *         collection.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     collectionList.add(collection);
     * }
     * collectionBhv.<span style="color: #FD4747">batchInsert</span>(collectionList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param collectionList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<LdCollection> collectionList) {
        InsertOption<LdCollectionCB> option = createInsertUpdateOption();
        return doBatchInsert(collectionList, option);
    }

    protected int[] doBatchInsert(List<LdCollection> collectionList, InsertOption<LdCollectionCB> option) {
        assertObjectNotNull("collectionList", collectionList);
        prepareBatchInsertOption(collectionList, option);
        return delegateBatchInsert(collectionList, option);
    }

    protected void prepareBatchInsertOption(List<LdCollection> collectionList, InsertOption<LdCollectionCB> option) {
        option.xallowInsertColumnModifiedPropertiesFragmented();
        option.xacceptInsertColumnModifiedPropertiesIfNeeds(collectionList);
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
     *     LdCollection collection = new LdCollection();
     *     collection.setFooName("foo");
     *     if (...) {
     *         collection.setFooPrice(123);
     *     } else {
     *         collection.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//collection.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     collectionList.add(collection);
     * }
     * collectionBhv.<span style="color: #FD4747">batchUpdate</span>(collectionList);
     * </pre>
     * @param collectionList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<LdCollection> collectionList) {
        UpdateOption<LdCollectionCB> option = createPlainUpdateOption();
        return doBatchUpdate(collectionList, option);
    }

    protected int[] doBatchUpdate(List<LdCollection> collectionList, UpdateOption<LdCollectionCB> option) {
        assertObjectNotNull("collectionList", collectionList);
        prepareBatchUpdateOption(collectionList, option);
        return delegateBatchUpdate(collectionList, option);
    }

    protected void prepareBatchUpdateOption(List<LdCollection> collectionList, UpdateOption<LdCollectionCB> option) {
        option.xacceptUpdateColumnModifiedPropertiesIfNeeds(collectionList);
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
     * collectionBhv.<span style="color: #FD4747">batchUpdate</span>(collectionList, new SpecifyQuery<LdCollectionCB>() {
     *     public void specify(LdCollectionCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #FD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #FD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span> 
     * collectionBhv.<span style="color: #FD4747">batchUpdate</span>(collectionList, new SpecifyQuery<LdCollectionCB>() {
     *     public void specify(LdCollectionCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #FD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param collectionList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<LdCollection> collectionList, SpecifyQuery<LdCollectionCB> updateColumnSpec) {
        return doBatchUpdate(collectionList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    /**
     * Batch-update the entity list non-strictly modified-only of same-set columns. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <span style="color: #FD4747; font-size: 140%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     LdCollection collection = new LdCollection();
     *     collection.setFooName("foo");
     *     if (...) {
     *         collection.setFooPrice(123);
     *     } else {
     *         collection.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//collection.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     collectionList.add(collection);
     * }
     * collectionBhv.<span style="color: #FD4747">batchUpdate</span>(collectionList);
     * </pre>
     * @param collectionList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<LdCollection> collectionList) {
        UpdateOption<LdCollectionCB> option = createPlainUpdateOption();
        return doBatchUpdateNonstrict(collectionList, option);
    }

    protected int[] doBatchUpdateNonstrict(List<LdCollection> collectionList, UpdateOption<LdCollectionCB> option) {
        assertObjectNotNull("collectionList", collectionList);
        prepareBatchUpdateOption(collectionList, option);
        return delegateBatchUpdateNonstrict(collectionList, option);
    }

    /**
     * Batch-update the entity list non-strictly specified-only. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span> 
     * collectionBhv.<span style="color: #FD4747">batchUpdateNonstrict</span>(collectionList, new SpecifyQuery<LdCollectionCB>() {
     *     public void specify(LdCollectionCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #FD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #FD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span> 
     * collectionBhv.<span style="color: #FD4747">batchUpdateNonstrict</span>(collectionList, new SpecifyQuery<LdCollectionCB>() {
     *     public void specify(LdCollectionCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #FD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).</p>
     * @param collectionList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<LdCollection> collectionList, SpecifyQuery<LdCollectionCB> updateColumnSpec) {
        return doBatchUpdateNonstrict(collectionList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> option) {
        if (option == null) { return batchUpdateNonstrict(downcast(ls)); }
        else { return varyingBatchUpdateNonstrict(downcast(ls), downcast(option)); }
    }

    /**
     * Batch-delete the entity list. (ExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param collectionList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchDelete(List<LdCollection> collectionList) {
        return doBatchDelete(collectionList, null);
    }

    protected int[] doBatchDelete(List<LdCollection> collectionList, DeleteOption<LdCollectionCB> option) {
        assertObjectNotNull("collectionList", collectionList);
        prepareDeleteOption(option);
        return delegateBatchDelete(collectionList, option);
    }

    @Override
    protected int[] doLumpRemove(List<Entity> ls, DeleteOption<? extends ConditionBean> option) {
        if (option == null) { return batchDelete(downcast(ls)); }
        else { return varyingBatchDelete(downcast(ls), downcast(option)); }
    }

    /**
     * Batch-delete the entity list non-strictly. {NonExclusiveControl} <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param collectionList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDeleteNonstrict(List<LdCollection> collectionList) {
        return doBatchDeleteNonstrict(collectionList, null);
    }

    protected int[] doBatchDeleteNonstrict(List<LdCollection> collectionList, DeleteOption<LdCollectionCB> option) {
        assertObjectNotNull("collectionList", collectionList);
        prepareDeleteOption(option);
        return delegateBatchDeleteNonstrict(collectionList, option);
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
     * collectionBhv.<span style="color: #FD4747">queryInsert</span>(new QueryInsertSetupper&lt;LdCollection, LdCollectionCB&gt;() {
     *     public ConditionBean setup(collection entity, LdCollectionCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<LdCollection, LdCollectionCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(QueryInsertSetupper<LdCollection, LdCollectionCB> setupper, InsertOption<LdCollectionCB> option) {
        assertObjectNotNull("setupper", setupper);
        prepareInsertOption(option);
        LdCollection entity = new LdCollection();
        LdCollectionCB intoCB = createCBForQueryInsert();
        ConditionBean resourceCB = setupper.setup(entity, intoCB);
        return delegateQueryInsert(entity, intoCB, resourceCB, option);
    }

    protected LdCollectionCB createCBForQueryInsert() {
        LdCollectionCB cb = newMyConditionBean();
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
     * LdCollection collection = new LdCollection();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//collection.setPK...(value);</span>
     * collection.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//collection.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//collection.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//collection.setVersionNo(value);</span>
     * LdCollectionCB cb = new LdCollectionCB();
     * cb.query().setFoo...(value);
     * collectionBhv.<span style="color: #FD4747">queryUpdate</span>(collection, cb);
     * </pre>
     * @param collection The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of LdCollection. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(LdCollection collection, LdCollectionCB cb) {
        return doQueryUpdate(collection, cb, null);
    }

    protected int doQueryUpdate(LdCollection collection, LdCollectionCB cb, UpdateOption<LdCollectionCB> option) {
        assertObjectNotNull("collection", collection); assertCBStateValid(cb);
        prepareUpdateOption(option);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryUpdate(collection, cb, option) : 0;
    }

    @Override
    protected int doRangeModify(Entity entity, ConditionBean cb, UpdateOption<? extends ConditionBean> option) {
        if (option == null) { return queryUpdate(downcast(entity), (LdCollectionCB)cb); }
        else { return varyingQueryUpdate(downcast(entity), (LdCollectionCB)cb, downcast(option)); }
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * LdCollectionCB cb = new LdCollectionCB();
     * cb.query().setFoo...(value);
     * collectionBhv.<span style="color: #FD4747">queryDelete</span>(collection, cb);
     * </pre>
     * @param cb The condition-bean of LdCollection. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(LdCollectionCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(LdCollectionCB cb, DeleteOption<LdCollectionCB> option) {
        assertCBStateValid(cb);
        prepareDeleteOption(option);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryDelete(cb, option) : 0;
    }

    @Override
    protected int doRangeRemove(ConditionBean cb, DeleteOption<? extends ConditionBean> option) {
        if (option == null) { return queryDelete((LdCollectionCB)cb); }
        else { return varyingQueryDelete((LdCollectionCB)cb, downcast(option)); }
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
     * LdCollection collection = new LdCollection();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * collection.setFoo...(value);
     * collection.setBar...(value);
     * InsertOption<LdCollectionCB> option = new InsertOption<LdCollectionCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * collectionBhv.<span style="color: #FD4747">varyingInsert</span>(collection, option);
     * ... = collection.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param collection The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(LdCollection collection, InsertOption<LdCollectionCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(collection, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, ExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * LdCollection collection = new LdCollection();
     * collection.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * collection.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * collection.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;LdCollectionCB&gt; option = new UpdateOption&lt;LdCollectionCB&gt;();
     *     option.self(new SpecifyQuery&lt;LdCollectionCB&gt;() {
     *         public void specify(LdCollectionCB cb) {
     *             cb.specify().<span style="color: #FD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     collectionBhv.<span style="color: #FD4747">varyingUpdate</span>(collection, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param collection The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(LdCollection collection, UpdateOption<LdCollectionCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(collection, option);
    }

    /**
     * Update the entity with varying requests non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as updateNonstrict(entity).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * LdCollection collection = new LdCollection();
     * collection.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * collection.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//collection.setVersionNo(value);</span>
     * UpdateOption&lt;LdCollectionCB&gt; option = new UpdateOption&lt;LdCollectionCB&gt;();
     * option.self(new SpecifyQuery&lt;LdCollectionCB&gt;() {
     *     public void specify(LdCollectionCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * collectionBhv.<span style="color: #FD4747">varyingUpdateNonstrict</span>(collection, option);
     * </pre>
     * @param collection The entity of update target. (NotNull, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdateNonstrict(LdCollection collection, UpdateOption<LdCollectionCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdateNonstrict(collection, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param collection The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(LdCollection collection, InsertOption<LdCollectionCB> insertOption, UpdateOption<LdCollectionCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdate(collection, insertOption, updateOption);
    }

    /**
     * Insert or update the entity with varying requests non-strictly. (NonExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdateNonstrict(entity).
     * @param collection The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdateNonstrict(LdCollection collection, InsertOption<LdCollectionCB> insertOption, UpdateOption<LdCollectionCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdateNonstrict(collection, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, ExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param collection The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(LdCollection collection, DeleteOption<LdCollectionCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(collection, option);
    }

    /**
     * Delete the entity with varying requests non-strictly. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as deleteNonstrict(entity).
     * @param collection The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDeleteNonstrict(LdCollection collection, DeleteOption<LdCollectionCB> option) {
        assertDeleteOptionNotNull(option);
        doDeleteNonstrict(collection, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param collectionList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<LdCollection> collectionList, InsertOption<LdCollectionCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(collectionList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param collectionList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<LdCollection> collectionList, UpdateOption<LdCollectionCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(collectionList, option);
    }

    /**
     * Batch-update the list with varying requests non-strictly. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param collectionList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdateNonstrict(List<LdCollection> collectionList, UpdateOption<LdCollectionCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdateNonstrict(collectionList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param collectionList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<LdCollection> collectionList, DeleteOption<LdCollectionCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(collectionList, option);
    }

    /**
     * Batch-delete the list with varying requests non-strictly. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDeleteNonstrict(entityList).
     * @param collectionList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDeleteNonstrict(List<LdCollection> collectionList, DeleteOption<LdCollectionCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDeleteNonstrict(collectionList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<LdCollection, LdCollectionCB> setupper, InsertOption<LdCollectionCB> option) {
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
     * LdCollection collection = new LdCollection();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//collection.setPK...(value);</span>
     * collection.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//collection.setVersionNo(value);</span>
     * LdCollectionCB cb = new LdCollectionCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;LdCollectionCB&gt; option = new UpdateOption&lt;LdCollectionCB&gt;();
     * option.self(new SpecifyQuery&lt;LdCollectionCB&gt;() {
     *     public void specify(LdCollectionCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * collectionBhv.<span style="color: #FD4747">varyingQueryUpdate</span>(collection, cb, option);
     * </pre>
     * @param collection The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of LdCollection. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(LdCollection collection, LdCollectionCB cb, UpdateOption<LdCollectionCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(collection, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of LdCollection. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(LdCollectionCB cb, DeleteOption<LdCollectionCB> option) {
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
    public OutsideSqlBasicExecutor<LdCollectionBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCountUniquely(LdCollectionCB cb) { return invoke(createSelectCountCBCommand(cb, true)); }
    protected int delegateSelectCountPlainly(LdCollectionCB cb) { return invoke(createSelectCountCBCommand(cb, false)); }
    protected <ENTITY extends LdCollection> void delegateSelectCursor(LdCollectionCB cb, EntityRowHandler<ENTITY> erh, Class<ENTITY> et)
    { invoke(createSelectCursorCBCommand(cb, erh, et)); }
    protected <ENTITY extends LdCollection> List<ENTITY> delegateSelectList(LdCollectionCB cb, Class<ENTITY> et)
    { return invoke(createSelectListCBCommand(cb, et)); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(LdCollection e, InsertOption<LdCollectionCB> op)
    { if (!processBeforeInsert(e, op)) { return 0; }
      return invoke(createInsertEntityCommand(e, op)); }
    protected int delegateUpdate(LdCollection e, UpdateOption<LdCollectionCB> op)
    { if (!processBeforeUpdate(e, op)) { return 0; }
      return invoke(createUpdateEntityCommand(e, op)); }
    protected int delegateUpdateNonstrict(LdCollection e, UpdateOption<LdCollectionCB> op)
    { if (!processBeforeUpdate(e, op)) { return 0; }
      return invoke(createUpdateNonstrictEntityCommand(e, op)); }
    protected int delegateDelete(LdCollection e, DeleteOption<LdCollectionCB> op)
    { if (!processBeforeDelete(e, op)) { return 0; }
      return invoke(createDeleteEntityCommand(e, op)); }
    protected int delegateDeleteNonstrict(LdCollection e, DeleteOption<LdCollectionCB> op)
    { if (!processBeforeDelete(e, op)) { return 0; }
      return invoke(createDeleteNonstrictEntityCommand(e, op)); }

    protected int[] delegateBatchInsert(List<LdCollection> ls, InsertOption<LdCollectionCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchInsertCommand(processBatchInternally(ls, op), op)); }
    protected int[] delegateBatchUpdate(List<LdCollection> ls, UpdateOption<LdCollectionCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateCommand(processBatchInternally(ls, op, false), op)); }
    protected int[] delegateBatchUpdateNonstrict(List<LdCollection> ls, UpdateOption<LdCollectionCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateNonstrictCommand(processBatchInternally(ls, op, true), op)); }
    protected int[] delegateBatchDelete(List<LdCollection> ls, DeleteOption<LdCollectionCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteCommand(processBatchInternally(ls, op, false), op)); }
    protected int[] delegateBatchDeleteNonstrict(List<LdCollection> ls, DeleteOption<LdCollectionCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteNonstrictCommand(processBatchInternally(ls, op, true), op)); }

    protected int delegateQueryInsert(LdCollection e, LdCollectionCB inCB, ConditionBean resCB, InsertOption<LdCollectionCB> op)
    { if (!processBeforeQueryInsert(e, inCB, resCB, op)) { return 0; } return invoke(createQueryInsertCBCommand(e, inCB, resCB, op));  }
    protected int delegateQueryUpdate(LdCollection e, LdCollectionCB cb, UpdateOption<LdCollectionCB> op)
    { if (!processBeforeQueryUpdate(e, cb, op)) { return 0; } return invoke(createQueryUpdateCBCommand(e, cb, op));  }
    protected int delegateQueryDelete(LdCollectionCB cb, DeleteOption<LdCollectionCB> op)
    { if (!processBeforeQueryDelete(cb, op)) { return 0; } return invoke(createQueryDeleteCBCommand(cb, op));  }

    // ===================================================================================
    //                                                                     Filter Override
    //                                                                     ===============
    @Override
    protected void filterEntityOfInsert(Entity targetEntity, InsertOption<? extends ConditionBean> option) {
        super.filterEntityOfInsert(targetEntity, option);
        LdCollection entity = downcast(targetEntity);
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
    protected LdCollection downcast(Entity entity) {
        return helpEntityDowncastInternally(entity, LdCollection.class);
    }

    protected LdCollectionCB downcast(ConditionBean cb) {
        return helpConditionBeanDowncastInternally(cb, LdCollectionCB.class);
    }

    @SuppressWarnings("unchecked")
    protected List<LdCollection> downcast(List<? extends Entity> entityList) {
        return (List<LdCollection>)entityList;
    }

    @SuppressWarnings("unchecked")
    protected InsertOption<LdCollectionCB> downcast(InsertOption<? extends ConditionBean> option) {
        return (InsertOption<LdCollectionCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected UpdateOption<LdCollectionCB> downcast(UpdateOption<? extends ConditionBean> option) {
        return (UpdateOption<LdCollectionCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected DeleteOption<LdCollectionCB> downcast(DeleteOption<? extends ConditionBean> option) {
        return (DeleteOption<LdCollectionCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<LdCollection, LdCollectionCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> option) {
        return (QueryInsertSetupper<LdCollection, LdCollectionCB>)option;
    }
}
