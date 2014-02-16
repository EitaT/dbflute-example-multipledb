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
 * The condition-query for in-line of VENDOR_CONSTRAINT_NAME_AUTO_QUX.
 * @author DBFlute(AutoGenerator)
 */
public class LdVendorConstraintNameAutoQuxCIQ extends LdAbstractBsVendorConstraintNameAutoQuxCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected LdBsVendorConstraintNameAutoQuxCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public LdVendorConstraintNameAutoQuxCIQ(ConditionQuery childQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, LdBsVendorConstraintNameAutoQuxCQ myCQ) {
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
    protected ConditionValue getCValueConstraintNameAutoQuxId() { return _myCQ.getConstraintNameAutoQuxId(); }
    public String keepConstraintNameAutoQuxId_ExistsReferrer_VendorConstraintNameAutoRefList(LdVendorConstraintNameAutoRefCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepConstraintNameAutoQuxId_NotExistsReferrer_VendorConstraintNameAutoRefList(LdVendorConstraintNameAutoRefCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepConstraintNameAutoQuxId_InScopeRelation_VendorConstraintNameAutoRefList(LdVendorConstraintNameAutoRefCQ sq)
    { return _myCQ.keepConstraintNameAutoQuxId_InScopeRelation_VendorConstraintNameAutoRefList(sq); }
    public String keepConstraintNameAutoQuxId_NotInScopeRelation_VendorConstraintNameAutoRefList(LdVendorConstraintNameAutoRefCQ sq)
    { return _myCQ.keepConstraintNameAutoQuxId_NotInScopeRelation_VendorConstraintNameAutoRefList(sq); }
    public String keepConstraintNameAutoQuxId_SpecifyDerivedReferrer_VendorConstraintNameAutoRefList(LdVendorConstraintNameAutoRefCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepConstraintNameAutoQuxId_QueryDerivedReferrer_VendorConstraintNameAutoRefList(LdVendorConstraintNameAutoRefCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepConstraintNameAutoQuxId_QueryDerivedReferrer_VendorConstraintNameAutoRefListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    protected ConditionValue getCValueConstraintNameAutoQuxName() { return _myCQ.getConstraintNameAutoQuxName(); }
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String pp) { return null; }
    public String keepScalarCondition(LdVendorConstraintNameAutoQuxCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(LdVendorConstraintNameAutoQuxCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(LdVendorConstraintNameAutoQuxCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(LdVendorConstraintNameAutoQuxCQ sq)
    { throwIICBOE("MyselfExists"); return null;}
    public String keepMyselfInScope(LdVendorConstraintNameAutoQuxCQ sq)
    { throwIICBOE("MyselfInScope"); return null;}

    protected void throwIICBOE(String name) { // throwInlineIllegalConditionBeanOperationException()
        throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported.");
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return LdVendorConstraintNameAutoQuxCB.class.getName(); }
    protected String xinCQ() { return LdVendorConstraintNameAutoQuxCQ.class.getName(); }
}
