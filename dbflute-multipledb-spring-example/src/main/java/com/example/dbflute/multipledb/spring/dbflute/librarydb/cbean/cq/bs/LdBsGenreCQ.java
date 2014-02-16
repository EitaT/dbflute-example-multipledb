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
    public LdBsGenreCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from GENRE) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">inline()</span>.setFoo...;
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
     * cb.query().queryMemberStatus().<span style="color: #FD4747">on()</span>.setFoo...;
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
    public ConditionValue getGenreCode() {
        if (_genreCode == null) { _genreCode = nCV(); }
        return _genreCode;
    }
    protected ConditionValue getCValueGenreCode() { return getGenreCode(); }

    protected Map<String, LdBookCQ> _genreCode_ExistsReferrer_BookListMap;
    public Map<String, LdBookCQ> getGenreCode_ExistsReferrer_BookList() { return _genreCode_ExistsReferrer_BookListMap; }
    public String keepGenreCode_ExistsReferrer_BookList(LdBookCQ sq) {
        if (_genreCode_ExistsReferrer_BookListMap == null) { _genreCode_ExistsReferrer_BookListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_genreCode_ExistsReferrer_BookListMap.size() + 1);
        _genreCode_ExistsReferrer_BookListMap.put(ky, sq); return "genreCode_ExistsReferrer_BookList." + ky;
    }

    protected Map<String, LdGenreCQ> _genreCode_ExistsReferrer_GenreSelfListMap;
    public Map<String, LdGenreCQ> getGenreCode_ExistsReferrer_GenreSelfList() { return _genreCode_ExistsReferrer_GenreSelfListMap; }
    public String keepGenreCode_ExistsReferrer_GenreSelfList(LdGenreCQ sq) {
        if (_genreCode_ExistsReferrer_GenreSelfListMap == null) { _genreCode_ExistsReferrer_GenreSelfListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_genreCode_ExistsReferrer_GenreSelfListMap.size() + 1);
        _genreCode_ExistsReferrer_GenreSelfListMap.put(ky, sq); return "genreCode_ExistsReferrer_GenreSelfList." + ky;
    }

    protected Map<String, LdBookCQ> _genreCode_NotExistsReferrer_BookListMap;
    public Map<String, LdBookCQ> getGenreCode_NotExistsReferrer_BookList() { return _genreCode_NotExistsReferrer_BookListMap; }
    public String keepGenreCode_NotExistsReferrer_BookList(LdBookCQ sq) {
        if (_genreCode_NotExistsReferrer_BookListMap == null) { _genreCode_NotExistsReferrer_BookListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_genreCode_NotExistsReferrer_BookListMap.size() + 1);
        _genreCode_NotExistsReferrer_BookListMap.put(ky, sq); return "genreCode_NotExistsReferrer_BookList." + ky;
    }

    protected Map<String, LdGenreCQ> _genreCode_NotExistsReferrer_GenreSelfListMap;
    public Map<String, LdGenreCQ> getGenreCode_NotExistsReferrer_GenreSelfList() { return _genreCode_NotExistsReferrer_GenreSelfListMap; }
    public String keepGenreCode_NotExistsReferrer_GenreSelfList(LdGenreCQ sq) {
        if (_genreCode_NotExistsReferrer_GenreSelfListMap == null) { _genreCode_NotExistsReferrer_GenreSelfListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_genreCode_NotExistsReferrer_GenreSelfListMap.size() + 1);
        _genreCode_NotExistsReferrer_GenreSelfListMap.put(ky, sq); return "genreCode_NotExistsReferrer_GenreSelfList." + ky;
    }

    protected Map<String, LdBookCQ> _genreCode_InScopeRelation_BookListMap;
    public Map<String, LdBookCQ> getGenreCode_InScopeRelation_BookList() { return _genreCode_InScopeRelation_BookListMap; }
    public String keepGenreCode_InScopeRelation_BookList(LdBookCQ sq) {
        if (_genreCode_InScopeRelation_BookListMap == null) { _genreCode_InScopeRelation_BookListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_genreCode_InScopeRelation_BookListMap.size() + 1);
        _genreCode_InScopeRelation_BookListMap.put(ky, sq); return "genreCode_InScopeRelation_BookList." + ky;
    }

    protected Map<String, LdGenreCQ> _genreCode_InScopeRelation_GenreSelfListMap;
    public Map<String, LdGenreCQ> getGenreCode_InScopeRelation_GenreSelfList() { return _genreCode_InScopeRelation_GenreSelfListMap; }
    public String keepGenreCode_InScopeRelation_GenreSelfList(LdGenreCQ sq) {
        if (_genreCode_InScopeRelation_GenreSelfListMap == null) { _genreCode_InScopeRelation_GenreSelfListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_genreCode_InScopeRelation_GenreSelfListMap.size() + 1);
        _genreCode_InScopeRelation_GenreSelfListMap.put(ky, sq); return "genreCode_InScopeRelation_GenreSelfList." + ky;
    }

    protected Map<String, LdBookCQ> _genreCode_NotInScopeRelation_BookListMap;
    public Map<String, LdBookCQ> getGenreCode_NotInScopeRelation_BookList() { return _genreCode_NotInScopeRelation_BookListMap; }
    public String keepGenreCode_NotInScopeRelation_BookList(LdBookCQ sq) {
        if (_genreCode_NotInScopeRelation_BookListMap == null) { _genreCode_NotInScopeRelation_BookListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_genreCode_NotInScopeRelation_BookListMap.size() + 1);
        _genreCode_NotInScopeRelation_BookListMap.put(ky, sq); return "genreCode_NotInScopeRelation_BookList." + ky;
    }

    protected Map<String, LdGenreCQ> _genreCode_NotInScopeRelation_GenreSelfListMap;
    public Map<String, LdGenreCQ> getGenreCode_NotInScopeRelation_GenreSelfList() { return _genreCode_NotInScopeRelation_GenreSelfListMap; }
    public String keepGenreCode_NotInScopeRelation_GenreSelfList(LdGenreCQ sq) {
        if (_genreCode_NotInScopeRelation_GenreSelfListMap == null) { _genreCode_NotInScopeRelation_GenreSelfListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_genreCode_NotInScopeRelation_GenreSelfListMap.size() + 1);
        _genreCode_NotInScopeRelation_GenreSelfListMap.put(ky, sq); return "genreCode_NotInScopeRelation_GenreSelfList." + ky;
    }

    protected Map<String, LdBookCQ> _genreCode_SpecifyDerivedReferrer_BookListMap;
    public Map<String, LdBookCQ> getGenreCode_SpecifyDerivedReferrer_BookList() { return _genreCode_SpecifyDerivedReferrer_BookListMap; }
    public String keepGenreCode_SpecifyDerivedReferrer_BookList(LdBookCQ sq) {
        if (_genreCode_SpecifyDerivedReferrer_BookListMap == null) { _genreCode_SpecifyDerivedReferrer_BookListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_genreCode_SpecifyDerivedReferrer_BookListMap.size() + 1);
        _genreCode_SpecifyDerivedReferrer_BookListMap.put(ky, sq); return "genreCode_SpecifyDerivedReferrer_BookList." + ky;
    }

    protected Map<String, LdGenreCQ> _genreCode_SpecifyDerivedReferrer_GenreSelfListMap;
    public Map<String, LdGenreCQ> getGenreCode_SpecifyDerivedReferrer_GenreSelfList() { return _genreCode_SpecifyDerivedReferrer_GenreSelfListMap; }
    public String keepGenreCode_SpecifyDerivedReferrer_GenreSelfList(LdGenreCQ sq) {
        if (_genreCode_SpecifyDerivedReferrer_GenreSelfListMap == null) { _genreCode_SpecifyDerivedReferrer_GenreSelfListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_genreCode_SpecifyDerivedReferrer_GenreSelfListMap.size() + 1);
        _genreCode_SpecifyDerivedReferrer_GenreSelfListMap.put(ky, sq); return "genreCode_SpecifyDerivedReferrer_GenreSelfList." + ky;
    }

    protected Map<String, LdBookCQ> _genreCode_QueryDerivedReferrer_BookListMap;
    public Map<String, LdBookCQ> getGenreCode_QueryDerivedReferrer_BookList() { return _genreCode_QueryDerivedReferrer_BookListMap; }
    public String keepGenreCode_QueryDerivedReferrer_BookList(LdBookCQ sq) {
        if (_genreCode_QueryDerivedReferrer_BookListMap == null) { _genreCode_QueryDerivedReferrer_BookListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_genreCode_QueryDerivedReferrer_BookListMap.size() + 1);
        _genreCode_QueryDerivedReferrer_BookListMap.put(ky, sq); return "genreCode_QueryDerivedReferrer_BookList." + ky;
    }
    protected Map<String, Object> _genreCode_QueryDerivedReferrer_BookListParameterMap;
    public Map<String, Object> getGenreCode_QueryDerivedReferrer_BookListParameter() { return _genreCode_QueryDerivedReferrer_BookListParameterMap; }
    public String keepGenreCode_QueryDerivedReferrer_BookListParameter(Object vl) {
        if (_genreCode_QueryDerivedReferrer_BookListParameterMap == null) { _genreCode_QueryDerivedReferrer_BookListParameterMap = newLinkedHashMapSized(4); }
        String ky = "subQueryParameterKey" + (_genreCode_QueryDerivedReferrer_BookListParameterMap.size() + 1);
        _genreCode_QueryDerivedReferrer_BookListParameterMap.put(ky, vl); return "genreCode_QueryDerivedReferrer_BookListParameter." + ky;
    }

    protected Map<String, LdGenreCQ> _genreCode_QueryDerivedReferrer_GenreSelfListMap;
    public Map<String, LdGenreCQ> getGenreCode_QueryDerivedReferrer_GenreSelfList() { return _genreCode_QueryDerivedReferrer_GenreSelfListMap; }
    public String keepGenreCode_QueryDerivedReferrer_GenreSelfList(LdGenreCQ sq) {
        if (_genreCode_QueryDerivedReferrer_GenreSelfListMap == null) { _genreCode_QueryDerivedReferrer_GenreSelfListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_genreCode_QueryDerivedReferrer_GenreSelfListMap.size() + 1);
        _genreCode_QueryDerivedReferrer_GenreSelfListMap.put(ky, sq); return "genreCode_QueryDerivedReferrer_GenreSelfList." + ky;
    }
    protected Map<String, Object> _genreCode_QueryDerivedReferrer_GenreSelfListParameterMap;
    public Map<String, Object> getGenreCode_QueryDerivedReferrer_GenreSelfListParameter() { return _genreCode_QueryDerivedReferrer_GenreSelfListParameterMap; }
    public String keepGenreCode_QueryDerivedReferrer_GenreSelfListParameter(Object vl) {
        if (_genreCode_QueryDerivedReferrer_GenreSelfListParameterMap == null) { _genreCode_QueryDerivedReferrer_GenreSelfListParameterMap = newLinkedHashMapSized(4); }
        String ky = "subQueryParameterKey" + (_genreCode_QueryDerivedReferrer_GenreSelfListParameterMap.size() + 1);
        _genreCode_QueryDerivedReferrer_GenreSelfListParameterMap.put(ky, vl); return "genreCode_QueryDerivedReferrer_GenreSelfListParameter." + ky;
    }

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
    public ConditionValue getGenreName() {
        if (_genreName == null) { _genreName = nCV(); }
        return _genreName;
    }
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
    public ConditionValue getHierarchyLevel() {
        if (_hierarchyLevel == null) { _hierarchyLevel = nCV(); }
        return _hierarchyLevel;
    }
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
    public ConditionValue getHierarchyOrder() {
        if (_hierarchyOrder == null) { _hierarchyOrder = nCV(); }
        return _hierarchyOrder;
    }
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
    public ConditionValue getParentGenreCode() {
        if (_parentGenreCode == null) { _parentGenreCode = nCV(); }
        return _parentGenreCode;
    }
    protected ConditionValue getCValueParentGenreCode() { return getParentGenreCode(); }

    protected Map<String, LdGenreCQ> _parentGenreCode_InScopeRelation_GenreSelfMap;
    public Map<String, LdGenreCQ> getParentGenreCode_InScopeRelation_GenreSelf() { return _parentGenreCode_InScopeRelation_GenreSelfMap; }
    public String keepParentGenreCode_InScopeRelation_GenreSelf(LdGenreCQ sq) {
        if (_parentGenreCode_InScopeRelation_GenreSelfMap == null) { _parentGenreCode_InScopeRelation_GenreSelfMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_parentGenreCode_InScopeRelation_GenreSelfMap.size() + 1);
        _parentGenreCode_InScopeRelation_GenreSelfMap.put(ky, sq); return "parentGenreCode_InScopeRelation_GenreSelf." + ky;
    }

    protected Map<String, LdGenreCQ> _parentGenreCode_NotInScopeRelation_GenreSelfMap;
    public Map<String, LdGenreCQ> getParentGenreCode_NotInScopeRelation_GenreSelf() { return _parentGenreCode_NotInScopeRelation_GenreSelfMap; }
    public String keepParentGenreCode_NotInScopeRelation_GenreSelf(LdGenreCQ sq) {
        if (_parentGenreCode_NotInScopeRelation_GenreSelfMap == null) { _parentGenreCode_NotInScopeRelation_GenreSelfMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_parentGenreCode_NotInScopeRelation_GenreSelfMap.size() + 1);
        _parentGenreCode_NotInScopeRelation_GenreSelfMap.put(ky, sq); return "parentGenreCode_NotInScopeRelation_GenreSelf." + ky;
    }

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
    public LdBsGenreCQ addOrderBy_RUser_Asc() { regOBA("R_USER"); return this; }

    /**
     * Add order-by as descend. <br />
     * R_USER: {NotNull, VARCHAR(100), default=[default-user]}
     * @return this. (NotNull)
     */
    public LdBsGenreCQ addOrderBy_RUser_Desc() { regOBD("R_USER"); return this; }

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
    public LdBsGenreCQ addOrderBy_RModule_Asc() { regOBA("R_MODULE"); return this; }

    /**
     * Add order-by as descend. <br />
     * R_MODULE: {NotNull, VARCHAR(100), default=[default-module]}
     * @return this. (NotNull)
     */
    public LdBsGenreCQ addOrderBy_RModule_Desc() { regOBD("R_MODULE"); return this; }

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
    public LdBsGenreCQ addOrderBy_RTimestamp_Asc() { regOBA("R_TIMESTAMP"); return this; }

    /**
     * Add order-by as descend. <br />
     * R_TIMESTAMP: {NotNull, TIMESTAMP(26, 6), default=[CURRENT_TIMESTAMP]}
     * @return this. (NotNull)
     */
    public LdBsGenreCQ addOrderBy_RTimestamp_Desc() { regOBD("R_TIMESTAMP"); return this; }

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
    public LdBsGenreCQ addOrderBy_UUser_Asc() { regOBA("U_USER"); return this; }

    /**
     * Add order-by as descend. <br />
     * U_USER: {NotNull, VARCHAR(100), default=[default-user]}
     * @return this. (NotNull)
     */
    public LdBsGenreCQ addOrderBy_UUser_Desc() { regOBD("U_USER"); return this; }

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
    public LdBsGenreCQ addOrderBy_UModule_Asc() { regOBA("U_MODULE"); return this; }

    /**
     * Add order-by as descend. <br />
     * U_MODULE: {NotNull, VARCHAR(100), default=[default-module]}
     * @return this. (NotNull)
     */
    public LdBsGenreCQ addOrderBy_UModule_Desc() { regOBD("U_MODULE"); return this; }

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
     * }, <span style="color: #FD4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] asc</span>
     * cb.<span style="color: #FD4747">addSpecifiedDerivedOrderBy_Asc</span>(<span style="color: #FD4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public LdBsGenreCQ addSpecifiedDerivedOrderBy_Asc(String aliasName)
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
    public LdBsGenreCQ addSpecifiedDerivedOrderBy_Desc(String aliasName)
    { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    protected void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
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
    protected LdGenreCQ _conditionQueryGenreSelf;
    public LdGenreCQ getConditionQueryGenreSelf() {
        if (_conditionQueryGenreSelf == null) {
            _conditionQueryGenreSelf = xcreateQueryGenreSelf();
            xsetupOuterJoinGenreSelf();
        }
        return _conditionQueryGenreSelf;
    }
    protected LdGenreCQ xcreateQueryGenreSelf() {
        String nrp = resolveNextRelationPath("GENRE", "genreSelf");
        String jan = resolveJoinAliasName(nrp, xgetNextNestLevel());
        LdGenreCQ cq = new LdGenreCQ(this, xgetSqlClause(), jan, xgetNextNestLevel());
        cq.xsetBaseCB(_baseCB);
        cq.xsetForeignPropertyName("genreSelf");
        cq.xsetRelationPath(nrp); return cq;
    }
    protected void xsetupOuterJoinGenreSelf() {
        LdGenreCQ cq = getConditionQueryGenreSelf();
        Map<String, String> joinOnMap = newLinkedHashMapSized(4);
        joinOnMap.put("PARENT_GENRE_CODE", "GENRE_CODE");
        registerOuterJoin(cq, joinOnMap, "genreSelf");
    }
    public boolean hasConditionQueryGenreSelf() {
        return _conditionQueryGenreSelf != null;
    }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    protected Map<String, LdGenreCQ> _scalarConditionMap;
    public Map<String, LdGenreCQ> getScalarCondition() { return _scalarConditionMap; }
    public String keepScalarCondition(LdGenreCQ sq) {
        if (_scalarConditionMap == null) { _scalarConditionMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_scalarConditionMap.size() + 1);
        _scalarConditionMap.put(ky, sq); return "scalarCondition." + ky;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    protected Map<String, LdGenreCQ> _specifyMyselfDerivedMap;
    public Map<String, LdGenreCQ> getSpecifyMyselfDerived() { return _specifyMyselfDerivedMap; }
    public String keepSpecifyMyselfDerived(LdGenreCQ sq) {
        if (_specifyMyselfDerivedMap == null) { _specifyMyselfDerivedMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_specifyMyselfDerivedMap.size() + 1);
        _specifyMyselfDerivedMap.put(ky, sq); return "specifyMyselfDerived." + ky;
    }

    protected Map<String, LdGenreCQ> _queryMyselfDerivedMap;
    public Map<String, LdGenreCQ> getQueryMyselfDerived() { return _queryMyselfDerivedMap; }
    public String keepQueryMyselfDerived(LdGenreCQ sq) {
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
    protected Map<String, LdGenreCQ> _myselfExistsMap;
    public Map<String, LdGenreCQ> getMyselfExists() { return _myselfExistsMap; }
    public String keepMyselfExists(LdGenreCQ sq) {
        if (_myselfExistsMap == null) { _myselfExistsMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_myselfExistsMap.size() + 1);
        _myselfExistsMap.put(ky, sq); return "myselfExists." + ky;
    }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    protected Map<String, LdGenreCQ> _myselfInScopeMap;
    public Map<String, LdGenreCQ> getMyselfInScope() { return _myselfInScopeMap; }
    public String keepMyselfInScope(LdGenreCQ sq) {
        if (_myselfInScopeMap == null) { _myselfInScopeMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_myselfInScopeMap.size() + 1);
        _myselfInScopeMap.put(ky, sq); return "myselfInScope." + ky;
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return LdGenreCB.class.getName(); }
    protected String xCQ() { return LdGenreCQ.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
