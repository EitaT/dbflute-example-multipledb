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
 * The abstract condition-query of LIBRARY.
 * @author DBFlute(AutoGenerator)
 */
public abstract class LdAbstractBsLibraryCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public LdAbstractBsLibraryCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "LIBRARY";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * LIBRARY_ID: {PK, ID, NotNull, SMALLINT(5)}
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
     * LIBRARY_ID: {PK, ID, NotNull, SMALLINT(5)}
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
     * LIBRARY_ID: {PK, ID, NotNull, SMALLINT(5)}
     * @param libraryId The value of libraryId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setLibraryId_GreaterThan(Integer libraryId) {
        regLibraryId(CK_GT, libraryId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * LIBRARY_ID: {PK, ID, NotNull, SMALLINT(5)}
     * @param libraryId The value of libraryId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setLibraryId_LessThan(Integer libraryId) {
        regLibraryId(CK_LT, libraryId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * LIBRARY_ID: {PK, ID, NotNull, SMALLINT(5)}
     * @param libraryId The value of libraryId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setLibraryId_GreaterEqual(Integer libraryId) {
        regLibraryId(CK_GE, libraryId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * LIBRARY_ID: {PK, ID, NotNull, SMALLINT(5)}
     * @param libraryId The value of libraryId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setLibraryId_LessEqual(Integer libraryId) {
        regLibraryId(CK_LE, libraryId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * LIBRARY_ID: {PK, ID, NotNull, SMALLINT(5)}
     * @param minNumber The min number of libraryId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of libraryId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setLibraryId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueLibraryId(), "LIBRARY_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * LIBRARY_ID: {PK, ID, NotNull, SMALLINT(5)}
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
     * LIBRARY_ID: {PK, ID, NotNull, SMALLINT(5)}
     * @param libraryIdList The collection of libraryId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setLibraryId_NotInScope(Collection<Integer> libraryIdList) {
        doSetLibraryId_NotInScope(libraryIdList);
    }

    protected void doSetLibraryId_NotInScope(Collection<Integer> libraryIdList) {
        regINS(CK_NINS, cTL(libraryIdList), getCValueLibraryId(), "LIBRARY_ID");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br />
     * {exists (select LIBRARY_ID from COLLECTION where ...)} <br />
     * COLLECTION by LIBRARY_ID, named 'collectionAsOne'.
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
        String pp = keepLibraryId_ExistsReferrer_CollectionList(cb.query());
        registerExistsReferrer(cb.query(), "LIBRARY_ID", "LIBRARY_ID", pp, "collectionList");
    }
    public abstract String keepLibraryId_ExistsReferrer_CollectionList(LdCollectionCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br />
     * {exists (select LIBRARY_ID from LIBRARY_USER where ...)} <br />
     * LIBRARY_USER by LIBRARY_ID, named 'libraryUserAsOne'.
     * <pre>
     * cb.query().<span style="color: #DD4747">existsLibraryUserList</span>(new SubQuery&lt;LdLibraryUserCB&gt;() {
     *     public void query(LdLibraryUserCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of LibraryUserList for 'exists'. (NotNull)
     */
    public void existsLibraryUserList(SubQuery<LdLibraryUserCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        LdLibraryUserCB cb = new LdLibraryUserCB(); cb.xsetupForExistsReferrer(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepLibraryId_ExistsReferrer_LibraryUserList(cb.query());
        registerExistsReferrer(cb.query(), "LIBRARY_ID", "LIBRARY_ID", pp, "libraryUserList");
    }
    public abstract String keepLibraryId_ExistsReferrer_LibraryUserList(LdLibraryUserCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br />
     * {exists (select LIBRARY_ID from NEXT_LIBRARY where ...)} <br />
     * NEXT_LIBRARY by LIBRARY_ID, named 'nextLibraryByLibraryIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #DD4747">existsNextLibraryByLibraryIdList</span>(new SubQuery&lt;LdNextLibraryCB&gt;() {
     *     public void query(LdNextLibraryCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of NextLibraryByLibraryIdList for 'exists'. (NotNull)
     */
    public void existsNextLibraryByLibraryIdList(SubQuery<LdNextLibraryCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        LdNextLibraryCB cb = new LdNextLibraryCB(); cb.xsetupForExistsReferrer(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepLibraryId_ExistsReferrer_NextLibraryByLibraryIdList(cb.query());
        registerExistsReferrer(cb.query(), "LIBRARY_ID", "LIBRARY_ID", pp, "nextLibraryByLibraryIdList");
    }
    public abstract String keepLibraryId_ExistsReferrer_NextLibraryByLibraryIdList(LdNextLibraryCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br />
     * {exists (select NEXT_LIBRARY_ID from NEXT_LIBRARY where ...)} <br />
     * NEXT_LIBRARY by NEXT_LIBRARY_ID, named 'nextLibraryByNextLibraryIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #DD4747">existsNextLibraryByNextLibraryIdList</span>(new SubQuery&lt;LdNextLibraryCB&gt;() {
     *     public void query(LdNextLibraryCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of NextLibraryByNextLibraryIdList for 'exists'. (NotNull)
     */
    public void existsNextLibraryByNextLibraryIdList(SubQuery<LdNextLibraryCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        LdNextLibraryCB cb = new LdNextLibraryCB(); cb.xsetupForExistsReferrer(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepLibraryId_ExistsReferrer_NextLibraryByNextLibraryIdList(cb.query());
        registerExistsReferrer(cb.query(), "LIBRARY_ID", "NEXT_LIBRARY_ID", pp, "nextLibraryByNextLibraryIdList");
    }
    public abstract String keepLibraryId_ExistsReferrer_NextLibraryByNextLibraryIdList(LdNextLibraryCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br />
     * {not exists (select LIBRARY_ID from COLLECTION where ...)} <br />
     * COLLECTION by LIBRARY_ID, named 'collectionAsOne'.
     * <pre>
     * cb.query().<span style="color: #DD4747">notExistsCollectionList</span>(new SubQuery&lt;LdCollectionCB&gt;() {
     *     public void query(LdCollectionCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of LibraryId_NotExistsReferrer_CollectionList for 'not exists'. (NotNull)
     */
    public void notExistsCollectionList(SubQuery<LdCollectionCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        LdCollectionCB cb = new LdCollectionCB(); cb.xsetupForExistsReferrer(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepLibraryId_NotExistsReferrer_CollectionList(cb.query());
        registerNotExistsReferrer(cb.query(), "LIBRARY_ID", "LIBRARY_ID", pp, "collectionList");
    }
    public abstract String keepLibraryId_NotExistsReferrer_CollectionList(LdCollectionCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br />
     * {not exists (select LIBRARY_ID from LIBRARY_USER where ...)} <br />
     * LIBRARY_USER by LIBRARY_ID, named 'libraryUserAsOne'.
     * <pre>
     * cb.query().<span style="color: #DD4747">notExistsLibraryUserList</span>(new SubQuery&lt;LdLibraryUserCB&gt;() {
     *     public void query(LdLibraryUserCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of LibraryId_NotExistsReferrer_LibraryUserList for 'not exists'. (NotNull)
     */
    public void notExistsLibraryUserList(SubQuery<LdLibraryUserCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        LdLibraryUserCB cb = new LdLibraryUserCB(); cb.xsetupForExistsReferrer(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepLibraryId_NotExistsReferrer_LibraryUserList(cb.query());
        registerNotExistsReferrer(cb.query(), "LIBRARY_ID", "LIBRARY_ID", pp, "libraryUserList");
    }
    public abstract String keepLibraryId_NotExistsReferrer_LibraryUserList(LdLibraryUserCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br />
     * {not exists (select LIBRARY_ID from NEXT_LIBRARY where ...)} <br />
     * NEXT_LIBRARY by LIBRARY_ID, named 'nextLibraryByLibraryIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #DD4747">notExistsNextLibraryByLibraryIdList</span>(new SubQuery&lt;LdNextLibraryCB&gt;() {
     *     public void query(LdNextLibraryCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of LibraryId_NotExistsReferrer_NextLibraryByLibraryIdList for 'not exists'. (NotNull)
     */
    public void notExistsNextLibraryByLibraryIdList(SubQuery<LdNextLibraryCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        LdNextLibraryCB cb = new LdNextLibraryCB(); cb.xsetupForExistsReferrer(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepLibraryId_NotExistsReferrer_NextLibraryByLibraryIdList(cb.query());
        registerNotExistsReferrer(cb.query(), "LIBRARY_ID", "LIBRARY_ID", pp, "nextLibraryByLibraryIdList");
    }
    public abstract String keepLibraryId_NotExistsReferrer_NextLibraryByLibraryIdList(LdNextLibraryCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br />
     * {not exists (select NEXT_LIBRARY_ID from NEXT_LIBRARY where ...)} <br />
     * NEXT_LIBRARY by NEXT_LIBRARY_ID, named 'nextLibraryByNextLibraryIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #DD4747">notExistsNextLibraryByNextLibraryIdList</span>(new SubQuery&lt;LdNextLibraryCB&gt;() {
     *     public void query(LdNextLibraryCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of LibraryId_NotExistsReferrer_NextLibraryByNextLibraryIdList for 'not exists'. (NotNull)
     */
    public void notExistsNextLibraryByNextLibraryIdList(SubQuery<LdNextLibraryCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        LdNextLibraryCB cb = new LdNextLibraryCB(); cb.xsetupForExistsReferrer(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepLibraryId_NotExistsReferrer_NextLibraryByNextLibraryIdList(cb.query());
        registerNotExistsReferrer(cb.query(), "LIBRARY_ID", "NEXT_LIBRARY_ID", pp, "nextLibraryByNextLibraryIdList");
    }
    public abstract String keepLibraryId_NotExistsReferrer_NextLibraryByNextLibraryIdList(LdNextLibraryCQ sq);

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select LIBRARY_ID from COLLECTION where ...)} <br />
     * COLLECTION by LIBRARY_ID, named 'collectionAsOne'.
     * @param subQuery The sub-query of CollectionList for 'in-scope'. (NotNull)
     */
    public void inScopeCollectionList(SubQuery<LdCollectionCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        LdCollectionCB cb = new LdCollectionCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepLibraryId_InScopeRelation_CollectionList(cb.query());
        registerInScopeRelation(cb.query(), "LIBRARY_ID", "LIBRARY_ID", pp, "collectionList");
    }
    public abstract String keepLibraryId_InScopeRelation_CollectionList(LdCollectionCQ sq);

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select LIBRARY_ID from LIBRARY_USER where ...)} <br />
     * LIBRARY_USER by LIBRARY_ID, named 'libraryUserAsOne'.
     * @param subQuery The sub-query of LibraryUserList for 'in-scope'. (NotNull)
     */
    public void inScopeLibraryUserList(SubQuery<LdLibraryUserCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        LdLibraryUserCB cb = new LdLibraryUserCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepLibraryId_InScopeRelation_LibraryUserList(cb.query());
        registerInScopeRelation(cb.query(), "LIBRARY_ID", "LIBRARY_ID", pp, "libraryUserList");
    }
    public abstract String keepLibraryId_InScopeRelation_LibraryUserList(LdLibraryUserCQ sq);

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select LIBRARY_ID from NEXT_LIBRARY where ...)} <br />
     * NEXT_LIBRARY by LIBRARY_ID, named 'nextLibraryByLibraryIdAsOne'.
     * @param subQuery The sub-query of NextLibraryByLibraryIdList for 'in-scope'. (NotNull)
     */
    public void inScopeNextLibraryByLibraryIdList(SubQuery<LdNextLibraryCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        LdNextLibraryCB cb = new LdNextLibraryCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepLibraryId_InScopeRelation_NextLibraryByLibraryIdList(cb.query());
        registerInScopeRelation(cb.query(), "LIBRARY_ID", "LIBRARY_ID", pp, "nextLibraryByLibraryIdList");
    }
    public abstract String keepLibraryId_InScopeRelation_NextLibraryByLibraryIdList(LdNextLibraryCQ sq);

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select NEXT_LIBRARY_ID from NEXT_LIBRARY where ...)} <br />
     * NEXT_LIBRARY by NEXT_LIBRARY_ID, named 'nextLibraryByNextLibraryIdAsOne'.
     * @param subQuery The sub-query of NextLibraryByNextLibraryIdList for 'in-scope'. (NotNull)
     */
    public void inScopeNextLibraryByNextLibraryIdList(SubQuery<LdNextLibraryCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        LdNextLibraryCB cb = new LdNextLibraryCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepLibraryId_InScopeRelation_NextLibraryByNextLibraryIdList(cb.query());
        registerInScopeRelation(cb.query(), "LIBRARY_ID", "NEXT_LIBRARY_ID", pp, "nextLibraryByNextLibraryIdList");
    }
    public abstract String keepLibraryId_InScopeRelation_NextLibraryByNextLibraryIdList(LdNextLibraryCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select LIBRARY_ID from COLLECTION where ...)} <br />
     * COLLECTION by LIBRARY_ID, named 'collectionAsOne'.
     * @param subQuery The sub-query of CollectionList for 'not in-scope'. (NotNull)
     */
    public void notInScopeCollectionList(SubQuery<LdCollectionCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        LdCollectionCB cb = new LdCollectionCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepLibraryId_NotInScopeRelation_CollectionList(cb.query());
        registerNotInScopeRelation(cb.query(), "LIBRARY_ID", "LIBRARY_ID", pp, "collectionList");
    }
    public abstract String keepLibraryId_NotInScopeRelation_CollectionList(LdCollectionCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select LIBRARY_ID from LIBRARY_USER where ...)} <br />
     * LIBRARY_USER by LIBRARY_ID, named 'libraryUserAsOne'.
     * @param subQuery The sub-query of LibraryUserList for 'not in-scope'. (NotNull)
     */
    public void notInScopeLibraryUserList(SubQuery<LdLibraryUserCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        LdLibraryUserCB cb = new LdLibraryUserCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepLibraryId_NotInScopeRelation_LibraryUserList(cb.query());
        registerNotInScopeRelation(cb.query(), "LIBRARY_ID", "LIBRARY_ID", pp, "libraryUserList");
    }
    public abstract String keepLibraryId_NotInScopeRelation_LibraryUserList(LdLibraryUserCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select LIBRARY_ID from NEXT_LIBRARY where ...)} <br />
     * NEXT_LIBRARY by LIBRARY_ID, named 'nextLibraryByLibraryIdAsOne'.
     * @param subQuery The sub-query of NextLibraryByLibraryIdList for 'not in-scope'. (NotNull)
     */
    public void notInScopeNextLibraryByLibraryIdList(SubQuery<LdNextLibraryCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        LdNextLibraryCB cb = new LdNextLibraryCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepLibraryId_NotInScopeRelation_NextLibraryByLibraryIdList(cb.query());
        registerNotInScopeRelation(cb.query(), "LIBRARY_ID", "LIBRARY_ID", pp, "nextLibraryByLibraryIdList");
    }
    public abstract String keepLibraryId_NotInScopeRelation_NextLibraryByLibraryIdList(LdNextLibraryCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select NEXT_LIBRARY_ID from NEXT_LIBRARY where ...)} <br />
     * NEXT_LIBRARY by NEXT_LIBRARY_ID, named 'nextLibraryByNextLibraryIdAsOne'.
     * @param subQuery The sub-query of NextLibraryByNextLibraryIdList for 'not in-scope'. (NotNull)
     */
    public void notInScopeNextLibraryByNextLibraryIdList(SubQuery<LdNextLibraryCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        LdNextLibraryCB cb = new LdNextLibraryCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepLibraryId_NotInScopeRelation_NextLibraryByNextLibraryIdList(cb.query());
        registerNotInScopeRelation(cb.query(), "LIBRARY_ID", "NEXT_LIBRARY_ID", pp, "nextLibraryByNextLibraryIdList");
    }
    public abstract String keepLibraryId_NotInScopeRelation_NextLibraryByNextLibraryIdList(LdNextLibraryCQ sq);

    public void xsderiveCollectionList(String fn, SubQuery<LdCollectionCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        LdCollectionCB cb = new LdCollectionCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        String pp = keepLibraryId_SpecifyDerivedReferrer_CollectionList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "LIBRARY_ID", "LIBRARY_ID", pp, "collectionList", al, op);
    }
    public abstract String keepLibraryId_SpecifyDerivedReferrer_CollectionList(LdCollectionCQ sq);

    public void xsderiveLibraryUserList(String fn, SubQuery<LdLibraryUserCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        LdLibraryUserCB cb = new LdLibraryUserCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        String pp = keepLibraryId_SpecifyDerivedReferrer_LibraryUserList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "LIBRARY_ID", "LIBRARY_ID", pp, "libraryUserList", al, op);
    }
    public abstract String keepLibraryId_SpecifyDerivedReferrer_LibraryUserList(LdLibraryUserCQ sq);

    public void xsderiveNextLibraryByLibraryIdList(String fn, SubQuery<LdNextLibraryCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        LdNextLibraryCB cb = new LdNextLibraryCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        String pp = keepLibraryId_SpecifyDerivedReferrer_NextLibraryByLibraryIdList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "LIBRARY_ID", "LIBRARY_ID", pp, "nextLibraryByLibraryIdList", al, op);
    }
    public abstract String keepLibraryId_SpecifyDerivedReferrer_NextLibraryByLibraryIdList(LdNextLibraryCQ sq);

    public void xsderiveNextLibraryByNextLibraryIdList(String fn, SubQuery<LdNextLibraryCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        LdNextLibraryCB cb = new LdNextLibraryCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        String pp = keepLibraryId_SpecifyDerivedReferrer_NextLibraryByNextLibraryIdList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "LIBRARY_ID", "NEXT_LIBRARY_ID", pp, "nextLibraryByNextLibraryIdList", al, op);
    }
    public abstract String keepLibraryId_SpecifyDerivedReferrer_NextLibraryByNextLibraryIdList(LdNextLibraryCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br />
     * {FOO &lt;= (select max(BAR) from COLLECTION where ...)} <br />
     * COLLECTION by LIBRARY_ID, named 'collectionAsOne'.
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
        String sqpp = keepLibraryId_QueryDerivedReferrer_CollectionList(cb.query()); String prpp = keepLibraryId_QueryDerivedReferrer_CollectionListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "LIBRARY_ID", "LIBRARY_ID", sqpp, "collectionList", rd, vl, prpp, op);
    }
    public abstract String keepLibraryId_QueryDerivedReferrer_CollectionList(LdCollectionCQ sq);
    public abstract String keepLibraryId_QueryDerivedReferrer_CollectionListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br />
     * {FOO &lt;= (select max(BAR) from LIBRARY_USER where ...)} <br />
     * LIBRARY_USER by LIBRARY_ID, named 'libraryUserAsOne'.
     * <pre>
     * cb.query().<span style="color: #DD4747">derivedLibraryUserList()</span>.<span style="color: #DD4747">max</span>(new SubQuery&lt;LdLibraryUserCB&gt;() {
     *     public void query(LdLibraryUserCB subCB) {
     *         subCB.specify().<span style="color: #DD4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *         subCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     *     }
     * }).<span style="color: #DD4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<LdLibraryUserCB> derivedLibraryUserList() {
        return xcreateQDRFunctionLibraryUserList();
    }
    protected HpQDRFunction<LdLibraryUserCB> xcreateQDRFunctionLibraryUserList() {
        return new HpQDRFunction<LdLibraryUserCB>(new HpQDRSetupper<LdLibraryUserCB>() {
            public void setup(String fn, SubQuery<LdLibraryUserCB> sq, String rd, Object vl, DerivedReferrerOption op) {
                xqderiveLibraryUserList(fn, sq, rd, vl, op);
            }
        });
    }
    public void xqderiveLibraryUserList(String fn, SubQuery<LdLibraryUserCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        LdLibraryUserCB cb = new LdLibraryUserCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        String sqpp = keepLibraryId_QueryDerivedReferrer_LibraryUserList(cb.query()); String prpp = keepLibraryId_QueryDerivedReferrer_LibraryUserListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "LIBRARY_ID", "LIBRARY_ID", sqpp, "libraryUserList", rd, vl, prpp, op);
    }
    public abstract String keepLibraryId_QueryDerivedReferrer_LibraryUserList(LdLibraryUserCQ sq);
    public abstract String keepLibraryId_QueryDerivedReferrer_LibraryUserListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br />
     * {FOO &lt;= (select max(BAR) from NEXT_LIBRARY where ...)} <br />
     * NEXT_LIBRARY by LIBRARY_ID, named 'nextLibraryByLibraryIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #DD4747">derivedNextLibraryByLibraryIdList()</span>.<span style="color: #DD4747">max</span>(new SubQuery&lt;LdNextLibraryCB&gt;() {
     *     public void query(LdNextLibraryCB subCB) {
     *         subCB.specify().<span style="color: #DD4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *         subCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     *     }
     * }).<span style="color: #DD4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<LdNextLibraryCB> derivedNextLibraryByLibraryIdList() {
        return xcreateQDRFunctionNextLibraryByLibraryIdList();
    }
    protected HpQDRFunction<LdNextLibraryCB> xcreateQDRFunctionNextLibraryByLibraryIdList() {
        return new HpQDRFunction<LdNextLibraryCB>(new HpQDRSetupper<LdNextLibraryCB>() {
            public void setup(String fn, SubQuery<LdNextLibraryCB> sq, String rd, Object vl, DerivedReferrerOption op) {
                xqderiveNextLibraryByLibraryIdList(fn, sq, rd, vl, op);
            }
        });
    }
    public void xqderiveNextLibraryByLibraryIdList(String fn, SubQuery<LdNextLibraryCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        LdNextLibraryCB cb = new LdNextLibraryCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        String sqpp = keepLibraryId_QueryDerivedReferrer_NextLibraryByLibraryIdList(cb.query()); String prpp = keepLibraryId_QueryDerivedReferrer_NextLibraryByLibraryIdListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "LIBRARY_ID", "LIBRARY_ID", sqpp, "nextLibraryByLibraryIdList", rd, vl, prpp, op);
    }
    public abstract String keepLibraryId_QueryDerivedReferrer_NextLibraryByLibraryIdList(LdNextLibraryCQ sq);
    public abstract String keepLibraryId_QueryDerivedReferrer_NextLibraryByLibraryIdListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br />
     * {FOO &lt;= (select max(BAR) from NEXT_LIBRARY where ...)} <br />
     * NEXT_LIBRARY by NEXT_LIBRARY_ID, named 'nextLibraryByNextLibraryIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #DD4747">derivedNextLibraryByNextLibraryIdList()</span>.<span style="color: #DD4747">max</span>(new SubQuery&lt;LdNextLibraryCB&gt;() {
     *     public void query(LdNextLibraryCB subCB) {
     *         subCB.specify().<span style="color: #DD4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *         subCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     *     }
     * }).<span style="color: #DD4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<LdNextLibraryCB> derivedNextLibraryByNextLibraryIdList() {
        return xcreateQDRFunctionNextLibraryByNextLibraryIdList();
    }
    protected HpQDRFunction<LdNextLibraryCB> xcreateQDRFunctionNextLibraryByNextLibraryIdList() {
        return new HpQDRFunction<LdNextLibraryCB>(new HpQDRSetupper<LdNextLibraryCB>() {
            public void setup(String fn, SubQuery<LdNextLibraryCB> sq, String rd, Object vl, DerivedReferrerOption op) {
                xqderiveNextLibraryByNextLibraryIdList(fn, sq, rd, vl, op);
            }
        });
    }
    public void xqderiveNextLibraryByNextLibraryIdList(String fn, SubQuery<LdNextLibraryCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        LdNextLibraryCB cb = new LdNextLibraryCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        String sqpp = keepLibraryId_QueryDerivedReferrer_NextLibraryByNextLibraryIdList(cb.query()); String prpp = keepLibraryId_QueryDerivedReferrer_NextLibraryByNextLibraryIdListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "LIBRARY_ID", "NEXT_LIBRARY_ID", sqpp, "nextLibraryByNextLibraryIdList", rd, vl, prpp, op);
    }
    public abstract String keepLibraryId_QueryDerivedReferrer_NextLibraryByNextLibraryIdList(LdNextLibraryCQ sq);
    public abstract String keepLibraryId_QueryDerivedReferrer_NextLibraryByNextLibraryIdListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * LIBRARY_ID: {PK, ID, NotNull, SMALLINT(5)}
     */
    public void setLibraryId_IsNull() { regLibraryId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * LIBRARY_ID: {PK, ID, NotNull, SMALLINT(5)}
     */
    public void setLibraryId_IsNotNull() { regLibraryId(CK_ISNN, DOBJ); }

    protected void regLibraryId(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueLibraryId(), "LIBRARY_ID"); }
    protected abstract ConditionValue getCValueLibraryId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * LIBRARY_NAME: {UQ, NotNull, VARCHAR(80)}
     * @param libraryName The value of libraryName as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setLibraryName_Equal(String libraryName) {
        doSetLibraryName_Equal(fRES(libraryName));
    }

    protected void doSetLibraryName_Equal(String libraryName) {
        regLibraryName(CK_EQ, libraryName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * LIBRARY_NAME: {UQ, NotNull, VARCHAR(80)}
     * @param libraryName The value of libraryName as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setLibraryName_NotEqual(String libraryName) {
        doSetLibraryName_NotEqual(fRES(libraryName));
    }

    protected void doSetLibraryName_NotEqual(String libraryName) {
        regLibraryName(CK_NES, libraryName);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * LIBRARY_NAME: {UQ, NotNull, VARCHAR(80)}
     * @param libraryName The value of libraryName as greaterThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setLibraryName_GreaterThan(String libraryName) {
        regLibraryName(CK_GT, fRES(libraryName));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * LIBRARY_NAME: {UQ, NotNull, VARCHAR(80)}
     * @param libraryName The value of libraryName as lessThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setLibraryName_LessThan(String libraryName) {
        regLibraryName(CK_LT, fRES(libraryName));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * LIBRARY_NAME: {UQ, NotNull, VARCHAR(80)}
     * @param libraryName The value of libraryName as greaterEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setLibraryName_GreaterEqual(String libraryName) {
        regLibraryName(CK_GE, fRES(libraryName));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * LIBRARY_NAME: {UQ, NotNull, VARCHAR(80)}
     * @param libraryName The value of libraryName as lessEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setLibraryName_LessEqual(String libraryName) {
        regLibraryName(CK_LE, fRES(libraryName));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * LIBRARY_NAME: {UQ, NotNull, VARCHAR(80)}
     * @param libraryNameList The collection of libraryName as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setLibraryName_InScope(Collection<String> libraryNameList) {
        doSetLibraryName_InScope(libraryNameList);
    }

    public void doSetLibraryName_InScope(Collection<String> libraryNameList) {
        regINS(CK_INS, cTL(libraryNameList), getCValueLibraryName(), "LIBRARY_NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * LIBRARY_NAME: {UQ, NotNull, VARCHAR(80)}
     * @param libraryNameList The collection of libraryName as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setLibraryName_NotInScope(Collection<String> libraryNameList) {
        doSetLibraryName_NotInScope(libraryNameList);
    }

    public void doSetLibraryName_NotInScope(Collection<String> libraryNameList) {
        regINS(CK_NINS, cTL(libraryNameList), getCValueLibraryName(), "LIBRARY_NAME");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * LIBRARY_NAME: {UQ, NotNull, VARCHAR(80)}
     * @param libraryName The value of libraryName as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setLibraryName_PrefixSearch(String libraryName) {
        setLibraryName_LikeSearch(libraryName, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * LIBRARY_NAME: {UQ, NotNull, VARCHAR(80)} <br />
     * <pre>e.g. setLibraryName_LikeSearch("xxx", new <span style="color: #DD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param libraryName The value of libraryName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLibraryName_LikeSearch(String libraryName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(libraryName), getCValueLibraryName(), "LIBRARY_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * LIBRARY_NAME: {UQ, NotNull, VARCHAR(80)}
     * @param libraryName The value of libraryName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLibraryName_NotLikeSearch(String libraryName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(libraryName), getCValueLibraryName(), "LIBRARY_NAME", likeSearchOption);
    }

    protected void regLibraryName(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueLibraryName(), "LIBRARY_NAME"); }
    protected abstract ConditionValue getCValueLibraryName();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * LIBRARY_TYPE_CODE: {IX, NotNull, CHAR(3), FK to LIBRARY_TYPE_LOOKUP}
     * @param libraryTypeCode The value of libraryTypeCode as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setLibraryTypeCode_Equal(String libraryTypeCode) {
        doSetLibraryTypeCode_Equal(fRES(libraryTypeCode));
    }

    protected void doSetLibraryTypeCode_Equal(String libraryTypeCode) {
        regLibraryTypeCode(CK_EQ, libraryTypeCode);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * LIBRARY_TYPE_CODE: {IX, NotNull, CHAR(3), FK to LIBRARY_TYPE_LOOKUP}
     * @param libraryTypeCode The value of libraryTypeCode as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setLibraryTypeCode_NotEqual(String libraryTypeCode) {
        doSetLibraryTypeCode_NotEqual(fRES(libraryTypeCode));
    }

    protected void doSetLibraryTypeCode_NotEqual(String libraryTypeCode) {
        regLibraryTypeCode(CK_NES, libraryTypeCode);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * LIBRARY_TYPE_CODE: {IX, NotNull, CHAR(3), FK to LIBRARY_TYPE_LOOKUP}
     * @param libraryTypeCode The value of libraryTypeCode as greaterThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setLibraryTypeCode_GreaterThan(String libraryTypeCode) {
        regLibraryTypeCode(CK_GT, fRES(libraryTypeCode));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * LIBRARY_TYPE_CODE: {IX, NotNull, CHAR(3), FK to LIBRARY_TYPE_LOOKUP}
     * @param libraryTypeCode The value of libraryTypeCode as lessThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setLibraryTypeCode_LessThan(String libraryTypeCode) {
        regLibraryTypeCode(CK_LT, fRES(libraryTypeCode));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * LIBRARY_TYPE_CODE: {IX, NotNull, CHAR(3), FK to LIBRARY_TYPE_LOOKUP}
     * @param libraryTypeCode The value of libraryTypeCode as greaterEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setLibraryTypeCode_GreaterEqual(String libraryTypeCode) {
        regLibraryTypeCode(CK_GE, fRES(libraryTypeCode));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * LIBRARY_TYPE_CODE: {IX, NotNull, CHAR(3), FK to LIBRARY_TYPE_LOOKUP}
     * @param libraryTypeCode The value of libraryTypeCode as lessEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setLibraryTypeCode_LessEqual(String libraryTypeCode) {
        regLibraryTypeCode(CK_LE, fRES(libraryTypeCode));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * LIBRARY_TYPE_CODE: {IX, NotNull, CHAR(3), FK to LIBRARY_TYPE_LOOKUP}
     * @param libraryTypeCodeList The collection of libraryTypeCode as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setLibraryTypeCode_InScope(Collection<String> libraryTypeCodeList) {
        doSetLibraryTypeCode_InScope(libraryTypeCodeList);
    }

    public void doSetLibraryTypeCode_InScope(Collection<String> libraryTypeCodeList) {
        regINS(CK_INS, cTL(libraryTypeCodeList), getCValueLibraryTypeCode(), "LIBRARY_TYPE_CODE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * LIBRARY_TYPE_CODE: {IX, NotNull, CHAR(3), FK to LIBRARY_TYPE_LOOKUP}
     * @param libraryTypeCodeList The collection of libraryTypeCode as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setLibraryTypeCode_NotInScope(Collection<String> libraryTypeCodeList) {
        doSetLibraryTypeCode_NotInScope(libraryTypeCodeList);
    }

    public void doSetLibraryTypeCode_NotInScope(Collection<String> libraryTypeCodeList) {
        regINS(CK_NINS, cTL(libraryTypeCodeList), getCValueLibraryTypeCode(), "LIBRARY_TYPE_CODE");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * LIBRARY_TYPE_CODE: {IX, NotNull, CHAR(3), FK to LIBRARY_TYPE_LOOKUP}
     * @param libraryTypeCode The value of libraryTypeCode as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setLibraryTypeCode_PrefixSearch(String libraryTypeCode) {
        setLibraryTypeCode_LikeSearch(libraryTypeCode, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * LIBRARY_TYPE_CODE: {IX, NotNull, CHAR(3), FK to LIBRARY_TYPE_LOOKUP} <br />
     * <pre>e.g. setLibraryTypeCode_LikeSearch("xxx", new <span style="color: #DD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param libraryTypeCode The value of libraryTypeCode as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLibraryTypeCode_LikeSearch(String libraryTypeCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(libraryTypeCode), getCValueLibraryTypeCode(), "LIBRARY_TYPE_CODE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * LIBRARY_TYPE_CODE: {IX, NotNull, CHAR(3), FK to LIBRARY_TYPE_LOOKUP}
     * @param libraryTypeCode The value of libraryTypeCode as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLibraryTypeCode_NotLikeSearch(String libraryTypeCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(libraryTypeCode), getCValueLibraryTypeCode(), "LIBRARY_TYPE_CODE", likeSearchOption);
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select LIBRARY_TYPE_CODE from LIBRARY_TYPE_LOOKUP where ...)} <br />
     * LIBRARY_TYPE_LOOKUP by my LIBRARY_TYPE_CODE, named 'libraryTypeLookup'.
     * @param subQuery The sub-query of LibraryTypeLookup for 'in-scope'. (NotNull)
     */
    public void inScopeLibraryTypeLookup(SubQuery<LdLibraryTypeLookupCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        LdLibraryTypeLookupCB cb = new LdLibraryTypeLookupCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepLibraryTypeCode_InScopeRelation_LibraryTypeLookup(cb.query());
        registerInScopeRelation(cb.query(), "LIBRARY_TYPE_CODE", "LIBRARY_TYPE_CODE", pp, "libraryTypeLookup");
    }
    public abstract String keepLibraryTypeCode_InScopeRelation_LibraryTypeLookup(LdLibraryTypeLookupCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select LIBRARY_TYPE_CODE from LIBRARY_TYPE_LOOKUP where ...)} <br />
     * LIBRARY_TYPE_LOOKUP by my LIBRARY_TYPE_CODE, named 'libraryTypeLookup'.
     * @param subQuery The sub-query of LibraryTypeLookup for 'not in-scope'. (NotNull)
     */
    public void notInScopeLibraryTypeLookup(SubQuery<LdLibraryTypeLookupCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        LdLibraryTypeLookupCB cb = new LdLibraryTypeLookupCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepLibraryTypeCode_NotInScopeRelation_LibraryTypeLookup(cb.query());
        registerNotInScopeRelation(cb.query(), "LIBRARY_TYPE_CODE", "LIBRARY_TYPE_CODE", pp, "libraryTypeLookup");
    }
    public abstract String keepLibraryTypeCode_NotInScopeRelation_LibraryTypeLookup(LdLibraryTypeLookupCQ sq);

    protected void regLibraryTypeCode(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueLibraryTypeCode(), "LIBRARY_TYPE_CODE"); }
    protected abstract ConditionValue getCValueLibraryTypeCode();

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
     * cb.query().<span style="color: #DD4747">scalar_Equal()</span>.max(new SubQuery&lt;LdLibraryCB&gt;() {
     *     public void query(LdLibraryCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<LdLibraryCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ.getOperand(), LdLibraryCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;LdLibraryCB&gt;() {
     *     public void query(LdLibraryCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<LdLibraryCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES.getOperand(), LdLibraryCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;LdLibraryCB&gt;() {
     *     public void query(LdLibraryCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<LdLibraryCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT.getOperand(), LdLibraryCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessThan()</span>.max(new SubQuery&lt;LdLibraryCB&gt;() {
     *     public void query(LdLibraryCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<LdLibraryCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT.getOperand(), LdLibraryCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;LdLibraryCB&gt;() {
     *     public void query(LdLibraryCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<LdLibraryCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE.getOperand(), LdLibraryCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;LdLibraryCB&gt;() {
     *     public void query(LdLibraryCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<LdLibraryCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE.getOperand(), LdLibraryCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSSQOption<CB> op) {
        assertObjectNotNull("subQuery", sq);
        LdLibraryCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        op.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, op);
    }
    public abstract String keepScalarCondition(LdLibraryCQ sq);

    protected LdLibraryCB xcreateScalarConditionCB() {
        LdLibraryCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected LdLibraryCB xcreateScalarConditionPartitionByCB() {
        LdLibraryCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<LdLibraryCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        LdLibraryCB cb = new LdLibraryCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        String pp = keepSpecifyMyselfDerived(cb.query());
        String pk = "LIBRARY_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(LdLibraryCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<LdLibraryCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(LdLibraryCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        LdLibraryCB cb = new LdLibraryCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "LIBRARY_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(LdLibraryCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subQuery The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<LdLibraryCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        LdLibraryCB cb = new LdLibraryCB(); cb.xsetupForMyselfExists(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(LdLibraryCQ sq);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (sub-query).
     * @param subQuery The implementation of sub-query. (NotNull)
     */
    public void myselfInScope(SubQuery<LdLibraryCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        LdLibraryCB cb = new LdLibraryCB(); cb.xsetupForMyselfInScope(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepMyselfInScope(cb.query());
        registerMyselfInScope(cb.query(), pp);
    }
    public abstract String keepMyselfInScope(LdLibraryCQ sq);

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
    protected LdLibraryCB newMyCB() {
        return new LdLibraryCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabCQ() { return LdLibraryCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
