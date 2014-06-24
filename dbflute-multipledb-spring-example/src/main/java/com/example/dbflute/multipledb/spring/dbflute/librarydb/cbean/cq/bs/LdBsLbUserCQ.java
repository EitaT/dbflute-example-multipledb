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
 * The base condition-query of LB_USER.
 * @author DBFlute(AutoGenerator)
 */
public class LdBsLbUserCQ extends LdAbstractBsLbUserCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected LdLbUserCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public LdBsLbUserCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from LB_USER) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public LdLbUserCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected LdLbUserCIQ xcreateCIQ() {
        LdLbUserCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected LdLbUserCIQ xnewCIQ() {
        return new LdLbUserCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join LB_USER on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public LdLbUserCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        LdLbUserCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _lbUserId;
    public ConditionValue getLbUserId()
    { if (_lbUserId == null) { _lbUserId = nCV(); }
      return _lbUserId; }
    protected ConditionValue getCValueLbUserId() { return getLbUserId(); }

    public Map<String, LdBlackListCQ> getLbUserId_ExistsReferrer_BlackListAsOne() { return xgetSQueMap("lbUserId_ExistsReferrer_BlackListAsOne"); }
    public String keepLbUserId_ExistsReferrer_BlackListAsOne(LdBlackListCQ sq) { return xkeepSQue("lbUserId_ExistsReferrer_BlackListAsOne", sq); }

    public Map<String, LdLibraryUserCQ> getLbUserId_ExistsReferrer_LibraryUserList() { return xgetSQueMap("lbUserId_ExistsReferrer_LibraryUserList"); }
    public String keepLbUserId_ExistsReferrer_LibraryUserList(LdLibraryUserCQ sq) { return xkeepSQue("lbUserId_ExistsReferrer_LibraryUserList", sq); }

    public Map<String, LdBlackListCQ> getLbUserId_NotExistsReferrer_BlackListAsOne() { return xgetSQueMap("lbUserId_NotExistsReferrer_BlackListAsOne"); }
    public String keepLbUserId_NotExistsReferrer_BlackListAsOne(LdBlackListCQ sq) { return xkeepSQue("lbUserId_NotExistsReferrer_BlackListAsOne", sq); }

    public Map<String, LdLibraryUserCQ> getLbUserId_NotExistsReferrer_LibraryUserList() { return xgetSQueMap("lbUserId_NotExistsReferrer_LibraryUserList"); }
    public String keepLbUserId_NotExistsReferrer_LibraryUserList(LdLibraryUserCQ sq) { return xkeepSQue("lbUserId_NotExistsReferrer_LibraryUserList", sq); }

    public Map<String, LdLibraryUserCQ> getLbUserId_SpecifyDerivedReferrer_LibraryUserList() { return xgetSQueMap("lbUserId_SpecifyDerivedReferrer_LibraryUserList"); }
    public String keepLbUserId_SpecifyDerivedReferrer_LibraryUserList(LdLibraryUserCQ sq) { return xkeepSQue("lbUserId_SpecifyDerivedReferrer_LibraryUserList", sq); }

    public Map<String, LdBlackListCQ> getLbUserId_InScopeRelation_BlackListAsOne() { return xgetSQueMap("lbUserId_InScopeRelation_BlackListAsOne"); }
    public String keepLbUserId_InScopeRelation_BlackListAsOne(LdBlackListCQ sq) { return xkeepSQue("lbUserId_InScopeRelation_BlackListAsOne", sq); }

    public Map<String, LdLibraryUserCQ> getLbUserId_InScopeRelation_LibraryUserList() { return xgetSQueMap("lbUserId_InScopeRelation_LibraryUserList"); }
    public String keepLbUserId_InScopeRelation_LibraryUserList(LdLibraryUserCQ sq) { return xkeepSQue("lbUserId_InScopeRelation_LibraryUserList", sq); }

    public Map<String, LdBlackListCQ> getLbUserId_NotInScopeRelation_BlackListAsOne() { return xgetSQueMap("lbUserId_NotInScopeRelation_BlackListAsOne"); }
    public String keepLbUserId_NotInScopeRelation_BlackListAsOne(LdBlackListCQ sq) { return xkeepSQue("lbUserId_NotInScopeRelation_BlackListAsOne", sq); }

    public Map<String, LdLibraryUserCQ> getLbUserId_NotInScopeRelation_LibraryUserList() { return xgetSQueMap("lbUserId_NotInScopeRelation_LibraryUserList"); }
    public String keepLbUserId_NotInScopeRelation_LibraryUserList(LdLibraryUserCQ sq) { return xkeepSQue("lbUserId_NotInScopeRelation_LibraryUserList", sq); }

    public Map<String, LdLibraryUserCQ> getLbUserId_QueryDerivedReferrer_LibraryUserList() { return xgetSQueMap("lbUserId_QueryDerivedReferrer_LibraryUserList"); }
    public String keepLbUserId_QueryDerivedReferrer_LibraryUserList(LdLibraryUserCQ sq) { return xkeepSQue("lbUserId_QueryDerivedReferrer_LibraryUserList", sq); }
    public Map<String, Object> getLbUserId_QueryDerivedReferrer_LibraryUserListParameter() { return xgetSQuePmMap("lbUserId_QueryDerivedReferrer_LibraryUserList"); }
    public String keepLbUserId_QueryDerivedReferrer_LibraryUserListParameter(Object pm) { return xkeepSQuePm("lbUserId_QueryDerivedReferrer_LibraryUserList", pm); }

    /** 
     * Add order-by as ascend. <br />
     * LB_USER_ID: {PK, ID, NotNull, INTEGER(10)}
     * @return this. (NotNull)
     */
    public LdBsLbUserCQ addOrderBy_LbUserId_Asc() { regOBA("LB_USER_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * LB_USER_ID: {PK, ID, NotNull, INTEGER(10)}
     * @return this. (NotNull)
     */
    public LdBsLbUserCQ addOrderBy_LbUserId_Desc() { regOBD("LB_USER_ID"); return this; }

    protected ConditionValue _lbUserName;
    public ConditionValue getLbUserName()
    { if (_lbUserName == null) { _lbUserName = nCV(); }
      return _lbUserName; }
    protected ConditionValue getCValueLbUserName() { return getLbUserName(); }

    /** 
     * Add order-by as ascend. <br />
     * LB_USER_NAME: {NotNull, VARCHAR(80)}
     * @return this. (NotNull)
     */
    public LdBsLbUserCQ addOrderBy_LbUserName_Asc() { regOBA("LB_USER_NAME"); return this; }

    /**
     * Add order-by as descend. <br />
     * LB_USER_NAME: {NotNull, VARCHAR(80)}
     * @return this. (NotNull)
     */
    public LdBsLbUserCQ addOrderBy_LbUserName_Desc() { regOBD("LB_USER_NAME"); return this; }

    protected ConditionValue _userPassword;
    public ConditionValue getUserPassword()
    { if (_userPassword == null) { _userPassword = nCV(); }
      return _userPassword; }
    protected ConditionValue getCValueUserPassword() { return getUserPassword(); }

    /** 
     * Add order-by as ascend. <br />
     * USER_PASSWORD: {NotNull, VARCHAR(50)}
     * @return this. (NotNull)
     */
    public LdBsLbUserCQ addOrderBy_UserPassword_Asc() { regOBA("USER_PASSWORD"); return this; }

    /**
     * Add order-by as descend. <br />
     * USER_PASSWORD: {NotNull, VARCHAR(50)}
     * @return this. (NotNull)
     */
    public LdBsLbUserCQ addOrderBy_UserPassword_Desc() { regOBD("USER_PASSWORD"); return this; }

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
    public LdBsLbUserCQ addOrderBy_RUser_Asc() { regOBA("R_USER"); return this; }

    /**
     * Add order-by as descend. <br />
     * R_USER: {NotNull, VARCHAR(100), default=[default-user]}
     * @return this. (NotNull)
     */
    public LdBsLbUserCQ addOrderBy_RUser_Desc() { regOBD("R_USER"); return this; }

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
    public LdBsLbUserCQ addOrderBy_RModule_Asc() { regOBA("R_MODULE"); return this; }

    /**
     * Add order-by as descend. <br />
     * R_MODULE: {NotNull, VARCHAR(100), default=[default-module]}
     * @return this. (NotNull)
     */
    public LdBsLbUserCQ addOrderBy_RModule_Desc() { regOBD("R_MODULE"); return this; }

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
    public LdBsLbUserCQ addOrderBy_RTimestamp_Asc() { regOBA("R_TIMESTAMP"); return this; }

    /**
     * Add order-by as descend. <br />
     * R_TIMESTAMP: {NotNull, TIMESTAMP(26, 6), default=[CURRENT_TIMESTAMP]}
     * @return this. (NotNull)
     */
    public LdBsLbUserCQ addOrderBy_RTimestamp_Desc() { regOBD("R_TIMESTAMP"); return this; }

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
    public LdBsLbUserCQ addOrderBy_UUser_Asc() { regOBA("U_USER"); return this; }

    /**
     * Add order-by as descend. <br />
     * U_USER: {NotNull, VARCHAR(100), default=[default-user]}
     * @return this. (NotNull)
     */
    public LdBsLbUserCQ addOrderBy_UUser_Desc() { regOBD("U_USER"); return this; }

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
    public LdBsLbUserCQ addOrderBy_UModule_Asc() { regOBA("U_MODULE"); return this; }

    /**
     * Add order-by as descend. <br />
     * U_MODULE: {NotNull, VARCHAR(100), default=[default-module]}
     * @return this. (NotNull)
     */
    public LdBsLbUserCQ addOrderBy_UModule_Desc() { regOBD("U_MODULE"); return this; }

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
    public LdBsLbUserCQ addOrderBy_UTimestamp_Asc() { regOBA("U_TIMESTAMP"); return this; }

    /**
     * Add order-by as descend. <br />
     * U_TIMESTAMP: {NotNull, TIMESTAMP(26, 6), default=[CURRENT_TIMESTAMP]}
     * @return this. (NotNull)
     */
    public LdBsLbUserCQ addOrderBy_UTimestamp_Desc() { regOBD("U_TIMESTAMP"); return this; }

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
    public LdBsLbUserCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public LdBsLbUserCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        LdLbUserCQ bq = (LdLbUserCQ)bqs;
        LdLbUserCQ uq = (LdLbUserCQ)uqs;
        if (bq.hasConditionQueryBlackListAsOne()) {
            uq.queryBlackListAsOne().reflectRelationOnUnionQuery(bq.queryBlackListAsOne(), uq.queryBlackListAsOne());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br />
     * BLACK_LIST by LB_USER_ID, named 'blackListAsOne'.
     * @return The instance of condition-query. (NotNull)
     */
    public LdBlackListCQ queryBlackListAsOne() { return getConditionQueryBlackListAsOne(); }
    public LdBlackListCQ getConditionQueryBlackListAsOne() {
        String prop = "blackListAsOne";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBlackListAsOne()); xsetupOuterJoinBlackListAsOne(); }
        return xgetQueRlMap(prop);
    }
    protected LdBlackListCQ xcreateQueryBlackListAsOne() {
        String nrp = xresolveNRP("LB_USER", "blackListAsOne"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new LdBlackListCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "blackListAsOne", nrp);
    }
    protected void xsetupOuterJoinBlackListAsOne() { xregOutJo("blackListAsOne"); }
    public boolean hasConditionQueryBlackListAsOne() { return xhasQueRlMap("blackListAsOne"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, LdLbUserCQ> getScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(LdLbUserCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, LdLbUserCQ> getSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(LdLbUserCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, LdLbUserCQ> getQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(LdLbUserCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> getQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, LdLbUserCQ> _myselfExistsMap;
    public Map<String, LdLbUserCQ> getMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(LdLbUserCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, LdLbUserCQ> getMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(LdLbUserCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return LdLbUserCB.class.getName(); }
    protected String xCQ() { return LdLbUserCQ.class.getName(); }
    protected String xCHp() { return HpCalculator.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
