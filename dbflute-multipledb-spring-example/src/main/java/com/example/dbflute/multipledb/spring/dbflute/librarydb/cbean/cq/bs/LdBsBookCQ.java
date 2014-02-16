/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */package com.example.dbflute.multipledb.spring.dbflute.librarydb.cbean.cq.bs;

import java.util.Map;

import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import org.seasar.dbflute.exception.IllegalConditionBeanOperationException;
import com.example.dbflute.multipledb.spring.dbflute.librarydb.cbean.cq.ciq.*;
import com.example.dbflute.multipledb.spring.dbflute.librarydb.cbean.*;
import com.example.dbflute.multipledb.spring.dbflute.librarydb.cbean.cq.*;

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
    public LdBsBookCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from BOOK) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">inline()</span>.setFoo...;
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
     * cb.query().queryMemberStatus().<span style="color: #FD4747">on()</span>.setFoo...;
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
    public ConditionValue getBookId() {
        if (_bookId == null) { _bookId = nCV(); }
        return _bookId;
    }
    protected ConditionValue getCValueBookId() { return getBookId(); }

    protected Map<String, LdCollectionCQ> _bookId_ExistsReferrer_CollectionListMap;
    public Map<String, LdCollectionCQ> getBookId_ExistsReferrer_CollectionList() { return _bookId_ExistsReferrer_CollectionListMap; }
    public String keepBookId_ExistsReferrer_CollectionList(LdCollectionCQ sq) {
        if (_bookId_ExistsReferrer_CollectionListMap == null) { _bookId_ExistsReferrer_CollectionListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_bookId_ExistsReferrer_CollectionListMap.size() + 1);
        _bookId_ExistsReferrer_CollectionListMap.put(ky, sq); return "bookId_ExistsReferrer_CollectionList." + ky;
    }

    protected Map<String, LdCollectionCQ> _bookId_NotExistsReferrer_CollectionListMap;
    public Map<String, LdCollectionCQ> getBookId_NotExistsReferrer_CollectionList() { return _bookId_NotExistsReferrer_CollectionListMap; }
    public String keepBookId_NotExistsReferrer_CollectionList(LdCollectionCQ sq) {
        if (_bookId_NotExistsReferrer_CollectionListMap == null) { _bookId_NotExistsReferrer_CollectionListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_bookId_NotExistsReferrer_CollectionListMap.size() + 1);
        _bookId_NotExistsReferrer_CollectionListMap.put(ky, sq); return "bookId_NotExistsReferrer_CollectionList." + ky;
    }

    protected Map<String, LdCollectionCQ> _bookId_SpecifyDerivedReferrer_CollectionListMap;
    public Map<String, LdCollectionCQ> getBookId_SpecifyDerivedReferrer_CollectionList() { return _bookId_SpecifyDerivedReferrer_CollectionListMap; }
    public String keepBookId_SpecifyDerivedReferrer_CollectionList(LdCollectionCQ sq) {
        if (_bookId_SpecifyDerivedReferrer_CollectionListMap == null) { _bookId_SpecifyDerivedReferrer_CollectionListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_bookId_SpecifyDerivedReferrer_CollectionListMap.size() + 1);
        _bookId_SpecifyDerivedReferrer_CollectionListMap.put(ky, sq); return "bookId_SpecifyDerivedReferrer_CollectionList." + ky;
    }

    protected Map<String, LdCollectionCQ> _bookId_InScopeRelation_CollectionListMap;
    public Map<String, LdCollectionCQ> getBookId_InScopeRelation_CollectionList() { return _bookId_InScopeRelation_CollectionListMap; }
    public String keepBookId_InScopeRelation_CollectionList(LdCollectionCQ sq) {
        if (_bookId_InScopeRelation_CollectionListMap == null) { _bookId_InScopeRelation_CollectionListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_bookId_InScopeRelation_CollectionListMap.size() + 1);
        _bookId_InScopeRelation_CollectionListMap.put(ky, sq); return "bookId_InScopeRelation_CollectionList." + ky;
    }

    protected Map<String, LdCollectionCQ> _bookId_NotInScopeRelation_CollectionListMap;
    public Map<String, LdCollectionCQ> getBookId_NotInScopeRelation_CollectionList() { return _bookId_NotInScopeRelation_CollectionListMap; }
    public String keepBookId_NotInScopeRelation_CollectionList(LdCollectionCQ sq) {
        if (_bookId_NotInScopeRelation_CollectionListMap == null) { _bookId_NotInScopeRelation_CollectionListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_bookId_NotInScopeRelation_CollectionListMap.size() + 1);
        _bookId_NotInScopeRelation_CollectionListMap.put(ky, sq); return "bookId_NotInScopeRelation_CollectionList." + ky;
    }

    protected Map<String, LdCollectionCQ> _bookId_QueryDerivedReferrer_CollectionListMap;
    public Map<String, LdCollectionCQ> getBookId_QueryDerivedReferrer_CollectionList() { return _bookId_QueryDerivedReferrer_CollectionListMap; }
    public String keepBookId_QueryDerivedReferrer_CollectionList(LdCollectionCQ sq) {
        if (_bookId_QueryDerivedReferrer_CollectionListMap == null) { _bookId_QueryDerivedReferrer_CollectionListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_bookId_QueryDerivedReferrer_CollectionListMap.size() + 1);
        _bookId_QueryDerivedReferrer_CollectionListMap.put(ky, sq); return "bookId_QueryDerivedReferrer_CollectionList." + ky;
    }
    protected Map<String, Object> _bookId_QueryDerivedReferrer_CollectionListParameterMap;
    public Map<String, Object> getBookId_QueryDerivedReferrer_CollectionListParameter() { return _bookId_QueryDerivedReferrer_CollectionListParameterMap; }
    public String keepBookId_QueryDerivedReferrer_CollectionListParameter(Object vl) {
        if (_bookId_QueryDerivedReferrer_CollectionListParameterMap == null) { _bookId_QueryDerivedReferrer_CollectionListParameterMap = newLinkedHashMapSized(4); }
        String ky = "subQueryParameterKey" + (_bookId_QueryDerivedReferrer_CollectionListParameterMap.size() + 1);
        _bookId_QueryDerivedReferrer_CollectionListParameterMap.put(ky, vl); return "bookId_QueryDerivedReferrer_CollectionListParameter." + ky;
    }

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
    public ConditionValue getIsbn() {
        if (_isbn == null) { _isbn = nCV(); }
        return _isbn;
    }
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
    public ConditionValue getBookName() {
        if (_bookName == null) { _bookName = nCV(); }
        return _bookName;
    }
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
    public ConditionValue getAuthorId() {
        if (_authorId == null) { _authorId = nCV(); }
        return _authorId;
    }
    protected ConditionValue getCValueAuthorId() { return getAuthorId(); }

    protected Map<String, LdAuthorCQ> _authorId_InScopeRelation_AuthorMap;
    public Map<String, LdAuthorCQ> getAuthorId_InScopeRelation_Author() { return _authorId_InScopeRelation_AuthorMap; }
    public String keepAuthorId_InScopeRelation_Author(LdAuthorCQ sq) {
        if (_authorId_InScopeRelation_AuthorMap == null) { _authorId_InScopeRelation_AuthorMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_authorId_InScopeRelation_AuthorMap.size() + 1);
        _authorId_InScopeRelation_AuthorMap.put(ky, sq); return "authorId_InScopeRelation_Author." + ky;
    }

    protected Map<String, LdAuthorCQ> _authorId_NotInScopeRelation_AuthorMap;
    public Map<String, LdAuthorCQ> getAuthorId_NotInScopeRelation_Author() { return _authorId_NotInScopeRelation_AuthorMap; }
    public String keepAuthorId_NotInScopeRelation_Author(LdAuthorCQ sq) {
        if (_authorId_NotInScopeRelation_AuthorMap == null) { _authorId_NotInScopeRelation_AuthorMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_authorId_NotInScopeRelation_AuthorMap.size() + 1);
        _authorId_NotInScopeRelation_AuthorMap.put(ky, sq); return "authorId_NotInScopeRelation_Author." + ky;
    }

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
    public ConditionValue getPublisherId() {
        if (_publisherId == null) { _publisherId = nCV(); }
        return _publisherId;
    }
    protected ConditionValue getCValuePublisherId() { return getPublisherId(); }

    protected Map<String, LdPublisherCQ> _publisherId_InScopeRelation_PublisherMap;
    public Map<String, LdPublisherCQ> getPublisherId_InScopeRelation_Publisher() { return _publisherId_InScopeRelation_PublisherMap; }
    public String keepPublisherId_InScopeRelation_Publisher(LdPublisherCQ sq) {
        if (_publisherId_InScopeRelation_PublisherMap == null) { _publisherId_InScopeRelation_PublisherMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_publisherId_InScopeRelation_PublisherMap.size() + 1);
        _publisherId_InScopeRelation_PublisherMap.put(ky, sq); return "publisherId_InScopeRelation_Publisher." + ky;
    }

    protected Map<String, LdPublisherCQ> _publisherId_NotInScopeRelation_PublisherMap;
    public Map<String, LdPublisherCQ> getPublisherId_NotInScopeRelation_Publisher() { return _publisherId_NotInScopeRelation_PublisherMap; }
    public String keepPublisherId_NotInScopeRelation_Publisher(LdPublisherCQ sq) {
        if (_publisherId_NotInScopeRelation_PublisherMap == null) { _publisherId_NotInScopeRelation_PublisherMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_publisherId_NotInScopeRelation_PublisherMap.size() + 1);
        _publisherId_NotInScopeRelation_PublisherMap.put(ky, sq); return "publisherId_NotInScopeRelation_Publisher." + ky;
    }

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
    public ConditionValue getGenreCode() {
        if (_genreCode == null) { _genreCode = nCV(); }
        return _genreCode;
    }
    protected ConditionValue getCValueGenreCode() { return getGenreCode(); }

    protected Map<String, LdGenreCQ> _genreCode_InScopeRelation_GenreMap;
    public Map<String, LdGenreCQ> getGenreCode_InScopeRelation_Genre() { return _genreCode_InScopeRelation_GenreMap; }
    public String keepGenreCode_InScopeRelation_Genre(LdGenreCQ sq) {
        if (_genreCode_InScopeRelation_GenreMap == null) { _genreCode_InScopeRelation_GenreMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_genreCode_InScopeRelation_GenreMap.size() + 1);
        _genreCode_InScopeRelation_GenreMap.put(ky, sq); return "genreCode_InScopeRelation_Genre." + ky;
    }

    protected Map<String, LdGenreCQ> _genreCode_NotInScopeRelation_GenreMap;
    public Map<String, LdGenreCQ> getGenreCode_NotInScopeRelation_Genre() { return _genreCode_NotInScopeRelation_GenreMap; }
    public String keepGenreCode_NotInScopeRelation_Genre(LdGenreCQ sq) {
        if (_genreCode_NotInScopeRelation_GenreMap == null) { _genreCode_NotInScopeRelation_GenreMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_genreCode_NotInScopeRelation_GenreMap.size() + 1);
        _genreCode_NotInScopeRelation_GenreMap.put(ky, sq); return "genreCode_NotInScopeRelation_Genre." + ky;
    }

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
    public ConditionValue getOpeningPart() {
        if (_openingPart == null) { _openingPart = nCV(); }
        return _openingPart;
    }
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
    public ConditionValue getMaxLendingDateCount() {
        if (_maxLendingDateCount == null) { _maxLendingDateCount = nCV(); }
        return _maxLendingDateCount;
    }
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
    public ConditionValue getOutOfUserSelectYn() {
        if (_outOfUserSelectYn == null) { _outOfUserSelectYn = nCV(); }
        return _outOfUserSelectYn;
    }
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
    public ConditionValue getOutOfUserSelectReason() {
        if (_outOfUserSelectReason == null) { _outOfUserSelectReason = nCV(); }
        return _outOfUserSelectReason;
    }
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
    public ConditionValue getRUser() {
        if (_rUser == null) { _rUser = nCV(); }
        return _rUser;
    }
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
    public ConditionValue getRModule() {
        if (_rModule == null) { _rModule = nCV(); }
        return _rModule;
    }
    protected ConditionValue getCValueRModule() { return getRModule(); }

    /** 
     * Add order-by as ascend. <br />
     * R_MODULE: {NotNull, VARCHAR(100), default=[default-module]}
     * @return this. (NotNull)
     */
    public LdBsBookCQ addOrderBy_RModule_Asc() { regOBA("R_MODULE"); return this; }

    /**
     * Add order-by as descend. <br />
     * R_MODULE: {NotNull, VARCHAR(100), default=[default-module]}
     * @return this. (NotNull)
     */
    public LdBsBookCQ addOrderBy_RModule_Desc() { regOBD("R_MODULE"); return this; }

    protected ConditionValue _rTimestamp;
    public ConditionValue getRTimestamp() {
        if (_rTimestamp == null) { _rTimestamp = nCV(); }
        return _rTimestamp;
    }
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
    public ConditionValue getUUser() {
        if (_uUser == null) { _uUser = nCV(); }
        return _uUser;
    }
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
    public ConditionValue getUModule() {
        if (_uModule == null) { _uModule = nCV(); }
        return _uModule;
    }
    protected ConditionValue getCValueUModule() { return getUModule(); }

    /** 
     * Add order-by as ascend. <br />
     * U_MODULE: {NotNull, VARCHAR(100), default=[default-module]}
     * @return this. (NotNull)
     */
    public LdBsBookCQ addOrderBy_UModule_Asc() { regOBA("U_MODULE"); return this; }

    /**
     * Add order-by as descend. <br />
     * U_MODULE: {NotNull, VARCHAR(100), default=[default-module]}
     * @return this. (NotNull)
     */
    public LdBsBookCQ addOrderBy_UModule_Desc() { regOBD("U_MODULE"); return this; }

    protected ConditionValue _uTimestamp;
    public ConditionValue getUTimestamp() {
        if (_uTimestamp == null) { _uTimestamp = nCV(); }
        return _uTimestamp;
    }
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
     * }, <span style="color: #FD4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] asc</span>
     * cb.<span style="color: #FD4747">addSpecifiedDerivedOrderBy_Asc</span>(<span style="color: #FD4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public LdBsBookCQ addSpecifiedDerivedOrderBy_Asc(String aliasName)
    { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

    /**
     * Add order-by for specified derived column as descend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #FD4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] desc</span>
     * cb.<span style="color: #FD4747">addSpecifiedDerivedOrderBy_Desc</span>(<span style="color: #FD4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public LdBsBookCQ addSpecifiedDerivedOrderBy_Desc(String aliasName)
    { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    protected void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
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
    protected LdAuthorCQ _conditionQueryAuthor;
    public LdAuthorCQ getConditionQueryAuthor() {
        if (_conditionQueryAuthor == null) {
            _conditionQueryAuthor = xcreateQueryAuthor();
            xsetupOuterJoinAuthor();
        }
        return _conditionQueryAuthor;
    }
    protected LdAuthorCQ xcreateQueryAuthor() {
        String nrp = resolveNextRelationPath("BOOK", "author");
        String jan = resolveJoinAliasName(nrp, xgetNextNestLevel());
        LdAuthorCQ cq = new LdAuthorCQ(this, xgetSqlClause(), jan, xgetNextNestLevel());
        cq.xsetBaseCB(_baseCB);
        cq.xsetForeignPropertyName("author");
        cq.xsetRelationPath(nrp); return cq;
    }
    protected void xsetupOuterJoinAuthor() {
        LdAuthorCQ cq = getConditionQueryAuthor();
        Map<String, String> joinOnMap = newLinkedHashMapSized(4);
        joinOnMap.put("AUTHOR_ID", "AUTHOR_ID");
        registerOuterJoin(cq, joinOnMap, "author");
    }
    public boolean hasConditionQueryAuthor() {
        return _conditionQueryAuthor != null;
    }

    /**
     * Get the condition-query for relation table. <br />
     * GENRE by my GENRE_CODE, named 'genre'.
     * @return The instance of condition-query. (NotNull)
     */
    public LdGenreCQ queryGenre() {
        return getConditionQueryGenre();
    }
    protected LdGenreCQ _conditionQueryGenre;
    public LdGenreCQ getConditionQueryGenre() {
        if (_conditionQueryGenre == null) {
            _conditionQueryGenre = xcreateQueryGenre();
            xsetupOuterJoinGenre();
        }
        return _conditionQueryGenre;
    }
    protected LdGenreCQ xcreateQueryGenre() {
        String nrp = resolveNextRelationPath("BOOK", "genre");
        String jan = resolveJoinAliasName(nrp, xgetNextNestLevel());
        LdGenreCQ cq = new LdGenreCQ(this, xgetSqlClause(), jan, xgetNextNestLevel());
        cq.xsetBaseCB(_baseCB);
        cq.xsetForeignPropertyName("genre");
        cq.xsetRelationPath(nrp); return cq;
    }
    protected void xsetupOuterJoinGenre() {
        LdGenreCQ cq = getConditionQueryGenre();
        Map<String, String> joinOnMap = newLinkedHashMapSized(4);
        joinOnMap.put("GENRE_CODE", "GENRE_CODE");
        registerOuterJoin(cq, joinOnMap, "genre");
    }
    public boolean hasConditionQueryGenre() {
        return _conditionQueryGenre != null;
    }

    /**
     * Get the condition-query for relation table. <br />
     * PUBLISHER by my PUBLISHER_ID, named 'publisher'.
     * @return The instance of condition-query. (NotNull)
     */
    public LdPublisherCQ queryPublisher() {
        return getConditionQueryPublisher();
    }
    protected LdPublisherCQ _conditionQueryPublisher;
    public LdPublisherCQ getConditionQueryPublisher() {
        if (_conditionQueryPublisher == null) {
            _conditionQueryPublisher = xcreateQueryPublisher();
            xsetupOuterJoinPublisher();
        }
        return _conditionQueryPublisher;
    }
    protected LdPublisherCQ xcreateQueryPublisher() {
        String nrp = resolveNextRelationPath("BOOK", "publisher");
        String jan = resolveJoinAliasName(nrp, xgetNextNestLevel());
        LdPublisherCQ cq = new LdPublisherCQ(this, xgetSqlClause(), jan, xgetNextNestLevel());
        cq.xsetBaseCB(_baseCB);
        cq.xsetForeignPropertyName("publisher");
        cq.xsetRelationPath(nrp); return cq;
    }
    protected void xsetupOuterJoinPublisher() {
        LdPublisherCQ cq = getConditionQueryPublisher();
        Map<String, String> joinOnMap = newLinkedHashMapSized(4);
        joinOnMap.put("PUBLISHER_ID", "PUBLISHER_ID");
        registerOuterJoin(cq, joinOnMap, "publisher");
    }
    public boolean hasConditionQueryPublisher() {
        return _conditionQueryPublisher != null;
    }

    /**
     * Get the condition-query for relation table. <br />
     * COLLECTION_STATUS_LOOKUP by my GENRE_CODE, named 'collectionStatusLookupAsNonExist'.
     * @return The instance of condition-query. (NotNull)
     */
    public LdCollectionStatusLookupCQ queryCollectionStatusLookupAsNonExist() {
        return getConditionQueryCollectionStatusLookupAsNonExist();
    }
    protected LdCollectionStatusLookupCQ _conditionQueryCollectionStatusLookupAsNonExist;
    public LdCollectionStatusLookupCQ getConditionQueryCollectionStatusLookupAsNonExist() {
        if (_conditionQueryCollectionStatusLookupAsNonExist == null) {
            _conditionQueryCollectionStatusLookupAsNonExist = xcreateQueryCollectionStatusLookupAsNonExist();
            xsetupOuterJoinCollectionStatusLookupAsNonExist();
        }
        return _conditionQueryCollectionStatusLookupAsNonExist;
    }
    protected LdCollectionStatusLookupCQ xcreateQueryCollectionStatusLookupAsNonExist() {
        String nrp = resolveNextRelationPath("BOOK", "collectionStatusLookupAsNonExist");
        String jan = resolveJoinAliasName(nrp, xgetNextNestLevel());
        LdCollectionStatusLookupCQ cq = new LdCollectionStatusLookupCQ(this, xgetSqlClause(), jan, xgetNextNestLevel());
        cq.xsetBaseCB(_baseCB);
        cq.xsetForeignPropertyName("collectionStatusLookupAsNonExist");
        cq.xsetRelationPath(nrp); return cq;
    }
    protected void xsetupOuterJoinCollectionStatusLookupAsNonExist() {
        LdCollectionStatusLookupCQ cq = getConditionQueryCollectionStatusLookupAsNonExist();
        Map<String, String> joinOnMap = newLinkedHashMapSized(4);
        joinOnMap.put("GENRE_CODE", "COLLECTION_STATUS_CODE");
        registerOuterJoin(cq, joinOnMap, "collectionStatusLookupAsNonExist");
    }
    public boolean hasConditionQueryCollectionStatusLookupAsNonExist() {
        return _conditionQueryCollectionStatusLookupAsNonExist != null;
    }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    protected Map<String, LdBookCQ> _scalarConditionMap;
    public Map<String, LdBookCQ> getScalarCondition() { return _scalarConditionMap; }
    public String keepScalarCondition(LdBookCQ sq) {
        if (_scalarConditionMap == null) { _scalarConditionMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_scalarConditionMap.size() + 1);
        _scalarConditionMap.put(ky, sq); return "scalarCondition." + ky;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    protected Map<String, LdBookCQ> _specifyMyselfDerivedMap;
    public Map<String, LdBookCQ> getSpecifyMyselfDerived() { return _specifyMyselfDerivedMap; }
    public String keepSpecifyMyselfDerived(LdBookCQ sq) {
        if (_specifyMyselfDerivedMap == null) { _specifyMyselfDerivedMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_specifyMyselfDerivedMap.size() + 1);
        _specifyMyselfDerivedMap.put(ky, sq); return "specifyMyselfDerived." + ky;
    }

    protected Map<String, LdBookCQ> _queryMyselfDerivedMap;
    public Map<String, LdBookCQ> getQueryMyselfDerived() { return _queryMyselfDerivedMap; }
    public String keepQueryMyselfDerived(LdBookCQ sq) {
        if (_queryMyselfDerivedMap == null) { _queryMyselfDerivedMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_queryMyselfDerivedMap.size() + 1);
        _queryMyselfDerivedMap.put(ky, sq); return "queryMyselfDerived." + ky;
    }
    protected Map<String, Object> _qyeryMyselfDerivedParameterMap;
    public Map<String, Object> getQueryMyselfDerivedParameter() { return _qyeryMyselfDerivedParameterMap; }
    public String keepQueryMyselfDerivedParameter(Object vl) {
        if (_qyeryMyselfDerivedParameterMap == null) { _qyeryMyselfDerivedParameterMap = newLinkedHashMapSized(4); }
        String ky = "subQueryParameterKey" + (_qyeryMyselfDerivedParameterMap.size() + 1);
        _qyeryMyselfDerivedParameterMap.put(ky, vl); return "queryMyselfDerivedParameter." + ky;
    }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, LdBookCQ> _myselfExistsMap;
    public Map<String, LdBookCQ> getMyselfExists() { return _myselfExistsMap; }
    public String keepMyselfExists(LdBookCQ sq) {
        if (_myselfExistsMap == null) { _myselfExistsMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_myselfExistsMap.size() + 1);
        _myselfExistsMap.put(ky, sq); return "myselfExists." + ky;
    }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    protected Map<String, LdBookCQ> _myselfInScopeMap;
    public Map<String, LdBookCQ> getMyselfInScope() { return _myselfInScopeMap; }
    public String keepMyselfInScope(LdBookCQ sq) {
        if (_myselfInScopeMap == null) { _myselfInScopeMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_myselfInScopeMap.size() + 1);
        _myselfInScopeMap.put(ky, sq); return "myselfInScope." + ky;
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return LdBookCB.class.getName(); }
    protected String xCQ() { return LdBookCQ.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
