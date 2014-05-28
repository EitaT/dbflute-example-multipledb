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
 * The behavior of VENDOR_CONSTRAINT_NAME_AUTO_REF as TABLE. <br />
 * <pre>
 * [primary key]
 *     CONSTRAINT_NAME_AUTO_REF_ID
 *
 * [column]
 *     CONSTRAINT_NAME_AUTO_REF_ID, CONSTRAINT_NAME_AUTO_FOO_ID, CONSTRAINT_NAME_AUTO_BAR_ID, CONSTRAINT_NAME_AUTO_QUX_ID, CONSTRAINT_NAME_AUTO_UNIQUE
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
 *     VENDOR_CONSTRAINT_NAME_AUTO_FOO, VENDOR_CONSTRAINT_NAME_AUTO_BAR, VENDOR_CONSTRAINT_NAME_AUTO_QUX
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     vendorConstraintNameAutoFoo, vendorConstraintNameAutoBar, vendorConstraintNameAutoQux
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class LdBsVendorConstraintNameAutoRefBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "VENDOR_CONSTRAINT_NAME_AUTO_REF"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public DBMeta getDBMeta() { return LdVendorConstraintNameAutoRefDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public LdVendorConstraintNameAutoRefDbm getMyDBMeta() { return LdVendorConstraintNameAutoRefDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public Entity newEntity() { return newMyEntity(); }

    /** {@inheritDoc} */
    public ConditionBean newConditionBean() { return newMyConditionBean(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public LdVendorConstraintNameAutoRef newMyEntity() { return new LdVendorConstraintNameAutoRef(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public LdVendorConstraintNameAutoRefCB newMyConditionBean() { return new LdVendorConstraintNameAutoRefCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * LdVendorConstraintNameAutoRefCB cb = new LdVendorConstraintNameAutoRefCB();
     * cb.query().setFoo...(value);
     * int count = vendorConstraintNameAutoRefBhv.<span style="color: #DD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of LdVendorConstraintNameAutoRef. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(LdVendorConstraintNameAutoRefCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(LdVendorConstraintNameAutoRefCB cb) { // called by selectCount(cb)
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(LdVendorConstraintNameAutoRefCB cb) { // called by selectPage(cb)
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
     * LdVendorConstraintNameAutoRefCB cb = new LdVendorConstraintNameAutoRefCB();
     * cb.query().setFoo...(value);
     * LdVendorConstraintNameAutoRef vendorConstraintNameAutoRef = vendorConstraintNameAutoRefBhv.<span style="color: #DD4747">selectEntity</span>(cb);
     * if (vendorConstraintNameAutoRef != null) { <span style="color: #3F7E5E">// null check</span>
     *     ... = vendorConstraintNameAutoRef.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of LdVendorConstraintNameAutoRef. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public LdVendorConstraintNameAutoRef selectEntity(LdVendorConstraintNameAutoRefCB cb) {
        return doSelectEntity(cb, LdVendorConstraintNameAutoRef.class);
    }

    protected <ENTITY extends LdVendorConstraintNameAutoRef> ENTITY doSelectEntity(LdVendorConstraintNameAutoRefCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectEntityInternally(cb, tp, new InternalSelectEntityCallback<ENTITY, LdVendorConstraintNameAutoRefCB>() {
            public List<ENTITY> callbackSelectList(LdVendorConstraintNameAutoRefCB lcb, Class<ENTITY> ltp) { return doSelectList(lcb, ltp); } });
    }

    protected <ENTITY extends LdVendorConstraintNameAutoRef> OptionalEntity<ENTITY> doSelectOptionalEntity(LdVendorConstraintNameAutoRefCB cb, Class<ENTITY> tp) {
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
     * LdVendorConstraintNameAutoRefCB cb = new LdVendorConstraintNameAutoRefCB();
     * cb.query().setFoo...(value);
     * LdVendorConstraintNameAutoRef vendorConstraintNameAutoRef = vendorConstraintNameAutoRefBhv.<span style="color: #DD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = vendorConstraintNameAutoRef.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of LdVendorConstraintNameAutoRef. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public LdVendorConstraintNameAutoRef selectEntityWithDeletedCheck(LdVendorConstraintNameAutoRefCB cb) {
        return doSelectEntityWithDeletedCheck(cb, LdVendorConstraintNameAutoRef.class);
    }

    protected <ENTITY extends LdVendorConstraintNameAutoRef> ENTITY doSelectEntityWithDeletedCheck(LdVendorConstraintNameAutoRefCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectEntityWithDeletedCheckInternally(cb, tp, new InternalSelectEntityWithDeletedCheckCallback<ENTITY, LdVendorConstraintNameAutoRefCB>() {
            public List<ENTITY> callbackSelectList(LdVendorConstraintNameAutoRefCB lcb, Class<ENTITY> ltp) { return doSelectList(lcb, ltp); } });
    }

    @Override
    protected Entity doReadEntityWithDeletedCheck(ConditionBean cb) {
        return selectEntityWithDeletedCheck(downcast(cb));
    }

    /**
     * Select the entity by the primary-key value.
     * @param constraintNameAutoRefId : PK, NotNull, NUMERIC(16). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public LdVendorConstraintNameAutoRef selectByPKValue(java.math.BigDecimal constraintNameAutoRefId) {
        return doSelectByPK(constraintNameAutoRefId, LdVendorConstraintNameAutoRef.class);
    }

    protected <ENTITY extends LdVendorConstraintNameAutoRef> ENTITY doSelectByPK(java.math.BigDecimal constraintNameAutoRefId, Class<ENTITY> entityType) {
        return doSelectEntity(xprepareCBAsPK(constraintNameAutoRefId), entityType);
    }

    protected <ENTITY extends LdVendorConstraintNameAutoRef> OptionalEntity<ENTITY> doSelectOptionalByPK(java.math.BigDecimal constraintNameAutoRefId, Class<ENTITY> entityType) {
        return createOptionalEntity(doSelectByPK(constraintNameAutoRefId, entityType), constraintNameAutoRefId);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param constraintNameAutoRefId : PK, NotNull, NUMERIC(16). (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public LdVendorConstraintNameAutoRef selectByPKValueWithDeletedCheck(java.math.BigDecimal constraintNameAutoRefId) {
        return doSelectByPKWithDeletedCheck(constraintNameAutoRefId, LdVendorConstraintNameAutoRef.class);
    }

    protected <ENTITY extends LdVendorConstraintNameAutoRef> ENTITY doSelectByPKWithDeletedCheck(java.math.BigDecimal constraintNameAutoRefId, Class<ENTITY> entityType) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(constraintNameAutoRefId), entityType);
    }

    protected LdVendorConstraintNameAutoRefCB xprepareCBAsPK(java.math.BigDecimal constraintNameAutoRefId) {
        assertObjectNotNull("constraintNameAutoRefId", constraintNameAutoRefId);
        LdVendorConstraintNameAutoRefCB cb = newMyConditionBean(); cb.acceptPrimaryKey(constraintNameAutoRefId);
        return cb;
    }

    /**
     * Select the entity by the unique-key value.
     * @param constraintNameAutoUnique : UQ, NotNull, VARCHAR(50). (NotNull)
     * @return The optional entity selected by the unique key. (NotNull: if no data, empty entity)
     * @exception EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<LdVendorConstraintNameAutoRef> selectByUniqueOf(String constraintNameAutoUnique) {
        return doSelectByUniqueOf(constraintNameAutoUnique, LdVendorConstraintNameAutoRef.class);
    }

    protected <ENTITY extends LdVendorConstraintNameAutoRef> OptionalEntity<ENTITY> doSelectByUniqueOf(String constraintNameAutoUnique, Class<ENTITY> entityType) {
        return createOptionalEntity(doSelectEntity(xprepareCBAsUniqueOf(constraintNameAutoUnique), entityType), constraintNameAutoUnique);
    }

    protected LdVendorConstraintNameAutoRefCB xprepareCBAsUniqueOf(String constraintNameAutoUnique) {
        assertObjectNotNull("constraintNameAutoUnique", constraintNameAutoUnique);
        LdVendorConstraintNameAutoRefCB cb = newMyConditionBean(); cb.acceptUniqueOf(constraintNameAutoUnique);
        return cb;
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * LdVendorConstraintNameAutoRefCB cb = new LdVendorConstraintNameAutoRefCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;LdVendorConstraintNameAutoRef&gt; vendorConstraintNameAutoRefList = vendorConstraintNameAutoRefBhv.<span style="color: #DD4747">selectList</span>(cb);
     * for (LdVendorConstraintNameAutoRef vendorConstraintNameAutoRef : vendorConstraintNameAutoRefList) {
     *     ... = vendorConstraintNameAutoRef.get...();
     * }
     * </pre>
     * @param cb The condition-bean of LdVendorConstraintNameAutoRef. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<LdVendorConstraintNameAutoRef> selectList(LdVendorConstraintNameAutoRefCB cb) {
        return doSelectList(cb, LdVendorConstraintNameAutoRef.class);
    }

    protected <ENTITY extends LdVendorConstraintNameAutoRef> ListResultBean<ENTITY> doSelectList(LdVendorConstraintNameAutoRefCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        return helpSelectListInternally(cb, tp, new InternalSelectListCallback<ENTITY, LdVendorConstraintNameAutoRefCB>() {
            public List<ENTITY> callbackSelectList(LdVendorConstraintNameAutoRefCB lcb, Class<ENTITY> ltp) { return delegateSelectList(lcb, ltp); } });
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
     * LdVendorConstraintNameAutoRefCB cb = new LdVendorConstraintNameAutoRefCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #DD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;LdVendorConstraintNameAutoRef&gt; page = vendorConstraintNameAutoRefBhv.<span style="color: #DD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (LdVendorConstraintNameAutoRef vendorConstraintNameAutoRef : page) {
     *     ... = vendorConstraintNameAutoRef.get...();
     * }
     * </pre>
     * @param cb The condition-bean of LdVendorConstraintNameAutoRef. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<LdVendorConstraintNameAutoRef> selectPage(LdVendorConstraintNameAutoRefCB cb) {
        return doSelectPage(cb, LdVendorConstraintNameAutoRef.class);
    }

    protected <ENTITY extends LdVendorConstraintNameAutoRef> PagingResultBean<ENTITY> doSelectPage(LdVendorConstraintNameAutoRefCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectPageInternally(cb, tp, new InternalSelectPageCallback<ENTITY, LdVendorConstraintNameAutoRefCB>() {
            public int callbackSelectCount(LdVendorConstraintNameAutoRefCB cb) { return doSelectCountPlainly(cb); }
            public List<ENTITY> callbackSelectList(LdVendorConstraintNameAutoRefCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); }
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
     * LdVendorConstraintNameAutoRefCB cb = new LdVendorConstraintNameAutoRefCB();
     * cb.query().setFoo...(value);
     * vendorConstraintNameAutoRefBhv.<span style="color: #DD4747">selectCursor</span>(cb, new EntityRowHandler&lt;LdVendorConstraintNameAutoRef&gt;() {
     *     public void handle(LdVendorConstraintNameAutoRef entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of LdVendorConstraintNameAutoRef. (NotNull)
     * @param entityRowHandler The handler of entity row of LdVendorConstraintNameAutoRef. (NotNull)
     */
    public void selectCursor(LdVendorConstraintNameAutoRefCB cb, EntityRowHandler<LdVendorConstraintNameAutoRef> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, LdVendorConstraintNameAutoRef.class);
    }

    protected <ENTITY extends LdVendorConstraintNameAutoRef> void doSelectCursor(LdVendorConstraintNameAutoRefCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler", handler); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        helpSelectCursorInternally(cb, handler, tp, new InternalSelectCursorCallback<ENTITY, LdVendorConstraintNameAutoRefCB>() {
            public void callbackSelectCursor(LdVendorConstraintNameAutoRefCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) { delegateSelectCursor(cb, handler, tp); }
            public List<ENTITY> callbackSelectList(LdVendorConstraintNameAutoRefCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); }
        });
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * vendorConstraintNameAutoRefBhv.<span style="color: #DD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(LdVendorConstraintNameAutoRefCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> SLFunction<LdVendorConstraintNameAutoRefCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
    }

    protected <RESULT, CB extends LdVendorConstraintNameAutoRefCB> SLFunction<CB, RESULT> doScalarSelect(Class<RESULT> tp, CB cb) {
        assertObjectNotNull("resultType", tp); assertCBStateValid(cb);
        cb.xsetupForScalarSelect(); cb.getSqlClause().disableSelectIndex(); // for when you use union
        return createSLFunction(cb, tp);
    }

    protected <RESULT, CB extends LdVendorConstraintNameAutoRefCB> SLFunction<CB, RESULT> createSLFunction(CB cb, Class<RESULT> tp) {
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
     * Pull out the list of foreign table 'LdVendorConstraintNameAutoFoo'.
     * @param vendorConstraintNameAutoRefList The list of vendorConstraintNameAutoRef. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<LdVendorConstraintNameAutoFoo> pulloutVendorConstraintNameAutoFoo(List<LdVendorConstraintNameAutoRef> vendorConstraintNameAutoRefList) {
        return helpPulloutInternally(vendorConstraintNameAutoRefList, new InternalPulloutCallback<LdVendorConstraintNameAutoRef, LdVendorConstraintNameAutoFoo>() {
            public LdVendorConstraintNameAutoFoo getFr(LdVendorConstraintNameAutoRef et)
            { return et.getVendorConstraintNameAutoFoo(); }
            public boolean hasRf() { return true; }
            public void setRfLs(LdVendorConstraintNameAutoFoo et, List<LdVendorConstraintNameAutoRef> ls)
            { et.setVendorConstraintNameAutoRefList(ls); }
        });
    }
    /**
     * Pull out the list of foreign table 'LdVendorConstraintNameAutoBar'.
     * @param vendorConstraintNameAutoRefList The list of vendorConstraintNameAutoRef. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<LdVendorConstraintNameAutoBar> pulloutVendorConstraintNameAutoBar(List<LdVendorConstraintNameAutoRef> vendorConstraintNameAutoRefList) {
        return helpPulloutInternally(vendorConstraintNameAutoRefList, new InternalPulloutCallback<LdVendorConstraintNameAutoRef, LdVendorConstraintNameAutoBar>() {
            public LdVendorConstraintNameAutoBar getFr(LdVendorConstraintNameAutoRef et)
            { return et.getVendorConstraintNameAutoBar(); }
            public boolean hasRf() { return true; }
            public void setRfLs(LdVendorConstraintNameAutoBar et, List<LdVendorConstraintNameAutoRef> ls)
            { et.setVendorConstraintNameAutoRefList(ls); }
        });
    }
    /**
     * Pull out the list of foreign table 'LdVendorConstraintNameAutoQux'.
     * @param vendorConstraintNameAutoRefList The list of vendorConstraintNameAutoRef. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<LdVendorConstraintNameAutoQux> pulloutVendorConstraintNameAutoQux(List<LdVendorConstraintNameAutoRef> vendorConstraintNameAutoRefList) {
        return helpPulloutInternally(vendorConstraintNameAutoRefList, new InternalPulloutCallback<LdVendorConstraintNameAutoRef, LdVendorConstraintNameAutoQux>() {
            public LdVendorConstraintNameAutoQux getFr(LdVendorConstraintNameAutoRef et)
            { return et.getVendorConstraintNameAutoQux(); }
            public boolean hasRf() { return true; }
            public void setRfLs(LdVendorConstraintNameAutoQux et, List<LdVendorConstraintNameAutoRef> ls)
            { et.setVendorConstraintNameAutoRefList(ls); }
        });
    }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key constraintNameAutoRefId.
     * @param vendorConstraintNameAutoRefList The list of vendorConstraintNameAutoRef. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<java.math.BigDecimal> extractConstraintNameAutoRefIdList(List<LdVendorConstraintNameAutoRef> vendorConstraintNameAutoRefList) {
        return helpExtractListInternally(vendorConstraintNameAutoRefList, new InternalExtractCallback<LdVendorConstraintNameAutoRef, java.math.BigDecimal>() {
            public java.math.BigDecimal getCV(LdVendorConstraintNameAutoRef et) { return et.getConstraintNameAutoRefId(); }
        });
    }

    /**
     * Extract the value list of (single) unique key constraintNameAutoUnique.
     * @param vendorConstraintNameAutoRefList The list of vendorConstraintNameAutoRef. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<String> extractConstraintNameAutoUniqueList(List<LdVendorConstraintNameAutoRef> vendorConstraintNameAutoRefList) {
        return helpExtractListInternally(vendorConstraintNameAutoRefList, new InternalExtractCallback<LdVendorConstraintNameAutoRef, String>() {
            public String getCV(LdVendorConstraintNameAutoRef et) { return et.getConstraintNameAutoUnique(); }
        });
    }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * LdVendorConstraintNameAutoRef vendorConstraintNameAutoRef = new LdVendorConstraintNameAutoRef();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * vendorConstraintNameAutoRef.setFoo...(value);
     * vendorConstraintNameAutoRef.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//vendorConstraintNameAutoRef.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//vendorConstraintNameAutoRef.set...;</span>
     * vendorConstraintNameAutoRefBhv.<span style="color: #DD4747">insert</span>(vendorConstraintNameAutoRef);
     * ... = vendorConstraintNameAutoRef.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param vendorConstraintNameAutoRef The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(LdVendorConstraintNameAutoRef vendorConstraintNameAutoRef) {
        doInsert(vendorConstraintNameAutoRef, null);
    }

    protected void doInsert(LdVendorConstraintNameAutoRef vendorConstraintNameAutoRef, InsertOption<LdVendorConstraintNameAutoRefCB> op) {
        assertObjectNotNull("vendorConstraintNameAutoRef", vendorConstraintNameAutoRef);
        prepareInsertOption(op);
        delegateInsert(vendorConstraintNameAutoRef, op);
    }

    protected void prepareInsertOption(InsertOption<LdVendorConstraintNameAutoRefCB> op) {
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
     * LdVendorConstraintNameAutoRef vendorConstraintNameAutoRef = new LdVendorConstraintNameAutoRef();
     * vendorConstraintNameAutoRef.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * vendorConstraintNameAutoRef.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//vendorConstraintNameAutoRef.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//vendorConstraintNameAutoRef.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * vendorConstraintNameAutoRef.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     vendorConstraintNameAutoRefBhv.<span style="color: #DD4747">update</span>(vendorConstraintNameAutoRef);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param vendorConstraintNameAutoRef The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(final LdVendorConstraintNameAutoRef vendorConstraintNameAutoRef) {
        doUpdate(vendorConstraintNameAutoRef, null);
    }

    protected void doUpdate(LdVendorConstraintNameAutoRef vendorConstraintNameAutoRef, final UpdateOption<LdVendorConstraintNameAutoRefCB> op) {
        assertObjectNotNull("vendorConstraintNameAutoRef", vendorConstraintNameAutoRef);
        prepareUpdateOption(op);
        helpUpdateInternally(vendorConstraintNameAutoRef, new InternalUpdateCallback<LdVendorConstraintNameAutoRef>() {
            public int callbackDelegateUpdate(LdVendorConstraintNameAutoRef et) { return delegateUpdate(et, op); } });
    }

    protected void prepareUpdateOption(UpdateOption<LdVendorConstraintNameAutoRefCB> op) {
        if (op == null) { return; }
        assertUpdateOptionStatus(op);
        if (op.hasSelfSpecification()) {
            op.resolveSelfSpecification(createCBForVaryingUpdate());
        }
        if (op.hasSpecifiedUpdateColumn()) {
            op.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    protected LdVendorConstraintNameAutoRefCB createCBForVaryingUpdate() {
        LdVendorConstraintNameAutoRefCB cb = newMyConditionBean();
        cb.xsetupForVaryingUpdate();
        return cb;
    }

    protected LdVendorConstraintNameAutoRefCB createCBForSpecifiedUpdate() {
        LdVendorConstraintNameAutoRefCB cb = newMyConditionBean();
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
     * <p><span style="color: #DD4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param vendorConstraintNameAutoRef The entity of insert or update target. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(LdVendorConstraintNameAutoRef vendorConstraintNameAutoRef) {
        doInesrtOrUpdate(vendorConstraintNameAutoRef, null, null);
    }

    protected void doInesrtOrUpdate(LdVendorConstraintNameAutoRef vendorConstraintNameAutoRef, final InsertOption<LdVendorConstraintNameAutoRefCB> iop, final UpdateOption<LdVendorConstraintNameAutoRefCB> uop) {
        helpInsertOrUpdateInternally(vendorConstraintNameAutoRef, new InternalInsertOrUpdateCallback<LdVendorConstraintNameAutoRef, LdVendorConstraintNameAutoRefCB>() {
            public void callbackInsert(LdVendorConstraintNameAutoRef et) { doInsert(et, iop); }
            public void callbackUpdate(LdVendorConstraintNameAutoRef et) { doUpdate(et, uop); }
            public LdVendorConstraintNameAutoRefCB callbackNewMyConditionBean() { return newMyConditionBean(); }
            public int callbackSelectCount(LdVendorConstraintNameAutoRefCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrModify(Entity et, InsertOption<? extends ConditionBean> iop, UpdateOption<? extends ConditionBean> uop) {
        if (iop == null && uop == null) { insertOrUpdate(downcast(et)); }
        else {
            iop = iop != null ? iop : new InsertOption<LdVendorConstraintNameAutoRefCB>();
            uop = uop != null ? uop : new UpdateOption<LdVendorConstraintNameAutoRefCB>();
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
     * LdVendorConstraintNameAutoRef vendorConstraintNameAutoRef = new LdVendorConstraintNameAutoRef();
     * vendorConstraintNameAutoRef.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * vendorConstraintNameAutoRef.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     vendorConstraintNameAutoRefBhv.<span style="color: #DD4747">delete</span>(vendorConstraintNameAutoRef);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param vendorConstraintNameAutoRef The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(LdVendorConstraintNameAutoRef vendorConstraintNameAutoRef) {
        doDelete(vendorConstraintNameAutoRef, null);
    }

    protected void doDelete(LdVendorConstraintNameAutoRef vendorConstraintNameAutoRef, final DeleteOption<LdVendorConstraintNameAutoRefCB> op) {
        assertObjectNotNull("vendorConstraintNameAutoRef", vendorConstraintNameAutoRef);
        prepareDeleteOption(op);
        helpDeleteInternally(vendorConstraintNameAutoRef, new InternalDeleteCallback<LdVendorConstraintNameAutoRef>() {
            public int callbackDelegateDelete(LdVendorConstraintNameAutoRef et) { return delegateDelete(et, op); } });
    }

    protected void prepareDeleteOption(DeleteOption<LdVendorConstraintNameAutoRefCB> op) {
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
     * <p><span style="color: #DD4747; font-size: 120%">The columns of least common multiple are registered like this:</span></p>
     * <pre>
     * for (... : ...) {
     *     LdVendorConstraintNameAutoRef vendorConstraintNameAutoRef = new LdVendorConstraintNameAutoRef();
     *     vendorConstraintNameAutoRef.setFooName("foo");
     *     if (...) {
     *         vendorConstraintNameAutoRef.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     vendorConstraintNameAutoRefList.add(vendorConstraintNameAutoRef);
     * }
     * vendorConstraintNameAutoRefBhv.<span style="color: #DD4747">batchInsert</span>(vendorConstraintNameAutoRefList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param vendorConstraintNameAutoRefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<LdVendorConstraintNameAutoRef> vendorConstraintNameAutoRefList) {
        InsertOption<LdVendorConstraintNameAutoRefCB> op = createInsertUpdateOption();
        return doBatchInsert(vendorConstraintNameAutoRefList, op);
    }

    protected int[] doBatchInsert(List<LdVendorConstraintNameAutoRef> vendorConstraintNameAutoRefList, InsertOption<LdVendorConstraintNameAutoRefCB> op) {
        assertObjectNotNull("vendorConstraintNameAutoRefList", vendorConstraintNameAutoRefList);
        prepareBatchInsertOption(vendorConstraintNameAutoRefList, op);
        return delegateBatchInsert(vendorConstraintNameAutoRefList, op);
    }

    protected void prepareBatchInsertOption(List<LdVendorConstraintNameAutoRef> vendorConstraintNameAutoRefList, InsertOption<LdVendorConstraintNameAutoRefCB> op) {
        op.xallowInsertColumnModifiedPropertiesFragmented();
        op.xacceptInsertColumnModifiedPropertiesIfNeeds(vendorConstraintNameAutoRefList);
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
     * <span style="color: #DD4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     LdVendorConstraintNameAutoRef vendorConstraintNameAutoRef = new LdVendorConstraintNameAutoRef();
     *     vendorConstraintNameAutoRef.setFooName("foo");
     *     if (...) {
     *         vendorConstraintNameAutoRef.setFooPrice(123);
     *     } else {
     *         vendorConstraintNameAutoRef.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//vendorConstraintNameAutoRef.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     vendorConstraintNameAutoRefList.add(vendorConstraintNameAutoRef);
     * }
     * vendorConstraintNameAutoRefBhv.<span style="color: #DD4747">batchUpdate</span>(vendorConstraintNameAutoRefList);
     * </pre>
     * @param vendorConstraintNameAutoRefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<LdVendorConstraintNameAutoRef> vendorConstraintNameAutoRefList) {
        UpdateOption<LdVendorConstraintNameAutoRefCB> op = createPlainUpdateOption();
        return doBatchUpdate(vendorConstraintNameAutoRefList, op);
    }

    protected int[] doBatchUpdate(List<LdVendorConstraintNameAutoRef> vendorConstraintNameAutoRefList, UpdateOption<LdVendorConstraintNameAutoRefCB> op) {
        assertObjectNotNull("vendorConstraintNameAutoRefList", vendorConstraintNameAutoRefList);
        prepareBatchUpdateOption(vendorConstraintNameAutoRefList, op);
        return delegateBatchUpdate(vendorConstraintNameAutoRefList, op);
    }

    protected void prepareBatchUpdateOption(List<LdVendorConstraintNameAutoRef> vendorConstraintNameAutoRefList, UpdateOption<LdVendorConstraintNameAutoRefCB> op) {
        op.xacceptUpdateColumnModifiedPropertiesIfNeeds(vendorConstraintNameAutoRefList);
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
     * vendorConstraintNameAutoRefBhv.<span style="color: #DD4747">batchUpdate</span>(vendorConstraintNameAutoRefList, new SpecifyQuery<LdVendorConstraintNameAutoRefCB>() {
     *     public void specify(LdVendorConstraintNameAutoRefCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #DD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #DD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * vendorConstraintNameAutoRefBhv.<span style="color: #DD4747">batchUpdate</span>(vendorConstraintNameAutoRefList, new SpecifyQuery<LdVendorConstraintNameAutoRefCB>() {
     *     public void specify(LdVendorConstraintNameAutoRefCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #DD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param vendorConstraintNameAutoRefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<LdVendorConstraintNameAutoRef> vendorConstraintNameAutoRefList, SpecifyQuery<LdVendorConstraintNameAutoRefCB> updateColumnSpec) {
        return doBatchUpdate(vendorConstraintNameAutoRefList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> op) {
        return doLumpModify(ls, op);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param vendorConstraintNameAutoRefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<LdVendorConstraintNameAutoRef> vendorConstraintNameAutoRefList) {
        return doBatchDelete(vendorConstraintNameAutoRefList, null);
    }

    protected int[] doBatchDelete(List<LdVendorConstraintNameAutoRef> vendorConstraintNameAutoRefList, DeleteOption<LdVendorConstraintNameAutoRefCB> op) {
        assertObjectNotNull("vendorConstraintNameAutoRefList", vendorConstraintNameAutoRefList);
        prepareDeleteOption(op);
        return delegateBatchDelete(vendorConstraintNameAutoRefList, op);
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
     * vendorConstraintNameAutoRefBhv.<span style="color: #DD4747">queryInsert</span>(new QueryInsertSetupper&lt;LdVendorConstraintNameAutoRef, LdVendorConstraintNameAutoRefCB&gt;() {
     *     public ConditionBean setup(vendorConstraintNameAutoRef entity, LdVendorConstraintNameAutoRefCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<LdVendorConstraintNameAutoRef, LdVendorConstraintNameAutoRefCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(QueryInsertSetupper<LdVendorConstraintNameAutoRef, LdVendorConstraintNameAutoRefCB> sp, InsertOption<LdVendorConstraintNameAutoRefCB> op) {
        assertObjectNotNull("setupper", sp);
        prepareInsertOption(op);
        LdVendorConstraintNameAutoRef e = new LdVendorConstraintNameAutoRef();
        LdVendorConstraintNameAutoRefCB cb = createCBForQueryInsert();
        return delegateQueryInsert(e, cb, sp.setup(e, cb), op);
    }

    protected LdVendorConstraintNameAutoRefCB createCBForQueryInsert() {
        LdVendorConstraintNameAutoRefCB cb = newMyConditionBean();
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
     * LdVendorConstraintNameAutoRef vendorConstraintNameAutoRef = new LdVendorConstraintNameAutoRef();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//vendorConstraintNameAutoRef.setPK...(value);</span>
     * vendorConstraintNameAutoRef.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//vendorConstraintNameAutoRef.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//vendorConstraintNameAutoRef.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//vendorConstraintNameAutoRef.setVersionNo(value);</span>
     * LdVendorConstraintNameAutoRefCB cb = new LdVendorConstraintNameAutoRefCB();
     * cb.query().setFoo...(value);
     * vendorConstraintNameAutoRefBhv.<span style="color: #DD4747">queryUpdate</span>(vendorConstraintNameAutoRef, cb);
     * </pre>
     * @param vendorConstraintNameAutoRef The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of LdVendorConstraintNameAutoRef. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(LdVendorConstraintNameAutoRef vendorConstraintNameAutoRef, LdVendorConstraintNameAutoRefCB cb) {
        return doQueryUpdate(vendorConstraintNameAutoRef, cb, null);
    }

    protected int doQueryUpdate(LdVendorConstraintNameAutoRef vendorConstraintNameAutoRef, LdVendorConstraintNameAutoRefCB cb, UpdateOption<LdVendorConstraintNameAutoRefCB> op) {
        assertObjectNotNull("vendorConstraintNameAutoRef", vendorConstraintNameAutoRef); assertCBStateValid(cb);
        prepareUpdateOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryUpdate(vendorConstraintNameAutoRef, cb, op) : 0;
    }

    @Override
    protected int doRangeModify(Entity et, ConditionBean cb, UpdateOption<? extends ConditionBean> op) {
        if (op == null) { return queryUpdate(downcast(et), (LdVendorConstraintNameAutoRefCB)cb); }
        else { return varyingQueryUpdate(downcast(et), (LdVendorConstraintNameAutoRefCB)cb, downcast(op)); }
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * LdVendorConstraintNameAutoRefCB cb = new LdVendorConstraintNameAutoRefCB();
     * cb.query().setFoo...(value);
     * vendorConstraintNameAutoRefBhv.<span style="color: #DD4747">queryDelete</span>(vendorConstraintNameAutoRef, cb);
     * </pre>
     * @param cb The condition-bean of LdVendorConstraintNameAutoRef. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(LdVendorConstraintNameAutoRefCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(LdVendorConstraintNameAutoRefCB cb, DeleteOption<LdVendorConstraintNameAutoRefCB> op) {
        assertCBStateValid(cb);
        prepareDeleteOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryDelete(cb, op) : 0;
    }

    @Override
    protected int doRangeRemove(ConditionBean cb, DeleteOption<? extends ConditionBean> op) {
        if (op == null) { return queryDelete((LdVendorConstraintNameAutoRefCB)cb); }
        else { return varyingQueryDelete((LdVendorConstraintNameAutoRefCB)cb, downcast(op)); }
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
     * LdVendorConstraintNameAutoRef vendorConstraintNameAutoRef = new LdVendorConstraintNameAutoRef();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * vendorConstraintNameAutoRef.setFoo...(value);
     * vendorConstraintNameAutoRef.setBar...(value);
     * InsertOption<LdVendorConstraintNameAutoRefCB> option = new InsertOption<LdVendorConstraintNameAutoRefCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * vendorConstraintNameAutoRefBhv.<span style="color: #DD4747">varyingInsert</span>(vendorConstraintNameAutoRef, option);
     * ... = vendorConstraintNameAutoRef.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param vendorConstraintNameAutoRef The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(LdVendorConstraintNameAutoRef vendorConstraintNameAutoRef, InsertOption<LdVendorConstraintNameAutoRefCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(vendorConstraintNameAutoRef, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * LdVendorConstraintNameAutoRef vendorConstraintNameAutoRef = new LdVendorConstraintNameAutoRef();
     * vendorConstraintNameAutoRef.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * vendorConstraintNameAutoRef.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * vendorConstraintNameAutoRef.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;LdVendorConstraintNameAutoRefCB&gt; option = new UpdateOption&lt;LdVendorConstraintNameAutoRefCB&gt;();
     *     option.self(new SpecifyQuery&lt;LdVendorConstraintNameAutoRefCB&gt;() {
     *         public void specify(LdVendorConstraintNameAutoRefCB cb) {
     *             cb.specify().<span style="color: #DD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     vendorConstraintNameAutoRefBhv.<span style="color: #DD4747">varyingUpdate</span>(vendorConstraintNameAutoRef, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param vendorConstraintNameAutoRef The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(LdVendorConstraintNameAutoRef vendorConstraintNameAutoRef, UpdateOption<LdVendorConstraintNameAutoRefCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(vendorConstraintNameAutoRef, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param vendorConstraintNameAutoRef The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(LdVendorConstraintNameAutoRef vendorConstraintNameAutoRef, InsertOption<LdVendorConstraintNameAutoRefCB> insertOption, UpdateOption<LdVendorConstraintNameAutoRefCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdate(vendorConstraintNameAutoRef, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param vendorConstraintNameAutoRef The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(LdVendorConstraintNameAutoRef vendorConstraintNameAutoRef, DeleteOption<LdVendorConstraintNameAutoRefCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(vendorConstraintNameAutoRef, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param vendorConstraintNameAutoRefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<LdVendorConstraintNameAutoRef> vendorConstraintNameAutoRefList, InsertOption<LdVendorConstraintNameAutoRefCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(vendorConstraintNameAutoRefList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param vendorConstraintNameAutoRefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<LdVendorConstraintNameAutoRef> vendorConstraintNameAutoRefList, UpdateOption<LdVendorConstraintNameAutoRefCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(vendorConstraintNameAutoRefList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param vendorConstraintNameAutoRefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<LdVendorConstraintNameAutoRef> vendorConstraintNameAutoRefList, DeleteOption<LdVendorConstraintNameAutoRefCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(vendorConstraintNameAutoRefList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<LdVendorConstraintNameAutoRef, LdVendorConstraintNameAutoRefCB> setupper, InsertOption<LdVendorConstraintNameAutoRefCB> option) {
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
     * LdVendorConstraintNameAutoRef vendorConstraintNameAutoRef = new LdVendorConstraintNameAutoRef();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//vendorConstraintNameAutoRef.setPK...(value);</span>
     * vendorConstraintNameAutoRef.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//vendorConstraintNameAutoRef.setVersionNo(value);</span>
     * LdVendorConstraintNameAutoRefCB cb = new LdVendorConstraintNameAutoRefCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;LdVendorConstraintNameAutoRefCB&gt; option = new UpdateOption&lt;LdVendorConstraintNameAutoRefCB&gt;();
     * option.self(new SpecifyQuery&lt;LdVendorConstraintNameAutoRefCB&gt;() {
     *     public void specify(LdVendorConstraintNameAutoRefCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * vendorConstraintNameAutoRefBhv.<span style="color: #DD4747">varyingQueryUpdate</span>(vendorConstraintNameAutoRef, cb, option);
     * </pre>
     * @param vendorConstraintNameAutoRef The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of LdVendorConstraintNameAutoRef. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(LdVendorConstraintNameAutoRef vendorConstraintNameAutoRef, LdVendorConstraintNameAutoRefCB cb, UpdateOption<LdVendorConstraintNameAutoRefCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(vendorConstraintNameAutoRef, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of LdVendorConstraintNameAutoRef. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(LdVendorConstraintNameAutoRefCB cb, DeleteOption<LdVendorConstraintNameAutoRefCB> option) {
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
    public OutsideSqlBasicExecutor<LdVendorConstraintNameAutoRefBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCountUniquely(LdVendorConstraintNameAutoRefCB cb) { return invoke(createSelectCountCBCommand(cb, true)); }
    protected int delegateSelectCountPlainly(LdVendorConstraintNameAutoRefCB cb) { return invoke(createSelectCountCBCommand(cb, false)); }
    protected <ENTITY extends LdVendorConstraintNameAutoRef> void delegateSelectCursor(LdVendorConstraintNameAutoRefCB cb, EntityRowHandler<ENTITY> rh, Class<ENTITY> tp)
    { invoke(createSelectCursorCBCommand(cb, rh, tp)); }
    protected <ENTITY extends LdVendorConstraintNameAutoRef> List<ENTITY> delegateSelectList(LdVendorConstraintNameAutoRefCB cb, Class<ENTITY> tp)
    { return invoke(createSelectListCBCommand(cb, tp)); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(LdVendorConstraintNameAutoRef et, InsertOption<LdVendorConstraintNameAutoRefCB> op)
    { if (!processBeforeInsert(et, op)) { return 0; }
      return invoke(createInsertEntityCommand(et, op)); }
    protected int delegateUpdate(LdVendorConstraintNameAutoRef et, UpdateOption<LdVendorConstraintNameAutoRefCB> op)
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return delegateUpdateNonstrict(et, op); }
    protected int delegateUpdateNonstrict(LdVendorConstraintNameAutoRef et, UpdateOption<LdVendorConstraintNameAutoRefCB> op)
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return invoke(createUpdateNonstrictEntityCommand(et, op)); }
    protected int delegateDelete(LdVendorConstraintNameAutoRef et, DeleteOption<LdVendorConstraintNameAutoRefCB> op)
    { if (!processBeforeDelete(et, op)) { return 0; }
      return delegateDeleteNonstrict(et, op); }
    protected int delegateDeleteNonstrict(LdVendorConstraintNameAutoRef et, DeleteOption<LdVendorConstraintNameAutoRefCB> op)
    { if (!processBeforeDelete(et, op)) { return 0; }
      return invoke(createDeleteNonstrictEntityCommand(et, op)); }

    protected int[] delegateBatchInsert(List<LdVendorConstraintNameAutoRef> ls, InsertOption<LdVendorConstraintNameAutoRefCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchInsertCommand(processBatchInternally(ls, op), op)); }
    protected int[] delegateBatchUpdate(List<LdVendorConstraintNameAutoRef> ls, UpdateOption<LdVendorConstraintNameAutoRefCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchUpdateNonstrict(ls, op); }
    protected int[] delegateBatchUpdateNonstrict(List<LdVendorConstraintNameAutoRef> ls, UpdateOption<LdVendorConstraintNameAutoRefCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateNonstrictCommand(processBatchInternally(ls, op, true), op)); }
    protected int[] delegateBatchDelete(List<LdVendorConstraintNameAutoRef> ls, DeleteOption<LdVendorConstraintNameAutoRefCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchDeleteNonstrict(ls, op); }
    protected int[] delegateBatchDeleteNonstrict(List<LdVendorConstraintNameAutoRef> ls, DeleteOption<LdVendorConstraintNameAutoRefCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteNonstrictCommand(processBatchInternally(ls, op, true), op)); }

    protected int delegateQueryInsert(LdVendorConstraintNameAutoRef et, LdVendorConstraintNameAutoRefCB inCB, ConditionBean resCB, InsertOption<LdVendorConstraintNameAutoRefCB> op)
    { if (!processBeforeQueryInsert(et, inCB, resCB, op)) { return 0; } return invoke(createQueryInsertCBCommand(et, inCB, resCB, op));  }
    protected int delegateQueryUpdate(LdVendorConstraintNameAutoRef et, LdVendorConstraintNameAutoRefCB cb, UpdateOption<LdVendorConstraintNameAutoRefCB> op)
    { if (!processBeforeQueryUpdate(et, cb, op)) { return 0; } return invoke(createQueryUpdateCBCommand(et, cb, op));  }
    protected int delegateQueryDelete(LdVendorConstraintNameAutoRefCB cb, DeleteOption<LdVendorConstraintNameAutoRefCB> op)
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
    protected LdVendorConstraintNameAutoRef downcast(Entity et) {
        return helpEntityDowncastInternally(et, LdVendorConstraintNameAutoRef.class);
    }

    protected LdVendorConstraintNameAutoRefCB downcast(ConditionBean cb) {
        return helpConditionBeanDowncastInternally(cb, LdVendorConstraintNameAutoRefCB.class);
    }

    @SuppressWarnings("unchecked")
    protected List<LdVendorConstraintNameAutoRef> downcast(List<? extends Entity> ls) {
        return (List<LdVendorConstraintNameAutoRef>)ls;
    }

    @SuppressWarnings("unchecked")
    protected InsertOption<LdVendorConstraintNameAutoRefCB> downcast(InsertOption<? extends ConditionBean> op) {
        return (InsertOption<LdVendorConstraintNameAutoRefCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected UpdateOption<LdVendorConstraintNameAutoRefCB> downcast(UpdateOption<? extends ConditionBean> op) {
        return (UpdateOption<LdVendorConstraintNameAutoRefCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected DeleteOption<LdVendorConstraintNameAutoRefCB> downcast(DeleteOption<? extends ConditionBean> op) {
        return (DeleteOption<LdVendorConstraintNameAutoRefCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<LdVendorConstraintNameAutoRef, LdVendorConstraintNameAutoRefCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> sp) {
        return (QueryInsertSetupper<LdVendorConstraintNameAutoRef, LdVendorConstraintNameAutoRefCB>)sp;
    }
}
