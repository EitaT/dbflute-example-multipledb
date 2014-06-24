/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */package com.example.dbflute.multipledb.seasar.dbflute.librarydb.cbean.cq.bs;

import java.util.*;

import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.cbean.chelper.*;
import org.seasar.dbflute.cbean.ckey.*;
import org.seasar.dbflute.cbean.coption.*;
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import org.seasar.dbflute.dbmeta.DBMetaProvider;
import com.example.dbflute.multipledb.seasar.dbflute.librarydb.allcommon.*;
import com.example.dbflute.multipledb.seasar.dbflute.librarydb.cbean.*;
import com.example.dbflute.multipledb.seasar.dbflute.librarydb.cbean.cq.*;

/**
 * The abstract condition-query of PUBLISHER.
 * @author DBFlute(AutoGenerator)
 */
public abstract class LdAbstractBsPublisherCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public LdAbstractBsPublisherCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
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
        return "PUBLISHER";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * PUBLISHER_ID: {PK, ID, NotNull, INTEGER(10)}
     * @param publisherId The value of publisherId as equal. (NullAllowed: if null, no condition)
     */
    public void setPublisherId_Equal(Integer publisherId) {
        doSetPublisherId_Equal(publisherId);
    }

    protected void doSetPublisherId_Equal(Integer publisherId) {
        regPublisherId(CK_EQ, publisherId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * PUBLISHER_ID: {PK, ID, NotNull, INTEGER(10)}
     * @param publisherId The value of publisherId as notEqual. (NullAllowed: if null, no condition)
     */
    public void setPublisherId_NotEqual(Integer publisherId) {
        doSetPublisherId_NotEqual(publisherId);
    }

    protected void doSetPublisherId_NotEqual(Integer publisherId) {
        regPublisherId(CK_NES, publisherId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * PUBLISHER_ID: {PK, ID, NotNull, INTEGER(10)}
     * @param publisherId The value of publisherId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setPublisherId_GreaterThan(Integer publisherId) {
        regPublisherId(CK_GT, publisherId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * PUBLISHER_ID: {PK, ID, NotNull, INTEGER(10)}
     * @param publisherId The value of publisherId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setPublisherId_LessThan(Integer publisherId) {
        regPublisherId(CK_LT, publisherId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * PUBLISHER_ID: {PK, ID, NotNull, INTEGER(10)}
     * @param publisherId The value of publisherId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setPublisherId_GreaterEqual(Integer publisherId) {
        regPublisherId(CK_GE, publisherId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * PUBLISHER_ID: {PK, ID, NotNull, INTEGER(10)}
     * @param publisherId The value of publisherId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setPublisherId_LessEqual(Integer publisherId) {
        regPublisherId(CK_LE, publisherId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * PUBLISHER_ID: {PK, ID, NotNull, INTEGER(10)}
     * @param minNumber The min number of publisherId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of publisherId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPublisherId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValuePublisherId(), "PUBLISHER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * PUBLISHER_ID: {PK, ID, NotNull, INTEGER(10)}
     * @param publisherIdList The collection of publisherId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setPublisherId_InScope(Collection<Integer> publisherIdList) {
        doSetPublisherId_InScope(publisherIdList);
    }

    protected void doSetPublisherId_InScope(Collection<Integer> publisherIdList) {
        regINS(CK_INS, cTL(publisherIdList), getCValuePublisherId(), "PUBLISHER_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * PUBLISHER_ID: {PK, ID, NotNull, INTEGER(10)}
     * @param publisherIdList The collection of publisherId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setPublisherId_NotInScope(Collection<Integer> publisherIdList) {
        doSetPublisherId_NotInScope(publisherIdList);
    }

    protected void doSetPublisherId_NotInScope(Collection<Integer> publisherIdList) {
        regINS(CK_NINS, cTL(publisherIdList), getCValuePublisherId(), "PUBLISHER_ID");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br />
     * {exists (select PUBLISHER_ID from BOOK where ...)} <br />
     * BOOK by PUBLISHER_ID, named 'bookAsOne'.
     * <pre>
     * cb.query().<span style="color: #DD4747">existsBookList</span>(new SubQuery&lt;LdBookCB&gt;() {
     *     public void query(LdBookCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of BookList for 'exists'. (NotNull)
     */
    public void existsBookList(SubQuery<LdBookCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        LdBookCB cb = new LdBookCB(); cb.xsetupForExistsReferrer(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepPublisherId_ExistsReferrer_BookList(cb.query());
        registerExistsReferrer(cb.query(), "PUBLISHER_ID", "PUBLISHER_ID", pp, "bookList");
    }
    public abstract String keepPublisherId_ExistsReferrer_BookList(LdBookCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br />
     * {not exists (select PUBLISHER_ID from BOOK where ...)} <br />
     * BOOK by PUBLISHER_ID, named 'bookAsOne'.
     * <pre>
     * cb.query().<span style="color: #DD4747">notExistsBookList</span>(new SubQuery&lt;LdBookCB&gt;() {
     *     public void query(LdBookCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of PublisherId_NotExistsReferrer_BookList for 'not exists'. (NotNull)
     */
    public void notExistsBookList(SubQuery<LdBookCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        LdBookCB cb = new LdBookCB(); cb.xsetupForExistsReferrer(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepPublisherId_NotExistsReferrer_BookList(cb.query());
        registerNotExistsReferrer(cb.query(), "PUBLISHER_ID", "PUBLISHER_ID", pp, "bookList");
    }
    public abstract String keepPublisherId_NotExistsReferrer_BookList(LdBookCQ sq);

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select PUBLISHER_ID from BOOK where ...)} <br />
     * BOOK by PUBLISHER_ID, named 'bookAsOne'.
     * @param subQuery The sub-query of BookList for 'in-scope'. (NotNull)
     */
    public void inScopeBookList(SubQuery<LdBookCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        LdBookCB cb = new LdBookCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepPublisherId_InScopeRelation_BookList(cb.query());
        registerInScopeRelation(cb.query(), "PUBLISHER_ID", "PUBLISHER_ID", pp, "bookList");
    }
    public abstract String keepPublisherId_InScopeRelation_BookList(LdBookCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select PUBLISHER_ID from BOOK where ...)} <br />
     * BOOK by PUBLISHER_ID, named 'bookAsOne'.
     * @param subQuery The sub-query of BookList for 'not in-scope'. (NotNull)
     */
    public void notInScopeBookList(SubQuery<LdBookCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        LdBookCB cb = new LdBookCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepPublisherId_NotInScopeRelation_BookList(cb.query());
        registerNotInScopeRelation(cb.query(), "PUBLISHER_ID", "PUBLISHER_ID", pp, "bookList");
    }
    public abstract String keepPublisherId_NotInScopeRelation_BookList(LdBookCQ sq);

    public void xsderiveBookList(String fn, SubQuery<LdBookCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        LdBookCB cb = new LdBookCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        String pp = keepPublisherId_SpecifyDerivedReferrer_BookList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "PUBLISHER_ID", "PUBLISHER_ID", pp, "bookList", al, op);
    }
    public abstract String keepPublisherId_SpecifyDerivedReferrer_BookList(LdBookCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br />
     * {FOO &lt;= (select max(BAR) from BOOK where ...)} <br />
     * BOOK by PUBLISHER_ID, named 'bookAsOne'.
     * <pre>
     * cb.query().<span style="color: #DD4747">derivedBookList()</span>.<span style="color: #DD4747">max</span>(new SubQuery&lt;LdBookCB&gt;() {
     *     public void query(LdBookCB subCB) {
     *         subCB.specify().<span style="color: #DD4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *         subCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     *     }
     * }).<span style="color: #DD4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<LdBookCB> derivedBookList() {
        return xcreateQDRFunctionBookList();
    }
    protected HpQDRFunction<LdBookCB> xcreateQDRFunctionBookList() {
        return new HpQDRFunction<LdBookCB>(new HpQDRSetupper<LdBookCB>() {
            public void setup(String fn, SubQuery<LdBookCB> sq, String rd, Object vl, DerivedReferrerOption op) {
                xqderiveBookList(fn, sq, rd, vl, op);
            }
        });
    }
    public void xqderiveBookList(String fn, SubQuery<LdBookCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        LdBookCB cb = new LdBookCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        String sqpp = keepPublisherId_QueryDerivedReferrer_BookList(cb.query()); String prpp = keepPublisherId_QueryDerivedReferrer_BookListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "PUBLISHER_ID", "PUBLISHER_ID", sqpp, "bookList", rd, vl, prpp, op);
    }
    public abstract String keepPublisherId_QueryDerivedReferrer_BookList(LdBookCQ sq);
    public abstract String keepPublisherId_QueryDerivedReferrer_BookListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * PUBLISHER_ID: {PK, ID, NotNull, INTEGER(10)}
     */
    public void setPublisherId_IsNull() { regPublisherId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * PUBLISHER_ID: {PK, ID, NotNull, INTEGER(10)}
     */
    public void setPublisherId_IsNotNull() { regPublisherId(CK_ISNN, DOBJ); }

    protected void regPublisherId(ConditionKey ky, Object vl) { regQ(ky, vl, getCValuePublisherId(), "PUBLISHER_ID"); }
    protected abstract ConditionValue getCValuePublisherId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * PUBLISHER_NAME: {NotNull, VARCHAR(80)}
     * @param publisherName The value of publisherName as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setPublisherName_Equal(String publisherName) {
        doSetPublisherName_Equal(fRES(publisherName));
    }

    protected void doSetPublisherName_Equal(String publisherName) {
        regPublisherName(CK_EQ, publisherName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * PUBLISHER_NAME: {NotNull, VARCHAR(80)}
     * @param publisherName The value of publisherName as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setPublisherName_NotEqual(String publisherName) {
        doSetPublisherName_NotEqual(fRES(publisherName));
    }

    protected void doSetPublisherName_NotEqual(String publisherName) {
        regPublisherName(CK_NES, publisherName);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * PUBLISHER_NAME: {NotNull, VARCHAR(80)}
     * @param publisherName The value of publisherName as greaterThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setPublisherName_GreaterThan(String publisherName) {
        regPublisherName(CK_GT, fRES(publisherName));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * PUBLISHER_NAME: {NotNull, VARCHAR(80)}
     * @param publisherName The value of publisherName as lessThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setPublisherName_LessThan(String publisherName) {
        regPublisherName(CK_LT, fRES(publisherName));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * PUBLISHER_NAME: {NotNull, VARCHAR(80)}
     * @param publisherName The value of publisherName as greaterEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setPublisherName_GreaterEqual(String publisherName) {
        regPublisherName(CK_GE, fRES(publisherName));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * PUBLISHER_NAME: {NotNull, VARCHAR(80)}
     * @param publisherName The value of publisherName as lessEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setPublisherName_LessEqual(String publisherName) {
        regPublisherName(CK_LE, fRES(publisherName));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * PUBLISHER_NAME: {NotNull, VARCHAR(80)}
     * @param publisherNameList The collection of publisherName as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setPublisherName_InScope(Collection<String> publisherNameList) {
        doSetPublisherName_InScope(publisherNameList);
    }

    public void doSetPublisherName_InScope(Collection<String> publisherNameList) {
        regINS(CK_INS, cTL(publisherNameList), getCValuePublisherName(), "PUBLISHER_NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * PUBLISHER_NAME: {NotNull, VARCHAR(80)}
     * @param publisherNameList The collection of publisherName as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setPublisherName_NotInScope(Collection<String> publisherNameList) {
        doSetPublisherName_NotInScope(publisherNameList);
    }

    public void doSetPublisherName_NotInScope(Collection<String> publisherNameList) {
        regINS(CK_NINS, cTL(publisherNameList), getCValuePublisherName(), "PUBLISHER_NAME");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * PUBLISHER_NAME: {NotNull, VARCHAR(80)}
     * @param publisherName The value of publisherName as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setPublisherName_PrefixSearch(String publisherName) {
        setPublisherName_LikeSearch(publisherName, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * PUBLISHER_NAME: {NotNull, VARCHAR(80)} <br />
     * <pre>e.g. setPublisherName_LikeSearch("xxx", new <span style="color: #DD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param publisherName The value of publisherName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPublisherName_LikeSearch(String publisherName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(publisherName), getCValuePublisherName(), "PUBLISHER_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * PUBLISHER_NAME: {NotNull, VARCHAR(80)}
     * @param publisherName The value of publisherName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPublisherName_NotLikeSearch(String publisherName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(publisherName), getCValuePublisherName(), "PUBLISHER_NAME", likeSearchOption);
    }

    protected void regPublisherName(ConditionKey ky, Object vl) { regQ(ky, vl, getCValuePublisherName(), "PUBLISHER_NAME"); }
    protected abstract ConditionValue getCValuePublisherName();

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
     * <pre>e.g. setRUser_LikeSearch("xxx", new <span style="color: #DD4747">LikeSearchOption</span>().likeContain());</pre>
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
     * R_MODULE: {NotNull, VARCHAR(100), default=[default-module], classification=RegisterModuleType}
     * @param rModule The value of rModule as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setRModule_Equal(String rModule) {
        doSetRModule_Equal(fRES(rModule));
    }

    /**
     * Equal(=). As RegisterModuleType. And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * R_MODULE: {NotNull, VARCHAR(100), default=[default-module], classification=RegisterModuleType} <br />
     * 登録モジュールタイプ
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, no condition)
     */
    public void setRModule_Equal_AsRegisterModuleType(LdCDef.RegisterModuleType cdef) {
        doSetRModule_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As Online (OLN). And OnlyOnceRegistered. <br />
     * Online: Online Module
     */
    public void setRModule_Equal_Online() {
        setRModule_Equal_AsRegisterModuleType(LdCDef.RegisterModuleType.Online);
    }

    /**
     * Equal(=). As Batch (BTC). And OnlyOnceRegistered. <br />
     * Batch: Batch Module
     */
    public void setRModule_Equal_Batch() {
        setRModule_Equal_AsRegisterModuleType(LdCDef.RegisterModuleType.Batch);
    }

    protected void doSetRModule_Equal(String rModule) {
        regRModule(CK_EQ, rModule);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * R_MODULE: {NotNull, VARCHAR(100), default=[default-module], classification=RegisterModuleType}
     * @param rModule The value of rModule as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setRModule_NotEqual(String rModule) {
        doSetRModule_NotEqual(fRES(rModule));
    }

    /**
     * NotEqual(&lt;&gt;). As RegisterModuleType. And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * R_MODULE: {NotNull, VARCHAR(100), default=[default-module], classification=RegisterModuleType} <br />
     * 登録モジュールタイプ
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, no condition)
     */
    public void setRModule_NotEqual_AsRegisterModuleType(LdCDef.RegisterModuleType cdef) {
        doSetRModule_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As Online (OLN). And OnlyOnceRegistered. <br />
     * Online: Online Module
     */
    public void setRModule_NotEqual_Online() {
        setRModule_NotEqual_AsRegisterModuleType(LdCDef.RegisterModuleType.Online);
    }

    /**
     * NotEqual(&lt;&gt;). As Batch (BTC). And OnlyOnceRegistered. <br />
     * Batch: Batch Module
     */
    public void setRModule_NotEqual_Batch() {
        setRModule_NotEqual_AsRegisterModuleType(LdCDef.RegisterModuleType.Batch);
    }

    protected void doSetRModule_NotEqual(String rModule) {
        regRModule(CK_NES, rModule);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * R_MODULE: {NotNull, VARCHAR(100), default=[default-module], classification=RegisterModuleType}
     * @param rModuleList The collection of rModule as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setRModule_InScope(Collection<String> rModuleList) {
        doSetRModule_InScope(rModuleList);
    }

    /**
     * InScope {in ('a', 'b')}. As RegisterModuleType. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * R_MODULE: {NotNull, VARCHAR(100), default=[default-module], classification=RegisterModuleType} <br />
     * 登録モジュールタイプ
     * @param cdefList The list of classification definition (as ENUM type). (NullAllowed: if null (or empty), no condition)
     */
    public void setRModule_InScope_AsRegisterModuleType(Collection<LdCDef.RegisterModuleType> cdefList) {
        doSetRModule_InScope(cTStrL(cdefList));
    }

    public void doSetRModule_InScope(Collection<String> rModuleList) {
        regINS(CK_INS, cTL(rModuleList), getCValueRModule(), "R_MODULE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * R_MODULE: {NotNull, VARCHAR(100), default=[default-module], classification=RegisterModuleType}
     * @param rModuleList The collection of rModule as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setRModule_NotInScope(Collection<String> rModuleList) {
        doSetRModule_NotInScope(rModuleList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As RegisterModuleType. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * R_MODULE: {NotNull, VARCHAR(100), default=[default-module], classification=RegisterModuleType} <br />
     * 登録モジュールタイプ
     * @param cdefList The list of classification definition (as ENUM type). (NullAllowed: if null (or empty), no condition)
     */
    public void setRModule_NotInScope_AsRegisterModuleType(Collection<LdCDef.RegisterModuleType> cdefList) {
        doSetRModule_NotInScope(cTStrL(cdefList));
    }

    public void doSetRModule_NotInScope(Collection<String> rModuleList) {
        regINS(CK_NINS, cTL(rModuleList), getCValueRModule(), "R_MODULE");
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
     * <pre>e.g. setRTimestamp_FromTo(fromDate, toDate, new <span style="color: #DD4747">FromToOption</span>().compareAsDate());</pre>
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
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #DD4747">&lt; '2007/04/17 00:00:00'</span>
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
     * <pre>e.g. setUUser_LikeSearch("xxx", new <span style="color: #DD4747">LikeSearchOption</span>().likeContain());</pre>
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
     * U_MODULE: {NotNull, VARCHAR(100), default=[default-module], classification=UpdateModuleType}
     * @param uModule The value of uModule as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setUModule_Equal(String uModule) {
        doSetUModule_Equal(fRES(uModule));
    }

    /**
     * Equal(=). As UpdateModuleType. And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * U_MODULE: {NotNull, VARCHAR(100), default=[default-module], classification=UpdateModuleType} <br />
     * 更新モジュールタイプ
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, no condition)
     */
    public void setUModule_Equal_AsUpdateModuleType(LdCDef.UpdateModuleType cdef) {
        doSetUModule_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As Online (OLN). And OnlyOnceRegistered. <br />
     * Online: Online Module
     */
    public void setUModule_Equal_Online() {
        setUModule_Equal_AsUpdateModuleType(LdCDef.UpdateModuleType.Online);
    }

    /**
     * Equal(=). As Batch (BTC). And OnlyOnceRegistered. <br />
     * Batch: Batch Module
     */
    public void setUModule_Equal_Batch() {
        setUModule_Equal_AsUpdateModuleType(LdCDef.UpdateModuleType.Batch);
    }

    protected void doSetUModule_Equal(String uModule) {
        regUModule(CK_EQ, uModule);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * U_MODULE: {NotNull, VARCHAR(100), default=[default-module], classification=UpdateModuleType}
     * @param uModule The value of uModule as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setUModule_NotEqual(String uModule) {
        doSetUModule_NotEqual(fRES(uModule));
    }

    /**
     * NotEqual(&lt;&gt;). As UpdateModuleType. And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * U_MODULE: {NotNull, VARCHAR(100), default=[default-module], classification=UpdateModuleType} <br />
     * 更新モジュールタイプ
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, no condition)
     */
    public void setUModule_NotEqual_AsUpdateModuleType(LdCDef.UpdateModuleType cdef) {
        doSetUModule_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As Online (OLN). And OnlyOnceRegistered. <br />
     * Online: Online Module
     */
    public void setUModule_NotEqual_Online() {
        setUModule_NotEqual_AsUpdateModuleType(LdCDef.UpdateModuleType.Online);
    }

    /**
     * NotEqual(&lt;&gt;). As Batch (BTC). And OnlyOnceRegistered. <br />
     * Batch: Batch Module
     */
    public void setUModule_NotEqual_Batch() {
        setUModule_NotEqual_AsUpdateModuleType(LdCDef.UpdateModuleType.Batch);
    }

    protected void doSetUModule_NotEqual(String uModule) {
        regUModule(CK_NES, uModule);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * U_MODULE: {NotNull, VARCHAR(100), default=[default-module], classification=UpdateModuleType}
     * @param uModuleList The collection of uModule as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setUModule_InScope(Collection<String> uModuleList) {
        doSetUModule_InScope(uModuleList);
    }

    /**
     * InScope {in ('a', 'b')}. As UpdateModuleType. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * U_MODULE: {NotNull, VARCHAR(100), default=[default-module], classification=UpdateModuleType} <br />
     * 更新モジュールタイプ
     * @param cdefList The list of classification definition (as ENUM type). (NullAllowed: if null (or empty), no condition)
     */
    public void setUModule_InScope_AsUpdateModuleType(Collection<LdCDef.UpdateModuleType> cdefList) {
        doSetUModule_InScope(cTStrL(cdefList));
    }

    public void doSetUModule_InScope(Collection<String> uModuleList) {
        regINS(CK_INS, cTL(uModuleList), getCValueUModule(), "U_MODULE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * U_MODULE: {NotNull, VARCHAR(100), default=[default-module], classification=UpdateModuleType}
     * @param uModuleList The collection of uModule as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setUModule_NotInScope(Collection<String> uModuleList) {
        doSetUModule_NotInScope(uModuleList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As UpdateModuleType. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * U_MODULE: {NotNull, VARCHAR(100), default=[default-module], classification=UpdateModuleType} <br />
     * 更新モジュールタイプ
     * @param cdefList The list of classification definition (as ENUM type). (NullAllowed: if null (or empty), no condition)
     */
    public void setUModule_NotInScope_AsUpdateModuleType(Collection<LdCDef.UpdateModuleType> cdefList) {
        doSetUModule_NotInScope(cTStrL(cdefList));
    }

    public void doSetUModule_NotInScope(Collection<String> uModuleList) {
        regINS(CK_NINS, cTL(uModuleList), getCValueUModule(), "U_MODULE");
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
     * <pre>e.g. setUTimestamp_FromTo(fromDate, toDate, new <span style="color: #DD4747">FromToOption</span>().compareAsDate());</pre>
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
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #DD4747">&lt; '2007/04/17 00:00:00'</span>
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
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_Equal()</span>.max(new SubQuery&lt;LdPublisherCB&gt;() {
     *     public void query(LdPublisherCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<LdPublisherCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ, LdPublisherCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;LdPublisherCB&gt;() {
     *     public void query(LdPublisherCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<LdPublisherCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES, LdPublisherCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;LdPublisherCB&gt;() {
     *     public void query(LdPublisherCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<LdPublisherCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT, LdPublisherCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessThan()</span>.max(new SubQuery&lt;LdPublisherCB&gt;() {
     *     public void query(LdPublisherCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<LdPublisherCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT, LdPublisherCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;LdPublisherCB&gt;() {
     *     public void query(LdPublisherCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<LdPublisherCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE, LdPublisherCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;LdPublisherCB&gt;() {
     *     public void query(LdPublisherCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<LdPublisherCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE, LdPublisherCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSSQOption<CB> op) {
        assertObjectNotNull("subQuery", sq);
        LdPublisherCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        op.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, op);
    }
    public abstract String keepScalarCondition(LdPublisherCQ sq);

    protected LdPublisherCB xcreateScalarConditionCB() {
        LdPublisherCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected LdPublisherCB xcreateScalarConditionPartitionByCB() {
        LdPublisherCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<LdPublisherCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        LdPublisherCB cb = new LdPublisherCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        String pp = keepSpecifyMyselfDerived(cb.query());
        String pk = "PUBLISHER_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(LdPublisherCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<LdPublisherCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(LdPublisherCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        LdPublisherCB cb = new LdPublisherCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "PUBLISHER_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(LdPublisherCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subQuery The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<LdPublisherCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        LdPublisherCB cb = new LdPublisherCB(); cb.xsetupForMyselfExists(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(LdPublisherCQ sq);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (sub-query).
     * @param subQuery The implementation of sub-query. (NotNull)
     */
    public void myselfInScope(SubQuery<LdPublisherCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        LdPublisherCB cb = new LdPublisherCB(); cb.xsetupForMyselfInScope(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepMyselfInScope(cb.query());
        registerMyselfInScope(cb.query(), pp);
    }
    public abstract String keepMyselfInScope(LdPublisherCQ sq);

    /**
     * Order along manual ordering information.
     * <pre>
     * MemberCB cb = new MemberCB();
     * ManualOrderBean mob = new ManualOrderBean();
     * mob.<span style="color: #DD4747">when_GreaterEqual</span>(priorityDate); <span style="color: #3F7E5E">// e.g. 2000/01/01</span>
     * cb.query().addOrderBy_Birthdate_Asc().<span style="color: #DD4747">withManualOrder(mob)</span>;
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when BIRTHDATE &gt;= '2000/01/01' then 0</span>
     * <span style="color: #3F7E5E">//     else 1</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     *
     * MemberCB cb = new MemberCB();
     * ManualOrderBean mob = new ManualOrderBean();
     * mob.<span style="color: #DD4747">when_Equal</span>(CDef.MemberStatus.Withdrawal);
     * mob.<span style="color: #DD4747">when_Equal</span>(CDef.MemberStatus.Formalized);
     * mob.<span style="color: #DD4747">when_Equal</span>(CDef.MemberStatus.Provisional);
     * cb.query().addOrderBy_MemberStatusCode_Asc().<span style="color: #DD4747">withManualOrder(mob)</span>;
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'WDL' then 0</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'FML' then 1</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'PRV' then 2</span>
     * <span style="color: #3F7E5E">//     else 3</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     * </pre>
     * <p>This function with Union is unsupported!</p>
     * <p>The order values are bound (treated as bind parameter).</p>
     * @param mob The bean of manual order containing order values. (NotNull)
     */
    public void withManualOrder(ManualOrderBean mob) { // is user public!
        xdoWithManualOrder(mob);
    }

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
    protected LdPublisherCB newMyCB() {
        return new LdPublisherCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabCQ() { return LdPublisherCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
