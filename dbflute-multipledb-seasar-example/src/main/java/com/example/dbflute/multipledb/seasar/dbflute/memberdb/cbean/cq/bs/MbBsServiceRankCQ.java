package com.example.dbflute.multipledb.seasar.dbflute.memberdb.cbean.cq.bs;

import java.util.Map;

import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.cbean.chelper.*;
import org.seasar.dbflute.cbean.coption.*;
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import org.seasar.dbflute.exception.IllegalConditionBeanOperationException;
import com.example.dbflute.multipledb.seasar.dbflute.memberdb.cbean.cq.ciq.*;
import com.example.dbflute.multipledb.seasar.dbflute.memberdb.cbean.*;
import com.example.dbflute.multipledb.seasar.dbflute.memberdb.cbean.cq.*;

/**
 * The base condition-query of SERVICE_RANK.
 * @author DBFlute(AutoGenerator)
 */
public class MbBsServiceRankCQ extends MbAbstractBsServiceRankCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected MbServiceRankCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public MbBsServiceRankCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from SERVICE_RANK) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public MbServiceRankCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected MbServiceRankCIQ xcreateCIQ() {
        MbServiceRankCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected MbServiceRankCIQ xnewCIQ() {
        return new MbServiceRankCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join SERVICE_RANK on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public MbServiceRankCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        MbServiceRankCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _serviceRankCode;
    public ConditionValue getServiceRankCode()
    { if (_serviceRankCode == null) { _serviceRankCode = nCV(); }
      return _serviceRankCode; }
    protected ConditionValue getCValueServiceRankCode() { return getServiceRankCode(); }

    public Map<String, MbMemberServiceCQ> getServiceRankCode_ExistsReferrer_MemberServiceList() { return xgetSQueMap("serviceRankCode_ExistsReferrer_MemberServiceList"); }
    public String keepServiceRankCode_ExistsReferrer_MemberServiceList(MbMemberServiceCQ sq) { return xkeepSQue("serviceRankCode_ExistsReferrer_MemberServiceList", sq); }

    public Map<String, MbMemberServiceCQ> getServiceRankCode_NotExistsReferrer_MemberServiceList() { return xgetSQueMap("serviceRankCode_NotExistsReferrer_MemberServiceList"); }
    public String keepServiceRankCode_NotExistsReferrer_MemberServiceList(MbMemberServiceCQ sq) { return xkeepSQue("serviceRankCode_NotExistsReferrer_MemberServiceList", sq); }

    public Map<String, MbMemberServiceCQ> getServiceRankCode_InScopeRelation_MemberServiceList() { return xgetSQueMap("serviceRankCode_InScopeRelation_MemberServiceList"); }
    public String keepServiceRankCode_InScopeRelation_MemberServiceList(MbMemberServiceCQ sq) { return xkeepSQue("serviceRankCode_InScopeRelation_MemberServiceList", sq); }

    public Map<String, MbMemberServiceCQ> getServiceRankCode_NotInScopeRelation_MemberServiceList() { return xgetSQueMap("serviceRankCode_NotInScopeRelation_MemberServiceList"); }
    public String keepServiceRankCode_NotInScopeRelation_MemberServiceList(MbMemberServiceCQ sq) { return xkeepSQue("serviceRankCode_NotInScopeRelation_MemberServiceList", sq); }

    public Map<String, MbMemberServiceCQ> getServiceRankCode_SpecifyDerivedReferrer_MemberServiceList() { return xgetSQueMap("serviceRankCode_SpecifyDerivedReferrer_MemberServiceList"); }
    public String keepServiceRankCode_SpecifyDerivedReferrer_MemberServiceList(MbMemberServiceCQ sq) { return xkeepSQue("serviceRankCode_SpecifyDerivedReferrer_MemberServiceList", sq); }

    public Map<String, MbMemberServiceCQ> getServiceRankCode_QueryDerivedReferrer_MemberServiceList() { return xgetSQueMap("serviceRankCode_QueryDerivedReferrer_MemberServiceList"); }
    public String keepServiceRankCode_QueryDerivedReferrer_MemberServiceList(MbMemberServiceCQ sq) { return xkeepSQue("serviceRankCode_QueryDerivedReferrer_MemberServiceList", sq); }
    public Map<String, Object> getServiceRankCode_QueryDerivedReferrer_MemberServiceListParameter() { return xgetSQuePmMap("serviceRankCode_QueryDerivedReferrer_MemberServiceList"); }
    public String keepServiceRankCode_QueryDerivedReferrer_MemberServiceListParameter(Object pm) { return xkeepSQuePm("serviceRankCode_QueryDerivedReferrer_MemberServiceList", pm); }

    /** 
     * Add order-by as ascend. <br />
     * SERVICE_RANK_CODE: {PK, NotNull, CHAR(3)}
     * @return this. (NotNull)
     */
    public MbBsServiceRankCQ addOrderBy_ServiceRankCode_Asc() { regOBA("SERVICE_RANK_CODE"); return this; }

    /**
     * Add order-by as descend. <br />
     * SERVICE_RANK_CODE: {PK, NotNull, CHAR(3)}
     * @return this. (NotNull)
     */
    public MbBsServiceRankCQ addOrderBy_ServiceRankCode_Desc() { regOBD("SERVICE_RANK_CODE"); return this; }

    protected ConditionValue _serviceRankName;
    public ConditionValue getServiceRankName()
    { if (_serviceRankName == null) { _serviceRankName = nCV(); }
      return _serviceRankName; }
    protected ConditionValue getCValueServiceRankName() { return getServiceRankName(); }

    /** 
     * Add order-by as ascend. <br />
     * SERVICE_RANK_NAME: {NotNull, VARCHAR(50)}
     * @return this. (NotNull)
     */
    public MbBsServiceRankCQ addOrderBy_ServiceRankName_Asc() { regOBA("SERVICE_RANK_NAME"); return this; }

    /**
     * Add order-by as descend. <br />
     * SERVICE_RANK_NAME: {NotNull, VARCHAR(50)}
     * @return this. (NotNull)
     */
    public MbBsServiceRankCQ addOrderBy_ServiceRankName_Desc() { regOBD("SERVICE_RANK_NAME"); return this; }

    protected ConditionValue _servicePointIncidence;
    public ConditionValue getServicePointIncidence()
    { if (_servicePointIncidence == null) { _servicePointIncidence = nCV(); }
      return _servicePointIncidence; }
    protected ConditionValue getCValueServicePointIncidence() { return getServicePointIncidence(); }

    /** 
     * Add order-by as ascend. <br />
     * SERVICE_POINT_INCIDENCE: {NotNull, DECIMAL(5, 3)}
     * @return this. (NotNull)
     */
    public MbBsServiceRankCQ addOrderBy_ServicePointIncidence_Asc() { regOBA("SERVICE_POINT_INCIDENCE"); return this; }

    /**
     * Add order-by as descend. <br />
     * SERVICE_POINT_INCIDENCE: {NotNull, DECIMAL(5, 3)}
     * @return this. (NotNull)
     */
    public MbBsServiceRankCQ addOrderBy_ServicePointIncidence_Desc() { regOBD("SERVICE_POINT_INCIDENCE"); return this; }

    protected ConditionValue _newAcceptableFlg;
    public ConditionValue getNewAcceptableFlg()
    { if (_newAcceptableFlg == null) { _newAcceptableFlg = nCV(); }
      return _newAcceptableFlg; }
    protected ConditionValue getCValueNewAcceptableFlg() { return getNewAcceptableFlg(); }

    /** 
     * Add order-by as ascend. <br />
     * NEW_ACCEPTABLE_FLG: {NotNull, INTEGER(10), classification=Flg}
     * @return this. (NotNull)
     */
    public MbBsServiceRankCQ addOrderBy_NewAcceptableFlg_Asc() { regOBA("NEW_ACCEPTABLE_FLG"); return this; }

    /**
     * Add order-by as descend. <br />
     * NEW_ACCEPTABLE_FLG: {NotNull, INTEGER(10), classification=Flg}
     * @return this. (NotNull)
     */
    public MbBsServiceRankCQ addOrderBy_NewAcceptableFlg_Desc() { regOBD("NEW_ACCEPTABLE_FLG"); return this; }

    protected ConditionValue _description;
    public ConditionValue getDescription()
    { if (_description == null) { _description = nCV(); }
      return _description; }
    protected ConditionValue getCValueDescription() { return getDescription(); }

    /** 
     * Add order-by as ascend. <br />
     * DESCRIPTION: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public MbBsServiceRankCQ addOrderBy_Description_Asc() { regOBA("DESCRIPTION"); return this; }

    /**
     * Add order-by as descend. <br />
     * DESCRIPTION: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public MbBsServiceRankCQ addOrderBy_Description_Desc() { regOBD("DESCRIPTION"); return this; }

    protected ConditionValue _displayOrder;
    public ConditionValue getDisplayOrder()
    { if (_displayOrder == null) { _displayOrder = nCV(); }
      return _displayOrder; }
    protected ConditionValue getCValueDisplayOrder() { return getDisplayOrder(); }

    /** 
     * Add order-by as ascend. <br />
     * DISPLAY_ORDER: {UQ, NotNull, INTEGER(10)}
     * @return this. (NotNull)
     */
    public MbBsServiceRankCQ addOrderBy_DisplayOrder_Asc() { regOBA("DISPLAY_ORDER"); return this; }

    /**
     * Add order-by as descend. <br />
     * DISPLAY_ORDER: {UQ, NotNull, INTEGER(10)}
     * @return this. (NotNull)
     */
    public MbBsServiceRankCQ addOrderBy_DisplayOrder_Desc() { regOBD("DISPLAY_ORDER"); return this; }

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
    public MbBsServiceRankCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public MbBsServiceRankCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, MbServiceRankCQ> getScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(MbServiceRankCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, MbServiceRankCQ> getSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(MbServiceRankCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, MbServiceRankCQ> getQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(MbServiceRankCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> getQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, MbServiceRankCQ> _myselfExistsMap;
    public Map<String, MbServiceRankCQ> getMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(MbServiceRankCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, MbServiceRankCQ> getMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(MbServiceRankCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return MbServiceRankCB.class.getName(); }
    protected String xCQ() { return MbServiceRankCQ.class.getName(); }
    protected String xCHp() { return HpCalculator.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
