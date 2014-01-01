package com.example.dbflute.multipledb.seasar.dbflute.memberdb.bsbhv;

import java.util.List;

import org.seasar.dbflute.*;
import org.seasar.dbflute.bhv.*;
import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.outsidesql.executor.*;
import com.example.dbflute.multipledb.seasar.dbflute.memberdb.exbhv.*;
import com.example.dbflute.multipledb.seasar.dbflute.memberdb.exentity.*;
import com.example.dbflute.multipledb.seasar.dbflute.memberdb.bsentity.dbmeta.*;
import com.example.dbflute.multipledb.seasar.dbflute.memberdb.cbean.*;

/**
 * The behavior of PRODUCT_CATEGORY as TABLE. <br />
 * <pre>
 * [primary key]
 *     PRODUCT_CATEGORY_CODE
 * 
 * [column]
 *     PRODUCT_CATEGORY_CODE, PRODUCT_CATEGORY_NAME, PARENT_CATEGORY_CODE
 * 
 * [sequence]
 *     
 * 
 * [identity]
 *     
 * 
 * [version-no]
 *     
 * 
 * [foreign table]
 *     PRODUCT_CATEGORY
 * 
 * [referrer table]
 *     PRODUCT, PRODUCT_CATEGORY
 * 
 * [foreign property]
 *     productCategorySelf
 * 
 * [referrer property]
 *     productList, productCategorySelfList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class MbBsProductCategoryBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "PRODUCT_CATEGORY"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public DBMeta getDBMeta() { return MbProductCategoryDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public MbProductCategoryDbm getMyDBMeta() { return MbProductCategoryDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public Entity newEntity() { return newMyEntity(); }

    /** {@inheritDoc} */
    public ConditionBean newConditionBean() { return newMyConditionBean(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public MbProductCategory newMyEntity() { return new MbProductCategory(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public MbProductCategoryCB newMyConditionBean() { return new MbProductCategoryCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * MbProductCategoryCB cb = new MbProductCategoryCB();
     * cb.query().setFoo...(value);
     * int count = productCategoryBhv.<span style="color: #FD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of MbProductCategory. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(MbProductCategoryCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(MbProductCategoryCB cb) { // called by selectCount(cb) 
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(MbProductCategoryCB cb) { // called by selectPage(cb)
        assertCBStateValid(cb);
        return delegateSelectCountPlainly(cb);
    }

    @Override
    protected int doReadCount(ConditionBean cb) {
        return selectCount(downcast(cb));
    }

    // ===================================================================================
    //                                                                       Entity Select
    //                                                                       =============
    /**
     * Select the entity by the condition-bean.
     * <pre>
     * MbProductCategoryCB cb = new MbProductCategoryCB();
     * cb.query().setFoo...(value);
     * MbProductCategory productCategory = productCategoryBhv.<span style="color: #FD4747">selectEntity</span>(cb);
     * if (productCategory != null) {
     *     ... = productCategory.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of MbProductCategory. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public MbProductCategory selectEntity(MbProductCategoryCB cb) {
        return doSelectEntity(cb, MbProductCategory.class);
    }

    protected <ENTITY extends MbProductCategory> ENTITY doSelectEntity(final MbProductCategoryCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityInternally(cb, entityType, new InternalSelectEntityCallback<ENTITY, MbProductCategoryCB>() {
            public List<ENTITY> callbackSelectList(MbProductCategoryCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); } });
    }

    @Override
    protected Entity doReadEntity(ConditionBean cb) {
        return selectEntity(downcast(cb));
    }

    /**
     * Select the entity by the condition-bean with deleted check.
     * <pre>
     * MbProductCategoryCB cb = new MbProductCategoryCB();
     * cb.query().setFoo...(value);
     * MbProductCategory productCategory = productCategoryBhv.<span style="color: #FD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = productCategory.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of MbProductCategory. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public MbProductCategory selectEntityWithDeletedCheck(MbProductCategoryCB cb) {
        return doSelectEntityWithDeletedCheck(cb, MbProductCategory.class);
    }

    protected <ENTITY extends MbProductCategory> ENTITY doSelectEntityWithDeletedCheck(final MbProductCategoryCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityWithDeletedCheckInternally(cb, entityType, new InternalSelectEntityWithDeletedCheckCallback<ENTITY, MbProductCategoryCB>() {
            public List<ENTITY> callbackSelectList(MbProductCategoryCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); } });
    }

    @Override
    protected Entity doReadEntityWithDeletedCheck(ConditionBean cb) {
        return selectEntityWithDeletedCheck(downcast(cb));
    }

    /**
     * Select the entity by the primary-key value.
     * @param productCategoryCode The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public MbProductCategory selectByPKValue(String productCategoryCode) {
        return doSelectByPKValue(productCategoryCode, MbProductCategory.class);
    }

    protected <ENTITY extends MbProductCategory> ENTITY doSelectByPKValue(String productCategoryCode, Class<ENTITY> entityType) {
        return doSelectEntity(buildPKCB(productCategoryCode), entityType);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param productCategoryCode The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public MbProductCategory selectByPKValueWithDeletedCheck(String productCategoryCode) {
        return doSelectByPKValueWithDeletedCheck(productCategoryCode, MbProductCategory.class);
    }

    protected <ENTITY extends MbProductCategory> ENTITY doSelectByPKValueWithDeletedCheck(String productCategoryCode, Class<ENTITY> entityType) {
        return doSelectEntityWithDeletedCheck(buildPKCB(productCategoryCode), entityType);
    }

    private MbProductCategoryCB buildPKCB(String productCategoryCode) {
        assertObjectNotNull("productCategoryCode", productCategoryCode);
        MbProductCategoryCB cb = newMyConditionBean();
        cb.query().setProductCategoryCode_Equal(productCategoryCode);
        return cb;
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * MbProductCategoryCB cb = new MbProductCategoryCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;MbProductCategory&gt; productCategoryList = productCategoryBhv.<span style="color: #FD4747">selectList</span>(cb);
     * for (MbProductCategory productCategory : productCategoryList) {
     *     ... = productCategory.get...();
     * }
     * </pre>
     * @param cb The condition-bean of MbProductCategory. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<MbProductCategory> selectList(MbProductCategoryCB cb) {
        return doSelectList(cb, MbProductCategory.class);
    }

    protected <ENTITY extends MbProductCategory> ListResultBean<ENTITY> doSelectList(MbProductCategoryCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", entityType);
        assertSpecifyDerivedReferrerEntityProperty(cb, entityType);
        return helpSelectListInternally(cb, entityType, new InternalSelectListCallback<ENTITY, MbProductCategoryCB>() {
            public List<ENTITY> callbackSelectList(MbProductCategoryCB cb, Class<ENTITY> entityType) { return delegateSelectList(cb, entityType); } });
    }

    @Override
    protected ListResultBean<? extends Entity> doReadList(ConditionBean cb) {
        return selectList(downcast(cb));
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br />
     * (both count-select and paging-select are executed)
     * <pre>
     * MbProductCategoryCB cb = new MbProductCategoryCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #FD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;MbProductCategory&gt; page = productCategoryBhv.<span style="color: #FD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (MbProductCategory productCategory : page) {
     *     ... = productCategory.get...();
     * }
     * </pre>
     * @param cb The condition-bean of MbProductCategory. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<MbProductCategory> selectPage(MbProductCategoryCB cb) {
        return doSelectPage(cb, MbProductCategory.class);
    }

    protected <ENTITY extends MbProductCategory> PagingResultBean<ENTITY> doSelectPage(MbProductCategoryCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", entityType);
        return helpSelectPageInternally(cb, entityType, new InternalSelectPageCallback<ENTITY, MbProductCategoryCB>() {
            public int callbackSelectCount(MbProductCategoryCB cb) { return doSelectCountPlainly(cb); }
            public List<ENTITY> callbackSelectList(MbProductCategoryCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); }
        });
    }

    @Override
    protected PagingResultBean<? extends Entity> doReadPage(ConditionBean cb) {
        return selectPage(downcast(cb));
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * MbProductCategoryCB cb = new MbProductCategoryCB();
     * cb.query().setFoo...(value);
     * productCategoryBhv.<span style="color: #FD4747">selectCursor</span>(cb, new EntityRowHandler&lt;MbProductCategory&gt;() {
     *     public void handle(MbProductCategory entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of MbProductCategory. (NotNull)
     * @param entityRowHandler The handler of entity row of MbProductCategory. (NotNull)
     */
    public void selectCursor(MbProductCategoryCB cb, EntityRowHandler<MbProductCategory> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, MbProductCategory.class);
    }

    protected <ENTITY extends MbProductCategory> void doSelectCursor(MbProductCategoryCB cb, EntityRowHandler<ENTITY> entityRowHandler, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler<MbProductCategory>", entityRowHandler); assertObjectNotNull("entityType", entityType);
        assertSpecifyDerivedReferrerEntityProperty(cb, entityType);
        helpSelectCursorInternally(cb, entityRowHandler, entityType, new InternalSelectCursorCallback<ENTITY, MbProductCategoryCB>() {
            public void callbackSelectCursor(MbProductCategoryCB cb, EntityRowHandler<ENTITY> entityRowHandler, Class<ENTITY> entityType) { delegateSelectCursor(cb, entityRowHandler, entityType); }
            public List<ENTITY> callbackSelectList(MbProductCategoryCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); }
        });
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * productCategoryBhv.<span style="color: #FD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(MbProductCategoryCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> SLFunction<MbProductCategoryCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
    }

    protected <RESULT, CB extends MbProductCategoryCB> SLFunction<CB, RESULT> doScalarSelect(Class<RESULT> resultType, CB cb) {
        assertObjectNotNull("resultType", resultType); assertCBStateValid(cb);
        cb.xsetupForScalarSelect(); cb.getSqlClause().disableSelectIndex(); // for when you use union
        return createSLFunction(cb, resultType);
    }

    protected <RESULT, CB extends MbProductCategoryCB> SLFunction<CB, RESULT> createSLFunction(CB cb, Class<RESULT> resultType) {
        return new SLFunction<CB, RESULT>(cb, resultType);
    }

    protected <RESULT> SLFunction<? extends ConditionBean, RESULT> doReadScalar(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
    }

    // ===================================================================================
    //                                                                            Sequence
    //                                                                            ========
    @Override
    protected Number doReadNextVal() {
        String msg = "This table is NOT related to sequence: " + getTableDbName();
        throw new UnsupportedOperationException(msg);
    }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    /**
     * {Refer to overload method that has an argument of the list of entity.}
     * @param productCategory The entity of productCategory. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     */
    public void loadProductList(MbProductCategory productCategory, ConditionBeanSetupper<MbProductCB> conditionBeanSetupper) {
        xassLRArg(productCategory, conditionBeanSetupper);
        loadProductList(xnewLRLs(productCategory), conditionBeanSetupper);
    }
    /**
     * Load referrer of productList with the set-upper for condition-bean of referrer. <br />
     * PRODUCT by PRODUCT_CATEGORY_CODE, named 'productList'.
     * <pre>
     * productCategoryBhv.<span style="color: #FD4747">loadProductList</span>(productCategoryList, new ConditionBeanSetupper&lt;MbProductCB&gt;() {
     *     public void setup(MbProductCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...(); <span style="color: #3F7E5E">// basically you should order referrer list</span>
     *     }
     * });
     * for (MbProductCategory productCategory : productCategoryList) {
     *     ... = productCategory.<span style="color: #FD4747">getProductList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key(and others too) is treated as case-insensitive. <br />
     * The condition-bean that the set-upper provides have settings before you touch it. It is as follows:
     * <pre>
     * cb.query().setProductCategoryCode_InScope(pkList);
     * cb.query().addOrderBy_ProductCategoryCode_Asc();
     * </pre>
     * @param productCategoryList The entity list of productCategory. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     */
    public void loadProductList(List<MbProductCategory> productCategoryList, ConditionBeanSetupper<MbProductCB> conditionBeanSetupper) {
        xassLRArg(productCategoryList, conditionBeanSetupper);
        loadProductList(productCategoryList, new LoadReferrerOption<MbProductCB, MbProduct>().xinit(conditionBeanSetupper));
    }
    /**
     * {Refer to overload method that has an argument of the list of entity.}
     * @param productCategory The entity of productCategory. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadProductList(MbProductCategory productCategory, LoadReferrerOption<MbProductCB, MbProduct> loadReferrerOption) {
        xassLRArg(productCategory, loadReferrerOption);
        loadProductList(xnewLRLs(productCategory), loadReferrerOption);
    }
    /**
     * {Refer to overload method that has an argument of condition-bean setupper.}
     * @param productCategoryList The entity list of productCategory. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadProductList(List<MbProductCategory> productCategoryList, LoadReferrerOption<MbProductCB, MbProduct> loadReferrerOption) {
        xassLRArg(productCategoryList, loadReferrerOption);
        if (productCategoryList.isEmpty()) { return; }
        final MbProductBhv referrerBhv = xgetBSFLR().select(MbProductBhv.class);
        helpLoadReferrerInternally(productCategoryList, loadReferrerOption, new InternalLoadReferrerCallback<MbProductCategory, String, MbProductCB, MbProduct>() {
            public String getPKVal(MbProductCategory e)
            { return e.getProductCategoryCode(); }
            public void setRfLs(MbProductCategory e, List<MbProduct> ls)
            { e.setProductList(ls); }
            public MbProductCB newMyCB() { return referrerBhv.newMyConditionBean(); }
            public void qyFKIn(MbProductCB cb, List<String> ls)
            { cb.query().setProductCategoryCode_InScope(ls); }
            public void qyOdFKAsc(MbProductCB cb) { cb.query().addOrderBy_ProductCategoryCode_Asc(); }
            public void spFKCol(MbProductCB cb) { cb.specify().columnProductCategoryCode(); }
            public List<MbProduct> selRfLs(MbProductCB cb) { return referrerBhv.selectList(cb); }
            public String getFKVal(MbProduct e) { return e.getProductCategoryCode(); }
            public void setlcEt(MbProduct re, MbProductCategory le)
            { re.setProductCategory(le); }
            public String getRfPrNm() { return "productList"; }
        });
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.}
     * @param productCategory The entity of productCategory. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     */
    public void loadProductCategorySelfList(MbProductCategory productCategory, ConditionBeanSetupper<MbProductCategoryCB> conditionBeanSetupper) {
        xassLRArg(productCategory, conditionBeanSetupper);
        loadProductCategorySelfList(xnewLRLs(productCategory), conditionBeanSetupper);
    }
    /**
     * Load referrer of productCategorySelfList with the set-upper for condition-bean of referrer. <br />
     * PRODUCT_CATEGORY by PARENT_CATEGORY_CODE, named 'productCategorySelfList'.
     * <pre>
     * productCategoryBhv.<span style="color: #FD4747">loadProductCategorySelfList</span>(productCategoryList, new ConditionBeanSetupper&lt;MbProductCategoryCB&gt;() {
     *     public void setup(MbProductCategoryCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...(); <span style="color: #3F7E5E">// basically you should order referrer list</span>
     *     }
     * });
     * for (MbProductCategory productCategory : productCategoryList) {
     *     ... = productCategory.<span style="color: #FD4747">getProductCategorySelfList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key(and others too) is treated as case-insensitive. <br />
     * The condition-bean that the set-upper provides have settings before you touch it. It is as follows:
     * <pre>
     * cb.query().setParentCategoryCode_InScope(pkList);
     * cb.query().addOrderBy_ParentCategoryCode_Asc();
     * </pre>
     * @param productCategoryList The entity list of productCategory. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     */
    public void loadProductCategorySelfList(List<MbProductCategory> productCategoryList, ConditionBeanSetupper<MbProductCategoryCB> conditionBeanSetupper) {
        xassLRArg(productCategoryList, conditionBeanSetupper);
        loadProductCategorySelfList(productCategoryList, new LoadReferrerOption<MbProductCategoryCB, MbProductCategory>().xinit(conditionBeanSetupper));
    }
    /**
     * {Refer to overload method that has an argument of the list of entity.}
     * @param productCategory The entity of productCategory. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadProductCategorySelfList(MbProductCategory productCategory, LoadReferrerOption<MbProductCategoryCB, MbProductCategory> loadReferrerOption) {
        xassLRArg(productCategory, loadReferrerOption);
        loadProductCategorySelfList(xnewLRLs(productCategory), loadReferrerOption);
    }
    /**
     * {Refer to overload method that has an argument of condition-bean setupper.}
     * @param productCategoryList The entity list of productCategory. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadProductCategorySelfList(List<MbProductCategory> productCategoryList, LoadReferrerOption<MbProductCategoryCB, MbProductCategory> loadReferrerOption) {
        xassLRArg(productCategoryList, loadReferrerOption);
        if (productCategoryList.isEmpty()) { return; }
        final MbProductCategoryBhv referrerBhv = xgetBSFLR().select(MbProductCategoryBhv.class);
        helpLoadReferrerInternally(productCategoryList, loadReferrerOption, new InternalLoadReferrerCallback<MbProductCategory, String, MbProductCategoryCB, MbProductCategory>() {
            public String getPKVal(MbProductCategory e)
            { return e.getProductCategoryCode(); }
            public void setRfLs(MbProductCategory e, List<MbProductCategory> ls)
            { e.setProductCategorySelfList(ls); }
            public MbProductCategoryCB newMyCB() { return referrerBhv.newMyConditionBean(); }
            public void qyFKIn(MbProductCategoryCB cb, List<String> ls)
            { cb.query().setParentCategoryCode_InScope(ls); }
            public void qyOdFKAsc(MbProductCategoryCB cb) { cb.query().addOrderBy_ParentCategoryCode_Asc(); }
            public void spFKCol(MbProductCategoryCB cb) { cb.specify().columnParentCategoryCode(); }
            public List<MbProductCategory> selRfLs(MbProductCategoryCB cb) { return referrerBhv.selectList(cb); }
            public String getFKVal(MbProductCategory e) { return e.getParentCategoryCode(); }
            public void setlcEt(MbProductCategory re, MbProductCategory le)
            { re.setProductCategorySelf(le); }
            public String getRfPrNm() { return "productCategorySelfList"; }
        });
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'MbProductCategory'.
     * @param productCategoryList The list of productCategory. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MbProductCategory> pulloutProductCategorySelf(List<MbProductCategory> productCategoryList) {
        return helpPulloutInternally(productCategoryList, new InternalPulloutCallback<MbProductCategory, MbProductCategory>() {
            public MbProductCategory getFr(MbProductCategory e) { return e.getProductCategorySelf(); }
            public boolean hasRf() { return true; }
            public void setRfLs(MbProductCategory e, List<MbProductCategory> ls)
            { e.setProductCategorySelfList(ls); }
        });
    }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key productCategoryCode.
     * @param productCategoryList The list of productCategory. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<String> extractProductCategoryCodeList(List<MbProductCategory> productCategoryList) {
        return helpExtractListInternally(productCategoryList, new InternalExtractCallback<MbProductCategory, String>() {
            public String getCV(MbProductCategory e) { return e.getProductCategoryCode(); }
        });
    }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * MbProductCategory productCategory = new MbProductCategory();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * productCategory.setFoo...(value);
     * productCategory.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//productCategory.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//productCategory.set...;</span>
     * productCategoryBhv.<span style="color: #FD4747">insert</span>(productCategory);
     * ... = productCategory.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param productCategory The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(MbProductCategory productCategory) {
        doInsert(productCategory, null);
    }

    protected void doInsert(MbProductCategory productCategory, InsertOption<MbProductCategoryCB> option) {
        assertObjectNotNull("productCategory", productCategory);
        prepareInsertOption(option);
        delegateInsert(productCategory, option);
    }

    protected void prepareInsertOption(InsertOption<MbProductCategoryCB> option) {
        if (option == null) { return; }
        assertInsertOptionStatus(option);
        if (option.hasSpecifiedInsertColumn()) {
            option.resolveInsertColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    @Override
    protected void doCreate(Entity entity, InsertOption<? extends ConditionBean> option) {
        if (option == null) { insert(downcast(entity)); }
        else { varyingInsert(downcast(entity), downcast(option)); }
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * MbProductCategory productCategory = new MbProductCategory();
     * productCategory.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * productCategory.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//productCategory.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//productCategory.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * productCategory.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     productCategoryBhv.<span style="color: #FD4747">update</span>(productCategory);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * } 
     * </pre>
     * @param productCategory The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(final MbProductCategory productCategory) {
        doUpdate(productCategory, null);
    }

    protected void doUpdate(MbProductCategory productCategory, final UpdateOption<MbProductCategoryCB> option) {
        assertObjectNotNull("productCategory", productCategory);
        prepareUpdateOption(option);
        helpUpdateInternally(productCategory, new InternalUpdateCallback<MbProductCategory>() {
            public int callbackDelegateUpdate(MbProductCategory entity) { return delegateUpdate(entity, option); } });
    }

    protected void prepareUpdateOption(UpdateOption<MbProductCategoryCB> option) {
        if (option == null) { return; }
        assertUpdateOptionStatus(option);
        if (option.hasSelfSpecification()) {
            option.resolveSelfSpecification(createCBForVaryingUpdate());
        }
        if (option.hasSpecifiedUpdateColumn()) {
            option.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    protected MbProductCategoryCB createCBForVaryingUpdate() {
        MbProductCategoryCB cb = newMyConditionBean();
        cb.xsetupForVaryingUpdate();
        return cb;
    }

    protected MbProductCategoryCB createCBForSpecifiedUpdate() {
        MbProductCategoryCB cb = newMyConditionBean();
        cb.xsetupForSpecifiedUpdate();
        return cb;
    }

    @Override
    protected void doModify(Entity entity, UpdateOption<? extends ConditionBean> option) {
        if (option == null) { update(downcast(entity)); }
        else { varyingUpdate(downcast(entity), downcast(option)); }
    }

    @Override
    protected void doModifyNonstrict(Entity entity, UpdateOption<? extends ConditionBean> option) {
        doModify(entity, option);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br />
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br />
     * <p><span style="color: #FD4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param productCategory The entity of insert or update target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(MbProductCategory productCategory) {
        doInesrtOrUpdate(productCategory, null, null);
    }

    protected void doInesrtOrUpdate(MbProductCategory productCategory, final InsertOption<MbProductCategoryCB> insertOption, final UpdateOption<MbProductCategoryCB> updateOption) {
        helpInsertOrUpdateInternally(productCategory, new InternalInsertOrUpdateCallback<MbProductCategory, MbProductCategoryCB>() {
            public void callbackInsert(MbProductCategory entity) { doInsert(entity, insertOption); }
            public void callbackUpdate(MbProductCategory entity) { doUpdate(entity, updateOption); }
            public MbProductCategoryCB callbackNewMyConditionBean() { return newMyConditionBean(); }
            public int callbackSelectCount(MbProductCategoryCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrModify(Entity entity, InsertOption<? extends ConditionBean> insertOption,
            UpdateOption<? extends ConditionBean> updateOption) {
        if (insertOption == null && updateOption == null) { insertOrUpdate(downcast(entity)); }
        else {
            insertOption = insertOption == null ? new InsertOption<MbProductCategoryCB>() : insertOption;
            updateOption = updateOption == null ? new UpdateOption<MbProductCategoryCB>() : updateOption;
            varyingInsertOrUpdate(downcast(entity), downcast(insertOption), downcast(updateOption));
        }
    }

    @Override
    protected void doCreateOrModifyNonstrict(Entity entity, InsertOption<? extends ConditionBean> insertOption,
            UpdateOption<? extends ConditionBean> updateOption) {
        doCreateOrModify(entity, insertOption, updateOption);
    }

    /**
     * Delete the entity. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * MbProductCategory productCategory = new MbProductCategory();
     * productCategory.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * productCategory.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     productCategoryBhv.<span style="color: #FD4747">delete</span>(productCategory);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * } 
     * </pre>
     * @param productCategory The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(MbProductCategory productCategory) {
        doDelete(productCategory, null);
    }

    protected void doDelete(MbProductCategory productCategory, final DeleteOption<MbProductCategoryCB> option) {
        assertObjectNotNull("productCategory", productCategory);
        prepareDeleteOption(option);
        helpDeleteInternally(productCategory, new InternalDeleteCallback<MbProductCategory>() {
            public int callbackDelegateDelete(MbProductCategory entity) { return delegateDelete(entity, option); } });
    }

    protected void prepareDeleteOption(DeleteOption<MbProductCategoryCB> option) {
        if (option == null) { return; }
        assertDeleteOptionStatus(option);
    }

    @Override
    protected void doRemove(Entity entity, DeleteOption<? extends ConditionBean> option) {
        if (option == null) { delete(downcast(entity)); }
        else { varyingDelete(downcast(entity), downcast(option)); }
    }

    @Override
    protected void doRemoveNonstrict(Entity entity, DeleteOption<? extends ConditionBean> option) {
        doRemove(entity, option);
    }

    // ===================================================================================
    //                                                                        Batch Update
    //                                                                        ============
    /**
     * Batch-insert the entity list modified-only of same-set columns. (DefaultConstraintsEnabled) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <p><span style="color: #FD4747; font-size: 120%">The columns of least common multiple are registered like this:</span></p>
     * <pre>
     * for (... : ...) {
     *     MbProductCategory productCategory = new MbProductCategory();
     *     productCategory.setFooName("foo");
     *     if (...) {
     *         productCategory.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     productCategoryList.add(productCategory);
     * }
     * productCategoryBhv.<span style="color: #FD4747">batchInsert</span>(productCategoryList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param productCategoryList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<MbProductCategory> productCategoryList) {
        InsertOption<MbProductCategoryCB> option = createInsertUpdateOption();
        return doBatchInsert(productCategoryList, option);
    }

    protected int[] doBatchInsert(List<MbProductCategory> productCategoryList, InsertOption<MbProductCategoryCB> option) {
        assertObjectNotNull("productCategoryList", productCategoryList);
        prepareBatchInsertOption(productCategoryList, option);
        return delegateBatchInsert(productCategoryList, option);
    }

    protected void prepareBatchInsertOption(List<MbProductCategory> productCategoryList, InsertOption<MbProductCategoryCB> option) {
        option.xallowInsertColumnModifiedPropertiesFragmented();
        option.xacceptInsertColumnModifiedPropertiesIfNeeds(productCategoryList);
        prepareInsertOption(option);
    }

    @Override
    protected int[] doLumpCreate(List<Entity> ls, InsertOption<? extends ConditionBean> option) {
        if (option == null) { return batchInsert(downcast(ls)); }
        else { return varyingBatchInsert(downcast(ls), downcast(option)); }
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <span style="color: #FD4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     MbProductCategory productCategory = new MbProductCategory();
     *     productCategory.setFooName("foo");
     *     if (...) {
     *         productCategory.setFooPrice(123);
     *     } else {
     *         productCategory.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//productCategory.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     productCategoryList.add(productCategory);
     * }
     * productCategoryBhv.<span style="color: #FD4747">batchUpdate</span>(productCategoryList);
     * </pre>
     * @param productCategoryList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<MbProductCategory> productCategoryList) {
        UpdateOption<MbProductCategoryCB> option = createPlainUpdateOption();
        return doBatchUpdate(productCategoryList, option);
    }

    protected int[] doBatchUpdate(List<MbProductCategory> productCategoryList, UpdateOption<MbProductCategoryCB> option) {
        assertObjectNotNull("productCategoryList", productCategoryList);
        prepareBatchUpdateOption(productCategoryList, option);
        return delegateBatchUpdate(productCategoryList, option);
    }

    protected void prepareBatchUpdateOption(List<MbProductCategory> productCategoryList, UpdateOption<MbProductCategoryCB> option) {
        option.xacceptUpdateColumnModifiedPropertiesIfNeeds(productCategoryList);
        prepareUpdateOption(option);
    }

    @Override
    protected int[] doLumpModify(List<Entity> ls, UpdateOption<? extends ConditionBean> option) {
        if (option == null) { return batchUpdate(downcast(ls)); }
        else { return varyingBatchUpdate(downcast(ls), downcast(option)); }
    }

    /**
     * Batch-update the entity list specified-only. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span> 
     * productCategoryBhv.<span style="color: #FD4747">batchUpdate</span>(productCategoryList, new SpecifyQuery<MbProductCategoryCB>() {
     *     public void specify(MbProductCategoryCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #FD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #FD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span> 
     * productCategoryBhv.<span style="color: #FD4747">batchUpdate</span>(productCategoryList, new SpecifyQuery<MbProductCategoryCB>() {
     *     public void specify(MbProductCategoryCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #FD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param productCategoryList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<MbProductCategory> productCategoryList, SpecifyQuery<MbProductCategoryCB> updateColumnSpec) {
        return doBatchUpdate(productCategoryList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> option) {
        return doLumpModify(ls, option);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param productCategoryList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<MbProductCategory> productCategoryList) {
        return doBatchDelete(productCategoryList, null);
    }

    protected int[] doBatchDelete(List<MbProductCategory> productCategoryList, DeleteOption<MbProductCategoryCB> option) {
        assertObjectNotNull("productCategoryList", productCategoryList);
        prepareDeleteOption(option);
        return delegateBatchDelete(productCategoryList, option);
    }

    @Override
    protected int[] doLumpRemove(List<Entity> ls, DeleteOption<? extends ConditionBean> option) {
        if (option == null) { return batchDelete(downcast(ls)); }
        else { return varyingBatchDelete(downcast(ls), downcast(option)); }
    }

    @Override
    protected int[] doLumpRemoveNonstrict(List<Entity> ls, DeleteOption<? extends ConditionBean> option) {
        return doLumpRemove(ls, option);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * productCategoryBhv.<span style="color: #FD4747">queryInsert</span>(new QueryInsertSetupper&lt;MbProductCategory, MbProductCategoryCB&gt;() {
     *     public ConditionBean setup(productCategory entity, MbProductCategoryCB intoCB) {
     *         FooCB cb = FooCB();
     *         cb.setupSelect_Bar();
     * 
     *         <span style="color: #3F7E5E">// mapping</span>
     *         intoCB.specify().columnMyName().mappedFrom(cb.specify().columnFooName());
     *         intoCB.specify().columnMyCount().mappedFrom(cb.specify().columnFooCount());
     *         intoCB.specify().columnMyDate().mappedFrom(cb.specify().specifyBar().columnBarDate());
     *         entity.setMyFixedValue("foo"); <span style="color: #3F7E5E">// fixed value</span>
     *         <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     *         <span style="color: #3F7E5E">//entity.setRegisterUser(value);</span>
     *         <span style="color: #3F7E5E">//entity.set...;</span>
     *         <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     *         <span style="color: #3F7E5E">//entity.setVersionNo(value);</span>
     * 
     *         return cb;
     *     }
     * });
     * </pre>
     * @param setupper The setup-per of query-insert. (NotNull)
     * @return The inserted count.
     */
    public int queryInsert(QueryInsertSetupper<MbProductCategory, MbProductCategoryCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(QueryInsertSetupper<MbProductCategory, MbProductCategoryCB> setupper, InsertOption<MbProductCategoryCB> option) {
        assertObjectNotNull("setupper", setupper);
        prepareInsertOption(option);
        MbProductCategory entity = new MbProductCategory();
        MbProductCategoryCB intoCB = createCBForQueryInsert();
        ConditionBean resourceCB = setupper.setup(entity, intoCB);
        return delegateQueryInsert(entity, intoCB, resourceCB, option);
    }

    protected MbProductCategoryCB createCBForQueryInsert() {
        MbProductCategoryCB cb = newMyConditionBean();
        cb.xsetupForQueryInsert();
        return cb;
    }

    @Override
    protected int doRangeCreate(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> setupper, InsertOption<? extends ConditionBean> option) {
        if (option == null) { return queryInsert(downcast(setupper)); }
        else { return varyingQueryInsert(downcast(setupper), downcast(option)); }
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * MbProductCategory productCategory = new MbProductCategory();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//productCategory.setPK...(value);</span>
     * productCategory.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//productCategory.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//productCategory.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//productCategory.setVersionNo(value);</span>
     * MbProductCategoryCB cb = new MbProductCategoryCB();
     * cb.query().setFoo...(value);
     * productCategoryBhv.<span style="color: #FD4747">queryUpdate</span>(productCategory, cb);
     * </pre>
     * @param productCategory The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of MbProductCategory. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(MbProductCategory productCategory, MbProductCategoryCB cb) {
        return doQueryUpdate(productCategory, cb, null);
    }

    protected int doQueryUpdate(MbProductCategory productCategory, MbProductCategoryCB cb, UpdateOption<MbProductCategoryCB> option) {
        assertObjectNotNull("productCategory", productCategory); assertCBStateValid(cb);
        prepareUpdateOption(option);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryUpdate(productCategory, cb, option) : 0;
    }

    @Override
    protected int doRangeModify(Entity entity, ConditionBean cb, UpdateOption<? extends ConditionBean> option) {
        if (option == null) { return queryUpdate(downcast(entity), (MbProductCategoryCB)cb); }
        else { return varyingQueryUpdate(downcast(entity), (MbProductCategoryCB)cb, downcast(option)); }
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * MbProductCategoryCB cb = new MbProductCategoryCB();
     * cb.query().setFoo...(value);
     * productCategoryBhv.<span style="color: #FD4747">queryDelete</span>(productCategory, cb);
     * </pre>
     * @param cb The condition-bean of MbProductCategory. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(MbProductCategoryCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(MbProductCategoryCB cb, DeleteOption<MbProductCategoryCB> option) {
        assertCBStateValid(cb);
        prepareDeleteOption(option);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryDelete(cb, option) : 0;
    }

    @Override
    protected int doRangeRemove(ConditionBean cb, DeleteOption<? extends ConditionBean> option) {
        if (option == null) { return queryDelete((MbProductCategoryCB)cb); }
        else { return varyingQueryDelete((MbProductCategoryCB)cb, downcast(option)); }
    }

    // ===================================================================================
    //                                                                      Varying Update
    //                                                                      ==============
    // -----------------------------------------------------
    //                                         Entity Update
    //                                         -------------
    /**
     * Insert the entity with varying requests. <br />
     * For example, disableCommonColumnAutoSetup(), disablePrimaryKeyIdentity(). <br />
     * Other specifications are same as insert(entity).
     * <pre>
     * MbProductCategory productCategory = new MbProductCategory();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * productCategory.setFoo...(value);
     * productCategory.setBar...(value);
     * InsertOption<MbProductCategoryCB> option = new InsertOption<MbProductCategoryCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * productCategoryBhv.<span style="color: #FD4747">varyingInsert</span>(productCategory, option);
     * ... = productCategory.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param productCategory The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(MbProductCategory productCategory, InsertOption<MbProductCategoryCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(productCategory, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * MbProductCategory productCategory = new MbProductCategory();
     * productCategory.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * productCategory.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * productCategory.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;MbProductCategoryCB&gt; option = new UpdateOption&lt;MbProductCategoryCB&gt;();
     *     option.self(new SpecifyQuery&lt;MbProductCategoryCB&gt;() {
     *         public void specify(MbProductCategoryCB cb) {
     *             cb.specify().<span style="color: #FD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     productCategoryBhv.<span style="color: #FD4747">varyingUpdate</span>(productCategory, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param productCategory The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(MbProductCategory productCategory, UpdateOption<MbProductCategoryCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(productCategory, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param productCategory The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(MbProductCategory productCategory, InsertOption<MbProductCategoryCB> insertOption, UpdateOption<MbProductCategoryCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdate(productCategory, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param productCategory The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(MbProductCategory productCategory, DeleteOption<MbProductCategoryCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(productCategory, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param productCategoryList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<MbProductCategory> productCategoryList, InsertOption<MbProductCategoryCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(productCategoryList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param productCategoryList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<MbProductCategory> productCategoryList, UpdateOption<MbProductCategoryCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(productCategoryList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param productCategoryList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<MbProductCategory> productCategoryList, DeleteOption<MbProductCategoryCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(productCategoryList, option);
    }

    // -----------------------------------------------------
    //                                          Query Update
    //                                          ------------
    /**
     * Insert the several entities by query with varying requests (modified-only for fixed value). <br />
     * For example, disableCommonColumnAutoSetup(), disablePrimaryKeyIdentity(). <br />
     * Other specifications are same as queryInsert(entity, setupper). 
     * @param setupper The setup-per of query-insert. (NotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The inserted count.
     */
    public int varyingQueryInsert(QueryInsertSetupper<MbProductCategory, MbProductCategoryCB> setupper, InsertOption<MbProductCategoryCB> option) {
        assertInsertOptionNotNull(option);
        return doQueryInsert(setupper, option);
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br />
     * Other specifications are same as queryUpdate(entity, cb). 
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * MbProductCategory productCategory = new MbProductCategory();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//productCategory.setPK...(value);</span>
     * productCategory.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//productCategory.setVersionNo(value);</span>
     * MbProductCategoryCB cb = new MbProductCategoryCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;MbProductCategoryCB&gt; option = new UpdateOption&lt;MbProductCategoryCB&gt;();
     * option.self(new SpecifyQuery&lt;MbProductCategoryCB&gt;() {
     *     public void specify(MbProductCategoryCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * productCategoryBhv.<span style="color: #FD4747">varyingQueryUpdate</span>(productCategory, cb, option);
     * </pre>
     * @param productCategory The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of MbProductCategory. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(MbProductCategory productCategory, MbProductCategoryCB cb, UpdateOption<MbProductCategoryCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(productCategory, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of MbProductCategory. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(MbProductCategoryCB cb, DeleteOption<MbProductCategoryCB> option) {
        assertDeleteOptionNotNull(option);
        return doQueryDelete(cb, option);
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the basic executor of outside-SQL to execute it. <br />
     * The invoker of behavior command should be not null when you call this method.
     * <pre>
     * You can use the methods for outside-SQL are as follows:
     * {Basic}
     *   o selectList()
     *   o execute()
     *   o call()
     * 
     * {Entity}
     *   o entityHandling().selectEntity()
     *   o entityHandling().selectEntityWithDeletedCheck()
     * 
     * {Paging}
     *   o autoPaging().selectList()
     *   o autoPaging().selectPage()
     *   o manualPaging().selectList()
     *   o manualPaging().selectPage()
     * 
     * {Cursor}
     *   o cursorHandling().selectCursor()
     * 
     * {Option}
     *   o dynamicBinding().selectList()
     *   o removeBlockComment().selectList()
     *   o removeLineComment().selectList()
     *   o formatSql().selectList()
     * </pre>
     * @return The basic executor of outside-SQL. (NotNull) 
     */
    public OutsideSqlBasicExecutor<MbProductCategoryBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCountUniquely(MbProductCategoryCB cb) { return invoke(createSelectCountCBCommand(cb, true)); }
    protected int delegateSelectCountPlainly(MbProductCategoryCB cb) { return invoke(createSelectCountCBCommand(cb, false)); }
    protected <ENTITY extends MbProductCategory> void delegateSelectCursor(MbProductCategoryCB cb, EntityRowHandler<ENTITY> erh, Class<ENTITY> et)
    { invoke(createSelectCursorCBCommand(cb, erh, et)); }
    protected <ENTITY extends MbProductCategory> List<ENTITY> delegateSelectList(MbProductCategoryCB cb, Class<ENTITY> et)
    { return invoke(createSelectListCBCommand(cb, et)); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(MbProductCategory e, InsertOption<MbProductCategoryCB> op)
    { if (!processBeforeInsert(e, op)) { return 0; }
      return invoke(createInsertEntityCommand(e, op)); }
    protected int delegateUpdate(MbProductCategory e, UpdateOption<MbProductCategoryCB> op)
    { if (!processBeforeUpdate(e, op)) { return 0; }
      return delegateUpdateNonstrict(e, op); }
    protected int delegateUpdateNonstrict(MbProductCategory e, UpdateOption<MbProductCategoryCB> op)
    { if (!processBeforeUpdate(e, op)) { return 0; }
      return invoke(createUpdateNonstrictEntityCommand(e, op)); }
    protected int delegateDelete(MbProductCategory e, DeleteOption<MbProductCategoryCB> op)
    { if (!processBeforeDelete(e, op)) { return 0; }
      return delegateDeleteNonstrict(e, op); }
    protected int delegateDeleteNonstrict(MbProductCategory e, DeleteOption<MbProductCategoryCB> op)
    { if (!processBeforeDelete(e, op)) { return 0; }
      return invoke(createDeleteNonstrictEntityCommand(e, op)); }

    protected int[] delegateBatchInsert(List<MbProductCategory> ls, InsertOption<MbProductCategoryCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchInsertCommand(processBatchInternally(ls, op), op)); }
    protected int[] delegateBatchUpdate(List<MbProductCategory> ls, UpdateOption<MbProductCategoryCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchUpdateNonstrict(ls, op); }
    protected int[] delegateBatchUpdateNonstrict(List<MbProductCategory> ls, UpdateOption<MbProductCategoryCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateNonstrictCommand(processBatchInternally(ls, op, true), op)); }
    protected int[] delegateBatchDelete(List<MbProductCategory> ls, DeleteOption<MbProductCategoryCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchDeleteNonstrict(ls, op); }
    protected int[] delegateBatchDeleteNonstrict(List<MbProductCategory> ls, DeleteOption<MbProductCategoryCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteNonstrictCommand(processBatchInternally(ls, op, true), op)); }

    protected int delegateQueryInsert(MbProductCategory e, MbProductCategoryCB inCB, ConditionBean resCB, InsertOption<MbProductCategoryCB> op)
    { if (!processBeforeQueryInsert(e, inCB, resCB, op)) { return 0; } return invoke(createQueryInsertCBCommand(e, inCB, resCB, op));  }
    protected int delegateQueryUpdate(MbProductCategory e, MbProductCategoryCB cb, UpdateOption<MbProductCategoryCB> op)
    { if (!processBeforeQueryUpdate(e, cb, op)) { return 0; } return invoke(createQueryUpdateCBCommand(e, cb, op));  }
    protected int delegateQueryDelete(MbProductCategoryCB cb, DeleteOption<MbProductCategoryCB> op)
    { if (!processBeforeQueryDelete(cb, op)) { return 0; } return invoke(createQueryDeleteCBCommand(cb, op));  }

    // ===================================================================================
    //                                                                Optimistic Lock Info
    //                                                                ====================
    /**
     * {@inheritDoc}
     */
    @Override
    protected boolean hasVersionNoValue(Entity entity) {
        return false;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected boolean hasUpdateDateValue(Entity entity) {
        return false;
    }

    // ===================================================================================
    //                                                                     Downcast Helper
    //                                                                     ===============
    protected MbProductCategory downcast(Entity entity) {
        return helpEntityDowncastInternally(entity, MbProductCategory.class);
    }

    protected MbProductCategoryCB downcast(ConditionBean cb) {
        return helpConditionBeanDowncastInternally(cb, MbProductCategoryCB.class);
    }

    @SuppressWarnings("unchecked")
    protected List<MbProductCategory> downcast(List<? extends Entity> entityList) {
        return (List<MbProductCategory>)entityList;
    }

    @SuppressWarnings("unchecked")
    protected InsertOption<MbProductCategoryCB> downcast(InsertOption<? extends ConditionBean> option) {
        return (InsertOption<MbProductCategoryCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected UpdateOption<MbProductCategoryCB> downcast(UpdateOption<? extends ConditionBean> option) {
        return (UpdateOption<MbProductCategoryCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected DeleteOption<MbProductCategoryCB> downcast(DeleteOption<? extends ConditionBean> option) {
        return (DeleteOption<MbProductCategoryCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<MbProductCategory, MbProductCategoryCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> option) {
        return (QueryInsertSetupper<MbProductCategory, MbProductCategoryCB>)option;
    }
}
