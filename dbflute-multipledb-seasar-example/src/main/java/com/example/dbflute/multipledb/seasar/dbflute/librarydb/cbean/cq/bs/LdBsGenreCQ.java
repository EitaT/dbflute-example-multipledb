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
 * The base condition-query of GENRE.
 * @author DBFlute(AutoGenerator)
 */
public class LdBsGenreCQ extends LdAbstractBsGenreCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected LdGenreCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public LdBsGenreCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from GENRE) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public LdGenreCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected LdGenreCIQ xcreateCIQ() {
        LdGenreCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected LdGenreCIQ xnewCIQ() {
        return new LdGenreCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join GENRE on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public LdGenreCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        LdGenreCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _genreCode;
    public ConditionValue getGenreCode()
    { if (_genreCode == null) { _genreCode = nCV(); }
      return _genreCode; }
    protected ConditionValue getCValueGenreCode() { return getGenreCode(); }

    public Map<String, LdBookCQ> getGenreCode_ExistsReferrer_BookList() { return xgetSQueMap("genreCode_ExistsReferrer_BookList"); }
    public String keepGenreCode_ExistsReferrer_BookList(LdBookCQ sq) { return xkeepSQue("genreCode_ExistsReferrer_BookList", sq); }

    public Map<String, LdGenreCQ> getGenreCode_ExistsReferrer_GenreSelfList() { return xgetSQueMap("genreCode_ExistsReferrer_GenreSelfList"); }
    public String keepGenreCode_ExistsReferrer_GenreSelfList(LdGenreCQ sq) { return xkeepSQue("genreCode_ExistsReferrer_GenreSelfList", sq); }

    public Map<String, LdBookCQ> getGenreCode_NotExistsReferrer_BookList() { return xgetSQueMap("genreCode_NotExistsReferrer_BookList"); }
    public String keepGenreCode_NotExistsReferrer_BookList(LdBookCQ sq) { return xkeepSQue("genreCode_NotExistsReferrer_BookList", sq); }

    public Map<String, LdGenreCQ> getGenreCode_NotExistsReferrer_GenreSelfList() { return xgetSQueMap("genreCode_NotExistsReferrer_GenreSelfList"); }
    public String keepGenreCode_NotExistsReferrer_GenreSelfList(LdGenreCQ sq) { return xkeepSQue("genreCode_NotExistsReferrer_GenreSelfList", sq); }

    public Map<String, LdBookCQ> getGenreCode_InScopeRelation_BookList() { return xgetSQueMap("genreCode_InScopeRelation_BookList"); }
    public String keepGenreCode_InScopeRelation_BookList(LdBookCQ sq) { return xkeepSQue("genreCode_InScopeRelation_BookList", sq); }

    public Map<String, LdGenreCQ> getGenreCode_InScopeRelation_GenreSelfList() { return xgetSQueMap("genreCode_InScopeRelation_GenreSelfList"); }
    public String keepGenreCode_InScopeRelation_GenreSelfList(LdGenreCQ sq) { return xkeepSQue("genreCode_InScopeRelation_GenreSelfList", sq); }

    public Map<String, LdBookCQ> getGenreCode_NotInScopeRelation_BookList() { return xgetSQueMap("genreCode_NotInScopeRelation_BookList"); }
    public String keepGenreCode_NotInScopeRelation_BookList(LdBookCQ sq) { return xkeepSQue("genreCode_NotInScopeRelation_BookList", sq); }

    public Map<String, LdGenreCQ> getGenreCode_NotInScopeRelation_GenreSelfList() { return xgetSQueMap("genreCode_NotInScopeRelation_GenreSelfList"); }
    public String keepGenreCode_NotInScopeRelation_GenreSelfList(LdGenreCQ sq) { return xkeepSQue("genreCode_NotInScopeRelation_GenreSelfList", sq); }

    public Map<String, LdBookCQ> getGenreCode_SpecifyDerivedReferrer_BookList() { return xgetSQueMap("genreCode_SpecifyDerivedReferrer_BookList"); }
    public String keepGenreCode_SpecifyDerivedReferrer_BookList(LdBookCQ sq) { return xkeepSQue("genreCode_SpecifyDerivedReferrer_BookList", sq); }

    public Map<String, LdGenreCQ> getGenreCode_SpecifyDerivedReferrer_GenreSelfList() { return xgetSQueMap("genreCode_SpecifyDerivedReferrer_GenreSelfList"); }
    public String keepGenreCode_SpecifyDerivedReferrer_GenreSelfList(LdGenreCQ sq) { return xkeepSQue("genreCode_SpecifyDerivedReferrer_GenreSelfList", sq); }

    public Map<String, LdBookCQ> getGenreCode_QueryDerivedReferrer_BookList() { return xgetSQueMap("genreCode_QueryDerivedReferrer_BookList"); }
    public String keepGenreCode_QueryDerivedReferrer_BookList(LdBookCQ sq) { return xkeepSQue("genreCode_QueryDerivedReferrer_BookList", sq); }
    public Map<String, Object> getGenreCode_QueryDerivedReferrer_BookListParameter() { return xgetSQuePmMap("genreCode_QueryDerivedReferrer_BookList"); }
    public String keepGenreCode_QueryDerivedReferrer_BookListParameter(Object pm) { return xkeepSQuePm("genreCode_QueryDerivedReferrer_BookList", pm); }

    public Map<String, LdGenreCQ> getGenreCode_QueryDerivedReferrer_GenreSelfList() { return xgetSQueMap("genreCode_QueryDerivedReferrer_GenreSelfList"); }
    public String keepGenreCode_QueryDerivedReferrer_GenreSelfList(LdGenreCQ sq) { return xkeepSQue("genreCode_QueryDerivedReferrer_GenreSelfList", sq); }
    public Map<String, Object> getGenreCode_QueryDerivedReferrer_GenreSelfListParameter() { return xgetSQuePmMap("genreCode_QueryDerivedReferrer_GenreSelfList"); }
    public String keepGenreCode_QueryDerivedReferrer_GenreSelfListParameter(Object pm) { return xkeepSQuePm("genreCode_QueryDerivedReferrer_GenreSelfList", pm); }

    /** 
     * Add order-by as ascend. <br />
     * GENRE_CODE: {PK, NotNull, VARCHAR(24)}
     * @return this. (NotNull)
     */
    public LdBsGenreCQ addOrderBy_GenreCode_Asc() { regOBA("GENRE_CODE"); return this; }

    /**
     * Add order-by as descend. <br />
     * GENRE_CODE: {PK, NotNull, VARCHAR(24)}
     * @return this. (NotNull)
     */
    public LdBsGenreCQ addOrderBy_GenreCode_Desc() { regOBD("GENRE_CODE"); return this; }

    protected ConditionValue _genreName;
    public ConditionValue getGenreName()
    { if (_genreName == null) { _genreName = nCV(); }
      return _genreName; }
    protected ConditionValue getCValueGenreName() { return getGenreName(); }

    /** 
     * Add order-by as ascend. <br />
     * GENRE_NAME: {NotNull, VARCHAR(80)}
     * @return this. (NotNull)
     */
    public LdBsGenreCQ addOrderBy_GenreName_Asc() { regOBA("GENRE_NAME"); return this; }

    /**
     * Add order-by as descend. <br />
     * GENRE_NAME: {NotNull, VARCHAR(80)}
     * @return this. (NotNull)
     */
    public LdBsGenreCQ addOrderBy_GenreName_Desc() { regOBD("GENRE_NAME"); return this; }

    protected ConditionValue _hierarchyLevel;
    public ConditionValue getHierarchyLevel()
    { if (_hierarchyLevel == null) { _hierarchyLevel = nCV(); }
      return _hierarchyLevel; }
    protected ConditionValue getCValueHierarchyLevel() { return getHierarchyLevel(); }

    /** 
     * Add order-by as ascend. <br />
     * HIERARCHY_LEVEL: {NotNull, NUMERIC(9)}
     * @return this. (NotNull)
     */
    public LdBsGenreCQ addOrderBy_HierarchyLevel_Asc() { regOBA("HIERARCHY_LEVEL"); return this; }

    /**
     * Add order-by as descend. <br />
     * HIERARCHY_LEVEL: {NotNull, NUMERIC(9)}
     * @return this. (NotNull)
     */
    public LdBsGenreCQ addOrderBy_HierarchyLevel_Desc() { regOBD("HIERARCHY_LEVEL"); return this; }

    protected ConditionValue _hierarchyOrder;
    public ConditionValue getHierarchyOrder()
    { if (_hierarchyOrder == null) { _hierarchyOrder = nCV(); }
      return _hierarchyOrder; }
    protected ConditionValue getCValueHierarchyOrder() { return getHierarchyOrder(); }

    /** 
     * Add order-by as ascend. <br />
     * HIERARCHY_ORDER: {NotNull, NUMERIC(10)}
     * @return this. (NotNull)
     */
    public LdBsGenreCQ addOrderBy_HierarchyOrder_Asc() { regOBA("HIERARCHY_ORDER"); return this; }

    /**
     * Add order-by as descend. <br />
     * HIERARCHY_ORDER: {NotNull, NUMERIC(10)}
     * @return this. (NotNull)
     */
    public LdBsGenreCQ addOrderBy_HierarchyOrder_Desc() { regOBD("HIERARCHY_ORDER"); return this; }

    protected ConditionValue _parentGenreCode;
    public ConditionValue getParentGenreCode()
    { if (_parentGenreCode == null) { _parentGenreCode = nCV(); }
      return _parentGenreCode; }
    protected ConditionValue getCValueParentGenreCode() { return getParentGenreCode(); }

    public Map<String, LdGenreCQ> getParentGenreCode_InScopeRelation_GenreSelf() { return xgetSQueMap("parentGenreCode_InScopeRelation_GenreSelf"); }
    public String keepParentGenreCode_InScopeRelation_GenreSelf(LdGenreCQ sq) { return xkeepSQue("parentGenreCode_InScopeRelation_GenreSelf", sq); }

    public Map<String, LdGenreCQ> getParentGenreCode_NotInScopeRelation_GenreSelf() { return xgetSQueMap("parentGenreCode_NotInScopeRelation_GenreSelf"); }
    public String keepParentGenreCode_NotInScopeRelation_GenreSelf(LdGenreCQ sq) { return xkeepSQue("parentGenreCode_NotInScopeRelation_GenreSelf", sq); }

    /** 
     * Add order-by as ascend. <br />
     * PARENT_GENRE_CODE: {IX, VARCHAR(24), FK to GENRE}
     * @return this. (NotNull)
     */
    public LdBsGenreCQ addOrderBy_ParentGenreCode_Asc() { regOBA("PARENT_GENRE_CODE"); return this; }

    /**
     * Add order-by as descend. <br />
     * PARENT_GENRE_CODE: {IX, VARCHAR(24), FK to GENRE}
     * @return this. (NotNull)
     */
    public LdBsGenreCQ addOrderBy_ParentGenreCode_Desc() { regOBD("PARENT_GENRE_CODE"); return this; }

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
    public LdBsGenreCQ addOrderBy_RUser_Asc() { regOBA("R_USER"); return this; }

    /**
     * Add order-by as descend. <br />
     * R_USER: {NotNull, VARCHAR(100), default=[default-user]}
     * @return this. (NotNull)
     */
    public LdBsGenreCQ addOrderBy_RUser_Desc() { regOBD("R_USER"); return this; }

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
    public LdBsGenreCQ addOrderBy_RModule_Asc() { regOBA("R_MODULE"); return this; }

    /**
     * Add order-by as descend. <br />
     * R_MODULE: {NotNull, VARCHAR(100), default=[default-module], classification=RegisterModuleType}
     * @return this. (NotNull)
     */
    public LdBsGenreCQ addOrderBy_RModule_Desc() { regOBD("R_MODULE"); return this; }

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
    public LdBsGenreCQ addOrderBy_RTimestamp_Asc() { regOBA("R_TIMESTAMP"); return this; }

    /**
     * Add order-by as descend. <br />
     * R_TIMESTAMP: {NotNull, TIMESTAMP(26, 6), default=[CURRENT_TIMESTAMP]}
     * @return this. (NotNull)
     */
    public LdBsGenreCQ addOrderBy_RTimestamp_Desc() { regOBD("R_TIMESTAMP"); return this; }

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
    public LdBsGenreCQ addOrderBy_UUser_Asc() { regOBA("U_USER"); return this; }

    /**
     * Add order-by as descend. <br />
     * U_USER: {NotNull, VARCHAR(100), default=[default-user]}
     * @return this. (NotNull)
     */
    public LdBsGenreCQ addOrderBy_UUser_Desc() { regOBD("U_USER"); return this; }

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
    public LdBsGenreCQ addOrderBy_UModule_Asc() { regOBA("U_MODULE"); return this; }

    /**
     * Add order-by as descend. <br />
     * U_MODULE: {NotNull, VARCHAR(100), default=[default-module], classification=UpdateModuleType}
     * @return this. (NotNull)
     */
    public LdBsGenreCQ addOrderBy_UModule_Desc() { regOBD("U_MODULE"); return this; }

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
    public LdBsGenreCQ addOrderBy_UTimestamp_Asc() { regOBA("U_TIMESTAMP"); return this; }

    /**
     * Add order-by as descend. <br />
     * U_TIMESTAMP: {NotNull, TIMESTAMP(26, 6), default=[CURRENT_TIMESTAMP]}
     * @return this. (NotNull)
     */
    public LdBsGenreCQ addOrderBy_UTimestamp_Desc() { regOBD("U_TIMESTAMP"); return this; }

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
    public LdBsGenreCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public LdBsGenreCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        LdGenreCQ bq = (LdGenreCQ)bqs;
        LdGenreCQ uq = (LdGenreCQ)uqs;
        if (bq.hasConditionQueryGenreSelf()) {
            uq.queryGenreSelf().reflectRelationOnUnionQuery(bq.queryGenreSelf(), uq.queryGenreSelf());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br />
     * GENRE by my PARENT_GENRE_CODE, named 'genreSelf'.
     * @return The instance of condition-query. (NotNull)
     */
    public LdGenreCQ queryGenreSelf() {
        return getConditionQueryGenreSelf();
    }
    public LdGenreCQ getConditionQueryGenreSelf() {
        String prop = "genreSelf";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryGenreSelf()); xsetupOuterJoinGenreSelf(); }
        return xgetQueRlMap(prop);
    }
    protected LdGenreCQ xcreateQueryGenreSelf() {
        String nrp = xresolveNRP("GENRE", "genreSelf"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new LdGenreCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "genreSelf", nrp);
    }
    protected void xsetupOuterJoinGenreSelf() { xregOutJo("genreSelf"); }
    public boolean hasConditionQueryGenreSelf() { return xhasQueRlMap("genreSelf"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, LdGenreCQ> getScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(LdGenreCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, LdGenreCQ> getSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(LdGenreCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, LdGenreCQ> getQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(LdGenreCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> getQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, LdGenreCQ> _myselfExistsMap;
    public Map<String, LdGenreCQ> getMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(LdGenreCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, LdGenreCQ> getMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(LdGenreCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return LdGenreCB.class.getName(); }
    protected String xCQ() { return LdGenreCQ.class.getName(); }
    protected String xCHp() { return HpCalculator.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
