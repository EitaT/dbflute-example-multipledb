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
 * The base condition-bean of MEMBER_ADDRESS.
 * @author DBFlute(AutoGenerator)
 */
public class MbBsMemberAddressCB extends AbstractConditionBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected MbMemberAddressCQ _conditionQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public MbBsMemberAddressCB() {
        if (MbDBFluteConfig.getInstance().isPagingCountLater()) {
            enablePagingCountLater();
        }
        if (MbDBFluteConfig.getInstance().isPagingCountLeastJoin()) {
            enablePagingCountLeastJoin();
        }
        if (MbDBFluteConfig.getInstance().isNonSpecifiedColumnAccessAllowed()) {
            enableNonSpecifiedColumnAccess();
        }
        if (MbDBFluteConfig.getInstance().isQueryUpdateCountPreCheck()) {
            enableQueryUpdateCountPreCheck();
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
        return "MEMBER_ADDRESS";
    }

    // ===================================================================================
    //                                                                 PrimaryKey Handling
    //                                                                 ===================
    /**
     * Accept the query condition of primary key as equal.
     * @param memberAddressId : PK, ID, NotNull, INTEGER(10). (NotNull)
     * @return this. (NotNull)
     */
    public MbMemberAddressCB acceptPK(Integer memberAddressId) {
        assertObjectNotNull("memberAddressId", memberAddressId);
        MbBsMemberAddressCB cb = this;
        cb.query().setMemberAddressId_Equal(memberAddressId);
        return (MbMemberAddressCB)this;
    }

    /**
     * Accept the query condition of primary key as equal. (old style)
     * @param memberAddressId : PK, ID, NotNull, INTEGER(10). (NotNull)
     */
    public void acceptPrimaryKey(Integer memberAddressId) {
        assertObjectNotNull("memberAddressId", memberAddressId);
        MbBsMemberAddressCB cb = this;
        cb.query().setMemberAddressId_Equal(memberAddressId);
    }

    /**
     * Accept the query condition of unique key as equal.
     * @param memberId : UQ+, IX, NotNull, INTEGER(10), FK to MEMBER. (NotNull)
     * @param validBeginDate : +UQ, NotNull, DATE(8). (NotNull)
     * @return this. (NotNull)
     */
    public MbMemberAddressCB acceptUniqueOf(Integer memberId, java.util.Date validBeginDate) {
        assertObjectNotNull("memberId", memberId);assertObjectNotNull("validBeginDate", validBeginDate);
        MbBsMemberAddressCB cb = this;
        cb.query().setMemberId_Equal(memberId);cb.query().setValidBeginDate_Equal(validBeginDate);
        return (MbMemberAddressCB)this;
    }

    public ConditionBean addOrderBy_PK_Asc() {
        query().addOrderBy_MemberAddressId_Asc();
        return this;
    }

    public ConditionBean addOrderBy_PK_Desc() {
        query().addOrderBy_MemberAddressId_Desc();
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
    public MbMemberAddressCQ query() {
        assertQueryPurpose(); // assert only when user-public query 
        return getConditionQuery();
    }

    public MbMemberAddressCQ getConditionQuery() { // public for parameter comment and internal
        if (_conditionQuery == null) {
            _conditionQuery = createLocalCQ();
        }
        return _conditionQuery;
    }

    protected MbMemberAddressCQ createLocalCQ() {
        return xcreateCQ(null, getSqlClause(), getSqlClause().getBasePointAliasName(), 0);
    }

    protected MbMemberAddressCQ xcreateCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        MbMemberAddressCQ cq = xnewCQ(childQuery, sqlClause, aliasName, nestLevel);
        cq.xsetBaseCB(this);
        return cq;
    }

