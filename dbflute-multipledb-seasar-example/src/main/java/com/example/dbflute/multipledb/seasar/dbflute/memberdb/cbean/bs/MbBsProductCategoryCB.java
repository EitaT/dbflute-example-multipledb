package com.example.dbflute.multipledb.seasar.dbflute.memberdb.cbean.bs;

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
import com.example.dbflute.multipledb.seasar.dbflute.memberdb.allcommon.MbDBFluteConfig;
import com.example.dbflute.multipledb.seasar.dbflute.memberdb.allcommon.MbDBMetaInstanceHandler;
import com.example.dbflute.multipledb.seasar.dbflute.memberdb.allcommon.MbImplementedInvokerAssistant;
import com.example.dbflute.multipledb.seasar.dbflute.memberdb.allcommon.MbImplementedSqlClauseCreator;
import com.example.dbflute.multipledb.seasar.dbflute.memberdb.cbean.*;
import com.example.dbflute.multipledb.seasar.dbflute.memberdb.cbean.cq.*;
import com.example.dbflute.multipledb.seasar.dbflute.memberdb.cbean.nss.*;

/**
 * The base condition-bean of PRODUCT_CATEGORY.
 * @author DBFlute(AutoGenerator)
 */
public class MbBsProductCategoryCB extends AbstractConditionBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected MbProductCategoryCQ _conditionQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public MbBsProductCategoryCB() {
        if (MbDBFluteConfig.getInstance().isPagingCountLater()) {
            enablePagingCountLater();
        }
        if (MbDBFluteConfig.getInstance().isPagingCountLeastJoin()) {
            enablePagingCountLeastJoin();
        }
        if (MbDBFluteConfig.getInstance().isCheckCountBeforeQueryUpdate()) {
            enableCheckCountBeforeQueryUpdate();
        }
    }

    // ===================================================================================
    //                                                                           SqlClause
    //                                                                           =========
    @Override
    protected SqlClause createSqlClause() {
        SqlClauseCreator creator = MbDBFluteConfig.getInstance().getSqlClauseCreator();
        if (creator != null) {
            return creator.createSqlClause(this);
        }
        return new MbImplementedSqlClauseCreator().createSqlClause(this); // as default
    }

    // ===================================================================================
    //                                                                     DBMeta Provider
    //                                                                     ===============
    @Override
    protected DBMetaProvider getDBMetaProvider() {
        return MbDBMetaInstanceHandler.getProvider(); // as default
    }

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "PRODUCT_CATEGORY";
    }

    // ===================================================================================
    //                                                                 PrimaryKey Handling
    //                                                                 ===================
    /**
     * Accept the query condition of primary key as equal.
     * @param productCategoryCode : PK, NotNull, CHAR(3). (NotNull)
     * @return this. (NotNull)
     */
    public MbProductCategoryCB acceptPK(String productCategoryCode) {
        assertObjectNotNull("productCategoryCode", productCategoryCode);
        MbBsProductCategoryCB cb = this;
        cb.query().setProductCategoryCode_Equal(productCategoryCode);
        return (MbProductCategoryCB)this;
    }

    /**
     * Accept the query condition of primary key as equal. (old style)
     * @param productCategoryCode : PK, NotNull, CHAR(3). (NotNull)
     */
    public void acceptPrimaryKey(String productCategoryCode) {
        assertObjectNotNull("productCategoryCode", productCategoryCode);
        MbBsProductCategoryCB cb = this;
        cb.query().setProductCategoryCode_Equal(productCategoryCode);
    }

    public ConditionBean addOrderBy_PK_Asc() {
        query().addOrderBy_ProductCategoryCode_Asc();
        return this;
    }

    public ConditionBean addOrderBy_PK_Desc() {
        query().addOrderBy_ProductCategoryCode_Desc();
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
    public MbProductCategoryCQ query() {
        assertQueryPurpose(); // assert only when user-public query 
        return getConditionQuery();
    }

    public MbProductCategoryCQ getConditionQuery() { // public for parameter comment and internal
        if (_conditionQuery == null) {
            _conditionQuery = createLocalCQ();
        }
        return _conditionQuery;
    }

    protected MbProductCategoryCQ createLocalCQ() {
        return xcreateCQ(null, getSqlClause(), getSqlClause().getBasePointAliasName(), 0);
    }

    protected MbProductCategoryCQ xcreateCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        MbProductCategoryCQ cq = xnewCQ(childQuery, sqlClause, aliasName, nestLevel);
        cq.xsetBaseCB(this);
        return cq;
    }

    protected MbProductCategoryCQ xnewCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        return new MbProductCategoryCQ(childQuery, sqlClause, aliasName, nestLevel);
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
     * cb.query().<span style="color: #DD4747">union</span>(new UnionQuery&lt;MbProductCategoryCB&gt;() {
     *     public void query(MbProductCategoryCB unionCB) {
     *         unionCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param unionQuery The query of 'union'. (NotNull)
     */
    public void union(UnionQuery<MbProductCategoryCB> unionQuery) {
        final MbProductCategoryCB cb = new MbProductCategoryCB(); cb.xsetupForUnion(this); xsyncUQ(cb); 
        try { lock(); unionQuery.query(cb); } finally { unlock(); } xsaveUCB(cb);
        final MbProductCategoryCQ cq = cb.query(); query().xsetUnionQuery(cq);
    }

    /**
     * Set up 'union all' for base-point table. <br />
     * You don't need to call SetupSelect in union-query,
     * because it inherits calls before. (Don't call SetupSelect after here)
     * <pre>
     * cb.query().<span style="color: #DD4747">unionAll</span>(new UnionQuery&lt;MbProductCategoryCB&gt;() {
     *     public void query(MbProductCategoryCB unionCB) {
     *         unionCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param unionQuery The query of 'union all'. (NotNull)
     */
    public void unionAll(UnionQuery<MbProductCategoryCB> unionQuery) {
        final MbProductCategoryCB cb = new MbProductCategoryCB(); cb.xsetupForUnion(this); xsyncUQ(cb);
        try { lock(); unionQuery.query(cb); } finally { unlock(); } xsaveUCB(cb);
        final MbProductCategoryCQ cq = cb.query(); query().xsetUnionAllQuery(cq);
    }

    // ===================================================================================
    //                                                                         SetupSelect
    //                                                                         ===========
    protected MbProductCategoryNss _nssProductCategorySelf;
    public MbProductCategoryNss getNssProductCategorySelf() {
        if (_nssProductCategorySelf == null) { _nssProductCategorySelf = new MbProductCategoryNss(null); }
        return _nssProductCategorySelf;
    }
    /**
     * Set up relation columns to select clause. <br />
     * PRODUCT_CATEGORY by my PARENT_CATEGORY_CODE, named 'productCategorySelf'.
     * <pre>
     * MbProductCategoryCB cb = new MbProductCategoryCB();
     * cb.<span style="color: #DD4747">setupSelect_ProductCategorySelf()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     * cb.query().setFoo...(value);
     * MbProductCategory productCategory = productCategoryBhv.selectEntityWithDeletedCheck(cb);
     * ... = productCategory.<span style="color: #DD4747">getProductCategorySelf()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public MbProductCategoryNss setupSelect_ProductCategorySelf() {
        assertSetupSelectPurpose("productCategorySelf");
        if (hasSpecifiedColumn()) { // if reverse call
            specify().columnParentCategoryCode();
        }
        doSetupSelect(new SsCall() { public ConditionQuery qf() { return query().queryProductCategorySelf(); } });
        if (_nssProductCategorySelf == null || !_nssProductCategorySelf.hasConditionQuery())
        { _nssProductCategorySelf = new MbProductCategoryNss(query().queryProductCategorySelf()); }
        return _nssProductCategorySelf;
    }

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
            , new HpSpQyCall<MbProductCategoryCQ>() {
                public boolean has() { return true; }
                public MbProductCategoryCQ qy() { return getConditionQuery(); }
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

    public static class HpSpecification extends HpAbstractSpecification<MbProductCategoryCQ> {
        protected MbProductCategoryCB.HpSpecification _productCategorySelf;
        public HpSpecification(ConditionBean baseCB, HpSpQyCall<MbProductCategoryCQ> qyCall
                             , HpCBPurpose purpose, DBMetaProvider dbmetaProvider)
        { super(baseCB, qyCall, purpose, dbmetaProvider); }
        /**
         * PRODUCT_CATEGORY_CODE: {PK, NotNull, CHAR(3)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnProductCategoryCode() { return doColumn("PRODUCT_CATEGORY_CODE"); }
        /**
         * PRODUCT_CATEGORY_NAME: {NotNull, VARCHAR(50)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnProductCategoryName() { return doColumn("PRODUCT_CATEGORY_NAME"); }
        /**
         * PARENT_CATEGORY_CODE: {IX, CHAR(3), FK to PRODUCT_CATEGORY}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnParentCategoryCode() { return doColumn("PARENT_CATEGORY_CODE"); }
        public void everyColumn() { doEveryColumn(); }
        public void exceptRecordMetaColumn() { doExceptRecordMetaColumn(); }
        @Override
        protected void doSpecifyRequiredColumn() {
            columnProductCategoryCode(); // PK
            if (qyCall().qy().hasConditionQueryProductCategorySelf()
                    || qyCall().qy().xgetReferrerQuery() instanceof MbProductCategoryCQ) {
                columnParentCategoryCode(); // FK or one-to-one referrer
            }
        }
        @Override
        protected String getTableDbName() { return "PRODUCT_CATEGORY"; }
        /**
         * Prepare to specify functions about relation table. <br />
         * PRODUCT_CATEGORY by my PARENT_CATEGORY_CODE, named 'productCategorySelf'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MbProductCategoryCB.HpSpecification specifyProductCategorySelf() {
            assertRelation("productCategorySelf");
            if (_productCategorySelf == null) {
                _productCategorySelf = new MbProductCategoryCB.HpSpecification(_baseCB, new HpSpQyCall<MbProductCategoryCQ>() {
                    public boolean has() { return _qyCall.has() && _qyCall.qy().hasConditionQueryProductCategorySelf(); }
                    public MbProductCategoryCQ qy() { return _qyCall.qy().queryProductCategorySelf(); } }
                    , _purpose, _dbmetaProvider);
                if (xhasSyncQyCall()) { // inherits it
                    _productCategorySelf.xsetSyncQyCall(new HpSpQyCall<MbProductCategoryCQ>() {
                        public boolean has() { return xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryProductCategorySelf(); }
                        public MbProductCategoryCQ qy() { return xsyncQyCall().qy().queryProductCategorySelf(); }
                    });
                }
            }
            return _productCategorySelf;
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br />
         * {select max(FOO) from PRODUCT where ...) as FOO_MAX} <br />
         * PRODUCT by PRODUCT_CATEGORY_CODE, named 'productList'.
         * <pre>
         * cb.specify().<span style="color: #DD4747">derivedProductList()</span>.<span style="color: #DD4747">max</span>(new SubQuery&lt;MbProductCB&gt;() {
         *     public void query(MbProductCB subCB) {
         *         subCB.specify().<span style="color: #DD4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *         subCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
         *     }
         * }, MbProduct.<span style="color: #DD4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<MbProductCB, MbProductCategoryCQ> derivedProductList() {
            assertDerived("productList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return new HpSDRFunction<MbProductCB, MbProductCategoryCQ>(_baseCB, _qyCall.qy(), new HpSDRSetupper<MbProductCB, MbProductCategoryCQ>() {
                public void setup(String fn, SubQuery<MbProductCB> sq, MbProductCategoryCQ cq, String al, DerivedReferrerOption op) {
                    cq.xsderiveProductList(fn, sq, al, op); } }, _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br />
         * {select max(FOO) from PRODUCT_CATEGORY where ...) as FOO_MAX} <br />
         * PRODUCT_CATEGORY by PARENT_CATEGORY_CODE, named 'productCategorySelfList'.
         * <pre>
         * cb.specify().<span style="color: #DD4747">derivedProductCategorySelfList()</span>.<span style="color: #DD4747">max</span>(new SubQuery&lt;MbProductCategoryCB&gt;() {
         *     public void query(MbProductCategoryCB subCB) {
         *         subCB.specify().<span style="color: #DD4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *         subCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
         *     }
         * }, MbProductCategory.<span style="color: #DD4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<MbProductCategoryCB, MbProductCategoryCQ> derivedProductCategorySelfList() {
            assertDerived("productCategorySelfList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return new HpSDRFunction<MbProductCategoryCB, MbProductCategoryCQ>(_baseCB, _qyCall.qy(), new HpSDRSetupper<MbProductCategoryCB, MbProductCategoryCQ>() {
                public void setup(String fn, SubQuery<MbProductCategoryCB> sq, MbProductCategoryCQ cq, String al, DerivedReferrerOption op) {
                    cq.xsderiveProductCategorySelfList(fn, sq, al, op); } }, _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)MyselfDerived (SubQuery).
         * @return The object to set up a function for myself table. (NotNull)
         */
        public HpSDRFunction<MbProductCategoryCB, MbProductCategoryCQ> myselfDerived() {
            assertDerived("myselfDerived"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return new HpSDRFunction<MbProductCategoryCB, MbProductCategoryCQ>(_baseCB, _qyCall.qy(), new HpSDRSetupper<MbProductCategoryCB, MbProductCategoryCQ>() {
                public void setup(String fn, SubQuery<MbProductCategoryCB> sq, MbProductCategoryCQ cq, String al, DerivedReferrerOption op) {
                    cq.xsmyselfDerive(fn, sq, al, op); } }, _dbmetaProvider);
        }
    }

    // [DBFlute-0.9.5.3]
    // ===================================================================================
    //                                                                        Column Query
    //                                                                        ============
    /**
     * Set up column-query. {column1 = column2}
     * <pre>
     * <span style="color: #3F7E5E">// where FOO &lt; BAR</span>
     * cb.<span style="color: #DD4747">columnQuery</span>(new SpecifyQuery&lt;MbProductCategoryCB&gt;() {
     *     public void query(MbProductCategoryCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFoo()</span>; <span style="color: #3F7E5E">// left column</span>
     *     }
     * }).lessThan(new SpecifyQuery&lt;MbProductCategoryCB&gt;() {
     *     public void query(MbProductCategoryCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnBar()</span>; <span style="color: #3F7E5E">// right column</span>
     *     }
     * }); <span style="color: #3F7E5E">// you can calculate for right column like '}).plus(3);'</span>
     * </pre>
     * @param leftSpecifyQuery The specify-query for left column. (NotNull)
     * @return The object for setting up operand and right column. (NotNull)
     */
    public HpColQyOperand<MbProductCategoryCB> columnQuery(final SpecifyQuery<MbProductCategoryCB> leftSpecifyQuery) {
        return new HpColQyOperand<MbProductCategoryCB>(new HpColQyHandler<MbProductCategoryCB>() {
            public HpCalculator handle(SpecifyQuery<MbProductCategoryCB> rightSp, String operand) {
                return xcolqy(xcreateColumnQueryCB(), xcreateColumnQueryCB(), leftSpecifyQuery, rightSp, operand);
            }
        });
    }

    protected MbProductCategoryCB xcreateColumnQueryCB() {
        MbProductCategoryCB cb = new MbProductCategoryCB();
        cb.xsetupForColumnQuery((MbProductCategoryCB)this);
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
    public MbProductCategoryCB dreamCruiseCB() {
        MbProductCategoryCB cb = new MbProductCategoryCB();
        cb.xsetupForDreamCruise((MbProductCategoryCB) this);
        return cb;
    }

    protected ConditionBean xdoCreateDreamCruiseCB() {
        return dreamCruiseCB();
    }

    // [DBFlute-0.9.6.3]
    // ===================================================================================
    //                                                                       OrScope Query
    //                                                                       =============
    /**
     * Set up the query for or-scope. <br />
     * (Same-column-and-same-condition-key conditions are allowed in or-scope)
     * <pre>
     * <span style="color: #3F7E5E">// where (FOO = '...' or BAR = '...')</span>
     * cb.<span style="color: #DD4747">orScopeQuery</span>(new OrQuery&lt;MbProductCategoryCB&gt;() {
     *     public void query(MbProductCategoryCB orCB) {
     *         orCB.query().setFOO_Equal...
     *         orCB.query().setBAR_Equal...
     *     }
     * });
     * </pre>
     * @param orQuery The query for or-condition. (NotNull)
     */
    public void orScopeQuery(OrQuery<MbProductCategoryCB> orQuery) {
        xorSQ((MbProductCategoryCB)this, orQuery);
    }

    @Override
    protected HpCBPurpose xhandleOrSQPurposeChange() {
        return null; // means no check
    }

    /**
     * Set up the and-part of or-scope. <br />
     * (However nested or-scope query and as-or-split of like-search in and-part are unsupported)
     * <pre>
     * <span style="color: #3F7E5E">// where (FOO = '...' or (BAR = '...' and QUX = '...'))</span>
     * cb.<span style="color: #DD4747">orScopeQuery</span>(new OrQuery&lt;MbProductCategoryCB&gt;() {
     *     public void query(MbProductCategoryCB orCB) {
     *         orCB.query().setFOO_Equal...
     *         orCB.<span style="color: #DD4747">orScopeQueryAndPart</span>(new AndQuery&lt;MbProductCategoryCB&gt;() {
     *             public void query(MbProductCategoryCB andCB) {
     *                 andCB.query().setBar_...
     *                 andCB.query().setQux_...
     *             }
     *         });
     *     }
     * });
     * </pre>
     * @param andQuery The query for and-condition. (NotNull)
     */
    public void orScopeQueryAndPart(AndQuery<MbProductCategoryCB> andQuery) {
        xorSQAP((MbProductCategoryCB)this, andQuery);
    }

    // ===================================================================================
    //                                                                          DisplaySQL
    //                                                                          ==========
    @Override
    protected SqlAnalyzerFactory getSqlAnalyzerFactory()
    { return new MbImplementedInvokerAssistant().assistSqlAnalyzerFactory(); }
    @Override
    protected String getLogDateFormat() { return MbDBFluteConfig.getInstance().getLogDateFormat(); }
    @Override
    protected String getLogTimestampFormat() { return MbDBFluteConfig.getInstance().getLogTimestampFormat(); }

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
        final MbProductCategoryCB cb;
        if (mainCB != null) {
            cb = (MbProductCategoryCB)mainCB;
        } else {
            cb = new MbProductCategoryCB();
        }
        specify().xsetSyncQyCall(new HpSpQyCall<MbProductCategoryCQ>() {
            public boolean has() { return true; }
            public MbProductCategoryCQ qy() { return cb.query(); }
        });
    }

    // ===================================================================================
    //                                                                            Internal
    //                                                                            ========
    // very internal (for suppressing warn about 'Not Use Import')
    protected String getConditionBeanClassNameInternally() { return MbProductCategoryCB.class.getName(); }
    protected String getConditionQueryClassNameInternally() { return MbProductCategoryCQ.class.getName(); }
    protected String getSubQueryClassNameInternally() { return SubQuery.class.getName(); }
    protected String getConditionOptionClassNameInternally() { return ConditionOption.class.getName(); }
}
