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
 * The abstract condition-query of GARBAGE.
 * @author DBFlute(AutoGenerator)
 */
public abstract class LdAbstractBsGarbageCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public LdAbstractBsGarbageCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "GARBAGE";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * GARBAGE_MEMO: {VARCHAR(50)}
     * @param garbageMemo The value of garbageMemo as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setGarbageMemo_Equal(String garbageMemo) {
        doSetGarbageMemo_Equal(fRES(garbageMemo));
    }

    protected void doSetGarbageMemo_Equal(String garbageMemo) {
        regGarbageMemo(CK_EQ, garbageMemo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * GARBAGE_MEMO: {VARCHAR(50)}
     * @param garbageMemo The value of garbageMemo as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setGarbageMemo_NotEqual(String garbageMemo) {
        doSetGarbageMemo_NotEqual(fRES(garbageMemo));
    }

    protected void doSetGarbageMemo_NotEqual(String garbageMemo) {
        regGarbageMemo(CK_NES, garbageMemo);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * GARBAGE_MEMO: {VARCHAR(50)}
     * @param garbageMemo The value of garbageMemo as greaterThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setGarbageMemo_GreaterThan(String garbageMemo) {
        regGarbageMemo(CK_GT, fRES(garbageMemo));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * GARBAGE_MEMO: {VARCHAR(50)}
     * @param garbageMemo The value of garbageMemo as lessThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setGarbageMemo_LessThan(String garbageMemo) {
        regGarbageMemo(CK_LT, fRES(garbageMemo));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * GARBAGE_MEMO: {VARCHAR(50)}
     * @param garbageMemo The value of garbageMemo as greaterEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setGarbageMemo_GreaterEqual(String garbageMemo) {
        regGarbageMemo(CK_GE, fRES(garbageMemo));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * GARBAGE_MEMO: {VARCHAR(50)}
     * @param garbageMemo The value of garbageMemo as lessEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setGarbageMemo_LessEqual(String garbageMemo) {
        regGarbageMemo(CK_LE, fRES(garbageMemo));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * GARBAGE_MEMO: {VARCHAR(50)}
     * @param garbageMemoList The collection of garbageMemo as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setGarbageMemo_InScope(Collection<String> garbageMemoList) {
        doSetGarbageMemo_InScope(garbageMemoList);
    }

    public void doSetGarbageMemo_InScope(Collection<String> garbageMemoList) {
        regINS(CK_INS, cTL(garbageMemoList), getCValueGarbageMemo(), "GARBAGE_MEMO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * GARBAGE_MEMO: {VARCHAR(50)}
     * @param garbageMemoList The collection of garbageMemo as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setGarbageMemo_NotInScope(Collection<String> garbageMemoList) {
        doSetGarbageMemo_NotInScope(garbageMemoList);
    }

    public void doSetGarbageMemo_NotInScope(Collection<String> garbageMemoList) {
        regINS(CK_NINS, cTL(garbageMemoList), getCValueGarbageMemo(), "GARBAGE_MEMO");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * GARBAGE_MEMO: {VARCHAR(50)}
     * @param garbageMemo The value of garbageMemo as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setGarbageMemo_PrefixSearch(String garbageMemo) {
        setGarbageMemo_LikeSearch(garbageMemo, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * GARBAGE_MEMO: {VARCHAR(50)} <br />
     * <pre>e.g. setGarbageMemo_LikeSearch("xxx", new <span style="color: #FD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param garbageMemo The value of garbageMemo as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setGarbageMemo_LikeSearch(String garbageMemo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(garbageMemo), getCValueGarbageMemo(), "GARBAGE_MEMO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * GARBAGE_MEMO: {VARCHAR(50)}
     * @param garbageMemo The value of garbageMemo as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setGarbageMemo_NotLikeSearch(String garbageMemo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(garbageMemo), getCValueGarbageMemo(), "GARBAGE_MEMO", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * GARBAGE_MEMO: {VARCHAR(50)}
     */
    public void setGarbageMemo_IsNull() { regGarbageMemo(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br />
     * GARBAGE_MEMO: {VARCHAR(50)}
     */
    public void setGarbageMemo_IsNullOrEmpty() { regGarbageMemo(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * GARBAGE_MEMO: {VARCHAR(50)}
     */
    public void setGarbageMemo_IsNotNull() { regGarbageMemo(CK_ISNN, DOBJ); }

    protected void regGarbageMemo(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueGarbageMemo(), "GARBAGE_MEMO"); }
    protected abstract ConditionValue getCValueGarbageMemo();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * GARBAGE_TIME: {TIMESTAMP(26, 6)}
     * @param garbageTime The value of garbageTime as equal. (NullAllowed: if null, no condition)
     */
    public void setGarbageTime_Equal(java.sql.Timestamp garbageTime) {
        regGarbageTime(CK_EQ,  garbageTime);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * GARBAGE_TIME: {TIMESTAMP(26, 6)}
     * @param garbageTime The value of garbageTime as notEqual. (NullAllowed: if null, no condition)
     */
    public void setGarbageTime_NotEqual(java.sql.Timestamp garbageTime) {
        regGarbageTime(CK_NES,  garbageTime);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * GARBAGE_TIME: {TIMESTAMP(26, 6)}
     * @param garbageTime The value of garbageTime as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setGarbageTime_GreaterThan(java.sql.Timestamp garbageTime) {
        regGarbageTime(CK_GT,  garbageTime);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * GARBAGE_TIME: {TIMESTAMP(26, 6)}
     * @param garbageTime The value of garbageTime as lessThan. (NullAllowed: if null, no condition)
     */
    public void setGarbageTime_LessThan(java.sql.Timestamp garbageTime) {
        regGarbageTime(CK_LT,  garbageTime);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * GARBAGE_TIME: {TIMESTAMP(26, 6)}
     * @param garbageTime The value of garbageTime as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setGarbageTime_GreaterEqual(java.sql.Timestamp garbageTime) {
        regGarbageTime(CK_GE,  garbageTime);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * GARBAGE_TIME: {TIMESTAMP(26, 6)}
     * @param garbageTime The value of garbageTime as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setGarbageTime_LessEqual(java.sql.Timestamp garbageTime) {
        regGarbageTime(CK_LE, garbageTime);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * GARBAGE_TIME: {TIMESTAMP(26, 6)}
     * <pre>e.g. setGarbageTime_FromTo(fromDate, toDate, new <span style="color: #FD4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of garbageTime. (NullAllowed: if null, no from-condition)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of garbageTime. (NullAllowed: if null, no to-condition)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setGarbageTime_FromTo(Date fromDatetime, Date toDatetime, FromToOption fromToOption) {
        regFTQ((fromDatetime != null ? new java.sql.Timestamp(fromDatetime.getTime()) : null), (toDatetime != null ? new java.sql.Timestamp(toDatetime.getTime()) : null), getCValueGarbageTime(), "GARBAGE_TIME", fromToOption);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) {fromDate &lt;= column &lt; toDate + 1 day} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * GARBAGE_TIME: {TIMESTAMP(26, 6)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #FD4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of garbageTime. (NullAllowed: if null, no from-condition)
     * @param toDate The to-date(yyyy/MM/dd) of garbageTime. (NullAllowed: if null, no to-condition)
     */
    public void setGarbageTime_DateFromTo(Date fromDate, Date toDate) {
        setGarbageTime_FromTo(fromDate, toDate, new FromToOption().compareAsDate());
    }

    /**
     * InScope {in ('1965-03-03', '1966-09-15')}. And NullOrEmptyIgnored, NullElementIgnored, SeveralRegistered. <br />
     * GARBAGE_TIME: {TIMESTAMP(26, 6)}
     * @param garbageTimeList The collection of garbageTime as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setGarbageTime_InScope(Collection<java.sql.Timestamp> garbageTimeList) {
        doSetGarbageTime_InScope(garbageTimeList);
    }

    protected void doSetGarbageTime_InScope(Collection<java.sql.Timestamp> garbageTimeList) {
        regINS(CK_INS, cTL(garbageTimeList), getCValueGarbageTime(), "GARBAGE_TIME");
    }

    /**
     * NotInScope {not in ('1965-03-03', '1966-09-15')}. And NullOrEmptyIgnored, NullElementIgnored, SeveralRegistered. <br />
     * GARBAGE_TIME: {TIMESTAMP(26, 6)}
     * @param garbageTimeList The collection of garbageTime as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setGarbageTime_NotInScope(Collection<java.sql.Timestamp> garbageTimeList) {
        doSetGarbageTime_NotInScope(garbageTimeList);
    }

    protected void doSetGarbageTime_NotInScope(Collection<java.sql.Timestamp> garbageTimeList) {
        regINS(CK_NINS, cTL(garbageTimeList), getCValueGarbageTime(), "GARBAGE_TIME");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * GARBAGE_TIME: {TIMESTAMP(26, 6)}
     */
    public void setGarbageTime_IsNull() { regGarbageTime(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * GARBAGE_TIME: {TIMESTAMP(26, 6)}
     */
    public void setGarbageTime_IsNotNull() { regGarbageTime(CK_ISNN, DOBJ); }

    protected void regGarbageTime(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueGarbageTime(), "GARBAGE_TIME"); }
    protected abstract ConditionValue getCValueGarbageTime();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * GARBAGE_COUNT: {INTEGER(10)}
     * @param garbageCount The value of garbageCount as equal. (NullAllowed: if null, no condition)
     */
    public void setGarbageCount_Equal(Integer garbageCount) {
        doSetGarbageCount_Equal(garbageCount);
    }

    protected void doSetGarbageCount_Equal(Integer garbageCount) {
        regGarbageCount(CK_EQ, garbageCount);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * GARBAGE_COUNT: {INTEGER(10)}
     * @param garbageCount The value of garbageCount as notEqual. (NullAllowed: if null, no condition)
     */
    public void setGarbageCount_NotEqual(Integer garbageCount) {
        doSetGarbageCount_NotEqual(garbageCount);
    }

    protected void doSetGarbageCount_NotEqual(Integer garbageCount) {
        regGarbageCount(CK_NES, garbageCount);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * GARBAGE_COUNT: {INTEGER(10)}
     * @param garbageCount The value of garbageCount as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setGarbageCount_GreaterThan(Integer garbageCount) {
        regGarbageCount(CK_GT, garbageCount);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * GARBAGE_COUNT: {INTEGER(10)}
     * @param garbageCount The value of garbageCount as lessThan. (NullAllowed: if null, no condition)
     */
    public void setGarbageCount_LessThan(Integer garbageCount) {
        regGarbageCount(CK_LT, garbageCount);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * GARBAGE_COUNT: {INTEGER(10)}
     * @param garbageCount The value of garbageCount as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setGarbageCount_GreaterEqual(Integer garbageCount) {
        regGarbageCount(CK_GE, garbageCount);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * GARBAGE_COUNT: {INTEGER(10)}
     * @param garbageCount The value of garbageCount as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setGarbageCount_LessEqual(Integer garbageCount) {
        regGarbageCount(CK_LE, garbageCount);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * GARBAGE_COUNT: {INTEGER(10)}
     * @param minNumber The min number of garbageCount. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of garbageCount. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setGarbageCount_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueGarbageCount(), "GARBAGE_COUNT", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * GARBAGE_COUNT: {INTEGER(10)}
     * @param garbageCountList The collection of garbageCount as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setGarbageCount_InScope(Collection<Integer> garbageCountList) {
        doSetGarbageCount_InScope(garbageCountList);
    }

    protected void doSetGarbageCount_InScope(Collection<Integer> garbageCountList) {
        regINS(CK_INS, cTL(garbageCountList), getCValueGarbageCount(), "GARBAGE_COUNT");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * GARBAGE_COUNT: {INTEGER(10)}
     * @param garbageCountList The collection of garbageCount as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setGarbageCount_NotInScope(Collection<Integer> garbageCountList) {
        doSetGarbageCount_NotInScope(garbageCountList);
    }

    protected void doSetGarbageCount_NotInScope(Collection<Integer> garbageCountList) {
        regINS(CK_NINS, cTL(garbageCountList), getCValueGarbageCount(), "GARBAGE_COUNT");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * GARBAGE_COUNT: {INTEGER(10)}
     */
    public void setGarbageCount_IsNull() { regGarbageCount(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * GARBAGE_COUNT: {INTEGER(10)}
     */
    public void setGarbageCount_IsNotNull() { regGarbageCount(CK_ISNN, DOBJ); }

    protected void regGarbageCount(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueGarbageCount(), "GARBAGE_COUNT"); }
    protected abstract ConditionValue getCValueGarbageCount();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * R_USER: {VARCHAR(100)}
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
     * R_USER: {VARCHAR(100)}
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
     * R_USER: {VARCHAR(100)}
     * @param rUser The value of rUser as greaterThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setRUser_GreaterThan(String rUser) {
        regRUser(CK_GT, fRES(rUser));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * R_USER: {VARCHAR(100)}
     * @param rUser The value of rUser as lessThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setRUser_LessThan(String rUser) {
        regRUser(CK_LT, fRES(rUser));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * R_USER: {VARCHAR(100)}
     * @param rUser The value of rUser as greaterEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setRUser_GreaterEqual(String rUser) {
        regRUser(CK_GE, fRES(rUser));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * R_USER: {VARCHAR(100)}
     * @param rUser The value of rUser as lessEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setRUser_LessEqual(String rUser) {
        regRUser(CK_LE, fRES(rUser));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * R_USER: {VARCHAR(100)}
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
     * R_USER: {VARCHAR(100)}
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
     * R_USER: {VARCHAR(100)}
     * @param rUser The value of rUser as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setRUser_PrefixSearch(String rUser) {
        setRUser_LikeSearch(rUser, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * R_USER: {VARCHAR(100)} <br />
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
     * R_USER: {VARCHAR(100)}
     * @param rUser The value of rUser as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setRUser_NotLikeSearch(String rUser, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(rUser), getCValueRUser(), "R_USER", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * R_USER: {VARCHAR(100)}
     */
    public void setRUser_IsNull() { regRUser(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br />
     * R_USER: {VARCHAR(100)}
     */
    public void setRUser_IsNullOrEmpty() { regRUser(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * R_USER: {VARCHAR(100)}
     */
    public void setRUser_IsNotNull() { regRUser(CK_ISNN, DOBJ); }

    protected void regRUser(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueRUser(), "R_USER"); }
    protected abstract ConditionValue getCValueRUser();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * R_TIMESTAMP: {TIMESTAMP(26, 6)}
     * @param rTimestamp The value of rTimestamp as equal. (NullAllowed: if null, no condition)
     */
    public void setRTimestamp_Equal(java.sql.Timestamp rTimestamp) {
        regRTimestamp(CK_EQ,  rTimestamp);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * R_TIMESTAMP: {TIMESTAMP(26, 6)}
     * @param rTimestamp The value of rTimestamp as notEqual. (NullAllowed: if null, no condition)
     */
    public void setRTimestamp_NotEqual(java.sql.Timestamp rTimestamp) {
        regRTimestamp(CK_NES,  rTimestamp);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * R_TIMESTAMP: {TIMESTAMP(26, 6)}
     * @param rTimestamp The value of rTimestamp as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setRTimestamp_GreaterThan(java.sql.Timestamp rTimestamp) {
        regRTimestamp(CK_GT,  rTimestamp);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * R_TIMESTAMP: {TIMESTAMP(26, 6)}
     * @param rTimestamp The value of rTimestamp as lessThan. (NullAllowed: if null, no condition)
     */
    public void setRTimestamp_LessThan(java.sql.Timestamp rTimestamp) {
        regRTimestamp(CK_LT,  rTimestamp);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * R_TIMESTAMP: {TIMESTAMP(26, 6)}
     * @param rTimestamp The value of rTimestamp as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setRTimestamp_GreaterEqual(java.sql.Timestamp rTimestamp) {
        regRTimestamp(CK_GE,  rTimestamp);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * R_TIMESTAMP: {TIMESTAMP(26, 6)}
     * @param rTimestamp The value of rTimestamp as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setRTimestamp_LessEqual(java.sql.Timestamp rTimestamp) {
        regRTimestamp(CK_LE, rTimestamp);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * R_TIMESTAMP: {TIMESTAMP(26, 6)}
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
     * R_TIMESTAMP: {TIMESTAMP(26, 6)}
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
     * R_TIMESTAMP: {TIMESTAMP(26, 6)}
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
     * R_TIMESTAMP: {TIMESTAMP(26, 6)}
     * @param rTimestampList The collection of rTimestamp as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setRTimestamp_NotInScope(Collection<java.sql.Timestamp> rTimestampList) {
        doSetRTimestamp_NotInScope(rTimestampList);
    }

    protected void doSetRTimestamp_NotInScope(Collection<java.sql.Timestamp> rTimestampList) {
        regINS(CK_NINS, cTL(rTimestampList), getCValueRTimestamp(), "R_TIMESTAMP");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * R_TIMESTAMP: {TIMESTAMP(26, 6)}
     */
    public void setRTimestamp_IsNull() { regRTimestamp(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * R_TIMESTAMP: {TIMESTAMP(26, 6)}
     */
    public void setRTimestamp_IsNotNull() { regRTimestamp(CK_ISNN, DOBJ); }

    protected void regRTimestamp(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueRTimestamp(), "R_TIMESTAMP"); }
    protected abstract ConditionValue getCValueRTimestamp();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * U_USER: {VARCHAR(100)}
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
     * U_USER: {VARCHAR(100)}
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
     * U_USER: {VARCHAR(100)}
     * @param uUser The value of uUser as greaterThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setUUser_GreaterThan(String uUser) {
        regUUser(CK_GT, fRES(uUser));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * U_USER: {VARCHAR(100)}
     * @param uUser The value of uUser as lessThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setUUser_LessThan(String uUser) {
        regUUser(CK_LT, fRES(uUser));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * U_USER: {VARCHAR(100)}
     * @param uUser The value of uUser as greaterEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setUUser_GreaterEqual(String uUser) {
        regUUser(CK_GE, fRES(uUser));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * U_USER: {VARCHAR(100)}
     * @param uUser The value of uUser as lessEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setUUser_LessEqual(String uUser) {
        regUUser(CK_LE, fRES(uUser));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * U_USER: {VARCHAR(100)}
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
     * U_USER: {VARCHAR(100)}
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
     * U_USER: {VARCHAR(100)}
     * @param uUser The value of uUser as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setUUser_PrefixSearch(String uUser) {
        setUUser_LikeSearch(uUser, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * U_USER: {VARCHAR(100)} <br />
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
     * U_USER: {VARCHAR(100)}
     * @param uUser The value of uUser as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setUUser_NotLikeSearch(String uUser, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(uUser), getCValueUUser(), "U_USER", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * U_USER: {VARCHAR(100)}
     */
    public void setUUser_IsNull() { regUUser(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br />
     * U_USER: {VARCHAR(100)}
     */
    public void setUUser_IsNullOrEmpty() { regUUser(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * U_USER: {VARCHAR(100)}
     */
    public void setUUser_IsNotNull() { regUUser(CK_ISNN, DOBJ); }

    protected void regUUser(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueUUser(), "U_USER"); }
    protected abstract ConditionValue getCValueUUser();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * U_TIMESTAMP: {TIMESTAMP(26, 6)}
     * @param uTimestamp The value of uTimestamp as equal. (NullAllowed: if null, no condition)
     */
    public void setUTimestamp_Equal(java.sql.Timestamp uTimestamp) {
        regUTimestamp(CK_EQ,  uTimestamp);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * U_TIMESTAMP: {TIMESTAMP(26, 6)}
     * @param uTimestamp The value of uTimestamp as notEqual. (NullAllowed: if null, no condition)
     */
    public void setUTimestamp_NotEqual(java.sql.Timestamp uTimestamp) {
        regUTimestamp(CK_NES,  uTimestamp);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * U_TIMESTAMP: {TIMESTAMP(26, 6)}
     * @param uTimestamp The value of uTimestamp as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setUTimestamp_GreaterThan(java.sql.Timestamp uTimestamp) {
        regUTimestamp(CK_GT,  uTimestamp);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * U_TIMESTAMP: {TIMESTAMP(26, 6)}
     * @param uTimestamp The value of uTimestamp as lessThan. (NullAllowed: if null, no condition)
     */
    public void setUTimestamp_LessThan(java.sql.Timestamp uTimestamp) {
        regUTimestamp(CK_LT,  uTimestamp);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * U_TIMESTAMP: {TIMESTAMP(26, 6)}
     * @param uTimestamp The value of uTimestamp as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setUTimestamp_GreaterEqual(java.sql.Timestamp uTimestamp) {
        regUTimestamp(CK_GE,  uTimestamp);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * U_TIMESTAMP: {TIMESTAMP(26, 6)}
     * @param uTimestamp The value of uTimestamp as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setUTimestamp_LessEqual(java.sql.Timestamp uTimestamp) {
        regUTimestamp(CK_LE, uTimestamp);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * U_TIMESTAMP: {TIMESTAMP(26, 6)}
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
     * U_TIMESTAMP: {TIMESTAMP(26, 6)}
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
     * U_TIMESTAMP: {TIMESTAMP(26, 6)}
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
     * U_TIMESTAMP: {TIMESTAMP(26, 6)}
     * @param uTimestampList The collection of uTimestamp as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setUTimestamp_NotInScope(Collection<java.sql.Timestamp> uTimestampList) {
        doSetUTimestamp_NotInScope(uTimestampList);
    }

    protected void doSetUTimestamp_NotInScope(Collection<java.sql.Timestamp> uTimestampList) {
        regINS(CK_NINS, cTL(uTimestampList), getCValueUTimestamp(), "U_TIMESTAMP");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * U_TIMESTAMP: {TIMESTAMP(26, 6)}
     */
    public void setUTimestamp_IsNull() { regUTimestamp(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * U_TIMESTAMP: {TIMESTAMP(26, 6)}
     */
    public void setUTimestamp_IsNotNull() { regUTimestamp(CK_ISNN, DOBJ); }

    protected void regUTimestamp(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueUTimestamp(), "U_TIMESTAMP"); }
    protected abstract ConditionValue getCValueUTimestamp();

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    protected LdGarbageCB newMyCB() {
        return new LdGarbageCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabCQ() { return LdGarbageCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
