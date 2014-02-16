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
    public LdBsLbUserCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from LB_USER) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">inline()</span>.setFoo...;
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
     * cb.query().queryMemberStatus().<span style="color: #FD4747">on()</span>.setFoo...;
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
    public ConditionValue getLbUserId() {
        if (_lbUserId == null) { _lbUserId = nCV(); }
        return _lbUserId;
    }
    protected ConditionValue getCValueLbUserId() { return getLbUserId(); }

    protected Map<String, LdBlackListCQ> _lbUserId_ExistsReferrer_BlackListAsOneMap;
    public Map<String, LdBlackListCQ> getLbUserId_ExistsReferrer_BlackListAsOne() { return _lbUserId_ExistsReferrer_BlackListAsOneMap; }
    public String keepLbUserId_ExistsReferrer_BlackListAsOne(LdBlackListCQ sq) {
        if (_lbUserId_ExistsReferrer_BlackListAsOneMap == null) { _lbUserId_ExistsReferrer_BlackListAsOneMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_lbUserId_ExistsReferrer_BlackListAsOneMap.size() + 1);
        _lbUserId_ExistsReferrer_BlackListAsOneMap.put(ky, sq); return "lbUserId_ExistsReferrer_BlackListAsOne." + ky;
    }

    protected Map<String, LdLibraryUserCQ> _lbUserId_ExistsReferrer_LibraryUserListMap;
    public Map<String, LdLibraryUserCQ> getLbUserId_ExistsReferrer_LibraryUserList() { return _lbUserId_ExistsReferrer_LibraryUserListMap; }
    public String keepLbUserId_ExistsReferrer_LibraryUserList(LdLibraryUserCQ sq) {
        if (_lbUserId_ExistsReferrer_LibraryUserListMap == null) { _lbUserId_ExistsReferrer_LibraryUserListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_lbUserId_ExistsReferrer_LibraryUserListMap.size() + 1);
        _lbUserId_ExistsReferrer_LibraryUserListMap.put(ky, sq); return "lbUserId_ExistsReferrer_LibraryUserList." + ky;
    }

    protected Map<String, LdBlackListCQ> _lbUserId_NotExistsReferrer_BlackListAsOneMap;
    public Map<String, LdBlackListCQ> getLbUserId_NotExistsReferrer_BlackListAsOne() { return _lbUserId_NotExistsReferrer_BlackListAsOneMap; }
    public String keepLbUserId_NotExistsReferrer_BlackListAsOne(LdBlackListCQ sq) {
        if (_lbUserId_NotExistsReferrer_BlackListAsOneMap == null) { _lbUserId_NotExistsReferrer_BlackListAsOneMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_lbUserId_NotExistsReferrer_BlackListAsOneMap.size() + 1);
        _lbUserId_NotExistsReferrer_BlackListAsOneMap.put(ky, sq); return "lbUserId_NotExistsReferrer_BlackListAsOne." + ky;
    }

    protected Map<String, LdLibraryUserCQ> _lbUserId_NotExistsReferrer_LibraryUserListMap;
    public Map<String, LdLibraryUserCQ> getLbUserId_NotExistsReferrer_LibraryUserList() { return _lbUserId_NotExistsReferrer_LibraryUserListMap; }
    public String keepLbUserId_NotExistsReferrer_LibraryUserList(LdLibraryUserCQ sq) {
        if (_lbUserId_NotExistsReferrer_LibraryUserListMap == null) { _lbUserId_NotExistsReferrer_LibraryUserListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_lbUserId_NotExistsReferrer_LibraryUserListMap.size() + 1);
        _lbUserId_NotExistsReferrer_LibraryUserListMap.put(ky, sq); return "lbUserId_NotExistsReferrer_LibraryUserList." + ky;
    }

    protected Map<String, LdLibraryUserCQ> _lbUserId_SpecifyDerivedReferrer_LibraryUserListMap;
    public Map<String, LdLibraryUserCQ> getLbUserId_SpecifyDerivedReferrer_LibraryUserList() { return _lbUserId_SpecifyDerivedReferrer_LibraryUserListMap; }
    public String keepLbUserId_SpecifyDerivedReferrer_LibraryUserList(LdLibraryUserCQ sq) {
        if (_lbUserId_SpecifyDerivedReferrer_LibraryUserListMap == null) { _lbUserId_SpecifyDerivedReferrer_LibraryUserListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_lbUserId_SpecifyDerivedReferrer_LibraryUserListMap.size() + 1);
        _lbUserId_SpecifyDerivedReferrer_LibraryUserListMap.put(ky, sq); return "lbUserId_SpecifyDerivedReferrer_LibraryUserList." + ky;
    }

    protected Map<String, LdBlackListCQ> _lbUserId_InScopeRelation_BlackListAsOneMap;
    public Map<String, LdBlackListCQ> getLbUserId_InScopeRelation_BlackListAsOne() { return _lbUserId_InScopeRelation_BlackListAsOneMap; }
    public String keepLbUserId_InScopeRelation_BlackListAsOne(LdBlackListCQ sq) {
        if (_lbUserId_InScopeRelation_BlackListAsOneMap == null) { _lbUserId_InScopeRelation_BlackListAsOneMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_lbUserId_InScopeRelation_BlackListAsOneMap.size() + 1);
        _lbUserId_InScopeRelation_BlackListAsOneMap.put(ky, sq); return "lbUserId_InScopeRelation_BlackListAsOne." + ky;
    }

    protected Map<String, LdLibraryUserCQ> _lbUserId_InScopeRelation_LibraryUserListMap;
    public Map<String, LdLibraryUserCQ> getLbUserId_InScopeRelation_LibraryUserList() { return _lbUserId_InScopeRelation_LibraryUserListMap; }
    public String keepLbUserId_InScopeRelation_LibraryUserList(LdLibraryUserCQ sq) {
        if (_lbUserId_InScopeRelation_LibraryUserListMap == null) { _lbUserId_InScopeRelation_LibraryUserListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_lbUserId_InScopeRelation_LibraryUserListMap.size() + 1);
        _lbUserId_InScopeRelation_LibraryUserListMap.put(ky, sq); return "lbUserId_InScopeRelation_LibraryUserList." + ky;
    }

    protected Map<String, LdBlackListCQ> _lbUserId_NotInScopeRelation_BlackListAsOneMap;
    public Map<String, LdBlackListCQ> getLbUserId_NotInScopeRelation_BlackListAsOne() { return _lbUserId_NotInScopeRelation_BlackListAsOneMap; }
    public String keepLbUserId_NotInScopeRelation_BlackListAsOne(LdBlackListCQ sq) {
        if (_lbUserId_NotInScopeRelation_BlackListAsOneMap == null) { _lbUserId_NotInScopeRelation_BlackListAsOneMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_lbUserId_NotInScopeRelation_BlackListAsOneMap.size() + 1);
        _lbUserId_NotInScopeRelation_BlackListAsOneMap.put(ky, sq); return "lbUserId_NotInScopeRelation_BlackListAsOne." + ky;
    }

    protected Map<String, LdLibraryUserCQ> _lbUserId_NotInScopeRelation_LibraryUserListMap;
    public Map<String, LdLibraryUserCQ> getLbUserId_NotInScopeRelation_LibraryUserList() { return _lbUserId_NotInScopeRelation_LibraryUserListMap; }
    public String keepLbUserId_NotInScopeRelation_LibraryUserList(LdLibraryUserCQ sq) {
        if (_lbUserId_NotInScopeRelation_LibraryUserListMap == null) { _lbUserId_NotInScopeRelation_LibraryUserListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_lbUserId_NotInScopeRelation_LibraryUserListMap.size() + 1);
        _lbUserId_NotInScopeRelation_LibraryUserListMap.put(ky, sq); return "lbUserId_NotInScopeRelation_LibraryUserList." + ky;
    }

    protected Map<String, LdLibraryUserCQ> _lbUserId_QueryDerivedReferrer_LibraryUserListMap;
    public Map<String, LdLibraryUserCQ> getLbUserId_QueryDerivedReferrer_LibraryUserList() { return _lbUserId_QueryDerivedReferrer_LibraryUserListMap; }
    public String keepLbUserId_QueryDerivedReferrer_LibraryUserList(LdLibraryUserCQ sq) {
        if (_lbUserId_QueryDerivedReferrer_LibraryUserListMap == null) { _lbUserId_QueryDerivedReferrer_LibraryUserListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_lbUserId_QueryDerivedReferrer_LibraryUserListMap.size() + 1);
        _lbUserId_QueryDerivedReferrer_LibraryUserListMap.put(ky, sq); return "lbUserId_QueryDerivedReferrer_LibraryUserList." + ky;
    }
    protected Map<String, Object> _lbUserId_QueryDerivedReferrer_LibraryUserListParameterMap;
    public Map<String, Object> getLbUserId_QueryDerivedReferrer_LibraryUserListParameter() { return _lbUserId_QueryDerivedReferrer_LibraryUserListParameterMap; }
    public String keepLbUserId_QueryDerivedReferrer_LibraryUserListParameter(Object vl) {
        if (_lbUserId_QueryDerivedReferrer_LibraryUserListParameterMap == null) { _lbUserId_QueryDerivedReferrer_LibraryUserListParameterMap = newLinkedHashMapSized(4); }
        String ky = "subQueryParameterKey" + (_lbUserId_QueryDerivedReferrer_LibraryUserListParameterMap.size() + 1);
        _lbUserId_QueryDerivedReferrer_LibraryUserListParameterMap.put(ky, vl); return "lbUserId_QueryDerivedReferrer_LibraryUserListParameter." + ky;
    }

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
    public ConditionValue getLbUserName() {
        if (_lbUserName == null) { _lbUserName = nCV(); }
        return _lbUserName;
    }
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
    public ConditionValue getUserPassword() {
        if (_userPassword == null) { _userPassword = nCV(); }
        return _userPassword;
    }
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
    public LdBsLbUserCQ addOrderBy_RUser_Asc() { regOBA("R_USER"); return this; }

    /**
     * Add order-by as descend. <br />
     * R_USER: {NotNull, VARCHAR(100), default=[default-user]}
     * @return this. (NotNull)
     */
    public LdBsLbUserCQ addOrderBy_RUser_Desc() { regOBD("R_USER"); return this; }

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
    public LdBsLbUserCQ addOrderBy_RModule_Asc() { regOBA("R_MODULE"); return this; }

    /**
     * Add order-by as descend. <br />
     * R_MODULE: {NotNull, VARCHAR(100), default=[default-module], classification=RegisterModuleType}
     * @return this. (NotNull)
     */
    public LdBsLbUserCQ addOrderBy_RModule_Desc() { regOBD("R_MODULE"); return this; }

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
    public LdBsLbUserCQ addOrderBy_RTimestamp_Asc() { regOBA("R_TIMESTAMP"); return this; }

    /**
     * Add order-by as descend. <br />
     * R_TIMESTAMP: {NotNull, TIMESTAMP(26, 6), default=[CURRENT_TIMESTAMP]}
     * @return this. (NotNull)
     */
    public LdBsLbUserCQ addOrderBy_RTimestamp_Desc() { regOBD("R_TIMESTAMP"); return this; }

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
    public LdBsLbUserCQ addOrderBy_UUser_Asc() { regOBA("U_USER"); return this; }

    /**
     * Add order-by as descend. <br />
     * U_USER: {NotNull, VARCHAR(100), default=[default-user]}
     * @return this. (NotNull)
     */
    public LdBsLbUserCQ addOrderBy_UUser_Desc() { regOBD("U_USER"); return this; }

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
    public LdBsLbUserCQ addOrderBy_UModule_Asc() { regOBA("U_MODULE"); return this; }

    /**
     * Add order-by as descend. <br />
     * U_MODULE: {NotNull, VARCHAR(100), default=[default-module], classification=UpdateModuleType}
     * @return this. (NotNull)
     */
    public LdBsLbUserCQ addOrderBy_UModule_Desc() { regOBD("U_MODULE"); return this; }

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
     * }, <span style="color: #FD4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] asc</span>
     * cb.<span style="color: #FD4747">addSpecifiedDerivedOrderBy_Asc</span>(<span style="color: #FD4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public LdBsLbUserCQ addSpecifiedDerivedOrderBy_Asc(String aliasName)
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
    public LdBsLbUserCQ addSpecifiedDerivedOrderBy_Desc(String aliasName)
    { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    protected void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
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
    public LdBlackListCQ queryBlackListAsOne() {
        return getConditionQueryBlackListAsOne();
    }
    protected LdBlackListCQ _conditionQueryBlackListAsOne;
    public LdBlackListCQ getConditionQueryBlackListAsOne() {
        if (_conditionQueryBlackListAsOne == null) {
            _conditionQueryBlackListAsOne = xcreateQueryBlackListAsOne();
            xsetupOuterJoinBlackListAsOne();
        }
        return _conditionQueryBlackListAsOne;
    }
    protected LdBlackListCQ xcreateQueryBlackListAsOne() {
        String nrp = resolveNextRelationPath("LB_USER", "blackListAsOne");
        String jan = resolveJoinAliasName(nrp, xgetNextNestLevel());
        LdBlackListCQ cq = new LdBlackListCQ(this, xgetSqlClause(), jan, xgetNextNestLevel());
        cq.xsetBaseCB(_baseCB);
        cq.xsetForeignPropertyName("blackListAsOne");
        cq.xsetRelationPath(nrp); return cq;
    }
    protected void xsetupOuterJoinBlackListAsOne() {
        LdBlackListCQ cq = getConditionQueryBlackListAsOne();
        Map<String, String> joinOnMap = newLinkedHashMapSized(4);
        joinOnMap.put("LB_USER_ID", "LB_USER_ID");
        registerOuterJoin(cq, joinOnMap, "blackListAsOne");
    }
    public boolean hasConditionQueryBlackListAsOne() {
        return _conditionQueryBlackListAsOne != null;
    }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    protected Map<String, LdLbUserCQ> _scalarConditionMap;
    public Map<String, LdLbUserCQ> getScalarCondition() { return _scalarConditionMap; }
    public String keepScalarCondition(LdLbUserCQ sq) {
        if (_scalarConditionMap == null) { _scalarConditionMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_scalarConditionMap.size() + 1);
        _scalarConditionMap.put(ky, sq); return "scalarCondition." + ky;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    protected Map<String, LdLbUserCQ> _specifyMyselfDerivedMap;
    public Map<String, LdLbUserCQ> getSpecifyMyselfDerived() { return _specifyMyselfDerivedMap; }
    public String keepSpecifyMyselfDerived(LdLbUserCQ sq) {
        if (_specifyMyselfDerivedMap == null) { _specifyMyselfDerivedMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_specifyMyselfDerivedMap.size() + 1);
        _specifyMyselfDerivedMap.put(ky, sq); return "specifyMyselfDerived." + ky;
    }

    protected Map<String, LdLbUserCQ> _queryMyselfDerivedMap;
    public Map<String, LdLbUserCQ> getQueryMyselfDerived() { return _queryMyselfDerivedMap; }
    public String keepQueryMyselfDerived(LdLbUserCQ sq) {
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
    protected Map<String, LdLbUserCQ> _myselfExistsMap;
    public Map<String, LdLbUserCQ> getMyselfExists() { return _myselfExistsMap; }
    public String keepMyselfExists(LdLbUserCQ sq) {
        if (_myselfExistsMap == null) { _myselfExistsMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_myselfExistsMap.size() + 1);
        _myselfExistsMap.put(ky, sq); return "myselfExists." + ky;
    }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    protected Map<String, LdLbUserCQ> _myselfInScopeMap;
    public Map<String, LdLbUserCQ> getMyselfInScope() { return _myselfInScopeMap; }
    public String keepMyselfInScope(LdLbUserCQ sq) {
        if (_myselfInScopeMap == null) { _myselfInScopeMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_myselfInScopeMap.size() + 1);
        _myselfInScopeMap.put(ky, sq); return "myselfInScope." + ky;
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return LdLbUserCB.class.getName(); }
    protected String xCQ() { return LdLbUserCQ.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
