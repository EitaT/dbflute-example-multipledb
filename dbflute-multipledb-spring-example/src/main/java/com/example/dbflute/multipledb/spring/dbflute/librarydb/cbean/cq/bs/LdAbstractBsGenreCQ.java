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
 * The abstract condition-query of GENRE.
 * @author DBFlute(AutoGenerator)
 */
public abstract class LdAbstractBsGenreCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public LdAbstractBsGenreCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "GENRE";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * GENRE_CODE: {PK, NotNull, VARCHAR(24)}
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
     * GENRE_CODE: {PK, NotNull, VARCHAR(24)}
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
     * GENRE_CODE: {PK, NotNull, VARCHAR(24)}
     * @param genreCode The value of genreCode as greaterThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setGenreCode_GreaterThan(String genreCode) {
        regGenreCode(CK_GT, fRES(genreCode));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * GENRE_CODE: {PK, NotNull, VARCHAR(24)}
     * @param genreCode The value of genreCode as lessThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setGenreCode_LessThan(String genreCode) {
        regGenreCode(CK_LT, fRES(genreCode));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * GENRE_CODE: {PK, NotNull, VARCHAR(24)}
     * @param genreCode The value of genreCode as greaterEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setGenreCode_GreaterEqual(String genreCode) {
        regGenreCode(CK_GE, fRES(genreCode));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * GENRE_CODE: {PK, NotNull, VARCHAR(24)}
     * @param genreCode The value of genreCode as lessEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setGenreCode_LessEqual(String genreCode) {
        regGenreCode(CK_LE, fRES(genreCode));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * GENRE_CODE: {PK, NotNull, VARCHAR(24)}
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
     * GENRE_CODE: {PK, NotNull, VARCHAR(24)}
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
     * GENRE_CODE: {PK, NotNull, VARCHAR(24)}
     * @param genreCode The value of genreCode as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setGenreCode_PrefixSearch(String genreCode) {
        setGenreCode_LikeSearch(genreCode, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * GENRE_CODE: {PK, NotNull, VARCHAR(24)} <br />
     * <pre>e.g. setGenreCode_LikeSearch("xxx", new <span style="color: #FD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param genreCode The value of genreCode as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setGenreCode_LikeSearch(String genreCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(genreCode), getCValueGenreCode(), "GENRE_CODE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * GENRE_CODE: {PK, NotNull, VARCHAR(24)}
     * @param genreCode The value of genreCode as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setGenreCode_NotLikeSearch(String genreCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(genreCode), getCValueGenreCode(), "GENRE_CODE", likeSearchOption);
    }

    /**
     * Set up ExistsReferrer (co-related sub-query). <br />
     * {exists (select GENRE_CODE from BOOK where ...)} <br />
     * BOOK by GENRE_CODE, named 'bookAsOne'.
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
        String pp = keepGenreCode_ExistsReferrer_BookList(cb.query()); // for saving query-value.
        registerExistsReferrer(cb.query(), "GENRE_CODE", "GENRE_CODE", pp, "bookList");
    }
    public abstract String keepGenreCode_ExistsReferrer_BookList(LdBookCQ sq);

    /**
     * Set up ExistsReferrer (co-related sub-query). <br />
     * {exists (select PARENT_GENRE_CODE from GENRE where ...)} <br />
     * GENRE by PARENT_GENRE_CODE, named 'genreSelfAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">existsGenreSelfList</span>(new SubQuery&lt;LdGenreCB&gt;() {
     *     public void query(LdGenreCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of GenreSelfList for 'exists'. (NotNull)
     */
    public void existsGenreSelfList(SubQuery<LdGenreCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        LdGenreCB cb = new LdGenreCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String pp = keepGenreCode_ExistsReferrer_GenreSelfList(cb.query()); // for saving query-value.
        registerExistsReferrer(cb.query(), "GENRE_CODE", "PARENT_GENRE_CODE", pp, "genreSelfList");
    }
    public abstract String keepGenreCode_ExistsReferrer_GenreSelfList(LdGenreCQ sq);

    /**
     * Set up NotExistsReferrer (co-related sub-query). <br />
     * {not exists (select GENRE_CODE from BOOK where ...)} <br />
     * BOOK by GENRE_CODE, named 'bookAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">notExistsBookList</span>(new SubQuery&lt;LdBookCB&gt;() {
     *     public void query(LdBookCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of GenreCode_NotExistsReferrer_BookList for 'not exists'. (NotNull)
     */
    public void notExistsBookList(SubQuery<LdBookCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        LdBookCB cb = new LdBookCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String pp = keepGenreCode_NotExistsReferrer_BookList(cb.query()); // for saving query-value.
        registerNotExistsReferrer(cb.query(), "GENRE_CODE", "GENRE_CODE", pp, "bookList");
    }
    public abstract String keepGenreCode_NotExistsReferrer_BookList(LdBookCQ sq);

    /**
     * Set up NotExistsReferrer (co-related sub-query). <br />
     * {not exists (select PARENT_GENRE_CODE from GENRE where ...)} <br />
     * GENRE by PARENT_GENRE_CODE, named 'genreSelfAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">notExistsGenreSelfList</span>(new SubQuery&lt;LdGenreCB&gt;() {
     *     public void query(LdGenreCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of GenreCode_NotExistsReferrer_GenreSelfList for 'not exists'. (NotNull)
     */
    public void notExistsGenreSelfList(SubQuery<LdGenreCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        LdGenreCB cb = new LdGenreCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String pp = keepGenreCode_NotExistsReferrer_GenreSelfList(cb.query()); // for saving query-value.
        registerNotExistsReferrer(cb.query(), "GENRE_CODE", "PARENT_GENRE_CODE", pp, "genreSelfList");
    }
    public abstract String keepGenreCode_NotExistsReferrer_GenreSelfList(LdGenreCQ sq);

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select GENRE_CODE from BOOK where ...)} <br />
     * BOOK by GENRE_CODE, named 'bookAsOne'.
     * @param subQuery The sub-query of BookList for 'in-scope'. (NotNull)
     */
    public void inScopeBookList(SubQuery<LdBookCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        LdBookCB cb = new LdBookCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String pp = keepGenreCode_InScopeRelation_BookList(cb.query()); // for saving query-value.
        registerInScopeRelation(cb.query(), "GENRE_CODE", "GENRE_CODE", pp, "bookList");
    }
    public abstract String keepGenreCode_InScopeRelation_BookList(LdBookCQ sq);

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select PARENT_GENRE_CODE from GENRE where ...)} <br />
     * GENRE by PARENT_GENRE_CODE, named 'genreSelfAsOne'.
     * @param subQuery The sub-query of GenreSelfList for 'in-scope'. (NotNull)
     */
    public void inScopeGenreSelfList(SubQuery<LdGenreCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        LdGenreCB cb = new LdGenreCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String pp = keepGenreCode_InScopeRelation_GenreSelfList(cb.query()); // for saving query-value.
        registerInScopeRelation(cb.query(), "GENRE_CODE", "PARENT_GENRE_CODE", pp, "genreSelfList");
    }
    public abstract String keepGenreCode_InScopeRelation_GenreSelfList(LdGenreCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select GENRE_CODE from BOOK where ...)} <br />
     * BOOK by GENRE_CODE, named 'bookAsOne'.
     * @param subQuery The sub-query of BookList for 'not in-scope'. (NotNull)
     */
    public void notInScopeBookList(SubQuery<LdBookCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        LdBookCB cb = new LdBookCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String pp = keepGenreCode_NotInScopeRelation_BookList(cb.query()); // for saving query-value.
        registerNotInScopeRelation(cb.query(), "GENRE_CODE", "GENRE_CODE", pp, "bookList");
    }
    public abstract String keepGenreCode_NotInScopeRelation_BookList(LdBookCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select PARENT_GENRE_CODE from GENRE where ...)} <br />
     * GENRE by PARENT_GENRE_CODE, named 'genreSelfAsOne'.
     * @param subQuery The sub-query of GenreSelfList for 'not in-scope'. (NotNull)
     */
    public void notInScopeGenreSelfList(SubQuery<LdGenreCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        LdGenreCB cb = new LdGenreCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String pp = keepGenreCode_NotInScopeRelation_GenreSelfList(cb.query()); // for saving query-value.
        registerNotInScopeRelation(cb.query(), "GENRE_CODE", "PARENT_GENRE_CODE", pp, "genreSelfList");
    }
    public abstract String keepGenreCode_NotInScopeRelation_GenreSelfList(LdGenreCQ sq);

    public void xsderiveBookList(String fn, SubQuery<LdBookCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        LdBookCB cb = new LdBookCB(); cb.xsetupForDerivedReferrer(this); sq.query(cb);
        String pp = keepGenreCode_SpecifyDerivedReferrer_BookList(cb.query()); // for saving query-value.
        registerSpecifyDerivedReferrer(fn, cb.query(), "GENRE_CODE", "GENRE_CODE", pp, "bookList", al, op);
    }
    public abstract String keepGenreCode_SpecifyDerivedReferrer_BookList(LdBookCQ sq);

    public void xsderiveGenreSelfList(String fn, SubQuery<LdGenreCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        LdGenreCB cb = new LdGenreCB(); cb.xsetupForDerivedReferrer(this); sq.query(cb);
        String pp = keepGenreCode_SpecifyDerivedReferrer_GenreSelfList(cb.query()); // for saving query-value.
        registerSpecifyDerivedReferrer(fn, cb.query(), "GENRE_CODE", "PARENT_GENRE_CODE", pp, "genreSelfList", al, op);
    }
    public abstract String keepGenreCode_SpecifyDerivedReferrer_GenreSelfList(LdGenreCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer. <br />
     * {FOO &lt;= (select max(BAR) from BOOK where ...)} <br />
     * BOOK by GENRE_CODE, named 'bookAsOne'.
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
        String sqpp = keepGenreCode_QueryDerivedReferrer_BookList(cb.query()); // for saving query-value.
        String prpp = keepGenreCode_QueryDerivedReferrer_BookListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "GENRE_CODE", "GENRE_CODE", sqpp, "bookList", rd, vl, prpp, op);
    }
    public abstract String keepGenreCode_QueryDerivedReferrer_BookList(LdBookCQ sq);
    public abstract String keepGenreCode_QueryDerivedReferrer_BookListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer. <br />
     * {FOO &lt;= (select max(BAR) from GENRE where ...)} <br />
     * GENRE by PARENT_GENRE_CODE, named 'genreSelfAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">derivedGenreSelfList()</span>.<span style="color: #FD4747">max</span>(new SubQuery&lt;LdGenreCB&gt;() {
     *     public void query(LdGenreCB subCB) {
     *         subCB.specify().<span style="color: #FD4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *         subCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     *     }
     * }).<span style="color: #FD4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<LdGenreCB> derivedGenreSelfList() {
        return xcreateQDRFunctionGenreSelfList();
    }
    protected HpQDRFunction<LdGenreCB> xcreateQDRFunctionGenreSelfList() {
        return new HpQDRFunction<LdGenreCB>(new HpQDRSetupper<LdGenreCB>() {
            public void setup(String fn, SubQuery<LdGenreCB> sq, String rd, Object vl, DerivedReferrerOption op) {
                xqderiveGenreSelfList(fn, sq, rd, vl, op);
            }
        });
    }
    public void xqderiveGenreSelfList(String fn, SubQuery<LdGenreCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        LdGenreCB cb = new LdGenreCB(); cb.xsetupForDerivedReferrer(this); sq.query(cb);
        String sqpp = keepGenreCode_QueryDerivedReferrer_GenreSelfList(cb.query()); // for saving query-value.
        String prpp = keepGenreCode_QueryDerivedReferrer_GenreSelfListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "GENRE_CODE", "PARENT_GENRE_CODE", sqpp, "genreSelfList", rd, vl, prpp, op);
    }
    public abstract String keepGenreCode_QueryDerivedReferrer_GenreSelfList(LdGenreCQ sq);
    public abstract String keepGenreCode_QueryDerivedReferrer_GenreSelfListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * GENRE_CODE: {PK, NotNull, VARCHAR(24)}
     */
    public void setGenreCode_IsNull() { regGenreCode(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * GENRE_CODE: {PK, NotNull, VARCHAR(24)}
     */
    public void setGenreCode_IsNotNull() { regGenreCode(CK_ISNN, DOBJ); }

    protected void regGenreCode(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueGenreCode(), "GENRE_CODE"); }
    protected abstract ConditionValue getCValueGenreCode();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * GENRE_NAME: {NotNull, VARCHAR(80)}
     * @param genreName The value of genreName as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setGenreName_Equal(String genreName) {
        doSetGenreName_Equal(fRES(genreName));
    }

    protected void doSetGenreName_Equal(String genreName) {
        regGenreName(CK_EQ, genreName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * GENRE_NAME: {NotNull, VARCHAR(80)}
     * @param genreName The value of genreName as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setGenreName_NotEqual(String genreName) {
        doSetGenreName_NotEqual(fRES(genreName));
    }

    protected void doSetGenreName_NotEqual(String genreName) {
        regGenreName(CK_NES, genreName);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * GENRE_NAME: {NotNull, VARCHAR(80)}
     * @param genreName The value of genreName as greaterThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setGenreName_GreaterThan(String genreName) {
        regGenreName(CK_GT, fRES(genreName));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * GENRE_NAME: {NotNull, VARCHAR(80)}
     * @param genreName The value of genreName as lessThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setGenreName_LessThan(String genreName) {
        regGenreName(CK_LT, fRES(genreName));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * GENRE_NAME: {NotNull, VARCHAR(80)}
     * @param genreName The value of genreName as greaterEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setGenreName_GreaterEqual(String genreName) {
        regGenreName(CK_GE, fRES(genreName));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * GENRE_NAME: {NotNull, VARCHAR(80)}
     * @param genreName The value of genreName as lessEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setGenreName_LessEqual(String genreName) {
        regGenreName(CK_LE, fRES(genreName));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * GENRE_NAME: {NotNull, VARCHAR(80)}
     * @param genreNameList The collection of genreName as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setGenreName_InScope(Collection<String> genreNameList) {
        doSetGenreName_InScope(genreNameList);
    }

    public void doSetGenreName_InScope(Collection<String> genreNameList) {
        regINS(CK_INS, cTL(genreNameList), getCValueGenreName(), "GENRE_NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * GENRE_NAME: {NotNull, VARCHAR(80)}
     * @param genreNameList The collection of genreName as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setGenreName_NotInScope(Collection<String> genreNameList) {
        doSetGenreName_NotInScope(genreNameList);
    }

    public void doSetGenreName_NotInScope(Collection<String> genreNameList) {
        regINS(CK_NINS, cTL(genreNameList), getCValueGenreName(), "GENRE_NAME");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * GENRE_NAME: {NotNull, VARCHAR(80)}
     * @param genreName The value of genreName as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setGenreName_PrefixSearch(String genreName) {
        setGenreName_LikeSearch(genreName, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * GENRE_NAME: {NotNull, VARCHAR(80)} <br />
     * <pre>e.g. setGenreName_LikeSearch("xxx", new <span style="color: #FD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param genreName The value of genreName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setGenreName_LikeSearch(String genreName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(genreName), getCValueGenreName(), "GENRE_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * GENRE_NAME: {NotNull, VARCHAR(80)}
     * @param genreName The value of genreName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setGenreName_NotLikeSearch(String genreName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(genreName), getCValueGenreName(), "GENRE_NAME", likeSearchOption);
    }

    protected void regGenreName(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueGenreName(), "GENRE_NAME"); }
    protected abstract ConditionValue getCValueGenreName();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * HIERARCHY_LEVEL: {NotNull, NUMERIC(9)}
     * @param hierarchyLevel The value of hierarchyLevel as equal. (NullAllowed: if null, no condition)
     */
    public void setHierarchyLevel_Equal(java.math.BigDecimal hierarchyLevel) {
        doSetHierarchyLevel_Equal(hierarchyLevel);
    }

    protected void doSetHierarchyLevel_Equal(java.math.BigDecimal hierarchyLevel) {
        regHierarchyLevel(CK_EQ, hierarchyLevel);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * HIERARCHY_LEVEL: {NotNull, NUMERIC(9)}
     * @param hierarchyLevel The value of hierarchyLevel as notEqual. (NullAllowed: if null, no condition)
     */
    public void setHierarchyLevel_NotEqual(java.math.BigDecimal hierarchyLevel) {
        doSetHierarchyLevel_NotEqual(hierarchyLevel);
    }

    protected void doSetHierarchyLevel_NotEqual(java.math.BigDecimal hierarchyLevel) {
        regHierarchyLevel(CK_NES, hierarchyLevel);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * HIERARCHY_LEVEL: {NotNull, NUMERIC(9)}
     * @param hierarchyLevel The value of hierarchyLevel as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setHierarchyLevel_GreaterThan(java.math.BigDecimal hierarchyLevel) {
        regHierarchyLevel(CK_GT, hierarchyLevel);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * HIERARCHY_LEVEL: {NotNull, NUMERIC(9)}
     * @param hierarchyLevel The value of hierarchyLevel as lessThan. (NullAllowed: if null, no condition)
     */
    public void setHierarchyLevel_LessThan(java.math.BigDecimal hierarchyLevel) {
        regHierarchyLevel(CK_LT, hierarchyLevel);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * HIERARCHY_LEVEL: {NotNull, NUMERIC(9)}
     * @param hierarchyLevel The value of hierarchyLevel as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setHierarchyLevel_GreaterEqual(java.math.BigDecimal hierarchyLevel) {
        regHierarchyLevel(CK_GE, hierarchyLevel);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * HIERARCHY_LEVEL: {NotNull, NUMERIC(9)}
     * @param hierarchyLevel The value of hierarchyLevel as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setHierarchyLevel_LessEqual(java.math.BigDecimal hierarchyLevel) {
        regHierarchyLevel(CK_LE, hierarchyLevel);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * HIERARCHY_LEVEL: {NotNull, NUMERIC(9)}
     * @param minNumber The min number of hierarchyLevel. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of hierarchyLevel. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setHierarchyLevel_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueHierarchyLevel(), "HIERARCHY_LEVEL", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * HIERARCHY_LEVEL: {NotNull, NUMERIC(9)}
     * @param hierarchyLevelList The collection of hierarchyLevel as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setHierarchyLevel_InScope(Collection<java.math.BigDecimal> hierarchyLevelList) {
        doSetHierarchyLevel_InScope(hierarchyLevelList);
    }

    protected void doSetHierarchyLevel_InScope(Collection<java.math.BigDecimal> hierarchyLevelList) {
        regINS(CK_INS, cTL(hierarchyLevelList), getCValueHierarchyLevel(), "HIERARCHY_LEVEL");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * HIERARCHY_LEVEL: {NotNull, NUMERIC(9)}
     * @param hierarchyLevelList The collection of hierarchyLevel as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setHierarchyLevel_NotInScope(Collection<java.math.BigDecimal> hierarchyLevelList) {
        doSetHierarchyLevel_NotInScope(hierarchyLevelList);
    }

    protected void doSetHierarchyLevel_NotInScope(Collection<java.math.BigDecimal> hierarchyLevelList) {
        regINS(CK_NINS, cTL(hierarchyLevelList), getCValueHierarchyLevel(), "HIERARCHY_LEVEL");
    }

    protected void regHierarchyLevel(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueHierarchyLevel(), "HIERARCHY_LEVEL"); }
    protected abstract ConditionValue getCValueHierarchyLevel();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * HIERARCHY_ORDER: {NotNull, NUMERIC(10)}
     * @param hierarchyOrder The value of hierarchyOrder as equal. (NullAllowed: if null, no condition)
     */
    public void setHierarchyOrder_Equal(java.math.BigDecimal hierarchyOrder) {
        doSetHierarchyOrder_Equal(hierarchyOrder);
    }

    protected void doSetHierarchyOrder_Equal(java.math.BigDecimal hierarchyOrder) {
        regHierarchyOrder(CK_EQ, hierarchyOrder);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * HIERARCHY_ORDER: {NotNull, NUMERIC(10)}
     * @param hierarchyOrder The value of hierarchyOrder as notEqual. (NullAllowed: if null, no condition)
     */
    public void setHierarchyOrder_NotEqual(java.math.BigDecimal hierarchyOrder) {
        doSetHierarchyOrder_NotEqual(hierarchyOrder);
    }

    protected void doSetHierarchyOrder_NotEqual(java.math.BigDecimal hierarchyOrder) {
        regHierarchyOrder(CK_NES, hierarchyOrder);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * HIERARCHY_ORDER: {NotNull, NUMERIC(10)}
     * @param hierarchyOrder The value of hierarchyOrder as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setHierarchyOrder_GreaterThan(java.math.BigDecimal hierarchyOrder) {
        regHierarchyOrder(CK_GT, hierarchyOrder);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * HIERARCHY_ORDER: {NotNull, NUMERIC(10)}
     * @param hierarchyOrder The value of hierarchyOrder as lessThan. (NullAllowed: if null, no condition)
     */
    public void setHierarchyOrder_LessThan(java.math.BigDecimal hierarchyOrder) {
        regHierarchyOrder(CK_LT, hierarchyOrder);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * HIERARCHY_ORDER: {NotNull, NUMERIC(10)}
     * @param hierarchyOrder The value of hierarchyOrder as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setHierarchyOrder_GreaterEqual(java.math.BigDecimal hierarchyOrder) {
        regHierarchyOrder(CK_GE, hierarchyOrder);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * HIERARCHY_ORDER: {NotNull, NUMERIC(10)}
     * @param hierarchyOrder The value of hierarchyOrder as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setHierarchyOrder_LessEqual(java.math.BigDecimal hierarchyOrder) {
        regHierarchyOrder(CK_LE, hierarchyOrder);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * HIERARCHY_ORDER: {NotNull, NUMERIC(10)}
     * @param minNumber The min number of hierarchyOrder. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of hierarchyOrder. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setHierarchyOrder_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueHierarchyOrder(), "HIERARCHY_ORDER", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * HIERARCHY_ORDER: {NotNull, NUMERIC(10)}
     * @param hierarchyOrderList The collection of hierarchyOrder as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setHierarchyOrder_InScope(Collection<java.math.BigDecimal> hierarchyOrderList) {
        doSetHierarchyOrder_InScope(hierarchyOrderList);
    }

    protected void doSetHierarchyOrder_InScope(Collection<java.math.BigDecimal> hierarchyOrderList) {
        regINS(CK_INS, cTL(hierarchyOrderList), getCValueHierarchyOrder(), "HIERARCHY_ORDER");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * HIERARCHY_ORDER: {NotNull, NUMERIC(10)}
     * @param hierarchyOrderList The collection of hierarchyOrder as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setHierarchyOrder_NotInScope(Collection<java.math.BigDecimal> hierarchyOrderList) {
        doSetHierarchyOrder_NotInScope(hierarchyOrderList);
    }

    protected void doSetHierarchyOrder_NotInScope(Collection<java.math.BigDecimal> hierarchyOrderList) {
        regINS(CK_NINS, cTL(hierarchyOrderList), getCValueHierarchyOrder(), "HIERARCHY_ORDER");
    }

    protected void regHierarchyOrder(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueHierarchyOrder(), "HIERARCHY_ORDER"); }
    protected abstract ConditionValue getCValueHierarchyOrder();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * PARENT_GENRE_CODE: {IX, VARCHAR(24), FK to GENRE}
     * @param parentGenreCode The value of parentGenreCode as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setParentGenreCode_Equal(String parentGenreCode) {
        doSetParentGenreCode_Equal(fRES(parentGenreCode));
    }

    protected void doSetParentGenreCode_Equal(String parentGenreCode) {
        regParentGenreCode(CK_EQ, parentGenreCode);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * PARENT_GENRE_CODE: {IX, VARCHAR(24), FK to GENRE}
     * @param parentGenreCode The value of parentGenreCode as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setParentGenreCode_NotEqual(String parentGenreCode) {
        doSetParentGenreCode_NotEqual(fRES(parentGenreCode));
    }

    protected void doSetParentGenreCode_NotEqual(String parentGenreCode) {
        regParentGenreCode(CK_NES, parentGenreCode);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * PARENT_GENRE_CODE: {IX, VARCHAR(24), FK to GENRE}
     * @param parentGenreCode The value of parentGenreCode as greaterThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setParentGenreCode_GreaterThan(String parentGenreCode) {
        regParentGenreCode(CK_GT, fRES(parentGenreCode));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * PARENT_GENRE_CODE: {IX, VARCHAR(24), FK to GENRE}
     * @param parentGenreCode The value of parentGenreCode as lessThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setParentGenreCode_LessThan(String parentGenreCode) {
        regParentGenreCode(CK_LT, fRES(parentGenreCode));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * PARENT_GENRE_CODE: {IX, VARCHAR(24), FK to GENRE}
     * @param parentGenreCode The value of parentGenreCode as greaterEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setParentGenreCode_GreaterEqual(String parentGenreCode) {
        regParentGenreCode(CK_GE, fRES(parentGenreCode));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * PARENT_GENRE_CODE: {IX, VARCHAR(24), FK to GENRE}
     * @param parentGenreCode The value of parentGenreCode as lessEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setParentGenreCode_LessEqual(String parentGenreCode) {
        regParentGenreCode(CK_LE, fRES(parentGenreCode));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * PARENT_GENRE_CODE: {IX, VARCHAR(24), FK to GENRE}
     * @param parentGenreCodeList The collection of parentGenreCode as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setParentGenreCode_InScope(Collection<String> parentGenreCodeList) {
        doSetParentGenreCode_InScope(parentGenreCodeList);
    }

    public void doSetParentGenreCode_InScope(Collection<String> parentGenreCodeList) {
        regINS(CK_INS, cTL(parentGenreCodeList), getCValueParentGenreCode(), "PARENT_GENRE_CODE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * PARENT_GENRE_CODE: {IX, VARCHAR(24), FK to GENRE}
     * @param parentGenreCodeList The collection of parentGenreCode as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setParentGenreCode_NotInScope(Collection<String> parentGenreCodeList) {
        doSetParentGenreCode_NotInScope(parentGenreCodeList);
    }

    public void doSetParentGenreCode_NotInScope(Collection<String> parentGenreCodeList) {
        regINS(CK_NINS, cTL(parentGenreCodeList), getCValueParentGenreCode(), "PARENT_GENRE_CODE");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * PARENT_GENRE_CODE: {IX, VARCHAR(24), FK to GENRE}
     * @param parentGenreCode The value of parentGenreCode as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setParentGenreCode_PrefixSearch(String parentGenreCode) {
        setParentGenreCode_LikeSearch(parentGenreCode, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * PARENT_GENRE_CODE: {IX, VARCHAR(24), FK to GENRE} <br />
     * <pre>e.g. setParentGenreCode_LikeSearch("xxx", new <span style="color: #FD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param parentGenreCode The value of parentGenreCode as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setParentGenreCode_LikeSearch(String parentGenreCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(parentGenreCode), getCValueParentGenreCode(), "PARENT_GENRE_CODE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * PARENT_GENRE_CODE: {IX, VARCHAR(24), FK to GENRE}
     * @param parentGenreCode The value of parentGenreCode as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setParentGenreCode_NotLikeSearch(String parentGenreCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(parentGenreCode), getCValueParentGenreCode(), "PARENT_GENRE_CODE", likeSearchOption);
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select PARENT_GENRE_CODE from GENRE where ...)} <br />
     * GENRE by my PARENT_GENRE_CODE, named 'genreSelf'.
     * @param subQuery The sub-query of GenreSelf for 'in-scope'. (NotNull)
     */
    public void inScopeGenreSelf(SubQuery<LdGenreCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        LdGenreCB cb = new LdGenreCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String pp = keepParentGenreCode_InScopeRelation_GenreSelf(cb.query()); // for saving query-value.
        registerInScopeRelation(cb.query(), "PARENT_GENRE_CODE", "GENRE_CODE", pp, "genreSelf");
    }
    public abstract String keepParentGenreCode_InScopeRelation_GenreSelf(LdGenreCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select PARENT_GENRE_CODE from GENRE where ...)} <br />
     * GENRE by my PARENT_GENRE_CODE, named 'genreSelf'.
     * @param subQuery The sub-query of GenreSelf for 'not in-scope'. (NotNull)
     */
    public void notInScopeGenreSelf(SubQuery<LdGenreCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        LdGenreCB cb = new LdGenreCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String pp = keepParentGenreCode_NotInScopeRelation_GenreSelf(cb.query()); // for saving query-value.
        registerNotInScopeRelation(cb.query(), "PARENT_GENRE_CODE", "GENRE_CODE", pp, "genreSelf");
    }
    public abstract String keepParentGenreCode_NotInScopeRelation_GenreSelf(LdGenreCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * PARENT_GENRE_CODE: {IX, VARCHAR(24), FK to GENRE}
     */
    public void setParentGenreCode_IsNull() { regParentGenreCode(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br />
     * PARENT_GENRE_CODE: {IX, VARCHAR(24), FK to GENRE}
     */
    public void setParentGenreCode_IsNullOrEmpty() { regParentGenreCode(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * PARENT_GENRE_CODE: {IX, VARCHAR(24), FK to GENRE}
     */
    public void setParentGenreCode_IsNotNull() { regParentGenreCode(CK_ISNN, DOBJ); }

    protected void regParentGenreCode(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueParentGenreCode(), "PARENT_GENRE_CODE"); }
    protected abstract ConditionValue getCValueParentGenreCode();

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
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_Equal()</span>.max(new SubQuery&lt;LdGenreCB&gt;() {
     *     public void query(LdGenreCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<LdGenreCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ.getOperand(), LdGenreCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;LdGenreCB&gt;() {
     *     public void query(LdGenreCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<LdGenreCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES.getOperand(), LdGenreCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;LdGenreCB&gt;() {
     *     public void query(LdGenreCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<LdGenreCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT.getOperand(), LdGenreCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessThan()</span>.max(new SubQuery&lt;LdGenreCB&gt;() {
     *     public void query(LdGenreCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<LdGenreCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT.getOperand(), LdGenreCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;LdGenreCB&gt;() {
     *     public void query(LdGenreCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<LdGenreCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE.getOperand(), LdGenreCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;LdGenreCB&gt;() {
     *     public void query(LdGenreCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<LdGenreCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE.getOperand(), LdGenreCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSSQOption<CB> op) {
        assertObjectNotNull("subQuery", sq);
        LdGenreCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        op.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, op);
    }
    public abstract String keepScalarCondition(LdGenreCQ sq);

    protected LdGenreCB xcreateScalarConditionCB() {
        LdGenreCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected LdGenreCB xcreateScalarConditionPartitionByCB() {
        LdGenreCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<LdGenreCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        LdGenreCB cb = new LdGenreCB(); cb.xsetupForDerivedReferrer(this); sq.query(cb);
        String pk = "GENRE_CODE";
        String pp = keepSpecifyMyselfDerived(cb.query()); // for saving query-value.
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(LdGenreCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (SubQuery).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<LdGenreCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(LdGenreCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        LdGenreCB cb = new LdGenreCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "GENRE_CODE";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(LdGenreCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfExists(SubQuery<LdGenreCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        LdGenreCB cb = new LdGenreCB(); cb.xsetupForMyselfExists(this); subQuery.query(cb);
        String pp = keepMyselfExists(cb.query()); // for saving query-value.
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(LdGenreCQ sq);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfInScope(SubQuery<LdGenreCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        LdGenreCB cb = new LdGenreCB(); cb.xsetupForMyselfInScope(this); subQuery.query(cb);
        String pp = keepMyselfInScope(cb.query()); // for saving query-value.
        registerMyselfInScope(cb.query(), pp);
    }
    public abstract String keepMyselfInScope(LdGenreCQ sq);

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    protected LdGenreCB newMyCB() {
        return new LdGenreCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabCQ() { return LdGenreCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
