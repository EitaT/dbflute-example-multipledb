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
     * int count = libraryBhv.<span style="color: #FD4747">selectCount</span>(cb);
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
     * Select the entity by the condition-bean.
     * <pre>
     * LdLibraryCB cb = new LdLibraryCB();
     * cb.query().setFoo...(value);
     * LdLibrary library = libraryBhv.<span style="color: #FD4747">selectEntity</span>(cb);
     * if (library != null) {
     *     ... = library.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of LdLibrary. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public LdLibrary selectEntity(LdLibraryCB cb) {
        return doSelectEntity(cb, LdLibrary.class);
    }

    protected <ENTITY extends LdLibrary> ENTITY doSelectEntity(final LdLibraryCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityInternally(cb, entityType, new InternalSelectEntityCallback<ENTITY, LdLibraryCB>() {
            public List<ENTITY> callbackSelectList(LdLibraryCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); } });
    }

    @Override
    protected Entity doReadEntity(ConditionBean cb) {
        return selectEntity(downcast(cb));
    }

    /**
     * Select the entity by the condition-bean with deleted check.
     * <pre>
     * LdLibraryCB cb = new LdLibraryCB();
     * cb.query().setFoo...(value);
     * LdLibrary library = libraryBhv.<span style="color: #FD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = library.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of LdLibrary. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public LdLibrary selectEntityWithDeletedCheck(LdLibraryCB cb) {
        return doSelectEntityWithDeletedCheck(cb, LdLibrary.class);
    }

    protected <ENTITY extends LdLibrary> ENTITY doSelectEntityWithDeletedCheck(final LdLibraryCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityWithDeletedCheckInternally(cb, entityType, new InternalSelectEntityWithDeletedCheckCallback<ENTITY, LdLibraryCB>() {
            public List<ENTITY> callbackSelectList(LdLibraryCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); } });
    }

    @Override
    protected Entity doReadEntityWithDeletedCheck(ConditionBean cb) {
        return selectEntityWithDeletedCheck(downcast(cb));
    }

    /**
     * Select the entity by the primary-key value.
     * @param libraryId The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
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
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
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
     * ListResultBean&lt;LdLibrary&gt; libraryList = libraryBhv.<span style="color: #FD4747">selectList</span>(cb);
     * for (LdLibrary library : libraryList) {
     *     ... = library.get...();
     * }
     * </pre>
     * @param cb The condition-bean of LdLibrary. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<LdLibrary> selectList(LdLibraryCB cb) {
        return doSelectList(cb, LdLibrary.class);
    }

    protected <ENTITY extends LdLibrary> ListResultBean<ENTITY> doSelectList(LdLibraryCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", entityType);
        assertSpecifyDerivedReferrerEntityProperty(cb, entityType);
        return helpSelectListInternally(cb, entityType, new InternalSelectListCallback<ENTITY, LdLibraryCB>() {
            public List<ENTITY> callbackSelectList(LdLibraryCB cb, Class<ENTITY> entityType) { return delegateSelectList(cb, entityType); } });
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
     * cb.<span style="color: #FD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;LdLibrary&gt; page = libraryBhv.<span style="color: #FD4747">selectPage</span>(cb);
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
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<LdLibrary> selectPage(LdLibraryCB cb) {
        return doSelectPage(cb, LdLibrary.class);
    }

    protected <ENTITY extends LdLibrary> PagingResultBean<ENTITY> doSelectPage(LdLibraryCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", entityType);
        return helpSelectPageInternally(cb, entityType, new InternalSelectPageCallback<ENTITY, LdLibraryCB>() {
            public int callbackSelectCount(LdLibraryCB cb) { return doSelectCountPlainly(cb); }
            public List<ENTITY> callbackSelectList(LdLibraryCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); }
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
     * libraryBhv.<span style="color: #FD4747">selectCursor</span>(cb, new EntityRowHandler&lt;LdLibrary&gt;() {
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

    protected <ENTITY extends LdLibrary> void doSelectCursor(LdLibraryCB cb, EntityRowHandler<ENTITY> entityRowHandler, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler<LdLibrary>", entityRowHandler); assertObjectNotNull("entityType", entityType);
        assertSpecifyDerivedReferrerEntityProperty(cb, entityType);
        helpSelectCursorInternally(cb, entityRowHandler, entityType, new InternalSelectCursorCallback<ENTITY, LdLibraryCB>() {
            public void callbackSelectCursor(LdLibraryCB cb, EntityRowHandler<ENTITY> entityRowHandler, Class<ENTITY> entityType) { delegateSelectCursor(cb, entityRowHandler, entityType); }
            public List<ENTITY> callbackSelectList(LdLibraryCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); }
        });
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * libraryBhv.<span style="color: #FD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(LdLibraryCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
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

    protected <RESULT, CB extends LdLibraryCB> SLFunction<CB, RESULT> doScalarSelect(Class<RESULT> resultType, CB cb) {
        assertObjectNotNull("resultType", resultType); assertCBStateValid(cb);
        cb.xsetupForScalarSelect(); cb.getSqlClause().disableSelectIndex(); // for when you use union
        return createSLFunction(cb, resultType);
    }

    protected <RESULT, CB extends LdLibraryCB> SLFunction<CB, RESULT> createSLFunction(CB cb, Class<RESULT> resultType) {
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
     * @param library The entity of library. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     */
    public void loadCollectionList(LdLibrary library, ConditionBeanSetupper<LdCollectionCB> conditionBeanSetupper) {
        xassLRArg(library, conditionBeanSetupper);
        loadCollectionList(xnewLRLs(library), conditionBeanSetupper);
    }
    /**
     * Load referrer of collectionList with the set-upper for condition-bean of referrer. <br />
     * COLLECTION by LIBRARY_ID, named 'collectionList'.
     * <pre>
     * libraryBhv.<span style="color: #FD4747">loadCollectionList</span>(libraryList, new ConditionBeanSetupper&lt;LdCollectionCB&gt;() {
     *     public void setup(LdCollectionCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...(); <span style="color: #3F7E5E">// basically you should order referrer list</span>
     *     }
     * });
     * for (LdLibrary library : libraryList) {
     *     ... = library.<span style="color: #FD4747">getCollectionList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key(and others too) is treated as case-insensitive. <br />
     * The condition-bean that the set-upper provides have settings before you touch it. It is as follows:
     * <pre>
     * cb.query().setLibraryId_InScope(pkList);
     * cb.query().addOrderBy_LibraryId_Asc();
     * </pre>
     * @param libraryList The entity list of library. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     */
    public void loadCollectionList(List<LdLibrary> libraryList, ConditionBeanSetupper<LdCollectionCB> conditionBeanSetupper) {
        xassLRArg(libraryList, conditionBeanSetupper);
        loadCollectionList(libraryList, new LoadReferrerOption<LdCollectionCB, LdCollection>().xinit(conditionBeanSetupper));
    }
    /**
     * {Refer to overload method that has an argument of the list of entity.}
     * @param library The entity of library. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadCollectionList(LdLibrary library, LoadReferrerOption<LdCollectionCB, LdCollection> loadReferrerOption) {
        xassLRArg(library, loadReferrerOption);
        loadCollectionList(xnewLRLs(library), loadReferrerOption);
    }
    /**
     * {Refer to overload method that has an argument of condition-bean setupper.}
     * @param libraryList The entity list of library. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadCollectionList(List<LdLibrary> libraryList, LoadReferrerOption<LdCollectionCB, LdCollection> loadReferrerOption) {
        xassLRArg(libraryList, loadReferrerOption);
        if (libraryList.isEmpty()) { return; }
        final LdCollectionBhv referrerBhv = xgetBSFLR().select(LdCollectionBhv.class);
        helpLoadReferrerInternally(libraryList, loadReferrerOption, new InternalLoadReferrerCallback<LdLibrary, Integer, LdCollectionCB, LdCollection>() {
            public Integer getPKVal(LdLibrary e)
            { return e.getLibraryId(); }
            public void setRfLs(LdLibrary e, List<LdCollection> ls)
            { e.setCollectionList(ls); }
            public LdCollectionCB newMyCB() { return referrerBhv.newMyConditionBean(); }
            public void qyFKIn(LdCollectionCB cb, List<Integer> ls)
            { cb.query().setLibraryId_InScope(ls); }
            public void qyOdFKAsc(LdCollectionCB cb) { cb.query().addOrderBy_LibraryId_Asc(); }
            public void spFKCol(LdCollectionCB cb) { cb.specify().columnLibraryId(); }
            public List<LdCollection> selRfLs(LdCollectionCB cb) { return referrerBhv.selectList(cb); }
            public Integer getFKVal(LdCollection e) { return e.getLibraryId(); }
            public void setlcEt(LdCollection re, LdLibrary le)
            { re.setLibrary(le); }
            public String getRfPrNm() { return "collectionList"; }
        });
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.}
     * @param library The entity of library. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     */
    public void loadLibraryUserList(LdLibrary library, ConditionBeanSetupper<LdLibraryUserCB> conditionBeanSetupper) {
        xassLRArg(library, conditionBeanSetupper);
        loadLibraryUserList(xnewLRLs(library), conditionBeanSetupper);
    }
    /**
     * Load referrer of libraryUserList with the set-upper for condition-bean of referrer. <br />
     * LIBRARY_USER by LIBRARY_ID, named 'libraryUserList'.
     * <pre>
     * libraryBhv.<span style="color: #FD4747">loadLibraryUserList</span>(libraryList, new ConditionBeanSetupper&lt;LdLibraryUserCB&gt;() {
     *     public void setup(LdLibraryUserCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...(); <span style="color: #3F7E5E">// basically you should order referrer list</span>
     *     }
     * });
     * for (LdLibrary library : libraryList) {
     *     ... = library.<span style="color: #FD4747">getLibraryUserList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key(and others too) is treated as case-insensitive. <br />
     * The condition-bean that the set-upper provides have settings before you touch it. It is as follows:
     * <pre>
     * cb.query().setLibraryId_InScope(pkList);
     * cb.query().addOrderBy_LibraryId_Asc();
     * </pre>
     * @param libraryList The entity list of library. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     */
    public void loadLibraryUserList(List<LdLibrary> libraryList, ConditionBeanSetupper<LdLibraryUserCB> conditionBeanSetupper) {
        xassLRArg(libraryList, conditionBeanSetupper);
        loadLibraryUserList(libraryList, new LoadReferrerOption<LdLibraryUserCB, LdLibraryUser>().xinit(conditionBeanSetupper));
    }
    /**
     * {Refer to overload method that has an argument of the list of entity.}
     * @param library The entity of library. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadLibraryUserList(LdLibrary library, LoadReferrerOption<LdLibraryUserCB, LdLibraryUser> loadReferrerOption) {
        xassLRArg(library, loadReferrerOption);
        loadLibraryUserList(xnewLRLs(library), loadReferrerOption);
    }
    /**
     * {Refer to overload method that has an argument of condition-bean setupper.}
     * @param libraryList The entity list of library. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadLibraryUserList(List<LdLibrary> libraryList, LoadReferrerOption<LdLibraryUserCB, LdLibraryUser> loadReferrerOption) {
        xassLRArg(libraryList, loadReferrerOption);
        if (libraryList.isEmpty()) { return; }
        final LdLibraryUserBhv referrerBhv = xgetBSFLR().select(LdLibraryUserBhv.class);
        helpLoadReferrerInternally(libraryList, loadReferrerOption, new InternalLoadReferrerCallback<LdLibrary, Integer, LdLibraryUserCB, LdLibraryUser>() {
            public Integer getPKVal(LdLibrary e)
            { return e.getLibraryId(); }
            public void setRfLs(LdLibrary e, List<LdLibraryUser> ls)
            { e.setLibraryUserList(ls); }
            public LdLibraryUserCB newMyCB() { return referrerBhv.newMyConditionBean(); }
            public void qyFKIn(LdLibraryUserCB cb, List<Integer> ls)
            { cb.query().setLibraryId_InScope(ls); }
            public void qyOdFKAsc(LdLibraryUserCB cb) { cb.query().addOrderBy_LibraryId_Asc(); }
            public void spFKCol(LdLibraryUserCB cb) { cb.specify().columnLibraryId(); }
            public List<LdLibraryUser> selRfLs(LdLibraryUserCB cb) { return referrerBhv.selectList(cb); }
            public Integer getFKVal(LdLibraryUser e) { return e.getLibraryId(); }
            public void setlcEt(LdLibraryUser re, LdLibrary le)
            { re.setLibrary(le); }
            public String getRfPrNm() { return "libraryUserList"; }
        });
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.}
     * @param library The entity of library. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     */
    public void loadNextLibraryByLibraryIdList(LdLibrary library, ConditionBeanSetupper<LdNextLibraryCB> conditionBeanSetupper) {
        xassLRArg(library, conditionBeanSetupper);
        loadNextLibraryByLibraryIdList(xnewLRLs(library), conditionBeanSetupper);
    }
    /**
     * Load referrer of nextLibraryByLibraryIdList with the set-upper for condition-bean of referrer. <br />
     * NEXT_LIBRARY by LIBRARY_ID, named 'nextLibraryByLibraryIdList'.
     * <pre>
     * libraryBhv.<span style="color: #FD4747">loadNextLibraryByLibraryIdList</span>(libraryList, new ConditionBeanSetupper&lt;LdNextLibraryCB&gt;() {
     *     public void setup(LdNextLibraryCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...(); <span style="color: #3F7E5E">// basically you should order referrer list</span>
     *     }
     * });
     * for (LdLibrary library : libraryList) {
     *     ... = library.<span style="color: #FD4747">getNextLibraryByLibraryIdList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key(and others too) is treated as case-insensitive. <br />
     * The condition-bean that the set-upper provides have settings before you touch it. It is as follows:
     * <pre>
     * cb.query().setLibraryId_InScope(pkList);
     * cb.query().addOrderBy_LibraryId_Asc();
     * </pre>
     * @param libraryList The entity list of library. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     */
    public void loadNextLibraryByLibraryIdList(List<LdLibrary> libraryList, ConditionBeanSetupper<LdNextLibraryCB> conditionBeanSetupper) {
        xassLRArg(libraryList, conditionBeanSetupper);
        loadNextLibraryByLibraryIdList(libraryList, new LoadReferrerOption<LdNextLibraryCB, LdNextLibrary>().xinit(conditionBeanSetupper));
    }
    /**
     * {Refer to overload method that has an argument of the list of entity.}
     * @param library The entity of library. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadNextLibraryByLibraryIdList(LdLibrary library, LoadReferrerOption<LdNextLibraryCB, LdNextLibrary> loadReferrerOption) {
        xassLRArg(library, loadReferrerOption);
        loadNextLibraryByLibraryIdList(xnewLRLs(library), loadReferrerOption);
    }
    /**
     * {Refer to overload method that has an argument of condition-bean setupper.}
     * @param libraryList The entity list of library. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadNextLibraryByLibraryIdList(List<LdLibrary> libraryList, LoadReferrerOption<LdNextLibraryCB, LdNextLibrary> loadReferrerOption) {
        xassLRArg(libraryList, loadReferrerOption);
        if (libraryList.isEmpty()) { return; }
        final LdNextLibraryBhv referrerBhv = xgetBSFLR().select(LdNextLibraryBhv.class);
        helpLoadReferrerInternally(libraryList, loadReferrerOption, new InternalLoadReferrerCallback<LdLibrary, Integer, LdNextLibraryCB, LdNextLibrary>() {
            public Integer getPKVal(LdLibrary e)
            { return e.getLibraryId(); }
            public void setRfLs(LdLibrary e, List<LdNextLibrary> ls)
            { e.setNextLibraryByLibraryIdList(ls); }
            public LdNextLibraryCB newMyCB() { return referrerBhv.newMyConditionBean(); }
            public void qyFKIn(LdNextLibraryCB cb, List<Integer> ls)
            { cb.query().setLibraryId_InScope(ls); }
            public void qyOdFKAsc(LdNextLibraryCB cb) { cb.query().addOrderBy_LibraryId_Asc(); }
            public void spFKCol(LdNextLibraryCB cb) { cb.specify().columnLibraryId(); }
            public List<LdNextLibrary> selRfLs(LdNextLibraryCB cb) { return referrerBhv.selectList(cb); }
            public Integer getFKVal(LdNextLibrary e) { return e.getLibraryId(); }
            public void setlcEt(LdNextLibrary re, LdLibrary le)
            { re.setLibraryByLibraryId(le); }
            public String getRfPrNm() { return "nextLibraryByLibraryIdList"; }
        });
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.}
     * @param library The entity of library. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     */
    public void loadNextLibraryByNextLibraryIdList(LdLibrary library, ConditionBeanSetupper<LdNextLibraryCB> conditionBeanSetupper) {
        xassLRArg(library, conditionBeanSetupper);
        loadNextLibraryByNextLibraryIdList(xnewLRLs(library), conditionBeanSetupper);
    }
    /**
     * Load referrer of nextLibraryByNextLibraryIdList with the set-upper for condition-bean of referrer. <br />
     * NEXT_LIBRARY by NEXT_LIBRARY_ID, named 'nextLibraryByNextLibraryIdList'.
     * <pre>
     * libraryBhv.<span style="color: #FD4747">loadNextLibraryByNextLibraryIdList</span>(libraryList, new ConditionBeanSetupper&lt;LdNextLibraryCB&gt;() {
     *     public void setup(LdNextLibraryCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...(); <span style="color: #3F7E5E">// basically you should order referrer list</span>
     *     }
     * });
     * for (LdLibrary library : libraryList) {
     *     ... = library.<span style="color: #FD4747">getNextLibraryByNextLibraryIdList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key(and others too) is treated as case-insensitive. <br />
     * The condition-bean that the set-upper provides have settings before you touch it. It is as follows:
     * <pre>
     * cb.query().setNextLibraryId_InScope(pkList);
     * cb.query().addOrderBy_NextLibraryId_Asc();
     * </pre>
     * @param libraryList The entity list of library. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     */
    public void loadNextLibraryByNextLibraryIdList(List<LdLibrary> libraryList, ConditionBeanSetupper<LdNextLibraryCB> conditionBeanSetupper) {
        xassLRArg(libraryList, conditionBeanSetupper);
        loadNextLibraryByNextLibraryIdList(libraryList, new LoadReferrerOption<LdNextLibraryCB, LdNextLibrary>().xinit(conditionBeanSetupper));
    }
    /**
     * {Refer to overload method that has an argument of the list of entity.}
     * @param library The entity of library. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadNextLibraryByNextLibraryIdList(LdLibrary library, LoadReferrerOption<LdNextLibraryCB, LdNextLibrary> loadReferrerOption) {
        xassLRArg(library, loadReferrerOption);
        loadNextLibraryByNextLibraryIdList(xnewLRLs(library), loadReferrerOption);
    }
    /**
     * {Refer to overload method that has an argument of condition-bean setupper.}
     * @param libraryList The entity list of library. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadNextLibraryByNextLibraryIdList(List<LdLibrary> libraryList, LoadReferrerOption<LdNextLibraryCB, LdNextLibrary> loadReferrerOption) {
        xassLRArg(libraryList, loadReferrerOption);
        if (libraryList.isEmpty()) { return; }
        final LdNextLibraryBhv referrerBhv = xgetBSFLR().select(LdNextLibraryBhv.class);
        helpLoadReferrerInternally(libraryList, loadReferrerOption, new InternalLoadReferrerCallback<LdLibrary, Integer, LdNextLibraryCB, LdNextLibrary>() {
            public Integer getPKVal(LdLibrary e)
            { return e.getLibraryId(); }
            public void setRfLs(LdLibrary e, List<LdNextLibrary> ls)
            { e.setNextLibraryByNextLibraryIdList(ls); }
            public LdNextLibraryCB newMyCB() { return referrerBhv.newMyConditionBean(); }
            public void qyFKIn(LdNextLibraryCB cb, List<Integer> ls)
            { cb.query().setNextLibraryId_InScope(ls); }
            public void qyOdFKAsc(LdNextLibraryCB cb) { cb.query().addOrderBy_NextLibraryId_Asc(); }
            public void spFKCol(LdNextLibraryCB cb) { cb.specify().columnNextLibraryId(); }
            public List<LdNextLibrary> selRfLs(LdNextLibraryCB cb) { return referrerBhv.selectList(cb); }
            public Integer getFKVal(LdNextLibrary e) { return e.getNextLibraryId(); }
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
            public LdLibraryTypeLookup getFr(LdLibrary e) { return e.getLibraryTypeLookup(); }
            public boolean hasRf() { return true; }
            public void setRfLs(LdLibraryTypeLookup e, List<LdLibrary> ls)
            { e.setLibraryList(ls); }
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
            public Integer getCV(LdLibrary e) { return e.getLibraryId(); }
        });
    }

    /**
     * Extract the value list of (single) unique key libraryName.
     * @param libraryList The list of library. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<String> extractLibraryNameList(List<LdLibrary> libraryList) {
        return helpExtractListInternally(libraryList, new InternalExtractCallback<LdLibrary, String>() {
            public String getCV(LdLibrary e) { return e.getLibraryName(); }
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
     * libraryBhv.<span style="color: #FD4747">insert</span>(library);
     * ... = library.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param library The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(LdLibrary library) {
        doInsert(library, null);
    }

    protected void doInsert(LdLibrary library, InsertOption<LdLibraryCB> option) {
        assertObjectNotNull("library", library);
        prepareInsertOption(option);
        delegateInsert(library, option);
    }

    protected void prepareInsertOption(InsertOption<LdLibraryCB> option) {
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
     * LdLibrary library = new LdLibrary();
     * library.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * library.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//library.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//library.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * library.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     libraryBhv.<span style="color: #FD4747">update</span>(library);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * } 
     * </pre>
     * @param library The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(final LdLibrary library) {
        doUpdate(library, null);
    }

    protected void doUpdate(LdLibrary library, final UpdateOption<LdLibraryCB> option) {
        assertObjectNotNull("library", library);
        prepareUpdateOption(option);
        helpUpdateInternally(library, new InternalUpdateCallback<LdLibrary>() {
            public int callbackDelegateUpdate(LdLibrary entity) { return delegateUpdate(entity, option); } });
    }

    protected void prepareUpdateOption(UpdateOption<LdLibraryCB> option) {
        if (option == null) { return; }
        assertUpdateOptionStatus(option);
        if (option.hasSelfSpecification()) {
            option.resolveSelfSpecification(createCBForVaryingUpdate());
        }
        if (option.hasSpecifiedUpdateColumn()) {
            option.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate());
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
    protected void doModify(Entity entity, UpdateOption<? extends ConditionBean> option) {
        if (option == null) { update(downcast(entity)); }
        else { varyingUpdate(downcast(entity), downcast(option)); }
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
     * libraryBhv.<span style="color: #FD4747">updateNonstrict</span>(library);
     * </pre>
     * @param library The entity of update target. (NotNull, PrimaryKeyNotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void updateNonstrict(final LdLibrary library) {
        doUpdateNonstrict(library, null);
    }

    protected void doUpdateNonstrict(LdLibrary library, final UpdateOption<LdLibraryCB> option) {
        assertObjectNotNull("library", library);
        prepareUpdateOption(option);
        helpUpdateNonstrictInternally(library, new InternalUpdateNonstrictCallback<LdLibrary>() {
            public int callbackDelegateUpdateNonstrict(LdLibrary entity) { return delegateUpdateNonstrict(entity, option); } });
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
     * @param library The entity of insert or update target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(LdLibrary library) {
        doInesrtOrUpdate(library, null, null);
    }

    protected void doInesrtOrUpdate(LdLibrary library, final InsertOption<LdLibraryCB> insertOption, final UpdateOption<LdLibraryCB> updateOption) {
        helpInsertOrUpdateInternally(library, new InternalInsertOrUpdateCallback<LdLibrary, LdLibraryCB>() {
            public void callbackInsert(LdLibrary entity) { doInsert(entity, insertOption); }
            public void callbackUpdate(LdLibrary entity) { doUpdate(entity, updateOption); }
            public LdLibraryCB callbackNewMyConditionBean() { return newMyConditionBean(); }
            public int callbackSelectCount(LdLibraryCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrModify(Entity entity, InsertOption<? extends ConditionBean> insertOption,
            UpdateOption<? extends ConditionBean> updateOption) {
        if (insertOption == null && updateOption == null) { insertOrUpdate(downcast(entity)); }
        else {
            insertOption = insertOption == null ? new InsertOption<LdLibraryCB>() : insertOption;
            updateOption = updateOption == null ? new UpdateOption<LdLibraryCB>() : updateOption;
            varyingInsertOrUpdate(downcast(entity), downcast(insertOption), downcast(updateOption));
        }
    }

    /**
     * Insert or update the entity non-strictly modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br />
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() }
     * <p><span style="color: #FD4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param library The entity of insert or update target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdateNonstrict(LdLibrary library) {
        doInesrtOrUpdateNonstrict(library, null, null);
    }

    protected void doInesrtOrUpdateNonstrict(LdLibrary library, final InsertOption<LdLibraryCB> insertOption, final UpdateOption<LdLibraryCB> updateOption) {
        helpInsertOrUpdateInternally(library, new InternalInsertOrUpdateNonstrictCallback<LdLibrary>() {
            public void callbackInsert(LdLibrary entity) { doInsert(entity, insertOption); }
            public void callbackUpdateNonstrict(LdLibrary entity) { doUpdateNonstrict(entity, updateOption); }
        });
    }

    @Override
    protected void doCreateOrModifyNonstrict(Entity entity, InsertOption<? extends ConditionBean> insertOption,
            UpdateOption<? extends ConditionBean> updateOption) {
        if (insertOption == null && updateOption == null) { insertOrUpdateNonstrict(downcast(entity)); }
        else {
            insertOption = insertOption == null ? new InsertOption<LdLibraryCB>() : insertOption;
            updateOption = updateOption == null ? new UpdateOption<LdLibraryCB>() : updateOption;
            varyingInsertOrUpdateNonstrict(downcast(entity), downcast(insertOption), downcast(updateOption));
        }
    }

    /**
     * Delete the entity. (ZeroUpdateException, ExclusiveControl)
     * <pre>
     * LdLibrary library = new LdLibrary();
     * library.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * library.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     libraryBhv.<span style="color: #FD4747">delete</span>(library);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * } 
     * </pre>
     * @param library The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(LdLibrary library) {
        doDelete(library, null);
    }

    protected void doDelete(LdLibrary library, final DeleteOption<LdLibraryCB> option) {
        assertObjectNotNull("library", library);
        prepareDeleteOption(option);
        helpDeleteInternally(library, new InternalDeleteCallback<LdLibrary>() {
            public int callbackDelegateDelete(LdLibrary entity) { return delegateDelete(entity, option); } });
    }

    protected void prepareDeleteOption(DeleteOption<LdLibraryCB> option) {
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
     * LdLibrary library = new LdLibrary();
     * library.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//library.setVersionNo(value);</span>
     * libraryBhv.<span style="color: #FD4747">deleteNonstrict</span>(library);
     * </pre>
     * @param library The entity of delete target. (NotNull, PrimaryKeyNotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrict(LdLibrary library) {
        doDeleteNonstrict(library, null);
    }

    protected void doDeleteNonstrict(LdLibrary library, final DeleteOption<LdLibraryCB> option) {
        assertObjectNotNull("library", library);
        prepareDeleteOption(option);
        helpDeleteNonstrictInternally(library, new InternalDeleteNonstrictCallback<LdLibrary>() {
            public int callbackDelegateDeleteNonstrict(LdLibrary entity) { return delegateDeleteNonstrict(entity, option); } });
    }

    /**
     * Delete the entity non-strictly ignoring deleted. {ZeroUpdateException, NonExclusiveControl}
     * <pre>
     * LdLibrary library = new LdLibrary();
     * library.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//library.setVersionNo(value);</span>
     * libraryBhv.<span style="color: #FD4747">deleteNonstrictIgnoreDeleted</span>(library);
     * <span style="color: #3F7E5E">// if the target entity doesn't exist, no exception</span>
     * </pre>
     * @param library The entity of delete target. (NotNull, PrimaryKeyNotNull)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrictIgnoreDeleted(LdLibrary library) {
        doDeleteNonstrictIgnoreDeleted(library, null);
    }

    protected void doDeleteNonstrictIgnoreDeleted(LdLibrary library, final DeleteOption<LdLibraryCB> option) {
        assertObjectNotNull("library", library);
        prepareDeleteOption(option);
        helpDeleteNonstrictIgnoreDeletedInternally(library, new InternalDeleteNonstrictIgnoreDeletedCallback<LdLibrary>() {
            public int callbackDelegateDeleteNonstrict(LdLibrary entity) { return delegateDeleteNonstrict(entity, option); } });
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
     * libraryBhv.<span style="color: #FD4747">batchInsert</span>(libraryList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param libraryList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<LdLibrary> libraryList) {
        InsertOption<LdLibraryCB> option = createInsertUpdateOption();
        return doBatchInsert(libraryList, option);
    }

    protected int[] doBatchInsert(List<LdLibrary> libraryList, InsertOption<LdLibraryCB> option) {
        assertObjectNotNull("libraryList", libraryList);
        prepareBatchInsertOption(libraryList, option);
        return delegateBatchInsert(libraryList, option);
    }

    protected void prepareBatchInsertOption(List<LdLibrary> libraryList, InsertOption<LdLibraryCB> option) {
        option.xallowInsertColumnModifiedPropertiesFragmented();
        option.xacceptInsertColumnModifiedPropertiesIfNeeds(libraryList);
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
     * libraryBhv.<span style="color: #FD4747">batchUpdate</span>(libraryList);
     * </pre>
     * @param libraryList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<LdLibrary> libraryList) {
        UpdateOption<LdLibraryCB> option = createPlainUpdateOption();
        return doBatchUpdate(libraryList, option);
    }

    protected int[] doBatchUpdate(List<LdLibrary> libraryList, UpdateOption<LdLibraryCB> option) {
        assertObjectNotNull("libraryList", libraryList);
        prepareBatchUpdateOption(libraryList, option);
        return delegateBatchUpdate(libraryList, option);
    }

    protected void prepareBatchUpdateOption(List<LdLibrary> libraryList, UpdateOption<LdLibraryCB> option) {
        option.xacceptUpdateColumnModifiedPropertiesIfNeeds(libraryList);
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
     * libraryBhv.<span style="color: #FD4747">batchUpdate</span>(libraryList, new SpecifyQuery<LdLibraryCB>() {
     *     public void specify(LdLibraryCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #FD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #FD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span> 
     * libraryBhv.<span style="color: #FD4747">batchUpdate</span>(libraryList, new SpecifyQuery<LdLibraryCB>() {
     *     public void specify(LdLibraryCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #FD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
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
     * @exception org.seasar.dbflute.exception.BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<LdLibrary> libraryList, SpecifyQuery<LdLibraryCB> updateColumnSpec) {
        return doBatchUpdate(libraryList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    /**
     * Batch-update the entity list non-strictly modified-only of same-set columns. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <span style="color: #FD4747; font-size: 140%">You should specify same-set columns to all entities like this:</span>
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
     * libraryBhv.<span style="color: #FD4747">batchUpdate</span>(libraryList);
     * </pre>
     * @param libraryList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<LdLibrary> libraryList) {
        UpdateOption<LdLibraryCB> option = createPlainUpdateOption();
        return doBatchUpdateNonstrict(libraryList, option);
    }

    protected int[] doBatchUpdateNonstrict(List<LdLibrary> libraryList, UpdateOption<LdLibraryCB> option) {
        assertObjectNotNull("libraryList", libraryList);
        prepareBatchUpdateOption(libraryList, option);
        return delegateBatchUpdateNonstrict(libraryList, option);
    }

    /**
     * Batch-update the entity list non-strictly specified-only. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span> 
     * libraryBhv.<span style="color: #FD4747">batchUpdateNonstrict</span>(libraryList, new SpecifyQuery<LdLibraryCB>() {
     *     public void specify(LdLibraryCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #FD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #FD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span> 
     * libraryBhv.<span style="color: #FD4747">batchUpdateNonstrict</span>(libraryList, new SpecifyQuery<LdLibraryCB>() {
     *     public void specify(LdLibraryCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #FD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
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
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<LdLibrary> libraryList, SpecifyQuery<LdLibraryCB> updateColumnSpec) {
        return doBatchUpdateNonstrict(libraryList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> option) {
        if (option == null) { return batchUpdateNonstrict(downcast(ls)); }
        else { return varyingBatchUpdateNonstrict(downcast(ls), downcast(option)); }
    }

    /**
     * Batch-delete the entity list. (ExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param libraryList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchDelete(List<LdLibrary> libraryList) {
        return doBatchDelete(libraryList, null);
    }

    protected int[] doBatchDelete(List<LdLibrary> libraryList, DeleteOption<LdLibraryCB> option) {
        assertObjectNotNull("libraryList", libraryList);
        prepareDeleteOption(option);
        return delegateBatchDelete(libraryList, option);
    }

    @Override
    protected int[] doLumpRemove(List<Entity> ls, DeleteOption<? extends ConditionBean> option) {
        if (option == null) { return batchDelete(downcast(ls)); }
        else { return varyingBatchDelete(downcast(ls), downcast(option)); }
    }

    /**
     * Batch-delete the entity list non-strictly. {NonExclusiveControl} <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param libraryList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDeleteNonstrict(List<LdLibrary> libraryList) {
        return doBatchDeleteNonstrict(libraryList, null);
    }

    protected int[] doBatchDeleteNonstrict(List<LdLibrary> libraryList, DeleteOption<LdLibraryCB> option) {
        assertObjectNotNull("libraryList", libraryList);
        prepareDeleteOption(option);
        return delegateBatchDeleteNonstrict(libraryList, option);
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
     * libraryBhv.<span style="color: #FD4747">queryInsert</span>(new QueryInsertSetupper&lt;LdLibrary, LdLibraryCB&gt;() {
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

    protected int doQueryInsert(QueryInsertSetupper<LdLibrary, LdLibraryCB> setupper, InsertOption<LdLibraryCB> option) {
        assertObjectNotNull("setupper", setupper);
        prepareInsertOption(option);
        LdLibrary entity = new LdLibrary();
        LdLibraryCB intoCB = createCBForQueryInsert();
        ConditionBean resourceCB = setupper.setup(entity, intoCB);
        return delegateQueryInsert(entity, intoCB, resourceCB, option);
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
     * libraryBhv.<span style="color: #FD4747">queryUpdate</span>(library, cb);
     * </pre>
     * @param library The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of LdLibrary. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(LdLibrary library, LdLibraryCB cb) {
        return doQueryUpdate(library, cb, null);
    }

    protected int doQueryUpdate(LdLibrary library, LdLibraryCB cb, UpdateOption<LdLibraryCB> option) {
        assertObjectNotNull("library", library); assertCBStateValid(cb);
        prepareUpdateOption(option);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryUpdate(library, cb, option) : 0;
    }

    @Override
    protected int doRangeModify(Entity entity, ConditionBean cb, UpdateOption<? extends ConditionBean> option) {
        if (option == null) { return queryUpdate(downcast(entity), (LdLibraryCB)cb); }
        else { return varyingQueryUpdate(downcast(entity), (LdLibraryCB)cb, downcast(option)); }
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * LdLibraryCB cb = new LdLibraryCB();
     * cb.query().setFoo...(value);
     * libraryBhv.<span style="color: #FD4747">queryDelete</span>(library, cb);
     * </pre>
     * @param cb The condition-bean of LdLibrary. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(LdLibraryCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(LdLibraryCB cb, DeleteOption<LdLibraryCB> option) {
        assertCBStateValid(cb);
        prepareDeleteOption(option);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryDelete(cb, option) : 0;
    }

    @Override
    protected int doRangeRemove(ConditionBean cb, DeleteOption<? extends ConditionBean> option) {
        if (option == null) { return queryDelete((LdLibraryCB)cb); }
        else { return varyingQueryDelete((LdLibraryCB)cb, downcast(option)); }
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
     * libraryBhv.<span style="color: #FD4747">varyingInsert</span>(library, option);
     * ... = library.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param library The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
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
     * library.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;LdLibraryCB&gt; option = new UpdateOption&lt;LdLibraryCB&gt;();
     *     option.self(new SpecifyQuery&lt;LdLibraryCB&gt;() {
     *         public void specify(LdLibraryCB cb) {
     *             cb.specify().<span style="color: #FD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     libraryBhv.<span style="color: #FD4747">varyingUpdate</span>(library, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param library The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
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
     *         cb.specify().<span style="color: #FD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * libraryBhv.<span style="color: #FD4747">varyingUpdateNonstrict</span>(library, option);
     * </pre>
     * @param library The entity of update target. (NotNull, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
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
     * @exception org.seasar.dbflute.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
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
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
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
     * @exception org.seasar.dbflute.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
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
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
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
     *         cb.specify().<span style="color: #FD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * libraryBhv.<span style="color: #FD4747">varyingQueryUpdate</span>(library, cb, option);
     * </pre>
     * @param library The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of LdLibrary. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
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
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
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
    protected <ENTITY extends LdLibrary> void delegateSelectCursor(LdLibraryCB cb, EntityRowHandler<ENTITY> erh, Class<ENTITY> et)
    { invoke(createSelectCursorCBCommand(cb, erh, et)); }
    protected <ENTITY extends LdLibrary> List<ENTITY> delegateSelectList(LdLibraryCB cb, Class<ENTITY> et)
    { return invoke(createSelectListCBCommand(cb, et)); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(LdLibrary e, InsertOption<LdLibraryCB> op)
    { if (!processBeforeInsert(e, op)) { return 0; }
      return invoke(createInsertEntityCommand(e, op)); }
    protected int delegateUpdate(LdLibrary e, UpdateOption<LdLibraryCB> op)
    { if (!processBeforeUpdate(e, op)) { return 0; }
      return invoke(createUpdateEntityCommand(e, op)); }
    protected int delegateUpdateNonstrict(LdLibrary e, UpdateOption<LdLibraryCB> op)
    { if (!processBeforeUpdate(e, op)) { return 0; }
      return invoke(createUpdateNonstrictEntityCommand(e, op)); }
    protected int delegateDelete(LdLibrary e, DeleteOption<LdLibraryCB> op)
    { if (!processBeforeDelete(e, op)) { return 0; }
      return invoke(createDeleteEntityCommand(e, op)); }
    protected int delegateDeleteNonstrict(LdLibrary e, DeleteOption<LdLibraryCB> op)
    { if (!processBeforeDelete(e, op)) { return 0; }
      return invoke(createDeleteNonstrictEntityCommand(e, op)); }

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

    protected int delegateQueryInsert(LdLibrary e, LdLibraryCB inCB, ConditionBean resCB, InsertOption<LdLibraryCB> op)
    { if (!processBeforeQueryInsert(e, inCB, resCB, op)) { return 0; } return invoke(createQueryInsertCBCommand(e, inCB, resCB, op));  }
    protected int delegateQueryUpdate(LdLibrary e, LdLibraryCB cb, UpdateOption<LdLibraryCB> op)
    { if (!processBeforeQueryUpdate(e, cb, op)) { return 0; } return invoke(createQueryUpdateCBCommand(e, cb, op));  }
    protected int delegateQueryDelete(LdLibraryCB cb, DeleteOption<LdLibraryCB> op)
    { if (!processBeforeQueryDelete(cb, op)) { return 0; } return invoke(createQueryDeleteCBCommand(cb, op));  }

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
    protected LdLibrary downcast(Entity entity) {
        return helpEntityDowncastInternally(entity, LdLibrary.class);
    }

    protected LdLibraryCB downcast(ConditionBean cb) {
        return helpConditionBeanDowncastInternally(cb, LdLibraryCB.class);
    }

    @SuppressWarnings("unchecked")
    protected List<LdLibrary> downcast(List<? extends Entity> entityList) {
        return (List<LdLibrary>)entityList;
    }

    @SuppressWarnings("unchecked")
    protected InsertOption<LdLibraryCB> downcast(InsertOption<? extends ConditionBean> option) {
        return (InsertOption<LdLibraryCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected UpdateOption<LdLibraryCB> downcast(UpdateOption<? extends ConditionBean> option) {
        return (UpdateOption<LdLibraryCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected DeleteOption<LdLibraryCB> downcast(DeleteOption<? extends ConditionBean> option) {
        return (DeleteOption<LdLibraryCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<LdLibrary, LdLibraryCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> option) {
        return (QueryInsertSetupper<LdLibrary, LdLibraryCB>)option;
    }
}
