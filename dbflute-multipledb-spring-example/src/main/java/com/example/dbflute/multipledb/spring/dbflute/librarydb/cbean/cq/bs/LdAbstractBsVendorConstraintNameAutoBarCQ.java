/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */package com.example.dbflute.multipledb.spring.dbflute.librarydb.cbean.cq.bs;

import java.util.*;

import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.cbean.chelper.*;
import org.seasar.dbflute.cbean.ckey.*;
import org.seasar.dbflute.cbean.coption.*;
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import org.seasar.dbflute.dbmeta.DBMetaProvider;
import com.example.dbflute.multipledb.spring.dbflute.librarydb.allcommon.*;
import com.example.dbflute.multipledb.spring.dbflute.librarydb.cbean.*;
import com.example.dbflute.multipledb.spring.dbflute.librarydb.cbean.cq.*;

/**
 * The abstract condition-query of VENDOR_CONSTRAINT_NAME_AUTO_BAR.
 * @author DBFlute(AutoGenerator)
 */
public abstract class LdAbstractBsVendorConstraintNameAutoBarCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public LdAbstractBsVendorConstraintNameAutoBarCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                     DBMeta Provider
    //                                                                     ===============
    @Override
    protected DBMetaProvider xgetDBMetaProvider() {
        return LdDBMetaInstanceHandler.getProvider();
    }

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "VENDOR_CONSTRAINT_NAME_AUTO_BAR";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * CONSTRAINT_NAME_AUTO_BAR_ID: {PK, NotNull, NUMERIC(16)}
     * @param constraintNameAutoBarId The value of constraintNameAutoBarId as equal. (NullAllowed: if null, no condition)
     */
    public void setConstraintNameAutoBarId_Equal(java.math.BigDecimal constraintNameAutoBarId) {
        doSetConstraintNameAutoBarId_Equal(constraintNameAutoBarId);
    }

    protected void doSetConstraintNameAutoBarId_Equal(java.math.BigDecimal constraintNameAutoBarId) {
        regConstraintNameAutoBarId(CK_EQ, constraintNameAutoBarId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * CONSTRAINT_NAME_AUTO_BAR_ID: {PK, NotNull, NUMERIC(16)}
     * @param constraintNameAutoBarId The value of constraintNameAutoBarId as notEqual. (NullAllowed: if null, no condition)
     */
    public void setConstraintNameAutoBarId_NotEqual(java.math.BigDecimal constraintNameAutoBarId) {
        doSetConstraintNameAutoBarId_NotEqual(constraintNameAutoBarId);
    }

    protected void doSetConstraintNameAutoBarId_NotEqual(java.math.BigDecimal constraintNameAutoBarId) {
        regConstraintNameAutoBarId(CK_NES, constraintNameAutoBarId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * CONSTRAINT_NAME_AUTO_BAR_ID: {PK, NotNull, NUMERIC(16)}
     * @param constraintNameAutoBarId The value of constraintNameAutoBarId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setConstraintNameAutoBarId_GreaterThan(java.math.BigDecimal constraintNameAutoBarId) {
        regConstraintNameAutoBarId(CK_GT, constraintNameAutoBarId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * CONSTRAINT_NAME_AUTO_BAR_ID: {PK, NotNull, NUMERIC(16)}
     * @param constraintNameAutoBarId The value of constraintNameAutoBarId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setConstraintNameAutoBarId_LessThan(java.math.BigDecimal constraintNameAutoBarId) {
        regConstraintNameAutoBarId(CK_LT, constraintNameAutoBarId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * CONSTRAINT_NAME_AUTO_BAR_ID: {PK, NotNull, NUMERIC(16)}
     * @param constraintNameAutoBarId The value of constraintNameAutoBarId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setConstraintNameAutoBarId_GreaterEqual(java.math.BigDecimal constraintNameAutoBarId) {
        regConstraintNameAutoBarId(CK_GE, constraintNameAutoBarId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * CONSTRAINT_NAME_AUTO_BAR_ID: {PK, NotNull, NUMERIC(16)}
     * @param constraintNameAutoBarId The value of constraintNameAutoBarId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setConstraintNameAutoBarId_LessEqual(java.math.BigDecimal constraintNameAutoBarId) {
        regConstraintNameAutoBarId(CK_LE, constraintNameAutoBarId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * CONSTRAINT_NAME_AUTO_BAR_ID: {PK, NotNull, NUMERIC(16)}
     * @param minNumber The min number of constraintNameAutoBarId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of constraintNameAutoBarId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setConstraintNameAutoBarId_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueConstraintNameAutoBarId(), "CONSTRAINT_NAME_AUTO_BAR_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * CONSTRAINT_NAME_AUTO_BAR_ID: {PK, NotNull, NUMERIC(16)}
     * @param constraintNameAutoBarIdList The collection of constraintNameAutoBarId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setConstraintNameAutoBarId_InScope(Collection<java.math.BigDecimal> constraintNameAutoBarIdList) {
        doSetConstraintNameAutoBarId_InScope(constraintNameAutoBarIdList);
    }

    protected void doSetConstraintNameAutoBarId_InScope(Collection<java.math.BigDecimal> constraintNameAutoBarIdList) {
        regINS(CK_INS, cTL(constraintNameAutoBarIdList), getCValueConstraintNameAutoBarId(), "CONSTRAINT_NAME_AUTO_BAR_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * CONSTRAINT_NAME_AUTO_BAR_ID: {PK, NotNull, NUMERIC(16)}
     * @param constraintNameAutoBarIdList The collection of constraintNameAutoBarId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setConstraintNameAutoBarId_NotInScope(Collection<java.math.BigDecimal> constraintNameAutoBarIdList) {
        doSetConstraintNameAutoBarId_NotInScope(constraintNameAutoBarIdList);
    }

    protected void doSetConstraintNameAutoBarId_NotInScope(Collection<java.math.BigDecimal> constraintNameAutoBarIdList) {
        regINS(CK_NINS, cTL(constraintNameAutoBarIdList), getCValueConstraintNameAutoBarId(), "CONSTRAINT_NAME_AUTO_BAR_ID");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br />
     * {exists (select CONSTRAINT_NAME_AUTO_BAR_ID from VENDOR_CONSTRAINT_NAME_AUTO_REF where ...)} <br />
     * VENDOR_CONSTRAINT_NAME_AUTO_REF by CONSTRAINT_NAME_AUTO_BAR_ID, named 'vendorConstraintNameAutoRefAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">existsVendorConstraintNameAutoRefList</span>(new SubQuery&lt;LdVendorConstraintNameAutoRefCB&gt;() {
     *     public void query(LdVendorConstraintNameAutoRefCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of VendorConstraintNameAutoRefList for 'exists'. (NotNull)
     */
    public void existsVendorConstraintNameAutoRefList(SubQuery<LdVendorConstraintNameAutoRefCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        LdVendorConstraintNameAutoRefCB cb = new LdVendorConstraintNameAutoRefCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String pp = keepConstraintNameAutoBarId_ExistsReferrer_VendorConstraintNameAutoRefList(cb.query()); // for saving query-value.
        registerExistsReferrer(cb.query(), "CONSTRAINT_NAME_AUTO_BAR_ID", "CONSTRAINT_NAME_AUTO_BAR_ID", pp, "vendorConstraintNameAutoRefList");
    }
    public abstract String keepConstraintNameAutoBarId_ExistsReferrer_VendorConstraintNameAutoRefList(LdVendorConstraintNameAutoRefCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br />
     * {not exists (select CONSTRAINT_NAME_AUTO_BAR_ID from VENDOR_CONSTRAINT_NAME_AUTO_REF where ...)} <br />
     * VENDOR_CONSTRAINT_NAME_AUTO_REF by CONSTRAINT_NAME_AUTO_BAR_ID, named 'vendorConstraintNameAutoRefAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">notExistsVendorConstraintNameAutoRefList</span>(new SubQuery&lt;LdVendorConstraintNameAutoRefCB&gt;() {
     *     public void query(LdVendorConstraintNameAutoRefCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of ConstraintNameAutoBarId_NotExistsReferrer_VendorConstraintNameAutoRefList for 'not exists'. (NotNull)
     */
    public void notExistsVendorConstraintNameAutoRefList(SubQuery<LdVendorConstraintNameAutoRefCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        LdVendorConstraintNameAutoRefCB cb = new LdVendorConstraintNameAutoRefCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String pp = keepConstraintNameAutoBarId_NotExistsReferrer_VendorConstraintNameAutoRefList(cb.query()); // for saving query-value.
        registerNotExistsReferrer(cb.query(), "CONSTRAINT_NAME_AUTO_BAR_ID", "CONSTRAINT_NAME_AUTO_BAR_ID", pp, "vendorConstraintNameAutoRefList");
    }
    public abstract String keepConstraintNameAutoBarId_NotExistsReferrer_VendorConstraintNameAutoRefList(LdVendorConstraintNameAutoRefCQ sq);

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select CONSTRAINT_NAME_AUTO_BAR_ID from VENDOR_CONSTRAINT_NAME_AUTO_REF where ...)} <br />
     * VENDOR_CONSTRAINT_NAME_AUTO_REF by CONSTRAINT_NAME_AUTO_BAR_ID, named 'vendorConstraintNameAutoRefAsOne'.
     * @param subQuery The sub-query of VendorConstraintNameAutoRefList for 'in-scope'. (NotNull)
     */
    public void inScopeVendorConstraintNameAutoRefList(SubQuery<LdVendorConstraintNameAutoRefCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        LdVendorConstraintNameAutoRefCB cb = new LdVendorConstraintNameAutoRefCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String pp = keepConstraintNameAutoBarId_InScopeRelation_VendorConstraintNameAutoRefList(cb.query()); // for saving query-value.
        registerInScopeRelation(cb.query(), "CONSTRAINT_NAME_AUTO_BAR_ID", "CONSTRAINT_NAME_AUTO_BAR_ID", pp, "vendorConstraintNameAutoRefList");
    }
    public abstract String keepConstraintNameAutoBarId_InScopeRelation_VendorConstraintNameAutoRefList(LdVendorConstraintNameAutoRefCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select CONSTRAINT_NAME_AUTO_BAR_ID from VENDOR_CONSTRAINT_NAME_AUTO_REF where ...)} <br />
     * VENDOR_CONSTRAINT_NAME_AUTO_REF by CONSTRAINT_NAME_AUTO_BAR_ID, named 'vendorConstraintNameAutoRefAsOne'.
     * @param subQuery The sub-query of VendorConstraintNameAutoRefList for 'not in-scope'. (NotNull)
     */
    public void notInScopeVendorConstraintNameAutoRefList(SubQuery<LdVendorConstraintNameAutoRefCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        LdVendorConstraintNameAutoRefCB cb = new LdVendorConstraintNameAutoRefCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String pp = keepConstraintNameAutoBarId_NotInScopeRelation_VendorConstraintNameAutoRefList(cb.query()); // for saving query-value.
        registerNotInScopeRelation(cb.query(), "CONSTRAINT_NAME_AUTO_BAR_ID", "CONSTRAINT_NAME_AUTO_BAR_ID", pp, "vendorConstraintNameAutoRefList");
    }
    public abstract String keepConstraintNameAutoBarId_NotInScopeRelation_VendorConstraintNameAutoRefList(LdVendorConstraintNameAutoRefCQ sq);

    public void xsderiveVendorConstraintNameAutoRefList(String fn, SubQuery<LdVendorConstraintNameAutoRefCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        LdVendorConstraintNameAutoRefCB cb = new LdVendorConstraintNameAutoRefCB(); cb.xsetupForDerivedReferrer(this); sq.query(cb);
        String pp = keepConstraintNameAutoBarId_SpecifyDerivedReferrer_VendorConstraintNameAutoRefList(cb.query()); // for saving query-value.
        registerSpecifyDerivedReferrer(fn, cb.query(), "CONSTRAINT_NAME_AUTO_BAR_ID", "CONSTRAINT_NAME_AUTO_BAR_ID", pp, "vendorConstraintNameAutoRefList", al, op);
    }
    public abstract String keepConstraintNameAutoBarId_SpecifyDerivedReferrer_VendorConstraintNameAutoRefList(LdVendorConstraintNameAutoRefCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer. <br />
     * {FOO &lt;= (select max(BAR) from VENDOR_CONSTRAINT_NAME_AUTO_REF where ...)} <br />
     * VENDOR_CONSTRAINT_NAME_AUTO_REF by CONSTRAINT_NAME_AUTO_BAR_ID, named 'vendorConstraintNameAutoRefAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">derivedVendorConstraintNameAutoRefList()</span>.<span style="color: #FD4747">max</span>(new SubQuery&lt;LdVendorConstraintNameAutoRefCB&gt;() {
     *     public void query(LdVendorConstraintNameAutoRefCB subCB) {
     *         subCB.specify().<span style="color: #FD4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *         subCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     *     }
     * }).<span style="color: #FD4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<LdVendorConstraintNameAutoRefCB> derivedVendorConstraintNameAutoRefList() {
        return xcreateQDRFunctionVendorConstraintNameAutoRefList();
    }
    protected HpQDRFunction<LdVendorConstraintNameAutoRefCB> xcreateQDRFunctionVendorConstraintNameAutoRefList() {
        return new HpQDRFunction<LdVendorConstraintNameAutoRefCB>(new HpQDRSetupper<LdVendorConstraintNameAutoRefCB>() {
            public void setup(String fn, SubQuery<LdVendorConstraintNameAutoRefCB> sq, String rd, Object vl, DerivedReferrerOption op) {
                xqderiveVendorConstraintNameAutoRefList(fn, sq, rd, vl, op);
            }
        });
    }
    public void xqderiveVendorConstraintNameAutoRefList(String fn, SubQuery<LdVendorConstraintNameAutoRefCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        LdVendorConstraintNameAutoRefCB cb = new LdVendorConstraintNameAutoRefCB(); cb.xsetupForDerivedReferrer(this); sq.query(cb);
        String sqpp = keepConstraintNameAutoBarId_QueryDerivedReferrer_VendorConstraintNameAutoRefList(cb.query()); // for saving query-value.
        String prpp = keepConstraintNameAutoBarId_QueryDerivedReferrer_VendorConstraintNameAutoRefListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CONSTRAINT_NAME_AUTO_BAR_ID", "CONSTRAINT_NAME_AUTO_BAR_ID", sqpp, "vendorConstraintNameAutoRefList", rd, vl, prpp, op);
    }
    public abstract String keepConstraintNameAutoBarId_QueryDerivedReferrer_VendorConstraintNameAutoRefList(LdVendorConstraintNameAutoRefCQ sq);
    public abstract String keepConstraintNameAutoBarId_QueryDerivedReferrer_VendorConstraintNameAutoRefListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * CONSTRAINT_NAME_AUTO_BAR_ID: {PK, NotNull, NUMERIC(16)}
     */
    public void setConstraintNameAutoBarId_IsNull() { regConstraintNameAutoBarId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * CONSTRAINT_NAME_AUTO_BAR_ID: {PK, NotNull, NUMERIC(16)}
     */
    public void setConstraintNameAutoBarId_IsNotNull() { regConstraintNameAutoBarId(CK_ISNN, DOBJ); }

    protected void regConstraintNameAutoBarId(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueConstraintNameAutoBarId(), "CONSTRAINT_NAME_AUTO_BAR_ID"); }
    protected abstract ConditionValue getCValueConstraintNameAutoBarId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * CONSTRAINT_NAME_AUTO_BAR_NAME: {UQ, NotNull, VARCHAR(50)}
     * @param constraintNameAutoBarName The value of constraintNameAutoBarName as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setConstraintNameAutoBarName_Equal(String constraintNameAutoBarName) {
        doSetConstraintNameAutoBarName_Equal(fRES(constraintNameAutoBarName));
    }

    protected void doSetConstraintNameAutoBarName_Equal(String constraintNameAutoBarName) {
        regConstraintNameAutoBarName(CK_EQ, constraintNameAutoBarName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * CONSTRAINT_NAME_AUTO_BAR_NAME: {UQ, NotNull, VARCHAR(50)}
     * @param constraintNameAutoBarName The value of constraintNameAutoBarName as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setConstraintNameAutoBarName_NotEqual(String constraintNameAutoBarName) {
        doSetConstraintNameAutoBarName_NotEqual(fRES(constraintNameAutoBarName));
    }

    protected void doSetConstraintNameAutoBarName_NotEqual(String constraintNameAutoBarName) {
        regConstraintNameAutoBarName(CK_NES, constraintNameAutoBarName);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * CONSTRAINT_NAME_AUTO_BAR_NAME: {UQ, NotNull, VARCHAR(50)}
     * @param constraintNameAutoBarName The value of constraintNameAutoBarName as greaterThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setConstraintNameAutoBarName_GreaterThan(String constraintNameAutoBarName) {
        regConstraintNameAutoBarName(CK_GT, fRES(constraintNameAutoBarName));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * CONSTRAINT_NAME_AUTO_BAR_NAME: {UQ, NotNull, VARCHAR(50)}
     * @param constraintNameAutoBarName The value of constraintNameAutoBarName as lessThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setConstraintNameAutoBarName_LessThan(String constraintNameAutoBarName) {
        regConstraintNameAutoBarName(CK_LT, fRES(constraintNameAutoBarName));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * CONSTRAINT_NAME_AUTO_BAR_NAME: {UQ, NotNull, VARCHAR(50)}
     * @param constraintNameAutoBarName The value of constraintNameAutoBarName as greaterEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setConstraintNameAutoBarName_GreaterEqual(String constraintNameAutoBarName) {
        regConstraintNameAutoBarName(CK_GE, fRES(constraintNameAutoBarName));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * CONSTRAINT_NAME_AUTO_BAR_NAME: {UQ, NotNull, VARCHAR(50)}
     * @param constraintNameAutoBarName The value of constraintNameAutoBarName as lessEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setConstraintNameAutoBarName_LessEqual(String constraintNameAutoBarName) {
        regConstraintNameAutoBarName(CK_LE, fRES(constraintNameAutoBarName));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * CONSTRAINT_NAME_AUTO_BAR_NAME: {UQ, NotNull, VARCHAR(50)}
     * @param constraintNameAutoBarNameList The collection of constraintNameAutoBarName as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setConstraintNameAutoBarName_InScope(Collection<String> constraintNameAutoBarNameList) {
        doSetConstraintNameAutoBarName_InScope(constraintNameAutoBarNameList);
    }

    public void doSetConstraintNameAutoBarName_InScope(Collection<String> constraintNameAutoBarNameList) {
        regINS(CK_INS, cTL(constraintNameAutoBarNameList), getCValueConstraintNameAutoBarName(), "CONSTRAINT_NAME_AUTO_BAR_NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * CONSTRAINT_NAME_AUTO_BAR_NAME: {UQ, NotNull, VARCHAR(50)}
     * @param constraintNameAutoBarNameList The collection of constraintNameAutoBarName as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setConstraintNameAutoBarName_NotInScope(Collection<String> constraintNameAutoBarNameList) {
        doSetConstraintNameAutoBarName_NotInScope(constraintNameAutoBarNameList);
    }

    public void doSetConstraintNameAutoBarName_NotInScope(Collection<String> constraintNameAutoBarNameList) {
        regINS(CK_NINS, cTL(constraintNameAutoBarNameList), getCValueConstraintNameAutoBarName(), "CONSTRAINT_NAME_AUTO_BAR_NAME");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * CONSTRAINT_NAME_AUTO_BAR_NAME: {UQ, NotNull, VARCHAR(50)}
     * @param constraintNameAutoBarName The value of constraintNameAutoBarName as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setConstraintNameAutoBarName_PrefixSearch(String constraintNameAutoBarName) {
        setConstraintNameAutoBarName_LikeSearch(constraintNameAutoBarName, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * CONSTRAINT_NAME_AUTO_BAR_NAME: {UQ, NotNull, VARCHAR(50)} <br />
     * <pre>e.g. setConstraintNameAutoBarName_LikeSearch("xxx", new <span style="color: #FD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param constraintNameAutoBarName The value of constraintNameAutoBarName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setConstraintNameAutoBarName_LikeSearch(String constraintNameAutoBarName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(constraintNameAutoBarName), getCValueConstraintNameAutoBarName(), "CONSTRAINT_NAME_AUTO_BAR_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * CONSTRAINT_NAME_AUTO_BAR_NAME: {UQ, NotNull, VARCHAR(50)}
     * @param constraintNameAutoBarName The value of constraintNameAutoBarName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setConstraintNameAutoBarName_NotLikeSearch(String constraintNameAutoBarName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(constraintNameAutoBarName), getCValueConstraintNameAutoBarName(), "CONSTRAINT_NAME_AUTO_BAR_NAME", likeSearchOption);
    }

    protected void regConstraintNameAutoBarName(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueConstraintNameAutoBarName(), "CONSTRAINT_NAME_AUTO_BAR_NAME"); }
    protected abstract ConditionValue getCValueConstraintNameAutoBarName();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_Equal()</span>.max(new SubQuery&lt;LdVendorConstraintNameAutoBarCB&gt;() {
     *     public void query(LdVendorConstraintNameAutoBarCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<LdVendorConstraintNameAutoBarCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ.getOperand(), LdVendorConstraintNameAutoBarCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;LdVendorConstraintNameAutoBarCB&gt;() {
     *     public void query(LdVendorConstraintNameAutoBarCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<LdVendorConstraintNameAutoBarCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES.getOperand(), LdVendorConstraintNameAutoBarCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;LdVendorConstraintNameAutoBarCB&gt;() {
     *     public void query(LdVendorConstraintNameAutoBarCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<LdVendorConstraintNameAutoBarCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT.getOperand(), LdVendorConstraintNameAutoBarCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessThan()</span>.max(new SubQuery&lt;LdVendorConstraintNameAutoBarCB&gt;() {
     *     public void query(LdVendorConstraintNameAutoBarCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<LdVendorConstraintNameAutoBarCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT.getOperand(), LdVendorConstraintNameAutoBarCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;LdVendorConstraintNameAutoBarCB&gt;() {
     *     public void query(LdVendorConstraintNameAutoBarCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<LdVendorConstraintNameAutoBarCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE.getOperand(), LdVendorConstraintNameAutoBarCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;LdVendorConstraintNameAutoBarCB&gt;() {
     *     public void query(LdVendorConstraintNameAutoBarCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<LdVendorConstraintNameAutoBarCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE.getOperand(), LdVendorConstraintNameAutoBarCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSSQOption<CB> op) {
        assertObjectNotNull("subQuery", sq);
        LdVendorConstraintNameAutoBarCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        op.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, op);
    }
    public abstract String keepScalarCondition(LdVendorConstraintNameAutoBarCQ sq);

    protected LdVendorConstraintNameAutoBarCB xcreateScalarConditionCB() {
        LdVendorConstraintNameAutoBarCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected LdVendorConstraintNameAutoBarCB xcreateScalarConditionPartitionByCB() {
        LdVendorConstraintNameAutoBarCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<LdVendorConstraintNameAutoBarCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        LdVendorConstraintNameAutoBarCB cb = new LdVendorConstraintNameAutoBarCB(); cb.xsetupForDerivedReferrer(this); sq.query(cb);
        String pk = "CONSTRAINT_NAME_AUTO_BAR_ID";
        String pp = keepSpecifyMyselfDerived(cb.query()); // for saving query-value.
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(LdVendorConstraintNameAutoBarCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (SubQuery).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<LdVendorConstraintNameAutoBarCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(LdVendorConstraintNameAutoBarCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        LdVendorConstraintNameAutoBarCB cb = new LdVendorConstraintNameAutoBarCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "CONSTRAINT_NAME_AUTO_BAR_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(LdVendorConstraintNameAutoBarCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfExists(SubQuery<LdVendorConstraintNameAutoBarCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        LdVendorConstraintNameAutoBarCB cb = new LdVendorConstraintNameAutoBarCB(); cb.xsetupForMyselfExists(this); subQuery.query(cb);
        String pp = keepMyselfExists(cb.query()); // for saving query-value.
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(LdVendorConstraintNameAutoBarCQ sq);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfInScope(SubQuery<LdVendorConstraintNameAutoBarCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        LdVendorConstraintNameAutoBarCB cb = new LdVendorConstraintNameAutoBarCB(); cb.xsetupForMyselfInScope(this); subQuery.query(cb);
        String pp = keepMyselfInScope(cb.query()); // for saving query-value.
        registerMyselfInScope(cb.query(), pp);
    }
    public abstract String keepMyselfInScope(LdVendorConstraintNameAutoBarCQ sq);

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    protected LdVendorConstraintNameAutoBarCB newMyCB() {
        return new LdVendorConstraintNameAutoBarCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabCQ() { return LdVendorConstraintNameAutoBarCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
