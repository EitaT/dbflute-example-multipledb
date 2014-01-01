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
 * The base condition-query of LIBRARY_TYPE_LOOKUP.
 * @author DBFlute(AutoGenerator)
 */
public class LdBsLibraryTypeLookupCQ extends LdAbstractBsLibraryTypeLookupCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected LdLibraryTypeLookupCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public LdBsLibraryTypeLookupCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from LIBRARY_TYPE_LOOKUP) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public LdLibraryTypeLookupCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected LdLibraryTypeLookupCIQ xcreateCIQ() {
        LdLibraryTypeLookupCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected LdLibraryTypeLookupCIQ xnewCIQ() {
        return new LdLibraryTypeLookupCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join LIBRARY_TYPE_LOOKUP on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public LdLibraryTypeLookupCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        LdLibraryTypeLookupCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected ConditionValue _libraryTypeCode;
    public ConditionValue getLibraryTypeCode() {
        if (_libraryTypeCode == null) { _libraryTypeCode = nCV(); }
        return _libraryTypeCode;
    }
    protected ConditionValue getCValueLibraryTypeCode() { return getLibraryTypeCode(); }

    protected Map<String, LdLibraryCQ> _libraryTypeCode_ExistsReferrer_LibraryListMap;
    public Map<String, LdLibraryCQ> getLibraryTypeCode_ExistsReferrer_LibraryList() { return _libraryTypeCode_ExistsReferrer_LibraryListMap; }
    public String keepLibraryTypeCode_ExistsReferrer_LibraryList(LdLibraryCQ subQuery) {
        if (_libraryTypeCode_ExistsReferrer_LibraryListMap == null) { _libraryTypeCode_ExistsReferrer_LibraryListMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_libraryTypeCode_ExistsReferrer_LibraryListMap.size() + 1);
        _libraryTypeCode_ExistsReferrer_LibraryListMap.put(key, subQuery); return "libraryTypeCode_ExistsReferrer_LibraryList." + key;
    }

    protected Map<String, LdLibraryCQ> _libraryTypeCode_NotExistsReferrer_LibraryListMap;
    public Map<String, LdLibraryCQ> getLibraryTypeCode_NotExistsReferrer_LibraryList() { return _libraryTypeCode_NotExistsReferrer_LibraryListMap; }
    public String keepLibraryTypeCode_NotExistsReferrer_LibraryList(LdLibraryCQ subQuery) {
        if (_libraryTypeCode_NotExistsReferrer_LibraryListMap == null) { _libraryTypeCode_NotExistsReferrer_LibraryListMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_libraryTypeCode_NotExistsReferrer_LibraryListMap.size() + 1);
        _libraryTypeCode_NotExistsReferrer_LibraryListMap.put(key, subQuery); return "libraryTypeCode_NotExistsReferrer_LibraryList." + key;
    }

    protected Map<String, LdLibraryCQ> _libraryTypeCode_InScopeRelation_LibraryListMap;
    public Map<String, LdLibraryCQ> getLibraryTypeCode_InScopeRelation_LibraryList() { return _libraryTypeCode_InScopeRelation_LibraryListMap; }
    public String keepLibraryTypeCode_InScopeRelation_LibraryList(LdLibraryCQ subQuery) {
        if (_libraryTypeCode_InScopeRelation_LibraryListMap == null) { _libraryTypeCode_InScopeRelation_LibraryListMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_libraryTypeCode_InScopeRelation_LibraryListMap.size() + 1);
        _libraryTypeCode_InScopeRelation_LibraryListMap.put(key, subQuery); return "libraryTypeCode_InScopeRelation_LibraryList." + key;
    }

    protected Map<String, LdLibraryCQ> _libraryTypeCode_NotInScopeRelation_LibraryListMap;
    public Map<String, LdLibraryCQ> getLibraryTypeCode_NotInScopeRelation_LibraryList() { return _libraryTypeCode_NotInScopeRelation_LibraryListMap; }
    public String keepLibraryTypeCode_NotInScopeRelation_LibraryList(LdLibraryCQ subQuery) {
        if (_libraryTypeCode_NotInScopeRelation_LibraryListMap == null) { _libraryTypeCode_NotInScopeRelation_LibraryListMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_libraryTypeCode_NotInScopeRelation_LibraryListMap.size() + 1);
        _libraryTypeCode_NotInScopeRelation_LibraryListMap.put(key, subQuery); return "libraryTypeCode_NotInScopeRelation_LibraryList." + key;
    }

    protected Map<String, LdLibraryCQ> _libraryTypeCode_SpecifyDerivedReferrer_LibraryListMap;
    public Map<String, LdLibraryCQ> getLibraryTypeCode_SpecifyDerivedReferrer_LibraryList() { return _libraryTypeCode_SpecifyDerivedReferrer_LibraryListMap; }
    public String keepLibraryTypeCode_SpecifyDerivedReferrer_LibraryList(LdLibraryCQ subQuery) {
        if (_libraryTypeCode_SpecifyDerivedReferrer_LibraryListMap == null) { _libraryTypeCode_SpecifyDerivedReferrer_LibraryListMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_libraryTypeCode_SpecifyDerivedReferrer_LibraryListMap.size() + 1);
        _libraryTypeCode_SpecifyDerivedReferrer_LibraryListMap.put(key, subQuery); return "libraryTypeCode_SpecifyDerivedReferrer_LibraryList." + key;
    }

    protected Map<String, LdLibraryCQ> _libraryTypeCode_QueryDerivedReferrer_LibraryListMap;
    public Map<String, LdLibraryCQ> getLibraryTypeCode_QueryDerivedReferrer_LibraryList() { return _libraryTypeCode_QueryDerivedReferrer_LibraryListMap; }
    public String keepLibraryTypeCode_QueryDerivedReferrer_LibraryList(LdLibraryCQ subQuery) {
        if (_libraryTypeCode_QueryDerivedReferrer_LibraryListMap == null) { _libraryTypeCode_QueryDerivedReferrer_LibraryListMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_libraryTypeCode_QueryDerivedReferrer_LibraryListMap.size() + 1);
        _libraryTypeCode_QueryDerivedReferrer_LibraryListMap.put(key, subQuery); return "libraryTypeCode_QueryDerivedReferrer_LibraryList." + key;
    }
    protected Map<String, Object> _libraryTypeCode_QueryDerivedReferrer_LibraryListParameterMap;
    public Map<String, Object> getLibraryTypeCode_QueryDerivedReferrer_LibraryListParameter() { return _libraryTypeCode_QueryDerivedReferrer_LibraryListParameterMap; }
    public String keepLibraryTypeCode_QueryDerivedReferrer_LibraryListParameter(Object parameterValue) {
        if (_libraryTypeCode_QueryDerivedReferrer_LibraryListParameterMap == null) { _libraryTypeCode_QueryDerivedReferrer_LibraryListParameterMap = newLinkedHashMapSized(4); }
        String key = "subQueryParameterKey" + (_libraryTypeCode_QueryDerivedReferrer_LibraryListParameterMap.size() + 1);
        _libraryTypeCode_QueryDerivedReferrer_LibraryListParameterMap.put(key, parameterValue); return "libraryTypeCode_QueryDerivedReferrer_LibraryListParameter." + key;
    }

    /** 
     * Add order-by as ascend. <br />
     * LIBRARY_TYPE_CODE: {PK, NotNull, CHAR(3)}
     * @return this. (NotNull)
     */
    public LdBsLibraryTypeLookupCQ addOrderBy_LibraryTypeCode_Asc() { regOBA("LIBRARY_TYPE_CODE"); return this; }

    /**
     * Add order-by as descend. <br />
     * LIBRARY_TYPE_CODE: {PK, NotNull, CHAR(3)}
     * @return this. (NotNull)
     */
    public LdBsLibraryTypeLookupCQ addOrderBy_LibraryTypeCode_Desc() { regOBD("LIBRARY_TYPE_CODE"); return this; }

    protected ConditionValue _libraryTypeName;
    public ConditionValue getLibraryTypeName() {
        if (_libraryTypeName == null) { _libraryTypeName = nCV(); }
        return _libraryTypeName;
    }
    protected ConditionValue getCValueLibraryTypeName() { return getLibraryTypeName(); }

    /** 
     * Add order-by as ascend. <br />
     * LIBRARY_TYPE_NAME: {NotNull, VARCHAR(80)}
     * @return this. (NotNull)
     */
    public LdBsLibraryTypeLookupCQ addOrderBy_LibraryTypeName_Asc() { regOBA("LIBRARY_TYPE_NAME"); return this; }

    /**
     * Add order-by as descend. <br />
     * LIBRARY_TYPE_NAME: {NotNull, VARCHAR(80)}
     * @return this. (NotNull)
     */
    public LdBsLibraryTypeLookupCQ addOrderBy_LibraryTypeName_Desc() { regOBD("LIBRARY_TYPE_NAME"); return this; }

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
    public LdBsLibraryTypeLookupCQ addOrderBy_RUser_Asc() { regOBA("R_USER"); return this; }

    /**
     * Add order-by as descend. <br />
     * R_USER: {NotNull, VARCHAR(100), default=[default-user]}
     * @return this. (NotNull)
     */
    public LdBsLibraryTypeLookupCQ addOrderBy_RUser_Desc() { regOBD("R_USER"); return this; }

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
    public LdBsLibraryTypeLookupCQ addOrderBy_RModule_Asc() { regOBA("R_MODULE"); return this; }

    /**
     * Add order-by as descend. <br />
     * R_MODULE: {NotNull, VARCHAR(100), default=[default-module], classification=RegisterModuleType}
     * @return this. (NotNull)
     */
    public LdBsLibraryTypeLookupCQ addOrderBy_RModule_Desc() { regOBD("R_MODULE"); return this; }

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
    public LdBsLibraryTypeLookupCQ addOrderBy_RTimestamp_Asc() { regOBA("R_TIMESTAMP"); return this; }

    /**
     * Add order-by as descend. <br />
     * R_TIMESTAMP: {NotNull, TIMESTAMP(26, 6), default=[CURRENT_TIMESTAMP]}
     * @return this. (NotNull)
     */
    public LdBsLibraryTypeLookupCQ addOrderBy_RTimestamp_Desc() { regOBD("R_TIMESTAMP"); return this; }

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
    public LdBsLibraryTypeLookupCQ addOrderBy_UUser_Asc() { regOBA("U_USER"); return this; }

    /**
     * Add order-by as descend. <br />
     * U_USER: {NotNull, VARCHAR(100), default=[default-user]}
     * @return this. (NotNull)
     */
    public LdBsLibraryTypeLookupCQ addOrderBy_UUser_Desc() { regOBD("U_USER"); return this; }

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
    public LdBsLibraryTypeLookupCQ addOrderBy_UModule_Asc() { regOBA("U_MODULE"); return this; }

    /**
     * Add order-by as descend. <br />
     * U_MODULE: {NotNull, VARCHAR(100), default=[default-module], classification=UpdateModuleType}
     * @return this. (NotNull)
     */
    public LdBsLibraryTypeLookupCQ addOrderBy_UModule_Desc() { regOBD("U_MODULE"); return this; }

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
    public LdBsLibraryTypeLookupCQ addOrderBy_UTimestamp_Asc() { regOBA("U_TIMESTAMP"); return this; }

    /**
     * Add order-by as descend. <br />
     * U_TIMESTAMP: {NotNull, TIMESTAMP(26, 6), default=[CURRENT_TIMESTAMP]}
     * @return this. (NotNull)
     */
    public LdBsLibraryTypeLookupCQ addOrderBy_UTimestamp_Desc() { regOBD("U_TIMESTAMP"); return this; }

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
    public LdBsLibraryTypeLookupCQ addSpecifiedDerivedOrderBy_Asc(String aliasName)
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
    public LdBsLibraryTypeLookupCQ addSpecifiedDerivedOrderBy_Desc(String aliasName)
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
    protected Map<String, LdLibraryTypeLookupCQ> _scalarConditionMap;
    public Map<String, LdLibraryTypeLookupCQ> getScalarCondition() { return _scalarConditionMap; }
    public String keepScalarCondition(LdLibraryTypeLookupCQ subQuery) {
        if (_scalarConditionMap == null) { _scalarConditionMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_scalarConditionMap.size() + 1);
        _scalarConditionMap.put(key, subQuery); return "scalarCondition." + key;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    protected Map<String, LdLibraryTypeLookupCQ> _specifyMyselfDerivedMap;
    public Map<String, LdLibraryTypeLookupCQ> getSpecifyMyselfDerived() { return _specifyMyselfDerivedMap; }
    public String keepSpecifyMyselfDerived(LdLibraryTypeLookupCQ subQuery) {
        if (_specifyMyselfDerivedMap == null) { _specifyMyselfDerivedMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_specifyMyselfDerivedMap.size() + 1);
        _specifyMyselfDerivedMap.put(key, subQuery); return "specifyMyselfDerived." + key;
    }

    protected Map<String, LdLibraryTypeLookupCQ> _queryMyselfDerivedMap;
    public Map<String, LdLibraryTypeLookupCQ> getQueryMyselfDerived() { return _queryMyselfDerivedMap; }
    public String keepQueryMyselfDerived(LdLibraryTypeLookupCQ subQuery) {
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
    protected Map<String, LdLibraryTypeLookupCQ> _myselfExistsMap;
    public Map<String, LdLibraryTypeLookupCQ> getMyselfExists() { return _myselfExistsMap; }
    public String keepMyselfExists(LdLibraryTypeLookupCQ subQuery) {
        if (_myselfExistsMap == null) { _myselfExistsMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_myselfExistsMap.size() + 1);
        _myselfExistsMap.put(key, subQuery); return "myselfExists." + key;
    }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    protected Map<String, LdLibraryTypeLookupCQ> _myselfInScopeMap;
    public Map<String, LdLibraryTypeLookupCQ> getMyselfInScope() { return _myselfInScopeMap; }
    public String keepMyselfInScope(LdLibraryTypeLookupCQ subQuery) {
        if (_myselfInScopeMap == null) { _myselfInScopeMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_myselfInScopeMap.size() + 1);
        _myselfInScopeMap.put(key, subQuery); return "myselfInScope." + key;
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return LdLibraryTypeLookupCB.class.getName(); }
    protected String xCQ() { return LdLibraryTypeLookupCQ.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
