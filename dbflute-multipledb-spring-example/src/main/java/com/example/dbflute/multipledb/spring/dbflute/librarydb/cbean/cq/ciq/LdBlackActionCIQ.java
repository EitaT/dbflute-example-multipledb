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
 * The condition-query for in-line of BLACK_ACTION.
 * @author DBFlute(AutoGenerator)
 */
public class LdBlackActionCIQ extends LdAbstractBsBlackActionCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected LdBsBlackActionCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public LdBlackActionCIQ(ConditionQuery childQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, LdBsBlackActionCQ myCQ) {
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
    protected ConditionValue getCValueBlackActionId() { return _myCQ.getBlackActionId(); }
    protected ConditionValue getCValueBlackListId() { return _myCQ.getBlackListId(); }
    public String keepBlackListId_InScopeRelation_BlackList(LdBlackListCQ sq)
    { return _myCQ.keepBlackListId_InScopeRelation_BlackList(sq); }
    public String keepBlackListId_NotInScopeRelation_BlackList(LdBlackListCQ sq)
    { return _myCQ.keepBlackListId_NotInScopeRelation_BlackList(sq); }
    protected ConditionValue getCValueBlackActionCode() { return _myCQ.getBlackActionCode(); }
    public String keepBlackActionCode_InScopeRelation_BlackActionLookup(LdBlackActionLookupCQ sq)
    { return _myCQ.keepBlackActionCode_InScopeRelation_BlackActionLookup(sq); }
    public String keepBlackActionCode_NotInScopeRelation_BlackActionLookup(LdBlackActionLookupCQ sq)
    { return _myCQ.keepBlackActionCode_NotInScopeRelation_BlackActionLookup(sq); }
    protected ConditionValue getCValueBlackLevel() { return _myCQ.getBlackLevel(); }
    protected ConditionValue getCValueActionDate() { return _myCQ.getActionDate(); }
    protected ConditionValue getCValueEvidencePhotograph() { return _myCQ.getEvidencePhotograph(); }
    protected ConditionValue getCValueRUser() { return _myCQ.getRUser(); }
    protected ConditionValue getCValueRModule() { return _myCQ.getRModule(); }
    protected ConditionValue getCValueRTimestamp() { return _myCQ.getRTimestamp(); }
    protected ConditionValue getCValueUUser() { return _myCQ.getUUser(); }
    protected ConditionValue getCValueUModule() { return _myCQ.getUModule(); }
    protected ConditionValue getCValueUTimestamp() { return _myCQ.getUTimestamp(); }
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) { return null; }
    public String keepScalarCondition(LdBlackActionCQ subQuery)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(LdBlackActionCQ subQuery)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(LdBlackActionCQ subQuery)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object parameterValue)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(LdBlackActionCQ subQuery)
    { throwIICBOE("MyselfExists"); return null;}
    public String keepMyselfInScope(LdBlackActionCQ subQuery)
    { throwIICBOE("MyselfInScope"); return null;}

    protected void throwIICBOE(String name) { // throwInlineIllegalConditionBeanOperationException()
        throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported.");
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return LdBlackActionCB.class.getName(); }
    protected String xinCQ() { return LdBlackActionCQ.class.getName(); }
}
