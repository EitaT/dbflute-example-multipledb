package com.example.dbflute.multipledb.seasar.dbflute.memberdb.cbean.cq.bs;

import java.util.*;

import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.cbean.chelper.*;
import org.seasar.dbflute.cbean.ckey.*;
import org.seasar.dbflute.cbean.coption.*;
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import org.seasar.dbflute.dbmeta.DBMetaProvider;
import com.example.dbflute.multipledb.seasar.dbflute.memberdb.allcommon.*;
import com.example.dbflute.multipledb.seasar.dbflute.memberdb.cbean.*;
import com.example.dbflute.multipledb.seasar.dbflute.memberdb.cbean.cq.*;

/**
 * The abstract condition-query of PRODUCT_STATUS.
 * @author DBFlute(AutoGenerator)
 */
public abstract class MbAbstractBsProductStatusCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public MbAbstractBsProductStatusCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                     DBMeta Provider
    //                                                                     ===============
    @Override
    protected DBMetaProvider xgetDBMetaProvider() {
        return MbDBMetaInstanceHandler.getProvider();
    }

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "PRODUCT_STATUS";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * PRODUCT_STATUS_CODE: {PK, NotNull, CHAR(3)}
     * @param productStatusCode The value of productStatusCode as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setProductStatusCode_Equal(String productStatusCode) {
        doSetProductStatusCode_Equal(fRES(productStatusCode));
    }

    protected void doSetProductStatusCode_Equal(String productStatusCode) {
        regProductStatusCode(CK_EQ, productStatusCode);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * PRODUCT_STATUS_CODE: {PK, NotNull, CHAR(3)}
     * @param productStatusCode The value of productStatusCode as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setProductStatusCode_NotEqual(String productStatusCode) {
        doSetProductStatusCode_NotEqual(fRES(productStatusCode));
    }

    protected void doSetProductStatusCode_NotEqual(String productStatusCode) {
        regProductStatusCode(CK_NES, productStatusCode);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * PRODUCT_STATUS_CODE: {PK, NotNull, CHAR(3)}
     * @param productStatusCodeList The collection of productStatusCode as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setProductStatusCode_InScope(Collection<String> productStatusCodeList) {
        doSetProductStatusCode_InScope(productStatusCodeList);
    }

    public void doSetProductStatusCode_InScope(Collection<String> productStatusCodeList) {
        regINS(CK_INS, cTL(productStatusCodeList), getCValueProductStatusCode(), "PRODUCT_STATUS_CODE");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * PRODUCT_STATUS_CODE: {PK, NotNull, CHAR(3)}
     * @param productStatusCode The value of productStatusCode as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setProductStatusCode_PrefixSearch(String productStatusCode) {
        setProductStatusCode_LikeSearch(productStatusCode, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * PRODUCT_STATUS_CODE: {PK, NotNull, CHAR(3)} <br />
     * <pre>e.g. setProductStatusCode_LikeSearch("xxx", new <span style="color: #FD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param productStatusCode The value of productStatusCode as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setProductStatusCode_LikeSearch(String productStatusCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(productStatusCode), getCValueProductStatusCode(), "PRODUCT_STATUS_CODE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * PRODUCT_STATUS_CODE: {PK, NotNull, CHAR(3)}
     * @param productStatusCode The value of productStatusCode as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setProductStatusCode_NotLikeSearch(String productStatusCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(productStatusCode), getCValueProductStatusCode(), "PRODUCT_STATUS_CODE", likeSearchOption);
    }

    /**
     * Set up ExistsReferrer (co-related sub-query). <br />
     * {exists (select PRODUCT_STATUS_CODE from PRODUCT where ...)} <br />
     * PRODUCT by PRODUCT_STATUS_CODE, named 'productAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">existsProductList</span>(new SubQuery&lt;MbProductCB&gt;() {
     *     public void query(MbProductCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of ProductList for 'exists'. (NotNull)
     */
    public void existsProductList(SubQuery<MbProductCB> subQuery) {
        assertObjectNotNull("subQuery<MbProductCB>", subQuery);
        MbProductCB cb = new MbProductCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepProductStatusCode_ExistsReferrer_ProductList(cb.query()); // for saving query-value.
        registerExistsReferrer(cb.query(), "PRODUCT_STATUS_CODE", "PRODUCT_STATUS_CODE", subQueryPropertyName, "productList");
    }
    public abstract String keepProductStatusCode_ExistsReferrer_ProductList(MbProductCQ subQuery);

    /**
     * Set up NotExistsReferrer (co-related sub-query). <br />
     * {not exists (select PRODUCT_STATUS_CODE from PRODUCT where ...)} <br />
     * PRODUCT by PRODUCT_STATUS_CODE, named 'productAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">notExistsProductList</span>(new SubQuery&lt;MbProductCB&gt;() {
     *     public void query(MbProductCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of ProductStatusCode_NotExistsReferrer_ProductList for 'not exists'. (NotNull)
     */
    public void notExistsProductList(SubQuery<MbProductCB> subQuery) {
        assertObjectNotNull("subQuery<MbProductCB>", subQuery);
        MbProductCB cb = new MbProductCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepProductStatusCode_NotExistsReferrer_ProductList(cb.query()); // for saving query-value.
        registerNotExistsReferrer(cb.query(), "PRODUCT_STATUS_CODE", "PRODUCT_STATUS_CODE", subQueryPropertyName, "productList");
    }
    public abstract String keepProductStatusCode_NotExistsReferrer_ProductList(MbProductCQ subQuery);

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select PRODUCT_STATUS_CODE from PRODUCT where ...)} <br />
     * PRODUCT by PRODUCT_STATUS_CODE, named 'productAsOne'.
     * @param subQuery The sub-query of ProductList for 'in-scope'. (NotNull)
     */
    public void inScopeProductList(SubQuery<MbProductCB> subQuery) {
        assertObjectNotNull("subQuery<MbProductCB>", subQuery);
        MbProductCB cb = new MbProductCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepProductStatusCode_InScopeRelation_ProductList(cb.query()); // for saving query-value.
        registerInScopeRelation(cb.query(), "PRODUCT_STATUS_CODE", "PRODUCT_STATUS_CODE", subQueryPropertyName, "productList");
    }
    public abstract String keepProductStatusCode_InScopeRelation_ProductList(MbProductCQ subQuery);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select PRODUCT_STATUS_CODE from PRODUCT where ...)} <br />
     * PRODUCT by PRODUCT_STATUS_CODE, named 'productAsOne'.
     * @param subQuery The sub-query of ProductList for 'not in-scope'. (NotNull)
     */
    public void notInScopeProductList(SubQuery<MbProductCB> subQuery) {
        assertObjectNotNull("subQuery<MbProductCB>", subQuery);
        MbProductCB cb = new MbProductCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepProductStatusCode_NotInScopeRelation_ProductList(cb.query()); // for saving query-value.
        registerNotInScopeRelation(cb.query(), "PRODUCT_STATUS_CODE", "PRODUCT_STATUS_CODE", subQueryPropertyName, "productList");
    }
    public abstract String keepProductStatusCode_NotInScopeRelation_ProductList(MbProductCQ subQuery);

    public void xsderiveProductList(String function, SubQuery<MbProductCB> subQuery, String aliasName, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<MbProductCB>", subQuery);
        MbProductCB cb = new MbProductCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepProductStatusCode_SpecifyDerivedReferrer_ProductList(cb.query()); // for saving query-value.
        registerSpecifyDerivedReferrer(function, cb.query(), "PRODUCT_STATUS_CODE", "PRODUCT_STATUS_CODE", subQueryPropertyName, "productList", aliasName, option);
    }
    public abstract String keepProductStatusCode_SpecifyDerivedReferrer_ProductList(MbProductCQ subQuery);

    /**
     * Prepare for (Query)DerivedReferrer. <br />
     * {FOO &lt;= (select max(BAR) from PRODUCT where ...)} <br />
     * PRODUCT by PRODUCT_STATUS_CODE, named 'productAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">derivedProductList()</span>.<span style="color: #FD4747">max</span>(new SubQuery&lt;MbProductCB&gt;() {
     *     public void query(MbProductCB subCB) {
     *         subCB.specify().<span style="color: #FD4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *         subCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     *     }
     * }).<span style="color: #FD4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<MbProductCB> derivedProductList() {
        return xcreateQDRFunctionProductList();
    }
    protected HpQDRFunction<MbProductCB> xcreateQDRFunctionProductList() {
        return new HpQDRFunction<MbProductCB>(new HpQDRSetupper<MbProductCB>() {
            public void setup(String function, SubQuery<MbProductCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
                xqderiveProductList(function, subQuery, operand, value, option);
            }
        });
    }
    public void xqderiveProductList(String function, SubQuery<MbProductCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<MbProductCB>", subQuery);
        MbProductCB cb = new MbProductCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepProductStatusCode_QueryDerivedReferrer_ProductList(cb.query()); // for saving query-value.
        String parameterPropertyName = keepProductStatusCode_QueryDerivedReferrer_ProductListParameter(value);
        registerQueryDerivedReferrer(function, cb.query(), "PRODUCT_STATUS_CODE", "PRODUCT_STATUS_CODE", subQueryPropertyName, "productList", operand, value, parameterPropertyName, option);
    }
    public abstract String keepProductStatusCode_QueryDerivedReferrer_ProductList(MbProductCQ subQuery);
    public abstract String keepProductStatusCode_QueryDerivedReferrer_ProductListParameter(Object parameterValue);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * PRODUCT_STATUS_CODE: {PK, NotNull, CHAR(3)}
     */
    public void setProductStatusCode_IsNull() { regProductStatusCode(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * PRODUCT_STATUS_CODE: {PK, NotNull, CHAR(3)}
     */
    public void setProductStatusCode_IsNotNull() { regProductStatusCode(CK_ISNN, DOBJ); }

    protected void regProductStatusCode(ConditionKey k, Object v) { regQ(k, v, getCValueProductStatusCode(), "PRODUCT_STATUS_CODE"); }
    abstract protected ConditionValue getCValueProductStatusCode();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * PRODUCT_STATUS_NAME: {NotNull, VARCHAR(50)}
     * @param productStatusName The value of productStatusName as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setProductStatusName_Equal(String productStatusName) {
        doSetProductStatusName_Equal(fRES(productStatusName));
    }

    protected void doSetProductStatusName_Equal(String productStatusName) {
        regProductStatusName(CK_EQ, productStatusName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * PRODUCT_STATUS_NAME: {NotNull, VARCHAR(50)}
     * @param productStatusName The value of productStatusName as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setProductStatusName_NotEqual(String productStatusName) {
        doSetProductStatusName_NotEqual(fRES(productStatusName));
    }

    protected void doSetProductStatusName_NotEqual(String productStatusName) {
        regProductStatusName(CK_NES, productStatusName);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * PRODUCT_STATUS_NAME: {NotNull, VARCHAR(50)}
     * @param productStatusNameList The collection of productStatusName as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setProductStatusName_InScope(Collection<String> productStatusNameList) {
        doSetProductStatusName_InScope(productStatusNameList);
    }

    public void doSetProductStatusName_InScope(Collection<String> productStatusNameList) {
        regINS(CK_INS, cTL(productStatusNameList), getCValueProductStatusName(), "PRODUCT_STATUS_NAME");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * PRODUCT_STATUS_NAME: {NotNull, VARCHAR(50)}
     * @param productStatusName The value of productStatusName as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setProductStatusName_PrefixSearch(String productStatusName) {
        setProductStatusName_LikeSearch(productStatusName, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * PRODUCT_STATUS_NAME: {NotNull, VARCHAR(50)} <br />
     * <pre>e.g. setProductStatusName_LikeSearch("xxx", new <span style="color: #FD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param productStatusName The value of productStatusName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setProductStatusName_LikeSearch(String productStatusName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(productStatusName), getCValueProductStatusName(), "PRODUCT_STATUS_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * PRODUCT_STATUS_NAME: {NotNull, VARCHAR(50)}
     * @param productStatusName The value of productStatusName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setProductStatusName_NotLikeSearch(String productStatusName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(productStatusName), getCValueProductStatusName(), "PRODUCT_STATUS_NAME", likeSearchOption);
    }

    protected void regProductStatusName(ConditionKey k, Object v) { regQ(k, v, getCValueProductStatusName(), "PRODUCT_STATUS_NAME"); }
    abstract protected ConditionValue getCValueProductStatusName();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * DISPLAY_ORDER: {UQ, NotNull, INTEGER(10)}
     * @param displayOrder The value of displayOrder as equal. (NullAllowed: if null, no condition)
     */
    public void setDisplayOrder_Equal(Integer displayOrder) {
        doSetDisplayOrder_Equal(displayOrder);
    }

    protected void doSetDisplayOrder_Equal(Integer displayOrder) {
        regDisplayOrder(CK_EQ, displayOrder);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * DISPLAY_ORDER: {UQ, NotNull, INTEGER(10)}
     * @param displayOrder The value of displayOrder as notEqual. (NullAllowed: if null, no condition)
     */
    public void setDisplayOrder_NotEqual(Integer displayOrder) {
        doSetDisplayOrder_NotEqual(displayOrder);
    }

    protected void doSetDisplayOrder_NotEqual(Integer displayOrder) {
        regDisplayOrder(CK_NES, displayOrder);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * DISPLAY_ORDER: {UQ, NotNull, INTEGER(10)}
     * @param displayOrder The value of displayOrder as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setDisplayOrder_GreaterThan(Integer displayOrder) {
        regDisplayOrder(CK_GT, displayOrder);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * DISPLAY_ORDER: {UQ, NotNull, INTEGER(10)}
     * @param displayOrder The value of displayOrder as lessThan. (NullAllowed: if null, no condition)
     */
    public void setDisplayOrder_LessThan(Integer displayOrder) {
        regDisplayOrder(CK_LT, displayOrder);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * DISPLAY_ORDER: {UQ, NotNull, INTEGER(10)}
     * @param displayOrder The value of displayOrder as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setDisplayOrder_GreaterEqual(Integer displayOrder) {
        regDisplayOrder(CK_GE, displayOrder);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * DISPLAY_ORDER: {UQ, NotNull, INTEGER(10)}
     * @param displayOrder The value of displayOrder as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setDisplayOrder_LessEqual(Integer displayOrder) {
        regDisplayOrder(CK_LE, displayOrder);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * DISPLAY_ORDER: {UQ, NotNull, INTEGER(10)}
     * @param minNumber The min number of displayOrder. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of displayOrder. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setDisplayOrder_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueDisplayOrder(), "DISPLAY_ORDER", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * DISPLAY_ORDER: {UQ, NotNull, INTEGER(10)}
     * @param displayOrderList The collection of displayOrder as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setDisplayOrder_InScope(Collection<Integer> displayOrderList) {
        doSetDisplayOrder_InScope(displayOrderList);
    }

    protected void doSetDisplayOrder_InScope(Collection<Integer> displayOrderList) {
        regINS(CK_INS, cTL(displayOrderList), getCValueDisplayOrder(), "DISPLAY_ORDER");
    }

    protected void regDisplayOrder(ConditionKey k, Object v) { regQ(k, v, getCValueDisplayOrder(), "DISPLAY_ORDER"); }
    abstract protected ConditionValue getCValueDisplayOrder();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_Equal()</span>.max(new SubQuery&lt;MbProductStatusCB&gt;() {
     *     public void query(MbProductStatusCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<MbProductStatusCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ.getOperand());
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;MbProductStatusCB&gt;() {
     *     public void query(MbProductStatusCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<MbProductStatusCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;MbProductStatusCB&gt;() {
     *     public void query(MbProductStatusCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<MbProductStatusCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessThan()</span>.max(new SubQuery&lt;MbProductStatusCB&gt;() {
     *     public void query(MbProductStatusCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<MbProductStatusCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;MbProductStatusCB&gt;() {
     *     public void query(MbProductStatusCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<MbProductStatusCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;MbProductStatusCB&gt;() {
     *     public void query(MbProductStatusCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<MbProductStatusCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE.getOperand());
    }

    protected HpSSQFunction<MbProductStatusCB> xcreateSSQFunction(final String operand) {
        return new HpSSQFunction<MbProductStatusCB>(new HpSSQSetupper<MbProductStatusCB>() {
            public void setup(String function, SubQuery<MbProductStatusCB> subQuery, HpSSQOption<MbProductStatusCB> option) {
                xscalarCondition(function, subQuery, operand, option);
            }
        });
    }

    protected void xscalarCondition(String function, SubQuery<MbProductStatusCB> subQuery, String operand, HpSSQOption<MbProductStatusCB> option) {
        assertObjectNotNull("subQuery<MbProductStatusCB>", subQuery);
        MbProductStatusCB cb = xcreateScalarConditionCB(); subQuery.query(cb);
        String subQueryPropertyName = keepScalarCondition(cb.query()); // for saving query-value
        option.setPartitionByCBean(xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(function, cb.query(), subQueryPropertyName, operand, option);
    }
    public abstract String keepScalarCondition(MbProductStatusCQ subQuery);

    protected MbProductStatusCB xcreateScalarConditionCB() {
        MbProductStatusCB cb = new MbProductStatusCB();
        cb.xsetupForScalarCondition(this);
        return cb;
    }

    protected MbProductStatusCB xcreateScalarConditionPartitionByCB() {
        MbProductStatusCB cb = new MbProductStatusCB();
        cb.xsetupForScalarConditionPartitionBy(this);
        return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String function, SubQuery<MbProductStatusCB> subQuery, String aliasName, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<MbProductStatusCB>", subQuery);
        MbProductStatusCB cb = new MbProductStatusCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepSpecifyMyselfDerived(cb.query()); // for saving query-value.
        registerSpecifyMyselfDerived(function, cb.query(), "PRODUCT_STATUS_CODE", "PRODUCT_STATUS_CODE", subQueryPropertyName, "myselfDerived", aliasName, option);
    }
    public abstract String keepSpecifyMyselfDerived(MbProductStatusCQ subQuery);

    /**
     * Prepare for (Query)MyselfDerived (SubQuery).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<MbProductStatusCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived();
    }
    protected HpQDRFunction<MbProductStatusCB> xcreateQDRFunctionMyselfDerived() {
        return new HpQDRFunction<MbProductStatusCB>(new HpQDRSetupper<MbProductStatusCB>() {
            public void setup(String function, SubQuery<MbProductStatusCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
                xqderiveMyselfDerived(function, subQuery, operand, value, option);
            }
        });
    }
    public void xqderiveMyselfDerived(String function, SubQuery<MbProductStatusCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<MbProductStatusCB>", subQuery);
        MbProductStatusCB cb = new MbProductStatusCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String parameterPropertyName = keepQueryMyselfDerivedParameter(value);
        registerQueryMyselfDerived(function, cb.query(), "PRODUCT_STATUS_CODE", "PRODUCT_STATUS_CODE", subQueryPropertyName, "myselfDerived", operand, value, parameterPropertyName, option);
    }
    public abstract String keepQueryMyselfDerived(MbProductStatusCQ subQuery);
    public abstract String keepQueryMyselfDerivedParameter(Object parameterValue);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfExists(SubQuery<MbProductStatusCB> subQuery) {
        assertObjectNotNull("subQuery<MbProductStatusCB>", subQuery);
        MbProductStatusCB cb = new MbProductStatusCB(); cb.xsetupForMyselfExists(this); subQuery.query(cb);
        String subQueryPropertyName = keepMyselfExists(cb.query()); // for saving query-value.
        registerMyselfExists(cb.query(), subQueryPropertyName);
    }
    public abstract String keepMyselfExists(MbProductStatusCQ subQuery);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfInScope(SubQuery<MbProductStatusCB> subQuery) {
        assertObjectNotNull("subQuery<MbProductStatusCB>", subQuery);
        MbProductStatusCB cb = new MbProductStatusCB(); cb.xsetupForMyselfInScope(this); subQuery.query(cb);
        String subQueryPropertyName = keepMyselfInScope(cb.query()); // for saving query-value.
        registerMyselfInScope(cb.query(), subQueryPropertyName);
    }
    public abstract String keepMyselfInScope(MbProductStatusCQ subQuery);

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabCB() { return MbProductStatusCB.class.getName(); }
    protected String xabCQ() { return MbProductStatusCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
