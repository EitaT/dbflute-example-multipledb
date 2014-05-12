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
 * The base condition-query of BLACK_ACTION_LOOKUP.
 * @author DBFlute(AutoGenerator)
 */
public class LdBsBlackActionLookupCQ extends LdAbstractBsBlackActionLookupCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected LdBlackActionLookupCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public LdBsBlackActionLookupCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from BLACK_ACTION_LOOKUP) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public LdBlackActionLookupCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected LdBlackActionLookupCIQ xcreateCIQ() {
        LdBlackActionLookupCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected LdBlackActionLookupCIQ xnewCIQ() {
        return new LdBlackActionLookupCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join BLACK_ACTION_LOOKUP on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public LdBlackActionLookupCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        LdBlackActionLookupCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected ConditionValue _blackActionCode;
    public ConditionValue getBlackActionCode() {
        if (_blackActionCode == null) { _blackActionCode = nCV(); }
        return _blackActionCode;
    }
    protected ConditionValue getCValueBlackActionCode() { return getBlackActionCode(); }

    protected Map<String, LdBlackActionCQ> _blackActionCode_ExistsReferrer_BlackActionListMap;
    public Map<String, LdBlackActionCQ> getBlackActionCode_ExistsReferrer_BlackActionList() { return _blackActionCode_ExistsReferrer_BlackActionListMap; }
    public String keepBlackActionCode_ExistsReferrer_BlackActionList(LdBlackActionCQ sq) {
        if (_blackActionCode_ExistsReferrer_BlackActionListMap == null) { _blackActionCode_ExistsReferrer_BlackActionListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_blackActionCode_ExistsReferrer_BlackActionListMap.size() + 1);
        _blackActionCode_ExistsReferrer_BlackActionListMap.put(ky, sq); return "blackActionCode_ExistsReferrer_BlackActionList." + ky;
    }

    protected Map<String, LdBlackActionCQ> _blackActionCode_NotExistsReferrer_BlackActionListMap;
    public Map<String, LdBlackActionCQ> getBlackActionCode_NotExistsReferrer_BlackActionList() { return _blackActionCode_NotExistsReferrer_BlackActionListMap; }
    public String keepBlackActionCode_NotExistsReferrer_BlackActionList(LdBlackActionCQ sq) {
        if (_blackActionCode_NotExistsReferrer_BlackActionListMap == null) { _blackActionCode_NotExistsReferrer_BlackActionListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_blackActionCode_NotExistsReferrer_BlackActionListMap.size() + 1);
        _blackActionCode_NotExistsReferrer_BlackActionListMap.put(ky, sq); return "blackActionCode_NotExistsReferrer_BlackActionList." + ky;
    }

    protected Map<String, LdBlackActionCQ> _blackActionCode_InScopeRelation_BlackActionListMap;
    public Map<String, LdBlackActionCQ> getBlackActionCode_InScopeRelation_BlackActionList() { return _blackActionCode_InScopeRelation_BlackActionListMap; }
    public String keepBlackActionCode_InScopeRelation_BlackActionList(LdBlackActionCQ sq) {
        if (_blackActionCode_InScopeRelation_BlackActionListMap == null) { _blackActionCode_InScopeRelation_BlackActionListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_blackActionCode_InScopeRelation_BlackActionListMap.size() + 1);
        _blackActionCode_InScopeRelation_BlackActionListMap.put(ky, sq); return "blackActionCode_InScopeRelation_BlackActionList." + ky;
    }

    protected Map<String, LdBlackActionCQ> _blackActionCode_NotInScopeRelation_BlackActionListMap;
    public Map<String, LdBlackActionCQ> getBlackActionCode_NotInScopeRelation_BlackActionList() { return _blackActionCode_NotInScopeRelation_BlackActionListMap; }
    public String keepBlackActionCode_NotInScopeRelation_BlackActionList(LdBlackActionCQ sq) {
        if (_blackActionCode_NotInScopeRelation_BlackActionListMap == null) { _blackActionCode_NotInScopeRelation_BlackActionListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_blackActionCode_NotInScopeRelation_BlackActionListMap.size() + 1);
        _blackActionCode_NotInScopeRelation_BlackActionListMap.put(ky, sq); return "blackActionCode_NotInScopeRelation_BlackActionList." + ky;
    }

    protected Map<String, LdBlackActionCQ> _blackActionCode_SpecifyDerivedReferrer_BlackActionListMap;
    public Map<String, LdBlackActionCQ> getBlackActionCode_SpecifyDerivedReferrer_BlackActionList() { return _blackActionCode_SpecifyDerivedReferrer_BlackActionListMap; }
    public String keepBlackActionCode_SpecifyDerivedReferrer_BlackActionList(LdBlackActionCQ sq) {
        if (_blackActionCode_SpecifyDerivedReferrer_BlackActionListMap == null) { _blackActionCode_SpecifyDerivedReferrer_BlackActionListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_blackActionCode_SpecifyDerivedReferrer_BlackActionListMap.size() + 1);
        _blackActionCode_SpecifyDerivedReferrer_BlackActionListMap.put(ky, sq); return "blackActionCode_SpecifyDerivedReferrer_BlackActionList." + ky;
    }

    protected Map<String, LdBlackActionCQ> _blackActionCode_QueryDerivedReferrer_BlackActionListMap;
    public Map<String, LdBlackActionCQ> getBlackActionCode_QueryDerivedReferrer_BlackActionList() { return _blackActionCode_QueryDerivedReferrer_BlackActionListMap; }
    public String keepBlackActionCode_QueryDerivedReferrer_BlackActionList(LdBlackActionCQ sq) {
        if (_blackActionCode_QueryDerivedReferrer_BlackActionListMap == null) { _blackActionCode_QueryDerivedReferrer_BlackActionListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_blackActionCode_QueryDerivedReferrer_BlackActionListMap.size() + 1);
        _blackActionCode_QueryDerivedReferrer_BlackActionListMap.put(ky, sq); return "blackActionCode_QueryDerivedReferrer_BlackActionList." + ky;
    }
    protected Map<String, Object> _blackActionCode_QueryDerivedReferrer_BlackActionListParameterMap;
    public Map<String, Object> getBlackActionCode_QueryDerivedReferrer_BlackActionListParameter() { return _blackActionCode_QueryDerivedReferrer_BlackActionListParameterMap; }
    public String keepBlackActionCode_QueryDerivedReferrer_BlackActionListParameter(Object vl) {
        if (_blackActionCode_QueryDerivedReferrer_BlackActionListParameterMap == null) { _blackActionCode_QueryDerivedReferrer_BlackActionListParameterMap = newLinkedHashMapSized(4); }
        String ky = "subQueryParameterKey" + (_blackActionCode_QueryDerivedReferrer_BlackActionListParameterMap.size() + 1);
        _blackActionCode_QueryDerivedReferrer_BlackActionListParameterMap.put(ky, vl); return "blackActionCode_QueryDerivedReferrer_BlackActionListParameter." + ky;
    }

    /** 
     * Add order-by as ascend. <br />
     * BLACK_ACTION_CODE: {PK, NotNull, CHAR(3)}
     * @return this. (NotNull)
     */
    public LdBsBlackActionLookupCQ addOrderBy_BlackActionCode_Asc() { regOBA("BLACK_ACTION_CODE"); return this; }

    /**
     * Add order-by as descend. <br />
     * BLACK_ACTION_CODE: {PK, NotNull, CHAR(3)}
     * @return this. (NotNull)
     */
    public LdBsBlackActionLookupCQ addOrderBy_BlackActionCode_Desc() { regOBD("BLACK_ACTION_CODE"); return this; }

    protected ConditionValue _blackActionName;
    public ConditionValue getBlackActionName() {
        if (_blackActionName == null) { _blackActionName = nCV(); }
        return _blackActionName;
    }
    protected ConditionValue getCValueBlackActionName() { return getBlackActionName(); }

    /** 
     * Add order-by as ascend. <br />
     * BLACK_ACTION_NAME: {NotNull, VARCHAR(80)}
     * @return this. (NotNull)
     */
    public LdBsBlackActionLookupCQ addOrderBy_BlackActionName_Asc() { regOBA("BLACK_ACTION_NAME"); return this; }

    /**
     * Add order-by as descend. <br />
     * BLACK_ACTION_NAME: {NotNull, VARCHAR(80)}
     * @return this. (NotNull)
     */
    public LdBsBlackActionLookupCQ addOrderBy_BlackActionName_Desc() { regOBD("BLACK_ACTION_NAME"); return this; }

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
    public LdBsBlackActionLookupCQ addOrderBy_RUser_Asc() { regOBA("R_USER"); return this; }

    /**
     * Add order-by as descend. <br />
     * R_USER: {NotNull, VARCHAR(100), default=[default-user]}
     * @return this. (NotNull)
     */
    public LdBsBlackActionLookupCQ addOrderBy_RUser_Desc() { regOBD("R_USER"); return this; }

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
    public LdBsBlackActionLookupCQ addOrderBy_RModule_Asc() { regOBA("R_MODULE"); return this; }

    /**
     * Add order-by as descend. <br />
     * R_MODULE: {NotNull, VARCHAR(100), default=[default-module], classification=RegisterModuleType}
     * @return this. (NotNull)
     */
    public LdBsBlackActionLookupCQ addOrderBy_RModule_Desc() { regOBD("R_MODULE"); return this; }

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
    public LdBsBlackActionLookupCQ addOrderBy_RTimestamp_Asc() { regOBA("R_TIMESTAMP"); return this; }

    /**
     * Add order-by as descend. <br />
     * R_TIMESTAMP: {NotNull, TIMESTAMP(26, 6), default=[CURRENT_TIMESTAMP]}
     * @return this. (NotNull)
     */
    public LdBsBlackActionLookupCQ addOrderBy_RTimestamp_Desc() { regOBD("R_TIMESTAMP"); return this; }

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
    public LdBsBlackActionLookupCQ addOrderBy_UUser_Asc() { regOBA("U_USER"); return this; }

    /**
     * Add order-by as descend. <br />
     * U_USER: {NotNull, VARCHAR(100), default=[default-user]}
     * @return this. (NotNull)
     */
    public LdBsBlackActionLookupCQ addOrderBy_UUser_Desc() { regOBD("U_USER"); return this; }

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
    public LdBsBlackActionLookupCQ addOrderBy_UModule_Asc() { regOBA("U_MODULE"); return this; }

    /**
     * Add order-by as descend. <br />
     * U_MODULE: {NotNull, VARCHAR(100), default=[default-module], classification=UpdateModuleType}
     * @return this. (NotNull)
     */
    public LdBsBlackActionLookupCQ addOrderBy_UModule_Desc() { regOBD("U_MODULE"); return this; }

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
    public LdBsBlackActionLookupCQ addOrderBy_UTimestamp_Asc() { regOBA("U_TIMESTAMP"); return this; }

    /**
     * Add order-by as descend. <br />
     * U_TIMESTAMP: {NotNull, TIMESTAMP(26, 6), default=[CURRENT_TIMESTAMP]}
     * @return this. (NotNull)
     */
    public LdBsBlackActionLookupCQ addOrderBy_UTimestamp_Desc() { regOBD("U_TIMESTAMP"); return this; }

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
    public LdBsBlackActionLookupCQ addSpecifiedDerivedOrderBy_Asc(String aliasName)
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
    public LdBsBlackActionLookupCQ addSpecifiedDerivedOrderBy_Desc(String aliasName)
    { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    protected void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
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
    protected Map<String, LdBlackActionLookupCQ> _scalarConditionMap;
    public Map<String, LdBlackActionLookupCQ> getScalarCondition() { return _scalarConditionMap; }
    public String keepScalarCondition(LdBlackActionLookupCQ sq) {
        if (_scalarConditionMap == null) { _scalarConditionMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_scalarConditionMap.size() + 1);
        _scalarConditionMap.put(ky, sq); return "scalarCondition." + ky;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    protected Map<String, LdBlackActionLookupCQ> _specifyMyselfDerivedMap;
    public Map<String, LdBlackActionLookupCQ> getSpecifyMyselfDerived() { return _specifyMyselfDerivedMap; }
    public String keepSpecifyMyselfDerived(LdBlackActionLookupCQ sq) {
        if (_specifyMyselfDerivedMap == null) { _specifyMyselfDerivedMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_specifyMyselfDerivedMap.size() + 1);
        _specifyMyselfDerivedMap.put(ky, sq); return "specifyMyselfDerived." + ky;
    }

    protected Map<String, LdBlackActionLookupCQ> _queryMyselfDerivedMap;
    public Map<String, LdBlackActionLookupCQ> getQueryMyselfDerived() { return _queryMyselfDerivedMap; }
    public String keepQueryMyselfDerived(LdBlackActionLookupCQ sq) {
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
    protected Map<String, LdBlackActionLookupCQ> _myselfExistsMap;
    public Map<String, LdBlackActionLookupCQ> getMyselfExists() { return _myselfExistsMap; }
    public String keepMyselfExists(LdBlackActionLookupCQ sq) {
        if (_myselfExistsMap == null) { _myselfExistsMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_myselfExistsMap.size() + 1);
        _myselfExistsMap.put(ky, sq); return "myselfExists." + ky;
    }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    protected Map<String, LdBlackActionLookupCQ> _myselfInScopeMap;
    public Map<String, LdBlackActionLookupCQ> getMyselfInScope() { return _myselfInScopeMap; }
    public String keepMyselfInScope(LdBlackActionLookupCQ sq) {
        if (_myselfInScopeMap == null) { _myselfInScopeMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_myselfInScopeMap.size() + 1);
        _myselfInScopeMap.put(ky, sq); return "myselfInScope." + ky;
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return LdBlackActionLookupCB.class.getName(); }
    protected String xCQ() { return LdBlackActionLookupCQ.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
