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
 * The abstract condition-query of LENDING_COLLECTION.
 * @author DBFlute(AutoGenerator)
 */
public abstract class LdAbstractBsLendingCollectionCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public LdAbstractBsLendingCollectionCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "LENDING_COLLECTION";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * LIBRARY_ID: {PK, IX, NotNull, SMALLINT(5), FK to LENDING}
     * @param libraryId The value of libraryId as equal. (NullAllowed: if null, no condition)
     */
    public void setLibraryId_Equal(Integer libraryId) {
        doSetLibraryId_Equal(libraryId);
    }

    protected void doSetLibraryId_Equal(Integer libraryId) {
        regLibraryId(CK_EQ, libraryId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * LIBRARY_ID: {PK, IX, NotNull, SMALLINT(5), FK to LENDING}
     * @param libraryId The value of libraryId as notEqual. (NullAllowed: if null, no condition)
     */
    public void setLibraryId_NotEqual(Integer libraryId) {
        doSetLibraryId_NotEqual(libraryId);
    }

    protected void doSetLibraryId_NotEqual(Integer libraryId) {
        regLibraryId(CK_NES, libraryId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * LIBRARY_ID: {PK, IX, NotNull, SMALLINT(5), FK to LENDING}
     * @param libraryId The value of libraryId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setLibraryId_GreaterThan(Integer libraryId) {
        regLibraryId(CK_GT, libraryId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * LIBRARY_ID: {PK, IX, NotNull, SMALLINT(5), FK to LENDING}
     * @param libraryId The value of libraryId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setLibraryId_LessThan(Integer libraryId) {
        regLibraryId(CK_LT, libraryId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * LIBRARY_ID: {PK, IX, NotNull, SMALLINT(5), FK to LENDING}
     * @param libraryId The value of libraryId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setLibraryId_GreaterEqual(Integer libraryId) {
        regLibraryId(CK_GE, libraryId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * LIBRARY_ID: {PK, IX, NotNull, SMALLINT(5), FK to LENDING}
     * @param libraryId The value of libraryId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setLibraryId_LessEqual(Integer libraryId) {
        regLibraryId(CK_LE, libraryId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * LIBRARY_ID: {PK, IX, NotNull, SMALLINT(5), FK to LENDING}
     * @param minNumber The min number of libraryId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of libraryId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setLibraryId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueLibraryId(), "LIBRARY_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * LIBRARY_ID: {PK, IX, NotNull, SMALLINT(5), FK to LENDING}
     * @param libraryIdList The collection of libraryId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setLibraryId_InScope(Collection<Integer> libraryIdList) {
        doSetLibraryId_InScope(libraryIdList);
    }

    protected void doSetLibraryId_InScope(Collection<Integer> libraryIdList) {
        regINS(CK_INS, cTL(libraryIdList), getCValueLibraryId(), "LIBRARY_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * LIBRARY_ID: {PK, IX, NotNull, SMALLINT(5), FK to LENDING}
     * @param libraryIdList The collection of libraryId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setLibraryId_NotInScope(Collection<Integer> libraryIdList) {
        doSetLibraryId_NotInScope(libraryIdList);
    }

    protected void doSetLibraryId_NotInScope(Collection<Integer> libraryIdList) {
        regINS(CK_NINS, cTL(libraryIdList), getCValueLibraryId(), "LIBRARY_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * LIBRARY_ID: {PK, IX, NotNull, SMALLINT(5), FK to LENDING}
     */
    public void setLibraryId_IsNull() { regLibraryId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * LIBRARY_ID: {PK, IX, NotNull, SMALLINT(5), FK to LENDING}
     */
    public void setLibraryId_IsNotNull() { regLibraryId(CK_ISNN, DOBJ); }

    protected void regLibraryId(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueLibraryId(), "LIBRARY_ID"); }
    protected abstract ConditionValue getCValueLibraryId();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * LB_USER_ID: {PK, IX+, NotNull, INTEGER(10), FK to LENDING}
     * @param lbUserId The value of lbUserId as equal. (NullAllowed: if null, no condition)
     */
    public void setLbUserId_Equal(Integer lbUserId) {
        doSetLbUserId_Equal(lbUserId);
    }

    protected void doSetLbUserId_Equal(Integer lbUserId) {
        regLbUserId(CK_EQ, lbUserId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * LB_USER_ID: {PK, IX+, NotNull, INTEGER(10), FK to LENDING}
     * @param lbUserId The value of lbUserId as notEqual. (NullAllowed: if null, no condition)
     */
    public void setLbUserId_NotEqual(Integer lbUserId) {
        doSetLbUserId_NotEqual(lbUserId);
    }

    protected void doSetLbUserId_NotEqual(Integer lbUserId) {
        regLbUserId(CK_NES, lbUserId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * LB_USER_ID: {PK, IX+, NotNull, INTEGER(10), FK to LENDING}
     * @param lbUserId The value of lbUserId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setLbUserId_GreaterThan(Integer lbUserId) {
        regLbUserId(CK_GT, lbUserId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * LB_USER_ID: {PK, IX+, NotNull, INTEGER(10), FK to LENDING}
     * @param lbUserId The value of lbUserId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setLbUserId_LessThan(Integer lbUserId) {
        regLbUserId(CK_LT, lbUserId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * LB_USER_ID: {PK, IX+, NotNull, INTEGER(10), FK to LENDING}
     * @param lbUserId The value of lbUserId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setLbUserId_GreaterEqual(Integer lbUserId) {
        regLbUserId(CK_GE, lbUserId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * LB_USER_ID: {PK, IX+, NotNull, INTEGER(10), FK to LENDING}
     * @param lbUserId The value of lbUserId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setLbUserId_LessEqual(Integer lbUserId) {
        regLbUserId(CK_LE, lbUserId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * LB_USER_ID: {PK, IX+, NotNull, INTEGER(10), FK to LENDING}
     * @param minNumber The min number of lbUserId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of lbUserId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setLbUserId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueLbUserId(), "LB_USER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * LB_USER_ID: {PK, IX+, NotNull, INTEGER(10), FK to LENDING}
     * @param lbUserIdList The collection of lbUserId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setLbUserId_InScope(Collection<Integer> lbUserIdList) {
        doSetLbUserId_InScope(lbUserIdList);
    }

    protected void doSetLbUserId_InScope(Collection<Integer> lbUserIdList) {
        regINS(CK_INS, cTL(lbUserIdList), getCValueLbUserId(), "LB_USER_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * LB_USER_ID: {PK, IX+, NotNull, INTEGER(10), FK to LENDING}
     * @param lbUserIdList The collection of lbUserId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setLbUserId_NotInScope(Collection<Integer> lbUserIdList) {
        doSetLbUserId_NotInScope(lbUserIdList);
    }

    protected void doSetLbUserId_NotInScope(Collection<Integer> lbUserIdList) {
        regINS(CK_NINS, cTL(lbUserIdList), getCValueLbUserId(), "LB_USER_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * LB_USER_ID: {PK, IX+, NotNull, INTEGER(10), FK to LENDING}
     */
    public void setLbUserId_IsNull() { regLbUserId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * LB_USER_ID: {PK, IX+, NotNull, INTEGER(10), FK to LENDING}
     */
    public void setLbUserId_IsNotNull() { regLbUserId(CK_ISNN, DOBJ); }

    protected void regLbUserId(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueLbUserId(), "LB_USER_ID"); }
    protected abstract ConditionValue getCValueLbUserId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * LENDING_DATE: {PK, IX+, NotNull, TIMESTAMP(26, 6), FK to LENDING}
     * @param lendingDate The value of lendingDate as equal. (NullAllowed: if null, no condition)
     */
    public void setLendingDate_Equal(java.sql.Timestamp lendingDate) {
        regLendingDate(CK_EQ,  lendingDate);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * LENDING_DATE: {PK, IX+, NotNull, TIMESTAMP(26, 6), FK to LENDING}
     * @param lendingDate The value of lendingDate as notEqual. (NullAllowed: if null, no condition)
     */
    public void setLendingDate_NotEqual(java.sql.Timestamp lendingDate) {
        regLendingDate(CK_NES,  lendingDate);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * LENDING_DATE: {PK, IX+, NotNull, TIMESTAMP(26, 6), FK to LENDING}
     * @param lendingDate The value of lendingDate as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setLendingDate_GreaterThan(java.sql.Timestamp lendingDate) {
        regLendingDate(CK_GT,  lendingDate);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * LENDING_DATE: {PK, IX+, NotNull, TIMESTAMP(26, 6), FK to LENDING}
     * @param lendingDate The value of lendingDate as lessThan. (NullAllowed: if null, no condition)
     */
    public void setLendingDate_LessThan(java.sql.Timestamp lendingDate) {
        regLendingDate(CK_LT,  lendingDate);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * LENDING_DATE: {PK, IX+, NotNull, TIMESTAMP(26, 6), FK to LENDING}
     * @param lendingDate The value of lendingDate as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setLendingDate_GreaterEqual(java.sql.Timestamp lendingDate) {
        regLendingDate(CK_GE,  lendingDate);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * LENDING_DATE: {PK, IX+, NotNull, TIMESTAMP(26, 6), FK to LENDING}
     * @param lendingDate The value of lendingDate as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setLendingDate_LessEqual(java.sql.Timestamp lendingDate) {
        regLendingDate(CK_LE, lendingDate);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * LENDING_DATE: {PK, IX+, NotNull, TIMESTAMP(26, 6), FK to LENDING}
     * <pre>e.g. setLendingDate_FromTo(fromDate, toDate, new <span style="color: #FD4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of lendingDate. (NullAllowed: if null, no from-condition)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of lendingDate. (NullAllowed: if null, no to-condition)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setLendingDate_FromTo(Date fromDatetime, Date toDatetime, FromToOption fromToOption) {
        regFTQ((fromDatetime != null ? new java.sql.Timestamp(fromDatetime.getTime()) : null), (toDatetime != null ? new java.sql.Timestamp(toDatetime.getTime()) : null), getCValueLendingDate(), "LENDING_DATE", fromToOption);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) {fromDate &lt;= column &lt; toDate + 1 day} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * LENDING_DATE: {PK, IX+, NotNull, TIMESTAMP(26, 6), FK to LENDING}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #FD4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of lendingDate. (NullAllowed: if null, no from-condition)
     * @param toDate The to-date(yyyy/MM/dd) of lendingDate. (NullAllowed: if null, no to-condition)
     */
    public void setLendingDate_DateFromTo(Date fromDate, Date toDate) {
        setLendingDate_FromTo(fromDate, toDate, new FromToOption().compareAsDate());
    }

    /**
     * InScope {in ('1965-03-03', '1966-09-15')}. And NullOrEmptyIgnored, NullElementIgnored, SeveralRegistered. <br />
     * LENDING_DATE: {PK, IX+, NotNull, TIMESTAMP(26, 6), FK to LENDING}
     * @param lendingDateList The collection of lendingDate as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setLendingDate_InScope(Collection<java.sql.Timestamp> lendingDateList) {
        doSetLendingDate_InScope(lendingDateList);
    }

    protected void doSetLendingDate_InScope(Collection<java.sql.Timestamp> lendingDateList) {
        regINS(CK_INS, cTL(lendingDateList), getCValueLendingDate(), "LENDING_DATE");
    }

    /**
     * NotInScope {not in ('1965-03-03', '1966-09-15')}. And NullOrEmptyIgnored, NullElementIgnored, SeveralRegistered. <br />
     * LENDING_DATE: {PK, IX+, NotNull, TIMESTAMP(26, 6), FK to LENDING}
     * @param lendingDateList The collection of lendingDate as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setLendingDate_NotInScope(Collection<java.sql.Timestamp> lendingDateList) {
        doSetLendingDate_NotInScope(lendingDateList);
    }

    protected void doSetLendingDate_NotInScope(Collection<java.sql.Timestamp> lendingDateList) {
        regINS(CK_NINS, cTL(lendingDateList), getCValueLendingDate(), "LENDING_DATE");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * LENDING_DATE: {PK, IX+, NotNull, TIMESTAMP(26, 6), FK to LENDING}
     */
    public void setLendingDate_IsNull() { regLendingDate(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * LENDING_DATE: {PK, IX+, NotNull, TIMESTAMP(26, 6), FK to LENDING}
     */
    public void setLendingDate_IsNotNull() { regLendingDate(CK_ISNN, DOBJ); }

    protected void regLendingDate(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueLendingDate(), "LENDING_DATE"); }
    protected abstract ConditionValue getCValueLendingDate();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * COLLECTION_ID: {PK, IX, NotNull, INTEGER(10), FK to COLLECTION}
     * @param collectionId The value of collectionId as equal. (NullAllowed: if null, no condition)
     */
    public void setCollectionId_Equal(Integer collectionId) {
        doSetCollectionId_Equal(collectionId);
    }

    protected void doSetCollectionId_Equal(Integer collectionId) {
        regCollectionId(CK_EQ, collectionId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * COLLECTION_ID: {PK, IX, NotNull, INTEGER(10), FK to COLLECTION}
     * @param collectionId The value of collectionId as notEqual. (NullAllowed: if null, no condition)
     */
    public void setCollectionId_NotEqual(Integer collectionId) {
        doSetCollectionId_NotEqual(collectionId);
    }

    protected void doSetCollectionId_NotEqual(Integer collectionId) {
        regCollectionId(CK_NES, collectionId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * COLLECTION_ID: {PK, IX, NotNull, INTEGER(10), FK to COLLECTION}
     * @param collectionId The value of collectionId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setCollectionId_GreaterThan(Integer collectionId) {
        regCollectionId(CK_GT, collectionId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * COLLECTION_ID: {PK, IX, NotNull, INTEGER(10), FK to COLLECTION}
     * @param collectionId The value of collectionId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setCollectionId_LessThan(Integer collectionId) {
        regCollectionId(CK_LT, collectionId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * COLLECTION_ID: {PK, IX, NotNull, INTEGER(10), FK to COLLECTION}
     * @param collectionId The value of collectionId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setCollectionId_GreaterEqual(Integer collectionId) {
        regCollectionId(CK_GE, collectionId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * COLLECTION_ID: {PK, IX, NotNull, INTEGER(10), FK to COLLECTION}
     * @param collectionId The value of collectionId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setCollectionId_LessEqual(Integer collectionId) {
        regCollectionId(CK_LE, collectionId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * COLLECTION_ID: {PK, IX, NotNull, INTEGER(10), FK to COLLECTION}
     * @param minNumber The min number of collectionId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of collectionId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setCollectionId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueCollectionId(), "COLLECTION_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * COLLECTION_ID: {PK, IX, NotNull, INTEGER(10), FK to COLLECTION}
     * @param collectionIdList The collection of collectionId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setCollectionId_InScope(Collection<Integer> collectionIdList) {
        doSetCollectionId_InScope(collectionIdList);
    }

    protected void doSetCollectionId_InScope(Collection<Integer> collectionIdList) {
        regINS(CK_INS, cTL(collectionIdList), getCValueCollectionId(), "COLLECTION_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * COLLECTION_ID: {PK, IX, NotNull, INTEGER(10), FK to COLLECTION}
     * @param collectionIdList The collection of collectionId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setCollectionId_NotInScope(Collection<Integer> collectionIdList) {
        doSetCollectionId_NotInScope(collectionIdList);
    }

    protected void doSetCollectionId_NotInScope(Collection<Integer> collectionIdList) {
        regINS(CK_NINS, cTL(collectionIdList), getCValueCollectionId(), "COLLECTION_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select COLLECTION_ID from COLLECTION where ...)} <br />
     * COLLECTION by my COLLECTION_ID, named 'collection'.
     * @param subQuery The sub-query of Collection for 'in-scope'. (NotNull)
     */
    public void inScopeCollection(SubQuery<LdCollectionCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        LdCollectionCB cb = new LdCollectionCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String pp = keepCollectionId_InScopeRelation_Collection(cb.query()); // for saving query-value.
        registerInScopeRelation(cb.query(), "COLLECTION_ID", "COLLECTION_ID", pp, "collection");
    }
    public abstract String keepCollectionId_InScopeRelation_Collection(LdCollectionCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select COLLECTION_ID from COLLECTION where ...)} <br />
     * COLLECTION by my COLLECTION_ID, named 'collection'.
     * @param subQuery The sub-query of Collection for 'not in-scope'. (NotNull)
     */
    public void notInScopeCollection(SubQuery<LdCollectionCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        LdCollectionCB cb = new LdCollectionCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String pp = keepCollectionId_NotInScopeRelation_Collection(cb.query()); // for saving query-value.
        registerNotInScopeRelation(cb.query(), "COLLECTION_ID", "COLLECTION_ID", pp, "collection");
    }
    public abstract String keepCollectionId_NotInScopeRelation_Collection(LdCollectionCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * COLLECTION_ID: {PK, IX, NotNull, INTEGER(10), FK to COLLECTION}
     */
    public void setCollectionId_IsNull() { regCollectionId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * COLLECTION_ID: {PK, IX, NotNull, INTEGER(10), FK to COLLECTION}
     */
    public void setCollectionId_IsNotNull() { regCollectionId(CK_ISNN, DOBJ); }

    protected void regCollectionId(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueCollectionId(), "COLLECTION_ID"); }
    protected abstract ConditionValue getCValueCollectionId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * RETURN_LIMIT_DATE: {NotNull, TIMESTAMP(26, 6)}
     * @param returnLimitDate The value of returnLimitDate as equal. (NullAllowed: if null, no condition)
     */
    public void setReturnLimitDate_Equal(java.sql.Timestamp returnLimitDate) {
        regReturnLimitDate(CK_EQ,  returnLimitDate);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * RETURN_LIMIT_DATE: {NotNull, TIMESTAMP(26, 6)}
     * @param returnLimitDate The value of returnLimitDate as notEqual. (NullAllowed: if null, no condition)
     */
    public void setReturnLimitDate_NotEqual(java.sql.Timestamp returnLimitDate) {
        regReturnLimitDate(CK_NES,  returnLimitDate);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * RETURN_LIMIT_DATE: {NotNull, TIMESTAMP(26, 6)}
     * @param returnLimitDate The value of returnLimitDate as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setReturnLimitDate_GreaterThan(java.sql.Timestamp returnLimitDate) {
        regReturnLimitDate(CK_GT,  returnLimitDate);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * RETURN_LIMIT_DATE: {NotNull, TIMESTAMP(26, 6)}
     * @param returnLimitDate The value of returnLimitDate as lessThan. (NullAllowed: if null, no condition)
     */
    public void setReturnLimitDate_LessThan(java.sql.Timestamp returnLimitDate) {
        regReturnLimitDate(CK_LT,  returnLimitDate);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * RETURN_LIMIT_DATE: {NotNull, TIMESTAMP(26, 6)}
     * @param returnLimitDate The value of returnLimitDate as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setReturnLimitDate_GreaterEqual(java.sql.Timestamp returnLimitDate) {
        regReturnLimitDate(CK_GE,  returnLimitDate);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * RETURN_LIMIT_DATE: {NotNull, TIMESTAMP(26, 6)}
     * @param returnLimitDate The value of returnLimitDate as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setReturnLimitDate_LessEqual(java.sql.Timestamp returnLimitDate) {
        regReturnLimitDate(CK_LE, returnLimitDate);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * RETURN_LIMIT_DATE: {NotNull, TIMESTAMP(26, 6)}
     * <pre>e.g. setReturnLimitDate_FromTo(fromDate, toDate, new <span style="color: #FD4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of returnLimitDate. (NullAllowed: if null, no from-condition)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of returnLimitDate. (NullAllowed: if null, no to-condition)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setReturnLimitDate_FromTo(Date fromDatetime, Date toDatetime, FromToOption fromToOption) {
        regFTQ((fromDatetime != null ? new java.sql.Timestamp(fromDatetime.getTime()) : null), (toDatetime != null ? new java.sql.Timestamp(toDatetime.getTime()) : null), getCValueReturnLimitDate(), "RETURN_LIMIT_DATE", fromToOption);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) {fromDate &lt;= column &lt; toDate + 1 day} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * RETURN_LIMIT_DATE: {NotNull, TIMESTAMP(26, 6)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #FD4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of returnLimitDate. (NullAllowed: if null, no from-condition)
     * @param toDate The to-date(yyyy/MM/dd) of returnLimitDate. (NullAllowed: if null, no to-condition)
     */
    public void setReturnLimitDate_DateFromTo(Date fromDate, Date toDate) {
        setReturnLimitDate_FromTo(fromDate, toDate, new FromToOption().compareAsDate());
    }

    /**
     * InScope {in ('1965-03-03', '1966-09-15')}. And NullOrEmptyIgnored, NullElementIgnored, SeveralRegistered. <br />
     * RETURN_LIMIT_DATE: {NotNull, TIMESTAMP(26, 6)}
     * @param returnLimitDateList The collection of returnLimitDate as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setReturnLimitDate_InScope(Collection<java.sql.Timestamp> returnLimitDateList) {
        doSetReturnLimitDate_InScope(returnLimitDateList);
    }

    protected void doSetReturnLimitDate_InScope(Collection<java.sql.Timestamp> returnLimitDateList) {
        regINS(CK_INS, cTL(returnLimitDateList), getCValueReturnLimitDate(), "RETURN_LIMIT_DATE");
    }

    /**
     * NotInScope {not in ('1965-03-03', '1966-09-15')}. And NullOrEmptyIgnored, NullElementIgnored, SeveralRegistered. <br />
     * RETURN_LIMIT_DATE: {NotNull, TIMESTAMP(26, 6)}
     * @param returnLimitDateList The collection of returnLimitDate as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setReturnLimitDate_NotInScope(Collection<java.sql.Timestamp> returnLimitDateList) {
        doSetReturnLimitDate_NotInScope(returnLimitDateList);
    }

    protected void doSetReturnLimitDate_NotInScope(Collection<java.sql.Timestamp> returnLimitDateList) {
        regINS(CK_NINS, cTL(returnLimitDateList), getCValueReturnLimitDate(), "RETURN_LIMIT_DATE");
    }

    protected void regReturnLimitDate(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueReturnLimitDate(), "RETURN_LIMIT_DATE"); }
    protected abstract ConditionValue getCValueReturnLimitDate();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * R_USER: {NotNull, VARCHAR(100), default=[default-user]}
     * @param rUser The value of rUser as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setRUser_Equal(String rUser) {
        doSetRUser_Equal(fRES(rUser));
    }

    protected void doSetRUser_Equal(String rUser) {
        regRUser(CK_EQ, rUser);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * R_USER: {NotNull, VARCHAR(100), default=[default-user]}
     * @param rUser The value of rUser as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setRUser_NotEqual(String rUser) {
        doSetRUser_NotEqual(fRES(rUser));
    }

    protected void doSetRUser_NotEqual(String rUser) {
        regRUser(CK_NES, rUser);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * R_USER: {NotNull, VARCHAR(100), default=[default-user]}
     * @param rUser The value of rUser as greaterThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setRUser_GreaterThan(String rUser) {
        regRUser(CK_GT, fRES(rUser));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * R_USER: {NotNull, VARCHAR(100), default=[default-user]}
     * @param rUser The value of rUser as lessThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setRUser_LessThan(String rUser) {
        regRUser(CK_LT, fRES(rUser));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * R_USER: {NotNull, VARCHAR(100), default=[default-user]}
     * @param rUser The value of rUser as greaterEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setRUser_GreaterEqual(String rUser) {
        regRUser(CK_GE, fRES(rUser));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * R_USER: {NotNull, VARCHAR(100), default=[default-user]}
     * @param rUser The value of rUser as lessEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setRUser_LessEqual(String rUser) {
        regRUser(CK_LE, fRES(rUser));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * R_USER: {NotNull, VARCHAR(100), default=[default-user]}
     * @param rUserList The collection of rUser as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setRUser_InScope(Collection<String> rUserList) {
        doSetRUser_InScope(rUserList);
    }

    public void doSetRUser_InScope(Collection<String> rUserList) {
        regINS(CK_INS, cTL(rUserList), getCValueRUser(), "R_USER");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * R_USER: {NotNull, VARCHAR(100), default=[default-user]}
     * @param rUserList The collection of rUser as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setRUser_NotInScope(Collection<String> rUserList) {
        doSetRUser_NotInScope(rUserList);
    }

    public void doSetRUser_NotInScope(Collection<String> rUserList) {
        regINS(CK_NINS, cTL(rUserList), getCValueRUser(), "R_USER");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * R_USER: {NotNull, VARCHAR(100), default=[default-user]}
     * @param rUser The value of rUser as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setRUser_PrefixSearch(String rUser) {
        setRUser_LikeSearch(rUser, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * R_USER: {NotNull, VARCHAR(100), default=[default-user]} <br />
     * <pre>e.g. setRUser_LikeSearch("xxx", new <span style="color: #FD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param rUser The value of rUser as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setRUser_LikeSearch(String rUser, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(rUser), getCValueRUser(), "R_USER", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * R_USER: {NotNull, VARCHAR(100), default=[default-user]}
     * @param rUser The value of rUser as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setRUser_NotLikeSearch(String rUser, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(rUser), getCValueRUser(), "R_USER", likeSearchOption);
    }

    protected void regRUser(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueRUser(), "R_USER"); }
    protected abstract ConditionValue getCValueRUser();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * R_MODULE: {NotNull, VARCHAR(100), default=[default-module]}
     * @param rModule The value of rModule as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setRModule_Equal(String rModule) {
        doSetRModule_Equal(fRES(rModule));
    }

    protected void doSetRModule_Equal(String rModule) {
        regRModule(CK_EQ, rModule);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * R_MODULE: {NotNull, VARCHAR(100), default=[default-module]}
     * @param rModule The value of rModule as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setRModule_NotEqual(String rModule) {
        doSetRModule_NotEqual(fRES(rModule));
    }

    protected void doSetRModule_NotEqual(String rModule) {
        regRModule(CK_NES, rModule);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * R_MODULE: {NotNull, VARCHAR(100), default=[default-module]}
     * @param rModule The value of rModule as greaterThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setRModule_GreaterThan(String rModule) {
        regRModule(CK_GT, fRES(rModule));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * R_MODULE: {NotNull, VARCHAR(100), default=[default-module]}
     * @param rModule The value of rModule as lessThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setRModule_LessThan(String rModule) {
        regRModule(CK_LT, fRES(rModule));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * R_MODULE: {NotNull, VARCHAR(100), default=[default-module]}
     * @param rModule The value of rModule as greaterEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setRModule_GreaterEqual(String rModule) {
        regRModule(CK_GE, fRES(rModule));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * R_MODULE: {NotNull, VARCHAR(100), default=[default-module]}
     * @param rModule The value of rModule as lessEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setRModule_LessEqual(String rModule) {
        regRModule(CK_LE, fRES(rModule));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * R_MODULE: {NotNull, VARCHAR(100), default=[default-module]}
     * @param rModuleList The collection of rModule as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setRModule_InScope(Collection<String> rModuleList) {
        doSetRModule_InScope(rModuleList);
    }

    public void doSetRModule_InScope(Collection<String> rModuleList) {
        regINS(CK_INS, cTL(rModuleList), getCValueRModule(), "R_MODULE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * R_MODULE: {NotNull, VARCHAR(100), default=[default-module]}
     * @param rModuleList The collection of rModule as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setRModule_NotInScope(Collection<String> rModuleList) {
        doSetRModule_NotInScope(rModuleList);
    }

    public void doSetRModule_NotInScope(Collection<String> rModuleList) {
        regINS(CK_NINS, cTL(rModuleList), getCValueRModule(), "R_MODULE");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * R_MODULE: {NotNull, VARCHAR(100), default=[default-module]}
     * @param rModule The value of rModule as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setRModule_PrefixSearch(String rModule) {
        setRModule_LikeSearch(rModule, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * R_MODULE: {NotNull, VARCHAR(100), default=[default-module]} <br />
     * <pre>e.g. setRModule_LikeSearch("xxx", new <span style="color: #FD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param rModule The value of rModule as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setRModule_LikeSearch(String rModule, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(rModule), getCValueRModule(), "R_MODULE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * R_MODULE: {NotNull, VARCHAR(100), default=[default-module]}
     * @param rModule The value of rModule as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setRModule_NotLikeSearch(String rModule, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(rModule), getCValueRModule(), "R_MODULE", likeSearchOption);
    }

    protected void regRModule(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueRModule(), "R_MODULE"); }
    protected abstract ConditionValue getCValueRModule();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * R_TIMESTAMP: {NotNull, TIMESTAMP(26, 6), default=[CURRENT_TIMESTAMP]}
     * @param rTimestamp The value of rTimestamp as equal. (NullAllowed: if null, no condition)
     */
    public void setRTimestamp_Equal(java.sql.Timestamp rTimestamp) {
        regRTimestamp(CK_EQ,  rTimestamp);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * R_TIMESTAMP: {NotNull, TIMESTAMP(26, 6), default=[CURRENT_TIMESTAMP]}
     * @param rTimestamp The value of rTimestamp as notEqual. (NullAllowed: if null, no condition)
     */
    public void setRTimestamp_NotEqual(java.sql.Timestamp rTimestamp) {
        regRTimestamp(CK_NES,  rTimestamp);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * R_TIMESTAMP: {NotNull, TIMESTAMP(26, 6), default=[CURRENT_TIMESTAMP]}
     * @param rTimestamp The value of rTimestamp as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setRTimestamp_GreaterThan(java.sql.Timestamp rTimestamp) {
        regRTimestamp(CK_GT,  rTimestamp);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * R_TIMESTAMP: {NotNull, TIMESTAMP(26, 6), default=[CURRENT_TIMESTAMP]}
     * @param rTimestamp The value of rTimestamp as lessThan. (NullAllowed: if null, no condition)
     */
    public void setRTimestamp_LessThan(java.sql.Timestamp rTimestamp) {
        regRTimestamp(CK_LT,  rTimestamp);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * R_TIMESTAMP: {NotNull, TIMESTAMP(26, 6), default=[CURRENT_TIMESTAMP]}
     * @param rTimestamp The value of rTimestamp as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setRTimestamp_GreaterEqual(java.sql.Timestamp rTimestamp) {
        regRTimestamp(CK_GE,  rTimestamp);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * R_TIMESTAMP: {NotNull, TIMESTAMP(26, 6), default=[CURRENT_TIMESTAMP]}
     * @param rTimestamp The value of rTimestamp as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setRTimestamp_LessEqual(java.sql.Timestamp rTimestamp) {
        regRTimestamp(CK_LE, rTimestamp);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * R_TIMESTAMP: {NotNull, TIMESTAMP(26, 6), default=[CURRENT_TIMESTAMP]}
     * <pre>e.g. setRTimestamp_FromTo(fromDate, toDate, new <span style="color: #FD4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of rTimestamp. (NullAllowed: if null, no from-condition)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of rTimestamp. (NullAllowed: if null, no to-condition)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setRTimestamp_FromTo(Date fromDatetime, Date toDatetime, FromToOption fromToOption) {
        regFTQ((fromDatetime != null ? new java.sql.Timestamp(fromDatetime.getTime()) : null), (toDatetime != null ? new java.sql.Timestamp(toDatetime.getTime()) : null), getCValueRTimestamp(), "R_TIMESTAMP", fromToOption);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) {fromDate &lt;= column &lt; toDate + 1 day} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * R_TIMESTAMP: {NotNull, TIMESTAMP(26, 6), default=[CURRENT_TIMESTAMP]}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #FD4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of rTimestamp. (NullAllowed: if null, no from-condition)
     * @param toDate The to-date(yyyy/MM/dd) of rTimestamp. (NullAllowed: if null, no to-condition)
     */
    public void setRTimestamp_DateFromTo(Date fromDate, Date toDate) {
        setRTimestamp_FromTo(fromDate, toDate, new FromToOption().compareAsDate());
    }

    /**
     * InScope {in ('1965-03-03', '1966-09-15')}. And NullOrEmptyIgnored, NullElementIgnored, SeveralRegistered. <br />
     * R_TIMESTAMP: {NotNull, TIMESTAMP(26, 6), default=[CURRENT_TIMESTAMP]}
     * @param rTimestampList The collection of rTimestamp as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setRTimestamp_InScope(Collection<java.sql.Timestamp> rTimestampList) {
        doSetRTimestamp_InScope(rTimestampList);
    }

    protected void doSetRTimestamp_InScope(Collection<java.sql.Timestamp> rTimestampList) {
        regINS(CK_INS, cTL(rTimestampList), getCValueRTimestamp(), "R_TIMESTAMP");
    }

    /**
     * NotInScope {not in ('1965-03-03', '1966-09-15')}. And NullOrEmptyIgnored, NullElementIgnored, SeveralRegistered. <br />
     * R_TIMESTAMP: {NotNull, TIMESTAMP(26, 6), default=[CURRENT_TIMESTAMP]}
     * @param rTimestampList The collection of rTimestamp as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setRTimestamp_NotInScope(Collection<java.sql.Timestamp> rTimestampList) {
        doSetRTimestamp_NotInScope(rTimestampList);
    }

    protected void doSetRTimestamp_NotInScope(Collection<java.sql.Timestamp> rTimestampList) {
        regINS(CK_NINS, cTL(rTimestampList), getCValueRTimestamp(), "R_TIMESTAMP");
    }

    protected void regRTimestamp(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueRTimestamp(), "R_TIMESTAMP"); }
    protected abstract ConditionValue getCValueRTimestamp();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * U_USER: {NotNull, VARCHAR(100), default=[default-user]}
     * @param uUser The value of uUser as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setUUser_Equal(String uUser) {
        doSetUUser_Equal(fRES(uUser));
    }

    protected void doSetUUser_Equal(String uUser) {
        regUUser(CK_EQ, uUser);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * U_USER: {NotNull, VARCHAR(100), default=[default-user]}
     * @param uUser The value of uUser as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setUUser_NotEqual(String uUser) {
        doSetUUser_NotEqual(fRES(uUser));
    }

    protected void doSetUUser_NotEqual(String uUser) {
        regUUser(CK_NES, uUser);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * U_USER: {NotNull, VARCHAR(100), default=[default-user]}
     * @param uUser The value of uUser as greaterThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setUUser_GreaterThan(String uUser) {
        regUUser(CK_GT, fRES(uUser));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * U_USER: {NotNull, VARCHAR(100), default=[default-user]}
     * @param uUser The value of uUser as lessThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setUUser_LessThan(String uUser) {
        regUUser(CK_LT, fRES(uUser));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * U_USER: {NotNull, VARCHAR(100), default=[default-user]}
     * @param uUser The value of uUser as greaterEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setUUser_GreaterEqual(String uUser) {
        regUUser(CK_GE, fRES(uUser));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * U_USER: {NotNull, VARCHAR(100), default=[default-user]}
     * @param uUser The value of uUser as lessEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setUUser_LessEqual(String uUser) {
        regUUser(CK_LE, fRES(uUser));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * U_USER: {NotNull, VARCHAR(100), default=[default-user]}
     * @param uUserList The collection of uUser as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setUUser_InScope(Collection<String> uUserList) {
        doSetUUser_InScope(uUserList);
    }

    public void doSetUUser_InScope(Collection<String> uUserList) {
        regINS(CK_INS, cTL(uUserList), getCValueUUser(), "U_USER");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * U_USER: {NotNull, VARCHAR(100), default=[default-user]}
     * @param uUserList The collection of uUser as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setUUser_NotInScope(Collection<String> uUserList) {
        doSetUUser_NotInScope(uUserList);
    }

    public void doSetUUser_NotInScope(Collection<String> uUserList) {
        regINS(CK_NINS, cTL(uUserList), getCValueUUser(), "U_USER");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * U_USER: {NotNull, VARCHAR(100), default=[default-user]}
     * @param uUser The value of uUser as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setUUser_PrefixSearch(String uUser) {
        setUUser_LikeSearch(uUser, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * U_USER: {NotNull, VARCHAR(100), default=[default-user]} <br />
     * <pre>e.g. setUUser_LikeSearch("xxx", new <span style="color: #FD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param uUser The value of uUser as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setUUser_LikeSearch(String uUser, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(uUser), getCValueUUser(), "U_USER", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * U_USER: {NotNull, VARCHAR(100), default=[default-user]}
     * @param uUser The value of uUser as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setUUser_NotLikeSearch(String uUser, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(uUser), getCValueUUser(), "U_USER", likeSearchOption);
    }

    protected void regUUser(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueUUser(), "U_USER"); }
    protected abstract ConditionValue getCValueUUser();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * U_MODULE: {NotNull, VARCHAR(100), default=[default-module]}
     * @param uModule The value of uModule as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setUModule_Equal(String uModule) {
        doSetUModule_Equal(fRES(uModule));
    }

    protected void doSetUModule_Equal(String uModule) {
        regUModule(CK_EQ, uModule);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * U_MODULE: {NotNull, VARCHAR(100), default=[default-module]}
     * @param uModule The value of uModule as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setUModule_NotEqual(String uModule) {
        doSetUModule_NotEqual(fRES(uModule));
    }

    protected void doSetUModule_NotEqual(String uModule) {
        regUModule(CK_NES, uModule);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * U_MODULE: {NotNull, VARCHAR(100), default=[default-module]}
     * @param uModule The value of uModule as greaterThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setUModule_GreaterThan(String uModule) {
        regUModule(CK_GT, fRES(uModule));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * U_MODULE: {NotNull, VARCHAR(100), default=[default-module]}
     * @param uModule The value of uModule as lessThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setUModule_LessThan(String uModule) {
        regUModule(CK_LT, fRES(uModule));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * U_MODULE: {NotNull, VARCHAR(100), default=[default-module]}
     * @param uModule The value of uModule as greaterEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setUModule_GreaterEqual(String uModule) {
        regUModule(CK_GE, fRES(uModule));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * U_MODULE: {NotNull, VARCHAR(100), default=[default-module]}
     * @param uModule The value of uModule as lessEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setUModule_LessEqual(String uModule) {
        regUModule(CK_LE, fRES(uModule));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * U_MODULE: {NotNull, VARCHAR(100), default=[default-module]}
     * @param uModuleList The collection of uModule as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setUModule_InScope(Collection<String> uModuleList) {
        doSetUModule_InScope(uModuleList);
    }

    public void doSetUModule_InScope(Collection<String> uModuleList) {
        regINS(CK_INS, cTL(uModuleList), getCValueUModule(), "U_MODULE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * U_MODULE: {NotNull, VARCHAR(100), default=[default-module]}
     * @param uModuleList The collection of uModule as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setUModule_NotInScope(Collection<String> uModuleList) {
        doSetUModule_NotInScope(uModuleList);
    }

    public void doSetUModule_NotInScope(Collection<String> uModuleList) {
        regINS(CK_NINS, cTL(uModuleList), getCValueUModule(), "U_MODULE");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * U_MODULE: {NotNull, VARCHAR(100), default=[default-module]}
     * @param uModule The value of uModule as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setUModule_PrefixSearch(String uModule) {
        setUModule_LikeSearch(uModule, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * U_MODULE: {NotNull, VARCHAR(100), default=[default-module]} <br />
     * <pre>e.g. setUModule_LikeSearch("xxx", new <span style="color: #FD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param uModule The value of uModule as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setUModule_LikeSearch(String uModule, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(uModule), getCValueUModule(), "U_MODULE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * U_MODULE: {NotNull, VARCHAR(100), default=[default-module]}
     * @param uModule The value of uModule as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setUModule_NotLikeSearch(String uModule, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(uModule), getCValueUModule(), "U_MODULE", likeSearchOption);
    }

    protected void regUModule(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueUModule(), "U_MODULE"); }
    protected abstract ConditionValue getCValueUModule();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * U_TIMESTAMP: {NotNull, TIMESTAMP(26, 6), default=[CURRENT_TIMESTAMP]}
     * @param uTimestamp The value of uTimestamp as equal. (NullAllowed: if null, no condition)
     */
    public void setUTimestamp_Equal(java.sql.Timestamp uTimestamp) {
        regUTimestamp(CK_EQ,  uTimestamp);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * U_TIMESTAMP: {NotNull, TIMESTAMP(26, 6), default=[CURRENT_TIMESTAMP]}
     * @param uTimestamp The value of uTimestamp as notEqual. (NullAllowed: if null, no condition)
     */
    public void setUTimestamp_NotEqual(java.sql.Timestamp uTimestamp) {
        regUTimestamp(CK_NES,  uTimestamp);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * U_TIMESTAMP: {NotNull, TIMESTAMP(26, 6), default=[CURRENT_TIMESTAMP]}
     * @param uTimestamp The value of uTimestamp as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setUTimestamp_GreaterThan(java.sql.Timestamp uTimestamp) {
        regUTimestamp(CK_GT,  uTimestamp);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * U_TIMESTAMP: {NotNull, TIMESTAMP(26, 6), default=[CURRENT_TIMESTAMP]}
     * @param uTimestamp The value of uTimestamp as lessThan. (NullAllowed: if null, no condition)
     */
    public void setUTimestamp_LessThan(java.sql.Timestamp uTimestamp) {
        regUTimestamp(CK_LT,  uTimestamp);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * U_TIMESTAMP: {NotNull, TIMESTAMP(26, 6), default=[CURRENT_TIMESTAMP]}
     * @param uTimestamp The value of uTimestamp as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setUTimestamp_GreaterEqual(java.sql.Timestamp uTimestamp) {
        regUTimestamp(CK_GE,  uTimestamp);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * U_TIMESTAMP: {NotNull, TIMESTAMP(26, 6), default=[CURRENT_TIMESTAMP]}
     * @param uTimestamp The value of uTimestamp as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setUTimestamp_LessEqual(java.sql.Timestamp uTimestamp) {
        regUTimestamp(CK_LE, uTimestamp);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * U_TIMESTAMP: {NotNull, TIMESTAMP(26, 6), default=[CURRENT_TIMESTAMP]}
     * <pre>e.g. setUTimestamp_FromTo(fromDate, toDate, new <span style="color: #FD4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of uTimestamp. (NullAllowed: if null, no from-condition)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of uTimestamp. (NullAllowed: if null, no to-condition)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setUTimestamp_FromTo(Date fromDatetime, Date toDatetime, FromToOption fromToOption) {
        regFTQ((fromDatetime != null ? new java.sql.Timestamp(fromDatetime.getTime()) : null), (toDatetime != null ? new java.sql.Timestamp(toDatetime.getTime()) : null), getCValueUTimestamp(), "U_TIMESTAMP", fromToOption);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) {fromDate &lt;= column &lt; toDate + 1 day} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * U_TIMESTAMP: {NotNull, TIMESTAMP(26, 6), default=[CURRENT_TIMESTAMP]}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #FD4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of uTimestamp. (NullAllowed: if null, no from-condition)
     * @param toDate The to-date(yyyy/MM/dd) of uTimestamp. (NullAllowed: if null, no to-condition)
     */
    public void setUTimestamp_DateFromTo(Date fromDate, Date toDate) {
        setUTimestamp_FromTo(fromDate, toDate, new FromToOption().compareAsDate());
    }

    /**
     * InScope {in ('1965-03-03', '1966-09-15')}. And NullOrEmptyIgnored, NullElementIgnored, SeveralRegistered. <br />
     * U_TIMESTAMP: {NotNull, TIMESTAMP(26, 6), default=[CURRENT_TIMESTAMP]}
     * @param uTimestampList The collection of uTimestamp as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setUTimestamp_InScope(Collection<java.sql.Timestamp> uTimestampList) {
        doSetUTimestamp_InScope(uTimestampList);
    }

    protected void doSetUTimestamp_InScope(Collection<java.sql.Timestamp> uTimestampList) {
        regINS(CK_INS, cTL(uTimestampList), getCValueUTimestamp(), "U_TIMESTAMP");
    }

    /**
     * NotInScope {not in ('1965-03-03', '1966-09-15')}. And NullOrEmptyIgnored, NullElementIgnored, SeveralRegistered. <br />
     * U_TIMESTAMP: {NotNull, TIMESTAMP(26, 6), default=[CURRENT_TIMESTAMP]}
     * @param uTimestampList The collection of uTimestamp as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setUTimestamp_NotInScope(Collection<java.sql.Timestamp> uTimestampList) {
        doSetUTimestamp_NotInScope(uTimestampList);
    }

    protected void doSetUTimestamp_NotInScope(Collection<java.sql.Timestamp> uTimestampList) {
        regINS(CK_NINS, cTL(uTimestampList), getCValueUTimestamp(), "U_TIMESTAMP");
    }

    protected void regUTimestamp(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueUTimestamp(), "U_TIMESTAMP"); }
    protected abstract ConditionValue getCValueUTimestamp();

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    protected LdLendingCollectionCB newMyCB() {
        return new LdLendingCollectionCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabCQ() { return LdLendingCollectionCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
