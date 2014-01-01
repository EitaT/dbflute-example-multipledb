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
 * The abstract condition-query of BLACK_ACTION.
 * @author DBFlute(AutoGenerator)
 */
public abstract class LdAbstractBsBlackActionCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public LdAbstractBsBlackActionCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "BLACK_ACTION";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * BLACK_ACTION_ID: {PK, ID, NotNull, INTEGER(10)}
     * @param blackActionId The value of blackActionId as equal. (NullAllowed: if null, no condition)
     */
    public void setBlackActionId_Equal(Integer blackActionId) {
        doSetBlackActionId_Equal(blackActionId);
    }

    protected void doSetBlackActionId_Equal(Integer blackActionId) {
        regBlackActionId(CK_EQ, blackActionId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * BLACK_ACTION_ID: {PK, ID, NotNull, INTEGER(10)}
     * @param blackActionId The value of blackActionId as notEqual. (NullAllowed: if null, no condition)
     */
    public void setBlackActionId_NotEqual(Integer blackActionId) {
        doSetBlackActionId_NotEqual(blackActionId);
    }

    protected void doSetBlackActionId_NotEqual(Integer blackActionId) {
        regBlackActionId(CK_NES, blackActionId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * BLACK_ACTION_ID: {PK, ID, NotNull, INTEGER(10)}
     * @param blackActionId The value of blackActionId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setBlackActionId_GreaterThan(Integer blackActionId) {
        regBlackActionId(CK_GT, blackActionId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * BLACK_ACTION_ID: {PK, ID, NotNull, INTEGER(10)}
     * @param blackActionId The value of blackActionId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setBlackActionId_LessThan(Integer blackActionId) {
        regBlackActionId(CK_LT, blackActionId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * BLACK_ACTION_ID: {PK, ID, NotNull, INTEGER(10)}
     * @param blackActionId The value of blackActionId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setBlackActionId_GreaterEqual(Integer blackActionId) {
        regBlackActionId(CK_GE, blackActionId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * BLACK_ACTION_ID: {PK, ID, NotNull, INTEGER(10)}
     * @param blackActionId The value of blackActionId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setBlackActionId_LessEqual(Integer blackActionId) {
        regBlackActionId(CK_LE, blackActionId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * BLACK_ACTION_ID: {PK, ID, NotNull, INTEGER(10)}
     * @param minNumber The min number of blackActionId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of blackActionId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setBlackActionId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueBlackActionId(), "BLACK_ACTION_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * BLACK_ACTION_ID: {PK, ID, NotNull, INTEGER(10)}
     * @param blackActionIdList The collection of blackActionId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setBlackActionId_InScope(Collection<Integer> blackActionIdList) {
        doSetBlackActionId_InScope(blackActionIdList);
    }

    protected void doSetBlackActionId_InScope(Collection<Integer> blackActionIdList) {
        regINS(CK_INS, cTL(blackActionIdList), getCValueBlackActionId(), "BLACK_ACTION_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * BLACK_ACTION_ID: {PK, ID, NotNull, INTEGER(10)}
     * @param blackActionIdList The collection of blackActionId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setBlackActionId_NotInScope(Collection<Integer> blackActionIdList) {
        doSetBlackActionId_NotInScope(blackActionIdList);
    }

    protected void doSetBlackActionId_NotInScope(Collection<Integer> blackActionIdList) {
        regINS(CK_NINS, cTL(blackActionIdList), getCValueBlackActionId(), "BLACK_ACTION_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * BLACK_ACTION_ID: {PK, ID, NotNull, INTEGER(10)}
     */
    public void setBlackActionId_IsNull() { regBlackActionId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * BLACK_ACTION_ID: {PK, ID, NotNull, INTEGER(10)}
     */
    public void setBlackActionId_IsNotNull() { regBlackActionId(CK_ISNN, DOBJ); }

    protected void regBlackActionId(ConditionKey k, Object v) { regQ(k, v, getCValueBlackActionId(), "BLACK_ACTION_ID"); }
    abstract protected ConditionValue getCValueBlackActionId();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * BLACK_LIST_ID: {IX, NotNull, INTEGER(10), FK to BLACK_LIST}
     * @param blackListId The value of blackListId as equal. (NullAllowed: if null, no condition)
     */
    public void setBlackListId_Equal(Integer blackListId) {
        doSetBlackListId_Equal(blackListId);
    }

    protected void doSetBlackListId_Equal(Integer blackListId) {
        regBlackListId(CK_EQ, blackListId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * BLACK_LIST_ID: {IX, NotNull, INTEGER(10), FK to BLACK_LIST}
     * @param blackListId The value of blackListId as notEqual. (NullAllowed: if null, no condition)
     */
    public void setBlackListId_NotEqual(Integer blackListId) {
        doSetBlackListId_NotEqual(blackListId);
    }

    protected void doSetBlackListId_NotEqual(Integer blackListId) {
        regBlackListId(CK_NES, blackListId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * BLACK_LIST_ID: {IX, NotNull, INTEGER(10), FK to BLACK_LIST}
     * @param blackListId The value of blackListId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setBlackListId_GreaterThan(Integer blackListId) {
        regBlackListId(CK_GT, blackListId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * BLACK_LIST_ID: {IX, NotNull, INTEGER(10), FK to BLACK_LIST}
     * @param blackListId The value of blackListId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setBlackListId_LessThan(Integer blackListId) {
        regBlackListId(CK_LT, blackListId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * BLACK_LIST_ID: {IX, NotNull, INTEGER(10), FK to BLACK_LIST}
     * @param blackListId The value of blackListId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setBlackListId_GreaterEqual(Integer blackListId) {
        regBlackListId(CK_GE, blackListId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * BLACK_LIST_ID: {IX, NotNull, INTEGER(10), FK to BLACK_LIST}
     * @param blackListId The value of blackListId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setBlackListId_LessEqual(Integer blackListId) {
        regBlackListId(CK_LE, blackListId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * BLACK_LIST_ID: {IX, NotNull, INTEGER(10), FK to BLACK_LIST}
     * @param minNumber The min number of blackListId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of blackListId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setBlackListId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueBlackListId(), "BLACK_LIST_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * BLACK_LIST_ID: {IX, NotNull, INTEGER(10), FK to BLACK_LIST}
     * @param blackListIdList The collection of blackListId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setBlackListId_InScope(Collection<Integer> blackListIdList) {
        doSetBlackListId_InScope(blackListIdList);
    }

    protected void doSetBlackListId_InScope(Collection<Integer> blackListIdList) {
        regINS(CK_INS, cTL(blackListIdList), getCValueBlackListId(), "BLACK_LIST_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * BLACK_LIST_ID: {IX, NotNull, INTEGER(10), FK to BLACK_LIST}
     * @param blackListIdList The collection of blackListId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setBlackListId_NotInScope(Collection<Integer> blackListIdList) {
        doSetBlackListId_NotInScope(blackListIdList);
    }

    protected void doSetBlackListId_NotInScope(Collection<Integer> blackListIdList) {
        regINS(CK_NINS, cTL(blackListIdList), getCValueBlackListId(), "BLACK_LIST_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select BLACK_LIST_ID from BLACK_LIST where ...)} <br />
     * BLACK_LIST by my BLACK_LIST_ID, named 'blackList'.
     * @param subQuery The sub-query of BlackList for 'in-scope'. (NotNull)
     */
    public void inScopeBlackList(SubQuery<LdBlackListCB> subQuery) {
        assertObjectNotNull("subQuery<LdBlackListCB>", subQuery);
        LdBlackListCB cb = new LdBlackListCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepBlackListId_InScopeRelation_BlackList(cb.query()); // for saving query-value.
        registerInScopeRelation(cb.query(), "BLACK_LIST_ID", "BLACK_LIST_ID", subQueryPropertyName, "blackList");
    }
    public abstract String keepBlackListId_InScopeRelation_BlackList(LdBlackListCQ subQuery);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select BLACK_LIST_ID from BLACK_LIST where ...)} <br />
     * BLACK_LIST by my BLACK_LIST_ID, named 'blackList'.
     * @param subQuery The sub-query of BlackList for 'not in-scope'. (NotNull)
     */
    public void notInScopeBlackList(SubQuery<LdBlackListCB> subQuery) {
        assertObjectNotNull("subQuery<LdBlackListCB>", subQuery);
        LdBlackListCB cb = new LdBlackListCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepBlackListId_NotInScopeRelation_BlackList(cb.query()); // for saving query-value.
        registerNotInScopeRelation(cb.query(), "BLACK_LIST_ID", "BLACK_LIST_ID", subQueryPropertyName, "blackList");
    }
    public abstract String keepBlackListId_NotInScopeRelation_BlackList(LdBlackListCQ subQuery);

    protected void regBlackListId(ConditionKey k, Object v) { regQ(k, v, getCValueBlackListId(), "BLACK_LIST_ID"); }
    abstract protected ConditionValue getCValueBlackListId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * BLACK_ACTION_CODE: {IX, NotNull, CHAR(3), FK to BLACK_ACTION_LOOKUP}
     * @param blackActionCode The value of blackActionCode as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setBlackActionCode_Equal(String blackActionCode) {
        doSetBlackActionCode_Equal(fRES(blackActionCode));
    }

    protected void doSetBlackActionCode_Equal(String blackActionCode) {
        regBlackActionCode(CK_EQ, blackActionCode);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * BLACK_ACTION_CODE: {IX, NotNull, CHAR(3), FK to BLACK_ACTION_LOOKUP}
     * @param blackActionCode The value of blackActionCode as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setBlackActionCode_NotEqual(String blackActionCode) {
        doSetBlackActionCode_NotEqual(fRES(blackActionCode));
    }

    protected void doSetBlackActionCode_NotEqual(String blackActionCode) {
        regBlackActionCode(CK_NES, blackActionCode);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * BLACK_ACTION_CODE: {IX, NotNull, CHAR(3), FK to BLACK_ACTION_LOOKUP}
     * @param blackActionCode The value of blackActionCode as greaterThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setBlackActionCode_GreaterThan(String blackActionCode) {
        regBlackActionCode(CK_GT, fRES(blackActionCode));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * BLACK_ACTION_CODE: {IX, NotNull, CHAR(3), FK to BLACK_ACTION_LOOKUP}
     * @param blackActionCode The value of blackActionCode as lessThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setBlackActionCode_LessThan(String blackActionCode) {
        regBlackActionCode(CK_LT, fRES(blackActionCode));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * BLACK_ACTION_CODE: {IX, NotNull, CHAR(3), FK to BLACK_ACTION_LOOKUP}
     * @param blackActionCode The value of blackActionCode as greaterEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setBlackActionCode_GreaterEqual(String blackActionCode) {
        regBlackActionCode(CK_GE, fRES(blackActionCode));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * BLACK_ACTION_CODE: {IX, NotNull, CHAR(3), FK to BLACK_ACTION_LOOKUP}
     * @param blackActionCode The value of blackActionCode as lessEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setBlackActionCode_LessEqual(String blackActionCode) {
        regBlackActionCode(CK_LE, fRES(blackActionCode));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * BLACK_ACTION_CODE: {IX, NotNull, CHAR(3), FK to BLACK_ACTION_LOOKUP}
     * @param blackActionCodeList The collection of blackActionCode as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setBlackActionCode_InScope(Collection<String> blackActionCodeList) {
        doSetBlackActionCode_InScope(blackActionCodeList);
    }

    public void doSetBlackActionCode_InScope(Collection<String> blackActionCodeList) {
        regINS(CK_INS, cTL(blackActionCodeList), getCValueBlackActionCode(), "BLACK_ACTION_CODE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * BLACK_ACTION_CODE: {IX, NotNull, CHAR(3), FK to BLACK_ACTION_LOOKUP}
     * @param blackActionCodeList The collection of blackActionCode as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setBlackActionCode_NotInScope(Collection<String> blackActionCodeList) {
        doSetBlackActionCode_NotInScope(blackActionCodeList);
    }

    public void doSetBlackActionCode_NotInScope(Collection<String> blackActionCodeList) {
        regINS(CK_NINS, cTL(blackActionCodeList), getCValueBlackActionCode(), "BLACK_ACTION_CODE");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * BLACK_ACTION_CODE: {IX, NotNull, CHAR(3), FK to BLACK_ACTION_LOOKUP}
     * @param blackActionCode The value of blackActionCode as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setBlackActionCode_PrefixSearch(String blackActionCode) {
        setBlackActionCode_LikeSearch(blackActionCode, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * BLACK_ACTION_CODE: {IX, NotNull, CHAR(3), FK to BLACK_ACTION_LOOKUP} <br />
     * <pre>e.g. setBlackActionCode_LikeSearch("xxx", new <span style="color: #FD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param blackActionCode The value of blackActionCode as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setBlackActionCode_LikeSearch(String blackActionCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(blackActionCode), getCValueBlackActionCode(), "BLACK_ACTION_CODE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * BLACK_ACTION_CODE: {IX, NotNull, CHAR(3), FK to BLACK_ACTION_LOOKUP}
     * @param blackActionCode The value of blackActionCode as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setBlackActionCode_NotLikeSearch(String blackActionCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(blackActionCode), getCValueBlackActionCode(), "BLACK_ACTION_CODE", likeSearchOption);
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select BLACK_ACTION_CODE from BLACK_ACTION_LOOKUP where ...)} <br />
     * BLACK_ACTION_LOOKUP by my BLACK_ACTION_CODE, named 'blackActionLookup'.
     * @param subQuery The sub-query of BlackActionLookup for 'in-scope'. (NotNull)
     */
    public void inScopeBlackActionLookup(SubQuery<LdBlackActionLookupCB> subQuery) {
        assertObjectNotNull("subQuery<LdBlackActionLookupCB>", subQuery);
        LdBlackActionLookupCB cb = new LdBlackActionLookupCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepBlackActionCode_InScopeRelation_BlackActionLookup(cb.query()); // for saving query-value.
        registerInScopeRelation(cb.query(), "BLACK_ACTION_CODE", "BLACK_ACTION_CODE", subQueryPropertyName, "blackActionLookup");
    }
    public abstract String keepBlackActionCode_InScopeRelation_BlackActionLookup(LdBlackActionLookupCQ subQuery);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select BLACK_ACTION_CODE from BLACK_ACTION_LOOKUP where ...)} <br />
     * BLACK_ACTION_LOOKUP by my BLACK_ACTION_CODE, named 'blackActionLookup'.
     * @param subQuery The sub-query of BlackActionLookup for 'not in-scope'. (NotNull)
     */
    public void notInScopeBlackActionLookup(SubQuery<LdBlackActionLookupCB> subQuery) {
        assertObjectNotNull("subQuery<LdBlackActionLookupCB>", subQuery);
        LdBlackActionLookupCB cb = new LdBlackActionLookupCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepBlackActionCode_NotInScopeRelation_BlackActionLookup(cb.query()); // for saving query-value.
        registerNotInScopeRelation(cb.query(), "BLACK_ACTION_CODE", "BLACK_ACTION_CODE", subQueryPropertyName, "blackActionLookup");
    }
    public abstract String keepBlackActionCode_NotInScopeRelation_BlackActionLookup(LdBlackActionLookupCQ subQuery);

    protected void regBlackActionCode(ConditionKey k, Object v) { regQ(k, v, getCValueBlackActionCode(), "BLACK_ACTION_CODE"); }
    abstract protected ConditionValue getCValueBlackActionCode();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * BLACK_LEVEL: {NotNull, SMALLINT(5)}
     * @param blackLevel The value of blackLevel as equal. (NullAllowed: if null, no condition)
     */
    public void setBlackLevel_Equal(Integer blackLevel) {
        doSetBlackLevel_Equal(blackLevel);
    }

    protected void doSetBlackLevel_Equal(Integer blackLevel) {
        regBlackLevel(CK_EQ, blackLevel);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * BLACK_LEVEL: {NotNull, SMALLINT(5)}
     * @param blackLevel The value of blackLevel as notEqual. (NullAllowed: if null, no condition)
     */
    public void setBlackLevel_NotEqual(Integer blackLevel) {
        doSetBlackLevel_NotEqual(blackLevel);
    }

    protected void doSetBlackLevel_NotEqual(Integer blackLevel) {
        regBlackLevel(CK_NES, blackLevel);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * BLACK_LEVEL: {NotNull, SMALLINT(5)}
     * @param blackLevel The value of blackLevel as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setBlackLevel_GreaterThan(Integer blackLevel) {
        regBlackLevel(CK_GT, blackLevel);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * BLACK_LEVEL: {NotNull, SMALLINT(5)}
     * @param blackLevel The value of blackLevel as lessThan. (NullAllowed: if null, no condition)
     */
    public void setBlackLevel_LessThan(Integer blackLevel) {
        regBlackLevel(CK_LT, blackLevel);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * BLACK_LEVEL: {NotNull, SMALLINT(5)}
     * @param blackLevel The value of blackLevel as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setBlackLevel_GreaterEqual(Integer blackLevel) {
        regBlackLevel(CK_GE, blackLevel);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * BLACK_LEVEL: {NotNull, SMALLINT(5)}
     * @param blackLevel The value of blackLevel as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setBlackLevel_LessEqual(Integer blackLevel) {
        regBlackLevel(CK_LE, blackLevel);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * BLACK_LEVEL: {NotNull, SMALLINT(5)}
     * @param minNumber The min number of blackLevel. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of blackLevel. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setBlackLevel_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueBlackLevel(), "BLACK_LEVEL", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * BLACK_LEVEL: {NotNull, SMALLINT(5)}
     * @param blackLevelList The collection of blackLevel as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setBlackLevel_InScope(Collection<Integer> blackLevelList) {
        doSetBlackLevel_InScope(blackLevelList);
    }

    protected void doSetBlackLevel_InScope(Collection<Integer> blackLevelList) {
        regINS(CK_INS, cTL(blackLevelList), getCValueBlackLevel(), "BLACK_LEVEL");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * BLACK_LEVEL: {NotNull, SMALLINT(5)}
     * @param blackLevelList The collection of blackLevel as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setBlackLevel_NotInScope(Collection<Integer> blackLevelList) {
        doSetBlackLevel_NotInScope(blackLevelList);
    }

    protected void doSetBlackLevel_NotInScope(Collection<Integer> blackLevelList) {
        regINS(CK_NINS, cTL(blackLevelList), getCValueBlackLevel(), "BLACK_LEVEL");
    }

    protected void regBlackLevel(ConditionKey k, Object v) { regQ(k, v, getCValueBlackLevel(), "BLACK_LEVEL"); }
    abstract protected ConditionValue getCValueBlackLevel();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * ACTION_DATE: {TIMESTAMP(26, 6)}
     * @param actionDate The value of actionDate as equal. (NullAllowed: if null, no condition)
     */
    public void setActionDate_Equal(java.sql.Timestamp actionDate) {
        regActionDate(CK_EQ,  actionDate);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * ACTION_DATE: {TIMESTAMP(26, 6)}
     * @param actionDate The value of actionDate as notEqual. (NullAllowed: if null, no condition)
     */
    public void setActionDate_NotEqual(java.sql.Timestamp actionDate) {
        regActionDate(CK_NES,  actionDate);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * ACTION_DATE: {TIMESTAMP(26, 6)}
     * @param actionDate The value of actionDate as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setActionDate_GreaterThan(java.sql.Timestamp actionDate) {
        regActionDate(CK_GT,  actionDate);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * ACTION_DATE: {TIMESTAMP(26, 6)}
     * @param actionDate The value of actionDate as lessThan. (NullAllowed: if null, no condition)
     */
    public void setActionDate_LessThan(java.sql.Timestamp actionDate) {
        regActionDate(CK_LT,  actionDate);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * ACTION_DATE: {TIMESTAMP(26, 6)}
     * @param actionDate The value of actionDate as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setActionDate_GreaterEqual(java.sql.Timestamp actionDate) {
        regActionDate(CK_GE,  actionDate);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * ACTION_DATE: {TIMESTAMP(26, 6)}
     * @param actionDate The value of actionDate as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setActionDate_LessEqual(java.sql.Timestamp actionDate) {
        regActionDate(CK_LE, actionDate);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * ACTION_DATE: {TIMESTAMP(26, 6)}
     * <pre>e.g. setActionDate_FromTo(fromDate, toDate, new <span style="color: #FD4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of actionDate. (NullAllowed: if null, no from-condition)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of actionDate. (NullAllowed: if null, no to-condition)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setActionDate_FromTo(java.util.Date fromDatetime, java.util.Date toDatetime, FromToOption fromToOption) {
        regFTQ((fromDatetime != null ? new java.sql.Timestamp(fromDatetime.getTime()) : null), (toDatetime != null ? new java.sql.Timestamp(toDatetime.getTime()) : null), getCValueActionDate(), "ACTION_DATE", fromToOption);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) {fromDate &lt;= column &lt; toDate + 1 day} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * ACTION_DATE: {TIMESTAMP(26, 6)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #FD4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of actionDate. (NullAllowed: if null, no from-condition)
     * @param toDate The to-date(yyyy/MM/dd) of actionDate. (NullAllowed: if null, no to-condition)
     */
    public void setActionDate_DateFromTo(java.util.Date fromDate, java.util.Date toDate) {
        setActionDate_FromTo(fromDate, toDate, new FromToOption().compareAsDate());
    }

    /**
     * InScope {in ('1965-03-03', '1966-09-15')}. And NullOrEmptyIgnored, NullElementIgnored, SeveralRegistered. <br />
     * ACTION_DATE: {TIMESTAMP(26, 6)}
     * @param actionDateList The collection of actionDate as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setActionDate_InScope(Collection<java.sql.Timestamp> actionDateList) {
        doSetActionDate_InScope(actionDateList);
    }

    protected void doSetActionDate_InScope(Collection<java.sql.Timestamp> actionDateList) {
        regINS(CK_INS, cTL(actionDateList), getCValueActionDate(), "ACTION_DATE");
    }

    /**
     * NotInScope {not in ('1965-03-03', '1966-09-15')}. And NullOrEmptyIgnored, NullElementIgnored, SeveralRegistered. <br />
     * ACTION_DATE: {TIMESTAMP(26, 6)}
     * @param actionDateList The collection of actionDate as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setActionDate_NotInScope(Collection<java.sql.Timestamp> actionDateList) {
        doSetActionDate_NotInScope(actionDateList);
    }

    protected void doSetActionDate_NotInScope(Collection<java.sql.Timestamp> actionDateList) {
        regINS(CK_NINS, cTL(actionDateList), getCValueActionDate(), "ACTION_DATE");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * ACTION_DATE: {TIMESTAMP(26, 6)}
     */
    public void setActionDate_IsNull() { regActionDate(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * ACTION_DATE: {TIMESTAMP(26, 6)}
     */
    public void setActionDate_IsNotNull() { regActionDate(CK_ISNN, DOBJ); }

    protected void regActionDate(ConditionKey k, Object v) { regQ(k, v, getCValueActionDate(), "ACTION_DATE"); }
    abstract protected ConditionValue getCValueActionDate();

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * EVIDENCE_PHOTOGRAPH: {BLOB(2147483647)}
     */
    public void setEvidencePhotograph_IsNull() { regEvidencePhotograph(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * EVIDENCE_PHOTOGRAPH: {BLOB(2147483647)}
     */
    public void setEvidencePhotograph_IsNotNull() { regEvidencePhotograph(CK_ISNN, DOBJ); }

    protected void regEvidencePhotograph(ConditionKey k, Object v) { regQ(k, v, getCValueEvidencePhotograph(), "EVIDENCE_PHOTOGRAPH"); }
    abstract protected ConditionValue getCValueEvidencePhotograph();

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
     * cb.query().<span style="color: #FD4747">scalar_Equal()</span>.max(new SubQuery&lt;LdBlackActionCB&gt;() {
     *     public void query(LdBlackActionCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<LdBlackActionCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ.getOperand());
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;LdBlackActionCB&gt;() {
     *     public void query(LdBlackActionCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<LdBlackActionCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;LdBlackActionCB&gt;() {
     *     public void query(LdBlackActionCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<LdBlackActionCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessThan()</span>.max(new SubQuery&lt;LdBlackActionCB&gt;() {
     *     public void query(LdBlackActionCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<LdBlackActionCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;LdBlackActionCB&gt;() {
     *     public void query(LdBlackActionCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<LdBlackActionCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;LdBlackActionCB&gt;() {
     *     public void query(LdBlackActionCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<LdBlackActionCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE.getOperand());
    }

    protected HpSSQFunction<LdBlackActionCB> xcreateSSQFunction(final String operand) {
        return new HpSSQFunction<LdBlackActionCB>(new HpSSQSetupper<LdBlackActionCB>() {
            public void setup(String function, SubQuery<LdBlackActionCB> subQuery, HpSSQOption<LdBlackActionCB> option) {
                xscalarCondition(function, subQuery, operand, option);
            }
        });
    }

    protected void xscalarCondition(String function, SubQuery<LdBlackActionCB> subQuery, String operand, HpSSQOption<LdBlackActionCB> option) {
        assertObjectNotNull("subQuery<LdBlackActionCB>", subQuery);
        LdBlackActionCB cb = xcreateScalarConditionCB(); subQuery.query(cb);
        String subQueryPropertyName = keepScalarCondition(cb.query()); // for saving query-value
        option.setPartitionByCBean(xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(function, cb.query(), subQueryPropertyName, operand, option);
    }
    public abstract String keepScalarCondition(LdBlackActionCQ subQuery);

    protected LdBlackActionCB xcreateScalarConditionCB() {
        LdBlackActionCB cb = new LdBlackActionCB();
        cb.xsetupForScalarCondition(this);
        return cb;
    }

    protected LdBlackActionCB xcreateScalarConditionPartitionByCB() {
        LdBlackActionCB cb = new LdBlackActionCB();
        cb.xsetupForScalarConditionPartitionBy(this);
        return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String function, SubQuery<LdBlackActionCB> subQuery, String aliasName, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<LdBlackActionCB>", subQuery);
        LdBlackActionCB cb = new LdBlackActionCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepSpecifyMyselfDerived(cb.query()); // for saving query-value.
        registerSpecifyMyselfDerived(function, cb.query(), "BLACK_ACTION_ID", "BLACK_ACTION_ID", subQueryPropertyName, "myselfDerived", aliasName, option);
    }
    public abstract String keepSpecifyMyselfDerived(LdBlackActionCQ subQuery);

    /**
     * Prepare for (Query)MyselfDerived (SubQuery).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<LdBlackActionCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived();
    }
    protected HpQDRFunction<LdBlackActionCB> xcreateQDRFunctionMyselfDerived() {
        return new HpQDRFunction<LdBlackActionCB>(new HpQDRSetupper<LdBlackActionCB>() {
            public void setup(String function, SubQuery<LdBlackActionCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
                xqderiveMyselfDerived(function, subQuery, operand, value, option);
            }
        });
    }
    public void xqderiveMyselfDerived(String function, SubQuery<LdBlackActionCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<LdBlackActionCB>", subQuery);
        LdBlackActionCB cb = new LdBlackActionCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String parameterPropertyName = keepQueryMyselfDerivedParameter(value);
        registerQueryMyselfDerived(function, cb.query(), "BLACK_ACTION_ID", "BLACK_ACTION_ID", subQueryPropertyName, "myselfDerived", operand, value, parameterPropertyName, option);
    }
    public abstract String keepQueryMyselfDerived(LdBlackActionCQ subQuery);
    public abstract String keepQueryMyselfDerivedParameter(Object parameterValue);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfExists(SubQuery<LdBlackActionCB> subQuery) {
        assertObjectNotNull("subQuery<LdBlackActionCB>", subQuery);
        LdBlackActionCB cb = new LdBlackActionCB(); cb.xsetupForMyselfExists(this); subQuery.query(cb);
        String subQueryPropertyName = keepMyselfExists(cb.query()); // for saving query-value.
        registerMyselfExists(cb.query(), subQueryPropertyName);
    }
    public abstract String keepMyselfExists(LdBlackActionCQ subQuery);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfInScope(SubQuery<LdBlackActionCB> subQuery) {
        assertObjectNotNull("subQuery<LdBlackActionCB>", subQuery);
        LdBlackActionCB cb = new LdBlackActionCB(); cb.xsetupForMyselfInScope(this); subQuery.query(cb);
        String subQueryPropertyName = keepMyselfInScope(cb.query()); // for saving query-value.
        registerMyselfInScope(cb.query(), subQueryPropertyName);
    }
    public abstract String keepMyselfInScope(LdBlackActionCQ subQuery);

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabCB() { return LdBlackActionCB.class.getName(); }
    protected String xabCQ() { return LdBlackActionCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
