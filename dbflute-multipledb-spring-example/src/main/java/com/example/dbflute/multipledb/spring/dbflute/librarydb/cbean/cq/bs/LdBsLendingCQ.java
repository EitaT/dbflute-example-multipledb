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
 * The base condition-query of LENDING.
 * @author DBFlute(AutoGenerator)
 */
public class LdBsLendingCQ extends LdAbstractBsLendingCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected LdLendingCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public LdBsLendingCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from LENDING) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public LdLendingCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected LdLendingCIQ xcreateCIQ() {
        LdLendingCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected LdLendingCIQ xnewCIQ() {
        return new LdLendingCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join LENDING on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public LdLendingCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        LdLendingCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _libraryId;
    public ConditionValue getLibraryId()
    { if (_libraryId == null) { _libraryId = nCV(); }
      return _libraryId; }
    protected ConditionValue getCValueLibraryId() { return getLibraryId(); }

    /** 
     * Add order-by as ascend. <br />
     * LIBRARY_ID: {PK, IX+, NotNull, SMALLINT(5), FK to LIBRARY_USER}
     * @return this. (NotNull)
     */
    public LdBsLendingCQ addOrderBy_LibraryId_Asc() { regOBA("LIBRARY_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * LIBRARY_ID: {PK, IX+, NotNull, SMALLINT(5), FK to LIBRARY_USER}
     * @return this. (NotNull)
     */
    public LdBsLendingCQ addOrderBy_LibraryId_Desc() { regOBD("LIBRARY_ID"); return this; }

    protected ConditionValue _lbUserId;
    public ConditionValue getLbUserId()
    { if (_lbUserId == null) { _lbUserId = nCV(); }
      return _lbUserId; }
    protected ConditionValue getCValueLbUserId() { return getLbUserId(); }

    /** 
     * Add order-by as ascend. <br />
     * LB_USER_ID: {PK, NotNull, INTEGER(10), FK to LIBRARY_USER}
     * @return this. (NotNull)
     */
    public LdBsLendingCQ addOrderBy_LbUserId_Asc() { regOBA("LB_USER_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * LB_USER_ID: {PK, NotNull, INTEGER(10), FK to LIBRARY_USER}
     * @return this. (NotNull)
     */
    public LdBsLendingCQ addOrderBy_LbUserId_Desc() { regOBD("LB_USER_ID"); return this; }

    protected ConditionValue _lendingDate;
    public ConditionValue getLendingDate()
    { if (_lendingDate == null) { _lendingDate = nCV(); }
      return _lendingDate; }
    protected ConditionValue getCValueLendingDate() { return getLendingDate(); }

    /** 
     * Add order-by as ascend. <br />
     * LENDING_DATE: {PK, NotNull, TIMESTAMP(26, 6)}
     * @return this. (NotNull)
     */
    public LdBsLendingCQ addOrderBy_LendingDate_Asc() { regOBA("LENDING_DATE"); return this; }

    /**
     * Add order-by as descend. <br />
     * LENDING_DATE: {PK, NotNull, TIMESTAMP(26, 6)}
     * @return this. (NotNull)
     */
    public LdBsLendingCQ addOrderBy_LendingDate_Desc() { regOBD("LENDING_DATE"); return this; }

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
    public LdBsLendingCQ addOrderBy_RUser_Asc() { regOBA("R_USER"); return this; }

    /**
     * Add order-by as descend. <br />
     * R_USER: {NotNull, VARCHAR(100), default=[default-user]}
     * @return this. (NotNull)
     */
    public LdBsLendingCQ addOrderBy_RUser_Desc() { regOBD("R_USER"); return this; }

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
    public LdBsLendingCQ addOrderBy_RModule_Asc() { regOBA("R_MODULE"); return this; }

    /**
     * Add order-by as descend. <br />
     * R_MODULE: {NotNull, VARCHAR(100), default=[default-module]}
     * @return this. (NotNull)
     */
    public LdBsLendingCQ addOrderBy_RModule_Desc() { regOBD("R_MODULE"); return this; }

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
    public LdBsLendingCQ addOrderBy_RTimestamp_Asc() { regOBA("R_TIMESTAMP"); return this; }

    /**
     * Add order-by as descend. <br />
     * R_TIMESTAMP: {NotNull, TIMESTAMP(26, 6), default=[CURRENT_TIMESTAMP]}
     * @return this. (NotNull)
     */
    public LdBsLendingCQ addOrderBy_RTimestamp_Desc() { regOBD("R_TIMESTAMP"); return this; }

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
    public LdBsLendingCQ addOrderBy_UUser_Asc() { regOBA("U_USER"); return this; }

    /**
     * Add order-by as descend. <br />
     * U_USER: {NotNull, VARCHAR(100), default=[default-user]}
     * @return this. (NotNull)
     */
    public LdBsLendingCQ addOrderBy_UUser_Desc() { regOBD("U_USER"); return this; }

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
    public LdBsLendingCQ addOrderBy_UModule_Asc() { regOBA("U_MODULE"); return this; }

    /**
     * Add order-by as descend. <br />
     * U_MODULE: {NotNull, VARCHAR(100), default=[default-module]}
     * @return this. (NotNull)
     */
    public LdBsLendingCQ addOrderBy_UModule_Desc() { regOBD("U_MODULE"); return this; }

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
    public LdBsLendingCQ addOrderBy_UTimestamp_Asc() { regOBA("U_TIMESTAMP"); return this; }

    /**
     * Add order-by as descend. <br />
     * U_TIMESTAMP: {NotNull, TIMESTAMP(26, 6), default=[CURRENT_TIMESTAMP]}
     * @return this. (NotNull)
     */
    public LdBsLendingCQ addOrderBy_UTimestamp_Desc() { regOBD("U_TIMESTAMP"); return this; }

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
    public LdBsLendingCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public LdBsLendingCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        LdLendingCQ bq = (LdLendingCQ)bqs;
        LdLendingCQ uq = (LdLendingCQ)uqs;
        if (bq.hasConditionQueryLibraryUser()) {
            uq.queryLibraryUser().reflectRelationOnUnionQuery(bq.queryLibraryUser(), uq.queryLibraryUser());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br />
     * LIBRARY_USER by my LIBRARY_ID, LB_USER_ID, named 'libraryUser'.
     * @return The instance of condition-query. (NotNull)
     */
    public LdLibraryUserCQ queryLibraryUser() {
        return getConditionQueryLibraryUser();
    }
    public LdLibraryUserCQ getConditionQueryLibraryUser() {
        String prop = "libraryUser";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryLibraryUser()); xsetupOuterJoinLibraryUser(); }
        return xgetQueRlMap(prop);
    }
    protected LdLibraryUserCQ xcreateQueryLibraryUser() {
        String nrp = xresolveNRP("LENDING", "libraryUser"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new LdLibraryUserCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "libraryUser", nrp);
    }
    protected void xsetupOuterJoinLibraryUser() { xregOutJo("libraryUser"); }
    public boolean hasConditionQueryLibraryUser() { return xhasQueRlMap("libraryUser"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, LdLendingCQ> getScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(LdLendingCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                      ExistsReferrer for Compound PK
    //                                                      ==============================
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
        registerExistsReferrer(cb.query(), "LIBRARY_ID, LB_USER_ID, LENDING_DATE", "LIBRARY_ID, LB_USER_ID, LENDING_DATE", pp, "lendingCollectionList");
    }
    public Map<String, LdLendingCollectionCQ> getTwoOrMorePk_ExistsReferrer_LendingCollectionList() { return xgetSQueMap("twoOrMorePk_ExistsReferrer_LendingCollectionList"); }
    public String keepTwoOrMorePk_ExistsReferrer_LendingCollectionList(LdLendingCollectionCQ sq) { return xkeepSQue("twoOrMorePk_ExistsReferrer_LendingCollectionList", sq); }

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
        registerNotExistsReferrer(cb.query(), "LIBRARY_ID, LB_USER_ID, LENDING_DATE", "LIBRARY_ID, LB_USER_ID, LENDING_DATE", pp, "lendingCollectionList");
    }
    public Map<String, LdLendingCollectionCQ> getTwoOrMorePk_NotExistsReferrer_LendingCollectionList() { return xgetSQueMap("twoOrMorePk_NotExistsReferrer_LendingCollectionList"); }
    public String keepTwoOrMorePk_NotExistsReferrer_LendingCollectionList(LdLendingCollectionCQ sq) { return xkeepSQue("twoOrMorePk_NotExistsReferrer_LendingCollectionList", sq); }

    // ===================================================================================
    //                                            (Specify)DerivedReferrer for Compound PK
    //                                            ========================================
    // ===================================================================================
    //                                              (Query)DerivedReferrer for Compound PK
    //                                              ======================================
    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return LdLendingCB.class.getName(); }
    protected String xCQ() { return LdLendingCQ.class.getName(); }
    protected String xCHp() { return HpCalculator.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
