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
 * The abstract condition-query of MYSELF.
 * @author DBFlute(AutoGenerator)
 */
public abstract class LdAbstractBsMyselfCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public LdAbstractBsMyselfCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "MYSELF";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * MYSELF_ID: {PK, NotNull, INTEGER(10)}
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
     * MYSELF_ID: {PK, NotNull, INTEGER(10)}
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
     * MYSELF_ID: {PK, NotNull, INTEGER(10)}
     * @param myselfId The value of myselfId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setMyselfId_GreaterThan(Integer myselfId) {
        regMyselfId(CK_GT, myselfId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * MYSELF_ID: {PK, NotNull, INTEGER(10)}
     * @param myselfId The value of myselfId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setMyselfId_LessThan(Integer myselfId) {
        regMyselfId(CK_LT, myselfId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * MYSELF_ID: {PK, NotNull, INTEGER(10)}
     * @param myselfId The value of myselfId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setMyselfId_GreaterEqual(Integer myselfId) {
        regMyselfId(CK_GE, myselfId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * MYSELF_ID: {PK, NotNull, INTEGER(10)}
     * @param myselfId The value of myselfId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setMyselfId_LessEqual(Integer myselfId) {
        regMyselfId(CK_LE, myselfId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * MYSELF_ID: {PK, NotNull, INTEGER(10)}
     * @param minNumber The min number of myselfId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of myselfId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setMyselfId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueMyselfId(), "MYSELF_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * MYSELF_ID: {PK, NotNull, INTEGER(10)}
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
     * MYSELF_ID: {PK, NotNull, INTEGER(10)}
     * @param myselfIdList The collection of myselfId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMyselfId_NotInScope(Collection<Integer> myselfIdList) {
        doSetMyselfId_NotInScope(myselfIdList);
    }

    protected void doSetMyselfId_NotInScope(Collection<Integer> myselfIdList) {
        regINS(CK_NINS, cTL(myselfIdList), getCValueMyselfId(), "MYSELF_ID");
    }

    /**
     * Set up ExistsReferrer (co-related sub-query). <br />
     * {exists (select MYSELF_ID from MYSELF_CHECK where ...)} <br />
     * MYSELF_CHECK by MYSELF_ID, named 'myselfCheckAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">existsMyselfCheckList</span>(new SubQuery&lt;LdMyselfCheckCB&gt;() {
     *     public void query(LdMyselfCheckCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of MyselfCheckList for 'exists'. (NotNull)
     */
    public void existsMyselfCheckList(SubQuery<LdMyselfCheckCB> subQuery) {
        assertObjectNotNull("subQuery<LdMyselfCheckCB>", subQuery);
        LdMyselfCheckCB cb = new LdMyselfCheckCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepMyselfId_ExistsReferrer_MyselfCheckList(cb.query()); // for saving query-value.
        registerExistsReferrer(cb.query(), "MYSELF_ID", "MYSELF_ID", subQueryPropertyName, "myselfCheckList");
    }
    public abstract String keepMyselfId_ExistsReferrer_MyselfCheckList(LdMyselfCheckCQ subQuery);

    /**
     * Set up NotExistsReferrer (co-related sub-query). <br />
     * {not exists (select MYSELF_ID from MYSELF_CHECK where ...)} <br />
     * MYSELF_CHECK by MYSELF_ID, named 'myselfCheckAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">notExistsMyselfCheckList</span>(new SubQuery&lt;LdMyselfCheckCB&gt;() {
     *     public void query(LdMyselfCheckCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of MyselfId_NotExistsReferrer_MyselfCheckList for 'not exists'. (NotNull)
     */
    public void notExistsMyselfCheckList(SubQuery<LdMyselfCheckCB> subQuery) {
        assertObjectNotNull("subQuery<LdMyselfCheckCB>", subQuery);
        LdMyselfCheckCB cb = new LdMyselfCheckCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepMyselfId_NotExistsReferrer_MyselfCheckList(cb.query()); // for saving query-value.
        registerNotExistsReferrer(cb.query(), "MYSELF_ID", "MYSELF_ID", subQueryPropertyName, "myselfCheckList");
    }
    public abstract String keepMyselfId_NotExistsReferrer_MyselfCheckList(LdMyselfCheckCQ subQuery);

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select MYSELF_ID from MYSELF_CHECK where ...)} <br />
     * MYSELF_CHECK by MYSELF_ID, named 'myselfCheckAsOne'.
     * @param subQuery The sub-query of MyselfCheckList for 'in-scope'. (NotNull)
     */
    public void inScopeMyselfCheckList(SubQuery<LdMyselfCheckCB> subQuery) {
        assertObjectNotNull("subQuery<LdMyselfCheckCB>", subQuery);
        LdMyselfCheckCB cb = new LdMyselfCheckCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepMyselfId_InScopeRelation_MyselfCheckList(cb.query()); // for saving query-value.
        registerInScopeRelation(cb.query(), "MYSELF_ID", "MYSELF_ID", subQueryPropertyName, "myselfCheckList");
    }
    public abstract String keepMyselfId_InScopeRelation_MyselfCheckList(LdMyselfCheckCQ subQuery);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select MYSELF_ID from MYSELF_CHECK where ...)} <br />
     * MYSELF_CHECK by MYSELF_ID, named 'myselfCheckAsOne'.
     * @param subQuery The sub-query of MyselfCheckList for 'not in-scope'. (NotNull)
     */
    public void notInScopeMyselfCheckList(SubQuery<LdMyselfCheckCB> subQuery) {
        assertObjectNotNull("subQuery<LdMyselfCheckCB>", subQuery);
        LdMyselfCheckCB cb = new LdMyselfCheckCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepMyselfId_NotInScopeRelation_MyselfCheckList(cb.query()); // for saving query-value.
        registerNotInScopeRelation(cb.query(), "MYSELF_ID", "MYSELF_ID", subQueryPropertyName, "myselfCheckList");
    }
    public abstract String keepMyselfId_NotInScopeRelation_MyselfCheckList(LdMyselfCheckCQ subQuery);

    public void xsderiveMyselfCheckList(String function, SubQuery<LdMyselfCheckCB> subQuery, String aliasName, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<LdMyselfCheckCB>", subQuery);
        LdMyselfCheckCB cb = new LdMyselfCheckCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepMyselfId_SpecifyDerivedReferrer_MyselfCheckList(cb.query()); // for saving query-value.
        registerSpecifyDerivedReferrer(function, cb.query(), "MYSELF_ID", "MYSELF_ID", subQueryPropertyName, "myselfCheckList", aliasName, option);
    }
    public abstract String keepMyselfId_SpecifyDerivedReferrer_MyselfCheckList(LdMyselfCheckCQ subQuery);

    /**
     * Prepare for (Query)DerivedReferrer. <br />
     * {FOO &lt;= (select max(BAR) from MYSELF_CHECK where ...)} <br />
     * MYSELF_CHECK by MYSELF_ID, named 'myselfCheckAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">derivedMyselfCheckList()</span>.<span style="color: #FD4747">max</span>(new SubQuery&lt;LdMyselfCheckCB&gt;() {
     *     public void query(LdMyselfCheckCB subCB) {
     *         subCB.specify().<span style="color: #FD4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *         subCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     *     }
     * }).<span style="color: #FD4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<LdMyselfCheckCB> derivedMyselfCheckList() {
        return xcreateQDRFunctionMyselfCheckList();
    }
    protected HpQDRFunction<LdMyselfCheckCB> xcreateQDRFunctionMyselfCheckList() {
        return new HpQDRFunction<LdMyselfCheckCB>(new HpQDRSetupper<LdMyselfCheckCB>() {
            public void setup(String function, SubQuery<LdMyselfCheckCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
                xqderiveMyselfCheckList(function, subQuery, operand, value, option);
            }
        });
    }
    public void xqderiveMyselfCheckList(String function, SubQuery<LdMyselfCheckCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<LdMyselfCheckCB>", subQuery);
        LdMyselfCheckCB cb = new LdMyselfCheckCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepMyselfId_QueryDerivedReferrer_MyselfCheckList(cb.query()); // for saving query-value.
        String parameterPropertyName = keepMyselfId_QueryDerivedReferrer_MyselfCheckListParameter(value);
        registerQueryDerivedReferrer(function, cb.query(), "MYSELF_ID", "MYSELF_ID", subQueryPropertyName, "myselfCheckList", operand, value, parameterPropertyName, option);
    }
    public abstract String keepMyselfId_QueryDerivedReferrer_MyselfCheckList(LdMyselfCheckCQ subQuery);
    public abstract String keepMyselfId_QueryDerivedReferrer_MyselfCheckListParameter(Object parameterValue);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * MYSELF_ID: {PK, NotNull, INTEGER(10)}
     */
    public void setMyselfId_IsNull() { regMyselfId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * MYSELF_ID: {PK, NotNull, INTEGER(10)}
     */
    public void setMyselfId_IsNotNull() { regMyselfId(CK_ISNN, DOBJ); }

    protected void regMyselfId(ConditionKey k, Object v) { regQ(k, v, getCValueMyselfId(), "MYSELF_ID"); }
    abstract protected ConditionValue getCValueMyselfId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * MYSELF_NAME: {NotNull, VARCHAR(80)}
     * @param myselfName The value of myselfName as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setMyselfName_Equal(String myselfName) {
        doSetMyselfName_Equal(fRES(myselfName));
    }

    protected void doSetMyselfName_Equal(String myselfName) {
        regMyselfName(CK_EQ, myselfName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * MYSELF_NAME: {NotNull, VARCHAR(80)}
     * @param myselfName The value of myselfName as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setMyselfName_NotEqual(String myselfName) {
        doSetMyselfName_NotEqual(fRES(myselfName));
    }

    protected void doSetMyselfName_NotEqual(String myselfName) {
        regMyselfName(CK_NES, myselfName);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * MYSELF_NAME: {NotNull, VARCHAR(80)}
     * @param myselfName The value of myselfName as greaterThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setMyselfName_GreaterThan(String myselfName) {
        regMyselfName(CK_GT, fRES(myselfName));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * MYSELF_NAME: {NotNull, VARCHAR(80)}
     * @param myselfName The value of myselfName as lessThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setMyselfName_LessThan(String myselfName) {
        regMyselfName(CK_LT, fRES(myselfName));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * MYSELF_NAME: {NotNull, VARCHAR(80)}
     * @param myselfName The value of myselfName as greaterEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setMyselfName_GreaterEqual(String myselfName) {
        regMyselfName(CK_GE, fRES(myselfName));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * MYSELF_NAME: {NotNull, VARCHAR(80)}
     * @param myselfName The value of myselfName as lessEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setMyselfName_LessEqual(String myselfName) {
        regMyselfName(CK_LE, fRES(myselfName));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * MYSELF_NAME: {NotNull, VARCHAR(80)}
     * @param myselfNameList The collection of myselfName as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMyselfName_InScope(Collection<String> myselfNameList) {
        doSetMyselfName_InScope(myselfNameList);
    }

    public void doSetMyselfName_InScope(Collection<String> myselfNameList) {
        regINS(CK_INS, cTL(myselfNameList), getCValueMyselfName(), "MYSELF_NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * MYSELF_NAME: {NotNull, VARCHAR(80)}
     * @param myselfNameList The collection of myselfName as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMyselfName_NotInScope(Collection<String> myselfNameList) {
        doSetMyselfName_NotInScope(myselfNameList);
    }

    public void doSetMyselfName_NotInScope(Collection<String> myselfNameList) {
        regINS(CK_NINS, cTL(myselfNameList), getCValueMyselfName(), "MYSELF_NAME");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * MYSELF_NAME: {NotNull, VARCHAR(80)}
     * @param myselfName The value of myselfName as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setMyselfName_PrefixSearch(String myselfName) {
        setMyselfName_LikeSearch(myselfName, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * MYSELF_NAME: {NotNull, VARCHAR(80)} <br />
     * <pre>e.g. setMyselfName_LikeSearch("xxx", new <span style="color: #FD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param myselfName The value of myselfName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setMyselfName_LikeSearch(String myselfName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(myselfName), getCValueMyselfName(), "MYSELF_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * MYSELF_NAME: {NotNull, VARCHAR(80)}
     * @param myselfName The value of myselfName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setMyselfName_NotLikeSearch(String myselfName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(myselfName), getCValueMyselfName(), "MYSELF_NAME", likeSearchOption);
    }

    protected void regMyselfName(ConditionKey k, Object v) { regQ(k, v, getCValueMyselfName(), "MYSELF_NAME"); }
    abstract protected ConditionValue getCValueMyselfName();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_Equal()</span>.max(new SubQuery&lt;LdMyselfCB&gt;() {
     *     public void query(LdMyselfCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<LdMyselfCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ.getOperand());
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;LdMyselfCB&gt;() {
     *     public void query(LdMyselfCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<LdMyselfCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;LdMyselfCB&gt;() {
     *     public void query(LdMyselfCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<LdMyselfCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessThan()</span>.max(new SubQuery&lt;LdMyselfCB&gt;() {
     *     public void query(LdMyselfCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<LdMyselfCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;LdMyselfCB&gt;() {
     *     public void query(LdMyselfCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<LdMyselfCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;LdMyselfCB&gt;() {
     *     public void query(LdMyselfCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<LdMyselfCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE.getOperand());
    }

    protected HpSSQFunction<LdMyselfCB> xcreateSSQFunction(final String operand) {
        return new HpSSQFunction<LdMyselfCB>(new HpSSQSetupper<LdMyselfCB>() {
            public void setup(String function, SubQuery<LdMyselfCB> subQuery, HpSSQOption<LdMyselfCB> option) {
                xscalarCondition(function, subQuery, operand, option);
            }
        });
    }

    protected void xscalarCondition(String function, SubQuery<LdMyselfCB> subQuery, String operand, HpSSQOption<LdMyselfCB> option) {
        assertObjectNotNull("subQuery<LdMyselfCB>", subQuery);
        LdMyselfCB cb = xcreateScalarConditionCB(); subQuery.query(cb);
        String subQueryPropertyName = keepScalarCondition(cb.query()); // for saving query-value
        option.setPartitionByCBean(xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(function, cb.query(), subQueryPropertyName, operand, option);
    }
    public abstract String keepScalarCondition(LdMyselfCQ subQuery);

    protected LdMyselfCB xcreateScalarConditionCB() {
        LdMyselfCB cb = new LdMyselfCB();
        cb.xsetupForScalarCondition(this);
        return cb;
    }

    protected LdMyselfCB xcreateScalarConditionPartitionByCB() {
        LdMyselfCB cb = new LdMyselfCB();
        cb.xsetupForScalarConditionPartitionBy(this);
        return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String function, SubQuery<LdMyselfCB> subQuery, String aliasName, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<LdMyselfCB>", subQuery);
        LdMyselfCB cb = new LdMyselfCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepSpecifyMyselfDerived(cb.query()); // for saving query-value.
        registerSpecifyMyselfDerived(function, cb.query(), "MYSELF_ID", "MYSELF_ID", subQueryPropertyName, "myselfDerived", aliasName, option);
    }
    public abstract String keepSpecifyMyselfDerived(LdMyselfCQ subQuery);

    /**
     * Prepare for (Query)MyselfDerived (SubQuery).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<LdMyselfCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived();
    }
    protected HpQDRFunction<LdMyselfCB> xcreateQDRFunctionMyselfDerived() {
        return new HpQDRFunction<LdMyselfCB>(new HpQDRSetupper<LdMyselfCB>() {
            public void setup(String function, SubQuery<LdMyselfCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
                xqderiveMyselfDerived(function, subQuery, operand, value, option);
            }
        });
    }
    public void xqderiveMyselfDerived(String function, SubQuery<LdMyselfCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<LdMyselfCB>", subQuery);
        LdMyselfCB cb = new LdMyselfCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String parameterPropertyName = keepQueryMyselfDerivedParameter(value);
        registerQueryMyselfDerived(function, cb.query(), "MYSELF_ID", "MYSELF_ID", subQueryPropertyName, "myselfDerived", operand, value, parameterPropertyName, option);
    }
    public abstract String keepQueryMyselfDerived(LdMyselfCQ subQuery);
    public abstract String keepQueryMyselfDerivedParameter(Object parameterValue);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfExists(SubQuery<LdMyselfCB> subQuery) {
        assertObjectNotNull("subQuery<LdMyselfCB>", subQuery);
        LdMyselfCB cb = new LdMyselfCB(); cb.xsetupForMyselfExists(this); subQuery.query(cb);
        String subQueryPropertyName = keepMyselfExists(cb.query()); // for saving query-value.
        registerMyselfExists(cb.query(), subQueryPropertyName);
    }
    public abstract String keepMyselfExists(LdMyselfCQ subQuery);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfInScope(SubQuery<LdMyselfCB> subQuery) {
        assertObjectNotNull("subQuery<LdMyselfCB>", subQuery);
        LdMyselfCB cb = new LdMyselfCB(); cb.xsetupForMyselfInScope(this); subQuery.query(cb);
        String subQueryPropertyName = keepMyselfInScope(cb.query()); // for saving query-value.
        registerMyselfInScope(cb.query(), subQueryPropertyName);
    }
    public abstract String keepMyselfInScope(LdMyselfCQ subQuery);

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabCB() { return LdMyselfCB.class.getName(); }
    protected String xabCQ() { return LdMyselfCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
