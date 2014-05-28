/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */package com.example.dbflute.multipledb.seasar.dbflute.librarydb.cbean.bs;

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
import com.example.dbflute.multipledb.seasar.dbflute.librarydb.allcommon.LdDBFluteConfig;
import com.example.dbflute.multipledb.seasar.dbflute.librarydb.allcommon.LdDBMetaInstanceHandler;
import com.example.dbflute.multipledb.seasar.dbflute.librarydb.allcommon.LdImplementedInvokerAssistant;
import com.example.dbflute.multipledb.seasar.dbflute.librarydb.allcommon.LdImplementedSqlClauseCreator;
import com.example.dbflute.multipledb.seasar.dbflute.librarydb.cbean.*;
import com.example.dbflute.multipledb.seasar.dbflute.librarydb.cbean.cq.*;
import com.example.dbflute.multipledb.seasar.dbflute.librarydb.cbean.nss.*;

/**
 * The base condition-bean of COLLECTION_STATUS.
 * @author DBFlute(AutoGenerator)
 */
public class LdBsCollectionStatusCB extends AbstractConditionBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected LdCollectionStatusCQ _conditionQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public LdBsCollectionStatusCB() {
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
        return "COLLECTION_STATUS";
    }

    // ===================================================================================
    //                                                                 PrimaryKey Handling
    //                                                                 ===================
    /**
     * Accept the query condition of primary key as equal.
     * @param collectionId : PK, IX, NotNull, INTEGER(10), FK to COLLECTION. (NotNull)
     */
    public void acceptPrimaryKey(Integer collectionId) {
        assertObjectNotNull("collectionId", collectionId);
        LdBsCollectionStatusCB cb = this;
        cb.query().setCollectionId_Equal(collectionId);;
    }

    public ConditionBean addOrderBy_PK_Asc() {
        query().addOrderBy_CollectionId_Asc();
        return this;
    }

    public ConditionBean addOrderBy_PK_Desc() {
        query().addOrderBy_CollectionId_Desc();
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
    public LdCollectionStatusCQ query() {
        assertQueryPurpose(); // assert only when user-public query 
        return getConditionQuery();
    }

    public LdCollectionStatusCQ getConditionQuery() { // public for parameter comment and internal
        if (_conditionQuery == null) {
            _conditionQuery = createLocalCQ();
        }
        return _conditionQuery;
    }

    protected LdCollectionStatusCQ createLocalCQ() {
        return xcreateCQ(null, getSqlClause(), getSqlClause().getBasePointAliasName(), 0);
    }

    protected LdCollectionStatusCQ xcreateCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        LdCollectionStatusCQ cq = xnewCQ(childQuery, sqlClause, aliasName, nestLevel);
        cq.xsetBaseCB(this);
        return cq;
    }

    protected LdCollectionStatusCQ xnewCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        return new LdCollectionStatusCQ(childQuery, sqlClause, aliasName, nestLevel);
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
     * cb.query().<span style="color: #DD4747">union</span>(new UnionQuery&lt;LdCollectionStatusCB&gt;() {
     *     public void query(LdCollectionStatusCB unionCB) {
     *         unionCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param unionQuery The query of 'union'. (NotNull)
     */
    public void union(UnionQuery<LdCollectionStatusCB> unionQuery) {
        final LdCollectionStatusCB cb = new LdCollectionStatusCB(); cb.xsetupForUnion(this); xsyncUQ(cb); 
        try { lock(); unionQuery.query(cb); } finally { unlock(); } xsaveUCB(cb);
        final LdCollectionStatusCQ cq = cb.query(); query().xsetUnionQuery(cq);
    }

    /**
     * Set up 'union all' for base-point table. <br />
     * You don't need to call SetupSelect in union-query,
     * because it inherits calls before. (Don't call SetupSelect after here)
     * <pre>
     * cb.query().<span style="color: #DD4747">unionAll</span>(new UnionQuery&lt;LdCollectionStatusCB&gt;() {
     *     public void query(LdCollectionStatusCB unionCB) {
     *         unionCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param unionQuery The query of 'union all'. (NotNull)
     */
    public void unionAll(UnionQuery<LdCollectionStatusCB> unionQuery) {
        final LdCollectionStatusCB cb = new LdCollectionStatusCB(); cb.xsetupForUnion(this); xsyncUQ(cb);
        try { lock(); unionQuery.query(cb); } finally { unlock(); } xsaveUCB(cb);
        final LdCollectionStatusCQ cq = cb.query(); query().xsetUnionAllQuery(cq);
    }

    // ===================================================================================
    //                                                                         SetupSelect
    //                                                                         ===========
    protected LdCollectionNss _nssCollection;
    public LdCollectionNss getNssCollection() {
        if (_nssCollection == null) { _nssCollection = new LdCollectionNss(null); }
        return _nssCollection;
    }
    /**
     * Set up relation columns to select clause. <br />
     * COLLECTION by my COLLECTION_ID, named 'collection'.
     * <pre>
     * LdCollectionStatusCB cb = new LdCollectionStatusCB();
     * cb.<span style="color: #DD4747">setupSelect_Collection()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     * cb.query().setFoo...(value);
     * LdCollectionStatus collectionStatus = collectionStatusBhv.selectEntityWithDeletedCheck(cb);
     * ... = collectionStatus.<span style="color: #DD4747">getCollection()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public LdCollectionNss setupSelect_Collection() {
        assertSetupSelectPurpose("collection");
        doSetupSelect(new SsCall() { public ConditionQuery qf() { return query().queryCollection(); } });
        if (_nssCollection == null || !_nssCollection.hasConditionQuery())
        { _nssCollection = new LdCollectionNss(query().queryCollection()); }
        return _nssCollection;
    }
    protected LdCollectionStatusLookupNss _nssCollectionStatusLookup;
    public LdCollectionStatusLookupNss getNssCollectionStatusLookup() {
        if (_nssCollectionStatusLookup == null) { _nssCollectionStatusLookup = new LdCollectionStatusLookupNss(null); }
        return _nssCollectionStatusLookup;
    }
    /**
     * Set up relation columns to select clause. <br />
     * COLLECTION_STATUS_LOOKUP by my COLLECTION_STATUS_CODE, named 'collectionStatusLookup'.
     * <pre>
     * LdCollectionStatusCB cb = new LdCollectionStatusCB();
     * cb.<span style="color: #DD4747">setupSelect_CollectionStatusLookup()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     * cb.query().setFoo...(value);
     * LdCollectionStatus collectionStatus = collectionStatusBhv.selectEntityWithDeletedCheck(cb);
     * ... = collectionStatus.<span style="color: #DD4747">getCollectionStatusLookup()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public LdCollectionStatusLookupNss setupSelect_CollectionStatusLookup() {
        assertSetupSelectPurpose("collectionStatusLookup");
        if (hasSpecifiedColumn()) { // if reverse call
            specify().columnCollectionStatusCode();
        }
        doSetupSelect(new SsCall() { public ConditionQuery qf() { return query().queryCollectionStatusLookup(); } });
        if (_nssCollectionStatusLookup == null || !_nssCollectionStatusLookup.hasConditionQuery())
        { _nssCollectionStatusLookup = new LdCollectionStatusLookupNss(query().queryCollectionStatusLookup()); }
        return _nssCollectionStatusLookup;
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
            , new HpSpQyCall<LdCollectionStatusCQ>() {
                public boolean has() { return true; }
                public LdCollectionStatusCQ qy() { return getConditionQuery(); }
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

    public static class HpSpecification extends HpAbstractSpecification<LdCollectionStatusCQ> {
        protected LdCollectionCB.HpSpecification _collection;
        protected LdCollectionStatusLookupCB.HpSpecification _collectionStatusLookup;
        public HpSpecification(ConditionBean baseCB, HpSpQyCall<LdCollectionStatusCQ> qyCall
                             , HpCBPurpose purpose, DBMetaProvider dbmetaProvider)
        { super(baseCB, qyCall, purpose, dbmetaProvider); }
        /**
         * COLLECTION_ID: {PK, IX, NotNull, INTEGER(10), FK to COLLECTION}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnCollectionId() { return doColumn("COLLECTION_ID"); }
        /**
         * COLLECTION_STATUS_CODE: {IX, NotNull, CHAR(3), FK to COLLECTION_STATUS_LOOKUP, classification=CollectionStatus}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnCollectionStatusCode() { return doColumn("COLLECTION_STATUS_CODE"); }
        /**
         * R_USER: {NotNull, VARCHAR(100), default=[default-user]}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnRUser() { return doColumn("R_USER"); }
        /**
         * R_MODULE: {NotNull, VARCHAR(100), default=[default-module], classification=RegisterModuleType}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnRModule() { return doColumn("R_MODULE"); }
        /**
         * R_TIMESTAMP: {NotNull, TIMESTAMP(26, 6), default=[CURRENT_TIMESTAMP]}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnRTimestamp() { return doColumn("R_TIMESTAMP"); }
        /**
         * U_USER: {NotNull, VARCHAR(100), default=[default-user]}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnUUser() { return doColumn("U_USER"); }
        /**
         * U_MODULE: {NotNull, VARCHAR(100), default=[default-module], classification=UpdateModuleType}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnUModule() { return doColumn("U_MODULE"); }
        /**
         * U_TIMESTAMP: {NotNull, TIMESTAMP(26, 6), default=[CURRENT_TIMESTAMP]}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnUTimestamp() { return doColumn("U_TIMESTAMP"); }
        public void everyColumn() { doEveryColumn(); }
        public void exceptRecordMetaColumn() { doExceptRecordMetaColumn(); }
        @Override
        protected void doSpecifyRequiredColumn() {
            columnCollectionId(); // PK
            if (qyCall().qy().hasConditionQueryCollectionStatusLookup()
                    || qyCall().qy().xgetReferrerQuery() instanceof LdCollectionStatusLookupCQ) {
                columnCollectionStatusCode(); // FK or one-to-one referrer
            }
        }
        @Override
        protected String getTableDbName() { return "COLLECTION_STATUS"; }
        /**
         * Prepare to specify functions about relation table. <br />
         * COLLECTION by my COLLECTION_ID, named 'collection'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public LdCollectionCB.HpSpecification specifyCollection() {
            assertRelation("collection");
            if (_collection == null) {
                _collection = new LdCollectionCB.HpSpecification(_baseCB, new HpSpQyCall<LdCollectionCQ>() {
                    public boolean has() { return _qyCall.has() && _qyCall.qy().hasConditionQueryCollection(); }
                    public LdCollectionCQ qy() { return _qyCall.qy().queryCollection(); } }
                    , _purpose, _dbmetaProvider);
                if (xhasSyncQyCall()) { // inherits it
                    _collection.xsetSyncQyCall(new HpSpQyCall<LdCollectionCQ>() {
                        public boolean has() { return xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryCollection(); }
                        public LdCollectionCQ qy() { return xsyncQyCall().qy().queryCollection(); }
                    });
                }
            }
            return _collection;
        }
        /**
         * Prepare to specify functions about relation table. <br />
         * COLLECTION_STATUS_LOOKUP by my COLLECTION_STATUS_CODE, named 'collectionStatusLookup'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public LdCollectionStatusLookupCB.HpSpecification specifyCollectionStatusLookup() {
            assertRelation("collectionStatusLookup");
            if (_collectionStatusLookup == null) {
                _collectionStatusLookup = new LdCollectionStatusLookupCB.HpSpecification(_baseCB, new HpSpQyCall<LdCollectionStatusLookupCQ>() {
                    public boolean has() { return _qyCall.has() && _qyCall.qy().hasConditionQueryCollectionStatusLookup(); }
                    public LdCollectionStatusLookupCQ qy() { return _qyCall.qy().queryCollectionStatusLookup(); } }
                    , _purpose, _dbmetaProvider);
                if (xhasSyncQyCall()) { // inherits it
                    _collectionStatusLookup.xsetSyncQyCall(new HpSpQyCall<LdCollectionStatusLookupCQ>() {
                        public boolean has() { return xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryCollectionStatusLookup(); }
                        public LdCollectionStatusLookupCQ qy() { return xsyncQyCall().qy().queryCollectionStatusLookup(); }
                    });
                }
            }
            return _collectionStatusLookup;
        }
        /**
         * Prepare for (Specify)MyselfDerived (SubQuery).
         * @return The object to set up a function for myself table. (NotNull)
         */
        public HpSDRFunction<LdCollectionStatusCB, LdCollectionStatusCQ> myselfDerived() {
            assertDerived("myselfDerived"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return new HpSDRFunction<LdCollectionStatusCB, LdCollectionStatusCQ>(_baseCB, _qyCall.qy(), new HpSDRSetupper<LdCollectionStatusCB, LdCollectionStatusCQ>() {
                public void setup(String fn, SubQuery<LdCollectionStatusCB> sq, LdCollectionStatusCQ cq, String al, DerivedReferrerOption op) {
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
     * cb.<span style="color: #DD4747">columnQuery</span>(new SpecifyQuery&lt;LdCollectionStatusCB&gt;() {
     *     public void query(LdCollectionStatusCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFoo()</span>; <span style="color: #3F7E5E">// left column</span>
     *     }
     * }).lessThan(new SpecifyQuery&lt;LdCollectionStatusCB&gt;() {
     *     public void query(LdCollectionStatusCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnBar()</span>; <span style="color: #3F7E5E">// right column</span>
     *     }
     * }); <span style="color: #3F7E5E">// you can calculate for right column like '}).plus(3);'</span>
     * </pre>
     * @param leftSpecifyQuery The specify-query for left column. (NotNull)
     * @return The object for setting up operand and right column. (NotNull)
     */
    public HpColQyOperand<LdCollectionStatusCB> columnQuery(final SpecifyQuery<LdCollectionStatusCB> leftSpecifyQuery) {
        return new HpColQyOperand<LdCollectionStatusCB>(new HpColQyHandler<LdCollectionStatusCB>() {
            public HpCalculator handle(SpecifyQuery<LdCollectionStatusCB> rightSp, String operand) {
                return xcolqy(xcreateColumnQueryCB(), xcreateColumnQueryCB(), leftSpecifyQuery, rightSp, operand);
            }
        });
    }

    protected LdCollectionStatusCB xcreateColumnQueryCB() {
        LdCollectionStatusCB cb = new LdCollectionStatusCB();
        cb.xsetupForColumnQuery((LdCollectionStatusCB)this);
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
    public LdCollectionStatusCB dreamCruiseCB() {
        LdCollectionStatusCB cb = new LdCollectionStatusCB();
        cb.xsetupForDreamCruise((LdCollectionStatusCB) this);
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
     * cb.<span style="color: #DD4747">orScopeQuery</span>(new OrQuery&lt;LdCollectionStatusCB&gt;() {
     *     public void query(LdCollectionStatusCB orCB) {
     *         orCB.query().setFOO_Equal...
     *         orCB.query().setBAR_Equal...
     *     }
     * });
     * </pre>
     * @param orQuery The query for or-condition. (NotNull)
     */
    public void orScopeQuery(OrQuery<LdCollectionStatusCB> orQuery) {
        xorSQ((LdCollectionStatusCB)this, orQuery);
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
     * cb.<span style="color: #DD4747">orScopeQuery</span>(new OrQuery&lt;LdCollectionStatusCB&gt;() {
     *     public void query(LdCollectionStatusCB orCB) {
     *         orCB.query().setFOO_Equal...
     *         orCB.<span style="color: #DD4747">orScopeQueryAndPart</span>(new AndQuery&lt;LdCollectionStatusCB&gt;() {
     *             public void query(LdCollectionStatusCB andCB) {
     *                 andCB.query().setBar_...
     *                 andCB.query().setQux_...
     *             }
     *         });
     *     }
     * });
     * </pre>
     * @param andQuery The query for and-condition. (NotNull)
     */
    public void orScopeQueryAndPart(AndQuery<LdCollectionStatusCB> andQuery) {
        xorSQAP((LdCollectionStatusCB)this, andQuery);
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
        final LdCollectionStatusCB cb;
        if (mainCB != null) {
            cb = (LdCollectionStatusCB)mainCB;
        } else {
            cb = new LdCollectionStatusCB();
        }
        specify().xsetSyncQyCall(new HpSpQyCall<LdCollectionStatusCQ>() {
            public boolean has() { return true; }
            public LdCollectionStatusCQ qy() { return cb.query(); }
        });
    }

    // ===================================================================================
    //                                                                            Internal
    //                                                                            ========
    // very internal (for suppressing warn about 'Not Use Import')
    protected String getConditionBeanClassNameInternally() { return LdCollectionStatusCB.class.getName(); }
    protected String getConditionQueryClassNameInternally() { return LdCollectionStatusCQ.class.getName(); }
    protected String getSubQueryClassNameInternally() { return SubQuery.class.getName(); }
    protected String getConditionOptionClassNameInternally() { return ConditionOption.class.getName(); }
}
