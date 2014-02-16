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
 * The condition-query for in-line of LB_USER.
 * @author DBFlute(AutoGenerator)
 */
public class LdLbUserCIQ extends LdAbstractBsLbUserCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected LdBsLbUserCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public LdLbUserCIQ(ConditionQuery childQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, LdBsLbUserCQ myCQ) {
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
    protected ConditionValue getCValueLbUserId() { return _myCQ.getLbUserId(); }
    public String keepLbUserId_ExistsReferrer_BlackListAsOne(LdBlackListCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepLbUserId_ExistsReferrer_LibraryUserList(LdLibraryUserCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepLbUserId_NotExistsReferrer_BlackListAsOne(LdBlackListCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepLbUserId_NotExistsReferrer_LibraryUserList(LdLibraryUserCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepLbUserId_InScopeRelation_BlackListAsOne(LdBlackListCQ sq)
    { return _myCQ.keepLbUserId_InScopeRelation_BlackListAsOne(sq); }
    public String keepLbUserId_InScopeRelation_LibraryUserList(LdLibraryUserCQ sq)
    { return _myCQ.keepLbUserId_InScopeRelation_LibraryUserList(sq); }
    public String keepLbUserId_NotInScopeRelation_BlackListAsOne(LdBlackListCQ sq)
    { return _myCQ.keepLbUserId_NotInScopeRelation_BlackListAsOne(sq); }
    public String keepLbUserId_NotInScopeRelation_LibraryUserList(LdLibraryUserCQ sq)
    { return _myCQ.keepLbUserId_NotInScopeRelation_LibraryUserList(sq); }
    public String keepLbUserId_SpecifyDerivedReferrer_LibraryUserList(LdLibraryUserCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepLbUserId_QueryDerivedReferrer_LibraryUserList(LdLibraryUserCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepLbUserId_QueryDerivedReferrer_LibraryUserListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    protected ConditionValue getCValueLbUserName() { return _myCQ.getLbUserName(); }
    protected ConditionValue getCValueUserPassword() { return _myCQ.getUserPassword(); }
    protected ConditionValue getCValueRUser() { return _myCQ.getRUser(); }
    protected ConditionValue getCValueRModule() { return _myCQ.getRModule(); }
    protected ConditionValue getCValueRTimestamp() { return _myCQ.getRTimestamp(); }
    protected ConditionValue getCValueUUser() { return _myCQ.getUUser(); }
    protected ConditionValue getCValueUModule() { return _myCQ.getUModule(); }
    protected ConditionValue getCValueUTimestamp() { return _myCQ.getUTimestamp(); }
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String pp) { return null; }
    public String keepScalarCondition(LdLbUserCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(LdLbUserCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(LdLbUserCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(LdLbUserCQ sq)
    { throwIICBOE("MyselfExists"); return null;}
    public String keepMyselfInScope(LdLbUserCQ sq)
    { throwIICBOE("MyselfInScope"); return null;}

    protected void throwIICBOE(String name) { // throwInlineIllegalConditionBeanOperationException()
        throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported.");
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return LdLbUserCB.class.getName(); }
    protected String xinCQ() { return LdLbUserCQ.class.getName(); }
}
