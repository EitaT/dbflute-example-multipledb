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
 * The abstract condition-query of COLLECTION.
 * @author DBFlute(AutoGenerator)
 */
public abstract class LdAbstractBsCollectionCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public LdAbstractBsCollectionCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
     * Set up ExistsReferrer (co-related sub-query). <br />
     * {exists (select COLLECTION_ID from COLLECTION_STATUS where ...)} <br />
     * COLLECTION_STATUS by COLLECTION_ID, named 'collectionStatusAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">existsCollectionStatusAsOne</span>(new SubQuery&lt;LdCollectionStatusCB&gt;() {
     *     public void query(LdCollectionStatusCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of CollectionStatusAsOne for 'exists'. (NotNull)
     */
    public void existsCollectionStatusAsOne(SubQuery<LdCollectionStatusCB> subQuery) {
        assertObjectNotNull("subQuery<LdCollectionStatusCB>", subQuery);
        LdCollectionStatusCB cb = new LdCollectionStatusCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepCollectionId_ExistsReferrer_CollectionStatusAsOne(cb.query()); // for saving query-value.
        registerExistsReferrer(cb.query(), "COLLECTION_ID", "COLLECTION_ID", subQueryPropertyName, "collectionStatusAsOne");
    }
    public abstract String keepCollectionId_ExistsReferrer_CollectionStatusAsOne(LdCollectionStatusCQ subQuery);

    /**
     * Set up ExistsReferrer (co-related sub-query). <br />
     * {exists (select COLLECTION_ID from LENDING_COLLECTION where ...)} <br />
     * LENDING_COLLECTION by COLLECTION_ID, named 'lendingCollectionAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">existsLendingCollectionList</span>(new SubQuery&lt;LdLendingCollectionCB&gt;() {
     *     public void query(LdLendingCollectionCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of LendingCollectionList for 'exists'. (NotNull)
     */
    public void existsLendingCollectionList(SubQuery<LdLendingCollectionCB> subQuery) {
        assertObjectNotNull("subQuery<LdLendingCollectionCB>", subQuery);
        LdLendingCollectionCB cb = new LdLendingCollectionCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepCollectionId_ExistsReferrer_LendingCollectionList(cb.query()); // for saving query-value.
        registerExistsReferrer(cb.query(), "COLLECTION_ID", "COLLECTION_ID", subQueryPropertyName, "lendingCollectionList");
    }
    public abstract String keepCollectionId_ExistsReferrer_LendingCollectionList(LdLendingCollectionCQ subQuery);

    /**
     * Set up NotExistsReferrer (co-related sub-query). <br />
     * {not exists (select COLLECTION_ID from COLLECTION_STATUS where ...)} <br />
     * COLLECTION_STATUS by COLLECTION_ID, named 'collectionStatusAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">notExistsCollectionStatusAsOne</span>(new SubQuery&lt;LdCollectionStatusCB&gt;() {
     *     public void query(LdCollectionStatusCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of CollectionId_NotExistsReferrer_CollectionStatusAsOne for 'not exists'. (NotNull)
     */
    public void notExistsCollectionStatusAsOne(SubQuery<LdCollectionStatusCB> subQuery) {
        assertObjectNotNull("subQuery<LdCollectionStatusCB>", subQuery);
        LdCollectionStatusCB cb = new LdCollectionStatusCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepCollectionId_NotExistsReferrer_CollectionStatusAsOne(cb.query()); // for saving query-value.
        registerNotExistsReferrer(cb.query(), "COLLECTION_ID", "COLLECTION_ID", subQueryPropertyName, "collectionStatusAsOne");
    }
    public abstract String keepCollectionId_NotExistsReferrer_CollectionStatusAsOne(LdCollectionStatusCQ subQuery);

    /**
     * Set up NotExistsReferrer (co-related sub-query). <br />
     * {not exists (select COLLECTION_ID from LENDING_COLLECTION where ...)} <br />
     * LENDING_COLLECTION by COLLECTION_ID, named 'lendingCollectionAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">notExistsLendingCollectionList</span>(new SubQuery&lt;LdLendingCollectionCB&gt;() {
     *     public void query(LdLendingCollectionCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of CollectionId_NotExistsReferrer_LendingCollectionList for 'not exists'. (NotNull)
     */
    public void notExistsLendingCollectionList(SubQuery<LdLendingCollectionCB> subQuery) {
        assertObjectNotNull("subQuery<LdLendingCollectionCB>", subQuery);
        LdLendingCollectionCB cb = new LdLendingCollectionCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepCollectionId_NotExistsReferrer_LendingCollectionList(cb.query()); // for saving query-value.
        registerNotExistsReferrer(cb.query(), "COLLECTION_ID", "COLLECTION_ID", subQueryPropertyName, "lendingCollectionList");
    }
    public abstract String keepCollectionId_NotExistsReferrer_LendingCollectionList(LdLendingCollectionCQ subQuery);

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select COLLECTION_ID from COLLECTION_STATUS where ...)} <br />
     * COLLECTION_STATUS by COLLECTION_ID, named 'collectionStatusAsOne'.
     * @param subQuery The sub-query of CollectionStatusAsOne for 'in-scope'. (NotNull)
     */
    public void inScopeCollectionStatusAsOne(SubQuery<LdCollectionStatusCB> subQuery) {
        assertObjectNotNull("subQuery<LdCollectionStatusCB>", subQuery);
        LdCollectionStatusCB cb = new LdCollectionStatusCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepCollectionId_InScopeRelation_CollectionStatusAsOne(cb.query()); // for saving query-value.
        registerInScopeRelation(cb.query(), "COLLECTION_ID", "COLLECTION_ID", subQueryPropertyName, "collectionStatusAsOne");
    }
    public abstract String keepCollectionId_InScopeRelation_CollectionStatusAsOne(LdCollectionStatusCQ subQuery);

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select COLLECTION_ID from LENDING_COLLECTION where ...)} <br />
     * LENDING_COLLECTION by COLLECTION_ID, named 'lendingCollectionAsOne'.
     * @param subQuery The sub-query of LendingCollectionList for 'in-scope'. (NotNull)
     */
    public void inScopeLendingCollectionList(SubQuery<LdLendingCollectionCB> subQuery) {
        assertObjectNotNull("subQuery<LdLendingCollectionCB>", subQuery);
        LdLendingCollectionCB cb = new LdLendingCollectionCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepCollectionId_InScopeRelation_LendingCollectionList(cb.query()); // for saving query-value.
        registerInScopeRelation(cb.query(), "COLLECTION_ID", "COLLECTION_ID", subQueryPropertyName, "lendingCollectionList");
    }
    public abstract String keepCollectionId_InScopeRelation_LendingCollectionList(LdLendingCollectionCQ subQuery);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select COLLECTION_ID from COLLECTION_STATUS where ...)} <br />
     * COLLECTION_STATUS by COLLECTION_ID, named 'collectionStatusAsOne'.
     * @param subQuery The sub-query of CollectionStatusAsOne for 'not in-scope'. (NotNull)
     */
    public void notInScopeCollectionStatusAsOne(SubQuery<LdCollectionStatusCB> subQuery) {
        assertObjectNotNull("subQuery<LdCollectionStatusCB>", subQuery);
        LdCollectionStatusCB cb = new LdCollectionStatusCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepCollectionId_NotInScopeRelation_CollectionStatusAsOne(cb.query()); // for saving query-value.
        registerNotInScopeRelation(cb.query(), "COLLECTION_ID", "COLLECTION_ID", subQueryPropertyName, "collectionStatusAsOne");
    }
    public abstract String keepCollectionId_NotInScopeRelation_CollectionStatusAsOne(LdCollectionStatusCQ subQuery);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select COLLECTION_ID from LENDING_COLLECTION where ...)} <br />
     * LENDING_COLLECTION by COLLECTION_ID, named 'lendingCollectionAsOne'.
     * @param subQuery The sub-query of LendingCollectionList for 'not in-scope'. (NotNull)
     */
    public void notInScopeLendingCollectionList(SubQuery<LdLendingCollectionCB> subQuery) {
        assertObjectNotNull("subQuery<LdLendingCollectionCB>", subQuery);
        LdLendingCollectionCB cb = new LdLendingCollectionCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepCollectionId_NotInScopeRelation_LendingCollectionList(cb.query()); // for saving query-value.
        registerNotInScopeRelation(cb.query(), "COLLECTION_ID", "COLLECTION_ID", subQueryPropertyName, "lendingCollectionList");
    }
    public abstract String keepCollectionId_NotInScopeRelation_LendingCollectionList(LdLendingCollectionCQ subQuery);

    public void xsderiveLendingCollectionList(String function, SubQuery<LdLendingCollectionCB> subQuery, String aliasName, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<LdLendingCollectionCB>", subQuery);
        LdLendingCollectionCB cb = new LdLendingCollectionCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepCollectionId_SpecifyDerivedReferrer_LendingCollectionList(cb.query()); // for saving query-value.
        registerSpecifyDerivedReferrer(function, cb.query(), "COLLECTION_ID", "COLLECTION_ID", subQueryPropertyName, "lendingCollectionList", aliasName, option);
    }
    public abstract String keepCollectionId_SpecifyDerivedReferrer_LendingCollectionList(LdLendingCollectionCQ subQuery);

    /**
     * Prepare for (Query)DerivedReferrer. <br />
     * {FOO &lt;= (select max(BAR) from LENDING_COLLECTION where ...)} <br />
     * LENDING_COLLECTION by COLLECTION_ID, named 'lendingCollectionAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">derivedLendingCollectionList()</span>.<span style="color: #FD4747">max</span>(new SubQuery&lt;LdLendingCollectionCB&gt;() {
     *     public void query(LdLendingCollectionCB subCB) {
     *         subCB.specify().<span style="color: #FD4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *         subCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     *     }
     * }).<span style="color: #FD4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<LdLendingCollectionCB> derivedLendingCollectionList() {
        return xcreateQDRFunctionLendingCollectionList();
    }
    protected HpQDRFunction<LdLendingCollectionCB> xcreateQDRFunctionLendingCollectionList() {
        return new HpQDRFunction<LdLendingCollectionCB>(new HpQDRSetupper<LdLendingCollectionCB>() {
            public void setup(String function, SubQuery<LdLendingCollectionCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
                xqderiveLendingCollectionList(function, subQuery, operand, value, option);
            }
        });
    }
    public void xqderiveLendingCollectionList(String function, SubQuery<LdLendingCollectionCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<LdLendingCollectionCB>", subQuery);
        LdLendingCollectionCB cb = new LdLendingCollectionCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepCollectionId_QueryDerivedReferrer_LendingCollectionList(cb.query()); // for saving query-value.
        String parameterPropertyName = keepCollectionId_QueryDerivedReferrer_LendingCollectionListParameter(value);
        registerQueryDerivedReferrer(function, cb.query(), "COLLECTION_ID", "COLLECTION_ID", subQueryPropertyName, "lendingCollectionList", operand, value, parameterPropertyName, option);
    }
    public abstract String keepCollectionId_QueryDerivedReferrer_LendingCollectionList(LdLendingCollectionCQ subQuery);
    public abstract String keepCollectionId_QueryDerivedReferrer_LendingCollectionListParameter(Object parameterValue);

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

    protected void regCollectionId(ConditionKey k, Object v) { regQ(k, v, getCValueCollectionId(), "COLLECTION_ID"); }
    abstract protected ConditionValue getCValueCollectionId();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * LIBRARY_ID: {UQ, IX, NotNull, SMALLINT(5), FK to LIBRARY}
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
     * LIBRARY_ID: {UQ, IX, NotNull, SMALLINT(5), FK to LIBRARY}
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
     * LIBRARY_ID: {UQ, IX, NotNull, SMALLINT(5), FK to LIBRARY}
     * @param libraryId The value of libraryId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setLibraryId_GreaterThan(Integer libraryId) {
        regLibraryId(CK_GT, libraryId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * LIBRARY_ID: {UQ, IX, NotNull, SMALLINT(5), FK to LIBRARY}
     * @param libraryId The value of libraryId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setLibraryId_LessThan(Integer libraryId) {
        regLibraryId(CK_LT, libraryId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * LIBRARY_ID: {UQ, IX, NotNull, SMALLINT(5), FK to LIBRARY}
     * @param libraryId The value of libraryId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setLibraryId_GreaterEqual(Integer libraryId) {
        regLibraryId(CK_GE, libraryId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * LIBRARY_ID: {UQ, IX, NotNull, SMALLINT(5), FK to LIBRARY}
     * @param libraryId The value of libraryId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setLibraryId_LessEqual(Integer libraryId) {
        regLibraryId(CK_LE, libraryId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * LIBRARY_ID: {UQ, IX, NotNull, SMALLINT(5), FK to LIBRARY}
     * @param minNumber The min number of libraryId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of libraryId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setLibraryId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueLibraryId(), "LIBRARY_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * LIBRARY_ID: {UQ, IX, NotNull, SMALLINT(5), FK to LIBRARY}
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
     * LIBRARY_ID: {UQ, IX, NotNull, SMALLINT(5), FK to LIBRARY}
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
        assertObjectNotNull("subQuery<LdLibraryCB>", subQuery);
        LdLibraryCB cb = new LdLibraryCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepLibraryId_InScopeRelation_Library(cb.query()); // for saving query-value.
        registerInScopeRelation(cb.query(), "LIBRARY_ID", "LIBRARY_ID", subQueryPropertyName, "library");
    }
    public abstract String keepLibraryId_InScopeRelation_Library(LdLibraryCQ subQuery);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select LIBRARY_ID from LIBRARY where ...)} <br />
     * LIBRARY by my LIBRARY_ID, named 'library'.
     * @param subQuery The sub-query of Library for 'not in-scope'. (NotNull)
     */
    public void notInScopeLibrary(SubQuery<LdLibraryCB> subQuery) {
        assertObjectNotNull("subQuery<LdLibraryCB>", subQuery);
        LdLibraryCB cb = new LdLibraryCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepLibraryId_NotInScopeRelation_Library(cb.query()); // for saving query-value.
        registerNotInScopeRelation(cb.query(), "LIBRARY_ID", "LIBRARY_ID", subQueryPropertyName, "library");
    }
    public abstract String keepLibraryId_NotInScopeRelation_Library(LdLibraryCQ subQuery);

    protected void regLibraryId(ConditionKey k, Object v) { regQ(k, v, getCValueLibraryId(), "LIBRARY_ID"); }
    abstract protected ConditionValue getCValueLibraryId();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * BOOK_ID: {UQ+, IX, NotNull, INTEGER(10), FK to BOOK}
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
     * BOOK_ID: {UQ+, IX, NotNull, INTEGER(10), FK to BOOK}
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
     * BOOK_ID: {UQ+, IX, NotNull, INTEGER(10), FK to BOOK}
     * @param bookId The value of bookId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setBookId_GreaterThan(Integer bookId) {
        regBookId(CK_GT, bookId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * BOOK_ID: {UQ+, IX, NotNull, INTEGER(10), FK to BOOK}
     * @param bookId The value of bookId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setBookId_LessThan(Integer bookId) {
        regBookId(CK_LT, bookId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * BOOK_ID: {UQ+, IX, NotNull, INTEGER(10), FK to BOOK}
     * @param bookId The value of bookId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setBookId_GreaterEqual(Integer bookId) {
        regBookId(CK_GE, bookId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * BOOK_ID: {UQ+, IX, NotNull, INTEGER(10), FK to BOOK}
     * @param bookId The value of bookId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setBookId_LessEqual(Integer bookId) {
        regBookId(CK_LE, bookId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * BOOK_ID: {UQ+, IX, NotNull, INTEGER(10), FK to BOOK}
     * @param minNumber The min number of bookId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of bookId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setBookId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueBookId(), "BOOK_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * BOOK_ID: {UQ+, IX, NotNull, INTEGER(10), FK to BOOK}
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
     * BOOK_ID: {UQ+, IX, NotNull, INTEGER(10), FK to BOOK}
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
        assertObjectNotNull("subQuery<LdBookCB>", subQuery);
        LdBookCB cb = new LdBookCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepBookId_InScopeRelation_Book(cb.query()); // for saving query-value.
        registerInScopeRelation(cb.query(), "BOOK_ID", "BOOK_ID", subQueryPropertyName, "book");
    }
    public abstract String keepBookId_InScopeRelation_Book(LdBookCQ subQuery);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select BOOK_ID from BOOK where ...)} <br />
     * BOOK by my BOOK_ID, named 'book'.
     * @param subQuery The sub-query of Book for 'not in-scope'. (NotNull)
     */
    public void notInScopeBook(SubQuery<LdBookCB> subQuery) {
        assertObjectNotNull("subQuery<LdBookCB>", subQuery);
        LdBookCB cb = new LdBookCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepBookId_NotInScopeRelation_Book(cb.query()); // for saving query-value.
        registerNotInScopeRelation(cb.query(), "BOOK_ID", "BOOK_ID", subQueryPropertyName, "book");
    }
    public abstract String keepBookId_NotInScopeRelation_Book(LdBookCQ subQuery);

    protected void regBookId(ConditionKey k, Object v) { regQ(k, v, getCValueBookId(), "BOOK_ID"); }
    abstract protected ConditionValue getCValueBookId();

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
     * <pre>e.g. setArrivalDate_FromTo(fromDate, toDate, new <span style="color: #FD4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of arrivalDate. (NullAllowed: if null, no from-condition)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of arrivalDate. (NullAllowed: if null, no to-condition)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setArrivalDate_FromTo(java.util.Date fromDatetime, java.util.Date toDatetime, FromToOption fromToOption) {
        regFTQ((fromDatetime != null ? new java.sql.Timestamp(fromDatetime.getTime()) : null), (toDatetime != null ? new java.sql.Timestamp(toDatetime.getTime()) : null), getCValueArrivalDate(), "ARRIVAL_DATE", fromToOption);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) {fromDate &lt;= column &lt; toDate + 1 day} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * ARRIVAL_DATE: {NotNull, TIMESTAMP(26, 6)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #FD4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of arrivalDate. (NullAllowed: if null, no from-condition)
     * @param toDate The to-date(yyyy/MM/dd) of arrivalDate. (NullAllowed: if null, no to-condition)
     */
    public void setArrivalDate_DateFromTo(java.util.Date fromDate, java.util.Date toDate) {
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

    protected void regArrivalDate(ConditionKey k, Object v) { regQ(k, v, getCValueArrivalDate(), "ARRIVAL_DATE"); }
    abstract protected ConditionValue getCValueArrivalDate();

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

    protected void regRUser(ConditionKey k, Object v) { regQ(k, v, getCValueRUser(), "R_USER"); }
    abstract protected ConditionValue getCValueRUser();

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

    protected void regRModule(ConditionKey k, Object v) { regQ(k, v, getCValueRModule(), "R_MODULE"); }
    abstract protected ConditionValue getCValueRModule();

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
    public void setRTimestamp_FromTo(java.util.Date fromDatetime, java.util.Date toDatetime, FromToOption fromToOption) {
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
    public void setRTimestamp_DateFromTo(java.util.Date fromDate, java.util.Date toDate) {
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

    protected void regRTimestamp(ConditionKey k, Object v) { regQ(k, v, getCValueRTimestamp(), "R_TIMESTAMP"); }
    abstract protected ConditionValue getCValueRTimestamp();

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

    protected void regUUser(ConditionKey k, Object v) { regQ(k, v, getCValueUUser(), "U_USER"); }
    abstract protected ConditionValue getCValueUUser();

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

    protected void regUModule(ConditionKey k, Object v) { regQ(k, v, getCValueUModule(), "U_MODULE"); }
    abstract protected ConditionValue getCValueUModule();

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
    public void setUTimestamp_FromTo(java.util.Date fromDatetime, java.util.Date toDatetime, FromToOption fromToOption) {
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
    public void setUTimestamp_DateFromTo(java.util.Date fromDate, java.util.Date toDate) {
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

    protected void regUTimestamp(ConditionKey k, Object v) { regQ(k, v, getCValueUTimestamp(), "U_TIMESTAMP"); }
    abstract protected ConditionValue getCValueUTimestamp();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_Equal()</span>.max(new SubQuery&lt;LdCollectionCB&gt;() {
     *     public void query(LdCollectionCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<LdCollectionCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ.getOperand());
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;LdCollectionCB&gt;() {
     *     public void query(LdCollectionCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<LdCollectionCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;LdCollectionCB&gt;() {
     *     public void query(LdCollectionCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<LdCollectionCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessThan()</span>.max(new SubQuery&lt;LdCollectionCB&gt;() {
     *     public void query(LdCollectionCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<LdCollectionCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;LdCollectionCB&gt;() {
     *     public void query(LdCollectionCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<LdCollectionCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;LdCollectionCB&gt;() {
     *     public void query(LdCollectionCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<LdCollectionCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE.getOperand());
    }

    protected HpSSQFunction<LdCollectionCB> xcreateSSQFunction(final String operand) {
        return new HpSSQFunction<LdCollectionCB>(new HpSSQSetupper<LdCollectionCB>() {
            public void setup(String function, SubQuery<LdCollectionCB> subQuery, HpSSQOption<LdCollectionCB> option) {
                xscalarCondition(function, subQuery, operand, option);
            }
        });
    }

    protected void xscalarCondition(String function, SubQuery<LdCollectionCB> subQuery, String operand, HpSSQOption<LdCollectionCB> option) {
        assertObjectNotNull("subQuery<LdCollectionCB>", subQuery);
        LdCollectionCB cb = xcreateScalarConditionCB(); subQuery.query(cb);
        String subQueryPropertyName = keepScalarCondition(cb.query()); // for saving query-value
        option.setPartitionByCBean(xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(function, cb.query(), subQueryPropertyName, operand, option);
    }
    public abstract String keepScalarCondition(LdCollectionCQ subQuery);

    protected LdCollectionCB xcreateScalarConditionCB() {
        LdCollectionCB cb = new LdCollectionCB();
        cb.xsetupForScalarCondition(this);
        return cb;
    }

    protected LdCollectionCB xcreateScalarConditionPartitionByCB() {
        LdCollectionCB cb = new LdCollectionCB();
        cb.xsetupForScalarConditionPartitionBy(this);
        return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String function, SubQuery<LdCollectionCB> subQuery, String aliasName, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<LdCollectionCB>", subQuery);
        LdCollectionCB cb = new LdCollectionCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepSpecifyMyselfDerived(cb.query()); // for saving query-value.
        registerSpecifyMyselfDerived(function, cb.query(), "COLLECTION_ID", "COLLECTION_ID", subQueryPropertyName, "myselfDerived", aliasName, option);
    }
    public abstract String keepSpecifyMyselfDerived(LdCollectionCQ subQuery);

    /**
     * Prepare for (Query)MyselfDerived (SubQuery).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<LdCollectionCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived();
    }
    protected HpQDRFunction<LdCollectionCB> xcreateQDRFunctionMyselfDerived() {
        return new HpQDRFunction<LdCollectionCB>(new HpQDRSetupper<LdCollectionCB>() {
            public void setup(String function, SubQuery<LdCollectionCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
                xqderiveMyselfDerived(function, subQuery, operand, value, option);
            }
        });
    }
    public void xqderiveMyselfDerived(String function, SubQuery<LdCollectionCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<LdCollectionCB>", subQuery);
        LdCollectionCB cb = new LdCollectionCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String parameterPropertyName = keepQueryMyselfDerivedParameter(value);
        registerQueryMyselfDerived(function, cb.query(), "COLLECTION_ID", "COLLECTION_ID", subQueryPropertyName, "myselfDerived", operand, value, parameterPropertyName, option);
    }
    public abstract String keepQueryMyselfDerived(LdCollectionCQ subQuery);
    public abstract String keepQueryMyselfDerivedParameter(Object parameterValue);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfExists(SubQuery<LdCollectionCB> subQuery) {
        assertObjectNotNull("subQuery<LdCollectionCB>", subQuery);
        LdCollectionCB cb = new LdCollectionCB(); cb.xsetupForMyselfExists(this); subQuery.query(cb);
        String subQueryPropertyName = keepMyselfExists(cb.query()); // for saving query-value.
        registerMyselfExists(cb.query(), subQueryPropertyName);
    }
    public abstract String keepMyselfExists(LdCollectionCQ subQuery);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfInScope(SubQuery<LdCollectionCB> subQuery) {
        assertObjectNotNull("subQuery<LdCollectionCB>", subQuery);
        LdCollectionCB cb = new LdCollectionCB(); cb.xsetupForMyselfInScope(this); subQuery.query(cb);
        String subQueryPropertyName = keepMyselfInScope(cb.query()); // for saving query-value.
        registerMyselfInScope(cb.query(), subQueryPropertyName);
    }
    public abstract String keepMyselfInScope(LdCollectionCQ subQuery);

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabCB() { return LdCollectionCB.class.getName(); }
    protected String xabCQ() { return LdCollectionCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
