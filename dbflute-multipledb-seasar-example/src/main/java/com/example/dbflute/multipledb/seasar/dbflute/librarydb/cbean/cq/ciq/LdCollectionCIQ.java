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
 * The condition-query for in-line of COLLECTION.
 * @author DBFlute(AutoGenerator)
 */
public class LdCollectionCIQ extends LdAbstractBsCollectionCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected LdBsCollectionCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public LdCollectionCIQ(ConditionQuery childQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, LdBsCollectionCQ myCQ) {
        super(childQuery, sqlClause, aliasName, nestLevel);
        _myCQ = myCQ;
        _foreignPropertyName = _myCQ.xgetForeignPropertyName(); // accept foreign property name
        _relationPath = _myCQ.xgetRelationPath(); // accept relation path
        _inline = true;
    }

    // ===================================================================================
    //                                                             Override about Register
    //                                                             =======================
    @Override
    protected void reflectRelationOnUnionQuery(ConditionQuery bq, ConditionQuery uq) {
        String msg = "InlineView must not need UNION method: " + bq + " : " + uq;
        throw new IllegalConditionBeanOperationException(msg);
    }

    @Override
    protected void setupConditionValueAndRegisterWhereClause(ConditionKey k, Object v, ConditionValue cv, String col) {
        regIQ(k, v, cv, col);
    }

    @Override
    protected void setupConditionValueAndRegisterWhereClause(ConditionKey k, Object v, ConditionValue cv, String col, ConditionOption op) {
        regIQ(k, v, cv, col, op);
    }

    @Override
    protected void registerWhereClause(String wc) {
        registerInlineWhereClause(wc);
    }

    @Override
    protected boolean isInScopeRelationSuppressLocalAliasName() {
        if (_onClause) {
            throw new IllegalConditionBeanOperationException("InScopeRelation on OnClause is unsupported.");
        }
        return true;
    }

    // ===================================================================================
    //                                                                Override about Query
    //                                                                ====================
    protected ConditionValue getCValueCollectionId() { return _myCQ.getCollectionId(); }
    public String keepCollectionId_ExistsReferrer_CollectionStatusAsOne(LdCollectionStatusCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepCollectionId_ExistsReferrer_LendingCollectionList(LdLendingCollectionCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepCollectionId_NotExistsReferrer_CollectionStatusAsOne(LdCollectionStatusCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepCollectionId_NotExistsReferrer_LendingCollectionList(LdLendingCollectionCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepCollectionId_InScopeRelation_CollectionStatusAsOne(LdCollectionStatusCQ sq)
    { return _myCQ.keepCollectionId_InScopeRelation_CollectionStatusAsOne(sq); }
    public String keepCollectionId_InScopeRelation_LendingCollectionList(LdLendingCollectionCQ sq)
    { return _myCQ.keepCollectionId_InScopeRelation_LendingCollectionList(sq); }
    public String keepCollectionId_NotInScopeRelation_CollectionStatusAsOne(LdCollectionStatusCQ sq)
    { return _myCQ.keepCollectionId_NotInScopeRelation_CollectionStatusAsOne(sq); }
    public String keepCollectionId_NotInScopeRelation_LendingCollectionList(LdLendingCollectionCQ sq)
    { return _myCQ.keepCollectionId_NotInScopeRelation_LendingCollectionList(sq); }
    public String keepCollectionId_SpecifyDerivedReferrer_LendingCollectionList(LdLendingCollectionCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepCollectionId_QueryDerivedReferrer_LendingCollectionList(LdLendingCollectionCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCollectionId_QueryDerivedReferrer_LendingCollectionListParameter(Object pv)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    protected ConditionValue getCValueLibraryId() { return _myCQ.getLibraryId(); }
    public String keepLibraryId_InScopeRelation_Library(LdLibraryCQ sq)
    { return _myCQ.keepLibraryId_InScopeRelation_Library(sq); }
    public String keepLibraryId_NotInScopeRelation_Library(LdLibraryCQ sq)
    { return _myCQ.keepLibraryId_NotInScopeRelation_Library(sq); }
    protected ConditionValue getCValueBookId() { return _myCQ.getBookId(); }
    public String keepBookId_InScopeRelation_Book(LdBookCQ sq)
    { return _myCQ.keepBookId_InScopeRelation_Book(sq); }
    public String keepBookId_NotInScopeRelation_Book(LdBookCQ sq)
    { return _myCQ.keepBookId_NotInScopeRelation_Book(sq); }
    protected ConditionValue getCValueArrivalDate() { return _myCQ.getArrivalDate(); }
    protected ConditionValue getCValueRUser() { return _myCQ.getRUser(); }
    protected ConditionValue getCValueRModule() { return _myCQ.getRModule(); }
    protected ConditionValue getCValueRTimestamp() { return _myCQ.getRTimestamp(); }
    protected ConditionValue getCValueUUser() { return _myCQ.getUUser(); }
    protected ConditionValue getCValueUModule() { return _myCQ.getUModule(); }
    protected ConditionValue getCValueUTimestamp() { return _myCQ.getUTimestamp(); }
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) { return null; }
    public String keepScalarCondition(LdCollectionCQ subQuery)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(LdCollectionCQ subQuery)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(LdCollectionCQ subQuery)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object parameterValue)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(LdCollectionCQ subQuery)
    { throwIICBOE("MyselfExists"); return null;}
    public String keepMyselfInScope(LdCollectionCQ subQuery)
    { throwIICBOE("MyselfInScope"); return null;}

    protected void throwIICBOE(String name) { // throwInlineIllegalConditionBeanOperationException()
        throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported.");
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return LdCollectionCB.class.getName(); }
    protected String xinCQ() { return LdCollectionCQ.class.getName(); }
}
