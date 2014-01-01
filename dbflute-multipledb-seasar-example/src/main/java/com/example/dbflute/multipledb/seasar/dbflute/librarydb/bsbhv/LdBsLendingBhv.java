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
 * The behavior of LENDING as TABLE. <br />
 * <pre>
 * [primary key]
 *     LIBRARY_ID, LB_USER_ID, LENDING_DATE
 * 
 * [column]
 *     LIBRARY_ID, LB_USER_ID, LENDING_DATE, R_USER, R_MODULE, R_TIMESTAMP, U_USER, U_MODULE, U_TIMESTAMP
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
 *     LIBRARY_USER
 * 
 * [referrer table]
 *     LENDING_COLLECTION
 * 
 * [foreign property]
 *     libraryUser
 * 
 * [referrer property]
 *     lendingCollectionList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class LdBsLendingBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "LENDING"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public DBMeta getDBMeta() { return LdLendingDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public LdLendingDbm getMyDBMeta() { return LdLendingDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public Entity newEntity() { return newMyEntity(); }

    /** {@inheritDoc} */
    public ConditionBean newConditionBean() { return newMyConditionBean(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public LdLending newMyEntity() { return new LdLending(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public LdLendingCB newMyConditionBean() { return new LdLendingCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * LdLendingCB cb = new LdLendingCB();
     * cb.query().setFoo...(value);
     * int count = lendingBhv.<span style="color: #FD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of LdLending. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(LdLendingCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(LdLendingCB cb) { // called by selectCount(cb) 
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(LdLendingCB cb) { // called by selectPage(cb)
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
     * LdLendingCB cb = new LdLendingCB();
     * cb.query().setFoo...(value);
     * LdLending lending = lendingBhv.<span style="color: #FD4747">selectEntity</span>(cb);
     * if (lending != null) {
     *     ... = lending.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of LdLending. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public LdLending selectEntity(LdLendingCB cb) {
        return doSelectEntity(cb, LdLending.class);
    }

    protected <ENTITY extends LdLending> ENTITY doSelectEntity(final LdLendingCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityInternally(cb, entityType, new InternalSelectEntityCallback<ENTITY, LdLendingCB>() {
            public List<ENTITY> callbackSelectList(LdLendingCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); } });
    }

    @Override
    protected Entity doReadEntity(ConditionBean cb) {
        return selectEntity(downcast(cb));
    }

    /**
     * Select the entity by the condition-bean with deleted check.
     * <pre>
     * LdLendingCB cb = new LdLendingCB();
     * cb.query().setFoo...(value);
     * LdLending lending = lendingBhv.<span style="color: #FD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = lending.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of LdLending. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public LdLending selectEntityWithDeletedCheck(LdLendingCB cb) {
        return doSelectEntityWithDeletedCheck(cb, LdLending.class);
    }

    protected <ENTITY extends LdLending> ENTITY doSelectEntityWithDeletedCheck(final LdLendingCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityWithDeletedCheckInternally(cb, entityType, new InternalSelectEntityWithDeletedCheckCallback<ENTITY, LdLendingCB>() {
            public List<ENTITY> callbackSelectList(LdLendingCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); } });
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
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public LdLending selectByPKValue(Integer libraryId, Integer lbUserId, java.sql.Timestamp lendingDate) {
        return doSelectByPKValue(libraryId, lbUserId, lendingDate, LdLending.class);
    }

    protected <ENTITY extends LdLending> ENTITY doSelectByPKValue(Integer libraryId, Integer lbUserId, java.sql.Timestamp lendingDate, Class<ENTITY> entityType) {
        return doSelectEntity(buildPKCB(libraryId, lbUserId, lendingDate), entityType);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param libraryId The one of primary key. (NotNull)
     * @param lbUserId The one of primary key. (NotNull)
     * @param lendingDate The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public LdLending selectByPKValueWithDeletedCheck(Integer libraryId, Integer lbUserId, java.sql.Timestamp lendingDate) {
        return doSelectByPKValueWithDeletedCheck(libraryId, lbUserId, lendingDate, LdLending.class);
    }

    protected <ENTITY extends LdLending> ENTITY doSelectByPKValueWithDeletedCheck(Integer libraryId, Integer lbUserId, java.sql.Timestamp lendingDate, Class<ENTITY> entityType) {
        return doSelectEntityWithDeletedCheck(buildPKCB(libraryId, lbUserId, lendingDate), entityType);
    }

    private LdLendingCB buildPKCB(Integer libraryId, Integer lbUserId, java.sql.Timestamp lendingDate) {
        assertObjectNotNull("libraryId", libraryId);assertObjectNotNull("lbUserId", lbUserId);assertObjectNotNull("lendingDate", lendingDate);
        LdLendingCB cb = newMyConditionBean();
        cb.query().setLibraryId_Equal(libraryId);cb.query().setLbUserId_Equal(lbUserId);cb.query().setLendingDate_Equal(lendingDate);
        return cb;
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * LdLendingCB cb = new LdLendingCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;LdLending&gt; lendingList = lendingBhv.<span style="color: #FD4747">selectList</span>(cb);
     * for (LdLending lending : lendingList) {
     *     ... = lending.get...();
     * }
     * </pre>
     * @param cb The condition-bean of LdLending. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<LdLending> selectList(LdLendingCB cb) {
        return doSelectList(cb, LdLending.class);
    }

    protected <ENTITY extends LdLending> ListResultBean<ENTITY> doSelectList(LdLendingCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", entityType);
        assertSpecifyDerivedReferrerEntityProperty(cb, entityType);
        return helpSelectListInternally(cb, entityType, new InternalSelectListCallback<ENTITY, LdLendingCB>() {
            public List<ENTITY> callbackSelectList(LdLendingCB cb, Class<ENTITY> entityType) { return delegateSelectList(cb, entityType); } });
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
     * LdLendingCB cb = new LdLendingCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #FD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;LdLending&gt; page = lendingBhv.<span style="color: #FD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (LdLending lending : page) {
     *     ... = lending.get...();
     * }
     * </pre>
     * @param cb The condition-bean of LdLending. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<LdLending> selectPage(LdLendingCB cb) {
        return doSelectPage(cb, LdLending.class);
    }

    protected <ENTITY extends LdLending> PagingResultBean<ENTITY> doSelectPage(LdLendingCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", entityType);
        return helpSelectPageInternally(cb, entityType, new InternalSelectPageCallback<ENTITY, LdLendingCB>() {
            public int callbackSelectCount(LdLendingCB cb) { return doSelectCountPlainly(cb); }
            public List<ENTITY> callbackSelectList(LdLendingCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); }
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
     * LdLendingCB cb = new LdLendingCB();
     * cb.query().setFoo...(value);
     * lendingBhv.<span style="color: #FD4747">selectCursor</span>(cb, new EntityRowHandler&lt;LdLending&gt;() {
     *     public void handle(LdLending entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of LdLending. (NotNull)
     * @param entityRowHandler The handler of entity row of LdLending. (NotNull)
     */
    public void selectCursor(LdLendingCB cb, EntityRowHandler<LdLending> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, LdLending.class);
    }

    protected <ENTITY extends LdLending> void doSelectCursor(LdLendingCB cb, EntityRowHandler<ENTITY> entityRowHandler, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler<LdLending>", entityRowHandler); assertObjectNotNull("entityType", entityType);
        assertSpecifyDerivedReferrerEntityProperty(cb, entityType);
        helpSelectCursorInternally(cb, entityRowHandler, entityType, new InternalSelectCursorCallback<ENTITY, LdLendingCB>() {
            public void callbackSelectCursor(LdLendingCB cb, EntityRowHandler<ENTITY> entityRowHandler, Class<ENTITY> entityType) { delegateSelectCursor(cb, entityRowHandler, entityType); }
            public List<ENTITY> callbackSelectList(LdLendingCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); }
        });
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * lendingBhv.<span style="color: #FD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(LdLendingCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> SLFunction<LdLendingCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
    }

    protected <RESULT, CB extends LdLendingCB> SLFunction<CB, RESULT> doScalarSelect(Class<RESULT> resultType, CB cb) {
        assertObjectNotNull("resultType", resultType); assertCBStateValid(cb);
        cb.xsetupForScalarSelect(); cb.getSqlClause().disableSelectIndex(); // for when you use union
        return createSLFunction(cb, resultType);
    }

    protected <RESULT, CB extends LdLendingCB> SLFunction<CB, RESULT> createSLFunction(CB cb, Class<RESULT> resultType) {
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
     * @param lending The entity of lending. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     */
    public void loadLendingCollectionList(LdLending lending, ConditionBeanSetupper<LdLendingCollectionCB> conditionBeanSetupper) {
        xassLRArg(lending, conditionBeanSetupper);
        loadLendingCollectionList(xnewLRLs(lending), conditionBeanSetupper);
    }
    /**
     * Load referrer of lendingCollectionList with the set-upper for condition-bean of referrer. <br />
     * LENDING_COLLECTION by LIBRARY_ID, LB_USER_ID, LENDING_DATE, named 'lendingCollectionList'.
     * <pre>
     * lendingBhv.<span style="color: #FD4747">loadLendingCollectionList</span>(lendingList, new ConditionBeanSetupper&lt;LdLendingCollectionCB&gt;() {
     *     public void setup(LdLendingCollectionCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...(); <span style="color: #3F7E5E">// basically you should order referrer list</span>
     *     }
     * });
     * for (LdLending lending : lendingList) {
     *     ... = lending.<span style="color: #FD4747">getLendingCollectionList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key(and others too) is treated as case-insensitive. <br />
     * The condition-bean that the set-upper provides have settings before you touch it. It is as follows:
     * <pre>
     * cb.query().set[ForeignKey]_InScope(pkList);
     * cb.query().addOrderBy_[ForeignKey]_Asc();
     * </pre>
     * @param lendingList The entity list of lending. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     */
    public void loadLendingCollectionList(List<LdLending> lendingList, ConditionBeanSetupper<LdLendingCollectionCB> conditionBeanSetupper) {
        xassLRArg(lendingList, conditionBeanSetupper);
        loadLendingCollectionList(lendingList, new LoadReferrerOption<LdLendingCollectionCB, LdLendingCollection>().xinit(conditionBeanSetupper));
    }
    /**
     * {Refer to overload method that has an argument of the list of entity.}
     * @param lending The entity of lending. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadLendingCollectionList(LdLending lending, LoadReferrerOption<LdLendingCollectionCB, LdLendingCollection> loadReferrerOption) {
        xassLRArg(lending, loadReferrerOption);
        loadLendingCollectionList(xnewLRLs(lending), loadReferrerOption);
    }
    /**
     * {Refer to overload method that has an argument of condition-bean setupper.}
     * @param lendingList The entity list of lending. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadLendingCollectionList(List<LdLending> lendingList, LoadReferrerOption<LdLendingCollectionCB, LdLendingCollection> loadReferrerOption) {
        xassLRArg(lendingList, loadReferrerOption);
        if (lendingList.isEmpty()) { return; }
        final LdLendingCollectionBhv referrerBhv = xgetBSFLR().select(LdLendingCollectionBhv.class);
        helpLoadReferrerInternally(lendingList, loadReferrerOption, new InternalLoadReferrerCallback<LdLending, java.util.Map<String, Object>, LdLendingCollectionCB, LdLendingCollection>() {
            public java.util.Map<String, Object> getPKVal(LdLending e) {
                java.util.Map<String, Object> primaryKeyMap = new java.util.LinkedHashMap<String, Object>();
                primaryKeyMap.put("LibraryId", e.getLibraryId());
                primaryKeyMap.put("LbUserId", e.getLbUserId());
                primaryKeyMap.put("LendingDate", e.getLendingDate());
                return primaryKeyMap;
            }
            public void setRfLs(LdLending e, List<LdLendingCollection> ls) { e.setLendingCollectionList(ls); }
            public LdLendingCollectionCB newMyCB() { return referrerBhv.newMyConditionBean(); }
            public void qyFKIn(LdLendingCollectionCB cb, List<java.util.Map<String, Object>> ls) {
                final String aliasName = cb.getSqlClause().getBasePointAliasName();
                String identity = null;
                StringBuilder sb = new StringBuilder();
                for (java.util.Map<String, Object> primaryKeyMap : ls) {
                    if (sb.length() > 0) { sb.append(")").append(ln()).append("     or ("); }
                    sb.append(aliasName).append(".LIBRARY_ID = ");
                    identity = "lendingCollectionListLibraryId";
                    sb.append(cb.query().xregisterFreeParameterToThemeList(identity, primaryKeyMap.get("LibraryId")));
                    sb.append(" and ");
                    sb.append(aliasName).append(".LB_USER_ID = ");
                    identity = "lendingCollectionListLbUserId";
                    sb.append(cb.query().xregisterFreeParameterToThemeList(identity, primaryKeyMap.get("LbUserId")));
                    sb.append(" and ");
                    sb.append(aliasName).append(".LENDING_DATE = ");
                    identity = "lendingCollectionListLendingDate";
                    sb.append(cb.query().xregisterFreeParameterToThemeList(identity, primaryKeyMap.get("LendingDate")));
                }
                sb.insert(0, "((").append("))");
                cb.getSqlClause().registerWhereClause(sb.toString(), aliasName);
            }
            public void qyOdFKAsc(LdLendingCollectionCB cb) {
                cb.query().addOrderBy_LibraryId_Asc();
                cb.query().addOrderBy_LbUserId_Asc();
                cb.query().addOrderBy_LendingDate_Asc();
            }
            public void spFKCol(LdLendingCollectionCB cb) {
                cb.specify().columnLibraryId();
                cb.specify().columnLbUserId();
                cb.specify().columnLendingDate();
            }
            public List<LdLendingCollection> selRfLs(LdLendingCollectionCB cb) { return referrerBhv.selectList(cb); }
            public java.util.Map<String, Object> getFKVal(LdLendingCollection e) {
                java.util.Map<String, Object> foreignKeyMap = new java.util.LinkedHashMap<String, Object>();
                foreignKeyMap.put("LibraryId", e.getLibraryId());
                foreignKeyMap.put("LbUserId", e.getLbUserId());
                foreignKeyMap.put("LendingDate", e.getLendingDate());
                return foreignKeyMap;
            }
            public void setlcEt(LdLendingCollection re, LdLending le) { re.setLending(le); }
            public String getRfPrNm() { return "lendingCollectionList"; }
        });
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'LdLibraryUser'.
     * @param lendingList The list of lending. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<LdLibraryUser> pulloutLibraryUser(List<LdLending> lendingList) {
        return helpPulloutInternally(lendingList, new InternalPulloutCallback<LdLending, LdLibraryUser>() {
            public LdLibraryUser getFr(LdLending e) { return e.getLibraryUser(); }
            public boolean hasRf() { return true; }
            public void setRfLs(LdLibraryUser e, List<LdLending> ls)
            { e.setLendingList(ls); }
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
     * LdLending lending = new LdLending();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * lending.setFoo...(value);
     * lending.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//lending.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//lending.set...;</span>
     * lendingBhv.<span style="color: #FD4747">insert</span>(lending);
     * ... = lending.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param lending The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(LdLending lending) {
        doInsert(lending, null);
    }

    protected void doInsert(LdLending lending, InsertOption<LdLendingCB> option) {
        assertObjectNotNull("lending", lending);
        prepareInsertOption(option);
        delegateInsert(lending, option);
    }

    protected void prepareInsertOption(InsertOption<LdLendingCB> option) {
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
     * LdLending lending = new LdLending();
     * lending.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * lending.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//lending.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//lending.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * lending.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     lendingBhv.<span style="color: #FD4747">update</span>(lending);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * } 
     * </pre>
     * @param lending The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(final LdLending lending) {
        doUpdate(lending, null);
    }

    protected void doUpdate(LdLending lending, final UpdateOption<LdLendingCB> option) {
        assertObjectNotNull("lending", lending);
        prepareUpdateOption(option);
        helpUpdateInternally(lending, new InternalUpdateCallback<LdLending>() {
            public int callbackDelegateUpdate(LdLending entity) { return delegateUpdate(entity, option); } });
    }

    protected void prepareUpdateOption(UpdateOption<LdLendingCB> option) {
        if (option == null) { return; }
        assertUpdateOptionStatus(option);
        if (option.hasSelfSpecification()) {
            option.resolveSelfSpecification(createCBForVaryingUpdate());
        }
        if (option.hasSpecifiedUpdateColumn()) {
            option.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    protected LdLendingCB createCBForVaryingUpdate() {
        LdLendingCB cb = newMyConditionBean();
        cb.xsetupForVaryingUpdate();
        return cb;
    }

    protected LdLendingCB createCBForSpecifiedUpdate() {
        LdLendingCB cb = newMyConditionBean();
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
     * LdLending lending = new LdLending();
     * lending.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * lending.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//lending.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//lending.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//lending.setVersionNo(value);</span>
     * lendingBhv.<span style="color: #FD4747">updateNonstrict</span>(lending);
     * </pre>
     * @param lending The entity of update target. (NotNull, PrimaryKeyNotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void updateNonstrict(final LdLending lending) {
        doUpdateNonstrict(lending, null);
    }

    protected void doUpdateNonstrict(LdLending lending, final UpdateOption<LdLendingCB> option) {
        assertObjectNotNull("lending", lending);
        prepareUpdateOption(option);
        helpUpdateNonstrictInternally(lending, new InternalUpdateNonstrictCallback<LdLending>() {
            public int callbackDelegateUpdateNonstrict(LdLending entity) { return delegateUpdateNonstrict(entity, option); } });
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
     * @param lending The entity of insert or update target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(LdLending lending) {
        doInesrtOrUpdate(lending, null, null);
    }

    protected void doInesrtOrUpdate(LdLending lending, final InsertOption<LdLendingCB> insertOption, final UpdateOption<LdLendingCB> updateOption) {
        helpInsertOrUpdateInternally(lending, new InternalInsertOrUpdateCallback<LdLending, LdLendingCB>() {
            public void callbackInsert(LdLending entity) { doInsert(entity, insertOption); }
            public void callbackUpdate(LdLending entity) { doUpdate(entity, updateOption); }
            public LdLendingCB callbackNewMyConditionBean() { return newMyConditionBean(); }
            public int callbackSelectCount(LdLendingCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrModify(Entity entity, InsertOption<? extends ConditionBean> insertOption,
            UpdateOption<? extends ConditionBean> updateOption) {
        if (insertOption == null && updateOption == null) { insertOrUpdate(downcast(entity)); }
        else {
            insertOption = insertOption == null ? new InsertOption<LdLendingCB>() : insertOption;
            updateOption = updateOption == null ? new UpdateOption<LdLendingCB>() : updateOption;
            varyingInsertOrUpdate(downcast(entity), downcast(insertOption), downcast(updateOption));
        }
    }

    /**
     * Insert or update the entity non-strictly modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br />
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() }
     * <p><span style="color: #FD4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param lending The entity of insert or update target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdateNonstrict(LdLending lending) {
        doInesrtOrUpdateNonstrict(lending, null, null);
    }

    protected void doInesrtOrUpdateNonstrict(LdLending lending, final InsertOption<LdLendingCB> insertOption, final UpdateOption<LdLendingCB> updateOption) {
        helpInsertOrUpdateInternally(lending, new InternalInsertOrUpdateNonstrictCallback<LdLending>() {
            public void callbackInsert(LdLending entity) { doInsert(entity, insertOption); }
            public void callbackUpdateNonstrict(LdLending entity) { doUpdateNonstrict(entity, updateOption); }
        });
    }

    @Override
    protected void doCreateOrModifyNonstrict(Entity entity, InsertOption<? extends ConditionBean> insertOption,
            UpdateOption<? extends ConditionBean> updateOption) {
        if (insertOption == null && updateOption == null) { insertOrUpdateNonstrict(downcast(entity)); }
        else {
            insertOption = insertOption == null ? new InsertOption<LdLendingCB>() : insertOption;
            updateOption = updateOption == null ? new UpdateOption<LdLendingCB>() : updateOption;
            varyingInsertOrUpdateNonstrict(downcast(entity), downcast(insertOption), downcast(updateOption));
        }
    }

    /**
     * Delete the entity. (ZeroUpdateException, ExclusiveControl)
     * <pre>
     * LdLending lending = new LdLending();
     * lending.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * lending.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     lendingBhv.<span style="color: #FD4747">delete</span>(lending);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * } 
     * </pre>
     * @param lending The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(LdLending lending) {
        doDelete(lending, null);
    }

    protected void doDelete(LdLending lending, final DeleteOption<LdLendingCB> option) {
        assertObjectNotNull("lending", lending);
        prepareDeleteOption(option);
        helpDeleteInternally(lending, new InternalDeleteCallback<LdLending>() {
            public int callbackDelegateDelete(LdLending entity) { return delegateDelete(entity, option); } });
    }

    protected void prepareDeleteOption(DeleteOption<LdLendingCB> option) {
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
     * LdLending lending = new LdLending();
     * lending.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//lending.setVersionNo(value);</span>
     * lendingBhv.<span style="color: #FD4747">deleteNonstrict</span>(lending);
     * </pre>
     * @param lending The entity of delete target. (NotNull, PrimaryKeyNotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrict(LdLending lending) {
        doDeleteNonstrict(lending, null);
    }

    protected void doDeleteNonstrict(LdLending lending, final DeleteOption<LdLendingCB> option) {
        assertObjectNotNull("lending", lending);
        prepareDeleteOption(option);
        helpDeleteNonstrictInternally(lending, new InternalDeleteNonstrictCallback<LdLending>() {
            public int callbackDelegateDeleteNonstrict(LdLending entity) { return delegateDeleteNonstrict(entity, option); } });
    }

    /**
     * Delete the entity non-strictly ignoring deleted. {ZeroUpdateException, NonExclusiveControl}
     * <pre>
     * LdLending lending = new LdLending();
     * lending.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//lending.setVersionNo(value);</span>
     * lendingBhv.<span style="color: #FD4747">deleteNonstrictIgnoreDeleted</span>(lending);
     * <span style="color: #3F7E5E">// if the target entity doesn't exist, no exception</span>
     * </pre>
     * @param lending The entity of delete target. (NotNull, PrimaryKeyNotNull)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrictIgnoreDeleted(LdLending lending) {
        doDeleteNonstrictIgnoreDeleted(lending, null);
    }

    protected void doDeleteNonstrictIgnoreDeleted(LdLending lending, final DeleteOption<LdLendingCB> option) {
        assertObjectNotNull("lending", lending);
        prepareDeleteOption(option);
        helpDeleteNonstrictIgnoreDeletedInternally(lending, new InternalDeleteNonstrictIgnoreDeletedCallback<LdLending>() {
            public int callbackDelegateDeleteNonstrict(LdLending entity) { return delegateDeleteNonstrict(entity, option); } });
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
     *     LdLending lending = new LdLending();
     *     lending.setFooName("foo");
     *     if (...) {
     *         lending.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     lendingList.add(lending);
     * }
     * lendingBhv.<span style="color: #FD4747">batchInsert</span>(lendingList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param lendingList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<LdLending> lendingList) {
        InsertOption<LdLendingCB> option = createInsertUpdateOption();
        return doBatchInsert(lendingList, option);
    }

    protected int[] doBatchInsert(List<LdLending> lendingList, InsertOption<LdLendingCB> option) {
        assertObjectNotNull("lendingList", lendingList);
        prepareBatchInsertOption(lendingList, option);
        return delegateBatchInsert(lendingList, option);
    }

    protected void prepareBatchInsertOption(List<LdLending> lendingList, InsertOption<LdLendingCB> option) {
        option.xallowInsertColumnModifiedPropertiesFragmented();
        option.xacceptInsertColumnModifiedPropertiesIfNeeds(lendingList);
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
     *     LdLending lending = new LdLending();
     *     lending.setFooName("foo");
     *     if (...) {
     *         lending.setFooPrice(123);
     *     } else {
     *         lending.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//lending.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     lendingList.add(lending);
     * }
     * lendingBhv.<span style="color: #FD4747">batchUpdate</span>(lendingList);
     * </pre>
     * @param lendingList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<LdLending> lendingList) {
        UpdateOption<LdLendingCB> option = createPlainUpdateOption();
        return doBatchUpdate(lendingList, option);
    }

    protected int[] doBatchUpdate(List<LdLending> lendingList, UpdateOption<LdLendingCB> option) {
        assertObjectNotNull("lendingList", lendingList);
        prepareBatchUpdateOption(lendingList, option);
        return delegateBatchUpdate(lendingList, option);
    }

    protected void prepareBatchUpdateOption(List<LdLending> lendingList, UpdateOption<LdLendingCB> option) {
        option.xacceptUpdateColumnModifiedPropertiesIfNeeds(lendingList);
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
     * lendingBhv.<span style="color: #FD4747">batchUpdate</span>(lendingList, new SpecifyQuery<LdLendingCB>() {
     *     public void specify(LdLendingCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #FD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #FD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span> 
     * lendingBhv.<span style="color: #FD4747">batchUpdate</span>(lendingList, new SpecifyQuery<LdLendingCB>() {
     *     public void specify(LdLendingCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #FD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param lendingList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<LdLending> lendingList, SpecifyQuery<LdLendingCB> updateColumnSpec) {
        return doBatchUpdate(lendingList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    /**
     * Batch-update the entity list non-strictly modified-only of same-set columns. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <span style="color: #FD4747; font-size: 140%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     LdLending lending = new LdLending();
     *     lending.setFooName("foo");
     *     if (...) {
     *         lending.setFooPrice(123);
     *     } else {
     *         lending.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//lending.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     lendingList.add(lending);
     * }
     * lendingBhv.<span style="color: #FD4747">batchUpdate</span>(lendingList);
     * </pre>
     * @param lendingList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<LdLending> lendingList) {
        UpdateOption<LdLendingCB> option = createPlainUpdateOption();
        return doBatchUpdateNonstrict(lendingList, option);
    }

    protected int[] doBatchUpdateNonstrict(List<LdLending> lendingList, UpdateOption<LdLendingCB> option) {
        assertObjectNotNull("lendingList", lendingList);
        prepareBatchUpdateOption(lendingList, option);
        return delegateBatchUpdateNonstrict(lendingList, option);
    }

    /**
     * Batch-update the entity list non-strictly specified-only. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span> 
     * lendingBhv.<span style="color: #FD4747">batchUpdateNonstrict</span>(lendingList, new SpecifyQuery<LdLendingCB>() {
     *     public void specify(LdLendingCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #FD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #FD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span> 
     * lendingBhv.<span style="color: #FD4747">batchUpdateNonstrict</span>(lendingList, new SpecifyQuery<LdLendingCB>() {
     *     public void specify(LdLendingCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #FD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).</p>
     * @param lendingList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<LdLending> lendingList, SpecifyQuery<LdLendingCB> updateColumnSpec) {
        return doBatchUpdateNonstrict(lendingList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> option) {
        if (option == null) { return batchUpdateNonstrict(downcast(ls)); }
        else { return varyingBatchUpdateNonstrict(downcast(ls), downcast(option)); }
    }

    /**
     * Batch-delete the entity list. (ExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param lendingList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchDelete(List<LdLending> lendingList) {
        return doBatchDelete(lendingList, null);
    }

    protected int[] doBatchDelete(List<LdLending> lendingList, DeleteOption<LdLendingCB> option) {
        assertObjectNotNull("lendingList", lendingList);
        prepareDeleteOption(option);
        return delegateBatchDelete(lendingList, option);
    }

    @Override
    protected int[] doLumpRemove(List<Entity> ls, DeleteOption<? extends ConditionBean> option) {
        if (option == null) { return batchDelete(downcast(ls)); }
        else { return varyingBatchDelete(downcast(ls), downcast(option)); }
    }

    /**
     * Batch-delete the entity list non-strictly. {NonExclusiveControl} <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param lendingList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDeleteNonstrict(List<LdLending> lendingList) {
        return doBatchDeleteNonstrict(lendingList, null);
    }

    protected int[] doBatchDeleteNonstrict(List<LdLending> lendingList, DeleteOption<LdLendingCB> option) {
        assertObjectNotNull("lendingList", lendingList);
        prepareDeleteOption(option);
        return delegateBatchDeleteNonstrict(lendingList, option);
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
     * lendingBhv.<span style="color: #FD4747">queryInsert</span>(new QueryInsertSetupper&lt;LdLending, LdLendingCB&gt;() {
     *     public ConditionBean setup(lending entity, LdLendingCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<LdLending, LdLendingCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(QueryInsertSetupper<LdLending, LdLendingCB> setupper, InsertOption<LdLendingCB> option) {
        assertObjectNotNull("setupper", setupper);
        prepareInsertOption(option);
        LdLending entity = new LdLending();
        LdLendingCB intoCB = createCBForQueryInsert();
        ConditionBean resourceCB = setupper.setup(entity, intoCB);
        return delegateQueryInsert(entity, intoCB, resourceCB, option);
    }

    protected LdLendingCB createCBForQueryInsert() {
        LdLendingCB cb = newMyConditionBean();
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
     * LdLending lending = new LdLending();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//lending.setPK...(value);</span>
     * lending.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//lending.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//lending.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//lending.setVersionNo(value);</span>
     * LdLendingCB cb = new LdLendingCB();
     * cb.query().setFoo...(value);
     * lendingBhv.<span style="color: #FD4747">queryUpdate</span>(lending, cb);
     * </pre>
     * @param lending The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of LdLending. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(LdLending lending, LdLendingCB cb) {
        return doQueryUpdate(lending, cb, null);
    }

    protected int doQueryUpdate(LdLending lending, LdLendingCB cb, UpdateOption<LdLendingCB> option) {
        assertObjectNotNull("lending", lending); assertCBStateValid(cb);
        prepareUpdateOption(option);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryUpdate(lending, cb, option) : 0;
    }

    @Override
    protected int doRangeModify(Entity entity, ConditionBean cb, UpdateOption<? extends ConditionBean> option) {
        if (option == null) { return queryUpdate(downcast(entity), (LdLendingCB)cb); }
        else { return varyingQueryUpdate(downcast(entity), (LdLendingCB)cb, downcast(option)); }
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * LdLendingCB cb = new LdLendingCB();
     * cb.query().setFoo...(value);
     * lendingBhv.<span style="color: #FD4747">queryDelete</span>(lending, cb);
     * </pre>
     * @param cb The condition-bean of LdLending. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(LdLendingCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(LdLendingCB cb, DeleteOption<LdLendingCB> option) {
        assertCBStateValid(cb);
        prepareDeleteOption(option);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryDelete(cb, option) : 0;
    }

    @Override
    protected int doRangeRemove(ConditionBean cb, DeleteOption<? extends ConditionBean> option) {
        if (option == null) { return queryDelete((LdLendingCB)cb); }
        else { return varyingQueryDelete((LdLendingCB)cb, downcast(option)); }
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
     * LdLending lending = new LdLending();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * lending.setFoo...(value);
     * lending.setBar...(value);
     * InsertOption<LdLendingCB> option = new InsertOption<LdLendingCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * lendingBhv.<span style="color: #FD4747">varyingInsert</span>(lending, option);
     * ... = lending.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param lending The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(LdLending lending, InsertOption<LdLendingCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(lending, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, ExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * LdLending lending = new LdLending();
     * lending.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * lending.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * lending.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;LdLendingCB&gt; option = new UpdateOption&lt;LdLendingCB&gt;();
     *     option.self(new SpecifyQuery&lt;LdLendingCB&gt;() {
     *         public void specify(LdLendingCB cb) {
     *             cb.specify().<span style="color: #FD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     lendingBhv.<span style="color: #FD4747">varyingUpdate</span>(lending, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param lending The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(LdLending lending, UpdateOption<LdLendingCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(lending, option);
    }

    /**
     * Update the entity with varying requests non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as updateNonstrict(entity).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * LdLending lending = new LdLending();
     * lending.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * lending.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//lending.setVersionNo(value);</span>
     * UpdateOption&lt;LdLendingCB&gt; option = new UpdateOption&lt;LdLendingCB&gt;();
     * option.self(new SpecifyQuery&lt;LdLendingCB&gt;() {
     *     public void specify(LdLendingCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * lendingBhv.<span style="color: #FD4747">varyingUpdateNonstrict</span>(lending, option);
     * </pre>
     * @param lending The entity of update target. (NotNull, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdateNonstrict(LdLending lending, UpdateOption<LdLendingCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdateNonstrict(lending, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param lending The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(LdLending lending, InsertOption<LdLendingCB> insertOption, UpdateOption<LdLendingCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdate(lending, insertOption, updateOption);
    }

    /**
     * Insert or update the entity with varying requests non-strictly. (NonExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdateNonstrict(entity).
     * @param lending The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdateNonstrict(LdLending lending, InsertOption<LdLendingCB> insertOption, UpdateOption<LdLendingCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdateNonstrict(lending, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, ExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param lending The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(LdLending lending, DeleteOption<LdLendingCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(lending, option);
    }

    /**
     * Delete the entity with varying requests non-strictly. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as deleteNonstrict(entity).
     * @param lending The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDeleteNonstrict(LdLending lending, DeleteOption<LdLendingCB> option) {
        assertDeleteOptionNotNull(option);
        doDeleteNonstrict(lending, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param lendingList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<LdLending> lendingList, InsertOption<LdLendingCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(lendingList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param lendingList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<LdLending> lendingList, UpdateOption<LdLendingCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(lendingList, option);
    }

    /**
     * Batch-update the list with varying requests non-strictly. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param lendingList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdateNonstrict(List<LdLending> lendingList, UpdateOption<LdLendingCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdateNonstrict(lendingList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param lendingList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<LdLending> lendingList, DeleteOption<LdLendingCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(lendingList, option);
    }

    /**
     * Batch-delete the list with varying requests non-strictly. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDeleteNonstrict(entityList).
     * @param lendingList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDeleteNonstrict(List<LdLending> lendingList, DeleteOption<LdLendingCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDeleteNonstrict(lendingList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<LdLending, LdLendingCB> setupper, InsertOption<LdLendingCB> option) {
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
     * LdLending lending = new LdLending();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//lending.setPK...(value);</span>
     * lending.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//lending.setVersionNo(value);</span>
     * LdLendingCB cb = new LdLendingCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;LdLendingCB&gt; option = new UpdateOption&lt;LdLendingCB&gt;();
     * option.self(new SpecifyQuery&lt;LdLendingCB&gt;() {
     *     public void specify(LdLendingCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * lendingBhv.<span style="color: #FD4747">varyingQueryUpdate</span>(lending, cb, option);
     * </pre>
     * @param lending The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of LdLending. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(LdLending lending, LdLendingCB cb, UpdateOption<LdLendingCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(lending, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of LdLending. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(LdLendingCB cb, DeleteOption<LdLendingCB> option) {
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
    public OutsideSqlBasicExecutor<LdLendingBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCountUniquely(LdLendingCB cb) { return invoke(createSelectCountCBCommand(cb, true)); }
    protected int delegateSelectCountPlainly(LdLendingCB cb) { return invoke(createSelectCountCBCommand(cb, false)); }
    protected <ENTITY extends LdLending> void delegateSelectCursor(LdLendingCB cb, EntityRowHandler<ENTITY> erh, Class<ENTITY> et)
    { invoke(createSelectCursorCBCommand(cb, erh, et)); }
    protected <ENTITY extends LdLending> List<ENTITY> delegateSelectList(LdLendingCB cb, Class<ENTITY> et)
    { return invoke(createSelectListCBCommand(cb, et)); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(LdLending e, InsertOption<LdLendingCB> op)
    { if (!processBeforeInsert(e, op)) { return 0; }
      return invoke(createInsertEntityCommand(e, op)); }
    protected int delegateUpdate(LdLending e, UpdateOption<LdLendingCB> op)
    { if (!processBeforeUpdate(e, op)) { return 0; }
      return invoke(createUpdateEntityCommand(e, op)); }
    protected int delegateUpdateNonstrict(LdLending e, UpdateOption<LdLendingCB> op)
    { if (!processBeforeUpdate(e, op)) { return 0; }
      return invoke(createUpdateNonstrictEntityCommand(e, op)); }
    protected int delegateDelete(LdLending e, DeleteOption<LdLendingCB> op)
    { if (!processBeforeDelete(e, op)) { return 0; }
      return invoke(createDeleteEntityCommand(e, op)); }
    protected int delegateDeleteNonstrict(LdLending e, DeleteOption<LdLendingCB> op)
    { if (!processBeforeDelete(e, op)) { return 0; }
      return invoke(createDeleteNonstrictEntityCommand(e, op)); }

    protected int[] delegateBatchInsert(List<LdLending> ls, InsertOption<LdLendingCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchInsertCommand(processBatchInternally(ls, op), op)); }
    protected int[] delegateBatchUpdate(List<LdLending> ls, UpdateOption<LdLendingCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateCommand(processBatchInternally(ls, op, false), op)); }
    protected int[] delegateBatchUpdateNonstrict(List<LdLending> ls, UpdateOption<LdLendingCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateNonstrictCommand(processBatchInternally(ls, op, true), op)); }
    protected int[] delegateBatchDelete(List<LdLending> ls, DeleteOption<LdLendingCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteCommand(processBatchInternally(ls, op, false), op)); }
    protected int[] delegateBatchDeleteNonstrict(List<LdLending> ls, DeleteOption<LdLendingCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteNonstrictCommand(processBatchInternally(ls, op, true), op)); }

    protected int delegateQueryInsert(LdLending e, LdLendingCB inCB, ConditionBean resCB, InsertOption<LdLendingCB> op)
    { if (!processBeforeQueryInsert(e, inCB, resCB, op)) { return 0; } return invoke(createQueryInsertCBCommand(e, inCB, resCB, op));  }
    protected int delegateQueryUpdate(LdLending e, LdLendingCB cb, UpdateOption<LdLendingCB> op)
    { if (!processBeforeQueryUpdate(e, cb, op)) { return 0; } return invoke(createQueryUpdateCBCommand(e, cb, op));  }
    protected int delegateQueryDelete(LdLendingCB cb, DeleteOption<LdLendingCB> op)
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
    protected LdLending downcast(Entity entity) {
        return helpEntityDowncastInternally(entity, LdLending.class);
    }

    protected LdLendingCB downcast(ConditionBean cb) {
        return helpConditionBeanDowncastInternally(cb, LdLendingCB.class);
    }

    @SuppressWarnings("unchecked")
    protected List<LdLending> downcast(List<? extends Entity> entityList) {
        return (List<LdLending>)entityList;
    }

    @SuppressWarnings("unchecked")
    protected InsertOption<LdLendingCB> downcast(InsertOption<? extends ConditionBean> option) {
        return (InsertOption<LdLendingCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected UpdateOption<LdLendingCB> downcast(UpdateOption<? extends ConditionBean> option) {
        return (UpdateOption<LdLendingCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected DeleteOption<LdLendingCB> downcast(DeleteOption<? extends ConditionBean> option) {
        return (DeleteOption<LdLendingCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<LdLending, LdLendingCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> option) {
        return (QueryInsertSetupper<LdLending, LdLendingCB>)option;
    }
}
