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
 * The base condition-query of VENDOR_CONSTRAINT_NAME_AUTO_QUX.
 * @author DBFlute(AutoGenerator)
 */
public class LdBsVendorConstraintNameAutoQuxCQ extends LdAbstractBsVendorConstraintNameAutoQuxCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected LdVendorConstraintNameAutoQuxCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public LdBsVendorConstraintNameAutoQuxCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from VENDOR_CONSTRAINT_NAME_AUTO_QUX) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public LdVendorConstraintNameAutoQuxCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected LdVendorConstraintNameAutoQuxCIQ xcreateCIQ() {
        LdVendorConstraintNameAutoQuxCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected LdVendorConstraintNameAutoQuxCIQ xnewCIQ() {
        return new LdVendorConstraintNameAutoQuxCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join VENDOR_CONSTRAINT_NAME_AUTO_QUX on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public LdVendorConstraintNameAutoQuxCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        LdVendorConstraintNameAutoQuxCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected ConditionValue _constraintNameAutoQuxId;
    public ConditionValue getConstraintNameAutoQuxId() {
        if (_constraintNameAutoQuxId == null) { _constraintNameAutoQuxId = nCV(); }
        return _constraintNameAutoQuxId;
    }
    protected ConditionValue getCValueConstraintNameAutoQuxId() { return getConstraintNameAutoQuxId(); }

    protected Map<String, LdVendorConstraintNameAutoRefCQ> _constraintNameAutoQuxId_ExistsReferrer_VendorConstraintNameAutoRefListMap;
    public Map<String, LdVendorConstraintNameAutoRefCQ> getConstraintNameAutoQuxId_ExistsReferrer_VendorConstraintNameAutoRefList() { return _constraintNameAutoQuxId_ExistsReferrer_VendorConstraintNameAutoRefListMap; }
    public String keepConstraintNameAutoQuxId_ExistsReferrer_VendorConstraintNameAutoRefList(LdVendorConstraintNameAutoRefCQ sq) {
        if (_constraintNameAutoQuxId_ExistsReferrer_VendorConstraintNameAutoRefListMap == null) { _constraintNameAutoQuxId_ExistsReferrer_VendorConstraintNameAutoRefListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_constraintNameAutoQuxId_ExistsReferrer_VendorConstraintNameAutoRefListMap.size() + 1);
        _constraintNameAutoQuxId_ExistsReferrer_VendorConstraintNameAutoRefListMap.put(ky, sq); return "constraintNameAutoQuxId_ExistsReferrer_VendorConstraintNameAutoRefList." + ky;
    }

    protected Map<String, LdVendorConstraintNameAutoRefCQ> _constraintNameAutoQuxId_NotExistsReferrer_VendorConstraintNameAutoRefListMap;
    public Map<String, LdVendorConstraintNameAutoRefCQ> getConstraintNameAutoQuxId_NotExistsReferrer_VendorConstraintNameAutoRefList() { return _constraintNameAutoQuxId_NotExistsReferrer_VendorConstraintNameAutoRefListMap; }
    public String keepConstraintNameAutoQuxId_NotExistsReferrer_VendorConstraintNameAutoRefList(LdVendorConstraintNameAutoRefCQ sq) {
        if (_constraintNameAutoQuxId_NotExistsReferrer_VendorConstraintNameAutoRefListMap == null) { _constraintNameAutoQuxId_NotExistsReferrer_VendorConstraintNameAutoRefListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_constraintNameAutoQuxId_NotExistsReferrer_VendorConstraintNameAutoRefListMap.size() + 1);
        _constraintNameAutoQuxId_NotExistsReferrer_VendorConstraintNameAutoRefListMap.put(ky, sq); return "constraintNameAutoQuxId_NotExistsReferrer_VendorConstraintNameAutoRefList." + ky;
    }

    protected Map<String, LdVendorConstraintNameAutoRefCQ> _constraintNameAutoQuxId_SpecifyDerivedReferrer_VendorConstraintNameAutoRefListMap;
    public Map<String, LdVendorConstraintNameAutoRefCQ> getConstraintNameAutoQuxId_SpecifyDerivedReferrer_VendorConstraintNameAutoRefList() { return _constraintNameAutoQuxId_SpecifyDerivedReferrer_VendorConstraintNameAutoRefListMap; }
    public String keepConstraintNameAutoQuxId_SpecifyDerivedReferrer_VendorConstraintNameAutoRefList(LdVendorConstraintNameAutoRefCQ sq) {
        if (_constraintNameAutoQuxId_SpecifyDerivedReferrer_VendorConstraintNameAutoRefListMap == null) { _constraintNameAutoQuxId_SpecifyDerivedReferrer_VendorConstraintNameAutoRefListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_constraintNameAutoQuxId_SpecifyDerivedReferrer_VendorConstraintNameAutoRefListMap.size() + 1);
        _constraintNameAutoQuxId_SpecifyDerivedReferrer_VendorConstraintNameAutoRefListMap.put(ky, sq); return "constraintNameAutoQuxId_SpecifyDerivedReferrer_VendorConstraintNameAutoRefList." + ky;
    }

    protected Map<String, LdVendorConstraintNameAutoRefCQ> _constraintNameAutoQuxId_InScopeRelation_VendorConstraintNameAutoRefListMap;
    public Map<String, LdVendorConstraintNameAutoRefCQ> getConstraintNameAutoQuxId_InScopeRelation_VendorConstraintNameAutoRefList() { return _constraintNameAutoQuxId_InScopeRelation_VendorConstraintNameAutoRefListMap; }
    public String keepConstraintNameAutoQuxId_InScopeRelation_VendorConstraintNameAutoRefList(LdVendorConstraintNameAutoRefCQ sq) {
        if (_constraintNameAutoQuxId_InScopeRelation_VendorConstraintNameAutoRefListMap == null) { _constraintNameAutoQuxId_InScopeRelation_VendorConstraintNameAutoRefListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_constraintNameAutoQuxId_InScopeRelation_VendorConstraintNameAutoRefListMap.size() + 1);
        _constraintNameAutoQuxId_InScopeRelation_VendorConstraintNameAutoRefListMap.put(ky, sq); return "constraintNameAutoQuxId_InScopeRelation_VendorConstraintNameAutoRefList." + ky;
    }

    protected Map<String, LdVendorConstraintNameAutoRefCQ> _constraintNameAutoQuxId_NotInScopeRelation_VendorConstraintNameAutoRefListMap;
    public Map<String, LdVendorConstraintNameAutoRefCQ> getConstraintNameAutoQuxId_NotInScopeRelation_VendorConstraintNameAutoRefList() { return _constraintNameAutoQuxId_NotInScopeRelation_VendorConstraintNameAutoRefListMap; }
    public String keepConstraintNameAutoQuxId_NotInScopeRelation_VendorConstraintNameAutoRefList(LdVendorConstraintNameAutoRefCQ sq) {
        if (_constraintNameAutoQuxId_NotInScopeRelation_VendorConstraintNameAutoRefListMap == null) { _constraintNameAutoQuxId_NotInScopeRelation_VendorConstraintNameAutoRefListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_constraintNameAutoQuxId_NotInScopeRelation_VendorConstraintNameAutoRefListMap.size() + 1);
        _constraintNameAutoQuxId_NotInScopeRelation_VendorConstraintNameAutoRefListMap.put(ky, sq); return "constraintNameAutoQuxId_NotInScopeRelation_VendorConstraintNameAutoRefList." + ky;
    }

    protected Map<String, LdVendorConstraintNameAutoRefCQ> _constraintNameAutoQuxId_QueryDerivedReferrer_VendorConstraintNameAutoRefListMap;
    public Map<String, LdVendorConstraintNameAutoRefCQ> getConstraintNameAutoQuxId_QueryDerivedReferrer_VendorConstraintNameAutoRefList() { return _constraintNameAutoQuxId_QueryDerivedReferrer_VendorConstraintNameAutoRefListMap; }
    public String keepConstraintNameAutoQuxId_QueryDerivedReferrer_VendorConstraintNameAutoRefList(LdVendorConstraintNameAutoRefCQ sq) {
        if (_constraintNameAutoQuxId_QueryDerivedReferrer_VendorConstraintNameAutoRefListMap == null) { _constraintNameAutoQuxId_QueryDerivedReferrer_VendorConstraintNameAutoRefListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_constraintNameAutoQuxId_QueryDerivedReferrer_VendorConstraintNameAutoRefListMap.size() + 1);
        _constraintNameAutoQuxId_QueryDerivedReferrer_VendorConstraintNameAutoRefListMap.put(ky, sq); return "constraintNameAutoQuxId_QueryDerivedReferrer_VendorConstraintNameAutoRefList." + ky;
    }
    protected Map<String, Object> _constraintNameAutoQuxId_QueryDerivedReferrer_VendorConstraintNameAutoRefListParameterMap;
    public Map<String, Object> getConstraintNameAutoQuxId_QueryDerivedReferrer_VendorConstraintNameAutoRefListParameter() { return _constraintNameAutoQuxId_QueryDerivedReferrer_VendorConstraintNameAutoRefListParameterMap; }
    public String keepConstraintNameAutoQuxId_QueryDerivedReferrer_VendorConstraintNameAutoRefListParameter(Object vl) {
        if (_constraintNameAutoQuxId_QueryDerivedReferrer_VendorConstraintNameAutoRefListParameterMap == null) { _constraintNameAutoQuxId_QueryDerivedReferrer_VendorConstraintNameAutoRefListParameterMap = newLinkedHashMapSized(4); }
        String ky = "subQueryParameterKey" + (_constraintNameAutoQuxId_QueryDerivedReferrer_VendorConstraintNameAutoRefListParameterMap.size() + 1);
        _constraintNameAutoQuxId_QueryDerivedReferrer_VendorConstraintNameAutoRefListParameterMap.put(ky, vl); return "constraintNameAutoQuxId_QueryDerivedReferrer_VendorConstraintNameAutoRefListParameter." + ky;
    }

    /** 
     * Add order-by as ascend. <br />
     * CONSTRAINT_NAME_AUTO_QUX_ID: {PK, NotNull, NUMERIC(16)}
     * @return this. (NotNull)
     */
    public LdBsVendorConstraintNameAutoQuxCQ addOrderBy_ConstraintNameAutoQuxId_Asc() { regOBA("CONSTRAINT_NAME_AUTO_QUX_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * CONSTRAINT_NAME_AUTO_QUX_ID: {PK, NotNull, NUMERIC(16)}
     * @return this. (NotNull)
     */
    public LdBsVendorConstraintNameAutoQuxCQ addOrderBy_ConstraintNameAutoQuxId_Desc() { regOBD("CONSTRAINT_NAME_AUTO_QUX_ID"); return this; }

    protected ConditionValue _constraintNameAutoQuxName;
    public ConditionValue getConstraintNameAutoQuxName() {
        if (_constraintNameAutoQuxName == null) { _constraintNameAutoQuxName = nCV(); }
        return _constraintNameAutoQuxName;
    }
    protected ConditionValue getCValueConstraintNameAutoQuxName() { return getConstraintNameAutoQuxName(); }

    /** 
     * Add order-by as ascend. <br />
     * CONSTRAINT_NAME_AUTO_QUX_NAME: {UQ, NotNull, VARCHAR(50)}
     * @return this. (NotNull)
     */
    public LdBsVendorConstraintNameAutoQuxCQ addOrderBy_ConstraintNameAutoQuxName_Asc() { regOBA("CONSTRAINT_NAME_AUTO_QUX_NAME"); return this; }

    /**
     * Add order-by as descend. <br />
     * CONSTRAINT_NAME_AUTO_QUX_NAME: {UQ, NotNull, VARCHAR(50)}
     * @return this. (NotNull)
     */
    public LdBsVendorConstraintNameAutoQuxCQ addOrderBy_ConstraintNameAutoQuxName_Desc() { regOBD("CONSTRAINT_NAME_AUTO_QUX_NAME"); return this; }

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
    public LdBsVendorConstraintNameAutoQuxCQ addSpecifiedDerivedOrderBy_Asc(String aliasName)
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
    public LdBsVendorConstraintNameAutoQuxCQ addSpecifiedDerivedOrderBy_Desc(String aliasName)
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
    protected Map<String, LdVendorConstraintNameAutoQuxCQ> _scalarConditionMap;
    public Map<String, LdVendorConstraintNameAutoQuxCQ> getScalarCondition() { return _scalarConditionMap; }
    public String keepScalarCondition(LdVendorConstraintNameAutoQuxCQ sq) {
        if (_scalarConditionMap == null) { _scalarConditionMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_scalarConditionMap.size() + 1);
        _scalarConditionMap.put(ky, sq); return "scalarCondition." + ky;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    protected Map<String, LdVendorConstraintNameAutoQuxCQ> _specifyMyselfDerivedMap;
    public Map<String, LdVendorConstraintNameAutoQuxCQ> getSpecifyMyselfDerived() { return _specifyMyselfDerivedMap; }
    public String keepSpecifyMyselfDerived(LdVendorConstraintNameAutoQuxCQ sq) {
        if (_specifyMyselfDerivedMap == null) { _specifyMyselfDerivedMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_specifyMyselfDerivedMap.size() + 1);
        _specifyMyselfDerivedMap.put(ky, sq); return "specifyMyselfDerived." + ky;
    }

    protected Map<String, LdVendorConstraintNameAutoQuxCQ> _queryMyselfDerivedMap;
    public Map<String, LdVendorConstraintNameAutoQuxCQ> getQueryMyselfDerived() { return _queryMyselfDerivedMap; }
    public String keepQueryMyselfDerived(LdVendorConstraintNameAutoQuxCQ sq) {
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
    protected Map<String, LdVendorConstraintNameAutoQuxCQ> _myselfExistsMap;
    public Map<String, LdVendorConstraintNameAutoQuxCQ> getMyselfExists() { return _myselfExistsMap; }
    public String keepMyselfExists(LdVendorConstraintNameAutoQuxCQ sq) {
        if (_myselfExistsMap == null) { _myselfExistsMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_myselfExistsMap.size() + 1);
        _myselfExistsMap.put(ky, sq); return "myselfExists." + ky;
    }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    protected Map<String, LdVendorConstraintNameAutoQuxCQ> _myselfInScopeMap;
    public Map<String, LdVendorConstraintNameAutoQuxCQ> getMyselfInScope() { return _myselfInScopeMap; }
    public String keepMyselfInScope(LdVendorConstraintNameAutoQuxCQ sq) {
        if (_myselfInScopeMap == null) { _myselfInScopeMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_myselfInScopeMap.size() + 1);
        _myselfInScopeMap.put(ky, sq); return "myselfInScope." + ky;
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return LdVendorConstraintNameAutoQuxCB.class.getName(); }
    protected String xCQ() { return LdVendorConstraintNameAutoQuxCQ.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
