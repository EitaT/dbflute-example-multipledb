package com.example.dbflute.multipledb.seasar.dbflute.memberdb.bsbhv.loader;

import java.util.List;

import org.seasar.dbflute.*;
import com.example.dbflute.multipledb.seasar.dbflute.memberdb.exbhv.*;
import com.example.dbflute.multipledb.seasar.dbflute.memberdb.exentity.*;

/**
 * The referrer loader of SUMMARY_PRODUCT as VIEW. <br />
 * <pre>
 * [primary key]
 *     
 *
 * [column]
 *     PRODUCT_ID, PRODUCT_NAME, PRODUCT_HANDLE_CODE, PRODUCT_STATUS_CODE, LATEST_PURCHASE_DATETIME
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
 *     
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class MbLoaderOfSummaryProduct {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<MbSummaryProduct> _selectedList;
    protected BehaviorSelector _selector;
    protected MbSummaryProductBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public MbLoaderOfSummaryProduct ready(List<MbSummaryProduct> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected MbSummaryProductBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(MbSummaryProductBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<MbSummaryProduct> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
