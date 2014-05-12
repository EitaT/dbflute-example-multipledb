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
 * The base condition-query of MEMBER_STATUS.
 * @author DBFlute(AutoGenerator)
 */
public class MbBsMemberStatusCQ extends MbAbstractBsMemberStatusCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected MbMemberStatusCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public MbBsMemberStatusCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from MEMBER_STATUS) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public MbMemberStatusCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected MbMemberStatusCIQ xcreateCIQ() {
        MbMemberStatusCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected MbMemberStatusCIQ xnewCIQ() {
        return new MbMemberStatusCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join MEMBER_STATUS on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public MbMemberStatusCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        MbMemberStatusCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected ConditionValue _memberStatusCode;
    public ConditionValue getMemberStatusCode() {
        if (_memberStatusCode == null) { _memberStatusCode = nCV(); }
        return _memberStatusCode;
    }
    protected ConditionValue getCValueMemberStatusCode() { return getMemberStatusCode(); }

    protected Map<String, MbMemberCQ> _memberStatusCode_ExistsReferrer_MemberListMap;
    public Map<String, MbMemberCQ> getMemberStatusCode_ExistsReferrer_MemberList() { return _memberStatusCode_ExistsReferrer_MemberListMap; }
    public String keepMemberStatusCode_ExistsReferrer_MemberList(MbMemberCQ sq) {
        if (_memberStatusCode_ExistsReferrer_MemberListMap == null) { _memberStatusCode_ExistsReferrer_MemberListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_memberStatusCode_ExistsReferrer_MemberListMap.size() + 1);
        _memberStatusCode_ExistsReferrer_MemberListMap.put(ky, sq); return "memberStatusCode_ExistsReferrer_MemberList." + ky;
    }

    protected Map<String, MbMemberLoginCQ> _memberStatusCode_ExistsReferrer_MemberLoginListMap;
    public Map<String, MbMemberLoginCQ> getMemberStatusCode_ExistsReferrer_MemberLoginList() { return _memberStatusCode_ExistsReferrer_MemberLoginListMap; }
    public String keepMemberStatusCode_ExistsReferrer_MemberLoginList(MbMemberLoginCQ sq) {
        if (_memberStatusCode_ExistsReferrer_MemberLoginListMap == null) { _memberStatusCode_ExistsReferrer_MemberLoginListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_memberStatusCode_ExistsReferrer_MemberLoginListMap.size() + 1);
        _memberStatusCode_ExistsReferrer_MemberLoginListMap.put(ky, sq); return "memberStatusCode_ExistsReferrer_MemberLoginList." + ky;
    }

    protected Map<String, MbMemberCQ> _memberStatusCode_NotExistsReferrer_MemberListMap;
    public Map<String, MbMemberCQ> getMemberStatusCode_NotExistsReferrer_MemberList() { return _memberStatusCode_NotExistsReferrer_MemberListMap; }
    public String keepMemberStatusCode_NotExistsReferrer_MemberList(MbMemberCQ sq) {
        if (_memberStatusCode_NotExistsReferrer_MemberListMap == null) { _memberStatusCode_NotExistsReferrer_MemberListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_memberStatusCode_NotExistsReferrer_MemberListMap.size() + 1);
        _memberStatusCode_NotExistsReferrer_MemberListMap.put(ky, sq); return "memberStatusCode_NotExistsReferrer_MemberList." + ky;
    }

    protected Map<String, MbMemberLoginCQ> _memberStatusCode_NotExistsReferrer_MemberLoginListMap;
    public Map<String, MbMemberLoginCQ> getMemberStatusCode_NotExistsReferrer_MemberLoginList() { return _memberStatusCode_NotExistsReferrer_MemberLoginListMap; }
    public String keepMemberStatusCode_NotExistsReferrer_MemberLoginList(MbMemberLoginCQ sq) {
        if (_memberStatusCode_NotExistsReferrer_MemberLoginListMap == null) { _memberStatusCode_NotExistsReferrer_MemberLoginListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_memberStatusCode_NotExistsReferrer_MemberLoginListMap.size() + 1);
        _memberStatusCode_NotExistsReferrer_MemberLoginListMap.put(ky, sq); return "memberStatusCode_NotExistsReferrer_MemberLoginList." + ky;
    }

    protected Map<String, MbMemberCQ> _memberStatusCode_InScopeRelation_MemberListMap;
    public Map<String, MbMemberCQ> getMemberStatusCode_InScopeRelation_MemberList() { return _memberStatusCode_InScopeRelation_MemberListMap; }
    public String keepMemberStatusCode_InScopeRelation_MemberList(MbMemberCQ sq) {
        if (_memberStatusCode_InScopeRelation_MemberListMap == null) { _memberStatusCode_InScopeRelation_MemberListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_memberStatusCode_InScopeRelation_MemberListMap.size() + 1);
        _memberStatusCode_InScopeRelation_MemberListMap.put(ky, sq); return "memberStatusCode_InScopeRelation_MemberList." + ky;
    }

    protected Map<String, MbMemberLoginCQ> _memberStatusCode_InScopeRelation_MemberLoginListMap;
    public Map<String, MbMemberLoginCQ> getMemberStatusCode_InScopeRelation_MemberLoginList() { return _memberStatusCode_InScopeRelation_MemberLoginListMap; }
    public String keepMemberStatusCode_InScopeRelation_MemberLoginList(MbMemberLoginCQ sq) {
        if (_memberStatusCode_InScopeRelation_MemberLoginListMap == null) { _memberStatusCode_InScopeRelation_MemberLoginListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_memberStatusCode_InScopeRelation_MemberLoginListMap.size() + 1);
        _memberStatusCode_InScopeRelation_MemberLoginListMap.put(ky, sq); return "memberStatusCode_InScopeRelation_MemberLoginList." + ky;
    }

    protected Map<String, MbMemberCQ> _memberStatusCode_NotInScopeRelation_MemberListMap;
    public Map<String, MbMemberCQ> getMemberStatusCode_NotInScopeRelation_MemberList() { return _memberStatusCode_NotInScopeRelation_MemberListMap; }
    public String keepMemberStatusCode_NotInScopeRelation_MemberList(MbMemberCQ sq) {
        if (_memberStatusCode_NotInScopeRelation_MemberListMap == null) { _memberStatusCode_NotInScopeRelation_MemberListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_memberStatusCode_NotInScopeRelation_MemberListMap.size() + 1);
        _memberStatusCode_NotInScopeRelation_MemberListMap.put(ky, sq); return "memberStatusCode_NotInScopeRelation_MemberList." + ky;
    }

    protected Map<String, MbMemberLoginCQ> _memberStatusCode_NotInScopeRelation_MemberLoginListMap;
    public Map<String, MbMemberLoginCQ> getMemberStatusCode_NotInScopeRelation_MemberLoginList() { return _memberStatusCode_NotInScopeRelation_MemberLoginListMap; }
    public String keepMemberStatusCode_NotInScopeRelation_MemberLoginList(MbMemberLoginCQ sq) {
        if (_memberStatusCode_NotInScopeRelation_MemberLoginListMap == null) { _memberStatusCode_NotInScopeRelation_MemberLoginListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_memberStatusCode_NotInScopeRelation_MemberLoginListMap.size() + 1);
        _memberStatusCode_NotInScopeRelation_MemberLoginListMap.put(ky, sq); return "memberStatusCode_NotInScopeRelation_MemberLoginList." + ky;
    }

    protected Map<String, MbMemberCQ> _memberStatusCode_SpecifyDerivedReferrer_MemberListMap;
    public Map<String, MbMemberCQ> getMemberStatusCode_SpecifyDerivedReferrer_MemberList() { return _memberStatusCode_SpecifyDerivedReferrer_MemberListMap; }
    public String keepMemberStatusCode_SpecifyDerivedReferrer_MemberList(MbMemberCQ sq) {
        if (_memberStatusCode_SpecifyDerivedReferrer_MemberListMap == null) { _memberStatusCode_SpecifyDerivedReferrer_MemberListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_memberStatusCode_SpecifyDerivedReferrer_MemberListMap.size() + 1);
        _memberStatusCode_SpecifyDerivedReferrer_MemberListMap.put(ky, sq); return "memberStatusCode_SpecifyDerivedReferrer_MemberList." + ky;
    }

    protected Map<String, MbMemberLoginCQ> _memberStatusCode_SpecifyDerivedReferrer_MemberLoginListMap;
    public Map<String, MbMemberLoginCQ> getMemberStatusCode_SpecifyDerivedReferrer_MemberLoginList() { return _memberStatusCode_SpecifyDerivedReferrer_MemberLoginListMap; }
    public String keepMemberStatusCode_SpecifyDerivedReferrer_MemberLoginList(MbMemberLoginCQ sq) {
        if (_memberStatusCode_SpecifyDerivedReferrer_MemberLoginListMap == null) { _memberStatusCode_SpecifyDerivedReferrer_MemberLoginListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_memberStatusCode_SpecifyDerivedReferrer_MemberLoginListMap.size() + 1);
        _memberStatusCode_SpecifyDerivedReferrer_MemberLoginListMap.put(ky, sq); return "memberStatusCode_SpecifyDerivedReferrer_MemberLoginList." + ky;
    }

    protected Map<String, MbMemberCQ> _memberStatusCode_QueryDerivedReferrer_MemberListMap;
    public Map<String, MbMemberCQ> getMemberStatusCode_QueryDerivedReferrer_MemberList() { return _memberStatusCode_QueryDerivedReferrer_MemberListMap; }
    public String keepMemberStatusCode_QueryDerivedReferrer_MemberList(MbMemberCQ sq) {
        if (_memberStatusCode_QueryDerivedReferrer_MemberListMap == null) { _memberStatusCode_QueryDerivedReferrer_MemberListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_memberStatusCode_QueryDerivedReferrer_MemberListMap.size() + 1);
        _memberStatusCode_QueryDerivedReferrer_MemberListMap.put(ky, sq); return "memberStatusCode_QueryDerivedReferrer_MemberList." + ky;
    }
    protected Map<String, Object> _memberStatusCode_QueryDerivedReferrer_MemberListParameterMap;
    public Map<String, Object> getMemberStatusCode_QueryDerivedReferrer_MemberListParameter() { return _memberStatusCode_QueryDerivedReferrer_MemberListParameterMap; }
    public String keepMemberStatusCode_QueryDerivedReferrer_MemberListParameter(Object vl) {
        if (_memberStatusCode_QueryDerivedReferrer_MemberListParameterMap == null) { _memberStatusCode_QueryDerivedReferrer_MemberListParameterMap = newLinkedHashMapSized(4); }
        String ky = "subQueryParameterKey" + (_memberStatusCode_QueryDerivedReferrer_MemberListParameterMap.size() + 1);
        _memberStatusCode_QueryDerivedReferrer_MemberListParameterMap.put(ky, vl); return "memberStatusCode_QueryDerivedReferrer_MemberListParameter." + ky;
    }

    protected Map<String, MbMemberLoginCQ> _memberStatusCode_QueryDerivedReferrer_MemberLoginListMap;
    public Map<String, MbMemberLoginCQ> getMemberStatusCode_QueryDerivedReferrer_MemberLoginList() { return _memberStatusCode_QueryDerivedReferrer_MemberLoginListMap; }
    public String keepMemberStatusCode_QueryDerivedReferrer_MemberLoginList(MbMemberLoginCQ sq) {
        if (_memberStatusCode_QueryDerivedReferrer_MemberLoginListMap == null) { _memberStatusCode_QueryDerivedReferrer_MemberLoginListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_memberStatusCode_QueryDerivedReferrer_MemberLoginListMap.size() + 1);
        _memberStatusCode_QueryDerivedReferrer_MemberLoginListMap.put(ky, sq); return "memberStatusCode_QueryDerivedReferrer_MemberLoginList." + ky;
    }
    protected Map<String, Object> _memberStatusCode_QueryDerivedReferrer_MemberLoginListParameterMap;
    public Map<String, Object> getMemberStatusCode_QueryDerivedReferrer_MemberLoginListParameter() { return _memberStatusCode_QueryDerivedReferrer_MemberLoginListParameterMap; }
    public String keepMemberStatusCode_QueryDerivedReferrer_MemberLoginListParameter(Object vl) {
        if (_memberStatusCode_QueryDerivedReferrer_MemberLoginListParameterMap == null) { _memberStatusCode_QueryDerivedReferrer_MemberLoginListParameterMap = newLinkedHashMapSized(4); }
        String ky = "subQueryParameterKey" + (_memberStatusCode_QueryDerivedReferrer_MemberLoginListParameterMap.size() + 1);
        _memberStatusCode_QueryDerivedReferrer_MemberLoginListParameterMap.put(ky, vl); return "memberStatusCode_QueryDerivedReferrer_MemberLoginListParameter." + ky;
    }

    /** 
     * Add order-by as ascend. <br />
     * MEMBER_STATUS_CODE: {PK, NotNull, CHAR(3), classification=MemberStatus}
     * @return this. (NotNull)
     */
    public MbBsMemberStatusCQ addOrderBy_MemberStatusCode_Asc() { regOBA("MEMBER_STATUS_CODE"); return this; }

    /**
     * Add order-by as descend. <br />
     * MEMBER_STATUS_CODE: {PK, NotNull, CHAR(3), classification=MemberStatus}
     * @return this. (NotNull)
     */
    public MbBsMemberStatusCQ addOrderBy_MemberStatusCode_Desc() { regOBD("MEMBER_STATUS_CODE"); return this; }

    protected ConditionValue _memberStatusName;
    public ConditionValue getMemberStatusName() {
        if (_memberStatusName == null) { _memberStatusName = nCV(); }
        return _memberStatusName;
    }
    protected ConditionValue getCValueMemberStatusName() { return getMemberStatusName(); }

    /** 
     * Add order-by as ascend. <br />
     * MEMBER_STATUS_NAME: {NotNull, VARCHAR(50)}
     * @return this. (NotNull)
     */
    public MbBsMemberStatusCQ addOrderBy_MemberStatusName_Asc() { regOBA("MEMBER_STATUS_NAME"); return this; }

    /**
     * Add order-by as descend. <br />
     * MEMBER_STATUS_NAME: {NotNull, VARCHAR(50)}
     * @return this. (NotNull)
     */
    public MbBsMemberStatusCQ addOrderBy_MemberStatusName_Desc() { regOBD("MEMBER_STATUS_NAME"); return this; }

    protected ConditionValue _description;
    public ConditionValue getDescription() {
        if (_description == null) { _description = nCV(); }
        return _description;
    }
    protected ConditionValue getCValueDescription() { return getDescription(); }

    /** 
     * Add order-by as ascend. <br />
     * DESCRIPTION: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public MbBsMemberStatusCQ addOrderBy_Description_Asc() { regOBA("DESCRIPTION"); return this; }

    /**
     * Add order-by as descend. <br />
     * DESCRIPTION: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public MbBsMemberStatusCQ addOrderBy_Description_Desc() { regOBD("DESCRIPTION"); return this; }

    protected ConditionValue _displayOrder;
    public ConditionValue getDisplayOrder() {
        if (_displayOrder == null) { _displayOrder = nCV(); }
        return _displayOrder;
    }
    protected ConditionValue getCValueDisplayOrder() { return getDisplayOrder(); }

    /** 
     * Add order-by as ascend. <br />
     * DISPLAY_ORDER: {UQ, NotNull, INTEGER(10)}
     * @return this. (NotNull)
     */
    public MbBsMemberStatusCQ addOrderBy_DisplayOrder_Asc() { regOBA("DISPLAY_ORDER"); return this; }

    /**
     * Add order-by as descend. <br />
     * DISPLAY_ORDER: {UQ, NotNull, INTEGER(10)}
     * @return this. (NotNull)
     */
    public MbBsMemberStatusCQ addOrderBy_DisplayOrder_Desc() { regOBD("DISPLAY_ORDER"); return this; }

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
    public MbBsMemberStatusCQ addSpecifiedDerivedOrderBy_Asc(String aliasName)
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
    public MbBsMemberStatusCQ addSpecifiedDerivedOrderBy_Desc(String aliasName)
    { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    protected void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
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
    protected Map<String, MbMemberStatusCQ> _scalarConditionMap;
    public Map<String, MbMemberStatusCQ> getScalarCondition() { return _scalarConditionMap; }
    public String keepScalarCondition(MbMemberStatusCQ sq) {
        if (_scalarConditionMap == null) { _scalarConditionMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_scalarConditionMap.size() + 1);
        _scalarConditionMap.put(ky, sq); return "scalarCondition." + ky;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    protected Map<String, MbMemberStatusCQ> _specifyMyselfDerivedMap;
    public Map<String, MbMemberStatusCQ> getSpecifyMyselfDerived() { return _specifyMyselfDerivedMap; }
    public String keepSpecifyMyselfDerived(MbMemberStatusCQ sq) {
        if (_specifyMyselfDerivedMap == null) { _specifyMyselfDerivedMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_specifyMyselfDerivedMap.size() + 1);
        _specifyMyselfDerivedMap.put(ky, sq); return "specifyMyselfDerived." + ky;
    }

    protected Map<String, MbMemberStatusCQ> _queryMyselfDerivedMap;
    public Map<String, MbMemberStatusCQ> getQueryMyselfDerived() { return _queryMyselfDerivedMap; }
    public String keepQueryMyselfDerived(MbMemberStatusCQ sq) {
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
    protected Map<String, MbMemberStatusCQ> _myselfExistsMap;
    public Map<String, MbMemberStatusCQ> getMyselfExists() { return _myselfExistsMap; }
    public String keepMyselfExists(MbMemberStatusCQ sq) {
        if (_myselfExistsMap == null) { _myselfExistsMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_myselfExistsMap.size() + 1);
        _myselfExistsMap.put(ky, sq); return "myselfExists." + ky;
    }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    protected Map<String, MbMemberStatusCQ> _myselfInScopeMap;
    public Map<String, MbMemberStatusCQ> getMyselfInScope() { return _myselfInScopeMap; }
    public String keepMyselfInScope(MbMemberStatusCQ sq) {
        if (_myselfInScopeMap == null) { _myselfInScopeMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_myselfInScopeMap.size() + 1);
        _myselfInScopeMap.put(ky, sq); return "myselfInScope." + ky;
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return MbMemberStatusCB.class.getName(); }
    protected String xCQ() { return MbMemberStatusCQ.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
