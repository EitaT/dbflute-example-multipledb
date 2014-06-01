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
 * The base condition-query of BLACK_LIST.
 * @author DBFlute(AutoGenerator)
 */
public class LdBsBlackListCQ extends LdAbstractBsBlackListCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected LdBlackListCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public LdBsBlackListCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from BLACK_LIST) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public LdBlackListCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected LdBlackListCIQ xcreateCIQ() {
        LdBlackListCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected LdBlackListCIQ xnewCIQ() {
        return new LdBlackListCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join BLACK_LIST on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public LdBlackListCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        LdBlackListCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _blackListId;
    public ConditionValue getBlackListId() {
        if (_blackListId == null) { _blackListId = nCV(); }
        return _blackListId;
    }
    protected ConditionValue getCValueBlackListId() { return getBlackListId(); }

    protected Map<String, LdBlackActionCQ> _blackListId_ExistsReferrer_BlackActionListMap;
    public Map<String, LdBlackActionCQ> getBlackListId_ExistsReferrer_BlackActionList() { return _blackListId_ExistsReferrer_BlackActionListMap; }
    public String keepBlackListId_ExistsReferrer_BlackActionList(LdBlackActionCQ sq) {
        if (_blackListId_ExistsReferrer_BlackActionListMap == null) { _blackListId_ExistsReferrer_BlackActionListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_blackListId_ExistsReferrer_BlackActionListMap.size() + 1);
        _blackListId_ExistsReferrer_BlackActionListMap.put(ky, sq); return "blackListId_ExistsReferrer_BlackActionList." + ky;
    }

    protected Map<String, LdBlackActionCQ> _blackListId_NotExistsReferrer_BlackActionListMap;
    public Map<String, LdBlackActionCQ> getBlackListId_NotExistsReferrer_BlackActionList() { return _blackListId_NotExistsReferrer_BlackActionListMap; }
    public String keepBlackListId_NotExistsReferrer_BlackActionList(LdBlackActionCQ sq) {
        if (_blackListId_NotExistsReferrer_BlackActionListMap == null) { _blackListId_NotExistsReferrer_BlackActionListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_blackListId_NotExistsReferrer_BlackActionListMap.size() + 1);
        _blackListId_NotExistsReferrer_BlackActionListMap.put(ky, sq); return "blackListId_NotExistsReferrer_BlackActionList." + ky;
    }

    protected Map<String, LdBlackActionCQ> _blackListId_SpecifyDerivedReferrer_BlackActionListMap;
    public Map<String, LdBlackActionCQ> getBlackListId_SpecifyDerivedReferrer_BlackActionList() { return _blackListId_SpecifyDerivedReferrer_BlackActionListMap; }
    public String keepBlackListId_SpecifyDerivedReferrer_BlackActionList(LdBlackActionCQ sq) {
        if (_blackListId_SpecifyDerivedReferrer_BlackActionListMap == null) { _blackListId_SpecifyDerivedReferrer_BlackActionListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_blackListId_SpecifyDerivedReferrer_BlackActionListMap.size() + 1);
        _blackListId_SpecifyDerivedReferrer_BlackActionListMap.put(ky, sq); return "blackListId_SpecifyDerivedReferrer_BlackActionList." + ky;
    }

    protected Map<String, LdBlackActionCQ> _blackListId_InScopeRelation_BlackActionListMap;
    public Map<String, LdBlackActionCQ> getBlackListId_InScopeRelation_BlackActionList() { return _blackListId_InScopeRelation_BlackActionListMap; }
    public String keepBlackListId_InScopeRelation_BlackActionList(LdBlackActionCQ sq) {
        if (_blackListId_InScopeRelation_BlackActionListMap == null) { _blackListId_InScopeRelation_BlackActionListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_blackListId_InScopeRelation_BlackActionListMap.size() + 1);
        _blackListId_InScopeRelation_BlackActionListMap.put(ky, sq); return "blackListId_InScopeRelation_BlackActionList." + ky;
    }

    protected Map<String, LdBlackActionCQ> _blackListId_NotInScopeRelation_BlackActionListMap;
    public Map<String, LdBlackActionCQ> getBlackListId_NotInScopeRelation_BlackActionList() { return _blackListId_NotInScopeRelation_BlackActionListMap; }
    public String keepBlackListId_NotInScopeRelation_BlackActionList(LdBlackActionCQ sq) {
        if (_blackListId_NotInScopeRelation_BlackActionListMap == null) { _blackListId_NotInScopeRelation_BlackActionListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_blackListId_NotInScopeRelation_BlackActionListMap.size() + 1);
        _blackListId_NotInScopeRelation_BlackActionListMap.put(ky, sq); return "blackListId_NotInScopeRelation_BlackActionList." + ky;
    }

    protected Map<String, LdBlackActionCQ> _blackListId_QueryDerivedReferrer_BlackActionListMap;
    public Map<String, LdBlackActionCQ> getBlackListId_QueryDerivedReferrer_BlackActionList() { return _blackListId_QueryDerivedReferrer_BlackActionListMap; }
    public String keepBlackListId_QueryDerivedReferrer_BlackActionList(LdBlackActionCQ sq) {
        if (_blackListId_QueryDerivedReferrer_BlackActionListMap == null) { _blackListId_QueryDerivedReferrer_BlackActionListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_blackListId_QueryDerivedReferrer_BlackActionListMap.size() + 1);
        _blackListId_QueryDerivedReferrer_BlackActionListMap.put(ky, sq); return "blackListId_QueryDerivedReferrer_BlackActionList." + ky;
    }
    protected Map<String, Object> _blackListId_QueryDerivedReferrer_BlackActionListParameterMap;
    public Map<String, Object> getBlackListId_QueryDerivedReferrer_BlackActionListParameter() { return _blackListId_QueryDerivedReferrer_BlackActionListParameterMap; }
    public String keepBlackListId_QueryDerivedReferrer_BlackActionListParameter(Object vl) {
        if (_blackListId_QueryDerivedReferrer_BlackActionListParameterMap == null) { _blackListId_QueryDerivedReferrer_BlackActionListParameterMap = newLinkedHashMapSized(4); }
        String ky = "subQueryParameterKey" + (_blackListId_QueryDerivedReferrer_BlackActionListParameterMap.size() + 1);
        _blackListId_QueryDerivedReferrer_BlackActionListParameterMap.put(ky, vl); return "blackListId_QueryDerivedReferrer_BlackActionListParameter." + ky;
    }

    /** 
     * Add order-by as ascend. <br />
     * BLACK_LIST_ID: {PK, ID, NotNull, INTEGER(10)}
     * @return this. (NotNull)
     */
    public LdBsBlackListCQ addOrderBy_BlackListId_Asc() { regOBA("BLACK_LIST_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * BLACK_LIST_ID: {PK, ID, NotNull, INTEGER(10)}
     * @return this. (NotNull)
     */
    public LdBsBlackListCQ addOrderBy_BlackListId_Desc() { regOBD("BLACK_LIST_ID"); return this; }

    protected ConditionValue _lbUserId;
    public ConditionValue getLbUserId() {
        if (_lbUserId == null) { _lbUserId = nCV(); }
        return _lbUserId;
    }
    protected ConditionValue getCValueLbUserId() { return getLbUserId(); }

    protected Map<String, LdLbUserCQ> _lbUserId_InScopeRelation_LbUserMap;
    public Map<String, LdLbUserCQ> getLbUserId_InScopeRelation_LbUser() { return _lbUserId_InScopeRelation_LbUserMap; }
    public String keepLbUserId_InScopeRelation_LbUser(LdLbUserCQ sq) {
        if (_lbUserId_InScopeRelation_LbUserMap == null) { _lbUserId_InScopeRelation_LbUserMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_lbUserId_InScopeRelation_LbUserMap.size() + 1);
        _lbUserId_InScopeRelation_LbUserMap.put(ky, sq); return "lbUserId_InScopeRelation_LbUser." + ky;
    }

    protected Map<String, LdLbUserCQ> _lbUserId_NotInScopeRelation_LbUserMap;
    public Map<String, LdLbUserCQ> getLbUserId_NotInScopeRelation_LbUser() { return _lbUserId_NotInScopeRelation_LbUserMap; }
    public String keepLbUserId_NotInScopeRelation_LbUser(LdLbUserCQ sq) {
        if (_lbUserId_NotInScopeRelation_LbUserMap == null) { _lbUserId_NotInScopeRelation_LbUserMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_lbUserId_NotInScopeRelation_LbUserMap.size() + 1);
        _lbUserId_NotInScopeRelation_LbUserMap.put(ky, sq); return "lbUserId_NotInScopeRelation_LbUser." + ky;
    }

    /** 
     * Add order-by as ascend. <br />
     * LB_USER_ID: {UQ, IX, NotNull, INTEGER(10), FK to LB_USER}
     * @return this. (NotNull)
     */
    public LdBsBlackListCQ addOrderBy_LbUserId_Asc() { regOBA("LB_USER_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * LB_USER_ID: {UQ, IX, NotNull, INTEGER(10), FK to LB_USER}
     * @return this. (NotNull)
     */
    public LdBsBlackListCQ addOrderBy_LbUserId_Desc() { regOBD("LB_USER_ID"); return this; }

    protected ConditionValue _blackRank;
    public ConditionValue getBlackRank() {
        if (_blackRank == null) { _blackRank = nCV(); }
        return _blackRank;
    }
    protected ConditionValue getCValueBlackRank() { return getBlackRank(); }

    /** 
     * Add order-by as ascend. <br />
     * BLACK_RANK: {NotNull, CHAR(3)}
     * @return this. (NotNull)
     */
    public LdBsBlackListCQ addOrderBy_BlackRank_Asc() { regOBA("BLACK_RANK"); return this; }

    /**
     * Add order-by as descend. <br />
     * BLACK_RANK: {NotNull, CHAR(3)}
     * @return this. (NotNull)
     */
    public LdBsBlackListCQ addOrderBy_BlackRank_Desc() { regOBD("BLACK_RANK"); return this; }

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
    public LdBsBlackListCQ addOrderBy_RUser_Asc() { regOBA("R_USER"); return this; }

    /**
     * Add order-by as descend. <br />
     * R_USER: {NotNull, VARCHAR(100), default=[default-user]}
     * @return this. (NotNull)
     */
    public LdBsBlackListCQ addOrderBy_RUser_Desc() { regOBD("R_USER"); return this; }

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
    public LdBsBlackListCQ addOrderBy_RModule_Asc() { regOBA("R_MODULE"); return this; }

    /**
     * Add order-by as descend. <br />
     * R_MODULE: {NotNull, VARCHAR(100), default=[default-module]}
     * @return this. (NotNull)
     */
    public LdBsBlackListCQ addOrderBy_RModule_Desc() { regOBD("R_MODULE"); return this; }

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
    public LdBsBlackListCQ addOrderBy_RTimestamp_Asc() { regOBA("R_TIMESTAMP"); return this; }

    /**
     * Add order-by as descend. <br />
     * R_TIMESTAMP: {NotNull, TIMESTAMP(26, 6), default=[CURRENT_TIMESTAMP]}
     * @return this. (NotNull)
     */
    public LdBsBlackListCQ addOrderBy_RTimestamp_Desc() { regOBD("R_TIMESTAMP"); return this; }

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
    public LdBsBlackListCQ addOrderBy_UUser_Asc() { regOBA("U_USER"); return this; }

    /**
     * Add order-by as descend. <br />
     * U_USER: {NotNull, VARCHAR(100), default=[default-user]}
     * @return this. (NotNull)
     */
    public LdBsBlackListCQ addOrderBy_UUser_Desc() { regOBD("U_USER"); return this; }

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
    public LdBsBlackListCQ addOrderBy_UModule_Asc() { regOBA("U_MODULE"); return this; }

    /**
     * Add order-by as descend. <br />
     * U_MODULE: {NotNull, VARCHAR(100), default=[default-module]}
     * @return this. (NotNull)
     */
    public LdBsBlackListCQ addOrderBy_UModule_Desc() { regOBD("U_MODULE"); return this; }

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
    public LdBsBlackListCQ addOrderBy_UTimestamp_Asc() { regOBA("U_TIMESTAMP"); return this; }

    /**
     * Add order-by as descend. <br />
     * U_TIMESTAMP: {NotNull, TIMESTAMP(26, 6), default=[CURRENT_TIMESTAMP]}
     * @return this. (NotNull)
     */
    public LdBsBlackListCQ addOrderBy_UTimestamp_Desc() { regOBD("U_TIMESTAMP"); return this; }

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
    public LdBsBlackListCQ addSpecifiedDerivedOrderBy_Asc(String aliasName)
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
    public LdBsBlackListCQ addSpecifiedDerivedOrderBy_Desc(String aliasName)
    { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        LdBlackListCQ bq = (LdBlackListCQ)bqs;
        LdBlackListCQ uq = (LdBlackListCQ)uqs;
        if (bq.hasConditionQueryLbUser()) {
            uq.queryLbUser().reflectRelationOnUnionQuery(bq.queryLbUser(), uq.queryLbUser());
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
    protected LdLbUserCQ _conditionQueryLbUser;
    public LdLbUserCQ getConditionQueryLbUser() {
        if (_conditionQueryLbUser == null) {
            _conditionQueryLbUser = xcreateQueryLbUser();
            xsetupOuterJoinLbUser();
        }
        return _conditionQueryLbUser;
    }
    protected LdLbUserCQ xcreateQueryLbUser() {
        String nrp = resolveNextRelationPath("BLACK_LIST", "lbUser");
        String jan = resolveJoinAliasName(nrp, xgetNextNestLevel());
        LdLbUserCQ cq = new LdLbUserCQ(this, xgetSqlClause(), jan, xgetNextNestLevel());
        cq.xsetBaseCB(_baseCB);
        cq.xsetForeignPropertyName("lbUser");
        cq.xsetRelationPath(nrp); return cq;
    }
    protected void xsetupOuterJoinLbUser() {
        LdLbUserCQ cq = getConditionQueryLbUser();
        Map<String, String> joinOnMap = newLinkedHashMapSized(4);
        joinOnMap.put("LB_USER_ID", "LB_USER_ID");
        registerOuterJoin(cq, joinOnMap, "lbUser");
    }
    public boolean hasConditionQueryLbUser() {
        return _conditionQueryLbUser != null;
    }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    protected Map<String, LdBlackListCQ> _scalarConditionMap;
    public Map<String, LdBlackListCQ> getScalarCondition() { return _scalarConditionMap; }
    public String keepScalarCondition(LdBlackListCQ sq) {
        if (_scalarConditionMap == null) { _scalarConditionMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_scalarConditionMap.size() + 1);
        _scalarConditionMap.put(ky, sq); return "scalarCondition." + ky;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    protected Map<String, LdBlackListCQ> _specifyMyselfDerivedMap;
    public Map<String, LdBlackListCQ> getSpecifyMyselfDerived() { return _specifyMyselfDerivedMap; }
    public String keepSpecifyMyselfDerived(LdBlackListCQ sq) {
        if (_specifyMyselfDerivedMap == null) { _specifyMyselfDerivedMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_specifyMyselfDerivedMap.size() + 1);
        _specifyMyselfDerivedMap.put(ky, sq); return "specifyMyselfDerived." + ky;
    }

    protected Map<String, LdBlackListCQ> _queryMyselfDerivedMap;
    public Map<String, LdBlackListCQ> getQueryMyselfDerived() { return _queryMyselfDerivedMap; }
    public String keepQueryMyselfDerived(LdBlackListCQ sq) {
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
    protected Map<String, LdBlackListCQ> _myselfExistsMap;
    public Map<String, LdBlackListCQ> getMyselfExists() { return _myselfExistsMap; }
    public String keepMyselfExists(LdBlackListCQ sq) {
        if (_myselfExistsMap == null) { _myselfExistsMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_myselfExistsMap.size() + 1);
        _myselfExistsMap.put(ky, sq); return "myselfExists." + ky;
    }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    protected Map<String, LdBlackListCQ> _myselfInScopeMap;
    public Map<String, LdBlackListCQ> getMyselfInScope() { return _myselfInScopeMap; }
    public String keepMyselfInScope(LdBlackListCQ sq) {
        if (_myselfInScopeMap == null) { _myselfInScopeMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_myselfInScopeMap.size() + 1);
        _myselfInScopeMap.put(ky, sq); return "myselfInScope." + ky;
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return LdBlackListCB.class.getName(); }
    protected String xCQ() { return LdBlackListCQ.class.getName(); }
    protected String xCHp() { return HpCalculator.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
