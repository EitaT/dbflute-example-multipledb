/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */package com.example.dbflute.multipledb.seasar.dbflute.librarydb.cbean.cq.ciq;

import java.util.Map;
import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.cbean.ckey.*;
import org.seasar.dbflute.cbean.coption.ConditionOption;
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import org.seasar.dbflute.exception.IllegalConditionBeanOperationException;
import com.example.dbflute.multipledb.seasar.dbflute.librarydb.cbean.*;
import com.example.dbflute.multipledb.seasar.dbflute.librarydb.cbean.cq.bs.*;
import com.example.dbflute.multipledb.seasar.dbflute.librarydb.cbean.cq.*;

/**
 * The condition-query for in-line of LIBRARY.
 * @author DBFlute(AutoGenerator)
 */
public class LdLibraryCIQ extends LdAbstractBsLibraryCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected LdBsLibraryCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public LdLibraryCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, LdBsLibraryCQ myCQ) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
        _myCQ = myCQ;
        _foreignPropertyName = _myCQ.xgetForeignPropertyName(); // accept foreign property name
        _relationPath = _myCQ.xgetRelationPath(); // accept relation path
        _inline = true;
    }

    // ===================================================================================
    //                                                             Override about Register
    //                                                             =======================
    protected void reflectRelationOnUnionQuery(ConditionQuery bq, ConditionQuery uq)
    { throw new IllegalConditionBeanOperationException("InlineView cannot use Union: " + bq + " : " + uq); }

    @Override
    protected void setupConditionValueAndRegisterWhereClause(ConditionKey k, Object v, ConditionValue cv, String col)
    { regIQ(k, v, cv, col); }

    @Override
    protected void setupConditionValueAndRegisterWhereClause(ConditionKey k, Object v, ConditionValue cv, String col, ConditionOption op)
    { regIQ(k, v, cv, col, op); }

    @Override
    protected void registerWhereClause(String wc)
    { registerInlineWhereClause(wc); }

    @Override
    protected boolean isInScopeRelationSuppressLocalAliasName() {
        if (_onClause) { throw new IllegalConditionBeanOperationException("InScopeRelation on OnClause is unsupported."); }
        return true;
    }

    // ===================================================================================
    //                                                                Override about Query
    //                                                                ====================
    protected ConditionValue getCValueLibraryId() { return _myCQ.getLibraryId(); }
    public String keepLibraryId_ExistsReferrer_CollectionList(LdCollectionCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepLibraryId_ExistsReferrer_LibraryUserList(LdLibraryUserCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepLibraryId_ExistsReferrer_NextLibraryByLibraryIdList(LdNextLibraryCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepLibraryId_ExistsReferrer_NextLibraryByNextLibraryIdList(LdNextLibraryCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepLibraryId_NotExistsReferrer_CollectionList(LdCollectionCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepLibraryId_NotExistsReferrer_LibraryUserList(LdLibraryUserCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepLibraryId_NotExistsReferrer_NextLibraryByLibraryIdList(LdNextLibraryCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepLibraryId_NotExistsReferrer_NextLibraryByNextLibraryIdList(LdNextLibraryCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepLibraryId_InScopeRelation_CollectionList(LdCollectionCQ sq)
    { return _myCQ.keepLibraryId_InScopeRelation_CollectionList(sq); }
    public String keepLibraryId_InScopeRelation_LibraryUserList(LdLibraryUserCQ sq)
    { return _myCQ.keepLibraryId_InScopeRelation_LibraryUserList(sq); }
    public String keepLibraryId_InScopeRelation_NextLibraryByLibraryIdList(LdNextLibraryCQ sq)
    { return _myCQ.keepLibraryId_InScopeRelation_NextLibraryByLibraryIdList(sq); }
    public String keepLibraryId_InScopeRelation_NextLibraryByNextLibraryIdList(LdNextLibraryCQ sq)
    { return _myCQ.keepLibraryId_InScopeRelation_NextLibraryByNextLibraryIdList(sq); }
    public String keepLibraryId_NotInScopeRelation_CollectionList(LdCollectionCQ sq)
    { return _myCQ.keepLibraryId_NotInScopeRelation_CollectionList(sq); }
    public String keepLibraryId_NotInScopeRelation_LibraryUserList(LdLibraryUserCQ sq)
    { return _myCQ.keepLibraryId_NotInScopeRelation_LibraryUserList(sq); }
    public String keepLibraryId_NotInScopeRelation_NextLibraryByLibraryIdList(LdNextLibraryCQ sq)
    { return _myCQ.keepLibraryId_NotInScopeRelation_NextLibraryByLibraryIdList(sq); }
    public String keepLibraryId_NotInScopeRelation_NextLibraryByNextLibraryIdList(LdNextLibraryCQ sq)
    { return _myCQ.keepLibraryId_NotInScopeRelation_NextLibraryByNextLibraryIdList(sq); }
    public String keepLibraryId_SpecifyDerivedReferrer_CollectionList(LdCollectionCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepLibraryId_SpecifyDerivedReferrer_LibraryUserList(LdLibraryUserCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepLibraryId_SpecifyDerivedReferrer_NextLibraryByLibraryIdList(LdNextLibraryCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepLibraryId_SpecifyDerivedReferrer_NextLibraryByNextLibraryIdList(LdNextLibraryCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepLibraryId_QueryDerivedReferrer_CollectionList(LdCollectionCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepLibraryId_QueryDerivedReferrer_CollectionListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepLibraryId_QueryDerivedReferrer_LibraryUserList(LdLibraryUserCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepLibraryId_QueryDerivedReferrer_LibraryUserListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepLibraryId_QueryDerivedReferrer_NextLibraryByLibraryIdList(LdNextLibraryCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepLibraryId_QueryDerivedReferrer_NextLibraryByLibraryIdListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepLibraryId_QueryDerivedReferrer_NextLibraryByNextLibraryIdList(LdNextLibraryCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepLibraryId_QueryDerivedReferrer_NextLibraryByNextLibraryIdListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    protected ConditionValue getCValueLibraryName() { return _myCQ.getLibraryName(); }
    protected ConditionValue getCValueLibraryTypeCode() { return _myCQ.getLibraryTypeCode(); }
    public String keepLibraryTypeCode_InScopeRelation_LibraryTypeLookup(LdLibraryTypeLookupCQ sq)
    { return _myCQ.keepLibraryTypeCode_InScopeRelation_LibraryTypeLookup(sq); }
    public String keepLibraryTypeCode_NotInScopeRelation_LibraryTypeLookup(LdLibraryTypeLookupCQ sq)
    { return _myCQ.keepLibraryTypeCode_NotInScopeRelation_LibraryTypeLookup(sq); }
    protected ConditionValue getCValueRUser() { return _myCQ.getRUser(); }
    protected ConditionValue getCValueRModule() { return _myCQ.getRModule(); }
    protected ConditionValue getCValueRTimestamp() { return _myCQ.getRTimestamp(); }
    protected ConditionValue getCValueUUser() { return _myCQ.getUUser(); }
    protected ConditionValue getCValueUModule() { return _myCQ.getUModule(); }
    protected ConditionValue getCValueUTimestamp() { return _myCQ.getUTimestamp(); }
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String pp) { return null; }
    public String keepScalarCondition(LdLibraryCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(LdLibraryCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(LdLibraryCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(LdLibraryCQ sq)
    { throwIICBOE("MyselfExists"); return null;}
    public String keepMyselfInScope(LdLibraryCQ sq)
    { throwIICBOE("MyselfInScope"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return LdLibraryCB.class.getName(); }
    protected String xinCQ() { return LdLibraryCQ.class.getName(); }
}
