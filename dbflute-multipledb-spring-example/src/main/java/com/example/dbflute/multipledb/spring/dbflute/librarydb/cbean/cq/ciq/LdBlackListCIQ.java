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
 * The condition-query for in-line of BLACK_LIST.
 * @author DBFlute(AutoGenerator)
 */
public class LdBlackListCIQ extends LdAbstractBsBlackListCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected LdBsBlackListCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public LdBlackListCIQ(ConditionQuery childQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, LdBsBlackListCQ myCQ) {
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
    protected ConditionValue getCValueBlackListId() { return _myCQ.getBlackListId(); }
    public String keepBlackListId_ExistsReferrer_BlackActionList(LdBlackActionCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepBlackListId_NotExistsReferrer_BlackActionList(LdBlackActionCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepBlackListId_InScopeRelation_BlackActionList(LdBlackActionCQ sq)
    { return _myCQ.keepBlackListId_InScopeRelation_BlackActionList(sq); }
    public String keepBlackListId_NotInScopeRelation_BlackActionList(LdBlackActionCQ sq)
    { return _myCQ.keepBlackListId_NotInScopeRelation_BlackActionList(sq); }
    public String keepBlackListId_SpecifyDerivedReferrer_BlackActionList(LdBlackActionCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepBlackListId_QueryDerivedReferrer_BlackActionList(LdBlackActionCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepBlackListId_QueryDerivedReferrer_BlackActionListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    protected ConditionValue getCValueLbUserId() { return _myCQ.getLbUserId(); }
    public String keepLbUserId_InScopeRelation_LbUser(LdLbUserCQ sq)
    { return _myCQ.keepLbUserId_InScopeRelation_LbUser(sq); }
    public String keepLbUserId_NotInScopeRelation_LbUser(LdLbUserCQ sq)
    { return _myCQ.keepLbUserId_NotInScopeRelation_LbUser(sq); }
    protected ConditionValue getCValueBlackRank() { return _myCQ.getBlackRank(); }
    protected ConditionValue getCValueRUser() { return _myCQ.getRUser(); }
    protected ConditionValue getCValueRModule() { return _myCQ.getRModule(); }
    protected ConditionValue getCValueRTimestamp() { return _myCQ.getRTimestamp(); }
    protected ConditionValue getCValueUUser() { return _myCQ.getUUser(); }
    protected ConditionValue getCValueUModule() { return _myCQ.getUModule(); }
    protected ConditionValue getCValueUTimestamp() { return _myCQ.getUTimestamp(); }
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String pp) { return null; }
    public String keepScalarCondition(LdBlackListCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(LdBlackListCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(LdBlackListCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(LdBlackListCQ sq)
    { throwIICBOE("MyselfExists"); return null;}
    public String keepMyselfInScope(LdBlackListCQ sq)
    { throwIICBOE("MyselfInScope"); return null;}

    protected void throwIICBOE(String name) { // throwInlineIllegalConditionBeanOperationException()
        throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported.");
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return LdBlackListCB.class.getName(); }
    protected String xinCQ() { return LdBlackListCQ.class.getName(); }
}
