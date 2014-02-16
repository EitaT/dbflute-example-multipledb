/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */package com.example.dbflute.multipledb.seasar.dbflute.librarydb.cbean.cq.bs;

import java.util.Map;

import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import org.seasar.dbflute.exception.IllegalConditionBeanOperationException;
import com.example.dbflute.multipledb.seasar.dbflute.librarydb.cbean.cq.ciq.*;
import com.example.dbflute.multipledb.seasar.dbflute.librarydb.cbean.*;
import com.example.dbflute.multipledb.seasar.dbflute.librarydb.cbean.cq.*;

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
    public LdBsLendingCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from LENDING) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">inline()</span>.setFoo...;
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
     * cb.query().queryMemberStatus().<span style="color: #FD4747">on()</span>.setFoo...;
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
    public ConditionValue getLibraryId() {
        if (_libraryId == null) { _libraryId = nCV(); }
        return _libraryId;
    }
    protected ConditionValue getCValueLibraryId() { return getLibraryId(); }

    /** 
     * Add order-by as ascend. <br />
     * LIBRARY_ID: {PK, IX, NotNull, SMALLINT(5), FK to LIBRARY_USER}
     * @return this. (NotNull)
     */
    public LdBsLendingCQ addOrderBy_LibraryId_Asc() { regOBA("LIBRARY_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * LIBRARY_ID: {PK, IX, NotNull, SMALLINT(5), FK to LIBRARY_USER}
     * @return this. (NotNull)
     */
    public LdBsLendingCQ addOrderBy_LibraryId_Desc() { regOBD("LIBRARY_ID"); return this; }

    protected ConditionValue _lbUserId;
    public ConditionValue getLbUserId() {
        if (_lbUserId == null) { _lbUserId = nCV(); }
        return _lbUserId;
    }
    protected ConditionValue getCValueLbUserId() { return getLbUserId(); }

    /** 
     * Add order-by as ascend. <br />
     * LB_USER_ID: {PK, IX+, NotNull, INTEGER(10), FK to LIBRARY_USER}
     * @return this. (NotNull)
     */
    public LdBsLendingCQ addOrderBy_LbUserId_Asc() { regOBA("LB_USER_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * LB_USER_ID: {PK, IX+, NotNull, INTEGER(10), FK to LIBRARY_USER}
     * @return this. (NotNull)
     */
    public LdBsLendingCQ addOrderBy_LbUserId_Desc() { regOBD("LB_USER_ID"); return this; }

    protected ConditionValue _lendingDate;
    public ConditionValue getLendingDate() {
        if (_lendingDate == null) { _lendingDate = nCV(); }
        return _lendingDate;
    }
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
    public ConditionValue getRUser() {
        if (_rUser == null) { _rUser = nCV(); }
        return _rUser;
    }
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
    public ConditionValue getRModule() {
        if (_rModule == null) { _rModule = nCV(); }
        return _rModule;
    }
    protected ConditionValue getCValueRModule() { return getRModule(); }

    /** 
     * Add order-by as ascend. <br />
     * R_MODULE: {NotNull, VARCHAR(100), default=[default-module], classification=RegisterModuleType}
     * @return this. (NotNull)
     */
    public LdBsLendingCQ addOrderBy_RModule_Asc() { regOBA("R_MODULE"); return this; }

    /**
     * Add order-by as descend. <br />
     * R_MODULE: {NotNull, VARCHAR(100), default=[default-module], classification=RegisterModuleType}
     * @return this. (NotNull)
     */
    public LdBsLendingCQ addOrderBy_RModule_Desc() { regOBD("R_MODULE"); return this; }

    protected ConditionValue _rTimestamp;
    public ConditionValue getRTimestamp() {
        if (_rTimestamp == null) { _rTimestamp = nCV(); }
        return _rTimestamp;
    }
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
    public ConditionValue getUUser() {
        if (_uUser == null) { _uUser = nCV(); }
        return _uUser;
    }
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
    public ConditionValue getUModule() {
        if (_uModule == null) { _uModule = nCV(); }
        return _uModule;
    }
    protected ConditionValue getCValueUModule() { return getUModule(); }

    /** 
     * Add order-by as ascend. <br />
     * U_MODULE: {NotNull, VARCHAR(100), default=[default-module], classification=UpdateModuleType}
     * @return this. (NotNull)
     */
    public LdBsLendingCQ addOrderBy_UModule_Asc() { regOBA("U_MODULE"); return this; }

    /**
     * Add order-by as descend. <br />
     * U_MODULE: {NotNull, VARCHAR(100), default=[default-module], classification=UpdateModuleType}
     * @return this. (NotNull)
     */
    public LdBsLendingCQ addOrderBy_UModule_Desc() { regOBD("U_MODULE"); return this; }

    protected ConditionValue _uTimestamp;
    public ConditionValue getUTimestamp() {
        if (_uTimestamp == null) { _uTimestamp = nCV(); }
        return _uTimestamp;
    }
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
     * }, <span style="color: #FD4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] asc</span>
     * cb.<span style="color: #FD4747">addSpecifiedDerivedOrderBy_Asc</span>(<span style="color: #FD4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public LdBsLendingCQ addSpecifiedDerivedOrderBy_Asc(String aliasName)
    { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

    /**
     * Add order-by for specified derived column as descend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #FD4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] desc</span>
     * cb.<span style="color: #FD4747">addSpecifiedDerivedOrderBy_Desc</span>(<span style="color: #FD4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public LdBsLendingCQ addSpecifiedDerivedOrderBy_Desc(String aliasName)
    { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    protected void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
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
    protected LdLibraryUserCQ _conditionQueryLibraryUser;
    public LdLibraryUserCQ getConditionQueryLibraryUser() {
        if (_conditionQueryLibraryUser == null) {
            _conditionQueryLibraryUser = xcreateQueryLibraryUser();
            xsetupOuterJoinLibraryUser();
        }
        return _conditionQueryLibraryUser;
    }
    protected LdLibraryUserCQ xcreateQueryLibraryUser() {
        String nrp = resolveNextRelationPath("LENDING", "libraryUser");
        String jan = resolveJoinAliasName(nrp, xgetNextNestLevel());
        LdLibraryUserCQ cq = new LdLibraryUserCQ(this, xgetSqlClause(), jan, xgetNextNestLevel());
        cq.xsetBaseCB(_baseCB);
        cq.xsetForeignPropertyName("libraryUser");
        cq.xsetRelationPath(nrp); return cq;
    }
    protected void xsetupOuterJoinLibraryUser() {
        LdLibraryUserCQ cq = getConditionQueryLibraryUser();
        Map<String, String> joinOnMap = newLinkedHashMapSized(4);
        joinOnMap.put("LIBRARY_ID", "LIBRARY_ID");
        joinOnMap.put("LB_USER_ID", "LB_USER_ID");
        registerOuterJoin(cq, joinOnMap, "libraryUser");
    }
    public boolean hasConditionQueryLibraryUser() {
        return _conditionQueryLibraryUser != null;
    }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                       Compound PK's Exists Referrer
    //                                                       =============================
    /**
     * Set up 'exists-referrer' (co-related sub-query). <br />
     * {exists (select ... from LENDING_COLLECTION where ...)}
     * @param subQuery The sub-query of LendingCollectionList for 'exists'. (NotNull)
     */
    public void existsLendingCollectionList(SubQuery<LdLendingCollectionCB> subQuery) {
        assertObjectNotNull("subQuery<LdLendingCollectionCB>", subQuery);
        LdLendingCollectionCB cb = new LdLendingCollectionCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String pp = keepTwoOrMorePk_ExistsReferrer_LendingCollectionList(cb.query()); // for saving query-value.
        registerExistsReferrer(cb.query(), "LIBRARY_ID, LB_USER_ID, LENDING_DATE", "LIBRARY_ID, LB_USER_ID, LENDING_DATE", pp, "lendingCollectionList");
    }
    protected Map<String, LdLendingCollectionCQ> _twoOrMorePk_ExistsReferrer_LendingCollectionListMap;
    public Map<String, LdLendingCollectionCQ> getTwoOrMorePk_ExistsReferrer_LendingCollectionList() { return _twoOrMorePk_ExistsReferrer_LendingCollectionListMap; }
    public String keepTwoOrMorePk_ExistsReferrer_LendingCollectionList(LdLendingCollectionCQ sq) {
        if (_twoOrMorePk_ExistsReferrer_LendingCollectionListMap == null) { _twoOrMorePk_ExistsReferrer_LendingCollectionListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_twoOrMorePk_ExistsReferrer_LendingCollectionListMap.size() + 1);
        _twoOrMorePk_ExistsReferrer_LendingCollectionListMap.put(ky, sq); return "twoOrMorePk_ExistsReferrer_LendingCollectionList." + ky;
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return LdLendingCB.class.getName(); }
    protected String xCQ() { return LdLendingCQ.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
