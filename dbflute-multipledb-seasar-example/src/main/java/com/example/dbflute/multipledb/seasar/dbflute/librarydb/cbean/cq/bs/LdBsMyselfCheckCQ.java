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
    public ConditionValue getMyselfCheckId()
    { if (_myselfCheckId == null) { _myselfCheckId = nCV(); }
      return _myselfCheckId; }
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
    public ConditionValue getMyselfCheckName()
    { if (_myselfCheckName == null) { _myselfCheckName = nCV(); }
      return _myselfCheckName; }
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
    public ConditionValue getMyselfId()
    { if (_myselfId == null) { _myselfId = nCV(); }
      return _myselfId; }
    protected ConditionValue getCValueMyselfId() { return getMyselfId(); }

    public Map<String, LdMyselfCQ> getMyselfId_InScopeRelation_Myself() { return xgetSQueMap("myselfId_InScopeRelation_Myself"); }
    public String keepMyselfId_InScopeRelation_Myself(LdMyselfCQ sq) { return xkeepSQue("myselfId_InScopeRelation_Myself", sq); }

    public Map<String, LdMyselfCQ> getMyselfId_NotInScopeRelation_Myself() { return xgetSQueMap("myselfId_NotInScopeRelation_Myself"); }
    public String keepMyselfId_NotInScopeRelation_Myself(LdMyselfCQ sq) { return xkeepSQue("myselfId_NotInScopeRelation_Myself", sq); }

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
    public LdBsMyselfCheckCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public LdBsMyselfCheckCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public LdMyselfCQ getConditionQueryMyself() {
        String prop = "myself";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMyself()); xsetupOuterJoinMyself(); }
        return xgetQueRlMap(prop);
    }
    protected LdMyselfCQ xcreateQueryMyself() {
        String nrp = xresolveNRP("MYSELF_CHECK", "myself"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new LdMyselfCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "myself", nrp);
    }
    protected void xsetupOuterJoinMyself() { xregOutJo("myself"); }
    public boolean hasConditionQueryMyself() { return xhasQueRlMap("myself"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, LdMyselfCheckCQ> getScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(LdMyselfCheckCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, LdMyselfCheckCQ> getSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(LdMyselfCheckCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, LdMyselfCheckCQ> getQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(LdMyselfCheckCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> getQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, LdMyselfCheckCQ> _myselfExistsMap;
    public Map<String, LdMyselfCheckCQ> getMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(LdMyselfCheckCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, LdMyselfCheckCQ> getMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(LdMyselfCheckCQ sq) { return xkeepSQue("myselfInScope", sq); }

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
