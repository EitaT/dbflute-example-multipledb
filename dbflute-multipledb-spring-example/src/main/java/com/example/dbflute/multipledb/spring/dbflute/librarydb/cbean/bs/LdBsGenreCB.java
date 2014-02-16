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
 * The base condition-bean of GENRE.
 * @author DBFlute(AutoGenerator)
 */
public class LdBsGenreCB extends AbstractConditionBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected LdGenreCQ _conditionQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public LdBsGenreCB() {
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
        return "GENRE";
    }

    // ===================================================================================
    //                                                                 PrimaryKey Handling
    //                                                                 ===================
    public void acceptPrimaryKey(String genreCode) {
        assertObjectNotNull("genreCode", genreCode);
        LdBsGenreCB cb = this;
        cb.query().setGenreCode_Equal(genreCode);
    }

    public ConditionBean addOrderBy_PK_Asc() {
        query().addOrderBy_GenreCode_Asc();
        return this;
    }

    public ConditionBean addOrderBy_PK_Desc() {
        query().addOrderBy_GenreCode_Desc();
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
    public LdGenreCQ query() {
        assertQueryPurpose(); // assert only when user-public query 
        return getConditionQuery();
    }

    public LdGenreCQ getConditionQuery() { // public for parameter comment and internal
        if (_conditionQuery == null) {
            _conditionQuery = createLocalCQ();
        }
        return _conditionQuery;
    }

    protected LdGenreCQ createLocalCQ() {
        return xcreateCQ(null, getSqlClause(), getSqlClause().getBasePointAliasName(), 0);
    }

    protected LdGenreCQ xcreateCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        LdGenreCQ cq = xnewCQ(childQuery, sqlClause, aliasName, nestLevel);
        cq.xsetBaseCB(this);
        return cq;
    }

    protected LdGenreCQ xnewCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        return new LdGenreCQ(childQuery, sqlClause, aliasName, nestLevel);
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
     * cb.query().<span style="color: #FD4747">union</span>(new UnionQuery&lt;LdGenreCB&gt;() {
     *     public void query(LdGenreCB unionCB) {
     *         unionCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param unionQuery The query of 'union'. (NotNull)
     */
    public void union(UnionQuery<LdGenreCB> unionQuery) {
        final LdGenreCB cb = new LdGenreCB();
        cb.xsetupForUnion(this); xsyncUQ(cb); unionQuery.query(cb); xsaveUCB(cb);
        final LdGenreCQ cq = cb.query(); query().xsetUnionQuery(cq);
    }

    /**
     * Set up 'union all' for base-point table. <br />
     * You don't need to call SetupSelect in union-query,
     * because it inherits calls before. (Don't call SetupSelect after here)
     * <pre>
     * cb.query().<span style="color: #FD4747">unionAll</span>(new UnionQuery&lt;LdGenreCB&gt;() {
     *     public void query(LdGenreCB unionCB) {
     *         unionCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param unionQuery The query of 'union all'. (NotNull)
     */
    public void unionAll(UnionQuery<LdGenreCB> unionQuery) {
        final LdGenreCB cb = new LdGenreCB();
        cb.xsetupForUnion(this); xsyncUQ(cb); unionQuery.query(cb); xsaveUCB(cb);
        final LdGenreCQ cq = cb.query(); query().xsetUnionAllQuery(cq);
    }

    // ===================================================================================
    //                                                                         SetupSelect
    //                                                                         ===========
    protected LdGenreNss _nssGenreSelf;
    public LdGenreNss getNssGenreSelf() {
        if (_nssGenreSelf == null) { _nssGenreSelf = new LdGenreNss(null); }
        return _nssGenreSelf;
    }
    /**
     * Set up relation columns to select clause. <br />
     * GENRE by my PARENT_GENRE_CODE, named 'genreSelf'.
     * <pre>
     * LdGenreCB cb = new LdGenreCB();
     * cb.<span style="color: #FD4747">setupSelect_GenreSelf()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     * cb.query().setFoo...(value);
     * LdGenre genre = genreBhv.selectEntityWithDeletedCheck(cb);
     * ... = genre.<span style="color: #FD4747">getGenreSelf()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public LdGenreNss setupSelect_GenreSelf() {
        if (hasSpecifiedColumn()) { // if reverse call
            specify().columnParentGenreCode();
        }
        doSetupSelect(new SsCall() { public ConditionQuery qf() { return query().queryGenreSelf(); } });
        if (_nssGenreSelf == null || !_nssGenreSelf.hasConditionQuery())
        { _nssGenreSelf = new LdGenreNss(query().queryGenreSelf()); }
        return _nssGenreSelf;
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
            , new HpSpQyCall<LdGenreCQ>() {
                public boolean has() { return true; }
                public LdGenreCQ qy() { return getConditionQuery(); }
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

    public static class HpSpecification extends HpAbstractSpecification<LdGenreCQ> {
        protected LdGenreCB.HpSpecification _genreSelf;
        public HpSpecification(ConditionBean baseCB, HpSpQyCall<LdGenreCQ> qyCall
                             , HpCBPurpose purpose, DBMetaProvider dbmetaProvider)
        { super(baseCB, qyCall, purpose, dbmetaProvider); }
        /**
         * GENRE_CODE: {PK, NotNull, VARCHAR(24)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnGenreCode() { return doColumn("GENRE_CODE"); }
        /**
         * GENRE_NAME: {NotNull, VARCHAR(80)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnGenreName() { return doColumn("GENRE_NAME"); }
        /**
         * HIERARCHY_LEVEL: {NotNull, NUMERIC(9)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnHierarchyLevel() { return doColumn("HIERARCHY_LEVEL"); }
        /**
         * HIERARCHY_ORDER: {NotNull, NUMERIC(10)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnHierarchyOrder() { return doColumn("HIERARCHY_ORDER"); }
        /**
         * PARENT_GENRE_CODE: {IX, VARCHAR(24), FK to GENRE}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnParentGenreCode() { return doColumn("PARENT_GENRE_CODE"); }
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
            columnGenreCode(); // PK
            if (qyCall().qy().hasConditionQueryGenreSelf()
                    || qyCall().qy().xgetReferrerQuery() instanceof LdGenreCQ) {
                columnParentGenreCode(); // FK or one-to-one referrer
            }
        }
        @Override
        protected String getTableDbName() { return "GENRE"; }
        /**
         * Prepare to specify functions about relation table. <br />
         * GENRE by my PARENT_GENRE_CODE, named 'genreSelf'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public LdGenreCB.HpSpecification specifyGenreSelf() {
            assertRelation("genreSelf");
            if (_genreSelf == null) {
                _genreSelf = new LdGenreCB.HpSpecification(_baseCB, new HpSpQyCall<LdGenreCQ>() {
                    public boolean has() { return _qyCall.has() && _qyCall.qy().hasConditionQueryGenreSelf(); }
                    public LdGenreCQ qy() { return _qyCall.qy().queryGenreSelf(); } }
                    , _purpose, _dbmetaProvider);
                if (xhasSyncQyCall()) { // inherits it
                    _genreSelf.xsetSyncQyCall(new HpSpQyCall<LdGenreCQ>() {
                        public boolean has() { return xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryGenreSelf(); }
                        public LdGenreCQ qy() { return xsyncQyCall().qy().queryGenreSelf(); }
                    });
                }
            }
            return _genreSelf;
        }
        /**
         * Prepare for (Specify)DerivedReferrer. <br />
         * {select max(FOO) from BOOK where ...) as FOO_MAX} <br />
         * BOOK by GENRE_CODE, named 'bookList'.
         * <pre>
         * cb.specify().<span style="color: #FD4747">derivedBookList()</span>.<span style="color: #FD4747">max</span>(new SubQuery&lt;LdBookCB&gt;() {
         *     public void query(LdBookCB subCB) {
         *         subCB.specify().<span style="color: #FD4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *         subCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
         *     }
         * }, LdBook.<span style="color: #FD4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<LdBookCB, LdGenreCQ> derivedBookList() {
            assertDerived("bookList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return new HpSDRFunction<LdBookCB, LdGenreCQ>(_baseCB, _qyCall.qy(), new HpSDRSetupper<LdBookCB, LdGenreCQ>() {
                public void setup(String fn, SubQuery<LdBookCB> sq, LdGenreCQ cq, String al, DerivedReferrerOption op) {
                    cq.xsderiveBookList(fn, sq, al, op); } }, _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer. <br />
         * {select max(FOO) from GENRE where ...) as FOO_MAX} <br />
         * GENRE by PARENT_GENRE_CODE, named 'genreSelfList'.
         * <pre>
         * cb.specify().<span style="color: #FD4747">derivedGenreSelfList()</span>.<span style="color: #FD4747">max</span>(new SubQuery&lt;LdGenreCB&gt;() {
         *     public void query(LdGenreCB subCB) {
         *         subCB.specify().<span style="color: #FD4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *         subCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
         *     }
         * }, LdGenre.<span style="color: #FD4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<LdGenreCB, LdGenreCQ> derivedGenreSelfList() {
            assertDerived("genreSelfList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return new HpSDRFunction<LdGenreCB, LdGenreCQ>(_baseCB, _qyCall.qy(), new HpSDRSetupper<LdGenreCB, LdGenreCQ>() {
                public void setup(String fn, SubQuery<LdGenreCB> sq, LdGenreCQ cq, String al, DerivedReferrerOption op) {
                    cq.xsderiveGenreSelfList(fn, sq, al, op); } }, _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)MyselfDerived (SubQuery).
         * @return The object to set up a function for myself table. (NotNull)
         */
        public HpSDRFunction<LdGenreCB, LdGenreCQ> myselfDerived() {
            assertDerived("myselfDerived"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return new HpSDRFunction<LdGenreCB, LdGenreCQ>(_baseCB, _qyCall.qy(), new HpSDRSetupper<LdGenreCB, LdGenreCQ>() {
                public void setup(String fn, SubQuery<LdGenreCB> sq, LdGenreCQ cq, String al, DerivedReferrerOption op) {
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
     * cb.<span style="color: #FD4747">columnQuery</span>(new SpecifyQuery&lt;LdGenreCB&gt;() {
     *     public void query(LdGenreCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFoo()</span>; <span style="color: #3F7E5E">// left column</span>
     *     }
     * }).lessThan(new SpecifyQuery&lt;LdGenreCB&gt;() {
     *     public void query(LdGenreCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnBar()</span>; <span style="color: #3F7E5E">// right column</span>
     *     }
     * }); <span style="color: #3F7E5E">// you can calculate for right column like '}).plus(3);'</span>
     * </pre>
     * @param leftSpecifyQuery The specify-query for left column. (NotNull)
     * @return The object for setting up operand and right column. (NotNull)
     */
    public HpColQyOperand<LdGenreCB> columnQuery(final SpecifyQuery<LdGenreCB> leftSpecifyQuery) {
        return new HpColQyOperand<LdGenreCB>(new HpColQyHandler<LdGenreCB>() {
            public HpCalculator handle(SpecifyQuery<LdGenreCB> rightSp, String operand) {
                return xcolqy(xcreateColumnQueryCB(), xcreateColumnQueryCB(), leftSpecifyQuery, rightSp, operand);
            }
        });
    }

    protected LdGenreCB xcreateColumnQueryCB() {
        LdGenreCB cb = new LdGenreCB();
        cb.xsetupForColumnQuery((LdGenreCB)this);
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
    public LdGenreCB dreamCruiseCB() {
        LdGenreCB cb = new LdGenreCB();
        cb.xsetupForDreamCruise((LdGenreCB) this);
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
     * cb.<span style="color: #FD4747">orScopeQuery</span>(new OrQuery&lt;LdGenreCB&gt;() {
     *     public void query(LdGenreCB orCB) {
     *         orCB.query().setFOO_Equal...
     *         orCB.query().setBAR_Equal...
     *     }
     * });
     * </pre>
     * @param orQuery The query for or-condition. (NotNull)
     */
    public void orScopeQuery(OrQuery<LdGenreCB> orQuery) {
        xorSQ((LdGenreCB)this, orQuery);
    }

    /**
     * Set up the and-part of or-scope. <br />
     * (However nested or-scope query and as-or-split of like-search in and-part are unsupported)
     * <pre>
     * <span style="color: #3F7E5E">// where (FOO = '...' or (BAR = '...' and QUX = '...'))</span>
     * cb.<span style="color: #FD4747">orScopeQuery</span>(new OrQuery&lt;LdGenreCB&gt;() {
     *     public void query(LdGenreCB orCB) {
     *         orCB.query().setFOO_Equal...
     *         orCB.<span style="color: #FD4747">orScopeQueryAndPart</span>(new AndQuery&lt;LdGenreCB&gt;() {
     *             public void query(LdGenreCB andCB) {
     *                 andCB.query().setBar_...
     *                 andCB.query().setQux_...
     *             }
     *         });
     *     }
     * });
     * </pre>
     * @param andQuery The query for and-condition. (NotNull)
     */
    public void orScopeQueryAndPart(AndQuery<LdGenreCB> andQuery) {
        xorSQAP((LdGenreCB)this, andQuery);
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
        final LdGenreCB cb;
        if (mainCB != null) {
            cb = (LdGenreCB)mainCB;
        } else {
            cb = new LdGenreCB();
        }
        specify().xsetSyncQyCall(new HpSpQyCall<LdGenreCQ>() {
            public boolean has() { return true; }
            public LdGenreCQ qy() { return cb.query(); }
        });
    }

    // ===================================================================================
    //                                                                            Internal
    //                                                                            ========
    // very internal (for suppressing warn about 'Not Use Import')
    protected String getConditionBeanClassNameInternally() { return LdGenreCB.class.getName(); }
    protected String getConditionQueryClassNameInternally() { return LdGenreCQ.class.getName(); }
    protected String getSubQueryClassNameInternally() { return SubQuery.class.getName(); }
    protected String getConditionOptionClassNameInternally() { return ConditionOption.class.getName(); }
}
