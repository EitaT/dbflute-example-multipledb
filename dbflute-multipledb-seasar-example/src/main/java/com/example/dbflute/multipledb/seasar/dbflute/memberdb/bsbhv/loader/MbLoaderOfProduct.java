package com.example.dbflute.multipledb.seasar.dbflute.memberdb.bsbhv.loader;

import java.util.List;

import org.seasar.dbflute.*;
import org.seasar.dbflute.bhv.*;
import com.example.dbflute.multipledb.seasar.dbflute.memberdb.exbhv.*;
import com.example.dbflute.multipledb.seasar.dbflute.memberdb.exentity.*;
import com.example.dbflute.multipledb.seasar.dbflute.memberdb.cbean.*;

/**
 * The referrer loader of PRODUCT as TABLE. <br />
 * <pre>
 * [primary key]
 *     PRODUCT_ID
 *
 * [column]
 *     PRODUCT_ID, PRODUCT_NAME, PRODUCT_HANDLE_CODE, PRODUCT_CATEGORY_CODE, PRODUCT_STATUS_CODE, REGULAR_PRICE, REGISTER_DATETIME, REGISTER_USER, UPDATE_DATETIME, UPDATE_USER, VERSION_NO
 *
 * [sequence]
 *     
 *
 * [identity]
 *     PRODUCT_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     PRODUCT_CATEGORY, PRODUCT_STATUS
 *
 * [referrer table]
 *     PURCHASE
 *
 * [foreign property]
 *     productCategory, productStatus
 *
 * [referrer property]
 *     purchaseList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class MbLoaderOfProduct {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<MbProduct> _selectedList;
    protected BehaviorSelector _selector;
    protected MbProductBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public MbLoaderOfProduct ready(List<MbProduct> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected MbProductBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(MbProductBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<MbPurchase> _referrerPurchaseList;
    public NestedReferrerLoaderGateway<MbLoaderOfPurchase> loadPurchaseList(ConditionBeanSetupper<MbPurchaseCB> setupper) {
        myBhv().loadPurchaseList(_selectedList, setupper).withNestedReferrer(new ReferrerListHandler<MbPurchase>() {
            public void handle(List<MbPurchase> referrerList) { _referrerPurchaseList = referrerList; }
        });
        return new NestedReferrerLoaderGateway<MbLoaderOfPurchase>() {
            public void withNestedReferrer(ReferrerLoaderHandler<MbLoaderOfPurchase> handler) {
                handler.handle(new MbLoaderOfPurchase().ready(_referrerPurchaseList, _selector));
            }
        };
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected MbLoaderOfProductCategory _foreignProductCategoryLoader;
    public MbLoaderOfProductCategory pulloutProductCategory() {
        if (_foreignProductCategoryLoader != null) { return _foreignProductCategoryLoader; }
        List<MbProductCategory> pulledList = myBhv().pulloutProductCategory(_selectedList);
        _foreignProductCategoryLoader = new MbLoaderOfProductCategory().ready(pulledList, _selector);
        return _foreignProductCategoryLoader;
    }

    protected MbLoaderOfProductStatus _foreignProductStatusLoader;
    public MbLoaderOfProductStatus pulloutProductStatus() {
        if (_foreignProductStatusLoader != null) { return _foreignProductStatusLoader; }
        List<MbProductStatus> pulledList = myBhv().pulloutProductStatus(_selectedList);
        _foreignProductStatusLoader = new MbLoaderOfProductStatus().ready(pulledList, _selector);
        return _foreignProductStatusLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<MbProduct> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
