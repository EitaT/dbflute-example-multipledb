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
 * The abstract condition-query of MYSELF_CHECK.
 * @author DBFlute(AutoGenerator)
 */
public abstract class LdAbstractBsMyselfCheckCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public LdAbstractBsMyselfCheckCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "MYSELF_CHECK";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * MYSELF_CHECK_ID: {PK, NotNull, INTEGER(10)}
     * @param myselfCheckId The value of myselfCheckId as equal. (NullAllowed: if null, no condition)
     */
    public void setMyselfCheckId_Equal(Integer myselfCheckId) {
        doSetMyselfCheckId_Equal(myselfCheckId);
    }

    protected void doSetMyselfCheckId_Equal(Integer myselfCheckId) {
        regMyselfCheckId(CK_EQ, myselfCheckId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * MYSELF_CHECK_ID: {PK, NotNull, INTEGER(10)}
     * @param myselfCheckId The value of myselfCheckId as notEqual. (NullAllowed: if null, no condition)
     */
    public void setMyselfCheckId_NotEqual(Integer myselfCheckId) {
        doSetMyselfCheckId_NotEqual(myselfCheckId);
    }

    protected void doSetMyselfCheckId_NotEqual(Integer myselfCheckId) {
        regMyselfCheckId(CK_NES, myselfCheckId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * MYSELF_CHECK_ID: {PK, NotNull, INTEGER(10)}
     * @param myselfCheckId The value of myselfCheckId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setMyselfCheckId_GreaterThan(Integer myselfCheckId) {
        regMyselfCheckId(CK_GT, myselfCheckId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * MYSELF_CHECK_ID: {PK, NotNull, INTEGER(10)}
     * @param myselfCheckId The value of myselfCheckId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setMyselfCheckId_LessThan(Integer myselfCheckId) {
        regMyselfCheckId(CK_LT, myselfCheckId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * MYSELF_CHECK_ID: {PK, NotNull, INTEGER(10)}
     * @param myselfCheckId The value of myselfCheckId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setMyselfCheckId_GreaterEqual(Integer myselfCheckId) {
        regMyselfCheckId(CK_GE, myselfCheckId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * MYSELF_CHECK_ID: {PK, NotNull, INTEGER(10)}
     * @param myselfCheckId The value of myselfCheckId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setMyselfCheckId_LessEqual(Integer myselfCheckId) {
        regMyselfCheckId(CK_LE, myselfCheckId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * MYSELF_CHECK_ID: {PK, NotNull, INTEGER(10)}
     * @param minNumber The min number of myselfCheckId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of myselfCheckId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setMyselfCheckId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueMyselfCheckId(), "MYSELF_CHECK_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * MYSELF_CHECK_ID: {PK, NotNull, INTEGER(10)}
     * @param myselfCheckIdList The collection of myselfCheckId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMyselfCheckId_InScope(Collection<Integer> myselfCheckIdList) {
        doSetMyselfCheckId_InScope(myselfCheckIdList);
    }

    protected void doSetMyselfCheckId_InScope(Collection<Integer> myselfCheckIdList) {
        regINS(CK_INS, cTL(myselfCheckIdList), getCValueMyselfCheckId(), "MYSELF_CHECK_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * MYSELF_CHECK_ID: {PK, NotNull, INTEGER(10)}
     * @param myselfCheckIdList The collection of myselfCheckId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMyselfCheckId_NotInScope(Collection<Integer> myselfCheckIdList) {
        doSetMyselfCheckId_NotInScope(myselfCheckIdList);
    }

    protected void doSetMyselfCheckId_NotInScope(Collection<Integer> myselfCheckIdList) {
        regINS(CK_NINS, cTL(myselfCheckIdList), getCValueMyselfCheckId(), "MYSELF_CHECK_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * MYSELF_CHECK_ID: {PK, NotNull, INTEGER(10)}
     */
    public void setMyselfCheckId_IsNull() { regMyselfCheckId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * MYSELF_CHECK_ID: {PK, NotNull, INTEGER(10)}
     */
    public void setMyselfCheckId_IsNotNull() { regMyselfCheckId(CK_ISNN, DOBJ); }

    protected void regMyselfCheckId(ConditionKey k, Object v) { regQ(k, v, getCValueMyselfCheckId(), "MYSELF_CHECK_ID"); }
    abstract protected ConditionValue getCValueMyselfCheckId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * MYSELF_CHECK_NAME: {NotNull, VARCHAR(80)}
     * @param myselfCheckName The value of myselfCheckName as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setMyselfCheckName_Equal(String myselfCheckName) {
        doSetMyselfCheckName_Equal(fRES(myselfCheckName));
    }

    protected void doSetMyselfCheckName_Equal(String myselfCheckName) {
        regMyselfCheckName(CK_EQ, myselfCheckName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * MYSELF_CHECK_NAME: {NotNull, VARCHAR(80)}
     * @param myselfCheckName The value of myselfCheckName as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setMyselfCheckName_NotEqual(String myselfCheckName) {
        doSetMyselfCheckName_NotEqual(fRES(myselfCheckName));
    }

    protected void doSetMyselfCheckName_NotEqual(String myselfCheckName) {
        regMyselfCheckName(CK_NES, myselfCheckName);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * MYSELF_CHECK_NAME: {NotNull, VARCHAR(80)}
     * @param myselfCheckName The value of myselfCheckName as greaterThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setMyselfCheckName_GreaterThan(String myselfCheckName) {
        regMyselfCheckName(CK_GT, fRES(myselfCheckName));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * MYSELF_CHECK_NAME: {NotNull, VARCHAR(80)}
     * @param myselfCheckName The value of myselfCheckName as lessThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setMyselfCheckName_LessThan(String myselfCheckName) {
        regMyselfCheckName(CK_LT, fRES(myselfCheckName));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * MYSELF_CHECK_NAME: {NotNull, VARCHAR(80)}
     * @param myselfCheckName The value of myselfCheckName as greaterEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setMyselfCheckName_GreaterEqual(String myselfCheckName) {
        regMyselfCheckName(CK_GE, fRES(myselfCheckName));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * MYSELF_CHECK_NAME: {NotNull, VARCHAR(80)}
     * @param myselfCheckName The value of myselfCheckName as lessEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setMyselfCheckName_LessEqual(String myselfCheckName) {
        regMyselfCheckName(CK_LE, fRES(myselfCheckName));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * MYSELF_CHECK_NAME: {NotNull, VARCHAR(80)}
     * @param myselfCheckNameList The collection of myselfCheckName as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMyselfCheckName_InScope(Collection<String> myselfCheckNameList) {
        doSetMyselfCheckName_InScope(myselfCheckNameList);
    }

    public void doSetMyselfCheckName_InScope(Collection<String> myselfCheckNameList) {
        regINS(CK_INS, cTL(myselfCheckNameList), getCValueMyselfCheckName(), "MYSELF_CHECK_NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * MYSELF_CHECK_NAME: {NotNull, VARCHAR(80)}
     * @param myselfCheckNameList The collection of myselfCheckName as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMyselfCheckName_NotInScope(Collection<String> myselfCheckNameList) {
        doSetMyselfCheckName_NotInScope(myselfCheckNameList);
    }

    public void doSetMyselfCheckName_NotInScope(Collection<String> myselfCheckNameList) {
        regINS(CK_NINS, cTL(myselfCheckNameList), getCValueMyselfCheckName(), "MYSELF_CHECK_NAME");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * MYSELF_CHECK_NAME: {NotNull, VARCHAR(80)}
     * @param myselfCheckName The value of myselfCheckName as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setMyselfCheckName_PrefixSearch(String myselfCheckName) {
        setMyselfCheckName_LikeSearch(myselfCheckName, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * MYSELF_CHECK_NAME: {NotNull, VARCHAR(80)} <br />
     * <pre>e.g. setMyselfCheckName_LikeSearch("xxx", new <span style="color: #FD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param myselfCheckName The value of myselfCheckName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setMyselfCheckName_LikeSearch(String myselfCheckName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(myselfCheckName), getCValueMyselfCheckName(), "MYSELF_CHECK_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * MYSELF_CHECK_NAME: {NotNull, VARCHAR(80)}
     * @param myselfCheckName The value of myselfCheckName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setMyselfCheckName_NotLikeSearch(String myselfCheckName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(myselfCheckName), getCValueMyselfCheckName(), "MYSELF_CHECK_NAME", likeSearchOption);
    }

    protected void regMyselfCheckName(ConditionKey k, Object v) { regQ(k, v, getCValueMyselfCheckName(), "MYSELF_CHECK_NAME"); }
    abstract protected ConditionValue getCValueMyselfCheckName();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * MYSELF_ID: {IX, INTEGER(10), FK to MYSELF}
     * @param myselfId The value of myselfId as equal. (NullAllowed: if null, no condition)
     */
    public void setMyselfId_Equal(Integer myselfId) {
        doSetMyselfId_Equal(myselfId);
    }

    protected void doSetMyselfId_Equal(Integer myselfId) {
        regMyselfId(CK_EQ, myselfId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * MYSELF_ID: {IX, INTEGER(10), FK to MYSELF}
     * @param myselfId The value of myselfId as notEqual. (NullAllowed: if null, no condition)
     */
    public void setMyselfId_NotEqual(Integer myselfId) {
        doSetMyselfId_NotEqual(myselfId);
    }

    protected void doSetMyselfId_NotEqual(Integer myselfId) {
        regMyselfId(CK_NES, myselfId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * MYSELF_ID: {IX, INTEGER(10), FK to MYSELF}
     * @param myselfId The value of myselfId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setMyselfId_GreaterThan(Integer myselfId) {
        regMyselfId(CK_GT, myselfId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * MYSELF_ID: {IX, INTEGER(10), FK to MYSELF}
     * @param myselfId The value of myselfId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setMyselfId_LessThan(Integer myselfId) {
        regMyselfId(CK_LT, myselfId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * MYSELF_ID: {IX, INTEGER(10), FK to MYSELF}
     * @param myselfId The value of myselfId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setMyselfId_GreaterEqual(Integer myselfId) {
        regMyselfId(CK_GE, myselfId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * MYSELF_ID: {IX, INTEGER(10), FK to MYSELF}
     * @param myselfId The value of myselfId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setMyselfId_LessEqual(Integer myselfId) {
        regMyselfId(CK_LE, myselfId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * MYSELF_ID: {IX, INTEGER(10), FK to MYSELF}
     * @param minNumber The min number of myselfId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of myselfId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setMyselfId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueMyselfId(), "MYSELF_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * MYSELF_ID: {IX, INTEGER(10), FK to MYSELF}
     * @param myselfIdList The collection of myselfId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMyselfId_InScope(Collection<Integer> myselfIdList) {
        doSetMyselfId_InScope(myselfIdList);
    }

    protected void doSetMyselfId_InScope(Collection<Integer> myselfIdList) {
        regINS(CK_INS, cTL(myselfIdList), getCValueMyselfId(), "MYSELF_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * MYSELF_ID: {IX, INTEGER(10), FK to MYSELF}
     * @param myselfIdList The collection of myselfId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMyselfId_NotInScope(Collection<Integer> myselfIdList) {
        doSetMyselfId_NotInScope(myselfIdList);
    }

    protected void doSetMyselfId_NotInScope(Collection<Integer> myselfIdList) {
        regINS(CK_NINS, cTL(myselfIdList), getCValueMyselfId(), "MYSELF_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select MYSELF_ID from MYSELF where ...)} <br />
     * MYSELF by my MYSELF_ID, named 'myself'.
     * @param subQuery The sub-query of Myself for 'in-scope'. (NotNull)
     */
    public void inScopeMyself(SubQuery<LdMyselfCB> subQuery) {
        assertObjectNotNull("subQuery<LdMyselfCB>", subQuery);
        LdMyselfCB cb = new LdMyselfCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepMyselfId_InScopeRelation_Myself(cb.query()); // for saving query-value.
        registerInScopeRelation(cb.query(), "MYSELF_ID", "MYSELF_ID", subQueryPropertyName, "myself");
    }
    public abstract String keepMyselfId_InScopeRelation_Myself(LdMyselfCQ subQuery);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select MYSELF_ID from MYSELF where ...)} <br />
     * MYSELF by my MYSELF_ID, named 'myself'.
     * @param subQuery The sub-query of Myself for 'not in-scope'. (NotNull)
     */
    public void notInScopeMyself(SubQuery<LdMyselfCB> subQuery) {
        assertObjectNotNull("subQuery<LdMyselfCB>", subQuery);
        LdMyselfCB cb = new LdMyselfCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepMyselfId_NotInScopeRelation_Myself(cb.query()); // for saving query-value.
        registerNotInScopeRelation(cb.query(), "MYSELF_ID", "MYSELF_ID", subQueryPropertyName, "myself");
    }
    public abstract String keepMyselfId_NotInScopeRelation_Myself(LdMyselfCQ subQuery);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * MYSELF_ID: {IX, INTEGER(10), FK to MYSELF}
     */
    public void setMyselfId_IsNull() { regMyselfId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * MYSELF_ID: {IX, INTEGER(10), FK to MYSELF}
     */
    public void setMyselfId_IsNotNull() { regMyselfId(CK_ISNN, DOBJ); }

    protected void regMyselfId(ConditionKey k, Object v) { regQ(k, v, getCValueMyselfId(), "MYSELF_ID"); }
    abstract protected ConditionValue getCValueMyselfId();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_Equal()</span>.max(new SubQuery&lt;LdMyselfCheckCB&gt;() {
     *     public void query(LdMyselfCheckCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<LdMyselfCheckCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ.getOperand());
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;LdMyselfCheckCB&gt;() {
     *     public void query(LdMyselfCheckCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<LdMyselfCheckCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;LdMyselfCheckCB&gt;() {
     *     public void query(LdMyselfCheckCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<LdMyselfCheckCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessThan()</span>.max(new SubQuery&lt;LdMyselfCheckCB&gt;() {
     *     public void query(LdMyselfCheckCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<LdMyselfCheckCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;LdMyselfCheckCB&gt;() {
     *     public void query(LdMyselfCheckCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<LdMyselfCheckCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;LdMyselfCheckCB&gt;() {
     *     public void query(LdMyselfCheckCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<LdMyselfCheckCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE.getOperand());
    }

    protected HpSSQFunction<LdMyselfCheckCB> xcreateSSQFunction(final String operand) {
        return new HpSSQFunction<LdMyselfCheckCB>(new HpSSQSetupper<LdMyselfCheckCB>() {
            public void setup(String function, SubQuery<LdMyselfCheckCB> subQuery, HpSSQOption<LdMyselfCheckCB> option) {
                xscalarCondition(function, subQuery, operand, option);
            }
        });
    }

    protected void xscalarCondition(String function, SubQuery<LdMyselfCheckCB> subQuery, String operand, HpSSQOption<LdMyselfCheckCB> option) {
        assertObjectNotNull("subQuery<LdMyselfCheckCB>", subQuery);
        LdMyselfCheckCB cb = xcreateScalarConditionCB(); subQuery.query(cb);
        String subQueryPropertyName = keepScalarCondition(cb.query()); // for saving query-value
        option.setPartitionByCBean(xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(function, cb.query(), subQueryPropertyName, operand, option);
    }
    public abstract String keepScalarCondition(LdMyselfCheckCQ subQuery);

    protected LdMyselfCheckCB xcreateScalarConditionCB() {
        LdMyselfCheckCB cb = new LdMyselfCheckCB();
        cb.xsetupForScalarCondition(this);
        return cb;
    }

    protected LdMyselfCheckCB xcreateScalarConditionPartitionByCB() {
        LdMyselfCheckCB cb = new LdMyselfCheckCB();
        cb.xsetupForScalarConditionPartitionBy(this);
        return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String function, SubQuery<LdMyselfCheckCB> subQuery, String aliasName, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<LdMyselfCheckCB>", subQuery);
        LdMyselfCheckCB cb = new LdMyselfCheckCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepSpecifyMyselfDerived(cb.query()); // for saving query-value.
        registerSpecifyMyselfDerived(function, cb.query(), "MYSELF_CHECK_ID", "MYSELF_CHECK_ID", subQueryPropertyName, "myselfDerived", aliasName, option);
    }
    public abstract String keepSpecifyMyselfDerived(LdMyselfCheckCQ subQuery);

    /**
     * Prepare for (Query)MyselfDerived (SubQuery).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<LdMyselfCheckCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived();
    }
    protected HpQDRFunction<LdMyselfCheckCB> xcreateQDRFunctionMyselfDerived() {
        return new HpQDRFunction<LdMyselfCheckCB>(new HpQDRSetupper<LdMyselfCheckCB>() {
            public void setup(String function, SubQuery<LdMyselfCheckCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
                xqderiveMyselfDerived(function, subQuery, operand, value, option);
            }
        });
    }
    public void xqderiveMyselfDerived(String function, SubQuery<LdMyselfCheckCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<LdMyselfCheckCB>", subQuery);
        LdMyselfCheckCB cb = new LdMyselfCheckCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String parameterPropertyName = keepQueryMyselfDerivedParameter(value);
        registerQueryMyselfDerived(function, cb.query(), "MYSELF_CHECK_ID", "MYSELF_CHECK_ID", subQueryPropertyName, "myselfDerived", operand, value, parameterPropertyName, option);
    }
    public abstract String keepQueryMyselfDerived(LdMyselfCheckCQ subQuery);
    public abstract String keepQueryMyselfDerivedParameter(Object parameterValue);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfExists(SubQuery<LdMyselfCheckCB> subQuery) {
        assertObjectNotNull("subQuery<LdMyselfCheckCB>", subQuery);
        LdMyselfCheckCB cb = new LdMyselfCheckCB(); cb.xsetupForMyselfExists(this); subQuery.query(cb);
        String subQueryPropertyName = keepMyselfExists(cb.query()); // for saving query-value.
        registerMyselfExists(cb.query(), subQueryPropertyName);
    }
    public abstract String keepMyselfExists(LdMyselfCheckCQ subQuery);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfInScope(SubQuery<LdMyselfCheckCB> subQuery) {
        assertObjectNotNull("subQuery<LdMyselfCheckCB>", subQuery);
        LdMyselfCheckCB cb = new LdMyselfCheckCB(); cb.xsetupForMyselfInScope(this); subQuery.query(cb);
        String subQueryPropertyName = keepMyselfInScope(cb.query()); // for saving query-value.
        registerMyselfInScope(cb.query(), subQueryPropertyName);
    }
    public abstract String keepMyselfInScope(LdMyselfCheckCQ subQuery);

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabCB() { return LdMyselfCheckCB.class.getName(); }
    protected String xabCQ() { return LdMyselfCheckCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
