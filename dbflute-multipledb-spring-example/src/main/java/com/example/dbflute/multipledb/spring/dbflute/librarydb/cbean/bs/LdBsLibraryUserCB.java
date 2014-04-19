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
 * The base condition-bean of LIBRARY_USER.
 * @author DBFlute(AutoGenerator)
 */
public class LdBsLibraryUserCB extends AbstractConditionBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected LdLibraryUserCQ _conditionQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public LdBsLibraryUserCB() {
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
        return "LIBRARY_USER";
    }

    // ===================================================================================
    //                                                                 PrimaryKey Handling
    //                                                                 ===================
    public void acceptPrimaryKey(Integer libraryId, Integer lbUserId) {
        assertObjectNotNull("libraryId", libraryId);assertObjectNotNull("lbUserId", lbUserId);
        LdBsLibraryUserCB cb = this;
        cb.query().setLibraryId_Equal(libraryId);cb.query().setLbUserId_Equal(lbUserId);
    }

    public ConditionBean addOrderBy_PK_Asc() {
        query().addOrderBy_LibraryId_Asc();
        query().addOrderBy_LbUserId_Asc();
        return this;
    }

    public ConditionBean addOrderBy_PK_Desc() {
        query().addOrderBy_LibraryId_Desc();
        query().addOrderBy_LbUserId_Desc();
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
    public LdLibraryUserCQ query() {
        assertQueryPurpose(); // assert only when user-public query 
        return getConditionQuery();
    }

    public LdLibraryUserCQ getConditionQuery() { // public for parameter comment and internal
        if (_conditionQuery == null) {
            _conditionQuery = createLocalCQ();
        }
        return _conditionQuery;
    }

    protected LdLibraryUserCQ createLocalCQ() {
        return xcreateCQ(null, getSqlClause(), getSqlClause().getBasePointAliasName(), 0);
    }

    protected LdLibraryUserCQ xcreateCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        LdLibraryUserCQ cq = xnewCQ(childQuery, sqlClause, aliasName, nestLevel);
        cq.xsetBaseCB(this);
        return cq;
    }

    protected LdLibraryUserCQ xnewCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        return new LdLibraryUserCQ(childQuery, sqlClause, aliasName, nestLevel);
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
     * cb.query().<span style="color: #FD4747">union</span>(new UnionQuery&lt;LdLibraryUserCB&gt;() {
     *     public void query(LdLibraryUserCB unionCB) {
     *         unionCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param unionQuery The query of 'union'. (NotNull)
     */
    public void union(UnionQuery<LdLibraryUserCB> unionQuery) {
        final LdLibraryUserCB cb = new LdLibraryUserCB();
        cb.xsetupForUnion(this); xsyncUQ(cb); unionQuery.query(cb); xsaveUCB(cb);
        final LdLibraryUserCQ cq = cb.query(); query().xsetUnionQuery(cq);
    }

    /**
     * Set up 'union all' for base-point table. <br />
     * You don't need to call SetupSelect in union-query,
     * because it inherits calls before. (Don't call SetupSelect after here)
     * <pre>
     * cb.query().<span style="color: #FD4747">unionAll</span>(new UnionQuery&lt;LdLibraryUserCB&gt;() {
     *     public void query(LdLibraryUserCB unionCB) {
     *         unionCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param unionQuery The query of 'union all'. (NotNull)
     */
    public void unionAll(UnionQuery<LdLibraryUserCB> unionQuery) {
        final LdLibraryUserCB cb = new LdLibraryUserCB();
        cb.xsetupForUnion(this); xsyncUQ(cb); unionQuery.query(cb); xsaveUCB(cb);
        final LdLibraryUserCQ cq = cb.query(); query().xsetUnionAllQuery(cq);
    }

    // ===================================================================================
    //                                                                         SetupSelect
    //                                                                         ===========
    protected LdLbUserNss _nssLbUser;
    public LdLbUserNss getNssLbUser() {
        if (_nssLbUser == null) { _nssLbUser = new LdLbUserNss(null); }
        return _nssLbUser;
    }
    /**
     * Set up relation columns to select clause. <br />
     * LB_USER by my LB_USER_ID, named 'lbUser'.
     * <pre>
     * LdLibraryUserCB cb = new LdLibraryUserCB();
     * cb.<span style="color: #FD4747">setupSelect_LbUser()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     * cb.query().setFoo...(value);
     * LdLibraryUser libraryUser = libraryUserBhv.selectEntityWithDeletedCheck(cb);
     * ... = libraryUser.<span style="color: #FD4747">getLbUser()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public LdLbUserNss setupSelect_LbUser() {
        doSetupSelect(new SsCall() { public ConditionQuery qf() { return query().queryLbUser(); } });
        if (_nssLbUser == null || !_nssLbUser.hasConditionQuery())
        { _nssLbUser = new LdLbUserNss(query().queryLbUser()); }
        return _nssLbUser;
    }
    protected LdLibraryNss _nssLibrary;
    public LdLibraryNss getNssLibrary() {
        if (_nssLibrary == null) { _nssLibrary = new LdLibraryNss(null); }
        return _nssLibrary;
    }
    /**
     * Set up relation columns to select clause. <br />
     * LIBRARY by my LIBRARY_ID, named 'library'.
     * <pre>
     * LdLibraryUserCB cb = new LdLibraryUserCB();
     * cb.<span style="color: #FD4747">setupSelect_Library()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     * cb.query().setFoo...(value);
     * LdLibraryUser libraryUser = libraryUserBhv.selectEntityWithDeletedCheck(cb);
     * ... = libraryUser.<span style="color: #FD4747">getLibrary()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public LdLibraryNss setupSelect_Library() {
        doSetupSelect(new SsCall() { public ConditionQuery qf() { return query().queryLibrary(); } });
        if (_nssLibrary == null || !_nssLibrary.hasConditionQuery())
        { _nssLibrary = new LdLibraryNss(query().queryLibrary()); }
        return _nssLibrary;
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
            , new HpSpQyCall<LdLibraryUserCQ>() {
                public boolean has() { return true; }
                public LdLibraryUserCQ qy() { return getConditionQuery(); }
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

    public static class HpSpecification extends HpAbstractSpecification<LdLibraryUserCQ> {
        protected LdLbUserCB.HpSpecification _lbUser;
        protected LdLibraryCB.HpSpecification _library;
        public HpSpecification(ConditionBean baseCB, HpSpQyCall<LdLibraryUserCQ> qyCall
                             , HpCBPurpose purpose, DBMetaProvider dbmetaProvider)
        { super(baseCB, qyCall, purpose, dbmetaProvider); }
        /**
         * LIBRARY_ID: {PK, UQ, IX, NotNull, SMALLINT(5), FK to LIBRARY}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnLibraryId() { return doColumn("LIBRARY_ID"); }
        /**
         * LB_USER_ID: {PK, UQ+, IX, NotNull, INTEGER(10), FK to LB_USER}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnLbUserId() { return doColumn("LB_USER_ID"); }
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
        }
        @Override
        protected String getTableDbName() { return "LIBRARY_USER"; }
        /**
         * Prepare to specify functions about relation table. <br />
         * LB_USER by my LB_USER_ID, named 'lbUser'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public LdLbUserCB.HpSpecification specifyLbUser() {
            assertRelation("lbUser");
            if (_lbUser == null) {
                _lbUser = new LdLbUserCB.HpSpecification(_baseCB, new HpSpQyCall<LdLbUserCQ>() {
                    public boolean has() { return _qyCall.has() && _qyCall.qy().hasConditionQueryLbUser(); }
                    public LdLbUserCQ qy() { return _qyCall.qy().queryLbUser(); } }
                    , _purpose, _dbmetaProvider);
                if (xhasSyncQyCall()) { // inherits it
                    _lbUser.xsetSyncQyCall(new HpSpQyCall<LdLbUserCQ>() {
                        public boolean has() { return xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryLbUser(); }
                        public LdLbUserCQ qy() { return xsyncQyCall().qy().queryLbUser(); }
                    });
                }
            }
            return _lbUser;
        }
        /**
         * Prepare to specify functions about relation table. <br />
         * LIBRARY by my LIBRARY_ID, named 'library'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public LdLibraryCB.HpSpecification specifyLibrary() {
            assertRelation("library");
            if (_library == null) {
                _library = new LdLibraryCB.HpSpecification(_baseCB, new HpSpQyCall<LdLibraryCQ>() {
                    public boolean has() { return _qyCall.has() && _qyCall.qy().hasConditionQueryLibrary(); }
                    public LdLibraryCQ qy() { return _qyCall.qy().queryLibrary(); } }
                    , _purpose, _dbmetaProvider);
                if (xhasSyncQyCall()) { // inherits it
                    _library.xsetSyncQyCall(new HpSpQyCall<LdLibraryCQ>() {
                        public boolean has() { return xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryLibrary(); }
                        public LdLibraryCQ qy() { return xsyncQyCall().qy().queryLibrary(); }
                    });
                }
            }
            return _library;
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br />
         * {select max(FOO) from LENDING where ...) as FOO_MAX} <br />
         * LENDING by LIBRARY_ID, LB_USER_ID, named 'lendingList'.
         * <pre>
         * cb.specify().<span style="color: #FD4747">derivedLendingList()</span>.<span style="color: #FD4747">max</span>(new SubQuery&lt;LdLendingCB&gt;() {
         *     public void query(LdLendingCB subCB) {
         *         subCB.specify().<span style="color: #FD4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *         subCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
         *     }
         * }, LdLending.<span style="color: #FD4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<LdLendingCB, LdLibraryUserCQ> derivedLendingList() {
            assertDerived("lendingList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return new HpSDRFunction<LdLendingCB, LdLibraryUserCQ>(_baseCB, _qyCall.qy(), new HpSDRSetupper<LdLendingCB, LdLibraryUserCQ>() {
                public void setup(String fn, SubQuery<LdLendingCB> sq, LdLibraryUserCQ cq, String al, DerivedReferrerOption op) {
                    cq.xsderiveLendingList(fn, sq, al, op); } }, _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br />
         * {select max(FOO) from LENDING_COLLECTION where ...) as FOO_MAX} <br />
         * LENDING_COLLECTION by LIBRARY_ID, LB_USER_ID, named 'lendingCollectionList'.
         * <pre>
         * cb.specify().<span style="color: #FD4747">derivedLendingCollectionList()</span>.<span style="color: #FD4747">max</span>(new SubQuery&lt;LdLendingCollectionCB&gt;() {
         *     public void query(LdLendingCollectionCB subCB) {
         *         subCB.specify().<span style="color: #FD4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *         subCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
         *     }
         * }, LdLendingCollection.<span style="color: #FD4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<LdLendingCollectionCB, LdLibraryUserCQ> derivedLendingCollectionList() {
            assertDerived("lendingCollectionList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return new HpSDRFunction<LdLendingCollectionCB, LdLibraryUserCQ>(_baseCB, _qyCall.qy(), new HpSDRSetupper<LdLendingCollectionCB, LdLibraryUserCQ>() {
                public void setup(String fn, SubQuery<LdLendingCollectionCB> sq, LdLibraryUserCQ cq, String al, DerivedReferrerOption op) {
                    cq.xsderiveLendingCollectionList(fn, sq, al, op); } }, _dbmetaProvider);
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
     * cb.<span style="color: #FD4747">columnQuery</span>(new SpecifyQuery&lt;LdLibraryUserCB&gt;() {
     *     public void query(LdLibraryUserCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFoo()</span>; <span style="color: #3F7E5E">// left column</span>
     *     }
     * }).lessThan(new SpecifyQuery&lt;LdLibraryUserCB&gt;() {
     *     public void query(LdLibraryUserCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnBar()</span>; <span style="color: #3F7E5E">// right column</span>
     *     }
     * }); <span style="color: #3F7E5E">// you can calculate for right column like '}).plus(3);'</span>
     * </pre>
     * @param leftSpecifyQuery The specify-query for left column. (NotNull)
     * @return The object for setting up operand and right column. (NotNull)
     */
    public HpColQyOperand<LdLibraryUserCB> columnQuery(final SpecifyQuery<LdLibraryUserCB> leftSpecifyQuery) {
        return new HpColQyOperand<LdLibraryUserCB>(new HpColQyHandler<LdLibraryUserCB>() {
            public HpCalculator handle(SpecifyQuery<LdLibraryUserCB> rightSp, String operand) {
                return xcolqy(xcreateColumnQueryCB(), xcreateColumnQueryCB(), leftSpecifyQuery, rightSp, operand);
            }
        });
    }

    protected LdLibraryUserCB xcreateColumnQueryCB() {
        LdLibraryUserCB cb = new LdLibraryUserCB();
        cb.xsetupForColumnQuery((LdLibraryUserCB)this);
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
    public LdLibraryUserCB dreamCruiseCB() {
        LdLibraryUserCB cb = new LdLibraryUserCB();
        cb.xsetupForDreamCruise((LdLibraryUserCB) this);
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
     * cb.<span style="color: #FD4747">orScopeQuery</span>(new OrQuery&lt;LdLibraryUserCB&gt;() {
     *     public void query(LdLibraryUserCB orCB) {
     *         orCB.query().setFOO_Equal...
     *         orCB.query().setBAR_Equal...
     *     }
     * });
     * </pre>
     * @param orQuery The query for or-condition. (NotNull)
     */
    public void orScopeQuery(OrQuery<LdLibraryUserCB> orQuery) {
        xorSQ((LdLibraryUserCB)this, orQuery);
    }

    /**
     * Set up the and-part of or-scope. <br />
     * (However nested or-scope query and as-or-split of like-search in and-part are unsupported)
     * <pre>
     * <span style="color: #3F7E5E">// where (FOO = '...' or (BAR = '...' and QUX = '...'))</span>
     * cb.<span style="color: #FD4747">orScopeQuery</span>(new OrQuery&lt;LdLibraryUserCB&gt;() {
     *     public void query(LdLibraryUserCB orCB) {
     *         orCB.query().setFOO_Equal...
     *         orCB.<span style="color: #FD4747">orScopeQueryAndPart</span>(new AndQuery&lt;LdLibraryUserCB&gt;() {
     *             public void query(LdLibraryUserCB andCB) {
     *                 andCB.query().setBar_...
     *                 andCB.query().setQux_...
     *             }
     *         });
     *     }
     * });
     * </pre>
     * @param andQuery The query for and-condition. (NotNull)
     */
    public void orScopeQueryAndPart(AndQuery<LdLibraryUserCB> andQuery) {
        xorSQAP((LdLibraryUserCB)this, andQuery);
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
        final LdLibraryUserCB cb;
        if (mainCB != null) {
            cb = (LdLibraryUserCB)mainCB;
        } else {
            cb = new LdLibraryUserCB();
        }
        specify().xsetSyncQyCall(new HpSpQyCall<LdLibraryUserCQ>() {
            public boolean has() { return true; }
            public LdLibraryUserCQ qy() { return cb.query(); }
        });
    }

    // ===================================================================================
    //                                                                            Internal
    //                                                                            ========
    // very internal (for suppressing warn about 'Not Use Import')
    protected String getConditionBeanClassNameInternally() { return LdLibraryUserCB.class.getName(); }
    protected String getConditionQueryClassNameInternally() { return LdLibraryUserCQ.class.getName(); }
    protected String getSubQueryClassNameInternally() { return SubQuery.class.getName(); }
    protected String getConditionOptionClassNameInternally() { return ConditionOption.class.getName(); }
}
