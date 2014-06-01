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
 * The base condition-query of PUBLISHER.
 * @author DBFlute(AutoGenerator)
 */
public class LdBsPublisherCQ extends LdAbstractBsPublisherCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected LdPublisherCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public LdBsPublisherCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from PUBLISHER) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public LdPublisherCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected LdPublisherCIQ xcreateCIQ() {
        LdPublisherCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected LdPublisherCIQ xnewCIQ() {
        return new LdPublisherCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join PUBLISHER on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public LdPublisherCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        LdPublisherCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _publisherId;
    public ConditionValue getPublisherId() {
        if (_publisherId == null) { _publisherId = nCV(); }
        return _publisherId;
    }
    protected ConditionValue getCValuePublisherId() { return getPublisherId(); }

    protected Map<String, LdBookCQ> _publisherId_ExistsReferrer_BookListMap;
    public Map<String, LdBookCQ> getPublisherId_ExistsReferrer_BookList() { return _publisherId_ExistsReferrer_BookListMap; }
    public String keepPublisherId_ExistsReferrer_BookList(LdBookCQ sq) {
        if (_publisherId_ExistsReferrer_BookListMap == null) { _publisherId_ExistsReferrer_BookListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_publisherId_ExistsReferrer_BookListMap.size() + 1);
        _publisherId_ExistsReferrer_BookListMap.put(ky, sq); return "publisherId_ExistsReferrer_BookList." + ky;
    }

    protected Map<String, LdBookCQ> _publisherId_NotExistsReferrer_BookListMap;
    public Map<String, LdBookCQ> getPublisherId_NotExistsReferrer_BookList() { return _publisherId_NotExistsReferrer_BookListMap; }
    public String keepPublisherId_NotExistsReferrer_BookList(LdBookCQ sq) {
        if (_publisherId_NotExistsReferrer_BookListMap == null) { _publisherId_NotExistsReferrer_BookListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_publisherId_NotExistsReferrer_BookListMap.size() + 1);
        _publisherId_NotExistsReferrer_BookListMap.put(ky, sq); return "publisherId_NotExistsReferrer_BookList." + ky;
    }

    protected Map<String, LdBookCQ> _publisherId_SpecifyDerivedReferrer_BookListMap;
    public Map<String, LdBookCQ> getPublisherId_SpecifyDerivedReferrer_BookList() { return _publisherId_SpecifyDerivedReferrer_BookListMap; }
    public String keepPublisherId_SpecifyDerivedReferrer_BookList(LdBookCQ sq) {
        if (_publisherId_SpecifyDerivedReferrer_BookListMap == null) { _publisherId_SpecifyDerivedReferrer_BookListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_publisherId_SpecifyDerivedReferrer_BookListMap.size() + 1);
        _publisherId_SpecifyDerivedReferrer_BookListMap.put(ky, sq); return "publisherId_SpecifyDerivedReferrer_BookList." + ky;
    }

    protected Map<String, LdBookCQ> _publisherId_InScopeRelation_BookListMap;
    public Map<String, LdBookCQ> getPublisherId_InScopeRelation_BookList() { return _publisherId_InScopeRelation_BookListMap; }
    public String keepPublisherId_InScopeRelation_BookList(LdBookCQ sq) {
        if (_publisherId_InScopeRelation_BookListMap == null) { _publisherId_InScopeRelation_BookListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_publisherId_InScopeRelation_BookListMap.size() + 1);
        _publisherId_InScopeRelation_BookListMap.put(ky, sq); return "publisherId_InScopeRelation_BookList." + ky;
    }

    protected Map<String, LdBookCQ> _publisherId_NotInScopeRelation_BookListMap;
    public Map<String, LdBookCQ> getPublisherId_NotInScopeRelation_BookList() { return _publisherId_NotInScopeRelation_BookListMap; }
    public String keepPublisherId_NotInScopeRelation_BookList(LdBookCQ sq) {
        if (_publisherId_NotInScopeRelation_BookListMap == null) { _publisherId_NotInScopeRelation_BookListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_publisherId_NotInScopeRelation_BookListMap.size() + 1);
        _publisherId_NotInScopeRelation_BookListMap.put(ky, sq); return "publisherId_NotInScopeRelation_BookList." + ky;
    }

    protected Map<String, LdBookCQ> _publisherId_QueryDerivedReferrer_BookListMap;
    public Map<String, LdBookCQ> getPublisherId_QueryDerivedReferrer_BookList() { return _publisherId_QueryDerivedReferrer_BookListMap; }
    public String keepPublisherId_QueryDerivedReferrer_BookList(LdBookCQ sq) {
        if (_publisherId_QueryDerivedReferrer_BookListMap == null) { _publisherId_QueryDerivedReferrer_BookListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_publisherId_QueryDerivedReferrer_BookListMap.size() + 1);
        _publisherId_QueryDerivedReferrer_BookListMap.put(ky, sq); return "publisherId_QueryDerivedReferrer_BookList." + ky;
    }
    protected Map<String, Object> _publisherId_QueryDerivedReferrer_BookListParameterMap;
    public Map<String, Object> getPublisherId_QueryDerivedReferrer_BookListParameter() { return _publisherId_QueryDerivedReferrer_BookListParameterMap; }
    public String keepPublisherId_QueryDerivedReferrer_BookListParameter(Object vl) {
        if (_publisherId_QueryDerivedReferrer_BookListParameterMap == null) { _publisherId_QueryDerivedReferrer_BookListParameterMap = newLinkedHashMapSized(4); }
        String ky = "subQueryParameterKey" + (_publisherId_QueryDerivedReferrer_BookListParameterMap.size() + 1);
        _publisherId_QueryDerivedReferrer_BookListParameterMap.put(ky, vl); return "publisherId_QueryDerivedReferrer_BookListParameter." + ky;
    }

    /** 
     * Add order-by as ascend. <br />
     * PUBLISHER_ID: {PK, ID, NotNull, INTEGER(10)}
     * @return this. (NotNull)
     */
    public LdBsPublisherCQ addOrderBy_PublisherId_Asc() { regOBA("PUBLISHER_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * PUBLISHER_ID: {PK, ID, NotNull, INTEGER(10)}
     * @return this. (NotNull)
     */
    public LdBsPublisherCQ addOrderBy_PublisherId_Desc() { regOBD("PUBLISHER_ID"); return this; }

    protected ConditionValue _publisherName;
    public ConditionValue getPublisherName() {
        if (_publisherName == null) { _publisherName = nCV(); }
        return _publisherName;
    }
    protected ConditionValue getCValuePublisherName() { return getPublisherName(); }

    /** 
     * Add order-by as ascend. <br />
     * PUBLISHER_NAME: {NotNull, VARCHAR(80)}
     * @return this. (NotNull)
     */
    public LdBsPublisherCQ addOrderBy_PublisherName_Asc() { regOBA("PUBLISHER_NAME"); return this; }

    /**
     * Add order-by as descend. <br />
     * PUBLISHER_NAME: {NotNull, VARCHAR(80)}
     * @return this. (NotNull)
     */
    public LdBsPublisherCQ addOrderBy_PublisherName_Desc() { regOBD("PUBLISHER_NAME"); return this; }

    protected ConditionValue _rUser;
    public ConditionValue getRUser() {
        if (_rUser == null) { _rUser = nCV(); }
        return _rUser;
    }
    protected ConditionValue getCValueRUser() { return getRUser(); }

    /** 
     * Add order-by as ascend. <br />
     * R_USER: {NotNull, VARCHAR(100), default=[default-user]}
     * @return this. (NotNull)
     */
    public LdBsPublisherCQ addOrderBy_RUser_Asc() { regOBA("R_USER"); return this; }

    /**
     * Add order-by as descend. <br />
     * R_USER: {NotNull, VARCHAR(100), default=[default-user]}
     * @return this. (NotNull)
     */
    public LdBsPublisherCQ addOrderBy_RUser_Desc() { regOBD("R_USER"); return this; }

    protected ConditionValue _rModule;
    public ConditionValue getRModule() {
        if (_rModule == null) { _rModule = nCV(); }
        return _rModule;
    }
    protected ConditionValue getCValueRModule() { return getRModule(); }

    /** 
     * Add order-by as ascend. <br />
     * R_MODULE: {NotNull, VARCHAR(100), default=[default-module]}
     * @return this. (NotNull)
     */
    public LdBsPublisherCQ addOrderBy_RModule_Asc() { regOBA("R_MODULE"); return this; }

    /**
     * Add order-by as descend. <br />
     * R_MODULE: {NotNull, VARCHAR(100), default=[default-module]}
     * @return this. (NotNull)
     */
    public LdBsPublisherCQ addOrderBy_RModule_Desc() { regOBD("R_MODULE"); return this; }

    protected ConditionValue _rTimestamp;
    public ConditionValue getRTimestamp() {
        if (_rTimestamp == null) { _rTimestamp = nCV(); }
        return _rTimestamp;
    }
    protected ConditionValue getCValueRTimestamp() { return getRTimestamp(); }

    /** 
     * Add order-by as ascend. <br />
     * R_TIMESTAMP: {NotNull, TIMESTAMP(26, 6), default=[CURRENT_TIMESTAMP]}
     * @return this. (NotNull)
     */
    public LdBsPublisherCQ addOrderBy_RTimestamp_Asc() { regOBA("R_TIMESTAMP"); return this; }

    /**
     * Add order-by as descend. <br />
     * R_TIMESTAMP: {NotNull, TIMESTAMP(26, 6), default=[CURRENT_TIMESTAMP]}
     * @return this. (NotNull)
     */
    public LdBsPublisherCQ addOrderBy_RTimestamp_Desc() { regOBD("R_TIMESTAMP"); return this; }

    protected ConditionValue _uUser;
    public ConditionValue getUUser() {
        if (_uUser == null) { _uUser = nCV(); }
        return _uUser;
    }
    protected ConditionValue getCValueUUser() { return getUUser(); }

    /** 
     * Add order-by as ascend. <br />
     * U_USER: {NotNull, VARCHAR(100), default=[default-user]}
     * @return this. (NotNull)
     */
    public LdBsPublisherCQ addOrderBy_UUser_Asc() { regOBA("U_USER"); return this; }

    /**
     * Add order-by as descend. <br />
     * U_USER: {NotNull, VARCHAR(100), default=[default-user]}
     * @return this. (NotNull)
     */
    public LdBsPublisherCQ addOrderBy_UUser_Desc() { regOBD("U_USER"); return this; }

    protected ConditionValue _uModule;
    public ConditionValue getUModule() {
        if (_uModule == null) { _uModule = nCV(); }
        return _uModule;
    }
    protected ConditionValue getCValueUModule() { return getUModule(); }

    /** 
     * Add order-by as ascend. <br />
     * U_MODULE: {NotNull, VARCHAR(100), default=[default-module]}
     * @return this. (NotNull)
     */
    public LdBsPublisherCQ addOrderBy_UModule_Asc() { regOBA("U_MODULE"); return this; }

    /**
     * Add order-by as descend. <br />
     * U_MODULE: {NotNull, VARCHAR(100), default=[default-module]}
     * @return this. (NotNull)
     */
    public LdBsPublisherCQ addOrderBy_UModule_Desc() { regOBD("U_MODULE"); return this; }

    protected ConditionValue _uTimestamp;
    public ConditionValue getUTimestamp() {
        if (_uTimestamp == null) { _uTimestamp = nCV(); }
        return _uTimestamp;
    }
    protected ConditionValue getCValueUTimestamp() { return getUTimestamp(); }

    /** 
     * Add order-by as ascend. <br />
     * U_TIMESTAMP: {NotNull, TIMESTAMP(26, 6), default=[CURRENT_TIMESTAMP]}
     * @return this. (NotNull)
     */
    public LdBsPublisherCQ addOrderBy_UTimestamp_Asc() { regOBA("U_TIMESTAMP"); return this; }

    /**
     * Add order-by as descend. <br />
     * U_TIMESTAMP: {NotNull, TIMESTAMP(26, 6), default=[CURRENT_TIMESTAMP]}
     * @return this. (NotNull)
     */
    public LdBsPublisherCQ addOrderBy_UTimestamp_Desc() { regOBD("U_TIMESTAMP"); return this; }

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
    public LdBsPublisherCQ addSpecifiedDerivedOrderBy_Asc(String aliasName)
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
    public LdBsPublisherCQ addSpecifiedDerivedOrderBy_Desc(String aliasName)
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
    protected Map<String, LdPublisherCQ> _scalarConditionMap;
    public Map<String, LdPublisherCQ> getScalarCondition() { return _scalarConditionMap; }
    public String keepScalarCondition(LdPublisherCQ sq) {
        if (_scalarConditionMap == null) { _scalarConditionMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_scalarConditionMap.size() + 1);
        _scalarConditionMap.put(ky, sq); return "scalarCondition." + ky;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    protected Map<String, LdPublisherCQ> _specifyMyselfDerivedMap;
    public Map<String, LdPublisherCQ> getSpecifyMyselfDerived() { return _specifyMyselfDerivedMap; }
    public String keepSpecifyMyselfDerived(LdPublisherCQ sq) {
        if (_specifyMyselfDerivedMap == null) { _specifyMyselfDerivedMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_specifyMyselfDerivedMap.size() + 1);
        _specifyMyselfDerivedMap.put(ky, sq); return "specifyMyselfDerived." + ky;
    }

    protected Map<String, LdPublisherCQ> _queryMyselfDerivedMap;
    public Map<String, LdPublisherCQ> getQueryMyselfDerived() { return _queryMyselfDerivedMap; }
    public String keepQueryMyselfDerived(LdPublisherCQ sq) {
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
    protected Map<String, LdPublisherCQ> _myselfExistsMap;
    public Map<String, LdPublisherCQ> getMyselfExists() { return _myselfExistsMap; }
    public String keepMyselfExists(LdPublisherCQ sq) {
        if (_myselfExistsMap == null) { _myselfExistsMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_myselfExistsMap.size() + 1);
        _myselfExistsMap.put(ky, sq); return "myselfExists." + ky;
    }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    protected Map<String, LdPublisherCQ> _myselfInScopeMap;
    public Map<String, LdPublisherCQ> getMyselfInScope() { return _myselfInScopeMap; }
    public String keepMyselfInScope(LdPublisherCQ sq) {
        if (_myselfInScopeMap == null) { _myselfInScopeMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_myselfInScopeMap.size() + 1);
        _myselfInScopeMap.put(ky, sq); return "myselfInScope." + ky;
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return LdPublisherCB.class.getName(); }
    protected String xCQ() { return LdPublisherCQ.class.getName(); }
    protected String xCHp() { return HpCalculator.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
