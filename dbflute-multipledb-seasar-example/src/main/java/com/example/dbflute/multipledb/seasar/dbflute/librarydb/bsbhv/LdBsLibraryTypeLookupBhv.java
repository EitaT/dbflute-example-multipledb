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
 * The behavior of LIBRARY_TYPE_LOOKUP as TABLE. <br />
 * <pre>
 * [primary key]
 *     LIBRARY_TYPE_CODE
 * 
 * [column]
 *     LIBRARY_TYPE_CODE, LIBRARY_TYPE_NAME, R_USER, R_MODULE, R_TIMESTAMP, U_USER, U_MODULE, U_TIMESTAMP
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
 *     LIBRARY
 * 
 * [foreign property]
 *     
 * 
 * [referrer property]
 *     libraryList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class LdBsLibraryTypeLookupBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "LIBRARY_TYPE_LOOKUP"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public DBMeta getDBMeta() { return LdLibraryTypeLookupDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public LdLibraryTypeLookupDbm getMyDBMeta() { return LdLibraryTypeLookupDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public Entity newEntity() { return newMyEntity(); }

    /** {@inheritDoc} */
    public ConditionBean newConditionBean() { return newMyConditionBean(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public LdLibraryTypeLookup newMyEntity() { return new LdLibraryTypeLookup(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public LdLibraryTypeLookupCB newMyConditionBean() { return new LdLibraryTypeLookupCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * LdLibraryTypeLookupCB cb = new LdLibraryTypeLookupCB();
     * cb.query().setFoo...(value);
     * int count = libraryTypeLookupBhv.<span style="color: #FD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of LdLibraryTypeLookup. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(LdLibraryTypeLookupCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(LdLibraryTypeLookupCB cb) { // called by selectCount(cb) 
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(LdLibraryTypeLookupCB cb) { // called by selectPage(cb)
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
     * LdLibraryTypeLookupCB cb = new LdLibraryTypeLookupCB();
     * cb.query().setFoo...(value);
     * LdLibraryTypeLookup libraryTypeLookup = libraryTypeLookupBhv.<span style="color: #FD4747">selectEntity</span>(cb);
     * if (libraryTypeLookup != null) {
     *     ... = libraryTypeLookup.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of LdLibraryTypeLookup. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public LdLibraryTypeLookup selectEntity(LdLibraryTypeLookupCB cb) {
        return doSelectEntity(cb, LdLibraryTypeLookup.class);
    }

    protected <ENTITY extends LdLibraryTypeLookup> ENTITY doSelectEntity(final LdLibraryTypeLookupCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityInternally(cb, entityType, new InternalSelectEntityCallback<ENTITY, LdLibraryTypeLookupCB>() {
            public List<ENTITY> callbackSelectList(LdLibraryTypeLookupCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); } });
    }

    @Override
    protected Entity doReadEntity(ConditionBean cb) {
        return selectEntity(downcast(cb));
    }

    /**
     * Select the entity by the condition-bean with deleted check.
     * <pre>
     * LdLibraryTypeLookupCB cb = new LdLibraryTypeLookupCB();
     * cb.query().setFoo...(value);
     * LdLibraryTypeLookup libraryTypeLookup = libraryTypeLookupBhv.<span style="color: #FD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = libraryTypeLookup.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of LdLibraryTypeLookup. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public LdLibraryTypeLookup selectEntityWithDeletedCheck(LdLibraryTypeLookupCB cb) {
        return doSelectEntityWithDeletedCheck(cb, LdLibraryTypeLookup.class);
    }

    protected <ENTITY extends LdLibraryTypeLookup> ENTITY doSelectEntityWithDeletedCheck(final LdLibraryTypeLookupCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityWithDeletedCheckInternally(cb, entityType, new InternalSelectEntityWithDeletedCheckCallback<ENTITY, LdLibraryTypeLookupCB>() {
            public List<ENTITY> callbackSelectList(LdLibraryTypeLookupCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); } });
    }

    @Override
    protected Entity doReadEntityWithDeletedCheck(ConditionBean cb) {
        return selectEntityWithDeletedCheck(downcast(cb));
    }

    /**
     * Select the entity by the primary-key value.
     * @param libraryTypeCode The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public LdLibraryTypeLookup selectByPKValue(String libraryTypeCode) {
        return doSelectByPKValue(libraryTypeCode, LdLibraryTypeLookup.class);
    }

    protected <ENTITY extends LdLibraryTypeLookup> ENTITY doSelectByPKValue(String libraryTypeCode, Class<ENTITY> entityType) {
        return doSelectEntity(buildPKCB(libraryTypeCode), entityType);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param libraryTypeCode The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public LdLibraryTypeLookup selectByPKValueWithDeletedCheck(String libraryTypeCode) {
        return doSelectByPKValueWithDeletedCheck(libraryTypeCode, LdLibraryTypeLookup.class);
    }

    protected <ENTITY extends LdLibraryTypeLookup> ENTITY doSelectByPKValueWithDeletedCheck(String libraryTypeCode, Class<ENTITY> entityType) {
        return doSelectEntityWithDeletedCheck(buildPKCB(libraryTypeCode), entityType);
    }

    private LdLibraryTypeLookupCB buildPKCB(String libraryTypeCode) {
        assertObjectNotNull("libraryTypeCode", libraryTypeCode);
        LdLibraryTypeLookupCB cb = newMyConditionBean();
        cb.query().setLibraryTypeCode_Equal(libraryTypeCode);
        return cb;
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * LdLibraryTypeLookupCB cb = new LdLibraryTypeLookupCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;LdLibraryTypeLookup&gt; libraryTypeLookupList = libraryTypeLookupBhv.<span style="color: #FD4747">selectList</span>(cb);
     * for (LdLibraryTypeLookup libraryTypeLookup : libraryTypeLookupList) {
     *     ... = libraryTypeLookup.get...();
     * }
     * </pre>
     * @param cb The condition-bean of LdLibraryTypeLookup. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<LdLibraryTypeLookup> selectList(LdLibraryTypeLookupCB cb) {
        return doSelectList(cb, LdLibraryTypeLookup.class);
    }

    protected <ENTITY extends LdLibraryTypeLookup> ListResultBean<ENTITY> doSelectList(LdLibraryTypeLookupCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", entityType);
        assertSpecifyDerivedReferrerEntityProperty(cb, entityType);
        return helpSelectListInternally(cb, entityType, new InternalSelectListCallback<ENTITY, LdLibraryTypeLookupCB>() {
            public List<ENTITY> callbackSelectList(LdLibraryTypeLookupCB cb, Class<ENTITY> entityType) { return delegateSelectList(cb, entityType); } });
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
     * LdLibraryTypeLookupCB cb = new LdLibraryTypeLookupCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #FD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;LdLibraryTypeLookup&gt; page = libraryTypeLookupBhv.<span style="color: #FD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (LdLibraryTypeLookup libraryTypeLookup : page) {
     *     ... = libraryTypeLookup.get...();
     * }
     * </pre>
     * @param cb The condition-bean of LdLibraryTypeLookup. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<LdLibraryTypeLookup> selectPage(LdLibraryTypeLookupCB cb) {
        return doSelectPage(cb, LdLibraryTypeLookup.class);
    }

    protected <ENTITY extends LdLibraryTypeLookup> PagingResultBean<ENTITY> doSelectPage(LdLibraryTypeLookupCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", entityType);
        return helpSelectPageInternally(cb, entityType, new InternalSelectPageCallback<ENTITY, LdLibraryTypeLookupCB>() {
            public int callbackSelectCount(LdLibraryTypeLookupCB cb) { return doSelectCountPlainly(cb); }
            public List<ENTITY> callbackSelectList(LdLibraryTypeLookupCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); }
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
     * LdLibraryTypeLookupCB cb = new LdLibraryTypeLookupCB();
     * cb.query().setFoo...(value);
     * libraryTypeLookupBhv.<span style="color: #FD4747">selectCursor</span>(cb, new EntityRowHandler&lt;LdLibraryTypeLookup&gt;() {
     *     public void handle(LdLibraryTypeLookup entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of LdLibraryTypeLookup. (NotNull)
     * @param entityRowHandler The handler of entity row of LdLibraryTypeLookup. (NotNull)
     */
    public void selectCursor(LdLibraryTypeLookupCB cb, EntityRowHandler<LdLibraryTypeLookup> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, LdLibraryTypeLookup.class);
    }

    protected <ENTITY extends LdLibraryTypeLookup> void doSelectCursor(LdLibraryTypeLookupCB cb, EntityRowHandler<ENTITY> entityRowHandler, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler<LdLibraryTypeLookup>", entityRowHandler); assertObjectNotNull("entityType", entityType);
        assertSpecifyDerivedReferrerEntityProperty(cb, entityType);
        helpSelectCursorInternally(cb, entityRowHandler, entityType, new InternalSelectCursorCallback<ENTITY, LdLibraryTypeLookupCB>() {
            public void callbackSelectCursor(LdLibraryTypeLookupCB cb, EntityRowHandler<ENTITY> entityRowHandler, Class<ENTITY> entityType) { delegateSelectCursor(cb, entityRowHandler, entityType); }
            public List<ENTITY> callbackSelectList(LdLibraryTypeLookupCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); }
        });
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * libraryTypeLookupBhv.<span style="color: #FD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(LdLibraryTypeLookupCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> SLFunction<LdLibraryTypeLookupCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
    }

    protected <RESULT, CB extends LdLibraryTypeLookupCB> SLFunction<CB, RESULT> doScalarSelect(Class<RESULT> resultType, CB cb) {
        assertObjectNotNull("resultType", resultType); assertCBStateValid(cb);
        cb.xsetupForScalarSelect(); cb.getSqlClause().disableSelectIndex(); // for when you use union
        return createSLFunction(cb, resultType);
    }

    protected <RESULT, CB extends LdLibraryTypeLookupCB> SLFunction<CB, RESULT> createSLFunction(CB cb, Class<RESULT> resultType) {
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
     * @param libraryTypeLookup The entity of libraryTypeLookup. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     */
    public void loadLibraryList(LdLibraryTypeLookup libraryTypeLookup, ConditionBeanSetupper<LdLibraryCB> conditionBeanSetupper) {
        xassLRArg(libraryTypeLookup, conditionBeanSetupper);
        loadLibraryList(xnewLRLs(libraryTypeLookup), conditionBeanSetupper);
    }
    /**
     * Load referrer of libraryList with the set-upper for condition-bean of referrer. <br />
     * LIBRARY by LIBRARY_TYPE_CODE, named 'libraryList'.
     * <pre>
     * libraryTypeLookupBhv.<span style="color: #FD4747">loadLibraryList</span>(libraryTypeLookupList, new ConditionBeanSetupper&lt;LdLibraryCB&gt;() {
     *     public void setup(LdLibraryCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...(); <span style="color: #3F7E5E">// basically you should order referrer list</span>
     *     }
     * });
     * for (LdLibraryTypeLookup libraryTypeLookup : libraryTypeLookupList) {
     *     ... = libraryTypeLookup.<span style="color: #FD4747">getLibraryList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key(and others too) is treated as case-insensitive. <br />
     * The condition-bean that the set-upper provides have settings before you touch it. It is as follows:
     * <pre>
     * cb.query().setLibraryTypeCode_InScope(pkList);
     * cb.query().addOrderBy_LibraryTypeCode_Asc();
     * </pre>
     * @param libraryTypeLookupList The entity list of libraryTypeLookup. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     */
    public void loadLibraryList(List<LdLibraryTypeLookup> libraryTypeLookupList, ConditionBeanSetupper<LdLibraryCB> conditionBeanSetupper) {
        xassLRArg(libraryTypeLookupList, conditionBeanSetupper);
        loadLibraryList(libraryTypeLookupList, new LoadReferrerOption<LdLibraryCB, LdLibrary>().xinit(conditionBeanSetupper));
    }
    /**
     * {Refer to overload method that has an argument of the list of entity.}
     * @param libraryTypeLookup The entity of libraryTypeLookup. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadLibraryList(LdLibraryTypeLookup libraryTypeLookup, LoadReferrerOption<LdLibraryCB, LdLibrary> loadReferrerOption) {
        xassLRArg(libraryTypeLookup, loadReferrerOption);
        loadLibraryList(xnewLRLs(libraryTypeLookup), loadReferrerOption);
    }
    /**
     * {Refer to overload method that has an argument of condition-bean setupper.}
     * @param libraryTypeLookupList The entity list of libraryTypeLookup. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadLibraryList(List<LdLibraryTypeLookup> libraryTypeLookupList, LoadReferrerOption<LdLibraryCB, LdLibrary> loadReferrerOption) {
        xassLRArg(libraryTypeLookupList, loadReferrerOption);
        if (libraryTypeLookupList.isEmpty()) { return; }
        final LdLibraryBhv referrerBhv = xgetBSFLR().select(LdLibraryBhv.class);
        helpLoadReferrerInternally(libraryTypeLookupList, loadReferrerOption, new InternalLoadReferrerCallback<LdLibraryTypeLookup, String, LdLibraryCB, LdLibrary>() {
            public String getPKVal(LdLibraryTypeLookup e)
            { return e.getLibraryTypeCode(); }
            public void setRfLs(LdLibraryTypeLookup e, List<LdLibrary> ls)
            { e.setLibraryList(ls); }
            public LdLibraryCB newMyCB() { return referrerBhv.newMyConditionBean(); }
            public void qyFKIn(LdLibraryCB cb, List<String> ls)
            { cb.query().setLibraryTypeCode_InScope(ls); }
            public void qyOdFKAsc(LdLibraryCB cb) { cb.query().addOrderBy_LibraryTypeCode_Asc(); }
            public void spFKCol(LdLibraryCB cb) { cb.specify().columnLibraryTypeCode(); }
            public List<LdLibrary> selRfLs(LdLibraryCB cb) { return referrerBhv.selectList(cb); }
            public String getFKVal(LdLibrary e) { return e.getLibraryTypeCode(); }
            public void setlcEt(LdLibrary re, LdLibraryTypeLookup le)
            { re.setLibraryTypeLookup(le); }
            public String getRfPrNm() { return "libraryList"; }
        });
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key libraryTypeCode.
     * @param libraryTypeLookupList The list of libraryTypeLookup. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<String> extractLibraryTypeCodeList(List<LdLibraryTypeLookup> libraryTypeLookupList) {
        return helpExtractListInternally(libraryTypeLookupList, new InternalExtractCallback<LdLibraryTypeLookup, String>() {
            public String getCV(LdLibraryTypeLookup e) { return e.getLibraryTypeCode(); }
        });
    }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * LdLibraryTypeLookup libraryTypeLookup = new LdLibraryTypeLookup();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * libraryTypeLookup.setFoo...(value);
     * libraryTypeLookup.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//libraryTypeLookup.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//libraryTypeLookup.set...;</span>
     * libraryTypeLookupBhv.<span style="color: #FD4747">insert</span>(libraryTypeLookup);
     * ... = libraryTypeLookup.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param libraryTypeLookup The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(LdLibraryTypeLookup libraryTypeLookup) {
        doInsert(libraryTypeLookup, null);
    }

    protected void doInsert(LdLibraryTypeLookup libraryTypeLookup, InsertOption<LdLibraryTypeLookupCB> option) {
        assertObjectNotNull("libraryTypeLookup", libraryTypeLookup);
        prepareInsertOption(option);
        delegateInsert(libraryTypeLookup, option);
    }

    protected void prepareInsertOption(InsertOption<LdLibraryTypeLookupCB> option) {
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
     * LdLibraryTypeLookup libraryTypeLookup = new LdLibraryTypeLookup();
     * libraryTypeLookup.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * libraryTypeLookup.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//libraryTypeLookup.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//libraryTypeLookup.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * libraryTypeLookup.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     libraryTypeLookupBhv.<span style="color: #FD4747">update</span>(libraryTypeLookup);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * } 
     * </pre>
     * @param libraryTypeLookup The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(final LdLibraryTypeLookup libraryTypeLookup) {
        doUpdate(libraryTypeLookup, null);
    }

    protected void doUpdate(LdLibraryTypeLookup libraryTypeLookup, final UpdateOption<LdLibraryTypeLookupCB> option) {
        assertObjectNotNull("libraryTypeLookup", libraryTypeLookup);
        prepareUpdateOption(option);
        helpUpdateInternally(libraryTypeLookup, new InternalUpdateCallback<LdLibraryTypeLookup>() {
            public int callbackDelegateUpdate(LdLibraryTypeLookup entity) { return delegateUpdate(entity, option); } });
    }

    protected void prepareUpdateOption(UpdateOption<LdLibraryTypeLookupCB> option) {
        if (option == null) { return; }
        assertUpdateOptionStatus(option);
        if (option.hasSelfSpecification()) {
            option.resolveSelfSpecification(createCBForVaryingUpdate());
        }
        if (option.hasSpecifiedUpdateColumn()) {
            option.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    protected LdLibraryTypeLookupCB createCBForVaryingUpdate() {
        LdLibraryTypeLookupCB cb = newMyConditionBean();
        cb.xsetupForVaryingUpdate();
        return cb;
    }

    protected LdLibraryTypeLookupCB createCBForSpecifiedUpdate() {
        LdLibraryTypeLookupCB cb = newMyConditionBean();
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
     * LdLibraryTypeLookup libraryTypeLookup = new LdLibraryTypeLookup();
     * libraryTypeLookup.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * libraryTypeLookup.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//libraryTypeLookup.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//libraryTypeLookup.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//libraryTypeLookup.setVersionNo(value);</span>
     * libraryTypeLookupBhv.<span style="color: #FD4747">updateNonstrict</span>(libraryTypeLookup);
     * </pre>
     * @param libraryTypeLookup The entity of update target. (NotNull, PrimaryKeyNotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void updateNonstrict(final LdLibraryTypeLookup libraryTypeLookup) {
        doUpdateNonstrict(libraryTypeLookup, null);
    }

    protected void doUpdateNonstrict(LdLibraryTypeLookup libraryTypeLookup, final UpdateOption<LdLibraryTypeLookupCB> option) {
        assertObjectNotNull("libraryTypeLookup", libraryTypeLookup);
        prepareUpdateOption(option);
        helpUpdateNonstrictInternally(libraryTypeLookup, new InternalUpdateNonstrictCallback<LdLibraryTypeLookup>() {
            public int callbackDelegateUpdateNonstrict(LdLibraryTypeLookup entity) { return delegateUpdateNonstrict(entity, option); } });
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
     * @param libraryTypeLookup The entity of insert or update target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(LdLibraryTypeLookup libraryTypeLookup) {
        doInesrtOrUpdate(libraryTypeLookup, null, null);
    }

    protected void doInesrtOrUpdate(LdLibraryTypeLookup libraryTypeLookup, final InsertOption<LdLibraryTypeLookupCB> insertOption, final UpdateOption<LdLibraryTypeLookupCB> updateOption) {
        helpInsertOrUpdateInternally(libraryTypeLookup, new InternalInsertOrUpdateCallback<LdLibraryTypeLookup, LdLibraryTypeLookupCB>() {
            public void callbackInsert(LdLibraryTypeLookup entity) { doInsert(entity, insertOption); }
            public void callbackUpdate(LdLibraryTypeLookup entity) { doUpdate(entity, updateOption); }
            public LdLibraryTypeLookupCB callbackNewMyConditionBean() { return newMyConditionBean(); }
            public int callbackSelectCount(LdLibraryTypeLookupCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrModify(Entity entity, InsertOption<? extends ConditionBean> insertOption,
            UpdateOption<? extends ConditionBean> updateOption) {
        if (insertOption == null && updateOption == null) { insertOrUpdate(downcast(entity)); }
        else {
            insertOption = insertOption == null ? new InsertOption<LdLibraryTypeLookupCB>() : insertOption;
            updateOption = updateOption == null ? new UpdateOption<LdLibraryTypeLookupCB>() : updateOption;
            varyingInsertOrUpdate(downcast(entity), downcast(insertOption), downcast(updateOption));
        }
    }

    /**
     * Insert or update the entity non-strictly modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br />
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() }
     * <p><span style="color: #FD4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param libraryTypeLookup The entity of insert or update target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdateNonstrict(LdLibraryTypeLookup libraryTypeLookup) {
        doInesrtOrUpdateNonstrict(libraryTypeLookup, null, null);
    }

    protected void doInesrtOrUpdateNonstrict(LdLibraryTypeLookup libraryTypeLookup, final InsertOption<LdLibraryTypeLookupCB> insertOption, final UpdateOption<LdLibraryTypeLookupCB> updateOption) {
        helpInsertOrUpdateInternally(libraryTypeLookup, new InternalInsertOrUpdateNonstrictCallback<LdLibraryTypeLookup>() {
            public void callbackInsert(LdLibraryTypeLookup entity) { doInsert(entity, insertOption); }
            public void callbackUpdateNonstrict(LdLibraryTypeLookup entity) { doUpdateNonstrict(entity, updateOption); }
        });
    }

    @Override
    protected void doCreateOrModifyNonstrict(Entity entity, InsertOption<? extends ConditionBean> insertOption,
            UpdateOption<? extends ConditionBean> updateOption) {
        if (insertOption == null && updateOption == null) { insertOrUpdateNonstrict(downcast(entity)); }
        else {
            insertOption = insertOption == null ? new InsertOption<LdLibraryTypeLookupCB>() : insertOption;
            updateOption = updateOption == null ? new UpdateOption<LdLibraryTypeLookupCB>() : updateOption;
            varyingInsertOrUpdateNonstrict(downcast(entity), downcast(insertOption), downcast(updateOption));
        }
    }

    /**
     * Delete the entity. (ZeroUpdateException, ExclusiveControl)
     * <pre>
     * LdLibraryTypeLookup libraryTypeLookup = new LdLibraryTypeLookup();
     * libraryTypeLookup.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * libraryTypeLookup.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     libraryTypeLookupBhv.<span style="color: #FD4747">delete</span>(libraryTypeLookup);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * } 
     * </pre>
     * @param libraryTypeLookup The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(LdLibraryTypeLookup libraryTypeLookup) {
        doDelete(libraryTypeLookup, null);
    }

    protected void doDelete(LdLibraryTypeLookup libraryTypeLookup, final DeleteOption<LdLibraryTypeLookupCB> option) {
        assertObjectNotNull("libraryTypeLookup", libraryTypeLookup);
        prepareDeleteOption(option);
        helpDeleteInternally(libraryTypeLookup, new InternalDeleteCallback<LdLibraryTypeLookup>() {
            public int callbackDelegateDelete(LdLibraryTypeLookup entity) { return delegateDelete(entity, option); } });
    }

    protected void prepareDeleteOption(DeleteOption<LdLibraryTypeLookupCB> option) {
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
     * LdLibraryTypeLookup libraryTypeLookup = new LdLibraryTypeLookup();
     * libraryTypeLookup.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//libraryTypeLookup.setVersionNo(value);</span>
     * libraryTypeLookupBhv.<span style="color: #FD4747">deleteNonstrict</span>(libraryTypeLookup);
     * </pre>
     * @param libraryTypeLookup The entity of delete target. (NotNull, PrimaryKeyNotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrict(LdLibraryTypeLookup libraryTypeLookup) {
        doDeleteNonstrict(libraryTypeLookup, null);
    }

    protected void doDeleteNonstrict(LdLibraryTypeLookup libraryTypeLookup, final DeleteOption<LdLibraryTypeLookupCB> option) {
        assertObjectNotNull("libraryTypeLookup", libraryTypeLookup);
        prepareDeleteOption(option);
        helpDeleteNonstrictInternally(libraryTypeLookup, new InternalDeleteNonstrictCallback<LdLibraryTypeLookup>() {
            public int callbackDelegateDeleteNonstrict(LdLibraryTypeLookup entity) { return delegateDeleteNonstrict(entity, option); } });
    }

    /**
     * Delete the entity non-strictly ignoring deleted. {ZeroUpdateException, NonExclusiveControl}
     * <pre>
     * LdLibraryTypeLookup libraryTypeLookup = new LdLibraryTypeLookup();
     * libraryTypeLookup.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//libraryTypeLookup.setVersionNo(value);</span>
     * libraryTypeLookupBhv.<span style="color: #FD4747">deleteNonstrictIgnoreDeleted</span>(libraryTypeLookup);
     * <span style="color: #3F7E5E">// if the target entity doesn't exist, no exception</span>
     * </pre>
     * @param libraryTypeLookup The entity of delete target. (NotNull, PrimaryKeyNotNull)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrictIgnoreDeleted(LdLibraryTypeLookup libraryTypeLookup) {
        doDeleteNonstrictIgnoreDeleted(libraryTypeLookup, null);
    }

    protected void doDeleteNonstrictIgnoreDeleted(LdLibraryTypeLookup libraryTypeLookup, final DeleteOption<LdLibraryTypeLookupCB> option) {
        assertObjectNotNull("libraryTypeLookup", libraryTypeLookup);
        prepareDeleteOption(option);
        helpDeleteNonstrictIgnoreDeletedInternally(libraryTypeLookup, new InternalDeleteNonstrictIgnoreDeletedCallback<LdLibraryTypeLookup>() {
            public int callbackDelegateDeleteNonstrict(LdLibraryTypeLookup entity) { return delegateDeleteNonstrict(entity, option); } });
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
     *     LdLibraryTypeLookup libraryTypeLookup = new LdLibraryTypeLookup();
     *     libraryTypeLookup.setFooName("foo");
     *     if (...) {
     *         libraryTypeLookup.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     libraryTypeLookupList.add(libraryTypeLookup);
     * }
     * libraryTypeLookupBhv.<span style="color: #FD4747">batchInsert</span>(libraryTypeLookupList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param libraryTypeLookupList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<LdLibraryTypeLookup> libraryTypeLookupList) {
        InsertOption<LdLibraryTypeLookupCB> option = createInsertUpdateOption();
        return doBatchInsert(libraryTypeLookupList, option);
    }

    protected int[] doBatchInsert(List<LdLibraryTypeLookup> libraryTypeLookupList, InsertOption<LdLibraryTypeLookupCB> option) {
        assertObjectNotNull("libraryTypeLookupList", libraryTypeLookupList);
        prepareBatchInsertOption(libraryTypeLookupList, option);
        return delegateBatchInsert(libraryTypeLookupList, option);
    }

    protected void prepareBatchInsertOption(List<LdLibraryTypeLookup> libraryTypeLookupList, InsertOption<LdLibraryTypeLookupCB> option) {
        option.xallowInsertColumnModifiedPropertiesFragmented();
        option.xacceptInsertColumnModifiedPropertiesIfNeeds(libraryTypeLookupList);
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
     *     LdLibraryTypeLookup libraryTypeLookup = new LdLibraryTypeLookup();
     *     libraryTypeLookup.setFooName("foo");
     *     if (...) {
     *         libraryTypeLookup.setFooPrice(123);
     *     } else {
     *         libraryTypeLookup.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//libraryTypeLookup.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     libraryTypeLookupList.add(libraryTypeLookup);
     * }
     * libraryTypeLookupBhv.<span style="color: #FD4747">batchUpdate</span>(libraryTypeLookupList);
     * </pre>
     * @param libraryTypeLookupList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<LdLibraryTypeLookup> libraryTypeLookupList) {
        UpdateOption<LdLibraryTypeLookupCB> option = createPlainUpdateOption();
        return doBatchUpdate(libraryTypeLookupList, option);
    }

    protected int[] doBatchUpdate(List<LdLibraryTypeLookup> libraryTypeLookupList, UpdateOption<LdLibraryTypeLookupCB> option) {
        assertObjectNotNull("libraryTypeLookupList", libraryTypeLookupList);
        prepareBatchUpdateOption(libraryTypeLookupList, option);
        return delegateBatchUpdate(libraryTypeLookupList, option);
    }

    protected void prepareBatchUpdateOption(List<LdLibraryTypeLookup> libraryTypeLookupList, UpdateOption<LdLibraryTypeLookupCB> option) {
        option.xacceptUpdateColumnModifiedPropertiesIfNeeds(libraryTypeLookupList);
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
     * libraryTypeLookupBhv.<span style="color: #FD4747">batchUpdate</span>(libraryTypeLookupList, new SpecifyQuery<LdLibraryTypeLookupCB>() {
     *     public void specify(LdLibraryTypeLookupCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #FD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #FD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span> 
     * libraryTypeLookupBhv.<span style="color: #FD4747">batchUpdate</span>(libraryTypeLookupList, new SpecifyQuery<LdLibraryTypeLookupCB>() {
     *     public void specify(LdLibraryTypeLookupCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #FD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param libraryTypeLookupList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<LdLibraryTypeLookup> libraryTypeLookupList, SpecifyQuery<LdLibraryTypeLookupCB> updateColumnSpec) {
        return doBatchUpdate(libraryTypeLookupList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    /**
     * Batch-update the entity list non-strictly modified-only of same-set columns. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <span style="color: #FD4747; font-size: 140%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     LdLibraryTypeLookup libraryTypeLookup = new LdLibraryTypeLookup();
     *     libraryTypeLookup.setFooName("foo");
     *     if (...) {
     *         libraryTypeLookup.setFooPrice(123);
     *     } else {
     *         libraryTypeLookup.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//libraryTypeLookup.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     libraryTypeLookupList.add(libraryTypeLookup);
     * }
     * libraryTypeLookupBhv.<span style="color: #FD4747">batchUpdate</span>(libraryTypeLookupList);
     * </pre>
     * @param libraryTypeLookupList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<LdLibraryTypeLookup> libraryTypeLookupList) {
        UpdateOption<LdLibraryTypeLookupCB> option = createPlainUpdateOption();
        return doBatchUpdateNonstrict(libraryTypeLookupList, option);
    }

    protected int[] doBatchUpdateNonstrict(List<LdLibraryTypeLookup> libraryTypeLookupList, UpdateOption<LdLibraryTypeLookupCB> option) {
        assertObjectNotNull("libraryTypeLookupList", libraryTypeLookupList);
        prepareBatchUpdateOption(libraryTypeLookupList, option);
        return delegateBatchUpdateNonstrict(libraryTypeLookupList, option);
    }

    /**
     * Batch-update the entity list non-strictly specified-only. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span> 
     * libraryTypeLookupBhv.<span style="color: #FD4747">batchUpdateNonstrict</span>(libraryTypeLookupList, new SpecifyQuery<LdLibraryTypeLookupCB>() {
     *     public void specify(LdLibraryTypeLookupCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #FD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #FD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span> 
     * libraryTypeLookupBhv.<span style="color: #FD4747">batchUpdateNonstrict</span>(libraryTypeLookupList, new SpecifyQuery<LdLibraryTypeLookupCB>() {
     *     public void specify(LdLibraryTypeLookupCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #FD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).</p>
     * @param libraryTypeLookupList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<LdLibraryTypeLookup> libraryTypeLookupList, SpecifyQuery<LdLibraryTypeLookupCB> updateColumnSpec) {
        return doBatchUpdateNonstrict(libraryTypeLookupList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> option) {
        if (option == null) { return batchUpdateNonstrict(downcast(ls)); }
        else { return varyingBatchUpdateNonstrict(downcast(ls), downcast(option)); }
    }

    /**
     * Batch-delete the entity list. (ExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param libraryTypeLookupList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchDelete(List<LdLibraryTypeLookup> libraryTypeLookupList) {
        return doBatchDelete(libraryTypeLookupList, null);
    }

    protected int[] doBatchDelete(List<LdLibraryTypeLookup> libraryTypeLookupList, DeleteOption<LdLibraryTypeLookupCB> option) {
        assertObjectNotNull("libraryTypeLookupList", libraryTypeLookupList);
        prepareDeleteOption(option);
        return delegateBatchDelete(libraryTypeLookupList, option);
    }

    @Override
    protected int[] doLumpRemove(List<Entity> ls, DeleteOption<? extends ConditionBean> option) {
        if (option == null) { return batchDelete(downcast(ls)); }
        else { return varyingBatchDelete(downcast(ls), downcast(option)); }
    }

    /**
     * Batch-delete the entity list non-strictly. {NonExclusiveControl} <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param libraryTypeLookupList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDeleteNonstrict(List<LdLibraryTypeLookup> libraryTypeLookupList) {
        return doBatchDeleteNonstrict(libraryTypeLookupList, null);
    }

    protected int[] doBatchDeleteNonstrict(List<LdLibraryTypeLookup> libraryTypeLookupList, DeleteOption<LdLibraryTypeLookupCB> option) {
        assertObjectNotNull("libraryTypeLookupList", libraryTypeLookupList);
        prepareDeleteOption(option);
        return delegateBatchDeleteNonstrict(libraryTypeLookupList, option);
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
     * libraryTypeLookupBhv.<span style="color: #FD4747">queryInsert</span>(new QueryInsertSetupper&lt;LdLibraryTypeLookup, LdLibraryTypeLookupCB&gt;() {
     *     public ConditionBean setup(libraryTypeLookup entity, LdLibraryTypeLookupCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<LdLibraryTypeLookup, LdLibraryTypeLookupCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(QueryInsertSetupper<LdLibraryTypeLookup, LdLibraryTypeLookupCB> setupper, InsertOption<LdLibraryTypeLookupCB> option) {
        assertObjectNotNull("setupper", setupper);
        prepareInsertOption(option);
        LdLibraryTypeLookup entity = new LdLibraryTypeLookup();
        LdLibraryTypeLookupCB intoCB = createCBForQueryInsert();
        ConditionBean resourceCB = setupper.setup(entity, intoCB);
        return delegateQueryInsert(entity, intoCB, resourceCB, option);
    }

    protected LdLibraryTypeLookupCB createCBForQueryInsert() {
        LdLibraryTypeLookupCB cb = newMyConditionBean();
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
     * LdLibraryTypeLookup libraryTypeLookup = new LdLibraryTypeLookup();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//libraryTypeLookup.setPK...(value);</span>
     * libraryTypeLookup.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//libraryTypeLookup.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//libraryTypeLookup.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//libraryTypeLookup.setVersionNo(value);</span>
     * LdLibraryTypeLookupCB cb = new LdLibraryTypeLookupCB();
     * cb.query().setFoo...(value);
     * libraryTypeLookupBhv.<span style="color: #FD4747">queryUpdate</span>(libraryTypeLookup, cb);
     * </pre>
     * @param libraryTypeLookup The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of LdLibraryTypeLookup. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(LdLibraryTypeLookup libraryTypeLookup, LdLibraryTypeLookupCB cb) {
        return doQueryUpdate(libraryTypeLookup, cb, null);
    }

    protected int doQueryUpdate(LdLibraryTypeLookup libraryTypeLookup, LdLibraryTypeLookupCB cb, UpdateOption<LdLibraryTypeLookupCB> option) {
        assertObjectNotNull("libraryTypeLookup", libraryTypeLookup); assertCBStateValid(cb);
        prepareUpdateOption(option);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryUpdate(libraryTypeLookup, cb, option) : 0;
    }

    @Override
    protected int doRangeModify(Entity entity, ConditionBean cb, UpdateOption<? extends ConditionBean> option) {
        if (option == null) { return queryUpdate(downcast(entity), (LdLibraryTypeLookupCB)cb); }
        else { return varyingQueryUpdate(downcast(entity), (LdLibraryTypeLookupCB)cb, downcast(option)); }
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * LdLibraryTypeLookupCB cb = new LdLibraryTypeLookupCB();
     * cb.query().setFoo...(value);
     * libraryTypeLookupBhv.<span style="color: #FD4747">queryDelete</span>(libraryTypeLookup, cb);
     * </pre>
     * @param cb The condition-bean of LdLibraryTypeLookup. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(LdLibraryTypeLookupCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(LdLibraryTypeLookupCB cb, DeleteOption<LdLibraryTypeLookupCB> option) {
        assertCBStateValid(cb);
        prepareDeleteOption(option);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryDelete(cb, option) : 0;
    }

    @Override
    protected int doRangeRemove(ConditionBean cb, DeleteOption<? extends ConditionBean> option) {
        if (option == null) { return queryDelete((LdLibraryTypeLookupCB)cb); }
        else { return varyingQueryDelete((LdLibraryTypeLookupCB)cb, downcast(option)); }
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
     * LdLibraryTypeLookup libraryTypeLookup = new LdLibraryTypeLookup();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * libraryTypeLookup.setFoo...(value);
     * libraryTypeLookup.setBar...(value);
     * InsertOption<LdLibraryTypeLookupCB> option = new InsertOption<LdLibraryTypeLookupCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * libraryTypeLookupBhv.<span style="color: #FD4747">varyingInsert</span>(libraryTypeLookup, option);
     * ... = libraryTypeLookup.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param libraryTypeLookup The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(LdLibraryTypeLookup libraryTypeLookup, InsertOption<LdLibraryTypeLookupCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(libraryTypeLookup, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, ExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * LdLibraryTypeLookup libraryTypeLookup = new LdLibraryTypeLookup();
     * libraryTypeLookup.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * libraryTypeLookup.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * libraryTypeLookup.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;LdLibraryTypeLookupCB&gt; option = new UpdateOption&lt;LdLibraryTypeLookupCB&gt;();
     *     option.self(new SpecifyQuery&lt;LdLibraryTypeLookupCB&gt;() {
     *         public void specify(LdLibraryTypeLookupCB cb) {
     *             cb.specify().<span style="color: #FD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     libraryTypeLookupBhv.<span style="color: #FD4747">varyingUpdate</span>(libraryTypeLookup, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param libraryTypeLookup The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(LdLibraryTypeLookup libraryTypeLookup, UpdateOption<LdLibraryTypeLookupCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(libraryTypeLookup, option);
    }

    /**
     * Update the entity with varying requests non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as updateNonstrict(entity).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * LdLibraryTypeLookup libraryTypeLookup = new LdLibraryTypeLookup();
     * libraryTypeLookup.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * libraryTypeLookup.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//libraryTypeLookup.setVersionNo(value);</span>
     * UpdateOption&lt;LdLibraryTypeLookupCB&gt; option = new UpdateOption&lt;LdLibraryTypeLookupCB&gt;();
     * option.self(new SpecifyQuery&lt;LdLibraryTypeLookupCB&gt;() {
     *     public void specify(LdLibraryTypeLookupCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * libraryTypeLookupBhv.<span style="color: #FD4747">varyingUpdateNonstrict</span>(libraryTypeLookup, option);
     * </pre>
     * @param libraryTypeLookup The entity of update target. (NotNull, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdateNonstrict(LdLibraryTypeLookup libraryTypeLookup, UpdateOption<LdLibraryTypeLookupCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdateNonstrict(libraryTypeLookup, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param libraryTypeLookup The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(LdLibraryTypeLookup libraryTypeLookup, InsertOption<LdLibraryTypeLookupCB> insertOption, UpdateOption<LdLibraryTypeLookupCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdate(libraryTypeLookup, insertOption, updateOption);
    }

    /**
     * Insert or update the entity with varying requests non-strictly. (NonExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdateNonstrict(entity).
     * @param libraryTypeLookup The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdateNonstrict(LdLibraryTypeLookup libraryTypeLookup, InsertOption<LdLibraryTypeLookupCB> insertOption, UpdateOption<LdLibraryTypeLookupCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdateNonstrict(libraryTypeLookup, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, ExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param libraryTypeLookup The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(LdLibraryTypeLookup libraryTypeLookup, DeleteOption<LdLibraryTypeLookupCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(libraryTypeLookup, option);
    }

    /**
     * Delete the entity with varying requests non-strictly. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as deleteNonstrict(entity).
     * @param libraryTypeLookup The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDeleteNonstrict(LdLibraryTypeLookup libraryTypeLookup, DeleteOption<LdLibraryTypeLookupCB> option) {
        assertDeleteOptionNotNull(option);
        doDeleteNonstrict(libraryTypeLookup, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param libraryTypeLookupList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<LdLibraryTypeLookup> libraryTypeLookupList, InsertOption<LdLibraryTypeLookupCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(libraryTypeLookupList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param libraryTypeLookupList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<LdLibraryTypeLookup> libraryTypeLookupList, UpdateOption<LdLibraryTypeLookupCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(libraryTypeLookupList, option);
    }

    /**
     * Batch-update the list with varying requests non-strictly. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param libraryTypeLookupList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdateNonstrict(List<LdLibraryTypeLookup> libraryTypeLookupList, UpdateOption<LdLibraryTypeLookupCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdateNonstrict(libraryTypeLookupList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param libraryTypeLookupList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<LdLibraryTypeLookup> libraryTypeLookupList, DeleteOption<LdLibraryTypeLookupCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(libraryTypeLookupList, option);
    }

    /**
     * Batch-delete the list with varying requests non-strictly. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDeleteNonstrict(entityList).
     * @param libraryTypeLookupList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDeleteNonstrict(List<LdLibraryTypeLookup> libraryTypeLookupList, DeleteOption<LdLibraryTypeLookupCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDeleteNonstrict(libraryTypeLookupList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<LdLibraryTypeLookup, LdLibraryTypeLookupCB> setupper, InsertOption<LdLibraryTypeLookupCB> option) {
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
     * LdLibraryTypeLookup libraryTypeLookup = new LdLibraryTypeLookup();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//libraryTypeLookup.setPK...(value);</span>
     * libraryTypeLookup.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//libraryTypeLookup.setVersionNo(value);</span>
     * LdLibraryTypeLookupCB cb = new LdLibraryTypeLookupCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;LdLibraryTypeLookupCB&gt; option = new UpdateOption&lt;LdLibraryTypeLookupCB&gt;();
     * option.self(new SpecifyQuery&lt;LdLibraryTypeLookupCB&gt;() {
     *     public void specify(LdLibraryTypeLookupCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * libraryTypeLookupBhv.<span style="color: #FD4747">varyingQueryUpdate</span>(libraryTypeLookup, cb, option);
     * </pre>
     * @param libraryTypeLookup The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of LdLibraryTypeLookup. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(LdLibraryTypeLookup libraryTypeLookup, LdLibraryTypeLookupCB cb, UpdateOption<LdLibraryTypeLookupCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(libraryTypeLookup, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of LdLibraryTypeLookup. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(LdLibraryTypeLookupCB cb, DeleteOption<LdLibraryTypeLookupCB> option) {
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
    public OutsideSqlBasicExecutor<LdLibraryTypeLookupBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCountUniquely(LdLibraryTypeLookupCB cb) { return invoke(createSelectCountCBCommand(cb, true)); }
    protected int delegateSelectCountPlainly(LdLibraryTypeLookupCB cb) { return invoke(createSelectCountCBCommand(cb, false)); }
    protected <ENTITY extends LdLibraryTypeLookup> void delegateSelectCursor(LdLibraryTypeLookupCB cb, EntityRowHandler<ENTITY> erh, Class<ENTITY> et)
    { invoke(createSelectCursorCBCommand(cb, erh, et)); }
    protected <ENTITY extends LdLibraryTypeLookup> List<ENTITY> delegateSelectList(LdLibraryTypeLookupCB cb, Class<ENTITY> et)
    { return invoke(createSelectListCBCommand(cb, et)); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(LdLibraryTypeLookup e, InsertOption<LdLibraryTypeLookupCB> op)
    { if (!processBeforeInsert(e, op)) { return 0; }
      return invoke(createInsertEntityCommand(e, op)); }
    protected int delegateUpdate(LdLibraryTypeLookup e, UpdateOption<LdLibraryTypeLookupCB> op)
    { if (!processBeforeUpdate(e, op)) { return 0; }
      return invoke(createUpdateEntityCommand(e, op)); }
    protected int delegateUpdateNonstrict(LdLibraryTypeLookup e, UpdateOption<LdLibraryTypeLookupCB> op)
    { if (!processBeforeUpdate(e, op)) { return 0; }
      return invoke(createUpdateNonstrictEntityCommand(e, op)); }
    protected int delegateDelete(LdLibraryTypeLookup e, DeleteOption<LdLibraryTypeLookupCB> op)
    { if (!processBeforeDelete(e, op)) { return 0; }
      return invoke(createDeleteEntityCommand(e, op)); }
    protected int delegateDeleteNonstrict(LdLibraryTypeLookup e, DeleteOption<LdLibraryTypeLookupCB> op)
    { if (!processBeforeDelete(e, op)) { return 0; }
      return invoke(createDeleteNonstrictEntityCommand(e, op)); }

    protected int[] delegateBatchInsert(List<LdLibraryTypeLookup> ls, InsertOption<LdLibraryTypeLookupCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchInsertCommand(processBatchInternally(ls, op), op)); }
    protected int[] delegateBatchUpdate(List<LdLibraryTypeLookup> ls, UpdateOption<LdLibraryTypeLookupCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateCommand(processBatchInternally(ls, op, false), op)); }
    protected int[] delegateBatchUpdateNonstrict(List<LdLibraryTypeLookup> ls, UpdateOption<LdLibraryTypeLookupCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateNonstrictCommand(processBatchInternally(ls, op, true), op)); }
    protected int[] delegateBatchDelete(List<LdLibraryTypeLookup> ls, DeleteOption<LdLibraryTypeLookupCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteCommand(processBatchInternally(ls, op, false), op)); }
    protected int[] delegateBatchDeleteNonstrict(List<LdLibraryTypeLookup> ls, DeleteOption<LdLibraryTypeLookupCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteNonstrictCommand(processBatchInternally(ls, op, true), op)); }

    protected int delegateQueryInsert(LdLibraryTypeLookup e, LdLibraryTypeLookupCB inCB, ConditionBean resCB, InsertOption<LdLibraryTypeLookupCB> op)
    { if (!processBeforeQueryInsert(e, inCB, resCB, op)) { return 0; } return invoke(createQueryInsertCBCommand(e, inCB, resCB, op));  }
    protected int delegateQueryUpdate(LdLibraryTypeLookup e, LdLibraryTypeLookupCB cb, UpdateOption<LdLibraryTypeLookupCB> op)
    { if (!processBeforeQueryUpdate(e, cb, op)) { return 0; } return invoke(createQueryUpdateCBCommand(e, cb, op));  }
    protected int delegateQueryDelete(LdLibraryTypeLookupCB cb, DeleteOption<LdLibraryTypeLookupCB> op)
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
    protected LdLibraryTypeLookup downcast(Entity entity) {
        return helpEntityDowncastInternally(entity, LdLibraryTypeLookup.class);
    }

    protected LdLibraryTypeLookupCB downcast(ConditionBean cb) {
        return helpConditionBeanDowncastInternally(cb, LdLibraryTypeLookupCB.class);
    }

    @SuppressWarnings("unchecked")
    protected List<LdLibraryTypeLookup> downcast(List<? extends Entity> entityList) {
        return (List<LdLibraryTypeLookup>)entityList;
    }

    @SuppressWarnings("unchecked")
    protected InsertOption<LdLibraryTypeLookupCB> downcast(InsertOption<? extends ConditionBean> option) {
        return (InsertOption<LdLibraryTypeLookupCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected UpdateOption<LdLibraryTypeLookupCB> downcast(UpdateOption<? extends ConditionBean> option) {
        return (UpdateOption<LdLibraryTypeLookupCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected DeleteOption<LdLibraryTypeLookupCB> downcast(DeleteOption<? extends ConditionBean> option) {
        return (DeleteOption<LdLibraryTypeLookupCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<LdLibraryTypeLookup, LdLibraryTypeLookupCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> option) {
        return (QueryInsertSetupper<LdLibraryTypeLookup, LdLibraryTypeLookupCB>)option;
    }
}
