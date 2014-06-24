package com.example.dbflute.multipledb.seasar.dbflute.memberdb.bsbhv.loader;

import java.util.List;

import org.seasar.dbflute.*;
import com.example.dbflute.multipledb.seasar.dbflute.memberdb.exbhv.*;
import com.example.dbflute.multipledb.seasar.dbflute.memberdb.exentity.*;

/**
 * The referrer loader of MEMBER_ADDRESS as TABLE. <br />
 * <pre>
 * [primary key]
 *     MEMBER_ADDRESS_ID
 *
 * [column]
 *     MEMBER_ADDRESS_ID, MEMBER_ID, VALID_BEGIN_DATE, VALID_END_DATE, ADDRESS, REGION_ID, REGISTER_DATETIME, REGISTER_USER, UPDATE_DATETIME, UPDATE_USER, VERSION_NO
 *
 * [sequence]
 *     
 *
 * [identity]
 *     MEMBER_ADDRESS_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     MEMBER, REGION
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     member, region
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class MbLoaderOfMemberAddress {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<MbMemberAddress> _selectedList;
    protected BehaviorSelector _selector;
    protected MbMemberAddressBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public MbLoaderOfMemberAddress ready(List<MbMemberAddress> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected MbMemberAddressBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(MbMemberAddressBhv.class); return _myBhv; } }

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

    protected MbLoaderOfRegion _foreignRegionLoader;
    public MbLoaderOfRegion pulloutRegion() {
        if (_foreignRegionLoader != null) { return _foreignRegionLoader; }
        List<MbRegion> pulledList = myBhv().pulloutRegion(_selectedList);
        _foreignRegionLoader = new MbLoaderOfRegion().ready(pulledList, _selector);
        return _foreignRegionLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<MbMemberAddress> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
