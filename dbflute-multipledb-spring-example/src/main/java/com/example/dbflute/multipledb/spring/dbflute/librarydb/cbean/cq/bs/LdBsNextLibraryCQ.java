/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */package com.example.dbflute.multipledb.spring.dbflute.librarydb.cbean.cq.bs;

import java.util.Map;

import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import org.seasar.dbflute.exception.IllegalConditionBeanOperationException;
import com.example.dbflute.multipledb.spring.dbflute.librarydb.cbean.cq.ciq.*;
import com.example.dbflute.multipledb.spring.dbflute.librarydb.cbean.*;
import com.example.dbflute.multipledb.spring.dbflute.librarydb.cbean.cq.*;

/**
 * The base condition-query of NEXT_LIBRARY.
 * @author DBFlute(AutoGenerator)
 */
public class LdBsNextLibraryCQ extends LdAbstractBsNextLibraryCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected LdNextLibraryCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public LdBsNextLibraryCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from NEXT_LIBRARY) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public LdNextLibraryCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected LdNextLibraryCIQ xcreateCIQ() {
        LdNextLibraryCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected LdNextLibraryCIQ xnewCIQ() {
        return new LdNextLibraryCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join NEXT_LIBRARY on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public LdNextLibraryCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        LdNextLibraryCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
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

    protected Map<String, LdLibraryCQ> _libraryId_InScopeRelation_LibraryByLibraryIdMap;
    public Map<String, LdLibraryCQ> getLibraryId_InScopeRelation_LibraryByLibraryId() { return _libraryId_InScopeRelation_LibraryByLibraryIdMap; }
    public String keepLibraryId_InScopeRelation_LibraryByLibraryId(LdLibraryCQ sq) {
        if (_libraryId_InScopeRelation_LibraryByLibraryIdMap == null) { _libraryId_InScopeRelation_LibraryByLibraryIdMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_libraryId_InScopeRelation_LibraryByLibraryIdMap.size() + 1);
        _libraryId_InScopeRelation_LibraryByLibraryIdMap.put(ky, sq); return "libraryId_InScopeRelation_LibraryByLibraryId." + ky;
    }

    protected Map<String, LdLibraryCQ> _libraryId_NotInScopeRelation_LibraryByLibraryIdMap;
    public Map<String, LdLibraryCQ> getLibraryId_NotInScopeRelation_LibraryByLibraryId() { return _libraryId_NotInScopeRelation_LibraryByLibraryIdMap; }
    public String keepLibraryId_NotInScopeRelation_LibraryByLibraryId(LdLibraryCQ sq) {
        if (_libraryId_NotInScopeRelation_LibraryByLibraryIdMap == null) { _libraryId_NotInScopeRelation_LibraryByLibraryIdMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_libraryId_NotInScopeRelation_LibraryByLibraryIdMap.size() + 1);
        _libraryId_NotInScopeRelation_LibraryByLibraryIdMap.put(ky, sq); return "libraryId_NotInScopeRelation_LibraryByLibraryId." + ky;
    }

    /** 
     * Add order-by as ascend. <br />
     * LIBRARY_ID: {PK, IX, NotNull, SMALLINT(5), FK to LIBRARY}
     * @return this. (NotNull)
     */
    public LdBsNextLibraryCQ addOrderBy_LibraryId_Asc() { regOBA("LIBRARY_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * LIBRARY_ID: {PK, IX, NotNull, SMALLINT(5), FK to LIBRARY}
     * @return this. (NotNull)
     */
    public LdBsNextLibraryCQ addOrderBy_LibraryId_Desc() { regOBD("LIBRARY_ID"); return this; }

    protected ConditionValue _nextLibraryId;
    public ConditionValue getNextLibraryId() {
        if (_nextLibraryId == null) { _nextLibraryId = nCV(); }
        return _nextLibraryId;
    }
    protected ConditionValue getCValueNextLibraryId() { return getNextLibraryId(); }

    protected Map<String, LdLibraryCQ> _nextLibraryId_InScopeRelation_LibraryByNextLibraryIdMap;
    public Map<String, LdLibraryCQ> getNextLibraryId_InScopeRelation_LibraryByNextLibraryId() { return _nextLibraryId_InScopeRelation_LibraryByNextLibraryIdMap; }
    public String keepNextLibraryId_InScopeRelation_LibraryByNextLibraryId(LdLibraryCQ sq) {
        if (_nextLibraryId_InScopeRelation_LibraryByNextLibraryIdMap == null) { _nextLibraryId_InScopeRelation_LibraryByNextLibraryIdMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_nextLibraryId_InScopeRelation_LibraryByNextLibraryIdMap.size() + 1);
        _nextLibraryId_InScopeRelation_LibraryByNextLibraryIdMap.put(ky, sq); return "nextLibraryId_InScopeRelation_LibraryByNextLibraryId." + ky;
    }

    protected Map<String, LdLibraryCQ> _nextLibraryId_NotInScopeRelation_LibraryByNextLibraryIdMap;
    public Map<String, LdLibraryCQ> getNextLibraryId_NotInScopeRelation_LibraryByNextLibraryId() { return _nextLibraryId_NotInScopeRelation_LibraryByNextLibraryIdMap; }
    public String keepNextLibraryId_NotInScopeRelation_LibraryByNextLibraryId(LdLibraryCQ sq) {
        if (_nextLibraryId_NotInScopeRelation_LibraryByNextLibraryIdMap == null) { _nextLibraryId_NotInScopeRelation_LibraryByNextLibraryIdMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_nextLibraryId_NotInScopeRelation_LibraryByNextLibraryIdMap.size() + 1);
        _nextLibraryId_NotInScopeRelation_LibraryByNextLibraryIdMap.put(ky, sq); return "nextLibraryId_NotInScopeRelation_LibraryByNextLibraryId." + ky;
    }

    /** 
     * Add order-by as ascend. <br />
     * NEXT_LIBRARY_ID: {PK, IX, NotNull, SMALLINT(5), FK to LIBRARY}
     * @return this. (NotNull)
     */
    public LdBsNextLibraryCQ addOrderBy_NextLibraryId_Asc() { regOBA("NEXT_LIBRARY_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * NEXT_LIBRARY_ID: {PK, IX, NotNull, SMALLINT(5), FK to LIBRARY}
     * @return this. (NotNull)
     */
    public LdBsNextLibraryCQ addOrderBy_NextLibraryId_Desc() { regOBD("NEXT_LIBRARY_ID"); return this; }

    protected ConditionValue _distanceKm;
    public ConditionValue getDistanceKm() {
        if (_distanceKm == null) { _distanceKm = nCV(); }
        return _distanceKm;
    }
    protected ConditionValue getCValueDistanceKm() { return getDistanceKm(); }

    /** 
     * Add order-by as ascend. <br />
     * DISTANCE_KM: {NotNull, NUMERIC(4, 2)}
     * @return this. (NotNull)
     */
    public LdBsNextLibraryCQ addOrderBy_DistanceKm_Asc() { regOBA("DISTANCE_KM"); return this; }

    /**
     * Add order-by as descend. <br />
     * DISTANCE_KM: {NotNull, NUMERIC(4, 2)}
     * @return this. (NotNull)
     */
    public LdBsNextLibraryCQ addOrderBy_DistanceKm_Desc() { regOBD("DISTANCE_KM"); return this; }

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
    public LdBsNextLibraryCQ addOrderBy_RUser_Asc() { regOBA("R_USER"); return this; }

    /**
     * Add order-by as descend. <br />
     * R_USER: {NotNull, VARCHAR(100), default=[default-user]}
     * @return this. (NotNull)
     */
    public LdBsNextLibraryCQ addOrderBy_RUser_Desc() { regOBD("R_USER"); return this; }

    protected ConditionValue _rModule;
    public ConditionValue getRModule() {
        if (_rModule == null) { _rModule = nCV(); }
        return _rModule;
    }
    protected ConditionValue getCValueRModule() { return getRModule(); }

    /** 
     * Add order-by as ascend. <br />
     * R_MODULE: {NotNull, VARCHAR(100), default=[default-module]}
     * @return this. (NotNull)
     */
    public LdBsNextLibraryCQ addOrderBy_RModule_Asc() { regOBA("R_MODULE"); return this; }

    /**
     * Add order-by as descend. <br />
     * R_MODULE: {NotNull, VARCHAR(100), default=[default-module]}
     * @return this. (NotNull)
     */
    public LdBsNextLibraryCQ addOrderBy_RModule_Desc() { regOBD("R_MODULE"); return this; }

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
    public LdBsNextLibraryCQ addOrderBy_RTimestamp_Asc() { regOBA("R_TIMESTAMP"); return this; }

    /**
     * Add order-by as descend. <br />
     * R_TIMESTAMP: {NotNull, TIMESTAMP(26, 6), default=[CURRENT_TIMESTAMP]}
     * @return this. (NotNull)
     */
    public LdBsNextLibraryCQ addOrderBy_RTimestamp_Desc() { regOBD("R_TIMESTAMP"); return this; }

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
    public LdBsNextLibraryCQ addOrderBy_UUser_Asc() { regOBA("U_USER"); return this; }

    /**
     * Add order-by as descend. <br />
     * U_USER: {NotNull, VARCHAR(100), default=[default-user]}
     * @return this. (NotNull)
     */
    public LdBsNextLibraryCQ addOrderBy_UUser_Desc() { regOBD("U_USER"); return this; }

    protected ConditionValue _uModule;
    public ConditionValue getUModule() {
        if (_uModule == null) { _uModule = nCV(); }
        return _uModule;
    }
    protected ConditionValue getCValueUModule() { return getUModule(); }

    /** 
     * Add order-by as ascend. <br />
     * U_MODULE: {NotNull, VARCHAR(100), default=[default-module]}
     * @return this. (NotNull)
     */
    public LdBsNextLibraryCQ addOrderBy_UModule_Asc() { regOBA("U_MODULE"); return this; }

    /**
     * Add order-by as descend. <br />
     * U_MODULE: {NotNull, VARCHAR(100), default=[default-module]}
     * @return this. (NotNull)
     */
    public LdBsNextLibraryCQ addOrderBy_UModule_Desc() { regOBD("U_MODULE"); return this; }

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
    public LdBsNextLibraryCQ addOrderBy_UTimestamp_Asc() { regOBA("U_TIMESTAMP"); return this; }

    /**
     * Add order-by as descend. <br />
     * U_TIMESTAMP: {NotNull, TIMESTAMP(26, 6), default=[CURRENT_TIMESTAMP]}
     * @return this. (NotNull)
     */
    public LdBsNextLibraryCQ addOrderBy_UTimestamp_Desc() { regOBD("U_TIMESTAMP"); return this; }

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
    public LdBsNextLibraryCQ addSpecifiedDerivedOrderBy_Asc(String aliasName)
    { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public LdBsNextLibraryCQ addSpecifiedDerivedOrderBy_Desc(String aliasName)
    { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    protected void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        LdNextLibraryCQ bq = (LdNextLibraryCQ)bqs;
        LdNextLibraryCQ uq = (LdNextLibraryCQ)uqs;
        if (bq.hasConditionQueryLibraryByLibraryId()) {
            uq.queryLibraryByLibraryId().reflectRelationOnUnionQuery(bq.queryLibraryByLibraryId(), uq.queryLibraryByLibraryId());
        }
        if (bq.hasConditionQueryLibraryByNextLibraryId()) {
            uq.queryLibraryByNextLibraryId().reflectRelationOnUnionQuery(bq.queryLibraryByNextLibraryId(), uq.queryLibraryByNextLibraryId());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br />
     * LIBRARY by my LIBRARY_ID, named 'libraryByLibraryId'.
     * @return The instance of condition-query. (NotNull)
     */
    public LdLibraryCQ queryLibraryByLibraryId() {
        return getConditionQueryLibraryByLibraryId();
    }
    protected LdLibraryCQ _conditionQueryLibraryByLibraryId;
    public LdLibraryCQ getConditionQueryLibraryByLibraryId() {
        if (_conditionQueryLibraryByLibraryId == null) {
            _conditionQueryLibraryByLibraryId = xcreateQueryLibraryByLibraryId();
            xsetupOuterJoinLibraryByLibraryId();
        }
        return _conditionQueryLibraryByLibraryId;
    }
    protected LdLibraryCQ xcreateQueryLibraryByLibraryId() {
        String nrp = resolveNextRelationPath("NEXT_LIBRARY", "libraryByLibraryId");
        String jan = resolveJoinAliasName(nrp, xgetNextNestLevel());
        LdLibraryCQ cq = new LdLibraryCQ(this, xgetSqlClause(), jan, xgetNextNestLevel());
        cq.xsetBaseCB(_baseCB);
        cq.xsetForeignPropertyName("libraryByLibraryId");
        cq.xsetRelationPath(nrp); return cq;
    }
    protected void xsetupOuterJoinLibraryByLibraryId() {
        LdLibraryCQ cq = getConditionQueryLibraryByLibraryId();
        Map<String, String> joinOnMap = newLinkedHashMapSized(4);
        joinOnMap.put("LIBRARY_ID", "LIBRARY_ID");
        registerOuterJoin(cq, joinOnMap, "libraryByLibraryId");
    }
    public boolean hasConditionQueryLibraryByLibraryId() {
        return _conditionQueryLibraryByLibraryId != null;
    }

    /**
     * Get the condition-query for relation table. <br />
     * LIBRARY by my NEXT_LIBRARY_ID, named 'libraryByNextLibraryId'.
     * @return The instance of condition-query. (NotNull)
     */
    public LdLibraryCQ queryLibraryByNextLibraryId() {
        return getConditionQueryLibraryByNextLibraryId();
    }
    protected LdLibraryCQ _conditionQueryLibraryByNextLibraryId;
    public LdLibraryCQ getConditionQueryLibraryByNextLibraryId() {
        if (_conditionQueryLibraryByNextLibraryId == null) {
            _conditionQueryLibraryByNextLibraryId = xcreateQueryLibraryByNextLibraryId();
            xsetupOuterJoinLibraryByNextLibraryId();
        }
        return _conditionQueryLibraryByNextLibraryId;
    }
    protected LdLibraryCQ xcreateQueryLibraryByNextLibraryId() {
        String nrp = resolveNextRelationPath("NEXT_LIBRARY", "libraryByNextLibraryId");
        String jan = resolveJoinAliasName(nrp, xgetNextNestLevel());
        LdLibraryCQ cq = new LdLibraryCQ(this, xgetSqlClause(), jan, xgetNextNestLevel());
        cq.xsetBaseCB(_baseCB);
        cq.xsetForeignPropertyName("libraryByNextLibraryId");
        cq.xsetRelationPath(nrp); return cq;
    }
    protected void xsetupOuterJoinLibraryByNextLibraryId() {
        LdLibraryCQ cq = getConditionQueryLibraryByNextLibraryId();
        Map<String, String> joinOnMap = newLinkedHashMapSized(4);
        joinOnMap.put("NEXT_LIBRARY_ID", "LIBRARY_ID");
        registerOuterJoin(cq, joinOnMap, "libraryByNextLibraryId");
    }
    public boolean hasConditionQueryLibraryByNextLibraryId() {
        return _conditionQueryLibraryByNextLibraryId != null;
    }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return LdNextLibraryCB.class.getName(); }
    protected String xCQ() { return LdNextLibraryCQ.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
