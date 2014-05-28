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
 * The behavior of PUBLISHER as TABLE. <br />
 * <pre>
 * [primary key]
 *     PUBLISHER_ID
 *
 * [column]
 *     PUBLISHER_ID, PUBLISHER_NAME, R_USER, R_MODULE, R_TIMESTAMP, U_USER, U_MODULE, U_TIMESTAMP
 *
 * [sequence]
 *     
 *
 * [identity]
 *     PUBLISHER_ID
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     
 *
 * [referrer table]
 *     BOOK
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     bookList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class LdBsPublisherBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "PUBLISHER"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public DBMeta getDBMeta() { return LdPublisherDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public LdPublisherDbm getMyDBMeta() { return LdPublisherDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public Entity newEntity() { return newMyEntity(); }

    /** {@inheritDoc} */
    public ConditionBean newConditionBean() { return newMyConditionBean(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public LdPublisher newMyEntity() { return new LdPublisher(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public LdPublisherCB newMyConditionBean() { return new LdPublisherCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * LdPublisherCB cb = new LdPublisherCB();
     * cb.query().setFoo...(value);
     * int count = publisherBhv.<span style="color: #DD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of LdPublisher. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(LdPublisherCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(LdPublisherCB cb) { // called by selectCount(cb)
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(LdPublisherCB cb) { // called by selectPage(cb)
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
     * LdPublisherCB cb = new LdPublisherCB();
     * cb.query().setFoo...(value);
     * LdPublisher publisher = publisherBhv.<span style="color: #DD4747">selectEntity</span>(cb);
     * if (publisher != null) { <span style="color: #3F7E5E">// null check</span>
     *     ... = publisher.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of LdPublisher. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public LdPublisher selectEntity(LdPublisherCB cb) {
        return doSelectEntity(cb, LdPublisher.class);
    }

    protected <ENTITY extends LdPublisher> ENTITY doSelectEntity(LdPublisherCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectEntityInternally(cb, tp, new InternalSelectEntityCallback<ENTITY, LdPublisherCB>() {
            public List<ENTITY> callbackSelectList(LdPublisherCB lcb, Class<ENTITY> ltp) { return doSelectList(lcb, ltp); } });
    }

    protected <ENTITY extends LdPublisher> OptionalEntity<ENTITY> doSelectOptionalEntity(LdPublisherCB cb, Class<ENTITY> tp) {
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
     * LdPublisherCB cb = new LdPublisherCB();
     * cb.query().setFoo...(value);
     * LdPublisher publisher = publisherBhv.<span style="color: #DD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = publisher.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of LdPublisher. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public LdPublisher selectEntityWithDeletedCheck(LdPublisherCB cb) {
        return doSelectEntityWithDeletedCheck(cb, LdPublisher.class);
    }

    protected <ENTITY extends LdPublisher> ENTITY doSelectEntityWithDeletedCheck(LdPublisherCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectEntityWithDeletedCheckInternally(cb, tp, new InternalSelectEntityWithDeletedCheckCallback<ENTITY, LdPublisherCB>() {
            public List<ENTITY> callbackSelectList(LdPublisherCB lcb, Class<ENTITY> ltp) { return doSelectList(lcb, ltp); } });
    }

    @Override
    protected Entity doReadEntityWithDeletedCheck(ConditionBean cb) {
        return selectEntityWithDeletedCheck(downcast(cb));
    }

    /**
     * Select the entity by the primary-key value.
     * @param publisherId : PK, ID, NotNull, INTEGER(10). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public LdPublisher selectByPKValue(Integer publisherId) {
        return doSelectByPK(publisherId, LdPublisher.class);
    }

    protected <ENTITY extends LdPublisher> ENTITY doSelectByPK(Integer publisherId, Class<ENTITY> entityType) {
        return doSelectEntity(xprepareCBAsPK(publisherId), entityType);
    }

    protected <ENTITY extends LdPublisher> OptionalEntity<ENTITY> doSelectOptionalByPK(Integer publisherId, Class<ENTITY> entityType) {
        return createOptionalEntity(doSelectByPK(publisherId, entityType), publisherId);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param publisherId : PK, ID, NotNull, INTEGER(10). (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public LdPublisher selectByPKValueWithDeletedCheck(Integer publisherId) {
        return doSelectByPKWithDeletedCheck(publisherId, LdPublisher.class);
    }

    protected <ENTITY extends LdPublisher> ENTITY doSelectByPKWithDeletedCheck(Integer publisherId, Class<ENTITY> entityType) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(publisherId), entityType);
    }

    protected LdPublisherCB xprepareCBAsPK(Integer publisherId) {
        assertObjectNotNull("publisherId", publisherId);
        LdPublisherCB cb = newMyConditionBean(); cb.acceptPrimaryKey(publisherId);
        return cb;
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * LdPublisherCB cb = new LdPublisherCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;LdPublisher&gt; publisherList = publisherBhv.<span style="color: #DD4747">selectList</span>(cb);
     * for (LdPublisher publisher : publisherList) {
     *     ... = publisher.get...();
     * }
     * </pre>
     * @param cb The condition-bean of LdPublisher. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<LdPublisher> selectList(LdPublisherCB cb) {
        return doSelectList(cb, LdPublisher.class);
    }

    protected <ENTITY extends LdPublisher> ListResultBean<ENTITY> doSelectList(LdPublisherCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        return helpSelectListInternally(cb, tp, new InternalSelectListCallback<ENTITY, LdPublisherCB>() {
            public List<ENTITY> callbackSelectList(LdPublisherCB lcb, Class<ENTITY> ltp) { return delegateSelectList(lcb, ltp); } });
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
     * LdPublisherCB cb = new LdPublisherCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #DD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;LdPublisher&gt; page = publisherBhv.<span style="color: #DD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (LdPublisher publisher : page) {
     *     ... = publisher.get...();
     * }
     * </pre>
     * @param cb The condition-bean of LdPublisher. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<LdPublisher> selectPage(LdPublisherCB cb) {
        return doSelectPage(cb, LdPublisher.class);
    }

    protected <ENTITY extends LdPublisher> PagingResultBean<ENTITY> doSelectPage(LdPublisherCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectPageInternally(cb, tp, new InternalSelectPageCallback<ENTITY, LdPublisherCB>() {
            public int callbackSelectCount(LdPublisherCB cb) { return doSelectCountPlainly(cb); }
            public List<ENTITY> callbackSelectList(LdPublisherCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); }
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
     * LdPublisherCB cb = new LdPublisherCB();
     * cb.query().setFoo...(value);
     * publisherBhv.<span style="color: #DD4747">selectCursor</span>(cb, new EntityRowHandler&lt;LdPublisher&gt;() {
     *     public void handle(LdPublisher entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of LdPublisher. (NotNull)
     * @param entityRowHandler The handler of entity row of LdPublisher. (NotNull)
     */
    public void selectCursor(LdPublisherCB cb, EntityRowHandler<LdPublisher> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, LdPublisher.class);
    }

    protected <ENTITY extends LdPublisher> void doSelectCursor(LdPublisherCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler", handler); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        helpSelectCursorInternally(cb, handler, tp, new InternalSelectCursorCallback<ENTITY, LdPublisherCB>() {
            public void callbackSelectCursor(LdPublisherCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) { delegateSelectCursor(cb, handler, tp); }
            public List<ENTITY> callbackSelectList(LdPublisherCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); }
        });
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * publisherBhv.<span style="color: #DD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(LdPublisherCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> SLFunction<LdPublisherCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
    }

    protected <RESULT, CB extends LdPublisherCB> SLFunction<CB, RESULT> doScalarSelect(Class<RESULT> tp, CB cb) {
        assertObjectNotNull("resultType", tp); assertCBStateValid(cb);
        cb.xsetupForScalarSelect(); cb.getSqlClause().disableSelectIndex(); // for when you use union
        return createSLFunction(cb, tp);
    }

    protected <RESULT, CB extends LdPublisherCB> SLFunction<CB, RESULT> createSLFunction(CB cb, Class<RESULT> tp) {
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
     * Load referrer of bookList by the set-upper of referrer. <br />
     * BOOK by PUBLISHER_ID, named 'bookList'.
     * <pre>
     * publisherBhv.<span style="color: #DD4747">loadBookList</span>(publisherList, new ConditionBeanSetupper&lt;LdBookCB&gt;() {
     *     public void setup(LdBookCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...();
     *     }
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedList(referrerList -&gt {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * for (LdPublisher publisher : publisherList) {
     *     ... = publisher.<span style="color: #DD4747">getBookList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setPublisherId_InScope(pkList);
     * cb.query().addOrderBy_PublisherId_Asc();
     * </pre>
     * @param publisherList The entity list of publisher. (NotNull)
     * @param setupper The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoader<LdBook> loadBookList(List<LdPublisher> publisherList, ConditionBeanSetupper<LdBookCB> setupper) {
        xassLRArg(publisherList, setupper);
        return doLoadBookList(publisherList, new LoadReferrerOption<LdBookCB, LdBook>().xinit(setupper));
    }

    /**
     * Load referrer of bookList by the set-upper of referrer. <br />
     * BOOK by PUBLISHER_ID, named 'bookList'.
     * <pre>
     * publisherBhv.<span style="color: #DD4747">loadBookList</span>(publisherList, new ConditionBeanSetupper&lt;LdBookCB&gt;() {
     *     public void setup(LdBookCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...();
     *     }
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedList(referrerList -&gt {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = publisher.<span style="color: #DD4747">getBookList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setPublisherId_InScope(pkList);
     * cb.query().addOrderBy_PublisherId_Asc();
     * </pre>
     * @param publisher The entity of publisher. (NotNull)
     * @param setupper The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoader<LdBook> loadBookList(LdPublisher publisher, ConditionBeanSetupper<LdBookCB> setupper) {
        xassLRArg(publisher, setupper);
        return doLoadBookList(xnewLRLs(publisher), new LoadReferrerOption<LdBookCB, LdBook>().xinit(setupper));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param publisher The entity of publisher. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoader<LdBook> loadBookList(LdPublisher publisher, LoadReferrerOption<LdBookCB, LdBook> loadReferrerOption) {
        xassLRArg(publisher, loadReferrerOption);
        return loadBookList(xnewLRLs(publisher), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean setupper.} #beforejava8
     * @param publisherList The entity list of publisher. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerLoader<LdBook> loadBookList(List<LdPublisher> publisherList, LoadReferrerOption<LdBookCB, LdBook> loadReferrerOption) {
        xassLRArg(publisherList, loadReferrerOption);
        if (publisherList.isEmpty()) { return (NestedReferrerLoader<LdBook>)EMPTY_LOADER; }
        return doLoadBookList(publisherList, loadReferrerOption);
    }

    protected NestedReferrerLoader<LdBook> doLoadBookList(List<LdPublisher> publisherList, LoadReferrerOption<LdBookCB, LdBook> option) {
        final LdBookBhv referrerBhv = xgetBSFLR().select(LdBookBhv.class);
        return helpLoadReferrerInternally(publisherList, option, new InternalLoadReferrerCallback<LdPublisher, Integer, LdBookCB, LdBook>() {
            public Integer getPKVal(LdPublisher et)
            { return et.getPublisherId(); }
            public void setRfLs(LdPublisher et, List<LdBook> ls)
            { et.setBookList(ls); }
            public LdBookCB newMyCB() { return referrerBhv.newMyConditionBean(); }
            public void qyFKIn(LdBookCB cb, List<Integer> ls)
            { cb.query().setPublisherId_InScope(ls); }
            public void qyOdFKAsc(LdBookCB cb) { cb.query().addOrderBy_PublisherId_Asc(); }
            public void spFKCol(LdBookCB cb) { cb.specify().columnPublisherId(); }
            public List<LdBook> selRfLs(LdBookCB cb) { return referrerBhv.selectList(cb); }
            public Integer getFKVal(LdBook re) { return re.getPublisherId(); }
            public void setlcEt(LdBook re, LdPublisher le)
            { re.setPublisher(le); }
            public String getRfPrNm() { return "bookList"; }
        });
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key publisherId.
     * @param publisherList The list of publisher. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Integer> extractPublisherIdList(List<LdPublisher> publisherList) {
        return helpExtractListInternally(publisherList, new InternalExtractCallback<LdPublisher, Integer>() {
            public Integer getCV(LdPublisher et) { return et.getPublisherId(); }
        });
    }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * LdPublisher publisher = new LdPublisher();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * publisher.setFoo...(value);
     * publisher.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//publisher.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//publisher.set...;</span>
     * publisherBhv.<span style="color: #DD4747">insert</span>(publisher);
     * ... = publisher.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param publisher The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(LdPublisher publisher) {
        doInsert(publisher, null);
    }

    protected void doInsert(LdPublisher publisher, InsertOption<LdPublisherCB> op) {
        assertObjectNotNull("publisher", publisher);
        prepareInsertOption(op);
        delegateInsert(publisher, op);
    }

    protected void prepareInsertOption(InsertOption<LdPublisherCB> op) {
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
     * LdPublisher publisher = new LdPublisher();
     * publisher.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * publisher.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//publisher.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//publisher.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * publisher.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     publisherBhv.<span style="color: #DD4747">update</span>(publisher);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param publisher The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(final LdPublisher publisher) {
        doUpdate(publisher, null);
    }

    protected void doUpdate(LdPublisher publisher, final UpdateOption<LdPublisherCB> op) {
        assertObjectNotNull("publisher", publisher);
        prepareUpdateOption(op);
        helpUpdateInternally(publisher, new InternalUpdateCallback<LdPublisher>() {
            public int callbackDelegateUpdate(LdPublisher et) { return delegateUpdate(et, op); } });
    }

    protected void prepareUpdateOption(UpdateOption<LdPublisherCB> op) {
        if (op == null) { return; }
        assertUpdateOptionStatus(op);
        if (op.hasSelfSpecification()) {
            op.resolveSelfSpecification(createCBForVaryingUpdate());
        }
        if (op.hasSpecifiedUpdateColumn()) {
            op.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    protected LdPublisherCB createCBForVaryingUpdate() {
        LdPublisherCB cb = newMyConditionBean();
        cb.xsetupForVaryingUpdate();
        return cb;
    }

    protected LdPublisherCB createCBForSpecifiedUpdate() {
        LdPublisherCB cb = newMyConditionBean();
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
     * LdPublisher publisher = new LdPublisher();
     * publisher.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * publisher.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//publisher.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//publisher.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//publisher.setVersionNo(value);</span>
     * publisherBhv.<span style="color: #DD4747">updateNonstrict</span>(publisher);
     * </pre>
     * @param publisher The entity of update target. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void updateNonstrict(final LdPublisher publisher) {
        doUpdateNonstrict(publisher, null);
    }

    protected void doUpdateNonstrict(LdPublisher publisher, final UpdateOption<LdPublisherCB> op) {
        assertObjectNotNull("publisher", publisher);
        prepareUpdateOption(op);
        helpUpdateNonstrictInternally(publisher, new InternalUpdateNonstrictCallback<LdPublisher>() {
            public int callbackDelegateUpdateNonstrict(LdPublisher et) { return delegateUpdateNonstrict(et, op); } });
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
     * @param publisher The entity of insert or update target. (NotNull)
     * @exception EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(LdPublisher publisher) {
        doInesrtOrUpdate(publisher, null, null);
    }

    protected void doInesrtOrUpdate(LdPublisher publisher, final InsertOption<LdPublisherCB> iop, final UpdateOption<LdPublisherCB> uop) {
        helpInsertOrUpdateInternally(publisher, new InternalInsertOrUpdateCallback<LdPublisher, LdPublisherCB>() {
            public void callbackInsert(LdPublisher et) { doInsert(et, iop); }
            public void callbackUpdate(LdPublisher et) { doUpdate(et, uop); }
            public LdPublisherCB callbackNewMyConditionBean() { return newMyConditionBean(); }
            public int callbackSelectCount(LdPublisherCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrModify(Entity et, InsertOption<? extends ConditionBean> iop, UpdateOption<? extends ConditionBean> uop) {
        if (iop == null && uop == null) { insertOrUpdate(downcast(et)); }
        else {
            iop = iop != null ? iop : new InsertOption<LdPublisherCB>();
            uop = uop != null ? uop : new UpdateOption<LdPublisherCB>();
            varyingInsertOrUpdate(downcast(et), downcast(iop), downcast(uop));
        }
    }

    /**
     * Insert or update the entity non-strictly modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br />
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() }
     * <p><span style="color: #DD4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param publisher The entity of insert or update target. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdateNonstrict(LdPublisher publisher) {
        doInesrtOrUpdateNonstrict(publisher, null, null);
    }

    protected void doInesrtOrUpdateNonstrict(LdPublisher publisher, final InsertOption<LdPublisherCB> iop, final UpdateOption<LdPublisherCB> uop) {
        helpInsertOrUpdateInternally(publisher, new InternalInsertOrUpdateNonstrictCallback<LdPublisher>() {
            public void callbackInsert(LdPublisher et) { doInsert(et, iop); }
            public void callbackUpdateNonstrict(LdPublisher et) { doUpdateNonstrict(et, uop); }
        });
    }

    @Override
    protected void doCreateOrModifyNonstrict(Entity et, InsertOption<? extends ConditionBean> iop, UpdateOption<? extends ConditionBean> uop) {
        if (iop == null && uop == null) { insertOrUpdateNonstrict(downcast(et)); }
        else {
            iop = iop != null ? iop : new InsertOption<LdPublisherCB>();
            uop = uop != null ? uop : new UpdateOption<LdPublisherCB>();
            varyingInsertOrUpdateNonstrict(downcast(et), downcast(iop), downcast(uop));
        }
    }

    /**
     * Delete the entity. (ZeroUpdateException, ExclusiveControl)
     * <pre>
     * LdPublisher publisher = new LdPublisher();
     * publisher.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * publisher.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     publisherBhv.<span style="color: #DD4747">delete</span>(publisher);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param publisher The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(LdPublisher publisher) {
        doDelete(publisher, null);
    }

    protected void doDelete(LdPublisher publisher, final DeleteOption<LdPublisherCB> op) {
        assertObjectNotNull("publisher", publisher);
        prepareDeleteOption(op);
        helpDeleteInternally(publisher, new InternalDeleteCallback<LdPublisher>() {
            public int callbackDelegateDelete(LdPublisher et) { return delegateDelete(et, op); } });
    }

    protected void prepareDeleteOption(DeleteOption<LdPublisherCB> op) {
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
     * LdPublisher publisher = new LdPublisher();
     * publisher.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//publisher.setVersionNo(value);</span>
     * publisherBhv.<span style="color: #DD4747">deleteNonstrict</span>(publisher);
     * </pre>
     * @param publisher The entity of delete target. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrict(LdPublisher publisher) {
        doDeleteNonstrict(publisher, null);
    }

    protected void doDeleteNonstrict(LdPublisher publisher, final DeleteOption<LdPublisherCB> op) {
        assertObjectNotNull("publisher", publisher);
        prepareDeleteOption(op);
        helpDeleteNonstrictInternally(publisher, new InternalDeleteNonstrictCallback<LdPublisher>() {
            public int callbackDelegateDeleteNonstrict(LdPublisher et) { return delegateDeleteNonstrict(et, op); } });
    }

    /**
     * Delete the entity non-strictly ignoring deleted. {ZeroUpdateException, NonExclusiveControl}
     * <pre>
     * LdPublisher publisher = new LdPublisher();
     * publisher.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//publisher.setVersionNo(value);</span>
     * publisherBhv.<span style="color: #DD4747">deleteNonstrictIgnoreDeleted</span>(publisher);
     * <span style="color: #3F7E5E">// if the target entity doesn't exist, no exception</span>
     * </pre>
     * @param publisher The entity of delete target. (NotNull, PrimaryKeyNotNull)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrictIgnoreDeleted(LdPublisher publisher) {
        doDeleteNonstrictIgnoreDeleted(publisher, null);
    }

    protected void doDeleteNonstrictIgnoreDeleted(LdPublisher publisher, final DeleteOption<LdPublisherCB> op) {
        assertObjectNotNull("publisher", publisher);
        prepareDeleteOption(op);
        helpDeleteNonstrictIgnoreDeletedInternally(publisher, new InternalDeleteNonstrictIgnoreDeletedCallback<LdPublisher>() {
            public int callbackDelegateDeleteNonstrict(LdPublisher et) { return delegateDeleteNonstrict(et, op); } });
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
     *     LdPublisher publisher = new LdPublisher();
     *     publisher.setFooName("foo");
     *     if (...) {
     *         publisher.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     publisherList.add(publisher);
     * }
     * publisherBhv.<span style="color: #DD4747">batchInsert</span>(publisherList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param publisherList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<LdPublisher> publisherList) {
        InsertOption<LdPublisherCB> op = createInsertUpdateOption();
        return doBatchInsert(publisherList, op);
    }

    protected int[] doBatchInsert(List<LdPublisher> publisherList, InsertOption<LdPublisherCB> op) {
        assertObjectNotNull("publisherList", publisherList);
        prepareBatchInsertOption(publisherList, op);
        return delegateBatchInsert(publisherList, op);
    }

    protected void prepareBatchInsertOption(List<LdPublisher> publisherList, InsertOption<LdPublisherCB> op) {
        op.xallowInsertColumnModifiedPropertiesFragmented();
        op.xacceptInsertColumnModifiedPropertiesIfNeeds(publisherList);
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
     *     LdPublisher publisher = new LdPublisher();
     *     publisher.setFooName("foo");
     *     if (...) {
     *         publisher.setFooPrice(123);
     *     } else {
     *         publisher.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//publisher.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     publisherList.add(publisher);
     * }
     * publisherBhv.<span style="color: #DD4747">batchUpdate</span>(publisherList);
     * </pre>
     * @param publisherList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<LdPublisher> publisherList) {
        UpdateOption<LdPublisherCB> op = createPlainUpdateOption();
        return doBatchUpdate(publisherList, op);
    }

    protected int[] doBatchUpdate(List<LdPublisher> publisherList, UpdateOption<LdPublisherCB> op) {
        assertObjectNotNull("publisherList", publisherList);
        prepareBatchUpdateOption(publisherList, op);
        return delegateBatchUpdate(publisherList, op);
    }

    protected void prepareBatchUpdateOption(List<LdPublisher> publisherList, UpdateOption<LdPublisherCB> op) {
        op.xacceptUpdateColumnModifiedPropertiesIfNeeds(publisherList);
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
     * publisherBhv.<span style="color: #DD4747">batchUpdate</span>(publisherList, new SpecifyQuery<LdPublisherCB>() {
     *     public void specify(LdPublisherCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #DD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #DD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * publisherBhv.<span style="color: #DD4747">batchUpdate</span>(publisherList, new SpecifyQuery<LdPublisherCB>() {
     *     public void specify(LdPublisherCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #DD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param publisherList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<LdPublisher> publisherList, SpecifyQuery<LdPublisherCB> updateColumnSpec) {
        return doBatchUpdate(publisherList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    /**
     * Batch-update the entity list non-strictly modified-only of same-set columns. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <span style="color: #DD4747; font-size: 140%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     LdPublisher publisher = new LdPublisher();
     *     publisher.setFooName("foo");
     *     if (...) {
     *         publisher.setFooPrice(123);
     *     } else {
     *         publisher.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//publisher.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     publisherList.add(publisher);
     * }
     * publisherBhv.<span style="color: #DD4747">batchUpdate</span>(publisherList);
     * </pre>
     * @param publisherList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<LdPublisher> publisherList) {
        UpdateOption<LdPublisherCB> option = createPlainUpdateOption();
        return doBatchUpdateNonstrict(publisherList, option);
    }

    protected int[] doBatchUpdateNonstrict(List<LdPublisher> publisherList, UpdateOption<LdPublisherCB> op) {
        assertObjectNotNull("publisherList", publisherList);
        prepareBatchUpdateOption(publisherList, op);
        return delegateBatchUpdateNonstrict(publisherList, op);
    }

    /**
     * Batch-update the entity list non-strictly specified-only. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * publisherBhv.<span style="color: #DD4747">batchUpdateNonstrict</span>(publisherList, new SpecifyQuery<LdPublisherCB>() {
     *     public void specify(LdPublisherCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #DD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #DD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * publisherBhv.<span style="color: #DD4747">batchUpdateNonstrict</span>(publisherList, new SpecifyQuery<LdPublisherCB>() {
     *     public void specify(LdPublisherCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #DD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).</p>
     * @param publisherList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<LdPublisher> publisherList, SpecifyQuery<LdPublisherCB> updateColumnSpec) {
        return doBatchUpdateNonstrict(publisherList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> op) {
        if (op == null) { return batchUpdateNonstrict(downcast(ls)); }
        else { return varyingBatchUpdateNonstrict(downcast(ls), downcast(op)); }
    }

    /**
     * Batch-delete the entity list. (ExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param publisherList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchDelete(List<LdPublisher> publisherList) {
        return doBatchDelete(publisherList, null);
    }

    protected int[] doBatchDelete(List<LdPublisher> publisherList, DeleteOption<LdPublisherCB> op) {
        assertObjectNotNull("publisherList", publisherList);
        prepareDeleteOption(op);
        return delegateBatchDelete(publisherList, op);
    }

    @Override
    protected int[] doLumpRemove(List<Entity> ls, DeleteOption<? extends ConditionBean> op) {
        if (op == null) { return batchDelete(downcast(ls)); }
        else { return varyingBatchDelete(downcast(ls), downcast(op)); }
    }

    /**
     * Batch-delete the entity list non-strictly. {NonExclusiveControl} <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param publisherList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDeleteNonstrict(List<LdPublisher> publisherList) {
        return doBatchDeleteNonstrict(publisherList, null);
    }

    protected int[] doBatchDeleteNonstrict(List<LdPublisher> publisherList, DeleteOption<LdPublisherCB> op) {
        assertObjectNotNull("publisherList", publisherList);
        prepareDeleteOption(op);
        return delegateBatchDeleteNonstrict(publisherList, op);
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
     * publisherBhv.<span style="color: #DD4747">queryInsert</span>(new QueryInsertSetupper&lt;LdPublisher, LdPublisherCB&gt;() {
     *     public ConditionBean setup(publisher entity, LdPublisherCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<LdPublisher, LdPublisherCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(QueryInsertSetupper<LdPublisher, LdPublisherCB> sp, InsertOption<LdPublisherCB> op) {
        assertObjectNotNull("setupper", sp);
        prepareInsertOption(op);
        LdPublisher e = new LdPublisher();
        LdPublisherCB cb = createCBForQueryInsert();
        return delegateQueryInsert(e, cb, sp.setup(e, cb), op);
    }

    protected LdPublisherCB createCBForQueryInsert() {
        LdPublisherCB cb = newMyConditionBean();
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
     * LdPublisher publisher = new LdPublisher();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//publisher.setPK...(value);</span>
     * publisher.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//publisher.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//publisher.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//publisher.setVersionNo(value);</span>
     * LdPublisherCB cb = new LdPublisherCB();
     * cb.query().setFoo...(value);
     * publisherBhv.<span style="color: #DD4747">queryUpdate</span>(publisher, cb);
     * </pre>
     * @param publisher The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of LdPublisher. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(LdPublisher publisher, LdPublisherCB cb) {
        return doQueryUpdate(publisher, cb, null);
    }

    protected int doQueryUpdate(LdPublisher publisher, LdPublisherCB cb, UpdateOption<LdPublisherCB> op) {
        assertObjectNotNull("publisher", publisher); assertCBStateValid(cb);
        prepareUpdateOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryUpdate(publisher, cb, op) : 0;
    }

    @Override
    protected int doRangeModify(Entity et, ConditionBean cb, UpdateOption<? extends ConditionBean> op) {
        if (op == null) { return queryUpdate(downcast(et), (LdPublisherCB)cb); }
        else { return varyingQueryUpdate(downcast(et), (LdPublisherCB)cb, downcast(op)); }
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * LdPublisherCB cb = new LdPublisherCB();
     * cb.query().setFoo...(value);
     * publisherBhv.<span style="color: #DD4747">queryDelete</span>(publisher, cb);
     * </pre>
     * @param cb The condition-bean of LdPublisher. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(LdPublisherCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(LdPublisherCB cb, DeleteOption<LdPublisherCB> op) {
        assertCBStateValid(cb);
        prepareDeleteOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryDelete(cb, op) : 0;
    }

    @Override
    protected int doRangeRemove(ConditionBean cb, DeleteOption<? extends ConditionBean> op) {
        if (op == null) { return queryDelete((LdPublisherCB)cb); }
        else { return varyingQueryDelete((LdPublisherCB)cb, downcast(op)); }
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
     * LdPublisher publisher = new LdPublisher();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * publisher.setFoo...(value);
     * publisher.setBar...(value);
     * InsertOption<LdPublisherCB> option = new InsertOption<LdPublisherCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * publisherBhv.<span style="color: #DD4747">varyingInsert</span>(publisher, option);
     * ... = publisher.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param publisher The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(LdPublisher publisher, InsertOption<LdPublisherCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(publisher, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, ExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * LdPublisher publisher = new LdPublisher();
     * publisher.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * publisher.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * publisher.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;LdPublisherCB&gt; option = new UpdateOption&lt;LdPublisherCB&gt;();
     *     option.self(new SpecifyQuery&lt;LdPublisherCB&gt;() {
     *         public void specify(LdPublisherCB cb) {
     *             cb.specify().<span style="color: #DD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     publisherBhv.<span style="color: #DD4747">varyingUpdate</span>(publisher, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param publisher The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(LdPublisher publisher, UpdateOption<LdPublisherCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(publisher, option);
    }

    /**
     * Update the entity with varying requests non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as updateNonstrict(entity).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * LdPublisher publisher = new LdPublisher();
     * publisher.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * publisher.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//publisher.setVersionNo(value);</span>
     * UpdateOption&lt;LdPublisherCB&gt; option = new UpdateOption&lt;LdPublisherCB&gt;();
     * option.self(new SpecifyQuery&lt;LdPublisherCB&gt;() {
     *     public void specify(LdPublisherCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * publisherBhv.<span style="color: #DD4747">varyingUpdateNonstrict</span>(publisher, option);
     * </pre>
     * @param publisher The entity of update target. (NotNull, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdateNonstrict(LdPublisher publisher, UpdateOption<LdPublisherCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdateNonstrict(publisher, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param publisher The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(LdPublisher publisher, InsertOption<LdPublisherCB> insertOption, UpdateOption<LdPublisherCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdate(publisher, insertOption, updateOption);
    }

    /**
     * Insert or update the entity with varying requests non-strictly. (NonExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdateNonstrict(entity).
     * @param publisher The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdateNonstrict(LdPublisher publisher, InsertOption<LdPublisherCB> insertOption, UpdateOption<LdPublisherCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdateNonstrict(publisher, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, ExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param publisher The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(LdPublisher publisher, DeleteOption<LdPublisherCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(publisher, option);
    }

    /**
     * Delete the entity with varying requests non-strictly. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as deleteNonstrict(entity).
     * @param publisher The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDeleteNonstrict(LdPublisher publisher, DeleteOption<LdPublisherCB> option) {
        assertDeleteOptionNotNull(option);
        doDeleteNonstrict(publisher, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param publisherList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<LdPublisher> publisherList, InsertOption<LdPublisherCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(publisherList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param publisherList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<LdPublisher> publisherList, UpdateOption<LdPublisherCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(publisherList, option);
    }

    /**
     * Batch-update the list with varying requests non-strictly. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param publisherList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdateNonstrict(List<LdPublisher> publisherList, UpdateOption<LdPublisherCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdateNonstrict(publisherList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param publisherList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<LdPublisher> publisherList, DeleteOption<LdPublisherCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(publisherList, option);
    }

    /**
     * Batch-delete the list with varying requests non-strictly. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDeleteNonstrict(entityList).
     * @param publisherList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDeleteNonstrict(List<LdPublisher> publisherList, DeleteOption<LdPublisherCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDeleteNonstrict(publisherList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<LdPublisher, LdPublisherCB> setupper, InsertOption<LdPublisherCB> option) {
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
     * LdPublisher publisher = new LdPublisher();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//publisher.setPK...(value);</span>
     * publisher.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//publisher.setVersionNo(value);</span>
     * LdPublisherCB cb = new LdPublisherCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;LdPublisherCB&gt; option = new UpdateOption&lt;LdPublisherCB&gt;();
     * option.self(new SpecifyQuery&lt;LdPublisherCB&gt;() {
     *     public void specify(LdPublisherCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * publisherBhv.<span style="color: #DD4747">varyingQueryUpdate</span>(publisher, cb, option);
     * </pre>
     * @param publisher The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of LdPublisher. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(LdPublisher publisher, LdPublisherCB cb, UpdateOption<LdPublisherCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(publisher, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of LdPublisher. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(LdPublisherCB cb, DeleteOption<LdPublisherCB> option) {
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
    public OutsideSqlBasicExecutor<LdPublisherBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCountUniquely(LdPublisherCB cb) { return invoke(createSelectCountCBCommand(cb, true)); }
    protected int delegateSelectCountPlainly(LdPublisherCB cb) { return invoke(createSelectCountCBCommand(cb, false)); }
    protected <ENTITY extends LdPublisher> void delegateSelectCursor(LdPublisherCB cb, EntityRowHandler<ENTITY> rh, Class<ENTITY> tp)
    { invoke(createSelectCursorCBCommand(cb, rh, tp)); }
    protected <ENTITY extends LdPublisher> List<ENTITY> delegateSelectList(LdPublisherCB cb, Class<ENTITY> tp)
    { return invoke(createSelectListCBCommand(cb, tp)); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(LdPublisher et, InsertOption<LdPublisherCB> op)
    { if (!processBeforeInsert(et, op)) { return 0; }
      return invoke(createInsertEntityCommand(et, op)); }
    protected int delegateUpdate(LdPublisher et, UpdateOption<LdPublisherCB> op)
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return invoke(createUpdateEntityCommand(et, op)); }
    protected int delegateUpdateNonstrict(LdPublisher et, UpdateOption<LdPublisherCB> op)
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return invoke(createUpdateNonstrictEntityCommand(et, op)); }
    protected int delegateDelete(LdPublisher et, DeleteOption<LdPublisherCB> op)
    { if (!processBeforeDelete(et, op)) { return 0; }
      return invoke(createDeleteEntityCommand(et, op)); }
    protected int delegateDeleteNonstrict(LdPublisher et, DeleteOption<LdPublisherCB> op)
    { if (!processBeforeDelete(et, op)) { return 0; }
      return invoke(createDeleteNonstrictEntityCommand(et, op)); }

    protected int[] delegateBatchInsert(List<LdPublisher> ls, InsertOption<LdPublisherCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchInsertCommand(processBatchInternally(ls, op), op)); }
    protected int[] delegateBatchUpdate(List<LdPublisher> ls, UpdateOption<LdPublisherCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateCommand(processBatchInternally(ls, op, false), op)); }
    protected int[] delegateBatchUpdateNonstrict(List<LdPublisher> ls, UpdateOption<LdPublisherCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateNonstrictCommand(processBatchInternally(ls, op, true), op)); }
    protected int[] delegateBatchDelete(List<LdPublisher> ls, DeleteOption<LdPublisherCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteCommand(processBatchInternally(ls, op, false), op)); }
    protected int[] delegateBatchDeleteNonstrict(List<LdPublisher> ls, DeleteOption<LdPublisherCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteNonstrictCommand(processBatchInternally(ls, op, true), op)); }

    protected int delegateQueryInsert(LdPublisher et, LdPublisherCB inCB, ConditionBean resCB, InsertOption<LdPublisherCB> op)
    { if (!processBeforeQueryInsert(et, inCB, resCB, op)) { return 0; } return invoke(createQueryInsertCBCommand(et, inCB, resCB, op));  }
    protected int delegateQueryUpdate(LdPublisher et, LdPublisherCB cb, UpdateOption<LdPublisherCB> op)
    { if (!processBeforeQueryUpdate(et, cb, op)) { return 0; } return invoke(createQueryUpdateCBCommand(et, cb, op));  }
    protected int delegateQueryDelete(LdPublisherCB cb, DeleteOption<LdPublisherCB> op)
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
    protected LdPublisher downcast(Entity et) {
        return helpEntityDowncastInternally(et, LdPublisher.class);
    }

    protected LdPublisherCB downcast(ConditionBean cb) {
        return helpConditionBeanDowncastInternally(cb, LdPublisherCB.class);
    }

    @SuppressWarnings("unchecked")
    protected List<LdPublisher> downcast(List<? extends Entity> ls) {
        return (List<LdPublisher>)ls;
    }

    @SuppressWarnings("unchecked")
    protected InsertOption<LdPublisherCB> downcast(InsertOption<? extends ConditionBean> op) {
        return (InsertOption<LdPublisherCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected UpdateOption<LdPublisherCB> downcast(UpdateOption<? extends ConditionBean> op) {
        return (UpdateOption<LdPublisherCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected DeleteOption<LdPublisherCB> downcast(DeleteOption<? extends ConditionBean> op) {
        return (DeleteOption<LdPublisherCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<LdPublisher, LdPublisherCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> sp) {
        return (QueryInsertSetupper<LdPublisher, LdPublisherCB>)sp;
    }
}
