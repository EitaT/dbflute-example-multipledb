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

    protected <ENTITY extends LdLending> ENTITY doSelectEntity(LdLendingCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectEntityInternally(cb, tp, new InternalSelectEntityCallback<ENTITY, LdLendingCB>() {
            public List<ENTITY> callbackSelectList(LdLendingCB lcb, Class<ENTITY> ltp) { return doSelectList(lcb, ltp); } });
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

    protected <ENTITY extends LdLending> ENTITY doSelectEntityWithDeletedCheck(LdLendingCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectEntityWithDeletedCheckInternally(cb, tp, new InternalSelectEntityWithDeletedCheckCallback<ENTITY, LdLendingCB>() {
            public List<ENTITY> callbackSelectList(LdLendingCB lcb, Class<ENTITY> ltp) { return doSelectList(lcb, ltp); } });
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

    protected <ENTITY extends LdLending> ListResultBean<ENTITY> doSelectList(LdLendingCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        return helpSelectListInternally(cb, tp, new InternalSelectListCallback<ENTITY, LdLendingCB>() {
            public List<ENTITY> callbackSelectList(LdLendingCB lcb, Class<ENTITY> ltp) { return delegateSelectList(lcb, ltp); } });
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

    protected <ENTITY extends LdLending> PagingResultBean<ENTITY> doSelectPage(LdLendingCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectPageInternally(cb, tp, new InternalSelectPageCallback<ENTITY, LdLendingCB>() {
            public int callbackSelectCount(LdLendingCB cb) { return doSelectCountPlainly(cb); }
            public List<ENTITY> callbackSelectList(LdLendingCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); }
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

    protected <ENTITY extends LdLending> void doSelectCursor(LdLendingCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler", handler); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        helpSelectCursorInternally(cb, handler, tp, new InternalSelectCursorCallback<ENTITY, LdLendingCB>() {
            public void callbackSelectCursor(LdLendingCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) { delegateSelectCursor(cb, handler, tp); }
            public List<ENTITY> callbackSelectList(LdLendingCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); }
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

    protected <RESULT, CB extends LdLendingCB> SLFunction<CB, RESULT> doScalarSelect(Class<RESULT> tp, CB cb) {
        assertObjectNotNull("resultType", tp); assertCBStateValid(cb);
        cb.xsetupForScalarSelect(); cb.getSqlClause().disableSelectIndex(); // for when you use union
        return createSLFunction(cb, tp);
    }

    protected <RESULT, CB extends LdLendingCB> SLFunction<CB, RESULT> createSLFunction(CB cb, Class<RESULT> tp) {
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
            public java.util.Map<String, Object> getPKVal(LdLending et) {
                java.util.Map<String, Object> primaryKeyMap = new java.util.LinkedHashMap<String, Object>();
                primaryKeyMap.put("LibraryId", et.getLibraryId());
                primaryKeyMap.put("LbUserId", et.getLbUserId());
                primaryKeyMap.put("LendingDate", et.getLendingDate());
                return primaryKeyMap;
            }
            public void setRfLs(LdLending et, List<LdLendingCollection> ls) { et.setLendingCollectionList(ls); }
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
            public java.util.Map<String, Object> getFKVal(LdLendingCollection re) {
                java.util.Map<String, Object> foreignKeyMap = new java.util.LinkedHashMap<String, Object>();
                foreignKeyMap.put("LibraryId", re.getLibraryId());
                foreignKeyMap.put("LbUserId", re.getLbUserId());
                foreignKeyMap.put("LendingDate", re.getLendingDate());
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
            public LdLibraryUser getFr(LdLending et) { return et.getLibraryUser(); }
            public boolean hasRf() { return true; }
            public void setRfLs(LdLibraryUser et, List<LdLending> ls)
            { et.setLendingList(ls); }
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

    protected void doInsert(LdLending lending, InsertOption<LdLendingCB> op) {
        assertObjectNotNull("lending", lending);
        prepareInsertOption(op);
        delegateInsert(lending, op);
    }

    protected void prepareInsertOption(InsertOption<LdLendingCB> op) {
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

    protected void doUpdate(LdLending lending, final UpdateOption<LdLendingCB> op) {
        assertObjectNotNull("lending", lending);
        prepareUpdateOption(op);
        helpUpdateInternally(lending, new InternalUpdateCallback<LdLending>() {
            public int callbackDelegateUpdate(LdLending et) { return delegateUpdate(et, op); } });
    }

    protected void prepareUpdateOption(UpdateOption<LdLendingCB> op) {
        if (op == null) { return; }
        assertUpdateOptionStatus(op);
        if (op.hasSelfSpecification()) {
            op.resolveSelfSpecification(createCBForVaryingUpdate());
        }
        if (op.hasSpecifiedUpdateColumn()) {
            op.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate());
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
    protected void doModify(Entity et, UpdateOption<? extends ConditionBean> op) {
        if (op == null) { update(downcast(et)); }
        else { varyingUpdate(downcast(et), downcast(op)); }
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

    protected void doUpdateNonstrict(LdLending lending, final UpdateOption<LdLendingCB> op) {
        assertObjectNotNull("lending", lending);
        prepareUpdateOption(op);
        helpUpdateNonstrictInternally(lending, new InternalUpdateNonstrictCallback<LdLending>() {
            public int callbackDelegateUpdateNonstrict(LdLending et) { return delegateUpdateNonstrict(et, op); } });
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
     * @param lending The entity of insert or update target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(LdLending lending) {
        doInesrtOrUpdate(lending, null, null);
    }

    protected void doInesrtOrUpdate(LdLending lending, final InsertOption<LdLendingCB> iop, final UpdateOption<LdLendingCB> uop) {
        helpInsertOrUpdateInternally(lending, new InternalInsertOrUpdateCallback<LdLending, LdLendingCB>() {
            public void callbackInsert(LdLending et) { doInsert(et, iop); }
            public void callbackUpdate(LdLending et) { doUpdate(et, uop); }
            public LdLendingCB callbackNewMyConditionBean() { return newMyConditionBean(); }
            public int callbackSelectCount(LdLendingCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrModify(Entity et, InsertOption<? extends ConditionBean> iop, UpdateOption<? extends ConditionBean> uop) {
        if (iop == null && uop == null) { insertOrUpdate(downcast(et)); }
        else {
            iop = iop != null ? iop : new InsertOption<LdLendingCB>();
            uop = uop != null ? uop : new UpdateOption<LdLendingCB>();
            varyingInsertOrUpdate(downcast(et), downcast(iop), downcast(uop));
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

    protected void doInesrtOrUpdateNonstrict(LdLending lending, final InsertOption<LdLendingCB> iop, final UpdateOption<LdLendingCB> uop) {
        helpInsertOrUpdateInternally(lending, new InternalInsertOrUpdateNonstrictCallback<LdLending>() {
            public void callbackInsert(LdLending et) { doInsert(et, iop); }
            public void callbackUpdateNonstrict(LdLending et) { doUpdateNonstrict(et, uop); }
        });
    }

    @Override
    protected void doCreateOrModifyNonstrict(Entity et, InsertOption<? extends ConditionBean> iop, UpdateOption<? extends ConditionBean> uop) {
        if (iop == null && uop == null) { insertOrUpdateNonstrict(downcast(et)); }
        else {
            iop = iop != null ? iop : new InsertOption<LdLendingCB>();
            uop = uop != null ? uop : new UpdateOption<LdLendingCB>();
            varyingInsertOrUpdateNonstrict(downcast(et), downcast(iop), downcast(uop));
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

    protected void doDelete(LdLending lending, final DeleteOption<LdLendingCB> op) {
        assertObjectNotNull("lending", lending);
        prepareDeleteOption(op);
        helpDeleteInternally(lending, new InternalDeleteCallback<LdLending>() {
            public int callbackDelegateDelete(LdLending et) { return delegateDelete(et, op); } });
    }

    protected void prepareDeleteOption(DeleteOption<LdLendingCB> op) {
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

    protected void doDeleteNonstrict(LdLending lending, final DeleteOption<LdLendingCB> op) {
        assertObjectNotNull("lending", lending);
        prepareDeleteOption(op);
        helpDeleteNonstrictInternally(lending, new InternalDeleteNonstrictCallback<LdLending>() {
            public int callbackDelegateDeleteNonstrict(LdLending et) { return delegateDeleteNonstrict(et, op); } });
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

    protected void doDeleteNonstrictIgnoreDeleted(LdLending lending, final DeleteOption<LdLendingCB> op) {
        assertObjectNotNull("lending", lending);
        prepareDeleteOption(op);
        helpDeleteNonstrictIgnoreDeletedInternally(lending, new InternalDeleteNonstrictIgnoreDeletedCallback<LdLending>() {
            public int callbackDelegateDeleteNonstrict(LdLending et) { return delegateDeleteNonstrict(et, op); } });
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
        InsertOption<LdLendingCB> op = createInsertUpdateOption();
        return doBatchInsert(lendingList, op);
    }

    protected int[] doBatchInsert(List<LdLending> lendingList, InsertOption<LdLendingCB> op) {
        assertObjectNotNull("lendingList", lendingList);
        prepareBatchInsertOption(lendingList, op);
        return delegateBatchInsert(lendingList, op);
    }

    protected void prepareBatchInsertOption(List<LdLending> lendingList, InsertOption<LdLendingCB> op) {
        op.xallowInsertColumnModifiedPropertiesFragmented();
        op.xacceptInsertColumnModifiedPropertiesIfNeeds(lendingList);
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
        UpdateOption<LdLendingCB> op = createPlainUpdateOption();
        return doBatchUpdate(lendingList, op);
    }

    protected int[] doBatchUpdate(List<LdLending> lendingList, UpdateOption<LdLendingCB> op) {
        assertObjectNotNull("lendingList", lendingList);
        prepareBatchUpdateOption(lendingList, op);
        return delegateBatchUpdate(lendingList, op);
    }

    protected void prepareBatchUpdateOption(List<LdLending> lendingList, UpdateOption<LdLendingCB> op) {
        op.xacceptUpdateColumnModifiedPropertiesIfNeeds(lendingList);
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

    protected int[] doBatchUpdateNonstrict(List<LdLending> lendingList, UpdateOption<LdLendingCB> op) {
        assertObjectNotNull("lendingList", lendingList);
        prepareBatchUpdateOption(lendingList, op);
        return delegateBatchUpdateNonstrict(lendingList, op);
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
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> op) {
        if (op == null) { return batchUpdateNonstrict(downcast(ls)); }
        else { return varyingBatchUpdateNonstrict(downcast(ls), downcast(op)); }
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

    protected int[] doBatchDelete(List<LdLending> lendingList, DeleteOption<LdLendingCB> op) {
        assertObjectNotNull("lendingList", lendingList);
        prepareDeleteOption(op);
        return delegateBatchDelete(lendingList, op);
    }

    @Override
    protected int[] doLumpRemove(List<Entity> ls, DeleteOption<? extends ConditionBean> op) {
        if (op == null) { return batchDelete(downcast(ls)); }
        else { return varyingBatchDelete(downcast(ls), downcast(op)); }
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

    protected int[] doBatchDeleteNonstrict(List<LdLending> lendingList, DeleteOption<LdLendingCB> op) {
        assertObjectNotNull("lendingList", lendingList);
        prepareDeleteOption(op);
        return delegateBatchDeleteNonstrict(lendingList, op);
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

    protected int doQueryInsert(QueryInsertSetupper<LdLending, LdLendingCB> sp, InsertOption<LdLendingCB> op) {
        assertObjectNotNull("setupper", sp);
        prepareInsertOption(op);
        LdLending e = new LdLending();
        LdLendingCB cb = createCBForQueryInsert();
        return delegateQueryInsert(e, cb, sp.setup(e, cb), op);
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

    protected int doQueryUpdate(LdLending lending, LdLendingCB cb, UpdateOption<LdLendingCB> op) {
        assertObjectNotNull("lending", lending); assertCBStateValid(cb);
        prepareUpdateOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryUpdate(lending, cb, op) : 0;
    }

    @Override
    protected int doRangeModify(Entity et, ConditionBean cb, UpdateOption<? extends ConditionBean> op) {
        if (op == null) { return queryUpdate(downcast(et), (LdLendingCB)cb); }
        else { return varyingQueryUpdate(downcast(et), (LdLendingCB)cb, downcast(op)); }
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

    protected int doQueryDelete(LdLendingCB cb, DeleteOption<LdLendingCB> op) {
        assertCBStateValid(cb);
        prepareDeleteOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryDelete(cb, op) : 0;
    }

    @Override
    protected int doRangeRemove(ConditionBean cb, DeleteOption<? extends ConditionBean> op) {
        if (op == null) { return queryDelete((LdLendingCB)cb); }
        else { return varyingQueryDelete((LdLendingCB)cb, downcast(op)); }
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
    protected <ENTITY extends LdLending> void delegateSelectCursor(LdLendingCB cb, EntityRowHandler<ENTITY> rh, Class<ENTITY> tp)
    { invoke(createSelectCursorCBCommand(cb, rh, tp)); }
    protected <ENTITY extends LdLending> List<ENTITY> delegateSelectList(LdLendingCB cb, Class<ENTITY> tp)
    { return invoke(createSelectListCBCommand(cb, tp)); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(LdLending et, InsertOption<LdLendingCB> op)
    { if (!processBeforeInsert(et, op)) { return 0; }
      return invoke(createInsertEntityCommand(et, op)); }
    protected int delegateUpdate(LdLending et, UpdateOption<LdLendingCB> op)
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return invoke(createUpdateEntityCommand(et, op)); }
    protected int delegateUpdateNonstrict(LdLending et, UpdateOption<LdLendingCB> op)
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return invoke(createUpdateNonstrictEntityCommand(et, op)); }
    protected int delegateDelete(LdLending et, DeleteOption<LdLendingCB> op)
    { if (!processBeforeDelete(et, op)) { return 0; }
      return invoke(createDeleteEntityCommand(et, op)); }
    protected int delegateDeleteNonstrict(LdLending et, DeleteOption<LdLendingCB> op)
    { if (!processBeforeDelete(et, op)) { return 0; }
      return invoke(createDeleteNonstrictEntityCommand(et, op)); }

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

    protected int delegateQueryInsert(LdLending et, LdLendingCB inCB, ConditionBean resCB, InsertOption<LdLendingCB> op)
    { if (!processBeforeQueryInsert(et, inCB, resCB, op)) { return 0; } return invoke(createQueryInsertCBCommand(et, inCB, resCB, op));  }
    protected int delegateQueryUpdate(LdLending et, LdLendingCB cb, UpdateOption<LdLendingCB> op)
    { if (!processBeforeQueryUpdate(et, cb, op)) { return 0; } return invoke(createQueryUpdateCBCommand(et, cb, op));  }
    protected int delegateQueryDelete(LdLendingCB cb, DeleteOption<LdLendingCB> op)
    { if (!processBeforeQueryDelete(cb, op)) { return 0; } return invoke(createQueryDeleteCBCommand(cb, op));  }

    // ===================================================================================
    //                                                                     Filter Override
    //                                                                     ===============
    @Override
    protected void filterEntityOfInsert(Entity tgt, InsertOption<? extends ConditionBean> op) {
        super.filterEntityOfInsert(tgt, op);
        LdLending et = downcast(tgt);
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
    protected LdLending downcast(Entity et) {
        return helpEntityDowncastInternally(et, LdLending.class);
    }

    protected LdLendingCB downcast(ConditionBean cb) {
        return helpConditionBeanDowncastInternally(cb, LdLendingCB.class);
    }

    @SuppressWarnings("unchecked")
    protected List<LdLending> downcast(List<? extends Entity> ls) {
        return (List<LdLending>)ls;
    }

    @SuppressWarnings("unchecked")
    protected InsertOption<LdLendingCB> downcast(InsertOption<? extends ConditionBean> op) {
        return (InsertOption<LdLendingCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected UpdateOption<LdLendingCB> downcast(UpdateOption<? extends ConditionBean> op) {
        return (UpdateOption<LdLendingCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected DeleteOption<LdLendingCB> downcast(DeleteOption<? extends ConditionBean> op) {
        return (DeleteOption<LdLendingCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<LdLending, LdLendingCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> sp) {
        return (QueryInsertSetupper<LdLending, LdLendingCB>)sp;
    }
}
