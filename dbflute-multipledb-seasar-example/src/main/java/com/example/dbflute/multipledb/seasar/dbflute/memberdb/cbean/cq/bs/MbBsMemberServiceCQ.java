package com.example.dbflute.multipledb.seasar.dbflute.memberdb.cbean.cq.bs;

import java.util.Map;

import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import org.seasar.dbflute.exception.IllegalConditionBeanOperationException;
import com.example.dbflute.multipledb.seasar.dbflute.memberdb.cbean.cq.ciq.*;
import com.example.dbflute.multipledb.seasar.dbflute.memberdb.cbean.*;
import com.example.dbflute.multipledb.seasar.dbflute.memberdb.cbean.cq.*;

/**
 * The base condition-query of MEMBER_SERVICE.
 * @author DBFlute(AutoGenerator)
 */
public class MbBsMemberServiceCQ extends MbAbstractBsMemberServiceCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected MbMemberServiceCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public MbBsMemberServiceCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from MEMBER_SERVICE) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public MbMemberServiceCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected MbMemberServiceCIQ xcreateCIQ() {
        MbMemberServiceCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected MbMemberServiceCIQ xnewCIQ() {
        return new MbMemberServiceCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join MEMBER_SERVICE on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public MbMemberServiceCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        MbMemberServiceCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected ConditionValue _memberServiceId;
    public ConditionValue getMemberServiceId() {
        if (_memberServiceId == null) { _memberServiceId = nCV(); }
        return _memberServiceId;
    }
    protected ConditionValue getCValueMemberServiceId() { return getMemberServiceId(); }

    /** 
     * Add order-by as ascend. <br />
     * MEMBER_SERVICE_ID: {PK, ID, NotNull, INTEGER(10)}
     * @return this. (NotNull)
     */
    public MbBsMemberServiceCQ addOrderBy_MemberServiceId_Asc() { regOBA("MEMBER_SERVICE_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * MEMBER_SERVICE_ID: {PK, ID, NotNull, INTEGER(10)}
     * @return this. (NotNull)
     */
    public MbBsMemberServiceCQ addOrderBy_MemberServiceId_Desc() { regOBD("MEMBER_SERVICE_ID"); return this; }

    protected ConditionValue _memberId;
    public ConditionValue getMemberId() {
        if (_memberId == null) { _memberId = nCV(); }
        return _memberId;
    }
    protected ConditionValue getCValueMemberId() { return getMemberId(); }

    protected Map<String, MbMemberCQ> _memberId_InScopeRelation_MemberMap;
    public Map<String, MbMemberCQ> getMemberId_InScopeRelation_Member() { return _memberId_InScopeRelation_MemberMap; }
    public String keepMemberId_InScopeRelation_Member(MbMemberCQ subQuery) {
        if (_memberId_InScopeRelation_MemberMap == null) { _memberId_InScopeRelation_MemberMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_memberId_InScopeRelation_MemberMap.size() + 1);
        _memberId_InScopeRelation_MemberMap.put(key, subQuery); return "memberId_InScopeRelation_Member." + key;
    }

    protected Map<String, MbMemberCQ> _memberId_NotInScopeRelation_MemberMap;
    public Map<String, MbMemberCQ> getMemberId_NotInScopeRelation_Member() { return _memberId_NotInScopeRelation_MemberMap; }
    public String keepMemberId_NotInScopeRelation_Member(MbMemberCQ subQuery) {
        if (_memberId_NotInScopeRelation_MemberMap == null) { _memberId_NotInScopeRelation_MemberMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_memberId_NotInScopeRelation_MemberMap.size() + 1);
        _memberId_NotInScopeRelation_MemberMap.put(key, subQuery); return "memberId_NotInScopeRelation_Member." + key;
    }

    /** 
     * Add order-by as ascend. <br />
     * MEMBER_ID: {UQ, IX, NotNull, INTEGER(10), FK to MEMBER}
     * @return this. (NotNull)
     */
    public MbBsMemberServiceCQ addOrderBy_MemberId_Asc() { regOBA("MEMBER_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * MEMBER_ID: {UQ, IX, NotNull, INTEGER(10), FK to MEMBER}
     * @return this. (NotNull)
     */
    public MbBsMemberServiceCQ addOrderBy_MemberId_Desc() { regOBD("MEMBER_ID"); return this; }

    protected ConditionValue _servicePointCount;
    public ConditionValue getServicePointCount() {
        if (_servicePointCount == null) { _servicePointCount = nCV(); }
        return _servicePointCount;
    }
    protected ConditionValue getCValueServicePointCount() { return getServicePointCount(); }

    /** 
     * Add order-by as ascend. <br />
     * SERVICE_POINT_COUNT: {IX, NotNull, INTEGER(10)}
     * @return this. (NotNull)
     */
    public MbBsMemberServiceCQ addOrderBy_ServicePointCount_Asc() { regOBA("SERVICE_POINT_COUNT"); return this; }

    /**
     * Add order-by as descend. <br />
     * SERVICE_POINT_COUNT: {IX, NotNull, INTEGER(10)}
     * @return this. (NotNull)
     */
    public MbBsMemberServiceCQ addOrderBy_ServicePointCount_Desc() { regOBD("SERVICE_POINT_COUNT"); return this; }

    protected ConditionValue _serviceRankCode;
    public ConditionValue getServiceRankCode() {
        if (_serviceRankCode == null) { _serviceRankCode = nCV(); }
        return _serviceRankCode;
    }
    protected ConditionValue getCValueServiceRankCode() { return getServiceRankCode(); }

    protected Map<String, MbServiceRankCQ> _serviceRankCode_InScopeRelation_ServiceRankMap;
    public Map<String, MbServiceRankCQ> getServiceRankCode_InScopeRelation_ServiceRank() { return _serviceRankCode_InScopeRelation_ServiceRankMap; }
    public String keepServiceRankCode_InScopeRelation_ServiceRank(MbServiceRankCQ subQuery) {
        if (_serviceRankCode_InScopeRelation_ServiceRankMap == null) { _serviceRankCode_InScopeRelation_ServiceRankMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_serviceRankCode_InScopeRelation_ServiceRankMap.size() + 1);
        _serviceRankCode_InScopeRelation_ServiceRankMap.put(key, subQuery); return "serviceRankCode_InScopeRelation_ServiceRank." + key;
    }

    protected Map<String, MbServiceRankCQ> _serviceRankCode_NotInScopeRelation_ServiceRankMap;
    public Map<String, MbServiceRankCQ> getServiceRankCode_NotInScopeRelation_ServiceRank() { return _serviceRankCode_NotInScopeRelation_ServiceRankMap; }
    public String keepServiceRankCode_NotInScopeRelation_ServiceRank(MbServiceRankCQ subQuery) {
        if (_serviceRankCode_NotInScopeRelation_ServiceRankMap == null) { _serviceRankCode_NotInScopeRelation_ServiceRankMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_serviceRankCode_NotInScopeRelation_ServiceRankMap.size() + 1);
        _serviceRankCode_NotInScopeRelation_ServiceRankMap.put(key, subQuery); return "serviceRankCode_NotInScopeRelation_ServiceRank." + key;
    }

    /** 
     * Add order-by as ascend. <br />
     * SERVICE_RANK_CODE: {IX, NotNull, CHAR(3), FK to SERVICE_RANK}
     * @return this. (NotNull)
     */
    public MbBsMemberServiceCQ addOrderBy_ServiceRankCode_Asc() { regOBA("SERVICE_RANK_CODE"); return this; }

    /**
     * Add order-by as descend. <br />
     * SERVICE_RANK_CODE: {IX, NotNull, CHAR(3), FK to SERVICE_RANK}
     * @return this. (NotNull)
     */
    public MbBsMemberServiceCQ addOrderBy_ServiceRankCode_Desc() { regOBD("SERVICE_RANK_CODE"); return this; }

    protected ConditionValue _registerDatetime;
    public ConditionValue getRegisterDatetime() {
        if (_registerDatetime == null) { _registerDatetime = nCV(); }
        return _registerDatetime;
    }
    protected ConditionValue getCValueRegisterDatetime() { return getRegisterDatetime(); }

    /** 
     * Add order-by as ascend. <br />
     * REGISTER_DATETIME: {NotNull, TIMESTAMP(23, 10)}
     * @return this. (NotNull)
     */
    public MbBsMemberServiceCQ addOrderBy_RegisterDatetime_Asc() { regOBA("REGISTER_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br />
     * REGISTER_DATETIME: {NotNull, TIMESTAMP(23, 10)}
     * @return this. (NotNull)
     */
    public MbBsMemberServiceCQ addOrderBy_RegisterDatetime_Desc() { regOBD("REGISTER_DATETIME"); return this; }

    protected ConditionValue _registerUser;
    public ConditionValue getRegisterUser() {
        if (_registerUser == null) { _registerUser = nCV(); }
        return _registerUser;
    }
    protected ConditionValue getCValueRegisterUser() { return getRegisterUser(); }

    /** 
     * Add order-by as ascend. <br />
     * REGISTER_USER: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public MbBsMemberServiceCQ addOrderBy_RegisterUser_Asc() { regOBA("REGISTER_USER"); return this; }

    /**
     * Add order-by as descend. <br />
     * REGISTER_USER: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public MbBsMemberServiceCQ addOrderBy_RegisterUser_Desc() { regOBD("REGISTER_USER"); return this; }

    protected ConditionValue _updateDatetime;
    public ConditionValue getUpdateDatetime() {
        if (_updateDatetime == null) { _updateDatetime = nCV(); }
        return _updateDatetime;
    }
    protected ConditionValue getCValueUpdateDatetime() { return getUpdateDatetime(); }

    /** 
     * Add order-by as ascend. <br />
     * UPDATE_DATETIME: {NotNull, TIMESTAMP(23, 10)}
     * @return this. (NotNull)
     */
    public MbBsMemberServiceCQ addOrderBy_UpdateDatetime_Asc() { regOBA("UPDATE_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br />
     * UPDATE_DATETIME: {NotNull, TIMESTAMP(23, 10)}
     * @return this. (NotNull)
     */
    public MbBsMemberServiceCQ addOrderBy_UpdateDatetime_Desc() { regOBD("UPDATE_DATETIME"); return this; }

    protected ConditionValue _updateUser;
    public ConditionValue getUpdateUser() {
        if (_updateUser == null) { _updateUser = nCV(); }
        return _updateUser;
    }
    protected ConditionValue getCValueUpdateUser() { return getUpdateUser(); }

    /** 
     * Add order-by as ascend. <br />
     * UPDATE_USER: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public MbBsMemberServiceCQ addOrderBy_UpdateUser_Asc() { regOBA("UPDATE_USER"); return this; }

    /**
     * Add order-by as descend. <br />
     * UPDATE_USER: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public MbBsMemberServiceCQ addOrderBy_UpdateUser_Desc() { regOBD("UPDATE_USER"); return this; }

    protected ConditionValue _versionNo;
    public ConditionValue getVersionNo() {
        if (_versionNo == null) { _versionNo = nCV(); }
        return _versionNo;
    }
    protected ConditionValue getCValueVersionNo() { return getVersionNo(); }

    /** 
     * Add order-by as ascend. <br />
     * VERSION_NO: {NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public MbBsMemberServiceCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br />
     * VERSION_NO: {NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public MbBsMemberServiceCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public MbBsMemberServiceCQ addSpecifiedDerivedOrderBy_Asc(String aliasName)
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
    public MbBsMemberServiceCQ addSpecifiedDerivedOrderBy_Desc(String aliasName)
    { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    protected void reflectRelationOnUnionQuery(ConditionQuery baseQueryAsSuper, ConditionQuery unionQueryAsSuper) {
        MbMemberServiceCQ baseQuery = (MbMemberServiceCQ)baseQueryAsSuper;
        MbMemberServiceCQ unionQuery = (MbMemberServiceCQ)unionQueryAsSuper;
        if (baseQuery.hasConditionQueryMember()) {
            unionQuery.queryMember().reflectRelationOnUnionQuery(baseQuery.queryMember(), unionQuery.queryMember());
        }
        if (baseQuery.hasConditionQueryServiceRank()) {
            unionQuery.queryServiceRank().reflectRelationOnUnionQuery(baseQuery.queryServiceRank(), unionQuery.queryServiceRank());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br />
     * MEMBER by my MEMBER_ID, named 'member'.
     * @return The instance of condition-query. (NotNull)
     */
    public MbMemberCQ queryMember() {
        return getConditionQueryMember();
    }
    protected MbMemberCQ _conditionQueryMember;
    public MbMemberCQ getConditionQueryMember() {
        if (_conditionQueryMember == null) {
            _conditionQueryMember = xcreateQueryMember();
            xsetupOuterJoinMember();
        }
        return _conditionQueryMember;
    }
    protected MbMemberCQ xcreateQueryMember() {
        String nrp = resolveNextRelationPath("MEMBER_SERVICE", "member");
        String jan = resolveJoinAliasName(nrp, xgetNextNestLevel());
        MbMemberCQ cq = new MbMemberCQ(this, xgetSqlClause(), jan, xgetNextNestLevel());
        cq.xsetBaseCB(_baseCB);
        cq.xsetForeignPropertyName("member");
        cq.xsetRelationPath(nrp); return cq;
    }
    protected void xsetupOuterJoinMember() {
        MbMemberCQ cq = getConditionQueryMember();
        Map<String, String> joinOnMap = newLinkedHashMapSized(4);
        joinOnMap.put("MEMBER_ID", "MEMBER_ID");
        registerOuterJoin(cq, joinOnMap, "member");
    }
    public boolean hasConditionQueryMember() {
        return _conditionQueryMember != null;
    }

    /**
     * Get the condition-query for relation table. <br />
     * SERVICE_RANK by my SERVICE_RANK_CODE, named 'serviceRank'.
     * @return The instance of condition-query. (NotNull)
     */
    public MbServiceRankCQ queryServiceRank() {
        return getConditionQueryServiceRank();
    }
    protected MbServiceRankCQ _conditionQueryServiceRank;
    public MbServiceRankCQ getConditionQueryServiceRank() {
        if (_conditionQueryServiceRank == null) {
            _conditionQueryServiceRank = xcreateQueryServiceRank();
            xsetupOuterJoinServiceRank();
        }
        return _conditionQueryServiceRank;
    }
    protected MbServiceRankCQ xcreateQueryServiceRank() {
        String nrp = resolveNextRelationPath("MEMBER_SERVICE", "serviceRank");
        String jan = resolveJoinAliasName(nrp, xgetNextNestLevel());
        MbServiceRankCQ cq = new MbServiceRankCQ(this, xgetSqlClause(), jan, xgetNextNestLevel());
        cq.xsetBaseCB(_baseCB);
        cq.xsetForeignPropertyName("serviceRank");
        cq.xsetRelationPath(nrp); return cq;
    }
    protected void xsetupOuterJoinServiceRank() {
        MbServiceRankCQ cq = getConditionQueryServiceRank();
        Map<String, String> joinOnMap = newLinkedHashMapSized(4);
        joinOnMap.put("SERVICE_RANK_CODE", "SERVICE_RANK_CODE");
        registerOuterJoin(cq, joinOnMap, "serviceRank");
    }
    public boolean hasConditionQueryServiceRank() {
        return _conditionQueryServiceRank != null;
    }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    protected Map<String, MbMemberServiceCQ> _scalarConditionMap;
    public Map<String, MbMemberServiceCQ> getScalarCondition() { return _scalarConditionMap; }
    public String keepScalarCondition(MbMemberServiceCQ subQuery) {
        if (_scalarConditionMap == null) { _scalarConditionMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_scalarConditionMap.size() + 1);
        _scalarConditionMap.put(key, subQuery); return "scalarCondition." + key;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    protected Map<String, MbMemberServiceCQ> _specifyMyselfDerivedMap;
    public Map<String, MbMemberServiceCQ> getSpecifyMyselfDerived() { return _specifyMyselfDerivedMap; }
    public String keepSpecifyMyselfDerived(MbMemberServiceCQ subQuery) {
        if (_specifyMyselfDerivedMap == null) { _specifyMyselfDerivedMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_specifyMyselfDerivedMap.size() + 1);
        _specifyMyselfDerivedMap.put(key, subQuery); return "specifyMyselfDerived." + key;
    }

    protected Map<String, MbMemberServiceCQ> _queryMyselfDerivedMap;
    public Map<String, MbMemberServiceCQ> getQueryMyselfDerived() { return _queryMyselfDerivedMap; }
    public String keepQueryMyselfDerived(MbMemberServiceCQ subQuery) {
        if (_queryMyselfDerivedMap == null) { _queryMyselfDerivedMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_queryMyselfDerivedMap.size() + 1);
        _queryMyselfDerivedMap.put(key, subQuery); return "queryMyselfDerived." + key;
    }
    protected Map<String, Object> _qyeryMyselfDerivedParameterMap;
    public Map<String, Object> getQueryMyselfDerivedParameter() { return _qyeryMyselfDerivedParameterMap; }
    public String keepQueryMyselfDerivedParameter(Object parameterValue) {
        if (_qyeryMyselfDerivedParameterMap == null) { _qyeryMyselfDerivedParameterMap = newLinkedHashMapSized(4); }
        String key = "subQueryParameterKey" + (_qyeryMyselfDerivedParameterMap.size() + 1);
        _qyeryMyselfDerivedParameterMap.put(key, parameterValue); return "queryMyselfDerivedParameter." + key;
    }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, MbMemberServiceCQ> _myselfExistsMap;
    public Map<String, MbMemberServiceCQ> getMyselfExists() { return _myselfExistsMap; }
    public String keepMyselfExists(MbMemberServiceCQ subQuery) {
        if (_myselfExistsMap == null) { _myselfExistsMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_myselfExistsMap.size() + 1);
        _myselfExistsMap.put(key, subQuery); return "myselfExists." + key;
    }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    protected Map<String, MbMemberServiceCQ> _myselfInScopeMap;
    public Map<String, MbMemberServiceCQ> getMyselfInScope() { return _myselfInScopeMap; }
    public String keepMyselfInScope(MbMemberServiceCQ subQuery) {
        if (_myselfInScopeMap == null) { _myselfInScopeMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_myselfInScopeMap.size() + 1);
        _myselfInScopeMap.put(key, subQuery); return "myselfInScope." + key;
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return MbMemberServiceCB.class.getName(); }
    protected String xCQ() { return MbMemberServiceCQ.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