    protected MbMemberAddressCQ xnewCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        return new MbMemberAddressCQ(childQuery, sqlClause, aliasName, nestLevel);
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
     * cb.query().<span style="color: #DD4747">union</span>(new UnionQuery&lt;MbMemberAddressCB&gt;() {
     *     public void query(MbMemberAddressCB unionCB) {
     *         unionCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param unionQuery The query of 'union'. (NotNull)
     */
    public void union(UnionQuery<MbMemberAddressCB> unionQuery) {
        final MbMemberAddressCB cb = new MbMemberAddressCB(); cb.xsetupForUnion(this); xsyncUQ(cb); 
        try { lock(); unionQuery.query(cb); } finally { unlock(); } xsaveUCB(cb);
        final MbMemberAddressCQ cq = cb.query(); query().xsetUnionQuery(cq);
    }

    /**
     * Set up 'union all' for base-point table. <br />
     * You don't need to call SetupSelect in union-query,
     * because it inherits calls before. (Don't call SetupSelect after here)
     * <pre>
     * cb.query().<span style="color: #DD4747">unionAll</span>(new UnionQuery&lt;MbMemberAddressCB&gt;() {
     *     public void query(MbMemberAddressCB unionCB) {
     *         unionCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param unionQuery The query of 'union all'. (NotNull)
     */
    public void unionAll(UnionQuery<MbMemberAddressCB> unionQuery) {
        final MbMemberAddressCB cb = new MbMemberAddressCB(); cb.xsetupForUnion(this); xsyncUQ(cb);
        try { lock(); unionQuery.query(cb); } finally { unlock(); } xsaveUCB(cb);
        final MbMemberAddressCQ cq = cb.query(); query().xsetUnionAllQuery(cq);
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
     * MbMemberAddressCB cb = new MbMemberAddressCB();
     * cb.<span style="color: #DD4747">setupSelect_Member()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     * cb.query().setFoo...(value);
     * MbMemberAddress memberAddress = memberAddressBhv.selectEntityWithDeletedCheck(cb);
     * ... = memberAddress.<span style="color: #DD4747">getMember()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public MbMemberNss setupSelect_Member() {
        assertSetupSelectPurpose("member");
        if (hasSpecifiedColumn()) { // if reverse call
            specify().columnMemberId();
        }
        doSetupSelect(new SsCall() { public ConditionQuery qf() { return query().queryMember(); } });
        if (_nssMember == null || !_nssMember.hasConditionQuery())
        { _nssMember = new MbMemberNss(query().queryMember()); }
        return _nssMember;
    }

    /**
     * Set up relation columns to select clause. <br />
     * REGION by my REGION_ID, named 'region'.
     * <pre>
     * MbMemberAddressCB cb = new MbMemberAddressCB();
     * cb.<span style="color: #DD4747">setupSelect_Region()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     * cb.query().setFoo...(value);
     * MbMemberAddress memberAddress = memberAddressBhv.selectEntityWithDeletedCheck(cb);
     * ... = memberAddress.<span style="color: #DD4747">getRegion()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * </pre>
     */
    public void setupSelect_Region() {
        assertSetupSelectPurpose("region");
        if (hasSpecifiedColumn()) { // if reverse call
            specify().columnRegionId();
        }
        doSetupSelect(new SsCall() { public ConditionQuery qf() { return query().queryRegion(); } });
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
            , new HpSpQyCall<MbMemberAddressCQ>() {
                public boolean has() { return true; }
                public MbMemberAddressCQ qy() { return getConditionQuery(); }
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

    public static class HpSpecification extends HpAbstractSpecification<MbMemberAddressCQ> {
        protected MbMemberCB.HpSpecification _member;
        protected MbRegionCB.HpSpecification _region;
        public HpSpecification(ConditionBean baseCB, HpSpQyCall<MbMemberAddressCQ> qyCall
                             , HpCBPurpose purpose, DBMetaProvider dbmetaProvider)
        { super(baseCB, qyCall, purpose, dbmetaProvider); }
        /**
         * MEMBER_ADDRESS_ID: {PK, ID, NotNull, INTEGER(10)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnMemberAddressId() { return doColumn("MEMBER_ADDRESS_ID"); }
        /**
         * MEMBER_ID: {UQ+, IX, NotNull, INTEGER(10), FK to MEMBER}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnMemberId() { return doColumn("MEMBER_ID"); }
        /**
         * VALID_BEGIN_DATE: {+UQ, NotNull, DATE(8)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnValidBeginDate() { return doColumn("VALID_BEGIN_DATE"); }
        /**
         * VALID_END_DATE: {NotNull, DATE(8)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnValidEndDate() { return doColumn("VALID_END_DATE"); }
        /**
         * ADDRESS: {NotNull, VARCHAR(200)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnAddress() { return doColumn("ADDRESS"); }
        /**
         * REGION_ID: {IX, NotNull, INTEGER(10), FK to REGION}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnRegionId() { return doColumn("REGION_ID"); }
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
            columnMemberAddressId(); // PK
            if (qyCall().qy().hasConditionQueryMember()
                    || qyCall().qy().xgetReferrerQuery() instanceof MbMemberCQ) {
                columnMemberId(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryRegion()
                    || qyCall().qy().xgetReferrerQuery() instanceof MbRegionCQ) {
                columnRegionId(); // FK or one-to-one referrer
            }
        }
        @Override
        protected String getTableDbName() { return "MEMBER_ADDRESS"; }
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
         * REGION by my REGION_ID, named 'region'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MbRegionCB.HpSpecification specifyRegion() {
            assertRelation("region");
            if (_region == null) {
                _region = new MbRegionCB.HpSpecification(_baseCB, new HpSpQyCall<MbRegionCQ>() {
                    public boolean has() { return _qyCall.has() && _qyCall.qy().hasConditionQueryRegion(); }
                    public MbRegionCQ qy() { return _qyCall.qy().queryRegion(); } }
                    , _purpose, _dbmetaProvider);
                if (xhasSyncQyCall()) { // inherits it
                    _region.xsetSyncQyCall(new HpSpQyCall<MbRegionCQ>() {
                        public boolean has() { return xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryRegion(); }
                        public MbRegionCQ qy() { return xsyncQyCall().qy().queryRegion(); }
                    });
                }
            }
            return _region;
        }
        /**
         * Prepare for (Specify)MyselfDerived (SubQuery).
         * @return The object to set up a function for myself table. (NotNull)
         */
        public HpSDRFunction<MbMemberAddressCB, MbMemberAddressCQ> myselfDerived() {
            assertDerived("myselfDerived"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return new HpSDRFunction<MbMemberAddressCB, MbMemberAddressCQ>(_baseCB, _qyCall.qy(), new HpSDRSetupper<MbMemberAddressCB, MbMemberAddressCQ>() {
                public void setup(String fn, SubQuery<MbMemberAddressCB> sq, MbMemberAddressCQ cq, String al, DerivedReferrerOption op) {
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
     * cb.<span style="color: #DD4747">columnQuery</span>(new SpecifyQuery&lt;MbMemberAddressCB&gt;() {
     *     public void query(MbMemberAddressCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFoo()</span>; <span style="color: #3F7E5E">// left column</span>
     *     }
     * }).lessThan(new SpecifyQuery&lt;MbMemberAddressCB&gt;() {
     *     public void query(MbMemberAddressCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnBar()</span>; <span style="color: #3F7E5E">// right column</span>
     *     }
     * }); <span style="color: #3F7E5E">// you can calculate for right column like '}).plus(3);'</span>
     * </pre>
     * @param leftSpecifyQuery The specify-query for left column. (NotNull)
     * @return The object for setting up operand and right column. (NotNull)
     */
    public HpColQyOperand<MbMemberAddressCB> columnQuery(final SpecifyQuery<MbMemberAddressCB> leftSpecifyQuery) {
        return xcreateColQyOperand(new HpColQyHandler<MbMemberAddressCB>() {
            public HpCalculator handle(SpecifyQuery<MbMemberAddressCB> rightSp, String operand) {
                return xcolqy(xcreateColumnQueryCB(), xcreateColumnQueryCB(), leftSpecifyQuery, rightSp, operand);
            }
        });
    }

    protected MbMemberAddressCB xcreateColumnQueryCB() {
        MbMemberAddressCB cb = new MbMemberAddressCB();
        cb.xsetupForColumnQuery((MbMemberAddressCB)this);
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
    public MbMemberAddressCB dreamCruiseCB() {
        MbMemberAddressCB cb = new MbMemberAddressCB();
        cb.xsetupForDreamCruise((MbMemberAddressCB) this);
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
     * cb.<span style="color: #DD4747">orScopeQuery</span>(new OrQuery&lt;MbMemberAddressCB&gt;() {
     *     public void query(MbMemberAddressCB orCB) {
     *         orCB.query().setFOO_Equal...
     *         orCB.query().setBAR_Equal...
     *     }
     * });
     * </pre>
     * @param orQuery The query for or-condition. (NotNull)
     */
    public void orScopeQuery(OrQuery<MbMemberAddressCB> orQuery) {
        xorSQ((MbMemberAddressCB)this, orQuery);
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
     * cb.<span style="color: #DD4747">orScopeQuery</span>(new OrQuery&lt;MbMemberAddressCB&gt;() {
     *     public void query(MbMemberAddressCB orCB) {
     *         orCB.query().setFOO_Equal...
     *         orCB.<span style="color: #DD4747">orScopeQueryAndPart</span>(new AndQuery&lt;MbMemberAddressCB&gt;() {
     *             public void query(MbMemberAddressCB andCB) {
     *                 andCB.query().setBar_...
     *                 andCB.query().setQux_...
     *             }
     *         });
     *     }
     * });
     * </pre>
     * @param andQuery The query for and-condition. (NotNull)
     */
    public void orScopeQueryAndPart(AndQuery<MbMemberAddressCB> andQuery) {
        xorSQAP((MbMemberAddressCB)this, andQuery);
    }

    /**
     * Check invalid query when query is set. <br />
     * (it throws an exception if set query is invalid) <br />
     * You should call this before registrations of where clause and other queries. <br />
     * Union and SubQuery and other sub condition-bean inherit this. <br />
     * 
     * <p>renamed to checkNullOrEmptyQuery() since 1.1,
     * but not deprecated because it might have many use.</p>
     * 
     * #java8 compatible option
     */
    public void checkInvalidQuery() {
        checkNullOrEmptyQuery();
    }

    /**
     * Accept (no check) an invalid query when a query is set. <br />
     * (no condition if a set query is invalid) <br />
     * You should call this before registrations of where clause and other queries. <br />
     * Union and SubQuery and other sub condition-bean inherit this.
     * @deprecated use ignoreNullOrEmptyQuery()
     */
    public void acceptInvalidQuery() {
        getSqlClause().ignoreNullOrEmptyQuery();
    }

    /**
     * Allow to auto-detect joins that can be inner-join. <br />
     * <pre>
     * o You should call this before registrations of where clause.
     * o Union and SubQuery and other sub condition-bean inherit this.
     * o You should confirm your SQL on the log to be tuned by inner-join correctly.
     * </pre>
     * @deprecated use enableInnerJoinAutoDetect()
     */
    public void allowInnerJoinAutoDetect() {
        enableInnerJoinAutoDetect();
    }

    /**
     * Suppress auto-detecting inner-join. <br />
     * You should call this before registrations of where clause.
     * @deprecated use disableInnerJoinAutoDetect()
     */
    public void suppressInnerJoinAutoDetect() {
        disableInnerJoinAutoDetect();
    }

    /**
     * Allow an empty string for query. <br />
     * (you can use an empty string as condition) <br />
     * You should call this before registrations of where clause and other queries. <br />
     * Union and SubQuery and other sub condition-bean inherit this.
     * @deprecated use enableEmptyStringQuery()
     */
    public void allowEmptyStringQuery() {
        enableEmptyStringQuery();
    }

    /**
     * Enable checking record count before QueryUpdate (contains QueryDelete). (default is disabled) <br />
     * No query update if zero count. (basically for MySQL's deadlock by next-key lock)
     * @deprecated use enableQueryUpdateCountPreCheck()
     */
    public void enableCheckCountBeforeQueryUpdate() {
        enableQueryUpdateCountPreCheck();
    }

    /**
     * Disable checking record count before QueryUpdate (contains QueryDelete). (back to default) <br />
     * Executes query update even if zero count. (normal specification)
     * @deprecated use disableQueryUpdateCountPreCheck()
     */
    public void disableCheckCountBeforeQueryUpdate() {
        disableQueryUpdateCountPreCheck();
    }

    /**
     * Allow "that's bad timing" check.
     * @deprecated use enableThatsBadTiming()
     */
    public void allowThatsBadTiming() {
        enableThatsBadTiming();
    }

    /**
     * Suppress "that's bad timing" check.
     * @deprecated use disableThatsBadTiming()
     */
    public void suppressThatsBadTiming() {
        disableThatsBadTiming();
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
        final MbMemberAddressCB cb;
        if (mainCB != null) {
            cb = (MbMemberAddressCB)mainCB;
        } else {
            cb = new MbMemberAddressCB();
        }
        specify().xsetSyncQyCall(new HpSpQyCall<MbMemberAddressCQ>() {
            public boolean has() { return true; }
            public MbMemberAddressCQ qy() { return cb.query(); }
        });
    }

    // ===================================================================================
    //                                                                            Internal
    //                                                                            ========
    // very internal (for suppressing warn about 'Not Use Import')
    protected String getConditionBeanClassNameInternally() { return MbMemberAddressCB.class.getName(); }
    protected String getConditionQueryClassNameInternally() { return MbMemberAddressCQ.class.getName(); }
    protected String getSubQueryClassNameInternally() { return SubQuery.class.getName(); }
    protected String getConditionOptionClassNameInternally() { return ConditionOption.class.getName(); }
}
