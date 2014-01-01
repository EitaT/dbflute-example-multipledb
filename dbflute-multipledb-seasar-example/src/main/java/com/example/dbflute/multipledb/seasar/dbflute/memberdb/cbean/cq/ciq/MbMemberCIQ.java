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
 * The condition-query for in-line of MEMBER.
 * @author DBFlute(AutoGenerator)
 */
public class MbMemberCIQ extends MbAbstractBsMemberCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected MbBsMemberCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public MbMemberCIQ(ConditionQuery childQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, MbBsMemberCQ myCQ) {
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
    protected ConditionValue getCValueMemberId() { return _myCQ.getMemberId(); }
    public String keepMemberId_ExistsReferrer_MemberAddressList(MbMemberAddressCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepMemberId_ExistsReferrer_MemberLoginList(MbMemberLoginCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepMemberId_ExistsReferrer_MemberSecurityAsOne(MbMemberSecurityCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepMemberId_ExistsReferrer_MemberServiceAsOne(MbMemberServiceCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepMemberId_ExistsReferrer_MemberWithdrawalAsOne(MbMemberWithdrawalCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepMemberId_ExistsReferrer_PurchaseList(MbPurchaseCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepMemberId_NotExistsReferrer_MemberAddressList(MbMemberAddressCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepMemberId_NotExistsReferrer_MemberLoginList(MbMemberLoginCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepMemberId_NotExistsReferrer_MemberSecurityAsOne(MbMemberSecurityCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepMemberId_NotExistsReferrer_MemberServiceAsOne(MbMemberServiceCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepMemberId_NotExistsReferrer_MemberWithdrawalAsOne(MbMemberWithdrawalCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepMemberId_NotExistsReferrer_PurchaseList(MbPurchaseCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepMemberId_InScopeRelation_MemberAddressList(MbMemberAddressCQ sq)
    { return _myCQ.keepMemberId_InScopeRelation_MemberAddressList(sq); }
    public String keepMemberId_InScopeRelation_MemberLoginList(MbMemberLoginCQ sq)
    { return _myCQ.keepMemberId_InScopeRelation_MemberLoginList(sq); }
    public String keepMemberId_InScopeRelation_MemberSecurityAsOne(MbMemberSecurityCQ sq)
    { return _myCQ.keepMemberId_InScopeRelation_MemberSecurityAsOne(sq); }
    public String keepMemberId_InScopeRelation_MemberServiceAsOne(MbMemberServiceCQ sq)
    { return _myCQ.keepMemberId_InScopeRelation_MemberServiceAsOne(sq); }
    public String keepMemberId_InScopeRelation_MemberWithdrawalAsOne(MbMemberWithdrawalCQ sq)
    { return _myCQ.keepMemberId_InScopeRelation_MemberWithdrawalAsOne(sq); }
    public String keepMemberId_InScopeRelation_PurchaseList(MbPurchaseCQ sq)
    { return _myCQ.keepMemberId_InScopeRelation_PurchaseList(sq); }
    public String keepMemberId_NotInScopeRelation_MemberAddressList(MbMemberAddressCQ sq)
    { return _myCQ.keepMemberId_NotInScopeRelation_MemberAddressList(sq); }
    public String keepMemberId_NotInScopeRelation_MemberLoginList(MbMemberLoginCQ sq)
    { return _myCQ.keepMemberId_NotInScopeRelation_MemberLoginList(sq); }
    public String keepMemberId_NotInScopeRelation_MemberSecurityAsOne(MbMemberSecurityCQ sq)
    { return _myCQ.keepMemberId_NotInScopeRelation_MemberSecurityAsOne(sq); }
    public String keepMemberId_NotInScopeRelation_MemberServiceAsOne(MbMemberServiceCQ sq)
    { return _myCQ.keepMemberId_NotInScopeRelation_MemberServiceAsOne(sq); }
    public String keepMemberId_NotInScopeRelation_MemberWithdrawalAsOne(MbMemberWithdrawalCQ sq)
    { return _myCQ.keepMemberId_NotInScopeRelation_MemberWithdrawalAsOne(sq); }
    public String keepMemberId_NotInScopeRelation_PurchaseList(MbPurchaseCQ sq)
    { return _myCQ.keepMemberId_NotInScopeRelation_PurchaseList(sq); }
    public String keepMemberId_SpecifyDerivedReferrer_MemberAddressList(MbMemberAddressCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepMemberId_SpecifyDerivedReferrer_MemberLoginList(MbMemberLoginCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepMemberId_SpecifyDerivedReferrer_PurchaseList(MbPurchaseCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepMemberId_QueryDerivedReferrer_MemberAddressList(MbMemberAddressCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepMemberId_QueryDerivedReferrer_MemberAddressListParameter(Object pv)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepMemberId_QueryDerivedReferrer_MemberLoginList(MbMemberLoginCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepMemberId_QueryDerivedReferrer_MemberLoginListParameter(Object pv)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepMemberId_QueryDerivedReferrer_PurchaseList(MbPurchaseCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepMemberId_QueryDerivedReferrer_PurchaseListParameter(Object pv)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    protected ConditionValue getCValueMemberName() { return _myCQ.getMemberName(); }
    protected ConditionValue getCValueMemberAccount() { return _myCQ.getMemberAccount(); }
    protected ConditionValue getCValueMemberStatusCode() { return _myCQ.getMemberStatusCode(); }
    public String keepMemberStatusCode_InScopeRelation_MemberStatus(MbMemberStatusCQ sq)
    { return _myCQ.keepMemberStatusCode_InScopeRelation_MemberStatus(sq); }
    public String keepMemberStatusCode_NotInScopeRelation_MemberStatus(MbMemberStatusCQ sq)
    { return _myCQ.keepMemberStatusCode_NotInScopeRelation_MemberStatus(sq); }
    protected ConditionValue getCValueFormalizedDatetime() { return _myCQ.getFormalizedDatetime(); }
    protected ConditionValue getCValueBirthdate() { return _myCQ.getBirthdate(); }
    protected ConditionValue getCValueRegisterDatetime() { return _myCQ.getRegisterDatetime(); }
    protected ConditionValue getCValueRegisterUser() { return _myCQ.getRegisterUser(); }
    protected ConditionValue getCValueUpdateDatetime() { return _myCQ.getUpdateDatetime(); }
    protected ConditionValue getCValueUpdateUser() { return _myCQ.getUpdateUser(); }
    protected ConditionValue getCValueVersionNo() { return _myCQ.getVersionNo(); }
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) { return null; }
    public String keepScalarCondition(MbMemberCQ subQuery)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(MbMemberCQ subQuery)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(MbMemberCQ subQuery)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object parameterValue)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(MbMemberCQ subQuery)
    { throwIICBOE("MyselfExists"); return null;}
    public String keepMyselfInScope(MbMemberCQ subQuery)
    { throwIICBOE("MyselfInScope"); return null;}

    protected void throwIICBOE(String name) { // throwInlineIllegalConditionBeanOperationException()
        throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported.");
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return MbMemberCB.class.getName(); }
    protected String xinCQ() { return MbMemberCQ.class.getName(); }
}
