/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */package com.example.dbflute.multipledb.seasar.dbflute.librarydb.cbean.cq.bs;

import java.util.Map;

import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.cbean.chelper.*;
import org.seasar.dbflute.cbean.coption.*;
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
    public LdBsAuthorCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from AUTHOR) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">inline()</span>.setFoo...;
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
     * cb.query().queryMemberStatus().<span style="color: #DD4747">on()</span>.setFoo...;
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
    public ConditionValue getAuthorId()
    { if (_authorId == null) { _authorId = nCV(); }
      return _authorId; }
    protected ConditionValue getCValueAuthorId() { return getAuthorId(); }

    public Map<String, LdBookCQ> getAuthorId_ExistsReferrer_BookList() { return xgetSQueMap("authorId_ExistsReferrer_BookList"); }
    public String keepAuthorId_ExistsReferrer_BookList(LdBookCQ sq) { return xkeepSQue("authorId_ExistsReferrer_BookList", sq); }

    public Map<String, LdBookCQ> getAuthorId_NotExistsReferrer_BookList() { return xgetSQueMap("authorId_NotExistsReferrer_BookList"); }
    public String keepAuthorId_NotExistsReferrer_BookList(LdBookCQ sq) { return xkeepSQue("authorId_NotExistsReferrer_BookList", sq); }

    public Map<String, LdBookCQ> getAuthorId_SpecifyDerivedReferrer_BookList() { return xgetSQueMap("authorId_SpecifyDerivedReferrer_BookList"); }
    public String keepAuthorId_SpecifyDerivedReferrer_BookList(LdBookCQ sq) { return xkeepSQue("authorId_SpecifyDerivedReferrer_BookList", sq); }

    public Map<String, LdBookCQ> getAuthorId_InScopeRelation_BookList() { return xgetSQueMap("authorId_InScopeRelation_BookList"); }
    public String keepAuthorId_InScopeRelation_BookList(LdBookCQ sq) { return xkeepSQue("authorId_InScopeRelation_BookList", sq); }

    public Map<String, LdBookCQ> getAuthorId_NotInScopeRelation_BookList() { return xgetSQueMap("authorId_NotInScopeRelation_BookList"); }
    public String keepAuthorId_NotInScopeRelation_BookList(LdBookCQ sq) { return xkeepSQue("authorId_NotInScopeRelation_BookList", sq); }

    public Map<String, LdBookCQ> getAuthorId_QueryDerivedReferrer_BookList() { return xgetSQueMap("authorId_QueryDerivedReferrer_BookList"); }
    public String keepAuthorId_QueryDerivedReferrer_BookList(LdBookCQ sq) { return xkeepSQue("authorId_QueryDerivedReferrer_BookList", sq); }
    public Map<String, Object> getAuthorId_QueryDerivedReferrer_BookListParameter() { return xgetSQuePmMap("authorId_QueryDerivedReferrer_BookList"); }
    public String keepAuthorId_QueryDerivedReferrer_BookListParameter(Object pm) { return xkeepSQuePm("authorId_QueryDerivedReferrer_BookList", pm); }

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
    public ConditionValue getAuthorName()
    { if (_authorName == null) { _authorName = nCV(); }
      return _authorName; }
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
    public ConditionValue getAuthorAge()
    { if (_authorAge == null) { _authorAge = nCV(); }
      return _authorAge; }
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
    public ConditionValue getRUser()
    { if (_rUser == null) { _rUser = nCV(); }
      return _rUser; }
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
    public ConditionValue getRModule()
    { if (_rModule == null) { _rModule = nCV(); }
      return _rModule; }
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
    public ConditionValue getRTimestamp()
    { if (_rTimestamp == null) { _rTimestamp = nCV(); }
      return _rTimestamp; }
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
    public ConditionValue getUUser()
    { if (_uUser == null) { _uUser = nCV(); }
      return _uUser; }
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
    public ConditionValue getUModule()
    { if (_uModule == null) { _uModule = nCV(); }
      return _uModule; }
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
    public ConditionValue getUTimestamp()
    { if (_uTimestamp == null) { _uTimestamp = nCV(); }
      return _uTimestamp; }
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
     * }, <span style="color: #DD4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] asc</span>
     * cb.<span style="color: #DD4747">addSpecifiedDerivedOrderBy_Asc</span>(<span style="color: #DD4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public LdBsAuthorCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public LdBsAuthorCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, LdAuthorCQ> getScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(LdAuthorCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, LdAuthorCQ> getSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(LdAuthorCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, LdAuthorCQ> getQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(LdAuthorCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> getQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, LdAuthorCQ> _myselfExistsMap;
    public Map<String, LdAuthorCQ> getMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(LdAuthorCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, LdAuthorCQ> getMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(LdAuthorCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return LdAuthorCB.class.getName(); }
    protected String xCQ() { return LdAuthorCQ.class.getName(); }
    protected String xCHp() { return HpCalculator.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
