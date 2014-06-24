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
 * The base condition-query of LIBRARY_TYPE_LOOKUP.
 * @author DBFlute(AutoGenerator)
 */
public class LdBsLibraryTypeLookupCQ extends LdAbstractBsLibraryTypeLookupCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected LdLibraryTypeLookupCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public LdBsLibraryTypeLookupCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from LIBRARY_TYPE_LOOKUP) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public LdLibraryTypeLookupCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected LdLibraryTypeLookupCIQ xcreateCIQ() {
        LdLibraryTypeLookupCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected LdLibraryTypeLookupCIQ xnewCIQ() {
        return new LdLibraryTypeLookupCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join LIBRARY_TYPE_LOOKUP on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public LdLibraryTypeLookupCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        LdLibraryTypeLookupCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _libraryTypeCode;
    public ConditionValue getLibraryTypeCode()
    { if (_libraryTypeCode == null) { _libraryTypeCode = nCV(); }
      return _libraryTypeCode; }
    protected ConditionValue getCValueLibraryTypeCode() { return getLibraryTypeCode(); }

    public Map<String, LdLibraryCQ> getLibraryTypeCode_ExistsReferrer_LibraryList() { return xgetSQueMap("libraryTypeCode_ExistsReferrer_LibraryList"); }
    public String keepLibraryTypeCode_ExistsReferrer_LibraryList(LdLibraryCQ sq) { return xkeepSQue("libraryTypeCode_ExistsReferrer_LibraryList", sq); }

    public Map<String, LdLibraryCQ> getLibraryTypeCode_NotExistsReferrer_LibraryList() { return xgetSQueMap("libraryTypeCode_NotExistsReferrer_LibraryList"); }
    public String keepLibraryTypeCode_NotExistsReferrer_LibraryList(LdLibraryCQ sq) { return xkeepSQue("libraryTypeCode_NotExistsReferrer_LibraryList", sq); }

    public Map<String, LdLibraryCQ> getLibraryTypeCode_InScopeRelation_LibraryList() { return xgetSQueMap("libraryTypeCode_InScopeRelation_LibraryList"); }
    public String keepLibraryTypeCode_InScopeRelation_LibraryList(LdLibraryCQ sq) { return xkeepSQue("libraryTypeCode_InScopeRelation_LibraryList", sq); }

    public Map<String, LdLibraryCQ> getLibraryTypeCode_NotInScopeRelation_LibraryList() { return xgetSQueMap("libraryTypeCode_NotInScopeRelation_LibraryList"); }
    public String keepLibraryTypeCode_NotInScopeRelation_LibraryList(LdLibraryCQ sq) { return xkeepSQue("libraryTypeCode_NotInScopeRelation_LibraryList", sq); }

    public Map<String, LdLibraryCQ> getLibraryTypeCode_SpecifyDerivedReferrer_LibraryList() { return xgetSQueMap("libraryTypeCode_SpecifyDerivedReferrer_LibraryList"); }
    public String keepLibraryTypeCode_SpecifyDerivedReferrer_LibraryList(LdLibraryCQ sq) { return xkeepSQue("libraryTypeCode_SpecifyDerivedReferrer_LibraryList", sq); }

    public Map<String, LdLibraryCQ> getLibraryTypeCode_QueryDerivedReferrer_LibraryList() { return xgetSQueMap("libraryTypeCode_QueryDerivedReferrer_LibraryList"); }
    public String keepLibraryTypeCode_QueryDerivedReferrer_LibraryList(LdLibraryCQ sq) { return xkeepSQue("libraryTypeCode_QueryDerivedReferrer_LibraryList", sq); }
    public Map<String, Object> getLibraryTypeCode_QueryDerivedReferrer_LibraryListParameter() { return xgetSQuePmMap("libraryTypeCode_QueryDerivedReferrer_LibraryList"); }
    public String keepLibraryTypeCode_QueryDerivedReferrer_LibraryListParameter(Object pm) { return xkeepSQuePm("libraryTypeCode_QueryDerivedReferrer_LibraryList", pm); }

    /** 
     * Add order-by as ascend. <br />
     * LIBRARY_TYPE_CODE: {PK, NotNull, CHAR(3)}
     * @return this. (NotNull)
     */
    public LdBsLibraryTypeLookupCQ addOrderBy_LibraryTypeCode_Asc() { regOBA("LIBRARY_TYPE_CODE"); return this; }

    /**
     * Add order-by as descend. <br />
     * LIBRARY_TYPE_CODE: {PK, NotNull, CHAR(3)}
     * @return this. (NotNull)
     */
    public LdBsLibraryTypeLookupCQ addOrderBy_LibraryTypeCode_Desc() { regOBD("LIBRARY_TYPE_CODE"); return this; }

    protected ConditionValue _libraryTypeName;
    public ConditionValue getLibraryTypeName()
    { if (_libraryTypeName == null) { _libraryTypeName = nCV(); }
      return _libraryTypeName; }
    protected ConditionValue getCValueLibraryTypeName() { return getLibraryTypeName(); }

    /** 
     * Add order-by as ascend. <br />
     * LIBRARY_TYPE_NAME: {NotNull, VARCHAR(80)}
     * @return this. (NotNull)
     */
    public LdBsLibraryTypeLookupCQ addOrderBy_LibraryTypeName_Asc() { regOBA("LIBRARY_TYPE_NAME"); return this; }

    /**
     * Add order-by as descend. <br />
     * LIBRARY_TYPE_NAME: {NotNull, VARCHAR(80)}
     * @return this. (NotNull)
     */
    public LdBsLibraryTypeLookupCQ addOrderBy_LibraryTypeName_Desc() { regOBD("LIBRARY_TYPE_NAME"); return this; }

    protected ConditionValue _rUser;
    public ConditionValue getRUser()
    { if (_rUser == null) { _rUser = nCV(); }
      return _rUser; }
    protected ConditionValue getCValueRUser() { return getRUser(); }

    /** 
     * Add order-by as ascend. <br />
     * R_USER: {NotNull, VARCHAR(100), default=[default-user]}
     * @return this. (NotNull)
     */
    public LdBsLibraryTypeLookupCQ addOrderBy_RUser_Asc() { regOBA("R_USER"); return this; }

    /**
     * Add order-by as descend. <br />
     * R_USER: {NotNull, VARCHAR(100), default=[default-user]}
     * @return this. (NotNull)
     */
    public LdBsLibraryTypeLookupCQ addOrderBy_RUser_Desc() { regOBD("R_USER"); return this; }

    protected ConditionValue _rModule;
    public ConditionValue getRModule()
    { if (_rModule == null) { _rModule = nCV(); }
      return _rModule; }
    protected ConditionValue getCValueRModule() { return getRModule(); }

    /** 
     * Add order-by as ascend. <br />
     * R_MODULE: {NotNull, VARCHAR(100), default=[default-module]}
     * @return this. (NotNull)
     */
    public LdBsLibraryTypeLookupCQ addOrderBy_RModule_Asc() { regOBA("R_MODULE"); return this; }

    /**
     * Add order-by as descend. <br />
     * R_MODULE: {NotNull, VARCHAR(100), default=[default-module]}
     * @return this. (NotNull)
     */
    public LdBsLibraryTypeLookupCQ addOrderBy_RModule_Desc() { regOBD("R_MODULE"); return this; }

    protected ConditionValue _rTimestamp;
    public ConditionValue getRTimestamp()
    { if (_rTimestamp == null) { _rTimestamp = nCV(); }
      return _rTimestamp; }
    protected ConditionValue getCValueRTimestamp() { return getRTimestamp(); }

    /** 
     * Add order-by as ascend. <br />
     * R_TIMESTAMP: {NotNull, TIMESTAMP(26, 6), default=[CURRENT_TIMESTAMP]}
     * @return this. (NotNull)
     */
    public LdBsLibraryTypeLookupCQ addOrderBy_RTimestamp_Asc() { regOBA("R_TIMESTAMP"); return this; }

    /**
     * Add order-by as descend. <br />
     * R_TIMESTAMP: {NotNull, TIMESTAMP(26, 6), default=[CURRENT_TIMESTAMP]}
     * @return this. (NotNull)
     */
    public LdBsLibraryTypeLookupCQ addOrderBy_RTimestamp_Desc() { regOBD("R_TIMESTAMP"); return this; }

    protected ConditionValue _uUser;
    public ConditionValue getUUser()
    { if (_uUser == null) { _uUser = nCV(); }
      return _uUser; }
    protected ConditionValue getCValueUUser() { return getUUser(); }

    /** 
     * Add order-by as ascend. <br />
     * U_USER: {NotNull, VARCHAR(100), default=[default-user]}
     * @return this. (NotNull)
     */
    public LdBsLibraryTypeLookupCQ addOrderBy_UUser_Asc() { regOBA("U_USER"); return this; }

    /**
     * Add order-by as descend. <br />
     * U_USER: {NotNull, VARCHAR(100), default=[default-user]}
     * @return this. (NotNull)
     */
    public LdBsLibraryTypeLookupCQ addOrderBy_UUser_Desc() { regOBD("U_USER"); return this; }

    protected ConditionValue _uModule;
    public ConditionValue getUModule()
    { if (_uModule == null) { _uModule = nCV(); }
      return _uModule; }
    protected ConditionValue getCValueUModule() { return getUModule(); }

    /** 
     * Add order-by as ascend. <br />
     * U_MODULE: {NotNull, VARCHAR(100), default=[default-module]}
     * @return this. (NotNull)
     */
    public LdBsLibraryTypeLookupCQ addOrderBy_UModule_Asc() { regOBA("U_MODULE"); return this; }

    /**
     * Add order-by as descend. <br />
     * U_MODULE: {NotNull, VARCHAR(100), default=[default-module]}
     * @return this. (NotNull)
     */
    public LdBsLibraryTypeLookupCQ addOrderBy_UModule_Desc() { regOBD("U_MODULE"); return this; }

    protected ConditionValue _uTimestamp;
    public ConditionValue getUTimestamp()
    { if (_uTimestamp == null) { _uTimestamp = nCV(); }
      return _uTimestamp; }
    protected ConditionValue getCValueUTimestamp() { return getUTimestamp(); }

    /** 
     * Add order-by as ascend. <br />
     * U_TIMESTAMP: {NotNull, TIMESTAMP(26, 6), default=[CURRENT_TIMESTAMP]}
     * @return this. (NotNull)
     */
    public LdBsLibraryTypeLookupCQ addOrderBy_UTimestamp_Asc() { regOBA("U_TIMESTAMP"); return this; }

    /**
     * Add order-by as descend. <br />
     * U_TIMESTAMP: {NotNull, TIMESTAMP(26, 6), default=[CURRENT_TIMESTAMP]}
     * @return this. (NotNull)
     */
    public LdBsLibraryTypeLookupCQ addOrderBy_UTimestamp_Desc() { regOBD("U_TIMESTAMP"); return this; }

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
    public LdBsLibraryTypeLookupCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public LdBsLibraryTypeLookupCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, LdLibraryTypeLookupCQ> getScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(LdLibraryTypeLookupCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, LdLibraryTypeLookupCQ> getSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(LdLibraryTypeLookupCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, LdLibraryTypeLookupCQ> getQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(LdLibraryTypeLookupCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> getQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, LdLibraryTypeLookupCQ> _myselfExistsMap;
    public Map<String, LdLibraryTypeLookupCQ> getMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(LdLibraryTypeLookupCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, LdLibraryTypeLookupCQ> getMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(LdLibraryTypeLookupCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return LdLibraryTypeLookupCB.class.getName(); }
    protected String xCQ() { return LdLibraryTypeLookupCQ.class.getName(); }
    protected String xCHp() { return HpCalculator.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
