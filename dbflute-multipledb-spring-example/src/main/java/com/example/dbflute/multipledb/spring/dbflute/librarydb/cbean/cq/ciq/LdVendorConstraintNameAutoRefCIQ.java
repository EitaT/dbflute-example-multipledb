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
 * The condition-query for in-line of VENDOR_CONSTRAINT_NAME_AUTO_REF.
 * @author DBFlute(AutoGenerator)
 */
public class LdVendorConstraintNameAutoRefCIQ extends LdAbstractBsVendorConstraintNameAutoRefCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected LdBsVendorConstraintNameAutoRefCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public LdVendorConstraintNameAutoRefCIQ(ConditionQuery childQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, LdBsVendorConstraintNameAutoRefCQ myCQ) {
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
    protected ConditionValue getCValueConstraintNameAutoRefId() { return _myCQ.getConstraintNameAutoRefId(); }
    protected ConditionValue getCValueConstraintNameAutoFooId() { return _myCQ.getConstraintNameAutoFooId(); }
    public String keepConstraintNameAutoFooId_InScopeRelation_VendorConstraintNameAutoFoo(LdVendorConstraintNameAutoFooCQ sq)
    { return _myCQ.keepConstraintNameAutoFooId_InScopeRelation_VendorConstraintNameAutoFoo(sq); }
    public String keepConstraintNameAutoFooId_NotInScopeRelation_VendorConstraintNameAutoFoo(LdVendorConstraintNameAutoFooCQ sq)
    { return _myCQ.keepConstraintNameAutoFooId_NotInScopeRelation_VendorConstraintNameAutoFoo(sq); }
    protected ConditionValue getCValueConstraintNameAutoBarId() { return _myCQ.getConstraintNameAutoBarId(); }
    public String keepConstraintNameAutoBarId_InScopeRelation_VendorConstraintNameAutoBar(LdVendorConstraintNameAutoBarCQ sq)
    { return _myCQ.keepConstraintNameAutoBarId_InScopeRelation_VendorConstraintNameAutoBar(sq); }
    public String keepConstraintNameAutoBarId_NotInScopeRelation_VendorConstraintNameAutoBar(LdVendorConstraintNameAutoBarCQ sq)
    { return _myCQ.keepConstraintNameAutoBarId_NotInScopeRelation_VendorConstraintNameAutoBar(sq); }
    protected ConditionValue getCValueConstraintNameAutoQuxId() { return _myCQ.getConstraintNameAutoQuxId(); }
    public String keepConstraintNameAutoQuxId_InScopeRelation_VendorConstraintNameAutoQux(LdVendorConstraintNameAutoQuxCQ sq)
    { return _myCQ.keepConstraintNameAutoQuxId_InScopeRelation_VendorConstraintNameAutoQux(sq); }
    public String keepConstraintNameAutoQuxId_NotInScopeRelation_VendorConstraintNameAutoQux(LdVendorConstraintNameAutoQuxCQ sq)
    { return _myCQ.keepConstraintNameAutoQuxId_NotInScopeRelation_VendorConstraintNameAutoQux(sq); }
    protected ConditionValue getCValueConstraintNameAutoUnique() { return _myCQ.getConstraintNameAutoUnique(); }
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String pp) { return null; }
    public String keepScalarCondition(LdVendorConstraintNameAutoRefCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(LdVendorConstraintNameAutoRefCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(LdVendorConstraintNameAutoRefCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(LdVendorConstraintNameAutoRefCQ sq)
    { throwIICBOE("MyselfExists"); return null;}
    public String keepMyselfInScope(LdVendorConstraintNameAutoRefCQ sq)
    { throwIICBOE("MyselfInScope"); return null;}

    protected void throwIICBOE(String name) { // throwInlineIllegalConditionBeanOperationException()
        throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported.");
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return LdVendorConstraintNameAutoRefCB.class.getName(); }
    protected String xinCQ() { return LdVendorConstraintNameAutoRefCQ.class.getName(); }
}
