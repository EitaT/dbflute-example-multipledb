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
 * The abstract condition-query of COLLECTION_STATUS_LOOKUP.
 * @author DBFlute(AutoGenerator)
 */
public abstract class LdAbstractBsCollectionStatusLookupCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public LdAbstractBsCollectionStatusLookupCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "COLLECTION_STATUS_LOOKUP";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * COLLECTION_STATUS_CODE: {PK, NotNull, CHAR(3), classification=CollectionStatus}
     * @param collectionStatusCode The value of collectionStatusCode as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setCollectionStatusCode_Equal(String collectionStatusCode) {
        doSetCollectionStatusCode_Equal(fRES(collectionStatusCode));
    }

    /**
     * Equal(=). As CollectionStatus. And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * COLLECTION_STATUS_CODE: {PK, NotNull, CHAR(3), classification=CollectionStatus} <br />
     * 蔵書の状態を示す
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, no condition)
     */
    public void setCollectionStatusCode_Equal_AsCollectionStatus(LdCDef.CollectionStatus cdef) {
        doSetCollectionStatusCode_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As NOR (NOR). And OnlyOnceRegistered. <br />
     * NOR: 通常状態を示す
     */
    public void setCollectionStatusCode_Equal_NOR() {
        setCollectionStatusCode_Equal_AsCollectionStatus(LdCDef.CollectionStatus.NOR);
    }

    /**
     * Equal(=). As WAT (WAT). And OnlyOnceRegistered. <br />
     * WAT: 待ち状態を示す
     */
    public void setCollectionStatusCode_Equal_WAT() {
        setCollectionStatusCode_Equal_AsCollectionStatus(LdCDef.CollectionStatus.WAT);
    }

    /**
     * Equal(=). As OUT (OUT). And OnlyOnceRegistered. <br />
     * OUT: 貸し出し中を示す
     */
    public void setCollectionStatusCode_Equal_OUT() {
        setCollectionStatusCode_Equal_AsCollectionStatus(LdCDef.CollectionStatus.OUT);
    }

    protected void doSetCollectionStatusCode_Equal(String collectionStatusCode) {
        regCollectionStatusCode(CK_EQ, collectionStatusCode);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * COLLECTION_STATUS_CODE: {PK, NotNull, CHAR(3), classification=CollectionStatus}
     * @param collectionStatusCode The value of collectionStatusCode as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setCollectionStatusCode_NotEqual(String collectionStatusCode) {
        doSetCollectionStatusCode_NotEqual(fRES(collectionStatusCode));
    }

    /**
     * NotEqual(&lt;&gt;). As CollectionStatus. And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * COLLECTION_STATUS_CODE: {PK, NotNull, CHAR(3), classification=CollectionStatus} <br />
     * 蔵書の状態を示す
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, no condition)
     */
    public void setCollectionStatusCode_NotEqual_AsCollectionStatus(LdCDef.CollectionStatus cdef) {
        doSetCollectionStatusCode_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As NOR (NOR). And OnlyOnceRegistered. <br />
     * NOR: 通常状態を示す
     */
    public void setCollectionStatusCode_NotEqual_NOR() {
        setCollectionStatusCode_NotEqual_AsCollectionStatus(LdCDef.CollectionStatus.NOR);
    }

    /**
     * NotEqual(&lt;&gt;). As WAT (WAT). And OnlyOnceRegistered. <br />
     * WAT: 待ち状態を示す
     */
    public void setCollectionStatusCode_NotEqual_WAT() {
        setCollectionStatusCode_NotEqual_AsCollectionStatus(LdCDef.CollectionStatus.WAT);
    }

    /**
     * NotEqual(&lt;&gt;). As OUT (OUT). And OnlyOnceRegistered. <br />
     * OUT: 貸し出し中を示す
     */
    public void setCollectionStatusCode_NotEqual_OUT() {
        setCollectionStatusCode_NotEqual_AsCollectionStatus(LdCDef.CollectionStatus.OUT);
    }

    protected void doSetCollectionStatusCode_NotEqual(String collectionStatusCode) {
        regCollectionStatusCode(CK_NES, collectionStatusCode);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * COLLECTION_STATUS_CODE: {PK, NotNull, CHAR(3), classification=CollectionStatus}
     * @param collectionStatusCodeList The collection of collectionStatusCode as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setCollectionStatusCode_InScope(Collection<String> collectionStatusCodeList) {
        doSetCollectionStatusCode_InScope(collectionStatusCodeList);
    }

    /**
     * InScope {in ('a', 'b')}. As CollectionStatus. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * COLLECTION_STATUS_CODE: {PK, NotNull, CHAR(3), classification=CollectionStatus} <br />
     * 蔵書の状態を示す
     * @param cdefList The list of classification definition (as ENUM type). (NullAllowed: if null (or empty), no condition)
     */
    public void setCollectionStatusCode_InScope_AsCollectionStatus(Collection<LdCDef.CollectionStatus> cdefList) {
        doSetCollectionStatusCode_InScope(cTStrL(cdefList));
    }

    public void doSetCollectionStatusCode_InScope(Collection<String> collectionStatusCodeList) {
        regINS(CK_INS, cTL(collectionStatusCodeList), getCValueCollectionStatusCode(), "COLLECTION_STATUS_CODE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * COLLECTION_STATUS_CODE: {PK, NotNull, CHAR(3), classification=CollectionStatus}
     * @param collectionStatusCodeList The collection of collectionStatusCode as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setCollectionStatusCode_NotInScope(Collection<String> collectionStatusCodeList) {
        doSetCollectionStatusCode_NotInScope(collectionStatusCodeList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As CollectionStatus. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * COLLECTION_STATUS_CODE: {PK, NotNull, CHAR(3), classification=CollectionStatus} <br />
     * 蔵書の状態を示す
     * @param cdefList The list of classification definition (as ENUM type). (NullAllowed: if null (or empty), no condition)
     */
    public void setCollectionStatusCode_NotInScope_AsCollectionStatus(Collection<LdCDef.CollectionStatus> cdefList) {
        doSetCollectionStatusCode_NotInScope(cTStrL(cdefList));
    }

    public void doSetCollectionStatusCode_NotInScope(Collection<String> collectionStatusCodeList) {
        regINS(CK_NINS, cTL(collectionStatusCodeList), getCValueCollectionStatusCode(), "COLLECTION_STATUS_CODE");
    }

    /**
     * Set up ExistsReferrer (co-related sub-query). <br />
     * {exists (select COLLECTION_STATUS_CODE from COLLECTION_STATUS where ...)} <br />
     * COLLECTION_STATUS by COLLECTION_STATUS_CODE, named 'collectionStatusAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">existsCollectionStatusList</span>(new SubQuery&lt;LdCollectionStatusCB&gt;() {
     *     public void query(LdCollectionStatusCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of CollectionStatusList for 'exists'. (NotNull)
     */
    public void existsCollectionStatusList(SubQuery<LdCollectionStatusCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        LdCollectionStatusCB cb = new LdCollectionStatusCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String pp = keepCollectionStatusCode_ExistsReferrer_CollectionStatusList(cb.query()); // for saving query-value.
        registerExistsReferrer(cb.query(), "COLLECTION_STATUS_CODE", "COLLECTION_STATUS_CODE", pp, "collectionStatusList");
    }
    public abstract String keepCollectionStatusCode_ExistsReferrer_CollectionStatusList(LdCollectionStatusCQ sq);

    /**
     * Set up NotExistsReferrer (co-related sub-query). <br />
     * {not exists (select COLLECTION_STATUS_CODE from COLLECTION_STATUS where ...)} <br />
     * COLLECTION_STATUS by COLLECTION_STATUS_CODE, named 'collectionStatusAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">notExistsCollectionStatusList</span>(new SubQuery&lt;LdCollectionStatusCB&gt;() {
     *     public void query(LdCollectionStatusCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of CollectionStatusCode_NotExistsReferrer_CollectionStatusList for 'not exists'. (NotNull)
     */
    public void notExistsCollectionStatusList(SubQuery<LdCollectionStatusCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        LdCollectionStatusCB cb = new LdCollectionStatusCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String pp = keepCollectionStatusCode_NotExistsReferrer_CollectionStatusList(cb.query()); // for saving query-value.
        registerNotExistsReferrer(cb.query(), "COLLECTION_STATUS_CODE", "COLLECTION_STATUS_CODE", pp, "collectionStatusList");
    }
    public abstract String keepCollectionStatusCode_NotExistsReferrer_CollectionStatusList(LdCollectionStatusCQ sq);

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select COLLECTION_STATUS_CODE from COLLECTION_STATUS where ...)} <br />
     * COLLECTION_STATUS by COLLECTION_STATUS_CODE, named 'collectionStatusAsOne'.
     * @param subQuery The sub-query of CollectionStatusList for 'in-scope'. (NotNull)
     */
    public void inScopeCollectionStatusList(SubQuery<LdCollectionStatusCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        LdCollectionStatusCB cb = new LdCollectionStatusCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String pp = keepCollectionStatusCode_InScopeRelation_CollectionStatusList(cb.query()); // for saving query-value.
        registerInScopeRelation(cb.query(), "COLLECTION_STATUS_CODE", "COLLECTION_STATUS_CODE", pp, "collectionStatusList");
    }
    public abstract String keepCollectionStatusCode_InScopeRelation_CollectionStatusList(LdCollectionStatusCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select COLLECTION_STATUS_CODE from COLLECTION_STATUS where ...)} <br />
     * COLLECTION_STATUS by COLLECTION_STATUS_CODE, named 'collectionStatusAsOne'.
     * @param subQuery The sub-query of CollectionStatusList for 'not in-scope'. (NotNull)
     */
    public void notInScopeCollectionStatusList(SubQuery<LdCollectionStatusCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        LdCollectionStatusCB cb = new LdCollectionStatusCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String pp = keepCollectionStatusCode_NotInScopeRelation_CollectionStatusList(cb.query()); // for saving query-value.
        registerNotInScopeRelation(cb.query(), "COLLECTION_STATUS_CODE", "COLLECTION_STATUS_CODE", pp, "collectionStatusList");
    }
    public abstract String keepCollectionStatusCode_NotInScopeRelation_CollectionStatusList(LdCollectionStatusCQ sq);

    public void xsderiveCollectionStatusList(String fn, SubQuery<LdCollectionStatusCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        LdCollectionStatusCB cb = new LdCollectionStatusCB(); cb.xsetupForDerivedReferrer(this); sq.query(cb);
        String pp = keepCollectionStatusCode_SpecifyDerivedReferrer_CollectionStatusList(cb.query()); // for saving query-value.
        registerSpecifyDerivedReferrer(fn, cb.query(), "COLLECTION_STATUS_CODE", "COLLECTION_STATUS_CODE", pp, "collectionStatusList", al, op);
    }
    public abstract String keepCollectionStatusCode_SpecifyDerivedReferrer_CollectionStatusList(LdCollectionStatusCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer. <br />
     * {FOO &lt;= (select max(BAR) from COLLECTION_STATUS where ...)} <br />
     * COLLECTION_STATUS by COLLECTION_STATUS_CODE, named 'collectionStatusAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">derivedCollectionStatusList()</span>.<span style="color: #FD4747">max</span>(new SubQuery&lt;LdCollectionStatusCB&gt;() {
     *     public void query(LdCollectionStatusCB subCB) {
     *         subCB.specify().<span style="color: #FD4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *         subCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     *     }
     * }).<span style="color: #FD4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<LdCollectionStatusCB> derivedCollectionStatusList() {
        return xcreateQDRFunctionCollectionStatusList();
    }
    protected HpQDRFunction<LdCollectionStatusCB> xcreateQDRFunctionCollectionStatusList() {
        return new HpQDRFunction<LdCollectionStatusCB>(new HpQDRSetupper<LdCollectionStatusCB>() {
            public void setup(String fn, SubQuery<LdCollectionStatusCB> sq, String rd, Object vl, DerivedReferrerOption op) {
                xqderiveCollectionStatusList(fn, sq, rd, vl, op);
            }
        });
    }
    public void xqderiveCollectionStatusList(String fn, SubQuery<LdCollectionStatusCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        LdCollectionStatusCB cb = new LdCollectionStatusCB(); cb.xsetupForDerivedReferrer(this); sq.query(cb);
        String sqpp = keepCollectionStatusCode_QueryDerivedReferrer_CollectionStatusList(cb.query()); // for saving query-value.
        String prpp = keepCollectionStatusCode_QueryDerivedReferrer_CollectionStatusListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "COLLECTION_STATUS_CODE", "COLLECTION_STATUS_CODE", sqpp, "collectionStatusList", rd, vl, prpp, op);
    }
    public abstract String keepCollectionStatusCode_QueryDerivedReferrer_CollectionStatusList(LdCollectionStatusCQ sq);
    public abstract String keepCollectionStatusCode_QueryDerivedReferrer_CollectionStatusListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * COLLECTION_STATUS_CODE: {PK, NotNull, CHAR(3), classification=CollectionStatus}
     */
    public void setCollectionStatusCode_IsNull() { regCollectionStatusCode(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * COLLECTION_STATUS_CODE: {PK, NotNull, CHAR(3), classification=CollectionStatus}
     */
    public void setCollectionStatusCode_IsNotNull() { regCollectionStatusCode(CK_ISNN, DOBJ); }

    protected void regCollectionStatusCode(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueCollectionStatusCode(), "COLLECTION_STATUS_CODE"); }
    protected abstract ConditionValue getCValueCollectionStatusCode();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * COLLECTION_STATUS_NAME: {NotNull, VARCHAR(80)}
     * @param collectionStatusName The value of collectionStatusName as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setCollectionStatusName_Equal(String collectionStatusName) {
        doSetCollectionStatusName_Equal(fRES(collectionStatusName));
    }

    protected void doSetCollectionStatusName_Equal(String collectionStatusName) {
        regCollectionStatusName(CK_EQ, collectionStatusName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * COLLECTION_STATUS_NAME: {NotNull, VARCHAR(80)}
     * @param collectionStatusName The value of collectionStatusName as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setCollectionStatusName_NotEqual(String collectionStatusName) {
        doSetCollectionStatusName_NotEqual(fRES(collectionStatusName));
    }

    protected void doSetCollectionStatusName_NotEqual(String collectionStatusName) {
        regCollectionStatusName(CK_NES, collectionStatusName);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * COLLECTION_STATUS_NAME: {NotNull, VARCHAR(80)}
     * @param collectionStatusName The value of collectionStatusName as greaterThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setCollectionStatusName_GreaterThan(String collectionStatusName) {
        regCollectionStatusName(CK_GT, fRES(collectionStatusName));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * COLLECTION_STATUS_NAME: {NotNull, VARCHAR(80)}
     * @param collectionStatusName The value of collectionStatusName as lessThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setCollectionStatusName_LessThan(String collectionStatusName) {
        regCollectionStatusName(CK_LT, fRES(collectionStatusName));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * COLLECTION_STATUS_NAME: {NotNull, VARCHAR(80)}
     * @param collectionStatusName The value of collectionStatusName as greaterEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setCollectionStatusName_GreaterEqual(String collectionStatusName) {
        regCollectionStatusName(CK_GE, fRES(collectionStatusName));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * COLLECTION_STATUS_NAME: {NotNull, VARCHAR(80)}
     * @param collectionStatusName The value of collectionStatusName as lessEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setCollectionStatusName_LessEqual(String collectionStatusName) {
        regCollectionStatusName(CK_LE, fRES(collectionStatusName));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * COLLECTION_STATUS_NAME: {NotNull, VARCHAR(80)}
     * @param collectionStatusNameList The collection of collectionStatusName as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setCollectionStatusName_InScope(Collection<String> collectionStatusNameList) {
        doSetCollectionStatusName_InScope(collectionStatusNameList);
    }

    public void doSetCollectionStatusName_InScope(Collection<String> collectionStatusNameList) {
        regINS(CK_INS, cTL(collectionStatusNameList), getCValueCollectionStatusName(), "COLLECTION_STATUS_NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * COLLECTION_STATUS_NAME: {NotNull, VARCHAR(80)}
     * @param collectionStatusNameList The collection of collectionStatusName as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setCollectionStatusName_NotInScope(Collection<String> collectionStatusNameList) {
        doSetCollectionStatusName_NotInScope(collectionStatusNameList);
    }

    public void doSetCollectionStatusName_NotInScope(Collection<String> collectionStatusNameList) {
        regINS(CK_NINS, cTL(collectionStatusNameList), getCValueCollectionStatusName(), "COLLECTION_STATUS_NAME");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * COLLECTION_STATUS_NAME: {NotNull, VARCHAR(80)}
     * @param collectionStatusName The value of collectionStatusName as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setCollectionStatusName_PrefixSearch(String collectionStatusName) {
        setCollectionStatusName_LikeSearch(collectionStatusName, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * COLLECTION_STATUS_NAME: {NotNull, VARCHAR(80)} <br />
     * <pre>e.g. setCollectionStatusName_LikeSearch("xxx", new <span style="color: #FD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param collectionStatusName The value of collectionStatusName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCollectionStatusName_LikeSearch(String collectionStatusName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(collectionStatusName), getCValueCollectionStatusName(), "COLLECTION_STATUS_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * COLLECTION_STATUS_NAME: {NotNull, VARCHAR(80)}
     * @param collectionStatusName The value of collectionStatusName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCollectionStatusName_NotLikeSearch(String collectionStatusName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(collectionStatusName), getCValueCollectionStatusName(), "COLLECTION_STATUS_NAME", likeSearchOption);
    }

    protected void regCollectionStatusName(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueCollectionStatusName(), "COLLECTION_STATUS_NAME"); }
    protected abstract ConditionValue getCValueCollectionStatusName();

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
     * cb.query().<span style="color: #FD4747">scalar_Equal()</span>.max(new SubQuery&lt;LdCollectionStatusLookupCB&gt;() {
     *     public void query(LdCollectionStatusLookupCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<LdCollectionStatusLookupCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ.getOperand(), LdCollectionStatusLookupCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;LdCollectionStatusLookupCB&gt;() {
     *     public void query(LdCollectionStatusLookupCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<LdCollectionStatusLookupCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES.getOperand(), LdCollectionStatusLookupCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;LdCollectionStatusLookupCB&gt;() {
     *     public void query(LdCollectionStatusLookupCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<LdCollectionStatusLookupCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT.getOperand(), LdCollectionStatusLookupCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessThan()</span>.max(new SubQuery&lt;LdCollectionStatusLookupCB&gt;() {
     *     public void query(LdCollectionStatusLookupCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<LdCollectionStatusLookupCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT.getOperand(), LdCollectionStatusLookupCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;LdCollectionStatusLookupCB&gt;() {
     *     public void query(LdCollectionStatusLookupCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<LdCollectionStatusLookupCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE.getOperand(), LdCollectionStatusLookupCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;LdCollectionStatusLookupCB&gt;() {
     *     public void query(LdCollectionStatusLookupCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<LdCollectionStatusLookupCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE.getOperand(), LdCollectionStatusLookupCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSSQOption<CB> op) {
        assertObjectNotNull("subQuery", sq);
        LdCollectionStatusLookupCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        op.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, op);
    }
    public abstract String keepScalarCondition(LdCollectionStatusLookupCQ sq);

    protected LdCollectionStatusLookupCB xcreateScalarConditionCB() {
        LdCollectionStatusLookupCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected LdCollectionStatusLookupCB xcreateScalarConditionPartitionByCB() {
        LdCollectionStatusLookupCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<LdCollectionStatusLookupCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        LdCollectionStatusLookupCB cb = new LdCollectionStatusLookupCB(); cb.xsetupForDerivedReferrer(this); sq.query(cb);
        String pk = "COLLECTION_STATUS_CODE";
        String pp = keepSpecifyMyselfDerived(cb.query()); // for saving query-value.
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(LdCollectionStatusLookupCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (SubQuery).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<LdCollectionStatusLookupCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(LdCollectionStatusLookupCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        LdCollectionStatusLookupCB cb = new LdCollectionStatusLookupCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "COLLECTION_STATUS_CODE";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(LdCollectionStatusLookupCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfExists(SubQuery<LdCollectionStatusLookupCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        LdCollectionStatusLookupCB cb = new LdCollectionStatusLookupCB(); cb.xsetupForMyselfExists(this); subQuery.query(cb);
        String pp = keepMyselfExists(cb.query()); // for saving query-value.
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(LdCollectionStatusLookupCQ sq);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfInScope(SubQuery<LdCollectionStatusLookupCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        LdCollectionStatusLookupCB cb = new LdCollectionStatusLookupCB(); cb.xsetupForMyselfInScope(this); subQuery.query(cb);
        String pp = keepMyselfInScope(cb.query()); // for saving query-value.
        registerMyselfInScope(cb.query(), pp);
    }
    public abstract String keepMyselfInScope(LdCollectionStatusLookupCQ sq);

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    protected LdCollectionStatusLookupCB newMyCB() {
        return new LdCollectionStatusLookupCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabCQ() { return LdCollectionStatusLookupCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
