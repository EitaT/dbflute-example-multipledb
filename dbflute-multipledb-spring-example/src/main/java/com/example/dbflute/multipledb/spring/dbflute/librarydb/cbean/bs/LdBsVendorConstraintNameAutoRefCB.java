/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */package com.example.dbflute.multipledb.spring.dbflute.librarydb.cbean.bs;

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
import com.example.dbflute.multipledb.spring.dbflute.librarydb.allcommon.LdDBFluteConfig;
import com.example.dbflute.multipledb.spring.dbflute.librarydb.allcommon.LdDBMetaInstanceHandler;
import com.example.dbflute.multipledb.spring.dbflute.librarydb.allcommon.LdImplementedInvokerAssistant;
import com.example.dbflute.multipledb.spring.dbflute.librarydb.allcommon.LdImplementedSqlClauseCreator;
import com.example.dbflute.multipledb.spring.dbflute.librarydb.cbean.*;
import com.example.dbflute.multipledb.spring.dbflute.librarydb.cbean.cq.*;
import com.example.dbflute.multipledb.spring.dbflute.librarydb.cbean.nss.*;

/**
 * The base condition-bean of VENDOR_CONSTRAINT_NAME_AUTO_REF.
 * @author DBFlute(AutoGenerator)
 */
public class LdBsVendorConstraintNameAutoRefCB extends AbstractConditionBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected LdVendorConstraintNameAutoRefCQ _conditionQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public LdBsVendorConstraintNameAutoRefCB() {
        if (LdDBFluteConfig.getInstance().isPagingCountLater()) {
            enablePagingCountLater();
        }
        if (LdDBFluteConfig.getInstance().isPagingCountLeastJoin()) {
            enablePagingCountLeastJoin();
        }
        if (LdDBFluteConfig.getInstance().isCheckCountBeforeQueryUpdate()) {
            enableCheckCountBeforeQueryUpdate();
        }
    }

    // ===================================================================================
    //                                                                           SqlClause
    //                                                                           =========
    @Override
    protected SqlClause createSqlClause() {
        SqlClauseCreator creator = LdDBFluteConfig.getInstance().getSqlClauseCreator();
        if (creator != null) {
            return creator.createSqlClause(this);
        }
        return new LdImplementedSqlClauseCreator().createSqlClause(this); // as default
    }

    // ===================================================================================
    //                                                                     DBMeta Provider
    //                                                                     ===============
    @Override
    protected DBMetaProvider getDBMetaProvider() {
        return LdDBMetaInstanceHandler.getProvider(); // as default
    }

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "VENDOR_CONSTRAINT_NAME_AUTO_REF";
    }

    // ===================================================================================
    //                                                                 PrimaryKey Handling
    //                                                                 ===================
    public void acceptPrimaryKey(java.math.BigDecimal constraintNameAutoRefId) {
        assertObjectNotNull("constraintNameAutoRefId", constraintNameAutoRefId);
        LdBsVendorConstraintNameAutoRefCB cb = this;
        cb.query().setConstraintNameAutoRefId_Equal(constraintNameAutoRefId);
    }

    public ConditionBean addOrderBy_PK_Asc() {
        query().addOrderBy_ConstraintNameAutoRefId_Asc();
        return this;
    }

    public ConditionBean addOrderBy_PK_Desc() {
        query().addOrderBy_ConstraintNameAutoRefId_Desc();
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
    public LdVendorConstraintNameAutoRefCQ query() {
        assertQueryPurpose(); // assert only when user-public query 
        return getConditionQuery();
    }

    public LdVendorConstraintNameAutoRefCQ getConditionQuery() { // public for parameter comment and internal
        if (_conditionQuery == null) {
            _conditionQuery = createLocalCQ();
        }
        return _conditionQuery;
    }

    protected LdVendorConstraintNameAutoRefCQ createLocalCQ() {
        return xcreateCQ(null, getSqlClause(), getSqlClause().getBasePointAliasName(), 0);
    }

    protected LdVendorConstraintNameAutoRefCQ xcreateCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        LdVendorConstraintNameAutoRefCQ cq = xnewCQ(childQuery, sqlClause, aliasName, nestLevel);
        cq.xsetBaseCB(this);
        return cq;
    }

    protected LdVendorConstraintNameAutoRefCQ xnewCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        return new LdVendorConstraintNameAutoRefCQ(childQuery, sqlClause, aliasName, nestLevel);
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
     * cb.query().<span style="color: #FD4747">union</span>(new UnionQuery&lt;LdVendorConstraintNameAutoRefCB&gt;() {
     *     public void query(LdVendorConstraintNameAutoRefCB unionCB) {
     *         unionCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param unionQuery The query of 'union'. (NotNull)
     */
    public void union(UnionQuery<LdVendorConstraintNameAutoRefCB> unionQuery) {
        final LdVendorConstraintNameAutoRefCB cb = new LdVendorConstraintNameAutoRefCB();
        cb.xsetupForUnion(this); xsyncUQ(cb); unionQuery.query(cb); xsaveUCB(cb);
        final LdVendorConstraintNameAutoRefCQ cq = cb.query(); query().xsetUnionQuery(cq);
    }

    /**
     * Set up 'union all' for base-point table. <br />
     * You don't need to call SetupSelect in union-query,
     * because it inherits calls before. (Don't call SetupSelect after here)
     * <pre>
     * cb.query().<span style="color: #FD4747">unionAll</span>(new UnionQuery&lt;LdVendorConstraintNameAutoRefCB&gt;() {
     *     public void query(LdVendorConstraintNameAutoRefCB unionCB) {
     *         unionCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param unionQuery The query of 'union all'. (NotNull)
     */
    public void unionAll(UnionQuery<LdVendorConstraintNameAutoRefCB> unionQuery) {
        final LdVendorConstraintNameAutoRefCB cb = new LdVendorConstraintNameAutoRefCB();
        cb.xsetupForUnion(this); xsyncUQ(cb); unionQuery.query(cb); xsaveUCB(cb);
        final LdVendorConstraintNameAutoRefCQ cq = cb.query(); query().xsetUnionAllQuery(cq);
    }

    // ===================================================================================
    //                                                                         SetupSelect
    //                                                                         ===========
    protected LdVendorConstraintNameAutoFooNss _nssVendorConstraintNameAutoFoo;
    public LdVendorConstraintNameAutoFooNss getNssVendorConstraintNameAutoFoo() {
        if (_nssVendorConstraintNameAutoFoo == null) { _nssVendorConstraintNameAutoFoo = new LdVendorConstraintNameAutoFooNss(null); }
        return _nssVendorConstraintNameAutoFoo;
    }
    /**
     * Set up relation columns to select clause. <br />
     * VENDOR_CONSTRAINT_NAME_AUTO_FOO by my CONSTRAINT_NAME_AUTO_FOO_ID, named 'vendorConstraintNameAutoFoo'.
     * <pre>
     * LdVendorConstraintNameAutoRefCB cb = new LdVendorConstraintNameAutoRefCB();
     * cb.<span style="color: #FD4747">setupSelect_VendorConstraintNameAutoFoo()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     * cb.query().setFoo...(value);
     * LdVendorConstraintNameAutoRef vendorConstraintNameAutoRef = vendorConstraintNameAutoRefBhv.selectEntityWithDeletedCheck(cb);
     * ... = vendorConstraintNameAutoRef.<span style="color: #FD4747">getVendorConstraintNameAutoFoo()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public LdVendorConstraintNameAutoFooNss setupSelect_VendorConstraintNameAutoFoo() {
        if (hasSpecifiedColumn()) { // if reverse call
            specify().columnConstraintNameAutoFooId();
        }
        doSetupSelect(new SsCall() { public ConditionQuery qf() { return query().queryVendorConstraintNameAutoFoo(); } });
        if (_nssVendorConstraintNameAutoFoo == null || !_nssVendorConstraintNameAutoFoo.hasConditionQuery())
        { _nssVendorConstraintNameAutoFoo = new LdVendorConstraintNameAutoFooNss(query().queryVendorConstraintNameAutoFoo()); }
        return _nssVendorConstraintNameAutoFoo;
    }
    protected LdVendorConstraintNameAutoBarNss _nssVendorConstraintNameAutoBar;
    public LdVendorConstraintNameAutoBarNss getNssVendorConstraintNameAutoBar() {
        if (_nssVendorConstraintNameAutoBar == null) { _nssVendorConstraintNameAutoBar = new LdVendorConstraintNameAutoBarNss(null); }
        return _nssVendorConstraintNameAutoBar;
    }
    /**
     * Set up relation columns to select clause. <br />
     * VENDOR_CONSTRAINT_NAME_AUTO_BAR by my CONSTRAINT_NAME_AUTO_BAR_ID, named 'vendorConstraintNameAutoBar'.
     * <pre>
     * LdVendorConstraintNameAutoRefCB cb = new LdVendorConstraintNameAutoRefCB();
     * cb.<span style="color: #FD4747">setupSelect_VendorConstraintNameAutoBar()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     * cb.query().setFoo...(value);
     * LdVendorConstraintNameAutoRef vendorConstraintNameAutoRef = vendorConstraintNameAutoRefBhv.selectEntityWithDeletedCheck(cb);
     * ... = vendorConstraintNameAutoRef.<span style="color: #FD4747">getVendorConstraintNameAutoBar()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public LdVendorConstraintNameAutoBarNss setupSelect_VendorConstraintNameAutoBar() {
        if (hasSpecifiedColumn()) { // if reverse call
            specify().columnConstraintNameAutoBarId();
        }
        doSetupSelect(new SsCall() { public ConditionQuery qf() { return query().queryVendorConstraintNameAutoBar(); } });
        if (_nssVendorConstraintNameAutoBar == null || !_nssVendorConstraintNameAutoBar.hasConditionQuery())
        { _nssVendorConstraintNameAutoBar = new LdVendorConstraintNameAutoBarNss(query().queryVendorConstraintNameAutoBar()); }
        return _nssVendorConstraintNameAutoBar;
    }
    protected LdVendorConstraintNameAutoQuxNss _nssVendorConstraintNameAutoQux;
    public LdVendorConstraintNameAutoQuxNss getNssVendorConstraintNameAutoQux() {
        if (_nssVendorConstraintNameAutoQux == null) { _nssVendorConstraintNameAutoQux = new LdVendorConstraintNameAutoQuxNss(null); }
        return _nssVendorConstraintNameAutoQux;
    }
    /**
     * Set up relation columns to select clause. <br />
     * VENDOR_CONSTRAINT_NAME_AUTO_QUX by my CONSTRAINT_NAME_AUTO_QUX_ID, named 'vendorConstraintNameAutoQux'.
     * <pre>
     * LdVendorConstraintNameAutoRefCB cb = new LdVendorConstraintNameAutoRefCB();
     * cb.<span style="color: #FD4747">setupSelect_VendorConstraintNameAutoQux()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     * cb.query().setFoo...(value);
     * LdVendorConstraintNameAutoRef vendorConstraintNameAutoRef = vendorConstraintNameAutoRefBhv.selectEntityWithDeletedCheck(cb);
     * ... = vendorConstraintNameAutoRef.<span style="color: #FD4747">getVendorConstraintNameAutoQux()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public LdVendorConstraintNameAutoQuxNss setupSelect_VendorConstraintNameAutoQux() {
        if (hasSpecifiedColumn()) { // if reverse call
            specify().columnConstraintNameAutoQuxId();
        }
        doSetupSelect(new SsCall() { public ConditionQuery qf() { return query().queryVendorConstraintNameAutoQux(); } });
        if (_nssVendorConstraintNameAutoQux == null || !_nssVendorConstraintNameAutoQux.hasConditionQuery())
        { _nssVendorConstraintNameAutoQux = new LdVendorConstraintNameAutoQuxNss(query().queryVendorConstraintNameAutoQux()); }
        return _nssVendorConstraintNameAutoQux;
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
            , new HpSpQyCall<LdVendorConstraintNameAutoRefCQ>() {
                public boolean has() { return true; }
                public LdVendorConstraintNameAutoRefCQ qy() { return getConditionQuery(); }
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

    public static class HpSpecification extends HpAbstractSpecification<LdVendorConstraintNameAutoRefCQ> {
        protected LdVendorConstraintNameAutoFooCB.HpSpecification _vendorConstraintNameAutoFoo;
        protected LdVendorConstraintNameAutoBarCB.HpSpecification _vendorConstraintNameAutoBar;
        protected LdVendorConstraintNameAutoQuxCB.HpSpecification _vendorConstraintNameAutoQux;
        public HpSpecification(ConditionBean baseCB, HpSpQyCall<LdVendorConstraintNameAutoRefCQ> qyCall
                             , HpCBPurpose purpose, DBMetaProvider dbmetaProvider)
        { super(baseCB, qyCall, purpose, dbmetaProvider); }
        /**
         * CONSTRAINT_NAME_AUTO_REF_ID: {PK, NotNull, NUMERIC(16)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnConstraintNameAutoRefId() { return doColumn("CONSTRAINT_NAME_AUTO_REF_ID"); }
        /**
         * CONSTRAINT_NAME_AUTO_FOO_ID: {IX, NotNull, NUMERIC(16), FK to VENDOR_CONSTRAINT_NAME_AUTO_FOO}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnConstraintNameAutoFooId() { return doColumn("CONSTRAINT_NAME_AUTO_FOO_ID"); }
        /**
         * CONSTRAINT_NAME_AUTO_BAR_ID: {IX, NotNull, NUMERIC(16), FK to VENDOR_CONSTRAINT_NAME_AUTO_BAR}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnConstraintNameAutoBarId() { return doColumn("CONSTRAINT_NAME_AUTO_BAR_ID"); }
        /**
         * CONSTRAINT_NAME_AUTO_QUX_ID: {IX, NotNull, NUMERIC(16), FK to VENDOR_CONSTRAINT_NAME_AUTO_QUX}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnConstraintNameAutoQuxId() { return doColumn("CONSTRAINT_NAME_AUTO_QUX_ID"); }
        /**
         * CONSTRAINT_NAME_AUTO_UNIQUE: {UQ, NotNull, VARCHAR(50)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnConstraintNameAutoUnique() { return doColumn("CONSTRAINT_NAME_AUTO_UNIQUE"); }
        public void everyColumn() { doEveryColumn(); }
        public void exceptRecordMetaColumn() { doExceptRecordMetaColumn(); }
        @Override
        protected void doSpecifyRequiredColumn() {
            columnConstraintNameAutoRefId(); // PK
            if (qyCall().qy().hasConditionQueryVendorConstraintNameAutoFoo()
                    || qyCall().qy().xgetReferrerQuery() instanceof LdVendorConstraintNameAutoFooCQ) {
                columnConstraintNameAutoFooId(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryVendorConstraintNameAutoBar()
                    || qyCall().qy().xgetReferrerQuery() instanceof LdVendorConstraintNameAutoBarCQ) {
                columnConstraintNameAutoBarId(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryVendorConstraintNameAutoQux()
                    || qyCall().qy().xgetReferrerQuery() instanceof LdVendorConstraintNameAutoQuxCQ) {
                columnConstraintNameAutoQuxId(); // FK or one-to-one referrer
            }
        }
        @Override
        protected String getTableDbName() { return "VENDOR_CONSTRAINT_NAME_AUTO_REF"; }
        /**
         * Prepare to specify functions about relation table. <br />
         * VENDOR_CONSTRAINT_NAME_AUTO_FOO by my CONSTRAINT_NAME_AUTO_FOO_ID, named 'vendorConstraintNameAutoFoo'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public LdVendorConstraintNameAutoFooCB.HpSpecification specifyVendorConstraintNameAutoFoo() {
            assertRelation("vendorConstraintNameAutoFoo");
            if (_vendorConstraintNameAutoFoo == null) {
                _vendorConstraintNameAutoFoo = new LdVendorConstraintNameAutoFooCB.HpSpecification(_baseCB, new HpSpQyCall<LdVendorConstraintNameAutoFooCQ>() {
                    public boolean has() { return _qyCall.has() && _qyCall.qy().hasConditionQueryVendorConstraintNameAutoFoo(); }
                    public LdVendorConstraintNameAutoFooCQ qy() { return _qyCall.qy().queryVendorConstraintNameAutoFoo(); } }
                    , _purpose, _dbmetaProvider);
                if (xhasSyncQyCall()) { // inherits it
                    _vendorConstraintNameAutoFoo.xsetSyncQyCall(new HpSpQyCall<LdVendorConstraintNameAutoFooCQ>() {
                        public boolean has() { return xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryVendorConstraintNameAutoFoo(); }
                        public LdVendorConstraintNameAutoFooCQ qy() { return xsyncQyCall().qy().queryVendorConstraintNameAutoFoo(); }
                    });
                }
            }
            return _vendorConstraintNameAutoFoo;
        }
        /**
         * Prepare to specify functions about relation table. <br />
         * VENDOR_CONSTRAINT_NAME_AUTO_BAR by my CONSTRAINT_NAME_AUTO_BAR_ID, named 'vendorConstraintNameAutoBar'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public LdVendorConstraintNameAutoBarCB.HpSpecification specifyVendorConstraintNameAutoBar() {
            assertRelation("vendorConstraintNameAutoBar");
            if (_vendorConstraintNameAutoBar == null) {
                _vendorConstraintNameAutoBar = new LdVendorConstraintNameAutoBarCB.HpSpecification(_baseCB, new HpSpQyCall<LdVendorConstraintNameAutoBarCQ>() {
                    public boolean has() { return _qyCall.has() && _qyCall.qy().hasConditionQueryVendorConstraintNameAutoBar(); }
                    public LdVendorConstraintNameAutoBarCQ qy() { return _qyCall.qy().queryVendorConstraintNameAutoBar(); } }
                    , _purpose, _dbmetaProvider);
                if (xhasSyncQyCall()) { // inherits it
                    _vendorConstraintNameAutoBar.xsetSyncQyCall(new HpSpQyCall<LdVendorConstraintNameAutoBarCQ>() {
                        public boolean has() { return xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryVendorConstraintNameAutoBar(); }
                        public LdVendorConstraintNameAutoBarCQ qy() { return xsyncQyCall().qy().queryVendorConstraintNameAutoBar(); }
                    });
                }
            }
            return _vendorConstraintNameAutoBar;
        }
        /**
         * Prepare to specify functions about relation table. <br />
         * VENDOR_CONSTRAINT_NAME_AUTO_QUX by my CONSTRAINT_NAME_AUTO_QUX_ID, named 'vendorConstraintNameAutoQux'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public LdVendorConstraintNameAutoQuxCB.HpSpecification specifyVendorConstraintNameAutoQux() {
            assertRelation("vendorConstraintNameAutoQux");
            if (_vendorConstraintNameAutoQux == null) {
                _vendorConstraintNameAutoQux = new LdVendorConstraintNameAutoQuxCB.HpSpecification(_baseCB, new HpSpQyCall<LdVendorConstraintNameAutoQuxCQ>() {
                    public boolean has() { return _qyCall.has() && _qyCall.qy().hasConditionQueryVendorConstraintNameAutoQux(); }
                    public LdVendorConstraintNameAutoQuxCQ qy() { return _qyCall.qy().queryVendorConstraintNameAutoQux(); } }
                    , _purpose, _dbmetaProvider);
                if (xhasSyncQyCall()) { // inherits it
                    _vendorConstraintNameAutoQux.xsetSyncQyCall(new HpSpQyCall<LdVendorConstraintNameAutoQuxCQ>() {
                        public boolean has() { return xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryVendorConstraintNameAutoQux(); }
                        public LdVendorConstraintNameAutoQuxCQ qy() { return xsyncQyCall().qy().queryVendorConstraintNameAutoQux(); }
                    });
                }
            }
            return _vendorConstraintNameAutoQux;
        }
        /**
         * Prepare for (Specify)MyselfDerived (SubQuery).
         * @return The object to set up a function for myself table. (NotNull)
         */
        public HpSDRFunction<LdVendorConstraintNameAutoRefCB, LdVendorConstraintNameAutoRefCQ> myselfDerived() {
            assertDerived("myselfDerived"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return new HpSDRFunction<LdVendorConstraintNameAutoRefCB, LdVendorConstraintNameAutoRefCQ>(_baseCB, _qyCall.qy(), new HpSDRSetupper<LdVendorConstraintNameAutoRefCB, LdVendorConstraintNameAutoRefCQ>() {
                public void setup(String fn, SubQuery<LdVendorConstraintNameAutoRefCB> sq, LdVendorConstraintNameAutoRefCQ cq, String al, DerivedReferrerOption op) {
                    cq.xsmyselfDerive(fn, sq, al, op); } }, _dbmetaProvider);
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
     * cb.<span style="color: #FD4747">columnQuery</span>(new SpecifyQuery&lt;LdVendorConstraintNameAutoRefCB&gt;() {
     *     public void query(LdVendorConstraintNameAutoRefCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFoo()</span>; <span style="color: #3F7E5E">// left column</span>
     *     }
     * }).lessThan(new SpecifyQuery&lt;LdVendorConstraintNameAutoRefCB&gt;() {
     *     public void query(LdVendorConstraintNameAutoRefCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnBar()</span>; <span style="color: #3F7E5E">// right column</span>
     *     }
     * }); <span style="color: #3F7E5E">// you can calculate for right column like '}).plus(3);'</span>
     * </pre>
     * @param leftSpecifyQuery The specify-query for left column. (NotNull)
     * @return The object for setting up operand and right column. (NotNull)
     */
    public HpColQyOperand<LdVendorConstraintNameAutoRefCB> columnQuery(final SpecifyQuery<LdVendorConstraintNameAutoRefCB> leftSpecifyQuery) {
        return new HpColQyOperand<LdVendorConstraintNameAutoRefCB>(new HpColQyHandler<LdVendorConstraintNameAutoRefCB>() {
            public HpCalculator handle(SpecifyQuery<LdVendorConstraintNameAutoRefCB> rightSp, String operand) {
                return xcolqy(xcreateColumnQueryCB(), xcreateColumnQueryCB(), leftSpecifyQuery, rightSp, operand);
            }
        });
    }

    protected LdVendorConstraintNameAutoRefCB xcreateColumnQueryCB() {
        LdVendorConstraintNameAutoRefCB cb = new LdVendorConstraintNameAutoRefCB();
        cb.xsetupForColumnQuery((LdVendorConstraintNameAutoRefCB)this);
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
    public LdVendorConstraintNameAutoRefCB dreamCruiseCB() {
        LdVendorConstraintNameAutoRefCB cb = new LdVendorConstraintNameAutoRefCB();
        cb.xsetupForDreamCruise((LdVendorConstraintNameAutoRefCB) this);
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
     * cb.<span style="color: #FD4747">orScopeQuery</span>(new OrQuery&lt;LdVendorConstraintNameAutoRefCB&gt;() {
     *     public void query(LdVendorConstraintNameAutoRefCB orCB) {
     *         orCB.query().setFOO_Equal...
     *         orCB.query().setBAR_Equal...
     *     }
     * });
     * </pre>
     * @param orQuery The query for or-condition. (NotNull)
     */
    public void orScopeQuery(OrQuery<LdVendorConstraintNameAutoRefCB> orQuery) {
        xorSQ((LdVendorConstraintNameAutoRefCB)this, orQuery);
    }

    /**
     * Set up the and-part of or-scope. <br />
     * (However nested or-scope query and as-or-split of like-search in and-part are unsupported)
     * <pre>
     * <span style="color: #3F7E5E">// where (FOO = '...' or (BAR = '...' and QUX = '...'))</span>
     * cb.<span style="color: #FD4747">orScopeQuery</span>(new OrQuery&lt;LdVendorConstraintNameAutoRefCB&gt;() {
     *     public void query(LdVendorConstraintNameAutoRefCB orCB) {
     *         orCB.query().setFOO_Equal...
     *         orCB.<span style="color: #FD4747">orScopeQueryAndPart</span>(new AndQuery&lt;LdVendorConstraintNameAutoRefCB&gt;() {
     *             public void query(LdVendorConstraintNameAutoRefCB andCB) {
     *                 andCB.query().setBar_...
     *                 andCB.query().setQux_...
     *             }
     *         });
     *     }
     * });
     * </pre>
     * @param andQuery The query for and-condition. (NotNull)
     */
    public void orScopeQueryAndPart(AndQuery<LdVendorConstraintNameAutoRefCB> andQuery) {
        xorSQAP((LdVendorConstraintNameAutoRefCB)this, andQuery);
    }

    // ===================================================================================
    //                                                                          DisplaySQL
    //                                                                          ==========
    @Override
    protected SqlAnalyzerFactory getSqlAnalyzerFactory()
    { return new LdImplementedInvokerAssistant().assistSqlAnalyzerFactory(); }
    @Override
    protected String getLogDateFormat() { return LdDBFluteConfig.getInstance().getLogDateFormat(); }
    @Override
    protected String getLogTimestampFormat() { return LdDBFluteConfig.getInstance().getLogTimestampFormat(); }

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
        final LdVendorConstraintNameAutoRefCB cb;
        if (mainCB != null) {
            cb = (LdVendorConstraintNameAutoRefCB)mainCB;
        } else {
            cb = new LdVendorConstraintNameAutoRefCB();
        }
        specify().xsetSyncQyCall(new HpSpQyCall<LdVendorConstraintNameAutoRefCQ>() {
            public boolean has() { return true; }
            public LdVendorConstraintNameAutoRefCQ qy() { return cb.query(); }
        });
    }

    // ===================================================================================
    //                                                                            Internal
    //                                                                            ========
    // very internal (for suppressing warn about 'Not Use Import')
    protected String getConditionBeanClassNameInternally() { return LdVendorConstraintNameAutoRefCB.class.getName(); }
    protected String getConditionQueryClassNameInternally() { return LdVendorConstraintNameAutoRefCQ.class.getName(); }
    protected String getSubQueryClassNameInternally() { return SubQuery.class.getName(); }
    protected String getConditionOptionClassNameInternally() { return ConditionOption.class.getName(); }
}
