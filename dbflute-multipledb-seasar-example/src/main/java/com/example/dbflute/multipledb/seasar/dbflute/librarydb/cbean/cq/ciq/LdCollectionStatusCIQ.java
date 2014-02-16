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
 * The condition-query for in-line of COLLECTION_STATUS.
 * @author DBFlute(AutoGenerator)
 */
public class LdCollectionStatusCIQ extends LdAbstractBsCollectionStatusCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected LdBsCollectionStatusCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public LdCollectionStatusCIQ(ConditionQuery childQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, LdBsCollectionStatusCQ myCQ) {
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
    public String keepCollectionId_InScopeRelation_Collection(LdCollectionCQ sq)
    { return _myCQ.keepCollectionId_InScopeRelation_Collection(sq); }
    public String keepCollectionId_NotInScopeRelation_Collection(LdCollectionCQ sq)
    { return _myCQ.keepCollectionId_NotInScopeRelation_Collection(sq); }
    protected ConditionValue getCValueCollectionStatusCode() { return _myCQ.getCollectionStatusCode(); }
    public String keepCollectionStatusCode_InScopeRelation_CollectionStatusLookup(LdCollectionStatusLookupCQ sq)
    { return _myCQ.keepCollectionStatusCode_InScopeRelation_CollectionStatusLookup(sq); }
    public String keepCollectionStatusCode_NotInScopeRelation_CollectionStatusLookup(LdCollectionStatusLookupCQ sq)
    { return _myCQ.keepCollectionStatusCode_NotInScopeRelation_CollectionStatusLookup(sq); }
    protected ConditionValue getCValueRUser() { return _myCQ.getRUser(); }
    protected ConditionValue getCValueRModule() { return _myCQ.getRModule(); }
    protected ConditionValue getCValueRTimestamp() { return _myCQ.getRTimestamp(); }
    protected ConditionValue getCValueUUser() { return _myCQ.getUUser(); }
    protected ConditionValue getCValueUModule() { return _myCQ.getUModule(); }
    protected ConditionValue getCValueUTimestamp() { return _myCQ.getUTimestamp(); }
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String pp) { return null; }
    public String keepScalarCondition(LdCollectionStatusCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(LdCollectionStatusCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(LdCollectionStatusCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(LdCollectionStatusCQ sq)
    { throwIICBOE("MyselfExists"); return null;}
    public String keepMyselfInScope(LdCollectionStatusCQ sq)
    { throwIICBOE("MyselfInScope"); return null;}

    protected void throwIICBOE(String name) { // throwInlineIllegalConditionBeanOperationException()
        throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported.");
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return LdCollectionStatusCB.class.getName(); }
    protected String xinCQ() { return LdCollectionStatusCQ.class.getName(); }
}
