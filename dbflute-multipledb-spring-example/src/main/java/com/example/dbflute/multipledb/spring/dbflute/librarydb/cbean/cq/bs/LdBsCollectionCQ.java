/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */package com.example.dbflute.multipledb.spring.dbflute.librarydb.cbean.cq.bs;

import java.util.Map;

import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.cbean.chelper.*;
import org.seasar.dbflute.cbean.coption.*;
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
    public LdBsCollectionCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
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
    public ConditionValue getCollectionId()
    { if (_collectionId == null) { _collectionId = nCV(); }
      return _collectionId; }
    protected ConditionValue getCValueCollectionId() { return getCollectionId(); }

    public Map<String, LdCollectionStatusCQ> getCollectionId_ExistsReferrer_CollectionStatusAsOne() { return xgetSQueMap("collectionId_ExistsReferrer_CollectionStatusAsOne"); }
    public String keepCollectionId_ExistsReferrer_CollectionStatusAsOne(LdCollectionStatusCQ sq) { return xkeepSQue("collectionId_ExistsReferrer_CollectionStatusAsOne", sq); }

    public Map<String, LdLendingCollectionCQ> getCollectionId_ExistsReferrer_LendingCollectionList() { return xgetSQueMap("collectionId_ExistsReferrer_LendingCollectionList"); }
    public String keepCollectionId_ExistsReferrer_LendingCollectionList(LdLendingCollectionCQ sq) { return xkeepSQue("collectionId_ExistsReferrer_LendingCollectionList", sq); }

    public Map<String, LdCollectionStatusCQ> getCollectionId_NotExistsReferrer_CollectionStatusAsOne() { return xgetSQueMap("collectionId_NotExistsReferrer_CollectionStatusAsOne"); }
    public String keepCollectionId_NotExistsReferrer_CollectionStatusAsOne(LdCollectionStatusCQ sq) { return xkeepSQue("collectionId_NotExistsReferrer_CollectionStatusAsOne", sq); }

    public Map<String, LdLendingCollectionCQ> getCollectionId_NotExistsReferrer_LendingCollectionList() { return xgetSQueMap("collectionId_NotExistsReferrer_LendingCollectionList"); }
    public String keepCollectionId_NotExistsReferrer_LendingCollectionList(LdLendingCollectionCQ sq) { return xkeepSQue("collectionId_NotExistsReferrer_LendingCollectionList", sq); }

    public Map<String, LdLendingCollectionCQ> getCollectionId_SpecifyDerivedReferrer_LendingCollectionList() { return xgetSQueMap("collectionId_SpecifyDerivedReferrer_LendingCollectionList"); }
    public String keepCollectionId_SpecifyDerivedReferrer_LendingCollectionList(LdLendingCollectionCQ sq) { return xkeepSQue("collectionId_SpecifyDerivedReferrer_LendingCollectionList", sq); }

    public Map<String, LdCollectionStatusCQ> getCollectionId_InScopeRelation_CollectionStatusAsOne() { return xgetSQueMap("collectionId_InScopeRelation_CollectionStatusAsOne"); }
    public String keepCollectionId_InScopeRelation_CollectionStatusAsOne(LdCollectionStatusCQ sq) { return xkeepSQue("collectionId_InScopeRelation_CollectionStatusAsOne", sq); }

    public Map<String, LdLendingCollectionCQ> getCollectionId_InScopeRelation_LendingCollectionList() { return xgetSQueMap("collectionId_InScopeRelation_LendingCollectionList"); }
    public String keepCollectionId_InScopeRelation_LendingCollectionList(LdLendingCollectionCQ sq) { return xkeepSQue("collectionId_InScopeRelation_LendingCollectionList", sq); }

    public Map<String, LdCollectionStatusCQ> getCollectionId_NotInScopeRelation_CollectionStatusAsOne() { return xgetSQueMap("collectionId_NotInScopeRelation_CollectionStatusAsOne"); }
    public String keepCollectionId_NotInScopeRelation_CollectionStatusAsOne(LdCollectionStatusCQ sq) { return xkeepSQue("collectionId_NotInScopeRelation_CollectionStatusAsOne", sq); }

    public Map<String, LdLendingCollectionCQ> getCollectionId_NotInScopeRelation_LendingCollectionList() { return xgetSQueMap("collectionId_NotInScopeRelation_LendingCollectionList"); }
    public String keepCollectionId_NotInScopeRelation_LendingCollectionList(LdLendingCollectionCQ sq) { return xkeepSQue("collectionId_NotInScopeRelation_LendingCollectionList", sq); }

    public Map<String, LdLendingCollectionCQ> getCollectionId_QueryDerivedReferrer_LendingCollectionList() { return xgetSQueMap("collectionId_QueryDerivedReferrer_LendingCollectionList"); }
    public String keepCollectionId_QueryDerivedReferrer_LendingCollectionList(LdLendingCollectionCQ sq) { return xkeepSQue("collectionId_QueryDerivedReferrer_LendingCollectionList", sq); }
    public Map<String, Object> getCollectionId_QueryDerivedReferrer_LendingCollectionListParameter() { return xgetSQuePmMap("collectionId_QueryDerivedReferrer_LendingCollectionList"); }
    public String keepCollectionId_QueryDerivedReferrer_LendingCollectionListParameter(Object pm) { return xkeepSQuePm("collectionId_QueryDerivedReferrer_LendingCollectionList", pm); }

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
    public ConditionValue getLibraryId()
    { if (_libraryId == null) { _libraryId = nCV(); }
      return _libraryId; }
    protected ConditionValue getCValueLibraryId() { return getLibraryId(); }

    public Map<String, LdLibraryCQ> getLibraryId_InScopeRelation_Library() { return xgetSQueMap("libraryId_InScopeRelation_Library"); }
    public String keepLibraryId_InScopeRelation_Library(LdLibraryCQ sq) { return xkeepSQue("libraryId_InScopeRelation_Library", sq); }

    public Map<String, LdLibraryCQ> getLibraryId_NotInScopeRelation_Library() { return xgetSQueMap("libraryId_NotInScopeRelation_Library"); }
    public String keepLibraryId_NotInScopeRelation_Library(LdLibraryCQ sq) { return xkeepSQue("libraryId_NotInScopeRelation_Library", sq); }

    /** 
     * Add order-by as ascend. <br />
     * LIBRARY_ID: {UQ+, IX, NotNull, SMALLINT(5), FK to LIBRARY}
     * @return this. (NotNull)
     */
    public LdBsCollectionCQ addOrderBy_LibraryId_Asc() { regOBA("LIBRARY_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * LIBRARY_ID: {UQ+, IX, NotNull, SMALLINT(5), FK to LIBRARY}
     * @return this. (NotNull)
     */
    public LdBsCollectionCQ addOrderBy_LibraryId_Desc() { regOBD("LIBRARY_ID"); return this; }

    protected ConditionValue _bookId;
    public ConditionValue getBookId()
    { if (_bookId == null) { _bookId = nCV(); }
      return _bookId; }
    protected ConditionValue getCValueBookId() { return getBookId(); }

    public Map<String, LdBookCQ> getBookId_InScopeRelation_Book() { return xgetSQueMap("bookId_InScopeRelation_Book"); }
    public String keepBookId_InScopeRelation_Book(LdBookCQ sq) { return xkeepSQue("bookId_InScopeRelation_Book", sq); }

    public Map<String, LdBookCQ> getBookId_NotInScopeRelation_Book() { return xgetSQueMap("bookId_NotInScopeRelation_Book"); }
    public String keepBookId_NotInScopeRelation_Book(LdBookCQ sq) { return xkeepSQue("bookId_NotInScopeRelation_Book", sq); }

    /** 
     * Add order-by as ascend. <br />
     * BOOK_ID: {+UQ, IX, NotNull, INTEGER(10), FK to BOOK}
     * @return this. (NotNull)
     */
    public LdBsCollectionCQ addOrderBy_BookId_Asc() { regOBA("BOOK_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * BOOK_ID: {+UQ, IX, NotNull, INTEGER(10), FK to BOOK}
     * @return this. (NotNull)
     */
    public LdBsCollectionCQ addOrderBy_BookId_Desc() { regOBD("BOOK_ID"); return this; }

    protected ConditionValue _arrivalDate;
    public ConditionValue getArrivalDate()
    { if (_arrivalDate == null) { _arrivalDate = nCV(); }
      return _arrivalDate; }
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
    public ConditionValue getRUser()
    { if (_rUser == null) { _rUser = nCV(); }
      return _rUser; }
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
    public ConditionValue getRModule()
    { if (_rModule == null) { _rModule = nCV(); }
      return _rModule; }
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
    public ConditionValue getRTimestamp()
    { if (_rTimestamp == null) { _rTimestamp = nCV(); }
      return _rTimestamp; }
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
    public ConditionValue getUUser()
    { if (_uUser == null) { _uUser = nCV(); }
      return _uUser; }
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
    public ConditionValue getUModule()
    { if (_uModule == null) { _uModule = nCV(); }
      return _uModule; }
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
    public ConditionValue getUTimestamp()
    { if (_uTimestamp == null) { _uTimestamp = nCV(); }
      return _uTimestamp; }
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
    public LdBsCollectionCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public LdBsCollectionCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
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
    public LdBookCQ getConditionQueryBook() {
        String prop = "book";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBook()); xsetupOuterJoinBook(); }
        return xgetQueRlMap(prop);
    }
    protected LdBookCQ xcreateQueryBook() {
        String nrp = xresolveNRP("COLLECTION", "book"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new LdBookCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "book", nrp);
    }
    protected void xsetupOuterJoinBook() { xregOutJo("book"); }
    public boolean hasConditionQueryBook() { return xhasQueRlMap("book"); }

    /**
     * Get the condition-query for relation table. <br />
     * LIBRARY by my LIBRARY_ID, named 'library'.
     * @return The instance of condition-query. (NotNull)
     */
    public LdLibraryCQ queryLibrary() {
        return getConditionQueryLibrary();
    }
    public LdLibraryCQ getConditionQueryLibrary() {
        String prop = "library";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryLibrary()); xsetupOuterJoinLibrary(); }
        return xgetQueRlMap(prop);
    }
    protected LdLibraryCQ xcreateQueryLibrary() {
        String nrp = xresolveNRP("COLLECTION", "library"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new LdLibraryCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "library", nrp);
    }
    protected void xsetupOuterJoinLibrary() { xregOutJo("library"); }
    public boolean hasConditionQueryLibrary() { return xhasQueRlMap("library"); }

    /**
     * Get the condition-query for relation table. <br />
     * COLLECTION_STATUS by COLLECTION_ID, named 'collectionStatusAsOne'.
     * @return The instance of condition-query. (NotNull)
     */
    public LdCollectionStatusCQ queryCollectionStatusAsOne() { return getConditionQueryCollectionStatusAsOne(); }
    public LdCollectionStatusCQ getConditionQueryCollectionStatusAsOne() {
        String prop = "collectionStatusAsOne";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryCollectionStatusAsOne()); xsetupOuterJoinCollectionStatusAsOne(); }
        return xgetQueRlMap(prop);
    }
    protected LdCollectionStatusCQ xcreateQueryCollectionStatusAsOne() {
        String nrp = xresolveNRP("COLLECTION", "collectionStatusAsOne"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new LdCollectionStatusCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "collectionStatusAsOne", nrp);
    }
    protected void xsetupOuterJoinCollectionStatusAsOne() { xregOutJo("collectionStatusAsOne"); }
    public boolean hasConditionQueryCollectionStatusAsOne() { return xhasQueRlMap("collectionStatusAsOne"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, LdCollectionCQ> getScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(LdCollectionCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, LdCollectionCQ> getSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(LdCollectionCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, LdCollectionCQ> getQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(LdCollectionCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> getQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, LdCollectionCQ> _myselfExistsMap;
    public Map<String, LdCollectionCQ> getMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(LdCollectionCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, LdCollectionCQ> getMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(LdCollectionCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return LdCollectionCB.class.getName(); }
    protected String xCQ() { return LdCollectionCQ.class.getName(); }
    protected String xCHp() { return HpCalculator.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
