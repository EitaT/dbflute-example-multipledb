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
 * The base condition-bean of COLLECTION.
 * @author DBFlute(AutoGenerator)
 */
public class LdBsCollectionCB extends AbstractConditionBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected LdCollectionCQ _conditionQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public LdBsCollectionCB() {
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
        return "COLLECTION";
    }

    // ===================================================================================
    //                                                                 PrimaryKey Handling
    //                                                                 ===================
    /**
     * Accept the query condition of primary key as equal.
     * @param collectionId : PK, ID, NotNull, INTEGER(10). (NotNull)
     */
    public void acceptPrimaryKey(Integer collectionId) {
        assertObjectNotNull("collectionId", collectionId);
        LdBsCollectionCB cb = this;
        cb.query().setCollectionId_Equal(collectionId);;
    }

    /**
     * Accept the query condition of unique key as equal.
     * @param libraryId : UQ+, IX, NotNull, SMALLINT(5), FK to LIBRARY. (NotNull)
     * @param bookId : +UQ, IX, NotNull, INTEGER(10), FK to BOOK. (NotNull)
     */
    public void acceptUniqueOf(Integer libraryId, Integer bookId) {
        assertObjectNotNull("libraryId", libraryId);assertObjectNotNull("bookId", bookId);
        LdBsCollectionCB cb = this;
        cb.query().setLibraryId_Equal(libraryId);;cb.query().setBookId_Equal(bookId);;
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
    public LdCollectionCQ query() {
        assertQueryPurpose(); // assert only when user-public query 
        return getConditionQuery();
    }

    public LdCollectionCQ getConditionQuery() { // public for parameter comment and internal
        if (_conditionQuery == null) {
            _conditionQuery = createLocalCQ();
        }
        return _conditionQuery;
    }

    protected LdCollectionCQ createLocalCQ() {
        return xcreateCQ(null, getSqlClause(), getSqlClause().getBasePointAliasName(), 0);
    }

    protected LdCollectionCQ xcreateCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        LdCollectionCQ cq = xnewCQ(childQuery, sqlClause, aliasName, nestLevel);
        cq.xsetBaseCB(this);
        return cq;
    }

    protected LdCollectionCQ xnewCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        return new LdCollectionCQ(childQuery, sqlClause, aliasName, nestLevel);
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
     * cb.query().<span style="color: #DD4747">union</span>(new UnionQuery&lt;LdCollectionCB&gt;() {
     *     public void query(LdCollectionCB unionCB) {
     *         unionCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param unionQuery The query of 'union'. (NotNull)
     */
    public void union(UnionQuery<LdCollectionCB> unionQuery) {
        final LdCollectionCB cb = new LdCollectionCB(); cb.xsetupForUnion(this); xsyncUQ(cb); 
        try { lock(); unionQuery.query(cb); } finally { unlock(); } xsaveUCB(cb);
        final LdCollectionCQ cq = cb.query(); query().xsetUnionQuery(cq);
    }

    /**
     * Set up 'union all' for base-point table. <br />
     * You don't need to call SetupSelect in union-query,
     * because it inherits calls before. (Don't call SetupSelect after here)
     * <pre>
     * cb.query().<span style="color: #DD4747">unionAll</span>(new UnionQuery&lt;LdCollectionCB&gt;() {
     *     public void query(LdCollectionCB unionCB) {
     *         unionCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param unionQuery The query of 'union all'. (NotNull)
     */
    public void unionAll(UnionQuery<LdCollectionCB> unionQuery) {
        final LdCollectionCB cb = new LdCollectionCB(); cb.xsetupForUnion(this); xsyncUQ(cb);
        try { lock(); unionQuery.query(cb); } finally { unlock(); } xsaveUCB(cb);
        final LdCollectionCQ cq = cb.query(); query().xsetUnionAllQuery(cq);
    }

    // ===================================================================================
    //                                                                         SetupSelect
    //                                                                         ===========
    protected LdBookNss _nssBook;
    public LdBookNss getNssBook() {
        if (_nssBook == null) { _nssBook = new LdBookNss(null); }
        return _nssBook;
    }
    /**
     * Set up relation columns to select clause. <br />
     * BOOK by my BOOK_ID, named 'book'.
     * <pre>
     * LdCollectionCB cb = new LdCollectionCB();
     * cb.<span style="color: #DD4747">setupSelect_Book()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     * cb.query().setFoo...(value);
     * LdCollection collection = collectionBhv.selectEntityWithDeletedCheck(cb);
     * ... = collection.<span style="color: #DD4747">getBook()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public LdBookNss setupSelect_Book() {
        assertSetupSelectPurpose("book");
        if (hasSpecifiedColumn()) { // if reverse call
            specify().columnBookId();
        }
        doSetupSelect(new SsCall() { public ConditionQuery qf() { return query().queryBook(); } });
        if (_nssBook == null || !_nssBook.hasConditionQuery())
        { _nssBook = new LdBookNss(query().queryBook()); }
        return _nssBook;
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
     * LdCollectionCB cb = new LdCollectionCB();
     * cb.<span style="color: #DD4747">setupSelect_Library()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     * cb.query().setFoo...(value);
     * LdCollection collection = collectionBhv.selectEntityWithDeletedCheck(cb);
     * ... = collection.<span style="color: #DD4747">getLibrary()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public LdLibraryNss setupSelect_Library() {
        assertSetupSelectPurpose("library");
        if (hasSpecifiedColumn()) { // if reverse call
            specify().columnLibraryId();
        }
        doSetupSelect(new SsCall() { public ConditionQuery qf() { return query().queryLibrary(); } });
        if (_nssLibrary == null || !_nssLibrary.hasConditionQuery())
        { _nssLibrary = new LdLibraryNss(query().queryLibrary()); }
        return _nssLibrary;
    }

    protected LdCollectionStatusNss _nssCollectionStatusAsOne;
    public LdCollectionStatusNss getNssCollectionStatusAsOne() {
        if (_nssCollectionStatusAsOne == null) { _nssCollectionStatusAsOne = new LdCollectionStatusNss(null); }
        return _nssCollectionStatusAsOne;
    }
    /**
     * Set up relation columns to select clause. <br />
     * COLLECTION_STATUS by COLLECTION_ID, named 'collectionStatusAsOne'.
     * <pre>
     * LdCollectionCB cb = new LdCollectionCB();
     * cb.<span style="color: #DD4747">setupSelect_CollectionStatusAsOne()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     * cb.query().setFoo...(value);
     * LdCollection collection = collectionBhv.selectEntityWithDeletedCheck(cb);
     * ... = collection.<span style="color: #DD4747">getCollectionStatusAsOne()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public LdCollectionStatusNss setupSelect_CollectionStatusAsOne() {
        assertSetupSelectPurpose("collectionStatusAsOne");
        doSetupSelect(new SsCall() { public ConditionQuery qf() { return query().queryCollectionStatusAsOne(); } });
        if (_nssCollectionStatusAsOne == null || !_nssCollectionStatusAsOne.hasConditionQuery()) { _nssCollectionStatusAsOne = new LdCollectionStatusNss(query().queryCollectionStatusAsOne()); }
        return _nssCollectionStatusAsOne;
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
            , new HpSpQyCall<LdCollectionCQ>() {
                public boolean has() { return true; }
                public LdCollectionCQ qy() { return getConditionQuery(); }
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

    public static class HpSpecification extends HpAbstractSpecification<LdCollectionCQ> {
        protected LdBookCB.HpSpecification _book;
        protected LdLibraryCB.HpSpecification _library;
        protected LdCollectionStatusCB.HpSpecification _collectionStatusAsOne;
        public HpSpecification(ConditionBean baseCB, HpSpQyCall<LdCollectionCQ> qyCall
                             , HpCBPurpose purpose, DBMetaProvider dbmetaProvider)
        { super(baseCB, qyCall, purpose, dbmetaProvider); }
        /**
         * COLLECTION_ID: {PK, ID, NotNull, INTEGER(10)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnCollectionId() { return doColumn("COLLECTION_ID"); }
        /**
         * LIBRARY_ID: {UQ+, IX, NotNull, SMALLINT(5), FK to LIBRARY}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnLibraryId() { return doColumn("LIBRARY_ID"); }
        /**
         * BOOK_ID: {+UQ, IX, NotNull, INTEGER(10), FK to BOOK}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnBookId() { return doColumn("BOOK_ID"); }
        /**
         * ARRIVAL_DATE: {NotNull, TIMESTAMP(26, 6)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnArrivalDate() { return doColumn("ARRIVAL_DATE"); }
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
            columnCollectionId(); // PK
            if (qyCall().qy().hasConditionQueryBook()
                    || qyCall().qy().xgetReferrerQuery() instanceof LdBookCQ) {
                columnBookId(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryLibrary()
                    || qyCall().qy().xgetReferrerQuery() instanceof LdLibraryCQ) {
                columnLibraryId(); // FK or one-to-one referrer
            }
        }
        @Override
        protected String getTableDbName() { return "COLLECTION"; }
        /**
         * Prepare to specify functions about relation table. <br />
         * BOOK by my BOOK_ID, named 'book'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public LdBookCB.HpSpecification specifyBook() {
            assertRelation("book");
            if (_book == null) {
                _book = new LdBookCB.HpSpecification(_baseCB, new HpSpQyCall<LdBookCQ>() {
                    public boolean has() { return _qyCall.has() && _qyCall.qy().hasConditionQueryBook(); }
                    public LdBookCQ qy() { return _qyCall.qy().queryBook(); } }
                    , _purpose, _dbmetaProvider);
                if (xhasSyncQyCall()) { // inherits it
                    _book.xsetSyncQyCall(new HpSpQyCall<LdBookCQ>() {
                        public boolean has() { return xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBook(); }
                        public LdBookCQ qy() { return xsyncQyCall().qy().queryBook(); }
                    });
                }
            }
            return _book;
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
         * Prepare to specify functions about relation table. <br />
         * COLLECTION_STATUS by COLLECTION_ID, named 'collectionStatusAsOne'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public LdCollectionStatusCB.HpSpecification specifyCollectionStatusAsOne() {
            assertRelation("collectionStatusAsOne");
            if (_collectionStatusAsOne == null) {
                _collectionStatusAsOne = new LdCollectionStatusCB.HpSpecification(_baseCB, new HpSpQyCall<LdCollectionStatusCQ>() {
                    public boolean has() { return _qyCall.has() && _qyCall.qy().hasConditionQueryCollectionStatusAsOne(); }
                    public LdCollectionStatusCQ qy() { return _qyCall.qy().queryCollectionStatusAsOne(); } }
                    , _purpose, _dbmetaProvider);
                if (xhasSyncQyCall()) { // inherits it
                    _collectionStatusAsOne.xsetSyncQyCall(new HpSpQyCall<LdCollectionStatusCQ>() {
                        public boolean has() { return xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryCollectionStatusAsOne(); }
                        public LdCollectionStatusCQ qy() { return xsyncQyCall().qy().queryCollectionStatusAsOne(); }
                    });
                }
            }
            return _collectionStatusAsOne;
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br />
         * {select max(FOO) from LENDING_COLLECTION where ...) as FOO_MAX} <br />
         * LENDING_COLLECTION by COLLECTION_ID, named 'lendingCollectionList'.
         * <pre>
         * cb.specify().<span style="color: #DD4747">derivedLendingCollectionList()</span>.<span style="color: #DD4747">max</span>(new SubQuery&lt;LdLendingCollectionCB&gt;() {
         *     public void query(LdLendingCollectionCB subCB) {
         *         subCB.specify().<span style="color: #DD4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *         subCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
         *     }
         * }, LdLendingCollection.<span style="color: #DD4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<LdLendingCollectionCB, LdCollectionCQ> derivedLendingCollectionList() {
            assertDerived("lendingCollectionList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return new HpSDRFunction<LdLendingCollectionCB, LdCollectionCQ>(_baseCB, _qyCall.qy(), new HpSDRSetupper<LdLendingCollectionCB, LdCollectionCQ>() {
                public void setup(String fn, SubQuery<LdLendingCollectionCB> sq, LdCollectionCQ cq, String al, DerivedReferrerOption op) {
                    cq.xsderiveLendingCollectionList(fn, sq, al, op); } }, _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)MyselfDerived (SubQuery).
         * @return The object to set up a function for myself table. (NotNull)
         */
        public HpSDRFunction<LdCollectionCB, LdCollectionCQ> myselfDerived() {
            assertDerived("myselfDerived"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return new HpSDRFunction<LdCollectionCB, LdCollectionCQ>(_baseCB, _qyCall.qy(), new HpSDRSetupper<LdCollectionCB, LdCollectionCQ>() {
                public void setup(String fn, SubQuery<LdCollectionCB> sq, LdCollectionCQ cq, String al, DerivedReferrerOption op) {
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
     * cb.<span style="color: #DD4747">columnQuery</span>(new SpecifyQuery&lt;LdCollectionCB&gt;() {
     *     public void query(LdCollectionCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFoo()</span>; <span style="color: #3F7E5E">// left column</span>
     *     }
     * }).lessThan(new SpecifyQuery&lt;LdCollectionCB&gt;() {
     *     public void query(LdCollectionCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnBar()</span>; <span style="color: #3F7E5E">// right column</span>
     *     }
     * }); <span style="color: #3F7E5E">// you can calculate for right column like '}).plus(3);'</span>
     * </pre>
     * @param leftSpecifyQuery The specify-query for left column. (NotNull)
     * @return The object for setting up operand and right column. (NotNull)
     */
    public HpColQyOperand<LdCollectionCB> columnQuery(final SpecifyQuery<LdCollectionCB> leftSpecifyQuery) {
        return new HpColQyOperand<LdCollectionCB>(new HpColQyHandler<LdCollectionCB>() {
            public HpCalculator handle(SpecifyQuery<LdCollectionCB> rightSp, String operand) {
                return xcolqy(xcreateColumnQueryCB(), xcreateColumnQueryCB(), leftSpecifyQuery, rightSp, operand);
            }
        });
    }

    protected LdCollectionCB xcreateColumnQueryCB() {
        LdCollectionCB cb = new LdCollectionCB();
        cb.xsetupForColumnQuery((LdCollectionCB)this);
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
    public LdCollectionCB dreamCruiseCB() {
        LdCollectionCB cb = new LdCollectionCB();
        cb.xsetupForDreamCruise((LdCollectionCB) this);
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
     * cb.<span style="color: #DD4747">orScopeQuery</span>(new OrQuery&lt;LdCollectionCB&gt;() {
     *     public void query(LdCollectionCB orCB) {
     *         orCB.query().setFOO_Equal...
     *         orCB.query().setBAR_Equal...
     *     }
     * });
     * </pre>
     * @param orQuery The query for or-condition. (NotNull)
     */
    public void orScopeQuery(OrQuery<LdCollectionCB> orQuery) {
        xorSQ((LdCollectionCB)this, orQuery);
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
     * cb.<span style="color: #DD4747">orScopeQuery</span>(new OrQuery&lt;LdCollectionCB&gt;() {
     *     public void query(LdCollectionCB orCB) {
     *         orCB.query().setFOO_Equal...
     *         orCB.<span style="color: #DD4747">orScopeQueryAndPart</span>(new AndQuery&lt;LdCollectionCB&gt;() {
     *             public void query(LdCollectionCB andCB) {
     *                 andCB.query().setBar_...
     *                 andCB.query().setQux_...
     *             }
     *         });
     *     }
     * });
     * </pre>
     * @param andQuery The query for and-condition. (NotNull)
     */
    public void orScopeQueryAndPart(AndQuery<LdCollectionCB> andQuery) {
        xorSQAP((LdCollectionCB)this, andQuery);
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
        final LdCollectionCB cb;
        if (mainCB != null) {
            cb = (LdCollectionCB)mainCB;
        } else {
            cb = new LdCollectionCB();
        }
        specify().xsetSyncQyCall(new HpSpQyCall<LdCollectionCQ>() {
            public boolean has() { return true; }
            public LdCollectionCQ qy() { return cb.query(); }
        });
    }

    // ===================================================================================
    //                                                                            Internal
    //                                                                            ========
    // very internal (for suppressing warn about 'Not Use Import')
    protected String getConditionBeanClassNameInternally() { return LdCollectionCB.class.getName(); }
    protected String getConditionQueryClassNameInternally() { return LdCollectionCQ.class.getName(); }
    protected String getSubQueryClassNameInternally() { return SubQuery.class.getName(); }
    protected String getConditionOptionClassNameInternally() { return ConditionOption.class.getName(); }
}
