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
 * The base condition-query of BLACK_ACTION.
 * @author DBFlute(AutoGenerator)
 */
public class LdBsBlackActionCQ extends LdAbstractBsBlackActionCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected LdBlackActionCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public LdBsBlackActionCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from BLACK_ACTION) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public LdBlackActionCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected LdBlackActionCIQ xcreateCIQ() {
        LdBlackActionCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected LdBlackActionCIQ xnewCIQ() {
        return new LdBlackActionCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join BLACK_ACTION on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public LdBlackActionCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        LdBlackActionCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected ConditionValue _blackActionId;
    public ConditionValue getBlackActionId() {
        if (_blackActionId == null) { _blackActionId = nCV(); }
        return _blackActionId;
    }
    protected ConditionValue getCValueBlackActionId() { return getBlackActionId(); }

    /** 
     * Add order-by as ascend. <br />
     * BLACK_ACTION_ID: {PK, ID, NotNull, INTEGER(10)}
     * @return this. (NotNull)
     */
    public LdBsBlackActionCQ addOrderBy_BlackActionId_Asc() { regOBA("BLACK_ACTION_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * BLACK_ACTION_ID: {PK, ID, NotNull, INTEGER(10)}
     * @return this. (NotNull)
     */
    public LdBsBlackActionCQ addOrderBy_BlackActionId_Desc() { regOBD("BLACK_ACTION_ID"); return this; }

    protected ConditionValue _blackListId;
    public ConditionValue getBlackListId() {
        if (_blackListId == null) { _blackListId = nCV(); }
        return _blackListId;
    }
    protected ConditionValue getCValueBlackListId() { return getBlackListId(); }

    protected Map<String, LdBlackListCQ> _blackListId_InScopeRelation_BlackListMap;
    public Map<String, LdBlackListCQ> getBlackListId_InScopeRelation_BlackList() { return _blackListId_InScopeRelation_BlackListMap; }
    public String keepBlackListId_InScopeRelation_BlackList(LdBlackListCQ subQuery) {
        if (_blackListId_InScopeRelation_BlackListMap == null) { _blackListId_InScopeRelation_BlackListMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_blackListId_InScopeRelation_BlackListMap.size() + 1);
        _blackListId_InScopeRelation_BlackListMap.put(key, subQuery); return "blackListId_InScopeRelation_BlackList." + key;
    }

    protected Map<String, LdBlackListCQ> _blackListId_NotInScopeRelation_BlackListMap;
    public Map<String, LdBlackListCQ> getBlackListId_NotInScopeRelation_BlackList() { return _blackListId_NotInScopeRelation_BlackListMap; }
    public String keepBlackListId_NotInScopeRelation_BlackList(LdBlackListCQ subQuery) {
        if (_blackListId_NotInScopeRelation_BlackListMap == null) { _blackListId_NotInScopeRelation_BlackListMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_blackListId_NotInScopeRelation_BlackListMap.size() + 1);
        _blackListId_NotInScopeRelation_BlackListMap.put(key, subQuery); return "blackListId_NotInScopeRelation_BlackList." + key;
    }

    /** 
     * Add order-by as ascend. <br />
     * BLACK_LIST_ID: {IX, NotNull, INTEGER(10), FK to BLACK_LIST}
     * @return this. (NotNull)
     */
    public LdBsBlackActionCQ addOrderBy_BlackListId_Asc() { regOBA("BLACK_LIST_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * BLACK_LIST_ID: {IX, NotNull, INTEGER(10), FK to BLACK_LIST}
     * @return this. (NotNull)
     */
    public LdBsBlackActionCQ addOrderBy_BlackListId_Desc() { regOBD("BLACK_LIST_ID"); return this; }

    protected ConditionValue _blackActionCode;
    public ConditionValue getBlackActionCode() {
        if (_blackActionCode == null) { _blackActionCode = nCV(); }
        return _blackActionCode;
    }
    protected ConditionValue getCValueBlackActionCode() { return getBlackActionCode(); }

    protected Map<String, LdBlackActionLookupCQ> _blackActionCode_InScopeRelation_BlackActionLookupMap;
    public Map<String, LdBlackActionLookupCQ> getBlackActionCode_InScopeRelation_BlackActionLookup() { return _blackActionCode_InScopeRelation_BlackActionLookupMap; }
    public String keepBlackActionCode_InScopeRelation_BlackActionLookup(LdBlackActionLookupCQ subQuery) {
        if (_blackActionCode_InScopeRelation_BlackActionLookupMap == null) { _blackActionCode_InScopeRelation_BlackActionLookupMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_blackActionCode_InScopeRelation_BlackActionLookupMap.size() + 1);
        _blackActionCode_InScopeRelation_BlackActionLookupMap.put(key, subQuery); return "blackActionCode_InScopeRelation_BlackActionLookup." + key;
    }

    protected Map<String, LdBlackActionLookupCQ> _blackActionCode_NotInScopeRelation_BlackActionLookupMap;
    public Map<String, LdBlackActionLookupCQ> getBlackActionCode_NotInScopeRelation_BlackActionLookup() { return _blackActionCode_NotInScopeRelation_BlackActionLookupMap; }
    public String keepBlackActionCode_NotInScopeRelation_BlackActionLookup(LdBlackActionLookupCQ subQuery) {
        if (_blackActionCode_NotInScopeRelation_BlackActionLookupMap == null) { _blackActionCode_NotInScopeRelation_BlackActionLookupMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_blackActionCode_NotInScopeRelation_BlackActionLookupMap.size() + 1);
        _blackActionCode_NotInScopeRelation_BlackActionLookupMap.put(key, subQuery); return "blackActionCode_NotInScopeRelation_BlackActionLookup." + key;
    }

    /** 
     * Add order-by as ascend. <br />
     * BLACK_ACTION_CODE: {IX, NotNull, CHAR(3), FK to BLACK_ACTION_LOOKUP}
     * @return this. (NotNull)
     */
    public LdBsBlackActionCQ addOrderBy_BlackActionCode_Asc() { regOBA("BLACK_ACTION_CODE"); return this; }

    /**
     * Add order-by as descend. <br />
     * BLACK_ACTION_CODE: {IX, NotNull, CHAR(3), FK to BLACK_ACTION_LOOKUP}
     * @return this. (NotNull)
     */
    public LdBsBlackActionCQ addOrderBy_BlackActionCode_Desc() { regOBD("BLACK_ACTION_CODE"); return this; }

    protected ConditionValue _blackLevel;
    public ConditionValue getBlackLevel() {
        if (_blackLevel == null) { _blackLevel = nCV(); }
        return _blackLevel;
    }
    protected ConditionValue getCValueBlackLevel() { return getBlackLevel(); }

    /** 
     * Add order-by as ascend. <br />
     * BLACK_LEVEL: {NotNull, SMALLINT(5)}
     * @return this. (NotNull)
     */
    public LdBsBlackActionCQ addOrderBy_BlackLevel_Asc() { regOBA("BLACK_LEVEL"); return this; }

    /**
     * Add order-by as descend. <br />
     * BLACK_LEVEL: {NotNull, SMALLINT(5)}
     * @return this. (NotNull)
     */
    public LdBsBlackActionCQ addOrderBy_BlackLevel_Desc() { regOBD("BLACK_LEVEL"); return this; }

    protected ConditionValue _actionDate;
    public ConditionValue getActionDate() {
        if (_actionDate == null) { _actionDate = nCV(); }
        return _actionDate;
    }
    protected ConditionValue getCValueActionDate() { return getActionDate(); }

    /** 
     * Add order-by as ascend. <br />
     * ACTION_DATE: {TIMESTAMP(26, 6)}
     * @return this. (NotNull)
     */
    public LdBsBlackActionCQ addOrderBy_ActionDate_Asc() { regOBA("ACTION_DATE"); return this; }

    /**
     * Add order-by as descend. <br />
     * ACTION_DATE: {TIMESTAMP(26, 6)}
     * @return this. (NotNull)
     */
    public LdBsBlackActionCQ addOrderBy_ActionDate_Desc() { regOBD("ACTION_DATE"); return this; }

    protected ConditionValue _evidencePhotograph;
    public ConditionValue getEvidencePhotograph() {
        if (_evidencePhotograph == null) { _evidencePhotograph = nCV(); }
        return _evidencePhotograph;
    }
    protected ConditionValue getCValueEvidencePhotograph() { return getEvidencePhotograph(); }

    /** 
     * Add order-by as ascend. <br />
     * EVIDENCE_PHOTOGRAPH: {BLOB(2147483647)}
     * @return this. (NotNull)
     */
    public LdBsBlackActionCQ addOrderBy_EvidencePhotograph_Asc() { regOBA("EVIDENCE_PHOTOGRAPH"); return this; }

    /**
     * Add order-by as descend. <br />
     * EVIDENCE_PHOTOGRAPH: {BLOB(2147483647)}
     * @return this. (NotNull)
     */
    public LdBsBlackActionCQ addOrderBy_EvidencePhotograph_Desc() { regOBD("EVIDENCE_PHOTOGRAPH"); return this; }

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
    public LdBsBlackActionCQ addOrderBy_RUser_Asc() { regOBA("R_USER"); return this; }

    /**
     * Add order-by as descend. <br />
     * R_USER: {NotNull, VARCHAR(100), default=[default-user]}
     * @return this. (NotNull)
     */
    public LdBsBlackActionCQ addOrderBy_RUser_Desc() { regOBD("R_USER"); return this; }

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
    public LdBsBlackActionCQ addOrderBy_RModule_Asc() { regOBA("R_MODULE"); return this; }

    /**
     * Add order-by as descend. <br />
     * R_MODULE: {NotNull, VARCHAR(100), default=[default-module]}
     * @return this. (NotNull)
     */
    public LdBsBlackActionCQ addOrderBy_RModule_Desc() { regOBD("R_MODULE"); return this; }

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
    public LdBsBlackActionCQ addOrderBy_RTimestamp_Asc() { regOBA("R_TIMESTAMP"); return this; }

    /**
     * Add order-by as descend. <br />
     * R_TIMESTAMP: {NotNull, TIMESTAMP(26, 6), default=[CURRENT_TIMESTAMP]}
     * @return this. (NotNull)
     */
    public LdBsBlackActionCQ addOrderBy_RTimestamp_Desc() { regOBD("R_TIMESTAMP"); return this; }

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
    public LdBsBlackActionCQ addOrderBy_UUser_Asc() { regOBA("U_USER"); return this; }

    /**
     * Add order-by as descend. <br />
     * U_USER: {NotNull, VARCHAR(100), default=[default-user]}
     * @return this. (NotNull)
     */
    public LdBsBlackActionCQ addOrderBy_UUser_Desc() { regOBD("U_USER"); return this; }

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
    public LdBsBlackActionCQ addOrderBy_UModule_Asc() { regOBA("U_MODULE"); return this; }

    /**
     * Add order-by as descend. <br />
     * U_MODULE: {NotNull, VARCHAR(100), default=[default-module]}
     * @return this. (NotNull)
     */
    public LdBsBlackActionCQ addOrderBy_UModule_Desc() { regOBD("U_MODULE"); return this; }

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
    public LdBsBlackActionCQ addOrderBy_UTimestamp_Asc() { regOBA("U_TIMESTAMP"); return this; }

    /**
     * Add order-by as descend. <br />
     * U_TIMESTAMP: {NotNull, TIMESTAMP(26, 6), default=[CURRENT_TIMESTAMP]}
     * @return this. (NotNull)
     */
    public LdBsBlackActionCQ addOrderBy_UTimestamp_Desc() { regOBD("U_TIMESTAMP"); return this; }

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
    public LdBsBlackActionCQ addSpecifiedDerivedOrderBy_Asc(String aliasName)
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
    public LdBsBlackActionCQ addSpecifiedDerivedOrderBy_Desc(String aliasName)
    { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    protected void reflectRelationOnUnionQuery(ConditionQuery baseQueryAsSuper, ConditionQuery unionQueryAsSuper) {
        LdBlackActionCQ baseQuery = (LdBlackActionCQ)baseQueryAsSuper;
        LdBlackActionCQ unionQuery = (LdBlackActionCQ)unionQueryAsSuper;
        if (baseQuery.hasConditionQueryBlackList()) {
            unionQuery.queryBlackList().reflectRelationOnUnionQuery(baseQuery.queryBlackList(), unionQuery.queryBlackList());
        }
        if (baseQuery.hasConditionQueryBlackActionLookup()) {
            unionQuery.queryBlackActionLookup().reflectRelationOnUnionQuery(baseQuery.queryBlackActionLookup(), unionQuery.queryBlackActionLookup());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br />
     * BLACK_LIST by my BLACK_LIST_ID, named 'blackList'.
     * @return The instance of condition-query. (NotNull)
     */
    public LdBlackListCQ queryBlackList() {
        return getConditionQueryBlackList();
    }
    protected LdBlackListCQ _conditionQueryBlackList;
    public LdBlackListCQ getConditionQueryBlackList() {
        if (_conditionQueryBlackList == null) {
            _conditionQueryBlackList = xcreateQueryBlackList();
            xsetupOuterJoinBlackList();
        }
        return _conditionQueryBlackList;
    }
    protected LdBlackListCQ xcreateQueryBlackList() {
        String nrp = resolveNextRelationPath("BLACK_ACTION", "blackList");
        String jan = resolveJoinAliasName(nrp, xgetNextNestLevel());
        LdBlackListCQ cq = new LdBlackListCQ(this, xgetSqlClause(), jan, xgetNextNestLevel());
        cq.xsetBaseCB(_baseCB);
        cq.xsetForeignPropertyName("blackList");
        cq.xsetRelationPath(nrp); return cq;
    }
    protected void xsetupOuterJoinBlackList() {
        LdBlackListCQ cq = getConditionQueryBlackList();
        Map<String, String> joinOnMap = newLinkedHashMapSized(4);
        joinOnMap.put("BLACK_LIST_ID", "BLACK_LIST_ID");
        registerOuterJoin(cq, joinOnMap, "blackList");
    }
    public boolean hasConditionQueryBlackList() {
        return _conditionQueryBlackList != null;
    }

    /**
     * Get the condition-query for relation table. <br />
     * BLACK_ACTION_LOOKUP by my BLACK_ACTION_CODE, named 'blackActionLookup'.
     * @return The instance of condition-query. (NotNull)
     */
    public LdBlackActionLookupCQ queryBlackActionLookup() {
        return getConditionQueryBlackActionLookup();
    }
    protected LdBlackActionLookupCQ _conditionQueryBlackActionLookup;
    public LdBlackActionLookupCQ getConditionQueryBlackActionLookup() {
        if (_conditionQueryBlackActionLookup == null) {
            _conditionQueryBlackActionLookup = xcreateQueryBlackActionLookup();
            xsetupOuterJoinBlackActionLookup();
        }
        return _conditionQueryBlackActionLookup;
    }
    protected LdBlackActionLookupCQ xcreateQueryBlackActionLookup() {
        String nrp = resolveNextRelationPath("BLACK_ACTION", "blackActionLookup");
        String jan = resolveJoinAliasName(nrp, xgetNextNestLevel());
        LdBlackActionLookupCQ cq = new LdBlackActionLookupCQ(this, xgetSqlClause(), jan, xgetNextNestLevel());
        cq.xsetBaseCB(_baseCB);
        cq.xsetForeignPropertyName("blackActionLookup");
        cq.xsetRelationPath(nrp); return cq;
    }
    protected void xsetupOuterJoinBlackActionLookup() {
        LdBlackActionLookupCQ cq = getConditionQueryBlackActionLookup();
        Map<String, String> joinOnMap = newLinkedHashMapSized(4);
        joinOnMap.put("BLACK_ACTION_CODE", "BLACK_ACTION_CODE");
        registerOuterJoin(cq, joinOnMap, "blackActionLookup");
    }
    public boolean hasConditionQueryBlackActionLookup() {
        return _conditionQueryBlackActionLookup != null;
    }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    protected Map<String, LdBlackActionCQ> _scalarConditionMap;
    public Map<String, LdBlackActionCQ> getScalarCondition() { return _scalarConditionMap; }
    public String keepScalarCondition(LdBlackActionCQ subQuery) {
        if (_scalarConditionMap == null) { _scalarConditionMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_scalarConditionMap.size() + 1);
        _scalarConditionMap.put(key, subQuery); return "scalarCondition." + key;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    protected Map<String, LdBlackActionCQ> _specifyMyselfDerivedMap;
    public Map<String, LdBlackActionCQ> getSpecifyMyselfDerived() { return _specifyMyselfDerivedMap; }
    public String keepSpecifyMyselfDerived(LdBlackActionCQ subQuery) {
        if (_specifyMyselfDerivedMap == null) { _specifyMyselfDerivedMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_specifyMyselfDerivedMap.size() + 1);
        _specifyMyselfDerivedMap.put(key, subQuery); return "specifyMyselfDerived." + key;
    }

    protected Map<String, LdBlackActionCQ> _queryMyselfDerivedMap;
    public Map<String, LdBlackActionCQ> getQueryMyselfDerived() { return _queryMyselfDerivedMap; }
    public String keepQueryMyselfDerived(LdBlackActionCQ subQuery) {
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
    protected Map<String, LdBlackActionCQ> _myselfExistsMap;
    public Map<String, LdBlackActionCQ> getMyselfExists() { return _myselfExistsMap; }
    public String keepMyselfExists(LdBlackActionCQ subQuery) {
        if (_myselfExistsMap == null) { _myselfExistsMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_myselfExistsMap.size() + 1);
        _myselfExistsMap.put(key, subQuery); return "myselfExists." + key;
    }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    protected Map<String, LdBlackActionCQ> _myselfInScopeMap;
    public Map<String, LdBlackActionCQ> getMyselfInScope() { return _myselfInScopeMap; }
    public String keepMyselfInScope(LdBlackActionCQ subQuery) {
        if (_myselfInScopeMap == null) { _myselfInScopeMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_myselfInScopeMap.size() + 1);
        _myselfInScopeMap.put(key, subQuery); return "myselfInScope." + key;
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return LdBlackActionCB.class.getName(); }
    protected String xCQ() { return LdBlackActionCQ.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
