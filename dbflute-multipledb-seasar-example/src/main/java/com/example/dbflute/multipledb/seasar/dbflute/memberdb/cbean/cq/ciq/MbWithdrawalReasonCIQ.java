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
 * The condition-query for in-line of WITHDRAWAL_REASON.
 * @author DBFlute(AutoGenerator)
 */
public class MbWithdrawalReasonCIQ extends MbAbstractBsWithdrawalReasonCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected MbBsWithdrawalReasonCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public MbWithdrawalReasonCIQ(ConditionQuery childQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, MbBsWithdrawalReasonCQ myCQ) {
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
    protected ConditionValue getCValueWithdrawalReasonCode() { return _myCQ.getWithdrawalReasonCode(); }
    public String keepWithdrawalReasonCode_ExistsReferrer_MemberWithdrawalList(MbMemberWithdrawalCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepWithdrawalReasonCode_NotExistsReferrer_MemberWithdrawalList(MbMemberWithdrawalCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepWithdrawalReasonCode_InScopeRelation_MemberWithdrawalList(MbMemberWithdrawalCQ sq)
    { return _myCQ.keepWithdrawalReasonCode_InScopeRelation_MemberWithdrawalList(sq); }
    public String keepWithdrawalReasonCode_NotInScopeRelation_MemberWithdrawalList(MbMemberWithdrawalCQ sq)
    { return _myCQ.keepWithdrawalReasonCode_NotInScopeRelation_MemberWithdrawalList(sq); }
    public String keepWithdrawalReasonCode_SpecifyDerivedReferrer_MemberWithdrawalList(MbMemberWithdrawalCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepWithdrawalReasonCode_QueryDerivedReferrer_MemberWithdrawalList(MbMemberWithdrawalCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepWithdrawalReasonCode_QueryDerivedReferrer_MemberWithdrawalListParameter(Object pv)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    protected ConditionValue getCValueWithdrawalReasonText() { return _myCQ.getWithdrawalReasonText(); }
    protected ConditionValue getCValueDisplayOrder() { return _myCQ.getDisplayOrder(); }
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) { return null; }
    public String keepScalarCondition(MbWithdrawalReasonCQ subQuery)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(MbWithdrawalReasonCQ subQuery)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(MbWithdrawalReasonCQ subQuery)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object parameterValue)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(MbWithdrawalReasonCQ subQuery)
    { throwIICBOE("MyselfExists"); return null;}
    public String keepMyselfInScope(MbWithdrawalReasonCQ subQuery)
    { throwIICBOE("MyselfInScope"); return null;}

    protected void throwIICBOE(String name) { // throwInlineIllegalConditionBeanOperationException()
        throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported.");
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return MbWithdrawalReasonCB.class.getName(); }
    protected String xinCQ() { return MbWithdrawalReasonCQ.class.getName(); }
}
