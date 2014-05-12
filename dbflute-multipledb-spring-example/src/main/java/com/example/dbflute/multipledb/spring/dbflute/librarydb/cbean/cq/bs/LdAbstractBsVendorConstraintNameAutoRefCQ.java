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
 * The abstract condition-query of VENDOR_CONSTRAINT_NAME_AUTO_REF.
 * @author DBFlute(AutoGenerator)
 */
public abstract class LdAbstractBsVendorConstraintNameAutoRefCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public LdAbstractBsVendorConstraintNameAutoRefCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "VENDOR_CONSTRAINT_NAME_AUTO_REF";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * CONSTRAINT_NAME_AUTO_REF_ID: {PK, NotNull, NUMERIC(16)}
     * @param constraintNameAutoRefId The value of constraintNameAutoRefId as equal. (NullAllowed: if null, no condition)
     */
    public void setConstraintNameAutoRefId_Equal(java.math.BigDecimal constraintNameAutoRefId) {
        doSetConstraintNameAutoRefId_Equal(constraintNameAutoRefId);
    }

    protected void doSetConstraintNameAutoRefId_Equal(java.math.BigDecimal constraintNameAutoRefId) {
        regConstraintNameAutoRefId(CK_EQ, constraintNameAutoRefId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * CONSTRAINT_NAME_AUTO_REF_ID: {PK, NotNull, NUMERIC(16)}
     * @param constraintNameAutoRefId The value of constraintNameAutoRefId as notEqual. (NullAllowed: if null, no condition)
     */
    public void setConstraintNameAutoRefId_NotEqual(java.math.BigDecimal constraintNameAutoRefId) {
        doSetConstraintNameAutoRefId_NotEqual(constraintNameAutoRefId);
    }

    protected void doSetConstraintNameAutoRefId_NotEqual(java.math.BigDecimal constraintNameAutoRefId) {
        regConstraintNameAutoRefId(CK_NES, constraintNameAutoRefId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * CONSTRAINT_NAME_AUTO_REF_ID: {PK, NotNull, NUMERIC(16)}
     * @param constraintNameAutoRefId The value of constraintNameAutoRefId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setConstraintNameAutoRefId_GreaterThan(java.math.BigDecimal constraintNameAutoRefId) {
        regConstraintNameAutoRefId(CK_GT, constraintNameAutoRefId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * CONSTRAINT_NAME_AUTO_REF_ID: {PK, NotNull, NUMERIC(16)}
     * @param constraintNameAutoRefId The value of constraintNameAutoRefId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setConstraintNameAutoRefId_LessThan(java.math.BigDecimal constraintNameAutoRefId) {
        regConstraintNameAutoRefId(CK_LT, constraintNameAutoRefId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * CONSTRAINT_NAME_AUTO_REF_ID: {PK, NotNull, NUMERIC(16)}
     * @param constraintNameAutoRefId The value of constraintNameAutoRefId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setConstraintNameAutoRefId_GreaterEqual(java.math.BigDecimal constraintNameAutoRefId) {
        regConstraintNameAutoRefId(CK_GE, constraintNameAutoRefId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * CONSTRAINT_NAME_AUTO_REF_ID: {PK, NotNull, NUMERIC(16)}
     * @param constraintNameAutoRefId The value of constraintNameAutoRefId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setConstraintNameAutoRefId_LessEqual(java.math.BigDecimal constraintNameAutoRefId) {
        regConstraintNameAutoRefId(CK_LE, constraintNameAutoRefId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * CONSTRAINT_NAME_AUTO_REF_ID: {PK, NotNull, NUMERIC(16)}
     * @param minNumber The min number of constraintNameAutoRefId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of constraintNameAutoRefId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setConstraintNameAutoRefId_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueConstraintNameAutoRefId(), "CONSTRAINT_NAME_AUTO_REF_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * CONSTRAINT_NAME_AUTO_REF_ID: {PK, NotNull, NUMERIC(16)}
     * @param constraintNameAutoRefIdList The collection of constraintNameAutoRefId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setConstraintNameAutoRefId_InScope(Collection<java.math.BigDecimal> constraintNameAutoRefIdList) {
        doSetConstraintNameAutoRefId_InScope(constraintNameAutoRefIdList);
    }

    protected void doSetConstraintNameAutoRefId_InScope(Collection<java.math.BigDecimal> constraintNameAutoRefIdList) {
        regINS(CK_INS, cTL(constraintNameAutoRefIdList), getCValueConstraintNameAutoRefId(), "CONSTRAINT_NAME_AUTO_REF_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * CONSTRAINT_NAME_AUTO_REF_ID: {PK, NotNull, NUMERIC(16)}
     * @param constraintNameAutoRefIdList The collection of constraintNameAutoRefId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setConstraintNameAutoRefId_NotInScope(Collection<java.math.BigDecimal> constraintNameAutoRefIdList) {
        doSetConstraintNameAutoRefId_NotInScope(constraintNameAutoRefIdList);
    }

    protected void doSetConstraintNameAutoRefId_NotInScope(Collection<java.math.BigDecimal> constraintNameAutoRefIdList) {
        regINS(CK_NINS, cTL(constraintNameAutoRefIdList), getCValueConstraintNameAutoRefId(), "CONSTRAINT_NAME_AUTO_REF_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * CONSTRAINT_NAME_AUTO_REF_ID: {PK, NotNull, NUMERIC(16)}
     */
    public void setConstraintNameAutoRefId_IsNull() { regConstraintNameAutoRefId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * CONSTRAINT_NAME_AUTO_REF_ID: {PK, NotNull, NUMERIC(16)}
     */
    public void setConstraintNameAutoRefId_IsNotNull() { regConstraintNameAutoRefId(CK_ISNN, DOBJ); }

    protected void regConstraintNameAutoRefId(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueConstraintNameAutoRefId(), "CONSTRAINT_NAME_AUTO_REF_ID"); }
    protected abstract ConditionValue getCValueConstraintNameAutoRefId();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * CONSTRAINT_NAME_AUTO_FOO_ID: {IX, NotNull, NUMERIC(16), FK to VENDOR_CONSTRAINT_NAME_AUTO_FOO}
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
     * CONSTRAINT_NAME_AUTO_FOO_ID: {IX, NotNull, NUMERIC(16), FK to VENDOR_CONSTRAINT_NAME_AUTO_FOO}
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
     * CONSTRAINT_NAME_AUTO_FOO_ID: {IX, NotNull, NUMERIC(16), FK to VENDOR_CONSTRAINT_NAME_AUTO_FOO}
     * @param constraintNameAutoFooId The value of constraintNameAutoFooId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setConstraintNameAutoFooId_GreaterThan(java.math.BigDecimal constraintNameAutoFooId) {
        regConstraintNameAutoFooId(CK_GT, constraintNameAutoFooId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * CONSTRAINT_NAME_AUTO_FOO_ID: {IX, NotNull, NUMERIC(16), FK to VENDOR_CONSTRAINT_NAME_AUTO_FOO}
     * @param constraintNameAutoFooId The value of constraintNameAutoFooId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setConstraintNameAutoFooId_LessThan(java.math.BigDecimal constraintNameAutoFooId) {
        regConstraintNameAutoFooId(CK_LT, constraintNameAutoFooId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * CONSTRAINT_NAME_AUTO_FOO_ID: {IX, NotNull, NUMERIC(16), FK to VENDOR_CONSTRAINT_NAME_AUTO_FOO}
     * @param constraintNameAutoFooId The value of constraintNameAutoFooId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setConstraintNameAutoFooId_GreaterEqual(java.math.BigDecimal constraintNameAutoFooId) {
        regConstraintNameAutoFooId(CK_GE, constraintNameAutoFooId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * CONSTRAINT_NAME_AUTO_FOO_ID: {IX, NotNull, NUMERIC(16), FK to VENDOR_CONSTRAINT_NAME_AUTO_FOO}
     * @param constraintNameAutoFooId The value of constraintNameAutoFooId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setConstraintNameAutoFooId_LessEqual(java.math.BigDecimal constraintNameAutoFooId) {
        regConstraintNameAutoFooId(CK_LE, constraintNameAutoFooId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * CONSTRAINT_NAME_AUTO_FOO_ID: {IX, NotNull, NUMERIC(16), FK to VENDOR_CONSTRAINT_NAME_AUTO_FOO}
     * @param minNumber The min number of constraintNameAutoFooId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of constraintNameAutoFooId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setConstraintNameAutoFooId_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueConstraintNameAutoFooId(), "CONSTRAINT_NAME_AUTO_FOO_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * CONSTRAINT_NAME_AUTO_FOO_ID: {IX, NotNull, NUMERIC(16), FK to VENDOR_CONSTRAINT_NAME_AUTO_FOO}
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
     * CONSTRAINT_NAME_AUTO_FOO_ID: {IX, NotNull, NUMERIC(16), FK to VENDOR_CONSTRAINT_NAME_AUTO_FOO}
     * @param constraintNameAutoFooIdList The collection of constraintNameAutoFooId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setConstraintNameAutoFooId_NotInScope(Collection<java.math.BigDecimal> constraintNameAutoFooIdList) {
        doSetConstraintNameAutoFooId_NotInScope(constraintNameAutoFooIdList);
    }

    protected void doSetConstraintNameAutoFooId_NotInScope(Collection<java.math.BigDecimal> constraintNameAutoFooIdList) {
        regINS(CK_NINS, cTL(constraintNameAutoFooIdList), getCValueConstraintNameAutoFooId(), "CONSTRAINT_NAME_AUTO_FOO_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select CONSTRAINT_NAME_AUTO_FOO_ID from VENDOR_CONSTRAINT_NAME_AUTO_FOO where ...)} <br />
     * VENDOR_CONSTRAINT_NAME_AUTO_FOO by my CONSTRAINT_NAME_AUTO_FOO_ID, named 'vendorConstraintNameAutoFoo'.
     * @param subQuery The sub-query of VendorConstraintNameAutoFoo for 'in-scope'. (NotNull)
     */
    public void inScopeVendorConstraintNameAutoFoo(SubQuery<LdVendorConstraintNameAutoFooCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        LdVendorConstraintNameAutoFooCB cb = new LdVendorConstraintNameAutoFooCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepConstraintNameAutoFooId_InScopeRelation_VendorConstraintNameAutoFoo(cb.query());
        registerInScopeRelation(cb.query(), "CONSTRAINT_NAME_AUTO_FOO_ID", "CONSTRAINT_NAME_AUTO_FOO_ID", pp, "vendorConstraintNameAutoFoo");
    }
    public abstract String keepConstraintNameAutoFooId_InScopeRelation_VendorConstraintNameAutoFoo(LdVendorConstraintNameAutoFooCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select CONSTRAINT_NAME_AUTO_FOO_ID from VENDOR_CONSTRAINT_NAME_AUTO_FOO where ...)} <br />
     * VENDOR_CONSTRAINT_NAME_AUTO_FOO by my CONSTRAINT_NAME_AUTO_FOO_ID, named 'vendorConstraintNameAutoFoo'.
     * @param subQuery The sub-query of VendorConstraintNameAutoFoo for 'not in-scope'. (NotNull)
     */
    public void notInScopeVendorConstraintNameAutoFoo(SubQuery<LdVendorConstraintNameAutoFooCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        LdVendorConstraintNameAutoFooCB cb = new LdVendorConstraintNameAutoFooCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepConstraintNameAutoFooId_NotInScopeRelation_VendorConstraintNameAutoFoo(cb.query());
        registerNotInScopeRelation(cb.query(), "CONSTRAINT_NAME_AUTO_FOO_ID", "CONSTRAINT_NAME_AUTO_FOO_ID", pp, "vendorConstraintNameAutoFoo");
    }
    public abstract String keepConstraintNameAutoFooId_NotInScopeRelation_VendorConstraintNameAutoFoo(LdVendorConstraintNameAutoFooCQ sq);

    protected void regConstraintNameAutoFooId(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueConstraintNameAutoFooId(), "CONSTRAINT_NAME_AUTO_FOO_ID"); }
    protected abstract ConditionValue getCValueConstraintNameAutoFooId();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * CONSTRAINT_NAME_AUTO_BAR_ID: {IX, NotNull, NUMERIC(16), FK to VENDOR_CONSTRAINT_NAME_AUTO_BAR}
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
     * CONSTRAINT_NAME_AUTO_BAR_ID: {IX, NotNull, NUMERIC(16), FK to VENDOR_CONSTRAINT_NAME_AUTO_BAR}
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
     * CONSTRAINT_NAME_AUTO_BAR_ID: {IX, NotNull, NUMERIC(16), FK to VENDOR_CONSTRAINT_NAME_AUTO_BAR}
     * @param constraintNameAutoBarId The value of constraintNameAutoBarId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setConstraintNameAutoBarId_GreaterThan(java.math.BigDecimal constraintNameAutoBarId) {
        regConstraintNameAutoBarId(CK_GT, constraintNameAutoBarId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * CONSTRAINT_NAME_AUTO_BAR_ID: {IX, NotNull, NUMERIC(16), FK to VENDOR_CONSTRAINT_NAME_AUTO_BAR}
     * @param constraintNameAutoBarId The value of constraintNameAutoBarId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setConstraintNameAutoBarId_LessThan(java.math.BigDecimal constraintNameAutoBarId) {
        regConstraintNameAutoBarId(CK_LT, constraintNameAutoBarId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * CONSTRAINT_NAME_AUTO_BAR_ID: {IX, NotNull, NUMERIC(16), FK to VENDOR_CONSTRAINT_NAME_AUTO_BAR}
     * @param constraintNameAutoBarId The value of constraintNameAutoBarId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setConstraintNameAutoBarId_GreaterEqual(java.math.BigDecimal constraintNameAutoBarId) {
        regConstraintNameAutoBarId(CK_GE, constraintNameAutoBarId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * CONSTRAINT_NAME_AUTO_BAR_ID: {IX, NotNull, NUMERIC(16), FK to VENDOR_CONSTRAINT_NAME_AUTO_BAR}
     * @param constraintNameAutoBarId The value of constraintNameAutoBarId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setConstraintNameAutoBarId_LessEqual(java.math.BigDecimal constraintNameAutoBarId) {
        regConstraintNameAutoBarId(CK_LE, constraintNameAutoBarId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * CONSTRAINT_NAME_AUTO_BAR_ID: {IX, NotNull, NUMERIC(16), FK to VENDOR_CONSTRAINT_NAME_AUTO_BAR}
     * @param minNumber The min number of constraintNameAutoBarId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of constraintNameAutoBarId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setConstraintNameAutoBarId_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueConstraintNameAutoBarId(), "CONSTRAINT_NAME_AUTO_BAR_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * CONSTRAINT_NAME_AUTO_BAR_ID: {IX, NotNull, NUMERIC(16), FK to VENDOR_CONSTRAINT_NAME_AUTO_BAR}
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
     * CONSTRAINT_NAME_AUTO_BAR_ID: {IX, NotNull, NUMERIC(16), FK to VENDOR_CONSTRAINT_NAME_AUTO_BAR}
     * @param constraintNameAutoBarIdList The collection of constraintNameAutoBarId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setConstraintNameAutoBarId_NotInScope(Collection<java.math.BigDecimal> constraintNameAutoBarIdList) {
        doSetConstraintNameAutoBarId_NotInScope(constraintNameAutoBarIdList);
    }

    protected void doSetConstraintNameAutoBarId_NotInScope(Collection<java.math.BigDecimal> constraintNameAutoBarIdList) {
        regINS(CK_NINS, cTL(constraintNameAutoBarIdList), getCValueConstraintNameAutoBarId(), "CONSTRAINT_NAME_AUTO_BAR_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select CONSTRAINT_NAME_AUTO_BAR_ID from VENDOR_CONSTRAINT_NAME_AUTO_BAR where ...)} <br />
     * VENDOR_CONSTRAINT_NAME_AUTO_BAR by my CONSTRAINT_NAME_AUTO_BAR_ID, named 'vendorConstraintNameAutoBar'.
     * @param subQuery The sub-query of VendorConstraintNameAutoBar for 'in-scope'. (NotNull)
     */
    public void inScopeVendorConstraintNameAutoBar(SubQuery<LdVendorConstraintNameAutoBarCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        LdVendorConstraintNameAutoBarCB cb = new LdVendorConstraintNameAutoBarCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepConstraintNameAutoBarId_InScopeRelation_VendorConstraintNameAutoBar(cb.query());
        registerInScopeRelation(cb.query(), "CONSTRAINT_NAME_AUTO_BAR_ID", "CONSTRAINT_NAME_AUTO_BAR_ID", pp, "vendorConstraintNameAutoBar");
    }
    public abstract String keepConstraintNameAutoBarId_InScopeRelation_VendorConstraintNameAutoBar(LdVendorConstraintNameAutoBarCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select CONSTRAINT_NAME_AUTO_BAR_ID from VENDOR_CONSTRAINT_NAME_AUTO_BAR where ...)} <br />
     * VENDOR_CONSTRAINT_NAME_AUTO_BAR by my CONSTRAINT_NAME_AUTO_BAR_ID, named 'vendorConstraintNameAutoBar'.
     * @param subQuery The sub-query of VendorConstraintNameAutoBar for 'not in-scope'. (NotNull)
     */
    public void notInScopeVendorConstraintNameAutoBar(SubQuery<LdVendorConstraintNameAutoBarCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        LdVendorConstraintNameAutoBarCB cb = new LdVendorConstraintNameAutoBarCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepConstraintNameAutoBarId_NotInScopeRelation_VendorConstraintNameAutoBar(cb.query());
        registerNotInScopeRelation(cb.query(), "CONSTRAINT_NAME_AUTO_BAR_ID", "CONSTRAINT_NAME_AUTO_BAR_ID", pp, "vendorConstraintNameAutoBar");
    }
    public abstract String keepConstraintNameAutoBarId_NotInScopeRelation_VendorConstraintNameAutoBar(LdVendorConstraintNameAutoBarCQ sq);

    protected void regConstraintNameAutoBarId(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueConstraintNameAutoBarId(), "CONSTRAINT_NAME_AUTO_BAR_ID"); }
    protected abstract ConditionValue getCValueConstraintNameAutoBarId();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * CONSTRAINT_NAME_AUTO_QUX_ID: {IX, NotNull, NUMERIC(16), FK to VENDOR_CONSTRAINT_NAME_AUTO_QUX}
     * @param constraintNameAutoQuxId The value of constraintNameAutoQuxId as equal. (NullAllowed: if null, no condition)
     */
    public void setConstraintNameAutoQuxId_Equal(java.math.BigDecimal constraintNameAutoQuxId) {
        doSetConstraintNameAutoQuxId_Equal(constraintNameAutoQuxId);
    }

    protected void doSetConstraintNameAutoQuxId_Equal(java.math.BigDecimal constraintNameAutoQuxId) {
        regConstraintNameAutoQuxId(CK_EQ, constraintNameAutoQuxId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * CONSTRAINT_NAME_AUTO_QUX_ID: {IX, NotNull, NUMERIC(16), FK to VENDOR_CONSTRAINT_NAME_AUTO_QUX}
     * @param constraintNameAutoQuxId The value of constraintNameAutoQuxId as notEqual. (NullAllowed: if null, no condition)
     */
    public void setConstraintNameAutoQuxId_NotEqual(java.math.BigDecimal constraintNameAutoQuxId) {
        doSetConstraintNameAutoQuxId_NotEqual(constraintNameAutoQuxId);
    }

    protected void doSetConstraintNameAutoQuxId_NotEqual(java.math.BigDecimal constraintNameAutoQuxId) {
        regConstraintNameAutoQuxId(CK_NES, constraintNameAutoQuxId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * CONSTRAINT_NAME_AUTO_QUX_ID: {IX, NotNull, NUMERIC(16), FK to VENDOR_CONSTRAINT_NAME_AUTO_QUX}
     * @param constraintNameAutoQuxId The value of constraintNameAutoQuxId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setConstraintNameAutoQuxId_GreaterThan(java.math.BigDecimal constraintNameAutoQuxId) {
        regConstraintNameAutoQuxId(CK_GT, constraintNameAutoQuxId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * CONSTRAINT_NAME_AUTO_QUX_ID: {IX, NotNull, NUMERIC(16), FK to VENDOR_CONSTRAINT_NAME_AUTO_QUX}
     * @param constraintNameAutoQuxId The value of constraintNameAutoQuxId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setConstraintNameAutoQuxId_LessThan(java.math.BigDecimal constraintNameAutoQuxId) {
        regConstraintNameAutoQuxId(CK_LT, constraintNameAutoQuxId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * CONSTRAINT_NAME_AUTO_QUX_ID: {IX, NotNull, NUMERIC(16), FK to VENDOR_CONSTRAINT_NAME_AUTO_QUX}
     * @param constraintNameAutoQuxId The value of constraintNameAutoQuxId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setConstraintNameAutoQuxId_GreaterEqual(java.math.BigDecimal constraintNameAutoQuxId) {
        regConstraintNameAutoQuxId(CK_GE, constraintNameAutoQuxId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * CONSTRAINT_NAME_AUTO_QUX_ID: {IX, NotNull, NUMERIC(16), FK to VENDOR_CONSTRAINT_NAME_AUTO_QUX}
     * @param constraintNameAutoQuxId The value of constraintNameAutoQuxId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setConstraintNameAutoQuxId_LessEqual(java.math.BigDecimal constraintNameAutoQuxId) {
        regConstraintNameAutoQuxId(CK_LE, constraintNameAutoQuxId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * CONSTRAINT_NAME_AUTO_QUX_ID: {IX, NotNull, NUMERIC(16), FK to VENDOR_CONSTRAINT_NAME_AUTO_QUX}
     * @param minNumber The min number of constraintNameAutoQuxId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of constraintNameAutoQuxId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setConstraintNameAutoQuxId_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueConstraintNameAutoQuxId(), "CONSTRAINT_NAME_AUTO_QUX_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * CONSTRAINT_NAME_AUTO_QUX_ID: {IX, NotNull, NUMERIC(16), FK to VENDOR_CONSTRAINT_NAME_AUTO_QUX}
     * @param constraintNameAutoQuxIdList The collection of constraintNameAutoQuxId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setConstraintNameAutoQuxId_InScope(Collection<java.math.BigDecimal> constraintNameAutoQuxIdList) {
        doSetConstraintNameAutoQuxId_InScope(constraintNameAutoQuxIdList);
    }

    protected void doSetConstraintNameAutoQuxId_InScope(Collection<java.math.BigDecimal> constraintNameAutoQuxIdList) {
        regINS(CK_INS, cTL(constraintNameAutoQuxIdList), getCValueConstraintNameAutoQuxId(), "CONSTRAINT_NAME_AUTO_QUX_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * CONSTRAINT_NAME_AUTO_QUX_ID: {IX, NotNull, NUMERIC(16), FK to VENDOR_CONSTRAINT_NAME_AUTO_QUX}
     * @param constraintNameAutoQuxIdList The collection of constraintNameAutoQuxId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setConstraintNameAutoQuxId_NotInScope(Collection<java.math.BigDecimal> constraintNameAutoQuxIdList) {
        doSetConstraintNameAutoQuxId_NotInScope(constraintNameAutoQuxIdList);
    }

    protected void doSetConstraintNameAutoQuxId_NotInScope(Collection<java.math.BigDecimal> constraintNameAutoQuxIdList) {
        regINS(CK_NINS, cTL(constraintNameAutoQuxIdList), getCValueConstraintNameAutoQuxId(), "CONSTRAINT_NAME_AUTO_QUX_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select CONSTRAINT_NAME_AUTO_QUX_ID from VENDOR_CONSTRAINT_NAME_AUTO_QUX where ...)} <br />
     * VENDOR_CONSTRAINT_NAME_AUTO_QUX by my CONSTRAINT_NAME_AUTO_QUX_ID, named 'vendorConstraintNameAutoQux'.
     * @param subQuery The sub-query of VendorConstraintNameAutoQux for 'in-scope'. (NotNull)
     */
    public void inScopeVendorConstraintNameAutoQux(SubQuery<LdVendorConstraintNameAutoQuxCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        LdVendorConstraintNameAutoQuxCB cb = new LdVendorConstraintNameAutoQuxCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepConstraintNameAutoQuxId_InScopeRelation_VendorConstraintNameAutoQux(cb.query());
        registerInScopeRelation(cb.query(), "CONSTRAINT_NAME_AUTO_QUX_ID", "CONSTRAINT_NAME_AUTO_QUX_ID", pp, "vendorConstraintNameAutoQux");
    }
    public abstract String keepConstraintNameAutoQuxId_InScopeRelation_VendorConstraintNameAutoQux(LdVendorConstraintNameAutoQuxCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select CONSTRAINT_NAME_AUTO_QUX_ID from VENDOR_CONSTRAINT_NAME_AUTO_QUX where ...)} <br />
     * VENDOR_CONSTRAINT_NAME_AUTO_QUX by my CONSTRAINT_NAME_AUTO_QUX_ID, named 'vendorConstraintNameAutoQux'.
     * @param subQuery The sub-query of VendorConstraintNameAutoQux for 'not in-scope'. (NotNull)
     */
    public void notInScopeVendorConstraintNameAutoQux(SubQuery<LdVendorConstraintNameAutoQuxCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        LdVendorConstraintNameAutoQuxCB cb = new LdVendorConstraintNameAutoQuxCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepConstraintNameAutoQuxId_NotInScopeRelation_VendorConstraintNameAutoQux(cb.query());
        registerNotInScopeRelation(cb.query(), "CONSTRAINT_NAME_AUTO_QUX_ID", "CONSTRAINT_NAME_AUTO_QUX_ID", pp, "vendorConstraintNameAutoQux");
    }
    public abstract String keepConstraintNameAutoQuxId_NotInScopeRelation_VendorConstraintNameAutoQux(LdVendorConstraintNameAutoQuxCQ sq);

    protected void regConstraintNameAutoQuxId(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueConstraintNameAutoQuxId(), "CONSTRAINT_NAME_AUTO_QUX_ID"); }
    protected abstract ConditionValue getCValueConstraintNameAutoQuxId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * CONSTRAINT_NAME_AUTO_UNIQUE: {UQ, NotNull, VARCHAR(50)}
     * @param constraintNameAutoUnique The value of constraintNameAutoUnique as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setConstraintNameAutoUnique_Equal(String constraintNameAutoUnique) {
        doSetConstraintNameAutoUnique_Equal(fRES(constraintNameAutoUnique));
    }

    protected void doSetConstraintNameAutoUnique_Equal(String constraintNameAutoUnique) {
        regConstraintNameAutoUnique(CK_EQ, constraintNameAutoUnique);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * CONSTRAINT_NAME_AUTO_UNIQUE: {UQ, NotNull, VARCHAR(50)}
     * @param constraintNameAutoUnique The value of constraintNameAutoUnique as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setConstraintNameAutoUnique_NotEqual(String constraintNameAutoUnique) {
        doSetConstraintNameAutoUnique_NotEqual(fRES(constraintNameAutoUnique));
    }

    protected void doSetConstraintNameAutoUnique_NotEqual(String constraintNameAutoUnique) {
        regConstraintNameAutoUnique(CK_NES, constraintNameAutoUnique);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * CONSTRAINT_NAME_AUTO_UNIQUE: {UQ, NotNull, VARCHAR(50)}
     * @param constraintNameAutoUnique The value of constraintNameAutoUnique as greaterThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setConstraintNameAutoUnique_GreaterThan(String constraintNameAutoUnique) {
        regConstraintNameAutoUnique(CK_GT, fRES(constraintNameAutoUnique));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * CONSTRAINT_NAME_AUTO_UNIQUE: {UQ, NotNull, VARCHAR(50)}
     * @param constraintNameAutoUnique The value of constraintNameAutoUnique as lessThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setConstraintNameAutoUnique_LessThan(String constraintNameAutoUnique) {
        regConstraintNameAutoUnique(CK_LT, fRES(constraintNameAutoUnique));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * CONSTRAINT_NAME_AUTO_UNIQUE: {UQ, NotNull, VARCHAR(50)}
     * @param constraintNameAutoUnique The value of constraintNameAutoUnique as greaterEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setConstraintNameAutoUnique_GreaterEqual(String constraintNameAutoUnique) {
        regConstraintNameAutoUnique(CK_GE, fRES(constraintNameAutoUnique));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * CONSTRAINT_NAME_AUTO_UNIQUE: {UQ, NotNull, VARCHAR(50)}
     * @param constraintNameAutoUnique The value of constraintNameAutoUnique as lessEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setConstraintNameAutoUnique_LessEqual(String constraintNameAutoUnique) {
        regConstraintNameAutoUnique(CK_LE, fRES(constraintNameAutoUnique));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * CONSTRAINT_NAME_AUTO_UNIQUE: {UQ, NotNull, VARCHAR(50)}
     * @param constraintNameAutoUniqueList The collection of constraintNameAutoUnique as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setConstraintNameAutoUnique_InScope(Collection<String> constraintNameAutoUniqueList) {
        doSetConstraintNameAutoUnique_InScope(constraintNameAutoUniqueList);
    }

    public void doSetConstraintNameAutoUnique_InScope(Collection<String> constraintNameAutoUniqueList) {
        regINS(CK_INS, cTL(constraintNameAutoUniqueList), getCValueConstraintNameAutoUnique(), "CONSTRAINT_NAME_AUTO_UNIQUE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * CONSTRAINT_NAME_AUTO_UNIQUE: {UQ, NotNull, VARCHAR(50)}
     * @param constraintNameAutoUniqueList The collection of constraintNameAutoUnique as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setConstraintNameAutoUnique_NotInScope(Collection<String> constraintNameAutoUniqueList) {
        doSetConstraintNameAutoUnique_NotInScope(constraintNameAutoUniqueList);
    }

    public void doSetConstraintNameAutoUnique_NotInScope(Collection<String> constraintNameAutoUniqueList) {
        regINS(CK_NINS, cTL(constraintNameAutoUniqueList), getCValueConstraintNameAutoUnique(), "CONSTRAINT_NAME_AUTO_UNIQUE");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * CONSTRAINT_NAME_AUTO_UNIQUE: {UQ, NotNull, VARCHAR(50)}
     * @param constraintNameAutoUnique The value of constraintNameAutoUnique as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setConstraintNameAutoUnique_PrefixSearch(String constraintNameAutoUnique) {
        setConstraintNameAutoUnique_LikeSearch(constraintNameAutoUnique, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * CONSTRAINT_NAME_AUTO_UNIQUE: {UQ, NotNull, VARCHAR(50)} <br />
     * <pre>e.g. setConstraintNameAutoUnique_LikeSearch("xxx", new <span style="color: #DD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param constraintNameAutoUnique The value of constraintNameAutoUnique as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setConstraintNameAutoUnique_LikeSearch(String constraintNameAutoUnique, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(constraintNameAutoUnique), getCValueConstraintNameAutoUnique(), "CONSTRAINT_NAME_AUTO_UNIQUE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * CONSTRAINT_NAME_AUTO_UNIQUE: {UQ, NotNull, VARCHAR(50)}
     * @param constraintNameAutoUnique The value of constraintNameAutoUnique as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setConstraintNameAutoUnique_NotLikeSearch(String constraintNameAutoUnique, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(constraintNameAutoUnique), getCValueConstraintNameAutoUnique(), "CONSTRAINT_NAME_AUTO_UNIQUE", likeSearchOption);
    }

    protected void regConstraintNameAutoUnique(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueConstraintNameAutoUnique(), "CONSTRAINT_NAME_AUTO_UNIQUE"); }
    protected abstract ConditionValue getCValueConstraintNameAutoUnique();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_Equal()</span>.max(new SubQuery&lt;LdVendorConstraintNameAutoRefCB&gt;() {
     *     public void query(LdVendorConstraintNameAutoRefCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<LdVendorConstraintNameAutoRefCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ.getOperand(), LdVendorConstraintNameAutoRefCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;LdVendorConstraintNameAutoRefCB&gt;() {
     *     public void query(LdVendorConstraintNameAutoRefCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<LdVendorConstraintNameAutoRefCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES.getOperand(), LdVendorConstraintNameAutoRefCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;LdVendorConstraintNameAutoRefCB&gt;() {
     *     public void query(LdVendorConstraintNameAutoRefCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<LdVendorConstraintNameAutoRefCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT.getOperand(), LdVendorConstraintNameAutoRefCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessThan()</span>.max(new SubQuery&lt;LdVendorConstraintNameAutoRefCB&gt;() {
     *     public void query(LdVendorConstraintNameAutoRefCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<LdVendorConstraintNameAutoRefCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT.getOperand(), LdVendorConstraintNameAutoRefCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;LdVendorConstraintNameAutoRefCB&gt;() {
     *     public void query(LdVendorConstraintNameAutoRefCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<LdVendorConstraintNameAutoRefCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE.getOperand(), LdVendorConstraintNameAutoRefCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;LdVendorConstraintNameAutoRefCB&gt;() {
     *     public void query(LdVendorConstraintNameAutoRefCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<LdVendorConstraintNameAutoRefCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE.getOperand(), LdVendorConstraintNameAutoRefCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSSQOption<CB> op) {
        assertObjectNotNull("subQuery", sq);
        LdVendorConstraintNameAutoRefCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        op.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, op);
    }
    public abstract String keepScalarCondition(LdVendorConstraintNameAutoRefCQ sq);

    protected LdVendorConstraintNameAutoRefCB xcreateScalarConditionCB() {
        LdVendorConstraintNameAutoRefCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected LdVendorConstraintNameAutoRefCB xcreateScalarConditionPartitionByCB() {
        LdVendorConstraintNameAutoRefCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<LdVendorConstraintNameAutoRefCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        LdVendorConstraintNameAutoRefCB cb = new LdVendorConstraintNameAutoRefCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        String pp = keepSpecifyMyselfDerived(cb.query());
        String pk = "CONSTRAINT_NAME_AUTO_REF_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(LdVendorConstraintNameAutoRefCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (SubQuery).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<LdVendorConstraintNameAutoRefCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(LdVendorConstraintNameAutoRefCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        LdVendorConstraintNameAutoRefCB cb = new LdVendorConstraintNameAutoRefCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "CONSTRAINT_NAME_AUTO_REF_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(LdVendorConstraintNameAutoRefCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfExists(SubQuery<LdVendorConstraintNameAutoRefCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        LdVendorConstraintNameAutoRefCB cb = new LdVendorConstraintNameAutoRefCB(); cb.xsetupForMyselfExists(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(LdVendorConstraintNameAutoRefCQ sq);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfInScope(SubQuery<LdVendorConstraintNameAutoRefCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        LdVendorConstraintNameAutoRefCB cb = new LdVendorConstraintNameAutoRefCB(); cb.xsetupForMyselfInScope(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepMyselfInScope(cb.query());
        registerMyselfInScope(cb.query(), pp);
    }
    public abstract String keepMyselfInScope(LdVendorConstraintNameAutoRefCQ sq);

    // ===================================================================================
    //                                                                          Compatible
    //                                                                          ==========
    /**
     * Order along the list of manual values. #beforejava8 <br />
     * This function with Union is unsupported! <br />
     * The order values are bound (treated as bind parameter).
     * <pre>
     * MemberCB cb = new MemberCB();
     * List&lt;CDef.MemberStatus&gt; orderValueList = new ArrayList&lt;CDef.MemberStatus&gt;();
     * orderValueList.add(CDef.MemberStatus.Withdrawal);
     * orderValueList.add(CDef.MemberStatus.Formalized);
     * orderValueList.add(CDef.MemberStatus.Provisional);
     * cb.query().addOrderBy_MemberStatusCode_Asc().<span style="color: #DD4747">withManualOrder(orderValueList)</span>;
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'WDL' then 0</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'FML' then 1</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'PRV' then 2</span>
     * <span style="color: #3F7E5E">//     else 3</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     * </pre>
     * @param orderValueList The list of order values for manual ordering. (NotNull)
     */
    public void withManualOrder(List<? extends Object> orderValueList) { // is user public!
        assertObjectNotNull("withManualOrder(orderValueList)", orderValueList);
        final ManualOrderBean manualOrderBean = new ManualOrderBean();
        manualOrderBean.acceptOrderValueList(orderValueList);
        withManualOrder(manualOrderBean);
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    protected LdVendorConstraintNameAutoRefCB newMyCB() {
        return new LdVendorConstraintNameAutoRefCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabCQ() { return LdVendorConstraintNameAutoRefCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
