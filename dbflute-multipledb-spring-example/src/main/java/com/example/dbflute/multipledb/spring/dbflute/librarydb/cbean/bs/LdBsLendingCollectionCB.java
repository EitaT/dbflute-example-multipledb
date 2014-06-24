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
 * The base condition-bean of LENDING_COLLECTION.
 * @author DBFlute(AutoGenerator)
 */
public class LdBsLendingCollectionCB extends AbstractConditionBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected LdLendingCollectionCQ _conditionQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public LdBsLendingCollectionCB() {
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
        return "LENDING_COLLECTION";
    }

    // ===================================================================================
    //                                                                 PrimaryKey Handling
    //                                                                 ===================
    /**
     * Accept the query condition of primary key as equal.
     * @param libraryId : PK, IX+, NotNull, SMALLINT(5), FK to LENDING. (NotNull)
     * @param lbUserId : PK, NotNull, INTEGER(10), FK to LENDING. (NotNull)
     * @param lendingDate : PK, NotNull, TIMESTAMP(26, 6), FK to LENDING. (NotNull)
     * @param collectionId : PK, IX, NotNull, INTEGER(10), FK to COLLECTION. (NotNull)
     * @return this. (NotNull)
     */
    public LdLendingCollectionCB acceptPK(Integer libraryId, Integer lbUserId, java.sql.Timestamp lendingDate, Integer collectionId) {
        assertObjectNotNull("libraryId", libraryId);assertObjectNotNull("lbUserId", lbUserId);assertObjectNotNull("lendingDate", lendingDate);assertObjectNotNull("collectionId", collectionId);
        LdBsLendingCollectionCB cb = this;
        cb.query().setLibraryId_Equal(libraryId);cb.query().setLbUserId_Equal(lbUserId);cb.query().setLendingDate_Equal(lendingDate);cb.query().setCollectionId_Equal(collectionId);
        return (LdLendingCollectionCB)this;
    }

    /**
     * Accept the query condition of primary key as equal. (old style)
     * @param libraryId : PK, IX+, NotNull, SMALLINT(5), FK to LENDING. (NotNull)
     * @param lbUserId : PK, NotNull, INTEGER(10), FK to LENDING. (NotNull)
     * @param lendingDate : PK, NotNull, TIMESTAMP(26, 6), FK to LENDING. (NotNull)
     * @param collectionId : PK, IX, NotNull, INTEGER(10), FK to COLLECTION. (NotNull)
     */
    public void acceptPrimaryKey(Integer libraryId, Integer lbUserId, java.sql.Timestamp lendingDate, Integer collectionId) {
        assertObjectNotNull("libraryId", libraryId);assertObjectNotNull("lbUserId", lbUserId);assertObjectNotNull("lendingDate", lendingDate);assertObjectNotNull("collectionId", collectionId);
        LdBsLendingCollectionCB cb = this;
        cb.query().setLibraryId_Equal(libraryId);cb.query().setLbUserId_Equal(lbUserId);cb.query().setLendingDate_Equal(lendingDate);cb.query().setCollectionId_Equal(collectionId);
    }

    public ConditionBean addOrderBy_PK_Asc() {
        query().addOrderBy_LibraryId_Asc();
        query().addOrderBy_LbUserId_Asc();
        query().addOrderBy_LendingDate_Asc();
        query().addOrderBy_CollectionId_Asc();
        return this;
    }

    public ConditionBean addOrderBy_PK_Desc() {
        query().addOrderBy_LibraryId_Desc();
        query().addOrderBy_LbUserId_Desc();
        query().addOrderBy_LendingDate_Desc();
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
    public LdLendingCollectionCQ query() {
        assertQueryPurpose(); // assert only when user-public query 
        return getConditionQuery();
    }

    public LdLendingCollectionCQ getConditionQuery() { // public for parameter comment and internal
        if (_conditionQuery == null) {
            _conditionQuery = createLocalCQ();
        }
        return _conditionQuery;
    }

    protected LdLendingCollectionCQ createLocalCQ() {
        return xcreateCQ(null, getSqlClause(), getSqlClause().getBasePointAliasName(), 0);
    }

    protected LdLendingCollectionCQ xcreateCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        LdLendingCollectionCQ cq = xnewCQ(childQuery, sqlClause, aliasName, nestLevel);
        cq.xsetBaseCB(this);
        return cq;
    }

    protected LdLendingCollectionCQ xnewCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        return new LdLendingCollectionCQ(childQuery, sqlClause, aliasName, nestLevel);
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
     * cb.query().<span style="color: #DD4747">union</span>(new UnionQuery&lt;LdLendingCollectionCB&gt;() {
     *     public void query(LdLendingCollectionCB unionCB) {
     *         unionCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param unionQuery The query of 'union'. (NotNull)
     */
    public void union(UnionQuery<LdLendingCollectionCB> unionQuery) {
        final LdLendingCollectionCB cb = new LdLendingCollectionCB(); cb.xsetupForUnion(this); xsyncUQ(cb); 
        try { lock(); unionQuery.query(cb); } finally { unlock(); } xsaveUCB(cb);
        final LdLendingCollectionCQ cq = cb.query(); query().xsetUnionQuery(cq);
    }

    /**
     * Set up 'union all' for base-point table. <br />
     * You don't need to call SetupSelect in union-query,
     * because it inherits calls before. (Don't call SetupSelect after here)
     * <pre>
     * cb.query().<span style="color: #DD4747">unionAll</span>(new UnionQuery&lt;LdLendingCollectionCB&gt;() {
     *     public void query(LdLendingCollectionCB unionCB) {
     *         unionCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param unionQuery The query of 'union all'. (NotNull)
     */
    public void unionAll(UnionQuery<LdLendingCollectionCB> unionQuery) {
        final LdLendingCollectionCB cb = new LdLendingCollectionCB(); cb.xsetupForUnion(this); xsyncUQ(cb);
        try { lock(); unionQuery.query(cb); } finally { unlock(); } xsaveUCB(cb);
        final LdLendingCollectionCQ cq = cb.query(); query().xsetUnionAllQuery(cq);
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
     * LdLendingCollectionCB cb = new LdLendingCollectionCB();
     * cb.<span style="color: #DD4747">setupSelect_Collection()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     * cb.query().setFoo...(value);
     * LdLendingCollection lendingCollection = lendingCollectionBhv.selectEntityWithDeletedCheck(cb);
     * ... = lendingCollection.<span style="color: #DD4747">getCollection()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
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

    protected LdLendingNss _nssLending;
    public LdLendingNss getNssLending() {
        if (_nssLending == null) { _nssLending = new LdLendingNss(null); }
        return _nssLending;
    }
    /**
     * Set up relation columns to select clause. <br />
     * LENDING by my LIBRARY_ID, LB_USER_ID, LENDING_DATE, named 'lending'.
     * <pre>
     * LdLendingCollectionCB cb = new LdLendingCollectionCB();
     * cb.<span style="color: #DD4747">setupSelect_Lending()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     * cb.query().setFoo...(value);
     * LdLendingCollection lendingCollection = lendingCollectionBhv.selectEntityWithDeletedCheck(cb);
     * ... = lendingCollection.<span style="color: #DD4747">getLending()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public LdLendingNss setupSelect_Lending() {
        assertSetupSelectPurpose("lending");
        doSetupSelect(new SsCall() { public ConditionQuery qf() { return query().queryLending(); } });
        if (_nssLending == null || !_nssLending.hasConditionQuery())
        { _nssLending = new LdLendingNss(query().queryLending()); }
        return _nssLending;
    }

    protected LdLibraryUserNss _nssLibraryUser;
    public LdLibraryUserNss getNssLibraryUser() {
        if (_nssLibraryUser == null) { _nssLibraryUser = new LdLibraryUserNss(null); }
        return _nssLibraryUser;
    }
    /**
     * Set up relation columns to select clause. <br />
     * LIBRARY_USER by my LIBRARY_ID, LB_USER_ID, named 'libraryUser'.
     * <pre>
     * LdLendingCollectionCB cb = new LdLendingCollectionCB();
     * cb.<span style="color: #DD4747">setupSelect_LibraryUser()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     * cb.query().setFoo...(value);
     * LdLendingCollection lendingCollection = lendingCollectionBhv.selectEntityWithDeletedCheck(cb);
     * ... = lendingCollection.<span style="color: #DD4747">getLibraryUser()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public LdLibraryUserNss setupSelect_LibraryUser() {
        assertSetupSelectPurpose("libraryUser");
        doSetupSelect(new SsCall() { public ConditionQuery qf() { return query().queryLibraryUser(); } });
        if (_nssLibraryUser == null || !_nssLibraryUser.hasConditionQuery())
        { _nssLibraryUser = new LdLibraryUserNss(query().queryLibraryUser()); }
        return _nssLibraryUser;
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
            , new HpSpQyCall<LdLendingCollectionCQ>() {
                public boolean has() { return true; }
                public LdLendingCollectionCQ qy() { return getConditionQuery(); }
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

    public static class HpSpecification extends HpAbstractSpecification<LdLendingCollectionCQ> {
        protected LdCollectionCB.HpSpecification _collection;
        protected LdLendingCB.HpSpecification _lending;
        protected LdLibraryUserCB.HpSpecification _libraryUser;
        public HpSpecification(ConditionBean baseCB, HpSpQyCall<LdLendingCollectionCQ> qyCall
                             , HpCBPurpose purpose, DBMetaProvider dbmetaProvider)
        { super(baseCB, qyCall, purpose, dbmetaProvider); }
        /**
         * LIBRARY_ID: {PK, IX+, NotNull, SMALLINT(5), FK to LENDING}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnLibraryId() { return doColumn("LIBRARY_ID"); }
        /**
         * LB_USER_ID: {PK, NotNull, INTEGER(10), FK to LENDING}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnLbUserId() { return doColumn("LB_USER_ID"); }
        /**
         * LENDING_DATE: {PK, NotNull, TIMESTAMP(26, 6), FK to LENDING}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnLendingDate() { return doColumn("LENDING_DATE"); }
        /**
         * COLLECTION_ID: {PK, IX, NotNull, INTEGER(10), FK to COLLECTION}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnCollectionId() { return doColumn("COLLECTION_ID"); }
        /**
         * RETURN_LIMIT_DATE: {NotNull, TIMESTAMP(26, 6)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnReturnLimitDate() { return doColumn("RETURN_LIMIT_DATE"); }
        /**
         * R_USER: {NotNull, VARCHAR(100), default=[default-user]}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnRUser() { return doColumn("R_USER"); }
        /**
         * R_MODULE: {NotNull, VARCHAR(100), default=[default-module]}
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
         * U_MODULE: {NotNull, VARCHAR(100), default=[default-module]}
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
            columnLibraryId(); // PK
            columnLbUserId(); // PK
            columnLendingDate(); // PK
            columnCollectionId(); // PK
        }
        @Override
        protected String getTableDbName() { return "LENDING_COLLECTION"; }
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
         * LENDING by my LIBRARY_ID, LB_USER_ID, LENDING_DATE, named 'lending'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public LdLendingCB.HpSpecification specifyLending() {
            assertRelation("lending");
            if (_lending == null) {
                _lending = new LdLendingCB.HpSpecification(_baseCB, new HpSpQyCall<LdLendingCQ>() {
                    public boolean has() { return _qyCall.has() && _qyCall.qy().hasConditionQueryLending(); }
                    public LdLendingCQ qy() { return _qyCall.qy().queryLending(); } }
                    , _purpose, _dbmetaProvider);
                if (xhasSyncQyCall()) { // inherits it
                    _lending.xsetSyncQyCall(new HpSpQyCall<LdLendingCQ>() {
                        public boolean has() { return xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryLending(); }
                        public LdLendingCQ qy() { return xsyncQyCall().qy().queryLending(); }
                    });
                }
            }
            return _lending;
        }
        /**
         * Prepare to specify functions about relation table. <br />
         * LIBRARY_USER by my LIBRARY_ID, LB_USER_ID, named 'libraryUser'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public LdLibraryUserCB.HpSpecification specifyLibraryUser() {
            assertRelation("libraryUser");
            if (_libraryUser == null) {
                _libraryUser = new LdLibraryUserCB.HpSpecification(_baseCB, new HpSpQyCall<LdLibraryUserCQ>() {
                    public boolean has() { return _qyCall.has() && _qyCall.qy().hasConditionQueryLibraryUser(); }
                    public LdLibraryUserCQ qy() { return _qyCall.qy().queryLibraryUser(); } }
                    , _purpose, _dbmetaProvider);
                if (xhasSyncQyCall()) { // inherits it
                    _libraryUser.xsetSyncQyCall(new HpSpQyCall<LdLibraryUserCQ>() {
                        public boolean has() { return xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryLibraryUser(); }
                        public LdLibraryUserCQ qy() { return xsyncQyCall().qy().queryLibraryUser(); }
                    });
                }
            }
            return _libraryUser;
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
     * cb.<span style="color: #DD4747">columnQuery</span>(new SpecifyQuery&lt;LdLendingCollectionCB&gt;() {
     *     public void query(LdLendingCollectionCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFoo()</span>; <span style="color: #3F7E5E">// left column</span>
     *     }
     * }).lessThan(new SpecifyQuery&lt;LdLendingCollectionCB&gt;() {
     *     public void query(LdLendingCollectionCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnBar()</span>; <span style="color: #3F7E5E">// right column</span>
     *     }
     * }); <span style="color: #3F7E5E">// you can calculate for right column like '}).plus(3);'</span>
     * </pre>
     * @param leftSpecifyQuery The specify-query for left column. (NotNull)
     * @return The object for setting up operand and right column. (NotNull)
     */
    public HpColQyOperand<LdLendingCollectionCB> columnQuery(final SpecifyQuery<LdLendingCollectionCB> leftSpecifyQuery) {
        return new HpColQyOperand<LdLendingCollectionCB>(new HpColQyHandler<LdLendingCollectionCB>() {
            public HpCalculator handle(SpecifyQuery<LdLendingCollectionCB> rightSp, String operand) {
                return xcolqy(xcreateColumnQueryCB(), xcreateColumnQueryCB(), leftSpecifyQuery, rightSp, operand);
            }
        });
    }

    protected LdLendingCollectionCB xcreateColumnQueryCB() {
        LdLendingCollectionCB cb = new LdLendingCollectionCB();
        cb.xsetupForColumnQuery((LdLendingCollectionCB)this);
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
    public LdLendingCollectionCB dreamCruiseCB() {
        LdLendingCollectionCB cb = new LdLendingCollectionCB();
        cb.xsetupForDreamCruise((LdLendingCollectionCB) this);
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
     * cb.<span style="color: #DD4747">orScopeQuery</span>(new OrQuery&lt;LdLendingCollectionCB&gt;() {
     *     public void query(LdLendingCollectionCB orCB) {
     *         orCB.query().setFOO_Equal...
     *         orCB.query().setBAR_Equal...
     *     }
     * });
     * </pre>
     * @param orQuery The query for or-condition. (NotNull)
     */
    public void orScopeQuery(OrQuery<LdLendingCollectionCB> orQuery) {
        xorSQ((LdLendingCollectionCB)this, orQuery);
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
     * cb.<span style="color: #DD4747">orScopeQuery</span>(new OrQuery&lt;LdLendingCollectionCB&gt;() {
     *     public void query(LdLendingCollectionCB orCB) {
     *         orCB.query().setFOO_Equal...
     *         orCB.<span style="color: #DD4747">orScopeQueryAndPart</span>(new AndQuery&lt;LdLendingCollectionCB&gt;() {
     *             public void query(LdLendingCollectionCB andCB) {
     *                 andCB.query().setBar_...
     *                 andCB.query().setQux_...
     *             }
     *         });
     *     }
     * });
     * </pre>
     * @param andQuery The query for and-condition. (NotNull)
     */
    public void orScopeQueryAndPart(AndQuery<LdLendingCollectionCB> andQuery) {
        xorSQAP((LdLendingCollectionCB)this, andQuery);
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
        final LdLendingCollectionCB cb;
        if (mainCB != null) {
            cb = (LdLendingCollectionCB)mainCB;
        } else {
            cb = new LdLendingCollectionCB();
        }
        specify().xsetSyncQyCall(new HpSpQyCall<LdLendingCollectionCQ>() {
            public boolean has() { return true; }
            public LdLendingCollectionCQ qy() { return cb.query(); }
        });
    }

    // ===================================================================================
    //                                                                            Internal
    //                                                                            ========
    // very internal (for suppressing warn about 'Not Use Import')
    protected String getConditionBeanClassNameInternally() { return LdLendingCollectionCB.class.getName(); }
    protected String getConditionQueryClassNameInternally() { return LdLendingCollectionCQ.class.getName(); }
    protected String getSubQueryClassNameInternally() { return SubQuery.class.getName(); }
    protected String getConditionOptionClassNameInternally() { return ConditionOption.class.getName(); }
}
