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
 * The condition-query for in-line of MYSELF.
 * @author DBFlute(AutoGenerator)
 */
public class LdMyselfCIQ extends LdAbstractBsMyselfCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected LdBsMyselfCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public LdMyselfCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, LdBsMyselfCQ myCQ) {
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
    protected ConditionValue getCValueMyselfId() { return _myCQ.getMyselfId(); }
    public String keepMyselfId_ExistsReferrer_MyselfCheckList(LdMyselfCheckCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepMyselfId_NotExistsReferrer_MyselfCheckList(LdMyselfCheckCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepMyselfId_InScopeRelation_MyselfCheckList(LdMyselfCheckCQ sq)
    { return _myCQ.keepMyselfId_InScopeRelation_MyselfCheckList(sq); }
    public String keepMyselfId_NotInScopeRelation_MyselfCheckList(LdMyselfCheckCQ sq)
    { return _myCQ.keepMyselfId_NotInScopeRelation_MyselfCheckList(sq); }
    public String keepMyselfId_SpecifyDerivedReferrer_MyselfCheckList(LdMyselfCheckCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepMyselfId_QueryDerivedReferrer_MyselfCheckList(LdMyselfCheckCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepMyselfId_QueryDerivedReferrer_MyselfCheckListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    protected ConditionValue getCValueMyselfName() { return _myCQ.getMyselfName(); }
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String pp) { return null; }
    public String keepScalarCondition(LdMyselfCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(LdMyselfCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(LdMyselfCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(LdMyselfCQ sq)
    { throwIICBOE("MyselfExists"); return null;}
    public String keepMyselfInScope(LdMyselfCQ sq)
    { throwIICBOE("MyselfInScope"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return LdMyselfCB.class.getName(); }
    protected String xinCQ() { return LdMyselfCQ.class.getName(); }
}
