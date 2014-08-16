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
 * The base condition-bean of BOOK.
 * @author DBFlute(AutoGenerator)
 */
public class LdBsBookCB extends AbstractConditionBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected LdBookCQ _conditionQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public LdBsBookCB() {
        if (LdDBFluteConfig.getInstance().isPagingCountLater()) {
            enablePagingCountLater();
        }
        if (LdDBFluteConfig.getInstance().isPagingCountLeastJoin()) {
            enablePagingCountLeastJoin();
        }
        if (LdDBFluteConfig.getInstance().isQueryUpdateCountPreCheck()) {
            enableQueryUpdateCountPreCheck();
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
        return "BOOK";
    }

    // ===================================================================================
    //                                                                 PrimaryKey Handling
    //                                                                 ===================
    /**
     * Accept the query condition of primary key as equal.
     * @param bookId : PK, ID, NotNull, INTEGER(10). (NotNull)
     * @return this. (NotNull)
     */
    public LdBookCB acceptPK(Integer bookId) {
        assertObjectNotNull("bookId", bookId);
        LdBsBookCB cb = this;
        cb.query().setBookId_Equal(bookId);
        return (LdBookCB)this;
    }

    /**
     * Accept the query condition of primary key as equal. (old style)
     * @param bookId : PK, ID, NotNull, INTEGER(10). (NotNull)
     */
    public void acceptPrimaryKey(Integer bookId) {
        assertObjectNotNull("bookId", bookId);
        LdBsBookCB cb = this;
        cb.query().setBookId_Equal(bookId);
    }

    /**
     * Accept the query condition of unique key as equal.
     * @param isbn : UQ, NotNull, VARCHAR(20). (NotNull)
     * @return this. (NotNull)
     */
    public LdBookCB acceptUniqueOf(String isbn) {
        assertObjectNotNull("isbn", isbn);
        LdBsBookCB cb = this;
        cb.query().setIsbn_Equal(isbn);
        return (LdBookCB)this;
    }

    public ConditionBean addOrderBy_PK_Asc() {
        query().addOrderBy_BookId_Asc();
        return this;
    }

    public ConditionBean addOrderBy_PK_Desc() {
        query().addOrderBy_BookId_Desc();
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
    public LdBookCQ query() {
        assertQueryPurpose(); // assert only when user-public query 
        return getConditionQuery();
    }

    public LdBookCQ getConditionQuery() { // public for parameter comment and internal
        if (_conditionQuery == null) {
            _conditionQuery = createLocalCQ();
        }
        return _conditionQuery;
    }

    protected LdBookCQ createLocalCQ() {
        return xcreateCQ(null, getSqlClause(), getSqlClause().getBasePointAliasName(), 0);
    }

    protected LdBookCQ xcreateCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        LdBookCQ cq = xnewCQ(childQuery, sqlClause, aliasName, nestLevel);
        cq.xsetBaseCB(this);
        return cq;
    }

