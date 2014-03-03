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
 * The abstract condition-query of VENDOR_CONSTRAINT_NAME_AUTO_FOO.
 * @author DBFlute(AutoGenerator)
 */
public abstract class LdAbstractBsVendorConstraintNameAutoFooCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public LdAbstractBsVendorConstraintNameAutoFooCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "VENDOR_CONSTRAINT_NAME_AUTO_FOO";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * CONSTRAINT_NAME_AUTO_FOO_ID: {PK, NotNull, NUMERIC(16)}
     * @param constraintNameAutoFooId The value of constraintNameAutoFooId as equal. (NullAllowed: if null, no condition)
     */
    public void setConstraintNameAutoFooId_Equal(java.math.BigDecimal constraintNameAutoFooId) {
        doSetConstraintNameAutoFooId_Equal(constraintNameAutoFooId);
    }

    protected void doSetConstraintNameAutoFooId_Equal(java.math.BigDecimal constraintNameAutoFooId) {
        regConstraintNameAutoFooId(CK_EQ, constraintNameAutoFooId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * CONSTRAINT_NAME_AUTO_FOO_ID: {PK, NotNull, NUMERIC(16)}
     * @param constraintNameAutoFooId The value of constraintNameAutoFooId as notEqual. (NullAllowed: if null, no condition)
     */
    public void setConstraintNameAutoFooId_NotEqual(java.math.BigDecimal constraintNameAutoFooId) {
        doSetConstraintNameAutoFooId_NotEqual(constraintNameAutoFooId);
    }

    protected void doSetConstraintNameAutoFooId_NotEqual(java.math.BigDecimal constraintNameAutoFooId) {
        regConstraintNameAutoFooId(CK_NES, constraintNameAutoFooId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * CONSTRAINT_NAME_AUTO_FOO_ID: {PK, NotNull, NUMERIC(16)}
     * @param constraintNameAutoFooId The value of constraintNameAutoFooId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setConstraintNameAutoFooId_GreaterThan(java.math.BigDecimal constraintNameAutoFooId) {
        regConstraintNameAutoFooId(CK_GT, constraintNameAutoFooId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * CONSTRAINT_NAME_AUTO_FOO_ID: {PK, NotNull, NUMERIC(16)}
     * @param constraintNameAutoFooId The value of constraintNameAutoFooId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setConstraintNameAutoFooId_LessThan(java.math.BigDecimal constraintNameAutoFooId) {
        regConstraintNameAutoFooId(CK_LT, constraintNameAutoFooId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * CONSTRAINT_NAME_AUTO_FOO_ID: {PK, NotNull, NUMERIC(16)}
     * @param constraintNameAutoFooId The value of constraintNameAutoFooId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setConstraintNameAutoFooId_GreaterEqual(java.math.BigDecimal constraintNameAutoFooId) {
        regConstraintNameAutoFooId(CK_GE, constraintNameAutoFooId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * CONSTRAINT_NAME_AUTO_FOO_ID: {PK, NotNull, NUMERIC(16)}
     * @param constraintNameAutoFooId The value of constraintNameAutoFooId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setConstraintNameAutoFooId_LessEqual(java.math.BigDecimal constraintNameAutoFooId) {
        regConstraintNameAutoFooId(CK_LE, constraintNameAutoFooId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * CONSTRAINT_NAME_AUTO_FOO_ID: {PK, NotNull, NUMERIC(16)}
     * @param minNumber The min number of constraintNameAutoFooId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of constraintNameAutoFooId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setConstraintNameAutoFooId_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueConstraintNameAutoFooId(), "CONSTRAINT_NAME_AUTO_FOO_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * CONSTRAINT_NAME_AUTO_FOO_ID: {PK, NotNull, NUMERIC(16)}
     * @param constraintNameAutoFooIdList The collection of constraintNameAutoFooId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setConstraintNameAutoFooId_InScope(Collection<java.math.BigDecimal> constraintNameAutoFooIdList) {
        doSetConstraintNameAutoFooId_InScope(constraintNameAutoFooIdList);
    }

    protected void doSetConstraintNameAutoFooId_InScope(Collection<java.math.BigDecimal> constraintNameAutoFooIdList) {
        regINS(CK_INS, cTL(constraintNameAutoFooIdList), getCValueConstraintNameAutoFooId(), "CONSTRAINT_NAME_AUTO_FOO_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * CONSTRAINT_NAME_AUTO_FOO_ID: {PK, NotNull, NUMERIC(16)}
     * @param constraintNameAutoFooIdList The collection of constraintNameAutoFooId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setConstraintNameAutoFooId_NotInScope(Collection<java.math.BigDecimal> constraintNameAutoFooIdList) {
        doSetConstraintNameAutoFooId_NotInScope(constraintNameAutoFooIdList);
    }

    protected void doSetConstraintNameAutoFooId_NotInScope(Collection<java.math.BigDecimal> constraintNameAutoFooIdList) {
        regINS(CK_NINS, cTL(constraintNameAutoFooIdList), getCValueConstraintNameAutoFooId(), "CONSTRAINT_NAME_AUTO_FOO_ID");
    }

    /**
     * Set up ExistsReferrer (co-related sub-query). <br />
     * {exists (select CONSTRAINT_NAME_AUTO_FOO_ID from VENDOR_CONSTRAINT_NAME_AUTO_REF where ...)} <br />
     * VENDOR_CONSTRAINT_NAME_AUTO_REF by CONSTRAINT_NAME_AUTO_FOO_ID, named 'vendorConstraintNameAutoRefAsOne'.
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
        String pp = keepConstraintNameAutoFooId_ExistsReferrer_VendorConstraintNameAutoRefList(cb.query()); // for saving query-value.
        registerExistsReferrer(cb.query(), "CONSTRAINT_NAME_AUTO_FOO_ID", "CONSTRAINT_NAME_AUTO_FOO_ID", pp, "vendorConstraintNameAutoRefList");
    }
    public abstract String keepConstraintNameAutoFooId_ExistsReferrer_VendorConstraintNameAutoRefList(LdVendorConstraintNameAutoRefCQ sq);

    /**
     * Set up NotExistsReferrer (co-related sub-query). <br />
     * {not exists (select CONSTRAINT_NAME_AUTO_FOO_ID from VENDOR_CONSTRAINT_NAME_AUTO_REF where ...)} <br />
     * VENDOR_CONSTRAINT_NAME_AUTO_REF by CONSTRAINT_NAME_AUTO_FOO_ID, named 'vendorConstraintNameAutoRefAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">notExistsVendorConstraintNameAutoRefList</span>(new SubQuery&lt;LdVendorConstraintNameAutoRefCB&gt;() {
     *     public void query(LdVendorConstraintNameAutoRefCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of ConstraintNameAutoFooId_NotExistsReferrer_VendorConstraintNameAutoRefList for 'not exists'. (NotNull)
     */
    public void notExistsVendorConstraintNameAutoRefList(SubQuery<LdVendorConstraintNameAutoRefCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        LdVendorConstraintNameAutoRefCB cb = new LdVendorConstraintNameAutoRefCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String pp = keepConstraintNameAutoFooId_NotExistsReferrer_VendorConstraintNameAutoRefList(cb.query()); // for saving query-value.
        registerNotExistsReferrer(cb.query(), "CONSTRAINT_NAME_AUTO_FOO_ID", "CONSTRAINT_NAME_AUTO_FOO_ID", pp, "vendorConstraintNameAutoRefList");
    }
    public abstract String keepConstraintNameAutoFooId_NotExistsReferrer_VendorConstraintNameAutoRefList(LdVendorConstraintNameAutoRefCQ sq);

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select CONSTRAINT_NAME_AUTO_FOO_ID from VENDOR_CONSTRAINT_NAME_AUTO_REF where ...)} <br />
     * VENDOR_CONSTRAINT_NAME_AUTO_REF by CONSTRAINT_NAME_AUTO_FOO_ID, named 'vendorConstraintNameAutoRefAsOne'.
     * @param subQuery The sub-query of VendorConstraintNameAutoRefList for 'in-scope'. (NotNull)
     */
    public void inScopeVendorConstraintNameAutoRefList(SubQuery<LdVendorConstraintNameAutoRefCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        LdVendorConstraintNameAutoRefCB cb = new LdVendorConstraintNameAutoRefCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String pp = keepConstraintNameAutoFooId_InScopeRelation_VendorConstraintNameAutoRefList(cb.query()); // for saving query-value.
        registerInScopeRelation(cb.query(), "CONSTRAINT_NAME_AUTO_FOO_ID", "CONSTRAINT_NAME_AUTO_FOO_ID", pp, "vendorConstraintNameAutoRefList");
    }
    public abstract String keepConstraintNameAutoFooId_InScopeRelation_VendorConstraintNameAutoRefList(LdVendorConstraintNameAutoRefCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select CONSTRAINT_NAME_AUTO_FOO_ID from VENDOR_CONSTRAINT_NAME_AUTO_REF where ...)} <br />
     * VENDOR_CONSTRAINT_NAME_AUTO_REF by CONSTRAINT_NAME_AUTO_FOO_ID, named 'vendorConstraintNameAutoRefAsOne'.
     * @param subQuery The sub-query of VendorConstraintNameAutoRefList for 'not in-scope'. (NotNull)
     */
    public void notInScopeVendorConstraintNameAutoRefList(SubQuery<LdVendorConstraintNameAutoRefCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        LdVendorConstraintNameAutoRefCB cb = new LdVendorConstraintNameAutoRefCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String pp = keepConstraintNameAutoFooId_NotInScopeRelation_VendorConstraintNameAutoRefList(cb.query()); // for saving query-value.
        registerNotInScopeRelation(cb.query(), "CONSTRAINT_NAME_AUTO_FOO_ID", "CONSTRAINT_NAME_AUTO_FOO_ID", pp, "vendorConstraintNameAutoRefList");
    }
    public abstract String keepConstraintNameAutoFooId_NotInScopeRelation_VendorConstraintNameAutoRefList(LdVendorConstraintNameAutoRefCQ sq);

    public void xsderiveVendorConstraintNameAutoRefList(String fn, SubQuery<LdVendorConstraintNameAutoRefCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        LdVendorConstraintNameAutoRefCB cb = new LdVendorConstraintNameAutoRefCB(); cb.xsetupForDerivedReferrer(this); sq.query(cb);
        String pp = keepConstraintNameAutoFooId_SpecifyDerivedReferrer_VendorConstraintNameAutoRefList(cb.query()); // for saving query-value.
        registerSpecifyDerivedReferrer(fn, cb.query(), "CONSTRAINT_NAME_AUTO_FOO_ID", "CONSTRAINT_NAME_AUTO_FOO_ID", pp, "vendorConstraintNameAutoRefList", al, op);
    }
    public abstract String keepConstraintNameAutoFooId_SpecifyDerivedReferrer_VendorConstraintNameAutoRefList(LdVendorConstraintNameAutoRefCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer. <br />
     * {FOO &lt;= (select max(BAR) from VENDOR_CONSTRAINT_NAME_AUTO_REF where ...)} <br />
     * VENDOR_CONSTRAINT_NAME_AUTO_REF by CONSTRAINT_NAME_AUTO_FOO_ID, named 'vendorConstraintNameAutoRefAsOne'.
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
        String sqpp = keepConstraintNameAutoFooId_QueryDerivedReferrer_VendorConstraintNameAutoRefList(cb.query()); // for saving query-value.
        String prpp = keepConstraintNameAutoFooId_QueryDerivedReferrer_VendorConstraintNameAutoRefListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CONSTRAINT_NAME_AUTO_FOO_ID", "CONSTRAINT_NAME_AUTO_FOO_ID", sqpp, "vendorConstraintNameAutoRefList", rd, vl, prpp, op);
    }
    public abstract String keepConstraintNameAutoFooId_QueryDerivedReferrer_VendorConstraintNameAutoRefList(LdVendorConstraintNameAutoRefCQ sq);
    public abstract String keepConstraintNameAutoFooId_QueryDerivedReferrer_VendorConstraintNameAutoRefListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * CONSTRAINT_NAME_AUTO_FOO_ID: {PK, NotNull, NUMERIC(16)}
     */
    public void setConstraintNameAutoFooId_IsNull() { regConstraintNameAutoFooId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * CONSTRAINT_NAME_AUTO_FOO_ID: {PK, NotNull, NUMERIC(16)}
     */
    public void setConstraintNameAutoFooId_IsNotNull() { regConstraintNameAutoFooId(CK_ISNN, DOBJ); }

    protected void regConstraintNameAutoFooId(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueConstraintNameAutoFooId(), "CONSTRAINT_NAME_AUTO_FOO_ID"); }
    protected abstract ConditionValue getCValueConstraintNameAutoFooId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * CONSTRAINT_NAME_AUTO_FOO_NAME: {UQ, NotNull, VARCHAR(50)}
     * @param constraintNameAutoFooName The value of constraintNameAutoFooName as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setConstraintNameAutoFooName_Equal(String constraintNameAutoFooName) {
        doSetConstraintNameAutoFooName_Equal(fRES(constraintNameAutoFooName));
    }

    protected void doSetConstraintNameAutoFooName_Equal(String constraintNameAutoFooName) {
        regConstraintNameAutoFooName(CK_EQ, constraintNameAutoFooName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * CONSTRAINT_NAME_AUTO_FOO_NAME: {UQ, NotNull, VARCHAR(50)}
     * @param constraintNameAutoFooName The value of constraintNameAutoFooName as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setConstraintNameAutoFooName_NotEqual(String constraintNameAutoFooName) {
        doSetConstraintNameAutoFooName_NotEqual(fRES(constraintNameAutoFooName));
    }

    protected void doSetConstraintNameAutoFooName_NotEqual(String constraintNameAutoFooName) {
        regConstraintNameAutoFooName(CK_NES, constraintNameAutoFooName);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * CONSTRAINT_NAME_AUTO_FOO_NAME: {UQ, NotNull, VARCHAR(50)}
     * @param constraintNameAutoFooName The value of constraintNameAutoFooName as greaterThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setConstraintNameAutoFooName_GreaterThan(String constraintNameAutoFooName) {
        regConstraintNameAutoFooName(CK_GT, fRES(constraintNameAutoFooName));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * CONSTRAINT_NAME_AUTO_FOO_NAME: {UQ, NotNull, VARCHAR(50)}
     * @param constraintNameAutoFooName The value of constraintNameAutoFooName as lessThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setConstraintNameAutoFooName_LessThan(String constraintNameAutoFooName) {
        regConstraintNameAutoFooName(CK_LT, fRES(constraintNameAutoFooName));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * CONSTRAINT_NAME_AUTO_FOO_NAME: {UQ, NotNull, VARCHAR(50)}
     * @param constraintNameAutoFooName The value of constraintNameAutoFooName as greaterEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setConstraintNameAutoFooName_GreaterEqual(String constraintNameAutoFooName) {
        regConstraintNameAutoFooName(CK_GE, fRES(constraintNameAutoFooName));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * CONSTRAINT_NAME_AUTO_FOO_NAME: {UQ, NotNull, VARCHAR(50)}
     * @param constraintNameAutoFooName The value of constraintNameAutoFooName as lessEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setConstraintNameAutoFooName_LessEqual(String constraintNameAutoFooName) {
        regConstraintNameAutoFooName(CK_LE, fRES(constraintNameAutoFooName));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * CONSTRAINT_NAME_AUTO_FOO_NAME: {UQ, NotNull, VARCHAR(50)}
     * @param constraintNameAutoFooNameList The collection of constraintNameAutoFooName as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setConstraintNameAutoFooName_InScope(Collection<String> constraintNameAutoFooNameList) {
        doSetConstraintNameAutoFooName_InScope(constraintNameAutoFooNameList);
    }

    public void doSetConstraintNameAutoFooName_InScope(Collection<String> constraintNameAutoFooNameList) {
        regINS(CK_INS, cTL(constraintNameAutoFooNameList), getCValueConstraintNameAutoFooName(), "CONSTRAINT_NAME_AUTO_FOO_NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * CONSTRAINT_NAME_AUTO_FOO_NAME: {UQ, NotNull, VARCHAR(50)}
     * @param constraintNameAutoFooNameList The collection of constraintNameAutoFooName as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setConstraintNameAutoFooName_NotInScope(Collection<String> constraintNameAutoFooNameList) {
        doSetConstraintNameAutoFooName_NotInScope(constraintNameAutoFooNameList);
    }

    public void doSetConstraintNameAutoFooName_NotInScope(Collection<String> constraintNameAutoFooNameList) {
        regINS(CK_NINS, cTL(constraintNameAutoFooNameList), getCValueConstraintNameAutoFooName(), "CONSTRAINT_NAME_AUTO_FOO_NAME");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * CONSTRAINT_NAME_AUTO_FOO_NAME: {UQ, NotNull, VARCHAR(50)}
     * @param constraintNameAutoFooName The value of constraintNameAutoFooName as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setConstraintNameAutoFooName_PrefixSearch(String constraintNameAutoFooName) {
        setConstraintNameAutoFooName_LikeSearch(constraintNameAutoFooName, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * CONSTRAINT_NAME_AUTO_FOO_NAME: {UQ, NotNull, VARCHAR(50)} <br />
     * <pre>e.g. setConstraintNameAutoFooName_LikeSearch("xxx", new <span style="color: #FD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param constraintNameAutoFooName The value of constraintNameAutoFooName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setConstraintNameAutoFooName_LikeSearch(String constraintNameAutoFooName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(constraintNameAutoFooName), getCValueConstraintNameAutoFooName(), "CONSTRAINT_NAME_AUTO_FOO_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * CONSTRAINT_NAME_AUTO_FOO_NAME: {UQ, NotNull, VARCHAR(50)}
     * @param constraintNameAutoFooName The value of constraintNameAutoFooName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setConstraintNameAutoFooName_NotLikeSearch(String constraintNameAutoFooName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(constraintNameAutoFooName), getCValueConstraintNameAutoFooName(), "CONSTRAINT_NAME_AUTO_FOO_NAME", likeSearchOption);
    }

    protected void regConstraintNameAutoFooName(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueConstraintNameAutoFooName(), "CONSTRAINT_NAME_AUTO_FOO_NAME"); }
    protected abstract ConditionValue getCValueConstraintNameAutoFooName();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_Equal()</span>.max(new SubQuery&lt;LdVendorConstraintNameAutoFooCB&gt;() {
     *     public void query(LdVendorConstraintNameAutoFooCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<LdVendorConstraintNameAutoFooCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ.getOperand(), LdVendorConstraintNameAutoFooCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;LdVendorConstraintNameAutoFooCB&gt;() {
     *     public void query(LdVendorConstraintNameAutoFooCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<LdVendorConstraintNameAutoFooCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES.getOperand(), LdVendorConstraintNameAutoFooCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;LdVendorConstraintNameAutoFooCB&gt;() {
     *     public void query(LdVendorConstraintNameAutoFooCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<LdVendorConstraintNameAutoFooCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT.getOperand(), LdVendorConstraintNameAutoFooCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessThan()</span>.max(new SubQuery&lt;LdVendorConstraintNameAutoFooCB&gt;() {
     *     public void query(LdVendorConstraintNameAutoFooCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<LdVendorConstraintNameAutoFooCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT.getOperand(), LdVendorConstraintNameAutoFooCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;LdVendorConstraintNameAutoFooCB&gt;() {
     *     public void query(LdVendorConstraintNameAutoFooCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<LdVendorConstraintNameAutoFooCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE.getOperand(), LdVendorConstraintNameAutoFooCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;LdVendorConstraintNameAutoFooCB&gt;() {
     *     public void query(LdVendorConstraintNameAutoFooCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<LdVendorConstraintNameAutoFooCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE.getOperand(), LdVendorConstraintNameAutoFooCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSSQOption<CB> op) {
        assertObjectNotNull("subQuery", sq);
        LdVendorConstraintNameAutoFooCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        op.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, op);
    }
    public abstract String keepScalarCondition(LdVendorConstraintNameAutoFooCQ sq);

    protected LdVendorConstraintNameAutoFooCB xcreateScalarConditionCB() {
        LdVendorConstraintNameAutoFooCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected LdVendorConstraintNameAutoFooCB xcreateScalarConditionPartitionByCB() {
        LdVendorConstraintNameAutoFooCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<LdVendorConstraintNameAutoFooCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        LdVendorConstraintNameAutoFooCB cb = new LdVendorConstraintNameAutoFooCB(); cb.xsetupForDerivedReferrer(this); sq.query(cb);
        String pk = "CONSTRAINT_NAME_AUTO_FOO_ID";
        String pp = keepSpecifyMyselfDerived(cb.query()); // for saving query-value.
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(LdVendorConstraintNameAutoFooCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (SubQuery).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<LdVendorConstraintNameAutoFooCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(LdVendorConstraintNameAutoFooCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        LdVendorConstraintNameAutoFooCB cb = new LdVendorConstraintNameAutoFooCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "CONSTRAINT_NAME_AUTO_FOO_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(LdVendorConstraintNameAutoFooCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfExists(SubQuery<LdVendorConstraintNameAutoFooCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        LdVendorConstraintNameAutoFooCB cb = new LdVendorConstraintNameAutoFooCB(); cb.xsetupForMyselfExists(this); subQuery.query(cb);
        String pp = keepMyselfExists(cb.query()); // for saving query-value.
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(LdVendorConstraintNameAutoFooCQ sq);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfInScope(SubQuery<LdVendorConstraintNameAutoFooCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        LdVendorConstraintNameAutoFooCB cb = new LdVendorConstraintNameAutoFooCB(); cb.xsetupForMyselfInScope(this); subQuery.query(cb);
        String pp = keepMyselfInScope(cb.query()); // for saving query-value.
        registerMyselfInScope(cb.query(), pp);
    }
    public abstract String keepMyselfInScope(LdVendorConstraintNameAutoFooCQ sq);

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    protected LdVendorConstraintNameAutoFooCB newMyCB() {
        return new LdVendorConstraintNameAutoFooCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabCQ() { return LdVendorConstraintNameAutoFooCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
