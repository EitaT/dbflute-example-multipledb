/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */package com.example.dbflute.multipledb.spring.dbflute.librarydb.cbean.cq.bs;

import java.util.Map;

import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.cbean.chelper.*;
import org.seasar.dbflute.cbean.coption.*;
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import org.seasar.dbflute.exception.IllegalConditionBeanOperationException;
import com.example.dbflute.multipledb.spring.dbflute.librarydb.cbean.cq.ciq.*;
import com.example.dbflute.multipledb.spring.dbflute.librarydb.cbean.*;
import com.example.dbflute.multipledb.spring.dbflute.librarydb.cbean.cq.*;

/**
 * The base condition-query of VENDOR_CHECK.
 * @author DBFlute(AutoGenerator)
 */
public class LdBsVendorCheckCQ extends LdAbstractBsVendorCheckCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected LdVendorCheckCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public LdBsVendorCheckCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from VENDOR_CHECK) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public LdVendorCheckCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected LdVendorCheckCIQ xcreateCIQ() {
        LdVendorCheckCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected LdVendorCheckCIQ xnewCIQ() {
        return new LdVendorCheckCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join VENDOR_CHECK on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public LdVendorCheckCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        LdVendorCheckCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _vendorCheckId;
    public ConditionValue getVendorCheckId()
    { if (_vendorCheckId == null) { _vendorCheckId = nCV(); }
      return _vendorCheckId; }
    protected ConditionValue getCValueVendorCheckId() { return getVendorCheckId(); }

    /** 
     * Add order-by as ascend. <br />
     * VENDOR_CHECK_ID: {NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public LdBsVendorCheckCQ addOrderBy_VendorCheckId_Asc() { regOBA("VENDOR_CHECK_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * VENDOR_CHECK_ID: {NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public LdBsVendorCheckCQ addOrderBy_VendorCheckId_Desc() { regOBD("VENDOR_CHECK_ID"); return this; }

    protected ConditionValue _typeOfChar;
    public ConditionValue getTypeOfChar()
    { if (_typeOfChar == null) { _typeOfChar = nCV(); }
      return _typeOfChar; }
    protected ConditionValue getCValueTypeOfChar() { return getTypeOfChar(); }

    /** 
     * Add order-by as ascend. <br />
     * TYPE_OF_CHAR: {CHAR(3)}
     * @return this. (NotNull)
     */
    public LdBsVendorCheckCQ addOrderBy_TypeOfChar_Asc() { regOBA("TYPE_OF_CHAR"); return this; }

    /**
     * Add order-by as descend. <br />
     * TYPE_OF_CHAR: {CHAR(3)}
     * @return this. (NotNull)
     */
    public LdBsVendorCheckCQ addOrderBy_TypeOfChar_Desc() { regOBD("TYPE_OF_CHAR"); return this; }

    protected ConditionValue _typeOfVarchar;
    public ConditionValue getTypeOfVarchar()
    { if (_typeOfVarchar == null) { _typeOfVarchar = nCV(); }
      return _typeOfVarchar; }
    protected ConditionValue getCValueTypeOfVarchar() { return getTypeOfVarchar(); }

    /** 
     * Add order-by as ascend. <br />
     * TYPE_OF_VARCHAR: {VARCHAR(32)}
     * @return this. (NotNull)
     */
    public LdBsVendorCheckCQ addOrderBy_TypeOfVarchar_Asc() { regOBA("TYPE_OF_VARCHAR"); return this; }

    /**
     * Add order-by as descend. <br />
     * TYPE_OF_VARCHAR: {VARCHAR(32)}
     * @return this. (NotNull)
     */
    public LdBsVendorCheckCQ addOrderBy_TypeOfVarchar_Desc() { regOBD("TYPE_OF_VARCHAR"); return this; }

    protected ConditionValue _typeOfLongVarchar;
    public ConditionValue getTypeOfLongVarchar()
    { if (_typeOfLongVarchar == null) { _typeOfLongVarchar = nCV(); }
      return _typeOfLongVarchar; }
    protected ConditionValue getCValueTypeOfLongVarchar() { return getTypeOfLongVarchar(); }

    /** 
     * Add order-by as ascend. <br />
     * TYPE_OF_LONG_VARCHAR: {LONG VARCHAR(32700)}
     * @return this. (NotNull)
     */
    public LdBsVendorCheckCQ addOrderBy_TypeOfLongVarchar_Asc() { regOBA("TYPE_OF_LONG_VARCHAR"); return this; }

    /**
     * Add order-by as descend. <br />
     * TYPE_OF_LONG_VARCHAR: {LONG VARCHAR(32700)}
     * @return this. (NotNull)
     */
    public LdBsVendorCheckCQ addOrderBy_TypeOfLongVarchar_Desc() { regOBD("TYPE_OF_LONG_VARCHAR"); return this; }

    protected ConditionValue _typeOfClob;
    public ConditionValue getTypeOfClob()
    { if (_typeOfClob == null) { _typeOfClob = nCV(); }
      return _typeOfClob; }
    protected ConditionValue getCValueTypeOfClob() { return getTypeOfClob(); }

    /** 
     * Add order-by as ascend. <br />
     * TYPE_OF_CLOB: {CLOB(2147483647)}
     * @return this. (NotNull)
     */
    public LdBsVendorCheckCQ addOrderBy_TypeOfClob_Asc() { regOBA("TYPE_OF_CLOB"); return this; }

    /**
     * Add order-by as descend. <br />
     * TYPE_OF_CLOB: {CLOB(2147483647)}
     * @return this. (NotNull)
     */
    public LdBsVendorCheckCQ addOrderBy_TypeOfClob_Desc() { regOBD("TYPE_OF_CLOB"); return this; }

    protected ConditionValue _typeOfDecimalInteger;
    public ConditionValue getTypeOfDecimalInteger()
    { if (_typeOfDecimalInteger == null) { _typeOfDecimalInteger = nCV(); }
      return _typeOfDecimalInteger; }
    protected ConditionValue getCValueTypeOfDecimalInteger() { return getTypeOfDecimalInteger(); }

    /** 
     * Add order-by as ascend. <br />
     * TYPE_OF_DECIMAL_INTEGER: {DECIMAL(5)}
     * @return this. (NotNull)
     */
    public LdBsVendorCheckCQ addOrderBy_TypeOfDecimalInteger_Asc() { regOBA("TYPE_OF_DECIMAL_INTEGER"); return this; }

    /**
     * Add order-by as descend. <br />
     * TYPE_OF_DECIMAL_INTEGER: {DECIMAL(5)}
     * @return this. (NotNull)
     */
    public LdBsVendorCheckCQ addOrderBy_TypeOfDecimalInteger_Desc() { regOBD("TYPE_OF_DECIMAL_INTEGER"); return this; }

    protected ConditionValue _typeOfDecimalBigint;
    public ConditionValue getTypeOfDecimalBigint()
    { if (_typeOfDecimalBigint == null) { _typeOfDecimalBigint = nCV(); }
      return _typeOfDecimalBigint; }
    protected ConditionValue getCValueTypeOfDecimalBigint() { return getTypeOfDecimalBigint(); }

    /** 
     * Add order-by as ascend. <br />
     * TYPE_OF_DECIMAL_BIGINT: {DECIMAL(12)}
     * @return this. (NotNull)
     */
    public LdBsVendorCheckCQ addOrderBy_TypeOfDecimalBigint_Asc() { regOBA("TYPE_OF_DECIMAL_BIGINT"); return this; }

    /**
     * Add order-by as descend. <br />
     * TYPE_OF_DECIMAL_BIGINT: {DECIMAL(12)}
     * @return this. (NotNull)
     */
    public LdBsVendorCheckCQ addOrderBy_TypeOfDecimalBigint_Desc() { regOBD("TYPE_OF_DECIMAL_BIGINT"); return this; }

    protected ConditionValue _typeOfDecimalDecimal;
    public ConditionValue getTypeOfDecimalDecimal()
    { if (_typeOfDecimalDecimal == null) { _typeOfDecimalDecimal = nCV(); }
      return _typeOfDecimalDecimal; }
    protected ConditionValue getCValueTypeOfDecimalDecimal() { return getTypeOfDecimalDecimal(); }

    /** 
     * Add order-by as ascend. <br />
     * TYPE_OF_DECIMAL_DECIMAL: {DECIMAL(5, 3)}
     * @return this. (NotNull)
     */
    public LdBsVendorCheckCQ addOrderBy_TypeOfDecimalDecimal_Asc() { regOBA("TYPE_OF_DECIMAL_DECIMAL"); return this; }

    /**
     * Add order-by as descend. <br />
     * TYPE_OF_DECIMAL_DECIMAL: {DECIMAL(5, 3)}
     * @return this. (NotNull)
     */
    public LdBsVendorCheckCQ addOrderBy_TypeOfDecimalDecimal_Desc() { regOBD("TYPE_OF_DECIMAL_DECIMAL"); return this; }

    protected ConditionValue _typeOfBigint;
    public ConditionValue getTypeOfBigint()
    { if (_typeOfBigint == null) { _typeOfBigint = nCV(); }
      return _typeOfBigint; }
    protected ConditionValue getCValueTypeOfBigint() { return getTypeOfBigint(); }

    /** 
     * Add order-by as ascend. <br />
     * TYPE_OF_BIGINT: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public LdBsVendorCheckCQ addOrderBy_TypeOfBigint_Asc() { regOBA("TYPE_OF_BIGINT"); return this; }

    /**
     * Add order-by as descend. <br />
     * TYPE_OF_BIGINT: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public LdBsVendorCheckCQ addOrderBy_TypeOfBigint_Desc() { regOBD("TYPE_OF_BIGINT"); return this; }

    protected ConditionValue _typeOfInteger;
    public ConditionValue getTypeOfInteger()
    { if (_typeOfInteger == null) { _typeOfInteger = nCV(); }
      return _typeOfInteger; }
    protected ConditionValue getCValueTypeOfInteger() { return getTypeOfInteger(); }

    /** 
     * Add order-by as ascend. <br />
     * TYPE_OF_INTEGER: {INTEGER(10)}
     * @return this. (NotNull)
     */
    public LdBsVendorCheckCQ addOrderBy_TypeOfInteger_Asc() { regOBA("TYPE_OF_INTEGER"); return this; }

    /**
     * Add order-by as descend. <br />
     * TYPE_OF_INTEGER: {INTEGER(10)}
     * @return this. (NotNull)
     */
    public LdBsVendorCheckCQ addOrderBy_TypeOfInteger_Desc() { regOBD("TYPE_OF_INTEGER"); return this; }

    protected ConditionValue _typeOfDate;
    public ConditionValue getTypeOfDate()
    { if (_typeOfDate == null) { _typeOfDate = nCV(); }
      return _typeOfDate; }
    protected ConditionValue getCValueTypeOfDate() { return getTypeOfDate(); }

    /** 
     * Add order-by as ascend. <br />
     * TYPE_OF_DATE: {DATE(10)}
     * @return this. (NotNull)
     */
    public LdBsVendorCheckCQ addOrderBy_TypeOfDate_Asc() { regOBA("TYPE_OF_DATE"); return this; }

    /**
     * Add order-by as descend. <br />
     * TYPE_OF_DATE: {DATE(10)}
     * @return this. (NotNull)
     */
    public LdBsVendorCheckCQ addOrderBy_TypeOfDate_Desc() { regOBD("TYPE_OF_DATE"); return this; }

    protected ConditionValue _typeOfTimestamp;
    public ConditionValue getTypeOfTimestamp()
    { if (_typeOfTimestamp == null) { _typeOfTimestamp = nCV(); }
      return _typeOfTimestamp; }
    protected ConditionValue getCValueTypeOfTimestamp() { return getTypeOfTimestamp(); }

    /** 
     * Add order-by as ascend. <br />
     * TYPE_OF_TIMESTAMP: {TIMESTAMP(26, 6)}
     * @return this. (NotNull)
     */
    public LdBsVendorCheckCQ addOrderBy_TypeOfTimestamp_Asc() { regOBA("TYPE_OF_TIMESTAMP"); return this; }

    /**
     * Add order-by as descend. <br />
     * TYPE_OF_TIMESTAMP: {TIMESTAMP(26, 6)}
     * @return this. (NotNull)
     */
    public LdBsVendorCheckCQ addOrderBy_TypeOfTimestamp_Desc() { regOBD("TYPE_OF_TIMESTAMP"); return this; }

    protected ConditionValue _typeOfTime;
    public ConditionValue getTypeOfTime()
    { if (_typeOfTime == null) { _typeOfTime = nCV(); }
      return _typeOfTime; }
    protected ConditionValue getCValueTypeOfTime() { return getTypeOfTime(); }

    /** 
     * Add order-by as ascend. <br />
     * TYPE_OF_TIME: {TIME(8)}
     * @return this. (NotNull)
     */
    public LdBsVendorCheckCQ addOrderBy_TypeOfTime_Asc() { regOBA("TYPE_OF_TIME"); return this; }

    /**
     * Add order-by as descend. <br />
     * TYPE_OF_TIME: {TIME(8)}
     * @return this. (NotNull)
     */
    public LdBsVendorCheckCQ addOrderBy_TypeOfTime_Desc() { regOBD("TYPE_OF_TIME"); return this; }

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
    public LdBsVendorCheckCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public LdBsVendorCheckCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, LdVendorCheckCQ> getScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(LdVendorCheckCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return LdVendorCheckCB.class.getName(); }
    protected String xCQ() { return LdVendorCheckCQ.class.getName(); }
    protected String xCHp() { return HpCalculator.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
