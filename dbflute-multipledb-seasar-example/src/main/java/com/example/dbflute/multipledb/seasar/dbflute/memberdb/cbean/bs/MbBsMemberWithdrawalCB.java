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
 * The base condition-bean of MEMBER_WITHDRAWAL.
 * @author DBFlute(AutoGenerator)
 */
public class MbBsMemberWithdrawalCB extends AbstractConditionBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected MbMemberWithdrawalCQ _conditionQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public MbBsMemberWithdrawalCB() {
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
        return "MEMBER_WITHDRAWAL";
    }

    // ===================================================================================
    //                                                                 PrimaryKey Handling
    //                                                                 ===================
    public void acceptPrimaryKey(Integer memberId) {
        assertObjectNotNull("memberId", memberId);
        MbBsMemberWithdrawalCB cb = this;
        cb.query().setMemberId_Equal(memberId);
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
     * <span style="color: #3F7E5E">// ExistsReferrer: (co-related sub-query)</span>
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
     * <span style="color: #3F7E5E">// (Query)DerivedReferrer: (co-related sub-query)</span>
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
    public MbMemberWithdrawalCQ query() {
        assertQueryPurpose(); // assert only when user-public query 
        return getConditionQuery();
    }

    public MbMemberWithdrawalCQ getConditionQuery() { // public for parameter comment and internal
        if (_conditionQuery == null) {
            _conditionQuery = createLocalCQ();
        }
        return _conditionQuery;
    }

    protected MbMemberWithdrawalCQ createLocalCQ() {
        return xcreateCQ(null, getSqlClause(), getSqlClause().getBasePointAliasName(), 0);
    }

    protected MbMemberWithdrawalCQ xcreateCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        MbMemberWithdrawalCQ cq = xnewCQ(childQuery, sqlClause, aliasName, nestLevel);
        cq.xsetBaseCB(this);
        return cq;
    }

    protected MbMemberWithdrawalCQ xnewCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        return new MbMemberWithdrawalCQ(childQuery, sqlClause, aliasName, nestLevel);
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
     * cb.query().<span style="color: #FD4747">union</span>(new UnionQuery&lt;MbMemberWithdrawalCB&gt;() {
     *     public void query(MbMemberWithdrawalCB unionCB) {
     *         unionCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param unionQuery The query of 'union'. (NotNull)
     */
    public void union(UnionQuery<MbMemberWithdrawalCB> unionQuery) {
        final MbMemberWithdrawalCB cb = new MbMemberWithdrawalCB();
        cb.xsetupForUnion(this); xsyncUQ(cb); unionQuery.query(cb); xsaveUCB(cb);
        final MbMemberWithdrawalCQ cq = cb.query(); query().xsetUnionQuery(cq);
    }

    /**
     * Set up 'union all' for base-point table. <br />
     * You don't need to call SetupSelect in union-query,
     * because it inherits calls before. (Don't call SetupSelect after here)
     * <pre>
     * cb.query().<span style="color: #FD4747">unionAll</span>(new UnionQuery&lt;MbMemberWithdrawalCB&gt;() {
     *     public void query(MbMemberWithdrawalCB unionCB) {
     *         unionCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param unionQuery The query of 'union all'. (NotNull)
     */
    public void unionAll(UnionQuery<MbMemberWithdrawalCB> unionQuery) {
        final MbMemberWithdrawalCB cb = new MbMemberWithdrawalCB();
        cb.xsetupForUnion(this); xsyncUQ(cb); unionQuery.query(cb); xsaveUCB(cb);
        final MbMemberWithdrawalCQ cq = cb.query(); query().xsetUnionAllQuery(cq);
    }

    // ===================================================================================
    //                                                                         SetupSelect
    //                                                                         ===========
    protected MbMemberNss _nssMember;
    public MbMemberNss getNssMember() {
        if (_nssMember == null) { _nssMember = new MbMemberNss(null); }
        return _nssMember;
    }
    /**
     * Set up relation columns to select clause. <br />
     * MEMBER by my MEMBER_ID, named 'member'.
     * <pre>
     * MbMemberWithdrawalCB cb = new MbMemberWithdrawalCB();
     * cb.<span style="color: #FD4747">setupSelect_Member()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     * cb.query().setFoo...(value);
     * MbMemberWithdrawal memberWithdrawal = memberWithdrawalBhv.selectEntityWithDeletedCheck(cb);
     * ... = memberWithdrawal.<span style="color: #FD4747">getMember()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public MbMemberNss setupSelect_Member() {
        doSetupSelect(new SsCall() { public ConditionQuery qf() { return query().queryMember(); } });
        if (_nssMember == null || !_nssMember.hasConditionQuery())
        { _nssMember = new MbMemberNss(query().queryMember()); }
        return _nssMember;
    }
    protected MbWithdrawalReasonNss _nssWithdrawalReason;
    public MbWithdrawalReasonNss getNssWithdrawalReason() {
        if (_nssWithdrawalReason == null) { _nssWithdrawalReason = new MbWithdrawalReasonNss(null); }
        return _nssWithdrawalReason;
    }
    /**
     * Set up relation columns to select clause. <br />
     * WITHDRAWAL_REASON by my WITHDRAWAL_REASON_CODE, named 'withdrawalReason'.
     * <pre>
     * MbMemberWithdrawalCB cb = new MbMemberWithdrawalCB();
     * cb.<span style="color: #FD4747">setupSelect_WithdrawalReason()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     * cb.query().setFoo...(value);
     * MbMemberWithdrawal memberWithdrawal = memberWithdrawalBhv.selectEntityWithDeletedCheck(cb);
     * ... = memberWithdrawal.<span style="color: #FD4747">getWithdrawalReason()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public MbWithdrawalReasonNss setupSelect_WithdrawalReason() {
        if (hasSpecifiedColumn()) { // if reverse call
            specify().columnWithdrawalReasonCode();
        }
        doSetupSelect(new SsCall() { public ConditionQuery qf() { return query().queryWithdrawalReason(); } });
        if (_nssWithdrawalReason == null || !_nssWithdrawalReason.hasConditionQuery())
        { _nssWithdrawalReason = new MbWithdrawalReasonNss(query().queryWithdrawalReason()); }
        return _nssWithdrawalReason;
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
            , new HpSpQyCall<MbMemberWithdrawalCQ>() {
                public boolean has() { return true; }
                public MbMemberWithdrawalCQ qy() { return getConditionQuery(); }
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

    public static class HpSpecification extends HpAbstractSpecification<MbMemberWithdrawalCQ> {
        protected MbMemberCB.HpSpecification _member;
        protected MbWithdrawalReasonCB.HpSpecification _withdrawalReason;
        public HpSpecification(ConditionBean baseCB, HpSpQyCall<MbMemberWithdrawalCQ> qyCall
                             , HpCBPurpose purpose, DBMetaProvider dbmetaProvider)
        { super(baseCB, qyCall, purpose, dbmetaProvider); }
        /**
         * MEMBER_ID: {PK, NotNull, INTEGER(10), FK to MEMBER}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnMemberId() { return doColumn("MEMBER_ID"); }
        /**
         * WITHDRAWAL_REASON_CODE: {IX, CHAR(3), FK to WITHDRAWAL_REASON}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnWithdrawalReasonCode() { return doColumn("WITHDRAWAL_REASON_CODE"); }
        /**
         * WITHDRAWAL_REASON_INPUT_TEXT: {CLOB(2147483647)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnWithdrawalReasonInputText() { return doColumn("WITHDRAWAL_REASON_INPUT_TEXT"); }
        /**
         * WITHDRAWAL_DATETIME: {NotNull, TIMESTAMP(23, 10)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnWithdrawalDatetime() { return doColumn("WITHDRAWAL_DATETIME"); }
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
            if (qyCall().qy().hasConditionQueryWithdrawalReason()
                    || qyCall().qy().xgetReferrerQuery() instanceof MbWithdrawalReasonCQ) {
                columnWithdrawalReasonCode(); // FK or one-to-one referrer
            }
        }
        @Override
        protected String getTableDbName() { return "MEMBER_WITHDRAWAL"; }
        /**
         * Prepare to specify functions about relation table. <br />
         * MEMBER by my MEMBER_ID, named 'member'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MbMemberCB.HpSpecification specifyMember() {
            assertRelation("member");
            if (_member == null) {
                _member = new MbMemberCB.HpSpecification(_baseCB, new HpSpQyCall<MbMemberCQ>() {
                    public boolean has() { return _qyCall.has() && _qyCall.qy().hasConditionQueryMember(); }
                    public MbMemberCQ qy() { return _qyCall.qy().queryMember(); } }
                    , _purpose, _dbmetaProvider);
                if (xhasSyncQyCall()) { // inherits it
                    _member.xsetSyncQyCall(new HpSpQyCall<MbMemberCQ>() {
                        public boolean has() { return xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMember(); }
                        public MbMemberCQ qy() { return xsyncQyCall().qy().queryMember(); }
                    });
                }
            }
            return _member;
        }
        /**
         * Prepare to specify functions about relation table. <br />
         * WITHDRAWAL_REASON by my WITHDRAWAL_REASON_CODE, named 'withdrawalReason'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MbWithdrawalReasonCB.HpSpecification specifyWithdrawalReason() {
            assertRelation("withdrawalReason");
            if (_withdrawalReason == null) {
                _withdrawalReason = new MbWithdrawalReasonCB.HpSpecification(_baseCB, new HpSpQyCall<MbWithdrawalReasonCQ>() {
                    public boolean has() { return _qyCall.has() && _qyCall.qy().hasConditionQueryWithdrawalReason(); }
                    public MbWithdrawalReasonCQ qy() { return _qyCall.qy().queryWithdrawalReason(); } }
                    , _purpose, _dbmetaProvider);
                if (xhasSyncQyCall()) { // inherits it
                    _withdrawalReason.xsetSyncQyCall(new HpSpQyCall<MbWithdrawalReasonCQ>() {
                        public boolean has() { return xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryWithdrawalReason(); }
                        public MbWithdrawalReasonCQ qy() { return xsyncQyCall().qy().queryWithdrawalReason(); }
                    });
                }
            }
            return _withdrawalReason;
        }
        /**
         * Prepare for (Specify)MyselfDerived (SubQuery).
         * @return The object to set up a function for myself table. (NotNull)
         */
        public HpSDRFunction<MbMemberWithdrawalCB, MbMemberWithdrawalCQ> myselfDerived() {
            assertDerived("myselfDerived"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return new HpSDRFunction<MbMemberWithdrawalCB, MbMemberWithdrawalCQ>(_baseCB, _qyCall.qy(), new HpSDRSetupper<MbMemberWithdrawalCB, MbMemberWithdrawalCQ>() {
                public void setup(String function, SubQuery<MbMemberWithdrawalCB> subQuery, MbMemberWithdrawalCQ cq, String aliasName, DerivedReferrerOption option) {
                    cq.xsmyselfDerive(function, subQuery, aliasName, option); } }, _dbmetaProvider);
        }
    }

    // [DBFlute-0.9.5.3]
    // ===================================================================================
    //                                                                         ColumnQuery
    //                                                                         ===========
    /**
     * Set up column-query. {column1 = column2}
     * <pre>
     * <span style="color: #3F7E5E">// where FOO &lt; BAR</span>
     * cb.<span style="color: #FD4747">columnQuery</span>(new SpecifyQuery&lt;MbMemberWithdrawalCB&gt;() {
     *     public void query(MbMemberWithdrawalCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFoo()</span>; <span style="color: #3F7E5E">// left column</span>
     *     }
     * }).lessThan(new SpecifyQuery&lt;MbMemberWithdrawalCB&gt;() {
     *     public void query(MbMemberWithdrawalCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnBar()</span>; <span style="color: #3F7E5E">// right column</span>
     *     }
     * }); <span style="color: #3F7E5E">// you can calculate for right column like '}).plus(3);'</span>
     * </pre>
     * @param leftSpecifyQuery The specify-query for left column. (NotNull)
     * @return The object for setting up operand and right column. (NotNull)
     */
    public HpColQyOperand<MbMemberWithdrawalCB> columnQuery(final SpecifyQuery<MbMemberWithdrawalCB> leftSpecifyQuery) {
        return new HpColQyOperand<MbMemberWithdrawalCB>(new HpColQyHandler<MbMemberWithdrawalCB>() {
            public HpCalculator handle(SpecifyQuery<MbMemberWithdrawalCB> rightSp, String operand) {
                return xcolqy(xcreateColumnQueryCB(), xcreateColumnQueryCB(), leftSpecifyQuery, rightSp, operand);
            }
        });
    }

    protected MbMemberWithdrawalCB xcreateColumnQueryCB() {
        MbMemberWithdrawalCB cb = new MbMemberWithdrawalCB();
        cb.xsetupForColumnQuery((MbMemberWithdrawalCB)this);
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
    public MbMemberWithdrawalCB dreamCruiseCB() {
        MbMemberWithdrawalCB cb = new MbMemberWithdrawalCB();
        cb.xsetupForDreamCruise((MbMemberWithdrawalCB) this);
        return cb;
    }

    protected ConditionBean xdoCreateDreamCruiseCB() {
        return dreamCruiseCB();
    }

    // [DBFlute-0.9.6.3]
    // ===================================================================================
    //                                                                        OrScopeQuery
    //                                                                        ============
    /**
     * Set up the query for or-scope. <br />
     * (Same-column-and-same-condition-key conditions are allowed in or-scope)
     * <pre>
     * <span style="color: #3F7E5E">// where (FOO = '...' or BAR = '...')</span>
     * cb.<span style="color: #FD4747">orScopeQuery</span>(new OrQuery&lt;MbMemberWithdrawalCB&gt;() {
     *     public void query(MbMemberWithdrawalCB orCB) {
     *         orCB.query().setFOO_Equal...
     *         orCB.query().setBAR_Equal...
     *     }
     * });
     * </pre>
     * @param orQuery The query for or-condition. (NotNull)
     */
    public void orScopeQuery(OrQuery<MbMemberWithdrawalCB> orQuery) {
        xorSQ((MbMemberWithdrawalCB)this, orQuery);
    }

    /**
     * Set up the and-part of or-scope. <br />
     * (However nested or-scope query and as-or-split of like-search in and-part are unsupported)
     * <pre>
     * <span style="color: #3F7E5E">// where (FOO = '...' or (BAR = '...' and QUX = '...'))</span>
     * cb.<span style="color: #FD4747">orScopeQuery</span>(new OrQuery&lt;MbMemberWithdrawalCB&gt;() {
     *     public void query(MbMemberWithdrawalCB orCB) {
     *         orCB.query().setFOO_Equal...
     *         orCB.<span style="color: #FD4747">orScopeQueryAndPart</span>(new AndQuery&lt;MbMemberWithdrawalCB&gt;() {
     *             public void query(MbMemberWithdrawalCB andCB) {
     *                 andCB.query().setBar_...
     *                 andCB.query().setQux_...
     *             }
     *         });
     *     }
     * });
     * </pre>
     * @param andQuery The query for and-condition. (NotNull)
     */
    public void orScopeQueryAndPart(AndQuery<MbMemberWithdrawalCB> andQuery) {
        xorSQAP((MbMemberWithdrawalCB)this, andQuery);
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
        final MbMemberWithdrawalCB cb;
        if (mainCB != null) {
            cb = (MbMemberWithdrawalCB)mainCB;
        } else {
            cb = new MbMemberWithdrawalCB();
        }
        specify().xsetSyncQyCall(new HpSpQyCall<MbMemberWithdrawalCQ>() {
            public boolean has() { return true; }
            public MbMemberWithdrawalCQ qy() { return cb.query(); }
        });
    }

    // ===================================================================================
    //                                                                            Internal
    //                                                                            ========
    // very internal (for suppressing warn about 'Not Use Import')
    protected String getConditionBeanClassNameInternally() { return MbMemberWithdrawalCB.class.getName(); }
    protected String getConditionQueryClassNameInternally() { return MbMemberWithdrawalCQ.class.getName(); }
    protected String getSubQueryClassNameInternally() { return SubQuery.class.getName(); }
    protected String getConditionOptionClassNameInternally() { return ConditionOption.class.getName(); }
}
