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
    public ConditionValue getLibraryId() {
        if (_libraryId == null) { _libraryId = nCV(); }
        return _libraryId;
    }
    protected ConditionValue getCValueLibraryId() { return getLibraryId(); }

    protected Map<String, LdCollectionCQ> _libraryId_ExistsReferrer_CollectionListMap;
    public Map<String, LdCollectionCQ> getLibraryId_ExistsReferrer_CollectionList() { return _libraryId_ExistsReferrer_CollectionListMap; }
    public String keepLibraryId_ExistsReferrer_CollectionList(LdCollectionCQ sq) {
        if (_libraryId_ExistsReferrer_CollectionListMap == null) { _libraryId_ExistsReferrer_CollectionListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_libraryId_ExistsReferrer_CollectionListMap.size() + 1);
        _libraryId_ExistsReferrer_CollectionListMap.put(ky, sq); return "libraryId_ExistsReferrer_CollectionList." + ky;
    }

    protected Map<String, LdLibraryUserCQ> _libraryId_ExistsReferrer_LibraryUserListMap;
    public Map<String, LdLibraryUserCQ> getLibraryId_ExistsReferrer_LibraryUserList() { return _libraryId_ExistsReferrer_LibraryUserListMap; }
    public String keepLibraryId_ExistsReferrer_LibraryUserList(LdLibraryUserCQ sq) {
        if (_libraryId_ExistsReferrer_LibraryUserListMap == null) { _libraryId_ExistsReferrer_LibraryUserListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_libraryId_ExistsReferrer_LibraryUserListMap.size() + 1);
        _libraryId_ExistsReferrer_LibraryUserListMap.put(ky, sq); return "libraryId_ExistsReferrer_LibraryUserList." + ky;
    }

    protected Map<String, LdNextLibraryCQ> _libraryId_ExistsReferrer_NextLibraryByLibraryIdListMap;
    public Map<String, LdNextLibraryCQ> getLibraryId_ExistsReferrer_NextLibraryByLibraryIdList() { return _libraryId_ExistsReferrer_NextLibraryByLibraryIdListMap; }
    public String keepLibraryId_ExistsReferrer_NextLibraryByLibraryIdList(LdNextLibraryCQ sq) {
        if (_libraryId_ExistsReferrer_NextLibraryByLibraryIdListMap == null) { _libraryId_ExistsReferrer_NextLibraryByLibraryIdListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_libraryId_ExistsReferrer_NextLibraryByLibraryIdListMap.size() + 1);
        _libraryId_ExistsReferrer_NextLibraryByLibraryIdListMap.put(ky, sq); return "libraryId_ExistsReferrer_NextLibraryByLibraryIdList." + ky;
    }

    protected Map<String, LdNextLibraryCQ> _libraryId_ExistsReferrer_NextLibraryByNextLibraryIdListMap;
    public Map<String, LdNextLibraryCQ> getLibraryId_ExistsReferrer_NextLibraryByNextLibraryIdList() { return _libraryId_ExistsReferrer_NextLibraryByNextLibraryIdListMap; }
    public String keepLibraryId_ExistsReferrer_NextLibraryByNextLibraryIdList(LdNextLibraryCQ sq) {
        if (_libraryId_ExistsReferrer_NextLibraryByNextLibraryIdListMap == null) { _libraryId_ExistsReferrer_NextLibraryByNextLibraryIdListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_libraryId_ExistsReferrer_NextLibraryByNextLibraryIdListMap.size() + 1);
        _libraryId_ExistsReferrer_NextLibraryByNextLibraryIdListMap.put(ky, sq); return "libraryId_ExistsReferrer_NextLibraryByNextLibraryIdList." + ky;
    }

    protected Map<String, LdCollectionCQ> _libraryId_NotExistsReferrer_CollectionListMap;
    public Map<String, LdCollectionCQ> getLibraryId_NotExistsReferrer_CollectionList() { return _libraryId_NotExistsReferrer_CollectionListMap; }
    public String keepLibraryId_NotExistsReferrer_CollectionList(LdCollectionCQ sq) {
        if (_libraryId_NotExistsReferrer_CollectionListMap == null) { _libraryId_NotExistsReferrer_CollectionListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_libraryId_NotExistsReferrer_CollectionListMap.size() + 1);
        _libraryId_NotExistsReferrer_CollectionListMap.put(ky, sq); return "libraryId_NotExistsReferrer_CollectionList." + ky;
    }

    protected Map<String, LdLibraryUserCQ> _libraryId_NotExistsReferrer_LibraryUserListMap;
    public Map<String, LdLibraryUserCQ> getLibraryId_NotExistsReferrer_LibraryUserList() { return _libraryId_NotExistsReferrer_LibraryUserListMap; }
    public String keepLibraryId_NotExistsReferrer_LibraryUserList(LdLibraryUserCQ sq) {
        if (_libraryId_NotExistsReferrer_LibraryUserListMap == null) { _libraryId_NotExistsReferrer_LibraryUserListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_libraryId_NotExistsReferrer_LibraryUserListMap.size() + 1);
        _libraryId_NotExistsReferrer_LibraryUserListMap.put(ky, sq); return "libraryId_NotExistsReferrer_LibraryUserList." + ky;
    }

    protected Map<String, LdNextLibraryCQ> _libraryId_NotExistsReferrer_NextLibraryByLibraryIdListMap;
    public Map<String, LdNextLibraryCQ> getLibraryId_NotExistsReferrer_NextLibraryByLibraryIdList() { return _libraryId_NotExistsReferrer_NextLibraryByLibraryIdListMap; }
    public String keepLibraryId_NotExistsReferrer_NextLibraryByLibraryIdList(LdNextLibraryCQ sq) {
        if (_libraryId_NotExistsReferrer_NextLibraryByLibraryIdListMap == null) { _libraryId_NotExistsReferrer_NextLibraryByLibraryIdListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_libraryId_NotExistsReferrer_NextLibraryByLibraryIdListMap.size() + 1);
        _libraryId_NotExistsReferrer_NextLibraryByLibraryIdListMap.put(ky, sq); return "libraryId_NotExistsReferrer_NextLibraryByLibraryIdList." + ky;
    }

    protected Map<String, LdNextLibraryCQ> _libraryId_NotExistsReferrer_NextLibraryByNextLibraryIdListMap;
    public Map<String, LdNextLibraryCQ> getLibraryId_NotExistsReferrer_NextLibraryByNextLibraryIdList() { return _libraryId_NotExistsReferrer_NextLibraryByNextLibraryIdListMap; }
    public String keepLibraryId_NotExistsReferrer_NextLibraryByNextLibraryIdList(LdNextLibraryCQ sq) {
        if (_libraryId_NotExistsReferrer_NextLibraryByNextLibraryIdListMap == null) { _libraryId_NotExistsReferrer_NextLibraryByNextLibraryIdListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_libraryId_NotExistsReferrer_NextLibraryByNextLibraryIdListMap.size() + 1);
        _libraryId_NotExistsReferrer_NextLibraryByNextLibraryIdListMap.put(ky, sq); return "libraryId_NotExistsReferrer_NextLibraryByNextLibraryIdList." + ky;
    }

    protected Map<String, LdCollectionCQ> _libraryId_SpecifyDerivedReferrer_CollectionListMap;
    public Map<String, LdCollectionCQ> getLibraryId_SpecifyDerivedReferrer_CollectionList() { return _libraryId_SpecifyDerivedReferrer_CollectionListMap; }
    public String keepLibraryId_SpecifyDerivedReferrer_CollectionList(LdCollectionCQ sq) {
        if (_libraryId_SpecifyDerivedReferrer_CollectionListMap == null) { _libraryId_SpecifyDerivedReferrer_CollectionListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_libraryId_SpecifyDerivedReferrer_CollectionListMap.size() + 1);
        _libraryId_SpecifyDerivedReferrer_CollectionListMap.put(ky, sq); return "libraryId_SpecifyDerivedReferrer_CollectionList." + ky;
    }

    protected Map<String, LdLibraryUserCQ> _libraryId_SpecifyDerivedReferrer_LibraryUserListMap;
    public Map<String, LdLibraryUserCQ> getLibraryId_SpecifyDerivedReferrer_LibraryUserList() { return _libraryId_SpecifyDerivedReferrer_LibraryUserListMap; }
    public String keepLibraryId_SpecifyDerivedReferrer_LibraryUserList(LdLibraryUserCQ sq) {
        if (_libraryId_SpecifyDerivedReferrer_LibraryUserListMap == null) { _libraryId_SpecifyDerivedReferrer_LibraryUserListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_libraryId_SpecifyDerivedReferrer_LibraryUserListMap.size() + 1);
        _libraryId_SpecifyDerivedReferrer_LibraryUserListMap.put(ky, sq); return "libraryId_SpecifyDerivedReferrer_LibraryUserList." + ky;
    }

    protected Map<String, LdNextLibraryCQ> _libraryId_SpecifyDerivedReferrer_NextLibraryByLibraryIdListMap;
    public Map<String, LdNextLibraryCQ> getLibraryId_SpecifyDerivedReferrer_NextLibraryByLibraryIdList() { return _libraryId_SpecifyDerivedReferrer_NextLibraryByLibraryIdListMap; }
    public String keepLibraryId_SpecifyDerivedReferrer_NextLibraryByLibraryIdList(LdNextLibraryCQ sq) {
        if (_libraryId_SpecifyDerivedReferrer_NextLibraryByLibraryIdListMap == null) { _libraryId_SpecifyDerivedReferrer_NextLibraryByLibraryIdListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_libraryId_SpecifyDerivedReferrer_NextLibraryByLibraryIdListMap.size() + 1);
        _libraryId_SpecifyDerivedReferrer_NextLibraryByLibraryIdListMap.put(ky, sq); return "libraryId_SpecifyDerivedReferrer_NextLibraryByLibraryIdList." + ky;
    }

    protected Map<String, LdNextLibraryCQ> _libraryId_SpecifyDerivedReferrer_NextLibraryByNextLibraryIdListMap;
    public Map<String, LdNextLibraryCQ> getLibraryId_SpecifyDerivedReferrer_NextLibraryByNextLibraryIdList() { return _libraryId_SpecifyDerivedReferrer_NextLibraryByNextLibraryIdListMap; }
    public String keepLibraryId_SpecifyDerivedReferrer_NextLibraryByNextLibraryIdList(LdNextLibraryCQ sq) {
        if (_libraryId_SpecifyDerivedReferrer_NextLibraryByNextLibraryIdListMap == null) { _libraryId_SpecifyDerivedReferrer_NextLibraryByNextLibraryIdListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_libraryId_SpecifyDerivedReferrer_NextLibraryByNextLibraryIdListMap.size() + 1);
        _libraryId_SpecifyDerivedReferrer_NextLibraryByNextLibraryIdListMap.put(ky, sq); return "libraryId_SpecifyDerivedReferrer_NextLibraryByNextLibraryIdList." + ky;
    }

    protected Map<String, LdCollectionCQ> _libraryId_InScopeRelation_CollectionListMap;
    public Map<String, LdCollectionCQ> getLibraryId_InScopeRelation_CollectionList() { return _libraryId_InScopeRelation_CollectionListMap; }
    public String keepLibraryId_InScopeRelation_CollectionList(LdCollectionCQ sq) {
        if (_libraryId_InScopeRelation_CollectionListMap == null) { _libraryId_InScopeRelation_CollectionListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_libraryId_InScopeRelation_CollectionListMap.size() + 1);
        _libraryId_InScopeRelation_CollectionListMap.put(ky, sq); return "libraryId_InScopeRelation_CollectionList." + ky;
    }

    protected Map<String, LdLibraryUserCQ> _libraryId_InScopeRelation_LibraryUserListMap;
    public Map<String, LdLibraryUserCQ> getLibraryId_InScopeRelation_LibraryUserList() { return _libraryId_InScopeRelation_LibraryUserListMap; }
    public String keepLibraryId_InScopeRelation_LibraryUserList(LdLibraryUserCQ sq) {
        if (_libraryId_InScopeRelation_LibraryUserListMap == null) { _libraryId_InScopeRelation_LibraryUserListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_libraryId_InScopeRelation_LibraryUserListMap.size() + 1);
        _libraryId_InScopeRelation_LibraryUserListMap.put(ky, sq); return "libraryId_InScopeRelation_LibraryUserList." + ky;
    }

    protected Map<String, LdNextLibraryCQ> _libraryId_InScopeRelation_NextLibraryByLibraryIdListMap;
    public Map<String, LdNextLibraryCQ> getLibraryId_InScopeRelation_NextLibraryByLibraryIdList() { return _libraryId_InScopeRelation_NextLibraryByLibraryIdListMap; }
    public String keepLibraryId_InScopeRelation_NextLibraryByLibraryIdList(LdNextLibraryCQ sq) {
        if (_libraryId_InScopeRelation_NextLibraryByLibraryIdListMap == null) { _libraryId_InScopeRelation_NextLibraryByLibraryIdListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_libraryId_InScopeRelation_NextLibraryByLibraryIdListMap.size() + 1);
        _libraryId_InScopeRelation_NextLibraryByLibraryIdListMap.put(ky, sq); return "libraryId_InScopeRelation_NextLibraryByLibraryIdList." + ky;
    }

    protected Map<String, LdNextLibraryCQ> _libraryId_InScopeRelation_NextLibraryByNextLibraryIdListMap;
    public Map<String, LdNextLibraryCQ> getLibraryId_InScopeRelation_NextLibraryByNextLibraryIdList() { return _libraryId_InScopeRelation_NextLibraryByNextLibraryIdListMap; }
    public String keepLibraryId_InScopeRelation_NextLibraryByNextLibraryIdList(LdNextLibraryCQ sq) {
        if (_libraryId_InScopeRelation_NextLibraryByNextLibraryIdListMap == null) { _libraryId_InScopeRelation_NextLibraryByNextLibraryIdListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_libraryId_InScopeRelation_NextLibraryByNextLibraryIdListMap.size() + 1);
        _libraryId_InScopeRelation_NextLibraryByNextLibraryIdListMap.put(ky, sq); return "libraryId_InScopeRelation_NextLibraryByNextLibraryIdList." + ky;
    }

    protected Map<String, LdCollectionCQ> _libraryId_NotInScopeRelation_CollectionListMap;
    public Map<String, LdCollectionCQ> getLibraryId_NotInScopeRelation_CollectionList() { return _libraryId_NotInScopeRelation_CollectionListMap; }
    public String keepLibraryId_NotInScopeRelation_CollectionList(LdCollectionCQ sq) {
        if (_libraryId_NotInScopeRelation_CollectionListMap == null) { _libraryId_NotInScopeRelation_CollectionListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_libraryId_NotInScopeRelation_CollectionListMap.size() + 1);
        _libraryId_NotInScopeRelation_CollectionListMap.put(ky, sq); return "libraryId_NotInScopeRelation_CollectionList." + ky;
    }

    protected Map<String, LdLibraryUserCQ> _libraryId_NotInScopeRelation_LibraryUserListMap;
    public Map<String, LdLibraryUserCQ> getLibraryId_NotInScopeRelation_LibraryUserList() { return _libraryId_NotInScopeRelation_LibraryUserListMap; }
    public String keepLibraryId_NotInScopeRelation_LibraryUserList(LdLibraryUserCQ sq) {
        if (_libraryId_NotInScopeRelation_LibraryUserListMap == null) { _libraryId_NotInScopeRelation_LibraryUserListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_libraryId_NotInScopeRelation_LibraryUserListMap.size() + 1);
        _libraryId_NotInScopeRelation_LibraryUserListMap.put(ky, sq); return "libraryId_NotInScopeRelation_LibraryUserList." + ky;
    }

    protected Map<String, LdNextLibraryCQ> _libraryId_NotInScopeRelation_NextLibraryByLibraryIdListMap;
    public Map<String, LdNextLibraryCQ> getLibraryId_NotInScopeRelation_NextLibraryByLibraryIdList() { return _libraryId_NotInScopeRelation_NextLibraryByLibraryIdListMap; }
    public String keepLibraryId_NotInScopeRelation_NextLibraryByLibraryIdList(LdNextLibraryCQ sq) {
        if (_libraryId_NotInScopeRelation_NextLibraryByLibraryIdListMap == null) { _libraryId_NotInScopeRelation_NextLibraryByLibraryIdListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_libraryId_NotInScopeRelation_NextLibraryByLibraryIdListMap.size() + 1);
        _libraryId_NotInScopeRelation_NextLibraryByLibraryIdListMap.put(ky, sq); return "libraryId_NotInScopeRelation_NextLibraryByLibraryIdList." + ky;
    }

    protected Map<String, LdNextLibraryCQ> _libraryId_NotInScopeRelation_NextLibraryByNextLibraryIdListMap;
    public Map<String, LdNextLibraryCQ> getLibraryId_NotInScopeRelation_NextLibraryByNextLibraryIdList() { return _libraryId_NotInScopeRelation_NextLibraryByNextLibraryIdListMap; }
    public String keepLibraryId_NotInScopeRelation_NextLibraryByNextLibraryIdList(LdNextLibraryCQ sq) {
        if (_libraryId_NotInScopeRelation_NextLibraryByNextLibraryIdListMap == null) { _libraryId_NotInScopeRelation_NextLibraryByNextLibraryIdListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_libraryId_NotInScopeRelation_NextLibraryByNextLibraryIdListMap.size() + 1);
        _libraryId_NotInScopeRelation_NextLibraryByNextLibraryIdListMap.put(ky, sq); return "libraryId_NotInScopeRelation_NextLibraryByNextLibraryIdList." + ky;
    }

    protected Map<String, LdCollectionCQ> _libraryId_QueryDerivedReferrer_CollectionListMap;
    public Map<String, LdCollectionCQ> getLibraryId_QueryDerivedReferrer_CollectionList() { return _libraryId_QueryDerivedReferrer_CollectionListMap; }
    public String keepLibraryId_QueryDerivedReferrer_CollectionList(LdCollectionCQ sq) {
        if (_libraryId_QueryDerivedReferrer_CollectionListMap == null) { _libraryId_QueryDerivedReferrer_CollectionListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_libraryId_QueryDerivedReferrer_CollectionListMap.size() + 1);
        _libraryId_QueryDerivedReferrer_CollectionListMap.put(ky, sq); return "libraryId_QueryDerivedReferrer_CollectionList." + ky;
    }
    protected Map<String, Object> _libraryId_QueryDerivedReferrer_CollectionListParameterMap;
    public Map<String, Object> getLibraryId_QueryDerivedReferrer_CollectionListParameter() { return _libraryId_QueryDerivedReferrer_CollectionListParameterMap; }
    public String keepLibraryId_QueryDerivedReferrer_CollectionListParameter(Object vl) {
        if (_libraryId_QueryDerivedReferrer_CollectionListParameterMap == null) { _libraryId_QueryDerivedReferrer_CollectionListParameterMap = newLinkedHashMapSized(4); }
        String ky = "subQueryParameterKey" + (_libraryId_QueryDerivedReferrer_CollectionListParameterMap.size() + 1);
        _libraryId_QueryDerivedReferrer_CollectionListParameterMap.put(ky, vl); return "libraryId_QueryDerivedReferrer_CollectionListParameter." + ky;
    }

    protected Map<String, LdLibraryUserCQ> _libraryId_QueryDerivedReferrer_LibraryUserListMap;
    public Map<String, LdLibraryUserCQ> getLibraryId_QueryDerivedReferrer_LibraryUserList() { return _libraryId_QueryDerivedReferrer_LibraryUserListMap; }
    public String keepLibraryId_QueryDerivedReferrer_LibraryUserList(LdLibraryUserCQ sq) {
        if (_libraryId_QueryDerivedReferrer_LibraryUserListMap == null) { _libraryId_QueryDerivedReferrer_LibraryUserListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_libraryId_QueryDerivedReferrer_LibraryUserListMap.size() + 1);
        _libraryId_QueryDerivedReferrer_LibraryUserListMap.put(ky, sq); return "libraryId_QueryDerivedReferrer_LibraryUserList." + ky;
    }
    protected Map<String, Object> _libraryId_QueryDerivedReferrer_LibraryUserListParameterMap;
    public Map<String, Object> getLibraryId_QueryDerivedReferrer_LibraryUserListParameter() { return _libraryId_QueryDerivedReferrer_LibraryUserListParameterMap; }
    public String keepLibraryId_QueryDerivedReferrer_LibraryUserListParameter(Object vl) {
        if (_libraryId_QueryDerivedReferrer_LibraryUserListParameterMap == null) { _libraryId_QueryDerivedReferrer_LibraryUserListParameterMap = newLinkedHashMapSized(4); }
        String ky = "subQueryParameterKey" + (_libraryId_QueryDerivedReferrer_LibraryUserListParameterMap.size() + 1);
        _libraryId_QueryDerivedReferrer_LibraryUserListParameterMap.put(ky, vl); return "libraryId_QueryDerivedReferrer_LibraryUserListParameter." + ky;
    }

    protected Map<String, LdNextLibraryCQ> _libraryId_QueryDerivedReferrer_NextLibraryByLibraryIdListMap;
    public Map<String, LdNextLibraryCQ> getLibraryId_QueryDerivedReferrer_NextLibraryByLibraryIdList() { return _libraryId_QueryDerivedReferrer_NextLibraryByLibraryIdListMap; }
    public String keepLibraryId_QueryDerivedReferrer_NextLibraryByLibraryIdList(LdNextLibraryCQ sq) {
        if (_libraryId_QueryDerivedReferrer_NextLibraryByLibraryIdListMap == null) { _libraryId_QueryDerivedReferrer_NextLibraryByLibraryIdListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_libraryId_QueryDerivedReferrer_NextLibraryByLibraryIdListMap.size() + 1);
        _libraryId_QueryDerivedReferrer_NextLibraryByLibraryIdListMap.put(ky, sq); return "libraryId_QueryDerivedReferrer_NextLibraryByLibraryIdList." + ky;
    }
    protected Map<String, Object> _libraryId_QueryDerivedReferrer_NextLibraryByLibraryIdListParameterMap;
    public Map<String, Object> getLibraryId_QueryDerivedReferrer_NextLibraryByLibraryIdListParameter() { return _libraryId_QueryDerivedReferrer_NextLibraryByLibraryIdListParameterMap; }
    public String keepLibraryId_QueryDerivedReferrer_NextLibraryByLibraryIdListParameter(Object vl) {
        if (_libraryId_QueryDerivedReferrer_NextLibraryByLibraryIdListParameterMap == null) { _libraryId_QueryDerivedReferrer_NextLibraryByLibraryIdListParameterMap = newLinkedHashMapSized(4); }
        String ky = "subQueryParameterKey" + (_libraryId_QueryDerivedReferrer_NextLibraryByLibraryIdListParameterMap.size() + 1);
        _libraryId_QueryDerivedReferrer_NextLibraryByLibraryIdListParameterMap.put(ky, vl); return "libraryId_QueryDerivedReferrer_NextLibraryByLibraryIdListParameter." + ky;
    }

    protected Map<String, LdNextLibraryCQ> _libraryId_QueryDerivedReferrer_NextLibraryByNextLibraryIdListMap;
    public Map<String, LdNextLibraryCQ> getLibraryId_QueryDerivedReferrer_NextLibraryByNextLibraryIdList() { return _libraryId_QueryDerivedReferrer_NextLibraryByNextLibraryIdListMap; }
    public String keepLibraryId_QueryDerivedReferrer_NextLibraryByNextLibraryIdList(LdNextLibraryCQ sq) {
        if (_libraryId_QueryDerivedReferrer_NextLibraryByNextLibraryIdListMap == null) { _libraryId_QueryDerivedReferrer_NextLibraryByNextLibraryIdListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_libraryId_QueryDerivedReferrer_NextLibraryByNextLibraryIdListMap.size() + 1);
        _libraryId_QueryDerivedReferrer_NextLibraryByNextLibraryIdListMap.put(ky, sq); return "libraryId_QueryDerivedReferrer_NextLibraryByNextLibraryIdList." + ky;
    }
    protected Map<String, Object> _libraryId_QueryDerivedReferrer_NextLibraryByNextLibraryIdListParameterMap;
    public Map<String, Object> getLibraryId_QueryDerivedReferrer_NextLibraryByNextLibraryIdListParameter() { return _libraryId_QueryDerivedReferrer_NextLibraryByNextLibraryIdListParameterMap; }
    public String keepLibraryId_QueryDerivedReferrer_NextLibraryByNextLibraryIdListParameter(Object vl) {
        if (_libraryId_QueryDerivedReferrer_NextLibraryByNextLibraryIdListParameterMap == null) { _libraryId_QueryDerivedReferrer_NextLibraryByNextLibraryIdListParameterMap = newLinkedHashMapSized(4); }
        String ky = "subQueryParameterKey" + (_libraryId_QueryDerivedReferrer_NextLibraryByNextLibraryIdListParameterMap.size() + 1);
        _libraryId_QueryDerivedReferrer_NextLibraryByNextLibraryIdListParameterMap.put(ky, vl); return "libraryId_QueryDerivedReferrer_NextLibraryByNextLibraryIdListParameter." + ky;
    }

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
    public ConditionValue getLibraryName() {
        if (_libraryName == null) { _libraryName = nCV(); }
        return _libraryName;
    }
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
    public ConditionValue getLibraryTypeCode() {
        if (_libraryTypeCode == null) { _libraryTypeCode = nCV(); }
        return _libraryTypeCode;
    }
    protected ConditionValue getCValueLibraryTypeCode() { return getLibraryTypeCode(); }

    protected Map<String, LdLibraryTypeLookupCQ> _libraryTypeCode_InScopeRelation_LibraryTypeLookupMap;
    public Map<String, LdLibraryTypeLookupCQ> getLibraryTypeCode_InScopeRelation_LibraryTypeLookup() { return _libraryTypeCode_InScopeRelation_LibraryTypeLookupMap; }
    public String keepLibraryTypeCode_InScopeRelation_LibraryTypeLookup(LdLibraryTypeLookupCQ sq) {
        if (_libraryTypeCode_InScopeRelation_LibraryTypeLookupMap == null) { _libraryTypeCode_InScopeRelation_LibraryTypeLookupMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_libraryTypeCode_InScopeRelation_LibraryTypeLookupMap.size() + 1);
        _libraryTypeCode_InScopeRelation_LibraryTypeLookupMap.put(ky, sq); return "libraryTypeCode_InScopeRelation_LibraryTypeLookup." + ky;
    }

    protected Map<String, LdLibraryTypeLookupCQ> _libraryTypeCode_NotInScopeRelation_LibraryTypeLookupMap;
    public Map<String, LdLibraryTypeLookupCQ> getLibraryTypeCode_NotInScopeRelation_LibraryTypeLookup() { return _libraryTypeCode_NotInScopeRelation_LibraryTypeLookupMap; }
    public String keepLibraryTypeCode_NotInScopeRelation_LibraryTypeLookup(LdLibraryTypeLookupCQ sq) {
        if (_libraryTypeCode_NotInScopeRelation_LibraryTypeLookupMap == null) { _libraryTypeCode_NotInScopeRelation_LibraryTypeLookupMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_libraryTypeCode_NotInScopeRelation_LibraryTypeLookupMap.size() + 1);
        _libraryTypeCode_NotInScopeRelation_LibraryTypeLookupMap.put(ky, sq); return "libraryTypeCode_NotInScopeRelation_LibraryTypeLookup." + ky;
    }

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
    public LdBsLibraryCQ addOrderBy_RUser_Asc() { regOBA("R_USER"); return this; }

    /**
     * Add order-by as descend. <br />
     * R_USER: {NotNull, VARCHAR(100), default=[default-user]}
     * @return this. (NotNull)
     */
    public LdBsLibraryCQ addOrderBy_RUser_Desc() { regOBD("R_USER"); return this; }

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
    public LdBsLibraryCQ addOrderBy_RModule_Asc() { regOBA("R_MODULE"); return this; }

    /**
     * Add order-by as descend. <br />
     * R_MODULE: {NotNull, VARCHAR(100), default=[default-module]}
     * @return this. (NotNull)
     */
    public LdBsLibraryCQ addOrderBy_RModule_Desc() { regOBD("R_MODULE"); return this; }

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
    public LdBsLibraryCQ addOrderBy_RTimestamp_Asc() { regOBA("R_TIMESTAMP"); return this; }

    /**
     * Add order-by as descend. <br />
     * R_TIMESTAMP: {NotNull, TIMESTAMP(26, 6), default=[CURRENT_TIMESTAMP]}
     * @return this. (NotNull)
     */
    public LdBsLibraryCQ addOrderBy_RTimestamp_Desc() { regOBD("R_TIMESTAMP"); return this; }

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
    public LdBsLibraryCQ addOrderBy_UUser_Asc() { regOBA("U_USER"); return this; }

    /**
     * Add order-by as descend. <br />
     * U_USER: {NotNull, VARCHAR(100), default=[default-user]}
     * @return this. (NotNull)
     */
    public LdBsLibraryCQ addOrderBy_UUser_Desc() { regOBD("U_USER"); return this; }

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
    public LdBsLibraryCQ addOrderBy_UModule_Asc() { regOBA("U_MODULE"); return this; }

    /**
     * Add order-by as descend. <br />
     * U_MODULE: {NotNull, VARCHAR(100), default=[default-module]}
     * @return this. (NotNull)
     */
    public LdBsLibraryCQ addOrderBy_UModule_Desc() { regOBD("U_MODULE"); return this; }

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
    public LdBsLibraryCQ addSpecifiedDerivedOrderBy_Asc(String aliasName)
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
    public LdBsLibraryCQ addSpecifiedDerivedOrderBy_Desc(String aliasName)
    { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    protected LdLibraryTypeLookupCQ _conditionQueryLibraryTypeLookup;
    public LdLibraryTypeLookupCQ getConditionQueryLibraryTypeLookup() {
        if (_conditionQueryLibraryTypeLookup == null) {
            _conditionQueryLibraryTypeLookup = xcreateQueryLibraryTypeLookup();
            xsetupOuterJoinLibraryTypeLookup();
        }
        return _conditionQueryLibraryTypeLookup;
    }
    protected LdLibraryTypeLookupCQ xcreateQueryLibraryTypeLookup() {
        String nrp = resolveNextRelationPath("LIBRARY", "libraryTypeLookup");
        String jan = resolveJoinAliasName(nrp, xgetNextNestLevel());
        LdLibraryTypeLookupCQ cq = new LdLibraryTypeLookupCQ(this, xgetSqlClause(), jan, xgetNextNestLevel());
        cq.xsetBaseCB(_baseCB);
        cq.xsetForeignPropertyName("libraryTypeLookup");
        cq.xsetRelationPath(nrp); return cq;
    }
    protected void xsetupOuterJoinLibraryTypeLookup() {
        LdLibraryTypeLookupCQ cq = getConditionQueryLibraryTypeLookup();
        Map<String, String> joinOnMap = newLinkedHashMapSized(4);
        joinOnMap.put("LIBRARY_TYPE_CODE", "LIBRARY_TYPE_CODE");
        registerOuterJoin(cq, joinOnMap, "libraryTypeLookup");
    }
    public boolean hasConditionQueryLibraryTypeLookup() {
        return _conditionQueryLibraryTypeLookup != null;
    }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    protected Map<String, LdLibraryCQ> _scalarConditionMap;
    public Map<String, LdLibraryCQ> getScalarCondition() { return _scalarConditionMap; }
    public String keepScalarCondition(LdLibraryCQ sq) {
        if (_scalarConditionMap == null) { _scalarConditionMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_scalarConditionMap.size() + 1);
        _scalarConditionMap.put(ky, sq); return "scalarCondition." + ky;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    protected Map<String, LdLibraryCQ> _specifyMyselfDerivedMap;
    public Map<String, LdLibraryCQ> getSpecifyMyselfDerived() { return _specifyMyselfDerivedMap; }
    public String keepSpecifyMyselfDerived(LdLibraryCQ sq) {
        if (_specifyMyselfDerivedMap == null) { _specifyMyselfDerivedMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_specifyMyselfDerivedMap.size() + 1);
        _specifyMyselfDerivedMap.put(ky, sq); return "specifyMyselfDerived." + ky;
    }

    protected Map<String, LdLibraryCQ> _queryMyselfDerivedMap;
    public Map<String, LdLibraryCQ> getQueryMyselfDerived() { return _queryMyselfDerivedMap; }
    public String keepQueryMyselfDerived(LdLibraryCQ sq) {
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
    protected Map<String, LdLibraryCQ> _myselfExistsMap;
    public Map<String, LdLibraryCQ> getMyselfExists() { return _myselfExistsMap; }
    public String keepMyselfExists(LdLibraryCQ sq) {
        if (_myselfExistsMap == null) { _myselfExistsMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_myselfExistsMap.size() + 1);
        _myselfExistsMap.put(ky, sq); return "myselfExists." + ky;
    }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    protected Map<String, LdLibraryCQ> _myselfInScopeMap;
    public Map<String, LdLibraryCQ> getMyselfInScope() { return _myselfInScopeMap; }
    public String keepMyselfInScope(LdLibraryCQ sq) {
        if (_myselfInScopeMap == null) { _myselfInScopeMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_myselfInScopeMap.size() + 1);
        _myselfInScopeMap.put(ky, sq); return "myselfInScope." + ky;
    }

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
