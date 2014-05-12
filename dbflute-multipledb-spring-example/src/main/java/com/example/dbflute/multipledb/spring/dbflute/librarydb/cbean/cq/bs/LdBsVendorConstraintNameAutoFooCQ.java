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
 * The base condition-query of VENDOR_CONSTRAINT_NAME_AUTO_FOO.
 * @author DBFlute(AutoGenerator)
 */
public class LdBsVendorConstraintNameAutoFooCQ extends LdAbstractBsVendorConstraintNameAutoFooCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected LdVendorConstraintNameAutoFooCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public LdBsVendorConstraintNameAutoFooCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from VENDOR_CONSTRAINT_NAME_AUTO_FOO) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public LdVendorConstraintNameAutoFooCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected LdVendorConstraintNameAutoFooCIQ xcreateCIQ() {
        LdVendorConstraintNameAutoFooCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected LdVendorConstraintNameAutoFooCIQ xnewCIQ() {
        return new LdVendorConstraintNameAutoFooCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join VENDOR_CONSTRAINT_NAME_AUTO_FOO on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public LdVendorConstraintNameAutoFooCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        LdVendorConstraintNameAutoFooCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected ConditionValue _constraintNameAutoFooId;
    public ConditionValue getConstraintNameAutoFooId() {
        if (_constraintNameAutoFooId == null) { _constraintNameAutoFooId = nCV(); }
        return _constraintNameAutoFooId;
    }
    protected ConditionValue getCValueConstraintNameAutoFooId() { return getConstraintNameAutoFooId(); }

    protected Map<String, LdVendorConstraintNameAutoRefCQ> _constraintNameAutoFooId_ExistsReferrer_VendorConstraintNameAutoRefListMap;
    public Map<String, LdVendorConstraintNameAutoRefCQ> getConstraintNameAutoFooId_ExistsReferrer_VendorConstraintNameAutoRefList() { return _constraintNameAutoFooId_ExistsReferrer_VendorConstraintNameAutoRefListMap; }
    public String keepConstraintNameAutoFooId_ExistsReferrer_VendorConstraintNameAutoRefList(LdVendorConstraintNameAutoRefCQ sq) {
        if (_constraintNameAutoFooId_ExistsReferrer_VendorConstraintNameAutoRefListMap == null) { _constraintNameAutoFooId_ExistsReferrer_VendorConstraintNameAutoRefListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_constraintNameAutoFooId_ExistsReferrer_VendorConstraintNameAutoRefListMap.size() + 1);
        _constraintNameAutoFooId_ExistsReferrer_VendorConstraintNameAutoRefListMap.put(ky, sq); return "constraintNameAutoFooId_ExistsReferrer_VendorConstraintNameAutoRefList." + ky;
    }

    protected Map<String, LdVendorConstraintNameAutoRefCQ> _constraintNameAutoFooId_NotExistsReferrer_VendorConstraintNameAutoRefListMap;
    public Map<String, LdVendorConstraintNameAutoRefCQ> getConstraintNameAutoFooId_NotExistsReferrer_VendorConstraintNameAutoRefList() { return _constraintNameAutoFooId_NotExistsReferrer_VendorConstraintNameAutoRefListMap; }
    public String keepConstraintNameAutoFooId_NotExistsReferrer_VendorConstraintNameAutoRefList(LdVendorConstraintNameAutoRefCQ sq) {
        if (_constraintNameAutoFooId_NotExistsReferrer_VendorConstraintNameAutoRefListMap == null) { _constraintNameAutoFooId_NotExistsReferrer_VendorConstraintNameAutoRefListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_constraintNameAutoFooId_NotExistsReferrer_VendorConstraintNameAutoRefListMap.size() + 1);
        _constraintNameAutoFooId_NotExistsReferrer_VendorConstraintNameAutoRefListMap.put(ky, sq); return "constraintNameAutoFooId_NotExistsReferrer_VendorConstraintNameAutoRefList." + ky;
    }

    protected Map<String, LdVendorConstraintNameAutoRefCQ> _constraintNameAutoFooId_SpecifyDerivedReferrer_VendorConstraintNameAutoRefListMap;
    public Map<String, LdVendorConstraintNameAutoRefCQ> getConstraintNameAutoFooId_SpecifyDerivedReferrer_VendorConstraintNameAutoRefList() { return _constraintNameAutoFooId_SpecifyDerivedReferrer_VendorConstraintNameAutoRefListMap; }
    public String keepConstraintNameAutoFooId_SpecifyDerivedReferrer_VendorConstraintNameAutoRefList(LdVendorConstraintNameAutoRefCQ sq) {
        if (_constraintNameAutoFooId_SpecifyDerivedReferrer_VendorConstraintNameAutoRefListMap == null) { _constraintNameAutoFooId_SpecifyDerivedReferrer_VendorConstraintNameAutoRefListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_constraintNameAutoFooId_SpecifyDerivedReferrer_VendorConstraintNameAutoRefListMap.size() + 1);
        _constraintNameAutoFooId_SpecifyDerivedReferrer_VendorConstraintNameAutoRefListMap.put(ky, sq); return "constraintNameAutoFooId_SpecifyDerivedReferrer_VendorConstraintNameAutoRefList." + ky;
    }

    protected Map<String, LdVendorConstraintNameAutoRefCQ> _constraintNameAutoFooId_InScopeRelation_VendorConstraintNameAutoRefListMap;
    public Map<String, LdVendorConstraintNameAutoRefCQ> getConstraintNameAutoFooId_InScopeRelation_VendorConstraintNameAutoRefList() { return _constraintNameAutoFooId_InScopeRelation_VendorConstraintNameAutoRefListMap; }
    public String keepConstraintNameAutoFooId_InScopeRelation_VendorConstraintNameAutoRefList(LdVendorConstraintNameAutoRefCQ sq) {
        if (_constraintNameAutoFooId_InScopeRelation_VendorConstraintNameAutoRefListMap == null) { _constraintNameAutoFooId_InScopeRelation_VendorConstraintNameAutoRefListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_constraintNameAutoFooId_InScopeRelation_VendorConstraintNameAutoRefListMap.size() + 1);
        _constraintNameAutoFooId_InScopeRelation_VendorConstraintNameAutoRefListMap.put(ky, sq); return "constraintNameAutoFooId_InScopeRelation_VendorConstraintNameAutoRefList." + ky;
    }

    protected Map<String, LdVendorConstraintNameAutoRefCQ> _constraintNameAutoFooId_NotInScopeRelation_VendorConstraintNameAutoRefListMap;
    public Map<String, LdVendorConstraintNameAutoRefCQ> getConstraintNameAutoFooId_NotInScopeRelation_VendorConstraintNameAutoRefList() { return _constraintNameAutoFooId_NotInScopeRelation_VendorConstraintNameAutoRefListMap; }
    public String keepConstraintNameAutoFooId_NotInScopeRelation_VendorConstraintNameAutoRefList(LdVendorConstraintNameAutoRefCQ sq) {
        if (_constraintNameAutoFooId_NotInScopeRelation_VendorConstraintNameAutoRefListMap == null) { _constraintNameAutoFooId_NotInScopeRelation_VendorConstraintNameAutoRefListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_constraintNameAutoFooId_NotInScopeRelation_VendorConstraintNameAutoRefListMap.size() + 1);
        _constraintNameAutoFooId_NotInScopeRelation_VendorConstraintNameAutoRefListMap.put(ky, sq); return "constraintNameAutoFooId_NotInScopeRelation_VendorConstraintNameAutoRefList." + ky;
    }

    protected Map<String, LdVendorConstraintNameAutoRefCQ> _constraintNameAutoFooId_QueryDerivedReferrer_VendorConstraintNameAutoRefListMap;
    public Map<String, LdVendorConstraintNameAutoRefCQ> getConstraintNameAutoFooId_QueryDerivedReferrer_VendorConstraintNameAutoRefList() { return _constraintNameAutoFooId_QueryDerivedReferrer_VendorConstraintNameAutoRefListMap; }
    public String keepConstraintNameAutoFooId_QueryDerivedReferrer_VendorConstraintNameAutoRefList(LdVendorConstraintNameAutoRefCQ sq) {
        if (_constraintNameAutoFooId_QueryDerivedReferrer_VendorConstraintNameAutoRefListMap == null) { _constraintNameAutoFooId_QueryDerivedReferrer_VendorConstraintNameAutoRefListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_constraintNameAutoFooId_QueryDerivedReferrer_VendorConstraintNameAutoRefListMap.size() + 1);
        _constraintNameAutoFooId_QueryDerivedReferrer_VendorConstraintNameAutoRefListMap.put(ky, sq); return "constraintNameAutoFooId_QueryDerivedReferrer_VendorConstraintNameAutoRefList." + ky;
    }
    protected Map<String, Object> _constraintNameAutoFooId_QueryDerivedReferrer_VendorConstraintNameAutoRefListParameterMap;
    public Map<String, Object> getConstraintNameAutoFooId_QueryDerivedReferrer_VendorConstraintNameAutoRefListParameter() { return _constraintNameAutoFooId_QueryDerivedReferrer_VendorConstraintNameAutoRefListParameterMap; }
    public String keepConstraintNameAutoFooId_QueryDerivedReferrer_VendorConstraintNameAutoRefListParameter(Object vl) {
        if (_constraintNameAutoFooId_QueryDerivedReferrer_VendorConstraintNameAutoRefListParameterMap == null) { _constraintNameAutoFooId_QueryDerivedReferrer_VendorConstraintNameAutoRefListParameterMap = newLinkedHashMapSized(4); }
        String ky = "subQueryParameterKey" + (_constraintNameAutoFooId_QueryDerivedReferrer_VendorConstraintNameAutoRefListParameterMap.size() + 1);
        _constraintNameAutoFooId_QueryDerivedReferrer_VendorConstraintNameAutoRefListParameterMap.put(ky, vl); return "constraintNameAutoFooId_QueryDerivedReferrer_VendorConstraintNameAutoRefListParameter." + ky;
    }

    /** 
     * Add order-by as ascend. <br />
     * CONSTRAINT_NAME_AUTO_FOO_ID: {PK, NotNull, NUMERIC(16)}
     * @return this. (NotNull)
     */
    public LdBsVendorConstraintNameAutoFooCQ addOrderBy_ConstraintNameAutoFooId_Asc() { regOBA("CONSTRAINT_NAME_AUTO_FOO_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * CONSTRAINT_NAME_AUTO_FOO_ID: {PK, NotNull, NUMERIC(16)}
     * @return this. (NotNull)
     */
    public LdBsVendorConstraintNameAutoFooCQ addOrderBy_ConstraintNameAutoFooId_Desc() { regOBD("CONSTRAINT_NAME_AUTO_FOO_ID"); return this; }

    protected ConditionValue _constraintNameAutoFooName;
    public ConditionValue getConstraintNameAutoFooName() {
        if (_constraintNameAutoFooName == null) { _constraintNameAutoFooName = nCV(); }
        return _constraintNameAutoFooName;
    }
    protected ConditionValue getCValueConstraintNameAutoFooName() { return getConstraintNameAutoFooName(); }

    /** 
     * Add order-by as ascend. <br />
     * CONSTRAINT_NAME_AUTO_FOO_NAME: {UQ, NotNull, VARCHAR(50)}
     * @return this. (NotNull)
     */
    public LdBsVendorConstraintNameAutoFooCQ addOrderBy_ConstraintNameAutoFooName_Asc() { regOBA("CONSTRAINT_NAME_AUTO_FOO_NAME"); return this; }

    /**
     * Add order-by as descend. <br />
     * CONSTRAINT_NAME_AUTO_FOO_NAME: {UQ, NotNull, VARCHAR(50)}
     * @return this. (NotNull)
     */
    public LdBsVendorConstraintNameAutoFooCQ addOrderBy_ConstraintNameAutoFooName_Desc() { regOBD("CONSTRAINT_NAME_AUTO_FOO_NAME"); return this; }

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
    public LdBsVendorConstraintNameAutoFooCQ addSpecifiedDerivedOrderBy_Asc(String aliasName)
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
    public LdBsVendorConstraintNameAutoFooCQ addSpecifiedDerivedOrderBy_Desc(String aliasName)
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
    protected Map<String, LdVendorConstraintNameAutoFooCQ> _scalarConditionMap;
    public Map<String, LdVendorConstraintNameAutoFooCQ> getScalarCondition() { return _scalarConditionMap; }
    public String keepScalarCondition(LdVendorConstraintNameAutoFooCQ sq) {
        if (_scalarConditionMap == null) { _scalarConditionMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_scalarConditionMap.size() + 1);
        _scalarConditionMap.put(ky, sq); return "scalarCondition." + ky;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    protected Map<String, LdVendorConstraintNameAutoFooCQ> _specifyMyselfDerivedMap;
    public Map<String, LdVendorConstraintNameAutoFooCQ> getSpecifyMyselfDerived() { return _specifyMyselfDerivedMap; }
    public String keepSpecifyMyselfDerived(LdVendorConstraintNameAutoFooCQ sq) {
        if (_specifyMyselfDerivedMap == null) { _specifyMyselfDerivedMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_specifyMyselfDerivedMap.size() + 1);
        _specifyMyselfDerivedMap.put(ky, sq); return "specifyMyselfDerived." + ky;
    }

    protected Map<String, LdVendorConstraintNameAutoFooCQ> _queryMyselfDerivedMap;
    public Map<String, LdVendorConstraintNameAutoFooCQ> getQueryMyselfDerived() { return _queryMyselfDerivedMap; }
    public String keepQueryMyselfDerived(LdVendorConstraintNameAutoFooCQ sq) {
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
    protected Map<String, LdVendorConstraintNameAutoFooCQ> _myselfExistsMap;
    public Map<String, LdVendorConstraintNameAutoFooCQ> getMyselfExists() { return _myselfExistsMap; }
    public String keepMyselfExists(LdVendorConstraintNameAutoFooCQ sq) {
        if (_myselfExistsMap == null) { _myselfExistsMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_myselfExistsMap.size() + 1);
        _myselfExistsMap.put(ky, sq); return "myselfExists." + ky;
    }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    protected Map<String, LdVendorConstraintNameAutoFooCQ> _myselfInScopeMap;
    public Map<String, LdVendorConstraintNameAutoFooCQ> getMyselfInScope() { return _myselfInScopeMap; }
    public String keepMyselfInScope(LdVendorConstraintNameAutoFooCQ sq) {
        if (_myselfInScopeMap == null) { _myselfInScopeMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_myselfInScopeMap.size() + 1);
        _myselfInScopeMap.put(ky, sq); return "myselfInScope." + ky;
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return LdVendorConstraintNameAutoFooCB.class.getName(); }
    protected String xCQ() { return LdVendorConstraintNameAutoFooCQ.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
