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
 * The base condition-query of COLLECTION_STATUS.
 * @author DBFlute(AutoGenerator)
 */
public class LdBsCollectionStatusCQ extends LdAbstractBsCollectionStatusCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected LdCollectionStatusCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public LdBsCollectionStatusCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from COLLECTION_STATUS) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public LdCollectionStatusCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected LdCollectionStatusCIQ xcreateCIQ() {
        LdCollectionStatusCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected LdCollectionStatusCIQ xnewCIQ() {
        return new LdCollectionStatusCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join COLLECTION_STATUS on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public LdCollectionStatusCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        LdCollectionStatusCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _collectionId;
    public ConditionValue getCollectionId() {
        if (_collectionId == null) { _collectionId = nCV(); }
        return _collectionId;
    }
    protected ConditionValue getCValueCollectionId() { return getCollectionId(); }

    protected Map<String, LdCollectionCQ> _collectionId_InScopeRelation_CollectionMap;
    public Map<String, LdCollectionCQ> getCollectionId_InScopeRelation_Collection() { return _collectionId_InScopeRelation_CollectionMap; }
    public String keepCollectionId_InScopeRelation_Collection(LdCollectionCQ sq) {
        if (_collectionId_InScopeRelation_CollectionMap == null) { _collectionId_InScopeRelation_CollectionMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_collectionId_InScopeRelation_CollectionMap.size() + 1);
        _collectionId_InScopeRelation_CollectionMap.put(ky, sq); return "collectionId_InScopeRelation_Collection." + ky;
    }

    protected Map<String, LdCollectionCQ> _collectionId_NotInScopeRelation_CollectionMap;
    public Map<String, LdCollectionCQ> getCollectionId_NotInScopeRelation_Collection() { return _collectionId_NotInScopeRelation_CollectionMap; }
    public String keepCollectionId_NotInScopeRelation_Collection(LdCollectionCQ sq) {
        if (_collectionId_NotInScopeRelation_CollectionMap == null) { _collectionId_NotInScopeRelation_CollectionMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_collectionId_NotInScopeRelation_CollectionMap.size() + 1);
        _collectionId_NotInScopeRelation_CollectionMap.put(ky, sq); return "collectionId_NotInScopeRelation_Collection." + ky;
    }

    /** 
     * Add order-by as ascend. <br />
     * COLLECTION_ID: {PK, IX, NotNull, INTEGER(10), FK to COLLECTION}
     * @return this. (NotNull)
     */
    public LdBsCollectionStatusCQ addOrderBy_CollectionId_Asc() { regOBA("COLLECTION_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * COLLECTION_ID: {PK, IX, NotNull, INTEGER(10), FK to COLLECTION}
     * @return this. (NotNull)
     */
    public LdBsCollectionStatusCQ addOrderBy_CollectionId_Desc() { regOBD("COLLECTION_ID"); return this; }

    protected ConditionValue _collectionStatusCode;
    public ConditionValue getCollectionStatusCode() {
        if (_collectionStatusCode == null) { _collectionStatusCode = nCV(); }
        return _collectionStatusCode;
    }
    protected ConditionValue getCValueCollectionStatusCode() { return getCollectionStatusCode(); }

    protected Map<String, LdCollectionStatusLookupCQ> _collectionStatusCode_InScopeRelation_CollectionStatusLookupMap;
    public Map<String, LdCollectionStatusLookupCQ> getCollectionStatusCode_InScopeRelation_CollectionStatusLookup() { return _collectionStatusCode_InScopeRelation_CollectionStatusLookupMap; }
    public String keepCollectionStatusCode_InScopeRelation_CollectionStatusLookup(LdCollectionStatusLookupCQ sq) {
        if (_collectionStatusCode_InScopeRelation_CollectionStatusLookupMap == null) { _collectionStatusCode_InScopeRelation_CollectionStatusLookupMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_collectionStatusCode_InScopeRelation_CollectionStatusLookupMap.size() + 1);
        _collectionStatusCode_InScopeRelation_CollectionStatusLookupMap.put(ky, sq); return "collectionStatusCode_InScopeRelation_CollectionStatusLookup." + ky;
    }

    protected Map<String, LdCollectionStatusLookupCQ> _collectionStatusCode_NotInScopeRelation_CollectionStatusLookupMap;
    public Map<String, LdCollectionStatusLookupCQ> getCollectionStatusCode_NotInScopeRelation_CollectionStatusLookup() { return _collectionStatusCode_NotInScopeRelation_CollectionStatusLookupMap; }
    public String keepCollectionStatusCode_NotInScopeRelation_CollectionStatusLookup(LdCollectionStatusLookupCQ sq) {
        if (_collectionStatusCode_NotInScopeRelation_CollectionStatusLookupMap == null) { _collectionStatusCode_NotInScopeRelation_CollectionStatusLookupMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_collectionStatusCode_NotInScopeRelation_CollectionStatusLookupMap.size() + 1);
        _collectionStatusCode_NotInScopeRelation_CollectionStatusLookupMap.put(ky, sq); return "collectionStatusCode_NotInScopeRelation_CollectionStatusLookup." + ky;
    }

    /** 
     * Add order-by as ascend. <br />
     * COLLECTION_STATUS_CODE: {IX, NotNull, CHAR(3), FK to COLLECTION_STATUS_LOOKUP, classification=CollectionStatus}
     * @return this. (NotNull)
     */
    public LdBsCollectionStatusCQ addOrderBy_CollectionStatusCode_Asc() { regOBA("COLLECTION_STATUS_CODE"); return this; }

    /**
     * Add order-by as descend. <br />
     * COLLECTION_STATUS_CODE: {IX, NotNull, CHAR(3), FK to COLLECTION_STATUS_LOOKUP, classification=CollectionStatus}
     * @return this. (NotNull)
     */
    public LdBsCollectionStatusCQ addOrderBy_CollectionStatusCode_Desc() { regOBD("COLLECTION_STATUS_CODE"); return this; }

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
    public LdBsCollectionStatusCQ addOrderBy_RUser_Asc() { regOBA("R_USER"); return this; }

    /**
     * Add order-by as descend. <br />
     * R_USER: {NotNull, VARCHAR(100), default=[default-user]}
     * @return this. (NotNull)
     */
    public LdBsCollectionStatusCQ addOrderBy_RUser_Desc() { regOBD("R_USER"); return this; }

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
    public LdBsCollectionStatusCQ addOrderBy_RModule_Asc() { regOBA("R_MODULE"); return this; }

    /**
     * Add order-by as descend. <br />
     * R_MODULE: {NotNull, VARCHAR(100), default=[default-module]}
     * @return this. (NotNull)
     */
    public LdBsCollectionStatusCQ addOrderBy_RModule_Desc() { regOBD("R_MODULE"); return this; }

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
    public LdBsCollectionStatusCQ addOrderBy_RTimestamp_Asc() { regOBA("R_TIMESTAMP"); return this; }

    /**
     * Add order-by as descend. <br />
     * R_TIMESTAMP: {NotNull, TIMESTAMP(26, 6), default=[CURRENT_TIMESTAMP]}
     * @return this. (NotNull)
     */
    public LdBsCollectionStatusCQ addOrderBy_RTimestamp_Desc() { regOBD("R_TIMESTAMP"); return this; }

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
    public LdBsCollectionStatusCQ addOrderBy_UUser_Asc() { regOBA("U_USER"); return this; }

    /**
     * Add order-by as descend. <br />
     * U_USER: {NotNull, VARCHAR(100), default=[default-user]}
     * @return this. (NotNull)
     */
    public LdBsCollectionStatusCQ addOrderBy_UUser_Desc() { regOBD("U_USER"); return this; }

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
    public LdBsCollectionStatusCQ addOrderBy_UModule_Asc() { regOBA("U_MODULE"); return this; }

    /**
     * Add order-by as descend. <br />
     * U_MODULE: {NotNull, VARCHAR(100), default=[default-module]}
     * @return this. (NotNull)
     */
    public LdBsCollectionStatusCQ addOrderBy_UModule_Desc() { regOBD("U_MODULE"); return this; }

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
    public LdBsCollectionStatusCQ addOrderBy_UTimestamp_Asc() { regOBA("U_TIMESTAMP"); return this; }

    /**
     * Add order-by as descend. <br />
     * U_TIMESTAMP: {NotNull, TIMESTAMP(26, 6), default=[CURRENT_TIMESTAMP]}
     * @return this. (NotNull)
     */
    public LdBsCollectionStatusCQ addOrderBy_UTimestamp_Desc() { regOBD("U_TIMESTAMP"); return this; }

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
    public LdBsCollectionStatusCQ addSpecifiedDerivedOrderBy_Asc(String aliasName)
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
    public LdBsCollectionStatusCQ addSpecifiedDerivedOrderBy_Desc(String aliasName)
    { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        LdCollectionStatusCQ bq = (LdCollectionStatusCQ)bqs;
        LdCollectionStatusCQ uq = (LdCollectionStatusCQ)uqs;
        if (bq.hasConditionQueryCollection()) {
            uq.queryCollection().reflectRelationOnUnionQuery(bq.queryCollection(), uq.queryCollection());
        }
        if (bq.hasConditionQueryCollectionStatusLookup()) {
            uq.queryCollectionStatusLookup().reflectRelationOnUnionQuery(bq.queryCollectionStatusLookup(), uq.queryCollectionStatusLookup());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br />
     * COLLECTION by my COLLECTION_ID, named 'collection'.
     * @return The instance of condition-query. (NotNull)
     */
    public LdCollectionCQ queryCollection() {
        return getConditionQueryCollection();
    }
    protected LdCollectionCQ _conditionQueryCollection;
    public LdCollectionCQ getConditionQueryCollection() {
        if (_conditionQueryCollection == null) {
            _conditionQueryCollection = xcreateQueryCollection();
            xsetupOuterJoinCollection();
        }
        return _conditionQueryCollection;
    }
    protected LdCollectionCQ xcreateQueryCollection() {
        String nrp = resolveNextRelationPath("COLLECTION_STATUS", "collection");
        String jan = resolveJoinAliasName(nrp, xgetNextNestLevel());
        LdCollectionCQ cq = new LdCollectionCQ(this, xgetSqlClause(), jan, xgetNextNestLevel());
        cq.xsetBaseCB(_baseCB);
        cq.xsetForeignPropertyName("collection");
        cq.xsetRelationPath(nrp); return cq;
    }
    protected void xsetupOuterJoinCollection() {
        LdCollectionCQ cq = getConditionQueryCollection();
        Map<String, String> joinOnMap = newLinkedHashMapSized(4);
        joinOnMap.put("COLLECTION_ID", "COLLECTION_ID");
        registerOuterJoin(cq, joinOnMap, "collection");
    }
    public boolean hasConditionQueryCollection() {
        return _conditionQueryCollection != null;
    }

    /**
     * Get the condition-query for relation table. <br />
     * COLLECTION_STATUS_LOOKUP by my COLLECTION_STATUS_CODE, named 'collectionStatusLookup'.
     * @return The instance of condition-query. (NotNull)
     */
    public LdCollectionStatusLookupCQ queryCollectionStatusLookup() {
        return getConditionQueryCollectionStatusLookup();
    }
    protected LdCollectionStatusLookupCQ _conditionQueryCollectionStatusLookup;
    public LdCollectionStatusLookupCQ getConditionQueryCollectionStatusLookup() {
        if (_conditionQueryCollectionStatusLookup == null) {
            _conditionQueryCollectionStatusLookup = xcreateQueryCollectionStatusLookup();
            xsetupOuterJoinCollectionStatusLookup();
        }
        return _conditionQueryCollectionStatusLookup;
    }
    protected LdCollectionStatusLookupCQ xcreateQueryCollectionStatusLookup() {
        String nrp = resolveNextRelationPath("COLLECTION_STATUS", "collectionStatusLookup");
        String jan = resolveJoinAliasName(nrp, xgetNextNestLevel());
        LdCollectionStatusLookupCQ cq = new LdCollectionStatusLookupCQ(this, xgetSqlClause(), jan, xgetNextNestLevel());
        cq.xsetBaseCB(_baseCB);
        cq.xsetForeignPropertyName("collectionStatusLookup");
        cq.xsetRelationPath(nrp); return cq;
    }
    protected void xsetupOuterJoinCollectionStatusLookup() {
        LdCollectionStatusLookupCQ cq = getConditionQueryCollectionStatusLookup();
        Map<String, String> joinOnMap = newLinkedHashMapSized(4);
        joinOnMap.put("COLLECTION_STATUS_CODE", "COLLECTION_STATUS_CODE");
        registerOuterJoin(cq, joinOnMap, "collectionStatusLookup");
    }
    public boolean hasConditionQueryCollectionStatusLookup() {
        return _conditionQueryCollectionStatusLookup != null;
    }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    protected Map<String, LdCollectionStatusCQ> _scalarConditionMap;
    public Map<String, LdCollectionStatusCQ> getScalarCondition() { return _scalarConditionMap; }
    public String keepScalarCondition(LdCollectionStatusCQ sq) {
        if (_scalarConditionMap == null) { _scalarConditionMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_scalarConditionMap.size() + 1);
        _scalarConditionMap.put(ky, sq); return "scalarCondition." + ky;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    protected Map<String, LdCollectionStatusCQ> _specifyMyselfDerivedMap;
    public Map<String, LdCollectionStatusCQ> getSpecifyMyselfDerived() { return _specifyMyselfDerivedMap; }
    public String keepSpecifyMyselfDerived(LdCollectionStatusCQ sq) {
        if (_specifyMyselfDerivedMap == null) { _specifyMyselfDerivedMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_specifyMyselfDerivedMap.size() + 1);
        _specifyMyselfDerivedMap.put(ky, sq); return "specifyMyselfDerived." + ky;
    }

    protected Map<String, LdCollectionStatusCQ> _queryMyselfDerivedMap;
    public Map<String, LdCollectionStatusCQ> getQueryMyselfDerived() { return _queryMyselfDerivedMap; }
    public String keepQueryMyselfDerived(LdCollectionStatusCQ sq) {
        if (_queryMyselfDerivedMap == null) { _queryMyselfDerivedMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_queryMyselfDerivedMap.size() + 1);
        _queryMyselfDerivedMap.put(ky, sq); return "queryMyselfDerived." + ky;
    }
    protected Map<String, Object> _qyeryMyselfDerivedParameterMap;
    public Map<String, Object> getQueryMyselfDerivedParameter() { return _qyeryMyselfDerivedParameterMap; }
    public String keepQueryMyselfDerivedParameter(Object vl) {
        if (_qyeryMyselfDerivedParameterMap == null) { _qyeryMyselfDerivedParameterMap = newLinkedHashMapSized(4); }
        String ky = "subQueryParameterKey" + (_qyeryMyselfDerivedParameterMap.size() + 1);
        _qyeryMyselfDerivedParameterMap.put(ky, vl); return "queryMyselfDerivedParameter." + ky;
    }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, LdCollectionStatusCQ> _myselfExistsMap;
    public Map<String, LdCollectionStatusCQ> getMyselfExists() { return _myselfExistsMap; }
    public String keepMyselfExists(LdCollectionStatusCQ sq) {
        if (_myselfExistsMap == null) { _myselfExistsMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_myselfExistsMap.size() + 1);
        _myselfExistsMap.put(ky, sq); return "myselfExists." + ky;
    }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    protected Map<String, LdCollectionStatusCQ> _myselfInScopeMap;
    public Map<String, LdCollectionStatusCQ> getMyselfInScope() { return _myselfInScopeMap; }
    public String keepMyselfInScope(LdCollectionStatusCQ sq) {
        if (_myselfInScopeMap == null) { _myselfInScopeMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_myselfInScopeMap.size() + 1);
        _myselfInScopeMap.put(ky, sq); return "myselfInScope." + ky;
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return LdCollectionStatusCB.class.getName(); }
    protected String xCQ() { return LdCollectionStatusCQ.class.getName(); }
    protected String xCHp() { return HpCalculator.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
