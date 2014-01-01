package com.example.dbflute.multipledb.seasar.dbflute.memberdb.cbean.cq.ciq;

import java.util.Map;
import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.cbean.ckey.*;
import org.seasar.dbflute.cbean.coption.ConditionOption;
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import org.seasar.dbflute.exception.IllegalConditionBeanOperationException;
import com.example.dbflute.multipledb.seasar.dbflute.memberdb.cbean.*;
import com.example.dbflute.multipledb.seasar.dbflute.memberdb.cbean.cq.bs.*;
import com.example.dbflute.multipledb.seasar.dbflute.memberdb.cbean.cq.*;

/**
 * The condition-query for in-line of MEMBER_STATUS.
 * @author DBFlute(AutoGenerator)
 */
public class MbMemberStatusCIQ extends MbAbstractBsMemberStatusCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected MbBsMemberStatusCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public MbMemberStatusCIQ(ConditionQuery childQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, MbBsMemberStatusCQ myCQ) {
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
    protected ConditionValue getCValueMemberStatusCode() { return _myCQ.getMemberStatusCode(); }
    public String keepMemberStatusCode_ExistsReferrer_MemberList(MbMemberCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepMemberStatusCode_ExistsReferrer_MemberLoginList(MbMemberLoginCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepMemberStatusCode_NotExistsReferrer_MemberList(MbMemberCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepMemberStatusCode_NotExistsReferrer_MemberLoginList(MbMemberLoginCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepMemberStatusCode_InScopeRelation_MemberList(MbMemberCQ sq)
    { return _myCQ.keepMemberStatusCode_InScopeRelation_MemberList(sq); }
    public String keepMemberStatusCode_InScopeRelation_MemberLoginList(MbMemberLoginCQ sq)
    { return _myCQ.keepMemberStatusCode_InScopeRelation_MemberLoginList(sq); }
    public String keepMemberStatusCode_NotInScopeRelation_MemberList(MbMemberCQ sq)
    { return _myCQ.keepMemberStatusCode_NotInScopeRelation_MemberList(sq); }
    public String keepMemberStatusCode_NotInScopeRelation_MemberLoginList(MbMemberLoginCQ sq)
    { return _myCQ.keepMemberStatusCode_NotInScopeRelation_MemberLoginList(sq); }
    public String keepMemberStatusCode_SpecifyDerivedReferrer_MemberList(MbMemberCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepMemberStatusCode_SpecifyDerivedReferrer_MemberLoginList(MbMemberLoginCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepMemberStatusCode_QueryDerivedReferrer_MemberList(MbMemberCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepMemberStatusCode_QueryDerivedReferrer_MemberListParameter(Object pv)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepMemberStatusCode_QueryDerivedReferrer_MemberLoginList(MbMemberLoginCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepMemberStatusCode_QueryDerivedReferrer_MemberLoginListParameter(Object pv)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    protected ConditionValue getCValueMemberStatusName() { return _myCQ.getMemberStatusName(); }
    protected ConditionValue getCValueDescription() { return _myCQ.getDescription(); }
    protected ConditionValue getCValueDisplayOrder() { return _myCQ.getDisplayOrder(); }
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) { return null; }
    public String keepScalarCondition(MbMemberStatusCQ subQuery)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(MbMemberStatusCQ subQuery)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(MbMemberStatusCQ subQuery)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object parameterValue)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(MbMemberStatusCQ subQuery)
    { throwIICBOE("MyselfExists"); return null;}
    public String keepMyselfInScope(MbMemberStatusCQ subQuery)
    { throwIICBOE("MyselfInScope"); return null;}

    protected void throwIICBOE(String name) { // throwInlineIllegalConditionBeanOperationException()
        throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported.");
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return MbMemberStatusCB.class.getName(); }
    protected String xinCQ() { return MbMemberStatusCQ.class.getName(); }
}
