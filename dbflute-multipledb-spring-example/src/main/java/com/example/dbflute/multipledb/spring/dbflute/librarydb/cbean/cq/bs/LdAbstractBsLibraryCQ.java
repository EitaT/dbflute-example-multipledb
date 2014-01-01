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
 * The abstract condition-query of LIBRARY.
 * @author DBFlute(AutoGenerator)
 */
public abstract class LdAbstractBsLibraryCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public LdAbstractBsLibraryCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
     * Set up ExistsReferrer (co-related sub-query). <br />
     * {exists (select LIBRARY_ID from COLLECTION where ...)} <br />
     * COLLECTION by LIBRARY_ID, named 'collectionAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">existsCollectionList</span>(new SubQuery&lt;LdCollectionCB&gt;() {
     *     public void query(LdCollectionCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of CollectionList for 'exists'. (NotNull)
     */
    public void existsCollectionList(SubQuery<LdCollectionCB> subQuery) {
        assertObjectNotNull("subQuery<LdCollectionCB>", subQuery);
        LdCollectionCB cb = new LdCollectionCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepLibraryId_ExistsReferrer_CollectionList(cb.query()); // for saving query-value.
        registerExistsReferrer(cb.query(), "LIBRARY_ID", "LIBRARY_ID", subQueryPropertyName, "collectionList");
    }
    public abstract String keepLibraryId_ExistsReferrer_CollectionList(LdCollectionCQ subQuery);

    /**
     * Set up ExistsReferrer (co-related sub-query). <br />
     * {exists (select LIBRARY_ID from LIBRARY_USER where ...)} <br />
     * LIBRARY_USER by LIBRARY_ID, named 'libraryUserAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">existsLibraryUserList</span>(new SubQuery&lt;LdLibraryUserCB&gt;() {
     *     public void query(LdLibraryUserCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of LibraryUserList for 'exists'. (NotNull)
     */
    public void existsLibraryUserList(SubQuery<LdLibraryUserCB> subQuery) {
        assertObjectNotNull("subQuery<LdLibraryUserCB>", subQuery);
        LdLibraryUserCB cb = new LdLibraryUserCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepLibraryId_ExistsReferrer_LibraryUserList(cb.query()); // for saving query-value.
        registerExistsReferrer(cb.query(), "LIBRARY_ID", "LIBRARY_ID", subQueryPropertyName, "libraryUserList");
    }
    public abstract String keepLibraryId_ExistsReferrer_LibraryUserList(LdLibraryUserCQ subQuery);

    /**
     * Set up ExistsReferrer (co-related sub-query). <br />
     * {exists (select LIBRARY_ID from NEXT_LIBRARY where ...)} <br />
     * NEXT_LIBRARY by LIBRARY_ID, named 'nextLibraryByLibraryIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">existsNextLibraryByLibraryIdList</span>(new SubQuery&lt;LdNextLibraryCB&gt;() {
     *     public void query(LdNextLibraryCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of NextLibraryByLibraryIdList for 'exists'. (NotNull)
     */
    public void existsNextLibraryByLibraryIdList(SubQuery<LdNextLibraryCB> subQuery) {
        assertObjectNotNull("subQuery<LdNextLibraryCB>", subQuery);
        LdNextLibraryCB cb = new LdNextLibraryCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepLibraryId_ExistsReferrer_NextLibraryByLibraryIdList(cb.query()); // for saving query-value.
        registerExistsReferrer(cb.query(), "LIBRARY_ID", "LIBRARY_ID", subQueryPropertyName, "nextLibraryByLibraryIdList");
    }
    public abstract String keepLibraryId_ExistsReferrer_NextLibraryByLibraryIdList(LdNextLibraryCQ subQuery);

    /**
     * Set up ExistsReferrer (co-related sub-query). <br />
     * {exists (select NEXT_LIBRARY_ID from NEXT_LIBRARY where ...)} <br />
     * NEXT_LIBRARY by NEXT_LIBRARY_ID, named 'nextLibraryByNextLibraryIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">existsNextLibraryByNextLibraryIdList</span>(new SubQuery&lt;LdNextLibraryCB&gt;() {
     *     public void query(LdNextLibraryCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of NextLibraryByNextLibraryIdList for 'exists'. (NotNull)
     */
    public void existsNextLibraryByNextLibraryIdList(SubQuery<LdNextLibraryCB> subQuery) {
        assertObjectNotNull("subQuery<LdNextLibraryCB>", subQuery);
        LdNextLibraryCB cb = new LdNextLibraryCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepLibraryId_ExistsReferrer_NextLibraryByNextLibraryIdList(cb.query()); // for saving query-value.
        registerExistsReferrer(cb.query(), "LIBRARY_ID", "NEXT_LIBRARY_ID", subQueryPropertyName, "nextLibraryByNextLibraryIdList");
    }
    public abstract String keepLibraryId_ExistsReferrer_NextLibraryByNextLibraryIdList(LdNextLibraryCQ subQuery);

    /**
     * Set up NotExistsReferrer (co-related sub-query). <br />
     * {not exists (select LIBRARY_ID from COLLECTION where ...)} <br />
     * COLLECTION by LIBRARY_ID, named 'collectionAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">notExistsCollectionList</span>(new SubQuery&lt;LdCollectionCB&gt;() {
     *     public void query(LdCollectionCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of LibraryId_NotExistsReferrer_CollectionList for 'not exists'. (NotNull)
     */
    public void notExistsCollectionList(SubQuery<LdCollectionCB> subQuery) {
        assertObjectNotNull("subQuery<LdCollectionCB>", subQuery);
        LdCollectionCB cb = new LdCollectionCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepLibraryId_NotExistsReferrer_CollectionList(cb.query()); // for saving query-value.
        registerNotExistsReferrer(cb.query(), "LIBRARY_ID", "LIBRARY_ID", subQueryPropertyName, "collectionList");
    }
    public abstract String keepLibraryId_NotExistsReferrer_CollectionList(LdCollectionCQ subQuery);

    /**
     * Set up NotExistsReferrer (co-related sub-query). <br />
     * {not exists (select LIBRARY_ID from LIBRARY_USER where ...)} <br />
     * LIBRARY_USER by LIBRARY_ID, named 'libraryUserAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">notExistsLibraryUserList</span>(new SubQuery&lt;LdLibraryUserCB&gt;() {
     *     public void query(LdLibraryUserCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of LibraryId_NotExistsReferrer_LibraryUserList for 'not exists'. (NotNull)
     */
    public void notExistsLibraryUserList(SubQuery<LdLibraryUserCB> subQuery) {
        assertObjectNotNull("subQuery<LdLibraryUserCB>", subQuery);
        LdLibraryUserCB cb = new LdLibraryUserCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepLibraryId_NotExistsReferrer_LibraryUserList(cb.query()); // for saving query-value.
        registerNotExistsReferrer(cb.query(), "LIBRARY_ID", "LIBRARY_ID", subQueryPropertyName, "libraryUserList");
    }
    public abstract String keepLibraryId_NotExistsReferrer_LibraryUserList(LdLibraryUserCQ subQuery);

    /**
     * Set up NotExistsReferrer (co-related sub-query). <br />
     * {not exists (select LIBRARY_ID from NEXT_LIBRARY where ...)} <br />
     * NEXT_LIBRARY by LIBRARY_ID, named 'nextLibraryByLibraryIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">notExistsNextLibraryByLibraryIdList</span>(new SubQuery&lt;LdNextLibraryCB&gt;() {
     *     public void query(LdNextLibraryCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of LibraryId_NotExistsReferrer_NextLibraryByLibraryIdList for 'not exists'. (NotNull)
     */
    public void notExistsNextLibraryByLibraryIdList(SubQuery<LdNextLibraryCB> subQuery) {
        assertObjectNotNull("subQuery<LdNextLibraryCB>", subQuery);
        LdNextLibraryCB cb = new LdNextLibraryCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepLibraryId_NotExistsReferrer_NextLibraryByLibraryIdList(cb.query()); // for saving query-value.
        registerNotExistsReferrer(cb.query(), "LIBRARY_ID", "LIBRARY_ID", subQueryPropertyName, "nextLibraryByLibraryIdList");
    }
    public abstract String keepLibraryId_NotExistsReferrer_NextLibraryByLibraryIdList(LdNextLibraryCQ subQuery);

    /**
     * Set up NotExistsReferrer (co-related sub-query). <br />
     * {not exists (select NEXT_LIBRARY_ID from NEXT_LIBRARY where ...)} <br />
     * NEXT_LIBRARY by NEXT_LIBRARY_ID, named 'nextLibraryByNextLibraryIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">notExistsNextLibraryByNextLibraryIdList</span>(new SubQuery&lt;LdNextLibraryCB&gt;() {
     *     public void query(LdNextLibraryCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of LibraryId_NotExistsReferrer_NextLibraryByNextLibraryIdList for 'not exists'. (NotNull)
     */
    public void notExistsNextLibraryByNextLibraryIdList(SubQuery<LdNextLibraryCB> subQuery) {
        assertObjectNotNull("subQuery<LdNextLibraryCB>", subQuery);
        LdNextLibraryCB cb = new LdNextLibraryCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepLibraryId_NotExistsReferrer_NextLibraryByNextLibraryIdList(cb.query()); // for saving query-value.
        registerNotExistsReferrer(cb.query(), "LIBRARY_ID", "NEXT_LIBRARY_ID", subQueryPropertyName, "nextLibraryByNextLibraryIdList");
    }
    public abstract String keepLibraryId_NotExistsReferrer_NextLibraryByNextLibraryIdList(LdNextLibraryCQ subQuery);

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select LIBRARY_ID from COLLECTION where ...)} <br />
     * COLLECTION by LIBRARY_ID, named 'collectionAsOne'.
     * @param subQuery The sub-query of CollectionList for 'in-scope'. (NotNull)
     */
    public void inScopeCollectionList(SubQuery<LdCollectionCB> subQuery) {
        assertObjectNotNull("subQuery<LdCollectionCB>", subQuery);
        LdCollectionCB cb = new LdCollectionCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepLibraryId_InScopeRelation_CollectionList(cb.query()); // for saving query-value.
        registerInScopeRelation(cb.query(), "LIBRARY_ID", "LIBRARY_ID", subQueryPropertyName, "collectionList");
    }
    public abstract String keepLibraryId_InScopeRelation_CollectionList(LdCollectionCQ subQuery);

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select LIBRARY_ID from LIBRARY_USER where ...)} <br />
     * LIBRARY_USER by LIBRARY_ID, named 'libraryUserAsOne'.
     * @param subQuery The sub-query of LibraryUserList for 'in-scope'. (NotNull)
     */
    public void inScopeLibraryUserList(SubQuery<LdLibraryUserCB> subQuery) {
        assertObjectNotNull("subQuery<LdLibraryUserCB>", subQuery);
        LdLibraryUserCB cb = new LdLibraryUserCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepLibraryId_InScopeRelation_LibraryUserList(cb.query()); // for saving query-value.
        registerInScopeRelation(cb.query(), "LIBRARY_ID", "LIBRARY_ID", subQueryPropertyName, "libraryUserList");
    }
    public abstract String keepLibraryId_InScopeRelation_LibraryUserList(LdLibraryUserCQ subQuery);

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select LIBRARY_ID from NEXT_LIBRARY where ...)} <br />
     * NEXT_LIBRARY by LIBRARY_ID, named 'nextLibraryByLibraryIdAsOne'.
     * @param subQuery The sub-query of NextLibraryByLibraryIdList for 'in-scope'. (NotNull)
     */
    public void inScopeNextLibraryByLibraryIdList(SubQuery<LdNextLibraryCB> subQuery) {
        assertObjectNotNull("subQuery<LdNextLibraryCB>", subQuery);
        LdNextLibraryCB cb = new LdNextLibraryCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepLibraryId_InScopeRelation_NextLibraryByLibraryIdList(cb.query()); // for saving query-value.
        registerInScopeRelation(cb.query(), "LIBRARY_ID", "LIBRARY_ID", subQueryPropertyName, "nextLibraryByLibraryIdList");
    }
    public abstract String keepLibraryId_InScopeRelation_NextLibraryByLibraryIdList(LdNextLibraryCQ subQuery);

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select NEXT_LIBRARY_ID from NEXT_LIBRARY where ...)} <br />
     * NEXT_LIBRARY by NEXT_LIBRARY_ID, named 'nextLibraryByNextLibraryIdAsOne'.
     * @param subQuery The sub-query of NextLibraryByNextLibraryIdList for 'in-scope'. (NotNull)
     */
    public void inScopeNextLibraryByNextLibraryIdList(SubQuery<LdNextLibraryCB> subQuery) {
        assertObjectNotNull("subQuery<LdNextLibraryCB>", subQuery);
        LdNextLibraryCB cb = new LdNextLibraryCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepLibraryId_InScopeRelation_NextLibraryByNextLibraryIdList(cb.query()); // for saving query-value.
        registerInScopeRelation(cb.query(), "LIBRARY_ID", "NEXT_LIBRARY_ID", subQueryPropertyName, "nextLibraryByNextLibraryIdList");
    }
    public abstract String keepLibraryId_InScopeRelation_NextLibraryByNextLibraryIdList(LdNextLibraryCQ subQuery);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select LIBRARY_ID from COLLECTION where ...)} <br />
     * COLLECTION by LIBRARY_ID, named 'collectionAsOne'.
     * @param subQuery The sub-query of CollectionList for 'not in-scope'. (NotNull)
     */
    public void notInScopeCollectionList(SubQuery<LdCollectionCB> subQuery) {
        assertObjectNotNull("subQuery<LdCollectionCB>", subQuery);
        LdCollectionCB cb = new LdCollectionCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepLibraryId_NotInScopeRelation_CollectionList(cb.query()); // for saving query-value.
        registerNotInScopeRelation(cb.query(), "LIBRARY_ID", "LIBRARY_ID", subQueryPropertyName, "collectionList");
    }
    public abstract String keepLibraryId_NotInScopeRelation_CollectionList(LdCollectionCQ subQuery);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select LIBRARY_ID from LIBRARY_USER where ...)} <br />
     * LIBRARY_USER by LIBRARY_ID, named 'libraryUserAsOne'.
     * @param subQuery The sub-query of LibraryUserList for 'not in-scope'. (NotNull)
     */
    public void notInScopeLibraryUserList(SubQuery<LdLibraryUserCB> subQuery) {
        assertObjectNotNull("subQuery<LdLibraryUserCB>", subQuery);
        LdLibraryUserCB cb = new LdLibraryUserCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepLibraryId_NotInScopeRelation_LibraryUserList(cb.query()); // for saving query-value.
        registerNotInScopeRelation(cb.query(), "LIBRARY_ID", "LIBRARY_ID", subQueryPropertyName, "libraryUserList");
    }
    public abstract String keepLibraryId_NotInScopeRelation_LibraryUserList(LdLibraryUserCQ subQuery);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select LIBRARY_ID from NEXT_LIBRARY where ...)} <br />
     * NEXT_LIBRARY by LIBRARY_ID, named 'nextLibraryByLibraryIdAsOne'.
     * @param subQuery The sub-query of NextLibraryByLibraryIdList for 'not in-scope'. (NotNull)
     */
    public void notInScopeNextLibraryByLibraryIdList(SubQuery<LdNextLibraryCB> subQuery) {
        assertObjectNotNull("subQuery<LdNextLibraryCB>", subQuery);
        LdNextLibraryCB cb = new LdNextLibraryCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepLibraryId_NotInScopeRelation_NextLibraryByLibraryIdList(cb.query()); // for saving query-value.
        registerNotInScopeRelation(cb.query(), "LIBRARY_ID", "LIBRARY_ID", subQueryPropertyName, "nextLibraryByLibraryIdList");
    }
    public abstract String keepLibraryId_NotInScopeRelation_NextLibraryByLibraryIdList(LdNextLibraryCQ subQuery);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select NEXT_LIBRARY_ID from NEXT_LIBRARY where ...)} <br />
     * NEXT_LIBRARY by NEXT_LIBRARY_ID, named 'nextLibraryByNextLibraryIdAsOne'.
     * @param subQuery The sub-query of NextLibraryByNextLibraryIdList for 'not in-scope'. (NotNull)
     */
    public void notInScopeNextLibraryByNextLibraryIdList(SubQuery<LdNextLibraryCB> subQuery) {
        assertObjectNotNull("subQuery<LdNextLibraryCB>", subQuery);
        LdNextLibraryCB cb = new LdNextLibraryCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepLibraryId_NotInScopeRelation_NextLibraryByNextLibraryIdList(cb.query()); // for saving query-value.
        registerNotInScopeRelation(cb.query(), "LIBRARY_ID", "NEXT_LIBRARY_ID", subQueryPropertyName, "nextLibraryByNextLibraryIdList");
    }
    public abstract String keepLibraryId_NotInScopeRelation_NextLibraryByNextLibraryIdList(LdNextLibraryCQ subQuery);

    public void xsderiveCollectionList(String function, SubQuery<LdCollectionCB> subQuery, String aliasName, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<LdCollectionCB>", subQuery);
        LdCollectionCB cb = new LdCollectionCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepLibraryId_SpecifyDerivedReferrer_CollectionList(cb.query()); // for saving query-value.
        registerSpecifyDerivedReferrer(function, cb.query(), "LIBRARY_ID", "LIBRARY_ID", subQueryPropertyName, "collectionList", aliasName, option);
    }
    public abstract String keepLibraryId_SpecifyDerivedReferrer_CollectionList(LdCollectionCQ subQuery);

    public void xsderiveLibraryUserList(String function, SubQuery<LdLibraryUserCB> subQuery, String aliasName, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<LdLibraryUserCB>", subQuery);
        LdLibraryUserCB cb = new LdLibraryUserCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepLibraryId_SpecifyDerivedReferrer_LibraryUserList(cb.query()); // for saving query-value.
        registerSpecifyDerivedReferrer(function, cb.query(), "LIBRARY_ID", "LIBRARY_ID", subQueryPropertyName, "libraryUserList", aliasName, option);
    }
    public abstract String keepLibraryId_SpecifyDerivedReferrer_LibraryUserList(LdLibraryUserCQ subQuery);

    public void xsderiveNextLibraryByLibraryIdList(String function, SubQuery<LdNextLibraryCB> subQuery, String aliasName, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<LdNextLibraryCB>", subQuery);
        LdNextLibraryCB cb = new LdNextLibraryCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepLibraryId_SpecifyDerivedReferrer_NextLibraryByLibraryIdList(cb.query()); // for saving query-value.
        registerSpecifyDerivedReferrer(function, cb.query(), "LIBRARY_ID", "LIBRARY_ID", subQueryPropertyName, "nextLibraryByLibraryIdList", aliasName, option);
    }
    public abstract String keepLibraryId_SpecifyDerivedReferrer_NextLibraryByLibraryIdList(LdNextLibraryCQ subQuery);

    public void xsderiveNextLibraryByNextLibraryIdList(String function, SubQuery<LdNextLibraryCB> subQuery, String aliasName, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<LdNextLibraryCB>", subQuery);
        LdNextLibraryCB cb = new LdNextLibraryCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepLibraryId_SpecifyDerivedReferrer_NextLibraryByNextLibraryIdList(cb.query()); // for saving query-value.
        registerSpecifyDerivedReferrer(function, cb.query(), "LIBRARY_ID", "NEXT_LIBRARY_ID", subQueryPropertyName, "nextLibraryByNextLibraryIdList", aliasName, option);
    }
    public abstract String keepLibraryId_SpecifyDerivedReferrer_NextLibraryByNextLibraryIdList(LdNextLibraryCQ subQuery);

    /**
     * Prepare for (Query)DerivedReferrer. <br />
     * {FOO &lt;= (select max(BAR) from COLLECTION where ...)} <br />
     * COLLECTION by LIBRARY_ID, named 'collectionAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">derivedCollectionList()</span>.<span style="color: #FD4747">max</span>(new SubQuery&lt;LdCollectionCB&gt;() {
     *     public void query(LdCollectionCB subCB) {
     *         subCB.specify().<span style="color: #FD4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *         subCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     *     }
     * }).<span style="color: #FD4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<LdCollectionCB> derivedCollectionList() {
        return xcreateQDRFunctionCollectionList();
    }
    protected HpQDRFunction<LdCollectionCB> xcreateQDRFunctionCollectionList() {
        return new HpQDRFunction<LdCollectionCB>(new HpQDRSetupper<LdCollectionCB>() {
            public void setup(String function, SubQuery<LdCollectionCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
                xqderiveCollectionList(function, subQuery, operand, value, option);
            }
        });
    }
    public void xqderiveCollectionList(String function, SubQuery<LdCollectionCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<LdCollectionCB>", subQuery);
        LdCollectionCB cb = new LdCollectionCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepLibraryId_QueryDerivedReferrer_CollectionList(cb.query()); // for saving query-value.
        String parameterPropertyName = keepLibraryId_QueryDerivedReferrer_CollectionListParameter(value);
        registerQueryDerivedReferrer(function, cb.query(), "LIBRARY_ID", "LIBRARY_ID", subQueryPropertyName, "collectionList", operand, value, parameterPropertyName, option);
    }
    public abstract String keepLibraryId_QueryDerivedReferrer_CollectionList(LdCollectionCQ subQuery);
    public abstract String keepLibraryId_QueryDerivedReferrer_CollectionListParameter(Object parameterValue);

    /**
     * Prepare for (Query)DerivedReferrer. <br />
     * {FOO &lt;= (select max(BAR) from LIBRARY_USER where ...)} <br />
     * LIBRARY_USER by LIBRARY_ID, named 'libraryUserAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">derivedLibraryUserList()</span>.<span style="color: #FD4747">max</span>(new SubQuery&lt;LdLibraryUserCB&gt;() {
     *     public void query(LdLibraryUserCB subCB) {
     *         subCB.specify().<span style="color: #FD4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *         subCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     *     }
     * }).<span style="color: #FD4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<LdLibraryUserCB> derivedLibraryUserList() {
        return xcreateQDRFunctionLibraryUserList();
    }
    protected HpQDRFunction<LdLibraryUserCB> xcreateQDRFunctionLibraryUserList() {
        return new HpQDRFunction<LdLibraryUserCB>(new HpQDRSetupper<LdLibraryUserCB>() {
            public void setup(String function, SubQuery<LdLibraryUserCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
                xqderiveLibraryUserList(function, subQuery, operand, value, option);
            }
        });
    }
    public void xqderiveLibraryUserList(String function, SubQuery<LdLibraryUserCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<LdLibraryUserCB>", subQuery);
        LdLibraryUserCB cb = new LdLibraryUserCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepLibraryId_QueryDerivedReferrer_LibraryUserList(cb.query()); // for saving query-value.
        String parameterPropertyName = keepLibraryId_QueryDerivedReferrer_LibraryUserListParameter(value);
        registerQueryDerivedReferrer(function, cb.query(), "LIBRARY_ID", "LIBRARY_ID", subQueryPropertyName, "libraryUserList", operand, value, parameterPropertyName, option);
    }
    public abstract String keepLibraryId_QueryDerivedReferrer_LibraryUserList(LdLibraryUserCQ subQuery);
    public abstract String keepLibraryId_QueryDerivedReferrer_LibraryUserListParameter(Object parameterValue);

    /**
     * Prepare for (Query)DerivedReferrer. <br />
     * {FOO &lt;= (select max(BAR) from NEXT_LIBRARY where ...)} <br />
     * NEXT_LIBRARY by LIBRARY_ID, named 'nextLibraryByLibraryIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">derivedNextLibraryByLibraryIdList()</span>.<span style="color: #FD4747">max</span>(new SubQuery&lt;LdNextLibraryCB&gt;() {
     *     public void query(LdNextLibraryCB subCB) {
     *         subCB.specify().<span style="color: #FD4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *         subCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     *     }
     * }).<span style="color: #FD4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<LdNextLibraryCB> derivedNextLibraryByLibraryIdList() {
        return xcreateQDRFunctionNextLibraryByLibraryIdList();
    }
    protected HpQDRFunction<LdNextLibraryCB> xcreateQDRFunctionNextLibraryByLibraryIdList() {
        return new HpQDRFunction<LdNextLibraryCB>(new HpQDRSetupper<LdNextLibraryCB>() {
            public void setup(String function, SubQuery<LdNextLibraryCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
                xqderiveNextLibraryByLibraryIdList(function, subQuery, operand, value, option);
            }
        });
    }
    public void xqderiveNextLibraryByLibraryIdList(String function, SubQuery<LdNextLibraryCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<LdNextLibraryCB>", subQuery);
        LdNextLibraryCB cb = new LdNextLibraryCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepLibraryId_QueryDerivedReferrer_NextLibraryByLibraryIdList(cb.query()); // for saving query-value.
        String parameterPropertyName = keepLibraryId_QueryDerivedReferrer_NextLibraryByLibraryIdListParameter(value);
        registerQueryDerivedReferrer(function, cb.query(), "LIBRARY_ID", "LIBRARY_ID", subQueryPropertyName, "nextLibraryByLibraryIdList", operand, value, parameterPropertyName, option);
    }
    public abstract String keepLibraryId_QueryDerivedReferrer_NextLibraryByLibraryIdList(LdNextLibraryCQ subQuery);
    public abstract String keepLibraryId_QueryDerivedReferrer_NextLibraryByLibraryIdListParameter(Object parameterValue);

    /**
     * Prepare for (Query)DerivedReferrer. <br />
     * {FOO &lt;= (select max(BAR) from NEXT_LIBRARY where ...)} <br />
     * NEXT_LIBRARY by NEXT_LIBRARY_ID, named 'nextLibraryByNextLibraryIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">derivedNextLibraryByNextLibraryIdList()</span>.<span style="color: #FD4747">max</span>(new SubQuery&lt;LdNextLibraryCB&gt;() {
     *     public void query(LdNextLibraryCB subCB) {
     *         subCB.specify().<span style="color: #FD4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *         subCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     *     }
     * }).<span style="color: #FD4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<LdNextLibraryCB> derivedNextLibraryByNextLibraryIdList() {
        return xcreateQDRFunctionNextLibraryByNextLibraryIdList();
    }
    protected HpQDRFunction<LdNextLibraryCB> xcreateQDRFunctionNextLibraryByNextLibraryIdList() {
        return new HpQDRFunction<LdNextLibraryCB>(new HpQDRSetupper<LdNextLibraryCB>() {
            public void setup(String function, SubQuery<LdNextLibraryCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
                xqderiveNextLibraryByNextLibraryIdList(function, subQuery, operand, value, option);
            }
        });
    }
    public void xqderiveNextLibraryByNextLibraryIdList(String function, SubQuery<LdNextLibraryCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<LdNextLibraryCB>", subQuery);
        LdNextLibraryCB cb = new LdNextLibraryCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepLibraryId_QueryDerivedReferrer_NextLibraryByNextLibraryIdList(cb.query()); // for saving query-value.
        String parameterPropertyName = keepLibraryId_QueryDerivedReferrer_NextLibraryByNextLibraryIdListParameter(value);
        registerQueryDerivedReferrer(function, cb.query(), "LIBRARY_ID", "NEXT_LIBRARY_ID", subQueryPropertyName, "nextLibraryByNextLibraryIdList", operand, value, parameterPropertyName, option);
    }
    public abstract String keepLibraryId_QueryDerivedReferrer_NextLibraryByNextLibraryIdList(LdNextLibraryCQ subQuery);
    public abstract String keepLibraryId_QueryDerivedReferrer_NextLibraryByNextLibraryIdListParameter(Object parameterValue);

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

    protected void regLibraryId(ConditionKey k, Object v) { regQ(k, v, getCValueLibraryId(), "LIBRARY_ID"); }
    abstract protected ConditionValue getCValueLibraryId();

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
     * <pre>e.g. setLibraryName_LikeSearch("xxx", new <span style="color: #FD4747">LikeSearchOption</span>().likeContain());</pre>
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

    protected void regLibraryName(ConditionKey k, Object v) { regQ(k, v, getCValueLibraryName(), "LIBRARY_NAME"); }
    abstract protected ConditionValue getCValueLibraryName();

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
     * <pre>e.g. setLibraryTypeCode_LikeSearch("xxx", new <span style="color: #FD4747">LikeSearchOption</span>().likeContain());</pre>
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
        assertObjectNotNull("subQuery<LdLibraryTypeLookupCB>", subQuery);
        LdLibraryTypeLookupCB cb = new LdLibraryTypeLookupCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepLibraryTypeCode_InScopeRelation_LibraryTypeLookup(cb.query()); // for saving query-value.
        registerInScopeRelation(cb.query(), "LIBRARY_TYPE_CODE", "LIBRARY_TYPE_CODE", subQueryPropertyName, "libraryTypeLookup");
    }
    public abstract String keepLibraryTypeCode_InScopeRelation_LibraryTypeLookup(LdLibraryTypeLookupCQ subQuery);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select LIBRARY_TYPE_CODE from LIBRARY_TYPE_LOOKUP where ...)} <br />
     * LIBRARY_TYPE_LOOKUP by my LIBRARY_TYPE_CODE, named 'libraryTypeLookup'.
     * @param subQuery The sub-query of LibraryTypeLookup for 'not in-scope'. (NotNull)
     */
    public void notInScopeLibraryTypeLookup(SubQuery<LdLibraryTypeLookupCB> subQuery) {
        assertObjectNotNull("subQuery<LdLibraryTypeLookupCB>", subQuery);
        LdLibraryTypeLookupCB cb = new LdLibraryTypeLookupCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepLibraryTypeCode_NotInScopeRelation_LibraryTypeLookup(cb.query()); // for saving query-value.
        registerNotInScopeRelation(cb.query(), "LIBRARY_TYPE_CODE", "LIBRARY_TYPE_CODE", subQueryPropertyName, "libraryTypeLookup");
    }
    public abstract String keepLibraryTypeCode_NotInScopeRelation_LibraryTypeLookup(LdLibraryTypeLookupCQ subQuery);

    protected void regLibraryTypeCode(ConditionKey k, Object v) { regQ(k, v, getCValueLibraryTypeCode(), "LIBRARY_TYPE_CODE"); }
    abstract protected ConditionValue getCValueLibraryTypeCode();

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
     * cb.query().<span style="color: #FD4747">scalar_Equal()</span>.max(new SubQuery&lt;LdLibraryCB&gt;() {
     *     public void query(LdLibraryCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<LdLibraryCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ.getOperand());
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;LdLibraryCB&gt;() {
     *     public void query(LdLibraryCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<LdLibraryCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;LdLibraryCB&gt;() {
     *     public void query(LdLibraryCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<LdLibraryCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessThan()</span>.max(new SubQuery&lt;LdLibraryCB&gt;() {
     *     public void query(LdLibraryCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<LdLibraryCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;LdLibraryCB&gt;() {
     *     public void query(LdLibraryCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<LdLibraryCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;LdLibraryCB&gt;() {
     *     public void query(LdLibraryCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<LdLibraryCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE.getOperand());
    }

    protected HpSSQFunction<LdLibraryCB> xcreateSSQFunction(final String operand) {
        return new HpSSQFunction<LdLibraryCB>(new HpSSQSetupper<LdLibraryCB>() {
            public void setup(String function, SubQuery<LdLibraryCB> subQuery, HpSSQOption<LdLibraryCB> option) {
                xscalarCondition(function, subQuery, operand, option);
            }
        });
    }

    protected void xscalarCondition(String function, SubQuery<LdLibraryCB> subQuery, String operand, HpSSQOption<LdLibraryCB> option) {
        assertObjectNotNull("subQuery<LdLibraryCB>", subQuery);
        LdLibraryCB cb = xcreateScalarConditionCB(); subQuery.query(cb);
        String subQueryPropertyName = keepScalarCondition(cb.query()); // for saving query-value
        option.setPartitionByCBean(xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(function, cb.query(), subQueryPropertyName, operand, option);
    }
    public abstract String keepScalarCondition(LdLibraryCQ subQuery);

    protected LdLibraryCB xcreateScalarConditionCB() {
        LdLibraryCB cb = new LdLibraryCB();
        cb.xsetupForScalarCondition(this);
        return cb;
    }

    protected LdLibraryCB xcreateScalarConditionPartitionByCB() {
        LdLibraryCB cb = new LdLibraryCB();
        cb.xsetupForScalarConditionPartitionBy(this);
        return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String function, SubQuery<LdLibraryCB> subQuery, String aliasName, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<LdLibraryCB>", subQuery);
        LdLibraryCB cb = new LdLibraryCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepSpecifyMyselfDerived(cb.query()); // for saving query-value.
        registerSpecifyMyselfDerived(function, cb.query(), "LIBRARY_ID", "LIBRARY_ID", subQueryPropertyName, "myselfDerived", aliasName, option);
    }
    public abstract String keepSpecifyMyselfDerived(LdLibraryCQ subQuery);

    /**
     * Prepare for (Query)MyselfDerived (SubQuery).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<LdLibraryCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived();
    }
    protected HpQDRFunction<LdLibraryCB> xcreateQDRFunctionMyselfDerived() {
        return new HpQDRFunction<LdLibraryCB>(new HpQDRSetupper<LdLibraryCB>() {
            public void setup(String function, SubQuery<LdLibraryCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
                xqderiveMyselfDerived(function, subQuery, operand, value, option);
            }
        });
    }
    public void xqderiveMyselfDerived(String function, SubQuery<LdLibraryCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<LdLibraryCB>", subQuery);
        LdLibraryCB cb = new LdLibraryCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String parameterPropertyName = keepQueryMyselfDerivedParameter(value);
        registerQueryMyselfDerived(function, cb.query(), "LIBRARY_ID", "LIBRARY_ID", subQueryPropertyName, "myselfDerived", operand, value, parameterPropertyName, option);
    }
    public abstract String keepQueryMyselfDerived(LdLibraryCQ subQuery);
    public abstract String keepQueryMyselfDerivedParameter(Object parameterValue);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfExists(SubQuery<LdLibraryCB> subQuery) {
        assertObjectNotNull("subQuery<LdLibraryCB>", subQuery);
        LdLibraryCB cb = new LdLibraryCB(); cb.xsetupForMyselfExists(this); subQuery.query(cb);
        String subQueryPropertyName = keepMyselfExists(cb.query()); // for saving query-value.
        registerMyselfExists(cb.query(), subQueryPropertyName);
    }
    public abstract String keepMyselfExists(LdLibraryCQ subQuery);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfInScope(SubQuery<LdLibraryCB> subQuery) {
        assertObjectNotNull("subQuery<LdLibraryCB>", subQuery);
        LdLibraryCB cb = new LdLibraryCB(); cb.xsetupForMyselfInScope(this); subQuery.query(cb);
        String subQueryPropertyName = keepMyselfInScope(cb.query()); // for saving query-value.
        registerMyselfInScope(cb.query(), subQueryPropertyName);
    }
    public abstract String keepMyselfInScope(LdLibraryCQ subQuery);

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabCB() { return LdLibraryCB.class.getName(); }
    protected String xabCQ() { return LdLibraryCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
