/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */package com.example.dbflute.multipledb.spring.dbflute.librarydb.cbean.cq.ciq;

import java.util.Map;
import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.cbean.ckey.*;
import org.seasar.dbflute.cbean.coption.ConditionOption;
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import org.seasar.dbflute.exception.IllegalConditionBeanOperationException;
import com.example.dbflute.multipledb.spring.dbflute.librarydb.cbean.*;
import com.example.dbflute.multipledb.spring.dbflute.librarydb.cbean.cq.bs.*;
import com.example.dbflute.multipledb.spring.dbflute.librarydb.cbean.cq.*;

/**
 * The condition-query for in-line of PUBLISHER.
 * @author DBFlute(AutoGenerator)
 */
public class LdPublisherCIQ extends LdAbstractBsPublisherCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected LdBsPublisherCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public LdPublisherCIQ(ConditionQuery childQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, LdBsPublisherCQ myCQ) {
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
    protected ConditionValue getCValuePublisherId() { return _myCQ.getPublisherId(); }
    public String keepPublisherId_ExistsReferrer_BookList(LdBookCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepPublisherId_NotExistsReferrer_BookList(LdBookCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepPublisherId_InScopeRelation_BookList(LdBookCQ sq)
    { return _myCQ.keepPublisherId_InScopeRelation_BookList(sq); }
    public String keepPublisherId_NotInScopeRelation_BookList(LdBookCQ sq)
    { return _myCQ.keepPublisherId_NotInScopeRelation_BookList(sq); }
    public String keepPublisherId_SpecifyDerivedReferrer_BookList(LdBookCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepPublisherId_QueryDerivedReferrer_BookList(LdBookCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepPublisherId_QueryDerivedReferrer_BookListParameter(Object pv)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    protected ConditionValue getCValuePublisherName() { return _myCQ.getPublisherName(); }
    protected ConditionValue getCValueRUser() { return _myCQ.getRUser(); }
    protected ConditionValue getCValueRModule() { return _myCQ.getRModule(); }
    protected ConditionValue getCValueRTimestamp() { return _myCQ.getRTimestamp(); }
    protected ConditionValue getCValueUUser() { return _myCQ.getUUser(); }
    protected ConditionValue getCValueUModule() { return _myCQ.getUModule(); }
    protected ConditionValue getCValueUTimestamp() { return _myCQ.getUTimestamp(); }
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) { return null; }
    public String keepScalarCondition(LdPublisherCQ subQuery)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(LdPublisherCQ subQuery)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(LdPublisherCQ subQuery)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object parameterValue)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(LdPublisherCQ subQuery)
    { throwIICBOE("MyselfExists"); return null;}
    public String keepMyselfInScope(LdPublisherCQ subQuery)
    { throwIICBOE("MyselfInScope"); return null;}

    protected void throwIICBOE(String name) { // throwInlineIllegalConditionBeanOperationException()
        throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported.");
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return LdPublisherCB.class.getName(); }
    protected String xinCQ() { return LdPublisherCQ.class.getName(); }
}
