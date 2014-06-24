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
 * The base condition-query of SUMMARY_PRODUCT.
 * @author DBFlute(AutoGenerator)
 */
public class MbBsSummaryProductCQ extends MbAbstractBsSummaryProductCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected MbSummaryProductCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public MbBsSummaryProductCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from SUMMARY_PRODUCT) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public MbSummaryProductCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected MbSummaryProductCIQ xcreateCIQ() {
        MbSummaryProductCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected MbSummaryProductCIQ xnewCIQ() {
        return new MbSummaryProductCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join SUMMARY_PRODUCT on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public MbSummaryProductCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        MbSummaryProductCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _productId;
    public ConditionValue getProductId()
    { if (_productId == null) { _productId = nCV(); }
      return _productId; }
    protected ConditionValue getCValueProductId() { return getProductId(); }

    /** 
     * Add order-by as ascend. <br />
     * PRODUCT_ID: {INTEGER(10)}
     * @return this. (NotNull)
     */
    public MbBsSummaryProductCQ addOrderBy_ProductId_Asc() { regOBA("PRODUCT_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * PRODUCT_ID: {INTEGER(10)}
     * @return this. (NotNull)
     */
    public MbBsSummaryProductCQ addOrderBy_ProductId_Desc() { regOBD("PRODUCT_ID"); return this; }

    protected ConditionValue _productName;
    public ConditionValue getProductName()
    { if (_productName == null) { _productName = nCV(); }
      return _productName; }
    protected ConditionValue getCValueProductName() { return getProductName(); }

    /** 
     * Add order-by as ascend. <br />
     * PRODUCT_NAME: {VARCHAR(50)}
     * @return this. (NotNull)
     */
    public MbBsSummaryProductCQ addOrderBy_ProductName_Asc() { regOBA("PRODUCT_NAME"); return this; }

    /**
     * Add order-by as descend. <br />
     * PRODUCT_NAME: {VARCHAR(50)}
     * @return this. (NotNull)
     */
    public MbBsSummaryProductCQ addOrderBy_ProductName_Desc() { regOBD("PRODUCT_NAME"); return this; }

    protected ConditionValue _productHandleCode;
    public ConditionValue getProductHandleCode()
    { if (_productHandleCode == null) { _productHandleCode = nCV(); }
      return _productHandleCode; }
    protected ConditionValue getCValueProductHandleCode() { return getProductHandleCode(); }

    /** 
     * Add order-by as ascend. <br />
     * PRODUCT_HANDLE_CODE: {VARCHAR(100)}
     * @return this. (NotNull)
     */
    public MbBsSummaryProductCQ addOrderBy_ProductHandleCode_Asc() { regOBA("PRODUCT_HANDLE_CODE"); return this; }

    /**
     * Add order-by as descend. <br />
     * PRODUCT_HANDLE_CODE: {VARCHAR(100)}
     * @return this. (NotNull)
     */
    public MbBsSummaryProductCQ addOrderBy_ProductHandleCode_Desc() { regOBD("PRODUCT_HANDLE_CODE"); return this; }

    protected ConditionValue _productStatusCode;
    public ConditionValue getProductStatusCode()
    { if (_productStatusCode == null) { _productStatusCode = nCV(); }
      return _productStatusCode; }
    protected ConditionValue getCValueProductStatusCode() { return getProductStatusCode(); }

    /** 
     * Add order-by as ascend. <br />
     * PRODUCT_STATUS_CODE: {CHAR(3)}
     * @return this. (NotNull)
     */
    public MbBsSummaryProductCQ addOrderBy_ProductStatusCode_Asc() { regOBA("PRODUCT_STATUS_CODE"); return this; }

    /**
     * Add order-by as descend. <br />
     * PRODUCT_STATUS_CODE: {CHAR(3)}
     * @return this. (NotNull)
     */
    public MbBsSummaryProductCQ addOrderBy_ProductStatusCode_Desc() { regOBD("PRODUCT_STATUS_CODE"); return this; }

    protected ConditionValue _latestPurchaseDatetime;
    public ConditionValue getLatestPurchaseDatetime()
    { if (_latestPurchaseDatetime == null) { _latestPurchaseDatetime = nCV(); }
      return _latestPurchaseDatetime; }
    protected ConditionValue getCValueLatestPurchaseDatetime() { return getLatestPurchaseDatetime(); }

    /** 
     * Add order-by as ascend. <br />
     * LATEST_PURCHASE_DATETIME: {TIMESTAMP(23, 10)}
     * @return this. (NotNull)
     */
    public MbBsSummaryProductCQ addOrderBy_LatestPurchaseDatetime_Asc() { regOBA("LATEST_PURCHASE_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br />
     * LATEST_PURCHASE_DATETIME: {TIMESTAMP(23, 10)}
     * @return this. (NotNull)
     */
    public MbBsSummaryProductCQ addOrderBy_LatestPurchaseDatetime_Desc() { regOBD("LATEST_PURCHASE_DATETIME"); return this; }

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
    public MbBsSummaryProductCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public MbBsSummaryProductCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, MbSummaryProductCQ> getScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(MbSummaryProductCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return MbSummaryProductCB.class.getName(); }
    protected String xCQ() { return MbSummaryProductCQ.class.getName(); }
    protected String xCHp() { return HpCalculator.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
