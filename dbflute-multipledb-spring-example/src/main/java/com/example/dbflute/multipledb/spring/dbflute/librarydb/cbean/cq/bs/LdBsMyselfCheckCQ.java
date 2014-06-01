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
 * The base condition-query of MYSELF_CHECK.
 * @author DBFlute(AutoGenerator)
 */
public class LdBsMyselfCheckCQ extends LdAbstractBsMyselfCheckCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected LdMyselfCheckCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public LdBsMyselfCheckCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from MYSELF_CHECK) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public LdMyselfCheckCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected LdMyselfCheckCIQ xcreateCIQ() {
        LdMyselfCheckCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected LdMyselfCheckCIQ xnewCIQ() {
        return new LdMyselfCheckCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join MYSELF_CHECK on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public LdMyselfCheckCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        LdMyselfCheckCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _myselfCheckId;
    public ConditionValue getMyselfCheckId() {
        if (_myselfCheckId == null) { _myselfCheckId = nCV(); }
        return _myselfCheckId;
    }
    protected ConditionValue getCValueMyselfCheckId() { return getMyselfCheckId(); }

    /** 
     * Add order-by as ascend. <br />
     * MYSELF_CHECK_ID: {PK, NotNull, INTEGER(10)}
     * @return this. (NotNull)
     */
    public LdBsMyselfCheckCQ addOrderBy_MyselfCheckId_Asc() { regOBA("MYSELF_CHECK_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * MYSELF_CHECK_ID: {PK, NotNull, INTEGER(10)}
     * @return this. (NotNull)
     */
    public LdBsMyselfCheckCQ addOrderBy_MyselfCheckId_Desc() { regOBD("MYSELF_CHECK_ID"); return this; }

    protected ConditionValue _myselfCheckName;
    public ConditionValue getMyselfCheckName() {
        if (_myselfCheckName == null) { _myselfCheckName = nCV(); }
        return _myselfCheckName;
    }
    protected ConditionValue getCValueMyselfCheckName() { return getMyselfCheckName(); }

    /** 
     * Add order-by as ascend. <br />
     * MYSELF_CHECK_NAME: {NotNull, VARCHAR(80)}
     * @return this. (NotNull)
     */
    public LdBsMyselfCheckCQ addOrderBy_MyselfCheckName_Asc() { regOBA("MYSELF_CHECK_NAME"); return this; }

    /**
     * Add order-by as descend. <br />
     * MYSELF_CHECK_NAME: {NotNull, VARCHAR(80)}
     * @return this. (NotNull)
     */
    public LdBsMyselfCheckCQ addOrderBy_MyselfCheckName_Desc() { regOBD("MYSELF_CHECK_NAME"); return this; }

    protected ConditionValue _myselfId;
    public ConditionValue getMyselfId() {
        if (_myselfId == null) { _myselfId = nCV(); }
        return _myselfId;
    }
    protected ConditionValue getCValueMyselfId() { return getMyselfId(); }

    protected Map<String, LdMyselfCQ> _myselfId_InScopeRelation_MyselfMap;
    public Map<String, LdMyselfCQ> getMyselfId_InScopeRelation_Myself() { return _myselfId_InScopeRelation_MyselfMap; }
    public String keepMyselfId_InScopeRelation_Myself(LdMyselfCQ sq) {
        if (_myselfId_InScopeRelation_MyselfMap == null) { _myselfId_InScopeRelation_MyselfMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_myselfId_InScopeRelation_MyselfMap.size() + 1);
        _myselfId_InScopeRelation_MyselfMap.put(ky, sq); return "myselfId_InScopeRelation_Myself." + ky;
    }

    protected Map<String, LdMyselfCQ> _myselfId_NotInScopeRelation_MyselfMap;
    public Map<String, LdMyselfCQ> getMyselfId_NotInScopeRelation_Myself() { return _myselfId_NotInScopeRelation_MyselfMap; }
    public String keepMyselfId_NotInScopeRelation_Myself(LdMyselfCQ sq) {
        if (_myselfId_NotInScopeRelation_MyselfMap == null) { _myselfId_NotInScopeRelation_MyselfMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_myselfId_NotInScopeRelation_MyselfMap.size() + 1);
        _myselfId_NotInScopeRelation_MyselfMap.put(ky, sq); return "myselfId_NotInScopeRelation_Myself." + ky;
    }

    /** 
     * Add order-by as ascend. <br />
     * MYSELF_ID: {IX, INTEGER(10), FK to MYSELF}
     * @return this. (NotNull)
     */
    public LdBsMyselfCheckCQ addOrderBy_MyselfId_Asc() { regOBA("MYSELF_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * MYSELF_ID: {IX, INTEGER(10), FK to MYSELF}
     * @return this. (NotNull)
     */
    public LdBsMyselfCheckCQ addOrderBy_MyselfId_Desc() { regOBD("MYSELF_ID"); return this; }

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
    public LdBsMyselfCheckCQ addSpecifiedDerivedOrderBy_Asc(String aliasName)
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
    public LdBsMyselfCheckCQ addSpecifiedDerivedOrderBy_Desc(String aliasName)
    { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        LdMyselfCheckCQ bq = (LdMyselfCheckCQ)bqs;
        LdMyselfCheckCQ uq = (LdMyselfCheckCQ)uqs;
        if (bq.hasConditionQueryMyself()) {
            uq.queryMyself().reflectRelationOnUnionQuery(bq.queryMyself(), uq.queryMyself());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br />
     * MYSELF by my MYSELF_ID, named 'myself'.
     * @return The instance of condition-query. (NotNull)
     */
    public LdMyselfCQ queryMyself() {
        return getConditionQueryMyself();
    }
    protected LdMyselfCQ _conditionQueryMyself;
    public LdMyselfCQ getConditionQueryMyself() {
        if (_conditionQueryMyself == null) {
            _conditionQueryMyself = xcreateQueryMyself();
            xsetupOuterJoinMyself();
        }
        return _conditionQueryMyself;
    }
    protected LdMyselfCQ xcreateQueryMyself() {
        String nrp = resolveNextRelationPath("MYSELF_CHECK", "myself");
        String jan = resolveJoinAliasName(nrp, xgetNextNestLevel());
        LdMyselfCQ cq = new LdMyselfCQ(this, xgetSqlClause(), jan, xgetNextNestLevel());
        cq.xsetBaseCB(_baseCB);
        cq.xsetForeignPropertyName("myself");
        cq.xsetRelationPath(nrp); return cq;
    }
    protected void xsetupOuterJoinMyself() {
        LdMyselfCQ cq = getConditionQueryMyself();
        Map<String, String> joinOnMap = newLinkedHashMapSized(4);
        joinOnMap.put("MYSELF_ID", "MYSELF_ID");
        registerOuterJoin(cq, joinOnMap, "myself");
    }
    public boolean hasConditionQueryMyself() {
        return _conditionQueryMyself != null;
    }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    protected Map<String, LdMyselfCheckCQ> _scalarConditionMap;
    public Map<String, LdMyselfCheckCQ> getScalarCondition() { return _scalarConditionMap; }
    public String keepScalarCondition(LdMyselfCheckCQ sq) {
        if (_scalarConditionMap == null) { _scalarConditionMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_scalarConditionMap.size() + 1);
        _scalarConditionMap.put(ky, sq); return "scalarCondition." + ky;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    protected Map<String, LdMyselfCheckCQ> _specifyMyselfDerivedMap;
    public Map<String, LdMyselfCheckCQ> getSpecifyMyselfDerived() { return _specifyMyselfDerivedMap; }
    public String keepSpecifyMyselfDerived(LdMyselfCheckCQ sq) {
        if (_specifyMyselfDerivedMap == null) { _specifyMyselfDerivedMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_specifyMyselfDerivedMap.size() + 1);
        _specifyMyselfDerivedMap.put(ky, sq); return "specifyMyselfDerived." + ky;
    }

    protected Map<String, LdMyselfCheckCQ> _queryMyselfDerivedMap;
    public Map<String, LdMyselfCheckCQ> getQueryMyselfDerived() { return _queryMyselfDerivedMap; }
    public String keepQueryMyselfDerived(LdMyselfCheckCQ sq) {
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
    protected Map<String, LdMyselfCheckCQ> _myselfExistsMap;
    public Map<String, LdMyselfCheckCQ> getMyselfExists() { return _myselfExistsMap; }
    public String keepMyselfExists(LdMyselfCheckCQ sq) {
        if (_myselfExistsMap == null) { _myselfExistsMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_myselfExistsMap.size() + 1);
        _myselfExistsMap.put(ky, sq); return "myselfExists." + ky;
    }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    protected Map<String, LdMyselfCheckCQ> _myselfInScopeMap;
    public Map<String, LdMyselfCheckCQ> getMyselfInScope() { return _myselfInScopeMap; }
    public String keepMyselfInScope(LdMyselfCheckCQ sq) {
        if (_myselfInScopeMap == null) { _myselfInScopeMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_myselfInScopeMap.size() + 1);
        _myselfInScopeMap.put(ky, sq); return "myselfInScope." + ky;
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return LdMyselfCheckCB.class.getName(); }
    protected String xCQ() { return LdMyselfCheckCQ.class.getName(); }
    protected String xCHp() { return HpCalculator.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
