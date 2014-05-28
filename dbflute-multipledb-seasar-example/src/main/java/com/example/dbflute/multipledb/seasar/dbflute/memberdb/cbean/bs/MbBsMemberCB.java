package com.example.dbflute.multipledb.seasar.dbflute.memberdb.cbean.bs;

import org.seasar.dbflute.cbean.AbstractConditionBean;
import org.seasar.dbflute.cbean.AndQuery;
import org.seasar.dbflute.cbean.ConditionBean;
import org.seasar.dbflute.cbean.ConditionQuery;
import org.seasar.dbflute.cbean.OrQuery;
import org.seasar.dbflute.cbean.SpecifyQuery;
import org.seasar.dbflute.cbean.SubQuery;
import org.seasar.dbflute.cbean.UnionQuery;
import org.seasar.dbflute.cbean.chelper.*;
import org.seasar.dbflute.cbean.coption.*;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import org.seasar.dbflute.cbean.sqlclause.SqlClauseCreator;
import org.seasar.dbflute.dbmeta.DBMetaProvider;
import org.seasar.dbflute.twowaysql.factory.SqlAnalyzerFactory;
import com.example.dbflute.multipledb.seasar.dbflute.memberdb.allcommon.MbDBFluteConfig;
import com.example.dbflute.multipledb.seasar.dbflute.memberdb.allcommon.MbDBMetaInstanceHandler;
import com.example.dbflute.multipledb.seasar.dbflute.memberdb.allcommon.MbImplementedInvokerAssistant;
import com.example.dbflute.multipledb.seasar.dbflute.memberdb.allcommon.MbImplementedSqlClauseCreator;
import com.example.dbflute.multipledb.seasar.dbflute.memberdb.cbean.*;
import com.example.dbflute.multipledb.seasar.dbflute.memberdb.cbean.cq.*;
import com.example.dbflute.multipledb.seasar.dbflute.memberdb.cbean.nss.*;

/**
 * The base condition-bean of MEMBER.
 * @author DBFlute(AutoGenerator)
 */
