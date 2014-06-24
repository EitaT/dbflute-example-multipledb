package com.example.dbflute.multipledb.seasar.dbflute.memberdb.bsbhv.loader;

import java.util.List;

import org.seasar.dbflute.*;
import org.seasar.dbflute.bhv.*;
import com.example.dbflute.multipledb.seasar.dbflute.memberdb.exbhv.*;
import com.example.dbflute.multipledb.seasar.dbflute.memberdb.exentity.*;
import com.example.dbflute.multipledb.seasar.dbflute.memberdb.cbean.*;

/**
 * The referrer loader of PRODUCT_STATUS as TABLE. <br />
 * <pre>
 * [primary key]
 *     PRODUCT_STATUS_CODE
 *
 * [column]
 *     PRODUCT_STATUS_CODE, PRODUCT_STATUS_NAME, DISPLAY_ORDER
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
 *     
 *
 * [referrer table]
 *     PRODUCT
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     productList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class MbLoaderOfProductStatus {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<MbProductStatus> _selectedList;
    protected BehaviorSelector _selector;
    protected MbProductStatusBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public MbLoaderOfProductStatus ready(List<MbProductStatus> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected MbProductStatusBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(MbProductStatusBhv.class); return _myBhv; } }

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

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<MbProductStatus> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
