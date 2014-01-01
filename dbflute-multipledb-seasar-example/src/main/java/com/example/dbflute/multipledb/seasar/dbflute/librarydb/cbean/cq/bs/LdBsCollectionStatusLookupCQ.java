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
 * The base condition-query of COLLECTION_STATUS_LOOKUP.
 * @author DBFlute(AutoGenerator)
 */
public class LdBsCollectionStatusLookupCQ extends LdAbstractBsCollectionStatusLookupCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected LdCollectionStatusLookupCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public LdBsCollectionStatusLookupCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from COLLECTION_STATUS_LOOKUP) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public LdCollectionStatusLookupCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected LdCollectionStatusLookupCIQ xcreateCIQ() {
        LdCollectionStatusLookupCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected LdCollectionStatusLookupCIQ xnewCIQ() {
        return new LdCollectionStatusLookupCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join COLLECTION_STATUS_LOOKUP on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public LdCollectionStatusLookupCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        LdCollectionStatusLookupCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected ConditionValue _collectionStatusCode;
    public ConditionValue getCollectionStatusCode() {
        if (_collectionStatusCode == null) { _collectionStatusCode = nCV(); }
        return _collectionStatusCode;
    }
    protected ConditionValue getCValueCollectionStatusCode() { return getCollectionStatusCode(); }

    protected Map<String, LdCollectionStatusCQ> _collectionStatusCode_ExistsReferrer_CollectionStatusListMap;
    public Map<String, LdCollectionStatusCQ> getCollectionStatusCode_ExistsReferrer_CollectionStatusList() { return _collectionStatusCode_ExistsReferrer_CollectionStatusListMap; }
    public String keepCollectionStatusCode_ExistsReferrer_CollectionStatusList(LdCollectionStatusCQ subQuery) {
        if (_collectionStatusCode_ExistsReferrer_CollectionStatusListMap == null) { _collectionStatusCode_ExistsReferrer_CollectionStatusListMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_collectionStatusCode_ExistsReferrer_CollectionStatusListMap.size() + 1);
        _collectionStatusCode_ExistsReferrer_CollectionStatusListMap.put(key, subQuery); return "collectionStatusCode_ExistsReferrer_CollectionStatusList." + key;
    }

    protected Map<String, LdCollectionStatusCQ> _collectionStatusCode_NotExistsReferrer_CollectionStatusListMap;
    public Map<String, LdCollectionStatusCQ> getCollectionStatusCode_NotExistsReferrer_CollectionStatusList() { return _collectionStatusCode_NotExistsReferrer_CollectionStatusListMap; }
    public String keepCollectionStatusCode_NotExistsReferrer_CollectionStatusList(LdCollectionStatusCQ subQuery) {
        if (_collectionStatusCode_NotExistsReferrer_CollectionStatusListMap == null) { _collectionStatusCode_NotExistsReferrer_CollectionStatusListMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_collectionStatusCode_NotExistsReferrer_CollectionStatusListMap.size() + 1);
        _collectionStatusCode_NotExistsReferrer_CollectionStatusListMap.put(key, subQuery); return "collectionStatusCode_NotExistsReferrer_CollectionStatusList." + key;
    }

    protected Map<String, LdCollectionStatusCQ> _collectionStatusCode_InScopeRelation_CollectionStatusListMap;
    public Map<String, LdCollectionStatusCQ> getCollectionStatusCode_InScopeRelation_CollectionStatusList() { return _collectionStatusCode_InScopeRelation_CollectionStatusListMap; }
    public String keepCollectionStatusCode_InScopeRelation_CollectionStatusList(LdCollectionStatusCQ subQuery) {
        if (_collectionStatusCode_InScopeRelation_CollectionStatusListMap == null) { _collectionStatusCode_InScopeRelation_CollectionStatusListMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_collectionStatusCode_InScopeRelation_CollectionStatusListMap.size() + 1);
        _collectionStatusCode_InScopeRelation_CollectionStatusListMap.put(key, subQuery); return "collectionStatusCode_InScopeRelation_CollectionStatusList." + key;
    }

    protected Map<String, LdCollectionStatusCQ> _collectionStatusCode_NotInScopeRelation_CollectionStatusListMap;
    public Map<String, LdCollectionStatusCQ> getCollectionStatusCode_NotInScopeRelation_CollectionStatusList() { return _collectionStatusCode_NotInScopeRelation_CollectionStatusListMap; }
    public String keepCollectionStatusCode_NotInScopeRelation_CollectionStatusList(LdCollectionStatusCQ subQuery) {
        if (_collectionStatusCode_NotInScopeRelation_CollectionStatusListMap == null) { _collectionStatusCode_NotInScopeRelation_CollectionStatusListMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_collectionStatusCode_NotInScopeRelation_CollectionStatusListMap.size() + 1);
        _collectionStatusCode_NotInScopeRelation_CollectionStatusListMap.put(key, subQuery); return "collectionStatusCode_NotInScopeRelation_CollectionStatusList." + key;
    }

    protected Map<String, LdCollectionStatusCQ> _collectionStatusCode_SpecifyDerivedReferrer_CollectionStatusListMap;
    public Map<String, LdCollectionStatusCQ> getCollectionStatusCode_SpecifyDerivedReferrer_CollectionStatusList() { return _collectionStatusCode_SpecifyDerivedReferrer_CollectionStatusListMap; }
    public String keepCollectionStatusCode_SpecifyDerivedReferrer_CollectionStatusList(LdCollectionStatusCQ subQuery) {
        if (_collectionStatusCode_SpecifyDerivedReferrer_CollectionStatusListMap == null) { _collectionStatusCode_SpecifyDerivedReferrer_CollectionStatusListMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_collectionStatusCode_SpecifyDerivedReferrer_CollectionStatusListMap.size() + 1);
        _collectionStatusCode_SpecifyDerivedReferrer_CollectionStatusListMap.put(key, subQuery); return "collectionStatusCode_SpecifyDerivedReferrer_CollectionStatusList." + key;
    }

    protected Map<String, LdCollectionStatusCQ> _collectionStatusCode_QueryDerivedReferrer_CollectionStatusListMap;
    public Map<String, LdCollectionStatusCQ> getCollectionStatusCode_QueryDerivedReferrer_CollectionStatusList() { return _collectionStatusCode_QueryDerivedReferrer_CollectionStatusListMap; }
    public String keepCollectionStatusCode_QueryDerivedReferrer_CollectionStatusList(LdCollectionStatusCQ subQuery) {
        if (_collectionStatusCode_QueryDerivedReferrer_CollectionStatusListMap == null) { _collectionStatusCode_QueryDerivedReferrer_CollectionStatusListMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_collectionStatusCode_QueryDerivedReferrer_CollectionStatusListMap.size() + 1);
        _collectionStatusCode_QueryDerivedReferrer_CollectionStatusListMap.put(key, subQuery); return "collectionStatusCode_QueryDerivedReferrer_CollectionStatusList." + key;
    }
    protected Map<String, Object> _collectionStatusCode_QueryDerivedReferrer_CollectionStatusListParameterMap;
    public Map<String, Object> getCollectionStatusCode_QueryDerivedReferrer_CollectionStatusListParameter() { return _collectionStatusCode_QueryDerivedReferrer_CollectionStatusListParameterMap; }
    public String keepCollectionStatusCode_QueryDerivedReferrer_CollectionStatusListParameter(Object parameterValue) {
        if (_collectionStatusCode_QueryDerivedReferrer_CollectionStatusListParameterMap == null) { _collectionStatusCode_QueryDerivedReferrer_CollectionStatusListParameterMap = newLinkedHashMapSized(4); }
        String key = "subQueryParameterKey" + (_collectionStatusCode_QueryDerivedReferrer_CollectionStatusListParameterMap.size() + 1);
        _collectionStatusCode_QueryDerivedReferrer_CollectionStatusListParameterMap.put(key, parameterValue); return "collectionStatusCode_QueryDerivedReferrer_CollectionStatusListParameter." + key;
    }

    /** 
     * Add order-by as ascend. <br />
     * COLLECTION_STATUS_CODE: {PK, NotNull, CHAR(3), classification=CollectionStatus}
     * @return this. (NotNull)
     */
    public LdBsCollectionStatusLookupCQ addOrderBy_CollectionStatusCode_Asc() { regOBA("COLLECTION_STATUS_CODE"); return this; }

    /**
     * Add order-by as descend. <br />
     * COLLECTION_STATUS_CODE: {PK, NotNull, CHAR(3), classification=CollectionStatus}
     * @return this. (NotNull)
     */
    public LdBsCollectionStatusLookupCQ addOrderBy_CollectionStatusCode_Desc() { regOBD("COLLECTION_STATUS_CODE"); return this; }

    protected ConditionValue _collectionStatusName;
    public ConditionValue getCollectionStatusName() {
        if (_collectionStatusName == null) { _collectionStatusName = nCV(); }
        return _collectionStatusName;
    }
    protected ConditionValue getCValueCollectionStatusName() { return getCollectionStatusName(); }

    /** 
     * Add order-by as ascend. <br />
     * COLLECTION_STATUS_NAME: {NotNull, VARCHAR(80)}
     * @return this. (NotNull)
     */
    public LdBsCollectionStatusLookupCQ addOrderBy_CollectionStatusName_Asc() { regOBA("COLLECTION_STATUS_NAME"); return this; }

    /**
     * Add order-by as descend. <br />
     * COLLECTION_STATUS_NAME: {NotNull, VARCHAR(80)}
     * @return this. (NotNull)
     */
    public LdBsCollectionStatusLookupCQ addOrderBy_CollectionStatusName_Desc() { regOBD("COLLECTION_STATUS_NAME"); return this; }

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
    public LdBsCollectionStatusLookupCQ addOrderBy_RUser_Asc() { regOBA("R_USER"); return this; }

    /**
     * Add order-by as descend. <br />
     * R_USER: {NotNull, VARCHAR(100), default=[default-user]}
     * @return this. (NotNull)
     */
    public LdBsCollectionStatusLookupCQ addOrderBy_RUser_Desc() { regOBD("R_USER"); return this; }

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
    public LdBsCollectionStatusLookupCQ addOrderBy_RModule_Asc() { regOBA("R_MODULE"); return this; }

    /**
     * Add order-by as descend. <br />
     * R_MODULE: {NotNull, VARCHAR(100), default=[default-module], classification=RegisterModuleType}
     * @return this. (NotNull)
     */
    public LdBsCollectionStatusLookupCQ addOrderBy_RModule_Desc() { regOBD("R_MODULE"); return this; }

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
    public LdBsCollectionStatusLookupCQ addOrderBy_RTimestamp_Asc() { regOBA("R_TIMESTAMP"); return this; }

    /**
     * Add order-by as descend. <br />
     * R_TIMESTAMP: {NotNull, TIMESTAMP(26, 6), default=[CURRENT_TIMESTAMP]}
     * @return this. (NotNull)
     */
    public LdBsCollectionStatusLookupCQ addOrderBy_RTimestamp_Desc() { regOBD("R_TIMESTAMP"); return this; }

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
    public LdBsCollectionStatusLookupCQ addOrderBy_UUser_Asc() { regOBA("U_USER"); return this; }

    /**
     * Add order-by as descend. <br />
     * U_USER: {NotNull, VARCHAR(100), default=[default-user]}
     * @return this. (NotNull)
     */
    public LdBsCollectionStatusLookupCQ addOrderBy_UUser_Desc() { regOBD("U_USER"); return this; }

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
    public LdBsCollectionStatusLookupCQ addOrderBy_UModule_Asc() { regOBA("U_MODULE"); return this; }

    /**
     * Add order-by as descend. <br />
     * U_MODULE: {NotNull, VARCHAR(100), default=[default-module], classification=UpdateModuleType}
     * @return this. (NotNull)
     */
    public LdBsCollectionStatusLookupCQ addOrderBy_UModule_Desc() { regOBD("U_MODULE"); return this; }

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
    public LdBsCollectionStatusLookupCQ addOrderBy_UTimestamp_Asc() { regOBA("U_TIMESTAMP"); return this; }

    /**
     * Add order-by as descend. <br />
     * U_TIMESTAMP: {NotNull, TIMESTAMP(26, 6), default=[CURRENT_TIMESTAMP]}
     * @return this. (NotNull)
     */
    public LdBsCollectionStatusLookupCQ addOrderBy_UTimestamp_Desc() { regOBD("U_TIMESTAMP"); return this; }

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
    public LdBsCollectionStatusLookupCQ addSpecifiedDerivedOrderBy_Asc(String aliasName)
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
    public LdBsCollectionStatusLookupCQ addSpecifiedDerivedOrderBy_Desc(String aliasName)
    { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    protected void reflectRelationOnUnionQuery(ConditionQuery baseQueryAsSuper, ConditionQuery unionQueryAsSuper) {
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    protected Map<String, LdCollectionStatusLookupCQ> _scalarConditionMap;
    public Map<String, LdCollectionStatusLookupCQ> getScalarCondition() { return _scalarConditionMap; }
    public String keepScalarCondition(LdCollectionStatusLookupCQ subQuery) {
        if (_scalarConditionMap == null) { _scalarConditionMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_scalarConditionMap.size() + 1);
        _scalarConditionMap.put(key, subQuery); return "scalarCondition." + key;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    protected Map<String, LdCollectionStatusLookupCQ> _specifyMyselfDerivedMap;
    public Map<String, LdCollectionStatusLookupCQ> getSpecifyMyselfDerived() { return _specifyMyselfDerivedMap; }
    public String keepSpecifyMyselfDerived(LdCollectionStatusLookupCQ subQuery) {
        if (_specifyMyselfDerivedMap == null) { _specifyMyselfDerivedMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_specifyMyselfDerivedMap.size() + 1);
        _specifyMyselfDerivedMap.put(key, subQuery); return "specifyMyselfDerived." + key;
    }

    protected Map<String, LdCollectionStatusLookupCQ> _queryMyselfDerivedMap;
    public Map<String, LdCollectionStatusLookupCQ> getQueryMyselfDerived() { return _queryMyselfDerivedMap; }
    public String keepQueryMyselfDerived(LdCollectionStatusLookupCQ subQuery) {
        if (_queryMyselfDerivedMap == null) { _queryMyselfDerivedMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_queryMyselfDerivedMap.size() + 1);
        _queryMyselfDerivedMap.put(key, subQuery); return "queryMyselfDerived." + key;
    }
    protected Map<String, Object> _qyeryMyselfDerivedParameterMap;
    public Map<String, Object> getQueryMyselfDerivedParameter() { return _qyeryMyselfDerivedParameterMap; }
    public String keepQueryMyselfDerivedParameter(Object parameterValue) {
        if (_qyeryMyselfDerivedParameterMap == null) { _qyeryMyselfDerivedParameterMap = newLinkedHashMapSized(4); }
        String key = "subQueryParameterKey" + (_qyeryMyselfDerivedParameterMap.size() + 1);
        _qyeryMyselfDerivedParameterMap.put(key, parameterValue); return "queryMyselfDerivedParameter." + key;
    }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, LdCollectionStatusLookupCQ> _myselfExistsMap;
    public Map<String, LdCollectionStatusLookupCQ> getMyselfExists() { return _myselfExistsMap; }
    public String keepMyselfExists(LdCollectionStatusLookupCQ subQuery) {
        if (_myselfExistsMap == null) { _myselfExistsMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_myselfExistsMap.size() + 1);
        _myselfExistsMap.put(key, subQuery); return "myselfExists." + key;
    }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    protected Map<String, LdCollectionStatusLookupCQ> _myselfInScopeMap;
    public Map<String, LdCollectionStatusLookupCQ> getMyselfInScope() { return _myselfInScopeMap; }
    public String keepMyselfInScope(LdCollectionStatusLookupCQ subQuery) {
        if (_myselfInScopeMap == null) { _myselfInScopeMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_myselfInScopeMap.size() + 1);
        _myselfInScopeMap.put(key, subQuery); return "myselfInScope." + key;
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return LdCollectionStatusLookupCB.class.getName(); }
    protected String xCQ() { return LdCollectionStatusLookupCQ.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
