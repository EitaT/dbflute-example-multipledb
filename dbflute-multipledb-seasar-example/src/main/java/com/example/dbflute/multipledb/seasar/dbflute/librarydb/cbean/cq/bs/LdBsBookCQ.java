/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */package com.example.dbflute.multipledb.seasar.dbflute.librarydb.cbean.cq.bs;

import java.util.Map;

import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.cbean.chelper.*;
import org.seasar.dbflute.cbean.coption.*;
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import org.seasar.dbflute.exception.IllegalConditionBeanOperationException;
import com.example.dbflute.multipledb.seasar.dbflute.librarydb.cbean.cq.ciq.*;
import com.example.dbflute.multipledb.seasar.dbflute.librarydb.cbean.*;
import com.example.dbflute.multipledb.seasar.dbflute.librarydb.cbean.cq.*;

/**
 * The base condition-query of BOOK.
 * @author DBFlute(AutoGenerator)
 */
public class LdBsBookCQ extends LdAbstractBsBookCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected LdBookCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public LdBsBookCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from BOOK) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public LdBookCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected LdBookCIQ xcreateCIQ() {
        LdBookCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected LdBookCIQ xnewCIQ() {
        return new LdBookCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join BOOK on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public LdBookCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        LdBookCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _bookId;
    public ConditionValue getBookId()
    { if (_bookId == null) { _bookId = nCV(); }
      return _bookId; }
    protected ConditionValue getCValueBookId() { return getBookId(); }

    public Map<String, LdCollectionCQ> getBookId_ExistsReferrer_CollectionList() { return xgetSQueMap("bookId_ExistsReferrer_CollectionList"); }
    public String keepBookId_ExistsReferrer_CollectionList(LdCollectionCQ sq) { return xkeepSQue("bookId_ExistsReferrer_CollectionList", sq); }

    public Map<String, LdCollectionCQ> getBookId_NotExistsReferrer_CollectionList() { return xgetSQueMap("bookId_NotExistsReferrer_CollectionList"); }
    public String keepBookId_NotExistsReferrer_CollectionList(LdCollectionCQ sq) { return xkeepSQue("bookId_NotExistsReferrer_CollectionList", sq); }

    public Map<String, LdCollectionCQ> getBookId_SpecifyDerivedReferrer_CollectionList() { return xgetSQueMap("bookId_SpecifyDerivedReferrer_CollectionList"); }
    public String keepBookId_SpecifyDerivedReferrer_CollectionList(LdCollectionCQ sq) { return xkeepSQue("bookId_SpecifyDerivedReferrer_CollectionList", sq); }

    public Map<String, LdCollectionCQ> getBookId_InScopeRelation_CollectionList() { return xgetSQueMap("bookId_InScopeRelation_CollectionList"); }
    public String keepBookId_InScopeRelation_CollectionList(LdCollectionCQ sq) { return xkeepSQue("bookId_InScopeRelation_CollectionList", sq); }

    public Map<String, LdCollectionCQ> getBookId_NotInScopeRelation_CollectionList() { return xgetSQueMap("bookId_NotInScopeRelation_CollectionList"); }
    public String keepBookId_NotInScopeRelation_CollectionList(LdCollectionCQ sq) { return xkeepSQue("bookId_NotInScopeRelation_CollectionList", sq); }

    public Map<String, LdCollectionCQ> getBookId_QueryDerivedReferrer_CollectionList() { return xgetSQueMap("bookId_QueryDerivedReferrer_CollectionList"); }
    public String keepBookId_QueryDerivedReferrer_CollectionList(LdCollectionCQ sq) { return xkeepSQue("bookId_QueryDerivedReferrer_CollectionList", sq); }
    public Map<String, Object> getBookId_QueryDerivedReferrer_CollectionListParameter() { return xgetSQuePmMap("bookId_QueryDerivedReferrer_CollectionList"); }
    public String keepBookId_QueryDerivedReferrer_CollectionListParameter(Object pm) { return xkeepSQuePm("bookId_QueryDerivedReferrer_CollectionList", pm); }

    /** 
     * Add order-by as ascend. <br />
     * BOOK_ID: {PK, ID, NotNull, INTEGER(10)}
     * @return this. (NotNull)
     */
    public LdBsBookCQ addOrderBy_BookId_Asc() { regOBA("BOOK_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * BOOK_ID: {PK, ID, NotNull, INTEGER(10)}
     * @return this. (NotNull)
     */
    public LdBsBookCQ addOrderBy_BookId_Desc() { regOBD("BOOK_ID"); return this; }

    protected ConditionValue _isbn;
    public ConditionValue getIsbn()
    { if (_isbn == null) { _isbn = nCV(); }
      return _isbn; }
    protected ConditionValue getCValueIsbn() { return getIsbn(); }

    /** 
     * Add order-by as ascend. <br />
     * ISBN: {UQ, NotNull, VARCHAR(20)}
     * @return this. (NotNull)
     */
    public LdBsBookCQ addOrderBy_Isbn_Asc() { regOBA("ISBN"); return this; }

    /**
     * Add order-by as descend. <br />
     * ISBN: {UQ, NotNull, VARCHAR(20)}
     * @return this. (NotNull)
     */
    public LdBsBookCQ addOrderBy_Isbn_Desc() { regOBD("ISBN"); return this; }

    protected ConditionValue _bookName;
    public ConditionValue getBookName()
    { if (_bookName == null) { _bookName = nCV(); }
      return _bookName; }
    protected ConditionValue getCValueBookName() { return getBookName(); }

    /** 
     * Add order-by as ascend. <br />
     * BOOK_NAME: {NotNull, VARCHAR(80)}
     * @return this. (NotNull)
     */
    public LdBsBookCQ addOrderBy_BookName_Asc() { regOBA("BOOK_NAME"); return this; }

    /**
     * Add order-by as descend. <br />
     * BOOK_NAME: {NotNull, VARCHAR(80)}
     * @return this. (NotNull)
     */
    public LdBsBookCQ addOrderBy_BookName_Desc() { regOBD("BOOK_NAME"); return this; }

    protected ConditionValue _authorId;
    public ConditionValue getAuthorId()
    { if (_authorId == null) { _authorId = nCV(); }
      return _authorId; }
    protected ConditionValue getCValueAuthorId() { return getAuthorId(); }

    public Map<String, LdAuthorCQ> getAuthorId_InScopeRelation_Author() { return xgetSQueMap("authorId_InScopeRelation_Author"); }
    public String keepAuthorId_InScopeRelation_Author(LdAuthorCQ sq) { return xkeepSQue("authorId_InScopeRelation_Author", sq); }

    public Map<String, LdAuthorCQ> getAuthorId_NotInScopeRelation_Author() { return xgetSQueMap("authorId_NotInScopeRelation_Author"); }
    public String keepAuthorId_NotInScopeRelation_Author(LdAuthorCQ sq) { return xkeepSQue("authorId_NotInScopeRelation_Author", sq); }

    /** 
     * Add order-by as ascend. <br />
     * AUTHOR_ID: {IX, NotNull, INTEGER(10), FK to AUTHOR}
     * @return this. (NotNull)
     */
    public LdBsBookCQ addOrderBy_AuthorId_Asc() { regOBA("AUTHOR_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * AUTHOR_ID: {IX, NotNull, INTEGER(10), FK to AUTHOR}
     * @return this. (NotNull)
     */
    public LdBsBookCQ addOrderBy_AuthorId_Desc() { regOBD("AUTHOR_ID"); return this; }

    protected ConditionValue _publisherId;
    public ConditionValue getPublisherId()
    { if (_publisherId == null) { _publisherId = nCV(); }
      return _publisherId; }
    protected ConditionValue getCValuePublisherId() { return getPublisherId(); }

    public Map<String, LdPublisherCQ> getPublisherId_InScopeRelation_Publisher() { return xgetSQueMap("publisherId_InScopeRelation_Publisher"); }
    public String keepPublisherId_InScopeRelation_Publisher(LdPublisherCQ sq) { return xkeepSQue("publisherId_InScopeRelation_Publisher", sq); }

    public Map<String, LdPublisherCQ> getPublisherId_NotInScopeRelation_Publisher() { return xgetSQueMap("publisherId_NotInScopeRelation_Publisher"); }
    public String keepPublisherId_NotInScopeRelation_Publisher(LdPublisherCQ sq) { return xkeepSQue("publisherId_NotInScopeRelation_Publisher", sq); }

    /** 
     * Add order-by as ascend. <br />
     * PUBLISHER_ID: {IX, NotNull, INTEGER(10), FK to PUBLISHER}
     * @return this. (NotNull)
     */
    public LdBsBookCQ addOrderBy_PublisherId_Asc() { regOBA("PUBLISHER_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * PUBLISHER_ID: {IX, NotNull, INTEGER(10), FK to PUBLISHER}
     * @return this. (NotNull)
     */
    public LdBsBookCQ addOrderBy_PublisherId_Desc() { regOBD("PUBLISHER_ID"); return this; }

    protected ConditionValue _genreCode;
    public ConditionValue getGenreCode()
    { if (_genreCode == null) { _genreCode = nCV(); }
      return _genreCode; }
    protected ConditionValue getCValueGenreCode() { return getGenreCode(); }

    public Map<String, LdGenreCQ> getGenreCode_InScopeRelation_Genre() { return xgetSQueMap("genreCode_InScopeRelation_Genre"); }
    public String keepGenreCode_InScopeRelation_Genre(LdGenreCQ sq) { return xkeepSQue("genreCode_InScopeRelation_Genre", sq); }

    public Map<String, LdGenreCQ> getGenreCode_NotInScopeRelation_Genre() { return xgetSQueMap("genreCode_NotInScopeRelation_Genre"); }
    public String keepGenreCode_NotInScopeRelation_Genre(LdGenreCQ sq) { return xkeepSQue("genreCode_NotInScopeRelation_Genre", sq); }

    /** 
     * Add order-by as ascend. <br />
     * GENRE_CODE: {IX, VARCHAR(24), FK to GENRE}
     * @return this. (NotNull)
     */
    public LdBsBookCQ addOrderBy_GenreCode_Asc() { regOBA("GENRE_CODE"); return this; }

    /**
     * Add order-by as descend. <br />
     * GENRE_CODE: {IX, VARCHAR(24), FK to GENRE}
     * @return this. (NotNull)
     */
    public LdBsBookCQ addOrderBy_GenreCode_Desc() { regOBD("GENRE_CODE"); return this; }

    protected ConditionValue _openingPart;
    public ConditionValue getOpeningPart()
    { if (_openingPart == null) { _openingPart = nCV(); }
      return _openingPart; }
    protected ConditionValue getCValueOpeningPart() { return getOpeningPart(); }

    /** 
     * Add order-by as ascend. <br />
     * OPENING_PART: {CLOB(2147483647)}
     * @return this. (NotNull)
     */
    public LdBsBookCQ addOrderBy_OpeningPart_Asc() { regOBA("OPENING_PART"); return this; }

    /**
     * Add order-by as descend. <br />
     * OPENING_PART: {CLOB(2147483647)}
     * @return this. (NotNull)
     */
    public LdBsBookCQ addOrderBy_OpeningPart_Desc() { regOBD("OPENING_PART"); return this; }

    protected ConditionValue _maxLendingDateCount;
    public ConditionValue getMaxLendingDateCount()
    { if (_maxLendingDateCount == null) { _maxLendingDateCount = nCV(); }
      return _maxLendingDateCount; }
    protected ConditionValue getCValueMaxLendingDateCount() { return getMaxLendingDateCount(); }

    /** 
     * Add order-by as ascend. <br />
     * MAX_LENDING_DATE_COUNT: {NotNull, SMALLINT(5)}
     * @return this. (NotNull)
     */
    public LdBsBookCQ addOrderBy_MaxLendingDateCount_Asc() { regOBA("MAX_LENDING_DATE_COUNT"); return this; }

    /**
     * Add order-by as descend. <br />
     * MAX_LENDING_DATE_COUNT: {NotNull, SMALLINT(5)}
     * @return this. (NotNull)
     */
    public LdBsBookCQ addOrderBy_MaxLendingDateCount_Desc() { regOBD("MAX_LENDING_DATE_COUNT"); return this; }

    protected ConditionValue _outOfUserSelectYn;
    public ConditionValue getOutOfUserSelectYn()
    { if (_outOfUserSelectYn == null) { _outOfUserSelectYn = nCV(); }
      return _outOfUserSelectYn; }
    protected ConditionValue getCValueOutOfUserSelectYn() { return getOutOfUserSelectYn(); }

    /** 
     * Add order-by as ascend. <br />
     * OUT_OF_USER_SELECT_YN: {NotNull, CHAR(1), classification=YesNo}
     * @return this. (NotNull)
     */
    public LdBsBookCQ addOrderBy_OutOfUserSelectYn_Asc() { regOBA("OUT_OF_USER_SELECT_YN"); return this; }

    /**
     * Add order-by as descend. <br />
     * OUT_OF_USER_SELECT_YN: {NotNull, CHAR(1), classification=YesNo}
     * @return this. (NotNull)
     */
    public LdBsBookCQ addOrderBy_OutOfUserSelectYn_Desc() { regOBD("OUT_OF_USER_SELECT_YN"); return this; }

    protected ConditionValue _outOfUserSelectReason;
    public ConditionValue getOutOfUserSelectReason()
    { if (_outOfUserSelectReason == null) { _outOfUserSelectReason = nCV(); }
      return _outOfUserSelectReason; }
    protected ConditionValue getCValueOutOfUserSelectReason() { return getOutOfUserSelectReason(); }

    /** 
     * Add order-by as ascend. <br />
     * OUT_OF_USER_SELECT_REASON: {VARCHAR(200)}
     * @return this. (NotNull)
     */
    public LdBsBookCQ addOrderBy_OutOfUserSelectReason_Asc() { regOBA("OUT_OF_USER_SELECT_REASON"); return this; }

    /**
     * Add order-by as descend. <br />
     * OUT_OF_USER_SELECT_REASON: {VARCHAR(200)}
     * @return this. (NotNull)
     */
    public LdBsBookCQ addOrderBy_OutOfUserSelectReason_Desc() { regOBD("OUT_OF_USER_SELECT_REASON"); return this; }

    protected ConditionValue _rUser;
    public ConditionValue getRUser()
    { if (_rUser == null) { _rUser = nCV(); }
      return _rUser; }
    protected ConditionValue getCValueRUser() { return getRUser(); }

    /** 
     * Add order-by as ascend. <br />
     * R_USER: {NotNull, VARCHAR(100), default=[default-user]}
     * @return this. (NotNull)
     */
    public LdBsBookCQ addOrderBy_RUser_Asc() { regOBA("R_USER"); return this; }

    /**
     * Add order-by as descend. <br />
     * R_USER: {NotNull, VARCHAR(100), default=[default-user]}
     * @return this. (NotNull)
     */
    public LdBsBookCQ addOrderBy_RUser_Desc() { regOBD("R_USER"); return this; }

    protected ConditionValue _rModule;
    public ConditionValue getRModule()
    { if (_rModule == null) { _rModule = nCV(); }
      return _rModule; }
    protected ConditionValue getCValueRModule() { return getRModule(); }

    /** 
     * Add order-by as ascend. <br />
     * R_MODULE: {NotNull, VARCHAR(100), default=[default-module], classification=RegisterModuleType}
     * @return this. (NotNull)
     */
    public LdBsBookCQ addOrderBy_RModule_Asc() { regOBA("R_MODULE"); return this; }

    /**
     * Add order-by as descend. <br />
     * R_MODULE: {NotNull, VARCHAR(100), default=[default-module], classification=RegisterModuleType}
     * @return this. (NotNull)
     */
    public LdBsBookCQ addOrderBy_RModule_Desc() { regOBD("R_MODULE"); return this; }

    protected ConditionValue _rTimestamp;
    public ConditionValue getRTimestamp()
    { if (_rTimestamp == null) { _rTimestamp = nCV(); }
      return _rTimestamp; }
    protected ConditionValue getCValueRTimestamp() { return getRTimestamp(); }

    /** 
     * Add order-by as ascend. <br />
     * R_TIMESTAMP: {NotNull, TIMESTAMP(26, 6), default=[CURRENT_TIMESTAMP]}
     * @return this. (NotNull)
     */
    public LdBsBookCQ addOrderBy_RTimestamp_Asc() { regOBA("R_TIMESTAMP"); return this; }

    /**
     * Add order-by as descend. <br />
     * R_TIMESTAMP: {NotNull, TIMESTAMP(26, 6), default=[CURRENT_TIMESTAMP]}
     * @return this. (NotNull)
     */
    public LdBsBookCQ addOrderBy_RTimestamp_Desc() { regOBD("R_TIMESTAMP"); return this; }

    protected ConditionValue _uUser;
    public ConditionValue getUUser()
    { if (_uUser == null) { _uUser = nCV(); }
      return _uUser; }
    protected ConditionValue getCValueUUser() { return getUUser(); }

    /** 
     * Add order-by as ascend. <br />
     * U_USER: {NotNull, VARCHAR(100), default=[default-user]}
     * @return this. (NotNull)
     */
    public LdBsBookCQ addOrderBy_UUser_Asc() { regOBA("U_USER"); return this; }

    /**
     * Add order-by as descend. <br />
     * U_USER: {NotNull, VARCHAR(100), default=[default-user]}
     * @return this. (NotNull)
     */
    public LdBsBookCQ addOrderBy_UUser_Desc() { regOBD("U_USER"); return this; }

    protected ConditionValue _uModule;
    public ConditionValue getUModule()
    { if (_uModule == null) { _uModule = nCV(); }
      return _uModule; }
    protected ConditionValue getCValueUModule() { return getUModule(); }

    /** 
     * Add order-by as ascend. <br />
     * U_MODULE: {NotNull, VARCHAR(100), default=[default-module], classification=UpdateModuleType}
     * @return this. (NotNull)
     */
    public LdBsBookCQ addOrderBy_UModule_Asc() { regOBA("U_MODULE"); return this; }

    /**
     * Add order-by as descend. <br />
     * U_MODULE: {NotNull, VARCHAR(100), default=[default-module], classification=UpdateModuleType}
     * @return this. (NotNull)
     */
    public LdBsBookCQ addOrderBy_UModule_Desc() { regOBD("U_MODULE"); return this; }

    protected ConditionValue _uTimestamp;
    public ConditionValue getUTimestamp()
    { if (_uTimestamp == null) { _uTimestamp = nCV(); }
      return _uTimestamp; }
    protected ConditionValue getCValueUTimestamp() { return getUTimestamp(); }

    /** 
     * Add order-by as ascend. <br />
     * U_TIMESTAMP: {NotNull, TIMESTAMP(26, 6), default=[CURRENT_TIMESTAMP]}
     * @return this. (NotNull)
     */
    public LdBsBookCQ addOrderBy_UTimestamp_Asc() { regOBA("U_TIMESTAMP"); return this; }

    /**
     * Add order-by as descend. <br />
     * U_TIMESTAMP: {NotNull, TIMESTAMP(26, 6), default=[CURRENT_TIMESTAMP]}
     * @return this. (NotNull)
     */
    public LdBsBookCQ addOrderBy_UTimestamp_Desc() { regOBD("U_TIMESTAMP"); return this; }

    // ===================================================================================
    //                                                             SpecifiedDerivedOrderBy
    //                                                             =======================
    /**
     * Add order-by for specified derived column as ascend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #DD4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] asc</span>
     * cb.<span style="color: #DD4747">addSpecifiedDerivedOrderBy_Asc</span>(<span style="color: #DD4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public LdBsBookCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

    /**
     * Add order-by for specified derived column as descend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #DD4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] desc</span>
     * cb.<span style="color: #DD4747">addSpecifiedDerivedOrderBy_Desc</span>(<span style="color: #DD4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public LdBsBookCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        LdBookCQ bq = (LdBookCQ)bqs;
        LdBookCQ uq = (LdBookCQ)uqs;
        if (bq.hasConditionQueryAuthor()) {
            uq.queryAuthor().reflectRelationOnUnionQuery(bq.queryAuthor(), uq.queryAuthor());
        }
        if (bq.hasConditionQueryGenre()) {
            uq.queryGenre().reflectRelationOnUnionQuery(bq.queryGenre(), uq.queryGenre());
        }
        if (bq.hasConditionQueryPublisher()) {
            uq.queryPublisher().reflectRelationOnUnionQuery(bq.queryPublisher(), uq.queryPublisher());
        }
        if (bq.hasConditionQueryCollectionStatusLookupAsNonExist()) {
            uq.queryCollectionStatusLookupAsNonExist().reflectRelationOnUnionQuery(bq.queryCollectionStatusLookupAsNonExist(), uq.queryCollectionStatusLookupAsNonExist());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br />
     * AUTHOR by my AUTHOR_ID, named 'author'.
     * @return The instance of condition-query. (NotNull)
     */
    public LdAuthorCQ queryAuthor() {
        return getConditionQueryAuthor();
    }
    public LdAuthorCQ getConditionQueryAuthor() {
        String prop = "author";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryAuthor()); xsetupOuterJoinAuthor(); }
        return xgetQueRlMap(prop);
    }
    protected LdAuthorCQ xcreateQueryAuthor() {
        String nrp = xresolveNRP("BOOK", "author"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new LdAuthorCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "author", nrp);
    }
    protected void xsetupOuterJoinAuthor() { xregOutJo("author"); }
    public boolean hasConditionQueryAuthor() { return xhasQueRlMap("author"); }

    /**
     * Get the condition-query for relation table. <br />
     * GENRE by my GENRE_CODE, named 'genre'.
     * @return The instance of condition-query. (NotNull)
     */
    public LdGenreCQ queryGenre() {
        return getConditionQueryGenre();
    }
    public LdGenreCQ getConditionQueryGenre() {
        String prop = "genre";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryGenre()); xsetupOuterJoinGenre(); }
        return xgetQueRlMap(prop);
    }
    protected LdGenreCQ xcreateQueryGenre() {
        String nrp = xresolveNRP("BOOK", "genre"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new LdGenreCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "genre", nrp);
    }
    protected void xsetupOuterJoinGenre() { xregOutJo("genre"); }
    public boolean hasConditionQueryGenre() { return xhasQueRlMap("genre"); }

    /**
     * Get the condition-query for relation table. <br />
     * PUBLISHER by my PUBLISHER_ID, named 'publisher'.
     * @return The instance of condition-query. (NotNull)
     */
    public LdPublisherCQ queryPublisher() {
        return getConditionQueryPublisher();
    }
    public LdPublisherCQ getConditionQueryPublisher() {
        String prop = "publisher";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryPublisher()); xsetupOuterJoinPublisher(); }
        return xgetQueRlMap(prop);
    }
    protected LdPublisherCQ xcreateQueryPublisher() {
        String nrp = xresolveNRP("BOOK", "publisher"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new LdPublisherCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "publisher", nrp);
    }
    protected void xsetupOuterJoinPublisher() { xregOutJo("publisher"); }
    public boolean hasConditionQueryPublisher() { return xhasQueRlMap("publisher"); }

    /**
     * Get the condition-query for relation table. <br />
     * COLLECTION_STATUS_LOOKUP by my GENRE_CODE, named 'collectionStatusLookupAsNonExist'.
     * @return The instance of condition-query. (NotNull)
     */
    public LdCollectionStatusLookupCQ queryCollectionStatusLookupAsNonExist() {
        return getConditionQueryCollectionStatusLookupAsNonExist();
    }
    public LdCollectionStatusLookupCQ getConditionQueryCollectionStatusLookupAsNonExist() {
        String prop = "collectionStatusLookupAsNonExist";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryCollectionStatusLookupAsNonExist()); xsetupOuterJoinCollectionStatusLookupAsNonExist(); }
        return xgetQueRlMap(prop);
    }
    protected LdCollectionStatusLookupCQ xcreateQueryCollectionStatusLookupAsNonExist() {
        String nrp = xresolveNRP("BOOK", "collectionStatusLookupAsNonExist"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new LdCollectionStatusLookupCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "collectionStatusLookupAsNonExist", nrp);
    }
    protected void xsetupOuterJoinCollectionStatusLookupAsNonExist() { xregOutJo("collectionStatusLookupAsNonExist"); }
    public boolean hasConditionQueryCollectionStatusLookupAsNonExist() { return xhasQueRlMap("collectionStatusLookupAsNonExist"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, LdBookCQ> getScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(LdBookCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, LdBookCQ> getSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(LdBookCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, LdBookCQ> getQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(LdBookCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> getQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, LdBookCQ> _myselfExistsMap;
    public Map<String, LdBookCQ> getMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(LdBookCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, LdBookCQ> getMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(LdBookCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return LdBookCB.class.getName(); }
    protected String xCQ() { return LdBookCQ.class.getName(); }
    protected String xCHp() { return HpCalculator.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
