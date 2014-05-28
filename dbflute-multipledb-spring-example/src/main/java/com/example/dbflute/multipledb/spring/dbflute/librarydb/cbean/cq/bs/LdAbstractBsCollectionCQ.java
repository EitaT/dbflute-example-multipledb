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
 * The abstract condition-query of COLLECTION.
 * @author DBFlute(AutoGenerator)
 */
public abstract class LdAbstractBsCollectionCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public LdAbstractBsCollectionCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "COLLECTION";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * COLLECTION_ID: {PK, ID, NotNull, INTEGER(10)}
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
     * COLLECTION_ID: {PK, ID, NotNull, INTEGER(10)}
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
     * COLLECTION_ID: {PK, ID, NotNull, INTEGER(10)}
     * @param collectionId The value of collectionId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setCollectionId_GreaterThan(Integer collectionId) {
        regCollectionId(CK_GT, collectionId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * COLLECTION_ID: {PK, ID, NotNull, INTEGER(10)}
     * @param collectionId The value of collectionId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setCollectionId_LessThan(Integer collectionId) {
        regCollectionId(CK_LT, collectionId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * COLLECTION_ID: {PK, ID, NotNull, INTEGER(10)}
     * @param collectionId The value of collectionId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setCollectionId_GreaterEqual(Integer collectionId) {
        regCollectionId(CK_GE, collectionId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * COLLECTION_ID: {PK, ID, NotNull, INTEGER(10)}
     * @param collectionId The value of collectionId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setCollectionId_LessEqual(Integer collectionId) {
        regCollectionId(CK_LE, collectionId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * COLLECTION_ID: {PK, ID, NotNull, INTEGER(10)}
     * @param minNumber The min number of collectionId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of collectionId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setCollectionId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueCollectionId(), "COLLECTION_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * COLLECTION_ID: {PK, ID, NotNull, INTEGER(10)}
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
     * COLLECTION_ID: {PK, ID, NotNull, INTEGER(10)}
     * @param collectionIdList The collection of collectionId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setCollectionId_NotInScope(Collection<Integer> collectionIdList) {
        doSetCollectionId_NotInScope(collectionIdList);
    }

    protected void doSetCollectionId_NotInScope(Collection<Integer> collectionIdList) {
        regINS(CK_NINS, cTL(collectionIdList), getCValueCollectionId(), "COLLECTION_ID");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br />
     * {exists (select COLLECTION_ID from COLLECTION_STATUS where ...)} <br />
     * COLLECTION_STATUS by COLLECTION_ID, named 'collectionStatusAsOne'.
     * <pre>
     * cb.query().<span style="color: #DD4747">existsCollectionStatusAsOne</span>(new SubQuery&lt;LdCollectionStatusCB&gt;() {
     *     public void query(LdCollectionStatusCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of CollectionStatusAsOne for 'exists'. (NotNull)
     */
    public void existsCollectionStatusAsOne(SubQuery<LdCollectionStatusCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        LdCollectionStatusCB cb = new LdCollectionStatusCB(); cb.xsetupForExistsReferrer(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepCollectionId_ExistsReferrer_CollectionStatusAsOne(cb.query());
        registerExistsReferrer(cb.query(), "COLLECTION_ID", "COLLECTION_ID", pp, "collectionStatusAsOne");
    }
    public abstract String keepCollectionId_ExistsReferrer_CollectionStatusAsOne(LdCollectionStatusCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br />
     * {exists (select COLLECTION_ID from LENDING_COLLECTION where ...)} <br />
     * LENDING_COLLECTION by COLLECTION_ID, named 'lendingCollectionAsOne'.
     * <pre>
     * cb.query().<span style="color: #DD4747">existsLendingCollectionList</span>(new SubQuery&lt;LdLendingCollectionCB&gt;() {
     *     public void query(LdLendingCollectionCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of LendingCollectionList for 'exists'. (NotNull)
     */
    public void existsLendingCollectionList(SubQuery<LdLendingCollectionCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        LdLendingCollectionCB cb = new LdLendingCollectionCB(); cb.xsetupForExistsReferrer(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepCollectionId_ExistsReferrer_LendingCollectionList(cb.query());
        registerExistsReferrer(cb.query(), "COLLECTION_ID", "COLLECTION_ID", pp, "lendingCollectionList");
    }
    public abstract String keepCollectionId_ExistsReferrer_LendingCollectionList(LdLendingCollectionCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br />
     * {not exists (select COLLECTION_ID from COLLECTION_STATUS where ...)} <br />
     * COLLECTION_STATUS by COLLECTION_ID, named 'collectionStatusAsOne'.
     * <pre>
     * cb.query().<span style="color: #DD4747">notExistsCollectionStatusAsOne</span>(new SubQuery&lt;LdCollectionStatusCB&gt;() {
     *     public void query(LdCollectionStatusCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of CollectionId_NotExistsReferrer_CollectionStatusAsOne for 'not exists'. (NotNull)
     */
    public void notExistsCollectionStatusAsOne(SubQuery<LdCollectionStatusCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        LdCollectionStatusCB cb = new LdCollectionStatusCB(); cb.xsetupForExistsReferrer(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepCollectionId_NotExistsReferrer_CollectionStatusAsOne(cb.query());
        registerNotExistsReferrer(cb.query(), "COLLECTION_ID", "COLLECTION_ID", pp, "collectionStatusAsOne");
    }
    public abstract String keepCollectionId_NotExistsReferrer_CollectionStatusAsOne(LdCollectionStatusCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br />
     * {not exists (select COLLECTION_ID from LENDING_COLLECTION where ...)} <br />
     * LENDING_COLLECTION by COLLECTION_ID, named 'lendingCollectionAsOne'.
     * <pre>
     * cb.query().<span style="color: #DD4747">notExistsLendingCollectionList</span>(new SubQuery&lt;LdLendingCollectionCB&gt;() {
     *     public void query(LdLendingCollectionCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of CollectionId_NotExistsReferrer_LendingCollectionList for 'not exists'. (NotNull)
     */
    public void notExistsLendingCollectionList(SubQuery<LdLendingCollectionCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        LdLendingCollectionCB cb = new LdLendingCollectionCB(); cb.xsetupForExistsReferrer(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepCollectionId_NotExistsReferrer_LendingCollectionList(cb.query());
        registerNotExistsReferrer(cb.query(), "COLLECTION_ID", "COLLECTION_ID", pp, "lendingCollectionList");
    }
    public abstract String keepCollectionId_NotExistsReferrer_LendingCollectionList(LdLendingCollectionCQ sq);

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select COLLECTION_ID from COLLECTION_STATUS where ...)} <br />
     * COLLECTION_STATUS by COLLECTION_ID, named 'collectionStatusAsOne'.
     * @param subQuery The sub-query of CollectionStatusAsOne for 'in-scope'. (NotNull)
     */
    public void inScopeCollectionStatusAsOne(SubQuery<LdCollectionStatusCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        LdCollectionStatusCB cb = new LdCollectionStatusCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepCollectionId_InScopeRelation_CollectionStatusAsOne(cb.query());
        registerInScopeRelation(cb.query(), "COLLECTION_ID", "COLLECTION_ID", pp, "collectionStatusAsOne");
    }
    public abstract String keepCollectionId_InScopeRelation_CollectionStatusAsOne(LdCollectionStatusCQ sq);

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select COLLECTION_ID from LENDING_COLLECTION where ...)} <br />
     * LENDING_COLLECTION by COLLECTION_ID, named 'lendingCollectionAsOne'.
     * @param subQuery The sub-query of LendingCollectionList for 'in-scope'. (NotNull)
     */
    public void inScopeLendingCollectionList(SubQuery<LdLendingCollectionCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        LdLendingCollectionCB cb = new LdLendingCollectionCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepCollectionId_InScopeRelation_LendingCollectionList(cb.query());
        registerInScopeRelation(cb.query(), "COLLECTION_ID", "COLLECTION_ID", pp, "lendingCollectionList");
    }
    public abstract String keepCollectionId_InScopeRelation_LendingCollectionList(LdLendingCollectionCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select COLLECTION_ID from COLLECTION_STATUS where ...)} <br />
     * COLLECTION_STATUS by COLLECTION_ID, named 'collectionStatusAsOne'.
     * @param subQuery The sub-query of CollectionStatusAsOne for 'not in-scope'. (NotNull)
     */
    public void notInScopeCollectionStatusAsOne(SubQuery<LdCollectionStatusCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        LdCollectionStatusCB cb = new LdCollectionStatusCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepCollectionId_NotInScopeRelation_CollectionStatusAsOne(cb.query());
        registerNotInScopeRelation(cb.query(), "COLLECTION_ID", "COLLECTION_ID", pp, "collectionStatusAsOne");
    }
    public abstract String keepCollectionId_NotInScopeRelation_CollectionStatusAsOne(LdCollectionStatusCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select COLLECTION_ID from LENDING_COLLECTION where ...)} <br />
     * LENDING_COLLECTION by COLLECTION_ID, named 'lendingCollectionAsOne'.
     * @param subQuery The sub-query of LendingCollectionList for 'not in-scope'. (NotNull)
     */
    public void notInScopeLendingCollectionList(SubQuery<LdLendingCollectionCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        LdLendingCollectionCB cb = new LdLendingCollectionCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepCollectionId_NotInScopeRelation_LendingCollectionList(cb.query());
        registerNotInScopeRelation(cb.query(), "COLLECTION_ID", "COLLECTION_ID", pp, "lendingCollectionList");
    }
    public abstract String keepCollectionId_NotInScopeRelation_LendingCollectionList(LdLendingCollectionCQ sq);

    public void xsderiveLendingCollectionList(String fn, SubQuery<LdLendingCollectionCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        LdLendingCollectionCB cb = new LdLendingCollectionCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        String pp = keepCollectionId_SpecifyDerivedReferrer_LendingCollectionList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "COLLECTION_ID", "COLLECTION_ID", pp, "lendingCollectionList", al, op);
    }
    public abstract String keepCollectionId_SpecifyDerivedReferrer_LendingCollectionList(LdLendingCollectionCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br />
     * {FOO &lt;= (select max(BAR) from LENDING_COLLECTION where ...)} <br />
     * LENDING_COLLECTION by COLLECTION_ID, named 'lendingCollectionAsOne'.
     * <pre>
     * cb.query().<span style="color: #DD4747">derivedLendingCollectionList()</span>.<span style="color: #DD4747">max</span>(new SubQuery&lt;LdLendingCollectionCB&gt;() {
     *     public void query(LdLendingCollectionCB subCB) {
     *         subCB.specify().<span style="color: #DD4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *         subCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     *     }
     * }).<span style="color: #DD4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<LdLendingCollectionCB> derivedLendingCollectionList() {
        return xcreateQDRFunctionLendingCollectionList();
    }
    protected HpQDRFunction<LdLendingCollectionCB> xcreateQDRFunctionLendingCollectionList() {
        return new HpQDRFunction<LdLendingCollectionCB>(new HpQDRSetupper<LdLendingCollectionCB>() {
            public void setup(String fn, SubQuery<LdLendingCollectionCB> sq, String rd, Object vl, DerivedReferrerOption op) {
                xqderiveLendingCollectionList(fn, sq, rd, vl, op);
            }
        });
    }
    public void xqderiveLendingCollectionList(String fn, SubQuery<LdLendingCollectionCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        LdLendingCollectionCB cb = new LdLendingCollectionCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        String sqpp = keepCollectionId_QueryDerivedReferrer_LendingCollectionList(cb.query()); String prpp = keepCollectionId_QueryDerivedReferrer_LendingCollectionListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "COLLECTION_ID", "COLLECTION_ID", sqpp, "lendingCollectionList", rd, vl, prpp, op);
    }
    public abstract String keepCollectionId_QueryDerivedReferrer_LendingCollectionList(LdLendingCollectionCQ sq);
    public abstract String keepCollectionId_QueryDerivedReferrer_LendingCollectionListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * COLLECTION_ID: {PK, ID, NotNull, INTEGER(10)}
     */
    public void setCollectionId_IsNull() { regCollectionId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * COLLECTION_ID: {PK, ID, NotNull, INTEGER(10)}
     */
    public void setCollectionId_IsNotNull() { regCollectionId(CK_ISNN, DOBJ); }

    protected void regCollectionId(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueCollectionId(), "COLLECTION_ID"); }
    protected abstract ConditionValue getCValueCollectionId();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * LIBRARY_ID: {UQ+, IX, NotNull, SMALLINT(5), FK to LIBRARY}
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
     * LIBRARY_ID: {UQ+, IX, NotNull, SMALLINT(5), FK to LIBRARY}
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
     * LIBRARY_ID: {UQ+, IX, NotNull, SMALLINT(5), FK to LIBRARY}
     * @param libraryId The value of libraryId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setLibraryId_GreaterThan(Integer libraryId) {
        regLibraryId(CK_GT, libraryId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * LIBRARY_ID: {UQ+, IX, NotNull, SMALLINT(5), FK to LIBRARY}
     * @param libraryId The value of libraryId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setLibraryId_LessThan(Integer libraryId) {
        regLibraryId(CK_LT, libraryId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * LIBRARY_ID: {UQ+, IX, NotNull, SMALLINT(5), FK to LIBRARY}
     * @param libraryId The value of libraryId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setLibraryId_GreaterEqual(Integer libraryId) {
        regLibraryId(CK_GE, libraryId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * LIBRARY_ID: {UQ+, IX, NotNull, SMALLINT(5), FK to LIBRARY}
     * @param libraryId The value of libraryId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setLibraryId_LessEqual(Integer libraryId) {
        regLibraryId(CK_LE, libraryId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * LIBRARY_ID: {UQ+, IX, NotNull, SMALLINT(5), FK to LIBRARY}
     * @param minNumber The min number of libraryId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of libraryId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setLibraryId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueLibraryId(), "LIBRARY_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * LIBRARY_ID: {UQ+, IX, NotNull, SMALLINT(5), FK to LIBRARY}
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
     * LIBRARY_ID: {UQ+, IX, NotNull, SMALLINT(5), FK to LIBRARY}
     * @param libraryIdList The collection of libraryId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setLibraryId_NotInScope(Collection<Integer> libraryIdList) {
        doSetLibraryId_NotInScope(libraryIdList);
    }

    protected void doSetLibraryId_NotInScope(Collection<Integer> libraryIdList) {
        regINS(CK_NINS, cTL(libraryIdList), getCValueLibraryId(), "LIBRARY_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select LIBRARY_ID from LIBRARY where ...)} <br />
     * LIBRARY by my LIBRARY_ID, named 'library'.
     * @param subQuery The sub-query of Library for 'in-scope'. (NotNull)
     */
    public void inScopeLibrary(SubQuery<LdLibraryCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        LdLibraryCB cb = new LdLibraryCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepLibraryId_InScopeRelation_Library(cb.query());
        registerInScopeRelation(cb.query(), "LIBRARY_ID", "LIBRARY_ID", pp, "library");
    }
    public abstract String keepLibraryId_InScopeRelation_Library(LdLibraryCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select LIBRARY_ID from LIBRARY where ...)} <br />
     * LIBRARY by my LIBRARY_ID, named 'library'.
     * @param subQuery The sub-query of Library for 'not in-scope'. (NotNull)
     */
    public void notInScopeLibrary(SubQuery<LdLibraryCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        LdLibraryCB cb = new LdLibraryCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepLibraryId_NotInScopeRelation_Library(cb.query());
        registerNotInScopeRelation(cb.query(), "LIBRARY_ID", "LIBRARY_ID", pp, "library");
    }
    public abstract String keepLibraryId_NotInScopeRelation_Library(LdLibraryCQ sq);

    protected void regLibraryId(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueLibraryId(), "LIBRARY_ID"); }
    protected abstract ConditionValue getCValueLibraryId();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * BOOK_ID: {+UQ, IX, NotNull, INTEGER(10), FK to BOOK}
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
     * BOOK_ID: {+UQ, IX, NotNull, INTEGER(10), FK to BOOK}
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
     * BOOK_ID: {+UQ, IX, NotNull, INTEGER(10), FK to BOOK}
     * @param bookId The value of bookId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setBookId_GreaterThan(Integer bookId) {
        regBookId(CK_GT, bookId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * BOOK_ID: {+UQ, IX, NotNull, INTEGER(10), FK to BOOK}
     * @param bookId The value of bookId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setBookId_LessThan(Integer bookId) {
        regBookId(CK_LT, bookId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * BOOK_ID: {+UQ, IX, NotNull, INTEGER(10), FK to BOOK}
     * @param bookId The value of bookId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setBookId_GreaterEqual(Integer bookId) {
        regBookId(CK_GE, bookId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * BOOK_ID: {+UQ, IX, NotNull, INTEGER(10), FK to BOOK}
     * @param bookId The value of bookId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setBookId_LessEqual(Integer bookId) {
        regBookId(CK_LE, bookId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * BOOK_ID: {+UQ, IX, NotNull, INTEGER(10), FK to BOOK}
     * @param minNumber The min number of bookId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of bookId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setBookId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueBookId(), "BOOK_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * BOOK_ID: {+UQ, IX, NotNull, INTEGER(10), FK to BOOK}
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
     * BOOK_ID: {+UQ, IX, NotNull, INTEGER(10), FK to BOOK}
     * @param bookIdList The collection of bookId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setBookId_NotInScope(Collection<Integer> bookIdList) {
        doSetBookId_NotInScope(bookIdList);
    }

    protected void doSetBookId_NotInScope(Collection<Integer> bookIdList) {
        regINS(CK_NINS, cTL(bookIdList), getCValueBookId(), "BOOK_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select BOOK_ID from BOOK where ...)} <br />
     * BOOK by my BOOK_ID, named 'book'.
     * @param subQuery The sub-query of Book for 'in-scope'. (NotNull)
     */
    public void inScopeBook(SubQuery<LdBookCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        LdBookCB cb = new LdBookCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepBookId_InScopeRelation_Book(cb.query());
        registerInScopeRelation(cb.query(), "BOOK_ID", "BOOK_ID", pp, "book");
    }
    public abstract String keepBookId_InScopeRelation_Book(LdBookCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select BOOK_ID from BOOK where ...)} <br />
     * BOOK by my BOOK_ID, named 'book'.
     * @param subQuery The sub-query of Book for 'not in-scope'. (NotNull)
     */
    public void notInScopeBook(SubQuery<LdBookCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        LdBookCB cb = new LdBookCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepBookId_NotInScopeRelation_Book(cb.query());
        registerNotInScopeRelation(cb.query(), "BOOK_ID", "BOOK_ID", pp, "book");
    }
    public abstract String keepBookId_NotInScopeRelation_Book(LdBookCQ sq);

    protected void regBookId(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueBookId(), "BOOK_ID"); }
    protected abstract ConditionValue getCValueBookId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * ARRIVAL_DATE: {NotNull, TIMESTAMP(26, 6)}
     * @param arrivalDate The value of arrivalDate as equal. (NullAllowed: if null, no condition)
     */
    public void setArrivalDate_Equal(java.sql.Timestamp arrivalDate) {
        regArrivalDate(CK_EQ,  arrivalDate);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * ARRIVAL_DATE: {NotNull, TIMESTAMP(26, 6)}
     * @param arrivalDate The value of arrivalDate as notEqual. (NullAllowed: if null, no condition)
     */
    public void setArrivalDate_NotEqual(java.sql.Timestamp arrivalDate) {
        regArrivalDate(CK_NES,  arrivalDate);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * ARRIVAL_DATE: {NotNull, TIMESTAMP(26, 6)}
     * @param arrivalDate The value of arrivalDate as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setArrivalDate_GreaterThan(java.sql.Timestamp arrivalDate) {
        regArrivalDate(CK_GT,  arrivalDate);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * ARRIVAL_DATE: {NotNull, TIMESTAMP(26, 6)}
     * @param arrivalDate The value of arrivalDate as lessThan. (NullAllowed: if null, no condition)
     */
    public void setArrivalDate_LessThan(java.sql.Timestamp arrivalDate) {
        regArrivalDate(CK_LT,  arrivalDate);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * ARRIVAL_DATE: {NotNull, TIMESTAMP(26, 6)}
     * @param arrivalDate The value of arrivalDate as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setArrivalDate_GreaterEqual(java.sql.Timestamp arrivalDate) {
        regArrivalDate(CK_GE,  arrivalDate);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * ARRIVAL_DATE: {NotNull, TIMESTAMP(26, 6)}
     * @param arrivalDate The value of arrivalDate as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setArrivalDate_LessEqual(java.sql.Timestamp arrivalDate) {
        regArrivalDate(CK_LE, arrivalDate);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * ARRIVAL_DATE: {NotNull, TIMESTAMP(26, 6)}
     * <pre>e.g. setArrivalDate_FromTo(fromDate, toDate, new <span style="color: #DD4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of arrivalDate. (NullAllowed: if null, no from-condition)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of arrivalDate. (NullAllowed: if null, no to-condition)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setArrivalDate_FromTo(Date fromDatetime, Date toDatetime, FromToOption fromToOption) {
        regFTQ((fromDatetime != null ? new java.sql.Timestamp(fromDatetime.getTime()) : null), (toDatetime != null ? new java.sql.Timestamp(toDatetime.getTime()) : null), getCValueArrivalDate(), "ARRIVAL_DATE", fromToOption);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) {fromDate &lt;= column &lt; toDate + 1 day} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * ARRIVAL_DATE: {NotNull, TIMESTAMP(26, 6)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #DD4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of arrivalDate. (NullAllowed: if null, no from-condition)
     * @param toDate The to-date(yyyy/MM/dd) of arrivalDate. (NullAllowed: if null, no to-condition)
     */
    public void setArrivalDate_DateFromTo(Date fromDate, Date toDate) {
        setArrivalDate_FromTo(fromDate, toDate, new FromToOption().compareAsDate());
    }

    /**
     * InScope {in ('1965-03-03', '1966-09-15')}. And NullOrEmptyIgnored, NullElementIgnored, SeveralRegistered. <br />
     * ARRIVAL_DATE: {NotNull, TIMESTAMP(26, 6)}
     * @param arrivalDateList The collection of arrivalDate as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setArrivalDate_InScope(Collection<java.sql.Timestamp> arrivalDateList) {
        doSetArrivalDate_InScope(arrivalDateList);
    }

    protected void doSetArrivalDate_InScope(Collection<java.sql.Timestamp> arrivalDateList) {
        regINS(CK_INS, cTL(arrivalDateList), getCValueArrivalDate(), "ARRIVAL_DATE");
    }

    /**
     * NotInScope {not in ('1965-03-03', '1966-09-15')}. And NullOrEmptyIgnored, NullElementIgnored, SeveralRegistered. <br />
     * ARRIVAL_DATE: {NotNull, TIMESTAMP(26, 6)}
     * @param arrivalDateList The collection of arrivalDate as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setArrivalDate_NotInScope(Collection<java.sql.Timestamp> arrivalDateList) {
        doSetArrivalDate_NotInScope(arrivalDateList);
    }

    protected void doSetArrivalDate_NotInScope(Collection<java.sql.Timestamp> arrivalDateList) {
        regINS(CK_NINS, cTL(arrivalDateList), getCValueArrivalDate(), "ARRIVAL_DATE");
    }

    protected void regArrivalDate(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueArrivalDate(), "ARRIVAL_DATE"); }
    protected abstract ConditionValue getCValueArrivalDate();

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
     * <pre>e.g. setRModule_LikeSearch("xxx", new <span style="color: #DD4747">LikeSearchOption</span>().likeContain());</pre>
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
     * <pre>e.g. setUModule_LikeSearch("xxx", new <span style="color: #DD4747">LikeSearchOption</span>().likeContain());</pre>
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
     * cb.query().<span style="color: #DD4747">scalar_Equal()</span>.max(new SubQuery&lt;LdCollectionCB&gt;() {
     *     public void query(LdCollectionCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<LdCollectionCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ.getOperand(), LdCollectionCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;LdCollectionCB&gt;() {
     *     public void query(LdCollectionCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<LdCollectionCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES.getOperand(), LdCollectionCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;LdCollectionCB&gt;() {
     *     public void query(LdCollectionCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<LdCollectionCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT.getOperand(), LdCollectionCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessThan()</span>.max(new SubQuery&lt;LdCollectionCB&gt;() {
     *     public void query(LdCollectionCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<LdCollectionCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT.getOperand(), LdCollectionCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;LdCollectionCB&gt;() {
     *     public void query(LdCollectionCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<LdCollectionCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE.getOperand(), LdCollectionCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;LdCollectionCB&gt;() {
     *     public void query(LdCollectionCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<LdCollectionCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE.getOperand(), LdCollectionCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSSQOption<CB> op) {
        assertObjectNotNull("subQuery", sq);
        LdCollectionCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        op.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, op);
    }
    public abstract String keepScalarCondition(LdCollectionCQ sq);

    protected LdCollectionCB xcreateScalarConditionCB() {
        LdCollectionCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected LdCollectionCB xcreateScalarConditionPartitionByCB() {
        LdCollectionCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<LdCollectionCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        LdCollectionCB cb = new LdCollectionCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        String pp = keepSpecifyMyselfDerived(cb.query());
        String pk = "COLLECTION_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(LdCollectionCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<LdCollectionCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(LdCollectionCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        LdCollectionCB cb = new LdCollectionCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "COLLECTION_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(LdCollectionCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subQuery The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<LdCollectionCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        LdCollectionCB cb = new LdCollectionCB(); cb.xsetupForMyselfExists(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(LdCollectionCQ sq);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (sub-query).
     * @param subQuery The implementation of sub-query. (NotNull)
     */
    public void myselfInScope(SubQuery<LdCollectionCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        LdCollectionCB cb = new LdCollectionCB(); cb.xsetupForMyselfInScope(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepMyselfInScope(cb.query());
        registerMyselfInScope(cb.query(), pp);
    }
    public abstract String keepMyselfInScope(LdCollectionCQ sq);

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
    protected LdCollectionCB newMyCB() {
        return new LdCollectionCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabCQ() { return LdCollectionCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
