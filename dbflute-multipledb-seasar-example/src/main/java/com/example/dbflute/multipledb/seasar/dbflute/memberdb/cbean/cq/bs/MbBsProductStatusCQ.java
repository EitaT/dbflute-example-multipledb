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
 * The base condition-query of PRODUCT_STATUS.
 * @author DBFlute(AutoGenerator)
 */
public class MbBsProductStatusCQ extends MbAbstractBsProductStatusCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected MbProductStatusCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public MbBsProductStatusCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from PRODUCT_STATUS) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public MbProductStatusCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected MbProductStatusCIQ xcreateCIQ() {
        MbProductStatusCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected MbProductStatusCIQ xnewCIQ() {
        return new MbProductStatusCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join PRODUCT_STATUS on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public MbProductStatusCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        MbProductStatusCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _productStatusCode;
    public ConditionValue getProductStatusCode()
    { if (_productStatusCode == null) { _productStatusCode = nCV(); }
      return _productStatusCode; }
    protected ConditionValue getCValueProductStatusCode() { return getProductStatusCode(); }

    public Map<String, MbProductCQ> getProductStatusCode_ExistsReferrer_ProductList() { return xgetSQueMap("productStatusCode_ExistsReferrer_ProductList"); }
    public String keepProductStatusCode_ExistsReferrer_ProductList(MbProductCQ sq) { return xkeepSQue("productStatusCode_ExistsReferrer_ProductList", sq); }

    public Map<String, MbProductCQ> getProductStatusCode_NotExistsReferrer_ProductList() { return xgetSQueMap("productStatusCode_NotExistsReferrer_ProductList"); }
    public String keepProductStatusCode_NotExistsReferrer_ProductList(MbProductCQ sq) { return xkeepSQue("productStatusCode_NotExistsReferrer_ProductList", sq); }

    public Map<String, MbProductCQ> getProductStatusCode_InScopeRelation_ProductList() { return xgetSQueMap("productStatusCode_InScopeRelation_ProductList"); }
    public String keepProductStatusCode_InScopeRelation_ProductList(MbProductCQ sq) { return xkeepSQue("productStatusCode_InScopeRelation_ProductList", sq); }

    public Map<String, MbProductCQ> getProductStatusCode_NotInScopeRelation_ProductList() { return xgetSQueMap("productStatusCode_NotInScopeRelation_ProductList"); }
    public String keepProductStatusCode_NotInScopeRelation_ProductList(MbProductCQ sq) { return xkeepSQue("productStatusCode_NotInScopeRelation_ProductList", sq); }

    public Map<String, MbProductCQ> getProductStatusCode_SpecifyDerivedReferrer_ProductList() { return xgetSQueMap("productStatusCode_SpecifyDerivedReferrer_ProductList"); }
    public String keepProductStatusCode_SpecifyDerivedReferrer_ProductList(MbProductCQ sq) { return xkeepSQue("productStatusCode_SpecifyDerivedReferrer_ProductList", sq); }

    public Map<String, MbProductCQ> getProductStatusCode_QueryDerivedReferrer_ProductList() { return xgetSQueMap("productStatusCode_QueryDerivedReferrer_ProductList"); }
    public String keepProductStatusCode_QueryDerivedReferrer_ProductList(MbProductCQ sq) { return xkeepSQue("productStatusCode_QueryDerivedReferrer_ProductList", sq); }
    public Map<String, Object> getProductStatusCode_QueryDerivedReferrer_ProductListParameter() { return xgetSQuePmMap("productStatusCode_QueryDerivedReferrer_ProductList"); }
    public String keepProductStatusCode_QueryDerivedReferrer_ProductListParameter(Object pm) { return xkeepSQuePm("productStatusCode_QueryDerivedReferrer_ProductList", pm); }

    /** 
     * Add order-by as ascend. <br />
     * PRODUCT_STATUS_CODE: {PK, NotNull, CHAR(3)}
     * @return this. (NotNull)
     */
    public MbBsProductStatusCQ addOrderBy_ProductStatusCode_Asc() { regOBA("PRODUCT_STATUS_CODE"); return this; }

    /**
     * Add order-by as descend. <br />
     * PRODUCT_STATUS_CODE: {PK, NotNull, CHAR(3)}
     * @return this. (NotNull)
     */
    public MbBsProductStatusCQ addOrderBy_ProductStatusCode_Desc() { regOBD("PRODUCT_STATUS_CODE"); return this; }

    protected ConditionValue _productStatusName;
    public ConditionValue getProductStatusName()
    { if (_productStatusName == null) { _productStatusName = nCV(); }
      return _productStatusName; }
    protected ConditionValue getCValueProductStatusName() { return getProductStatusName(); }

    /** 
     * Add order-by as ascend. <br />
     * PRODUCT_STATUS_NAME: {NotNull, VARCHAR(50)}
     * @return this. (NotNull)
     */
    public MbBsProductStatusCQ addOrderBy_ProductStatusName_Asc() { regOBA("PRODUCT_STATUS_NAME"); return this; }

    /**
     * Add order-by as descend. <br />
     * PRODUCT_STATUS_NAME: {NotNull, VARCHAR(50)}
     * @return this. (NotNull)
     */
    public MbBsProductStatusCQ addOrderBy_ProductStatusName_Desc() { regOBD("PRODUCT_STATUS_NAME"); return this; }

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
    public MbBsProductStatusCQ addOrderBy_DisplayOrder_Asc() { regOBA("DISPLAY_ORDER"); return this; }

    /**
     * Add order-by as descend. <br />
     * DISPLAY_ORDER: {UQ, NotNull, INTEGER(10)}
     * @return this. (NotNull)
     */
    public MbBsProductStatusCQ addOrderBy_DisplayOrder_Desc() { regOBD("DISPLAY_ORDER"); return this; }

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
    public MbBsProductStatusCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public MbBsProductStatusCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, MbProductStatusCQ> getScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(MbProductStatusCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, MbProductStatusCQ> getSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(MbProductStatusCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, MbProductStatusCQ> getQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(MbProductStatusCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> getQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, MbProductStatusCQ> _myselfExistsMap;
    public Map<String, MbProductStatusCQ> getMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(MbProductStatusCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, MbProductStatusCQ> getMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(MbProductStatusCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return MbProductStatusCB.class.getName(); }
    protected String xCQ() { return MbProductStatusCQ.class.getName(); }
    protected String xCHp() { return HpCalculator.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
