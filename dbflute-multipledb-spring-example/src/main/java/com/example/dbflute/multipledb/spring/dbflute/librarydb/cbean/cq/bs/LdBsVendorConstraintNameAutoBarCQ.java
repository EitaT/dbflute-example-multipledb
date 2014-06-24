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
    public LdBsVendorConstraintNameAutoBarCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
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
    public ConditionValue getConstraintNameAutoBarId()
    { if (_constraintNameAutoBarId == null) { _constraintNameAutoBarId = nCV(); }
      return _constraintNameAutoBarId; }
    protected ConditionValue getCValueConstraintNameAutoBarId() { return getConstraintNameAutoBarId(); }

    public Map<String, LdVendorConstraintNameAutoRefCQ> getConstraintNameAutoBarId_ExistsReferrer_VendorConstraintNameAutoRefList() { return xgetSQueMap("constraintNameAutoBarId_ExistsReferrer_VendorConstraintNameAutoRefList"); }
    public String keepConstraintNameAutoBarId_ExistsReferrer_VendorConstraintNameAutoRefList(LdVendorConstraintNameAutoRefCQ sq) { return xkeepSQue("constraintNameAutoBarId_ExistsReferrer_VendorConstraintNameAutoRefList", sq); }

    public Map<String, LdVendorConstraintNameAutoRefCQ> getConstraintNameAutoBarId_NotExistsReferrer_VendorConstraintNameAutoRefList() { return xgetSQueMap("constraintNameAutoBarId_NotExistsReferrer_VendorConstraintNameAutoRefList"); }
    public String keepConstraintNameAutoBarId_NotExistsReferrer_VendorConstraintNameAutoRefList(LdVendorConstraintNameAutoRefCQ sq) { return xkeepSQue("constraintNameAutoBarId_NotExistsReferrer_VendorConstraintNameAutoRefList", sq); }

    public Map<String, LdVendorConstraintNameAutoRefCQ> getConstraintNameAutoBarId_SpecifyDerivedReferrer_VendorConstraintNameAutoRefList() { return xgetSQueMap("constraintNameAutoBarId_SpecifyDerivedReferrer_VendorConstraintNameAutoRefList"); }
    public String keepConstraintNameAutoBarId_SpecifyDerivedReferrer_VendorConstraintNameAutoRefList(LdVendorConstraintNameAutoRefCQ sq) { return xkeepSQue("constraintNameAutoBarId_SpecifyDerivedReferrer_VendorConstraintNameAutoRefList", sq); }

    public Map<String, LdVendorConstraintNameAutoRefCQ> getConstraintNameAutoBarId_InScopeRelation_VendorConstraintNameAutoRefList() { return xgetSQueMap("constraintNameAutoBarId_InScopeRelation_VendorConstraintNameAutoRefList"); }
    public String keepConstraintNameAutoBarId_InScopeRelation_VendorConstraintNameAutoRefList(LdVendorConstraintNameAutoRefCQ sq) { return xkeepSQue("constraintNameAutoBarId_InScopeRelation_VendorConstraintNameAutoRefList", sq); }

    public Map<String, LdVendorConstraintNameAutoRefCQ> getConstraintNameAutoBarId_NotInScopeRelation_VendorConstraintNameAutoRefList() { return xgetSQueMap("constraintNameAutoBarId_NotInScopeRelation_VendorConstraintNameAutoRefList"); }
    public String keepConstraintNameAutoBarId_NotInScopeRelation_VendorConstraintNameAutoRefList(LdVendorConstraintNameAutoRefCQ sq) { return xkeepSQue("constraintNameAutoBarId_NotInScopeRelation_VendorConstraintNameAutoRefList", sq); }

    public Map<String, LdVendorConstraintNameAutoRefCQ> getConstraintNameAutoBarId_QueryDerivedReferrer_VendorConstraintNameAutoRefList() { return xgetSQueMap("constraintNameAutoBarId_QueryDerivedReferrer_VendorConstraintNameAutoRefList"); }
    public String keepConstraintNameAutoBarId_QueryDerivedReferrer_VendorConstraintNameAutoRefList(LdVendorConstraintNameAutoRefCQ sq) { return xkeepSQue("constraintNameAutoBarId_QueryDerivedReferrer_VendorConstraintNameAutoRefList", sq); }
    public Map<String, Object> getConstraintNameAutoBarId_QueryDerivedReferrer_VendorConstraintNameAutoRefListParameter() { return xgetSQuePmMap("constraintNameAutoBarId_QueryDerivedReferrer_VendorConstraintNameAutoRefList"); }
    public String keepConstraintNameAutoBarId_QueryDerivedReferrer_VendorConstraintNameAutoRefListParameter(Object pm) { return xkeepSQuePm("constraintNameAutoBarId_QueryDerivedReferrer_VendorConstraintNameAutoRefList", pm); }

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
    public ConditionValue getConstraintNameAutoBarName()
    { if (_constraintNameAutoBarName == null) { _constraintNameAutoBarName = nCV(); }
      return _constraintNameAutoBarName; }
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
    public LdBsVendorConstraintNameAutoBarCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public LdBsVendorConstraintNameAutoBarCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, LdVendorConstraintNameAutoBarCQ> getScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(LdVendorConstraintNameAutoBarCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, LdVendorConstraintNameAutoBarCQ> getSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(LdVendorConstraintNameAutoBarCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, LdVendorConstraintNameAutoBarCQ> getQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(LdVendorConstraintNameAutoBarCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> getQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, LdVendorConstraintNameAutoBarCQ> _myselfExistsMap;
    public Map<String, LdVendorConstraintNameAutoBarCQ> getMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(LdVendorConstraintNameAutoBarCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, LdVendorConstraintNameAutoBarCQ> getMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(LdVendorConstraintNameAutoBarCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return LdVendorConstraintNameAutoBarCB.class.getName(); }
    protected String xCQ() { return LdVendorConstraintNameAutoBarCQ.class.getName(); }
    protected String xCHp() { return HpCalculator.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
