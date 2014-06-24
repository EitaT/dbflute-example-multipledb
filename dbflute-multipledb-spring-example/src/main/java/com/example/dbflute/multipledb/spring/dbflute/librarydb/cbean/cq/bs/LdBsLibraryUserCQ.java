/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */package com.example.dbflute.multipledb.spring.dbflute.librarydb.cbean.cq.bs;

import java.util.Map;

import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.cbean.chelper.*;
import org.seasar.dbflute.cbean.coption.*;
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import org.seasar.dbflute.exception.IllegalConditionBeanOperationException;
import com.example.dbflute.multipledb.spring.dbflute.librarydb.cbean.cq.ciq.*;
import com.example.dbflute.multipledb.spring.dbflute.librarydb.cbean.*;
import com.example.dbflute.multipledb.spring.dbflute.librarydb.cbean.cq.*;

/**
 * The base condition-query of LIBRARY_USER.
 * @author DBFlute(AutoGenerator)
 */
public class LdBsLibraryUserCQ extends LdAbstractBsLibraryUserCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected LdLibraryUserCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public LdBsLibraryUserCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from LIBRARY_USER) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public LdLibraryUserCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected LdLibraryUserCIQ xcreateCIQ() {
        LdLibraryUserCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected LdLibraryUserCIQ xnewCIQ() {
        return new LdLibraryUserCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join LIBRARY_USER on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public LdLibraryUserCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        LdLibraryUserCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _libraryId;
    public ConditionValue getLibraryId()
    { if (_libraryId == null) { _libraryId = nCV(); }
      return _libraryId; }
    protected ConditionValue getCValueLibraryId() { return getLibraryId(); }

    public Map<String, LdLibraryCQ> getLibraryId_InScopeRelation_Library() { return xgetSQueMap("libraryId_InScopeRelation_Library"); }
    public String keepLibraryId_InScopeRelation_Library(LdLibraryCQ sq) { return xkeepSQue("libraryId_InScopeRelation_Library", sq); }

    public Map<String, LdLibraryCQ> getLibraryId_NotInScopeRelation_Library() { return xgetSQueMap("libraryId_NotInScopeRelation_Library"); }
    public String keepLibraryId_NotInScopeRelation_Library(LdLibraryCQ sq) { return xkeepSQue("libraryId_NotInScopeRelation_Library", sq); }

    /** 
     * Add order-by as ascend. <br />
     * LIBRARY_ID: {PK, IX, NotNull, SMALLINT(5), FK to LIBRARY}
     * @return this. (NotNull)
     */
    public LdBsLibraryUserCQ addOrderBy_LibraryId_Asc() { regOBA("LIBRARY_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * LIBRARY_ID: {PK, IX, NotNull, SMALLINT(5), FK to LIBRARY}
     * @return this. (NotNull)
     */
    public LdBsLibraryUserCQ addOrderBy_LibraryId_Desc() { regOBD("LIBRARY_ID"); return this; }

    protected ConditionValue _lbUserId;
    public ConditionValue getLbUserId()
    { if (_lbUserId == null) { _lbUserId = nCV(); }
      return _lbUserId; }
    protected ConditionValue getCValueLbUserId() { return getLbUserId(); }

    public Map<String, LdLbUserCQ> getLbUserId_InScopeRelation_LbUser() { return xgetSQueMap("lbUserId_InScopeRelation_LbUser"); }
    public String keepLbUserId_InScopeRelation_LbUser(LdLbUserCQ sq) { return xkeepSQue("lbUserId_InScopeRelation_LbUser", sq); }

    public Map<String, LdLbUserCQ> getLbUserId_NotInScopeRelation_LbUser() { return xgetSQueMap("lbUserId_NotInScopeRelation_LbUser"); }
    public String keepLbUserId_NotInScopeRelation_LbUser(LdLbUserCQ sq) { return xkeepSQue("lbUserId_NotInScopeRelation_LbUser", sq); }

    /** 
     * Add order-by as ascend. <br />
     * LB_USER_ID: {PK, IX, NotNull, INTEGER(10), FK to LB_USER}
     * @return this. (NotNull)
     */
    public LdBsLibraryUserCQ addOrderBy_LbUserId_Asc() { regOBA("LB_USER_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * LB_USER_ID: {PK, IX, NotNull, INTEGER(10), FK to LB_USER}
     * @return this. (NotNull)
     */
    public LdBsLibraryUserCQ addOrderBy_LbUserId_Desc() { regOBD("LB_USER_ID"); return this; }

    protected ConditionValue _rUser;
    public ConditionValue getRUser()
    { if (_rUser == null) { _rUser = nCV(); }
      return _rUser; }
    protected ConditionValue getCValueRUser() { return getRUser(); }

    /** 
     * Add order-by as ascend. <br />
     * R_USER: {NotNull, VARCHAR(100), default=[default-user]}
     * @return this. (NotNull)
     */
    public LdBsLibraryUserCQ addOrderBy_RUser_Asc() { regOBA("R_USER"); return this; }

    /**
     * Add order-by as descend. <br />
     * R_USER: {NotNull, VARCHAR(100), default=[default-user]}
     * @return this. (NotNull)
     */
    public LdBsLibraryUserCQ addOrderBy_RUser_Desc() { regOBD("R_USER"); return this; }

    protected ConditionValue _rModule;
    public ConditionValue getRModule()
    { if (_rModule == null) { _rModule = nCV(); }
      return _rModule; }
    protected ConditionValue getCValueRModule() { return getRModule(); }

    /** 
     * Add order-by as ascend. <br />
     * R_MODULE: {NotNull, VARCHAR(100), default=[default-module]}
     * @return this. (NotNull)
     */
    public LdBsLibraryUserCQ addOrderBy_RModule_Asc() { regOBA("R_MODULE"); return this; }

    /**
     * Add order-by as descend. <br />
     * R_MODULE: {NotNull, VARCHAR(100), default=[default-module]}
     * @return this. (NotNull)
     */
    public LdBsLibraryUserCQ addOrderBy_RModule_Desc() { regOBD("R_MODULE"); return this; }

    protected ConditionValue _rTimestamp;
    public ConditionValue getRTimestamp()
    { if (_rTimestamp == null) { _rTimestamp = nCV(); }
      return _rTimestamp; }
    protected ConditionValue getCValueRTimestamp() { return getRTimestamp(); }

    /** 
     * Add order-by as ascend. <br />
     * R_TIMESTAMP: {NotNull, TIMESTAMP(26, 6), default=[CURRENT_TIMESTAMP]}
     * @return this. (NotNull)
     */
    public LdBsLibraryUserCQ addOrderBy_RTimestamp_Asc() { regOBA("R_TIMESTAMP"); return this; }

    /**
     * Add order-by as descend. <br />
     * R_TIMESTAMP: {NotNull, TIMESTAMP(26, 6), default=[CURRENT_TIMESTAMP]}
     * @return this. (NotNull)
     */
    public LdBsLibraryUserCQ addOrderBy_RTimestamp_Desc() { regOBD("R_TIMESTAMP"); return this; }

    protected ConditionValue _uUser;
    public ConditionValue getUUser()
    { if (_uUser == null) { _uUser = nCV(); }
      return _uUser; }
    protected ConditionValue getCValueUUser() { return getUUser(); }

    /** 
     * Add order-by as ascend. <br />
     * U_USER: {NotNull, VARCHAR(100), default=[default-user]}
     * @return this. (NotNull)
     */
    public LdBsLibraryUserCQ addOrderBy_UUser_Asc() { regOBA("U_USER"); return this; }

    /**
     * Add order-by as descend. <br />
     * U_USER: {NotNull, VARCHAR(100), default=[default-user]}
     * @return this. (NotNull)
     */
    public LdBsLibraryUserCQ addOrderBy_UUser_Desc() { regOBD("U_USER"); return this; }

    protected ConditionValue _uModule;
    public ConditionValue getUModule()
    { if (_uModule == null) { _uModule = nCV(); }
      return _uModule; }
    protected ConditionValue getCValueUModule() { return getUModule(); }

    /** 
     * Add order-by as ascend. <br />
     * U_MODULE: {NotNull, VARCHAR(100), default=[default-module]}
     * @return this. (NotNull)
     */
    public LdBsLibraryUserCQ addOrderBy_UModule_Asc() { regOBA("U_MODULE"); return this; }

    /**
     * Add order-by as descend. <br />
     * U_MODULE: {NotNull, VARCHAR(100), default=[default-module]}
     * @return this. (NotNull)
     */
    public LdBsLibraryUserCQ addOrderBy_UModule_Desc() { regOBD("U_MODULE"); return this; }

    protected ConditionValue _uTimestamp;
    public ConditionValue getUTimestamp()
    { if (_uTimestamp == null) { _uTimestamp = nCV(); }
      return _uTimestamp; }
    protected ConditionValue getCValueUTimestamp() { return getUTimestamp(); }

    /** 
     * Add order-by as ascend. <br />
     * U_TIMESTAMP: {NotNull, TIMESTAMP(26, 6), default=[CURRENT_TIMESTAMP]}
     * @return this. (NotNull)
     */
    public LdBsLibraryUserCQ addOrderBy_UTimestamp_Asc() { regOBA("U_TIMESTAMP"); return this; }

    /**
     * Add order-by as descend. <br />
     * U_TIMESTAMP: {NotNull, TIMESTAMP(26, 6), default=[CURRENT_TIMESTAMP]}
     * @return this. (NotNull)
     */
    public LdBsLibraryUserCQ addOrderBy_UTimestamp_Desc() { regOBD("U_TIMESTAMP"); return this; }

    // ===================================================================================
    //                                                             SpecifiedDerivedOrderBy
    //                                                             =======================
    /**
     * Add order-by for specified derived column as ascend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #DD4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] asc</span>
     * cb.<span style="color: #DD4747">addSpecifiedDerivedOrderBy_Asc</span>(<span style="color: #DD4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public LdBsLibraryUserCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

    /**
     * Add order-by for specified derived column as descend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #DD4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] desc</span>
     * cb.<span style="color: #DD4747">addSpecifiedDerivedOrderBy_Desc</span>(<span style="color: #DD4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public LdBsLibraryUserCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        LdLibraryUserCQ bq = (LdLibraryUserCQ)bqs;
        LdLibraryUserCQ uq = (LdLibraryUserCQ)uqs;
        if (bq.hasConditionQueryLbUser()) {
            uq.queryLbUser().reflectRelationOnUnionQuery(bq.queryLbUser(), uq.queryLbUser());
        }
        if (bq.hasConditionQueryLibrary()) {
            uq.queryLibrary().reflectRelationOnUnionQuery(bq.queryLibrary(), uq.queryLibrary());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br />
     * LB_USER by my LB_USER_ID, named 'lbUser'.
     * @return The instance of condition-query. (NotNull)
     */
    public LdLbUserCQ queryLbUser() {
        return getConditionQueryLbUser();
    }
    public LdLbUserCQ getConditionQueryLbUser() {
        String prop = "lbUser";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryLbUser()); xsetupOuterJoinLbUser(); }
        return xgetQueRlMap(prop);
    }
    protected LdLbUserCQ xcreateQueryLbUser() {
        String nrp = xresolveNRP("LIBRARY_USER", "lbUser"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new LdLbUserCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "lbUser", nrp);
    }
    protected void xsetupOuterJoinLbUser() { xregOutJo("lbUser"); }
    public boolean hasConditionQueryLbUser() { return xhasQueRlMap("lbUser"); }

    /**
     * Get the condition-query for relation table. <br />
     * LIBRARY by my LIBRARY_ID, named 'library'.
     * @return The instance of condition-query. (NotNull)
     */
    public LdLibraryCQ queryLibrary() {
        return getConditionQueryLibrary();
    }
    public LdLibraryCQ getConditionQueryLibrary() {
        String prop = "library";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryLibrary()); xsetupOuterJoinLibrary(); }
        return xgetQueRlMap(prop);
    }
    protected LdLibraryCQ xcreateQueryLibrary() {
        String nrp = xresolveNRP("LIBRARY_USER", "library"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new LdLibraryCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "library", nrp);
    }
    protected void xsetupOuterJoinLibrary() { xregOutJo("library"); }
    public boolean hasConditionQueryLibrary() { return xhasQueRlMap("library"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, LdLibraryUserCQ> getScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(LdLibraryUserCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                      ExistsReferrer for Compound PK
    //                                                      ==============================
    /**
     * Set up ExistsReferrer (correlated sub-query by compound key). <br />
     * {exists (select ... from LENDING where ...)}
     * @param subQuery The sub-query of LendingList for 'exists'. (NotNull)
     */
    public void existsLendingList(SubQuery<LdLendingCB> subQuery) {
        assertObjectNotNull("subQuery<LdLendingCB>", subQuery);
        LdLendingCB cb = new LdLendingCB(); cb.xsetupForExistsReferrer(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepTwoOrMorePk_ExistsReferrer_LendingList(cb.query());
        registerExistsReferrer(cb.query(), "LIBRARY_ID, LB_USER_ID", "LIBRARY_ID, LB_USER_ID", pp, "lendingList");
    }
    public Map<String, LdLendingCQ> getTwoOrMorePk_ExistsReferrer_LendingList() { return xgetSQueMap("twoOrMorePk_ExistsReferrer_LendingList"); }
    public String keepTwoOrMorePk_ExistsReferrer_LendingList(LdLendingCQ sq) { return xkeepSQue("twoOrMorePk_ExistsReferrer_LendingList", sq); }

    /**
     * Set up ExistsReferrer (correlated sub-query by compound key). <br />
     * {exists (select ... from LENDING_COLLECTION where ...)}
     * @param subQuery The sub-query of LendingCollectionList for 'exists'. (NotNull)
     */
    public void existsLendingCollectionList(SubQuery<LdLendingCollectionCB> subQuery) {
        assertObjectNotNull("subQuery<LdLendingCollectionCB>", subQuery);
        LdLendingCollectionCB cb = new LdLendingCollectionCB(); cb.xsetupForExistsReferrer(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepTwoOrMorePk_ExistsReferrer_LendingCollectionList(cb.query());
        registerExistsReferrer(cb.query(), "LIBRARY_ID, LB_USER_ID", "LIBRARY_ID, LB_USER_ID", pp, "lendingCollectionList");
    }
    public Map<String, LdLendingCollectionCQ> getTwoOrMorePk_ExistsReferrer_LendingCollectionList() { return xgetSQueMap("twoOrMorePk_ExistsReferrer_LendingCollectionList"); }
    public String keepTwoOrMorePk_ExistsReferrer_LendingCollectionList(LdLendingCollectionCQ sq) { return xkeepSQue("twoOrMorePk_ExistsReferrer_LendingCollectionList", sq); }

    /**
     * Set up NotExistsReferrer (correlated sub-query by compound key). <br />
     * {not exists (select ... from LENDING where ...)}
     * @param subQuery The sub-query of LendingList for 'not exists'. (NotNull)
     */
    public void notExistsLendingList(SubQuery<LdLendingCB> subQuery) {
        assertObjectNotNull("subQuery<LdLendingCB>", subQuery);
        LdLendingCB cb = new LdLendingCB(); cb.xsetupForExistsReferrer(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepTwoOrMorePk_NotExistsReferrer_LendingList(cb.query());
        registerNotExistsReferrer(cb.query(), "LIBRARY_ID, LB_USER_ID", "LIBRARY_ID, LB_USER_ID", pp, "lendingList");
    }
    public Map<String, LdLendingCQ> getTwoOrMorePk_NotExistsReferrer_LendingList() { return xgetSQueMap("twoOrMorePk_NotExistsReferrer_LendingList"); }
    public String keepTwoOrMorePk_NotExistsReferrer_LendingList(LdLendingCQ sq) { return xkeepSQue("twoOrMorePk_NotExistsReferrer_LendingList", sq); }

    /**
     * Set up NotExistsReferrer (correlated sub-query by compound key). <br />
     * {not exists (select ... from LENDING_COLLECTION where ...)}
     * @param subQuery The sub-query of LendingCollectionList for 'not exists'. (NotNull)
     */
    public void notExistsLendingCollectionList(SubQuery<LdLendingCollectionCB> subQuery) {
        assertObjectNotNull("subQuery<LdLendingCollectionCB>", subQuery);
        LdLendingCollectionCB cb = new LdLendingCollectionCB(); cb.xsetupForExistsReferrer(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepTwoOrMorePk_NotExistsReferrer_LendingCollectionList(cb.query());
        registerNotExistsReferrer(cb.query(), "LIBRARY_ID, LB_USER_ID", "LIBRARY_ID, LB_USER_ID", pp, "lendingCollectionList");
    }
    public Map<String, LdLendingCollectionCQ> getTwoOrMorePk_NotExistsReferrer_LendingCollectionList() { return xgetSQueMap("twoOrMorePk_NotExistsReferrer_LendingCollectionList"); }
    public String keepTwoOrMorePk_NotExistsReferrer_LendingCollectionList(LdLendingCollectionCQ sq) { return xkeepSQue("twoOrMorePk_NotExistsReferrer_LendingCollectionList", sq); }

    // ===================================================================================
    //                                            (Specify)DerivedReferrer for Compound PK
    //                                            ========================================
    public void xsderiveLendingList(String fn, SubQuery<LdLendingCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        LdLendingCB cb = new LdLendingCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        String pp = keepTwoOrMorePk_SpecifyDerivedReferrer_LendingList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "LIBRARY_ID, LB_USER_ID", "LIBRARY_ID, LB_USER_ID", pp, "lendingList", al, op);
    }
    public Map<String, LdLendingCQ> getTwoOrMorePk_SpecifyDerivedReferrer_LendingList() { return xgetSQueMap("twoOrMorePk_SpecifyDerivedReferrer_LendingList"); }
    public String keepTwoOrMorePk_SpecifyDerivedReferrer_LendingList(LdLendingCQ sq) { return xkeepSQue("twoOrMorePk_SpecifyDerivedReferrer_LendingList", sq); }

    public void xsderiveLendingCollectionList(String fn, SubQuery<LdLendingCollectionCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        LdLendingCollectionCB cb = new LdLendingCollectionCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        String pp = keepTwoOrMorePk_SpecifyDerivedReferrer_LendingCollectionList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "LIBRARY_ID, LB_USER_ID", "LIBRARY_ID, LB_USER_ID", pp, "lendingCollectionList", al, op);
    }
    public Map<String, LdLendingCollectionCQ> getTwoOrMorePk_SpecifyDerivedReferrer_LendingCollectionList() { return xgetSQueMap("twoOrMorePk_SpecifyDerivedReferrer_LendingCollectionList"); }
    public String keepTwoOrMorePk_SpecifyDerivedReferrer_LendingCollectionList(LdLendingCollectionCQ sq) { return xkeepSQue("twoOrMorePk_SpecifyDerivedReferrer_LendingCollectionList", sq); }

    // ===================================================================================
    //                                              (Query)DerivedReferrer for Compound PK
    //                                              ======================================
    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br />
     * {FOO &lt;= (select max(BAR) from LENDING where ...)} <br />
     * LENDING by LIBRARY_ID, LB_USER_ID, named 'lendingAsOne'.
     * <pre>
     * cb.query().<span style="color: #DD4747">derivedLendingList()</span>.<span style="color: #DD4747">max</span>(new SubQuery&lt;LdLendingCB&gt;() {
     *     public void query(LdLendingCB subCB) {
     *         subCB.specify().<span style="color: #DD4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *         subCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     *     }
     * }).<span style="color: #DD4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<LdLendingCB> derivedLendingList() {
        return xcreateQDRFunctionLendingList();
    }
    protected HpQDRFunction<LdLendingCB> xcreateQDRFunctionLendingList() {
        return new HpQDRFunction<LdLendingCB>(new HpQDRSetupper<LdLendingCB>() {
            public void setup(String fn, SubQuery<LdLendingCB> sq, String rd, Object vl, DerivedReferrerOption op) {
                xqderiveLendingList(fn, sq, rd, vl, op);
            }
        });
    }
    public void xqderiveLendingList(String fn, SubQuery<LdLendingCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        LdLendingCB cb = new LdLendingCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        String sqpp = keepTwoOrMorePk_QueryDerivedReferrer_LendingList(cb.query()); String prpp = keepTwoOrMorePk_QueryDerivedReferrer_LendingListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "LIBRARY_ID, LB_USER_ID", "LIBRARY_ID, LB_USER_ID", sqpp, "lendingList", rd, vl, prpp, op);
    }
    public Map<String, LdLendingCQ> getTwoOrMorePk_QueryDerivedReferrer_LendingList() { return xgetSQueMap("twoOrMorePk_QueryDerivedReferrer_LendingList"); }
    public String keepTwoOrMorePk_QueryDerivedReferrer_LendingList(LdLendingCQ sq) { return xkeepSQue("twoOrMorePk_QueryDerivedReferrer_LendingList", sq); }
    public Map<String, Object> getTwoOrMorePk_QueryDerivedReferrer_LendingListParameter() { return xgetSQuePmMap("twoOrMorePk_QueryDerivedReferrer_LendingList"); }
    public String keepTwoOrMorePk_QueryDerivedReferrer_LendingListParameter(Object pm) { return xkeepSQuePm("twoOrMorePk_QueryDerivedReferrer_LendingList", pm); }

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br />
     * {FOO &lt;= (select max(BAR) from LENDING_COLLECTION where ...)} <br />
     * LENDING_COLLECTION by LIBRARY_ID, LB_USER_ID, named 'lendingCollectionAsOne'.
     * <pre>
     * cb.query().<span style="color: #DD4747">derivedLendingCollectionList()</span>.<span style="color: #DD4747">max</span>(new SubQuery&lt;LdLendingCollectionCB&gt;() {
     *     public void query(LdLendingCollectionCB subCB) {
     *         subCB.specify().<span style="color: #DD4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *         subCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     *     }
     * }).<span style="color: #DD4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<LdLendingCollectionCB> derivedLendingCollectionList() {
        return xcreateQDRFunctionLendingCollectionList();
    }
    protected HpQDRFunction<LdLendingCollectionCB> xcreateQDRFunctionLendingCollectionList() {
        return new HpQDRFunction<LdLendingCollectionCB>(new HpQDRSetupper<LdLendingCollectionCB>() {
            public void setup(String fn, SubQuery<LdLendingCollectionCB> sq, String rd, Object vl, DerivedReferrerOption op) {
                xqderiveLendingCollectionList(fn, sq, rd, vl, op);
            }
        });
    }
    public void xqderiveLendingCollectionList(String fn, SubQuery<LdLendingCollectionCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        LdLendingCollectionCB cb = new LdLendingCollectionCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        String sqpp = keepTwoOrMorePk_QueryDerivedReferrer_LendingCollectionList(cb.query()); String prpp = keepTwoOrMorePk_QueryDerivedReferrer_LendingCollectionListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "LIBRARY_ID, LB_USER_ID", "LIBRARY_ID, LB_USER_ID", sqpp, "lendingCollectionList", rd, vl, prpp, op);
    }
    public Map<String, LdLendingCollectionCQ> getTwoOrMorePk_QueryDerivedReferrer_LendingCollectionList() { return xgetSQueMap("twoOrMorePk_QueryDerivedReferrer_LendingCollectionList"); }
    public String keepTwoOrMorePk_QueryDerivedReferrer_LendingCollectionList(LdLendingCollectionCQ sq) { return xkeepSQue("twoOrMorePk_QueryDerivedReferrer_LendingCollectionList", sq); }
    public Map<String, Object> getTwoOrMorePk_QueryDerivedReferrer_LendingCollectionListParameter() { return xgetSQuePmMap("twoOrMorePk_QueryDerivedReferrer_LendingCollectionList"); }
    public String keepTwoOrMorePk_QueryDerivedReferrer_LendingCollectionListParameter(Object pm) { return xkeepSQuePm("twoOrMorePk_QueryDerivedReferrer_LendingCollectionList", pm); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return LdLibraryUserCB.class.getName(); }
    protected String xCQ() { return LdLibraryUserCQ.class.getName(); }
    protected String xCHp() { return HpCalculator.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
