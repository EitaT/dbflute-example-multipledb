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
 * The abstract condition-query of AUTHOR.
 * @author DBFlute(AutoGenerator)
 */
public abstract class LdAbstractBsAuthorCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public LdAbstractBsAuthorCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "AUTHOR";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * AUTHOR_ID: {PK, ID, NotNull, INTEGER(10)}
     * @param authorId The value of authorId as equal. (NullAllowed: if null, no condition)
     */
    public void setAuthorId_Equal(Integer authorId) {
        doSetAuthorId_Equal(authorId);
    }

    protected void doSetAuthorId_Equal(Integer authorId) {
        regAuthorId(CK_EQ, authorId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * AUTHOR_ID: {PK, ID, NotNull, INTEGER(10)}
     * @param authorId The value of authorId as notEqual. (NullAllowed: if null, no condition)
     */
    public void setAuthorId_NotEqual(Integer authorId) {
        doSetAuthorId_NotEqual(authorId);
    }

    protected void doSetAuthorId_NotEqual(Integer authorId) {
        regAuthorId(CK_NES, authorId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * AUTHOR_ID: {PK, ID, NotNull, INTEGER(10)}
     * @param authorId The value of authorId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setAuthorId_GreaterThan(Integer authorId) {
        regAuthorId(CK_GT, authorId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * AUTHOR_ID: {PK, ID, NotNull, INTEGER(10)}
     * @param authorId The value of authorId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setAuthorId_LessThan(Integer authorId) {
        regAuthorId(CK_LT, authorId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * AUTHOR_ID: {PK, ID, NotNull, INTEGER(10)}
     * @param authorId The value of authorId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setAuthorId_GreaterEqual(Integer authorId) {
        regAuthorId(CK_GE, authorId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * AUTHOR_ID: {PK, ID, NotNull, INTEGER(10)}
     * @param authorId The value of authorId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setAuthorId_LessEqual(Integer authorId) {
        regAuthorId(CK_LE, authorId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * AUTHOR_ID: {PK, ID, NotNull, INTEGER(10)}
     * @param minNumber The min number of authorId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of authorId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setAuthorId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueAuthorId(), "AUTHOR_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * AUTHOR_ID: {PK, ID, NotNull, INTEGER(10)}
     * @param authorIdList The collection of authorId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setAuthorId_InScope(Collection<Integer> authorIdList) {
        doSetAuthorId_InScope(authorIdList);
    }

    protected void doSetAuthorId_InScope(Collection<Integer> authorIdList) {
        regINS(CK_INS, cTL(authorIdList), getCValueAuthorId(), "AUTHOR_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * AUTHOR_ID: {PK, ID, NotNull, INTEGER(10)}
     * @param authorIdList The collection of authorId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setAuthorId_NotInScope(Collection<Integer> authorIdList) {
        doSetAuthorId_NotInScope(authorIdList);
    }

    protected void doSetAuthorId_NotInScope(Collection<Integer> authorIdList) {
        regINS(CK_NINS, cTL(authorIdList), getCValueAuthorId(), "AUTHOR_ID");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br />
     * {exists (select AUTHOR_ID from BOOK where ...)} <br />
     * BOOK by AUTHOR_ID, named 'bookAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">existsBookList</span>(new SubQuery&lt;LdBookCB&gt;() {
     *     public void query(LdBookCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of BookList for 'exists'. (NotNull)
     */
    public void existsBookList(SubQuery<LdBookCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        LdBookCB cb = new LdBookCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String pp = keepAuthorId_ExistsReferrer_BookList(cb.query()); // for saving query-value.
        registerExistsReferrer(cb.query(), "AUTHOR_ID", "AUTHOR_ID", pp, "bookList");
    }
    public abstract String keepAuthorId_ExistsReferrer_BookList(LdBookCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br />
     * {not exists (select AUTHOR_ID from BOOK where ...)} <br />
     * BOOK by AUTHOR_ID, named 'bookAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">notExistsBookList</span>(new SubQuery&lt;LdBookCB&gt;() {
     *     public void query(LdBookCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of AuthorId_NotExistsReferrer_BookList for 'not exists'. (NotNull)
     */
    public void notExistsBookList(SubQuery<LdBookCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        LdBookCB cb = new LdBookCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String pp = keepAuthorId_NotExistsReferrer_BookList(cb.query()); // for saving query-value.
        registerNotExistsReferrer(cb.query(), "AUTHOR_ID", "AUTHOR_ID", pp, "bookList");
    }
    public abstract String keepAuthorId_NotExistsReferrer_BookList(LdBookCQ sq);

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select AUTHOR_ID from BOOK where ...)} <br />
     * BOOK by AUTHOR_ID, named 'bookAsOne'.
     * @param subQuery The sub-query of BookList for 'in-scope'. (NotNull)
     */
    public void inScopeBookList(SubQuery<LdBookCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        LdBookCB cb = new LdBookCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String pp = keepAuthorId_InScopeRelation_BookList(cb.query()); // for saving query-value.
        registerInScopeRelation(cb.query(), "AUTHOR_ID", "AUTHOR_ID", pp, "bookList");
    }
    public abstract String keepAuthorId_InScopeRelation_BookList(LdBookCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select AUTHOR_ID from BOOK where ...)} <br />
     * BOOK by AUTHOR_ID, named 'bookAsOne'.
     * @param subQuery The sub-query of BookList for 'not in-scope'. (NotNull)
     */
    public void notInScopeBookList(SubQuery<LdBookCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        LdBookCB cb = new LdBookCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String pp = keepAuthorId_NotInScopeRelation_BookList(cb.query()); // for saving query-value.
        registerNotInScopeRelation(cb.query(), "AUTHOR_ID", "AUTHOR_ID", pp, "bookList");
    }
    public abstract String keepAuthorId_NotInScopeRelation_BookList(LdBookCQ sq);

    public void xsderiveBookList(String fn, SubQuery<LdBookCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        LdBookCB cb = new LdBookCB(); cb.xsetupForDerivedReferrer(this); sq.query(cb);
        String pp = keepAuthorId_SpecifyDerivedReferrer_BookList(cb.query()); // for saving query-value.
        registerSpecifyDerivedReferrer(fn, cb.query(), "AUTHOR_ID", "AUTHOR_ID", pp, "bookList", al, op);
    }
    public abstract String keepAuthorId_SpecifyDerivedReferrer_BookList(LdBookCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer. <br />
     * {FOO &lt;= (select max(BAR) from BOOK where ...)} <br />
     * BOOK by AUTHOR_ID, named 'bookAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">derivedBookList()</span>.<span style="color: #FD4747">max</span>(new SubQuery&lt;LdBookCB&gt;() {
     *     public void query(LdBookCB subCB) {
     *         subCB.specify().<span style="color: #FD4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *         subCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     *     }
     * }).<span style="color: #FD4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
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
        LdBookCB cb = new LdBookCB(); cb.xsetupForDerivedReferrer(this); sq.query(cb);
        String sqpp = keepAuthorId_QueryDerivedReferrer_BookList(cb.query()); // for saving query-value.
        String prpp = keepAuthorId_QueryDerivedReferrer_BookListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "AUTHOR_ID", "AUTHOR_ID", sqpp, "bookList", rd, vl, prpp, op);
    }
    public abstract String keepAuthorId_QueryDerivedReferrer_BookList(LdBookCQ sq);
    public abstract String keepAuthorId_QueryDerivedReferrer_BookListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * AUTHOR_ID: {PK, ID, NotNull, INTEGER(10)}
     */
    public void setAuthorId_IsNull() { regAuthorId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * AUTHOR_ID: {PK, ID, NotNull, INTEGER(10)}
     */
    public void setAuthorId_IsNotNull() { regAuthorId(CK_ISNN, DOBJ); }

    protected void regAuthorId(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueAuthorId(), "AUTHOR_ID"); }
    protected abstract ConditionValue getCValueAuthorId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * AUTHOR_NAME: {NotNull, VARCHAR(80)}
     * @param authorName The value of authorName as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setAuthorName_Equal(String authorName) {
        doSetAuthorName_Equal(fRES(authorName));
    }

    protected void doSetAuthorName_Equal(String authorName) {
        regAuthorName(CK_EQ, authorName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * AUTHOR_NAME: {NotNull, VARCHAR(80)}
     * @param authorName The value of authorName as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setAuthorName_NotEqual(String authorName) {
        doSetAuthorName_NotEqual(fRES(authorName));
    }

    protected void doSetAuthorName_NotEqual(String authorName) {
        regAuthorName(CK_NES, authorName);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * AUTHOR_NAME: {NotNull, VARCHAR(80)}
     * @param authorName The value of authorName as greaterThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setAuthorName_GreaterThan(String authorName) {
        regAuthorName(CK_GT, fRES(authorName));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * AUTHOR_NAME: {NotNull, VARCHAR(80)}
     * @param authorName The value of authorName as lessThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setAuthorName_LessThan(String authorName) {
        regAuthorName(CK_LT, fRES(authorName));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * AUTHOR_NAME: {NotNull, VARCHAR(80)}
     * @param authorName The value of authorName as greaterEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setAuthorName_GreaterEqual(String authorName) {
        regAuthorName(CK_GE, fRES(authorName));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * AUTHOR_NAME: {NotNull, VARCHAR(80)}
     * @param authorName The value of authorName as lessEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setAuthorName_LessEqual(String authorName) {
        regAuthorName(CK_LE, fRES(authorName));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * AUTHOR_NAME: {NotNull, VARCHAR(80)}
     * @param authorNameList The collection of authorName as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setAuthorName_InScope(Collection<String> authorNameList) {
        doSetAuthorName_InScope(authorNameList);
    }

    public void doSetAuthorName_InScope(Collection<String> authorNameList) {
        regINS(CK_INS, cTL(authorNameList), getCValueAuthorName(), "AUTHOR_NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * AUTHOR_NAME: {NotNull, VARCHAR(80)}
     * @param authorNameList The collection of authorName as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setAuthorName_NotInScope(Collection<String> authorNameList) {
        doSetAuthorName_NotInScope(authorNameList);
    }

    public void doSetAuthorName_NotInScope(Collection<String> authorNameList) {
        regINS(CK_NINS, cTL(authorNameList), getCValueAuthorName(), "AUTHOR_NAME");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * AUTHOR_NAME: {NotNull, VARCHAR(80)}
     * @param authorName The value of authorName as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setAuthorName_PrefixSearch(String authorName) {
        setAuthorName_LikeSearch(authorName, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * AUTHOR_NAME: {NotNull, VARCHAR(80)} <br />
     * <pre>e.g. setAuthorName_LikeSearch("xxx", new <span style="color: #FD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param authorName The value of authorName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setAuthorName_LikeSearch(String authorName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(authorName), getCValueAuthorName(), "AUTHOR_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * AUTHOR_NAME: {NotNull, VARCHAR(80)}
     * @param authorName The value of authorName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setAuthorName_NotLikeSearch(String authorName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(authorName), getCValueAuthorName(), "AUTHOR_NAME", likeSearchOption);
    }

    protected void regAuthorName(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueAuthorName(), "AUTHOR_NAME"); }
    protected abstract ConditionValue getCValueAuthorName();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * AUTHOR_AGE: {SMALLINT(5)}
     * @param authorAge The value of authorAge as equal. (NullAllowed: if null, no condition)
     */
    public void setAuthorAge_Equal(Integer authorAge) {
        doSetAuthorAge_Equal(authorAge);
    }

    protected void doSetAuthorAge_Equal(Integer authorAge) {
        regAuthorAge(CK_EQ, authorAge);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * AUTHOR_AGE: {SMALLINT(5)}
     * @param authorAge The value of authorAge as notEqual. (NullAllowed: if null, no condition)
     */
    public void setAuthorAge_NotEqual(Integer authorAge) {
        doSetAuthorAge_NotEqual(authorAge);
    }

    protected void doSetAuthorAge_NotEqual(Integer authorAge) {
        regAuthorAge(CK_NES, authorAge);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * AUTHOR_AGE: {SMALLINT(5)}
     * @param authorAge The value of authorAge as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setAuthorAge_GreaterThan(Integer authorAge) {
        regAuthorAge(CK_GT, authorAge);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * AUTHOR_AGE: {SMALLINT(5)}
     * @param authorAge The value of authorAge as lessThan. (NullAllowed: if null, no condition)
     */
    public void setAuthorAge_LessThan(Integer authorAge) {
        regAuthorAge(CK_LT, authorAge);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * AUTHOR_AGE: {SMALLINT(5)}
     * @param authorAge The value of authorAge as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setAuthorAge_GreaterEqual(Integer authorAge) {
        regAuthorAge(CK_GE, authorAge);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * AUTHOR_AGE: {SMALLINT(5)}
     * @param authorAge The value of authorAge as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setAuthorAge_LessEqual(Integer authorAge) {
        regAuthorAge(CK_LE, authorAge);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * AUTHOR_AGE: {SMALLINT(5)}
     * @param minNumber The min number of authorAge. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of authorAge. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setAuthorAge_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueAuthorAge(), "AUTHOR_AGE", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * AUTHOR_AGE: {SMALLINT(5)}
     * @param authorAgeList The collection of authorAge as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setAuthorAge_InScope(Collection<Integer> authorAgeList) {
        doSetAuthorAge_InScope(authorAgeList);
    }

    protected void doSetAuthorAge_InScope(Collection<Integer> authorAgeList) {
        regINS(CK_INS, cTL(authorAgeList), getCValueAuthorAge(), "AUTHOR_AGE");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * AUTHOR_AGE: {SMALLINT(5)}
     * @param authorAgeList The collection of authorAge as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setAuthorAge_NotInScope(Collection<Integer> authorAgeList) {
        doSetAuthorAge_NotInScope(authorAgeList);
    }

    protected void doSetAuthorAge_NotInScope(Collection<Integer> authorAgeList) {
        regINS(CK_NINS, cTL(authorAgeList), getCValueAuthorAge(), "AUTHOR_AGE");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * AUTHOR_AGE: {SMALLINT(5)}
     */
    public void setAuthorAge_IsNull() { regAuthorAge(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * AUTHOR_AGE: {SMALLINT(5)}
     */
    public void setAuthorAge_IsNotNull() { regAuthorAge(CK_ISNN, DOBJ); }

    protected void regAuthorAge(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueAuthorAge(), "AUTHOR_AGE"); }
    protected abstract ConditionValue getCValueAuthorAge();

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
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_Equal()</span>.max(new SubQuery&lt;LdAuthorCB&gt;() {
     *     public void query(LdAuthorCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<LdAuthorCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ.getOperand(), LdAuthorCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;LdAuthorCB&gt;() {
     *     public void query(LdAuthorCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<LdAuthorCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES.getOperand(), LdAuthorCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;LdAuthorCB&gt;() {
     *     public void query(LdAuthorCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<LdAuthorCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT.getOperand(), LdAuthorCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessThan()</span>.max(new SubQuery&lt;LdAuthorCB&gt;() {
     *     public void query(LdAuthorCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<LdAuthorCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT.getOperand(), LdAuthorCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;LdAuthorCB&gt;() {
     *     public void query(LdAuthorCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<LdAuthorCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE.getOperand(), LdAuthorCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;LdAuthorCB&gt;() {
     *     public void query(LdAuthorCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<LdAuthorCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE.getOperand(), LdAuthorCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSSQOption<CB> op) {
        assertObjectNotNull("subQuery", sq);
        LdAuthorCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        op.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, op);
    }
    public abstract String keepScalarCondition(LdAuthorCQ sq);

    protected LdAuthorCB xcreateScalarConditionCB() {
        LdAuthorCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected LdAuthorCB xcreateScalarConditionPartitionByCB() {
        LdAuthorCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<LdAuthorCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        LdAuthorCB cb = new LdAuthorCB(); cb.xsetupForDerivedReferrer(this); sq.query(cb);
        String pk = "AUTHOR_ID";
        String pp = keepSpecifyMyselfDerived(cb.query()); // for saving query-value.
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(LdAuthorCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (SubQuery).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<LdAuthorCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(LdAuthorCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        LdAuthorCB cb = new LdAuthorCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "AUTHOR_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(LdAuthorCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfExists(SubQuery<LdAuthorCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        LdAuthorCB cb = new LdAuthorCB(); cb.xsetupForMyselfExists(this); subQuery.query(cb);
        String pp = keepMyselfExists(cb.query()); // for saving query-value.
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(LdAuthorCQ sq);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfInScope(SubQuery<LdAuthorCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        LdAuthorCB cb = new LdAuthorCB(); cb.xsetupForMyselfInScope(this); subQuery.query(cb);
        String pp = keepMyselfInScope(cb.query()); // for saving query-value.
        registerMyselfInScope(cb.query(), pp);
    }
    public abstract String keepMyselfInScope(LdAuthorCQ sq);

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    protected LdAuthorCB newMyCB() {
        return new LdAuthorCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabCQ() { return LdAuthorCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
