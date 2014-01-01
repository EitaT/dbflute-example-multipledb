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
 * The abstract condition-query of BLACK_LIST.
 * @author DBFlute(AutoGenerator)
 */
public abstract class LdAbstractBsBlackListCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public LdAbstractBsBlackListCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "BLACK_LIST";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * BLACK_LIST_ID: {PK, ID, NotNull, INTEGER(10)}
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
     * BLACK_LIST_ID: {PK, ID, NotNull, INTEGER(10)}
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
     * BLACK_LIST_ID: {PK, ID, NotNull, INTEGER(10)}
     * @param blackListId The value of blackListId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setBlackListId_GreaterThan(Integer blackListId) {
        regBlackListId(CK_GT, blackListId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * BLACK_LIST_ID: {PK, ID, NotNull, INTEGER(10)}
     * @param blackListId The value of blackListId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setBlackListId_LessThan(Integer blackListId) {
        regBlackListId(CK_LT, blackListId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * BLACK_LIST_ID: {PK, ID, NotNull, INTEGER(10)}
     * @param blackListId The value of blackListId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setBlackListId_GreaterEqual(Integer blackListId) {
        regBlackListId(CK_GE, blackListId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * BLACK_LIST_ID: {PK, ID, NotNull, INTEGER(10)}
     * @param blackListId The value of blackListId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setBlackListId_LessEqual(Integer blackListId) {
        regBlackListId(CK_LE, blackListId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * BLACK_LIST_ID: {PK, ID, NotNull, INTEGER(10)}
     * @param minNumber The min number of blackListId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of blackListId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setBlackListId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueBlackListId(), "BLACK_LIST_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * BLACK_LIST_ID: {PK, ID, NotNull, INTEGER(10)}
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
     * BLACK_LIST_ID: {PK, ID, NotNull, INTEGER(10)}
     * @param blackListIdList The collection of blackListId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setBlackListId_NotInScope(Collection<Integer> blackListIdList) {
        doSetBlackListId_NotInScope(blackListIdList);
    }

    protected void doSetBlackListId_NotInScope(Collection<Integer> blackListIdList) {
        regINS(CK_NINS, cTL(blackListIdList), getCValueBlackListId(), "BLACK_LIST_ID");
    }

    /**
     * Set up ExistsReferrer (co-related sub-query). <br />
     * {exists (select BLACK_LIST_ID from BLACK_ACTION where ...)} <br />
     * BLACK_ACTION by BLACK_LIST_ID, named 'blackActionAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">existsBlackActionList</span>(new SubQuery&lt;LdBlackActionCB&gt;() {
     *     public void query(LdBlackActionCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of BlackActionList for 'exists'. (NotNull)
     */
    public void existsBlackActionList(SubQuery<LdBlackActionCB> subQuery) {
        assertObjectNotNull("subQuery<LdBlackActionCB>", subQuery);
        LdBlackActionCB cb = new LdBlackActionCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepBlackListId_ExistsReferrer_BlackActionList(cb.query()); // for saving query-value.
        registerExistsReferrer(cb.query(), "BLACK_LIST_ID", "BLACK_LIST_ID", subQueryPropertyName, "blackActionList");
    }
    public abstract String keepBlackListId_ExistsReferrer_BlackActionList(LdBlackActionCQ subQuery);

    /**
     * Set up NotExistsReferrer (co-related sub-query). <br />
     * {not exists (select BLACK_LIST_ID from BLACK_ACTION where ...)} <br />
     * BLACK_ACTION by BLACK_LIST_ID, named 'blackActionAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">notExistsBlackActionList</span>(new SubQuery&lt;LdBlackActionCB&gt;() {
     *     public void query(LdBlackActionCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of BlackListId_NotExistsReferrer_BlackActionList for 'not exists'. (NotNull)
     */
    public void notExistsBlackActionList(SubQuery<LdBlackActionCB> subQuery) {
        assertObjectNotNull("subQuery<LdBlackActionCB>", subQuery);
        LdBlackActionCB cb = new LdBlackActionCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepBlackListId_NotExistsReferrer_BlackActionList(cb.query()); // for saving query-value.
        registerNotExistsReferrer(cb.query(), "BLACK_LIST_ID", "BLACK_LIST_ID", subQueryPropertyName, "blackActionList");
    }
    public abstract String keepBlackListId_NotExistsReferrer_BlackActionList(LdBlackActionCQ subQuery);

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select BLACK_LIST_ID from BLACK_ACTION where ...)} <br />
     * BLACK_ACTION by BLACK_LIST_ID, named 'blackActionAsOne'.
     * @param subQuery The sub-query of BlackActionList for 'in-scope'. (NotNull)
     */
    public void inScopeBlackActionList(SubQuery<LdBlackActionCB> subQuery) {
        assertObjectNotNull("subQuery<LdBlackActionCB>", subQuery);
        LdBlackActionCB cb = new LdBlackActionCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepBlackListId_InScopeRelation_BlackActionList(cb.query()); // for saving query-value.
        registerInScopeRelation(cb.query(), "BLACK_LIST_ID", "BLACK_LIST_ID", subQueryPropertyName, "blackActionList");
    }
    public abstract String keepBlackListId_InScopeRelation_BlackActionList(LdBlackActionCQ subQuery);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select BLACK_LIST_ID from BLACK_ACTION where ...)} <br />
     * BLACK_ACTION by BLACK_LIST_ID, named 'blackActionAsOne'.
     * @param subQuery The sub-query of BlackActionList for 'not in-scope'. (NotNull)
     */
    public void notInScopeBlackActionList(SubQuery<LdBlackActionCB> subQuery) {
        assertObjectNotNull("subQuery<LdBlackActionCB>", subQuery);
        LdBlackActionCB cb = new LdBlackActionCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepBlackListId_NotInScopeRelation_BlackActionList(cb.query()); // for saving query-value.
        registerNotInScopeRelation(cb.query(), "BLACK_LIST_ID", "BLACK_LIST_ID", subQueryPropertyName, "blackActionList");
    }
    public abstract String keepBlackListId_NotInScopeRelation_BlackActionList(LdBlackActionCQ subQuery);

    public void xsderiveBlackActionList(String function, SubQuery<LdBlackActionCB> subQuery, String aliasName, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<LdBlackActionCB>", subQuery);
        LdBlackActionCB cb = new LdBlackActionCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepBlackListId_SpecifyDerivedReferrer_BlackActionList(cb.query()); // for saving query-value.
        registerSpecifyDerivedReferrer(function, cb.query(), "BLACK_LIST_ID", "BLACK_LIST_ID", subQueryPropertyName, "blackActionList", aliasName, option);
    }
    public abstract String keepBlackListId_SpecifyDerivedReferrer_BlackActionList(LdBlackActionCQ subQuery);

    /**
     * Prepare for (Query)DerivedReferrer. <br />
     * {FOO &lt;= (select max(BAR) from BLACK_ACTION where ...)} <br />
     * BLACK_ACTION by BLACK_LIST_ID, named 'blackActionAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">derivedBlackActionList()</span>.<span style="color: #FD4747">max</span>(new SubQuery&lt;LdBlackActionCB&gt;() {
     *     public void query(LdBlackActionCB subCB) {
     *         subCB.specify().<span style="color: #FD4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *         subCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     *     }
     * }).<span style="color: #FD4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<LdBlackActionCB> derivedBlackActionList() {
        return xcreateQDRFunctionBlackActionList();
    }
    protected HpQDRFunction<LdBlackActionCB> xcreateQDRFunctionBlackActionList() {
        return new HpQDRFunction<LdBlackActionCB>(new HpQDRSetupper<LdBlackActionCB>() {
            public void setup(String function, SubQuery<LdBlackActionCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
                xqderiveBlackActionList(function, subQuery, operand, value, option);
            }
        });
    }
    public void xqderiveBlackActionList(String function, SubQuery<LdBlackActionCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<LdBlackActionCB>", subQuery);
        LdBlackActionCB cb = new LdBlackActionCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepBlackListId_QueryDerivedReferrer_BlackActionList(cb.query()); // for saving query-value.
        String parameterPropertyName = keepBlackListId_QueryDerivedReferrer_BlackActionListParameter(value);
        registerQueryDerivedReferrer(function, cb.query(), "BLACK_LIST_ID", "BLACK_LIST_ID", subQueryPropertyName, "blackActionList", operand, value, parameterPropertyName, option);
    }
    public abstract String keepBlackListId_QueryDerivedReferrer_BlackActionList(LdBlackActionCQ subQuery);
    public abstract String keepBlackListId_QueryDerivedReferrer_BlackActionListParameter(Object parameterValue);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * BLACK_LIST_ID: {PK, ID, NotNull, INTEGER(10)}
     */
    public void setBlackListId_IsNull() { regBlackListId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * BLACK_LIST_ID: {PK, ID, NotNull, INTEGER(10)}
     */
    public void setBlackListId_IsNotNull() { regBlackListId(CK_ISNN, DOBJ); }

    protected void regBlackListId(ConditionKey k, Object v) { regQ(k, v, getCValueBlackListId(), "BLACK_LIST_ID"); }
    abstract protected ConditionValue getCValueBlackListId();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * LB_USER_ID: {UQ, IX, NotNull, INTEGER(10), FK to LB_USER}
     * @param lbUserId The value of lbUserId as equal. (NullAllowed: if null, no condition)
     */
    public void setLbUserId_Equal(Integer lbUserId) {
        doSetLbUserId_Equal(lbUserId);
    }

    protected void doSetLbUserId_Equal(Integer lbUserId) {
        regLbUserId(CK_EQ, lbUserId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * LB_USER_ID: {UQ, IX, NotNull, INTEGER(10), FK to LB_USER}
     * @param lbUserId The value of lbUserId as notEqual. (NullAllowed: if null, no condition)
     */
    public void setLbUserId_NotEqual(Integer lbUserId) {
        doSetLbUserId_NotEqual(lbUserId);
    }

    protected void doSetLbUserId_NotEqual(Integer lbUserId) {
        regLbUserId(CK_NES, lbUserId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * LB_USER_ID: {UQ, IX, NotNull, INTEGER(10), FK to LB_USER}
     * @param lbUserId The value of lbUserId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setLbUserId_GreaterThan(Integer lbUserId) {
        regLbUserId(CK_GT, lbUserId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * LB_USER_ID: {UQ, IX, NotNull, INTEGER(10), FK to LB_USER}
     * @param lbUserId The value of lbUserId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setLbUserId_LessThan(Integer lbUserId) {
        regLbUserId(CK_LT, lbUserId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * LB_USER_ID: {UQ, IX, NotNull, INTEGER(10), FK to LB_USER}
     * @param lbUserId The value of lbUserId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setLbUserId_GreaterEqual(Integer lbUserId) {
        regLbUserId(CK_GE, lbUserId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * LB_USER_ID: {UQ, IX, NotNull, INTEGER(10), FK to LB_USER}
     * @param lbUserId The value of lbUserId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setLbUserId_LessEqual(Integer lbUserId) {
        regLbUserId(CK_LE, lbUserId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * LB_USER_ID: {UQ, IX, NotNull, INTEGER(10), FK to LB_USER}
     * @param minNumber The min number of lbUserId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of lbUserId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setLbUserId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueLbUserId(), "LB_USER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * LB_USER_ID: {UQ, IX, NotNull, INTEGER(10), FK to LB_USER}
     * @param lbUserIdList The collection of lbUserId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setLbUserId_InScope(Collection<Integer> lbUserIdList) {
        doSetLbUserId_InScope(lbUserIdList);
    }

    protected void doSetLbUserId_InScope(Collection<Integer> lbUserIdList) {
        regINS(CK_INS, cTL(lbUserIdList), getCValueLbUserId(), "LB_USER_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * LB_USER_ID: {UQ, IX, NotNull, INTEGER(10), FK to LB_USER}
     * @param lbUserIdList The collection of lbUserId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setLbUserId_NotInScope(Collection<Integer> lbUserIdList) {
        doSetLbUserId_NotInScope(lbUserIdList);
    }

    protected void doSetLbUserId_NotInScope(Collection<Integer> lbUserIdList) {
        regINS(CK_NINS, cTL(lbUserIdList), getCValueLbUserId(), "LB_USER_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select LB_USER_ID from LB_USER where ...)} <br />
     * LB_USER by my LB_USER_ID, named 'lbUser'.
     * @param subQuery The sub-query of LbUser for 'in-scope'. (NotNull)
     */
    public void inScopeLbUser(SubQuery<LdLbUserCB> subQuery) {
        assertObjectNotNull("subQuery<LdLbUserCB>", subQuery);
        LdLbUserCB cb = new LdLbUserCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepLbUserId_InScopeRelation_LbUser(cb.query()); // for saving query-value.
        registerInScopeRelation(cb.query(), "LB_USER_ID", "LB_USER_ID", subQueryPropertyName, "lbUser");
    }
    public abstract String keepLbUserId_InScopeRelation_LbUser(LdLbUserCQ subQuery);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select LB_USER_ID from LB_USER where ...)} <br />
     * LB_USER by my LB_USER_ID, named 'lbUser'.
     * @param subQuery The sub-query of LbUser for 'not in-scope'. (NotNull)
     */
    public void notInScopeLbUser(SubQuery<LdLbUserCB> subQuery) {
        assertObjectNotNull("subQuery<LdLbUserCB>", subQuery);
        LdLbUserCB cb = new LdLbUserCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepLbUserId_NotInScopeRelation_LbUser(cb.query()); // for saving query-value.
        registerNotInScopeRelation(cb.query(), "LB_USER_ID", "LB_USER_ID", subQueryPropertyName, "lbUser");
    }
    public abstract String keepLbUserId_NotInScopeRelation_LbUser(LdLbUserCQ subQuery);

    protected void regLbUserId(ConditionKey k, Object v) { regQ(k, v, getCValueLbUserId(), "LB_USER_ID"); }
    abstract protected ConditionValue getCValueLbUserId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * BLACK_RANK: {NotNull, CHAR(3)}
     * @param blackRank The value of blackRank as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setBlackRank_Equal(String blackRank) {
        doSetBlackRank_Equal(fRES(blackRank));
    }

    protected void doSetBlackRank_Equal(String blackRank) {
        regBlackRank(CK_EQ, blackRank);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * BLACK_RANK: {NotNull, CHAR(3)}
     * @param blackRank The value of blackRank as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setBlackRank_NotEqual(String blackRank) {
        doSetBlackRank_NotEqual(fRES(blackRank));
    }

    protected void doSetBlackRank_NotEqual(String blackRank) {
        regBlackRank(CK_NES, blackRank);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * BLACK_RANK: {NotNull, CHAR(3)}
     * @param blackRank The value of blackRank as greaterThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setBlackRank_GreaterThan(String blackRank) {
        regBlackRank(CK_GT, fRES(blackRank));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * BLACK_RANK: {NotNull, CHAR(3)}
     * @param blackRank The value of blackRank as lessThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setBlackRank_LessThan(String blackRank) {
        regBlackRank(CK_LT, fRES(blackRank));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * BLACK_RANK: {NotNull, CHAR(3)}
     * @param blackRank The value of blackRank as greaterEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setBlackRank_GreaterEqual(String blackRank) {
        regBlackRank(CK_GE, fRES(blackRank));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * BLACK_RANK: {NotNull, CHAR(3)}
     * @param blackRank The value of blackRank as lessEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setBlackRank_LessEqual(String blackRank) {
        regBlackRank(CK_LE, fRES(blackRank));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * BLACK_RANK: {NotNull, CHAR(3)}
     * @param blackRankList The collection of blackRank as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setBlackRank_InScope(Collection<String> blackRankList) {
        doSetBlackRank_InScope(blackRankList);
    }

    public void doSetBlackRank_InScope(Collection<String> blackRankList) {
        regINS(CK_INS, cTL(blackRankList), getCValueBlackRank(), "BLACK_RANK");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * BLACK_RANK: {NotNull, CHAR(3)}
     * @param blackRankList The collection of blackRank as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setBlackRank_NotInScope(Collection<String> blackRankList) {
        doSetBlackRank_NotInScope(blackRankList);
    }

    public void doSetBlackRank_NotInScope(Collection<String> blackRankList) {
        regINS(CK_NINS, cTL(blackRankList), getCValueBlackRank(), "BLACK_RANK");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * BLACK_RANK: {NotNull, CHAR(3)}
     * @param blackRank The value of blackRank as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setBlackRank_PrefixSearch(String blackRank) {
        setBlackRank_LikeSearch(blackRank, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * BLACK_RANK: {NotNull, CHAR(3)} <br />
     * <pre>e.g. setBlackRank_LikeSearch("xxx", new <span style="color: #FD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param blackRank The value of blackRank as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setBlackRank_LikeSearch(String blackRank, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(blackRank), getCValueBlackRank(), "BLACK_RANK", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * BLACK_RANK: {NotNull, CHAR(3)}
     * @param blackRank The value of blackRank as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setBlackRank_NotLikeSearch(String blackRank, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(blackRank), getCValueBlackRank(), "BLACK_RANK", likeSearchOption);
    }

    protected void regBlackRank(ConditionKey k, Object v) { regQ(k, v, getCValueBlackRank(), "BLACK_RANK"); }
    abstract protected ConditionValue getCValueBlackRank();

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
     * cb.query().<span style="color: #FD4747">scalar_Equal()</span>.max(new SubQuery&lt;LdBlackListCB&gt;() {
     *     public void query(LdBlackListCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<LdBlackListCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ.getOperand());
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;LdBlackListCB&gt;() {
     *     public void query(LdBlackListCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<LdBlackListCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;LdBlackListCB&gt;() {
     *     public void query(LdBlackListCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<LdBlackListCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessThan()</span>.max(new SubQuery&lt;LdBlackListCB&gt;() {
     *     public void query(LdBlackListCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<LdBlackListCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;LdBlackListCB&gt;() {
     *     public void query(LdBlackListCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<LdBlackListCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;LdBlackListCB&gt;() {
     *     public void query(LdBlackListCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<LdBlackListCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE.getOperand());
    }

    protected HpSSQFunction<LdBlackListCB> xcreateSSQFunction(final String operand) {
        return new HpSSQFunction<LdBlackListCB>(new HpSSQSetupper<LdBlackListCB>() {
            public void setup(String function, SubQuery<LdBlackListCB> subQuery, HpSSQOption<LdBlackListCB> option) {
                xscalarCondition(function, subQuery, operand, option);
            }
        });
    }

    protected void xscalarCondition(String function, SubQuery<LdBlackListCB> subQuery, String operand, HpSSQOption<LdBlackListCB> option) {
        assertObjectNotNull("subQuery<LdBlackListCB>", subQuery);
        LdBlackListCB cb = xcreateScalarConditionCB(); subQuery.query(cb);
        String subQueryPropertyName = keepScalarCondition(cb.query()); // for saving query-value
        option.setPartitionByCBean(xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(function, cb.query(), subQueryPropertyName, operand, option);
    }
    public abstract String keepScalarCondition(LdBlackListCQ subQuery);

    protected LdBlackListCB xcreateScalarConditionCB() {
        LdBlackListCB cb = new LdBlackListCB();
        cb.xsetupForScalarCondition(this);
        return cb;
    }

    protected LdBlackListCB xcreateScalarConditionPartitionByCB() {
        LdBlackListCB cb = new LdBlackListCB();
        cb.xsetupForScalarConditionPartitionBy(this);
        return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String function, SubQuery<LdBlackListCB> subQuery, String aliasName, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<LdBlackListCB>", subQuery);
        LdBlackListCB cb = new LdBlackListCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepSpecifyMyselfDerived(cb.query()); // for saving query-value.
        registerSpecifyMyselfDerived(function, cb.query(), "BLACK_LIST_ID", "BLACK_LIST_ID", subQueryPropertyName, "myselfDerived", aliasName, option);
    }
    public abstract String keepSpecifyMyselfDerived(LdBlackListCQ subQuery);

    /**
     * Prepare for (Query)MyselfDerived (SubQuery).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<LdBlackListCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived();
    }
    protected HpQDRFunction<LdBlackListCB> xcreateQDRFunctionMyselfDerived() {
        return new HpQDRFunction<LdBlackListCB>(new HpQDRSetupper<LdBlackListCB>() {
            public void setup(String function, SubQuery<LdBlackListCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
                xqderiveMyselfDerived(function, subQuery, operand, value, option);
            }
        });
    }
    public void xqderiveMyselfDerived(String function, SubQuery<LdBlackListCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<LdBlackListCB>", subQuery);
        LdBlackListCB cb = new LdBlackListCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String parameterPropertyName = keepQueryMyselfDerivedParameter(value);
        registerQueryMyselfDerived(function, cb.query(), "BLACK_LIST_ID", "BLACK_LIST_ID", subQueryPropertyName, "myselfDerived", operand, value, parameterPropertyName, option);
    }
    public abstract String keepQueryMyselfDerived(LdBlackListCQ subQuery);
    public abstract String keepQueryMyselfDerivedParameter(Object parameterValue);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfExists(SubQuery<LdBlackListCB> subQuery) {
        assertObjectNotNull("subQuery<LdBlackListCB>", subQuery);
        LdBlackListCB cb = new LdBlackListCB(); cb.xsetupForMyselfExists(this); subQuery.query(cb);
        String subQueryPropertyName = keepMyselfExists(cb.query()); // for saving query-value.
        registerMyselfExists(cb.query(), subQueryPropertyName);
    }
    public abstract String keepMyselfExists(LdBlackListCQ subQuery);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfInScope(SubQuery<LdBlackListCB> subQuery) {
        assertObjectNotNull("subQuery<LdBlackListCB>", subQuery);
        LdBlackListCB cb = new LdBlackListCB(); cb.xsetupForMyselfInScope(this); subQuery.query(cb);
        String subQueryPropertyName = keepMyselfInScope(cb.query()); // for saving query-value.
        registerMyselfInScope(cb.query(), subQueryPropertyName);
    }
    public abstract String keepMyselfInScope(LdBlackListCQ subQuery);

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabCB() { return LdBlackListCB.class.getName(); }
    protected String xabCQ() { return LdBlackListCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
