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
 * The behavior of LIBRARY as TABLE. <br />
 * <pre>
 * [primary key]
 *     LIBRARY_ID
 *
 * [column]
 *     LIBRARY_ID, LIBRARY_NAME, LIBRARY_TYPE_CODE, R_USER, R_MODULE, R_TIMESTAMP, U_USER, U_MODULE, U_TIMESTAMP
 *
 * [sequence]
 *     
 *
 * [identity]
 *     LIBRARY_ID
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     LIBRARY_TYPE_LOOKUP
 *
 * [referrer table]
 *     COLLECTION, LIBRARY_USER, NEXT_LIBRARY
 *
 * [foreign property]
 *     libraryTypeLookup
 *
 * [referrer property]
 *     collectionList, libraryUserList, nextLibraryByLibraryIdList, nextLibraryByNextLibraryIdList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class LdBsLibraryBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "LIBRARY"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public DBMeta getDBMeta() { return LdLibraryDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public LdLibraryDbm getMyDBMeta() { return LdLibraryDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public Entity newEntity() { return newMyEntity(); }

    /** {@inheritDoc} */
    public ConditionBean newConditionBean() { return newMyConditionBean(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public LdLibrary newMyEntity() { return new LdLibrary(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public LdLibraryCB newMyConditionBean() { return new LdLibraryCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * LdLibraryCB cb = new LdLibraryCB();
     * cb.query().setFoo...(value);
     * int count = libraryBhv.<span style="color: #DD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of LdLibrary. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(LdLibraryCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(LdLibraryCB cb) { // called by selectCount(cb)
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(LdLibraryCB cb) { // called by selectPage(cb)
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
     * LdLibraryCB cb = new LdLibraryCB();
     * cb.query().setFoo...(value);
     * LdLibrary library = libraryBhv.<span style="color: #DD4747">selectEntity</span>(cb);
     * if (library != null) { <span style="color: #3F7E5E">// null check</span>
     *     ... = library.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of LdLibrary. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public LdLibrary selectEntity(LdLibraryCB cb) {
        return doSelectEntity(cb, LdLibrary.class);
    }

    protected <ENTITY extends LdLibrary> ENTITY doSelectEntity(LdLibraryCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectEntityInternally(cb, tp, new InternalSelectEntityCallback<ENTITY, LdLibraryCB>() {
            public List<ENTITY> callbackSelectList(LdLibraryCB lcb, Class<ENTITY> ltp) { return doSelectList(lcb, ltp); } });
    }

    protected <ENTITY extends LdLibrary> OptionalEntity<ENTITY> doSelectOptionalEntity(LdLibraryCB cb, Class<ENTITY> tp) {
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
     * LdLibraryCB cb = new LdLibraryCB();
     * cb.query().setFoo...(value);
     * LdLibrary library = libraryBhv.<span style="color: #DD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = library.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of LdLibrary. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (point is not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public LdLibrary selectEntityWithDeletedCheck(LdLibraryCB cb) {
        return doSelectEntityWithDeletedCheck(cb, LdLibrary.class);
    }

    protected <ENTITY extends LdLibrary> ENTITY doSelectEntityWithDeletedCheck(LdLibraryCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectEntityWithDeletedCheckInternally(cb, tp, new InternalSelectEntityWithDeletedCheckCallback<ENTITY, LdLibraryCB>() {
            public List<ENTITY> callbackSelectList(LdLibraryCB lcb, Class<ENTITY> ltp) { return doSelectList(lcb, ltp); } });
    }

    @Override
    protected Entity doReadEntityWithDeletedCheck(ConditionBean cb) {
        return selectEntityWithDeletedCheck(downcast(cb));
    }

    /**
     * Select the entity by the primary-key value.
     * @param libraryId The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public LdLibrary selectByPKValue(Integer libraryId) {
        return doSelectByPKValue(libraryId, LdLibrary.class);
    }

    protected <ENTITY extends LdLibrary> ENTITY doSelectByPKValue(Integer libraryId, Class<ENTITY> entityType) {
        return doSelectEntity(buildPKCB(libraryId), entityType);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param libraryId The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public LdLibrary selectByPKValueWithDeletedCheck(Integer libraryId) {
        return doSelectByPKValueWithDeletedCheck(libraryId, LdLibrary.class);
    }

    protected <ENTITY extends LdLibrary> ENTITY doSelectByPKValueWithDeletedCheck(Integer libraryId, Class<ENTITY> entityType) {
        return doSelectEntityWithDeletedCheck(buildPKCB(libraryId), entityType);
    }

    private LdLibraryCB buildPKCB(Integer libraryId) {
        assertObjectNotNull("libraryId", libraryId);
        LdLibraryCB cb = newMyConditionBean();
        cb.query().setLibraryId_Equal(libraryId);
        return cb;
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * LdLibraryCB cb = new LdLibraryCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;LdLibrary&gt; libraryList = libraryBhv.<span style="color: #DD4747">selectList</span>(cb);
     * for (LdLibrary library : libraryList) {
     *     ... = library.get...();
     * }
     * </pre>
     * @param cb The condition-bean of LdLibrary. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<LdLibrary> selectList(LdLibraryCB cb) {
        return doSelectList(cb, LdLibrary.class);
    }

    protected <ENTITY extends LdLibrary> ListResultBean<ENTITY> doSelectList(LdLibraryCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        return helpSelectListInternally(cb, tp, new InternalSelectListCallback<ENTITY, LdLibraryCB>() {
            public List<ENTITY> callbackSelectList(LdLibraryCB lcb, Class<ENTITY> ltp) { return delegateSelectList(lcb, ltp); } });
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
     * LdLibraryCB cb = new LdLibraryCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #DD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;LdLibrary&gt; page = libraryBhv.<span style="color: #DD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (LdLibrary library : page) {
     *     ... = library.get...();
     * }
     * </pre>
     * @param cb The condition-bean of LdLibrary. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<LdLibrary> selectPage(LdLibraryCB cb) {
        return doSelectPage(cb, LdLibrary.class);
    }

    protected <ENTITY extends LdLibrary> PagingResultBean<ENTITY> doSelectPage(LdLibraryCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectPageInternally(cb, tp, new InternalSelectPageCallback<ENTITY, LdLibraryCB>() {
            public int callbackSelectCount(LdLibraryCB cb) { return doSelectCountPlainly(cb); }
            public List<ENTITY> callbackSelectList(LdLibraryCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); }
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
     * LdLibraryCB cb = new LdLibraryCB();
     * cb.query().setFoo...(value);
     * libraryBhv.<span style="color: #DD4747">selectCursor</span>(cb, new EntityRowHandler&lt;LdLibrary&gt;() {
     *     public void handle(LdLibrary entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of LdLibrary. (NotNull)
     * @param entityRowHandler The handler of entity row of LdLibrary. (NotNull)
     */
    public void selectCursor(LdLibraryCB cb, EntityRowHandler<LdLibrary> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, LdLibrary.class);
    }

    protected <ENTITY extends LdLibrary> void doSelectCursor(LdLibraryCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler", handler); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        helpSelectCursorInternally(cb, handler, tp, new InternalSelectCursorCallback<ENTITY, LdLibraryCB>() {
            public void callbackSelectCursor(LdLibraryCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) { delegateSelectCursor(cb, handler, tp); }
            public List<ENTITY> callbackSelectList(LdLibraryCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); }
        });
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * libraryBhv.<span style="color: #DD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(LdLibraryCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> SLFunction<LdLibraryCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
    }

    protected <RESULT, CB extends LdLibraryCB> SLFunction<CB, RESULT> doScalarSelect(Class<RESULT> tp, CB cb) {
        assertObjectNotNull("resultType", tp); assertCBStateValid(cb);
        cb.xsetupForScalarSelect(); cb.getSqlClause().disableSelectIndex(); // for when you use union
        return createSLFunction(cb, tp);
    }

    protected <RESULT, CB extends LdLibraryCB> SLFunction<CB, RESULT> createSLFunction(CB cb, Class<RESULT> tp) {
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
     * Load referrer of collectionList by the set-upper of referrer. <br />
     * COLLECTION by LIBRARY_ID, named 'collectionList'.
     * <pre>
     * libraryBhv.<span style="color: #DD4747">loadCollectionList</span>(libraryList, new ConditionBeanSetupper&lt;LdCollectionCB&gt;() {
     *     public void setup(LdCollectionCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...();
     *     }
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedList(referrerList -&gt {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * for (LdLibrary library : libraryList) {
     *     ... = library.<span style="color: #DD4747">getCollectionList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setLibraryId_InScope(pkList);
     * cb.query().addOrderBy_LibraryId_Asc();
     * </pre>
     * @param libraryList The entity list of library. (NotNull)
     * @param setupper The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoader<LdCollection> loadCollectionList(List<LdLibrary> libraryList, ConditionBeanSetupper<LdCollectionCB> setupper) {
        xassLRArg(libraryList, setupper);
        return doLoadCollectionList(libraryList, new LoadReferrerOption<LdCollectionCB, LdCollection>().xinit(setupper));
    }

    /**
     * Load referrer of collectionList by the set-upper of referrer. <br />
     * COLLECTION by LIBRARY_ID, named 'collectionList'.
     * <pre>
     * libraryBhv.<span style="color: #DD4747">loadCollectionList</span>(libraryList, new ConditionBeanSetupper&lt;LdCollectionCB&gt;() {
     *     public void setup(LdCollectionCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...();
     *     }
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedList(referrerList -&gt {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = library.<span style="color: #DD4747">getCollectionList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setLibraryId_InScope(pkList);
     * cb.query().addOrderBy_LibraryId_Asc();
     * </pre>
     * @param library The entity of library. (NotNull)
     * @param setupper The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoader<LdCollection> loadCollectionList(LdLibrary library, ConditionBeanSetupper<LdCollectionCB> setupper) {
        xassLRArg(library, setupper);
        return doLoadCollectionList(xnewLRLs(library), new LoadReferrerOption<LdCollectionCB, LdCollection>().xinit(setupper));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param library The entity of library. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoader<LdCollection> loadCollectionList(LdLibrary library, LoadReferrerOption<LdCollectionCB, LdCollection> loadReferrerOption) {
        xassLRArg(library, loadReferrerOption);
        return loadCollectionList(xnewLRLs(library), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean setupper.} #beforejava8
     * @param libraryList The entity list of library. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerLoader<LdCollection> loadCollectionList(List<LdLibrary> libraryList, LoadReferrerOption<LdCollectionCB, LdCollection> loadReferrerOption) {
        xassLRArg(libraryList, loadReferrerOption);
        if (libraryList.isEmpty()) { return (NestedReferrerLoader<LdCollection>)EMPTY_LOADER; }
        return doLoadCollectionList(libraryList, loadReferrerOption);
    }

    protected NestedReferrerLoader<LdCollection> doLoadCollectionList(List<LdLibrary> libraryList, LoadReferrerOption<LdCollectionCB, LdCollection> option) {
        final LdCollectionBhv referrerBhv = xgetBSFLR().select(LdCollectionBhv.class);
        return helpLoadReferrerInternally(libraryList, option, new InternalLoadReferrerCallback<LdLibrary, Integer, LdCollectionCB, LdCollection>() {
            public Integer getPKVal(LdLibrary et)
            { return et.getLibraryId(); }
            public void setRfLs(LdLibrary et, List<LdCollection> ls)
            { et.setCollectionList(ls); }
            public LdCollectionCB newMyCB() { return referrerBhv.newMyConditionBean(); }
            public void qyFKIn(LdCollectionCB cb, List<Integer> ls)
            { cb.query().setLibraryId_InScope(ls); }
            public void qyOdFKAsc(LdCollectionCB cb) { cb.query().addOrderBy_LibraryId_Asc(); }
            public void spFKCol(LdCollectionCB cb) { cb.specify().columnLibraryId(); }
            public List<LdCollection> selRfLs(LdCollectionCB cb) { return referrerBhv.selectList(cb); }
            public Integer getFKVal(LdCollection re) { return re.getLibraryId(); }
            public void setlcEt(LdCollection re, LdLibrary le)
            { re.setLibrary(le); }
            public String getRfPrNm() { return "collectionList"; }
        });
    }

    /**
     * Load referrer of libraryUserList by the set-upper of referrer. <br />
     * LIBRARY_USER by LIBRARY_ID, named 'libraryUserList'.
     * <pre>
     * libraryBhv.<span style="color: #DD4747">loadLibraryUserList</span>(libraryList, new ConditionBeanSetupper&lt;LdLibraryUserCB&gt;() {
     *     public void setup(LdLibraryUserCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...();
     *     }
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedList(referrerList -&gt {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * for (LdLibrary library : libraryList) {
     *     ... = library.<span style="color: #DD4747">getLibraryUserList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setLibraryId_InScope(pkList);
     * cb.query().addOrderBy_LibraryId_Asc();
     * </pre>
     * @param libraryList The entity list of library. (NotNull)
     * @param setupper The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoader<LdLibraryUser> loadLibraryUserList(List<LdLibrary> libraryList, ConditionBeanSetupper<LdLibraryUserCB> setupper) {
        xassLRArg(libraryList, setupper);
        return doLoadLibraryUserList(libraryList, new LoadReferrerOption<LdLibraryUserCB, LdLibraryUser>().xinit(setupper));
    }

    /**
     * Load referrer of libraryUserList by the set-upper of referrer. <br />
     * LIBRARY_USER by LIBRARY_ID, named 'libraryUserList'.
     * <pre>
     * libraryBhv.<span style="color: #DD4747">loadLibraryUserList</span>(libraryList, new ConditionBeanSetupper&lt;LdLibraryUserCB&gt;() {
     *     public void setup(LdLibraryUserCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...();
     *     }
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedList(referrerList -&gt {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = library.<span style="color: #DD4747">getLibraryUserList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setLibraryId_InScope(pkList);
     * cb.query().addOrderBy_LibraryId_Asc();
     * </pre>
     * @param library The entity of library. (NotNull)
     * @param setupper The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoader<LdLibraryUser> loadLibraryUserList(LdLibrary library, ConditionBeanSetupper<LdLibraryUserCB> setupper) {
        xassLRArg(library, setupper);
        return doLoadLibraryUserList(xnewLRLs(library), new LoadReferrerOption<LdLibraryUserCB, LdLibraryUser>().xinit(setupper));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param library The entity of library. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoader<LdLibraryUser> loadLibraryUserList(LdLibrary library, LoadReferrerOption<LdLibraryUserCB, LdLibraryUser> loadReferrerOption) {
        xassLRArg(library, loadReferrerOption);
        return loadLibraryUserList(xnewLRLs(library), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean setupper.} #beforejava8
     * @param libraryList The entity list of library. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerLoader<LdLibraryUser> loadLibraryUserList(List<LdLibrary> libraryList, LoadReferrerOption<LdLibraryUserCB, LdLibraryUser> loadReferrerOption) {
        xassLRArg(libraryList, loadReferrerOption);
        if (libraryList.isEmpty()) { return (NestedReferrerLoader<LdLibraryUser>)EMPTY_LOADER; }
        return doLoadLibraryUserList(libraryList, loadReferrerOption);
    }

    protected NestedReferrerLoader<LdLibraryUser> doLoadLibraryUserList(List<LdLibrary> libraryList, LoadReferrerOption<LdLibraryUserCB, LdLibraryUser> option) {
        final LdLibraryUserBhv referrerBhv = xgetBSFLR().select(LdLibraryUserBhv.class);
        return helpLoadReferrerInternally(libraryList, option, new InternalLoadReferrerCallback<LdLibrary, Integer, LdLibraryUserCB, LdLibraryUser>() {
            public Integer getPKVal(LdLibrary et)
            { return et.getLibraryId(); }
            public void setRfLs(LdLibrary et, List<LdLibraryUser> ls)
            { et.setLibraryUserList(ls); }
            public LdLibraryUserCB newMyCB() { return referrerBhv.newMyConditionBean(); }
            public void qyFKIn(LdLibraryUserCB cb, List<Integer> ls)
            { cb.query().setLibraryId_InScope(ls); }
            public void qyOdFKAsc(LdLibraryUserCB cb) { cb.query().addOrderBy_LibraryId_Asc(); }
            public void spFKCol(LdLibraryUserCB cb) { cb.specify().columnLibraryId(); }
            public List<LdLibraryUser> selRfLs(LdLibraryUserCB cb) { return referrerBhv.selectList(cb); }
            public Integer getFKVal(LdLibraryUser re) { return re.getLibraryId(); }
            public void setlcEt(LdLibraryUser re, LdLibrary le)
            { re.setLibrary(le); }
            public String getRfPrNm() { return "libraryUserList"; }
        });
    }

    /**
     * Load referrer of nextLibraryByLibraryIdList by the set-upper of referrer. <br />
     * NEXT_LIBRARY by LIBRARY_ID, named 'nextLibraryByLibraryIdList'.
     * <pre>
     * libraryBhv.<span style="color: #DD4747">loadNextLibraryByLibraryIdList</span>(libraryList, new ConditionBeanSetupper&lt;LdNextLibraryCB&gt;() {
     *     public void setup(LdNextLibraryCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...();
     *     }
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedList(referrerList -&gt {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * for (LdLibrary library : libraryList) {
     *     ... = library.<span style="color: #DD4747">getNextLibraryByLibraryIdList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setLibraryId_InScope(pkList);
     * cb.query().addOrderBy_LibraryId_Asc();
     * </pre>
     * @param libraryList The entity list of library. (NotNull)
     * @param setupper The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoader<LdNextLibrary> loadNextLibraryByLibraryIdList(List<LdLibrary> libraryList, ConditionBeanSetupper<LdNextLibraryCB> setupper) {
        xassLRArg(libraryList, setupper);
        return doLoadNextLibraryByLibraryIdList(libraryList, new LoadReferrerOption<LdNextLibraryCB, LdNextLibrary>().xinit(setupper));
    }

    /**
     * Load referrer of nextLibraryByLibraryIdList by the set-upper of referrer. <br />
     * NEXT_LIBRARY by LIBRARY_ID, named 'nextLibraryByLibraryIdList'.
     * <pre>
     * libraryBhv.<span style="color: #DD4747">loadNextLibraryByLibraryIdList</span>(libraryList, new ConditionBeanSetupper&lt;LdNextLibraryCB&gt;() {
     *     public void setup(LdNextLibraryCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...();
     *     }
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedList(referrerList -&gt {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = library.<span style="color: #DD4747">getNextLibraryByLibraryIdList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setLibraryId_InScope(pkList);
     * cb.query().addOrderBy_LibraryId_Asc();
     * </pre>
     * @param library The entity of library. (NotNull)
     * @param setupper The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoader<LdNextLibrary> loadNextLibraryByLibraryIdList(LdLibrary library, ConditionBeanSetupper<LdNextLibraryCB> setupper) {
        xassLRArg(library, setupper);
        return doLoadNextLibraryByLibraryIdList(xnewLRLs(library), new LoadReferrerOption<LdNextLibraryCB, LdNextLibrary>().xinit(setupper));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param library The entity of library. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoader<LdNextLibrary> loadNextLibraryByLibraryIdList(LdLibrary library, LoadReferrerOption<LdNextLibraryCB, LdNextLibrary> loadReferrerOption) {
        xassLRArg(library, loadReferrerOption);
        return loadNextLibraryByLibraryIdList(xnewLRLs(library), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean setupper.} #beforejava8
     * @param libraryList The entity list of library. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerLoader<LdNextLibrary> loadNextLibraryByLibraryIdList(List<LdLibrary> libraryList, LoadReferrerOption<LdNextLibraryCB, LdNextLibrary> loadReferrerOption) {
        xassLRArg(libraryList, loadReferrerOption);
        if (libraryList.isEmpty()) { return (NestedReferrerLoader<LdNextLibrary>)EMPTY_LOADER; }
        return doLoadNextLibraryByLibraryIdList(libraryList, loadReferrerOption);
    }

    protected NestedReferrerLoader<LdNextLibrary> doLoadNextLibraryByLibraryIdList(List<LdLibrary> libraryList, LoadReferrerOption<LdNextLibraryCB, LdNextLibrary> option) {
        final LdNextLibraryBhv referrerBhv = xgetBSFLR().select(LdNextLibraryBhv.class);
        return helpLoadReferrerInternally(libraryList, option, new InternalLoadReferrerCallback<LdLibrary, Integer, LdNextLibraryCB, LdNextLibrary>() {
            public Integer getPKVal(LdLibrary et)
            { return et.getLibraryId(); }
            public void setRfLs(LdLibrary et, List<LdNextLibrary> ls)
            { et.setNextLibraryByLibraryIdList(ls); }
            public LdNextLibraryCB newMyCB() { return referrerBhv.newMyConditionBean(); }
            public void qyFKIn(LdNextLibraryCB cb, List<Integer> ls)
            { cb.query().setLibraryId_InScope(ls); }
            public void qyOdFKAsc(LdNextLibraryCB cb) { cb.query().addOrderBy_LibraryId_Asc(); }
            public void spFKCol(LdNextLibraryCB cb) { cb.specify().columnLibraryId(); }
            public List<LdNextLibrary> selRfLs(LdNextLibraryCB cb) { return referrerBhv.selectList(cb); }
            public Integer getFKVal(LdNextLibrary re) { return re.getLibraryId(); }
            public void setlcEt(LdNextLibrary re, LdLibrary le)
            { re.setLibraryByLibraryId(le); }
            public String getRfPrNm() { return "nextLibraryByLibraryIdList"; }
        });
    }

    /**
     * Load referrer of nextLibraryByNextLibraryIdList by the set-upper of referrer. <br />
     * NEXT_LIBRARY by NEXT_LIBRARY_ID, named 'nextLibraryByNextLibraryIdList'.
     * <pre>
     * libraryBhv.<span style="color: #DD4747">loadNextLibraryByNextLibraryIdList</span>(libraryList, new ConditionBeanSetupper&lt;LdNextLibraryCB&gt;() {
     *     public void setup(LdNextLibraryCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...();
     *     }
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedList(referrerList -&gt {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * for (LdLibrary library : libraryList) {
     *     ... = library.<span style="color: #DD4747">getNextLibraryByNextLibraryIdList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setNextLibraryId_InScope(pkList);
     * cb.query().addOrderBy_NextLibraryId_Asc();
     * </pre>
     * @param libraryList The entity list of library. (NotNull)
     * @param setupper The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoader<LdNextLibrary> loadNextLibraryByNextLibraryIdList(List<LdLibrary> libraryList, ConditionBeanSetupper<LdNextLibraryCB> setupper) {
        xassLRArg(libraryList, setupper);
        return doLoadNextLibraryByNextLibraryIdList(libraryList, new LoadReferrerOption<LdNextLibraryCB, LdNextLibrary>().xinit(setupper));
    }

    /**
     * Load referrer of nextLibraryByNextLibraryIdList by the set-upper of referrer. <br />
     * NEXT_LIBRARY by NEXT_LIBRARY_ID, named 'nextLibraryByNextLibraryIdList'.
     * <pre>
     * libraryBhv.<span style="color: #DD4747">loadNextLibraryByNextLibraryIdList</span>(libraryList, new ConditionBeanSetupper&lt;LdNextLibraryCB&gt;() {
     *     public void setup(LdNextLibraryCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...();
     *     }
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedList(referrerList -&gt {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = library.<span style="color: #DD4747">getNextLibraryByNextLibraryIdList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setNextLibraryId_InScope(pkList);
     * cb.query().addOrderBy_NextLibraryId_Asc();
     * </pre>
     * @param library The entity of library. (NotNull)
     * @param setupper The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoader<LdNextLibrary> loadNextLibraryByNextLibraryIdList(LdLibrary library, ConditionBeanSetupper<LdNextLibraryCB> setupper) {
        xassLRArg(library, setupper);
        return doLoadNextLibraryByNextLibraryIdList(xnewLRLs(library), new LoadReferrerOption<LdNextLibraryCB, LdNextLibrary>().xinit(setupper));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param library The entity of library. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoader<LdNextLibrary> loadNextLibraryByNextLibraryIdList(LdLibrary library, LoadReferrerOption<LdNextLibraryCB, LdNextLibrary> loadReferrerOption) {
        xassLRArg(library, loadReferrerOption);
        return loadNextLibraryByNextLibraryIdList(xnewLRLs(library), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean setupper.} #beforejava8
     * @param libraryList The entity list of library. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerLoader<LdNextLibrary> loadNextLibraryByNextLibraryIdList(List<LdLibrary> libraryList, LoadReferrerOption<LdNextLibraryCB, LdNextLibrary> loadReferrerOption) {
        xassLRArg(libraryList, loadReferrerOption);
        if (libraryList.isEmpty()) { return (NestedReferrerLoader<LdNextLibrary>)EMPTY_LOADER; }
        return doLoadNextLibraryByNextLibraryIdList(libraryList, loadReferrerOption);
    }

    protected NestedReferrerLoader<LdNextLibrary> doLoadNextLibraryByNextLibraryIdList(List<LdLibrary> libraryList, LoadReferrerOption<LdNextLibraryCB, LdNextLibrary> option) {
        final LdNextLibraryBhv referrerBhv = xgetBSFLR().select(LdNextLibraryBhv.class);
        return helpLoadReferrerInternally(libraryList, option, new InternalLoadReferrerCallback<LdLibrary, Integer, LdNextLibraryCB, LdNextLibrary>() {
            public Integer getPKVal(LdLibrary et)
            { return et.getLibraryId(); }
            public void setRfLs(LdLibrary et, List<LdNextLibrary> ls)
            { et.setNextLibraryByNextLibraryIdList(ls); }
            public LdNextLibraryCB newMyCB() { return referrerBhv.newMyConditionBean(); }
            public void qyFKIn(LdNextLibraryCB cb, List<Integer> ls)
            { cb.query().setNextLibraryId_InScope(ls); }
            public void qyOdFKAsc(LdNextLibraryCB cb) { cb.query().addOrderBy_NextLibraryId_Asc(); }
            public void spFKCol(LdNextLibraryCB cb) { cb.specify().columnNextLibraryId(); }
            public List<LdNextLibrary> selRfLs(LdNextLibraryCB cb) { return referrerBhv.selectList(cb); }
            public Integer getFKVal(LdNextLibrary re) { return re.getNextLibraryId(); }
            public void setlcEt(LdNextLibrary re, LdLibrary le)
            { re.setLibraryByNextLibraryId(le); }
            public String getRfPrNm() { return "nextLibraryByNextLibraryIdList"; }
        });
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'LdLibraryTypeLookup'.
     * @param libraryList The list of library. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<LdLibraryTypeLookup> pulloutLibraryTypeLookup(List<LdLibrary> libraryList) {
        return helpPulloutInternally(libraryList, new InternalPulloutCallback<LdLibrary, LdLibraryTypeLookup>() {
            public LdLibraryTypeLookup getFr(LdLibrary et) { return et.getLibraryTypeLookup(); }
            public boolean hasRf() { return true; }
            public void setRfLs(LdLibraryTypeLookup et, List<LdLibrary> ls)
            { et.setLibraryList(ls); }
        });
    }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key libraryId.
     * @param libraryList The list of library. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Integer> extractLibraryIdList(List<LdLibrary> libraryList) {
        return helpExtractListInternally(libraryList, new InternalExtractCallback<LdLibrary, Integer>() {
            public Integer getCV(LdLibrary et) { return et.getLibraryId(); }
        });
    }

    /**
     * Extract the value list of (single) unique key libraryName.
     * @param libraryList The list of library. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<String> extractLibraryNameList(List<LdLibrary> libraryList) {
        return helpExtractListInternally(libraryList, new InternalExtractCallback<LdLibrary, String>() {
            public String getCV(LdLibrary et) { return et.getLibraryName(); }
        });
    }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * LdLibrary library = new LdLibrary();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * library.setFoo...(value);
     * library.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//library.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//library.set...;</span>
     * libraryBhv.<span style="color: #DD4747">insert</span>(library);
     * ... = library.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param library The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(LdLibrary library) {
        doInsert(library, null);
    }

    protected void doInsert(LdLibrary library, InsertOption<LdLibraryCB> op) {
        assertObjectNotNull("library", library);
        prepareInsertOption(op);
        delegateInsert(library, op);
    }

    protected void prepareInsertOption(InsertOption<LdLibraryCB> op) {
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
     * LdLibrary library = new LdLibrary();
     * library.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * library.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//library.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//library.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * library.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     libraryBhv.<span style="color: #DD4747">update</span>(library);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param library The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(final LdLibrary library) {
        doUpdate(library, null);
    }

    protected void doUpdate(LdLibrary library, final UpdateOption<LdLibraryCB> op) {
        assertObjectNotNull("library", library);
        prepareUpdateOption(op);
        helpUpdateInternally(library, new InternalUpdateCallback<LdLibrary>() {
            public int callbackDelegateUpdate(LdLibrary et) { return delegateUpdate(et, op); } });
    }

    protected void prepareUpdateOption(UpdateOption<LdLibraryCB> op) {
        if (op == null) { return; }
        assertUpdateOptionStatus(op);
        if (op.hasSelfSpecification()) {
            op.resolveSelfSpecification(createCBForVaryingUpdate());
        }
        if (op.hasSpecifiedUpdateColumn()) {
            op.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    protected LdLibraryCB createCBForVaryingUpdate() {
        LdLibraryCB cb = newMyConditionBean();
        cb.xsetupForVaryingUpdate();
        return cb;
    }

    protected LdLibraryCB createCBForSpecifiedUpdate() {
        LdLibraryCB cb = newMyConditionBean();
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
     * LdLibrary library = new LdLibrary();
     * library.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * library.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//library.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//library.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//library.setVersionNo(value);</span>
     * libraryBhv.<span style="color: #DD4747">updateNonstrict</span>(library);
     * </pre>
     * @param library The entity of update target. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void updateNonstrict(final LdLibrary library) {
        doUpdateNonstrict(library, null);
    }

    protected void doUpdateNonstrict(LdLibrary library, final UpdateOption<LdLibraryCB> op) {
        assertObjectNotNull("library", library);
        prepareUpdateOption(op);
        helpUpdateNonstrictInternally(library, new InternalUpdateNonstrictCallback<LdLibrary>() {
            public int callbackDelegateUpdateNonstrict(LdLibrary et) { return delegateUpdateNonstrict(et, op); } });
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
     * @param library The entity of insert or update target. (NotNull)
     * @exception EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(LdLibrary library) {
        doInesrtOrUpdate(library, null, null);
    }

    protected void doInesrtOrUpdate(LdLibrary library, final InsertOption<LdLibraryCB> iop, final UpdateOption<LdLibraryCB> uop) {
        helpInsertOrUpdateInternally(library, new InternalInsertOrUpdateCallback<LdLibrary, LdLibraryCB>() {
            public void callbackInsert(LdLibrary et) { doInsert(et, iop); }
            public void callbackUpdate(LdLibrary et) { doUpdate(et, uop); }
            public LdLibraryCB callbackNewMyConditionBean() { return newMyConditionBean(); }
            public int callbackSelectCount(LdLibraryCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrModify(Entity et, InsertOption<? extends ConditionBean> iop, UpdateOption<? extends ConditionBean> uop) {
        if (iop == null && uop == null) { insertOrUpdate(downcast(et)); }
        else {
            iop = iop != null ? iop : new InsertOption<LdLibraryCB>();
            uop = uop != null ? uop : new UpdateOption<LdLibraryCB>();
            varyingInsertOrUpdate(downcast(et), downcast(iop), downcast(uop));
        }
    }

    /**
     * Insert or update the entity non-strictly modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br />
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() }
     * <p><span style="color: #DD4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param library The entity of insert or update target. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdateNonstrict(LdLibrary library) {
        doInesrtOrUpdateNonstrict(library, null, null);
    }

    protected void doInesrtOrUpdateNonstrict(LdLibrary library, final InsertOption<LdLibraryCB> iop, final UpdateOption<LdLibraryCB> uop) {
        helpInsertOrUpdateInternally(library, new InternalInsertOrUpdateNonstrictCallback<LdLibrary>() {
            public void callbackInsert(LdLibrary et) { doInsert(et, iop); }
            public void callbackUpdateNonstrict(LdLibrary et) { doUpdateNonstrict(et, uop); }
        });
    }

    @Override
    protected void doCreateOrModifyNonstrict(Entity et, InsertOption<? extends ConditionBean> iop, UpdateOption<? extends ConditionBean> uop) {
        if (iop == null && uop == null) { insertOrUpdateNonstrict(downcast(et)); }
        else {
            iop = iop != null ? iop : new InsertOption<LdLibraryCB>();
            uop = uop != null ? uop : new UpdateOption<LdLibraryCB>();
            varyingInsertOrUpdateNonstrict(downcast(et), downcast(iop), downcast(uop));
        }
    }

    /**
     * Delete the entity. (ZeroUpdateException, ExclusiveControl)
     * <pre>
     * LdLibrary library = new LdLibrary();
     * library.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * library.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     libraryBhv.<span style="color: #DD4747">delete</span>(library);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param library The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(LdLibrary library) {
        doDelete(library, null);
    }

    protected void doDelete(LdLibrary library, final DeleteOption<LdLibraryCB> op) {
        assertObjectNotNull("library", library);
        prepareDeleteOption(op);
        helpDeleteInternally(library, new InternalDeleteCallback<LdLibrary>() {
            public int callbackDelegateDelete(LdLibrary et) { return delegateDelete(et, op); } });
    }

    protected void prepareDeleteOption(DeleteOption<LdLibraryCB> op) {
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
     * LdLibrary library = new LdLibrary();
     * library.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//library.setVersionNo(value);</span>
     * libraryBhv.<span style="color: #DD4747">deleteNonstrict</span>(library);
     * </pre>
     * @param library The entity of delete target. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrict(LdLibrary library) {
        doDeleteNonstrict(library, null);
    }

    protected void doDeleteNonstrict(LdLibrary library, final DeleteOption<LdLibraryCB> op) {
        assertObjectNotNull("library", library);
        prepareDeleteOption(op);
        helpDeleteNonstrictInternally(library, new InternalDeleteNonstrictCallback<LdLibrary>() {
            public int callbackDelegateDeleteNonstrict(LdLibrary et) { return delegateDeleteNonstrict(et, op); } });
    }

    /**
     * Delete the entity non-strictly ignoring deleted. {ZeroUpdateException, NonExclusiveControl}
     * <pre>
     * LdLibrary library = new LdLibrary();
     * library.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//library.setVersionNo(value);</span>
     * libraryBhv.<span style="color: #DD4747">deleteNonstrictIgnoreDeleted</span>(library);
     * <span style="color: #3F7E5E">// if the target entity doesn't exist, no exception</span>
     * </pre>
     * @param library The entity of delete target. (NotNull, PrimaryKeyNotNull)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrictIgnoreDeleted(LdLibrary library) {
        doDeleteNonstrictIgnoreDeleted(library, null);
    }

    protected void doDeleteNonstrictIgnoreDeleted(LdLibrary library, final DeleteOption<LdLibraryCB> op) {
        assertObjectNotNull("library", library);
        prepareDeleteOption(op);
        helpDeleteNonstrictIgnoreDeletedInternally(library, new InternalDeleteNonstrictIgnoreDeletedCallback<LdLibrary>() {
            public int callbackDelegateDeleteNonstrict(LdLibrary et) { return delegateDeleteNonstrict(et, op); } });
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
     *     LdLibrary library = new LdLibrary();
     *     library.setFooName("foo");
     *     if (...) {
     *         library.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     libraryList.add(library);
     * }
     * libraryBhv.<span style="color: #DD4747">batchInsert</span>(libraryList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param libraryList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<LdLibrary> libraryList) {
        InsertOption<LdLibraryCB> op = createInsertUpdateOption();
        return doBatchInsert(libraryList, op);
    }

    protected int[] doBatchInsert(List<LdLibrary> libraryList, InsertOption<LdLibraryCB> op) {
        assertObjectNotNull("libraryList", libraryList);
        prepareBatchInsertOption(libraryList, op);
        return delegateBatchInsert(libraryList, op);
    }

    protected void prepareBatchInsertOption(List<LdLibrary> libraryList, InsertOption<LdLibraryCB> op) {
        op.xallowInsertColumnModifiedPropertiesFragmented();
        op.xacceptInsertColumnModifiedPropertiesIfNeeds(libraryList);
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
     *     LdLibrary library = new LdLibrary();
     *     library.setFooName("foo");
     *     if (...) {
     *         library.setFooPrice(123);
     *     } else {
     *         library.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//library.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     libraryList.add(library);
     * }
     * libraryBhv.<span style="color: #DD4747">batchUpdate</span>(libraryList);
     * </pre>
     * @param libraryList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<LdLibrary> libraryList) {
        UpdateOption<LdLibraryCB> op = createPlainUpdateOption();
        return doBatchUpdate(libraryList, op);
    }

    protected int[] doBatchUpdate(List<LdLibrary> libraryList, UpdateOption<LdLibraryCB> op) {
        assertObjectNotNull("libraryList", libraryList);
        prepareBatchUpdateOption(libraryList, op);
        return delegateBatchUpdate(libraryList, op);
    }

    protected void prepareBatchUpdateOption(List<LdLibrary> libraryList, UpdateOption<LdLibraryCB> op) {
        op.xacceptUpdateColumnModifiedPropertiesIfNeeds(libraryList);
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
     * libraryBhv.<span style="color: #DD4747">batchUpdate</span>(libraryList, new SpecifyQuery<LdLibraryCB>() {
     *     public void specify(LdLibraryCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #DD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #DD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * libraryBhv.<span style="color: #DD4747">batchUpdate</span>(libraryList, new SpecifyQuery<LdLibraryCB>() {
     *     public void specify(LdLibraryCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #DD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param libraryList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<LdLibrary> libraryList, SpecifyQuery<LdLibraryCB> updateColumnSpec) {
        return doBatchUpdate(libraryList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    /**
     * Batch-update the entity list non-strictly modified-only of same-set columns. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <span style="color: #DD4747; font-size: 140%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     LdLibrary library = new LdLibrary();
     *     library.setFooName("foo");
     *     if (...) {
     *         library.setFooPrice(123);
     *     } else {
     *         library.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//library.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     libraryList.add(library);
     * }
     * libraryBhv.<span style="color: #DD4747">batchUpdate</span>(libraryList);
     * </pre>
     * @param libraryList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<LdLibrary> libraryList) {
        UpdateOption<LdLibraryCB> option = createPlainUpdateOption();
        return doBatchUpdateNonstrict(libraryList, option);
    }

    protected int[] doBatchUpdateNonstrict(List<LdLibrary> libraryList, UpdateOption<LdLibraryCB> op) {
        assertObjectNotNull("libraryList", libraryList);
        prepareBatchUpdateOption(libraryList, op);
        return delegateBatchUpdateNonstrict(libraryList, op);
    }

    /**
     * Batch-update the entity list non-strictly specified-only. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * libraryBhv.<span style="color: #DD4747">batchUpdateNonstrict</span>(libraryList, new SpecifyQuery<LdLibraryCB>() {
     *     public void specify(LdLibraryCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #DD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #DD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * libraryBhv.<span style="color: #DD4747">batchUpdateNonstrict</span>(libraryList, new SpecifyQuery<LdLibraryCB>() {
     *     public void specify(LdLibraryCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #DD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).</p>
     * @param libraryList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<LdLibrary> libraryList, SpecifyQuery<LdLibraryCB> updateColumnSpec) {
        return doBatchUpdateNonstrict(libraryList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> op) {
        if (op == null) { return batchUpdateNonstrict(downcast(ls)); }
        else { return varyingBatchUpdateNonstrict(downcast(ls), downcast(op)); }
    }

    /**
     * Batch-delete the entity list. (ExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param libraryList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchDelete(List<LdLibrary> libraryList) {
        return doBatchDelete(libraryList, null);
    }

    protected int[] doBatchDelete(List<LdLibrary> libraryList, DeleteOption<LdLibraryCB> op) {
        assertObjectNotNull("libraryList", libraryList);
        prepareDeleteOption(op);
        return delegateBatchDelete(libraryList, op);
    }

    @Override
    protected int[] doLumpRemove(List<Entity> ls, DeleteOption<? extends ConditionBean> op) {
        if (op == null) { return batchDelete(downcast(ls)); }
        else { return varyingBatchDelete(downcast(ls), downcast(op)); }
    }

    /**
     * Batch-delete the entity list non-strictly. {NonExclusiveControl} <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param libraryList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDeleteNonstrict(List<LdLibrary> libraryList) {
        return doBatchDeleteNonstrict(libraryList, null);
    }

    protected int[] doBatchDeleteNonstrict(List<LdLibrary> libraryList, DeleteOption<LdLibraryCB> op) {
        assertObjectNotNull("libraryList", libraryList);
        prepareDeleteOption(op);
        return delegateBatchDeleteNonstrict(libraryList, op);
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
     * libraryBhv.<span style="color: #DD4747">queryInsert</span>(new QueryInsertSetupper&lt;LdLibrary, LdLibraryCB&gt;() {
     *     public ConditionBean setup(library entity, LdLibraryCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<LdLibrary, LdLibraryCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(QueryInsertSetupper<LdLibrary, LdLibraryCB> sp, InsertOption<LdLibraryCB> op) {
        assertObjectNotNull("setupper", sp);
        prepareInsertOption(op);
        LdLibrary e = new LdLibrary();
        LdLibraryCB cb = createCBForQueryInsert();
        return delegateQueryInsert(e, cb, sp.setup(e, cb), op);
    }

    protected LdLibraryCB createCBForQueryInsert() {
        LdLibraryCB cb = newMyConditionBean();
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
     * LdLibrary library = new LdLibrary();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//library.setPK...(value);</span>
     * library.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//library.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//library.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//library.setVersionNo(value);</span>
     * LdLibraryCB cb = new LdLibraryCB();
     * cb.query().setFoo...(value);
     * libraryBhv.<span style="color: #DD4747">queryUpdate</span>(library, cb);
     * </pre>
     * @param library The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of LdLibrary. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(LdLibrary library, LdLibraryCB cb) {
        return doQueryUpdate(library, cb, null);
    }

    protected int doQueryUpdate(LdLibrary library, LdLibraryCB cb, UpdateOption<LdLibraryCB> op) {
        assertObjectNotNull("library", library); assertCBStateValid(cb);
        prepareUpdateOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryUpdate(library, cb, op) : 0;
    }

    @Override
    protected int doRangeModify(Entity et, ConditionBean cb, UpdateOption<? extends ConditionBean> op) {
        if (op == null) { return queryUpdate(downcast(et), (LdLibraryCB)cb); }
        else { return varyingQueryUpdate(downcast(et), (LdLibraryCB)cb, downcast(op)); }
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * LdLibraryCB cb = new LdLibraryCB();
     * cb.query().setFoo...(value);
     * libraryBhv.<span style="color: #DD4747">queryDelete</span>(library, cb);
     * </pre>
     * @param cb The condition-bean of LdLibrary. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(LdLibraryCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(LdLibraryCB cb, DeleteOption<LdLibraryCB> op) {
        assertCBStateValid(cb);
        prepareDeleteOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryDelete(cb, op) : 0;
    }

    @Override
    protected int doRangeRemove(ConditionBean cb, DeleteOption<? extends ConditionBean> op) {
        if (op == null) { return queryDelete((LdLibraryCB)cb); }
        else { return varyingQueryDelete((LdLibraryCB)cb, downcast(op)); }
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
     * LdLibrary library = new LdLibrary();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * library.setFoo...(value);
     * library.setBar...(value);
     * InsertOption<LdLibraryCB> option = new InsertOption<LdLibraryCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * libraryBhv.<span style="color: #DD4747">varyingInsert</span>(library, option);
     * ... = library.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param library The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(LdLibrary library, InsertOption<LdLibraryCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(library, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, ExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * LdLibrary library = new LdLibrary();
     * library.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * library.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * library.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;LdLibraryCB&gt; option = new UpdateOption&lt;LdLibraryCB&gt;();
     *     option.self(new SpecifyQuery&lt;LdLibraryCB&gt;() {
     *         public void specify(LdLibraryCB cb) {
     *             cb.specify().<span style="color: #DD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     libraryBhv.<span style="color: #DD4747">varyingUpdate</span>(library, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param library The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(LdLibrary library, UpdateOption<LdLibraryCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(library, option);
    }

    /**
     * Update the entity with varying requests non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as updateNonstrict(entity).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * LdLibrary library = new LdLibrary();
     * library.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * library.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//library.setVersionNo(value);</span>
     * UpdateOption&lt;LdLibraryCB&gt; option = new UpdateOption&lt;LdLibraryCB&gt;();
     * option.self(new SpecifyQuery&lt;LdLibraryCB&gt;() {
     *     public void specify(LdLibraryCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * libraryBhv.<span style="color: #DD4747">varyingUpdateNonstrict</span>(library, option);
     * </pre>
     * @param library The entity of update target. (NotNull, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdateNonstrict(LdLibrary library, UpdateOption<LdLibraryCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdateNonstrict(library, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param library The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(LdLibrary library, InsertOption<LdLibraryCB> insertOption, UpdateOption<LdLibraryCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdate(library, insertOption, updateOption);
    }

    /**
     * Insert or update the entity with varying requests non-strictly. (NonExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdateNonstrict(entity).
     * @param library The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdateNonstrict(LdLibrary library, InsertOption<LdLibraryCB> insertOption, UpdateOption<LdLibraryCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdateNonstrict(library, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, ExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param library The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(LdLibrary library, DeleteOption<LdLibraryCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(library, option);
    }

    /**
     * Delete the entity with varying requests non-strictly. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as deleteNonstrict(entity).
     * @param library The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDeleteNonstrict(LdLibrary library, DeleteOption<LdLibraryCB> option) {
        assertDeleteOptionNotNull(option);
        doDeleteNonstrict(library, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param libraryList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<LdLibrary> libraryList, InsertOption<LdLibraryCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(libraryList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param libraryList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<LdLibrary> libraryList, UpdateOption<LdLibraryCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(libraryList, option);
    }

    /**
     * Batch-update the list with varying requests non-strictly. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param libraryList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdateNonstrict(List<LdLibrary> libraryList, UpdateOption<LdLibraryCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdateNonstrict(libraryList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param libraryList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<LdLibrary> libraryList, DeleteOption<LdLibraryCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(libraryList, option);
    }

    /**
     * Batch-delete the list with varying requests non-strictly. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDeleteNonstrict(entityList).
     * @param libraryList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDeleteNonstrict(List<LdLibrary> libraryList, DeleteOption<LdLibraryCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDeleteNonstrict(libraryList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<LdLibrary, LdLibraryCB> setupper, InsertOption<LdLibraryCB> option) {
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
     * LdLibrary library = new LdLibrary();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//library.setPK...(value);</span>
     * library.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//library.setVersionNo(value);</span>
     * LdLibraryCB cb = new LdLibraryCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;LdLibraryCB&gt; option = new UpdateOption&lt;LdLibraryCB&gt;();
     * option.self(new SpecifyQuery&lt;LdLibraryCB&gt;() {
     *     public void specify(LdLibraryCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * libraryBhv.<span style="color: #DD4747">varyingQueryUpdate</span>(library, cb, option);
     * </pre>
     * @param library The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of LdLibrary. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(LdLibrary library, LdLibraryCB cb, UpdateOption<LdLibraryCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(library, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of LdLibrary. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(LdLibraryCB cb, DeleteOption<LdLibraryCB> option) {
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
    public OutsideSqlBasicExecutor<LdLibraryBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCountUniquely(LdLibraryCB cb) { return invoke(createSelectCountCBCommand(cb, true)); }
    protected int delegateSelectCountPlainly(LdLibraryCB cb) { return invoke(createSelectCountCBCommand(cb, false)); }
    protected <ENTITY extends LdLibrary> void delegateSelectCursor(LdLibraryCB cb, EntityRowHandler<ENTITY> rh, Class<ENTITY> tp)
    { invoke(createSelectCursorCBCommand(cb, rh, tp)); }
    protected <ENTITY extends LdLibrary> List<ENTITY> delegateSelectList(LdLibraryCB cb, Class<ENTITY> tp)
    { return invoke(createSelectListCBCommand(cb, tp)); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(LdLibrary et, InsertOption<LdLibraryCB> op)
    { if (!processBeforeInsert(et, op)) { return 0; }
      return invoke(createInsertEntityCommand(et, op)); }
    protected int delegateUpdate(LdLibrary et, UpdateOption<LdLibraryCB> op)
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return invoke(createUpdateEntityCommand(et, op)); }
    protected int delegateUpdateNonstrict(LdLibrary et, UpdateOption<LdLibraryCB> op)
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return invoke(createUpdateNonstrictEntityCommand(et, op)); }
    protected int delegateDelete(LdLibrary et, DeleteOption<LdLibraryCB> op)
    { if (!processBeforeDelete(et, op)) { return 0; }
      return invoke(createDeleteEntityCommand(et, op)); }
    protected int delegateDeleteNonstrict(LdLibrary et, DeleteOption<LdLibraryCB> op)
    { if (!processBeforeDelete(et, op)) { return 0; }
      return invoke(createDeleteNonstrictEntityCommand(et, op)); }

    protected int[] delegateBatchInsert(List<LdLibrary> ls, InsertOption<LdLibraryCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchInsertCommand(processBatchInternally(ls, op), op)); }
    protected int[] delegateBatchUpdate(List<LdLibrary> ls, UpdateOption<LdLibraryCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateCommand(processBatchInternally(ls, op, false), op)); }
    protected int[] delegateBatchUpdateNonstrict(List<LdLibrary> ls, UpdateOption<LdLibraryCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateNonstrictCommand(processBatchInternally(ls, op, true), op)); }
    protected int[] delegateBatchDelete(List<LdLibrary> ls, DeleteOption<LdLibraryCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteCommand(processBatchInternally(ls, op, false), op)); }
    protected int[] delegateBatchDeleteNonstrict(List<LdLibrary> ls, DeleteOption<LdLibraryCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteNonstrictCommand(processBatchInternally(ls, op, true), op)); }

    protected int delegateQueryInsert(LdLibrary et, LdLibraryCB inCB, ConditionBean resCB, InsertOption<LdLibraryCB> op)
    { if (!processBeforeQueryInsert(et, inCB, resCB, op)) { return 0; } return invoke(createQueryInsertCBCommand(et, inCB, resCB, op));  }
    protected int delegateQueryUpdate(LdLibrary et, LdLibraryCB cb, UpdateOption<LdLibraryCB> op)
    { if (!processBeforeQueryUpdate(et, cb, op)) { return 0; } return invoke(createQueryUpdateCBCommand(et, cb, op));  }
    protected int delegateQueryDelete(LdLibraryCB cb, DeleteOption<LdLibraryCB> op)
    { if (!processBeforeQueryDelete(cb, op)) { return 0; } return invoke(createQueryDeleteCBCommand(cb, op));  }

    // ===================================================================================
    //                                                                     Filter Override
    //                                                                     ===============
    @Override
    protected void filterEntityOfInsert(Entity tgt, InsertOption<? extends ConditionBean> op) {
        super.filterEntityOfInsert(tgt, op);
        LdLibrary et = downcast(tgt);
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
    protected LdLibrary downcast(Entity et) {
        return helpEntityDowncastInternally(et, LdLibrary.class);
    }

    protected LdLibraryCB downcast(ConditionBean cb) {
        return helpConditionBeanDowncastInternally(cb, LdLibraryCB.class);
    }

    @SuppressWarnings("unchecked")
    protected List<LdLibrary> downcast(List<? extends Entity> ls) {
        return (List<LdLibrary>)ls;
    }

    @SuppressWarnings("unchecked")
    protected InsertOption<LdLibraryCB> downcast(InsertOption<? extends ConditionBean> op) {
        return (InsertOption<LdLibraryCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected UpdateOption<LdLibraryCB> downcast(UpdateOption<? extends ConditionBean> op) {
        return (UpdateOption<LdLibraryCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected DeleteOption<LdLibraryCB> downcast(DeleteOption<? extends ConditionBean> op) {
        return (DeleteOption<LdLibraryCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<LdLibrary, LdLibraryCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> sp) {
        return (QueryInsertSetupper<LdLibrary, LdLibraryCB>)sp;
    }
}