    protected LdBookCQ xnewCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        return new LdBookCQ(childQuery, sqlClause, aliasName, nestLevel);
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
     * cb.query().<span style="color: #DD4747">union</span>(new UnionQuery&lt;LdBookCB&gt;() {
     *     public void query(LdBookCB unionCB) {
     *         unionCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param unionQuery The query of 'union'. (NotNull)
     */
    public void union(UnionQuery<LdBookCB> unionQuery) {
        final LdBookCB cb = new LdBookCB(); cb.xsetupForUnion(this); xsyncUQ(cb); 
        try { lock(); unionQuery.query(cb); } finally { unlock(); } xsaveUCB(cb);
        final LdBookCQ cq = cb.query(); query().xsetUnionQuery(cq);
    }

    /**
     * Set up 'union all' for base-point table. <br />
     * You don't need to call SetupSelect in union-query,
     * because it inherits calls before. (Don't call SetupSelect after here)
     * <pre>
     * cb.query().<span style="color: #DD4747">unionAll</span>(new UnionQuery&lt;LdBookCB&gt;() {
     *     public void query(LdBookCB unionCB) {
     *         unionCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param unionQuery The query of 'union all'. (NotNull)
     */
    public void unionAll(UnionQuery<LdBookCB> unionQuery) {
        final LdBookCB cb = new LdBookCB(); cb.xsetupForUnion(this); xsyncUQ(cb);
        try { lock(); unionQuery.query(cb); } finally { unlock(); } xsaveUCB(cb);
        final LdBookCQ cq = cb.query(); query().xsetUnionAllQuery(cq);
    }

    // ===================================================================================
    //                                                                         SetupSelect
    //                                                                         ===========
    /**
     * Set up relation columns to select clause. <br />
     * AUTHOR by my AUTHOR_ID, named 'author'.
     * <pre>
     * LdBookCB cb = new LdBookCB();
     * cb.<span style="color: #DD4747">setupSelect_Author()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     * cb.query().setFoo...(value);
     * LdBook book = bookBhv.selectEntityWithDeletedCheck(cb);
     * ... = book.<span style="color: #DD4747">getAuthor()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * </pre>
     */
    public void setupSelect_Author() {
        assertSetupSelectPurpose("author");
        if (hasSpecifiedColumn()) { // if reverse call
            specify().columnAuthorId();
        }
        doSetupSelect(new SsCall() { public ConditionQuery qf() { return query().queryAuthor(); } });
    }

    protected LdGenreNss _nssGenre;
    public LdGenreNss getNssGenre() {
        if (_nssGenre == null) { _nssGenre = new LdGenreNss(null); }
        return _nssGenre;
    }
    /**
     * Set up relation columns to select clause. <br />
     * GENRE by my GENRE_CODE, named 'genre'.
     * <pre>
     * LdBookCB cb = new LdBookCB();
     * cb.<span style="color: #DD4747">setupSelect_Genre()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     * cb.query().setFoo...(value);
     * LdBook book = bookBhv.selectEntityWithDeletedCheck(cb);
     * ... = book.<span style="color: #DD4747">getGenre()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public LdGenreNss setupSelect_Genre() {
        assertSetupSelectPurpose("genre");
        if (hasSpecifiedColumn()) { // if reverse call
            specify().columnGenreCode();
        }
        doSetupSelect(new SsCall() { public ConditionQuery qf() { return query().queryGenre(); } });
        if (_nssGenre == null || !_nssGenre.hasConditionQuery())
        { _nssGenre = new LdGenreNss(query().queryGenre()); }
        return _nssGenre;
    }

    /**
     * Set up relation columns to select clause. <br />
     * PUBLISHER by my PUBLISHER_ID, named 'publisher'.
     * <pre>
     * LdBookCB cb = new LdBookCB();
     * cb.<span style="color: #DD4747">setupSelect_Publisher()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     * cb.query().setFoo...(value);
     * LdBook book = bookBhv.selectEntityWithDeletedCheck(cb);
     * ... = book.<span style="color: #DD4747">getPublisher()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * </pre>
     */
    public void setupSelect_Publisher() {
        assertSetupSelectPurpose("publisher");
        if (hasSpecifiedColumn()) { // if reverse call
            specify().columnPublisherId();
        }
        doSetupSelect(new SsCall() { public ConditionQuery qf() { return query().queryPublisher(); } });
    }

    /**
     * Set up relation columns to select clause. <br />
     * COLLECTION_STATUS_LOOKUP by my GENRE_CODE, named 'collectionStatusLookupAsNonExist'.
     * <pre>
     * LdBookCB cb = new LdBookCB();
     * cb.<span style="color: #DD4747">setupSelect_CollectionStatusLookupAsNonExist()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     * cb.query().setFoo...(value);
     * LdBook book = bookBhv.selectEntityWithDeletedCheck(cb);
     * ... = book.<span style="color: #DD4747">getCollectionStatusLookupAsNonExist()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * </pre>
     */
    public void setupSelect_CollectionStatusLookupAsNonExist() {
        assertSetupSelectPurpose("collectionStatusLookupAsNonExist");
        if (hasSpecifiedColumn()) { // if reverse call
            specify().columnGenreCode();
        }
        doSetupSelect(new SsCall() { public ConditionQuery qf() { return query().queryCollectionStatusLookupAsNonExist(); } });
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
            , new HpSpQyCall<LdBookCQ>() {
                public boolean has() { return true; }
                public LdBookCQ qy() { return getConditionQuery(); }
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

    public static class HpSpecification extends HpAbstractSpecification<LdBookCQ> {
        protected LdAuthorCB.HpSpecification _author;
        protected LdGenreCB.HpSpecification _genre;
        protected LdPublisherCB.HpSpecification _publisher;
        protected LdCollectionStatusLookupCB.HpSpecification _collectionStatusLookupAsNonExist;
        public HpSpecification(ConditionBean baseCB, HpSpQyCall<LdBookCQ> qyCall
                             , HpCBPurpose purpose, DBMetaProvider dbmetaProvider)
        { super(baseCB, qyCall, purpose, dbmetaProvider); }
        /**
         * BOOK_ID: {PK, ID, NotNull, INTEGER(10)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnBookId() { return doColumn("BOOK_ID"); }
        /**
         * ISBN: {UQ, NotNull, VARCHAR(20)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnIsbn() { return doColumn("ISBN"); }
        /**
         * BOOK_NAME: {NotNull, VARCHAR(80)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnBookName() { return doColumn("BOOK_NAME"); }
        /**
         * AUTHOR_ID: {IX, NotNull, INTEGER(10), FK to AUTHOR}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnAuthorId() { return doColumn("AUTHOR_ID"); }
        /**
         * PUBLISHER_ID: {IX, NotNull, INTEGER(10), FK to PUBLISHER}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnPublisherId() { return doColumn("PUBLISHER_ID"); }
        /**
         * GENRE_CODE: {IX, VARCHAR(24), FK to GENRE}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnGenreCode() { return doColumn("GENRE_CODE"); }
        /**
         * OPENING_PART: {CLOB(2147483647)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnOpeningPart() { return doColumn("OPENING_PART"); }
        /**
         * MAX_LENDING_DATE_COUNT: {NotNull, SMALLINT(5)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnMaxLendingDateCount() { return doColumn("MAX_LENDING_DATE_COUNT"); }
        /**
         * OUT_OF_USER_SELECT_YN: {NotNull, CHAR(1), classification=YesNo}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnOutOfUserSelectYn() { return doColumn("OUT_OF_USER_SELECT_YN"); }
        /**
         * OUT_OF_USER_SELECT_REASON: {VARCHAR(200)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnOutOfUserSelectReason() { return doColumn("OUT_OF_USER_SELECT_REASON"); }
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
            columnBookId(); // PK
            if (qyCall().qy().hasConditionQueryAuthor()
                    || qyCall().qy().xgetReferrerQuery() instanceof LdAuthorCQ) {
                columnAuthorId(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryGenre()
                    || qyCall().qy().xgetReferrerQuery() instanceof LdGenreCQ) {
                columnGenreCode(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryPublisher()
                    || qyCall().qy().xgetReferrerQuery() instanceof LdPublisherCQ) {
                columnPublisherId(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryCollectionStatusLookupAsNonExist()
                    || qyCall().qy().xgetReferrerQuery() instanceof LdCollectionStatusLookupCQ) {
                columnGenreCode(); // FK or one-to-one referrer
            }
        }
        @Override
        protected String getTableDbName() { return "BOOK"; }
        /**
         * Prepare to specify functions about relation table. <br />
         * AUTHOR by my AUTHOR_ID, named 'author'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public LdAuthorCB.HpSpecification specifyAuthor() {
            assertRelation("author");
            if (_author == null) {
                _author = new LdAuthorCB.HpSpecification(_baseCB, new HpSpQyCall<LdAuthorCQ>() {
                    public boolean has() { return _qyCall.has() && _qyCall.qy().hasConditionQueryAuthor(); }
                    public LdAuthorCQ qy() { return _qyCall.qy().queryAuthor(); } }
                    , _purpose, _dbmetaProvider);
                if (xhasSyncQyCall()) { // inherits it
                    _author.xsetSyncQyCall(new HpSpQyCall<LdAuthorCQ>() {
                        public boolean has() { return xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryAuthor(); }
                        public LdAuthorCQ qy() { return xsyncQyCall().qy().queryAuthor(); }
                    });
                }
            }
            return _author;
        }
        /**
         * Prepare to specify functions about relation table. <br />
         * GENRE by my GENRE_CODE, named 'genre'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public LdGenreCB.HpSpecification specifyGenre() {
            assertRelation("genre");
            if (_genre == null) {
                _genre = new LdGenreCB.HpSpecification(_baseCB, new HpSpQyCall<LdGenreCQ>() {
                    public boolean has() { return _qyCall.has() && _qyCall.qy().hasConditionQueryGenre(); }
                    public LdGenreCQ qy() { return _qyCall.qy().queryGenre(); } }
                    , _purpose, _dbmetaProvider);
                if (xhasSyncQyCall()) { // inherits it
                    _genre.xsetSyncQyCall(new HpSpQyCall<LdGenreCQ>() {
                        public boolean has() { return xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryGenre(); }
                        public LdGenreCQ qy() { return xsyncQyCall().qy().queryGenre(); }
                    });
                }
            }
            return _genre;
        }
        /**
         * Prepare to specify functions about relation table. <br />
         * PUBLISHER by my PUBLISHER_ID, named 'publisher'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public LdPublisherCB.HpSpecification specifyPublisher() {
            assertRelation("publisher");
            if (_publisher == null) {
                _publisher = new LdPublisherCB.HpSpecification(_baseCB, new HpSpQyCall<LdPublisherCQ>() {
                    public boolean has() { return _qyCall.has() && _qyCall.qy().hasConditionQueryPublisher(); }
                    public LdPublisherCQ qy() { return _qyCall.qy().queryPublisher(); } }
                    , _purpose, _dbmetaProvider);
                if (xhasSyncQyCall()) { // inherits it
                    _publisher.xsetSyncQyCall(new HpSpQyCall<LdPublisherCQ>() {
                        public boolean has() { return xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryPublisher(); }
                        public LdPublisherCQ qy() { return xsyncQyCall().qy().queryPublisher(); }
                    });
                }
            }
            return _publisher;
        }
        /**
         * Prepare to specify functions about relation table. <br />
         * COLLECTION_STATUS_LOOKUP by my GENRE_CODE, named 'collectionStatusLookupAsNonExist'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public LdCollectionStatusLookupCB.HpSpecification specifyCollectionStatusLookupAsNonExist() {
            assertRelation("collectionStatusLookupAsNonExist");
            if (_collectionStatusLookupAsNonExist == null) {
                _collectionStatusLookupAsNonExist = new LdCollectionStatusLookupCB.HpSpecification(_baseCB, new HpSpQyCall<LdCollectionStatusLookupCQ>() {
                    public boolean has() { return _qyCall.has() && _qyCall.qy().hasConditionQueryCollectionStatusLookupAsNonExist(); }
                    public LdCollectionStatusLookupCQ qy() { return _qyCall.qy().queryCollectionStatusLookupAsNonExist(); } }
                    , _purpose, _dbmetaProvider);
                if (xhasSyncQyCall()) { // inherits it
                    _collectionStatusLookupAsNonExist.xsetSyncQyCall(new HpSpQyCall<LdCollectionStatusLookupCQ>() {
                        public boolean has() { return xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryCollectionStatusLookupAsNonExist(); }
                        public LdCollectionStatusLookupCQ qy() { return xsyncQyCall().qy().queryCollectionStatusLookupAsNonExist(); }
                    });
                }
            }
            return _collectionStatusLookupAsNonExist;
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br />
         * {select max(FOO) from COLLECTION where ...) as FOO_MAX} <br />
         * COLLECTION by BOOK_ID, named 'collectionList'.
         * <pre>
         * cb.specify().<span style="color: #DD4747">derivedCollectionList()</span>.<span style="color: #DD4747">max</span>(new SubQuery&lt;LdCollectionCB&gt;() {
         *     public void query(LdCollectionCB subCB) {
         *         subCB.specify().<span style="color: #DD4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *         subCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
         *     }
         * }, LdCollection.<span style="color: #DD4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<LdCollectionCB, LdBookCQ> derivedCollectionList() {
            assertDerived("collectionList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return new HpSDRFunction<LdCollectionCB, LdBookCQ>(_baseCB, _qyCall.qy(), new HpSDRSetupper<LdCollectionCB, LdBookCQ>() {
                public void setup(String fn, SubQuery<LdCollectionCB> sq, LdBookCQ cq, String al, DerivedReferrerOption op) {
                    cq.xsderiveCollectionList(fn, sq, al, op); } }, _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)MyselfDerived (SubQuery).
         * @return The object to set up a function for myself table. (NotNull)
         */
        public HpSDRFunction<LdBookCB, LdBookCQ> myselfDerived() {
            assertDerived("myselfDerived"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return new HpSDRFunction<LdBookCB, LdBookCQ>(_baseCB, _qyCall.qy(), new HpSDRSetupper<LdBookCB, LdBookCQ>() {
                public void setup(String fn, SubQuery<LdBookCB> sq, LdBookCQ cq, String al, DerivedReferrerOption op) {
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
     * cb.<span style="color: #DD4747">columnQuery</span>(new SpecifyQuery&lt;LdBookCB&gt;() {
     *     public void query(LdBookCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFoo()</span>; <span style="color: #3F7E5E">// left column</span>
     *     }
     * }).lessThan(new SpecifyQuery&lt;LdBookCB&gt;() {
     *     public void query(LdBookCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnBar()</span>; <span style="color: #3F7E5E">// right column</span>
     *     }
     * }); <span style="color: #3F7E5E">// you can calculate for right column like '}).plus(3);'</span>
     * </pre>
     * @param leftSpecifyQuery The specify-query for left column. (NotNull)
     * @return The object for setting up operand and right column. (NotNull)
     */
    public HpColQyOperand<LdBookCB> columnQuery(final SpecifyQuery<LdBookCB> leftSpecifyQuery) {
        return new HpColQyOperand<LdBookCB>(new HpColQyHandler<LdBookCB>() {
            public HpCalculator handle(SpecifyQuery<LdBookCB> rightSp, String operand) {
                return xcolqy(xcreateColumnQueryCB(), xcreateColumnQueryCB(), leftSpecifyQuery, rightSp, operand);
            }
        });
    }

    protected LdBookCB xcreateColumnQueryCB() {
        LdBookCB cb = new LdBookCB();
        cb.xsetupForColumnQuery((LdBookCB)this);
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
    public LdBookCB dreamCruiseCB() {
        LdBookCB cb = new LdBookCB();
        cb.xsetupForDreamCruise((LdBookCB) this);
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
     * cb.<span style="color: #DD4747">orScopeQuery</span>(new OrQuery&lt;LdBookCB&gt;() {
     *     public void query(LdBookCB orCB) {
     *         orCB.query().setFOO_Equal...
     *         orCB.query().setBAR_Equal...
     *     }
     * });
     * </pre>
     * @param orQuery The query for or-condition. (NotNull)
     */
    public void orScopeQuery(OrQuery<LdBookCB> orQuery) {
        xorSQ((LdBookCB)this, orQuery);
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
     * cb.<span style="color: #DD4747">orScopeQuery</span>(new OrQuery&lt;LdBookCB&gt;() {
     *     public void query(LdBookCB orCB) {
     *         orCB.query().setFOO_Equal...
     *         orCB.<span style="color: #DD4747">orScopeQueryAndPart</span>(new AndQuery&lt;LdBookCB&gt;() {
     *             public void query(LdBookCB andCB) {
     *                 andCB.query().setBar_...
     *                 andCB.query().setQux_...
     *             }
     *         });
     *     }
     * });
     * </pre>
     * @param andQuery The query for and-condition. (NotNull)
     */
    public void orScopeQueryAndPart(AndQuery<LdBookCB> andQuery) {
        xorSQAP((LdBookCB)this, andQuery);
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
        final LdBookCB cb;
        if (mainCB != null) {
            cb = (LdBookCB)mainCB;
        } else {
            cb = new LdBookCB();
        }
        specify().xsetSyncQyCall(new HpSpQyCall<LdBookCQ>() {
            public boolean has() { return true; }
            public LdBookCQ qy() { return cb.query(); }
        });
    }

    // ===================================================================================
    //                                                                            Internal
    //                                                                            ========
    // very internal (for suppressing warn about 'Not Use Import')
    protected String getConditionBeanClassNameInternally() { return LdBookCB.class.getName(); }
    protected String getConditionQueryClassNameInternally() { return LdBookCQ.class.getName(); }
    protected String getSubQueryClassNameInternally() { return SubQuery.class.getName(); }
    protected String getConditionOptionClassNameInternally() { return ConditionOption.class.getName(); }
}
