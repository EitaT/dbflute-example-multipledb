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
 * The condition-query for in-line of BOOK.
 * @author DBFlute(AutoGenerator)
 */
public class LdBookCIQ extends LdAbstractBsBookCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected LdBsBookCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public LdBookCIQ(ConditionQuery childQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, LdBsBookCQ myCQ) {
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
    protected ConditionValue getCValueBookId() { return _myCQ.getBookId(); }
    public String keepBookId_ExistsReferrer_CollectionList(LdCollectionCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepBookId_NotExistsReferrer_CollectionList(LdCollectionCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepBookId_InScopeRelation_CollectionList(LdCollectionCQ sq)
    { return _myCQ.keepBookId_InScopeRelation_CollectionList(sq); }
    public String keepBookId_NotInScopeRelation_CollectionList(LdCollectionCQ sq)
    { return _myCQ.keepBookId_NotInScopeRelation_CollectionList(sq); }
    public String keepBookId_SpecifyDerivedReferrer_CollectionList(LdCollectionCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepBookId_QueryDerivedReferrer_CollectionList(LdCollectionCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepBookId_QueryDerivedReferrer_CollectionListParameter(Object pv)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    protected ConditionValue getCValueIsbn() { return _myCQ.getIsbn(); }
    protected ConditionValue getCValueBookName() { return _myCQ.getBookName(); }
    protected ConditionValue getCValueAuthorId() { return _myCQ.getAuthorId(); }
    public String keepAuthorId_InScopeRelation_Author(LdAuthorCQ sq)
    { return _myCQ.keepAuthorId_InScopeRelation_Author(sq); }
    public String keepAuthorId_NotInScopeRelation_Author(LdAuthorCQ sq)
    { return _myCQ.keepAuthorId_NotInScopeRelation_Author(sq); }
    protected ConditionValue getCValuePublisherId() { return _myCQ.getPublisherId(); }
    public String keepPublisherId_InScopeRelation_Publisher(LdPublisherCQ sq)
    { return _myCQ.keepPublisherId_InScopeRelation_Publisher(sq); }
    public String keepPublisherId_NotInScopeRelation_Publisher(LdPublisherCQ sq)
    { return _myCQ.keepPublisherId_NotInScopeRelation_Publisher(sq); }
    protected ConditionValue getCValueGenreCode() { return _myCQ.getGenreCode(); }
    public String keepGenreCode_InScopeRelation_Genre(LdGenreCQ sq)
    { return _myCQ.keepGenreCode_InScopeRelation_Genre(sq); }
    public String keepGenreCode_NotInScopeRelation_Genre(LdGenreCQ sq)
    { return _myCQ.keepGenreCode_NotInScopeRelation_Genre(sq); }
    protected ConditionValue getCValueOpeningPart() { return _myCQ.getOpeningPart(); }
    protected ConditionValue getCValueMaxLendingDateCount() { return _myCQ.getMaxLendingDateCount(); }
    protected ConditionValue getCValueOutOfUserSelectYn() { return _myCQ.getOutOfUserSelectYn(); }
    protected ConditionValue getCValueOutOfUserSelectReason() { return _myCQ.getOutOfUserSelectReason(); }
    protected ConditionValue getCValueRUser() { return _myCQ.getRUser(); }
    protected ConditionValue getCValueRModule() { return _myCQ.getRModule(); }
    protected ConditionValue getCValueRTimestamp() { return _myCQ.getRTimestamp(); }
    protected ConditionValue getCValueUUser() { return _myCQ.getUUser(); }
    protected ConditionValue getCValueUModule() { return _myCQ.getUModule(); }
    protected ConditionValue getCValueUTimestamp() { return _myCQ.getUTimestamp(); }
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) { return null; }
    public String keepScalarCondition(LdBookCQ subQuery)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(LdBookCQ subQuery)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(LdBookCQ subQuery)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object parameterValue)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(LdBookCQ subQuery)
    { throwIICBOE("MyselfExists"); return null;}
    public String keepMyselfInScope(LdBookCQ subQuery)
    { throwIICBOE("MyselfInScope"); return null;}

    protected void throwIICBOE(String name) { // throwInlineIllegalConditionBeanOperationException()
        throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported.");
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return LdBookCB.class.getName(); }
    protected String xinCQ() { return LdBookCQ.class.getName(); }
}
