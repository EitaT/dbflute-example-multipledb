package com.example.dbflute.multipledb.seasar.dbflute.memberdb.bsbhv.loader;

import java.util.List;

import org.seasar.dbflute.*;
import com.example.dbflute.multipledb.seasar.dbflute.memberdb.exbhv.*;
import com.example.dbflute.multipledb.seasar.dbflute.memberdb.exentity.*;

/**
 * The referrer loader of PURCHASE as TABLE. <br />
 * <pre>
 * [primary key]
 *     PURCHASE_ID
 *
 * [column]
 *     PURCHASE_ID, MEMBER_ID, PRODUCT_ID, PURCHASE_DATETIME, PURCHASE_COUNT, PURCHASE_PRICE, PAYMENT_COMPLETE_FLG, REGISTER_DATETIME, REGISTER_USER, UPDATE_DATETIME, UPDATE_USER, VERSION_NO
 *
 * [sequence]
 *     
 *
 * [identity]
 *     PURCHASE_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     MEMBER, PRODUCT
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     member, product
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class MbLoaderOfPurchase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<MbPurchase> _selectedList;
    protected BehaviorSelector _selector;
    protected MbPurchaseBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public MbLoaderOfPurchase ready(List<MbPurchase> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected MbPurchaseBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(MbPurchaseBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected MbLoaderOfMember _foreignMemberLoader;
    public MbLoaderOfMember pulloutMember() {
        if (_foreignMemberLoader != null) { return _foreignMemberLoader; }
        List<MbMember> pulledList = myBhv().pulloutMember(_selectedList);
        _foreignMemberLoader = new MbLoaderOfMember().ready(pulledList, _selector);
        return _foreignMemberLoader;
    }

    protected MbLoaderOfProduct _foreignProductLoader;
    public MbLoaderOfProduct pulloutProduct() {
        if (_foreignProductLoader != null) { return _foreignProductLoader; }
        List<MbProduct> pulledList = myBhv().pulloutProduct(_selectedList);
        _foreignProductLoader = new MbLoaderOfProduct().ready(pulledList, _selector);
        return _foreignProductLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<MbPurchase> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
