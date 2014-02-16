/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */package com.example.dbflute.multipledb.seasar.dbflute.librarydb.cbean.cq.bs;

import java.util.Map;

import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import org.seasar.dbflute.exception.IllegalConditionBeanOperationException;
import com.example.dbflute.multipledb.seasar.dbflute.librarydb.cbean.cq.ciq.*;
import com.example.dbflute.multipledb.seasar.dbflute.librarydb.cbean.*;
import com.example.dbflute.multipledb.seasar.dbflute.librarydb.cbean.cq.*;

/**
 * The base condition-query of AUTHOR.
 * @author DBFlute(AutoGenerator)
 */
public class LdBsAuthorCQ extends LdAbstractBsAuthorCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected LdAuthorCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public LdBsAuthorCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from AUTHOR) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public LdAuthorCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected LdAuthorCIQ xcreateCIQ() {
        LdAuthorCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected LdAuthorCIQ xnewCIQ() {
        return new LdAuthorCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join AUTHOR on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public LdAuthorCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        LdAuthorCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected ConditionValue _authorId;
    public ConditionValue getAuthorId() {
        if (_authorId == null) { _authorId = nCV(); }
        return _authorId;
    }
    protected ConditionValue getCValueAuthorId() { return getAuthorId(); }

    protected Map<String, LdBookCQ> _authorId_ExistsReferrer_BookListMap;
    public Map<String, LdBookCQ> getAuthorId_ExistsReferrer_BookList() { return _authorId_ExistsReferrer_BookListMap; }
    public String keepAuthorId_ExistsReferrer_BookList(LdBookCQ sq) {
        if (_authorId_ExistsReferrer_BookListMap == null) { _authorId_ExistsReferrer_BookListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_authorId_ExistsReferrer_BookListMap.size() + 1);
        _authorId_ExistsReferrer_BookListMap.put(ky, sq); return "authorId_ExistsReferrer_BookList." + ky;
    }

    protected Map<String, LdBookCQ> _authorId_NotExistsReferrer_BookListMap;
    public Map<String, LdBookCQ> getAuthorId_NotExistsReferrer_BookList() { return _authorId_NotExistsReferrer_BookListMap; }
    public String keepAuthorId_NotExistsReferrer_BookList(LdBookCQ sq) {
        if (_authorId_NotExistsReferrer_BookListMap == null) { _authorId_NotExistsReferrer_BookListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_authorId_NotExistsReferrer_BookListMap.size() + 1);
        _authorId_NotExistsReferrer_BookListMap.put(ky, sq); return "authorId_NotExistsReferrer_BookList." + ky;
    }

    protected Map<String, LdBookCQ> _authorId_SpecifyDerivedReferrer_BookListMap;
    public Map<String, LdBookCQ> getAuthorId_SpecifyDerivedReferrer_BookList() { return _authorId_SpecifyDerivedReferrer_BookListMap; }
    public String keepAuthorId_SpecifyDerivedReferrer_BookList(LdBookCQ sq) {
        if (_authorId_SpecifyDerivedReferrer_BookListMap == null) { _authorId_SpecifyDerivedReferrer_BookListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_authorId_SpecifyDerivedReferrer_BookListMap.size() + 1);
        _authorId_SpecifyDerivedReferrer_BookListMap.put(ky, sq); return "authorId_SpecifyDerivedReferrer_BookList." + ky;
    }

    protected Map<String, LdBookCQ> _authorId_InScopeRelation_BookListMap;
    public Map<String, LdBookCQ> getAuthorId_InScopeRelation_BookList() { return _authorId_InScopeRelation_BookListMap; }
    public String keepAuthorId_InScopeRelation_BookList(LdBookCQ sq) {
        if (_authorId_InScopeRelation_BookListMap == null) { _authorId_InScopeRelation_BookListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_authorId_InScopeRelation_BookListMap.size() + 1);
        _authorId_InScopeRelation_BookListMap.put(ky, sq); return "authorId_InScopeRelation_BookList." + ky;
    }

    protected Map<String, LdBookCQ> _authorId_NotInScopeRelation_BookListMap;
    public Map<String, LdBookCQ> getAuthorId_NotInScopeRelation_BookList() { return _authorId_NotInScopeRelation_BookListMap; }
    public String keepAuthorId_NotInScopeRelation_BookList(LdBookCQ sq) {
        if (_authorId_NotInScopeRelation_BookListMap == null) { _authorId_NotInScopeRelation_BookListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_authorId_NotInScopeRelation_BookListMap.size() + 1);
        _authorId_NotInScopeRelation_BookListMap.put(ky, sq); return "authorId_NotInScopeRelation_BookList." + ky;
    }

    protected Map<String, LdBookCQ> _authorId_QueryDerivedReferrer_BookListMap;
    public Map<String, LdBookCQ> getAuthorId_QueryDerivedReferrer_BookList() { return _authorId_QueryDerivedReferrer_BookListMap; }
    public String keepAuthorId_QueryDerivedReferrer_BookList(LdBookCQ sq) {
        if (_authorId_QueryDerivedReferrer_BookListMap == null) { _authorId_QueryDerivedReferrer_BookListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_authorId_QueryDerivedReferrer_BookListMap.size() + 1);
        _authorId_QueryDerivedReferrer_BookListMap.put(ky, sq); return "authorId_QueryDerivedReferrer_BookList." + ky;
    }
    protected Map<String, Object> _authorId_QueryDerivedReferrer_BookListParameterMap;
    public Map<String, Object> getAuthorId_QueryDerivedReferrer_BookListParameter() { return _authorId_QueryDerivedReferrer_BookListParameterMap; }
    public String keepAuthorId_QueryDerivedReferrer_BookListParameter(Object vl) {
        if (_authorId_QueryDerivedReferrer_BookListParameterMap == null) { _authorId_QueryDerivedReferrer_BookListParameterMap = newLinkedHashMapSized(4); }
        String ky = "subQueryParameterKey" + (_authorId_QueryDerivedReferrer_BookListParameterMap.size() + 1);
        _authorId_QueryDerivedReferrer_BookListParameterMap.put(ky, vl); return "authorId_QueryDerivedReferrer_BookListParameter." + ky;
    }

    /** 
     * Add order-by as ascend. <br />
     * AUTHOR_ID: {PK, ID, NotNull, INTEGER(10)}
     * @return this. (NotNull)
     */
    public LdBsAuthorCQ addOrderBy_AuthorId_Asc() { regOBA("AUTHOR_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * AUTHOR_ID: {PK, ID, NotNull, INTEGER(10)}
     * @return this. (NotNull)
     */
    public LdBsAuthorCQ addOrderBy_AuthorId_Desc() { regOBD("AUTHOR_ID"); return this; }

    protected ConditionValue _authorName;
    public ConditionValue getAuthorName() {
        if (_authorName == null) { _authorName = nCV(); }
        return _authorName;
    }
    protected ConditionValue getCValueAuthorName() { return getAuthorName(); }

    /** 
     * Add order-by as ascend. <br />
     * AUTHOR_NAME: {NotNull, VARCHAR(80)}
     * @return this. (NotNull)
     */
    public LdBsAuthorCQ addOrderBy_AuthorName_Asc() { regOBA("AUTHOR_NAME"); return this; }

    /**
     * Add order-by as descend. <br />
     * AUTHOR_NAME: {NotNull, VARCHAR(80)}
     * @return this. (NotNull)
     */
    public LdBsAuthorCQ addOrderBy_AuthorName_Desc() { regOBD("AUTHOR_NAME"); return this; }

    protected ConditionValue _authorAge;
    public ConditionValue getAuthorAge() {
        if (_authorAge == null) { _authorAge = nCV(); }
        return _authorAge;
    }
    protected ConditionValue getCValueAuthorAge() { return getAuthorAge(); }

    /** 
     * Add order-by as ascend. <br />
     * AUTHOR_AGE: {SMALLINT(5)}
     * @return this. (NotNull)
     */
    public LdBsAuthorCQ addOrderBy_AuthorAge_Asc() { regOBA("AUTHOR_AGE"); return this; }

    /**
     * Add order-by as descend. <br />
     * AUTHOR_AGE: {SMALLINT(5)}
     * @return this. (NotNull)
     */
    public LdBsAuthorCQ addOrderBy_AuthorAge_Desc() { regOBD("AUTHOR_AGE"); return this; }

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
    public LdBsAuthorCQ addOrderBy_RUser_Asc() { regOBA("R_USER"); return this; }

    /**
     * Add order-by as descend. <br />
     * R_USER: {NotNull, VARCHAR(100), default=[default-user]}
     * @return this. (NotNull)
     */
    public LdBsAuthorCQ addOrderBy_RUser_Desc() { regOBD("R_USER"); return this; }

    protected ConditionValue _rModule;
    public ConditionValue getRModule() {
        if (_rModule == null) { _rModule = nCV(); }
        return _rModule;
    }
    protected ConditionValue getCValueRModule() { return getRModule(); }

    /** 
     * Add order-by as ascend. <br />
     * R_MODULE: {NotNull, VARCHAR(100), default=[default-module], classification=RegisterModuleType}
     * @return this. (NotNull)
     */
    public LdBsAuthorCQ addOrderBy_RModule_Asc() { regOBA("R_MODULE"); return this; }

    /**
     * Add order-by as descend. <br />
     * R_MODULE: {NotNull, VARCHAR(100), default=[default-module], classification=RegisterModuleType}
     * @return this. (NotNull)
     */
    public LdBsAuthorCQ addOrderBy_RModule_Desc() { regOBD("R_MODULE"); return this; }

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
    public LdBsAuthorCQ addOrderBy_RTimestamp_Asc() { regOBA("R_TIMESTAMP"); return this; }

    /**
     * Add order-by as descend. <br />
     * R_TIMESTAMP: {NotNull, TIMESTAMP(26, 6), default=[CURRENT_TIMESTAMP]}
     * @return this. (NotNull)
     */
    public LdBsAuthorCQ addOrderBy_RTimestamp_Desc() { regOBD("R_TIMESTAMP"); return this; }

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
    public LdBsAuthorCQ addOrderBy_UUser_Asc() { regOBA("U_USER"); return this; }

    /**
     * Add order-by as descend. <br />
     * U_USER: {NotNull, VARCHAR(100), default=[default-user]}
     * @return this. (NotNull)
     */
    public LdBsAuthorCQ addOrderBy_UUser_Desc() { regOBD("U_USER"); return this; }

    protected ConditionValue _uModule;
    public ConditionValue getUModule() {
        if (_uModule == null) { _uModule = nCV(); }
        return _uModule;
    }
    protected ConditionValue getCValueUModule() { return getUModule(); }

    /** 
     * Add order-by as ascend. <br />
     * U_MODULE: {NotNull, VARCHAR(100), default=[default-module], classification=UpdateModuleType}
     * @return this. (NotNull)
     */
    public LdBsAuthorCQ addOrderBy_UModule_Asc() { regOBA("U_MODULE"); return this; }

    /**
     * Add order-by as descend. <br />
     * U_MODULE: {NotNull, VARCHAR(100), default=[default-module], classification=UpdateModuleType}
     * @return this. (NotNull)
     */
    public LdBsAuthorCQ addOrderBy_UModule_Desc() { regOBD("U_MODULE"); return this; }

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
    public LdBsAuthorCQ addOrderBy_UTimestamp_Asc() { regOBA("U_TIMESTAMP"); return this; }

    /**
     * Add order-by as descend. <br />
     * U_TIMESTAMP: {NotNull, TIMESTAMP(26, 6), default=[CURRENT_TIMESTAMP]}
     * @return this. (NotNull)
     */
    public LdBsAuthorCQ addOrderBy_UTimestamp_Desc() { regOBD("U_TIMESTAMP"); return this; }

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
    public LdBsAuthorCQ addSpecifiedDerivedOrderBy_Asc(String aliasName)
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
    public LdBsAuthorCQ addSpecifiedDerivedOrderBy_Desc(String aliasName)
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
    protected Map<String, LdAuthorCQ> _scalarConditionMap;
    public Map<String, LdAuthorCQ> getScalarCondition() { return _scalarConditionMap; }
    public String keepScalarCondition(LdAuthorCQ sq) {
        if (_scalarConditionMap == null) { _scalarConditionMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_scalarConditionMap.size() + 1);
        _scalarConditionMap.put(ky, sq); return "scalarCondition." + ky;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    protected Map<String, LdAuthorCQ> _specifyMyselfDerivedMap;
    public Map<String, LdAuthorCQ> getSpecifyMyselfDerived() { return _specifyMyselfDerivedMap; }
    public String keepSpecifyMyselfDerived(LdAuthorCQ sq) {
        if (_specifyMyselfDerivedMap == null) { _specifyMyselfDerivedMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_specifyMyselfDerivedMap.size() + 1);
        _specifyMyselfDerivedMap.put(ky, sq); return "specifyMyselfDerived." + ky;
    }

    protected Map<String, LdAuthorCQ> _queryMyselfDerivedMap;
    public Map<String, LdAuthorCQ> getQueryMyselfDerived() { return _queryMyselfDerivedMap; }
    public String keepQueryMyselfDerived(LdAuthorCQ sq) {
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
    protected Map<String, LdAuthorCQ> _myselfExistsMap;
    public Map<String, LdAuthorCQ> getMyselfExists() { return _myselfExistsMap; }
    public String keepMyselfExists(LdAuthorCQ sq) {
        if (_myselfExistsMap == null) { _myselfExistsMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_myselfExistsMap.size() + 1);
        _myselfExistsMap.put(ky, sq); return "myselfExists." + ky;
    }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    protected Map<String, LdAuthorCQ> _myselfInScopeMap;
    public Map<String, LdAuthorCQ> getMyselfInScope() { return _myselfInScopeMap; }
    public String keepMyselfInScope(LdAuthorCQ sq) {
        if (_myselfInScopeMap == null) { _myselfInScopeMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_myselfInScopeMap.size() + 1);
        _myselfInScopeMap.put(ky, sq); return "myselfInScope." + ky;
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return LdAuthorCB.class.getName(); }
    protected String xCQ() { return LdAuthorCQ.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
