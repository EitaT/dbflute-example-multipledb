package com.example.dbflute.multipledb.seasar.dbflute.memberdb.bsbhv.loader;

import java.util.List;

import org.seasar.dbflute.*;
import org.seasar.dbflute.bhv.*;
import com.example.dbflute.multipledb.seasar.dbflute.memberdb.exbhv.*;
import com.example.dbflute.multipledb.seasar.dbflute.memberdb.exentity.*;
import com.example.dbflute.multipledb.seasar.dbflute.memberdb.cbean.*;

/**
 * The referrer loader of REGION as TABLE. <br />
 * <pre>
 * [primary key]
 *     REGION_ID
 *
 * [column]
 *     REGION_ID, REGION_NAME
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
 *     MEMBER_ADDRESS
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     memberAddressList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class MbLoaderOfRegion {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<MbRegion> _selectedList;
    protected BehaviorSelector _selector;
    protected MbRegionBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public MbLoaderOfRegion ready(List<MbRegion> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected MbRegionBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(MbRegionBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<MbMemberAddress> _referrerMemberAddressList;
    public NestedReferrerLoaderGateway<MbLoaderOfMemberAddress> loadMemberAddressList(ConditionBeanSetupper<MbMemberAddressCB> setupper) {
        myBhv().loadMemberAddressList(_selectedList, setupper).withNestedReferrer(new ReferrerListHandler<MbMemberAddress>() {
            public void handle(List<MbMemberAddress> referrerList) { _referrerMemberAddressList = referrerList; }
        });
        return new NestedReferrerLoaderGateway<MbLoaderOfMemberAddress>() {
            public void withNestedReferrer(ReferrerLoaderHandler<MbLoaderOfMemberAddress> handler) {
                handler.handle(new MbLoaderOfMemberAddress().ready(_referrerMemberAddressList, _selector));
            }
        };
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<MbRegion> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
