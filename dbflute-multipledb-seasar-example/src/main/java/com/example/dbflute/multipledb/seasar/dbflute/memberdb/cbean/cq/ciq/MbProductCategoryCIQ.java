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
 * The condition-query for in-line of PRODUCT_CATEGORY.
 * @author DBFlute(AutoGenerator)
 */
public class MbProductCategoryCIQ extends MbAbstractBsProductCategoryCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected MbBsProductCategoryCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public MbProductCategoryCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, MbBsProductCategoryCQ myCQ) {
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
    protected ConditionValue getCValueProductCategoryCode() { return _myCQ.getProductCategoryCode(); }
    public String keepProductCategoryCode_ExistsReferrer_ProductList(MbProductCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepProductCategoryCode_ExistsReferrer_ProductCategorySelfList(MbProductCategoryCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepProductCategoryCode_NotExistsReferrer_ProductList(MbProductCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepProductCategoryCode_NotExistsReferrer_ProductCategorySelfList(MbProductCategoryCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepProductCategoryCode_InScopeRelation_ProductList(MbProductCQ sq)
    { return _myCQ.keepProductCategoryCode_InScopeRelation_ProductList(sq); }
    public String keepProductCategoryCode_InScopeRelation_ProductCategorySelfList(MbProductCategoryCQ sq)
    { return _myCQ.keepProductCategoryCode_InScopeRelation_ProductCategorySelfList(sq); }
    public String keepProductCategoryCode_NotInScopeRelation_ProductList(MbProductCQ sq)
    { return _myCQ.keepProductCategoryCode_NotInScopeRelation_ProductList(sq); }
    public String keepProductCategoryCode_NotInScopeRelation_ProductCategorySelfList(MbProductCategoryCQ sq)
    { return _myCQ.keepProductCategoryCode_NotInScopeRelation_ProductCategorySelfList(sq); }
    public String keepProductCategoryCode_SpecifyDerivedReferrer_ProductList(MbProductCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepProductCategoryCode_SpecifyDerivedReferrer_ProductCategorySelfList(MbProductCategoryCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepProductCategoryCode_QueryDerivedReferrer_ProductList(MbProductCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepProductCategoryCode_QueryDerivedReferrer_ProductListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepProductCategoryCode_QueryDerivedReferrer_ProductCategorySelfList(MbProductCategoryCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepProductCategoryCode_QueryDerivedReferrer_ProductCategorySelfListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    protected ConditionValue getCValueProductCategoryName() { return _myCQ.getProductCategoryName(); }
    protected ConditionValue getCValueParentCategoryCode() { return _myCQ.getParentCategoryCode(); }
    public String keepParentCategoryCode_InScopeRelation_ProductCategorySelf(MbProductCategoryCQ sq)
    { return _myCQ.keepParentCategoryCode_InScopeRelation_ProductCategorySelf(sq); }
    public String keepParentCategoryCode_NotInScopeRelation_ProductCategorySelf(MbProductCategoryCQ sq)
    { return _myCQ.keepParentCategoryCode_NotInScopeRelation_ProductCategorySelf(sq); }
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String pp) { return null; }
    public String keepScalarCondition(MbProductCategoryCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(MbProductCategoryCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(MbProductCategoryCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(MbProductCategoryCQ sq)
    { throwIICBOE("MyselfExists"); return null;}
    public String keepMyselfInScope(MbProductCategoryCQ sq)
    { throwIICBOE("MyselfInScope"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return MbProductCategoryCB.class.getName(); }
    protected String xinCQ() { return MbProductCategoryCQ.class.getName(); }
}
