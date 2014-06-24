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
 * The base condition-query of PURCHASE.
 * @author DBFlute(AutoGenerator)
 */
public class MbBsPurchaseCQ extends MbAbstractBsPurchaseCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected MbPurchaseCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public MbBsPurchaseCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from PURCHASE) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public MbPurchaseCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected MbPurchaseCIQ xcreateCIQ() {
        MbPurchaseCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected MbPurchaseCIQ xnewCIQ() {
        return new MbPurchaseCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join PURCHASE on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public MbPurchaseCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        MbPurchaseCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _purchaseId;
    public ConditionValue getPurchaseId()
    { if (_purchaseId == null) { _purchaseId = nCV(); }
      return _purchaseId; }
    protected ConditionValue getCValuePurchaseId() { return getPurchaseId(); }

    /** 
     * Add order-by as ascend. <br />
     * PURCHASE_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public MbBsPurchaseCQ addOrderBy_PurchaseId_Asc() { regOBA("PURCHASE_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * PURCHASE_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public MbBsPurchaseCQ addOrderBy_PurchaseId_Desc() { regOBD("PURCHASE_ID"); return this; }

    protected ConditionValue _memberId;
    public ConditionValue getMemberId()
    { if (_memberId == null) { _memberId = nCV(); }
      return _memberId; }
    protected ConditionValue getCValueMemberId() { return getMemberId(); }

    public Map<String, MbMemberCQ> getMemberId_InScopeRelation_Member() { return xgetSQueMap("memberId_InScopeRelation_Member"); }
    public String keepMemberId_InScopeRelation_Member(MbMemberCQ sq) { return xkeepSQue("memberId_InScopeRelation_Member", sq); }

    public Map<String, MbMemberCQ> getMemberId_NotInScopeRelation_Member() { return xgetSQueMap("memberId_NotInScopeRelation_Member"); }
    public String keepMemberId_NotInScopeRelation_Member(MbMemberCQ sq) { return xkeepSQue("memberId_NotInScopeRelation_Member", sq); }

    /** 
     * Add order-by as ascend. <br />
     * MEMBER_ID: {UQ+, IX+, NotNull, INTEGER(10), FK to MEMBER}
     * @return this. (NotNull)
     */
    public MbBsPurchaseCQ addOrderBy_MemberId_Asc() { regOBA("MEMBER_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * MEMBER_ID: {UQ+, IX+, NotNull, INTEGER(10), FK to MEMBER}
     * @return this. (NotNull)
     */
    public MbBsPurchaseCQ addOrderBy_MemberId_Desc() { regOBD("MEMBER_ID"); return this; }

    protected ConditionValue _productId;
    public ConditionValue getProductId()
    { if (_productId == null) { _productId = nCV(); }
      return _productId; }
    protected ConditionValue getCValueProductId() { return getProductId(); }

    public Map<String, MbProductCQ> getProductId_InScopeRelation_Product() { return xgetSQueMap("productId_InScopeRelation_Product"); }
    public String keepProductId_InScopeRelation_Product(MbProductCQ sq) { return xkeepSQue("productId_InScopeRelation_Product", sq); }

    public Map<String, MbProductCQ> getProductId_NotInScopeRelation_Product() { return xgetSQueMap("productId_NotInScopeRelation_Product"); }
    public String keepProductId_NotInScopeRelation_Product(MbProductCQ sq) { return xkeepSQue("productId_NotInScopeRelation_Product", sq); }

    /** 
     * Add order-by as ascend. <br />
     * PRODUCT_ID: {+UQ, IX+, NotNull, INTEGER(10), FK to PRODUCT}
     * @return this. (NotNull)
     */
    public MbBsPurchaseCQ addOrderBy_ProductId_Asc() { regOBA("PRODUCT_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * PRODUCT_ID: {+UQ, IX+, NotNull, INTEGER(10), FK to PRODUCT}
     * @return this. (NotNull)
     */
    public MbBsPurchaseCQ addOrderBy_ProductId_Desc() { regOBD("PRODUCT_ID"); return this; }

    protected ConditionValue _purchaseDatetime;
    public ConditionValue getPurchaseDatetime()
    { if (_purchaseDatetime == null) { _purchaseDatetime = nCV(); }
      return _purchaseDatetime; }
    protected ConditionValue getCValuePurchaseDatetime() { return getPurchaseDatetime(); }

    /** 
     * Add order-by as ascend. <br />
     * PURCHASE_DATETIME: {+UQ, IX+, NotNull, TIMESTAMP(23, 10)}
     * @return this. (NotNull)
     */
    public MbBsPurchaseCQ addOrderBy_PurchaseDatetime_Asc() { regOBA("PURCHASE_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br />
     * PURCHASE_DATETIME: {+UQ, IX+, NotNull, TIMESTAMP(23, 10)}
     * @return this. (NotNull)
     */
    public MbBsPurchaseCQ addOrderBy_PurchaseDatetime_Desc() { regOBD("PURCHASE_DATETIME"); return this; }

    protected ConditionValue _purchaseCount;
    public ConditionValue getPurchaseCount()
    { if (_purchaseCount == null) { _purchaseCount = nCV(); }
      return _purchaseCount; }
    protected ConditionValue getCValuePurchaseCount() { return getPurchaseCount(); }

    /** 
     * Add order-by as ascend. <br />
     * PURCHASE_COUNT: {NotNull, INTEGER(10)}
     * @return this. (NotNull)
     */
    public MbBsPurchaseCQ addOrderBy_PurchaseCount_Asc() { regOBA("PURCHASE_COUNT"); return this; }

    /**
     * Add order-by as descend. <br />
     * PURCHASE_COUNT: {NotNull, INTEGER(10)}
     * @return this. (NotNull)
     */
    public MbBsPurchaseCQ addOrderBy_PurchaseCount_Desc() { regOBD("PURCHASE_COUNT"); return this; }

    protected ConditionValue _purchasePrice;
    public ConditionValue getPurchasePrice()
    { if (_purchasePrice == null) { _purchasePrice = nCV(); }
      return _purchasePrice; }
    protected ConditionValue getCValuePurchasePrice() { return getPurchasePrice(); }

    /** 
     * Add order-by as ascend. <br />
     * PURCHASE_PRICE: {IX, NotNull, INTEGER(10)}
     * @return this. (NotNull)
     */
    public MbBsPurchaseCQ addOrderBy_PurchasePrice_Asc() { regOBA("PURCHASE_PRICE"); return this; }

    /**
     * Add order-by as descend. <br />
     * PURCHASE_PRICE: {IX, NotNull, INTEGER(10)}
     * @return this. (NotNull)
     */
    public MbBsPurchaseCQ addOrderBy_PurchasePrice_Desc() { regOBD("PURCHASE_PRICE"); return this; }

    protected ConditionValue _paymentCompleteFlg;
    public ConditionValue getPaymentCompleteFlg()
    { if (_paymentCompleteFlg == null) { _paymentCompleteFlg = nCV(); }
      return _paymentCompleteFlg; }
    protected ConditionValue getCValuePaymentCompleteFlg() { return getPaymentCompleteFlg(); }

    /** 
     * Add order-by as ascend. <br />
     * PAYMENT_COMPLETE_FLG: {NotNull, INTEGER(10), classification=Flg}
     * @return this. (NotNull)
     */
    public MbBsPurchaseCQ addOrderBy_PaymentCompleteFlg_Asc() { regOBA("PAYMENT_COMPLETE_FLG"); return this; }

    /**
     * Add order-by as descend. <br />
     * PAYMENT_COMPLETE_FLG: {NotNull, INTEGER(10), classification=Flg}
     * @return this. (NotNull)
     */
    public MbBsPurchaseCQ addOrderBy_PaymentCompleteFlg_Desc() { regOBD("PAYMENT_COMPLETE_FLG"); return this; }

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
    public MbBsPurchaseCQ addOrderBy_RegisterDatetime_Asc() { regOBA("REGISTER_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br />
     * REGISTER_DATETIME: {NotNull, TIMESTAMP(23, 10)}
     * @return this. (NotNull)
     */
    public MbBsPurchaseCQ addOrderBy_RegisterDatetime_Desc() { regOBD("REGISTER_DATETIME"); return this; }

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
    public MbBsPurchaseCQ addOrderBy_RegisterUser_Asc() { regOBA("REGISTER_USER"); return this; }

    /**
     * Add order-by as descend. <br />
     * REGISTER_USER: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public MbBsPurchaseCQ addOrderBy_RegisterUser_Desc() { regOBD("REGISTER_USER"); return this; }

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
    public MbBsPurchaseCQ addOrderBy_UpdateDatetime_Asc() { regOBA("UPDATE_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br />
     * UPDATE_DATETIME: {NotNull, TIMESTAMP(23, 10)}
     * @return this. (NotNull)
     */
    public MbBsPurchaseCQ addOrderBy_UpdateDatetime_Desc() { regOBD("UPDATE_DATETIME"); return this; }

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
    public MbBsPurchaseCQ addOrderBy_UpdateUser_Asc() { regOBA("UPDATE_USER"); return this; }

    /**
     * Add order-by as descend. <br />
     * UPDATE_USER: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public MbBsPurchaseCQ addOrderBy_UpdateUser_Desc() { regOBD("UPDATE_USER"); return this; }

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
    public MbBsPurchaseCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br />
     * VERSION_NO: {NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public MbBsPurchaseCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public MbBsPurchaseCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public MbBsPurchaseCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        MbPurchaseCQ bq = (MbPurchaseCQ)bqs;
        MbPurchaseCQ uq = (MbPurchaseCQ)uqs;
        if (bq.hasConditionQueryMember()) {
            uq.queryMember().reflectRelationOnUnionQuery(bq.queryMember(), uq.queryMember());
        }
        if (bq.hasConditionQueryProduct()) {
            uq.queryProduct().reflectRelationOnUnionQuery(bq.queryProduct(), uq.queryProduct());
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
    public MbMemberCQ getConditionQueryMember() {
        String prop = "member";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMember()); xsetupOuterJoinMember(); }
        return xgetQueRlMap(prop);
    }
    protected MbMemberCQ xcreateQueryMember() {
        String nrp = xresolveNRP("PURCHASE", "member"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MbMemberCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "member", nrp);
    }
    protected void xsetupOuterJoinMember() { xregOutJo("member"); }
    public boolean hasConditionQueryMember() { return xhasQueRlMap("member"); }

    /**
     * Get the condition-query for relation table. <br />
     * PRODUCT by my PRODUCT_ID, named 'product'.
     * @return The instance of condition-query. (NotNull)
     */
    public MbProductCQ queryProduct() {
        return getConditionQueryProduct();
    }
    public MbProductCQ getConditionQueryProduct() {
        String prop = "product";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryProduct()); xsetupOuterJoinProduct(); }
        return xgetQueRlMap(prop);
    }
    protected MbProductCQ xcreateQueryProduct() {
        String nrp = xresolveNRP("PURCHASE", "product"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MbProductCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "product", nrp);
    }
    protected void xsetupOuterJoinProduct() { xregOutJo("product"); }
    public boolean hasConditionQueryProduct() { return xhasQueRlMap("product"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, MbPurchaseCQ> getScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(MbPurchaseCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, MbPurchaseCQ> getSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(MbPurchaseCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, MbPurchaseCQ> getQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(MbPurchaseCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> getQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, MbPurchaseCQ> _myselfExistsMap;
    public Map<String, MbPurchaseCQ> getMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(MbPurchaseCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, MbPurchaseCQ> getMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(MbPurchaseCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return MbPurchaseCB.class.getName(); }
    protected String xCQ() { return MbPurchaseCQ.class.getName(); }
    protected String xCHp() { return HpCalculator.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
