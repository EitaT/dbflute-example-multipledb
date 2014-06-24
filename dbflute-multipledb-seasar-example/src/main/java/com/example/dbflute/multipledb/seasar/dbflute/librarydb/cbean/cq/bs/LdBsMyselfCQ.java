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
 * The base condition-query of MYSELF.
 * @author DBFlute(AutoGenerator)
 */
public class LdBsMyselfCQ extends LdAbstractBsMyselfCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected LdMyselfCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public LdBsMyselfCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from MYSELF) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public LdMyselfCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected LdMyselfCIQ xcreateCIQ() {
        LdMyselfCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected LdMyselfCIQ xnewCIQ() {
        return new LdMyselfCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join MYSELF on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public LdMyselfCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        LdMyselfCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _myselfId;
    public ConditionValue getMyselfId()
    { if (_myselfId == null) { _myselfId = nCV(); }
      return _myselfId; }
    protected ConditionValue getCValueMyselfId() { return getMyselfId(); }

    public Map<String, LdMyselfCheckCQ> getMyselfId_ExistsReferrer_MyselfCheckList() { return xgetSQueMap("myselfId_ExistsReferrer_MyselfCheckList"); }
    public String keepMyselfId_ExistsReferrer_MyselfCheckList(LdMyselfCheckCQ sq) { return xkeepSQue("myselfId_ExistsReferrer_MyselfCheckList", sq); }

    public Map<String, LdMyselfCheckCQ> getMyselfId_NotExistsReferrer_MyselfCheckList() { return xgetSQueMap("myselfId_NotExistsReferrer_MyselfCheckList"); }
    public String keepMyselfId_NotExistsReferrer_MyselfCheckList(LdMyselfCheckCQ sq) { return xkeepSQue("myselfId_NotExistsReferrer_MyselfCheckList", sq); }

    public Map<String, LdMyselfCheckCQ> getMyselfId_SpecifyDerivedReferrer_MyselfCheckList() { return xgetSQueMap("myselfId_SpecifyDerivedReferrer_MyselfCheckList"); }
    public String keepMyselfId_SpecifyDerivedReferrer_MyselfCheckList(LdMyselfCheckCQ sq) { return xkeepSQue("myselfId_SpecifyDerivedReferrer_MyselfCheckList", sq); }

    public Map<String, LdMyselfCheckCQ> getMyselfId_InScopeRelation_MyselfCheckList() { return xgetSQueMap("myselfId_InScopeRelation_MyselfCheckList"); }
    public String keepMyselfId_InScopeRelation_MyselfCheckList(LdMyselfCheckCQ sq) { return xkeepSQue("myselfId_InScopeRelation_MyselfCheckList", sq); }

    public Map<String, LdMyselfCheckCQ> getMyselfId_NotInScopeRelation_MyselfCheckList() { return xgetSQueMap("myselfId_NotInScopeRelation_MyselfCheckList"); }
    public String keepMyselfId_NotInScopeRelation_MyselfCheckList(LdMyselfCheckCQ sq) { return xkeepSQue("myselfId_NotInScopeRelation_MyselfCheckList", sq); }

    public Map<String, LdMyselfCheckCQ> getMyselfId_QueryDerivedReferrer_MyselfCheckList() { return xgetSQueMap("myselfId_QueryDerivedReferrer_MyselfCheckList"); }
    public String keepMyselfId_QueryDerivedReferrer_MyselfCheckList(LdMyselfCheckCQ sq) { return xkeepSQue("myselfId_QueryDerivedReferrer_MyselfCheckList", sq); }
    public Map<String, Object> getMyselfId_QueryDerivedReferrer_MyselfCheckListParameter() { return xgetSQuePmMap("myselfId_QueryDerivedReferrer_MyselfCheckList"); }
    public String keepMyselfId_QueryDerivedReferrer_MyselfCheckListParameter(Object pm) { return xkeepSQuePm("myselfId_QueryDerivedReferrer_MyselfCheckList", pm); }

    /** 
     * Add order-by as ascend. <br />
     * MYSELF_ID: {PK, NotNull, INTEGER(10)}
     * @return this. (NotNull)
     */
    public LdBsMyselfCQ addOrderBy_MyselfId_Asc() { regOBA("MYSELF_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * MYSELF_ID: {PK, NotNull, INTEGER(10)}
     * @return this. (NotNull)
     */
    public LdBsMyselfCQ addOrderBy_MyselfId_Desc() { regOBD("MYSELF_ID"); return this; }

    protected ConditionValue _myselfName;
    public ConditionValue getMyselfName()
    { if (_myselfName == null) { _myselfName = nCV(); }
      return _myselfName; }
    protected ConditionValue getCValueMyselfName() { return getMyselfName(); }

    /** 
     * Add order-by as ascend. <br />
     * MYSELF_NAME: {NotNull, VARCHAR(80)}
     * @return this. (NotNull)
     */
    public LdBsMyselfCQ addOrderBy_MyselfName_Asc() { regOBA("MYSELF_NAME"); return this; }

    /**
     * Add order-by as descend. <br />
     * MYSELF_NAME: {NotNull, VARCHAR(80)}
     * @return this. (NotNull)
     */
    public LdBsMyselfCQ addOrderBy_MyselfName_Desc() { regOBD("MYSELF_NAME"); return this; }

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
    public LdBsMyselfCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public LdBsMyselfCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, LdMyselfCQ> getScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(LdMyselfCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, LdMyselfCQ> getSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(LdMyselfCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, LdMyselfCQ> getQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(LdMyselfCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> getQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, LdMyselfCQ> _myselfExistsMap;
    public Map<String, LdMyselfCQ> getMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(LdMyselfCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, LdMyselfCQ> getMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(LdMyselfCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return LdMyselfCB.class.getName(); }
    protected String xCQ() { return LdMyselfCQ.class.getName(); }
    protected String xCHp() { return HpCalculator.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
