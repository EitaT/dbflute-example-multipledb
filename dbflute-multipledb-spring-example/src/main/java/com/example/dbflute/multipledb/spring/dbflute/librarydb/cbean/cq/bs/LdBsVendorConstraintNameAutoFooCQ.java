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
    public LdBsVendorConstraintNameAutoFooCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
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
    public ConditionValue getConstraintNameAutoFooId()
    { if (_constraintNameAutoFooId == null) { _constraintNameAutoFooId = nCV(); }
      return _constraintNameAutoFooId; }
    protected ConditionValue getCValueConstraintNameAutoFooId() { return getConstraintNameAutoFooId(); }

    public Map<String, LdVendorConstraintNameAutoRefCQ> getConstraintNameAutoFooId_ExistsReferrer_VendorConstraintNameAutoRefList() { return xgetSQueMap("constraintNameAutoFooId_ExistsReferrer_VendorConstraintNameAutoRefList"); }
    public String keepConstraintNameAutoFooId_ExistsReferrer_VendorConstraintNameAutoRefList(LdVendorConstraintNameAutoRefCQ sq) { return xkeepSQue("constraintNameAutoFooId_ExistsReferrer_VendorConstraintNameAutoRefList", sq); }

    public Map<String, LdVendorConstraintNameAutoRefCQ> getConstraintNameAutoFooId_NotExistsReferrer_VendorConstraintNameAutoRefList() { return xgetSQueMap("constraintNameAutoFooId_NotExistsReferrer_VendorConstraintNameAutoRefList"); }
    public String keepConstraintNameAutoFooId_NotExistsReferrer_VendorConstraintNameAutoRefList(LdVendorConstraintNameAutoRefCQ sq) { return xkeepSQue("constraintNameAutoFooId_NotExistsReferrer_VendorConstraintNameAutoRefList", sq); }

    public Map<String, LdVendorConstraintNameAutoRefCQ> getConstraintNameAutoFooId_SpecifyDerivedReferrer_VendorConstraintNameAutoRefList() { return xgetSQueMap("constraintNameAutoFooId_SpecifyDerivedReferrer_VendorConstraintNameAutoRefList"); }
    public String keepConstraintNameAutoFooId_SpecifyDerivedReferrer_VendorConstraintNameAutoRefList(LdVendorConstraintNameAutoRefCQ sq) { return xkeepSQue("constraintNameAutoFooId_SpecifyDerivedReferrer_VendorConstraintNameAutoRefList", sq); }

    public Map<String, LdVendorConstraintNameAutoRefCQ> getConstraintNameAutoFooId_InScopeRelation_VendorConstraintNameAutoRefList() { return xgetSQueMap("constraintNameAutoFooId_InScopeRelation_VendorConstraintNameAutoRefList"); }
    public String keepConstraintNameAutoFooId_InScopeRelation_VendorConstraintNameAutoRefList(LdVendorConstraintNameAutoRefCQ sq) { return xkeepSQue("constraintNameAutoFooId_InScopeRelation_VendorConstraintNameAutoRefList", sq); }

    public Map<String, LdVendorConstraintNameAutoRefCQ> getConstraintNameAutoFooId_NotInScopeRelation_VendorConstraintNameAutoRefList() { return xgetSQueMap("constraintNameAutoFooId_NotInScopeRelation_VendorConstraintNameAutoRefList"); }
    public String keepConstraintNameAutoFooId_NotInScopeRelation_VendorConstraintNameAutoRefList(LdVendorConstraintNameAutoRefCQ sq) { return xkeepSQue("constraintNameAutoFooId_NotInScopeRelation_VendorConstraintNameAutoRefList", sq); }

    public Map<String, LdVendorConstraintNameAutoRefCQ> getConstraintNameAutoFooId_QueryDerivedReferrer_VendorConstraintNameAutoRefList() { return xgetSQueMap("constraintNameAutoFooId_QueryDerivedReferrer_VendorConstraintNameAutoRefList"); }
    public String keepConstraintNameAutoFooId_QueryDerivedReferrer_VendorConstraintNameAutoRefList(LdVendorConstraintNameAutoRefCQ sq) { return xkeepSQue("constraintNameAutoFooId_QueryDerivedReferrer_VendorConstraintNameAutoRefList", sq); }
    public Map<String, Object> getConstraintNameAutoFooId_QueryDerivedReferrer_VendorConstraintNameAutoRefListParameter() { return xgetSQuePmMap("constraintNameAutoFooId_QueryDerivedReferrer_VendorConstraintNameAutoRefList"); }
    public String keepConstraintNameAutoFooId_QueryDerivedReferrer_VendorConstraintNameAutoRefListParameter(Object pm) { return xkeepSQuePm("constraintNameAutoFooId_QueryDerivedReferrer_VendorConstraintNameAutoRefList", pm); }

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
    public ConditionValue getConstraintNameAutoFooName()
    { if (_constraintNameAutoFooName == null) { _constraintNameAutoFooName = nCV(); }
      return _constraintNameAutoFooName; }
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
    public LdBsVendorConstraintNameAutoFooCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public LdBsVendorConstraintNameAutoFooCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, LdVendorConstraintNameAutoFooCQ> getScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(LdVendorConstraintNameAutoFooCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, LdVendorConstraintNameAutoFooCQ> getSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(LdVendorConstraintNameAutoFooCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, LdVendorConstraintNameAutoFooCQ> getQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(LdVendorConstraintNameAutoFooCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> getQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, LdVendorConstraintNameAutoFooCQ> _myselfExistsMap;
    public Map<String, LdVendorConstraintNameAutoFooCQ> getMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(LdVendorConstraintNameAutoFooCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, LdVendorConstraintNameAutoFooCQ> getMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(LdVendorConstraintNameAutoFooCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return LdVendorConstraintNameAutoFooCB.class.getName(); }
    protected String xCQ() { return LdVendorConstraintNameAutoFooCQ.class.getName(); }
    protected String xCHp() { return HpCalculator.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
