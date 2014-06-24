package com.example.dbflute.multipledb.seasar.dbflute.memberdb.bsbhv.loader;

import java.util.List;

import org.seasar.dbflute.*;
import org.seasar.dbflute.bhv.*;
import com.example.dbflute.multipledb.seasar.dbflute.memberdb.exbhv.*;
import com.example.dbflute.multipledb.seasar.dbflute.memberdb.exentity.*;
import com.example.dbflute.multipledb.seasar.dbflute.memberdb.cbean.*;

/**
 * The referrer loader of PRODUCT_CATEGORY as TABLE. <br />
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
public class MbLoaderOfProductCategory {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<MbProductCategory> _selectedList;
    protected BehaviorSelector _selector;
    protected MbProductCategoryBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public MbLoaderOfProductCategory ready(List<MbProductCategory> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected MbProductCategoryBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(MbProductCategoryBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<MbProduct> _referrerProductList;
    public NestedReferrerLoaderGateway<MbLoaderOfProduct> loadProductList(ConditionBeanSetupper<MbProductCB> setupper) {
        myBhv().loadProductList(_selectedList, setupper).withNestedReferrer(new ReferrerListHandler<MbProduct>() {
            public void handle(List<MbProduct> referrerList) { _referrerProductList = referrerList; }
        });
        return new NestedReferrerLoaderGateway<MbLoaderOfProduct>() {
            public void withNestedReferrer(ReferrerLoaderHandler<MbLoaderOfProduct> handler) {
                handler.handle(new MbLoaderOfProduct().ready(_referrerProductList, _selector));
            }
        };
    }

    protected List<MbProductCategory> _referrerProductCategorySelfList;
    public NestedReferrerLoaderGateway<MbLoaderOfProductCategory> loadProductCategorySelfList(ConditionBeanSetupper<MbProductCategoryCB> setupper) {
        myBhv().loadProductCategorySelfList(_selectedList, setupper).withNestedReferrer(new ReferrerListHandler<MbProductCategory>() {
            public void handle(List<MbProductCategory> referrerList) { _referrerProductCategorySelfList = referrerList; }
        });
        return new NestedReferrerLoaderGateway<MbLoaderOfProductCategory>() {
            public void withNestedReferrer(ReferrerLoaderHandler<MbLoaderOfProductCategory> handler) {
                handler.handle(new MbLoaderOfProductCategory().ready(_referrerProductCategorySelfList, _selector));
            }
        };
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected MbLoaderOfProductCategory _foreignProductCategorySelfLoader;
    public MbLoaderOfProductCategory pulloutProductCategorySelf() {
        if (_foreignProductCategorySelfLoader != null) { return _foreignProductCategorySelfLoader; }
        List<MbProductCategory> pulledList = myBhv().pulloutProductCategorySelf(_selectedList);
        _foreignProductCategorySelfLoader = new MbLoaderOfProductCategory().ready(pulledList, _selector);
        return _foreignProductCategorySelfLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<MbProductCategory> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
