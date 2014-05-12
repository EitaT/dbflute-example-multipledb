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
 * The base condition-query of VENDOR_CONSTRAINT_NAME_AUTO_BAR.
 * @author DBFlute(AutoGenerator)
 */
public class LdBsVendorConstraintNameAutoBarCQ extends LdAbstractBsVendorConstraintNameAutoBarCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected LdVendorConstraintNameAutoBarCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public LdBsVendorConstraintNameAutoBarCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from VENDOR_CONSTRAINT_NAME_AUTO_BAR) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public LdVendorConstraintNameAutoBarCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected LdVendorConstraintNameAutoBarCIQ xcreateCIQ() {
        LdVendorConstraintNameAutoBarCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected LdVendorConstraintNameAutoBarCIQ xnewCIQ() {
        return new LdVendorConstraintNameAutoBarCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join VENDOR_CONSTRAINT_NAME_AUTO_BAR on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public LdVendorConstraintNameAutoBarCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        LdVendorConstraintNameAutoBarCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected ConditionValue _constraintNameAutoBarId;
    public ConditionValue getConstraintNameAutoBarId() {
        if (_constraintNameAutoBarId == null) { _constraintNameAutoBarId = nCV(); }
        return _constraintNameAutoBarId;
    }
    protected ConditionValue getCValueConstraintNameAutoBarId() { return getConstraintNameAutoBarId(); }

    protected Map<String, LdVendorConstraintNameAutoRefCQ> _constraintNameAutoBarId_ExistsReferrer_VendorConstraintNameAutoRefListMap;
    public Map<String, LdVendorConstraintNameAutoRefCQ> getConstraintNameAutoBarId_ExistsReferrer_VendorConstraintNameAutoRefList() { return _constraintNameAutoBarId_ExistsReferrer_VendorConstraintNameAutoRefListMap; }
    public String keepConstraintNameAutoBarId_ExistsReferrer_VendorConstraintNameAutoRefList(LdVendorConstraintNameAutoRefCQ sq) {
        if (_constraintNameAutoBarId_ExistsReferrer_VendorConstraintNameAutoRefListMap == null) { _constraintNameAutoBarId_ExistsReferrer_VendorConstraintNameAutoRefListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_constraintNameAutoBarId_ExistsReferrer_VendorConstraintNameAutoRefListMap.size() + 1);
        _constraintNameAutoBarId_ExistsReferrer_VendorConstraintNameAutoRefListMap.put(ky, sq); return "constraintNameAutoBarId_ExistsReferrer_VendorConstraintNameAutoRefList." + ky;
    }

    protected Map<String, LdVendorConstraintNameAutoRefCQ> _constraintNameAutoBarId_NotExistsReferrer_VendorConstraintNameAutoRefListMap;
    public Map<String, LdVendorConstraintNameAutoRefCQ> getConstraintNameAutoBarId_NotExistsReferrer_VendorConstraintNameAutoRefList() { return _constraintNameAutoBarId_NotExistsReferrer_VendorConstraintNameAutoRefListMap; }
    public String keepConstraintNameAutoBarId_NotExistsReferrer_VendorConstraintNameAutoRefList(LdVendorConstraintNameAutoRefCQ sq) {
        if (_constraintNameAutoBarId_NotExistsReferrer_VendorConstraintNameAutoRefListMap == null) { _constraintNameAutoBarId_NotExistsReferrer_VendorConstraintNameAutoRefListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_constraintNameAutoBarId_NotExistsReferrer_VendorConstraintNameAutoRefListMap.size() + 1);
        _constraintNameAutoBarId_NotExistsReferrer_VendorConstraintNameAutoRefListMap.put(ky, sq); return "constraintNameAutoBarId_NotExistsReferrer_VendorConstraintNameAutoRefList." + ky;
    }

    protected Map<String, LdVendorConstraintNameAutoRefCQ> _constraintNameAutoBarId_SpecifyDerivedReferrer_VendorConstraintNameAutoRefListMap;
    public Map<String, LdVendorConstraintNameAutoRefCQ> getConstraintNameAutoBarId_SpecifyDerivedReferrer_VendorConstraintNameAutoRefList() { return _constraintNameAutoBarId_SpecifyDerivedReferrer_VendorConstraintNameAutoRefListMap; }
    public String keepConstraintNameAutoBarId_SpecifyDerivedReferrer_VendorConstraintNameAutoRefList(LdVendorConstraintNameAutoRefCQ sq) {
        if (_constraintNameAutoBarId_SpecifyDerivedReferrer_VendorConstraintNameAutoRefListMap == null) { _constraintNameAutoBarId_SpecifyDerivedReferrer_VendorConstraintNameAutoRefListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_constraintNameAutoBarId_SpecifyDerivedReferrer_VendorConstraintNameAutoRefListMap.size() + 1);
        _constraintNameAutoBarId_SpecifyDerivedReferrer_VendorConstraintNameAutoRefListMap.put(ky, sq); return "constraintNameAutoBarId_SpecifyDerivedReferrer_VendorConstraintNameAutoRefList." + ky;
    }

    protected Map<String, LdVendorConstraintNameAutoRefCQ> _constraintNameAutoBarId_InScopeRelation_VendorConstraintNameAutoRefListMap;
    public Map<String, LdVendorConstraintNameAutoRefCQ> getConstraintNameAutoBarId_InScopeRelation_VendorConstraintNameAutoRefList() { return _constraintNameAutoBarId_InScopeRelation_VendorConstraintNameAutoRefListMap; }
    public String keepConstraintNameAutoBarId_InScopeRelation_VendorConstraintNameAutoRefList(LdVendorConstraintNameAutoRefCQ sq) {
        if (_constraintNameAutoBarId_InScopeRelation_VendorConstraintNameAutoRefListMap == null) { _constraintNameAutoBarId_InScopeRelation_VendorConstraintNameAutoRefListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_constraintNameAutoBarId_InScopeRelation_VendorConstraintNameAutoRefListMap.size() + 1);
        _constraintNameAutoBarId_InScopeRelation_VendorConstraintNameAutoRefListMap.put(ky, sq); return "constraintNameAutoBarId_InScopeRelation_VendorConstraintNameAutoRefList." + ky;
    }

    protected Map<String, LdVendorConstraintNameAutoRefCQ> _constraintNameAutoBarId_NotInScopeRelation_VendorConstraintNameAutoRefListMap;
    public Map<String, LdVendorConstraintNameAutoRefCQ> getConstraintNameAutoBarId_NotInScopeRelation_VendorConstraintNameAutoRefList() { return _constraintNameAutoBarId_NotInScopeRelation_VendorConstraintNameAutoRefListMap; }
    public String keepConstraintNameAutoBarId_NotInScopeRelation_VendorConstraintNameAutoRefList(LdVendorConstraintNameAutoRefCQ sq) {
        if (_constraintNameAutoBarId_NotInScopeRelation_VendorConstraintNameAutoRefListMap == null) { _constraintNameAutoBarId_NotInScopeRelation_VendorConstraintNameAutoRefListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_constraintNameAutoBarId_NotInScopeRelation_VendorConstraintNameAutoRefListMap.size() + 1);
        _constraintNameAutoBarId_NotInScopeRelation_VendorConstraintNameAutoRefListMap.put(ky, sq); return "constraintNameAutoBarId_NotInScopeRelation_VendorConstraintNameAutoRefList." + ky;
    }

    protected Map<String, LdVendorConstraintNameAutoRefCQ> _constraintNameAutoBarId_QueryDerivedReferrer_VendorConstraintNameAutoRefListMap;
    public Map<String, LdVendorConstraintNameAutoRefCQ> getConstraintNameAutoBarId_QueryDerivedReferrer_VendorConstraintNameAutoRefList() { return _constraintNameAutoBarId_QueryDerivedReferrer_VendorConstraintNameAutoRefListMap; }
    public String keepConstraintNameAutoBarId_QueryDerivedReferrer_VendorConstraintNameAutoRefList(LdVendorConstraintNameAutoRefCQ sq) {
        if (_constraintNameAutoBarId_QueryDerivedReferrer_VendorConstraintNameAutoRefListMap == null) { _constraintNameAutoBarId_QueryDerivedReferrer_VendorConstraintNameAutoRefListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_constraintNameAutoBarId_QueryDerivedReferrer_VendorConstraintNameAutoRefListMap.size() + 1);
        _constraintNameAutoBarId_QueryDerivedReferrer_VendorConstraintNameAutoRefListMap.put(ky, sq); return "constraintNameAutoBarId_QueryDerivedReferrer_VendorConstraintNameAutoRefList." + ky;
    }
    protected Map<String, Object> _constraintNameAutoBarId_QueryDerivedReferrer_VendorConstraintNameAutoRefListParameterMap;
    public Map<String, Object> getConstraintNameAutoBarId_QueryDerivedReferrer_VendorConstraintNameAutoRefListParameter() { return _constraintNameAutoBarId_QueryDerivedReferrer_VendorConstraintNameAutoRefListParameterMap; }
    public String keepConstraintNameAutoBarId_QueryDerivedReferrer_VendorConstraintNameAutoRefListParameter(Object vl) {
        if (_constraintNameAutoBarId_QueryDerivedReferrer_VendorConstraintNameAutoRefListParameterMap == null) { _constraintNameAutoBarId_QueryDerivedReferrer_VendorConstraintNameAutoRefListParameterMap = newLinkedHashMapSized(4); }
        String ky = "subQueryParameterKey" + (_constraintNameAutoBarId_QueryDerivedReferrer_VendorConstraintNameAutoRefListParameterMap.size() + 1);
        _constraintNameAutoBarId_QueryDerivedReferrer_VendorConstraintNameAutoRefListParameterMap.put(ky, vl); return "constraintNameAutoBarId_QueryDerivedReferrer_VendorConstraintNameAutoRefListParameter." + ky;
    }

    /** 
     * Add order-by as ascend. <br />
     * CONSTRAINT_NAME_AUTO_BAR_ID: {PK, NotNull, NUMERIC(16)}
     * @return this. (NotNull)
     */
    public LdBsVendorConstraintNameAutoBarCQ addOrderBy_ConstraintNameAutoBarId_Asc() { regOBA("CONSTRAINT_NAME_AUTO_BAR_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * CONSTRAINT_NAME_AUTO_BAR_ID: {PK, NotNull, NUMERIC(16)}
     * @return this. (NotNull)
     */
    public LdBsVendorConstraintNameAutoBarCQ addOrderBy_ConstraintNameAutoBarId_Desc() { regOBD("CONSTRAINT_NAME_AUTO_BAR_ID"); return this; }

    protected ConditionValue _constraintNameAutoBarName;
    public ConditionValue getConstraintNameAutoBarName() {
        if (_constraintNameAutoBarName == null) { _constraintNameAutoBarName = nCV(); }
        return _constraintNameAutoBarName;
    }
    protected ConditionValue getCValueConstraintNameAutoBarName() { return getConstraintNameAutoBarName(); }

    /** 
     * Add order-by as ascend. <br />
     * CONSTRAINT_NAME_AUTO_BAR_NAME: {UQ, NotNull, VARCHAR(50)}
     * @return this. (NotNull)
     */
    public LdBsVendorConstraintNameAutoBarCQ addOrderBy_ConstraintNameAutoBarName_Asc() { regOBA("CONSTRAINT_NAME_AUTO_BAR_NAME"); return this; }

    /**
     * Add order-by as descend. <br />
     * CONSTRAINT_NAME_AUTO_BAR_NAME: {UQ, NotNull, VARCHAR(50)}
     * @return this. (NotNull)
     */
    public LdBsVendorConstraintNameAutoBarCQ addOrderBy_ConstraintNameAutoBarName_Desc() { regOBD("CONSTRAINT_NAME_AUTO_BAR_NAME"); return this; }

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
    public LdBsVendorConstraintNameAutoBarCQ addSpecifiedDerivedOrderBy_Asc(String aliasName)
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
    public LdBsVendorConstraintNameAutoBarCQ addSpecifiedDerivedOrderBy_Desc(String aliasName)
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
    protected Map<String, LdVendorConstraintNameAutoBarCQ> _scalarConditionMap;
    public Map<String, LdVendorConstraintNameAutoBarCQ> getScalarCondition() { return _scalarConditionMap; }
    public String keepScalarCondition(LdVendorConstraintNameAutoBarCQ sq) {
        if (_scalarConditionMap == null) { _scalarConditionMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_scalarConditionMap.size() + 1);
        _scalarConditionMap.put(ky, sq); return "scalarCondition." + ky;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    protected Map<String, LdVendorConstraintNameAutoBarCQ> _specifyMyselfDerivedMap;
    public Map<String, LdVendorConstraintNameAutoBarCQ> getSpecifyMyselfDerived() { return _specifyMyselfDerivedMap; }
    public String keepSpecifyMyselfDerived(LdVendorConstraintNameAutoBarCQ sq) {
        if (_specifyMyselfDerivedMap == null) { _specifyMyselfDerivedMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_specifyMyselfDerivedMap.size() + 1);
        _specifyMyselfDerivedMap.put(ky, sq); return "specifyMyselfDerived." + ky;
    }

    protected Map<String, LdVendorConstraintNameAutoBarCQ> _queryMyselfDerivedMap;
    public Map<String, LdVendorConstraintNameAutoBarCQ> getQueryMyselfDerived() { return _queryMyselfDerivedMap; }
    public String keepQueryMyselfDerived(LdVendorConstraintNameAutoBarCQ sq) {
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
    protected Map<String, LdVendorConstraintNameAutoBarCQ> _myselfExistsMap;
    public Map<String, LdVendorConstraintNameAutoBarCQ> getMyselfExists() { return _myselfExistsMap; }
    public String keepMyselfExists(LdVendorConstraintNameAutoBarCQ sq) {
        if (_myselfExistsMap == null) { _myselfExistsMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_myselfExistsMap.size() + 1);
        _myselfExistsMap.put(ky, sq); return "myselfExists." + ky;
    }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    protected Map<String, LdVendorConstraintNameAutoBarCQ> _myselfInScopeMap;
    public Map<String, LdVendorConstraintNameAutoBarCQ> getMyselfInScope() { return _myselfInScopeMap; }
    public String keepMyselfInScope(LdVendorConstraintNameAutoBarCQ sq) {
        if (_myselfInScopeMap == null) { _myselfInScopeMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_myselfInScopeMap.size() + 1);
        _myselfInScopeMap.put(ky, sq); return "myselfInScope." + ky;
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return LdVendorConstraintNameAutoBarCB.class.getName(); }
    protected String xCQ() { return LdVendorConstraintNameAutoBarCQ.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
