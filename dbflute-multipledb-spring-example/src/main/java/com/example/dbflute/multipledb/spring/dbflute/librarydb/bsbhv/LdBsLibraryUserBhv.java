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
 * The behavior of LIBRARY_USER as TABLE. <br />
 * <pre>
 * [primary key]
 *     LIBRARY_ID, LB_USER_ID
 *
 * [column]
 *     LIBRARY_ID, LB_USER_ID, R_USER, R_MODULE, R_TIMESTAMP, U_USER, U_MODULE, U_TIMESTAMP
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
 *     LB_USER, LIBRARY
 *
 * [referrer table]
 *     LENDING, LENDING_COLLECTION
 *
 * [foreign property]
 *     lbUser, library
 *
 * [referrer property]
 *     lendingList, lendingCollectionList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class LdBsLibraryUserBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "LIBRARY_USER"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public DBMeta getDBMeta() { return LdLibraryUserDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public LdLibraryUserDbm getMyDBMeta() { return LdLibraryUserDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public Entity newEntity() { return newMyEntity(); }

    /** {@inheritDoc} */
    public ConditionBean newConditionBean() { return newMyConditionBean(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public LdLibraryUser newMyEntity() { return new LdLibraryUser(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public LdLibraryUserCB newMyConditionBean() { return new LdLibraryUserCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * LdLibraryUserCB cb = new LdLibraryUserCB();
     * cb.query().setFoo...(value);
     * int count = libraryUserBhv.<span style="color: #FD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of LdLibraryUser. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(LdLibraryUserCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(LdLibraryUserCB cb) { // called by selectCount(cb)
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(LdLibraryUserCB cb) { // called by selectPage(cb)
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
     * LdLibraryUserCB cb = new LdLibraryUserCB();
     * cb.query().setFoo...(value);
     * LdLibraryUser libraryUser = libraryUserBhv.<span style="color: #FD4747">selectEntity</span>(cb);
     * if (libraryUser != null) {
     *     ... = libraryUser.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of LdLibraryUser. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public LdLibraryUser selectEntity(LdLibraryUserCB cb) {
        return doSelectEntity(cb, LdLibraryUser.class);
    }

    protected <ENTITY extends LdLibraryUser> ENTITY doSelectEntity(final LdLibraryUserCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb);
        return helpSelectEntityInternally(cb, tp, new InternalSelectEntityCallback<ENTITY, LdLibraryUserCB>() {
            public List<ENTITY> callbackSelectList(LdLibraryUserCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); } });
    }

    @Override
    protected Entity doReadEntity(ConditionBean cb) {
        return selectEntity(downcast(cb));
    }

    /**
     * Select the entity by the condition-bean with deleted check.
     * <pre>
     * LdLibraryUserCB cb = new LdLibraryUserCB();
     * cb.query().setFoo...(value);
     * LdLibraryUser libraryUser = libraryUserBhv.<span style="color: #FD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = libraryUser.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of LdLibraryUser. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public LdLibraryUser selectEntityWithDeletedCheck(LdLibraryUserCB cb) {
        return doSelectEntityWithDeletedCheck(cb, LdLibraryUser.class);
    }

    protected <ENTITY extends LdLibraryUser> ENTITY doSelectEntityWithDeletedCheck(final LdLibraryUserCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb);
        return helpSelectEntityWithDeletedCheckInternally(cb, tp, new InternalSelectEntityWithDeletedCheckCallback<ENTITY, LdLibraryUserCB>() {
            public List<ENTITY> callbackSelectList(LdLibraryUserCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); } });
    }

    @Override
    protected Entity doReadEntityWithDeletedCheck(ConditionBean cb) {
        return selectEntityWithDeletedCheck(downcast(cb));
    }

    /**
     * Select the entity by the primary-key value.
     * @param libraryId The one of primary key. (NotNull)
     * @param lbUserId The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public LdLibraryUser selectByPKValue(Integer libraryId, Integer lbUserId) {
        return doSelectByPKValue(libraryId, lbUserId, LdLibraryUser.class);
    }

    protected <ENTITY extends LdLibraryUser> ENTITY doSelectByPKValue(Integer libraryId, Integer lbUserId, Class<ENTITY> entityType) {
        return doSelectEntity(buildPKCB(libraryId, lbUserId), entityType);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param libraryId The one of primary key. (NotNull)
     * @param lbUserId The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public LdLibraryUser selectByPKValueWithDeletedCheck(Integer libraryId, Integer lbUserId) {
        return doSelectByPKValueWithDeletedCheck(libraryId, lbUserId, LdLibraryUser.class);
    }

    protected <ENTITY extends LdLibraryUser> ENTITY doSelectByPKValueWithDeletedCheck(Integer libraryId, Integer lbUserId, Class<ENTITY> entityType) {
        return doSelectEntityWithDeletedCheck(buildPKCB(libraryId, lbUserId), entityType);
    }

    private LdLibraryUserCB buildPKCB(Integer libraryId, Integer lbUserId) {
        assertObjectNotNull("libraryId", libraryId);assertObjectNotNull("lbUserId", lbUserId);
        LdLibraryUserCB cb = newMyConditionBean();
        cb.query().setLibraryId_Equal(libraryId);cb.query().setLbUserId_Equal(lbUserId);
        return cb;
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * LdLibraryUserCB cb = new LdLibraryUserCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;LdLibraryUser&gt; libraryUserList = libraryUserBhv.<span style="color: #FD4747">selectList</span>(cb);
     * for (LdLibraryUser libraryUser : libraryUserList) {
     *     ... = libraryUser.get...();
     * }
     * </pre>
     * @param cb The condition-bean of LdLibraryUser. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<LdLibraryUser> selectList(LdLibraryUserCB cb) {
        return doSelectList(cb, LdLibraryUser.class);
    }

    protected <ENTITY extends LdLibraryUser> ListResultBean<ENTITY> doSelectList(LdLibraryUserCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        return helpSelectListInternally(cb, tp, new InternalSelectListCallback<ENTITY, LdLibraryUserCB>() {
            public List<ENTITY> callbackSelectList(LdLibraryUserCB cb, Class<ENTITY> tp) { return delegateSelectList(cb, tp); } });
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
     * LdLibraryUserCB cb = new LdLibraryUserCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #FD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;LdLibraryUser&gt; page = libraryUserBhv.<span style="color: #FD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (LdLibraryUser libraryUser : page) {
     *     ... = libraryUser.get...();
     * }
     * </pre>
     * @param cb The condition-bean of LdLibraryUser. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<LdLibraryUser> selectPage(LdLibraryUserCB cb) {
        return doSelectPage(cb, LdLibraryUser.class);
    }

    protected <ENTITY extends LdLibraryUser> PagingResultBean<ENTITY> doSelectPage(LdLibraryUserCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectPageInternally(cb, tp, new InternalSelectPageCallback<ENTITY, LdLibraryUserCB>() {
            public int callbackSelectCount(LdLibraryUserCB cb) { return doSelectCountPlainly(cb); }
            public List<ENTITY> callbackSelectList(LdLibraryUserCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); }
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
     * LdLibraryUserCB cb = new LdLibraryUserCB();
     * cb.query().setFoo...(value);
     * libraryUserBhv.<span style="color: #FD4747">selectCursor</span>(cb, new EntityRowHandler&lt;LdLibraryUser&gt;() {
     *     public void handle(LdLibraryUser entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of LdLibraryUser. (NotNull)
     * @param entityRowHandler The handler of entity row of LdLibraryUser. (NotNull)
     */
    public void selectCursor(LdLibraryUserCB cb, EntityRowHandler<LdLibraryUser> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, LdLibraryUser.class);
    }

    protected <ENTITY extends LdLibraryUser> void doSelectCursor(LdLibraryUserCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler", handler); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        helpSelectCursorInternally(cb, handler, tp, new InternalSelectCursorCallback<ENTITY, LdLibraryUserCB>() {
            public void callbackSelectCursor(LdLibraryUserCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) { delegateSelectCursor(cb, handler, tp); }
            public List<ENTITY> callbackSelectList(LdLibraryUserCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); }
        });
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * libraryUserBhv.<span style="color: #FD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(LdLibraryUserCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> SLFunction<LdLibraryUserCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
    }

    protected <RESULT, CB extends LdLibraryUserCB> SLFunction<CB, RESULT> doScalarSelect(Class<RESULT> tp, CB cb) {
        assertObjectNotNull("resultType", tp); assertCBStateValid(cb);
        cb.xsetupForScalarSelect(); cb.getSqlClause().disableSelectIndex(); // for when you use union
        return createSLFunction(cb, tp);
    }

    protected <RESULT, CB extends LdLibraryUserCB> SLFunction<CB, RESULT> createSLFunction(CB cb, Class<RESULT> tp) {
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
     * @param libraryUser The entity of libraryUser. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     */
    public void loadLendingList(LdLibraryUser libraryUser, ConditionBeanSetupper<LdLendingCB> conditionBeanSetupper) {
        xassLRArg(libraryUser, conditionBeanSetupper);
        loadLendingList(xnewLRLs(libraryUser), conditionBeanSetupper);
    }
    /**
     * Load referrer of lendingList with the set-upper for condition-bean of referrer. <br />
     * LENDING by LIBRARY_ID, LB_USER_ID, named 'lendingList'.
     * <pre>
     * libraryUserBhv.<span style="color: #FD4747">loadLendingList</span>(libraryUserList, new ConditionBeanSetupper&lt;LdLendingCB&gt;() {
     *     public void setup(LdLendingCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...(); <span style="color: #3F7E5E">// basically you should order referrer list</span>
     *     }
     * });
     * for (LdLibraryUser libraryUser : libraryUserList) {
     *     ... = libraryUser.<span style="color: #FD4747">getLendingList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key(and others too) is treated as case-insensitive. <br />
     * The condition-bean that the set-upper provides have settings before you touch it. It is as follows:
     * <pre>
     * cb.query().set[ForeignKey]_InScope(pkList);
     * cb.query().addOrderBy_[ForeignKey]_Asc();
     * </pre>
     * @param libraryUserList The entity list of libraryUser. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     */
    public void loadLendingList(List<LdLibraryUser> libraryUserList, ConditionBeanSetupper<LdLendingCB> conditionBeanSetupper) {
        xassLRArg(libraryUserList, conditionBeanSetupper);
        loadLendingList(libraryUserList, new LoadReferrerOption<LdLendingCB, LdLending>().xinit(conditionBeanSetupper));
    }
    /**
     * {Refer to overload method that has an argument of the list of entity.}
     * @param libraryUser The entity of libraryUser. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadLendingList(LdLibraryUser libraryUser, LoadReferrerOption<LdLendingCB, LdLending> loadReferrerOption) {
        xassLRArg(libraryUser, loadReferrerOption);
        loadLendingList(xnewLRLs(libraryUser), loadReferrerOption);
    }
    /**
     * {Refer to overload method that has an argument of condition-bean setupper.}
     * @param libraryUserList The entity list of libraryUser. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadLendingList(List<LdLibraryUser> libraryUserList, LoadReferrerOption<LdLendingCB, LdLending> loadReferrerOption) {
        xassLRArg(libraryUserList, loadReferrerOption);
        if (libraryUserList.isEmpty()) { return; }
        final LdLendingBhv referrerBhv = xgetBSFLR().select(LdLendingBhv.class);
        helpLoadReferrerInternally(libraryUserList, loadReferrerOption, new InternalLoadReferrerCallback<LdLibraryUser, java.util.Map<String, Object>, LdLendingCB, LdLending>() {
            public java.util.Map<String, Object> getPKVal(LdLibraryUser et) {
                java.util.Map<String, Object> primaryKeyMap = new java.util.LinkedHashMap<String, Object>();
                primaryKeyMap.put("LibraryId", et.getLibraryId());
                primaryKeyMap.put("LbUserId", et.getLbUserId());
                return primaryKeyMap;
            }
            public void setRfLs(LdLibraryUser et, List<LdLending> ls) { et.setLendingList(ls); }
            public LdLendingCB newMyCB() { return referrerBhv.newMyConditionBean(); }
            public void qyFKIn(LdLendingCB cb, List<java.util.Map<String, Object>> ls) {
                final String aliasName = cb.getSqlClause().getBasePointAliasName();
                String identity = null;
                StringBuilder sb = new StringBuilder();
                for (java.util.Map<String, Object> primaryKeyMap : ls) {
                    if (sb.length() > 0) { sb.append(")").append(ln()).append("     or ("); }
                    sb.append(aliasName).append(".LIBRARY_ID = ");
                    identity = "lendingListLibraryId";
                    sb.append(cb.query().xregisterFreeParameterToThemeList(identity, primaryKeyMap.get("LibraryId")));
                    sb.append(" and ");
                    sb.append(aliasName).append(".LB_USER_ID = ");
                    identity = "lendingListLbUserId";
                    sb.append(cb.query().xregisterFreeParameterToThemeList(identity, primaryKeyMap.get("LbUserId")));
                }
                sb.insert(0, "((").append("))");
                cb.getSqlClause().registerWhereClause(sb.toString(), aliasName);
            }
            public void qyOdFKAsc(LdLendingCB cb) {
                cb.query().addOrderBy_LibraryId_Asc();
                cb.query().addOrderBy_LbUserId_Asc();
            }
            public void spFKCol(LdLendingCB cb) {
                cb.specify().columnLibraryId();
                cb.specify().columnLbUserId();
            }
            public List<LdLending> selRfLs(LdLendingCB cb) { return referrerBhv.selectList(cb); }
            public java.util.Map<String, Object> getFKVal(LdLending re) {
                java.util.Map<String, Object> foreignKeyMap = new java.util.LinkedHashMap<String, Object>();
                foreignKeyMap.put("LibraryId", re.getLibraryId());
                foreignKeyMap.put("LbUserId", re.getLbUserId());
                return foreignKeyMap;
            }
            public void setlcEt(LdLending re, LdLibraryUser le) { re.setLibraryUser(le); }
            public String getRfPrNm() { return "lendingList"; }
        });
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.}
     * @param libraryUser The entity of libraryUser. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     */
    public void loadLendingCollectionList(LdLibraryUser libraryUser, ConditionBeanSetupper<LdLendingCollectionCB> conditionBeanSetupper) {
        xassLRArg(libraryUser, conditionBeanSetupper);
        loadLendingCollectionList(xnewLRLs(libraryUser), conditionBeanSetupper);
    }
    /**
     * Load referrer of lendingCollectionList with the set-upper for condition-bean of referrer. <br />
     * LENDING_COLLECTION by LIBRARY_ID, LB_USER_ID, named 'lendingCollectionList'.
     * <pre>
     * libraryUserBhv.<span style="color: #FD4747">loadLendingCollectionList</span>(libraryUserList, new ConditionBeanSetupper&lt;LdLendingCollectionCB&gt;() {
     *     public void setup(LdLendingCollectionCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...(); <span style="color: #3F7E5E">// basically you should order referrer list</span>
     *     }
     * });
     * for (LdLibraryUser libraryUser : libraryUserList) {
     *     ... = libraryUser.<span style="color: #FD4747">getLendingCollectionList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key(and others too) is treated as case-insensitive. <br />
     * The condition-bean that the set-upper provides have settings before you touch it. It is as follows:
     * <pre>
     * cb.query().set[ForeignKey]_InScope(pkList);
     * cb.query().addOrderBy_[ForeignKey]_Asc();
     * </pre>
     * @param libraryUserList The entity list of libraryUser. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     */
    public void loadLendingCollectionList(List<LdLibraryUser> libraryUserList, ConditionBeanSetupper<LdLendingCollectionCB> conditionBeanSetupper) {
        xassLRArg(libraryUserList, conditionBeanSetupper);
        loadLendingCollectionList(libraryUserList, new LoadReferrerOption<LdLendingCollectionCB, LdLendingCollection>().xinit(conditionBeanSetupper));
    }
    /**
     * {Refer to overload method that has an argument of the list of entity.}
     * @param libraryUser The entity of libraryUser. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadLendingCollectionList(LdLibraryUser libraryUser, LoadReferrerOption<LdLendingCollectionCB, LdLendingCollection> loadReferrerOption) {
        xassLRArg(libraryUser, loadReferrerOption);
        loadLendingCollectionList(xnewLRLs(libraryUser), loadReferrerOption);
    }
    /**
     * {Refer to overload method that has an argument of condition-bean setupper.}
     * @param libraryUserList The entity list of libraryUser. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadLendingCollectionList(List<LdLibraryUser> libraryUserList, LoadReferrerOption<LdLendingCollectionCB, LdLendingCollection> loadReferrerOption) {
        xassLRArg(libraryUserList, loadReferrerOption);
        if (libraryUserList.isEmpty()) { return; }
        final LdLendingCollectionBhv referrerBhv = xgetBSFLR().select(LdLendingCollectionBhv.class);
        helpLoadReferrerInternally(libraryUserList, loadReferrerOption, new InternalLoadReferrerCallback<LdLibraryUser, java.util.Map<String, Object>, LdLendingCollectionCB, LdLendingCollection>() {
            public java.util.Map<String, Object> getPKVal(LdLibraryUser et) {
                java.util.Map<String, Object> primaryKeyMap = new java.util.LinkedHashMap<String, Object>();
                primaryKeyMap.put("LibraryId", et.getLibraryId());
                primaryKeyMap.put("LbUserId", et.getLbUserId());
                return primaryKeyMap;
            }
            public void setRfLs(LdLibraryUser et, List<LdLendingCollection> ls) { et.setLendingCollectionList(ls); }
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
                }
                sb.insert(0, "((").append("))");
                cb.getSqlClause().registerWhereClause(sb.toString(), aliasName);
            }
            public void qyOdFKAsc(LdLendingCollectionCB cb) {
                cb.query().addOrderBy_LibraryId_Asc();
                cb.query().addOrderBy_LbUserId_Asc();
            }
            public void spFKCol(LdLendingCollectionCB cb) {
                cb.specify().columnLibraryId();
                cb.specify().columnLbUserId();
            }
            public List<LdLendingCollection> selRfLs(LdLendingCollectionCB cb) { return referrerBhv.selectList(cb); }
            public java.util.Map<String, Object> getFKVal(LdLendingCollection re) {
                java.util.Map<String, Object> foreignKeyMap = new java.util.LinkedHashMap<String, Object>();
                foreignKeyMap.put("LibraryId", re.getLibraryId());
                foreignKeyMap.put("LbUserId", re.getLbUserId());
                return foreignKeyMap;
            }
            public void setlcEt(LdLendingCollection re, LdLibraryUser le) { re.setLibraryUser(le); }
            public String getRfPrNm() { return "lendingCollectionList"; }
        });
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'LdLbUser'.
     * @param libraryUserList The list of libraryUser. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<LdLbUser> pulloutLbUser(List<LdLibraryUser> libraryUserList) {
        return helpPulloutInternally(libraryUserList, new InternalPulloutCallback<LdLibraryUser, LdLbUser>() {
            public LdLbUser getFr(LdLibraryUser et) { return et.getLbUser(); }
            public boolean hasRf() { return true; }
            public void setRfLs(LdLbUser et, List<LdLibraryUser> ls)
            { et.setLibraryUserList(ls); }
        });
    }
    /**
     * Pull out the list of foreign table 'LdLibrary'.
     * @param libraryUserList The list of libraryUser. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<LdLibrary> pulloutLibrary(List<LdLibraryUser> libraryUserList) {
        return helpPulloutInternally(libraryUserList, new InternalPulloutCallback<LdLibraryUser, LdLibrary>() {
            public LdLibrary getFr(LdLibraryUser et) { return et.getLibrary(); }
            public boolean hasRf() { return true; }
            public void setRfLs(LdLibrary et, List<LdLibraryUser> ls)
            { et.setLibraryUserList(ls); }
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
     * LdLibraryUser libraryUser = new LdLibraryUser();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * libraryUser.setFoo...(value);
     * libraryUser.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//libraryUser.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//libraryUser.set...;</span>
     * libraryUserBhv.<span style="color: #FD4747">insert</span>(libraryUser);
     * ... = libraryUser.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param libraryUser The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(LdLibraryUser libraryUser) {
        doInsert(libraryUser, null);
    }

    protected void doInsert(LdLibraryUser libraryUser, InsertOption<LdLibraryUserCB> op) {
        assertObjectNotNull("libraryUser", libraryUser);
        prepareInsertOption(op);
        delegateInsert(libraryUser, op);
    }

    protected void prepareInsertOption(InsertOption<LdLibraryUserCB> op) {
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
     * LdLibraryUser libraryUser = new LdLibraryUser();
     * libraryUser.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * libraryUser.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//libraryUser.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//libraryUser.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * libraryUser.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     libraryUserBhv.<span style="color: #FD4747">update</span>(libraryUser);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param libraryUser The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(final LdLibraryUser libraryUser) {
        doUpdate(libraryUser, null);
    }

    protected void doUpdate(LdLibraryUser libraryUser, final UpdateOption<LdLibraryUserCB> op) {
        assertObjectNotNull("libraryUser", libraryUser);
        prepareUpdateOption(op);
        helpUpdateInternally(libraryUser, new InternalUpdateCallback<LdLibraryUser>() {
            public int callbackDelegateUpdate(LdLibraryUser et) { return delegateUpdate(et, op); } });
    }

    protected void prepareUpdateOption(UpdateOption<LdLibraryUserCB> op) {
        if (op == null) { return; }
        assertUpdateOptionStatus(op);
        if (op.hasSelfSpecification()) {
            op.resolveSelfSpecification(createCBForVaryingUpdate());
        }
        if (op.hasSpecifiedUpdateColumn()) {
            op.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    protected LdLibraryUserCB createCBForVaryingUpdate() {
        LdLibraryUserCB cb = newMyConditionBean();
        cb.xsetupForVaryingUpdate();
        return cb;
    }

    protected LdLibraryUserCB createCBForSpecifiedUpdate() {
        LdLibraryUserCB cb = newMyConditionBean();
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
     * LdLibraryUser libraryUser = new LdLibraryUser();
     * libraryUser.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * libraryUser.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//libraryUser.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//libraryUser.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//libraryUser.setVersionNo(value);</span>
     * libraryUserBhv.<span style="color: #FD4747">updateNonstrict</span>(libraryUser);
     * </pre>
     * @param libraryUser The entity of update target. (NotNull, PrimaryKeyNotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void updateNonstrict(final LdLibraryUser libraryUser) {
        doUpdateNonstrict(libraryUser, null);
    }

    protected void doUpdateNonstrict(LdLibraryUser libraryUser, final UpdateOption<LdLibraryUserCB> op) {
        assertObjectNotNull("libraryUser", libraryUser);
        prepareUpdateOption(op);
        helpUpdateNonstrictInternally(libraryUser, new InternalUpdateNonstrictCallback<LdLibraryUser>() {
            public int callbackDelegateUpdateNonstrict(LdLibraryUser et) { return delegateUpdateNonstrict(et, op); } });
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
     * @param libraryUser The entity of insert or update target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(LdLibraryUser libraryUser) {
        doInesrtOrUpdate(libraryUser, null, null);
    }

    protected void doInesrtOrUpdate(LdLibraryUser libraryUser, final InsertOption<LdLibraryUserCB> iop, final UpdateOption<LdLibraryUserCB> uop) {
        helpInsertOrUpdateInternally(libraryUser, new InternalInsertOrUpdateCallback<LdLibraryUser, LdLibraryUserCB>() {
            public void callbackInsert(LdLibraryUser et) { doInsert(et, iop); }
            public void callbackUpdate(LdLibraryUser et) { doUpdate(et, uop); }
            public LdLibraryUserCB callbackNewMyConditionBean() { return newMyConditionBean(); }
            public int callbackSelectCount(LdLibraryUserCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrModify(Entity et, InsertOption<? extends ConditionBean> iop, UpdateOption<? extends ConditionBean> uop) {
        if (iop == null && uop == null) { insertOrUpdate(downcast(et)); }
        else {
            iop = iop != null ? iop : new InsertOption<LdLibraryUserCB>();
            uop = uop != null ? uop : new UpdateOption<LdLibraryUserCB>();
            varyingInsertOrUpdate(downcast(et), downcast(iop), downcast(uop));
        }
    }

    /**
     * Insert or update the entity non-strictly modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br />
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() }
     * <p><span style="color: #FD4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param libraryUser The entity of insert or update target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdateNonstrict(LdLibraryUser libraryUser) {
        doInesrtOrUpdateNonstrict(libraryUser, null, null);
    }

    protected void doInesrtOrUpdateNonstrict(LdLibraryUser libraryUser, final InsertOption<LdLibraryUserCB> iop, final UpdateOption<LdLibraryUserCB> uop) {
        helpInsertOrUpdateInternally(libraryUser, new InternalInsertOrUpdateNonstrictCallback<LdLibraryUser>() {
            public void callbackInsert(LdLibraryUser et) { doInsert(et, iop); }
            public void callbackUpdateNonstrict(LdLibraryUser et) { doUpdateNonstrict(et, uop); }
        });
    }

    @Override
    protected void doCreateOrModifyNonstrict(Entity et, InsertOption<? extends ConditionBean> iop, UpdateOption<? extends ConditionBean> uop) {
        if (iop == null && uop == null) { insertOrUpdateNonstrict(downcast(et)); }
        else {
            iop = iop != null ? iop : new InsertOption<LdLibraryUserCB>();
            uop = uop != null ? uop : new UpdateOption<LdLibraryUserCB>();
            varyingInsertOrUpdateNonstrict(downcast(et), downcast(iop), downcast(uop));
        }
    }

    /**
     * Delete the entity. (ZeroUpdateException, ExclusiveControl)
     * <pre>
     * LdLibraryUser libraryUser = new LdLibraryUser();
     * libraryUser.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * libraryUser.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     libraryUserBhv.<span style="color: #FD4747">delete</span>(libraryUser);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param libraryUser The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(LdLibraryUser libraryUser) {
        doDelete(libraryUser, null);
    }

    protected void doDelete(LdLibraryUser libraryUser, final DeleteOption<LdLibraryUserCB> op) {
        assertObjectNotNull("libraryUser", libraryUser);
        prepareDeleteOption(op);
        helpDeleteInternally(libraryUser, new InternalDeleteCallback<LdLibraryUser>() {
            public int callbackDelegateDelete(LdLibraryUser et) { return delegateDelete(et, op); } });
    }

    protected void prepareDeleteOption(DeleteOption<LdLibraryUserCB> op) {
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
     * LdLibraryUser libraryUser = new LdLibraryUser();
     * libraryUser.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//libraryUser.setVersionNo(value);</span>
     * libraryUserBhv.<span style="color: #FD4747">deleteNonstrict</span>(libraryUser);
     * </pre>
     * @param libraryUser The entity of delete target. (NotNull, PrimaryKeyNotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrict(LdLibraryUser libraryUser) {
        doDeleteNonstrict(libraryUser, null);
    }

    protected void doDeleteNonstrict(LdLibraryUser libraryUser, final DeleteOption<LdLibraryUserCB> op) {
        assertObjectNotNull("libraryUser", libraryUser);
        prepareDeleteOption(op);
        helpDeleteNonstrictInternally(libraryUser, new InternalDeleteNonstrictCallback<LdLibraryUser>() {
            public int callbackDelegateDeleteNonstrict(LdLibraryUser et) { return delegateDeleteNonstrict(et, op); } });
    }

    /**
     * Delete the entity non-strictly ignoring deleted. {ZeroUpdateException, NonExclusiveControl}
     * <pre>
     * LdLibraryUser libraryUser = new LdLibraryUser();
     * libraryUser.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//libraryUser.setVersionNo(value);</span>
     * libraryUserBhv.<span style="color: #FD4747">deleteNonstrictIgnoreDeleted</span>(libraryUser);
     * <span style="color: #3F7E5E">// if the target entity doesn't exist, no exception</span>
     * </pre>
     * @param libraryUser The entity of delete target. (NotNull, PrimaryKeyNotNull)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrictIgnoreDeleted(LdLibraryUser libraryUser) {
        doDeleteNonstrictIgnoreDeleted(libraryUser, null);
    }

    protected void doDeleteNonstrictIgnoreDeleted(LdLibraryUser libraryUser, final DeleteOption<LdLibraryUserCB> op) {
        assertObjectNotNull("libraryUser", libraryUser);
        prepareDeleteOption(op);
        helpDeleteNonstrictIgnoreDeletedInternally(libraryUser, new InternalDeleteNonstrictIgnoreDeletedCallback<LdLibraryUser>() {
            public int callbackDelegateDeleteNonstrict(LdLibraryUser et) { return delegateDeleteNonstrict(et, op); } });
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
     *     LdLibraryUser libraryUser = new LdLibraryUser();
     *     libraryUser.setFooName("foo");
     *     if (...) {
     *         libraryUser.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     libraryUserList.add(libraryUser);
     * }
     * libraryUserBhv.<span style="color: #FD4747">batchInsert</span>(libraryUserList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param libraryUserList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<LdLibraryUser> libraryUserList) {
        InsertOption<LdLibraryUserCB> op = createInsertUpdateOption();
        return doBatchInsert(libraryUserList, op);
    }

    protected int[] doBatchInsert(List<LdLibraryUser> libraryUserList, InsertOption<LdLibraryUserCB> op) {
        assertObjectNotNull("libraryUserList", libraryUserList);
        prepareBatchInsertOption(libraryUserList, op);
        return delegateBatchInsert(libraryUserList, op);
    }

    protected void prepareBatchInsertOption(List<LdLibraryUser> libraryUserList, InsertOption<LdLibraryUserCB> op) {
        op.xallowInsertColumnModifiedPropertiesFragmented();
        op.xacceptInsertColumnModifiedPropertiesIfNeeds(libraryUserList);
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
     *     LdLibraryUser libraryUser = new LdLibraryUser();
     *     libraryUser.setFooName("foo");
     *     if (...) {
     *         libraryUser.setFooPrice(123);
     *     } else {
     *         libraryUser.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//libraryUser.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     libraryUserList.add(libraryUser);
     * }
     * libraryUserBhv.<span style="color: #FD4747">batchUpdate</span>(libraryUserList);
     * </pre>
     * @param libraryUserList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<LdLibraryUser> libraryUserList) {
        UpdateOption<LdLibraryUserCB> op = createPlainUpdateOption();
        return doBatchUpdate(libraryUserList, op);
    }

    protected int[] doBatchUpdate(List<LdLibraryUser> libraryUserList, UpdateOption<LdLibraryUserCB> op) {
        assertObjectNotNull("libraryUserList", libraryUserList);
        prepareBatchUpdateOption(libraryUserList, op);
        return delegateBatchUpdate(libraryUserList, op);
    }

    protected void prepareBatchUpdateOption(List<LdLibraryUser> libraryUserList, UpdateOption<LdLibraryUserCB> op) {
        op.xacceptUpdateColumnModifiedPropertiesIfNeeds(libraryUserList);
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
     * libraryUserBhv.<span style="color: #FD4747">batchUpdate</span>(libraryUserList, new SpecifyQuery<LdLibraryUserCB>() {
     *     public void specify(LdLibraryUserCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #FD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #FD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * libraryUserBhv.<span style="color: #FD4747">batchUpdate</span>(libraryUserList, new SpecifyQuery<LdLibraryUserCB>() {
     *     public void specify(LdLibraryUserCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #FD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param libraryUserList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<LdLibraryUser> libraryUserList, SpecifyQuery<LdLibraryUserCB> updateColumnSpec) {
        return doBatchUpdate(libraryUserList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    /**
     * Batch-update the entity list non-strictly modified-only of same-set columns. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <span style="color: #FD4747; font-size: 140%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     LdLibraryUser libraryUser = new LdLibraryUser();
     *     libraryUser.setFooName("foo");
     *     if (...) {
     *         libraryUser.setFooPrice(123);
     *     } else {
     *         libraryUser.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//libraryUser.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     libraryUserList.add(libraryUser);
     * }
     * libraryUserBhv.<span style="color: #FD4747">batchUpdate</span>(libraryUserList);
     * </pre>
     * @param libraryUserList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<LdLibraryUser> libraryUserList) {
        UpdateOption<LdLibraryUserCB> option = createPlainUpdateOption();
        return doBatchUpdateNonstrict(libraryUserList, option);
    }

    protected int[] doBatchUpdateNonstrict(List<LdLibraryUser> libraryUserList, UpdateOption<LdLibraryUserCB> op) {
        assertObjectNotNull("libraryUserList", libraryUserList);
        prepareBatchUpdateOption(libraryUserList, op);
        return delegateBatchUpdateNonstrict(libraryUserList, op);
    }

    /**
     * Batch-update the entity list non-strictly specified-only. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * libraryUserBhv.<span style="color: #FD4747">batchUpdateNonstrict</span>(libraryUserList, new SpecifyQuery<LdLibraryUserCB>() {
     *     public void specify(LdLibraryUserCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #FD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #FD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * libraryUserBhv.<span style="color: #FD4747">batchUpdateNonstrict</span>(libraryUserList, new SpecifyQuery<LdLibraryUserCB>() {
     *     public void specify(LdLibraryUserCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #FD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).</p>
     * @param libraryUserList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<LdLibraryUser> libraryUserList, SpecifyQuery<LdLibraryUserCB> updateColumnSpec) {
        return doBatchUpdateNonstrict(libraryUserList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> op) {
        if (op == null) { return batchUpdateNonstrict(downcast(ls)); }
        else { return varyingBatchUpdateNonstrict(downcast(ls), downcast(op)); }
    }

    /**
     * Batch-delete the entity list. (ExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param libraryUserList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchDelete(List<LdLibraryUser> libraryUserList) {
        return doBatchDelete(libraryUserList, null);
    }

    protected int[] doBatchDelete(List<LdLibraryUser> libraryUserList, DeleteOption<LdLibraryUserCB> op) {
        assertObjectNotNull("libraryUserList", libraryUserList);
        prepareDeleteOption(op);
        return delegateBatchDelete(libraryUserList, op);
    }

    @Override
    protected int[] doLumpRemove(List<Entity> ls, DeleteOption<? extends ConditionBean> op) {
        if (op == null) { return batchDelete(downcast(ls)); }
        else { return varyingBatchDelete(downcast(ls), downcast(op)); }
    }

    /**
     * Batch-delete the entity list non-strictly. {NonExclusiveControl} <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param libraryUserList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDeleteNonstrict(List<LdLibraryUser> libraryUserList) {
        return doBatchDeleteNonstrict(libraryUserList, null);
    }

    protected int[] doBatchDeleteNonstrict(List<LdLibraryUser> libraryUserList, DeleteOption<LdLibraryUserCB> op) {
        assertObjectNotNull("libraryUserList", libraryUserList);
        prepareDeleteOption(op);
        return delegateBatchDeleteNonstrict(libraryUserList, op);
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
     * libraryUserBhv.<span style="color: #FD4747">queryInsert</span>(new QueryInsertSetupper&lt;LdLibraryUser, LdLibraryUserCB&gt;() {
     *     public ConditionBean setup(libraryUser entity, LdLibraryUserCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<LdLibraryUser, LdLibraryUserCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(QueryInsertSetupper<LdLibraryUser, LdLibraryUserCB> sp, InsertOption<LdLibraryUserCB> op) {
        assertObjectNotNull("setupper", sp);
        prepareInsertOption(op);
        LdLibraryUser e = new LdLibraryUser();
        LdLibraryUserCB cb = createCBForQueryInsert();
        return delegateQueryInsert(e, cb, sp.setup(e, cb), op);
    }

    protected LdLibraryUserCB createCBForQueryInsert() {
        LdLibraryUserCB cb = newMyConditionBean();
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
     * LdLibraryUser libraryUser = new LdLibraryUser();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//libraryUser.setPK...(value);</span>
     * libraryUser.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//libraryUser.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//libraryUser.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//libraryUser.setVersionNo(value);</span>
     * LdLibraryUserCB cb = new LdLibraryUserCB();
     * cb.query().setFoo...(value);
     * libraryUserBhv.<span style="color: #FD4747">queryUpdate</span>(libraryUser, cb);
     * </pre>
     * @param libraryUser The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of LdLibraryUser. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(LdLibraryUser libraryUser, LdLibraryUserCB cb) {
        return doQueryUpdate(libraryUser, cb, null);
    }

    protected int doQueryUpdate(LdLibraryUser libraryUser, LdLibraryUserCB cb, UpdateOption<LdLibraryUserCB> op) {
        assertObjectNotNull("libraryUser", libraryUser); assertCBStateValid(cb);
        prepareUpdateOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryUpdate(libraryUser, cb, op) : 0;
    }

    @Override
    protected int doRangeModify(Entity et, ConditionBean cb, UpdateOption<? extends ConditionBean> op) {
        if (op == null) { return queryUpdate(downcast(et), (LdLibraryUserCB)cb); }
        else { return varyingQueryUpdate(downcast(et), (LdLibraryUserCB)cb, downcast(op)); }
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * LdLibraryUserCB cb = new LdLibraryUserCB();
     * cb.query().setFoo...(value);
     * libraryUserBhv.<span style="color: #FD4747">queryDelete</span>(libraryUser, cb);
     * </pre>
     * @param cb The condition-bean of LdLibraryUser. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(LdLibraryUserCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(LdLibraryUserCB cb, DeleteOption<LdLibraryUserCB> op) {
        assertCBStateValid(cb);
        prepareDeleteOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryDelete(cb, op) : 0;
    }

    @Override
    protected int doRangeRemove(ConditionBean cb, DeleteOption<? extends ConditionBean> op) {
        if (op == null) { return queryDelete((LdLibraryUserCB)cb); }
        else { return varyingQueryDelete((LdLibraryUserCB)cb, downcast(op)); }
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
     * LdLibraryUser libraryUser = new LdLibraryUser();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * libraryUser.setFoo...(value);
     * libraryUser.setBar...(value);
     * InsertOption<LdLibraryUserCB> option = new InsertOption<LdLibraryUserCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * libraryUserBhv.<span style="color: #FD4747">varyingInsert</span>(libraryUser, option);
     * ... = libraryUser.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param libraryUser The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(LdLibraryUser libraryUser, InsertOption<LdLibraryUserCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(libraryUser, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, ExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * LdLibraryUser libraryUser = new LdLibraryUser();
     * libraryUser.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * libraryUser.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * libraryUser.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;LdLibraryUserCB&gt; option = new UpdateOption&lt;LdLibraryUserCB&gt;();
     *     option.self(new SpecifyQuery&lt;LdLibraryUserCB&gt;() {
     *         public void specify(LdLibraryUserCB cb) {
     *             cb.specify().<span style="color: #FD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     libraryUserBhv.<span style="color: #FD4747">varyingUpdate</span>(libraryUser, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param libraryUser The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(LdLibraryUser libraryUser, UpdateOption<LdLibraryUserCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(libraryUser, option);
    }

    /**
     * Update the entity with varying requests non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as updateNonstrict(entity).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * LdLibraryUser libraryUser = new LdLibraryUser();
     * libraryUser.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * libraryUser.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//libraryUser.setVersionNo(value);</span>
     * UpdateOption&lt;LdLibraryUserCB&gt; option = new UpdateOption&lt;LdLibraryUserCB&gt;();
     * option.self(new SpecifyQuery&lt;LdLibraryUserCB&gt;() {
     *     public void specify(LdLibraryUserCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * libraryUserBhv.<span style="color: #FD4747">varyingUpdateNonstrict</span>(libraryUser, option);
     * </pre>
     * @param libraryUser The entity of update target. (NotNull, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdateNonstrict(LdLibraryUser libraryUser, UpdateOption<LdLibraryUserCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdateNonstrict(libraryUser, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param libraryUser The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(LdLibraryUser libraryUser, InsertOption<LdLibraryUserCB> insertOption, UpdateOption<LdLibraryUserCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdate(libraryUser, insertOption, updateOption);
    }

    /**
     * Insert or update the entity with varying requests non-strictly. (NonExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdateNonstrict(entity).
     * @param libraryUser The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdateNonstrict(LdLibraryUser libraryUser, InsertOption<LdLibraryUserCB> insertOption, UpdateOption<LdLibraryUserCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdateNonstrict(libraryUser, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, ExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param libraryUser The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(LdLibraryUser libraryUser, DeleteOption<LdLibraryUserCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(libraryUser, option);
    }

    /**
     * Delete the entity with varying requests non-strictly. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as deleteNonstrict(entity).
     * @param libraryUser The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDeleteNonstrict(LdLibraryUser libraryUser, DeleteOption<LdLibraryUserCB> option) {
        assertDeleteOptionNotNull(option);
        doDeleteNonstrict(libraryUser, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param libraryUserList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<LdLibraryUser> libraryUserList, InsertOption<LdLibraryUserCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(libraryUserList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param libraryUserList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<LdLibraryUser> libraryUserList, UpdateOption<LdLibraryUserCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(libraryUserList, option);
    }

    /**
     * Batch-update the list with varying requests non-strictly. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param libraryUserList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdateNonstrict(List<LdLibraryUser> libraryUserList, UpdateOption<LdLibraryUserCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdateNonstrict(libraryUserList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param libraryUserList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<LdLibraryUser> libraryUserList, DeleteOption<LdLibraryUserCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(libraryUserList, option);
    }

    /**
     * Batch-delete the list with varying requests non-strictly. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDeleteNonstrict(entityList).
     * @param libraryUserList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDeleteNonstrict(List<LdLibraryUser> libraryUserList, DeleteOption<LdLibraryUserCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDeleteNonstrict(libraryUserList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<LdLibraryUser, LdLibraryUserCB> setupper, InsertOption<LdLibraryUserCB> option) {
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
     * LdLibraryUser libraryUser = new LdLibraryUser();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//libraryUser.setPK...(value);</span>
     * libraryUser.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//libraryUser.setVersionNo(value);</span>
     * LdLibraryUserCB cb = new LdLibraryUserCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;LdLibraryUserCB&gt; option = new UpdateOption&lt;LdLibraryUserCB&gt;();
     * option.self(new SpecifyQuery&lt;LdLibraryUserCB&gt;() {
     *     public void specify(LdLibraryUserCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * libraryUserBhv.<span style="color: #FD4747">varyingQueryUpdate</span>(libraryUser, cb, option);
     * </pre>
     * @param libraryUser The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of LdLibraryUser. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(LdLibraryUser libraryUser, LdLibraryUserCB cb, UpdateOption<LdLibraryUserCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(libraryUser, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of LdLibraryUser. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(LdLibraryUserCB cb, DeleteOption<LdLibraryUserCB> option) {
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
    public OutsideSqlBasicExecutor<LdLibraryUserBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCountUniquely(LdLibraryUserCB cb) { return invoke(createSelectCountCBCommand(cb, true)); }
    protected int delegateSelectCountPlainly(LdLibraryUserCB cb) { return invoke(createSelectCountCBCommand(cb, false)); }
    protected <ENTITY extends LdLibraryUser> void delegateSelectCursor(LdLibraryUserCB cb, EntityRowHandler<ENTITY> rh, Class<ENTITY> tp)
    { invoke(createSelectCursorCBCommand(cb, rh, tp)); }
    protected <ENTITY extends LdLibraryUser> List<ENTITY> delegateSelectList(LdLibraryUserCB cb, Class<ENTITY> tp)
    { return invoke(createSelectListCBCommand(cb, tp)); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(LdLibraryUser et, InsertOption<LdLibraryUserCB> op)
    { if (!processBeforeInsert(et, op)) { return 0; }
      return invoke(createInsertEntityCommand(et, op)); }
    protected int delegateUpdate(LdLibraryUser et, UpdateOption<LdLibraryUserCB> op)
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return invoke(createUpdateEntityCommand(et, op)); }
    protected int delegateUpdateNonstrict(LdLibraryUser et, UpdateOption<LdLibraryUserCB> op)
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return invoke(createUpdateNonstrictEntityCommand(et, op)); }
    protected int delegateDelete(LdLibraryUser et, DeleteOption<LdLibraryUserCB> op)
    { if (!processBeforeDelete(et, op)) { return 0; }
      return invoke(createDeleteEntityCommand(et, op)); }
    protected int delegateDeleteNonstrict(LdLibraryUser et, DeleteOption<LdLibraryUserCB> op)
    { if (!processBeforeDelete(et, op)) { return 0; }
      return invoke(createDeleteNonstrictEntityCommand(et, op)); }

    protected int[] delegateBatchInsert(List<LdLibraryUser> ls, InsertOption<LdLibraryUserCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchInsertCommand(processBatchInternally(ls, op), op)); }
    protected int[] delegateBatchUpdate(List<LdLibraryUser> ls, UpdateOption<LdLibraryUserCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateCommand(processBatchInternally(ls, op, false), op)); }
    protected int[] delegateBatchUpdateNonstrict(List<LdLibraryUser> ls, UpdateOption<LdLibraryUserCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateNonstrictCommand(processBatchInternally(ls, op, true), op)); }
    protected int[] delegateBatchDelete(List<LdLibraryUser> ls, DeleteOption<LdLibraryUserCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteCommand(processBatchInternally(ls, op, false), op)); }
    protected int[] delegateBatchDeleteNonstrict(List<LdLibraryUser> ls, DeleteOption<LdLibraryUserCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteNonstrictCommand(processBatchInternally(ls, op, true), op)); }

    protected int delegateQueryInsert(LdLibraryUser et, LdLibraryUserCB inCB, ConditionBean resCB, InsertOption<LdLibraryUserCB> op)
    { if (!processBeforeQueryInsert(et, inCB, resCB, op)) { return 0; } return invoke(createQueryInsertCBCommand(et, inCB, resCB, op));  }
    protected int delegateQueryUpdate(LdLibraryUser et, LdLibraryUserCB cb, UpdateOption<LdLibraryUserCB> op)
    { if (!processBeforeQueryUpdate(et, cb, op)) { return 0; } return invoke(createQueryUpdateCBCommand(et, cb, op));  }
    protected int delegateQueryDelete(LdLibraryUserCB cb, DeleteOption<LdLibraryUserCB> op)
    { if (!processBeforeQueryDelete(cb, op)) { return 0; } return invoke(createQueryDeleteCBCommand(cb, op));  }

    // ===================================================================================
    //                                                                     Filter Override
    //                                                                     ===============
    @Override
    protected void filterEntityOfInsert(Entity tgt, InsertOption<? extends ConditionBean> op) {
        super.filterEntityOfInsert(tgt, op);
        LdLibraryUser et = downcast(tgt);
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
    protected LdLibraryUser downcast(Entity et) {
        return helpEntityDowncastInternally(et, LdLibraryUser.class);
    }

    protected LdLibraryUserCB downcast(ConditionBean cb) {
        return helpConditionBeanDowncastInternally(cb, LdLibraryUserCB.class);
    }

    @SuppressWarnings("unchecked")
    protected List<LdLibraryUser> downcast(List<? extends Entity> ls) {
        return (List<LdLibraryUser>)ls;
    }

    @SuppressWarnings("unchecked")
    protected InsertOption<LdLibraryUserCB> downcast(InsertOption<? extends ConditionBean> op) {
        return (InsertOption<LdLibraryUserCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected UpdateOption<LdLibraryUserCB> downcast(UpdateOption<? extends ConditionBean> op) {
        return (UpdateOption<LdLibraryUserCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected DeleteOption<LdLibraryUserCB> downcast(DeleteOption<? extends ConditionBean> op) {
        return (DeleteOption<LdLibraryUserCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<LdLibraryUser, LdLibraryUserCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> sp) {
        return (QueryInsertSetupper<LdLibraryUser, LdLibraryUserCB>)sp;
    }
}
