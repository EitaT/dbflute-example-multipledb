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
 * The base condition-query of GARBAGE.
 * @author DBFlute(AutoGenerator)
 */
public class LdBsGarbageCQ extends LdAbstractBsGarbageCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected LdGarbageCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public LdBsGarbageCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from GARBAGE) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public LdGarbageCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected LdGarbageCIQ xcreateCIQ() {
        LdGarbageCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected LdGarbageCIQ xnewCIQ() {
        return new LdGarbageCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join GARBAGE on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public LdGarbageCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        LdGarbageCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected ConditionValue _garbageMemo;
    public ConditionValue getGarbageMemo() {
        if (_garbageMemo == null) { _garbageMemo = nCV(); }
        return _garbageMemo;
    }
    protected ConditionValue getCValueGarbageMemo() { return getGarbageMemo(); }

    /** 
     * Add order-by as ascend. <br />
     * GARBAGE_MEMO: {VARCHAR(50)}
     * @return this. (NotNull)
     */
    public LdBsGarbageCQ addOrderBy_GarbageMemo_Asc() { regOBA("GARBAGE_MEMO"); return this; }

    /**
     * Add order-by as descend. <br />
     * GARBAGE_MEMO: {VARCHAR(50)}
     * @return this. (NotNull)
     */
    public LdBsGarbageCQ addOrderBy_GarbageMemo_Desc() { regOBD("GARBAGE_MEMO"); return this; }

    protected ConditionValue _garbageTime;
    public ConditionValue getGarbageTime() {
        if (_garbageTime == null) { _garbageTime = nCV(); }
        return _garbageTime;
    }
    protected ConditionValue getCValueGarbageTime() { return getGarbageTime(); }

    /** 
     * Add order-by as ascend. <br />
     * GARBAGE_TIME: {TIMESTAMP(26, 6)}
     * @return this. (NotNull)
     */
    public LdBsGarbageCQ addOrderBy_GarbageTime_Asc() { regOBA("GARBAGE_TIME"); return this; }

    /**
     * Add order-by as descend. <br />
     * GARBAGE_TIME: {TIMESTAMP(26, 6)}
     * @return this. (NotNull)
     */
    public LdBsGarbageCQ addOrderBy_GarbageTime_Desc() { regOBD("GARBAGE_TIME"); return this; }

    protected ConditionValue _garbageCount;
    public ConditionValue getGarbageCount() {
        if (_garbageCount == null) { _garbageCount = nCV(); }
        return _garbageCount;
    }
    protected ConditionValue getCValueGarbageCount() { return getGarbageCount(); }

    /** 
     * Add order-by as ascend. <br />
     * GARBAGE_COUNT: {INTEGER(10)}
     * @return this. (NotNull)
     */
    public LdBsGarbageCQ addOrderBy_GarbageCount_Asc() { regOBA("GARBAGE_COUNT"); return this; }

    /**
     * Add order-by as descend. <br />
     * GARBAGE_COUNT: {INTEGER(10)}
     * @return this. (NotNull)
     */
    public LdBsGarbageCQ addOrderBy_GarbageCount_Desc() { regOBD("GARBAGE_COUNT"); return this; }

    protected ConditionValue _rUser;
    public ConditionValue getRUser() {
        if (_rUser == null) { _rUser = nCV(); }
        return _rUser;
    }
    protected ConditionValue getCValueRUser() { return getRUser(); }

    /** 
     * Add order-by as ascend. <br />
     * R_USER: {VARCHAR(100)}
     * @return this. (NotNull)
     */
    public LdBsGarbageCQ addOrderBy_RUser_Asc() { regOBA("R_USER"); return this; }

    /**
     * Add order-by as descend. <br />
     * R_USER: {VARCHAR(100)}
     * @return this. (NotNull)
     */
    public LdBsGarbageCQ addOrderBy_RUser_Desc() { regOBD("R_USER"); return this; }

    protected ConditionValue _rTimestamp;
    public ConditionValue getRTimestamp() {
        if (_rTimestamp == null) { _rTimestamp = nCV(); }
        return _rTimestamp;
    }
    protected ConditionValue getCValueRTimestamp() { return getRTimestamp(); }

    /** 
     * Add order-by as ascend. <br />
     * R_TIMESTAMP: {TIMESTAMP(26, 6)}
     * @return this. (NotNull)
     */
    public LdBsGarbageCQ addOrderBy_RTimestamp_Asc() { regOBA("R_TIMESTAMP"); return this; }

    /**
     * Add order-by as descend. <br />
     * R_TIMESTAMP: {TIMESTAMP(26, 6)}
     * @return this. (NotNull)
     */
    public LdBsGarbageCQ addOrderBy_RTimestamp_Desc() { regOBD("R_TIMESTAMP"); return this; }

    protected ConditionValue _uUser;
    public ConditionValue getUUser() {
        if (_uUser == null) { _uUser = nCV(); }
        return _uUser;
    }
    protected ConditionValue getCValueUUser() { return getUUser(); }

    /** 
     * Add order-by as ascend. <br />
     * U_USER: {VARCHAR(100)}
     * @return this. (NotNull)
     */
    public LdBsGarbageCQ addOrderBy_UUser_Asc() { regOBA("U_USER"); return this; }

    /**
     * Add order-by as descend. <br />
     * U_USER: {VARCHAR(100)}
     * @return this. (NotNull)
     */
    public LdBsGarbageCQ addOrderBy_UUser_Desc() { regOBD("U_USER"); return this; }

    protected ConditionValue _uTimestamp;
    public ConditionValue getUTimestamp() {
        if (_uTimestamp == null) { _uTimestamp = nCV(); }
        return _uTimestamp;
    }
    protected ConditionValue getCValueUTimestamp() { return getUTimestamp(); }

    /** 
     * Add order-by as ascend. <br />
     * U_TIMESTAMP: {TIMESTAMP(26, 6)}
     * @return this. (NotNull)
     */
    public LdBsGarbageCQ addOrderBy_UTimestamp_Asc() { regOBA("U_TIMESTAMP"); return this; }

    /**
     * Add order-by as descend. <br />
     * U_TIMESTAMP: {TIMESTAMP(26, 6)}
     * @return this. (NotNull)
     */
    public LdBsGarbageCQ addOrderBy_UTimestamp_Desc() { regOBD("U_TIMESTAMP"); return this; }

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
    public LdBsGarbageCQ addSpecifiedDerivedOrderBy_Asc(String aliasName)
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
    public LdBsGarbageCQ addSpecifiedDerivedOrderBy_Desc(String aliasName)
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
    protected Map<String, LdGarbageCQ> _scalarConditionMap;
    public Map<String, LdGarbageCQ> getScalarCondition() { return _scalarConditionMap; }
    public String keepScalarCondition(LdGarbageCQ sq) {
        if (_scalarConditionMap == null) { _scalarConditionMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_scalarConditionMap.size() + 1);
        _scalarConditionMap.put(ky, sq); return "scalarCondition." + ky;
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return LdGarbageCB.class.getName(); }
    protected String xCQ() { return LdGarbageCQ.class.getName(); }
    protected String xCHp() { return HpCalculator.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
