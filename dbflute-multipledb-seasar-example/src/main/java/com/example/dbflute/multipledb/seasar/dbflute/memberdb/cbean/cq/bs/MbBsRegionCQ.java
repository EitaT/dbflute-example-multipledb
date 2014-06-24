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
 * The base condition-query of REGION.
 * @author DBFlute(AutoGenerator)
 */
public class MbBsRegionCQ extends MbAbstractBsRegionCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected MbRegionCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public MbBsRegionCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from REGION) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public MbRegionCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected MbRegionCIQ xcreateCIQ() {
        MbRegionCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected MbRegionCIQ xnewCIQ() {
        return new MbRegionCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join REGION on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public MbRegionCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        MbRegionCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _regionId;
    public ConditionValue getRegionId()
    { if (_regionId == null) { _regionId = nCV(); }
      return _regionId; }
    protected ConditionValue getCValueRegionId() { return getRegionId(); }

    public Map<String, MbMemberAddressCQ> getRegionId_ExistsReferrer_MemberAddressList() { return xgetSQueMap("regionId_ExistsReferrer_MemberAddressList"); }
    public String keepRegionId_ExistsReferrer_MemberAddressList(MbMemberAddressCQ sq) { return xkeepSQue("regionId_ExistsReferrer_MemberAddressList", sq); }

    public Map<String, MbMemberAddressCQ> getRegionId_NotExistsReferrer_MemberAddressList() { return xgetSQueMap("regionId_NotExistsReferrer_MemberAddressList"); }
    public String keepRegionId_NotExistsReferrer_MemberAddressList(MbMemberAddressCQ sq) { return xkeepSQue("regionId_NotExistsReferrer_MemberAddressList", sq); }

    public Map<String, MbMemberAddressCQ> getRegionId_SpecifyDerivedReferrer_MemberAddressList() { return xgetSQueMap("regionId_SpecifyDerivedReferrer_MemberAddressList"); }
    public String keepRegionId_SpecifyDerivedReferrer_MemberAddressList(MbMemberAddressCQ sq) { return xkeepSQue("regionId_SpecifyDerivedReferrer_MemberAddressList", sq); }

    public Map<String, MbMemberAddressCQ> getRegionId_InScopeRelation_MemberAddressList() { return xgetSQueMap("regionId_InScopeRelation_MemberAddressList"); }
    public String keepRegionId_InScopeRelation_MemberAddressList(MbMemberAddressCQ sq) { return xkeepSQue("regionId_InScopeRelation_MemberAddressList", sq); }

    public Map<String, MbMemberAddressCQ> getRegionId_NotInScopeRelation_MemberAddressList() { return xgetSQueMap("regionId_NotInScopeRelation_MemberAddressList"); }
    public String keepRegionId_NotInScopeRelation_MemberAddressList(MbMemberAddressCQ sq) { return xkeepSQue("regionId_NotInScopeRelation_MemberAddressList", sq); }

    public Map<String, MbMemberAddressCQ> getRegionId_QueryDerivedReferrer_MemberAddressList() { return xgetSQueMap("regionId_QueryDerivedReferrer_MemberAddressList"); }
    public String keepRegionId_QueryDerivedReferrer_MemberAddressList(MbMemberAddressCQ sq) { return xkeepSQue("regionId_QueryDerivedReferrer_MemberAddressList", sq); }
    public Map<String, Object> getRegionId_QueryDerivedReferrer_MemberAddressListParameter() { return xgetSQuePmMap("regionId_QueryDerivedReferrer_MemberAddressList"); }
    public String keepRegionId_QueryDerivedReferrer_MemberAddressListParameter(Object pm) { return xkeepSQuePm("regionId_QueryDerivedReferrer_MemberAddressList", pm); }

    /** 
     * Add order-by as ascend. <br />
     * REGION_ID: {PK, NotNull, INTEGER(10)}
     * @return this. (NotNull)
     */
    public MbBsRegionCQ addOrderBy_RegionId_Asc() { regOBA("REGION_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * REGION_ID: {PK, NotNull, INTEGER(10)}
     * @return this. (NotNull)
     */
    public MbBsRegionCQ addOrderBy_RegionId_Desc() { regOBD("REGION_ID"); return this; }

    protected ConditionValue _regionName;
    public ConditionValue getRegionName()
    { if (_regionName == null) { _regionName = nCV(); }
      return _regionName; }
    protected ConditionValue getCValueRegionName() { return getRegionName(); }

    /** 
     * Add order-by as ascend. <br />
     * REGION_NAME: {NotNull, VARCHAR(50)}
     * @return this. (NotNull)
     */
    public MbBsRegionCQ addOrderBy_RegionName_Asc() { regOBA("REGION_NAME"); return this; }

    /**
     * Add order-by as descend. <br />
     * REGION_NAME: {NotNull, VARCHAR(50)}
     * @return this. (NotNull)
     */
    public MbBsRegionCQ addOrderBy_RegionName_Desc() { regOBD("REGION_NAME"); return this; }

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
    public MbBsRegionCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public MbBsRegionCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, MbRegionCQ> getScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(MbRegionCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, MbRegionCQ> getSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(MbRegionCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, MbRegionCQ> getQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(MbRegionCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> getQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, MbRegionCQ> _myselfExistsMap;
    public Map<String, MbRegionCQ> getMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(MbRegionCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, MbRegionCQ> getMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(MbRegionCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return MbRegionCB.class.getName(); }
    protected String xCQ() { return MbRegionCQ.class.getName(); }
    protected String xCHp() { return HpCalculator.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
