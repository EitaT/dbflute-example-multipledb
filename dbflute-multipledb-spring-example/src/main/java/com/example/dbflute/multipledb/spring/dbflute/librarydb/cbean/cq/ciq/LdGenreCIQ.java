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
 * The condition-query for in-line of GENRE.
 * @author DBFlute(AutoGenerator)
 */
public class LdGenreCIQ extends LdAbstractBsGenreCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected LdBsGenreCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public LdGenreCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, LdBsGenreCQ myCQ) {
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
    protected ConditionValue getCValueGenreCode() { return _myCQ.getGenreCode(); }
    public String keepGenreCode_ExistsReferrer_BookList(LdBookCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepGenreCode_ExistsReferrer_GenreSelfList(LdGenreCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepGenreCode_NotExistsReferrer_BookList(LdBookCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepGenreCode_NotExistsReferrer_GenreSelfList(LdGenreCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepGenreCode_InScopeRelation_BookList(LdBookCQ sq)
    { return _myCQ.keepGenreCode_InScopeRelation_BookList(sq); }
    public String keepGenreCode_InScopeRelation_GenreSelfList(LdGenreCQ sq)
    { return _myCQ.keepGenreCode_InScopeRelation_GenreSelfList(sq); }
    public String keepGenreCode_NotInScopeRelation_BookList(LdBookCQ sq)
    { return _myCQ.keepGenreCode_NotInScopeRelation_BookList(sq); }
    public String keepGenreCode_NotInScopeRelation_GenreSelfList(LdGenreCQ sq)
    { return _myCQ.keepGenreCode_NotInScopeRelation_GenreSelfList(sq); }
    public String keepGenreCode_SpecifyDerivedReferrer_BookList(LdBookCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepGenreCode_SpecifyDerivedReferrer_GenreSelfList(LdGenreCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepGenreCode_QueryDerivedReferrer_BookList(LdBookCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepGenreCode_QueryDerivedReferrer_BookListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepGenreCode_QueryDerivedReferrer_GenreSelfList(LdGenreCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepGenreCode_QueryDerivedReferrer_GenreSelfListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    protected ConditionValue getCValueGenreName() { return _myCQ.getGenreName(); }
    protected ConditionValue getCValueHierarchyLevel() { return _myCQ.getHierarchyLevel(); }
    protected ConditionValue getCValueHierarchyOrder() { return _myCQ.getHierarchyOrder(); }
    protected ConditionValue getCValueParentGenreCode() { return _myCQ.getParentGenreCode(); }
    public String keepParentGenreCode_InScopeRelation_GenreSelf(LdGenreCQ sq)
    { return _myCQ.keepParentGenreCode_InScopeRelation_GenreSelf(sq); }
    public String keepParentGenreCode_NotInScopeRelation_GenreSelf(LdGenreCQ sq)
    { return _myCQ.keepParentGenreCode_NotInScopeRelation_GenreSelf(sq); }
    protected ConditionValue getCValueRUser() { return _myCQ.getRUser(); }
    protected ConditionValue getCValueRModule() { return _myCQ.getRModule(); }
    protected ConditionValue getCValueRTimestamp() { return _myCQ.getRTimestamp(); }
    protected ConditionValue getCValueUUser() { return _myCQ.getUUser(); }
    protected ConditionValue getCValueUModule() { return _myCQ.getUModule(); }
    protected ConditionValue getCValueUTimestamp() { return _myCQ.getUTimestamp(); }
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String pp) { return null; }
    public String keepScalarCondition(LdGenreCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(LdGenreCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(LdGenreCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(LdGenreCQ sq)
    { throwIICBOE("MyselfExists"); return null;}
    public String keepMyselfInScope(LdGenreCQ sq)
    { throwIICBOE("MyselfInScope"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return LdGenreCB.class.getName(); }
    protected String xinCQ() { return LdGenreCQ.class.getName(); }
}
