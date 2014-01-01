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
 * The base condition-query of VENDOR_CONSTRAINT_NAME_AUTO_REF.
 * @author DBFlute(AutoGenerator)
 */
public class LdBsVendorConstraintNameAutoRefCQ extends LdAbstractBsVendorConstraintNameAutoRefCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected LdVendorConstraintNameAutoRefCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public LdBsVendorConstraintNameAutoRefCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from VENDOR_CONSTRAINT_NAME_AUTO_REF) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public LdVendorConstraintNameAutoRefCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected LdVendorConstraintNameAutoRefCIQ xcreateCIQ() {
        LdVendorConstraintNameAutoRefCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected LdVendorConstraintNameAutoRefCIQ xnewCIQ() {
        return new LdVendorConstraintNameAutoRefCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join VENDOR_CONSTRAINT_NAME_AUTO_REF on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public LdVendorConstraintNameAutoRefCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        LdVendorConstraintNameAutoRefCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected ConditionValue _constraintNameAutoRefId;
    public ConditionValue getConstraintNameAutoRefId() {
        if (_constraintNameAutoRefId == null) { _constraintNameAutoRefId = nCV(); }
        return _constraintNameAutoRefId;
    }
    protected ConditionValue getCValueConstraintNameAutoRefId() { return getConstraintNameAutoRefId(); }

    /** 
     * Add order-by as ascend. <br />
     * CONSTRAINT_NAME_AUTO_REF_ID: {PK, NotNull, NUMERIC(16)}
     * @return this. (NotNull)
     */
    public LdBsVendorConstraintNameAutoRefCQ addOrderBy_ConstraintNameAutoRefId_Asc() { regOBA("CONSTRAINT_NAME_AUTO_REF_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * CONSTRAINT_NAME_AUTO_REF_ID: {PK, NotNull, NUMERIC(16)}
     * @return this. (NotNull)
     */
    public LdBsVendorConstraintNameAutoRefCQ addOrderBy_ConstraintNameAutoRefId_Desc() { regOBD("CONSTRAINT_NAME_AUTO_REF_ID"); return this; }

    protected ConditionValue _constraintNameAutoFooId;
    public ConditionValue getConstraintNameAutoFooId() {
        if (_constraintNameAutoFooId == null) { _constraintNameAutoFooId = nCV(); }
        return _constraintNameAutoFooId;
    }
    protected ConditionValue getCValueConstraintNameAutoFooId() { return getConstraintNameAutoFooId(); }

    protected Map<String, LdVendorConstraintNameAutoFooCQ> _constraintNameAutoFooId_InScopeRelation_VendorConstraintNameAutoFooMap;
    public Map<String, LdVendorConstraintNameAutoFooCQ> getConstraintNameAutoFooId_InScopeRelation_VendorConstraintNameAutoFoo() { return _constraintNameAutoFooId_InScopeRelation_VendorConstraintNameAutoFooMap; }
    public String keepConstraintNameAutoFooId_InScopeRelation_VendorConstraintNameAutoFoo(LdVendorConstraintNameAutoFooCQ subQuery) {
        if (_constraintNameAutoFooId_InScopeRelation_VendorConstraintNameAutoFooMap == null) { _constraintNameAutoFooId_InScopeRelation_VendorConstraintNameAutoFooMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_constraintNameAutoFooId_InScopeRelation_VendorConstraintNameAutoFooMap.size() + 1);
        _constraintNameAutoFooId_InScopeRelation_VendorConstraintNameAutoFooMap.put(key, subQuery); return "constraintNameAutoFooId_InScopeRelation_VendorConstraintNameAutoFoo." + key;
    }

    protected Map<String, LdVendorConstraintNameAutoFooCQ> _constraintNameAutoFooId_NotInScopeRelation_VendorConstraintNameAutoFooMap;
    public Map<String, LdVendorConstraintNameAutoFooCQ> getConstraintNameAutoFooId_NotInScopeRelation_VendorConstraintNameAutoFoo() { return _constraintNameAutoFooId_NotInScopeRelation_VendorConstraintNameAutoFooMap; }
    public String keepConstraintNameAutoFooId_NotInScopeRelation_VendorConstraintNameAutoFoo(LdVendorConstraintNameAutoFooCQ subQuery) {
        if (_constraintNameAutoFooId_NotInScopeRelation_VendorConstraintNameAutoFooMap == null) { _constraintNameAutoFooId_NotInScopeRelation_VendorConstraintNameAutoFooMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_constraintNameAutoFooId_NotInScopeRelation_VendorConstraintNameAutoFooMap.size() + 1);
        _constraintNameAutoFooId_NotInScopeRelation_VendorConstraintNameAutoFooMap.put(key, subQuery); return "constraintNameAutoFooId_NotInScopeRelation_VendorConstraintNameAutoFoo." + key;
    }

    /** 
     * Add order-by as ascend. <br />
     * CONSTRAINT_NAME_AUTO_FOO_ID: {IX, NotNull, NUMERIC(16), FK to VENDOR_CONSTRAINT_NAME_AUTO_FOO}
     * @return this. (NotNull)
     */
    public LdBsVendorConstraintNameAutoRefCQ addOrderBy_ConstraintNameAutoFooId_Asc() { regOBA("CONSTRAINT_NAME_AUTO_FOO_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * CONSTRAINT_NAME_AUTO_FOO_ID: {IX, NotNull, NUMERIC(16), FK to VENDOR_CONSTRAINT_NAME_AUTO_FOO}
     * @return this. (NotNull)
     */
    public LdBsVendorConstraintNameAutoRefCQ addOrderBy_ConstraintNameAutoFooId_Desc() { regOBD("CONSTRAINT_NAME_AUTO_FOO_ID"); return this; }

    protected ConditionValue _constraintNameAutoBarId;
    public ConditionValue getConstraintNameAutoBarId() {
        if (_constraintNameAutoBarId == null) { _constraintNameAutoBarId = nCV(); }
        return _constraintNameAutoBarId;
    }
    protected ConditionValue getCValueConstraintNameAutoBarId() { return getConstraintNameAutoBarId(); }

    protected Map<String, LdVendorConstraintNameAutoBarCQ> _constraintNameAutoBarId_InScopeRelation_VendorConstraintNameAutoBarMap;
    public Map<String, LdVendorConstraintNameAutoBarCQ> getConstraintNameAutoBarId_InScopeRelation_VendorConstraintNameAutoBar() { return _constraintNameAutoBarId_InScopeRelation_VendorConstraintNameAutoBarMap; }
    public String keepConstraintNameAutoBarId_InScopeRelation_VendorConstraintNameAutoBar(LdVendorConstraintNameAutoBarCQ subQuery) {
        if (_constraintNameAutoBarId_InScopeRelation_VendorConstraintNameAutoBarMap == null) { _constraintNameAutoBarId_InScopeRelation_VendorConstraintNameAutoBarMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_constraintNameAutoBarId_InScopeRelation_VendorConstraintNameAutoBarMap.size() + 1);
        _constraintNameAutoBarId_InScopeRelation_VendorConstraintNameAutoBarMap.put(key, subQuery); return "constraintNameAutoBarId_InScopeRelation_VendorConstraintNameAutoBar." + key;
    }

    protected Map<String, LdVendorConstraintNameAutoBarCQ> _constraintNameAutoBarId_NotInScopeRelation_VendorConstraintNameAutoBarMap;
    public Map<String, LdVendorConstraintNameAutoBarCQ> getConstraintNameAutoBarId_NotInScopeRelation_VendorConstraintNameAutoBar() { return _constraintNameAutoBarId_NotInScopeRelation_VendorConstraintNameAutoBarMap; }
    public String keepConstraintNameAutoBarId_NotInScopeRelation_VendorConstraintNameAutoBar(LdVendorConstraintNameAutoBarCQ subQuery) {
        if (_constraintNameAutoBarId_NotInScopeRelation_VendorConstraintNameAutoBarMap == null) { _constraintNameAutoBarId_NotInScopeRelation_VendorConstraintNameAutoBarMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_constraintNameAutoBarId_NotInScopeRelation_VendorConstraintNameAutoBarMap.size() + 1);
        _constraintNameAutoBarId_NotInScopeRelation_VendorConstraintNameAutoBarMap.put(key, subQuery); return "constraintNameAutoBarId_NotInScopeRelation_VendorConstraintNameAutoBar." + key;
    }

    /** 
     * Add order-by as ascend. <br />
     * CONSTRAINT_NAME_AUTO_BAR_ID: {IX, NotNull, NUMERIC(16), FK to VENDOR_CONSTRAINT_NAME_AUTO_BAR}
     * @return this. (NotNull)
     */
    public LdBsVendorConstraintNameAutoRefCQ addOrderBy_ConstraintNameAutoBarId_Asc() { regOBA("CONSTRAINT_NAME_AUTO_BAR_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * CONSTRAINT_NAME_AUTO_BAR_ID: {IX, NotNull, NUMERIC(16), FK to VENDOR_CONSTRAINT_NAME_AUTO_BAR}
     * @return this. (NotNull)
     */
    public LdBsVendorConstraintNameAutoRefCQ addOrderBy_ConstraintNameAutoBarId_Desc() { regOBD("CONSTRAINT_NAME_AUTO_BAR_ID"); return this; }

    protected ConditionValue _constraintNameAutoQuxId;
    public ConditionValue getConstraintNameAutoQuxId() {
        if (_constraintNameAutoQuxId == null) { _constraintNameAutoQuxId = nCV(); }
        return _constraintNameAutoQuxId;
    }
    protected ConditionValue getCValueConstraintNameAutoQuxId() { return getConstraintNameAutoQuxId(); }

    protected Map<String, LdVendorConstraintNameAutoQuxCQ> _constraintNameAutoQuxId_InScopeRelation_VendorConstraintNameAutoQuxMap;
    public Map<String, LdVendorConstraintNameAutoQuxCQ> getConstraintNameAutoQuxId_InScopeRelation_VendorConstraintNameAutoQux() { return _constraintNameAutoQuxId_InScopeRelation_VendorConstraintNameAutoQuxMap; }
    public String keepConstraintNameAutoQuxId_InScopeRelation_VendorConstraintNameAutoQux(LdVendorConstraintNameAutoQuxCQ subQuery) {
        if (_constraintNameAutoQuxId_InScopeRelation_VendorConstraintNameAutoQuxMap == null) { _constraintNameAutoQuxId_InScopeRelation_VendorConstraintNameAutoQuxMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_constraintNameAutoQuxId_InScopeRelation_VendorConstraintNameAutoQuxMap.size() + 1);
        _constraintNameAutoQuxId_InScopeRelation_VendorConstraintNameAutoQuxMap.put(key, subQuery); return "constraintNameAutoQuxId_InScopeRelation_VendorConstraintNameAutoQux." + key;
    }

    protected Map<String, LdVendorConstraintNameAutoQuxCQ> _constraintNameAutoQuxId_NotInScopeRelation_VendorConstraintNameAutoQuxMap;
    public Map<String, LdVendorConstraintNameAutoQuxCQ> getConstraintNameAutoQuxId_NotInScopeRelation_VendorConstraintNameAutoQux() { return _constraintNameAutoQuxId_NotInScopeRelation_VendorConstraintNameAutoQuxMap; }
    public String keepConstraintNameAutoQuxId_NotInScopeRelation_VendorConstraintNameAutoQux(LdVendorConstraintNameAutoQuxCQ subQuery) {
        if (_constraintNameAutoQuxId_NotInScopeRelation_VendorConstraintNameAutoQuxMap == null) { _constraintNameAutoQuxId_NotInScopeRelation_VendorConstraintNameAutoQuxMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_constraintNameAutoQuxId_NotInScopeRelation_VendorConstraintNameAutoQuxMap.size() + 1);
        _constraintNameAutoQuxId_NotInScopeRelation_VendorConstraintNameAutoQuxMap.put(key, subQuery); return "constraintNameAutoQuxId_NotInScopeRelation_VendorConstraintNameAutoQux." + key;
    }

    /** 
     * Add order-by as ascend. <br />
     * CONSTRAINT_NAME_AUTO_QUX_ID: {IX, NotNull, NUMERIC(16), FK to VENDOR_CONSTRAINT_NAME_AUTO_QUX}
     * @return this. (NotNull)
     */
    public LdBsVendorConstraintNameAutoRefCQ addOrderBy_ConstraintNameAutoQuxId_Asc() { regOBA("CONSTRAINT_NAME_AUTO_QUX_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * CONSTRAINT_NAME_AUTO_QUX_ID: {IX, NotNull, NUMERIC(16), FK to VENDOR_CONSTRAINT_NAME_AUTO_QUX}
     * @return this. (NotNull)
     */
    public LdBsVendorConstraintNameAutoRefCQ addOrderBy_ConstraintNameAutoQuxId_Desc() { regOBD("CONSTRAINT_NAME_AUTO_QUX_ID"); return this; }

    protected ConditionValue _constraintNameAutoUnique;
    public ConditionValue getConstraintNameAutoUnique() {
        if (_constraintNameAutoUnique == null) { _constraintNameAutoUnique = nCV(); }
        return _constraintNameAutoUnique;
    }
    protected ConditionValue getCValueConstraintNameAutoUnique() { return getConstraintNameAutoUnique(); }

    /** 
     * Add order-by as ascend. <br />
     * CONSTRAINT_NAME_AUTO_UNIQUE: {UQ, NotNull, VARCHAR(50)}
     * @return this. (NotNull)
     */
    public LdBsVendorConstraintNameAutoRefCQ addOrderBy_ConstraintNameAutoUnique_Asc() { regOBA("CONSTRAINT_NAME_AUTO_UNIQUE"); return this; }

    /**
     * Add order-by as descend. <br />
     * CONSTRAINT_NAME_AUTO_UNIQUE: {UQ, NotNull, VARCHAR(50)}
     * @return this. (NotNull)
     */
    public LdBsVendorConstraintNameAutoRefCQ addOrderBy_ConstraintNameAutoUnique_Desc() { regOBD("CONSTRAINT_NAME_AUTO_UNIQUE"); return this; }

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
    public LdBsVendorConstraintNameAutoRefCQ addSpecifiedDerivedOrderBy_Asc(String aliasName)
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
    public LdBsVendorConstraintNameAutoRefCQ addSpecifiedDerivedOrderBy_Desc(String aliasName)
    { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    protected void reflectRelationOnUnionQuery(ConditionQuery baseQueryAsSuper, ConditionQuery unionQueryAsSuper) {
        LdVendorConstraintNameAutoRefCQ baseQuery = (LdVendorConstraintNameAutoRefCQ)baseQueryAsSuper;
        LdVendorConstraintNameAutoRefCQ unionQuery = (LdVendorConstraintNameAutoRefCQ)unionQueryAsSuper;
        if (baseQuery.hasConditionQueryVendorConstraintNameAutoFoo()) {
            unionQuery.queryVendorConstraintNameAutoFoo().reflectRelationOnUnionQuery(baseQuery.queryVendorConstraintNameAutoFoo(), unionQuery.queryVendorConstraintNameAutoFoo());
        }
        if (baseQuery.hasConditionQueryVendorConstraintNameAutoBar()) {
            unionQuery.queryVendorConstraintNameAutoBar().reflectRelationOnUnionQuery(baseQuery.queryVendorConstraintNameAutoBar(), unionQuery.queryVendorConstraintNameAutoBar());
        }
        if (baseQuery.hasConditionQueryVendorConstraintNameAutoQux()) {
            unionQuery.queryVendorConstraintNameAutoQux().reflectRelationOnUnionQuery(baseQuery.queryVendorConstraintNameAutoQux(), unionQuery.queryVendorConstraintNameAutoQux());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br />
     * VENDOR_CONSTRAINT_NAME_AUTO_FOO by my CONSTRAINT_NAME_AUTO_FOO_ID, named 'vendorConstraintNameAutoFoo'.
     * @return The instance of condition-query. (NotNull)
     */
    public LdVendorConstraintNameAutoFooCQ queryVendorConstraintNameAutoFoo() {
        return getConditionQueryVendorConstraintNameAutoFoo();
    }
    protected LdVendorConstraintNameAutoFooCQ _conditionQueryVendorConstraintNameAutoFoo;
    public LdVendorConstraintNameAutoFooCQ getConditionQueryVendorConstraintNameAutoFoo() {
        if (_conditionQueryVendorConstraintNameAutoFoo == null) {
            _conditionQueryVendorConstraintNameAutoFoo = xcreateQueryVendorConstraintNameAutoFoo();
            xsetupOuterJoinVendorConstraintNameAutoFoo();
        }
        return _conditionQueryVendorConstraintNameAutoFoo;
    }
    protected LdVendorConstraintNameAutoFooCQ xcreateQueryVendorConstraintNameAutoFoo() {
        String nrp = resolveNextRelationPath("VENDOR_CONSTRAINT_NAME_AUTO_REF", "vendorConstraintNameAutoFoo");
        String jan = resolveJoinAliasName(nrp, xgetNextNestLevel());
        LdVendorConstraintNameAutoFooCQ cq = new LdVendorConstraintNameAutoFooCQ(this, xgetSqlClause(), jan, xgetNextNestLevel());
        cq.xsetBaseCB(_baseCB);
        cq.xsetForeignPropertyName("vendorConstraintNameAutoFoo");
        cq.xsetRelationPath(nrp); return cq;
    }
    protected void xsetupOuterJoinVendorConstraintNameAutoFoo() {
        LdVendorConstraintNameAutoFooCQ cq = getConditionQueryVendorConstraintNameAutoFoo();
        Map<String, String> joinOnMap = newLinkedHashMapSized(4);
        joinOnMap.put("CONSTRAINT_NAME_AUTO_FOO_ID", "CONSTRAINT_NAME_AUTO_FOO_ID");
        registerOuterJoin(cq, joinOnMap, "vendorConstraintNameAutoFoo");
    }
    public boolean hasConditionQueryVendorConstraintNameAutoFoo() {
        return _conditionQueryVendorConstraintNameAutoFoo != null;
    }

    /**
     * Get the condition-query for relation table. <br />
     * VENDOR_CONSTRAINT_NAME_AUTO_BAR by my CONSTRAINT_NAME_AUTO_BAR_ID, named 'vendorConstraintNameAutoBar'.
     * @return The instance of condition-query. (NotNull)
     */
    public LdVendorConstraintNameAutoBarCQ queryVendorConstraintNameAutoBar() {
        return getConditionQueryVendorConstraintNameAutoBar();
    }
    protected LdVendorConstraintNameAutoBarCQ _conditionQueryVendorConstraintNameAutoBar;
    public LdVendorConstraintNameAutoBarCQ getConditionQueryVendorConstraintNameAutoBar() {
        if (_conditionQueryVendorConstraintNameAutoBar == null) {
            _conditionQueryVendorConstraintNameAutoBar = xcreateQueryVendorConstraintNameAutoBar();
            xsetupOuterJoinVendorConstraintNameAutoBar();
        }
        return _conditionQueryVendorConstraintNameAutoBar;
    }
    protected LdVendorConstraintNameAutoBarCQ xcreateQueryVendorConstraintNameAutoBar() {
        String nrp = resolveNextRelationPath("VENDOR_CONSTRAINT_NAME_AUTO_REF", "vendorConstraintNameAutoBar");
        String jan = resolveJoinAliasName(nrp, xgetNextNestLevel());
        LdVendorConstraintNameAutoBarCQ cq = new LdVendorConstraintNameAutoBarCQ(this, xgetSqlClause(), jan, xgetNextNestLevel());
        cq.xsetBaseCB(_baseCB);
        cq.xsetForeignPropertyName("vendorConstraintNameAutoBar");
        cq.xsetRelationPath(nrp); return cq;
    }
    protected void xsetupOuterJoinVendorConstraintNameAutoBar() {
        LdVendorConstraintNameAutoBarCQ cq = getConditionQueryVendorConstraintNameAutoBar();
        Map<String, String> joinOnMap = newLinkedHashMapSized(4);
        joinOnMap.put("CONSTRAINT_NAME_AUTO_BAR_ID", "CONSTRAINT_NAME_AUTO_BAR_ID");
        registerOuterJoin(cq, joinOnMap, "vendorConstraintNameAutoBar");
    }
    public boolean hasConditionQueryVendorConstraintNameAutoBar() {
        return _conditionQueryVendorConstraintNameAutoBar != null;
    }

    /**
     * Get the condition-query for relation table. <br />
     * VENDOR_CONSTRAINT_NAME_AUTO_QUX by my CONSTRAINT_NAME_AUTO_QUX_ID, named 'vendorConstraintNameAutoQux'.
     * @return The instance of condition-query. (NotNull)
     */
    public LdVendorConstraintNameAutoQuxCQ queryVendorConstraintNameAutoQux() {
        return getConditionQueryVendorConstraintNameAutoQux();
    }
    protected LdVendorConstraintNameAutoQuxCQ _conditionQueryVendorConstraintNameAutoQux;
    public LdVendorConstraintNameAutoQuxCQ getConditionQueryVendorConstraintNameAutoQux() {
        if (_conditionQueryVendorConstraintNameAutoQux == null) {
            _conditionQueryVendorConstraintNameAutoQux = xcreateQueryVendorConstraintNameAutoQux();
            xsetupOuterJoinVendorConstraintNameAutoQux();
        }
        return _conditionQueryVendorConstraintNameAutoQux;
    }
    protected LdVendorConstraintNameAutoQuxCQ xcreateQueryVendorConstraintNameAutoQux() {
        String nrp = resolveNextRelationPath("VENDOR_CONSTRAINT_NAME_AUTO_REF", "vendorConstraintNameAutoQux");
        String jan = resolveJoinAliasName(nrp, xgetNextNestLevel());
        LdVendorConstraintNameAutoQuxCQ cq = new LdVendorConstraintNameAutoQuxCQ(this, xgetSqlClause(), jan, xgetNextNestLevel());
        cq.xsetBaseCB(_baseCB);
        cq.xsetForeignPropertyName("vendorConstraintNameAutoQux");
        cq.xsetRelationPath(nrp); return cq;
    }
    protected void xsetupOuterJoinVendorConstraintNameAutoQux() {
        LdVendorConstraintNameAutoQuxCQ cq = getConditionQueryVendorConstraintNameAutoQux();
        Map<String, String> joinOnMap = newLinkedHashMapSized(4);
        joinOnMap.put("CONSTRAINT_NAME_AUTO_QUX_ID", "CONSTRAINT_NAME_AUTO_QUX_ID");
        registerOuterJoin(cq, joinOnMap, "vendorConstraintNameAutoQux");
    }
    public boolean hasConditionQueryVendorConstraintNameAutoQux() {
        return _conditionQueryVendorConstraintNameAutoQux != null;
    }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    protected Map<String, LdVendorConstraintNameAutoRefCQ> _scalarConditionMap;
    public Map<String, LdVendorConstraintNameAutoRefCQ> getScalarCondition() { return _scalarConditionMap; }
    public String keepScalarCondition(LdVendorConstraintNameAutoRefCQ subQuery) {
        if (_scalarConditionMap == null) { _scalarConditionMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_scalarConditionMap.size() + 1);
        _scalarConditionMap.put(key, subQuery); return "scalarCondition." + key;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    protected Map<String, LdVendorConstraintNameAutoRefCQ> _specifyMyselfDerivedMap;
    public Map<String, LdVendorConstraintNameAutoRefCQ> getSpecifyMyselfDerived() { return _specifyMyselfDerivedMap; }
    public String keepSpecifyMyselfDerived(LdVendorConstraintNameAutoRefCQ subQuery) {
        if (_specifyMyselfDerivedMap == null) { _specifyMyselfDerivedMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_specifyMyselfDerivedMap.size() + 1);
        _specifyMyselfDerivedMap.put(key, subQuery); return "specifyMyselfDerived." + key;
    }

    protected Map<String, LdVendorConstraintNameAutoRefCQ> _queryMyselfDerivedMap;
    public Map<String, LdVendorConstraintNameAutoRefCQ> getQueryMyselfDerived() { return _queryMyselfDerivedMap; }
    public String keepQueryMyselfDerived(LdVendorConstraintNameAutoRefCQ subQuery) {
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
    protected Map<String, LdVendorConstraintNameAutoRefCQ> _myselfExistsMap;
    public Map<String, LdVendorConstraintNameAutoRefCQ> getMyselfExists() { return _myselfExistsMap; }
    public String keepMyselfExists(LdVendorConstraintNameAutoRefCQ subQuery) {
        if (_myselfExistsMap == null) { _myselfExistsMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_myselfExistsMap.size() + 1);
        _myselfExistsMap.put(key, subQuery); return "myselfExists." + key;
    }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    protected Map<String, LdVendorConstraintNameAutoRefCQ> _myselfInScopeMap;
    public Map<String, LdVendorConstraintNameAutoRefCQ> getMyselfInScope() { return _myselfInScopeMap; }
    public String keepMyselfInScope(LdVendorConstraintNameAutoRefCQ subQuery) {
        if (_myselfInScopeMap == null) { _myselfInScopeMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_myselfInScopeMap.size() + 1);
        _myselfInScopeMap.put(key, subQuery); return "myselfInScope." + key;
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return LdVendorConstraintNameAutoRefCB.class.getName(); }
    protected String xCQ() { return LdVendorConstraintNameAutoRefCQ.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
