package com.example.dbflute.multipledb.seasar.dbflute.memberdb.cbean.cq.bs;

import java.util.*;

import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.cbean.chelper.*;
import org.seasar.dbflute.cbean.ckey.*;
import org.seasar.dbflute.cbean.coption.*;
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import org.seasar.dbflute.dbmeta.DBMetaProvider;
import com.example.dbflute.multipledb.seasar.dbflute.memberdb.allcommon.*;
import com.example.dbflute.multipledb.seasar.dbflute.memberdb.cbean.*;
import com.example.dbflute.multipledb.seasar.dbflute.memberdb.cbean.cq.*;

/**
 * The abstract condition-query of REGION.
 * @author DBFlute(AutoGenerator)
 */
public abstract class MbAbstractBsRegionCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public MbAbstractBsRegionCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                     DBMeta Provider
    //                                                                     ===============
    @Override
    protected DBMetaProvider xgetDBMetaProvider() {
        return MbDBMetaInstanceHandler.getProvider();
    }

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "REGION";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * REGION_ID: {PK, NotNull, INTEGER(10)}
     * @param regionId The value of regionId as equal. (NullAllowed: if null, no condition)
     */
    public void setRegionId_Equal(Integer regionId) {
        doSetRegionId_Equal(regionId);
    }

    protected void doSetRegionId_Equal(Integer regionId) {
        regRegionId(CK_EQ, regionId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * REGION_ID: {PK, NotNull, INTEGER(10)}
     * @param regionId The value of regionId as notEqual. (NullAllowed: if null, no condition)
     */
    public void setRegionId_NotEqual(Integer regionId) {
        doSetRegionId_NotEqual(regionId);
    }

    protected void doSetRegionId_NotEqual(Integer regionId) {
        regRegionId(CK_NES, regionId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * REGION_ID: {PK, NotNull, INTEGER(10)}
     * @param regionId The value of regionId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setRegionId_GreaterThan(Integer regionId) {
        regRegionId(CK_GT, regionId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * REGION_ID: {PK, NotNull, INTEGER(10)}
     * @param regionId The value of regionId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setRegionId_LessThan(Integer regionId) {
        regRegionId(CK_LT, regionId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * REGION_ID: {PK, NotNull, INTEGER(10)}
     * @param regionId The value of regionId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setRegionId_GreaterEqual(Integer regionId) {
        regRegionId(CK_GE, regionId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * REGION_ID: {PK, NotNull, INTEGER(10)}
     * @param regionId The value of regionId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setRegionId_LessEqual(Integer regionId) {
        regRegionId(CK_LE, regionId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * REGION_ID: {PK, NotNull, INTEGER(10)}
     * @param minNumber The min number of regionId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of regionId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setRegionId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueRegionId(), "REGION_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * REGION_ID: {PK, NotNull, INTEGER(10)}
     * @param regionIdList The collection of regionId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setRegionId_InScope(Collection<Integer> regionIdList) {
        doSetRegionId_InScope(regionIdList);
    }

    protected void doSetRegionId_InScope(Collection<Integer> regionIdList) {
        regINS(CK_INS, cTL(regionIdList), getCValueRegionId(), "REGION_ID");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br />
     * {exists (select REGION_ID from MEMBER_ADDRESS where ...)} <br />
     * MEMBER_ADDRESS by REGION_ID, named 'memberAddressAsOne'.
     * <pre>
     * cb.query().<span style="color: #DD4747">existsMemberAddressList</span>(new SubQuery&lt;MbMemberAddressCB&gt;() {
     *     public void query(MbMemberAddressCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of MemberAddressList for 'exists'. (NotNull)
     */
    public void existsMemberAddressList(SubQuery<MbMemberAddressCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        MbMemberAddressCB cb = new MbMemberAddressCB(); cb.xsetupForExistsReferrer(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepRegionId_ExistsReferrer_MemberAddressList(cb.query());
        registerExistsReferrer(cb.query(), "REGION_ID", "REGION_ID", pp, "memberAddressList");
    }
    public abstract String keepRegionId_ExistsReferrer_MemberAddressList(MbMemberAddressCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br />
     * {not exists (select REGION_ID from MEMBER_ADDRESS where ...)} <br />
     * MEMBER_ADDRESS by REGION_ID, named 'memberAddressAsOne'.
     * <pre>
     * cb.query().<span style="color: #DD4747">notExistsMemberAddressList</span>(new SubQuery&lt;MbMemberAddressCB&gt;() {
     *     public void query(MbMemberAddressCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of RegionId_NotExistsReferrer_MemberAddressList for 'not exists'. (NotNull)
     */
    public void notExistsMemberAddressList(SubQuery<MbMemberAddressCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        MbMemberAddressCB cb = new MbMemberAddressCB(); cb.xsetupForExistsReferrer(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepRegionId_NotExistsReferrer_MemberAddressList(cb.query());
        registerNotExistsReferrer(cb.query(), "REGION_ID", "REGION_ID", pp, "memberAddressList");
    }
    public abstract String keepRegionId_NotExistsReferrer_MemberAddressList(MbMemberAddressCQ sq);

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select REGION_ID from MEMBER_ADDRESS where ...)} <br />
     * MEMBER_ADDRESS by REGION_ID, named 'memberAddressAsOne'.
     * @param subQuery The sub-query of MemberAddressList for 'in-scope'. (NotNull)
     */
    public void inScopeMemberAddressList(SubQuery<MbMemberAddressCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        MbMemberAddressCB cb = new MbMemberAddressCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepRegionId_InScopeRelation_MemberAddressList(cb.query());
        registerInScopeRelation(cb.query(), "REGION_ID", "REGION_ID", pp, "memberAddressList");
    }
    public abstract String keepRegionId_InScopeRelation_MemberAddressList(MbMemberAddressCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select REGION_ID from MEMBER_ADDRESS where ...)} <br />
     * MEMBER_ADDRESS by REGION_ID, named 'memberAddressAsOne'.
     * @param subQuery The sub-query of MemberAddressList for 'not in-scope'. (NotNull)
     */
    public void notInScopeMemberAddressList(SubQuery<MbMemberAddressCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        MbMemberAddressCB cb = new MbMemberAddressCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepRegionId_NotInScopeRelation_MemberAddressList(cb.query());
        registerNotInScopeRelation(cb.query(), "REGION_ID", "REGION_ID", pp, "memberAddressList");
    }
    public abstract String keepRegionId_NotInScopeRelation_MemberAddressList(MbMemberAddressCQ sq);

    public void xsderiveMemberAddressList(String fn, SubQuery<MbMemberAddressCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MbMemberAddressCB cb = new MbMemberAddressCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        String pp = keepRegionId_SpecifyDerivedReferrer_MemberAddressList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "REGION_ID", "REGION_ID", pp, "memberAddressList", al, op);
    }
    public abstract String keepRegionId_SpecifyDerivedReferrer_MemberAddressList(MbMemberAddressCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br />
     * {FOO &lt;= (select max(BAR) from MEMBER_ADDRESS where ...)} <br />
     * MEMBER_ADDRESS by REGION_ID, named 'memberAddressAsOne'.
     * <pre>
     * cb.query().<span style="color: #DD4747">derivedMemberAddressList()</span>.<span style="color: #DD4747">max</span>(new SubQuery&lt;MbMemberAddressCB&gt;() {
     *     public void query(MbMemberAddressCB subCB) {
     *         subCB.specify().<span style="color: #DD4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *         subCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     *     }
     * }).<span style="color: #DD4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<MbMemberAddressCB> derivedMemberAddressList() {
        return xcreateQDRFunctionMemberAddressList();
    }
    protected HpQDRFunction<MbMemberAddressCB> xcreateQDRFunctionMemberAddressList() {
        return new HpQDRFunction<MbMemberAddressCB>(new HpQDRSetupper<MbMemberAddressCB>() {
            public void setup(String fn, SubQuery<MbMemberAddressCB> sq, String rd, Object vl, DerivedReferrerOption op) {
                xqderiveMemberAddressList(fn, sq, rd, vl, op);
            }
        });
    }
    public void xqderiveMemberAddressList(String fn, SubQuery<MbMemberAddressCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MbMemberAddressCB cb = new MbMemberAddressCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        String sqpp = keepRegionId_QueryDerivedReferrer_MemberAddressList(cb.query()); String prpp = keepRegionId_QueryDerivedReferrer_MemberAddressListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "REGION_ID", "REGION_ID", sqpp, "memberAddressList", rd, vl, prpp, op);
    }
    public abstract String keepRegionId_QueryDerivedReferrer_MemberAddressList(MbMemberAddressCQ sq);
    public abstract String keepRegionId_QueryDerivedReferrer_MemberAddressListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * REGION_ID: {PK, NotNull, INTEGER(10)}
     */
    public void setRegionId_IsNull() { regRegionId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * REGION_ID: {PK, NotNull, INTEGER(10)}
     */
    public void setRegionId_IsNotNull() { regRegionId(CK_ISNN, DOBJ); }

    protected void regRegionId(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueRegionId(), "REGION_ID"); }
    protected abstract ConditionValue getCValueRegionId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * REGION_NAME: {NotNull, VARCHAR(50)}
     * @param regionName The value of regionName as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setRegionName_Equal(String regionName) {
        doSetRegionName_Equal(fRES(regionName));
    }

    protected void doSetRegionName_Equal(String regionName) {
        regRegionName(CK_EQ, regionName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * REGION_NAME: {NotNull, VARCHAR(50)}
     * @param regionName The value of regionName as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setRegionName_NotEqual(String regionName) {
        doSetRegionName_NotEqual(fRES(regionName));
    }

    protected void doSetRegionName_NotEqual(String regionName) {
        regRegionName(CK_NES, regionName);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * REGION_NAME: {NotNull, VARCHAR(50)}
     * @param regionNameList The collection of regionName as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setRegionName_InScope(Collection<String> regionNameList) {
        doSetRegionName_InScope(regionNameList);
    }

    public void doSetRegionName_InScope(Collection<String> regionNameList) {
        regINS(CK_INS, cTL(regionNameList), getCValueRegionName(), "REGION_NAME");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * REGION_NAME: {NotNull, VARCHAR(50)}
     * @param regionName The value of regionName as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setRegionName_PrefixSearch(String regionName) {
        setRegionName_LikeSearch(regionName, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * REGION_NAME: {NotNull, VARCHAR(50)} <br />
     * <pre>e.g. setRegionName_LikeSearch("xxx", new <span style="color: #DD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param regionName The value of regionName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setRegionName_LikeSearch(String regionName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(regionName), getCValueRegionName(), "REGION_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * REGION_NAME: {NotNull, VARCHAR(50)}
     * @param regionName The value of regionName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setRegionName_NotLikeSearch(String regionName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(regionName), getCValueRegionName(), "REGION_NAME", likeSearchOption);
    }

    protected void regRegionName(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueRegionName(), "REGION_NAME"); }
    protected abstract ConditionValue getCValueRegionName();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_Equal()</span>.max(new SubQuery&lt;MbRegionCB&gt;() {
     *     public void query(MbRegionCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<MbRegionCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ, MbRegionCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;MbRegionCB&gt;() {
     *     public void query(MbRegionCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<MbRegionCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES, MbRegionCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;MbRegionCB&gt;() {
     *     public void query(MbRegionCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<MbRegionCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT, MbRegionCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessThan()</span>.max(new SubQuery&lt;MbRegionCB&gt;() {
     *     public void query(MbRegionCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<MbRegionCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT, MbRegionCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;MbRegionCB&gt;() {
     *     public void query(MbRegionCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<MbRegionCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE, MbRegionCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;MbRegionCB&gt;() {
     *     public void query(MbRegionCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<MbRegionCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE, MbRegionCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSSQOption<CB> op) {
        assertObjectNotNull("subQuery", sq);
        MbRegionCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        op.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, op);
    }
    public abstract String keepScalarCondition(MbRegionCQ sq);

    protected MbRegionCB xcreateScalarConditionCB() {
        MbRegionCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected MbRegionCB xcreateScalarConditionPartitionByCB() {
        MbRegionCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<MbRegionCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MbRegionCB cb = new MbRegionCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        String pp = keepSpecifyMyselfDerived(cb.query());
        String pk = "REGION_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(MbRegionCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<MbRegionCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(MbRegionCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MbRegionCB cb = new MbRegionCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "REGION_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(MbRegionCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subQuery The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<MbRegionCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        MbRegionCB cb = new MbRegionCB(); cb.xsetupForMyselfExists(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(MbRegionCQ sq);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (sub-query).
     * @param subQuery The implementation of sub-query. (NotNull)
     */
    public void myselfInScope(SubQuery<MbRegionCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        MbRegionCB cb = new MbRegionCB(); cb.xsetupForMyselfInScope(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepMyselfInScope(cb.query());
        registerMyselfInScope(cb.query(), pp);
    }
    public abstract String keepMyselfInScope(MbRegionCQ sq);

    // ===================================================================================
    //                                                                        Manual Order
    //                                                                        ============
    /**
     * Order along manual ordering information.
     * <pre>
     * MemberCB cb = new MemberCB();
     * ManualOrderBean mob = new ManualOrderBean();
     * mob.<span style="color: #DD4747">when_GreaterEqual</span>(priorityDate); <span style="color: #3F7E5E">// e.g. 2000/01/01</span>
     * cb.query().addOrderBy_Birthdate_Asc().<span style="color: #DD4747">withManualOrder(mob)</span>;
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when BIRTHDATE &gt;= '2000/01/01' then 0</span>
     * <span style="color: #3F7E5E">//     else 1</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     *
     * MemberCB cb = new MemberCB();
     * ManualOrderBean mob = new ManualOrderBean();
     * mob.<span style="color: #DD4747">when_Equal</span>(CDef.MemberStatus.Withdrawal);
     * mob.<span style="color: #DD4747">when_Equal</span>(CDef.MemberStatus.Formalized);
     * mob.<span style="color: #DD4747">when_Equal</span>(CDef.MemberStatus.Provisional);
     * cb.query().addOrderBy_MemberStatusCode_Asc().<span style="color: #DD4747">withManualOrder(mob)</span>;
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'WDL' then 0</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'FML' then 1</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'PRV' then 2</span>
     * <span style="color: #3F7E5E">//     else 3</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     * </pre>
     * <p>This function with Union is unsupported!</p>
     * <p>The order values are bound (treated as bind parameter).</p>
     * @param mob The bean of manual order containing order values. (NotNull)
     */
    public void withManualOrder(ManualOrderBean mob) { // is user public!
        xdoWithManualOrder(mob);
    }

    // ===================================================================================
    //                                                                    Small Adjustment
    //                                                                    ================
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

    @Override
    protected void filterFromToOption(FromToOption option) {
        option.allowOneSide();
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    protected MbRegionCB newMyCB() {
        return new MbRegionCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return MbRegionCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
