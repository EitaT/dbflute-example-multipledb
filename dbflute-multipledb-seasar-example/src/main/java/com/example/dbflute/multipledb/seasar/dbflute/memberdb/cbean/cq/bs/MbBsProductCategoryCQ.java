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
 * The base condition-query of PRODUCT_CATEGORY.
 * @author DBFlute(AutoGenerator)
 */
public class MbBsProductCategoryCQ extends MbAbstractBsProductCategoryCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected MbProductCategoryCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public MbBsProductCategoryCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from PRODUCT_CATEGORY) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public MbProductCategoryCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected MbProductCategoryCIQ xcreateCIQ() {
        MbProductCategoryCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected MbProductCategoryCIQ xnewCIQ() {
        return new MbProductCategoryCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join PRODUCT_CATEGORY on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public MbProductCategoryCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        MbProductCategoryCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _productCategoryCode;
    public ConditionValue getProductCategoryCode()
    { if (_productCategoryCode == null) { _productCategoryCode = nCV(); }
      return _productCategoryCode; }
    protected ConditionValue getCValueProductCategoryCode() { return getProductCategoryCode(); }

    public Map<String, MbProductCQ> getProductCategoryCode_ExistsReferrer_ProductList() { return xgetSQueMap("productCategoryCode_ExistsReferrer_ProductList"); }
    public String keepProductCategoryCode_ExistsReferrer_ProductList(MbProductCQ sq) { return xkeepSQue("productCategoryCode_ExistsReferrer_ProductList", sq); }

    public Map<String, MbProductCategoryCQ> getProductCategoryCode_ExistsReferrer_ProductCategorySelfList() { return xgetSQueMap("productCategoryCode_ExistsReferrer_ProductCategorySelfList"); }
    public String keepProductCategoryCode_ExistsReferrer_ProductCategorySelfList(MbProductCategoryCQ sq) { return xkeepSQue("productCategoryCode_ExistsReferrer_ProductCategorySelfList", sq); }

    public Map<String, MbProductCQ> getProductCategoryCode_NotExistsReferrer_ProductList() { return xgetSQueMap("productCategoryCode_NotExistsReferrer_ProductList"); }
    public String keepProductCategoryCode_NotExistsReferrer_ProductList(MbProductCQ sq) { return xkeepSQue("productCategoryCode_NotExistsReferrer_ProductList", sq); }

    public Map<String, MbProductCategoryCQ> getProductCategoryCode_NotExistsReferrer_ProductCategorySelfList() { return xgetSQueMap("productCategoryCode_NotExistsReferrer_ProductCategorySelfList"); }
    public String keepProductCategoryCode_NotExistsReferrer_ProductCategorySelfList(MbProductCategoryCQ sq) { return xkeepSQue("productCategoryCode_NotExistsReferrer_ProductCategorySelfList", sq); }

    public Map<String, MbProductCQ> getProductCategoryCode_InScopeRelation_ProductList() { return xgetSQueMap("productCategoryCode_InScopeRelation_ProductList"); }
    public String keepProductCategoryCode_InScopeRelation_ProductList(MbProductCQ sq) { return xkeepSQue("productCategoryCode_InScopeRelation_ProductList", sq); }

    public Map<String, MbProductCategoryCQ> getProductCategoryCode_InScopeRelation_ProductCategorySelfList() { return xgetSQueMap("productCategoryCode_InScopeRelation_ProductCategorySelfList"); }
    public String keepProductCategoryCode_InScopeRelation_ProductCategorySelfList(MbProductCategoryCQ sq) { return xkeepSQue("productCategoryCode_InScopeRelation_ProductCategorySelfList", sq); }

    public Map<String, MbProductCQ> getProductCategoryCode_NotInScopeRelation_ProductList() { return xgetSQueMap("productCategoryCode_NotInScopeRelation_ProductList"); }
    public String keepProductCategoryCode_NotInScopeRelation_ProductList(MbProductCQ sq) { return xkeepSQue("productCategoryCode_NotInScopeRelation_ProductList", sq); }

    public Map<String, MbProductCategoryCQ> getProductCategoryCode_NotInScopeRelation_ProductCategorySelfList() { return xgetSQueMap("productCategoryCode_NotInScopeRelation_ProductCategorySelfList"); }
    public String keepProductCategoryCode_NotInScopeRelation_ProductCategorySelfList(MbProductCategoryCQ sq) { return xkeepSQue("productCategoryCode_NotInScopeRelation_ProductCategorySelfList", sq); }

    public Map<String, MbProductCQ> getProductCategoryCode_SpecifyDerivedReferrer_ProductList() { return xgetSQueMap("productCategoryCode_SpecifyDerivedReferrer_ProductList"); }
    public String keepProductCategoryCode_SpecifyDerivedReferrer_ProductList(MbProductCQ sq) { return xkeepSQue("productCategoryCode_SpecifyDerivedReferrer_ProductList", sq); }

    public Map<String, MbProductCategoryCQ> getProductCategoryCode_SpecifyDerivedReferrer_ProductCategorySelfList() { return xgetSQueMap("productCategoryCode_SpecifyDerivedReferrer_ProductCategorySelfList"); }
    public String keepProductCategoryCode_SpecifyDerivedReferrer_ProductCategorySelfList(MbProductCategoryCQ sq) { return xkeepSQue("productCategoryCode_SpecifyDerivedReferrer_ProductCategorySelfList", sq); }

    public Map<String, MbProductCQ> getProductCategoryCode_QueryDerivedReferrer_ProductList() { return xgetSQueMap("productCategoryCode_QueryDerivedReferrer_ProductList"); }
    public String keepProductCategoryCode_QueryDerivedReferrer_ProductList(MbProductCQ sq) { return xkeepSQue("productCategoryCode_QueryDerivedReferrer_ProductList", sq); }
    public Map<String, Object> getProductCategoryCode_QueryDerivedReferrer_ProductListParameter() { return xgetSQuePmMap("productCategoryCode_QueryDerivedReferrer_ProductList"); }
    public String keepProductCategoryCode_QueryDerivedReferrer_ProductListParameter(Object pm) { return xkeepSQuePm("productCategoryCode_QueryDerivedReferrer_ProductList", pm); }

    public Map<String, MbProductCategoryCQ> getProductCategoryCode_QueryDerivedReferrer_ProductCategorySelfList() { return xgetSQueMap("productCategoryCode_QueryDerivedReferrer_ProductCategorySelfList"); }
    public String keepProductCategoryCode_QueryDerivedReferrer_ProductCategorySelfList(MbProductCategoryCQ sq) { return xkeepSQue("productCategoryCode_QueryDerivedReferrer_ProductCategorySelfList", sq); }
    public Map<String, Object> getProductCategoryCode_QueryDerivedReferrer_ProductCategorySelfListParameter() { return xgetSQuePmMap("productCategoryCode_QueryDerivedReferrer_ProductCategorySelfList"); }
    public String keepProductCategoryCode_QueryDerivedReferrer_ProductCategorySelfListParameter(Object pm) { return xkeepSQuePm("productCategoryCode_QueryDerivedReferrer_ProductCategorySelfList", pm); }

    /** 
     * Add order-by as ascend. <br />
     * PRODUCT_CATEGORY_CODE: {PK, NotNull, CHAR(3)}
     * @return this. (NotNull)
     */
    public MbBsProductCategoryCQ addOrderBy_ProductCategoryCode_Asc() { regOBA("PRODUCT_CATEGORY_CODE"); return this; }

    /**
     * Add order-by as descend. <br />
     * PRODUCT_CATEGORY_CODE: {PK, NotNull, CHAR(3)}
     * @return this. (NotNull)
     */
    public MbBsProductCategoryCQ addOrderBy_ProductCategoryCode_Desc() { regOBD("PRODUCT_CATEGORY_CODE"); return this; }

    protected ConditionValue _productCategoryName;
    public ConditionValue getProductCategoryName()
    { if (_productCategoryName == null) { _productCategoryName = nCV(); }
      return _productCategoryName; }
    protected ConditionValue getCValueProductCategoryName() { return getProductCategoryName(); }

    /** 
     * Add order-by as ascend. <br />
     * PRODUCT_CATEGORY_NAME: {NotNull, VARCHAR(50)}
     * @return this. (NotNull)
     */
    public MbBsProductCategoryCQ addOrderBy_ProductCategoryName_Asc() { regOBA("PRODUCT_CATEGORY_NAME"); return this; }

    /**
     * Add order-by as descend. <br />
     * PRODUCT_CATEGORY_NAME: {NotNull, VARCHAR(50)}
     * @return this. (NotNull)
     */
    public MbBsProductCategoryCQ addOrderBy_ProductCategoryName_Desc() { regOBD("PRODUCT_CATEGORY_NAME"); return this; }

    protected ConditionValue _parentCategoryCode;
    public ConditionValue getParentCategoryCode()
    { if (_parentCategoryCode == null) { _parentCategoryCode = nCV(); }
      return _parentCategoryCode; }
    protected ConditionValue getCValueParentCategoryCode() { return getParentCategoryCode(); }

    public Map<String, MbProductCategoryCQ> getParentCategoryCode_InScopeRelation_ProductCategorySelf() { return xgetSQueMap("parentCategoryCode_InScopeRelation_ProductCategorySelf"); }
    public String keepParentCategoryCode_InScopeRelation_ProductCategorySelf(MbProductCategoryCQ sq) { return xkeepSQue("parentCategoryCode_InScopeRelation_ProductCategorySelf", sq); }

    public Map<String, MbProductCategoryCQ> getParentCategoryCode_NotInScopeRelation_ProductCategorySelf() { return xgetSQueMap("parentCategoryCode_NotInScopeRelation_ProductCategorySelf"); }
    public String keepParentCategoryCode_NotInScopeRelation_ProductCategorySelf(MbProductCategoryCQ sq) { return xkeepSQue("parentCategoryCode_NotInScopeRelation_ProductCategorySelf", sq); }

    /** 
     * Add order-by as ascend. <br />
     * PARENT_CATEGORY_CODE: {IX, CHAR(3), FK to PRODUCT_CATEGORY}
     * @return this. (NotNull)
     */
    public MbBsProductCategoryCQ addOrderBy_ParentCategoryCode_Asc() { regOBA("PARENT_CATEGORY_CODE"); return this; }

    /**
     * Add order-by as descend. <br />
     * PARENT_CATEGORY_CODE: {IX, CHAR(3), FK to PRODUCT_CATEGORY}
     * @return this. (NotNull)
     */
    public MbBsProductCategoryCQ addOrderBy_ParentCategoryCode_Desc() { regOBD("PARENT_CATEGORY_CODE"); return this; }

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
    public MbBsProductCategoryCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public MbBsProductCategoryCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        MbProductCategoryCQ bq = (MbProductCategoryCQ)bqs;
        MbProductCategoryCQ uq = (MbProductCategoryCQ)uqs;
        if (bq.hasConditionQueryProductCategorySelf()) {
            uq.queryProductCategorySelf().reflectRelationOnUnionQuery(bq.queryProductCategorySelf(), uq.queryProductCategorySelf());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br />
     * PRODUCT_CATEGORY by my PARENT_CATEGORY_CODE, named 'productCategorySelf'.
     * @return The instance of condition-query. (NotNull)
     */
    public MbProductCategoryCQ queryProductCategorySelf() {
        return getConditionQueryProductCategorySelf();
    }
    public MbProductCategoryCQ getConditionQueryProductCategorySelf() {
        String prop = "productCategorySelf";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryProductCategorySelf()); xsetupOuterJoinProductCategorySelf(); }
        return xgetQueRlMap(prop);
    }
    protected MbProductCategoryCQ xcreateQueryProductCategorySelf() {
        String nrp = xresolveNRP("PRODUCT_CATEGORY", "productCategorySelf"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MbProductCategoryCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "productCategorySelf", nrp);
    }
    protected void xsetupOuterJoinProductCategorySelf() { xregOutJo("productCategorySelf"); }
    public boolean hasConditionQueryProductCategorySelf() { return xhasQueRlMap("productCategorySelf"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, MbProductCategoryCQ> getScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(MbProductCategoryCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, MbProductCategoryCQ> getSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(MbProductCategoryCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, MbProductCategoryCQ> getQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(MbProductCategoryCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> getQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, MbProductCategoryCQ> _myselfExistsMap;
    public Map<String, MbProductCategoryCQ> getMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(MbProductCategoryCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, MbProductCategoryCQ> getMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(MbProductCategoryCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return MbProductCategoryCB.class.getName(); }
    protected String xCQ() { return MbProductCategoryCQ.class.getName(); }
    protected String xCHp() { return HpCalculator.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
