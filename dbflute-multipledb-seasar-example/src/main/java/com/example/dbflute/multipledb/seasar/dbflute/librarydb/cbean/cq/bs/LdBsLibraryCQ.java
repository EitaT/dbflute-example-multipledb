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
 * The base condition-query of LIBRARY.
 * @author DBFlute(AutoGenerator)
 */
public class LdBsLibraryCQ extends LdAbstractBsLibraryCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected LdLibraryCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public LdBsLibraryCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from LIBRARY) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public LdLibraryCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected LdLibraryCIQ xcreateCIQ() {
        LdLibraryCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected LdLibraryCIQ xnewCIQ() {
        return new LdLibraryCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join LIBRARY on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public LdLibraryCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        LdLibraryCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _libraryId;
    public ConditionValue getLibraryId()
    { if (_libraryId == null) { _libraryId = nCV(); }
      return _libraryId; }
    protected ConditionValue getCValueLibraryId() { return getLibraryId(); }

    public Map<String, LdCollectionCQ> getLibraryId_ExistsReferrer_CollectionList() { return xgetSQueMap("libraryId_ExistsReferrer_CollectionList"); }
    public String keepLibraryId_ExistsReferrer_CollectionList(LdCollectionCQ sq) { return xkeepSQue("libraryId_ExistsReferrer_CollectionList", sq); }

    public Map<String, LdLibraryUserCQ> getLibraryId_ExistsReferrer_LibraryUserList() { return xgetSQueMap("libraryId_ExistsReferrer_LibraryUserList"); }
    public String keepLibraryId_ExistsReferrer_LibraryUserList(LdLibraryUserCQ sq) { return xkeepSQue("libraryId_ExistsReferrer_LibraryUserList", sq); }

    public Map<String, LdNextLibraryCQ> getLibraryId_ExistsReferrer_NextLibraryByLibraryIdList() { return xgetSQueMap("libraryId_ExistsReferrer_NextLibraryByLibraryIdList"); }
    public String keepLibraryId_ExistsReferrer_NextLibraryByLibraryIdList(LdNextLibraryCQ sq) { return xkeepSQue("libraryId_ExistsReferrer_NextLibraryByLibraryIdList", sq); }

    public Map<String, LdNextLibraryCQ> getLibraryId_ExistsReferrer_NextLibraryByNextLibraryIdList() { return xgetSQueMap("libraryId_ExistsReferrer_NextLibraryByNextLibraryIdList"); }
    public String keepLibraryId_ExistsReferrer_NextLibraryByNextLibraryIdList(LdNextLibraryCQ sq) { return xkeepSQue("libraryId_ExistsReferrer_NextLibraryByNextLibraryIdList", sq); }

    public Map<String, LdCollectionCQ> getLibraryId_NotExistsReferrer_CollectionList() { return xgetSQueMap("libraryId_NotExistsReferrer_CollectionList"); }
    public String keepLibraryId_NotExistsReferrer_CollectionList(LdCollectionCQ sq) { return xkeepSQue("libraryId_NotExistsReferrer_CollectionList", sq); }

    public Map<String, LdLibraryUserCQ> getLibraryId_NotExistsReferrer_LibraryUserList() { return xgetSQueMap("libraryId_NotExistsReferrer_LibraryUserList"); }
    public String keepLibraryId_NotExistsReferrer_LibraryUserList(LdLibraryUserCQ sq) { return xkeepSQue("libraryId_NotExistsReferrer_LibraryUserList", sq); }

    public Map<String, LdNextLibraryCQ> getLibraryId_NotExistsReferrer_NextLibraryByLibraryIdList() { return xgetSQueMap("libraryId_NotExistsReferrer_NextLibraryByLibraryIdList"); }
    public String keepLibraryId_NotExistsReferrer_NextLibraryByLibraryIdList(LdNextLibraryCQ sq) { return xkeepSQue("libraryId_NotExistsReferrer_NextLibraryByLibraryIdList", sq); }

    public Map<String, LdNextLibraryCQ> getLibraryId_NotExistsReferrer_NextLibraryByNextLibraryIdList() { return xgetSQueMap("libraryId_NotExistsReferrer_NextLibraryByNextLibraryIdList"); }
    public String keepLibraryId_NotExistsReferrer_NextLibraryByNextLibraryIdList(LdNextLibraryCQ sq) { return xkeepSQue("libraryId_NotExistsReferrer_NextLibraryByNextLibraryIdList", sq); }

    public Map<String, LdCollectionCQ> getLibraryId_SpecifyDerivedReferrer_CollectionList() { return xgetSQueMap("libraryId_SpecifyDerivedReferrer_CollectionList"); }
    public String keepLibraryId_SpecifyDerivedReferrer_CollectionList(LdCollectionCQ sq) { return xkeepSQue("libraryId_SpecifyDerivedReferrer_CollectionList", sq); }

    public Map<String, LdLibraryUserCQ> getLibraryId_SpecifyDerivedReferrer_LibraryUserList() { return xgetSQueMap("libraryId_SpecifyDerivedReferrer_LibraryUserList"); }
    public String keepLibraryId_SpecifyDerivedReferrer_LibraryUserList(LdLibraryUserCQ sq) { return xkeepSQue("libraryId_SpecifyDerivedReferrer_LibraryUserList", sq); }

    public Map<String, LdNextLibraryCQ> getLibraryId_SpecifyDerivedReferrer_NextLibraryByLibraryIdList() { return xgetSQueMap("libraryId_SpecifyDerivedReferrer_NextLibraryByLibraryIdList"); }
    public String keepLibraryId_SpecifyDerivedReferrer_NextLibraryByLibraryIdList(LdNextLibraryCQ sq) { return xkeepSQue("libraryId_SpecifyDerivedReferrer_NextLibraryByLibraryIdList", sq); }

    public Map<String, LdNextLibraryCQ> getLibraryId_SpecifyDerivedReferrer_NextLibraryByNextLibraryIdList() { return xgetSQueMap("libraryId_SpecifyDerivedReferrer_NextLibraryByNextLibraryIdList"); }
    public String keepLibraryId_SpecifyDerivedReferrer_NextLibraryByNextLibraryIdList(LdNextLibraryCQ sq) { return xkeepSQue("libraryId_SpecifyDerivedReferrer_NextLibraryByNextLibraryIdList", sq); }

    public Map<String, LdCollectionCQ> getLibraryId_InScopeRelation_CollectionList() { return xgetSQueMap("libraryId_InScopeRelation_CollectionList"); }
    public String keepLibraryId_InScopeRelation_CollectionList(LdCollectionCQ sq) { return xkeepSQue("libraryId_InScopeRelation_CollectionList", sq); }

    public Map<String, LdLibraryUserCQ> getLibraryId_InScopeRelation_LibraryUserList() { return xgetSQueMap("libraryId_InScopeRelation_LibraryUserList"); }
    public String keepLibraryId_InScopeRelation_LibraryUserList(LdLibraryUserCQ sq) { return xkeepSQue("libraryId_InScopeRelation_LibraryUserList", sq); }

    public Map<String, LdNextLibraryCQ> getLibraryId_InScopeRelation_NextLibraryByLibraryIdList() { return xgetSQueMap("libraryId_InScopeRelation_NextLibraryByLibraryIdList"); }
    public String keepLibraryId_InScopeRelation_NextLibraryByLibraryIdList(LdNextLibraryCQ sq) { return xkeepSQue("libraryId_InScopeRelation_NextLibraryByLibraryIdList", sq); }

    public Map<String, LdNextLibraryCQ> getLibraryId_InScopeRelation_NextLibraryByNextLibraryIdList() { return xgetSQueMap("libraryId_InScopeRelation_NextLibraryByNextLibraryIdList"); }
    public String keepLibraryId_InScopeRelation_NextLibraryByNextLibraryIdList(LdNextLibraryCQ sq) { return xkeepSQue("libraryId_InScopeRelation_NextLibraryByNextLibraryIdList", sq); }

    public Map<String, LdCollectionCQ> getLibraryId_NotInScopeRelation_CollectionList() { return xgetSQueMap("libraryId_NotInScopeRelation_CollectionList"); }
    public String keepLibraryId_NotInScopeRelation_CollectionList(LdCollectionCQ sq) { return xkeepSQue("libraryId_NotInScopeRelation_CollectionList", sq); }

    public Map<String, LdLibraryUserCQ> getLibraryId_NotInScopeRelation_LibraryUserList() { return xgetSQueMap("libraryId_NotInScopeRelation_LibraryUserList"); }
    public String keepLibraryId_NotInScopeRelation_LibraryUserList(LdLibraryUserCQ sq) { return xkeepSQue("libraryId_NotInScopeRelation_LibraryUserList", sq); }

    public Map<String, LdNextLibraryCQ> getLibraryId_NotInScopeRelation_NextLibraryByLibraryIdList() { return xgetSQueMap("libraryId_NotInScopeRelation_NextLibraryByLibraryIdList"); }
    public String keepLibraryId_NotInScopeRelation_NextLibraryByLibraryIdList(LdNextLibraryCQ sq) { return xkeepSQue("libraryId_NotInScopeRelation_NextLibraryByLibraryIdList", sq); }

    public Map<String, LdNextLibraryCQ> getLibraryId_NotInScopeRelation_NextLibraryByNextLibraryIdList() { return xgetSQueMap("libraryId_NotInScopeRelation_NextLibraryByNextLibraryIdList"); }
    public String keepLibraryId_NotInScopeRelation_NextLibraryByNextLibraryIdList(LdNextLibraryCQ sq) { return xkeepSQue("libraryId_NotInScopeRelation_NextLibraryByNextLibraryIdList", sq); }

    public Map<String, LdCollectionCQ> getLibraryId_QueryDerivedReferrer_CollectionList() { return xgetSQueMap("libraryId_QueryDerivedReferrer_CollectionList"); }
    public String keepLibraryId_QueryDerivedReferrer_CollectionList(LdCollectionCQ sq) { return xkeepSQue("libraryId_QueryDerivedReferrer_CollectionList", sq); }
    public Map<String, Object> getLibraryId_QueryDerivedReferrer_CollectionListParameter() { return xgetSQuePmMap("libraryId_QueryDerivedReferrer_CollectionList"); }
    public String keepLibraryId_QueryDerivedReferrer_CollectionListParameter(Object pm) { return xkeepSQuePm("libraryId_QueryDerivedReferrer_CollectionList", pm); }

    public Map<String, LdLibraryUserCQ> getLibraryId_QueryDerivedReferrer_LibraryUserList() { return xgetSQueMap("libraryId_QueryDerivedReferrer_LibraryUserList"); }
    public String keepLibraryId_QueryDerivedReferrer_LibraryUserList(LdLibraryUserCQ sq) { return xkeepSQue("libraryId_QueryDerivedReferrer_LibraryUserList", sq); }
    public Map<String, Object> getLibraryId_QueryDerivedReferrer_LibraryUserListParameter() { return xgetSQuePmMap("libraryId_QueryDerivedReferrer_LibraryUserList"); }
    public String keepLibraryId_QueryDerivedReferrer_LibraryUserListParameter(Object pm) { return xkeepSQuePm("libraryId_QueryDerivedReferrer_LibraryUserList", pm); }

    public Map<String, LdNextLibraryCQ> getLibraryId_QueryDerivedReferrer_NextLibraryByLibraryIdList() { return xgetSQueMap("libraryId_QueryDerivedReferrer_NextLibraryByLibraryIdList"); }
    public String keepLibraryId_QueryDerivedReferrer_NextLibraryByLibraryIdList(LdNextLibraryCQ sq) { return xkeepSQue("libraryId_QueryDerivedReferrer_NextLibraryByLibraryIdList", sq); }
    public Map<String, Object> getLibraryId_QueryDerivedReferrer_NextLibraryByLibraryIdListParameter() { return xgetSQuePmMap("libraryId_QueryDerivedReferrer_NextLibraryByLibraryIdList"); }
    public String keepLibraryId_QueryDerivedReferrer_NextLibraryByLibraryIdListParameter(Object pm) { return xkeepSQuePm("libraryId_QueryDerivedReferrer_NextLibraryByLibraryIdList", pm); }

    public Map<String, LdNextLibraryCQ> getLibraryId_QueryDerivedReferrer_NextLibraryByNextLibraryIdList() { return xgetSQueMap("libraryId_QueryDerivedReferrer_NextLibraryByNextLibraryIdList"); }
    public String keepLibraryId_QueryDerivedReferrer_NextLibraryByNextLibraryIdList(LdNextLibraryCQ sq) { return xkeepSQue("libraryId_QueryDerivedReferrer_NextLibraryByNextLibraryIdList", sq); }
    public Map<String, Object> getLibraryId_QueryDerivedReferrer_NextLibraryByNextLibraryIdListParameter() { return xgetSQuePmMap("libraryId_QueryDerivedReferrer_NextLibraryByNextLibraryIdList"); }
    public String keepLibraryId_QueryDerivedReferrer_NextLibraryByNextLibraryIdListParameter(Object pm) { return xkeepSQuePm("libraryId_QueryDerivedReferrer_NextLibraryByNextLibraryIdList", pm); }

    /** 
     * Add order-by as ascend. <br />
     * LIBRARY_ID: {PK, ID, NotNull, SMALLINT(5)}
     * @return this. (NotNull)
     */
    public LdBsLibraryCQ addOrderBy_LibraryId_Asc() { regOBA("LIBRARY_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * LIBRARY_ID: {PK, ID, NotNull, SMALLINT(5)}
     * @return this. (NotNull)
     */
    public LdBsLibraryCQ addOrderBy_LibraryId_Desc() { regOBD("LIBRARY_ID"); return this; }

    protected ConditionValue _libraryName;
    public ConditionValue getLibraryName()
    { if (_libraryName == null) { _libraryName = nCV(); }
      return _libraryName; }
    protected ConditionValue getCValueLibraryName() { return getLibraryName(); }

    /** 
     * Add order-by as ascend. <br />
     * LIBRARY_NAME: {UQ, NotNull, VARCHAR(80)}
     * @return this. (NotNull)
     */
    public LdBsLibraryCQ addOrderBy_LibraryName_Asc() { regOBA("LIBRARY_NAME"); return this; }

    /**
     * Add order-by as descend. <br />
     * LIBRARY_NAME: {UQ, NotNull, VARCHAR(80)}
     * @return this. (NotNull)
     */
    public LdBsLibraryCQ addOrderBy_LibraryName_Desc() { regOBD("LIBRARY_NAME"); return this; }

    protected ConditionValue _libraryTypeCode;
    public ConditionValue getLibraryTypeCode()
    { if (_libraryTypeCode == null) { _libraryTypeCode = nCV(); }
      return _libraryTypeCode; }
    protected ConditionValue getCValueLibraryTypeCode() { return getLibraryTypeCode(); }

    public Map<String, LdLibraryTypeLookupCQ> getLibraryTypeCode_InScopeRelation_LibraryTypeLookup() { return xgetSQueMap("libraryTypeCode_InScopeRelation_LibraryTypeLookup"); }
    public String keepLibraryTypeCode_InScopeRelation_LibraryTypeLookup(LdLibraryTypeLookupCQ sq) { return xkeepSQue("libraryTypeCode_InScopeRelation_LibraryTypeLookup", sq); }

    public Map<String, LdLibraryTypeLookupCQ> getLibraryTypeCode_NotInScopeRelation_LibraryTypeLookup() { return xgetSQueMap("libraryTypeCode_NotInScopeRelation_LibraryTypeLookup"); }
    public String keepLibraryTypeCode_NotInScopeRelation_LibraryTypeLookup(LdLibraryTypeLookupCQ sq) { return xkeepSQue("libraryTypeCode_NotInScopeRelation_LibraryTypeLookup", sq); }

    /** 
     * Add order-by as ascend. <br />
     * LIBRARY_TYPE_CODE: {IX, NotNull, CHAR(3), FK to LIBRARY_TYPE_LOOKUP}
     * @return this. (NotNull)
     */
    public LdBsLibraryCQ addOrderBy_LibraryTypeCode_Asc() { regOBA("LIBRARY_TYPE_CODE"); return this; }

    /**
     * Add order-by as descend. <br />
     * LIBRARY_TYPE_CODE: {IX, NotNull, CHAR(3), FK to LIBRARY_TYPE_LOOKUP}
     * @return this. (NotNull)
     */
    public LdBsLibraryCQ addOrderBy_LibraryTypeCode_Desc() { regOBD("LIBRARY_TYPE_CODE"); return this; }

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
    public LdBsLibraryCQ addOrderBy_RUser_Asc() { regOBA("R_USER"); return this; }

    /**
     * Add order-by as descend. <br />
     * R_USER: {NotNull, VARCHAR(100), default=[default-user]}
     * @return this. (NotNull)
     */
    public LdBsLibraryCQ addOrderBy_RUser_Desc() { regOBD("R_USER"); return this; }

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
    public LdBsLibraryCQ addOrderBy_RModule_Asc() { regOBA("R_MODULE"); return this; }

    /**
     * Add order-by as descend. <br />
     * R_MODULE: {NotNull, VARCHAR(100), default=[default-module], classification=RegisterModuleType}
     * @return this. (NotNull)
     */
    public LdBsLibraryCQ addOrderBy_RModule_Desc() { regOBD("R_MODULE"); return this; }

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
    public LdBsLibraryCQ addOrderBy_RTimestamp_Asc() { regOBA("R_TIMESTAMP"); return this; }

    /**
     * Add order-by as descend. <br />
     * R_TIMESTAMP: {NotNull, TIMESTAMP(26, 6), default=[CURRENT_TIMESTAMP]}
     * @return this. (NotNull)
     */
    public LdBsLibraryCQ addOrderBy_RTimestamp_Desc() { regOBD("R_TIMESTAMP"); return this; }

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
    public LdBsLibraryCQ addOrderBy_UUser_Asc() { regOBA("U_USER"); return this; }

    /**
     * Add order-by as descend. <br />
     * U_USER: {NotNull, VARCHAR(100), default=[default-user]}
     * @return this. (NotNull)
     */
    public LdBsLibraryCQ addOrderBy_UUser_Desc() { regOBD("U_USER"); return this; }

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
    public LdBsLibraryCQ addOrderBy_UModule_Asc() { regOBA("U_MODULE"); return this; }

    /**
     * Add order-by as descend. <br />
     * U_MODULE: {NotNull, VARCHAR(100), default=[default-module], classification=UpdateModuleType}
     * @return this. (NotNull)
     */
    public LdBsLibraryCQ addOrderBy_UModule_Desc() { regOBD("U_MODULE"); return this; }

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
    public LdBsLibraryCQ addOrderBy_UTimestamp_Asc() { regOBA("U_TIMESTAMP"); return this; }

    /**
     * Add order-by as descend. <br />
     * U_TIMESTAMP: {NotNull, TIMESTAMP(26, 6), default=[CURRENT_TIMESTAMP]}
     * @return this. (NotNull)
     */
    public LdBsLibraryCQ addOrderBy_UTimestamp_Desc() { regOBD("U_TIMESTAMP"); return this; }

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
    public LdBsLibraryCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public LdBsLibraryCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        LdLibraryCQ bq = (LdLibraryCQ)bqs;
        LdLibraryCQ uq = (LdLibraryCQ)uqs;
        if (bq.hasConditionQueryLibraryTypeLookup()) {
            uq.queryLibraryTypeLookup().reflectRelationOnUnionQuery(bq.queryLibraryTypeLookup(), uq.queryLibraryTypeLookup());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br />
     * LIBRARY_TYPE_LOOKUP by my LIBRARY_TYPE_CODE, named 'libraryTypeLookup'.
     * @return The instance of condition-query. (NotNull)
     */
    public LdLibraryTypeLookupCQ queryLibraryTypeLookup() {
        return getConditionQueryLibraryTypeLookup();
    }
    public LdLibraryTypeLookupCQ getConditionQueryLibraryTypeLookup() {
        String prop = "libraryTypeLookup";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryLibraryTypeLookup()); xsetupOuterJoinLibraryTypeLookup(); }
        return xgetQueRlMap(prop);
    }
    protected LdLibraryTypeLookupCQ xcreateQueryLibraryTypeLookup() {
        String nrp = xresolveNRP("LIBRARY", "libraryTypeLookup"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new LdLibraryTypeLookupCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "libraryTypeLookup", nrp);
    }
    protected void xsetupOuterJoinLibraryTypeLookup() { xregOutJo("libraryTypeLookup"); }
    public boolean hasConditionQueryLibraryTypeLookup() { return xhasQueRlMap("libraryTypeLookup"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, LdLibraryCQ> getScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(LdLibraryCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, LdLibraryCQ> getSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(LdLibraryCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, LdLibraryCQ> getQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(LdLibraryCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> getQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, LdLibraryCQ> _myselfExistsMap;
    public Map<String, LdLibraryCQ> getMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(LdLibraryCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, LdLibraryCQ> getMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(LdLibraryCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return LdLibraryCB.class.getName(); }
    protected String xCQ() { return LdLibraryCQ.class.getName(); }
    protected String xCHp() { return HpCalculator.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
