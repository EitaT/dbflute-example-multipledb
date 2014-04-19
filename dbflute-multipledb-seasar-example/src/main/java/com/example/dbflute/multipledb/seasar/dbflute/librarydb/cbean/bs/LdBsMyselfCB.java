/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */package com.example.dbflute.multipledb.seasar.dbflute.librarydb.cbean.bs;

import org.seasar.dbflute.cbean.AbstractConditionBean;
import org.seasar.dbflute.cbean.AndQuery;
import org.seasar.dbflute.cbean.ConditionBean;
import org.seasar.dbflute.cbean.ConditionQuery;
import org.seasar.dbflute.cbean.OrQuery;
import org.seasar.dbflute.cbean.SpecifyQuery;
import org.seasar.dbflute.cbean.SubQuery;
import org.seasar.dbflute.cbean.UnionQuery;
import org.seasar.dbflute.cbean.chelper.*;
import org.seasar.dbflute.cbean.coption.*;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import org.seasar.dbflute.cbean.sqlclause.SqlClauseCreator;
import org.seasar.dbflute.dbmeta.DBMetaProvider;
import org.seasar.dbflute.twowaysql.factory.SqlAnalyzerFactory;
import com.example.dbflute.multipledb.seasar.dbflute.librarydb.allcommon.LdDBFluteConfig;
import com.example.dbflute.multipledb.seasar.dbflute.librarydb.allcommon.LdDBMetaInstanceHandler;
import com.example.dbflute.multipledb.seasar.dbflute.librarydb.allcommon.LdImplementedInvokerAssistant;
import com.example.dbflute.multipledb.seasar.dbflute.librarydb.allcommon.LdImplementedSqlClauseCreator;
import com.example.dbflute.multipledb.seasar.dbflute.librarydb.cbean.*;
import com.example.dbflute.multipledb.seasar.dbflute.librarydb.cbean.cq.*;

/**
 * The base condition-bean of MYSELF.
 * @author DBFlute(AutoGenerator)
 */
