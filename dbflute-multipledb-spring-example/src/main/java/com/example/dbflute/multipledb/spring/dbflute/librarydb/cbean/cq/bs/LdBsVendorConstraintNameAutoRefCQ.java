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
    public LdBsVendorConstraintNameAutoRefCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from VENDOR_CONSTRAINT_NAME_AUTO_REF) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">inline()</span>.setFoo...;
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
     * cb.query().queryMemberStatus().<span style="color: #DD4747">on()</span>.setFoo...;
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
    public ConditionValue getConstraintNameAutoRefId()
    { if (_constraintNameAutoRefId == null) { _constraintNameAutoRefId = nCV(); }
      return _constraintNameAutoRefId; }
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
    public ConditionValue getConstraintNameAutoFooId()
    { if (_constraintNameAutoFooId == null) { _constraintNameAutoFooId = nCV(); }
      return _constraintNameAutoFooId; }
    protected ConditionValue getCValueConstraintNameAutoFooId() { return getConstraintNameAutoFooId(); }

    public Map<String, LdVendorConstraintNameAutoFooCQ> getConstraintNameAutoFooId_InScopeRelation_VendorConstraintNameAutoFoo() { return xgetSQueMap("constraintNameAutoFooId_InScopeRelation_VendorConstraintNameAutoFoo"); }
    public String keepConstraintNameAutoFooId_InScopeRelation_VendorConstraintNameAutoFoo(LdVendorConstraintNameAutoFooCQ sq) { return xkeepSQue("constraintNameAutoFooId_InScopeRelation_VendorConstraintNameAutoFoo", sq); }

    public Map<String, LdVendorConstraintNameAutoFooCQ> getConstraintNameAutoFooId_NotInScopeRelation_VendorConstraintNameAutoFoo() { return xgetSQueMap("constraintNameAutoFooId_NotInScopeRelation_VendorConstraintNameAutoFoo"); }
    public String keepConstraintNameAutoFooId_NotInScopeRelation_VendorConstraintNameAutoFoo(LdVendorConstraintNameAutoFooCQ sq) { return xkeepSQue("constraintNameAutoFooId_NotInScopeRelation_VendorConstraintNameAutoFoo", sq); }

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
    public ConditionValue getConstraintNameAutoBarId()
    { if (_constraintNameAutoBarId == null) { _constraintNameAutoBarId = nCV(); }
      return _constraintNameAutoBarId; }
    protected ConditionValue getCValueConstraintNameAutoBarId() { return getConstraintNameAutoBarId(); }

    public Map<String, LdVendorConstraintNameAutoBarCQ> getConstraintNameAutoBarId_InScopeRelation_VendorConstraintNameAutoBar() { return xgetSQueMap("constraintNameAutoBarId_InScopeRelation_VendorConstraintNameAutoBar"); }
    public String keepConstraintNameAutoBarId_InScopeRelation_VendorConstraintNameAutoBar(LdVendorConstraintNameAutoBarCQ sq) { return xkeepSQue("constraintNameAutoBarId_InScopeRelation_VendorConstraintNameAutoBar", sq); }

    public Map<String, LdVendorConstraintNameAutoBarCQ> getConstraintNameAutoBarId_NotInScopeRelation_VendorConstraintNameAutoBar() { return xgetSQueMap("constraintNameAutoBarId_NotInScopeRelation_VendorConstraintNameAutoBar"); }
    public String keepConstraintNameAutoBarId_NotInScopeRelation_VendorConstraintNameAutoBar(LdVendorConstraintNameAutoBarCQ sq) { return xkeepSQue("constraintNameAutoBarId_NotInScopeRelation_VendorConstraintNameAutoBar", sq); }

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
    public ConditionValue getConstraintNameAutoQuxId()
    { if (_constraintNameAutoQuxId == null) { _constraintNameAutoQuxId = nCV(); }
      return _constraintNameAutoQuxId; }
    protected ConditionValue getCValueConstraintNameAutoQuxId() { return getConstraintNameAutoQuxId(); }

    public Map<String, LdVendorConstraintNameAutoQuxCQ> getConstraintNameAutoQuxId_InScopeRelation_VendorConstraintNameAutoQux() { return xgetSQueMap("constraintNameAutoQuxId_InScopeRelation_VendorConstraintNameAutoQux"); }
    public String keepConstraintNameAutoQuxId_InScopeRelation_VendorConstraintNameAutoQux(LdVendorConstraintNameAutoQuxCQ sq) { return xkeepSQue("constraintNameAutoQuxId_InScopeRelation_VendorConstraintNameAutoQux", sq); }

    public Map<String, LdVendorConstraintNameAutoQuxCQ> getConstraintNameAutoQuxId_NotInScopeRelation_VendorConstraintNameAutoQux() { return xgetSQueMap("constraintNameAutoQuxId_NotInScopeRelation_VendorConstraintNameAutoQux"); }
    public String keepConstraintNameAutoQuxId_NotInScopeRelation_VendorConstraintNameAutoQux(LdVendorConstraintNameAutoQuxCQ sq) { return xkeepSQue("constraintNameAutoQuxId_NotInScopeRelation_VendorConstraintNameAutoQux", sq); }

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
    public ConditionValue getConstraintNameAutoUnique()
    { if (_constraintNameAutoUnique == null) { _constraintNameAutoUnique = nCV(); }
      return _constraintNameAutoUnique; }
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
     * }, <span style="color: #DD4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] asc</span>
     * cb.<span style="color: #DD4747">addSpecifiedDerivedOrderBy_Asc</span>(<span style="color: #DD4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public LdBsVendorConstraintNameAutoRefCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public LdBsVendorConstraintNameAutoRefCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        LdVendorConstraintNameAutoRefCQ bq = (LdVendorConstraintNameAutoRefCQ)bqs;
        LdVendorConstraintNameAutoRefCQ uq = (LdVendorConstraintNameAutoRefCQ)uqs;
        if (bq.hasConditionQueryVendorConstraintNameAutoFoo()) {
            uq.queryVendorConstraintNameAutoFoo().reflectRelationOnUnionQuery(bq.queryVendorConstraintNameAutoFoo(), uq.queryVendorConstraintNameAutoFoo());
        }
        if (bq.hasConditionQueryVendorConstraintNameAutoBar()) {
            uq.queryVendorConstraintNameAutoBar().reflectRelationOnUnionQuery(bq.queryVendorConstraintNameAutoBar(), uq.queryVendorConstraintNameAutoBar());
        }
        if (bq.hasConditionQueryVendorConstraintNameAutoQux()) {
            uq.queryVendorConstraintNameAutoQux().reflectRelationOnUnionQuery(bq.queryVendorConstraintNameAutoQux(), uq.queryVendorConstraintNameAutoQux());
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
    public LdVendorConstraintNameAutoFooCQ getConditionQueryVendorConstraintNameAutoFoo() {
        String prop = "vendorConstraintNameAutoFoo";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryVendorConstraintNameAutoFoo()); xsetupOuterJoinVendorConstraintNameAutoFoo(); }
        return xgetQueRlMap(prop);
    }
    protected LdVendorConstraintNameAutoFooCQ xcreateQueryVendorConstraintNameAutoFoo() {
        String nrp = xresolveNRP("VENDOR_CONSTRAINT_NAME_AUTO_REF", "vendorConstraintNameAutoFoo"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new LdVendorConstraintNameAutoFooCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "vendorConstraintNameAutoFoo", nrp);
    }
    protected void xsetupOuterJoinVendorConstraintNameAutoFoo() { xregOutJo("vendorConstraintNameAutoFoo"); }
    public boolean hasConditionQueryVendorConstraintNameAutoFoo() { return xhasQueRlMap("vendorConstraintNameAutoFoo"); }

    /**
     * Get the condition-query for relation table. <br />
     * VENDOR_CONSTRAINT_NAME_AUTO_BAR by my CONSTRAINT_NAME_AUTO_BAR_ID, named 'vendorConstraintNameAutoBar'.
     * @return The instance of condition-query. (NotNull)
     */
    public LdVendorConstraintNameAutoBarCQ queryVendorConstraintNameAutoBar() {
        return getConditionQueryVendorConstraintNameAutoBar();
    }
    public LdVendorConstraintNameAutoBarCQ getConditionQueryVendorConstraintNameAutoBar() {
        String prop = "vendorConstraintNameAutoBar";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryVendorConstraintNameAutoBar()); xsetupOuterJoinVendorConstraintNameAutoBar(); }
        return xgetQueRlMap(prop);
    }
    protected LdVendorConstraintNameAutoBarCQ xcreateQueryVendorConstraintNameAutoBar() {
        String nrp = xresolveNRP("VENDOR_CONSTRAINT_NAME_AUTO_REF", "vendorConstraintNameAutoBar"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new LdVendorConstraintNameAutoBarCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "vendorConstraintNameAutoBar", nrp);
    }
    protected void xsetupOuterJoinVendorConstraintNameAutoBar() { xregOutJo("vendorConstraintNameAutoBar"); }
    public boolean hasConditionQueryVendorConstraintNameAutoBar() { return xhasQueRlMap("vendorConstraintNameAutoBar"); }

    /**
     * Get the condition-query for relation table. <br />
     * VENDOR_CONSTRAINT_NAME_AUTO_QUX by my CONSTRAINT_NAME_AUTO_QUX_ID, named 'vendorConstraintNameAutoQux'.
     * @return The instance of condition-query. (NotNull)
     */
    public LdVendorConstraintNameAutoQuxCQ queryVendorConstraintNameAutoQux() {
        return getConditionQueryVendorConstraintNameAutoQux();
    }
    public LdVendorConstraintNameAutoQuxCQ getConditionQueryVendorConstraintNameAutoQux() {
        String prop = "vendorConstraintNameAutoQux";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryVendorConstraintNameAutoQux()); xsetupOuterJoinVendorConstraintNameAutoQux(); }
        return xgetQueRlMap(prop);
    }
    protected LdVendorConstraintNameAutoQuxCQ xcreateQueryVendorConstraintNameAutoQux() {
        String nrp = xresolveNRP("VENDOR_CONSTRAINT_NAME_AUTO_REF", "vendorConstraintNameAutoQux"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new LdVendorConstraintNameAutoQuxCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "vendorConstraintNameAutoQux", nrp);
    }
    protected void xsetupOuterJoinVendorConstraintNameAutoQux() { xregOutJo("vendorConstraintNameAutoQux"); }
    public boolean hasConditionQueryVendorConstraintNameAutoQux() { return xhasQueRlMap("vendorConstraintNameAutoQux"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, LdVendorConstraintNameAutoRefCQ> getScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(LdVendorConstraintNameAutoRefCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, LdVendorConstraintNameAutoRefCQ> getSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(LdVendorConstraintNameAutoRefCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, LdVendorConstraintNameAutoRefCQ> getQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(LdVendorConstraintNameAutoRefCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> getQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, LdVendorConstraintNameAutoRefCQ> _myselfExistsMap;
    public Map<String, LdVendorConstraintNameAutoRefCQ> getMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(LdVendorConstraintNameAutoRefCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, LdVendorConstraintNameAutoRefCQ> getMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(LdVendorConstraintNameAutoRefCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return LdVendorConstraintNameAutoRefCB.class.getName(); }
    protected String xCQ() { return LdVendorConstraintNameAutoRefCQ.class.getName(); }
    protected String xCHp() { return HpCalculator.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
