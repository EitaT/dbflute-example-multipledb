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
 * The base condition-query of COLLECTION.
 * @author DBFlute(AutoGenerator)
 */
public class LdBsCollectionCQ extends LdAbstractBsCollectionCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected LdCollectionCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public LdBsCollectionCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from COLLECTION) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public LdCollectionCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected LdCollectionCIQ xcreateCIQ() {
        LdCollectionCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected LdCollectionCIQ xnewCIQ() {
        return new LdCollectionCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join COLLECTION on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public LdCollectionCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        LdCollectionCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected ConditionValue _collectionId;
    public ConditionValue getCollectionId() {
        if (_collectionId == null) { _collectionId = nCV(); }
        return _collectionId;
    }
    protected ConditionValue getCValueCollectionId() { return getCollectionId(); }

    protected Map<String, LdCollectionStatusCQ> _collectionId_ExistsReferrer_CollectionStatusAsOneMap;
    public Map<String, LdCollectionStatusCQ> getCollectionId_ExistsReferrer_CollectionStatusAsOne() { return _collectionId_ExistsReferrer_CollectionStatusAsOneMap; }
    public String keepCollectionId_ExistsReferrer_CollectionStatusAsOne(LdCollectionStatusCQ sq) {
        if (_collectionId_ExistsReferrer_CollectionStatusAsOneMap == null) { _collectionId_ExistsReferrer_CollectionStatusAsOneMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_collectionId_ExistsReferrer_CollectionStatusAsOneMap.size() + 1);
        _collectionId_ExistsReferrer_CollectionStatusAsOneMap.put(ky, sq); return "collectionId_ExistsReferrer_CollectionStatusAsOne." + ky;
    }

    protected Map<String, LdLendingCollectionCQ> _collectionId_ExistsReferrer_LendingCollectionListMap;
    public Map<String, LdLendingCollectionCQ> getCollectionId_ExistsReferrer_LendingCollectionList() { return _collectionId_ExistsReferrer_LendingCollectionListMap; }
    public String keepCollectionId_ExistsReferrer_LendingCollectionList(LdLendingCollectionCQ sq) {
        if (_collectionId_ExistsReferrer_LendingCollectionListMap == null) { _collectionId_ExistsReferrer_LendingCollectionListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_collectionId_ExistsReferrer_LendingCollectionListMap.size() + 1);
        _collectionId_ExistsReferrer_LendingCollectionListMap.put(ky, sq); return "collectionId_ExistsReferrer_LendingCollectionList." + ky;
    }

    protected Map<String, LdCollectionStatusCQ> _collectionId_NotExistsReferrer_CollectionStatusAsOneMap;
    public Map<String, LdCollectionStatusCQ> getCollectionId_NotExistsReferrer_CollectionStatusAsOne() { return _collectionId_NotExistsReferrer_CollectionStatusAsOneMap; }
    public String keepCollectionId_NotExistsReferrer_CollectionStatusAsOne(LdCollectionStatusCQ sq) {
        if (_collectionId_NotExistsReferrer_CollectionStatusAsOneMap == null) { _collectionId_NotExistsReferrer_CollectionStatusAsOneMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_collectionId_NotExistsReferrer_CollectionStatusAsOneMap.size() + 1);
        _collectionId_NotExistsReferrer_CollectionStatusAsOneMap.put(ky, sq); return "collectionId_NotExistsReferrer_CollectionStatusAsOne." + ky;
    }

    protected Map<String, LdLendingCollectionCQ> _collectionId_NotExistsReferrer_LendingCollectionListMap;
    public Map<String, LdLendingCollectionCQ> getCollectionId_NotExistsReferrer_LendingCollectionList() { return _collectionId_NotExistsReferrer_LendingCollectionListMap; }
    public String keepCollectionId_NotExistsReferrer_LendingCollectionList(LdLendingCollectionCQ sq) {
        if (_collectionId_NotExistsReferrer_LendingCollectionListMap == null) { _collectionId_NotExistsReferrer_LendingCollectionListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_collectionId_NotExistsReferrer_LendingCollectionListMap.size() + 1);
        _collectionId_NotExistsReferrer_LendingCollectionListMap.put(ky, sq); return "collectionId_NotExistsReferrer_LendingCollectionList." + ky;
    }

    protected Map<String, LdLendingCollectionCQ> _collectionId_SpecifyDerivedReferrer_LendingCollectionListMap;
    public Map<String, LdLendingCollectionCQ> getCollectionId_SpecifyDerivedReferrer_LendingCollectionList() { return _collectionId_SpecifyDerivedReferrer_LendingCollectionListMap; }
    public String keepCollectionId_SpecifyDerivedReferrer_LendingCollectionList(LdLendingCollectionCQ sq) {
        if (_collectionId_SpecifyDerivedReferrer_LendingCollectionListMap == null) { _collectionId_SpecifyDerivedReferrer_LendingCollectionListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_collectionId_SpecifyDerivedReferrer_LendingCollectionListMap.size() + 1);
        _collectionId_SpecifyDerivedReferrer_LendingCollectionListMap.put(ky, sq); return "collectionId_SpecifyDerivedReferrer_LendingCollectionList." + ky;
    }

    protected Map<String, LdCollectionStatusCQ> _collectionId_InScopeRelation_CollectionStatusAsOneMap;
    public Map<String, LdCollectionStatusCQ> getCollectionId_InScopeRelation_CollectionStatusAsOne() { return _collectionId_InScopeRelation_CollectionStatusAsOneMap; }
    public String keepCollectionId_InScopeRelation_CollectionStatusAsOne(LdCollectionStatusCQ sq) {
        if (_collectionId_InScopeRelation_CollectionStatusAsOneMap == null) { _collectionId_InScopeRelation_CollectionStatusAsOneMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_collectionId_InScopeRelation_CollectionStatusAsOneMap.size() + 1);
        _collectionId_InScopeRelation_CollectionStatusAsOneMap.put(ky, sq); return "collectionId_InScopeRelation_CollectionStatusAsOne." + ky;
    }

    protected Map<String, LdLendingCollectionCQ> _collectionId_InScopeRelation_LendingCollectionListMap;
    public Map<String, LdLendingCollectionCQ> getCollectionId_InScopeRelation_LendingCollectionList() { return _collectionId_InScopeRelation_LendingCollectionListMap; }
    public String keepCollectionId_InScopeRelation_LendingCollectionList(LdLendingCollectionCQ sq) {
        if (_collectionId_InScopeRelation_LendingCollectionListMap == null) { _collectionId_InScopeRelation_LendingCollectionListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_collectionId_InScopeRelation_LendingCollectionListMap.size() + 1);
        _collectionId_InScopeRelation_LendingCollectionListMap.put(ky, sq); return "collectionId_InScopeRelation_LendingCollectionList." + ky;
    }

    protected Map<String, LdCollectionStatusCQ> _collectionId_NotInScopeRelation_CollectionStatusAsOneMap;
    public Map<String, LdCollectionStatusCQ> getCollectionId_NotInScopeRelation_CollectionStatusAsOne() { return _collectionId_NotInScopeRelation_CollectionStatusAsOneMap; }
    public String keepCollectionId_NotInScopeRelation_CollectionStatusAsOne(LdCollectionStatusCQ sq) {
        if (_collectionId_NotInScopeRelation_CollectionStatusAsOneMap == null) { _collectionId_NotInScopeRelation_CollectionStatusAsOneMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_collectionId_NotInScopeRelation_CollectionStatusAsOneMap.size() + 1);
        _collectionId_NotInScopeRelation_CollectionStatusAsOneMap.put(ky, sq); return "collectionId_NotInScopeRelation_CollectionStatusAsOne." + ky;
    }

    protected Map<String, LdLendingCollectionCQ> _collectionId_NotInScopeRelation_LendingCollectionListMap;
    public Map<String, LdLendingCollectionCQ> getCollectionId_NotInScopeRelation_LendingCollectionList() { return _collectionId_NotInScopeRelation_LendingCollectionListMap; }
    public String keepCollectionId_NotInScopeRelation_LendingCollectionList(LdLendingCollectionCQ sq) {
        if (_collectionId_NotInScopeRelation_LendingCollectionListMap == null) { _collectionId_NotInScopeRelation_LendingCollectionListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_collectionId_NotInScopeRelation_LendingCollectionListMap.size() + 1);
        _collectionId_NotInScopeRelation_LendingCollectionListMap.put(ky, sq); return "collectionId_NotInScopeRelation_LendingCollectionList." + ky;
    }

    protected Map<String, LdLendingCollectionCQ> _collectionId_QueryDerivedReferrer_LendingCollectionListMap;
    public Map<String, LdLendingCollectionCQ> getCollectionId_QueryDerivedReferrer_LendingCollectionList() { return _collectionId_QueryDerivedReferrer_LendingCollectionListMap; }
    public String keepCollectionId_QueryDerivedReferrer_LendingCollectionList(LdLendingCollectionCQ sq) {
        if (_collectionId_QueryDerivedReferrer_LendingCollectionListMap == null) { _collectionId_QueryDerivedReferrer_LendingCollectionListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_collectionId_QueryDerivedReferrer_LendingCollectionListMap.size() + 1);
        _collectionId_QueryDerivedReferrer_LendingCollectionListMap.put(ky, sq); return "collectionId_QueryDerivedReferrer_LendingCollectionList." + ky;
    }
    protected Map<String, Object> _collectionId_QueryDerivedReferrer_LendingCollectionListParameterMap;
    public Map<String, Object> getCollectionId_QueryDerivedReferrer_LendingCollectionListParameter() { return _collectionId_QueryDerivedReferrer_LendingCollectionListParameterMap; }
    public String keepCollectionId_QueryDerivedReferrer_LendingCollectionListParameter(Object vl) {
        if (_collectionId_QueryDerivedReferrer_LendingCollectionListParameterMap == null) { _collectionId_QueryDerivedReferrer_LendingCollectionListParameterMap = newLinkedHashMapSized(4); }
        String ky = "subQueryParameterKey" + (_collectionId_QueryDerivedReferrer_LendingCollectionListParameterMap.size() + 1);
        _collectionId_QueryDerivedReferrer_LendingCollectionListParameterMap.put(ky, vl); return "collectionId_QueryDerivedReferrer_LendingCollectionListParameter." + ky;
    }

    /** 
     * Add order-by as ascend. <br />
     * COLLECTION_ID: {PK, ID, NotNull, INTEGER(10)}
     * @return this. (NotNull)
     */
    public LdBsCollectionCQ addOrderBy_CollectionId_Asc() { regOBA("COLLECTION_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * COLLECTION_ID: {PK, ID, NotNull, INTEGER(10)}
     * @return this. (NotNull)
     */
    public LdBsCollectionCQ addOrderBy_CollectionId_Desc() { regOBD("COLLECTION_ID"); return this; }

    protected ConditionValue _libraryId;
    public ConditionValue getLibraryId() {
        if (_libraryId == null) { _libraryId = nCV(); }
        return _libraryId;
    }
    protected ConditionValue getCValueLibraryId() { return getLibraryId(); }

    protected Map<String, LdLibraryCQ> _libraryId_InScopeRelation_LibraryMap;
    public Map<String, LdLibraryCQ> getLibraryId_InScopeRelation_Library() { return _libraryId_InScopeRelation_LibraryMap; }
    public String keepLibraryId_InScopeRelation_Library(LdLibraryCQ sq) {
        if (_libraryId_InScopeRelation_LibraryMap == null) { _libraryId_InScopeRelation_LibraryMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_libraryId_InScopeRelation_LibraryMap.size() + 1);
        _libraryId_InScopeRelation_LibraryMap.put(ky, sq); return "libraryId_InScopeRelation_Library." + ky;
    }

    protected Map<String, LdLibraryCQ> _libraryId_NotInScopeRelation_LibraryMap;
    public Map<String, LdLibraryCQ> getLibraryId_NotInScopeRelation_Library() { return _libraryId_NotInScopeRelation_LibraryMap; }
    public String keepLibraryId_NotInScopeRelation_Library(LdLibraryCQ sq) {
        if (_libraryId_NotInScopeRelation_LibraryMap == null) { _libraryId_NotInScopeRelation_LibraryMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_libraryId_NotInScopeRelation_LibraryMap.size() + 1);
        _libraryId_NotInScopeRelation_LibraryMap.put(ky, sq); return "libraryId_NotInScopeRelation_Library." + ky;
    }

    /** 
     * Add order-by as ascend. <br />
     * LIBRARY_ID: {UQ, IX, NotNull, SMALLINT(5), FK to LIBRARY}
     * @return this. (NotNull)
     */
    public LdBsCollectionCQ addOrderBy_LibraryId_Asc() { regOBA("LIBRARY_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * LIBRARY_ID: {UQ, IX, NotNull, SMALLINT(5), FK to LIBRARY}
     * @return this. (NotNull)
     */
    public LdBsCollectionCQ addOrderBy_LibraryId_Desc() { regOBD("LIBRARY_ID"); return this; }

    protected ConditionValue _bookId;
    public ConditionValue getBookId() {
        if (_bookId == null) { _bookId = nCV(); }
        return _bookId;
    }
    protected ConditionValue getCValueBookId() { return getBookId(); }

    protected Map<String, LdBookCQ> _bookId_InScopeRelation_BookMap;
    public Map<String, LdBookCQ> getBookId_InScopeRelation_Book() { return _bookId_InScopeRelation_BookMap; }
    public String keepBookId_InScopeRelation_Book(LdBookCQ sq) {
        if (_bookId_InScopeRelation_BookMap == null) { _bookId_InScopeRelation_BookMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_bookId_InScopeRelation_BookMap.size() + 1);
        _bookId_InScopeRelation_BookMap.put(ky, sq); return "bookId_InScopeRelation_Book." + ky;
    }

    protected Map<String, LdBookCQ> _bookId_NotInScopeRelation_BookMap;
    public Map<String, LdBookCQ> getBookId_NotInScopeRelation_Book() { return _bookId_NotInScopeRelation_BookMap; }
    public String keepBookId_NotInScopeRelation_Book(LdBookCQ sq) {
        if (_bookId_NotInScopeRelation_BookMap == null) { _bookId_NotInScopeRelation_BookMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_bookId_NotInScopeRelation_BookMap.size() + 1);
        _bookId_NotInScopeRelation_BookMap.put(ky, sq); return "bookId_NotInScopeRelation_Book." + ky;
    }

    /** 
     * Add order-by as ascend. <br />
     * BOOK_ID: {UQ+, IX, NotNull, INTEGER(10), FK to BOOK}
     * @return this. (NotNull)
     */
    public LdBsCollectionCQ addOrderBy_BookId_Asc() { regOBA("BOOK_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * BOOK_ID: {UQ+, IX, NotNull, INTEGER(10), FK to BOOK}
     * @return this. (NotNull)
     */
    public LdBsCollectionCQ addOrderBy_BookId_Desc() { regOBD("BOOK_ID"); return this; }

    protected ConditionValue _arrivalDate;
    public ConditionValue getArrivalDate() {
        if (_arrivalDate == null) { _arrivalDate = nCV(); }
        return _arrivalDate;
    }
    protected ConditionValue getCValueArrivalDate() { return getArrivalDate(); }

    /** 
     * Add order-by as ascend. <br />
     * ARRIVAL_DATE: {NotNull, TIMESTAMP(26, 6)}
     * @return this. (NotNull)
     */
    public LdBsCollectionCQ addOrderBy_ArrivalDate_Asc() { regOBA("ARRIVAL_DATE"); return this; }

    /**
     * Add order-by as descend. <br />
     * ARRIVAL_DATE: {NotNull, TIMESTAMP(26, 6)}
     * @return this. (NotNull)
     */
    public LdBsCollectionCQ addOrderBy_ArrivalDate_Desc() { regOBD("ARRIVAL_DATE"); return this; }

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
    public LdBsCollectionCQ addOrderBy_RUser_Asc() { regOBA("R_USER"); return this; }

    /**
     * Add order-by as descend. <br />
     * R_USER: {NotNull, VARCHAR(100), default=[default-user]}
     * @return this. (NotNull)
     */
    public LdBsCollectionCQ addOrderBy_RUser_Desc() { regOBD("R_USER"); return this; }

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
    public LdBsCollectionCQ addOrderBy_RModule_Asc() { regOBA("R_MODULE"); return this; }

    /**
     * Add order-by as descend. <br />
     * R_MODULE: {NotNull, VARCHAR(100), default=[default-module]}
     * @return this. (NotNull)
     */
    public LdBsCollectionCQ addOrderBy_RModule_Desc() { regOBD("R_MODULE"); return this; }

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
    public LdBsCollectionCQ addOrderBy_RTimestamp_Asc() { regOBA("R_TIMESTAMP"); return this; }

    /**
     * Add order-by as descend. <br />
     * R_TIMESTAMP: {NotNull, TIMESTAMP(26, 6), default=[CURRENT_TIMESTAMP]}
     * @return this. (NotNull)
     */
    public LdBsCollectionCQ addOrderBy_RTimestamp_Desc() { regOBD("R_TIMESTAMP"); return this; }

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
    public LdBsCollectionCQ addOrderBy_UUser_Asc() { regOBA("U_USER"); return this; }

    /**
     * Add order-by as descend. <br />
     * U_USER: {NotNull, VARCHAR(100), default=[default-user]}
     * @return this. (NotNull)
     */
    public LdBsCollectionCQ addOrderBy_UUser_Desc() { regOBD("U_USER"); return this; }

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
    public LdBsCollectionCQ addOrderBy_UModule_Asc() { regOBA("U_MODULE"); return this; }

    /**
     * Add order-by as descend. <br />
     * U_MODULE: {NotNull, VARCHAR(100), default=[default-module]}
     * @return this. (NotNull)
     */
    public LdBsCollectionCQ addOrderBy_UModule_Desc() { regOBD("U_MODULE"); return this; }

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
    public LdBsCollectionCQ addOrderBy_UTimestamp_Asc() { regOBA("U_TIMESTAMP"); return this; }

    /**
     * Add order-by as descend. <br />
     * U_TIMESTAMP: {NotNull, TIMESTAMP(26, 6), default=[CURRENT_TIMESTAMP]}
     * @return this. (NotNull)
     */
    public LdBsCollectionCQ addOrderBy_UTimestamp_Desc() { regOBD("U_TIMESTAMP"); return this; }

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
    public LdBsCollectionCQ addSpecifiedDerivedOrderBy_Asc(String aliasName)
    { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public LdBsCollectionCQ addSpecifiedDerivedOrderBy_Desc(String aliasName)
    { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    protected void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        LdCollectionCQ bq = (LdCollectionCQ)bqs;
        LdCollectionCQ uq = (LdCollectionCQ)uqs;
        if (bq.hasConditionQueryBook()) {
            uq.queryBook().reflectRelationOnUnionQuery(bq.queryBook(), uq.queryBook());
        }
        if (bq.hasConditionQueryLibrary()) {
            uq.queryLibrary().reflectRelationOnUnionQuery(bq.queryLibrary(), uq.queryLibrary());
        }
        if (bq.hasConditionQueryCollectionStatusAsOne()) {
            uq.queryCollectionStatusAsOne().reflectRelationOnUnionQuery(bq.queryCollectionStatusAsOne(), uq.queryCollectionStatusAsOne());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br />
     * BOOK by my BOOK_ID, named 'book'.
     * @return The instance of condition-query. (NotNull)
     */
    public LdBookCQ queryBook() {
        return getConditionQueryBook();
    }
    protected LdBookCQ _conditionQueryBook;
    public LdBookCQ getConditionQueryBook() {
        if (_conditionQueryBook == null) {
            _conditionQueryBook = xcreateQueryBook();
            xsetupOuterJoinBook();
        }
        return _conditionQueryBook;
    }
    protected LdBookCQ xcreateQueryBook() {
        String nrp = resolveNextRelationPath("COLLECTION", "book");
        String jan = resolveJoinAliasName(nrp, xgetNextNestLevel());
        LdBookCQ cq = new LdBookCQ(this, xgetSqlClause(), jan, xgetNextNestLevel());
        cq.xsetBaseCB(_baseCB);
        cq.xsetForeignPropertyName("book");
        cq.xsetRelationPath(nrp); return cq;
    }
    protected void xsetupOuterJoinBook() {
        LdBookCQ cq = getConditionQueryBook();
        Map<String, String> joinOnMap = newLinkedHashMapSized(4);
        joinOnMap.put("BOOK_ID", "BOOK_ID");
        registerOuterJoin(cq, joinOnMap, "book");
    }
    public boolean hasConditionQueryBook() {
        return _conditionQueryBook != null;
    }

    /**
     * Get the condition-query for relation table. <br />
     * LIBRARY by my LIBRARY_ID, named 'library'.
     * @return The instance of condition-query. (NotNull)
     */
    public LdLibraryCQ queryLibrary() {
        return getConditionQueryLibrary();
    }
    protected LdLibraryCQ _conditionQueryLibrary;
    public LdLibraryCQ getConditionQueryLibrary() {
        if (_conditionQueryLibrary == null) {
            _conditionQueryLibrary = xcreateQueryLibrary();
            xsetupOuterJoinLibrary();
        }
        return _conditionQueryLibrary;
    }
    protected LdLibraryCQ xcreateQueryLibrary() {
        String nrp = resolveNextRelationPath("COLLECTION", "library");
        String jan = resolveJoinAliasName(nrp, xgetNextNestLevel());
        LdLibraryCQ cq = new LdLibraryCQ(this, xgetSqlClause(), jan, xgetNextNestLevel());
        cq.xsetBaseCB(_baseCB);
        cq.xsetForeignPropertyName("library");
        cq.xsetRelationPath(nrp); return cq;
    }
    protected void xsetupOuterJoinLibrary() {
        LdLibraryCQ cq = getConditionQueryLibrary();
        Map<String, String> joinOnMap = newLinkedHashMapSized(4);
        joinOnMap.put("LIBRARY_ID", "LIBRARY_ID");
        registerOuterJoin(cq, joinOnMap, "library");
    }
    public boolean hasConditionQueryLibrary() {
        return _conditionQueryLibrary != null;
    }

    /**
     * Get the condition-query for relation table. <br />
     * COLLECTION_STATUS by COLLECTION_ID, named 'collectionStatusAsOne'.
     * @return The instance of condition-query. (NotNull)
     */
    public LdCollectionStatusCQ queryCollectionStatusAsOne() {
        return getConditionQueryCollectionStatusAsOne();
    }
    protected LdCollectionStatusCQ _conditionQueryCollectionStatusAsOne;
    public LdCollectionStatusCQ getConditionQueryCollectionStatusAsOne() {
        if (_conditionQueryCollectionStatusAsOne == null) {
            _conditionQueryCollectionStatusAsOne = xcreateQueryCollectionStatusAsOne();
            xsetupOuterJoinCollectionStatusAsOne();
        }
        return _conditionQueryCollectionStatusAsOne;
    }
    protected LdCollectionStatusCQ xcreateQueryCollectionStatusAsOne() {
        String nrp = resolveNextRelationPath("COLLECTION", "collectionStatusAsOne");
        String jan = resolveJoinAliasName(nrp, xgetNextNestLevel());
        LdCollectionStatusCQ cq = new LdCollectionStatusCQ(this, xgetSqlClause(), jan, xgetNextNestLevel());
        cq.xsetBaseCB(_baseCB);
        cq.xsetForeignPropertyName("collectionStatusAsOne");
        cq.xsetRelationPath(nrp); return cq;
    }
    protected void xsetupOuterJoinCollectionStatusAsOne() {
        LdCollectionStatusCQ cq = getConditionQueryCollectionStatusAsOne();
        Map<String, String> joinOnMap = newLinkedHashMapSized(4);
        joinOnMap.put("COLLECTION_ID", "COLLECTION_ID");
        registerOuterJoin(cq, joinOnMap, "collectionStatusAsOne");
    }
    public boolean hasConditionQueryCollectionStatusAsOne() {
        return _conditionQueryCollectionStatusAsOne != null;
    }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    protected Map<String, LdCollectionCQ> _scalarConditionMap;
    public Map<String, LdCollectionCQ> getScalarCondition() { return _scalarConditionMap; }
    public String keepScalarCondition(LdCollectionCQ sq) {
        if (_scalarConditionMap == null) { _scalarConditionMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_scalarConditionMap.size() + 1);
        _scalarConditionMap.put(ky, sq); return "scalarCondition." + ky;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    protected Map<String, LdCollectionCQ> _specifyMyselfDerivedMap;
    public Map<String, LdCollectionCQ> getSpecifyMyselfDerived() { return _specifyMyselfDerivedMap; }
    public String keepSpecifyMyselfDerived(LdCollectionCQ sq) {
        if (_specifyMyselfDerivedMap == null) { _specifyMyselfDerivedMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_specifyMyselfDerivedMap.size() + 1);
        _specifyMyselfDerivedMap.put(ky, sq); return "specifyMyselfDerived." + ky;
    }

    protected Map<String, LdCollectionCQ> _queryMyselfDerivedMap;
    public Map<String, LdCollectionCQ> getQueryMyselfDerived() { return _queryMyselfDerivedMap; }
    public String keepQueryMyselfDerived(LdCollectionCQ sq) {
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
    protected Map<String, LdCollectionCQ> _myselfExistsMap;
    public Map<String, LdCollectionCQ> getMyselfExists() { return _myselfExistsMap; }
    public String keepMyselfExists(LdCollectionCQ sq) {
        if (_myselfExistsMap == null) { _myselfExistsMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_myselfExistsMap.size() + 1);
        _myselfExistsMap.put(ky, sq); return "myselfExists." + ky;
    }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    protected Map<String, LdCollectionCQ> _myselfInScopeMap;
    public Map<String, LdCollectionCQ> getMyselfInScope() { return _myselfInScopeMap; }
    public String keepMyselfInScope(LdCollectionCQ sq) {
        if (_myselfInScopeMap == null) { _myselfInScopeMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_myselfInScopeMap.size() + 1);
        _myselfInScopeMap.put(ky, sq); return "myselfInScope." + ky;
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return LdCollectionCB.class.getName(); }
    protected String xCQ() { return LdCollectionCQ.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