public class LdBsMyselfCB extends AbstractConditionBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected LdMyselfCQ _conditionQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public LdBsMyselfCB() {
        if (LdDBFluteConfig.getInstance().isPagingCountLater()) {
            enablePagingCountLater();
        }
        if (LdDBFluteConfig.getInstance().isPagingCountLeastJoin()) {
            enablePagingCountLeastJoin();
        }
        if (LdDBFluteConfig.getInstance().isCheckCountBeforeQueryUpdate()) {
            enableCheckCountBeforeQueryUpdate();
        }
    }

    // ===================================================================================
    //                                                                           SqlClause
    //                                                                           =========
    @Override
    protected SqlClause createSqlClause() {
        SqlClauseCreator creator = LdDBFluteConfig.getInstance().getSqlClauseCreator();
        if (creator != null) {
            return creator.createSqlClause(this);
        }
        return new LdImplementedSqlClauseCreator().createSqlClause(this); // as default
    }

    // ===================================================================================
    //                                                                     DBMeta Provider
    //                                                                     ===============
    @Override
    protected DBMetaProvider getDBMetaProvider() {
        return LdDBMetaInstanceHandler.getProvider(); // as default
    }

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "MYSELF";
    }

    // ===================================================================================
    //                                                                 PrimaryKey Handling
    //                                                                 ===================
    public void acceptPrimaryKey(Integer myselfId) {
        assertObjectNotNull("myselfId", myselfId);
        LdBsMyselfCB cb = this;
        cb.query().setMyselfId_Equal(myselfId);
    }

    public ConditionBean addOrderBy_PK_Asc() {
        query().addOrderBy_MyselfId_Asc();
        return this;
    }

    public ConditionBean addOrderBy_PK_Desc() {
        query().addOrderBy_MyselfId_Desc();
        return this;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Prepare for various queries. <br />
     * Examples of main functions are following:
     * <pre>
     * <span style="color: #3F7E5E">// Basic Queries</span>
     * cb.query().setMemberId_Equal(value);        <span style="color: #3F7E5E">// =</span>
     * cb.query().setMemberId_NotEqual(value);     <span style="color: #3F7E5E">// !=</span>
     * cb.query().setMemberId_GreaterThan(value);  <span style="color: #3F7E5E">// &gt;</span>
     * cb.query().setMemberId_LessThan(value);     <span style="color: #3F7E5E">// &lt;</span>
     * cb.query().setMemberId_GreaterEqual(value); <span style="color: #3F7E5E">// &gt;=</span>
     * cb.query().setMemberId_LessEqual(value);    <span style="color: #3F7E5E">// &lt;=</span>
     * cb.query().setMemberName_InScope(valueList);    <span style="color: #3F7E5E">// in ('a', 'b')</span>
     * cb.query().setMemberName_NotInScope(valueList); <span style="color: #3F7E5E">// not in ('a', 'b')</span>
     * cb.query().setMemberName_PrefixSearch(value);   <span style="color: #3F7E5E">// like 'a%' escape '|'</span>
     * <span style="color: #3F7E5E">// LikeSearch with various options: (versatile)</span>
     * <span style="color: #3F7E5E">// {like ... [options]}</span>
     * cb.query().setMemberName_LikeSearch(value, option);
     * cb.query().setMemberName_NotLikeSearch(value, option); <span style="color: #3F7E5E">// not like ...</span>
     * <span style="color: #3F7E5E">// FromTo with various options: (versatile)</span>
     * <span style="color: #3F7E5E">// {(default) fromDatetime &lt;= BIRTHDATE &lt;= toDatetime}</span>
     * cb.query().setBirthdate_FromTo(fromDatetime, toDatetime, option);
     * <span style="color: #3F7E5E">// DateFromTo: (Date means yyyy/MM/dd)</span>
     * <span style="color: #3F7E5E">// {fromDate &lt;= BIRTHDATE &lt; toDate + 1 day}</span>
     * cb.query().setBirthdate_DateFromTo(fromDate, toDate);
     * cb.query().setBirthdate_IsNull();    <span style="color: #3F7E5E">// is null</span>
     * cb.query().setBirthdate_IsNotNull(); <span style="color: #3F7E5E">// is not null</span>
     * 
     * <span style="color: #3F7E5E">// ExistsReferrer: (correlated sub-query)</span>
     * <span style="color: #3F7E5E">// {where exists (select PURCHASE_ID from PURCHASE where ...)}</span>
     * cb.query().existsPurchaseList(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.query().setXxx... <span style="color: #3F7E5E">// referrer sub-query condition</span>
     *     }
     * });
     * cb.query().notExistsPurchaseList...
     * 
     * <span style="color: #3F7E5E">// InScopeRelation: (sub-query)</span>
     * <span style="color: #3F7E5E">// {where MEMBER_STATUS_CODE in (select MEMBER_STATUS_CODE from MEMBER_STATUS where ...)}</span>
     * cb.query().inScopeMemberStatus(new SubQuery&lt;MemberStatusCB&gt;() {
     *     public void query(MemberStatusCB subCB) {
     *         subCB.query().setXxx... <span style="color: #3F7E5E">// relation sub-query condition</span>
     *     }
     * });
     * cb.query().notInScopeMemberStatus...
     * 
     * <span style="color: #3F7E5E">// (Query)DerivedReferrer: (correlated sub-query)</span>
     * cb.query().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchasePrice(); <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setXxx... <span style="color: #3F7E5E">// referrer sub-query condition</span>
     *     }
     * }).greaterEqual(value);
     * 
     * <span style="color: #3F7E5E">// ScalarCondition: (self-table sub-query)</span>
     * cb.query().scalar_Equal().max(new SubQuery&lt;MemberCB&gt;() {
     *     public void query(MemberCB subCB) {
     *         subCB.specify().columnBirthdate(); <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setXxx... <span style="color: #3F7E5E">// scalar sub-query condition</span>
     *     }
     * });
     * 
     * <span style="color: #3F7E5E">// OrderBy</span>
     * cb.query().addOrderBy_MemberName_Asc();
     * cb.query().addOrderBy_MemberName_Desc().withManualOrder(valueList);
     * cb.query().addOrderBy_MemberName_Desc().withNullsFirst();
     * cb.query().addOrderBy_MemberName_Desc().withNullsLast();
     * cb.query().addSpecifiedDerivedOrderBy_Desc(aliasName);
     * 
     * <span style="color: #3F7E5E">// Query(Relation)</span>
     * cb.query().queryMemberStatus()...;
     * cb.query().queryMemberAddressAsValid(targetDate)...;
     * </pre>
     * @return The instance of condition-query for base-point table to set up query. (NotNull)
     */
    public LdMyselfCQ query() {
        assertQueryPurpose(); // assert only when user-public query 
        return getConditionQuery();
    }

    public LdMyselfCQ getConditionQuery() { // public for parameter comment and internal
        if (_conditionQuery == null) {
            _conditionQuery = createLocalCQ();
        }
        return _conditionQuery;
    }

    protected LdMyselfCQ createLocalCQ() {
        return xcreateCQ(null, getSqlClause(), getSqlClause().getBasePointAliasName(), 0);
    }

    protected LdMyselfCQ xcreateCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        LdMyselfCQ cq = xnewCQ(childQuery, sqlClause, aliasName, nestLevel);
        cq.xsetBaseCB(this);
        return cq;
    }

    protected LdMyselfCQ xnewCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        return new LdMyselfCQ(childQuery, sqlClause, aliasName, nestLevel);
    }

    public ConditionQuery localCQ() {
        return getConditionQuery();
    }

    // ===================================================================================
    //                                                                               Union
    //                                                                               =====
    /**
     * Set up 'union' for base-point table. <br />
     * You don't need to call SetupSelect in union-query,
     * because it inherits calls before. (Don't call SetupSelect after here)
     * <pre>
     * cb.query().<span style="color: #FD4747">union</span>(new UnionQuery&lt;LdMyselfCB&gt;() {
     *     public void query(LdMyselfCB unionCB) {
     *         unionCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param unionQuery The query of 'union'. (NotNull)
     */
    public void union(UnionQuery<LdMyselfCB> unionQuery) {
        final LdMyselfCB cb = new LdMyselfCB();
        cb.xsetupForUnion(this); xsyncUQ(cb); unionQuery.query(cb); xsaveUCB(cb);
        final LdMyselfCQ cq = cb.query(); query().xsetUnionQuery(cq);
    }

    /**
     * Set up 'union all' for base-point table. <br />
     * You don't need to call SetupSelect in union-query,
     * because it inherits calls before. (Don't call SetupSelect after here)
     * <pre>
     * cb.query().<span style="color: #FD4747">unionAll</span>(new UnionQuery&lt;LdMyselfCB&gt;() {
     *     public void query(LdMyselfCB unionCB) {
     *         unionCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param unionQuery The query of 'union all'. (NotNull)
     */
    public void unionAll(UnionQuery<LdMyselfCB> unionQuery) {
        final LdMyselfCB cb = new LdMyselfCB();
        cb.xsetupForUnion(this); xsyncUQ(cb); unionQuery.query(cb); xsaveUCB(cb);
        final LdMyselfCQ cq = cb.query(); query().xsetUnionAllQuery(cq);
    }

    // ===================================================================================
    //                                                                         SetupSelect
    //                                                                         ===========

    // [DBFlute-0.7.4]
    // ===================================================================================
    //                                                                             Specify
    //                                                                             =======
    protected HpSpecification _specification;

    /**
     * Prepare for SpecifyColumn, (Specify)DerivedReferrer. <br />
     * This method should be called after SetupSelect.
     * <pre>
     * cb.setupSelect_MemberStatus(); <span style="color: #3F7E5E">// should be called before specify()</span>
     * cb.specify().columnMemberName();
     * cb.specify().specifyMemberStatus().columnMemberStatusName();
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *         subCB.query().set...
     *     }
     * }, aliasName);
     * </pre>
     * @return The instance of specification. (NotNull)
     */
    public HpSpecification specify() {
        assertSpecifyPurpose();
        if (_specification == null) { _specification = new HpSpecification(this
            , new HpSpQyCall<LdMyselfCQ>() {
                public boolean has() { return true; }
                public LdMyselfCQ qy() { return getConditionQuery(); }
            }
            , _purpose, getDBMetaProvider()); }
        return _specification;
    }

    public HpColumnSpHandler localSp() {
        return specify();
    }

    public boolean hasSpecifiedColumn() {
        return _specification != null && _specification.isAlreadySpecifiedRequiredColumn();
    }

    public static class HpSpecification extends HpAbstractSpecification<LdMyselfCQ> {
        public HpSpecification(ConditionBean baseCB, HpSpQyCall<LdMyselfCQ> qyCall
                             , HpCBPurpose purpose, DBMetaProvider dbmetaProvider)
        { super(baseCB, qyCall, purpose, dbmetaProvider); }
        /**
         * MYSELF_ID: {PK, NotNull, INTEGER(10)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnMyselfId() { return doColumn("MYSELF_ID"); }
        /**
         * MYSELF_NAME: {NotNull, VARCHAR(80)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnMyselfName() { return doColumn("MYSELF_NAME"); }
        public void everyColumn() { doEveryColumn(); }
        public void exceptRecordMetaColumn() { doExceptRecordMetaColumn(); }
        @Override
        protected void doSpecifyRequiredColumn() {
            columnMyselfId(); // PK
        }
        @Override
        protected String getTableDbName() { return "MYSELF"; }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br />
         * {select max(FOO) from MYSELF_CHECK where ...) as FOO_MAX} <br />
         * MYSELF_CHECK by MYSELF_ID, named 'myselfCheckList'.
         * <pre>
         * cb.specify().<span style="color: #FD4747">derivedMyselfCheckList()</span>.<span style="color: #FD4747">max</span>(new SubQuery&lt;LdMyselfCheckCB&gt;() {
         *     public void query(LdMyselfCheckCB subCB) {
         *         subCB.specify().<span style="color: #FD4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *         subCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
         *     }
         * }, LdMyselfCheck.<span style="color: #FD4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<LdMyselfCheckCB, LdMyselfCQ> derivedMyselfCheckList() {
            assertDerived("myselfCheckList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return new HpSDRFunction<LdMyselfCheckCB, LdMyselfCQ>(_baseCB, _qyCall.qy(), new HpSDRSetupper<LdMyselfCheckCB, LdMyselfCQ>() {
                public void setup(String fn, SubQuery<LdMyselfCheckCB> sq, LdMyselfCQ cq, String al, DerivedReferrerOption op) {
                    cq.xsderiveMyselfCheckList(fn, sq, al, op); } }, _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)MyselfDerived (SubQuery).
         * @return The object to set up a function for myself table. (NotNull)
         */
        public HpSDRFunction<LdMyselfCB, LdMyselfCQ> myselfDerived() {
            assertDerived("myselfDerived"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return new HpSDRFunction<LdMyselfCB, LdMyselfCQ>(_baseCB, _qyCall.qy(), new HpSDRSetupper<LdMyselfCB, LdMyselfCQ>() {
                public void setup(String fn, SubQuery<LdMyselfCB> sq, LdMyselfCQ cq, String al, DerivedReferrerOption op) {
                    cq.xsmyselfDerive(fn, sq, al, op); } }, _dbmetaProvider);
        }
    }

    // [DBFlute-0.9.5.3]
    // ===================================================================================
    //                                                                         ColumnQuery
    //                                                                         ===========
    /**
     * Set up column-query. {column1 = column2}
     * <pre>
     * <span style="color: #3F7E5E">// where FOO &lt; BAR</span>
     * cb.<span style="color: #FD4747">columnQuery</span>(new SpecifyQuery&lt;LdMyselfCB&gt;() {
     *     public void query(LdMyselfCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFoo()</span>; <span style="color: #3F7E5E">// left column</span>
     *     }
     * }).lessThan(new SpecifyQuery&lt;LdMyselfCB&gt;() {
     *     public void query(LdMyselfCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnBar()</span>; <span style="color: #3F7E5E">// right column</span>
     *     }
     * }); <span style="color: #3F7E5E">// you can calculate for right column like '}).plus(3);'</span>
     * </pre>
     * @param leftSpecifyQuery The specify-query for left column. (NotNull)
     * @return The object for setting up operand and right column. (NotNull)
     */
    public HpColQyOperand<LdMyselfCB> columnQuery(final SpecifyQuery<LdMyselfCB> leftSpecifyQuery) {
        return new HpColQyOperand<LdMyselfCB>(new HpColQyHandler<LdMyselfCB>() {
            public HpCalculator handle(SpecifyQuery<LdMyselfCB> rightSp, String operand) {
                return xcolqy(xcreateColumnQueryCB(), xcreateColumnQueryCB(), leftSpecifyQuery, rightSp, operand);
            }
        });
    }

    protected LdMyselfCB xcreateColumnQueryCB() {
        LdMyselfCB cb = new LdMyselfCB();
        cb.xsetupForColumnQuery((LdMyselfCB)this);
        return cb;
    }

    // ===================================================================================
    //                                                                        Dream Cruise
    //                                                                        ============
    /**
     * Welcome to the Dream Cruise for condition-bean deep world. <br />
     * This is very specialty so you can get the frontier spirit. Bon voyage!
     * @return The condition-bean for dream cruise, which is linked to main condition-bean.
     */
    public LdMyselfCB dreamCruiseCB() {
        LdMyselfCB cb = new LdMyselfCB();
        cb.xsetupForDreamCruise((LdMyselfCB) this);
        return cb;
    }

    protected ConditionBean xdoCreateDreamCruiseCB() {
        return dreamCruiseCB();
    }

    // [DBFlute-0.9.6.3]
    // ===================================================================================
    //                                                                        OrScopeQuery
    //                                                                        ============
    /**
     * Set up the query for or-scope. <br />
     * (Same-column-and-same-condition-key conditions are allowed in or-scope)
     * <pre>
     * <span style="color: #3F7E5E">// where (FOO = '...' or BAR = '...')</span>
     * cb.<span style="color: #FD4747">orScopeQuery</span>(new OrQuery&lt;LdMyselfCB&gt;() {
     *     public void query(LdMyselfCB orCB) {
     *         orCB.query().setFOO_Equal...
     *         orCB.query().setBAR_Equal...
     *     }
     * });
     * </pre>
     * @param orQuery The query for or-condition. (NotNull)
     */
    public void orScopeQuery(OrQuery<LdMyselfCB> orQuery) {
        xorSQ((LdMyselfCB)this, orQuery);
    }

    /**
     * Set up the and-part of or-scope. <br />
     * (However nested or-scope query and as-or-split of like-search in and-part are unsupported)
     * <pre>
     * <span style="color: #3F7E5E">// where (FOO = '...' or (BAR = '...' and QUX = '...'))</span>
     * cb.<span style="color: #FD4747">orScopeQuery</span>(new OrQuery&lt;LdMyselfCB&gt;() {
     *     public void query(LdMyselfCB orCB) {
     *         orCB.query().setFOO_Equal...
     *         orCB.<span style="color: #FD4747">orScopeQueryAndPart</span>(new AndQuery&lt;LdMyselfCB&gt;() {
     *             public void query(LdMyselfCB andCB) {
     *                 andCB.query().setBar_...
     *                 andCB.query().setQux_...
     *             }
     *         });
     *     }
     * });
     * </pre>
     * @param andQuery The query for and-condition. (NotNull)
     */
    public void orScopeQueryAndPart(AndQuery<LdMyselfCB> andQuery) {
        xorSQAP((LdMyselfCB)this, andQuery);
    }

    // ===================================================================================
    //                                                                          DisplaySQL
    //                                                                          ==========
    @Override
    protected SqlAnalyzerFactory getSqlAnalyzerFactory()
    { return new LdImplementedInvokerAssistant().assistSqlAnalyzerFactory(); }
    @Override
    protected String getLogDateFormat() { return LdDBFluteConfig.getInstance().getLogDateFormat(); }
    @Override
    protected String getLogTimestampFormat() { return LdDBFluteConfig.getInstance().getLogTimestampFormat(); }

    // ===================================================================================
    //                                                                       Meta Handling
    //                                                                       =============
    public boolean hasUnionQueryOrUnionAllQuery() {
        return query().hasUnionQueryOrUnionAllQuery();
    }

    // ===================================================================================
    //                                                                        Purpose Type
    //                                                                        ============
    @Override
    protected void xprepareSyncQyCall(ConditionBean mainCB) {
        final LdMyselfCB cb;
        if (mainCB != null) {
            cb = (LdMyselfCB)mainCB;
        } else {
            cb = new LdMyselfCB();
        }
        specify().xsetSyncQyCall(new HpSpQyCall<LdMyselfCQ>() {
            public boolean has() { return true; }
            public LdMyselfCQ qy() { return cb.query(); }
        });
    }

    // ===================================================================================
    //                                                                            Internal
    //                                                                            ========
    // very internal (for suppressing warn about 'Not Use Import')
    protected String getConditionBeanClassNameInternally() { return LdMyselfCB.class.getName(); }
    protected String getConditionQueryClassNameInternally() { return LdMyselfCQ.class.getName(); }
    protected String getSubQueryClassNameInternally() { return SubQuery.class.getName(); }
    protected String getConditionOptionClassNameInternally() { return ConditionOption.class.getName(); }
}
