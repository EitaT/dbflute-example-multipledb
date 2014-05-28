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
 * The abstract condition-query of BOOK.
 * @author DBFlute(AutoGenerator)
 */
public abstract class LdAbstractBsBookCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public LdAbstractBsBookCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "BOOK";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * BOOK_ID: {PK, ID, NotNull, INTEGER(10)}
     * @param bookId The value of bookId as equal. (NullAllowed: if null, no condition)
     */
    public void setBookId_Equal(Integer bookId) {
        doSetBookId_Equal(bookId);
    }

    protected void doSetBookId_Equal(Integer bookId) {
        regBookId(CK_EQ, bookId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * BOOK_ID: {PK, ID, NotNull, INTEGER(10)}
     * @param bookId The value of bookId as notEqual. (NullAllowed: if null, no condition)
     */
    public void setBookId_NotEqual(Integer bookId) {
        doSetBookId_NotEqual(bookId);
    }

    protected void doSetBookId_NotEqual(Integer bookId) {
        regBookId(CK_NES, bookId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * BOOK_ID: {PK, ID, NotNull, INTEGER(10)}
     * @param bookId The value of bookId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setBookId_GreaterThan(Integer bookId) {
        regBookId(CK_GT, bookId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * BOOK_ID: {PK, ID, NotNull, INTEGER(10)}
     * @param bookId The value of bookId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setBookId_LessThan(Integer bookId) {
        regBookId(CK_LT, bookId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * BOOK_ID: {PK, ID, NotNull, INTEGER(10)}
     * @param bookId The value of bookId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setBookId_GreaterEqual(Integer bookId) {
        regBookId(CK_GE, bookId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * BOOK_ID: {PK, ID, NotNull, INTEGER(10)}
     * @param bookId The value of bookId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setBookId_LessEqual(Integer bookId) {
        regBookId(CK_LE, bookId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * BOOK_ID: {PK, ID, NotNull, INTEGER(10)}
     * @param minNumber The min number of bookId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of bookId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setBookId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueBookId(), "BOOK_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * BOOK_ID: {PK, ID, NotNull, INTEGER(10)}
     * @param bookIdList The collection of bookId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setBookId_InScope(Collection<Integer> bookIdList) {
        doSetBookId_InScope(bookIdList);
    }

    protected void doSetBookId_InScope(Collection<Integer> bookIdList) {
        regINS(CK_INS, cTL(bookIdList), getCValueBookId(), "BOOK_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * BOOK_ID: {PK, ID, NotNull, INTEGER(10)}
     * @param bookIdList The collection of bookId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setBookId_NotInScope(Collection<Integer> bookIdList) {
        doSetBookId_NotInScope(bookIdList);
    }

    protected void doSetBookId_NotInScope(Collection<Integer> bookIdList) {
        regINS(CK_NINS, cTL(bookIdList), getCValueBookId(), "BOOK_ID");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br />
     * {exists (select BOOK_ID from COLLECTION where ...)} <br />
     * COLLECTION by BOOK_ID, named 'collectionAsOne'.
     * <pre>
     * cb.query().<span style="color: #DD4747">existsCollectionList</span>(new SubQuery&lt;LdCollectionCB&gt;() {
     *     public void query(LdCollectionCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of CollectionList for 'exists'. (NotNull)
     */
    public void existsCollectionList(SubQuery<LdCollectionCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        LdCollectionCB cb = new LdCollectionCB(); cb.xsetupForExistsReferrer(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepBookId_ExistsReferrer_CollectionList(cb.query());
        registerExistsReferrer(cb.query(), "BOOK_ID", "BOOK_ID", pp, "collectionList");
    }
    public abstract String keepBookId_ExistsReferrer_CollectionList(LdCollectionCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br />
     * {not exists (select BOOK_ID from COLLECTION where ...)} <br />
     * COLLECTION by BOOK_ID, named 'collectionAsOne'.
     * <pre>
     * cb.query().<span style="color: #DD4747">notExistsCollectionList</span>(new SubQuery&lt;LdCollectionCB&gt;() {
     *     public void query(LdCollectionCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of BookId_NotExistsReferrer_CollectionList for 'not exists'. (NotNull)
     */
    public void notExistsCollectionList(SubQuery<LdCollectionCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        LdCollectionCB cb = new LdCollectionCB(); cb.xsetupForExistsReferrer(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepBookId_NotExistsReferrer_CollectionList(cb.query());
        registerNotExistsReferrer(cb.query(), "BOOK_ID", "BOOK_ID", pp, "collectionList");
    }
    public abstract String keepBookId_NotExistsReferrer_CollectionList(LdCollectionCQ sq);

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select BOOK_ID from COLLECTION where ...)} <br />
     * COLLECTION by BOOK_ID, named 'collectionAsOne'.
     * @param subQuery The sub-query of CollectionList for 'in-scope'. (NotNull)
     */
    public void inScopeCollectionList(SubQuery<LdCollectionCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        LdCollectionCB cb = new LdCollectionCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepBookId_InScopeRelation_CollectionList(cb.query());
        registerInScopeRelation(cb.query(), "BOOK_ID", "BOOK_ID", pp, "collectionList");
    }
    public abstract String keepBookId_InScopeRelation_CollectionList(LdCollectionCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select BOOK_ID from COLLECTION where ...)} <br />
     * COLLECTION by BOOK_ID, named 'collectionAsOne'.
     * @param subQuery The sub-query of CollectionList for 'not in-scope'. (NotNull)
     */
    public void notInScopeCollectionList(SubQuery<LdCollectionCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        LdCollectionCB cb = new LdCollectionCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepBookId_NotInScopeRelation_CollectionList(cb.query());
        registerNotInScopeRelation(cb.query(), "BOOK_ID", "BOOK_ID", pp, "collectionList");
    }
    public abstract String keepBookId_NotInScopeRelation_CollectionList(LdCollectionCQ sq);

    public void xsderiveCollectionList(String fn, SubQuery<LdCollectionCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        LdCollectionCB cb = new LdCollectionCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        String pp = keepBookId_SpecifyDerivedReferrer_CollectionList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "BOOK_ID", "BOOK_ID", pp, "collectionList", al, op);
    }
    public abstract String keepBookId_SpecifyDerivedReferrer_CollectionList(LdCollectionCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br />
     * {FOO &lt;= (select max(BAR) from COLLECTION where ...)} <br />
     * COLLECTION by BOOK_ID, named 'collectionAsOne'.
     * <pre>
     * cb.query().<span style="color: #DD4747">derivedCollectionList()</span>.<span style="color: #DD4747">max</span>(new SubQuery&lt;LdCollectionCB&gt;() {
     *     public void query(LdCollectionCB subCB) {
     *         subCB.specify().<span style="color: #DD4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *         subCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     *     }
     * }).<span style="color: #DD4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<LdCollectionCB> derivedCollectionList() {
        return xcreateQDRFunctionCollectionList();
    }
    protected HpQDRFunction<LdCollectionCB> xcreateQDRFunctionCollectionList() {
        return new HpQDRFunction<LdCollectionCB>(new HpQDRSetupper<LdCollectionCB>() {
            public void setup(String fn, SubQuery<LdCollectionCB> sq, String rd, Object vl, DerivedReferrerOption op) {
                xqderiveCollectionList(fn, sq, rd, vl, op);
            }
        });
    }
    public void xqderiveCollectionList(String fn, SubQuery<LdCollectionCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        LdCollectionCB cb = new LdCollectionCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        String sqpp = keepBookId_QueryDerivedReferrer_CollectionList(cb.query()); String prpp = keepBookId_QueryDerivedReferrer_CollectionListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "BOOK_ID", "BOOK_ID", sqpp, "collectionList", rd, vl, prpp, op);
    }
    public abstract String keepBookId_QueryDerivedReferrer_CollectionList(LdCollectionCQ sq);
    public abstract String keepBookId_QueryDerivedReferrer_CollectionListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * BOOK_ID: {PK, ID, NotNull, INTEGER(10)}
     */
    public void setBookId_IsNull() { regBookId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * BOOK_ID: {PK, ID, NotNull, INTEGER(10)}
     */
    public void setBookId_IsNotNull() { regBookId(CK_ISNN, DOBJ); }

    protected void regBookId(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueBookId(), "BOOK_ID"); }
    protected abstract ConditionValue getCValueBookId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * ISBN: {UQ, NotNull, VARCHAR(20)}
     * @param isbn The value of isbn as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setIsbn_Equal(String isbn) {
        doSetIsbn_Equal(fRES(isbn));
    }

    protected void doSetIsbn_Equal(String isbn) {
        regIsbn(CK_EQ, isbn);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * ISBN: {UQ, NotNull, VARCHAR(20)}
     * @param isbn The value of isbn as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setIsbn_NotEqual(String isbn) {
        doSetIsbn_NotEqual(fRES(isbn));
    }

    protected void doSetIsbn_NotEqual(String isbn) {
        regIsbn(CK_NES, isbn);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * ISBN: {UQ, NotNull, VARCHAR(20)}
     * @param isbn The value of isbn as greaterThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setIsbn_GreaterThan(String isbn) {
        regIsbn(CK_GT, fRES(isbn));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * ISBN: {UQ, NotNull, VARCHAR(20)}
     * @param isbn The value of isbn as lessThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setIsbn_LessThan(String isbn) {
        regIsbn(CK_LT, fRES(isbn));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * ISBN: {UQ, NotNull, VARCHAR(20)}
     * @param isbn The value of isbn as greaterEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setIsbn_GreaterEqual(String isbn) {
        regIsbn(CK_GE, fRES(isbn));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * ISBN: {UQ, NotNull, VARCHAR(20)}
     * @param isbn The value of isbn as lessEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setIsbn_LessEqual(String isbn) {
        regIsbn(CK_LE, fRES(isbn));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * ISBN: {UQ, NotNull, VARCHAR(20)}
     * @param isbnList The collection of isbn as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setIsbn_InScope(Collection<String> isbnList) {
        doSetIsbn_InScope(isbnList);
    }

    public void doSetIsbn_InScope(Collection<String> isbnList) {
        regINS(CK_INS, cTL(isbnList), getCValueIsbn(), "ISBN");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * ISBN: {UQ, NotNull, VARCHAR(20)}
     * @param isbnList The collection of isbn as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setIsbn_NotInScope(Collection<String> isbnList) {
        doSetIsbn_NotInScope(isbnList);
    }

    public void doSetIsbn_NotInScope(Collection<String> isbnList) {
        regINS(CK_NINS, cTL(isbnList), getCValueIsbn(), "ISBN");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * ISBN: {UQ, NotNull, VARCHAR(20)}
     * @param isbn The value of isbn as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setIsbn_PrefixSearch(String isbn) {
        setIsbn_LikeSearch(isbn, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * ISBN: {UQ, NotNull, VARCHAR(20)} <br />
     * <pre>e.g. setIsbn_LikeSearch("xxx", new <span style="color: #DD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param isbn The value of isbn as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setIsbn_LikeSearch(String isbn, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(isbn), getCValueIsbn(), "ISBN", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * ISBN: {UQ, NotNull, VARCHAR(20)}
     * @param isbn The value of isbn as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setIsbn_NotLikeSearch(String isbn, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(isbn), getCValueIsbn(), "ISBN", likeSearchOption);
    }

    protected void regIsbn(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueIsbn(), "ISBN"); }
    protected abstract ConditionValue getCValueIsbn();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * BOOK_NAME: {NotNull, VARCHAR(80)}
     * @param bookName The value of bookName as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setBookName_Equal(String bookName) {
        doSetBookName_Equal(fRES(bookName));
    }

    protected void doSetBookName_Equal(String bookName) {
        regBookName(CK_EQ, bookName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * BOOK_NAME: {NotNull, VARCHAR(80)}
     * @param bookName The value of bookName as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setBookName_NotEqual(String bookName) {
        doSetBookName_NotEqual(fRES(bookName));
    }

    protected void doSetBookName_NotEqual(String bookName) {
        regBookName(CK_NES, bookName);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * BOOK_NAME: {NotNull, VARCHAR(80)}
     * @param bookName The value of bookName as greaterThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setBookName_GreaterThan(String bookName) {
        regBookName(CK_GT, fRES(bookName));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * BOOK_NAME: {NotNull, VARCHAR(80)}
     * @param bookName The value of bookName as lessThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setBookName_LessThan(String bookName) {
        regBookName(CK_LT, fRES(bookName));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * BOOK_NAME: {NotNull, VARCHAR(80)}
     * @param bookName The value of bookName as greaterEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setBookName_GreaterEqual(String bookName) {
        regBookName(CK_GE, fRES(bookName));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * BOOK_NAME: {NotNull, VARCHAR(80)}
     * @param bookName The value of bookName as lessEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setBookName_LessEqual(String bookName) {
        regBookName(CK_LE, fRES(bookName));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * BOOK_NAME: {NotNull, VARCHAR(80)}
     * @param bookNameList The collection of bookName as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setBookName_InScope(Collection<String> bookNameList) {
        doSetBookName_InScope(bookNameList);
    }

    public void doSetBookName_InScope(Collection<String> bookNameList) {
        regINS(CK_INS, cTL(bookNameList), getCValueBookName(), "BOOK_NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * BOOK_NAME: {NotNull, VARCHAR(80)}
     * @param bookNameList The collection of bookName as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setBookName_NotInScope(Collection<String> bookNameList) {
        doSetBookName_NotInScope(bookNameList);
    }

    public void doSetBookName_NotInScope(Collection<String> bookNameList) {
        regINS(CK_NINS, cTL(bookNameList), getCValueBookName(), "BOOK_NAME");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * BOOK_NAME: {NotNull, VARCHAR(80)}
     * @param bookName The value of bookName as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setBookName_PrefixSearch(String bookName) {
        setBookName_LikeSearch(bookName, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * BOOK_NAME: {NotNull, VARCHAR(80)} <br />
     * <pre>e.g. setBookName_LikeSearch("xxx", new <span style="color: #DD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param bookName The value of bookName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setBookName_LikeSearch(String bookName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(bookName), getCValueBookName(), "BOOK_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * BOOK_NAME: {NotNull, VARCHAR(80)}
     * @param bookName The value of bookName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setBookName_NotLikeSearch(String bookName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(bookName), getCValueBookName(), "BOOK_NAME", likeSearchOption);
    }

    protected void regBookName(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueBookName(), "BOOK_NAME"); }
    protected abstract ConditionValue getCValueBookName();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * AUTHOR_ID: {IX, NotNull, INTEGER(10), FK to AUTHOR}
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
     * AUTHOR_ID: {IX, NotNull, INTEGER(10), FK to AUTHOR}
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
     * AUTHOR_ID: {IX, NotNull, INTEGER(10), FK to AUTHOR}
     * @param authorId The value of authorId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setAuthorId_GreaterThan(Integer authorId) {
        regAuthorId(CK_GT, authorId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * AUTHOR_ID: {IX, NotNull, INTEGER(10), FK to AUTHOR}
     * @param authorId The value of authorId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setAuthorId_LessThan(Integer authorId) {
        regAuthorId(CK_LT, authorId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * AUTHOR_ID: {IX, NotNull, INTEGER(10), FK to AUTHOR}
     * @param authorId The value of authorId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setAuthorId_GreaterEqual(Integer authorId) {
        regAuthorId(CK_GE, authorId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * AUTHOR_ID: {IX, NotNull, INTEGER(10), FK to AUTHOR}
     * @param authorId The value of authorId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setAuthorId_LessEqual(Integer authorId) {
        regAuthorId(CK_LE, authorId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * AUTHOR_ID: {IX, NotNull, INTEGER(10), FK to AUTHOR}
     * @param minNumber The min number of authorId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of authorId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setAuthorId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueAuthorId(), "AUTHOR_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * AUTHOR_ID: {IX, NotNull, INTEGER(10), FK to AUTHOR}
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
     * AUTHOR_ID: {IX, NotNull, INTEGER(10), FK to AUTHOR}
     * @param authorIdList The collection of authorId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setAuthorId_NotInScope(Collection<Integer> authorIdList) {
        doSetAuthorId_NotInScope(authorIdList);
    }

    protected void doSetAuthorId_NotInScope(Collection<Integer> authorIdList) {
        regINS(CK_NINS, cTL(authorIdList), getCValueAuthorId(), "AUTHOR_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select AUTHOR_ID from AUTHOR where ...)} <br />
     * AUTHOR by my AUTHOR_ID, named 'author'.
     * @param subQuery The sub-query of Author for 'in-scope'. (NotNull)
     */
    public void inScopeAuthor(SubQuery<LdAuthorCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        LdAuthorCB cb = new LdAuthorCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepAuthorId_InScopeRelation_Author(cb.query());
        registerInScopeRelation(cb.query(), "AUTHOR_ID", "AUTHOR_ID", pp, "author");
    }
    public abstract String keepAuthorId_InScopeRelation_Author(LdAuthorCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select AUTHOR_ID from AUTHOR where ...)} <br />
     * AUTHOR by my AUTHOR_ID, named 'author'.
     * @param subQuery The sub-query of Author for 'not in-scope'. (NotNull)
     */
    public void notInScopeAuthor(SubQuery<LdAuthorCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        LdAuthorCB cb = new LdAuthorCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepAuthorId_NotInScopeRelation_Author(cb.query());
        registerNotInScopeRelation(cb.query(), "AUTHOR_ID", "AUTHOR_ID", pp, "author");
    }
    public abstract String keepAuthorId_NotInScopeRelation_Author(LdAuthorCQ sq);

    protected void regAuthorId(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueAuthorId(), "AUTHOR_ID"); }
    protected abstract ConditionValue getCValueAuthorId();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * PUBLISHER_ID: {IX, NotNull, INTEGER(10), FK to PUBLISHER}
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
     * PUBLISHER_ID: {IX, NotNull, INTEGER(10), FK to PUBLISHER}
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
     * PUBLISHER_ID: {IX, NotNull, INTEGER(10), FK to PUBLISHER}
     * @param publisherId The value of publisherId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setPublisherId_GreaterThan(Integer publisherId) {
        regPublisherId(CK_GT, publisherId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * PUBLISHER_ID: {IX, NotNull, INTEGER(10), FK to PUBLISHER}
     * @param publisherId The value of publisherId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setPublisherId_LessThan(Integer publisherId) {
        regPublisherId(CK_LT, publisherId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * PUBLISHER_ID: {IX, NotNull, INTEGER(10), FK to PUBLISHER}
     * @param publisherId The value of publisherId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setPublisherId_GreaterEqual(Integer publisherId) {
        regPublisherId(CK_GE, publisherId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * PUBLISHER_ID: {IX, NotNull, INTEGER(10), FK to PUBLISHER}
     * @param publisherId The value of publisherId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setPublisherId_LessEqual(Integer publisherId) {
        regPublisherId(CK_LE, publisherId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * PUBLISHER_ID: {IX, NotNull, INTEGER(10), FK to PUBLISHER}
     * @param minNumber The min number of publisherId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of publisherId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPublisherId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValuePublisherId(), "PUBLISHER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * PUBLISHER_ID: {IX, NotNull, INTEGER(10), FK to PUBLISHER}
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
     * PUBLISHER_ID: {IX, NotNull, INTEGER(10), FK to PUBLISHER}
     * @param publisherIdList The collection of publisherId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setPublisherId_NotInScope(Collection<Integer> publisherIdList) {
        doSetPublisherId_NotInScope(publisherIdList);
    }

    protected void doSetPublisherId_NotInScope(Collection<Integer> publisherIdList) {
        regINS(CK_NINS, cTL(publisherIdList), getCValuePublisherId(), "PUBLISHER_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select PUBLISHER_ID from PUBLISHER where ...)} <br />
     * PUBLISHER by my PUBLISHER_ID, named 'publisher'.
     * @param subQuery The sub-query of Publisher for 'in-scope'. (NotNull)
     */
    public void inScopePublisher(SubQuery<LdPublisherCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        LdPublisherCB cb = new LdPublisherCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepPublisherId_InScopeRelation_Publisher(cb.query());
        registerInScopeRelation(cb.query(), "PUBLISHER_ID", "PUBLISHER_ID", pp, "publisher");
    }
    public abstract String keepPublisherId_InScopeRelation_Publisher(LdPublisherCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select PUBLISHER_ID from PUBLISHER where ...)} <br />
     * PUBLISHER by my PUBLISHER_ID, named 'publisher'.
     * @param subQuery The sub-query of Publisher for 'not in-scope'. (NotNull)
     */
    public void notInScopePublisher(SubQuery<LdPublisherCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        LdPublisherCB cb = new LdPublisherCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepPublisherId_NotInScopeRelation_Publisher(cb.query());
        registerNotInScopeRelation(cb.query(), "PUBLISHER_ID", "PUBLISHER_ID", pp, "publisher");
    }
    public abstract String keepPublisherId_NotInScopeRelation_Publisher(LdPublisherCQ sq);

    protected void regPublisherId(ConditionKey ky, Object vl) { regQ(ky, vl, getCValuePublisherId(), "PUBLISHER_ID"); }
    protected abstract ConditionValue getCValuePublisherId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * GENRE_CODE: {IX, VARCHAR(24), FK to GENRE}
     * @param genreCode The value of genreCode as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setGenreCode_Equal(String genreCode) {
        doSetGenreCode_Equal(fRES(genreCode));
    }

    protected void doSetGenreCode_Equal(String genreCode) {
        regGenreCode(CK_EQ, genreCode);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * GENRE_CODE: {IX, VARCHAR(24), FK to GENRE}
     * @param genreCode The value of genreCode as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setGenreCode_NotEqual(String genreCode) {
        doSetGenreCode_NotEqual(fRES(genreCode));
    }

    protected void doSetGenreCode_NotEqual(String genreCode) {
        regGenreCode(CK_NES, genreCode);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * GENRE_CODE: {IX, VARCHAR(24), FK to GENRE}
     * @param genreCode The value of genreCode as greaterThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setGenreCode_GreaterThan(String genreCode) {
        regGenreCode(CK_GT, fRES(genreCode));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * GENRE_CODE: {IX, VARCHAR(24), FK to GENRE}
     * @param genreCode The value of genreCode as lessThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setGenreCode_LessThan(String genreCode) {
        regGenreCode(CK_LT, fRES(genreCode));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * GENRE_CODE: {IX, VARCHAR(24), FK to GENRE}
     * @param genreCode The value of genreCode as greaterEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setGenreCode_GreaterEqual(String genreCode) {
        regGenreCode(CK_GE, fRES(genreCode));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * GENRE_CODE: {IX, VARCHAR(24), FK to GENRE}
     * @param genreCode The value of genreCode as lessEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setGenreCode_LessEqual(String genreCode) {
        regGenreCode(CK_LE, fRES(genreCode));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * GENRE_CODE: {IX, VARCHAR(24), FK to GENRE}
     * @param genreCodeList The collection of genreCode as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setGenreCode_InScope(Collection<String> genreCodeList) {
        doSetGenreCode_InScope(genreCodeList);
    }

    public void doSetGenreCode_InScope(Collection<String> genreCodeList) {
        regINS(CK_INS, cTL(genreCodeList), getCValueGenreCode(), "GENRE_CODE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * GENRE_CODE: {IX, VARCHAR(24), FK to GENRE}
     * @param genreCodeList The collection of genreCode as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setGenreCode_NotInScope(Collection<String> genreCodeList) {
        doSetGenreCode_NotInScope(genreCodeList);
    }

    public void doSetGenreCode_NotInScope(Collection<String> genreCodeList) {
        regINS(CK_NINS, cTL(genreCodeList), getCValueGenreCode(), "GENRE_CODE");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * GENRE_CODE: {IX, VARCHAR(24), FK to GENRE}
     * @param genreCode The value of genreCode as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setGenreCode_PrefixSearch(String genreCode) {
        setGenreCode_LikeSearch(genreCode, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * GENRE_CODE: {IX, VARCHAR(24), FK to GENRE} <br />
     * <pre>e.g. setGenreCode_LikeSearch("xxx", new <span style="color: #DD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param genreCode The value of genreCode as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setGenreCode_LikeSearch(String genreCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(genreCode), getCValueGenreCode(), "GENRE_CODE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * GENRE_CODE: {IX, VARCHAR(24), FK to GENRE}
     * @param genreCode The value of genreCode as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setGenreCode_NotLikeSearch(String genreCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(genreCode), getCValueGenreCode(), "GENRE_CODE", likeSearchOption);
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select GENRE_CODE from GENRE where ...)} <br />
     * GENRE by my GENRE_CODE, named 'genre'.
     * @param subQuery The sub-query of Genre for 'in-scope'. (NotNull)
     */
    public void inScopeGenre(SubQuery<LdGenreCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        LdGenreCB cb = new LdGenreCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepGenreCode_InScopeRelation_Genre(cb.query());
        registerInScopeRelation(cb.query(), "GENRE_CODE", "GENRE_CODE", pp, "genre");
    }
    public abstract String keepGenreCode_InScopeRelation_Genre(LdGenreCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select GENRE_CODE from GENRE where ...)} <br />
     * GENRE by my GENRE_CODE, named 'genre'.
     * @param subQuery The sub-query of Genre for 'not in-scope'. (NotNull)
     */
    public void notInScopeGenre(SubQuery<LdGenreCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        LdGenreCB cb = new LdGenreCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepGenreCode_NotInScopeRelation_Genre(cb.query());
        registerNotInScopeRelation(cb.query(), "GENRE_CODE", "GENRE_CODE", pp, "genre");
    }
    public abstract String keepGenreCode_NotInScopeRelation_Genre(LdGenreCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * GENRE_CODE: {IX, VARCHAR(24), FK to GENRE}
     */
    public void setGenreCode_IsNull() { regGenreCode(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br />
     * GENRE_CODE: {IX, VARCHAR(24), FK to GENRE}
     */
    public void setGenreCode_IsNullOrEmpty() { regGenreCode(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * GENRE_CODE: {IX, VARCHAR(24), FK to GENRE}
     */
    public void setGenreCode_IsNotNull() { regGenreCode(CK_ISNN, DOBJ); }

    protected void regGenreCode(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueGenreCode(), "GENRE_CODE"); }
    protected abstract ConditionValue getCValueGenreCode();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * OPENING_PART: {CLOB(2147483647)}
     * @param openingPart The value of openingPart as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setOpeningPart_Equal(String openingPart) {
        doSetOpeningPart_Equal(fRES(openingPart));
    }

    protected void doSetOpeningPart_Equal(String openingPart) {
        regOpeningPart(CK_EQ, openingPart);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * OPENING_PART: {CLOB(2147483647)}
     * @param openingPart The value of openingPart as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setOpeningPart_NotEqual(String openingPart) {
        doSetOpeningPart_NotEqual(fRES(openingPart));
    }

    protected void doSetOpeningPart_NotEqual(String openingPart) {
        regOpeningPart(CK_NES, openingPart);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * OPENING_PART: {CLOB(2147483647)}
     * @param openingPart The value of openingPart as greaterThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setOpeningPart_GreaterThan(String openingPart) {
        regOpeningPart(CK_GT, fRES(openingPart));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * OPENING_PART: {CLOB(2147483647)}
     * @param openingPart The value of openingPart as lessThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setOpeningPart_LessThan(String openingPart) {
        regOpeningPart(CK_LT, fRES(openingPart));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * OPENING_PART: {CLOB(2147483647)}
     * @param openingPart The value of openingPart as greaterEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setOpeningPart_GreaterEqual(String openingPart) {
        regOpeningPart(CK_GE, fRES(openingPart));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * OPENING_PART: {CLOB(2147483647)}
     * @param openingPart The value of openingPart as lessEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setOpeningPart_LessEqual(String openingPart) {
        regOpeningPart(CK_LE, fRES(openingPart));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * OPENING_PART: {CLOB(2147483647)}
     * @param openingPartList The collection of openingPart as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setOpeningPart_InScope(Collection<String> openingPartList) {
        doSetOpeningPart_InScope(openingPartList);
    }

    public void doSetOpeningPart_InScope(Collection<String> openingPartList) {
        regINS(CK_INS, cTL(openingPartList), getCValueOpeningPart(), "OPENING_PART");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * OPENING_PART: {CLOB(2147483647)}
     * @param openingPartList The collection of openingPart as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setOpeningPart_NotInScope(Collection<String> openingPartList) {
        doSetOpeningPart_NotInScope(openingPartList);
    }

    public void doSetOpeningPart_NotInScope(Collection<String> openingPartList) {
        regINS(CK_NINS, cTL(openingPartList), getCValueOpeningPart(), "OPENING_PART");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * OPENING_PART: {CLOB(2147483647)}
     * @param openingPart The value of openingPart as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setOpeningPart_PrefixSearch(String openingPart) {
        setOpeningPart_LikeSearch(openingPart, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * OPENING_PART: {CLOB(2147483647)} <br />
     * <pre>e.g. setOpeningPart_LikeSearch("xxx", new <span style="color: #DD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param openingPart The value of openingPart as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOpeningPart_LikeSearch(String openingPart, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(openingPart), getCValueOpeningPart(), "OPENING_PART", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * OPENING_PART: {CLOB(2147483647)}
     * @param openingPart The value of openingPart as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOpeningPart_NotLikeSearch(String openingPart, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(openingPart), getCValueOpeningPart(), "OPENING_PART", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * OPENING_PART: {CLOB(2147483647)}
     */
    public void setOpeningPart_IsNull() { regOpeningPart(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * OPENING_PART: {CLOB(2147483647)}
     */
    public void setOpeningPart_IsNotNull() { regOpeningPart(CK_ISNN, DOBJ); }

    protected void regOpeningPart(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueOpeningPart(), "OPENING_PART"); }
    protected abstract ConditionValue getCValueOpeningPart();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * MAX_LENDING_DATE_COUNT: {NotNull, SMALLINT(5)}
     * @param maxLendingDateCount The value of maxLendingDateCount as equal. (NullAllowed: if null, no condition)
     */
    public void setMaxLendingDateCount_Equal(Integer maxLendingDateCount) {
        doSetMaxLendingDateCount_Equal(maxLendingDateCount);
    }

    protected void doSetMaxLendingDateCount_Equal(Integer maxLendingDateCount) {
        regMaxLendingDateCount(CK_EQ, maxLendingDateCount);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * MAX_LENDING_DATE_COUNT: {NotNull, SMALLINT(5)}
     * @param maxLendingDateCount The value of maxLendingDateCount as notEqual. (NullAllowed: if null, no condition)
     */
    public void setMaxLendingDateCount_NotEqual(Integer maxLendingDateCount) {
        doSetMaxLendingDateCount_NotEqual(maxLendingDateCount);
    }

    protected void doSetMaxLendingDateCount_NotEqual(Integer maxLendingDateCount) {
        regMaxLendingDateCount(CK_NES, maxLendingDateCount);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * MAX_LENDING_DATE_COUNT: {NotNull, SMALLINT(5)}
     * @param maxLendingDateCount The value of maxLendingDateCount as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setMaxLendingDateCount_GreaterThan(Integer maxLendingDateCount) {
        regMaxLendingDateCount(CK_GT, maxLendingDateCount);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * MAX_LENDING_DATE_COUNT: {NotNull, SMALLINT(5)}
     * @param maxLendingDateCount The value of maxLendingDateCount as lessThan. (NullAllowed: if null, no condition)
     */
    public void setMaxLendingDateCount_LessThan(Integer maxLendingDateCount) {
        regMaxLendingDateCount(CK_LT, maxLendingDateCount);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * MAX_LENDING_DATE_COUNT: {NotNull, SMALLINT(5)}
     * @param maxLendingDateCount The value of maxLendingDateCount as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setMaxLendingDateCount_GreaterEqual(Integer maxLendingDateCount) {
        regMaxLendingDateCount(CK_GE, maxLendingDateCount);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * MAX_LENDING_DATE_COUNT: {NotNull, SMALLINT(5)}
     * @param maxLendingDateCount The value of maxLendingDateCount as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setMaxLendingDateCount_LessEqual(Integer maxLendingDateCount) {
        regMaxLendingDateCount(CK_LE, maxLendingDateCount);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * MAX_LENDING_DATE_COUNT: {NotNull, SMALLINT(5)}
     * @param minNumber The min number of maxLendingDateCount. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of maxLendingDateCount. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setMaxLendingDateCount_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueMaxLendingDateCount(), "MAX_LENDING_DATE_COUNT", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * MAX_LENDING_DATE_COUNT: {NotNull, SMALLINT(5)}
     * @param maxLendingDateCountList The collection of maxLendingDateCount as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMaxLendingDateCount_InScope(Collection<Integer> maxLendingDateCountList) {
        doSetMaxLendingDateCount_InScope(maxLendingDateCountList);
    }

    protected void doSetMaxLendingDateCount_InScope(Collection<Integer> maxLendingDateCountList) {
        regINS(CK_INS, cTL(maxLendingDateCountList), getCValueMaxLendingDateCount(), "MAX_LENDING_DATE_COUNT");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * MAX_LENDING_DATE_COUNT: {NotNull, SMALLINT(5)}
     * @param maxLendingDateCountList The collection of maxLendingDateCount as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMaxLendingDateCount_NotInScope(Collection<Integer> maxLendingDateCountList) {
        doSetMaxLendingDateCount_NotInScope(maxLendingDateCountList);
    }

    protected void doSetMaxLendingDateCount_NotInScope(Collection<Integer> maxLendingDateCountList) {
        regINS(CK_NINS, cTL(maxLendingDateCountList), getCValueMaxLendingDateCount(), "MAX_LENDING_DATE_COUNT");
    }

    protected void regMaxLendingDateCount(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueMaxLendingDateCount(), "MAX_LENDING_DATE_COUNT"); }
    protected abstract ConditionValue getCValueMaxLendingDateCount();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * OUT_OF_USER_SELECT_YN: {NotNull, CHAR(1), classification=YesNo}
     * @param outOfUserSelectYn The value of outOfUserSelectYn as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setOutOfUserSelectYn_Equal(String outOfUserSelectYn) {
        doSetOutOfUserSelectYn_Equal(fRES(outOfUserSelectYn));
    }

    /**
     * Equal(=). As YesNo. And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * OUT_OF_USER_SELECT_YN: {NotNull, CHAR(1), classification=YesNo} <br />
     * はいいいえを示す
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, no condition)
     */
    public void setOutOfUserSelectYn_Equal_AsYesNo(LdCDef.YesNo cdef) {
        doSetOutOfUserSelectYn_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As y (y). And OnlyOnceRegistered. <br />
     * y
     */
    public void setOutOfUserSelectYn_Equal_y() {
        setOutOfUserSelectYn_Equal_AsYesNo(LdCDef.YesNo.y);
    }

    /**
     * Equal(=). As n (n). And OnlyOnceRegistered. <br />
     * n
     */
    public void setOutOfUserSelectYn_Equal_n() {
        setOutOfUserSelectYn_Equal_AsYesNo(LdCDef.YesNo.n);
    }

    protected void doSetOutOfUserSelectYn_Equal(String outOfUserSelectYn) {
        regOutOfUserSelectYn(CK_EQ, outOfUserSelectYn);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * OUT_OF_USER_SELECT_YN: {NotNull, CHAR(1), classification=YesNo}
     * @param outOfUserSelectYn The value of outOfUserSelectYn as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setOutOfUserSelectYn_NotEqual(String outOfUserSelectYn) {
        doSetOutOfUserSelectYn_NotEqual(fRES(outOfUserSelectYn));
    }

    /**
     * NotEqual(&lt;&gt;). As YesNo. And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * OUT_OF_USER_SELECT_YN: {NotNull, CHAR(1), classification=YesNo} <br />
     * はいいいえを示す
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, no condition)
     */
    public void setOutOfUserSelectYn_NotEqual_AsYesNo(LdCDef.YesNo cdef) {
        doSetOutOfUserSelectYn_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As y (y). And OnlyOnceRegistered. <br />
     * y
     */
    public void setOutOfUserSelectYn_NotEqual_y() {
        setOutOfUserSelectYn_NotEqual_AsYesNo(LdCDef.YesNo.y);
    }

    /**
     * NotEqual(&lt;&gt;). As n (n). And OnlyOnceRegistered. <br />
     * n
     */
    public void setOutOfUserSelectYn_NotEqual_n() {
        setOutOfUserSelectYn_NotEqual_AsYesNo(LdCDef.YesNo.n);
    }

    protected void doSetOutOfUserSelectYn_NotEqual(String outOfUserSelectYn) {
        regOutOfUserSelectYn(CK_NES, outOfUserSelectYn);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * OUT_OF_USER_SELECT_YN: {NotNull, CHAR(1), classification=YesNo}
     * @param outOfUserSelectYnList The collection of outOfUserSelectYn as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setOutOfUserSelectYn_InScope(Collection<String> outOfUserSelectYnList) {
        doSetOutOfUserSelectYn_InScope(outOfUserSelectYnList);
    }

    /**
     * InScope {in ('a', 'b')}. As YesNo. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * OUT_OF_USER_SELECT_YN: {NotNull, CHAR(1), classification=YesNo} <br />
     * はいいいえを示す
     * @param cdefList The list of classification definition (as ENUM type). (NullAllowed: if null (or empty), no condition)
     */
    public void setOutOfUserSelectYn_InScope_AsYesNo(Collection<LdCDef.YesNo> cdefList) {
        doSetOutOfUserSelectYn_InScope(cTStrL(cdefList));
    }

    public void doSetOutOfUserSelectYn_InScope(Collection<String> outOfUserSelectYnList) {
        regINS(CK_INS, cTL(outOfUserSelectYnList), getCValueOutOfUserSelectYn(), "OUT_OF_USER_SELECT_YN");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * OUT_OF_USER_SELECT_YN: {NotNull, CHAR(1), classification=YesNo}
     * @param outOfUserSelectYnList The collection of outOfUserSelectYn as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setOutOfUserSelectYn_NotInScope(Collection<String> outOfUserSelectYnList) {
        doSetOutOfUserSelectYn_NotInScope(outOfUserSelectYnList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As YesNo. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * OUT_OF_USER_SELECT_YN: {NotNull, CHAR(1), classification=YesNo} <br />
     * はいいいえを示す
     * @param cdefList The list of classification definition (as ENUM type). (NullAllowed: if null (or empty), no condition)
     */
    public void setOutOfUserSelectYn_NotInScope_AsYesNo(Collection<LdCDef.YesNo> cdefList) {
        doSetOutOfUserSelectYn_NotInScope(cTStrL(cdefList));
    }

    public void doSetOutOfUserSelectYn_NotInScope(Collection<String> outOfUserSelectYnList) {
        regINS(CK_NINS, cTL(outOfUserSelectYnList), getCValueOutOfUserSelectYn(), "OUT_OF_USER_SELECT_YN");
    }

    protected void regOutOfUserSelectYn(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueOutOfUserSelectYn(), "OUT_OF_USER_SELECT_YN"); }
    protected abstract ConditionValue getCValueOutOfUserSelectYn();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * OUT_OF_USER_SELECT_REASON: {VARCHAR(200)}
     * @param outOfUserSelectReason The value of outOfUserSelectReason as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setOutOfUserSelectReason_Equal(String outOfUserSelectReason) {
        doSetOutOfUserSelectReason_Equal(fRES(outOfUserSelectReason));
    }

    protected void doSetOutOfUserSelectReason_Equal(String outOfUserSelectReason) {
        regOutOfUserSelectReason(CK_EQ, outOfUserSelectReason);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * OUT_OF_USER_SELECT_REASON: {VARCHAR(200)}
     * @param outOfUserSelectReason The value of outOfUserSelectReason as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setOutOfUserSelectReason_NotEqual(String outOfUserSelectReason) {
        doSetOutOfUserSelectReason_NotEqual(fRES(outOfUserSelectReason));
    }

    protected void doSetOutOfUserSelectReason_NotEqual(String outOfUserSelectReason) {
        regOutOfUserSelectReason(CK_NES, outOfUserSelectReason);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * OUT_OF_USER_SELECT_REASON: {VARCHAR(200)}
     * @param outOfUserSelectReason The value of outOfUserSelectReason as greaterThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setOutOfUserSelectReason_GreaterThan(String outOfUserSelectReason) {
        regOutOfUserSelectReason(CK_GT, fRES(outOfUserSelectReason));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * OUT_OF_USER_SELECT_REASON: {VARCHAR(200)}
     * @param outOfUserSelectReason The value of outOfUserSelectReason as lessThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setOutOfUserSelectReason_LessThan(String outOfUserSelectReason) {
        regOutOfUserSelectReason(CK_LT, fRES(outOfUserSelectReason));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * OUT_OF_USER_SELECT_REASON: {VARCHAR(200)}
     * @param outOfUserSelectReason The value of outOfUserSelectReason as greaterEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setOutOfUserSelectReason_GreaterEqual(String outOfUserSelectReason) {
        regOutOfUserSelectReason(CK_GE, fRES(outOfUserSelectReason));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * OUT_OF_USER_SELECT_REASON: {VARCHAR(200)}
     * @param outOfUserSelectReason The value of outOfUserSelectReason as lessEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setOutOfUserSelectReason_LessEqual(String outOfUserSelectReason) {
        regOutOfUserSelectReason(CK_LE, fRES(outOfUserSelectReason));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * OUT_OF_USER_SELECT_REASON: {VARCHAR(200)}
     * @param outOfUserSelectReasonList The collection of outOfUserSelectReason as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setOutOfUserSelectReason_InScope(Collection<String> outOfUserSelectReasonList) {
        doSetOutOfUserSelectReason_InScope(outOfUserSelectReasonList);
    }

    public void doSetOutOfUserSelectReason_InScope(Collection<String> outOfUserSelectReasonList) {
        regINS(CK_INS, cTL(outOfUserSelectReasonList), getCValueOutOfUserSelectReason(), "OUT_OF_USER_SELECT_REASON");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * OUT_OF_USER_SELECT_REASON: {VARCHAR(200)}
     * @param outOfUserSelectReasonList The collection of outOfUserSelectReason as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setOutOfUserSelectReason_NotInScope(Collection<String> outOfUserSelectReasonList) {
        doSetOutOfUserSelectReason_NotInScope(outOfUserSelectReasonList);
    }

    public void doSetOutOfUserSelectReason_NotInScope(Collection<String> outOfUserSelectReasonList) {
        regINS(CK_NINS, cTL(outOfUserSelectReasonList), getCValueOutOfUserSelectReason(), "OUT_OF_USER_SELECT_REASON");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * OUT_OF_USER_SELECT_REASON: {VARCHAR(200)}
     * @param outOfUserSelectReason The value of outOfUserSelectReason as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setOutOfUserSelectReason_PrefixSearch(String outOfUserSelectReason) {
        setOutOfUserSelectReason_LikeSearch(outOfUserSelectReason, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * OUT_OF_USER_SELECT_REASON: {VARCHAR(200)} <br />
     * <pre>e.g. setOutOfUserSelectReason_LikeSearch("xxx", new <span style="color: #DD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param outOfUserSelectReason The value of outOfUserSelectReason as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOutOfUserSelectReason_LikeSearch(String outOfUserSelectReason, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(outOfUserSelectReason), getCValueOutOfUserSelectReason(), "OUT_OF_USER_SELECT_REASON", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * OUT_OF_USER_SELECT_REASON: {VARCHAR(200)}
     * @param outOfUserSelectReason The value of outOfUserSelectReason as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOutOfUserSelectReason_NotLikeSearch(String outOfUserSelectReason, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(outOfUserSelectReason), getCValueOutOfUserSelectReason(), "OUT_OF_USER_SELECT_REASON", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * OUT_OF_USER_SELECT_REASON: {VARCHAR(200)}
     */
    public void setOutOfUserSelectReason_IsNull() { regOutOfUserSelectReason(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br />
     * OUT_OF_USER_SELECT_REASON: {VARCHAR(200)}
     */
    public void setOutOfUserSelectReason_IsNullOrEmpty() { regOutOfUserSelectReason(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * OUT_OF_USER_SELECT_REASON: {VARCHAR(200)}
     */
    public void setOutOfUserSelectReason_IsNotNull() { regOutOfUserSelectReason(CK_ISNN, DOBJ); }

    protected void regOutOfUserSelectReason(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueOutOfUserSelectReason(), "OUT_OF_USER_SELECT_REASON"); }
    protected abstract ConditionValue getCValueOutOfUserSelectReason();

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
     * cb.query().<span style="color: #DD4747">scalar_Equal()</span>.max(new SubQuery&lt;LdBookCB&gt;() {
     *     public void query(LdBookCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<LdBookCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ.getOperand(), LdBookCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;LdBookCB&gt;() {
     *     public void query(LdBookCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<LdBookCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES.getOperand(), LdBookCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;LdBookCB&gt;() {
     *     public void query(LdBookCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<LdBookCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT.getOperand(), LdBookCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessThan()</span>.max(new SubQuery&lt;LdBookCB&gt;() {
     *     public void query(LdBookCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<LdBookCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT.getOperand(), LdBookCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;LdBookCB&gt;() {
     *     public void query(LdBookCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<LdBookCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE.getOperand(), LdBookCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;LdBookCB&gt;() {
     *     public void query(LdBookCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<LdBookCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE.getOperand(), LdBookCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSSQOption<CB> op) {
        assertObjectNotNull("subQuery", sq);
        LdBookCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        op.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, op);
    }
    public abstract String keepScalarCondition(LdBookCQ sq);

    protected LdBookCB xcreateScalarConditionCB() {
        LdBookCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected LdBookCB xcreateScalarConditionPartitionByCB() {
        LdBookCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<LdBookCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        LdBookCB cb = new LdBookCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        String pp = keepSpecifyMyselfDerived(cb.query());
        String pk = "BOOK_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(LdBookCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<LdBookCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(LdBookCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        LdBookCB cb = new LdBookCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "BOOK_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(LdBookCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subQuery The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<LdBookCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        LdBookCB cb = new LdBookCB(); cb.xsetupForMyselfExists(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(LdBookCQ sq);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (sub-query).
     * @param subQuery The implementation of sub-query. (NotNull)
     */
    public void myselfInScope(SubQuery<LdBookCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        LdBookCB cb = new LdBookCB(); cb.xsetupForMyselfInScope(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepMyselfInScope(cb.query());
        registerMyselfInScope(cb.query(), pp);
    }
    public abstract String keepMyselfInScope(LdBookCQ sq);

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
    protected LdBookCB newMyCB() {
        return new LdBookCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabCQ() { return LdBookCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
