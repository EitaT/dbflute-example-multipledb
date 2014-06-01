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
 * The base condition-query of MYSELF.
 * @author DBFlute(AutoGenerator)
 */
public class LdBsMyselfCQ extends LdAbstractBsMyselfCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected LdMyselfCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public LdBsMyselfCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from MYSELF) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public LdMyselfCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected LdMyselfCIQ xcreateCIQ() {
        LdMyselfCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected LdMyselfCIQ xnewCIQ() {
        return new LdMyselfCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join MYSELF on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public LdMyselfCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        LdMyselfCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _myselfId;
    public ConditionValue getMyselfId() {
        if (_myselfId == null) { _myselfId = nCV(); }
        return _myselfId;
    }
    protected ConditionValue getCValueMyselfId() { return getMyselfId(); }

    protected Map<String, LdMyselfCheckCQ> _myselfId_ExistsReferrer_MyselfCheckListMap;
    public Map<String, LdMyselfCheckCQ> getMyselfId_ExistsReferrer_MyselfCheckList() { return _myselfId_ExistsReferrer_MyselfCheckListMap; }
    public String keepMyselfId_ExistsReferrer_MyselfCheckList(LdMyselfCheckCQ sq) {
        if (_myselfId_ExistsReferrer_MyselfCheckListMap == null) { _myselfId_ExistsReferrer_MyselfCheckListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_myselfId_ExistsReferrer_MyselfCheckListMap.size() + 1);
        _myselfId_ExistsReferrer_MyselfCheckListMap.put(ky, sq); return "myselfId_ExistsReferrer_MyselfCheckList." + ky;
    }

    protected Map<String, LdMyselfCheckCQ> _myselfId_NotExistsReferrer_MyselfCheckListMap;
    public Map<String, LdMyselfCheckCQ> getMyselfId_NotExistsReferrer_MyselfCheckList() { return _myselfId_NotExistsReferrer_MyselfCheckListMap; }
    public String keepMyselfId_NotExistsReferrer_MyselfCheckList(LdMyselfCheckCQ sq) {
        if (_myselfId_NotExistsReferrer_MyselfCheckListMap == null) { _myselfId_NotExistsReferrer_MyselfCheckListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_myselfId_NotExistsReferrer_MyselfCheckListMap.size() + 1);
        _myselfId_NotExistsReferrer_MyselfCheckListMap.put(ky, sq); return "myselfId_NotExistsReferrer_MyselfCheckList." + ky;
    }

    protected Map<String, LdMyselfCheckCQ> _myselfId_SpecifyDerivedReferrer_MyselfCheckListMap;
    public Map<String, LdMyselfCheckCQ> getMyselfId_SpecifyDerivedReferrer_MyselfCheckList() { return _myselfId_SpecifyDerivedReferrer_MyselfCheckListMap; }
    public String keepMyselfId_SpecifyDerivedReferrer_MyselfCheckList(LdMyselfCheckCQ sq) {
        if (_myselfId_SpecifyDerivedReferrer_MyselfCheckListMap == null) { _myselfId_SpecifyDerivedReferrer_MyselfCheckListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_myselfId_SpecifyDerivedReferrer_MyselfCheckListMap.size() + 1);
        _myselfId_SpecifyDerivedReferrer_MyselfCheckListMap.put(ky, sq); return "myselfId_SpecifyDerivedReferrer_MyselfCheckList." + ky;
    }

    protected Map<String, LdMyselfCheckCQ> _myselfId_InScopeRelation_MyselfCheckListMap;
    public Map<String, LdMyselfCheckCQ> getMyselfId_InScopeRelation_MyselfCheckList() { return _myselfId_InScopeRelation_MyselfCheckListMap; }
    public String keepMyselfId_InScopeRelation_MyselfCheckList(LdMyselfCheckCQ sq) {
        if (_myselfId_InScopeRelation_MyselfCheckListMap == null) { _myselfId_InScopeRelation_MyselfCheckListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_myselfId_InScopeRelation_MyselfCheckListMap.size() + 1);
        _myselfId_InScopeRelation_MyselfCheckListMap.put(ky, sq); return "myselfId_InScopeRelation_MyselfCheckList." + ky;
    }

    protected Map<String, LdMyselfCheckCQ> _myselfId_NotInScopeRelation_MyselfCheckListMap;
    public Map<String, LdMyselfCheckCQ> getMyselfId_NotInScopeRelation_MyselfCheckList() { return _myselfId_NotInScopeRelation_MyselfCheckListMap; }
    public String keepMyselfId_NotInScopeRelation_MyselfCheckList(LdMyselfCheckCQ sq) {
        if (_myselfId_NotInScopeRelation_MyselfCheckListMap == null) { _myselfId_NotInScopeRelation_MyselfCheckListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_myselfId_NotInScopeRelation_MyselfCheckListMap.size() + 1);
        _myselfId_NotInScopeRelation_MyselfCheckListMap.put(ky, sq); return "myselfId_NotInScopeRelation_MyselfCheckList." + ky;
    }

    protected Map<String, LdMyselfCheckCQ> _myselfId_QueryDerivedReferrer_MyselfCheckListMap;
    public Map<String, LdMyselfCheckCQ> getMyselfId_QueryDerivedReferrer_MyselfCheckList() { return _myselfId_QueryDerivedReferrer_MyselfCheckListMap; }
    public String keepMyselfId_QueryDerivedReferrer_MyselfCheckList(LdMyselfCheckCQ sq) {
        if (_myselfId_QueryDerivedReferrer_MyselfCheckListMap == null) { _myselfId_QueryDerivedReferrer_MyselfCheckListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_myselfId_QueryDerivedReferrer_MyselfCheckListMap.size() + 1);
        _myselfId_QueryDerivedReferrer_MyselfCheckListMap.put(ky, sq); return "myselfId_QueryDerivedReferrer_MyselfCheckList." + ky;
    }
    protected Map<String, Object> _myselfId_QueryDerivedReferrer_MyselfCheckListParameterMap;
    public Map<String, Object> getMyselfId_QueryDerivedReferrer_MyselfCheckListParameter() { return _myselfId_QueryDerivedReferrer_MyselfCheckListParameterMap; }
    public String keepMyselfId_QueryDerivedReferrer_MyselfCheckListParameter(Object vl) {
        if (_myselfId_QueryDerivedReferrer_MyselfCheckListParameterMap == null) { _myselfId_QueryDerivedReferrer_MyselfCheckListParameterMap = newLinkedHashMapSized(4); }
        String ky = "subQueryParameterKey" + (_myselfId_QueryDerivedReferrer_MyselfCheckListParameterMap.size() + 1);
        _myselfId_QueryDerivedReferrer_MyselfCheckListParameterMap.put(ky, vl); return "myselfId_QueryDerivedReferrer_MyselfCheckListParameter." + ky;
    }

    /** 
     * Add order-by as ascend. <br />
     * MYSELF_ID: {PK, NotNull, INTEGER(10)}
     * @return this. (NotNull)
     */
    public LdBsMyselfCQ addOrderBy_MyselfId_Asc() { regOBA("MYSELF_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * MYSELF_ID: {PK, NotNull, INTEGER(10)}
     * @return this. (NotNull)
     */
    public LdBsMyselfCQ addOrderBy_MyselfId_Desc() { regOBD("MYSELF_ID"); return this; }

    protected ConditionValue _myselfName;
    public ConditionValue getMyselfName() {
        if (_myselfName == null) { _myselfName = nCV(); }
        return _myselfName;
    }
    protected ConditionValue getCValueMyselfName() { return getMyselfName(); }

    /** 
     * Add order-by as ascend. <br />
     * MYSELF_NAME: {NotNull, VARCHAR(80)}
     * @return this. (NotNull)
     */
    public LdBsMyselfCQ addOrderBy_MyselfName_Asc() { regOBA("MYSELF_NAME"); return this; }

    /**
     * Add order-by as descend. <br />
     * MYSELF_NAME: {NotNull, VARCHAR(80)}
     * @return this. (NotNull)
     */
    public LdBsMyselfCQ addOrderBy_MyselfName_Desc() { regOBD("MYSELF_NAME"); return this; }

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
    public LdBsMyselfCQ addSpecifiedDerivedOrderBy_Asc(String aliasName)
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
    public LdBsMyselfCQ addSpecifiedDerivedOrderBy_Desc(String aliasName)
    { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
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
    protected Map<String, LdMyselfCQ> _scalarConditionMap;
    public Map<String, LdMyselfCQ> getScalarCondition() { return _scalarConditionMap; }
    public String keepScalarCondition(LdMyselfCQ sq) {
        if (_scalarConditionMap == null) { _scalarConditionMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_scalarConditionMap.size() + 1);
        _scalarConditionMap.put(ky, sq); return "scalarCondition." + ky;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    protected Map<String, LdMyselfCQ> _specifyMyselfDerivedMap;
    public Map<String, LdMyselfCQ> getSpecifyMyselfDerived() { return _specifyMyselfDerivedMap; }
    public String keepSpecifyMyselfDerived(LdMyselfCQ sq) {
        if (_specifyMyselfDerivedMap == null) { _specifyMyselfDerivedMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_specifyMyselfDerivedMap.size() + 1);
        _specifyMyselfDerivedMap.put(ky, sq); return "specifyMyselfDerived." + ky;
    }

    protected Map<String, LdMyselfCQ> _queryMyselfDerivedMap;
    public Map<String, LdMyselfCQ> getQueryMyselfDerived() { return _queryMyselfDerivedMap; }
    public String keepQueryMyselfDerived(LdMyselfCQ sq) {
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
    protected Map<String, LdMyselfCQ> _myselfExistsMap;
    public Map<String, LdMyselfCQ> getMyselfExists() { return _myselfExistsMap; }
    public String keepMyselfExists(LdMyselfCQ sq) {
        if (_myselfExistsMap == null) { _myselfExistsMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_myselfExistsMap.size() + 1);
        _myselfExistsMap.put(ky, sq); return "myselfExists." + ky;
    }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    protected Map<String, LdMyselfCQ> _myselfInScopeMap;
    public Map<String, LdMyselfCQ> getMyselfInScope() { return _myselfInScopeMap; }
    public String keepMyselfInScope(LdMyselfCQ sq) {
        if (_myselfInScopeMap == null) { _myselfInScopeMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_myselfInScopeMap.size() + 1);
        _myselfInScopeMap.put(ky, sq); return "myselfInScope." + ky;
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return LdMyselfCB.class.getName(); }
    protected String xCQ() { return LdMyselfCQ.class.getName(); }
    protected String xCHp() { return HpCalculator.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
