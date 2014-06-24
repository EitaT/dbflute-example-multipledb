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
 * The base condition-query of COLLECTION_STATUS_LOOKUP.
 * @author DBFlute(AutoGenerator)
 */
public class LdBsCollectionStatusLookupCQ extends LdAbstractBsCollectionStatusLookupCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected LdCollectionStatusLookupCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public LdBsCollectionStatusLookupCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from COLLECTION_STATUS_LOOKUP) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public LdCollectionStatusLookupCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected LdCollectionStatusLookupCIQ xcreateCIQ() {
        LdCollectionStatusLookupCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected LdCollectionStatusLookupCIQ xnewCIQ() {
        return new LdCollectionStatusLookupCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join COLLECTION_STATUS_LOOKUP on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public LdCollectionStatusLookupCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        LdCollectionStatusLookupCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _collectionStatusCode;
    public ConditionValue getCollectionStatusCode()
    { if (_collectionStatusCode == null) { _collectionStatusCode = nCV(); }
      return _collectionStatusCode; }
    protected ConditionValue getCValueCollectionStatusCode() { return getCollectionStatusCode(); }

    public Map<String, LdCollectionStatusCQ> getCollectionStatusCode_ExistsReferrer_CollectionStatusList() { return xgetSQueMap("collectionStatusCode_ExistsReferrer_CollectionStatusList"); }
    public String keepCollectionStatusCode_ExistsReferrer_CollectionStatusList(LdCollectionStatusCQ sq) { return xkeepSQue("collectionStatusCode_ExistsReferrer_CollectionStatusList", sq); }

    public Map<String, LdCollectionStatusCQ> getCollectionStatusCode_NotExistsReferrer_CollectionStatusList() { return xgetSQueMap("collectionStatusCode_NotExistsReferrer_CollectionStatusList"); }
    public String keepCollectionStatusCode_NotExistsReferrer_CollectionStatusList(LdCollectionStatusCQ sq) { return xkeepSQue("collectionStatusCode_NotExistsReferrer_CollectionStatusList", sq); }

    public Map<String, LdCollectionStatusCQ> getCollectionStatusCode_InScopeRelation_CollectionStatusList() { return xgetSQueMap("collectionStatusCode_InScopeRelation_CollectionStatusList"); }
    public String keepCollectionStatusCode_InScopeRelation_CollectionStatusList(LdCollectionStatusCQ sq) { return xkeepSQue("collectionStatusCode_InScopeRelation_CollectionStatusList", sq); }

    public Map<String, LdCollectionStatusCQ> getCollectionStatusCode_NotInScopeRelation_CollectionStatusList() { return xgetSQueMap("collectionStatusCode_NotInScopeRelation_CollectionStatusList"); }
    public String keepCollectionStatusCode_NotInScopeRelation_CollectionStatusList(LdCollectionStatusCQ sq) { return xkeepSQue("collectionStatusCode_NotInScopeRelation_CollectionStatusList", sq); }

    public Map<String, LdCollectionStatusCQ> getCollectionStatusCode_SpecifyDerivedReferrer_CollectionStatusList() { return xgetSQueMap("collectionStatusCode_SpecifyDerivedReferrer_CollectionStatusList"); }
    public String keepCollectionStatusCode_SpecifyDerivedReferrer_CollectionStatusList(LdCollectionStatusCQ sq) { return xkeepSQue("collectionStatusCode_SpecifyDerivedReferrer_CollectionStatusList", sq); }

    public Map<String, LdCollectionStatusCQ> getCollectionStatusCode_QueryDerivedReferrer_CollectionStatusList() { return xgetSQueMap("collectionStatusCode_QueryDerivedReferrer_CollectionStatusList"); }
    public String keepCollectionStatusCode_QueryDerivedReferrer_CollectionStatusList(LdCollectionStatusCQ sq) { return xkeepSQue("collectionStatusCode_QueryDerivedReferrer_CollectionStatusList", sq); }
    public Map<String, Object> getCollectionStatusCode_QueryDerivedReferrer_CollectionStatusListParameter() { return xgetSQuePmMap("collectionStatusCode_QueryDerivedReferrer_CollectionStatusList"); }
    public String keepCollectionStatusCode_QueryDerivedReferrer_CollectionStatusListParameter(Object pm) { return xkeepSQuePm("collectionStatusCode_QueryDerivedReferrer_CollectionStatusList", pm); }

    /** 
     * Add order-by as ascend. <br />
     * COLLECTION_STATUS_CODE: {PK, NotNull, CHAR(3), classification=CollectionStatus}
     * @return this. (NotNull)
     */
    public LdBsCollectionStatusLookupCQ addOrderBy_CollectionStatusCode_Asc() { regOBA("COLLECTION_STATUS_CODE"); return this; }

    /**
     * Add order-by as descend. <br />
     * COLLECTION_STATUS_CODE: {PK, NotNull, CHAR(3), classification=CollectionStatus}
     * @return this. (NotNull)
     */
    public LdBsCollectionStatusLookupCQ addOrderBy_CollectionStatusCode_Desc() { regOBD("COLLECTION_STATUS_CODE"); return this; }

    protected ConditionValue _collectionStatusName;
    public ConditionValue getCollectionStatusName()
    { if (_collectionStatusName == null) { _collectionStatusName = nCV(); }
      return _collectionStatusName; }
    protected ConditionValue getCValueCollectionStatusName() { return getCollectionStatusName(); }

    /** 
     * Add order-by as ascend. <br />
     * COLLECTION_STATUS_NAME: {NotNull, VARCHAR(80)}
     * @return this. (NotNull)
     */
    public LdBsCollectionStatusLookupCQ addOrderBy_CollectionStatusName_Asc() { regOBA("COLLECTION_STATUS_NAME"); return this; }

    /**
     * Add order-by as descend. <br />
     * COLLECTION_STATUS_NAME: {NotNull, VARCHAR(80)}
     * @return this. (NotNull)
     */
    public LdBsCollectionStatusLookupCQ addOrderBy_CollectionStatusName_Desc() { regOBD("COLLECTION_STATUS_NAME"); return this; }

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
    public LdBsCollectionStatusLookupCQ addOrderBy_RUser_Asc() { regOBA("R_USER"); return this; }

    /**
     * Add order-by as descend. <br />
     * R_USER: {NotNull, VARCHAR(100), default=[default-user]}
     * @return this. (NotNull)
     */
    public LdBsCollectionStatusLookupCQ addOrderBy_RUser_Desc() { regOBD("R_USER"); return this; }

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
    public LdBsCollectionStatusLookupCQ addOrderBy_RModule_Asc() { regOBA("R_MODULE"); return this; }

    /**
     * Add order-by as descend. <br />
     * R_MODULE: {NotNull, VARCHAR(100), default=[default-module]}
     * @return this. (NotNull)
     */
    public LdBsCollectionStatusLookupCQ addOrderBy_RModule_Desc() { regOBD("R_MODULE"); return this; }

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
    public LdBsCollectionStatusLookupCQ addOrderBy_RTimestamp_Asc() { regOBA("R_TIMESTAMP"); return this; }

    /**
     * Add order-by as descend. <br />
     * R_TIMESTAMP: {NotNull, TIMESTAMP(26, 6), default=[CURRENT_TIMESTAMP]}
     * @return this. (NotNull)
     */
    public LdBsCollectionStatusLookupCQ addOrderBy_RTimestamp_Desc() { regOBD("R_TIMESTAMP"); return this; }

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
    public LdBsCollectionStatusLookupCQ addOrderBy_UUser_Asc() { regOBA("U_USER"); return this; }

    /**
     * Add order-by as descend. <br />
     * U_USER: {NotNull, VARCHAR(100), default=[default-user]}
     * @return this. (NotNull)
     */
    public LdBsCollectionStatusLookupCQ addOrderBy_UUser_Desc() { regOBD("U_USER"); return this; }

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
    public LdBsCollectionStatusLookupCQ addOrderBy_UModule_Asc() { regOBA("U_MODULE"); return this; }

    /**
     * Add order-by as descend. <br />
     * U_MODULE: {NotNull, VARCHAR(100), default=[default-module]}
     * @return this. (NotNull)
     */
    public LdBsCollectionStatusLookupCQ addOrderBy_UModule_Desc() { regOBD("U_MODULE"); return this; }

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
    public LdBsCollectionStatusLookupCQ addOrderBy_UTimestamp_Asc() { regOBA("U_TIMESTAMP"); return this; }

    /**
     * Add order-by as descend. <br />
     * U_TIMESTAMP: {NotNull, TIMESTAMP(26, 6), default=[CURRENT_TIMESTAMP]}
     * @return this. (NotNull)
     */
    public LdBsCollectionStatusLookupCQ addOrderBy_UTimestamp_Desc() { regOBD("U_TIMESTAMP"); return this; }

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
    public LdBsCollectionStatusLookupCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public LdBsCollectionStatusLookupCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, LdCollectionStatusLookupCQ> getScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(LdCollectionStatusLookupCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, LdCollectionStatusLookupCQ> getSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(LdCollectionStatusLookupCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, LdCollectionStatusLookupCQ> getQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(LdCollectionStatusLookupCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> getQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, LdCollectionStatusLookupCQ> _myselfExistsMap;
    public Map<String, LdCollectionStatusLookupCQ> getMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(LdCollectionStatusLookupCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, LdCollectionStatusLookupCQ> getMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(LdCollectionStatusLookupCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return LdCollectionStatusLookupCB.class.getName(); }
    protected String xCQ() { return LdCollectionStatusLookupCQ.class.getName(); }
    protected String xCHp() { return HpCalculator.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
