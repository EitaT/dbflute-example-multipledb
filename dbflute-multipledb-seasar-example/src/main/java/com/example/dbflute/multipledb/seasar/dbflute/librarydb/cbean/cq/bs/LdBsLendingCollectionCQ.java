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
 * The base condition-query of LENDING_COLLECTION.
 * @author DBFlute(AutoGenerator)
 */
public class LdBsLendingCollectionCQ extends LdAbstractBsLendingCollectionCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected LdLendingCollectionCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public LdBsLendingCollectionCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from LENDING_COLLECTION) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public LdLendingCollectionCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected LdLendingCollectionCIQ xcreateCIQ() {
        LdLendingCollectionCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected LdLendingCollectionCIQ xnewCIQ() {
        return new LdLendingCollectionCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join LENDING_COLLECTION on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public LdLendingCollectionCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        LdLendingCollectionCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _libraryId;
    public ConditionValue getLibraryId()
    { if (_libraryId == null) { _libraryId = nCV(); }
      return _libraryId; }
    protected ConditionValue getCValueLibraryId() { return getLibraryId(); }

    /** 
     * Add order-by as ascend. <br />
     * LIBRARY_ID: {PK, IX+, NotNull, SMALLINT(5), FK to LENDING}
     * @return this. (NotNull)
     */
    public LdBsLendingCollectionCQ addOrderBy_LibraryId_Asc() { regOBA("LIBRARY_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * LIBRARY_ID: {PK, IX+, NotNull, SMALLINT(5), FK to LENDING}
     * @return this. (NotNull)
     */
    public LdBsLendingCollectionCQ addOrderBy_LibraryId_Desc() { regOBD("LIBRARY_ID"); return this; }

    protected ConditionValue _lbUserId;
    public ConditionValue getLbUserId()
    { if (_lbUserId == null) { _lbUserId = nCV(); }
      return _lbUserId; }
    protected ConditionValue getCValueLbUserId() { return getLbUserId(); }

    /** 
     * Add order-by as ascend. <br />
     * LB_USER_ID: {PK, NotNull, INTEGER(10), FK to LENDING}
     * @return this. (NotNull)
     */
    public LdBsLendingCollectionCQ addOrderBy_LbUserId_Asc() { regOBA("LB_USER_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * LB_USER_ID: {PK, NotNull, INTEGER(10), FK to LENDING}
     * @return this. (NotNull)
     */
    public LdBsLendingCollectionCQ addOrderBy_LbUserId_Desc() { regOBD("LB_USER_ID"); return this; }

    protected ConditionValue _lendingDate;
    public ConditionValue getLendingDate()
    { if (_lendingDate == null) { _lendingDate = nCV(); }
      return _lendingDate; }
    protected ConditionValue getCValueLendingDate() { return getLendingDate(); }

    /** 
     * Add order-by as ascend. <br />
     * LENDING_DATE: {PK, NotNull, TIMESTAMP(26, 6), FK to LENDING}
     * @return this. (NotNull)
     */
    public LdBsLendingCollectionCQ addOrderBy_LendingDate_Asc() { regOBA("LENDING_DATE"); return this; }

    /**
     * Add order-by as descend. <br />
     * LENDING_DATE: {PK, NotNull, TIMESTAMP(26, 6), FK to LENDING}
     * @return this. (NotNull)
     */
    public LdBsLendingCollectionCQ addOrderBy_LendingDate_Desc() { regOBD("LENDING_DATE"); return this; }

    protected ConditionValue _collectionId;
    public ConditionValue getCollectionId()
    { if (_collectionId == null) { _collectionId = nCV(); }
      return _collectionId; }
    protected ConditionValue getCValueCollectionId() { return getCollectionId(); }

    public Map<String, LdCollectionCQ> getCollectionId_InScopeRelation_Collection() { return xgetSQueMap("collectionId_InScopeRelation_Collection"); }
    public String keepCollectionId_InScopeRelation_Collection(LdCollectionCQ sq) { return xkeepSQue("collectionId_InScopeRelation_Collection", sq); }

    public Map<String, LdCollectionCQ> getCollectionId_NotInScopeRelation_Collection() { return xgetSQueMap("collectionId_NotInScopeRelation_Collection"); }
    public String keepCollectionId_NotInScopeRelation_Collection(LdCollectionCQ sq) { return xkeepSQue("collectionId_NotInScopeRelation_Collection", sq); }

    /** 
     * Add order-by as ascend. <br />
     * COLLECTION_ID: {PK, IX, NotNull, INTEGER(10), FK to COLLECTION}
     * @return this. (NotNull)
     */
    public LdBsLendingCollectionCQ addOrderBy_CollectionId_Asc() { regOBA("COLLECTION_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * COLLECTION_ID: {PK, IX, NotNull, INTEGER(10), FK to COLLECTION}
     * @return this. (NotNull)
     */
    public LdBsLendingCollectionCQ addOrderBy_CollectionId_Desc() { regOBD("COLLECTION_ID"); return this; }

    protected ConditionValue _returnLimitDate;
    public ConditionValue getReturnLimitDate()
    { if (_returnLimitDate == null) { _returnLimitDate = nCV(); }
      return _returnLimitDate; }
    protected ConditionValue getCValueReturnLimitDate() { return getReturnLimitDate(); }

    /** 
     * Add order-by as ascend. <br />
     * RETURN_LIMIT_DATE: {NotNull, TIMESTAMP(26, 6)}
     * @return this. (NotNull)
     */
    public LdBsLendingCollectionCQ addOrderBy_ReturnLimitDate_Asc() { regOBA("RETURN_LIMIT_DATE"); return this; }

    /**
     * Add order-by as descend. <br />
     * RETURN_LIMIT_DATE: {NotNull, TIMESTAMP(26, 6)}
     * @return this. (NotNull)
     */
    public LdBsLendingCollectionCQ addOrderBy_ReturnLimitDate_Desc() { regOBD("RETURN_LIMIT_DATE"); return this; }

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
    public LdBsLendingCollectionCQ addOrderBy_RUser_Asc() { regOBA("R_USER"); return this; }

    /**
     * Add order-by as descend. <br />
     * R_USER: {NotNull, VARCHAR(100), default=[default-user]}
     * @return this. (NotNull)
     */
    public LdBsLendingCollectionCQ addOrderBy_RUser_Desc() { regOBD("R_USER"); return this; }

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
    public LdBsLendingCollectionCQ addOrderBy_RModule_Asc() { regOBA("R_MODULE"); return this; }

    /**
     * Add order-by as descend. <br />
     * R_MODULE: {NotNull, VARCHAR(100), default=[default-module], classification=RegisterModuleType}
     * @return this. (NotNull)
     */
    public LdBsLendingCollectionCQ addOrderBy_RModule_Desc() { regOBD("R_MODULE"); return this; }

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
    public LdBsLendingCollectionCQ addOrderBy_RTimestamp_Asc() { regOBA("R_TIMESTAMP"); return this; }

    /**
     * Add order-by as descend. <br />
     * R_TIMESTAMP: {NotNull, TIMESTAMP(26, 6), default=[CURRENT_TIMESTAMP]}
     * @return this. (NotNull)
     */
    public LdBsLendingCollectionCQ addOrderBy_RTimestamp_Desc() { regOBD("R_TIMESTAMP"); return this; }

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
    public LdBsLendingCollectionCQ addOrderBy_UUser_Asc() { regOBA("U_USER"); return this; }

    /**
     * Add order-by as descend. <br />
     * U_USER: {NotNull, VARCHAR(100), default=[default-user]}
     * @return this. (NotNull)
     */
    public LdBsLendingCollectionCQ addOrderBy_UUser_Desc() { regOBD("U_USER"); return this; }

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
    public LdBsLendingCollectionCQ addOrderBy_UModule_Asc() { regOBA("U_MODULE"); return this; }

    /**
     * Add order-by as descend. <br />
     * U_MODULE: {NotNull, VARCHAR(100), default=[default-module], classification=UpdateModuleType}
     * @return this. (NotNull)
     */
    public LdBsLendingCollectionCQ addOrderBy_UModule_Desc() { regOBD("U_MODULE"); return this; }

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
    public LdBsLendingCollectionCQ addOrderBy_UTimestamp_Asc() { regOBA("U_TIMESTAMP"); return this; }

    /**
     * Add order-by as descend. <br />
     * U_TIMESTAMP: {NotNull, TIMESTAMP(26, 6), default=[CURRENT_TIMESTAMP]}
     * @return this. (NotNull)
     */
    public LdBsLendingCollectionCQ addOrderBy_UTimestamp_Desc() { regOBD("U_TIMESTAMP"); return this; }

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
    public LdBsLendingCollectionCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public LdBsLendingCollectionCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        LdLendingCollectionCQ bq = (LdLendingCollectionCQ)bqs;
        LdLendingCollectionCQ uq = (LdLendingCollectionCQ)uqs;
        if (bq.hasConditionQueryCollection()) {
            uq.queryCollection().reflectRelationOnUnionQuery(bq.queryCollection(), uq.queryCollection());
        }
        if (bq.hasConditionQueryLending()) {
            uq.queryLending().reflectRelationOnUnionQuery(bq.queryLending(), uq.queryLending());
        }
        if (bq.hasConditionQueryLibraryUser()) {
            uq.queryLibraryUser().reflectRelationOnUnionQuery(bq.queryLibraryUser(), uq.queryLibraryUser());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br />
     * COLLECTION by my COLLECTION_ID, named 'collection'.
     * @return The instance of condition-query. (NotNull)
     */
    public LdCollectionCQ queryCollection() {
        return getConditionQueryCollection();
    }
    public LdCollectionCQ getConditionQueryCollection() {
        String prop = "collection";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryCollection()); xsetupOuterJoinCollection(); }
        return xgetQueRlMap(prop);
    }
    protected LdCollectionCQ xcreateQueryCollection() {
        String nrp = xresolveNRP("LENDING_COLLECTION", "collection"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new LdCollectionCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "collection", nrp);
    }
    protected void xsetupOuterJoinCollection() { xregOutJo("collection"); }
    public boolean hasConditionQueryCollection() { return xhasQueRlMap("collection"); }

    /**
     * Get the condition-query for relation table. <br />
     * LENDING by my LIBRARY_ID, LB_USER_ID, LENDING_DATE, named 'lending'.
     * @return The instance of condition-query. (NotNull)
     */
    public LdLendingCQ queryLending() {
        return getConditionQueryLending();
    }
    public LdLendingCQ getConditionQueryLending() {
        String prop = "lending";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryLending()); xsetupOuterJoinLending(); }
        return xgetQueRlMap(prop);
    }
    protected LdLendingCQ xcreateQueryLending() {
        String nrp = xresolveNRP("LENDING_COLLECTION", "lending"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new LdLendingCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "lending", nrp);
    }
    protected void xsetupOuterJoinLending() { xregOutJo("lending"); }
    public boolean hasConditionQueryLending() { return xhasQueRlMap("lending"); }

    /**
     * Get the condition-query for relation table. <br />
     * LIBRARY_USER by my LIBRARY_ID, LB_USER_ID, named 'libraryUser'.
     * @return The instance of condition-query. (NotNull)
     */
    public LdLibraryUserCQ queryLibraryUser() {
        return getConditionQueryLibraryUser();
    }
    public LdLibraryUserCQ getConditionQueryLibraryUser() {
        String prop = "libraryUser";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryLibraryUser()); xsetupOuterJoinLibraryUser(); }
        return xgetQueRlMap(prop);
    }
    protected LdLibraryUserCQ xcreateQueryLibraryUser() {
        String nrp = xresolveNRP("LENDING_COLLECTION", "libraryUser"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new LdLibraryUserCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "libraryUser", nrp);
    }
    protected void xsetupOuterJoinLibraryUser() { xregOutJo("libraryUser"); }
    public boolean hasConditionQueryLibraryUser() { return xhasQueRlMap("libraryUser"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, LdLendingCollectionCQ> getScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(LdLendingCollectionCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return LdLendingCollectionCB.class.getName(); }
    protected String xCQ() { return LdLendingCollectionCQ.class.getName(); }
    protected String xCHp() { return HpCalculator.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