public class MbBsMemberCB extends AbstractConditionBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected MbMemberCQ _conditionQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public MbBsMemberCB() {
        if (MbDBFluteConfig.getInstance().isPagingCountLater()) {
            enablePagingCountLater();
        }
        if (MbDBFluteConfig.getInstance().isPagingCountLeastJoin()) {
            enablePagingCountLeastJoin();
        }
        if (MbDBFluteConfig.getInstance().isCheckCountBeforeQueryUpdate()) {
            enableCheckCountBeforeQueryUpdate();
        }
    }

    // ===================================================================================
    //                                                                           SqlClause
    //                                                                           =========
    @Override
    protected SqlClause createSqlClause() {
        SqlClauseCreator creator = MbDBFluteConfig.getInstance().getSqlClauseCreator();
        if (creator != null) {
            return creator.createSqlClause(this);
        }
        return new MbImplementedSqlClauseCreator().createSqlClause(this); // as default
    }

    // ===================================================================================
    //                                                                     DBMeta Provider
    //                                                                     ===============
    @Override
    protected DBMetaProvider getDBMetaProvider() {
        return MbDBMetaInstanceHandler.getProvider(); // as default
    }

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "MEMBER";
    }

    // ===================================================================================
    //                                                                 PrimaryKey Handling
    //                                                                 ===================
    /**
     * Accept the query condition of primary key as equal.
     * @param memberId : PK, ID, NotNull, INTEGER(10), FK to MEMBER_LOGIN. (NotNull)
     */
    public void acceptPrimaryKey(Integer memberId) {
        assertObjectNotNull("memberId", memberId);
        MbBsMemberCB cb = this;
        cb.query().setMemberId_Equal(memberId);;
    }

    /**
     * Accept the query condition of unique key as equal.
     * @param memberAccount : UQ, NotNull, VARCHAR(50). (NotNull)
     */
    public void acceptUniqueOf(String memberAccount) {
        assertObjectNotNull("memberAccount", memberAccount);
        MbBsMemberCB cb = this;
        cb.query().setMemberAccount_Equal(memberAccount);;
    }

    public ConditionBean addOrderBy_PK_Asc() {
        query().addOrderBy_MemberId_Asc();
        return this;
    }

    public ConditionBean addOrderBy_PK_Desc() {
        query().addOrderBy_MemberId_Desc();
        return this;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Prepare for various queries. <br />
     * Examples of main functions are following:
     * <pre>
     * <span style="color: #3F7E5E">// Basic Queries</span>
     * cb.query().setMemberId_Equal(value);        <span style="color: #3F7E5E">// =</span>
     * cb.query().setMemberId_NotEqual(value);     <span style="color: #3F7E5E">// !=</span>
     * cb.query().setMemberId_GreaterThan(value);  <span style="color: #3F7E5E">// &gt;</span>
     * cb.query().setMemberId_LessThan(value);     <span style="color: #3F7E5E">// &lt;</span>
     * cb.query().setMemberId_GreaterEqual(value); <span style="color: #3F7E5E">// &gt;=</span>
     * cb.query().setMemberId_LessEqual(value);    <span style="color: #3F7E5E">// &lt;=</span>
     * cb.query().setMemberName_InScope(valueList);    <span style="color: #3F7E5E">// in ('a', 'b')</span>
     * cb.query().setMemberName_NotInScope(valueList); <span style="color: #3F7E5E">// not in ('a', 'b')</span>
     * cb.query().setMemberName_PrefixSearch(value);   <span style="color: #3F7E5E">// like 'a%' escape '|'</span>
     * <span style="color: #3F7E5E">// LikeSearch with various options: (versatile)</span>
     * <span style="color: #3F7E5E">// {like ... [options]}</span>
     * cb.query().setMemberName_LikeSearch(value, option);
     * cb.query().setMemberName_NotLikeSearch(value, option); <span style="color: #3F7E5E">// not like ...</span>
     * <span style="color: #3F7E5E">// FromTo with various options: (versatile)</span>
     * <span style="color: #3F7E5E">// {(default) fromDatetime &lt;= BIRTHDATE &lt;= toDatetime}</span>
     * cb.query().setBirthdate_FromTo(fromDatetime, toDatetime, option);
     * <span style="color: #3F7E5E">// DateFromTo: (Date means yyyy/MM/dd)</span>
     * <span style="color: #3F7E5E">// {fromDate &lt;= BIRTHDATE &lt; toDate + 1 day}</span>
     * cb.query().setBirthdate_DateFromTo(fromDate, toDate);
     * cb.query().setBirthdate_IsNull();    <span style="color: #3F7E5E">// is null</span>
     * cb.query().setBirthdate_IsNotNull(); <span style="color: #3F7E5E">// is not null</span>
     * 
     * <span style="color: #3F7E5E">// ExistsReferrer: (correlated sub-query)</span>
     * <span style="color: #3F7E5E">// {where exists (select PURCHASE_ID from PURCHASE where ...)}</span>
     * cb.query().existsPurchaseList(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.query().setXxx... <span style="color: #3F7E5E">// referrer sub-query condition</span>
     *     }
     * });
     * cb.query().notExistsPurchaseList...
     * 
     * <span style="color: #3F7E5E">// InScopeRelation: (sub-query)</span>
     * <span style="color: #3F7E5E">// {where MEMBER_STATUS_CODE in (select MEMBER_STATUS_CODE from MEMBER_STATUS where ...)}</span>
     * cb.query().inScopeMemberStatus(new SubQuery&lt;MemberStatusCB&gt;() {
     *     public void query(MemberStatusCB subCB) {
     *         subCB.query().setXxx... <span style="color: #3F7E5E">// relation sub-query condition</span>
     *     }
     * });
     * cb.query().notInScopeMemberStatus...
     * 
     * <span style="color: #3F7E5E">// (Query)DerivedReferrer: (correlated sub-query)</span>
     * cb.query().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchasePrice(); <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setXxx... <span style="color: #3F7E5E">// referrer sub-query condition</span>
     *     }
     * }).greaterEqual(value);
     * 
     * <span style="color: #3F7E5E">// ScalarCondition: (self-table sub-query)</span>
     * cb.query().scalar_Equal().max(new SubQuery&lt;MemberCB&gt;() {
     *     public void query(MemberCB subCB) {
     *         subCB.specify().columnBirthdate(); <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setXxx... <span style="color: #3F7E5E">// scalar sub-query condition</span>
     *     }
     * });
     * 
     * <span style="color: #3F7E5E">// OrderBy</span>
     * cb.query().addOrderBy_MemberName_Asc();
     * cb.query().addOrderBy_MemberName_Desc().withManualOrder(valueList);
     * cb.query().addOrderBy_MemberName_Desc().withNullsFirst();
     * cb.query().addOrderBy_MemberName_Desc().withNullsLast();
     * cb.query().addSpecifiedDerivedOrderBy_Desc(aliasName);
     * 
     * <span style="color: #3F7E5E">// Query(Relation)</span>
     * cb.query().queryMemberStatus()...;
     * cb.query().queryMemberAddressAsValid(targetDate)...;
     * </pre>
     * @return The instance of condition-query for base-point table to set up query. (NotNull)
     */
    public MbMemberCQ query() {
        assertQueryPurpose(); // assert only when user-public query 
        return getConditionQuery();
    }

    public MbMemberCQ getConditionQuery() { // public for parameter comment and internal
        if (_conditionQuery == null) {
            _conditionQuery = createLocalCQ();
        }
        return _conditionQuery;
    }

    protected MbMemberCQ createLocalCQ() {
        return xcreateCQ(null, getSqlClause(), getSqlClause().getBasePointAliasName(), 0);
    }

    protected MbMemberCQ xcreateCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        MbMemberCQ cq = xnewCQ(childQuery, sqlClause, aliasName, nestLevel);
        cq.xsetBaseCB(this);
        return cq;
    }

    protected MbMemberCQ xnewCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        return new MbMemberCQ(childQuery, sqlClause, aliasName, nestLevel);
    }

    public ConditionQuery localCQ() {
        return getConditionQuery();
    }

    // ===================================================================================
    //                                                                               Union
    //                                                                               =====
    /**
     * Set up 'union' for base-point table. <br />
     * You don't need to call SetupSelect in union-query,
     * because it inherits calls before. (Don't call SetupSelect after here)
     * <pre>
     * cb.query().<span style="color: #DD4747">union</span>(new UnionQuery&lt;MbMemberCB&gt;() {
     *     public void query(MbMemberCB unionCB) {
     *         unionCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param unionQuery The query of 'union'. (NotNull)
     */
    public void union(UnionQuery<MbMemberCB> unionQuery) {
        final MbMemberCB cb = new MbMemberCB(); cb.xsetupForUnion(this); xsyncUQ(cb); 
        try { lock(); unionQuery.query(cb); } finally { unlock(); } xsaveUCB(cb);
        final MbMemberCQ cq = cb.query(); query().xsetUnionQuery(cq);
    }

    /**
     * Set up 'union all' for base-point table. <br />
     * You don't need to call SetupSelect in union-query,
     * because it inherits calls before. (Don't call SetupSelect after here)
     * <pre>
     * cb.query().<span style="color: #DD4747">unionAll</span>(new UnionQuery&lt;MbMemberCB&gt;() {
     *     public void query(MbMemberCB unionCB) {
     *         unionCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param unionQuery The query of 'union all'. (NotNull)
     */
    public void unionAll(UnionQuery<MbMemberCB> unionQuery) {
        final MbMemberCB cb = new MbMemberCB(); cb.xsetupForUnion(this); xsyncUQ(cb);
        try { lock(); unionQuery.query(cb); } finally { unlock(); } xsaveUCB(cb);
        final MbMemberCQ cq = cb.query(); query().xsetUnionAllQuery(cq);
    }

    // ===================================================================================
    //                                                                         SetupSelect
    //                                                                         ===========
    protected MbMemberStatusNss _nssMemberStatus;
    public MbMemberStatusNss getNssMemberStatus() {
        if (_nssMemberStatus == null) { _nssMemberStatus = new MbMemberStatusNss(null); }
        return _nssMemberStatus;
    }
    /**
     * Set up relation columns to select clause. <br />
     * MEMBER_STATUS by my MEMBER_STATUS_CODE, named 'memberStatus'.
     * <pre>
     * MbMemberCB cb = new MbMemberCB();
     * cb.<span style="color: #DD4747">setupSelect_MemberStatus()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     * cb.query().setFoo...(value);
     * MbMember member = memberBhv.selectEntityWithDeletedCheck(cb);
     * ... = member.<span style="color: #DD4747">getMemberStatus()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public MbMemberStatusNss setupSelect_MemberStatus() {
        assertSetupSelectPurpose("memberStatus");
        if (hasSpecifiedColumn()) { // if reverse call
            specify().columnMemberStatusCode();
        }
        doSetupSelect(new SsCall() { public ConditionQuery qf() { return query().queryMemberStatus(); } });
        if (_nssMemberStatus == null || !_nssMemberStatus.hasConditionQuery())
        { _nssMemberStatus = new MbMemberStatusNss(query().queryMemberStatus()); }
        return _nssMemberStatus;
    }
    protected MbMemberLoginNss _nssMemberLoginAsLatest;
    public MbMemberLoginNss getNssMemberLoginAsLatest() {
        if (_nssMemberLoginAsLatest == null) { _nssMemberLoginAsLatest = new MbMemberLoginNss(null); }
        return _nssMemberLoginAsLatest;
    }
    /**
     * Set up relation columns to select clause. <br />
     * MEMBER_LOGIN by my MEMBER_ID, named 'memberLoginAsLatest'.
     * <pre>
     * MbMemberCB cb = new MbMemberCB();
     * cb.<span style="color: #DD4747">setupSelect_MemberLoginAsLatest()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     * cb.query().setFoo...(value);
     * MbMember member = memberBhv.selectEntityWithDeletedCheck(cb);
     * ... = member.<span style="color: #DD4747">getMemberLoginAsLatest()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public MbMemberLoginNss setupSelect_MemberLoginAsLatest() {
        assertSetupSelectPurpose("memberLoginAsLatest");
        doSetupSelect(new SsCall() { public ConditionQuery qf() { return query().queryMemberLoginAsLatest(); } });
        if (_nssMemberLoginAsLatest == null || !_nssMemberLoginAsLatest.hasConditionQuery())
        { _nssMemberLoginAsLatest = new MbMemberLoginNss(query().queryMemberLoginAsLatest()); }
        return _nssMemberLoginAsLatest;
    }

    protected MbMemberSecurityNss _nssMemberSecurityAsOne;
    public MbMemberSecurityNss getNssMemberSecurityAsOne() {
        if (_nssMemberSecurityAsOne == null) { _nssMemberSecurityAsOne = new MbMemberSecurityNss(null); }
        return _nssMemberSecurityAsOne;
    }
    /**
     * Set up relation columns to select clause. <br />
     * MEMBER_SECURITY by MEMBER_ID, named 'memberSecurityAsOne'.
     * <pre>
     * MbMemberCB cb = new MbMemberCB();
     * cb.<span style="color: #DD4747">setupSelect_MemberSecurityAsOne()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     * cb.query().setFoo...(value);
     * MbMember member = memberBhv.selectEntityWithDeletedCheck(cb);
     * ... = member.<span style="color: #DD4747">getMemberSecurityAsOne()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public MbMemberSecurityNss setupSelect_MemberSecurityAsOne() {
        assertSetupSelectPurpose("memberSecurityAsOne");
        doSetupSelect(new SsCall() { public ConditionQuery qf() { return query().queryMemberSecurityAsOne(); } });
        if (_nssMemberSecurityAsOne == null || !_nssMemberSecurityAsOne.hasConditionQuery()) { _nssMemberSecurityAsOne = new MbMemberSecurityNss(query().queryMemberSecurityAsOne()); }
        return _nssMemberSecurityAsOne;
    }

    protected MbMemberServiceNss _nssMemberServiceAsOne;
    public MbMemberServiceNss getNssMemberServiceAsOne() {
        if (_nssMemberServiceAsOne == null) { _nssMemberServiceAsOne = new MbMemberServiceNss(null); }
        return _nssMemberServiceAsOne;
    }
    /**
     * Set up relation columns to select clause. <br />
     * MEMBER_SERVICE by MEMBER_ID, named 'memberServiceAsOne'.
     * <pre>
     * MbMemberCB cb = new MbMemberCB();
     * cb.<span style="color: #DD4747">setupSelect_MemberServiceAsOne()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     * cb.query().setFoo...(value);
     * MbMember member = memberBhv.selectEntityWithDeletedCheck(cb);
     * ... = member.<span style="color: #DD4747">getMemberServiceAsOne()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public MbMemberServiceNss setupSelect_MemberServiceAsOne() {
        assertSetupSelectPurpose("memberServiceAsOne");
        doSetupSelect(new SsCall() { public ConditionQuery qf() { return query().queryMemberServiceAsOne(); } });
        if (_nssMemberServiceAsOne == null || !_nssMemberServiceAsOne.hasConditionQuery()) { _nssMemberServiceAsOne = new MbMemberServiceNss(query().queryMemberServiceAsOne()); }
        return _nssMemberServiceAsOne;
    }

    protected MbMemberWithdrawalNss _nssMemberWithdrawalAsOne;
    public MbMemberWithdrawalNss getNssMemberWithdrawalAsOne() {
        if (_nssMemberWithdrawalAsOne == null) { _nssMemberWithdrawalAsOne = new MbMemberWithdrawalNss(null); }
        return _nssMemberWithdrawalAsOne;
    }
    /**
     * Set up relation columns to select clause. <br />
     * MEMBER_WITHDRAWAL by MEMBER_ID, named 'memberWithdrawalAsOne'.
     * <pre>
     * MbMemberCB cb = new MbMemberCB();
     * cb.<span style="color: #DD4747">setupSelect_MemberWithdrawalAsOne()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     * cb.query().setFoo...(value);
     * MbMember member = memberBhv.selectEntityWithDeletedCheck(cb);
     * ... = member.<span style="color: #DD4747">getMemberWithdrawalAsOne()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public MbMemberWithdrawalNss setupSelect_MemberWithdrawalAsOne() {
        assertSetupSelectPurpose("memberWithdrawalAsOne");
        doSetupSelect(new SsCall() { public ConditionQuery qf() { return query().queryMemberWithdrawalAsOne(); } });
        if (_nssMemberWithdrawalAsOne == null || !_nssMemberWithdrawalAsOne.hasConditionQuery()) { _nssMemberWithdrawalAsOne = new MbMemberWithdrawalNss(query().queryMemberWithdrawalAsOne()); }
        return _nssMemberWithdrawalAsOne;
    }

    // [DBFlute-0.7.4]
    // ===================================================================================
    //                                                                             Specify
    //                                                                             =======
    protected HpSpecification _specification;

    /**
     * Prepare for SpecifyColumn, (Specify)DerivedReferrer. <br />
     * This method should be called after SetupSelect.
     * <pre>
     * cb.setupSelect_MemberStatus(); <span style="color: #3F7E5E">// should be called before specify()</span>
     * cb.specify().columnMemberName();
     * cb.specify().specifyMemberStatus().columnMemberStatusName();
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *         subCB.query().set...
     *     }
     * }, aliasName);
     * </pre>
     * @return The instance of specification. (NotNull)
     */
    public HpSpecification specify() {
        assertSpecifyPurpose();
        if (_specification == null) { _specification = new HpSpecification(this
            , new HpSpQyCall<MbMemberCQ>() {
                public boolean has() { return true; }
                public MbMemberCQ qy() { return getConditionQuery(); }
            }
            , _purpose, getDBMetaProvider()); }
        return _specification;
    }

    public HpColumnSpHandler localSp() {
        return specify();
    }

    public boolean hasSpecifiedColumn() {
        return _specification != null && _specification.isAlreadySpecifiedRequiredColumn();
    }

    public static class HpSpecification extends HpAbstractSpecification<MbMemberCQ> {
        protected MbMemberStatusCB.HpSpecification _memberStatus;
        protected MbMemberLoginCB.HpSpecification _memberLoginAsLatest;
        protected MbMemberSecurityCB.HpSpecification _memberSecurityAsOne;
        protected MbMemberServiceCB.HpSpecification _memberServiceAsOne;
        protected MbMemberWithdrawalCB.HpSpecification _memberWithdrawalAsOne;
        public HpSpecification(ConditionBean baseCB, HpSpQyCall<MbMemberCQ> qyCall
                             , HpCBPurpose purpose, DBMetaProvider dbmetaProvider)
        { super(baseCB, qyCall, purpose, dbmetaProvider); }
        /**
         * MEMBER_ID: {PK, ID, NotNull, INTEGER(10), FK to MEMBER_LOGIN}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnMemberId() { return doColumn("MEMBER_ID"); }
        /**
         * MEMBER_NAME: {IX, NotNull, VARCHAR(200)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnMemberName() { return doColumn("MEMBER_NAME"); }
        /**
         * MEMBER_ACCOUNT: {UQ, NotNull, VARCHAR(50)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnMemberAccount() { return doColumn("MEMBER_ACCOUNT"); }
        /**
         * MEMBER_STATUS_CODE: {IX, NotNull, CHAR(3), FK to MEMBER_STATUS, classification=MemberStatus}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnMemberStatusCode() { return doColumn("MEMBER_STATUS_CODE"); }
        /**
         * FORMALIZED_DATETIME: {IX, TIMESTAMP(23, 10)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnFormalizedDatetime() { return doColumn("FORMALIZED_DATETIME"); }
        /**
         * BIRTHDATE: {DATE(8)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnBirthdate() { return doColumn("BIRTHDATE"); }
        /**
         * REGISTER_DATETIME: {NotNull, TIMESTAMP(23, 10)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnRegisterDatetime() { return doColumn("REGISTER_DATETIME"); }
        /**
         * REGISTER_USER: {NotNull, VARCHAR(200)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnRegisterUser() { return doColumn("REGISTER_USER"); }
        /**
         * UPDATE_DATETIME: {NotNull, TIMESTAMP(23, 10)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnUpdateDatetime() { return doColumn("UPDATE_DATETIME"); }
        /**
         * UPDATE_USER: {NotNull, VARCHAR(200)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnUpdateUser() { return doColumn("UPDATE_USER"); }
        /**
         * VERSION_NO: {NotNull, BIGINT(19)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnVersionNo() { return doColumn("VERSION_NO"); }
        public void everyColumn() { doEveryColumn(); }
        public void exceptRecordMetaColumn() { doExceptRecordMetaColumn(); }
        @Override
        protected void doSpecifyRequiredColumn() {
            columnMemberId(); // PK
            if (qyCall().qy().hasConditionQueryMemberStatus()
                    || qyCall().qy().xgetReferrerQuery() instanceof MbMemberStatusCQ) {
                columnMemberStatusCode(); // FK or one-to-one referrer
            }
        }
        @Override
        protected String getTableDbName() { return "MEMBER"; }
        /**
         * Prepare to specify functions about relation table. <br />
         * MEMBER_STATUS by my MEMBER_STATUS_CODE, named 'memberStatus'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MbMemberStatusCB.HpSpecification specifyMemberStatus() {
            assertRelation("memberStatus");
            if (_memberStatus == null) {
                _memberStatus = new MbMemberStatusCB.HpSpecification(_baseCB, new HpSpQyCall<MbMemberStatusCQ>() {
                    public boolean has() { return _qyCall.has() && _qyCall.qy().hasConditionQueryMemberStatus(); }
                    public MbMemberStatusCQ qy() { return _qyCall.qy().queryMemberStatus(); } }
                    , _purpose, _dbmetaProvider);
                if (xhasSyncQyCall()) { // inherits it
                    _memberStatus.xsetSyncQyCall(new HpSpQyCall<MbMemberStatusCQ>() {
                        public boolean has() { return xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMemberStatus(); }
                        public MbMemberStatusCQ qy() { return xsyncQyCall().qy().queryMemberStatus(); }
                    });
                }
            }
            return _memberStatus;
        }
        /**
         * Prepare to specify functions about relation table. <br />
         * MEMBER_LOGIN by my MEMBER_ID, named 'memberLoginAsLatest'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MbMemberLoginCB.HpSpecification specifyMemberLoginAsLatest() {
            assertRelation("memberLoginAsLatest");
            if (_memberLoginAsLatest == null) {
                _memberLoginAsLatest = new MbMemberLoginCB.HpSpecification(_baseCB, new HpSpQyCall<MbMemberLoginCQ>() {
                    public boolean has() { return _qyCall.has() && _qyCall.qy().hasConditionQueryMemberLoginAsLatest(); }
                    public MbMemberLoginCQ qy() { return _qyCall.qy().queryMemberLoginAsLatest(); } }
                    , _purpose, _dbmetaProvider);
                if (xhasSyncQyCall()) { // inherits it
                    _memberLoginAsLatest.xsetSyncQyCall(new HpSpQyCall<MbMemberLoginCQ>() {
                        public boolean has() { return xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMemberLoginAsLatest(); }
                        public MbMemberLoginCQ qy() { return xsyncQyCall().qy().queryMemberLoginAsLatest(); }
                    });
                }
            }
            return _memberLoginAsLatest;
        }
        /**
         * Prepare to specify functions about relation table. <br />
         * MEMBER_SECURITY by MEMBER_ID, named 'memberSecurityAsOne'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MbMemberSecurityCB.HpSpecification specifyMemberSecurityAsOne() {
            assertRelation("memberSecurityAsOne");
            if (_memberSecurityAsOne == null) {
                _memberSecurityAsOne = new MbMemberSecurityCB.HpSpecification(_baseCB, new HpSpQyCall<MbMemberSecurityCQ>() {
                    public boolean has() { return _qyCall.has() && _qyCall.qy().hasConditionQueryMemberSecurityAsOne(); }
                    public MbMemberSecurityCQ qy() { return _qyCall.qy().queryMemberSecurityAsOne(); } }
                    , _purpose, _dbmetaProvider);
                if (xhasSyncQyCall()) { // inherits it
                    _memberSecurityAsOne.xsetSyncQyCall(new HpSpQyCall<MbMemberSecurityCQ>() {
                        public boolean has() { return xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMemberSecurityAsOne(); }
                        public MbMemberSecurityCQ qy() { return xsyncQyCall().qy().queryMemberSecurityAsOne(); }
                    });
                }
            }
            return _memberSecurityAsOne;
        }
        /**
         * Prepare to specify functions about relation table. <br />
         * MEMBER_SERVICE by MEMBER_ID, named 'memberServiceAsOne'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MbMemberServiceCB.HpSpecification specifyMemberServiceAsOne() {
            assertRelation("memberServiceAsOne");
            if (_memberServiceAsOne == null) {
                _memberServiceAsOne = new MbMemberServiceCB.HpSpecification(_baseCB, new HpSpQyCall<MbMemberServiceCQ>() {
                    public boolean has() { return _qyCall.has() && _qyCall.qy().hasConditionQueryMemberServiceAsOne(); }
                    public MbMemberServiceCQ qy() { return _qyCall.qy().queryMemberServiceAsOne(); } }
                    , _purpose, _dbmetaProvider);
                if (xhasSyncQyCall()) { // inherits it
                    _memberServiceAsOne.xsetSyncQyCall(new HpSpQyCall<MbMemberServiceCQ>() {
                        public boolean has() { return xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMemberServiceAsOne(); }
                        public MbMemberServiceCQ qy() { return xsyncQyCall().qy().queryMemberServiceAsOne(); }
                    });
                }
            }
            return _memberServiceAsOne;
        }
        /**
         * Prepare to specify functions about relation table. <br />
         * MEMBER_WITHDRAWAL by MEMBER_ID, named 'memberWithdrawalAsOne'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MbMemberWithdrawalCB.HpSpecification specifyMemberWithdrawalAsOne() {
            assertRelation("memberWithdrawalAsOne");
            if (_memberWithdrawalAsOne == null) {
                _memberWithdrawalAsOne = new MbMemberWithdrawalCB.HpSpecification(_baseCB, new HpSpQyCall<MbMemberWithdrawalCQ>() {
                    public boolean has() { return _qyCall.has() && _qyCall.qy().hasConditionQueryMemberWithdrawalAsOne(); }
                    public MbMemberWithdrawalCQ qy() { return _qyCall.qy().queryMemberWithdrawalAsOne(); } }
                    , _purpose, _dbmetaProvider);
                if (xhasSyncQyCall()) { // inherits it
                    _memberWithdrawalAsOne.xsetSyncQyCall(new HpSpQyCall<MbMemberWithdrawalCQ>() {
                        public boolean has() { return xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMemberWithdrawalAsOne(); }
                        public MbMemberWithdrawalCQ qy() { return xsyncQyCall().qy().queryMemberWithdrawalAsOne(); }
                    });
                }
            }
            return _memberWithdrawalAsOne;
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br />
         * {select max(FOO) from MEMBER_ADDRESS where ...) as FOO_MAX} <br />
         * MEMBER_ADDRESS by MEMBER_ID, named 'memberAddressList'.
         * <pre>
         * cb.specify().<span style="color: #DD4747">derivedMemberAddressList()</span>.<span style="color: #DD4747">max</span>(new SubQuery&lt;MbMemberAddressCB&gt;() {
         *     public void query(MbMemberAddressCB subCB) {
         *         subCB.specify().<span style="color: #DD4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *         subCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
         *     }
         * }, MbMemberAddress.<span style="color: #DD4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<MbMemberAddressCB, MbMemberCQ> derivedMemberAddressList() {
            assertDerived("memberAddressList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return new HpSDRFunction<MbMemberAddressCB, MbMemberCQ>(_baseCB, _qyCall.qy(), new HpSDRSetupper<MbMemberAddressCB, MbMemberCQ>() {
                public void setup(String fn, SubQuery<MbMemberAddressCB> sq, MbMemberCQ cq, String al, DerivedReferrerOption op) {
                    cq.xsderiveMemberAddressList(fn, sq, al, op); } }, _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br />
         * {select max(FOO) from MEMBER_LOGIN where ...) as FOO_MAX} <br />
         * MEMBER_LOGIN by MEMBER_ID, named 'memberLoginList'.
         * <pre>
         * cb.specify().<span style="color: #DD4747">derivedMemberLoginList()</span>.<span style="color: #DD4747">max</span>(new SubQuery&lt;MbMemberLoginCB&gt;() {
         *     public void query(MbMemberLoginCB subCB) {
         *         subCB.specify().<span style="color: #DD4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *         subCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
         *     }
         * }, MbMemberLogin.<span style="color: #DD4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<MbMemberLoginCB, MbMemberCQ> derivedMemberLoginList() {
            assertDerived("memberLoginList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return new HpSDRFunction<MbMemberLoginCB, MbMemberCQ>(_baseCB, _qyCall.qy(), new HpSDRSetupper<MbMemberLoginCB, MbMemberCQ>() {
                public void setup(String fn, SubQuery<MbMemberLoginCB> sq, MbMemberCQ cq, String al, DerivedReferrerOption op) {
                    cq.xsderiveMemberLoginList(fn, sq, al, op); } }, _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br />
         * {select max(FOO) from PURCHASE where ...) as FOO_MAX} <br />
         * PURCHASE by MEMBER_ID, named 'purchaseList'.
         * <pre>
         * cb.specify().<span style="color: #DD4747">derivedPurchaseList()</span>.<span style="color: #DD4747">max</span>(new SubQuery&lt;MbPurchaseCB&gt;() {
         *     public void query(MbPurchaseCB subCB) {
         *         subCB.specify().<span style="color: #DD4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *         subCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
         *     }
         * }, MbPurchase.<span style="color: #DD4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<MbPurchaseCB, MbMemberCQ> derivedPurchaseList() {
            assertDerived("purchaseList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return new HpSDRFunction<MbPurchaseCB, MbMemberCQ>(_baseCB, _qyCall.qy(), new HpSDRSetupper<MbPurchaseCB, MbMemberCQ>() {
                public void setup(String fn, SubQuery<MbPurchaseCB> sq, MbMemberCQ cq, String al, DerivedReferrerOption op) {
                    cq.xsderivePurchaseList(fn, sq, al, op); } }, _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)MyselfDerived (SubQuery).
         * @return The object to set up a function for myself table. (NotNull)
         */
        public HpSDRFunction<MbMemberCB, MbMemberCQ> myselfDerived() {
            assertDerived("myselfDerived"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return new HpSDRFunction<MbMemberCB, MbMemberCQ>(_baseCB, _qyCall.qy(), new HpSDRSetupper<MbMemberCB, MbMemberCQ>() {
                public void setup(String fn, SubQuery<MbMemberCB> sq, MbMemberCQ cq, String al, DerivedReferrerOption op) {
                    cq.xsmyselfDerive(fn, sq, al, op); } }, _dbmetaProvider);
        }
    }

    // [DBFlute-0.9.5.3]
    // ===================================================================================
    //                                                                        Column Query
    //                                                                        ============
    /**
     * Set up column-query. {column1 = column2}
     * <pre>
     * <span style="color: #3F7E5E">// where FOO &lt; BAR</span>
     * cb.<span style="color: #DD4747">columnQuery</span>(new SpecifyQuery&lt;MbMemberCB&gt;() {
     *     public void query(MbMemberCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFoo()</span>; <span style="color: #3F7E5E">// left column</span>
     *     }
     * }).lessThan(new SpecifyQuery&lt;MbMemberCB&gt;() {
     *     public void query(MbMemberCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnBar()</span>; <span style="color: #3F7E5E">// right column</span>
     *     }
     * }); <span style="color: #3F7E5E">// you can calculate for right column like '}).plus(3);'</span>
     * </pre>
     * @param leftSpecifyQuery The specify-query for left column. (NotNull)
     * @return The object for setting up operand and right column. (NotNull)
     */
    public HpColQyOperand<MbMemberCB> columnQuery(final SpecifyQuery<MbMemberCB> leftSpecifyQuery) {
        return new HpColQyOperand<MbMemberCB>(new HpColQyHandler<MbMemberCB>() {
            public HpCalculator handle(SpecifyQuery<MbMemberCB> rightSp, String operand) {
                return xcolqy(xcreateColumnQueryCB(), xcreateColumnQueryCB(), leftSpecifyQuery, rightSp, operand);
            }
        });
    }

    protected MbMemberCB xcreateColumnQueryCB() {
        MbMemberCB cb = new MbMemberCB();
        cb.xsetupForColumnQuery((MbMemberCB)this);
        return cb;
    }

    // ===================================================================================
    //                                                                        Dream Cruise
    //                                                                        ============
    /**
     * Welcome to the Dream Cruise for condition-bean deep world. <br />
     * This is very specialty so you can get the frontier spirit. Bon voyage!
     * @return The condition-bean for dream cruise, which is linked to main condition-bean.
     */
    public MbMemberCB dreamCruiseCB() {
        MbMemberCB cb = new MbMemberCB();
        cb.xsetupForDreamCruise((MbMemberCB) this);
        return cb;
    }

    protected ConditionBean xdoCreateDreamCruiseCB() {
        return dreamCruiseCB();
    }

    // [DBFlute-0.9.6.3]
    // ===================================================================================
    //                                                                       OrScope Query
    //                                                                       =============
    /**
     * Set up the query for or-scope. <br />
     * (Same-column-and-same-condition-key conditions are allowed in or-scope)
     * <pre>
     * <span style="color: #3F7E5E">// where (FOO = '...' or BAR = '...')</span>
     * cb.<span style="color: #DD4747">orScopeQuery</span>(new OrQuery&lt;MbMemberCB&gt;() {
     *     public void query(MbMemberCB orCB) {
     *         orCB.query().setFOO_Equal...
     *         orCB.query().setBAR_Equal...
     *     }
     * });
     * </pre>
     * @param orQuery The query for or-condition. (NotNull)
     */
    public void orScopeQuery(OrQuery<MbMemberCB> orQuery) {
        xorSQ((MbMemberCB)this, orQuery);
    }

    @Override
    protected HpCBPurpose xhandleOrSQPurposeChange() {
        return null; // means no check
    }

    /**
     * Set up the and-part of or-scope. <br />
     * (However nested or-scope query and as-or-split of like-search in and-part are unsupported)
     * <pre>
     * <span style="color: #3F7E5E">// where (FOO = '...' or (BAR = '...' and QUX = '...'))</span>
     * cb.<span style="color: #DD4747">orScopeQuery</span>(new OrQuery&lt;MbMemberCB&gt;() {
     *     public void query(MbMemberCB orCB) {
     *         orCB.query().setFOO_Equal...
     *         orCB.<span style="color: #DD4747">orScopeQueryAndPart</span>(new AndQuery&lt;MbMemberCB&gt;() {
     *             public void query(MbMemberCB andCB) {
     *                 andCB.query().setBar_...
     *                 andCB.query().setQux_...
     *             }
     *         });
     *     }
     * });
     * </pre>
     * @param andQuery The query for and-condition. (NotNull)
     */
    public void orScopeQueryAndPart(AndQuery<MbMemberCB> andQuery) {
        xorSQAP((MbMemberCB)this, andQuery);
    }

    // ===================================================================================
    //                                                                          DisplaySQL
    //                                                                          ==========
    @Override
    protected SqlAnalyzerFactory getSqlAnalyzerFactory()
    { return new MbImplementedInvokerAssistant().assistSqlAnalyzerFactory(); }
    @Override
    protected String getLogDateFormat() { return MbDBFluteConfig.getInstance().getLogDateFormat(); }
    @Override
    protected String getLogTimestampFormat() { return MbDBFluteConfig.getInstance().getLogTimestampFormat(); }

    // ===================================================================================
    //                                                                       Meta Handling
    //                                                                       =============
    public boolean hasUnionQueryOrUnionAllQuery() {
        return query().hasUnionQueryOrUnionAllQuery();
    }

    // ===================================================================================
    //                                                                        Purpose Type
    //                                                                        ============
    @Override
    protected void xprepareSyncQyCall(ConditionBean mainCB) {
        final MbMemberCB cb;
        if (mainCB != null) {
            cb = (MbMemberCB)mainCB;
        } else {
            cb = new MbMemberCB();
        }
        specify().xsetSyncQyCall(new HpSpQyCall<MbMemberCQ>() {
            public boolean has() { return true; }
            public MbMemberCQ qy() { return cb.query(); }
        });
    }

    // ===================================================================================
    //                                                                            Internal
    //                                                                            ========
    // very internal (for suppressing warn about 'Not Use Import')
    protected String getConditionBeanClassNameInternally() { return MbMemberCB.class.getName(); }
    protected String getConditionQueryClassNameInternally() { return MbMemberCQ.class.getName(); }
    protected String getSubQueryClassNameInternally() { return SubQuery.class.getName(); }
    protected String getConditionOptionClassNameInternally() { return ConditionOption.class.getName(); }
}
