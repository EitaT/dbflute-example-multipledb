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
 * The base condition-query of PRODUCT.
 * @author DBFlute(AutoGenerator)
 */
public class MbBsProductCQ extends MbAbstractBsProductCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected MbProductCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public MbBsProductCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from PRODUCT) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public MbProductCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected MbProductCIQ xcreateCIQ() {
        MbProductCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected MbProductCIQ xnewCIQ() {
        return new MbProductCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join PRODUCT on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public MbProductCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        MbProductCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _productId;
    public ConditionValue getProductId()
    { if (_productId == null) { _productId = nCV(); }
      return _productId; }
    protected ConditionValue getCValueProductId() { return getProductId(); }

    public Map<String, MbPurchaseCQ> getProductId_ExistsReferrer_PurchaseList() { return xgetSQueMap("productId_ExistsReferrer_PurchaseList"); }
    public String keepProductId_ExistsReferrer_PurchaseList(MbPurchaseCQ sq) { return xkeepSQue("productId_ExistsReferrer_PurchaseList", sq); }

    public Map<String, MbPurchaseCQ> getProductId_NotExistsReferrer_PurchaseList() { return xgetSQueMap("productId_NotExistsReferrer_PurchaseList"); }
    public String keepProductId_NotExistsReferrer_PurchaseList(MbPurchaseCQ sq) { return xkeepSQue("productId_NotExistsReferrer_PurchaseList", sq); }

    public Map<String, MbPurchaseCQ> getProductId_SpecifyDerivedReferrer_PurchaseList() { return xgetSQueMap("productId_SpecifyDerivedReferrer_PurchaseList"); }
    public String keepProductId_SpecifyDerivedReferrer_PurchaseList(MbPurchaseCQ sq) { return xkeepSQue("productId_SpecifyDerivedReferrer_PurchaseList", sq); }

    public Map<String, MbPurchaseCQ> getProductId_InScopeRelation_PurchaseList() { return xgetSQueMap("productId_InScopeRelation_PurchaseList"); }
    public String keepProductId_InScopeRelation_PurchaseList(MbPurchaseCQ sq) { return xkeepSQue("productId_InScopeRelation_PurchaseList", sq); }

    public Map<String, MbPurchaseCQ> getProductId_NotInScopeRelation_PurchaseList() { return xgetSQueMap("productId_NotInScopeRelation_PurchaseList"); }
    public String keepProductId_NotInScopeRelation_PurchaseList(MbPurchaseCQ sq) { return xkeepSQue("productId_NotInScopeRelation_PurchaseList", sq); }

    public Map<String, MbPurchaseCQ> getProductId_QueryDerivedReferrer_PurchaseList() { return xgetSQueMap("productId_QueryDerivedReferrer_PurchaseList"); }
    public String keepProductId_QueryDerivedReferrer_PurchaseList(MbPurchaseCQ sq) { return xkeepSQue("productId_QueryDerivedReferrer_PurchaseList", sq); }
    public Map<String, Object> getProductId_QueryDerivedReferrer_PurchaseListParameter() { return xgetSQuePmMap("productId_QueryDerivedReferrer_PurchaseList"); }
    public String keepProductId_QueryDerivedReferrer_PurchaseListParameter(Object pm) { return xkeepSQuePm("productId_QueryDerivedReferrer_PurchaseList", pm); }

    /** 
     * Add order-by as ascend. <br />
     * PRODUCT_ID: {PK, ID, NotNull, INTEGER(10)}
     * @return this. (NotNull)
     */
    public MbBsProductCQ addOrderBy_ProductId_Asc() { regOBA("PRODUCT_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * PRODUCT_ID: {PK, ID, NotNull, INTEGER(10)}
     * @return this. (NotNull)
     */
    public MbBsProductCQ addOrderBy_ProductId_Desc() { regOBD("PRODUCT_ID"); return this; }

    protected ConditionValue _productName;
    public ConditionValue getProductName()
    { if (_productName == null) { _productName = nCV(); }
      return _productName; }
    protected ConditionValue getCValueProductName() { return getProductName(); }

    /** 
     * Add order-by as ascend. <br />
     * PRODUCT_NAME: {IX, NotNull, VARCHAR(50)}
     * @return this. (NotNull)
     */
    public MbBsProductCQ addOrderBy_ProductName_Asc() { regOBA("PRODUCT_NAME"); return this; }

    /**
     * Add order-by as descend. <br />
     * PRODUCT_NAME: {IX, NotNull, VARCHAR(50)}
     * @return this. (NotNull)
     */
    public MbBsProductCQ addOrderBy_ProductName_Desc() { regOBD("PRODUCT_NAME"); return this; }

    protected ConditionValue _productHandleCode;
    public ConditionValue getProductHandleCode()
    { if (_productHandleCode == null) { _productHandleCode = nCV(); }
      return _productHandleCode; }
    protected ConditionValue getCValueProductHandleCode() { return getProductHandleCode(); }

    /** 
     * Add order-by as ascend. <br />
     * PRODUCT_HANDLE_CODE: {UQ, NotNull, VARCHAR(100)}
     * @return this. (NotNull)
     */
    public MbBsProductCQ addOrderBy_ProductHandleCode_Asc() { regOBA("PRODUCT_HANDLE_CODE"); return this; }

    /**
     * Add order-by as descend. <br />
     * PRODUCT_HANDLE_CODE: {UQ, NotNull, VARCHAR(100)}
     * @return this. (NotNull)
     */
    public MbBsProductCQ addOrderBy_ProductHandleCode_Desc() { regOBD("PRODUCT_HANDLE_CODE"); return this; }

    protected ConditionValue _productCategoryCode;
    public ConditionValue getProductCategoryCode()
    { if (_productCategoryCode == null) { _productCategoryCode = nCV(); }
      return _productCategoryCode; }
    protected ConditionValue getCValueProductCategoryCode() { return getProductCategoryCode(); }

    public Map<String, MbProductCategoryCQ> getProductCategoryCode_InScopeRelation_ProductCategory() { return xgetSQueMap("productCategoryCode_InScopeRelation_ProductCategory"); }
    public String keepProductCategoryCode_InScopeRelation_ProductCategory(MbProductCategoryCQ sq) { return xkeepSQue("productCategoryCode_InScopeRelation_ProductCategory", sq); }

    public Map<String, MbProductCategoryCQ> getProductCategoryCode_NotInScopeRelation_ProductCategory() { return xgetSQueMap("productCategoryCode_NotInScopeRelation_ProductCategory"); }
    public String keepProductCategoryCode_NotInScopeRelation_ProductCategory(MbProductCategoryCQ sq) { return xkeepSQue("productCategoryCode_NotInScopeRelation_ProductCategory", sq); }

    /** 
     * Add order-by as ascend. <br />
     * PRODUCT_CATEGORY_CODE: {IX, NotNull, CHAR(3), FK to PRODUCT_CATEGORY}
     * @return this. (NotNull)
     */
    public MbBsProductCQ addOrderBy_ProductCategoryCode_Asc() { regOBA("PRODUCT_CATEGORY_CODE"); return this; }

    /**
     * Add order-by as descend. <br />
     * PRODUCT_CATEGORY_CODE: {IX, NotNull, CHAR(3), FK to PRODUCT_CATEGORY}
     * @return this. (NotNull)
     */
    public MbBsProductCQ addOrderBy_ProductCategoryCode_Desc() { regOBD("PRODUCT_CATEGORY_CODE"); return this; }

    protected ConditionValue _productStatusCode;
    public ConditionValue getProductStatusCode()
    { if (_productStatusCode == null) { _productStatusCode = nCV(); }
      return _productStatusCode; }
    protected ConditionValue getCValueProductStatusCode() { return getProductStatusCode(); }

    public Map<String, MbProductStatusCQ> getProductStatusCode_InScopeRelation_ProductStatus() { return xgetSQueMap("productStatusCode_InScopeRelation_ProductStatus"); }
    public String keepProductStatusCode_InScopeRelation_ProductStatus(MbProductStatusCQ sq) { return xkeepSQue("productStatusCode_InScopeRelation_ProductStatus", sq); }

    public Map<String, MbProductStatusCQ> getProductStatusCode_NotInScopeRelation_ProductStatus() { return xgetSQueMap("productStatusCode_NotInScopeRelation_ProductStatus"); }
    public String keepProductStatusCode_NotInScopeRelation_ProductStatus(MbProductStatusCQ sq) { return xkeepSQue("productStatusCode_NotInScopeRelation_ProductStatus", sq); }

    /** 
     * Add order-by as ascend. <br />
     * PRODUCT_STATUS_CODE: {IX, NotNull, CHAR(3), FK to PRODUCT_STATUS}
     * @return this. (NotNull)
     */
    public MbBsProductCQ addOrderBy_ProductStatusCode_Asc() { regOBA("PRODUCT_STATUS_CODE"); return this; }

    /**
     * Add order-by as descend. <br />
     * PRODUCT_STATUS_CODE: {IX, NotNull, CHAR(3), FK to PRODUCT_STATUS}
     * @return this. (NotNull)
     */
    public MbBsProductCQ addOrderBy_ProductStatusCode_Desc() { regOBD("PRODUCT_STATUS_CODE"); return this; }

    protected ConditionValue _regularPrice;
    public ConditionValue getRegularPrice()
    { if (_regularPrice == null) { _regularPrice = nCV(); }
      return _regularPrice; }
    protected ConditionValue getCValueRegularPrice() { return getRegularPrice(); }

    /** 
     * Add order-by as ascend. <br />
     * REGULAR_PRICE: {NotNull, INTEGER(10)}
     * @return this. (NotNull)
     */
    public MbBsProductCQ addOrderBy_RegularPrice_Asc() { regOBA("REGULAR_PRICE"); return this; }

    /**
     * Add order-by as descend. <br />
     * REGULAR_PRICE: {NotNull, INTEGER(10)}
     * @return this. (NotNull)
     */
    public MbBsProductCQ addOrderBy_RegularPrice_Desc() { regOBD("REGULAR_PRICE"); return this; }

    protected ConditionValue _registerDatetime;
    public ConditionValue getRegisterDatetime()
    { if (_registerDatetime == null) { _registerDatetime = nCV(); }
      return _registerDatetime; }
    protected ConditionValue getCValueRegisterDatetime() { return getRegisterDatetime(); }

    /** 
     * Add order-by as ascend. <br />
     * REGISTER_DATETIME: {NotNull, TIMESTAMP(23, 10)}
     * @return this. (NotNull)
     */
    public MbBsProductCQ addOrderBy_RegisterDatetime_Asc() { regOBA("REGISTER_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br />
     * REGISTER_DATETIME: {NotNull, TIMESTAMP(23, 10)}
     * @return this. (NotNull)
     */
    public MbBsProductCQ addOrderBy_RegisterDatetime_Desc() { regOBD("REGISTER_DATETIME"); return this; }

    protected ConditionValue _registerUser;
    public ConditionValue getRegisterUser()
    { if (_registerUser == null) { _registerUser = nCV(); }
      return _registerUser; }
    protected ConditionValue getCValueRegisterUser() { return getRegisterUser(); }

    /** 
     * Add order-by as ascend. <br />
     * REGISTER_USER: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public MbBsProductCQ addOrderBy_RegisterUser_Asc() { regOBA("REGISTER_USER"); return this; }

    /**
     * Add order-by as descend. <br />
     * REGISTER_USER: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public MbBsProductCQ addOrderBy_RegisterUser_Desc() { regOBD("REGISTER_USER"); return this; }

    protected ConditionValue _updateDatetime;
    public ConditionValue getUpdateDatetime()
    { if (_updateDatetime == null) { _updateDatetime = nCV(); }
      return _updateDatetime; }
    protected ConditionValue getCValueUpdateDatetime() { return getUpdateDatetime(); }

    /** 
     * Add order-by as ascend. <br />
     * UPDATE_DATETIME: {NotNull, TIMESTAMP(23, 10)}
     * @return this. (NotNull)
     */
    public MbBsProductCQ addOrderBy_UpdateDatetime_Asc() { regOBA("UPDATE_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br />
     * UPDATE_DATETIME: {NotNull, TIMESTAMP(23, 10)}
     * @return this. (NotNull)
     */
    public MbBsProductCQ addOrderBy_UpdateDatetime_Desc() { regOBD("UPDATE_DATETIME"); return this; }

    protected ConditionValue _updateUser;
    public ConditionValue getUpdateUser()
    { if (_updateUser == null) { _updateUser = nCV(); }
      return _updateUser; }
    protected ConditionValue getCValueUpdateUser() { return getUpdateUser(); }

    /** 
     * Add order-by as ascend. <br />
     * UPDATE_USER: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public MbBsProductCQ addOrderBy_UpdateUser_Asc() { regOBA("UPDATE_USER"); return this; }

    /**
     * Add order-by as descend. <br />
     * UPDATE_USER: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public MbBsProductCQ addOrderBy_UpdateUser_Desc() { regOBD("UPDATE_USER"); return this; }

    protected ConditionValue _versionNo;
    public ConditionValue getVersionNo()
    { if (_versionNo == null) { _versionNo = nCV(); }
      return _versionNo; }
    protected ConditionValue getCValueVersionNo() { return getVersionNo(); }

    /** 
     * Add order-by as ascend. <br />
     * VERSION_NO: {NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public MbBsProductCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br />
     * VERSION_NO: {NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public MbBsProductCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public MbBsProductCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public MbBsProductCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        MbProductCQ bq = (MbProductCQ)bqs;
        MbProductCQ uq = (MbProductCQ)uqs;
        if (bq.hasConditionQueryProductCategory()) {
            uq.queryProductCategory().reflectRelationOnUnionQuery(bq.queryProductCategory(), uq.queryProductCategory());
        }
        if (bq.hasConditionQueryProductStatus()) {
            uq.queryProductStatus().reflectRelationOnUnionQuery(bq.queryProductStatus(), uq.queryProductStatus());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br />
     * PRODUCT_CATEGORY by my PRODUCT_CATEGORY_CODE, named 'productCategory'.
     * @return The instance of condition-query. (NotNull)
     */
    public MbProductCategoryCQ queryProductCategory() {
        return getConditionQueryProductCategory();
    }
    public MbProductCategoryCQ getConditionQueryProductCategory() {
        String prop = "productCategory";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryProductCategory()); xsetupOuterJoinProductCategory(); }
        return xgetQueRlMap(prop);
    }
    protected MbProductCategoryCQ xcreateQueryProductCategory() {
        String nrp = xresolveNRP("PRODUCT", "productCategory"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MbProductCategoryCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "productCategory", nrp);
    }
    protected void xsetupOuterJoinProductCategory() { xregOutJo("productCategory"); }
    public boolean hasConditionQueryProductCategory() { return xhasQueRlMap("productCategory"); }

    /**
     * Get the condition-query for relation table. <br />
     * PRODUCT_STATUS by my PRODUCT_STATUS_CODE, named 'productStatus'.
     * @return The instance of condition-query. (NotNull)
     */
    public MbProductStatusCQ queryProductStatus() {
        return getConditionQueryProductStatus();
    }
    public MbProductStatusCQ getConditionQueryProductStatus() {
        String prop = "productStatus";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryProductStatus()); xsetupOuterJoinProductStatus(); }
        return xgetQueRlMap(prop);
    }
    protected MbProductStatusCQ xcreateQueryProductStatus() {
        String nrp = xresolveNRP("PRODUCT", "productStatus"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MbProductStatusCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "productStatus", nrp);
    }
    protected void xsetupOuterJoinProductStatus() { xregOutJo("productStatus"); }
    public boolean hasConditionQueryProductStatus() { return xhasQueRlMap("productStatus"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, MbProductCQ> getScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(MbProductCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, MbProductCQ> getSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(MbProductCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, MbProductCQ> getQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(MbProductCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> getQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, MbProductCQ> _myselfExistsMap;
    public Map<String, MbProductCQ> getMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(MbProductCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, MbProductCQ> getMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(MbProductCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return MbProductCB.class.getName(); }
    protected String xCQ() { return MbProductCQ.class.getName(); }
    protected String xCHp() { return HpCalculator.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
